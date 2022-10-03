package org.fmod.studio;

import org.fmod.core.ChannelGroup;
import org.fmod.core.FMODResultTracker;
import org.fmod.jni.*;

import static org.fmod.jni.FMOD.*;

/**
 * Proxy to FMOD EventInstance class
 * <p>
 * {@link FMOD_RESULT} return values have been omitted from the individual calls because it's a pain in the neck
 * to return multiple values in Java. They are exposed via the getLastResult() and resultHandler mechanisms instead.
 *
 * @see <a href="http://www.fmod.org/documentation/#content/generated/studio_api_EventInstance.html" >FMOD EventInstance Documentation</a>
 * <p>
 * Author: Nate
 * Date: 5/1/2015
 */
public class EventInstance extends FMODResultTracker {

    private final SWIGTYPE_p_FMOD_STUDIO_EVENTINSTANCE self;
    private final EventDescription parent;
    private final float[] fp = new float[1];
    private final int[] ip = new int[1];
    private FMOD_3D_ATTRIBUTES fmod3DAttributes;

    EventInstance(SWIGTYPE_p_FMOD_STUDIO_EVENTINSTANCE self, EventDescription parent) {
        this.self = self;
        this.parent = parent;
    }

    public SWIGTYPE_p_FMOD_STUDIO_EVENTINSTANCE getPointer() {
        return self;
    }

    //    FMOD_BOOL   F_API FMOD_Studio_EventInstance_IsValid(FMOD_STUDIO_EVENTINSTANCE *eventinstance);
    public boolean isValid() {
        return FMOD_Studio_EventInstance_IsValid(self) != 0;
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_GetDescription(FMOD_STUDIO_EVENTINSTANCE *eventinstance, FMOD_STUDIO_EVENTDESCRIPTION **description);
    public EventDescription getDescription() {
        //Note, don't bother to call into C for this, just return the java object that created us.
        return parent;
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_GetVolume(FMOD_STUDIO_EVENTINSTANCE *eventinstance, float *volume, float *finalvolume);
    public float getVolume() {
        processApiResult(FMOD_Studio_EventInstance_GetVolume(self, fp, null), "FMOD_Studio_EventInstance_GetVolume");
        return fp[0];
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_SetVolume(FMOD_STUDIO_EVENTINSTANCE *eventinstance, float volume);
    public void setVolume(float v) {
        processApiResult(FMOD_Studio_EventInstance_SetVolume(self, v), "FMOD_Studio_EventInstance_SetVolume");
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_GetPitch(FMOD_STUDIO_EVENTINSTANCE *eventinstance, float *pitch, float *finalpitch);
    public float getPitch() {
        processApiResult(FMOD_Studio_EventInstance_GetPitch(self, fp, null), "FMOD_Studio_EventInstance_GetPitch");
        return fp[0];
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_SetPitch(FMOD_STUDIO_EVENTINSTANCE *eventinstance, float pitch);
    public void setPitch(float v) {
        processApiResult(FMOD_Studio_EventInstance_SetPitch(self, v), "FMOD_Studio_EventInstance_SetPitch");
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_Get3DAttributes(FMOD_STUDIO_EVENTINSTANCE *eventinstance, FMOD_3D_ATTRIBUTES *attributes);
    /**
     * returns a temporary FMOD_3D_ATTRIBUTES object that is reused per call.
     * If that's not what you want you can call the other version of the function instead.
     */
    public FMOD_3D_ATTRIBUTES get3DAttributes() {
        if (fmod3DAttributes == null) {
            fmod3DAttributes = new FMOD_3D_ATTRIBUTES();
        }
        return get3DAttributes(fmod3DAttributes);
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_Get3DAttributes(FMOD_STUDIO_EVENTINSTANCE *eventinstance, FMOD_3D_ATTRIBUTES *attributes);
    /**
     * Fills the given FMOD_3D_ATTRIBUTES object with the listener attributes.
     */
    public FMOD_3D_ATTRIBUTES get3DAttributes(FMOD_3D_ATTRIBUTES attributes) {
        processApiResult(FMOD_Studio_EventInstance_Get3DAttributes(self, attributes), "FMOD_Studio_EventInstance_Get3DAttributes");
        return attributes;
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_Set3DAttributes(FMOD_STUDIO_EVENTINSTANCE *eventinstance, FMOD_3D_ATTRIBUTES *attributes);
    public void set3DAttributes(FMOD_3D_ATTRIBUTES attributes) {
        processApiResult(FMOD_Studio_EventInstance_Set3DAttributes(self, attributes), "FMOD_Studio_EventInstance_Set3DAttributes");
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_GetProperty(FMOD_STUDIO_EVENTINSTANCE *eventinstance, FMOD_STUDIO_EVENT_PROPERTY index, float *value);
    public float getProperty(FMOD_STUDIO_EVENT_PROPERTY property) {
        processApiResult(FMOD_Studio_EventInstance_GetProperty(self, property, fp), "FMOD_Studio_EventInstance_GetProperty");
        return fp[0];
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_SetProperty(FMOD_STUDIO_EVENTINSTANCE *eventinstance, FMOD_STUDIO_EVENT_PROPERTY index, float value);
    public void setProperty(FMOD_STUDIO_EVENT_PROPERTY property, float value) {
        processApiResult(FMOD_Studio_EventInstance_SetProperty(self, property, value), "FMOD_Studio_EventInstance_SetProperty");
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_GetPaused(FMOD_STUDIO_EVENTINSTANCE *eventinstance, FMOD_BOOL *paused);
    public boolean getPaused() {
        processApiResult(FMOD_Studio_EventInstance_GetPaused(self, ip), "FMOD_Studio_EventInstance_GetPaused");
        return ip[0] != 0;
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_SetPaused(FMOD_STUDIO_EVENTINSTANCE *eventinstance, FMOD_BOOL paused);
    public void setPaused(boolean paused) {
        processApiResult(FMOD_Studio_EventInstance_SetPaused(self, paused ? 1 : 0), "FMOD_Studio_EventInstance_SetPaused");
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_Start(FMOD_STUDIO_EVENTINSTANCE *eventinstance);
    public void start() {
        processApiResult(FMOD_Studio_EventInstance_Start(self), "FMOD_Studio_EventInstance_Start");
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_Stop(FMOD_STUDIO_EVENTINSTANCE *eventinstance, FMOD_STUDIO_STOP_MODE mode);
    public void stop(FMOD_STUDIO_STOP_MODE stopMode) {
        processApiResult(FMOD_Studio_EventInstance_Stop(self, stopMode), "FMOD_Studio_EventInstance_Stop");
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_GetTimelinePosition(FMOD_STUDIO_EVENTINSTANCE *eventinstance, int *position);
    public int getTimelinePosition() {
        processApiResult(FMOD_Studio_EventInstance_GetTimelinePosition(self, ip), "FMOD_Studio_EventInstance_GetTimelinePosition");
        return ip[0];
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_SetTimelinePosition(FMOD_STUDIO_EVENTINSTANCE *eventinstance, int position);
    public void setTimelinePosition(int position) {
        processApiResult(FMOD_Studio_EventInstance_SetTimelinePosition(self, position), "FMOD_Studio_EventInstance_SetTimelinePosition");
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_GetPlaybackState(FMOD_STUDIO_EVENTINSTANCE *eventinstance, FMOD_STUDIO_PLAYBACK_STATE *state);
    public FMOD_STUDIO_PLAYBACK_STATE getPlaybackState() {
        processApiResult(FMOD_Studio_EventInstance_GetPlaybackState(self, ip), "FMOD_Studio_EventInstance_GetPlaybackState");
        return FMOD_STUDIO_PLAYBACK_STATE.swigToEnum(ip[0]);
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_GetChannelGroup(FMOD_STUDIO_EVENTINSTANCE *eventinstance, FMOD_CHANNELGROUP **group);
    public ChannelGroup getChannelGroup() {
        SWIGTYPE_p_p_FMOD_CHANNELGROUP pp = new_FMOD_CHANNELGROUP_p_p();
        processApiResult(FMOD_Studio_EventInstance_GetChannelGroup(self, pp), "FMOD_Studio_EventInstance_GetChannelGroup");
        SWIGTYPE_p_FMOD_CHANNELGROUP p = FMOD_CHANNELGROUP_p_p_value(pp);
        delete_FMOD_CHANNELGROUP_p_p(pp);
        return new ChannelGroup(p);
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_Release(FMOD_STUDIO_EVENTINSTANCE *eventinstance);
    public void release() {
        processApiResult(FMOD_Studio_EventInstance_Release(self), "FMOD_Studio_EventInstance_Release");
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_IsVirtual(FMOD_STUDIO_EVENTINSTANCE *eventinstance, FMOD_BOOL *virtualstate);
    public boolean isVirtual() {
        processApiResult(FMOD_Studio_EventInstance_IsVirtual(self, ip), "FMOD_Studio_EventInstance_IsVirtual");
        return ip[0] != 0;
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_GetParameterByName(FMOD_STUDIO_EVENTINSTANCE *eventinstance, const char *name, float *value, float *finalvalue);
    public float getParameterByName(String name) {
        processApiResult(FMOD_Studio_EventInstance_GetParameterByName(self, name, fp, null), "FMOD_Studio_EventInstance_GetParameterByName");
        return fp[0];
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_SetParameterByName(FMOD_STUDIO_EVENTINSTANCE *eventinstance, const char *name, float value, FMOD_BOOL ignoreseekspeed);
    public void setParameterByName(String name, float value, int ignoreSeekSpeed) {
        processApiResult(FMOD_Studio_EventInstance_SetParameterByName(self, name, value, ignoreSeekSpeed), "FMOD_Studio_EventInstance_SetParameterByName");
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_SetParameterByNameWithLabel(FMOD_STUDIO_EVENTINSTANCE *eventinstance, const char *name, const char *label, FMOD_BOOL ignoreseekspeed);
    public void setParameterByNameWithLabel(String name, String label, int ignoreSeekSpeed) {
        processApiResult(FMOD_Studio_EventInstance_SetParameterByNameWithLabel(self, name, label, ignoreSeekSpeed), "FMOD_Studio_EventInstance_SetParameterByNameWithLabel");
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_GetParameterByID(FMOD_STUDIO_EVENTINSTANCE *eventinstance, FMOD_STUDIO_PARAMETER_ID id, float *value, float *finalvalue);
    public float getParameterByID(FMOD_STUDIO_PARAMETER_ID id) {
        processApiResult(FMOD_Studio_EventInstance_GetParameterByID(self, id, fp, null), "FMOD_Studio_EventInstance_GetParameterByID");
        return fp[0];
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_SetParameterByID(FMOD_STUDIO_EVENTINSTANCE *eventinstance, FMOD_STUDIO_PARAMETER_ID id, float value, FMOD_BOOL ignoreseekspeed);
    public void setParameterByID(FMOD_STUDIO_PARAMETER_ID id, float value, int ignoreSeekSpeed) {
        processApiResult(FMOD_Studio_EventInstance_SetParameterByID(self, id, value, ignoreSeekSpeed), "FMOD_Studio_EventInstance_SetParameterByID");
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_SetParameterByIDWithLabel(FMOD_STUDIO_EVENTINSTANCE *eventinstance, FMOD_STUDIO_PARAMETER_ID id, const char *label, FMOD_BOOL ignoreseekspeed);
    public void setParameterByIDWithLabel(FMOD_STUDIO_PARAMETER_ID id, String label, int ignoreSeekSpeed) {
        processApiResult(FMOD_Studio_EventInstance_SetParameterByIDWithLabel(self, id, label, ignoreSeekSpeed), "FMOD_Studio_EventInstance_SetParameterByIDWithLabel");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventInstance instance = (EventInstance) o;
        return self.equals(instance.self);
    }

    @Override
    public int hashCode() {
        return self.hashCode();
    }

    //TODO: pick these up...
    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_GetListenerMask(FMOD_STUDIO_EVENTINSTANCE *eventinstance, unsigned int *mask);
    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_SetListenerMask(FMOD_STUDIO_EVENTINSTANCE *eventinstance, unsigned int mask);
    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_GetReverbLevel(FMOD_STUDIO_EVENTINSTANCE *eventinstance, int index, float *level);
    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_SetReverbLevel(FMOD_STUDIO_EVENTINSTANCE *eventinstance, int index, float level);
    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_GetMinMaxDistance(FMOD_STUDIO_EVENTINSTANCE *eventinstance, float *min, float *max);
    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_SetParametersByIDs(FMOD_STUDIO_EVENTINSTANCE *eventinstance, const FMOD_STUDIO_PARAMETER_ID *ids, float *values, int count, FMOD_BOOL ignoreseekspeed);
    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_KeyOff(FMOD_STUDIO_EVENTINSTANCE *eventinstance);
    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_SetCallback(FMOD_STUDIO_EVENTINSTANCE *eventinstance, FMOD_STUDIO_EVENT_CALLBACK callback, FMOD_STUDIO_EVENT_CALLBACK_TYPE callbackmask);
    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_GetUserData(FMOD_STUDIO_EVENTINSTANCE *eventinstance, void **userdata);
    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_SetUserData(FMOD_STUDIO_EVENTINSTANCE *eventinstance, void *userdata);
    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_GetCPUUsage(FMOD_STUDIO_EVENTINSTANCE *eventinstance, unsigned int *exclusive, unsigned int *inclusive);
    //    FMOD_RESULT F_API FMOD_Studio_EventInstance_GetMemoryUsage(FMOD_STUDIO_EVENTINSTANCE *eventinstance, FMOD_STUDIO_MEMORY_USAGE *memoryusage);
}
