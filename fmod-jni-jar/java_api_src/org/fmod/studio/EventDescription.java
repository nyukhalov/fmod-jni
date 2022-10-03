package org.fmod.studio;

import org.fmod.core.FMODResultTracker;
import org.fmod.jni.*;

import java.nio.charset.StandardCharsets;

import static org.fmod.jni.FMOD.*;

/**
 * Proxy to FMOD EventDescription class.
 * <p>
 * {@link FMOD_RESULT} return values have been omitted from the individual calls because it's a pain in the neck
 * to return multiple values in Java. They are exposed via the getLastResult() and resultHandler mechanisms instead.
 *
 * @see <a href="http://www.fmod.org/documentation/#content/generated/studio_api_EventDescription.html" >FMOD EventDescription Documentation</a>
 * <p>
 * Author: Nate
 * Date: 5/1/2015
 */
public final class EventDescription extends FMODResultTracker {

    private final SWIGTYPE_p_FMOD_STUDIO_EVENTDESCRIPTION self;
    private FMOD_GUID tmpId;
    private int[] pi = new int[1];
    private float[] pf = new float[1];
    private float[] pf2 = new float[1];

    EventDescription(SWIGTYPE_p_FMOD_STUDIO_EVENTDESCRIPTION self) {
        this.self = self;
    }

    public SWIGTYPE_p_FMOD_STUDIO_EVENTDESCRIPTION getPointer() {
        return self;
    }

    //    FMOD_BOOL   F_API FMOD_Studio_EventDescription_IsValid(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription);
    public boolean isValid() {
        return FMOD_Studio_EventDescription_IsValid(self) != 0;
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventDescription_GetID(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, FMOD_GUID *id);
    public FMOD_GUID getId() {
        if (tmpId == null) {
            tmpId = new FMOD_GUID();
        }
        processApiResult(FMOD_Studio_EventDescription_GetID(self, tmpId), "EventDescription.getId");
        return tmpId;
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventDescription_GetPath(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, char *path, int size, int *retrieved);
    public String getPath() {
        byte[] buf = new byte[512];
        processApiResult(FMOD_Studio_EventDescription_GetPath(self, buf, 512, pi), "EventDescription.getPath");

        int clen = pi[0];
        if (clen > 0) {
            return new String(buf, 0, clen - 1, StandardCharsets.UTF_8);
        }
        return "";
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventDescription_GetParameterDescriptionCount(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, int *count);
    public int getParameterDescriptionCount() {
        processApiResult(FMOD_Studio_EventDescription_GetParameterDescriptionCount(self, pi), "EventDescription.getParameterDescriptionCount");
        return pi[0];
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventDescription_GetParameterDescriptionByIndex(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, int index, FMOD_STUDIO_PARAMETER_DESCRIPTION *parameter);
    public FMOD_STUDIO_PARAMETER_DESCRIPTION getParameterDescriptionByIndex(int index) {
        FMOD_STUDIO_PARAMETER_DESCRIPTION desc = new FMOD_STUDIO_PARAMETER_DESCRIPTION();
        processApiResult(FMOD_Studio_EventDescription_GetParameterDescriptionByIndex(self, index, desc), "EventDescription.getParameterDescriptionByIndex");
        return desc;
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventDescription_GetParameterDescriptionByName(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, const char *name, FMOD_STUDIO_PARAMETER_DESCRIPTION *parameter);
    public FMOD_STUDIO_PARAMETER_DESCRIPTION getParameterDescriptionByName(String name) {
        FMOD_STUDIO_PARAMETER_DESCRIPTION desc = new FMOD_STUDIO_PARAMETER_DESCRIPTION();
        processApiResult(FMOD_Studio_EventDescription_GetParameterDescriptionByName(self, name, desc), "EventDescription.getParameterDescriptionByName");
        return desc;
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventDescription_GetParameterDescriptionByID(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, FMOD_STUDIO_PARAMETER_ID id, FMOD_STUDIO_PARAMETER_DESCRIPTION *parameter);
    public FMOD_STUDIO_PARAMETER_DESCRIPTION getParameterDescriptionById(FMOD_STUDIO_PARAMETER_ID id) {
        FMOD_STUDIO_PARAMETER_DESCRIPTION desc = new FMOD_STUDIO_PARAMETER_DESCRIPTION();
        processApiResult(FMOD_Studio_EventDescription_GetParameterDescriptionByID(self, id, desc), "EventDescription.getParameterDescriptionByID");
        return desc;
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventDescription_GetParameterLabelByIndex(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, int index, int labelindex, char *label, int size, int *retrieved);
    //    FMOD_RESULT F_API FMOD_Studio_EventDescription_GetParameterLabelByName(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, const char *name, int labelindex, char *label, int size, int *retrieved);
    //    FMOD_RESULT F_API FMOD_Studio_EventDescription_GetParameterLabelByID(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, FMOD_STUDIO_PARAMETER_ID id, int labelindex, char *label, int size, int *retrieved);

    //    FMOD_RESULT F_API FMOD_Studio_EventDescription_GetUserPropertyCount(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, int *count);
    public int getUserPropertyCount() {
        processApiResult(FMOD_Studio_EventDescription_GetUserPropertyCount(self, pi), "EventDescription.getUserPropertyCount");
        return pi[0];
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventDescription_GetUserPropertyByIndex(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, int index, FMOD_STUDIO_USER_PROPERTY *property);
    public FMOD_STUDIO_USER_PROPERTY getUserPropertyByIndex(int index) {
        FMOD_STUDIO_USER_PROPERTY property = new FMOD_STUDIO_USER_PROPERTY();
        processApiResult(FMOD_Studio_EventDescription_GetUserPropertyByIndex(self, index, property), "EventDescription.getUserPropertyByIndex");
        return property;
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventDescription_GetUserProperty(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, const char *name, FMOD_STUDIO_USER_PROPERTY *property);
    public FMOD_STUDIO_USER_PROPERTY getUserProperty(String name) {
        FMOD_STUDIO_USER_PROPERTY property = new FMOD_STUDIO_USER_PROPERTY();
        processApiResult(FMOD_Studio_EventDescription_GetUserProperty(self, name, property), "EventDescription.getUserProperty");
        return property;
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventDescription_GetLength(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, int *length);
    public int getLength() {
        processApiResult(FMOD_Studio_EventDescription_GetLength(self, pi), "EventDescription.getLength");
        return pi[0];
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventDescription_GetMinMaxDistance(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, float *min, float *max);
    public float getMinimumDistance() {
        processApiResult(FMOD_Studio_EventDescription_GetMinMaxDistance(self, pf, pf2), "EventDescription.getMinimumDistance");
        return pf[0];
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventDescription_GetMinMaxDistance(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, float *min, float *max);
    public float getMaximumDistance() {
        processApiResult(FMOD_Studio_EventDescription_GetMinMaxDistance(self, pf, pf2), "EventDescription.getMaximumDistance");
        return pf2[0];
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventDescription_GetSoundSize(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, float *size);
    public float getSoundSize() {
        processApiResult(FMOD_Studio_EventDescription_GetSoundSize(self, pf), "EventDescription.getSoundSize");
        return pf[0];
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventDescription_IsSnapshot(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, FMOD_BOOL *snapshot);
    public boolean isSnapshot() {
        processApiResult(FMOD_Studio_EventDescription_IsSnapshot(self, pi), "EventDescription.isSnapshot");
        return pi[0] != 0;
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventDescription_IsOneshot(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, FMOD_BOOL *oneshot);
    public boolean isOneshot() {
        processApiResult(FMOD_Studio_EventDescription_IsOneshot(self, pi), "EventDescription.isOneshot");
        return pi[0] != 0;
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventDescription_IsStream(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, FMOD_BOOL *isStream);
    public boolean isStream() {
        processApiResult(FMOD_Studio_EventDescription_IsStream(self, pi), "EventDescription.isStream");
        return pi[0] != 0;
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventDescription_Is3D(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, FMOD_BOOL *is3D);
    public boolean is3D() {
        processApiResult(FMOD_Studio_EventDescription_Is3D(self, pi), "EventDescription.is3D");
        return pi[0] != 0;
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventDescription_IsDopplerEnabled(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, FMOD_BOOL *doppler);
    public boolean isDopplerEnabled() {
        processApiResult(FMOD_Studio_EventDescription_IsDopplerEnabled(self, pi), "EventDescription.isDopplerEnabled");
        return pi[0] != 0;
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventDescription_HasSustainPoint(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, FMOD_BOOL *sustainPoint);
    public boolean hasSustainPoint() {
        processApiResult(FMOD_Studio_EventDescription_HasSustainPoint(self, pi), "EventDescription.hasSustainPoint");
        return pi[0] != 0;
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventDescription_CreateInstance(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, FMOD_STUDIO_EVENTINSTANCE **instance);
    public EventInstance createInstance() {
        SWIGTYPE_p_p_FMOD_STUDIO_EVENTINSTANCE pp = new_FMOD_STUDIO_EVENTINSTANCE_p_p();
        processApiResult(FMOD_Studio_EventDescription_CreateInstance(self, pp), "EventDescription.createInstance");
        final SWIGTYPE_p_FMOD_STUDIO_EVENTINSTANCE p = FMOD_STUDIO_EVENTINSTANCE_p_p_value(pp);
        delete_FMOD_STUDIO_EVENTINSTANCE_p_p(pp);
        return new EventInstance(p, this);
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventDescription_GetInstanceCount(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, int *count);
    public int getInstanceCount() {
        processApiResult(FMOD_Studio_EventDescription_GetInstanceCount(self, pi), "EventDescription.getInstanceCount");
        return pi[0];
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventDescription_GetInstanceList(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, FMOD_STUDIO_EVENTINSTANCE **array, int capacity, int *count);
    //	public synchronized boolean getInstanceList() {
    //		int count = getInstanceCount();
    //		SWIGTYPE_p_FMOD_STUDIO_EVENTINSTANCE[] instancePointers = new SWIGTYPE_p_FMOD_STUDIO_EVENTINSTANCE[count];
    //		//TODO we can get back a pointer to a pointer, but we can't iterate it, so we're stuck. Needs some swig work.
    //		processApiResult(FMOD_Studio_EventDescription_GetInstanceList(pointer, instancePointers, count, pi), "EventDescription.getInstanceList");
    //		return pi[0] != 0;
    //	}

    //    FMOD_RESULT F_API FMOD_Studio_EventDescription_LoadSampleData(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription);
    public void loadSampleData() {
        processApiResult(FMOD_Studio_EventDescription_LoadSampleData(self), "EventDescription.loadSampleData");
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventDescription_UnloadSampleData(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription);
    public void unloadSampleData() {
        processApiResult(FMOD_Studio_EventDescription_UnloadSampleData(self), "EventDescription.unloadSampleData");
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventDescription_GetSampleLoadingState(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, FMOD_STUDIO_LOADING_STATE *state);
    //	public void getSampleLoadingState() {
    //		//TODO need to implement enum functionality here maybe? See EventInstance.getPlaybackState()
    //		processApiResult(FMOD_Studio_EventDescription_GetSampleLoadingState(pointer, p), "EventDescription.getSampleLoadingState");
    //	}

    //    FMOD_RESULT F_API FMOD_Studio_EventDescription_ReleaseAllInstances(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription);
    public void releaseAllInstances() {
        processApiResult(FMOD_Studio_EventDescription_ReleaseAllInstances(self), "EventDescription.ReleaseAllInstances");
    }

    //    FMOD_RESULT F_API FMOD_Studio_EventDescription_SetCallback(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, FMOD_STUDIO_EVENT_CALLBACK callback, FMOD_STUDIO_EVENT_CALLBACK_TYPE callbackmask);
    //    FMOD_RESULT F_API FMOD_Studio_EventDescription_GetUserData(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, void **userdata);
    //    FMOD_RESULT F_API FMOD_Studio_EventDescription_SetUserData(FMOD_STUDIO_EVENTDESCRIPTION *eventdescription, void *userdata);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventDescription that = (EventDescription) o;
        return self.equals(that.self);
    }

    @Override
    public int hashCode() {
        return self.hashCode();
    }
}
