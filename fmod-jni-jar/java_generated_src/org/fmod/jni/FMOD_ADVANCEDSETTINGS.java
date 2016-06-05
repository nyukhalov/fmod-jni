/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public class FMOD_ADVANCEDSETTINGS {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FMOD_ADVANCEDSETTINGS(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FMOD_ADVANCEDSETTINGS obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        FMODJNI.delete_FMOD_ADVANCEDSETTINGS(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(Object obj) {
  	if(obj == this) return true;
  	if(obj == null) return false;
  	if (! (obj instanceof FMOD_ADVANCEDSETTINGS)) return false;
    return this.swigCPtr == ((FMOD_ADVANCEDSETTINGS)obj).swigCPtr;
  }
  public int hashCode() {
     return (int)swigCPtr;
  }

  public void setCbSize(int value) {
    FMODJNI.FMOD_ADVANCEDSETTINGS_cbSize_set(swigCPtr, this, value);
  }

  public int getCbSize() {
    return FMODJNI.FMOD_ADVANCEDSETTINGS_cbSize_get(swigCPtr, this);
  }

  public void setMaxMPEGCodecs(int value) {
    FMODJNI.FMOD_ADVANCEDSETTINGS_maxMPEGCodecs_set(swigCPtr, this, value);
  }

  public int getMaxMPEGCodecs() {
    return FMODJNI.FMOD_ADVANCEDSETTINGS_maxMPEGCodecs_get(swigCPtr, this);
  }

  public void setMaxADPCMCodecs(int value) {
    FMODJNI.FMOD_ADVANCEDSETTINGS_maxADPCMCodecs_set(swigCPtr, this, value);
  }

  public int getMaxADPCMCodecs() {
    return FMODJNI.FMOD_ADVANCEDSETTINGS_maxADPCMCodecs_get(swigCPtr, this);
  }

  public void setMaxXMACodecs(int value) {
    FMODJNI.FMOD_ADVANCEDSETTINGS_maxXMACodecs_set(swigCPtr, this, value);
  }

  public int getMaxXMACodecs() {
    return FMODJNI.FMOD_ADVANCEDSETTINGS_maxXMACodecs_get(swigCPtr, this);
  }

  public void setMaxVorbisCodecs(int value) {
    FMODJNI.FMOD_ADVANCEDSETTINGS_maxVorbisCodecs_set(swigCPtr, this, value);
  }

  public int getMaxVorbisCodecs() {
    return FMODJNI.FMOD_ADVANCEDSETTINGS_maxVorbisCodecs_get(swigCPtr, this);
  }

  public void setMaxAT9Codecs(int value) {
    FMODJNI.FMOD_ADVANCEDSETTINGS_maxAT9Codecs_set(swigCPtr, this, value);
  }

  public int getMaxAT9Codecs() {
    return FMODJNI.FMOD_ADVANCEDSETTINGS_maxAT9Codecs_get(swigCPtr, this);
  }

  public void setMaxFADPCMCodecs(int value) {
    FMODJNI.FMOD_ADVANCEDSETTINGS_maxFADPCMCodecs_set(swigCPtr, this, value);
  }

  public int getMaxFADPCMCodecs() {
    return FMODJNI.FMOD_ADVANCEDSETTINGS_maxFADPCMCodecs_get(swigCPtr, this);
  }

  public void setMaxPCMCodecs(int value) {
    FMODJNI.FMOD_ADVANCEDSETTINGS_maxPCMCodecs_set(swigCPtr, this, value);
  }

  public int getMaxPCMCodecs() {
    return FMODJNI.FMOD_ADVANCEDSETTINGS_maxPCMCodecs_get(swigCPtr, this);
  }

  public void setASIONumChannels(int value) {
    FMODJNI.FMOD_ADVANCEDSETTINGS_ASIONumChannels_set(swigCPtr, this, value);
  }

  public int getASIONumChannels() {
    return FMODJNI.FMOD_ADVANCEDSETTINGS_ASIONumChannels_get(swigCPtr, this);
  }

  public void setASIOChannelList(SWIGTYPE_p_p_char value) {
    FMODJNI.FMOD_ADVANCEDSETTINGS_ASIOChannelList_set(swigCPtr, this, SWIGTYPE_p_p_char.getCPtr(value));
  }

  public SWIGTYPE_p_p_char getASIOChannelList() {
    long cPtr = FMODJNI.FMOD_ADVANCEDSETTINGS_ASIOChannelList_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_char(cPtr, false);
  }

  public void setASIOSpeakerList(SWIGTYPE_p_FMOD_SPEAKER value) {
    FMODJNI.FMOD_ADVANCEDSETTINGS_ASIOSpeakerList_set(swigCPtr, this, SWIGTYPE_p_FMOD_SPEAKER.getCPtr(value));
  }

  public SWIGTYPE_p_FMOD_SPEAKER getASIOSpeakerList() {
    long cPtr = FMODJNI.FMOD_ADVANCEDSETTINGS_ASIOSpeakerList_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_FMOD_SPEAKER(cPtr, false);
  }

  public void setHRTFMinAngle(float value) {
    FMODJNI.FMOD_ADVANCEDSETTINGS_HRTFMinAngle_set(swigCPtr, this, value);
  }

  public float getHRTFMinAngle() {
    return FMODJNI.FMOD_ADVANCEDSETTINGS_HRTFMinAngle_get(swigCPtr, this);
  }

  public void setHRTFMaxAngle(float value) {
    FMODJNI.FMOD_ADVANCEDSETTINGS_HRTFMaxAngle_set(swigCPtr, this, value);
  }

  public float getHRTFMaxAngle() {
    return FMODJNI.FMOD_ADVANCEDSETTINGS_HRTFMaxAngle_get(swigCPtr, this);
  }

  public void setHRTFFreq(float value) {
    FMODJNI.FMOD_ADVANCEDSETTINGS_HRTFFreq_set(swigCPtr, this, value);
  }

  public float getHRTFFreq() {
    return FMODJNI.FMOD_ADVANCEDSETTINGS_HRTFFreq_get(swigCPtr, this);
  }

  public void setVol0virtualvol(float value) {
    FMODJNI.FMOD_ADVANCEDSETTINGS_vol0virtualvol_set(swigCPtr, this, value);
  }

  public float getVol0virtualvol() {
    return FMODJNI.FMOD_ADVANCEDSETTINGS_vol0virtualvol_get(swigCPtr, this);
  }

  public void setDefaultDecodeBufferSize(long value) {
    FMODJNI.FMOD_ADVANCEDSETTINGS_defaultDecodeBufferSize_set(swigCPtr, this, value);
  }

  public long getDefaultDecodeBufferSize() {
    return FMODJNI.FMOD_ADVANCEDSETTINGS_defaultDecodeBufferSize_get(swigCPtr, this);
  }

  public void setProfilePort(int value) {
    FMODJNI.FMOD_ADVANCEDSETTINGS_profilePort_set(swigCPtr, this, value);
  }

  public int getProfilePort() {
    return FMODJNI.FMOD_ADVANCEDSETTINGS_profilePort_get(swigCPtr, this);
  }

  public void setGeometryMaxFadeTime(long value) {
    FMODJNI.FMOD_ADVANCEDSETTINGS_geometryMaxFadeTime_set(swigCPtr, this, value);
  }

  public long getGeometryMaxFadeTime() {
    return FMODJNI.FMOD_ADVANCEDSETTINGS_geometryMaxFadeTime_get(swigCPtr, this);
  }

  public void setDistanceFilterCenterFreq(float value) {
    FMODJNI.FMOD_ADVANCEDSETTINGS_distanceFilterCenterFreq_set(swigCPtr, this, value);
  }

  public float getDistanceFilterCenterFreq() {
    return FMODJNI.FMOD_ADVANCEDSETTINGS_distanceFilterCenterFreq_get(swigCPtr, this);
  }

  public void setReverb3Dinstance(int value) {
    FMODJNI.FMOD_ADVANCEDSETTINGS_reverb3Dinstance_set(swigCPtr, this, value);
  }

  public int getReverb3Dinstance() {
    return FMODJNI.FMOD_ADVANCEDSETTINGS_reverb3Dinstance_get(swigCPtr, this);
  }

  public void setDSPBufferPoolSize(int value) {
    FMODJNI.FMOD_ADVANCEDSETTINGS_DSPBufferPoolSize_set(swigCPtr, this, value);
  }

  public int getDSPBufferPoolSize() {
    return FMODJNI.FMOD_ADVANCEDSETTINGS_DSPBufferPoolSize_get(swigCPtr, this);
  }

  public void setStackSizeStream(long value) {
    FMODJNI.FMOD_ADVANCEDSETTINGS_stackSizeStream_set(swigCPtr, this, value);
  }

  public long getStackSizeStream() {
    return FMODJNI.FMOD_ADVANCEDSETTINGS_stackSizeStream_get(swigCPtr, this);
  }

  public void setStackSizeNonBlocking(long value) {
    FMODJNI.FMOD_ADVANCEDSETTINGS_stackSizeNonBlocking_set(swigCPtr, this, value);
  }

  public long getStackSizeNonBlocking() {
    return FMODJNI.FMOD_ADVANCEDSETTINGS_stackSizeNonBlocking_get(swigCPtr, this);
  }

  public void setStackSizeMixer(long value) {
    FMODJNI.FMOD_ADVANCEDSETTINGS_stackSizeMixer_set(swigCPtr, this, value);
  }

  public long getStackSizeMixer() {
    return FMODJNI.FMOD_ADVANCEDSETTINGS_stackSizeMixer_get(swigCPtr, this);
  }

  public void setResamplerMethod(FMOD_DSP_RESAMPLER value) {
    FMODJNI.FMOD_ADVANCEDSETTINGS_resamplerMethod_set(swigCPtr, this, value.swigValue());
  }

  public FMOD_DSP_RESAMPLER getResamplerMethod() {
    return FMOD_DSP_RESAMPLER.swigToEnum(FMODJNI.FMOD_ADVANCEDSETTINGS_resamplerMethod_get(swigCPtr, this));
  }

  public void setCommandQueueSize(long value) {
    FMODJNI.FMOD_ADVANCEDSETTINGS_commandQueueSize_set(swigCPtr, this, value);
  }

  public long getCommandQueueSize() {
    return FMODJNI.FMOD_ADVANCEDSETTINGS_commandQueueSize_get(swigCPtr, this);
  }

  public void setRandomSeed(long value) {
    FMODJNI.FMOD_ADVANCEDSETTINGS_randomSeed_set(swigCPtr, this, value);
  }

  public long getRandomSeed() {
    return FMODJNI.FMOD_ADVANCEDSETTINGS_randomSeed_get(swigCPtr, this);
  }

  public FMOD_ADVANCEDSETTINGS() {
    this(FMODJNI.new_FMOD_ADVANCEDSETTINGS(), true);
  }

}
