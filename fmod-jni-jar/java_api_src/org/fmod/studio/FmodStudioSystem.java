package org.fmod.studio;

import org.fmod.core.FMODResultTracker;
import org.fmod.core.FmodSystem;
import org.fmod.jni.*;

import java.nio.charset.StandardCharsets;
import java.util.Objects;

import static org.fmod.jni.FMOD.*;

/**
 * FMOD Studio System Java API
 * <p>
 * This class is intended to be an idiomatic Java wrapper for the C++ class
 * FMOD::Studio::System defined in fmod_studio.hpp
 * <p>
 * {@link FMOD_RESULT} return values have been omitted from the individual calls because it's a pain in the neck
 * to return multiple values in Java. They are exposed via the getLastResult() and resultHandler mechanisms instead.
 * <p>
 * To get started, call System.create().
 *
 * @see <a href="http://www.fmod.org/documentation/#content/generated/studio_api_System.html" >FMOD Documentation</a>
 * <p>
 * Author: Nate
 * Date: 5/1/2015
 */
@SuppressWarnings({"unused", "WeakerAccess"})    //this is an api, it expects to be unused. lol.
public final class FmodStudioSystem extends FMODResultTracker {

    private final SWIGTYPE_p_FMOD_STUDIO_SYSTEM self;
    private FMOD_STUDIO_ADVANCEDSETTINGS tmpAdvancedSettings;
    private FMOD_STUDIO_SOUND_INFO tmpSoundInfo;
    private FMOD_3D_ATTRIBUTES tmpListenerAttributes;
    private FMOD_VECTOR attenuationPosition;

    /**
     * private constructor. Must call System.create();
     */
    private FmodStudioSystem(SWIGTYPE_p_FMOD_STUDIO_SYSTEM self) {
        this.self = self;
    }


    /**
     * @see <a href="http://www.fmod.org/documentation/#content/generated/FMOD_Studio_System_Create.html">FMOD Documentation</a>
     */
    public static FmodStudioSystem create() {
        SWIGTYPE_p_p_FMOD_STUDIO_SYSTEM pp = new_FMOD_STUDIO_SYSTEM_p_p();
        FMOD_RESULT result = FMOD_Studio_System_Create(pp, FMODConstants.FMOD_VERSION);
        final FmodStudioSystem system = new FmodStudioSystem(FMOD_STUDIO_SYSTEM_p_p_value(pp));
        system.processApiResult(result, "StudioSystem.create");
        delete_FMOD_STUDIO_SYSTEM_p_p(pp);
        return system;
    }

    /**
     * if you need to use the JNI api directly for some reason, you can get at the raw pointer.
     */
    public SWIGTYPE_p_FMOD_STUDIO_SYSTEM getPointer() {
        return self;
    }

    public void setAdvancedSettings(FMOD_STUDIO_ADVANCEDSETTINGS settings) {
        processApiResult(FMOD_Studio_System_SetAdvancedSettings(self, settings), "StudioSystem.setAdvancedSettings");
    }

    public FMOD_STUDIO_ADVANCEDSETTINGS getAdvancedSettings() {
        if (tmpAdvancedSettings == null) {
            tmpAdvancedSettings = new FMOD_STUDIO_ADVANCEDSETTINGS();
            tmpAdvancedSettings.setCbsize(FMODConstants.sizeof_FMOD_STUDIO_ADVANCEDSETTINGS);
        }

        return getAdvancedSettings(tmpAdvancedSettings);
    }

    public FMOD_STUDIO_ADVANCEDSETTINGS getAdvancedSettings(FMOD_STUDIO_ADVANCEDSETTINGS toFill) {
        processApiResult(FMOD_Studio_System_GetAdvancedSettings(self, toFill), "StudioSystem.getAdvancedSettings");
        return toFill;
    }

    /**
     * TODO: some mechanism to handle extraDriverData? What do people even want to pass here? a ByteBuffer? Buh?
     *
     * @see <a href="http://www.fmod.org/documentation/#content/generated/FMOD_Studio_System_Initialize.html">FMOD Documentation</a>
     */
    public void initialize(int maxChannels, long studioFlags, long flags, SWIGTYPE_p_void extraDriverData) {
        processApiResult(FMOD_Studio_System_Initialize(self, maxChannels, studioFlags, flags, extraDriverData), "StudioSystem.initialize");
    }

    public void release() {
        processApiResult(FMOD_Studio_System_Release(self), "StudioSystem.release");
    }

    public boolean isValid() {
        return FMOD_Studio_System_IsValid(self) != 0;
    }

    public void update() {
        processApiResult(FMOD_Studio_System_Update(self), "StudioSystem.update");
    }

    public void flushCommands() {
        processApiResult(FMOD_Studio_System_FlushCommands(self), "StudioSystem.flushCommands");
    }

    public FmodSystem getCoreSystem() {
        SWIGTYPE_p_p_FMOD_SYSTEM pp = new_FMOD_SYSTEM_p_p();
        processApiResult(FMOD_Studio_System_GetCoreSystem(self, pp), "StudioSystem.getCoreSystem");
        SWIGTYPE_p_FMOD_SYSTEM lowLevel_p = FMOD_SYSTEM_p_p_value(pp);
        delete_FMOD_SYSTEM_p_p(pp);
        return FmodSystem.fromPointer(lowLevel_p);
    }

    public EventDescription getEvent(String pathOrId) {
        SWIGTYPE_p_p_FMOD_STUDIO_EVENTDESCRIPTION pp = new_FMOD_STUDIO_EVENTDESCRIPTION_p_p();
        processApiResult(FMOD_Studio_System_GetEvent(self, pathOrId, pp), "StudioSystem.getEvent");
        SWIGTYPE_p_FMOD_STUDIO_EVENTDESCRIPTION p = FMOD_STUDIO_EVENTDESCRIPTION_p_p_value(pp);
        delete_FMOD_STUDIO_EVENTDESCRIPTION_p_p(pp);
        return new EventDescription(p);
    }

    public EventDescription getEventById(FMOD_GUID id) {
        SWIGTYPE_p_p_FMOD_STUDIO_EVENTDESCRIPTION pp = new_FMOD_STUDIO_EVENTDESCRIPTION_p_p();
        processApiResult(FMOD_Studio_System_GetEventByID(self, id, pp), "StudioSystem.getEventById");
        SWIGTYPE_p_FMOD_STUDIO_EVENTDESCRIPTION p = FMOD_STUDIO_EVENTDESCRIPTION_p_p_value(pp);
        delete_FMOD_STUDIO_EVENTDESCRIPTION_p_p(pp);
        return new EventDescription(p);
    }

    public Bus getBus(String path) {
        SWIGTYPE_p_p_FMOD_STUDIO_BUS pp = new_FMOD_STUDIO_BUS_p_p();
        processApiResult(FMOD_Studio_System_GetBus(self, path, pp), "StudioSystem.getBus");
        SWIGTYPE_p_FMOD_STUDIO_BUS p = FMOD_STUDIO_BUS_p_p_value(pp);
        delete_FMOD_STUDIO_BUS_p_p(pp);
        return new Bus(p);
    }

    public Bus getBusById(FMOD_GUID id) {
        SWIGTYPE_p_p_FMOD_STUDIO_BUS pp = new_FMOD_STUDIO_BUS_p_p();
        processApiResult(FMOD_Studio_System_GetBusByID(self, id, pp), "StudioSystem.getBus");
        SWIGTYPE_p_FMOD_STUDIO_BUS p = FMOD_STUDIO_BUS_p_p_value(pp);
        delete_FMOD_STUDIO_BUS_p_p(pp);
        return new Bus(p);
    }

    public VCA getVCA(String path) {
        SWIGTYPE_p_p_FMOD_STUDIO_VCA pp = new_FMOD_STUDIO_VCA_p_p();
        processApiResult(FMOD_Studio_System_GetVCA(self, path, pp), "StudioSystem.getVCA");
        SWIGTYPE_p_FMOD_STUDIO_VCA p = FMOD_STUDIO_VCA_p_p_value(pp);
        delete_FMOD_STUDIO_VCA_p_p(pp);
        return new VCA(p);
    }

    public VCA getVCAById(FMOD_GUID id) {
        SWIGTYPE_p_p_FMOD_STUDIO_VCA pp = new_FMOD_STUDIO_VCA_p_p();
        processApiResult(FMOD_Studio_System_GetVCAByID(self, id, pp), "StudioSystem.getVCA");
        SWIGTYPE_p_FMOD_STUDIO_VCA p = FMOD_STUDIO_VCA_p_p_value(pp);
        delete_FMOD_STUDIO_VCA_p_p(pp);
        return new VCA(p);
    }

    public Bank getBank(String path) {
        SWIGTYPE_p_p_FMOD_STUDIO_BANK pp = new_FMOD_STUDIO_BANK_p_p();
        processApiResult(FMOD_Studio_System_GetBank(self, path, pp), "StudioSystem.getBank");
        SWIGTYPE_p_FMOD_STUDIO_BANK p = FMOD_STUDIO_BANK_p_p_value(pp);
        delete_FMOD_STUDIO_BANK_p_p(pp);
        return new Bank(p);
    }

    public Bank getBankById(FMOD_GUID id) {
        SWIGTYPE_p_p_FMOD_STUDIO_BANK pp = new_FMOD_STUDIO_BANK_p_p();
        processApiResult(FMOD_Studio_System_GetBankByID(self, id, pp), "StudioSystem.getBank");
        SWIGTYPE_p_FMOD_STUDIO_BANK p = FMOD_STUDIO_BANK_p_p_value(pp);
        delete_FMOD_STUDIO_BANK_p_p(pp);
        return new Bank(p);
    }

    public FMOD_STUDIO_SOUND_INFO getSoundInfo(String key) {
        if (tmpSoundInfo == null) {
            tmpSoundInfo = new FMOD_STUDIO_SOUND_INFO();
        }
        return getSoundInfo(key, tmpSoundInfo);
    }

    public FMOD_STUDIO_SOUND_INFO getSoundInfo(String key, FMOD_STUDIO_SOUND_INFO info) {
        processApiResult(FMOD_Studio_System_GetSoundInfo(self, key, info), "StudioSystem.getSoundInfo");
        return info;
    }

    /**
     * returns a new GUID object containing the GUID corresponding to the path.
     * The assumption is you'd be looking up ids once on load.
     */
    public FMOD_GUID lookupId(String path) {
        FMOD_GUID id = new FMOD_GUID();
        return lookupId(path, id);
    }

    /**
     * If you want to allocate your own GUID I guess you can do that too.
     */
    public FMOD_GUID lookupId(String path, FMOD_GUID outId) {
        processApiResult(FMOD_Studio_System_LookupID(self, path.getBytes(StandardCharsets.UTF_8), outId), "StudioSystem.lookupId");
        return outId;
    }

    public int getNumListeners() {
        int[] numListeners = new int[1];
        processApiResult(FMOD_Studio_System_GetNumListeners(self, numListeners), "StudioSystem.getNumListeners");
        return numListeners[0];
    }

    public void setNumListeners(int numListeners) {
        processApiResult(FMOD_Studio_System_SetNumListeners(self, numListeners), "StudioSystem.setNumListeners");
    }

    /**
     * returns a temporary FMOD_3D_ATTRIBUTES object is reused per call.
     * If that's not what you want you can call the other version of the function instead.
     */
    public FMOD_3D_ATTRIBUTES getListenerAttributes(int index) {
        if (tmpListenerAttributes == null) {
            tmpListenerAttributes = new FMOD_3D_ATTRIBUTES();
        }
        return getListenerAttributes(index, tmpListenerAttributes);
    }

    /**
     * Fills the given FMOD_3D_ATTRIBUTES object with the listener attributes.
     */
    public FMOD_3D_ATTRIBUTES getListenerAttributes(int index, FMOD_3D_ATTRIBUTES attributes) {
        if (attenuationPosition == null) {
            attenuationPosition = new FMOD_VECTOR();
        }
        processApiResult(FMOD_Studio_System_GetListenerAttributes(self, index, attributes, attenuationPosition), "StudioSystem.getListenerAttributes");
        return attributes;
    }

    public void setListenerAttributes(int index, FMOD_3D_ATTRIBUTES attributes) {
        if (attenuationPosition == null) {
            attenuationPosition = new FMOD_VECTOR();
        }
        processApiResult(FMOD_Studio_System_SetListenerAttributes(self, index, attributes, attenuationPosition), "StudioSystem.setListenerAttributes");
    }

    /**
     * This is the only function for loading banks that is supported right now.
     */
    public Bank loadBankFile(String filename, long studioLoadBankFlags) {
        SWIGTYPE_p_p_FMOD_STUDIO_BANK pp = new_FMOD_STUDIO_BANK_p_p();
        processApiResult(FMOD_Studio_System_LoadBankFile(self, filename, studioLoadBankFlags, pp), "StudioSystem.loadBankFile");
        SWIGTYPE_p_FMOD_STUDIO_BANK p = FMOD_STUDIO_BANK_p_p_value(pp);
        delete_FMOD_STUDIO_BANK_p_p(pp);
        return new Bank(p);
    }

    public void unloadAll() {
        processApiResult(FMOD_Studio_System_UnloadAll(self), "StudioSystem.unloadAll");
    }


///////////////////////// TODO - pick these up //////////////////////////////////
//	//FMOD_RESULT F_API FMOD_Studio_System_StartCommandCapture(FMOD_STUDIO_SYSTEM *system, const char *filename, FMOD_STUDIO_COMMANDCAPTURE_FLAGS flags);
//	public void startCommandCapture(String filename, long studioCommandCaptureFlags) {
//		throw new UnsupportedOperationException("not yet implemented");
//	}
//
//	//FMOD_RESULT F_API FMOD_Studio_System_StopCommandCapture(FMOD_STUDIO_SYSTEM *system);
//	public void stopCommandCapture() {
//		throw new UnsupportedOperationException("not yet implemented");
//	}
//
//	//FMOD_RESULT F_API FMOD_Studio_System_LoadCommandReplay(FMOD_STUDIO_SYSTEM *system, const char *filename, FMOD_STUDIO_COMMANDREPLAY_FLAGS flags, FMOD_STUDIO_COMMANDREPLAY **replay);
//	public CommandReplay loadCommandReplay(String filename, long studioCommandReplayFlags) {
//		throw new UnsupportedOperationException("not yet implemented");
//	}
//
//	//FMOD_RESULT F_API FMOD_Studio_System_GetBankCount(FMOD_STUDIO_SYSTEM *system, int *count);
//	/**
//	 * TODO Note, unlike in C, you don't need to call this in order to get the Bank List, just get the list.
//	 */
//	public int getBankCount() {
//		throw new UnsupportedOperationException("not yet implemented");
//	}
//
//	//FMOD_RESULT F_API FMOD_Studio_System_GetBankList(FMOD_STUDIO_SYSTEM *system, FMOD_STUDIO_BANK **array, int capacity, int *count);
//	public Bank[] getBankList() {
//		//TODO: figure out how to retrieve all banks
//		throw new UnsupportedOperationException("not yet implemented");
//	}
//
//	//FMOD_RESULT F_API FMOD_Studio_System_GetCPUUsage(FMOD_STUDIO_SYSTEM *system, FMOD_STUDIO_CPU_USAGE *usage);
//	public FMOD_STUDIO_CPU_USAGE getCPUUsage() {
//		throw new UnsupportedOperationException("not yet implemented");
//	}
//
//	//FMOD_RESULT F_API FMOD_Studio_System_GetBufferUsage(FMOD_STUDIO_SYSTEM *system, FMOD_STUDIO_BUFFER_USAGE *usage);
//	public FMOD_STUDIO_BUFFER_USAGE getBufferUsage() {
//		throw new UnsupportedOperationException("not yet implemented");
//	}
//
//	//FMOD_RESULT F_API FMOD_Studio_System_ResetBufferUsage(FMOD_STUDIO_SYSTEM *system);
//	public void resetBufferUsage() {
//		throw new UnsupportedOperationException("not yet implemented");
//	}


///////////////////////// NOT SUPPORTED FOR NOW //////////////////////////////////

//	//FMOD_RESULT F_API FMOD_Studio_System_LoadBankMemory(FMOD_STUDIO_SYSTEM *system, const char *buffer, int length, FMOD_STUDIO_LOAD_MEMORY_MODE mode, FMOD_STUDIO_LOAD_BANK_FLAGS flags, FMOD_STUDIO_BANK **bank);
//	@Deprecated
//	public Bank loadBankMemory(String buffer, FMOD_STUDIO_LOAD_MEMORY_MODE mode, long studioLoadBankFlags) {
//	//TODO: need to modify the swig wrapper, we want to pass byte array or buffer here, not a string.
//	throw new UnsupportedOperationException("not yet implemented");
//	}
//
//	//FMOD_RESULT F_API FMOD_Studio_System_LoadBankCustom(FMOD_STUDIO_SYSTEM *system, const FMOD_STUDIO_BANK_INFO *info, FMOD_STUDIO_LOAD_BANK_FLAGS flags, FMOD_STUDIO_BANK **bank);
//	@Deprecated
//	public Bank loadBankCustom(final FMOD_STUDIO_BANK_INFO info, long studioLoadBankFlags) {
//		//TODO: is this meaningful for us?
//		throw new UnsupportedOperationException("not yet implemented");
//	}
//
//	//FMOD_RESULT F_API FMOD_Studio_System_RegisterPlugin(FMOD_STUDIO_SYSTEM *system, const FMOD_DSP_DESCRIPTION *description);
//	@Deprecated
//	public void RegisterPlugin(SWIGTYPE_p_FMOD_DSP_DESCRIPTION description) {
//		//TODO: include the DSP header? Does anyone want to actually do this?
//		throw new UnsupportedOperationException("not yet implemented");
//	}
//
//	//FMOD_RESULT F_API FMOD_Studio_System_UnregisterPlugin(FMOD_STUDIO_SYSTEM *system, const char *name);
//	public void unregisterPlugin(String name) {
//		throw new UnsupportedOperationException("not yet implemented");
//	}
//
//	//FMOD_RESULT F_API FMOD_Studio_System_SetCallback(FMOD_STUDIO_SYSTEM *system, FMOD_STUDIO_SYSTEM_CALLBACK callback, FMOD_STUDIO_SYSTEM_CALLBACK_TYPE callbackmask);
//	@Deprecated
//	public void setCallback(SWIGTYPE_p_f_p_struct_FMOD_STUDIO_SYSTEM_unsigned_int_p_void_p_void__FMOD_RESULT callback, long callbackMask) {
//		//TODO: I doubt this is usable in its current form. But, we could probably make something that is usable, with some thought.
//		throw new UnsupportedOperationException("not yet implemented");
//	}
//
//	//FMOD_RESULT F_API FMOD_Studio_System_SetUserData(FMOD_STUDIO_SYSTEM *system, void *userdata);
//	/**
//	 * TODO: make this a byte[] or ByteBuffer.
//	 */
//	@Deprecated
//	public void setUserData(SWIGTYPE_p_void userData) {
//		throw new UnsupportedOperationException("not yet implemented");
//	}
//
//	//FMOD_RESULT F_API FMOD_Studio_System_GetUserData(FMOD_STUDIO_SYSTEM *system, void **userdata);
//	/**
//	 * TODO: make this something useful.
//	 */
//	@Deprecated
//	public SWIGTYPE_p_void getUserData() {
//		throw new UnsupportedOperationException("not yet implemented");
//	}
//
//	@Deprecated
//	public String lookupPath(FMOD_GUID id) {
//		//TODO: underlying JNI appears to be broken, passes a String, but I don't think that will work? Need to massage the SWIG input?
//		throw new UnsupportedOperationException("not yet implemented");
//	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FmodStudioSystem that = (FmodStudioSystem) o;
        return Objects.equals(self, that.self) &&
                Objects.equals(tmpAdvancedSettings, that.tmpAdvancedSettings) &&
                Objects.equals(tmpSoundInfo, that.tmpSoundInfo) &&
                Objects.equals(tmpListenerAttributes, that.tmpListenerAttributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(self, tmpAdvancedSettings, tmpSoundInfo, tmpListenerAttributes);
    }
}
