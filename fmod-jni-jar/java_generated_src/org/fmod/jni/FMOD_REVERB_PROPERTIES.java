/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public class FMOD_REVERB_PROPERTIES {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FMOD_REVERB_PROPERTIES(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FMOD_REVERB_PROPERTIES obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        FMODJNI.delete_FMOD_REVERB_PROPERTIES(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(Object obj) {
  	if(obj == this) return true;
  	if(obj == null) return false;
  	if (! (obj instanceof FMOD_REVERB_PROPERTIES)) return false;
    return this.swigCPtr == ((FMOD_REVERB_PROPERTIES)obj).swigCPtr;
  }
  public int hashCode() {
     return (int)swigCPtr;
  }

  public void setDecayTime(float value) {
    FMODJNI.FMOD_REVERB_PROPERTIES_DecayTime_set(swigCPtr, this, value);
  }

  public float getDecayTime() {
    return FMODJNI.FMOD_REVERB_PROPERTIES_DecayTime_get(swigCPtr, this);
  }

  public void setEarlyDelay(float value) {
    FMODJNI.FMOD_REVERB_PROPERTIES_EarlyDelay_set(swigCPtr, this, value);
  }

  public float getEarlyDelay() {
    return FMODJNI.FMOD_REVERB_PROPERTIES_EarlyDelay_get(swigCPtr, this);
  }

  public void setLateDelay(float value) {
    FMODJNI.FMOD_REVERB_PROPERTIES_LateDelay_set(swigCPtr, this, value);
  }

  public float getLateDelay() {
    return FMODJNI.FMOD_REVERB_PROPERTIES_LateDelay_get(swigCPtr, this);
  }

  public void setHFReference(float value) {
    FMODJNI.FMOD_REVERB_PROPERTIES_HFReference_set(swigCPtr, this, value);
  }

  public float getHFReference() {
    return FMODJNI.FMOD_REVERB_PROPERTIES_HFReference_get(swigCPtr, this);
  }

  public void setHFDecayRatio(float value) {
    FMODJNI.FMOD_REVERB_PROPERTIES_HFDecayRatio_set(swigCPtr, this, value);
  }

  public float getHFDecayRatio() {
    return FMODJNI.FMOD_REVERB_PROPERTIES_HFDecayRatio_get(swigCPtr, this);
  }

  public void setDiffusion(float value) {
    FMODJNI.FMOD_REVERB_PROPERTIES_Diffusion_set(swigCPtr, this, value);
  }

  public float getDiffusion() {
    return FMODJNI.FMOD_REVERB_PROPERTIES_Diffusion_get(swigCPtr, this);
  }

  public void setDensity(float value) {
    FMODJNI.FMOD_REVERB_PROPERTIES_Density_set(swigCPtr, this, value);
  }

  public float getDensity() {
    return FMODJNI.FMOD_REVERB_PROPERTIES_Density_get(swigCPtr, this);
  }

  public void setLowShelfFrequency(float value) {
    FMODJNI.FMOD_REVERB_PROPERTIES_LowShelfFrequency_set(swigCPtr, this, value);
  }

  public float getLowShelfFrequency() {
    return FMODJNI.FMOD_REVERB_PROPERTIES_LowShelfFrequency_get(swigCPtr, this);
  }

  public void setLowShelfGain(float value) {
    FMODJNI.FMOD_REVERB_PROPERTIES_LowShelfGain_set(swigCPtr, this, value);
  }

  public float getLowShelfGain() {
    return FMODJNI.FMOD_REVERB_PROPERTIES_LowShelfGain_get(swigCPtr, this);
  }

  public void setHighCut(float value) {
    FMODJNI.FMOD_REVERB_PROPERTIES_HighCut_set(swigCPtr, this, value);
  }

  public float getHighCut() {
    return FMODJNI.FMOD_REVERB_PROPERTIES_HighCut_get(swigCPtr, this);
  }

  public void setEarlyLateMix(float value) {
    FMODJNI.FMOD_REVERB_PROPERTIES_EarlyLateMix_set(swigCPtr, this, value);
  }

  public float getEarlyLateMix() {
    return FMODJNI.FMOD_REVERB_PROPERTIES_EarlyLateMix_get(swigCPtr, this);
  }

  public void setWetLevel(float value) {
    FMODJNI.FMOD_REVERB_PROPERTIES_WetLevel_set(swigCPtr, this, value);
  }

  public float getWetLevel() {
    return FMODJNI.FMOD_REVERB_PROPERTIES_WetLevel_get(swigCPtr, this);
  }

  public FMOD_REVERB_PROPERTIES() {
    this(FMODJNI.new_FMOD_REVERB_PROPERTIES(), true);
  }

}
