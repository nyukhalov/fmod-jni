/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public class FMOD_STUDIO_PLUGIN_INSTANCE_PROPERTIES {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected FMOD_STUDIO_PLUGIN_INSTANCE_PROPERTIES(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FMOD_STUDIO_PLUGIN_INSTANCE_PROPERTIES obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        FMODJNI.delete_FMOD_STUDIO_PLUGIN_INSTANCE_PROPERTIES(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(Object obj) {
  	if(obj == this) return true;
  	if(obj == null) return false;
  	if (! (obj instanceof FMOD_STUDIO_PLUGIN_INSTANCE_PROPERTIES)) return false;
    return this.swigCPtr == ((FMOD_STUDIO_PLUGIN_INSTANCE_PROPERTIES)obj).swigCPtr;
  }
  public int hashCode() {
     return (int)swigCPtr;
  }

  public void setName(String value) {
    FMODJNI.FMOD_STUDIO_PLUGIN_INSTANCE_PROPERTIES_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return FMODJNI.FMOD_STUDIO_PLUGIN_INSTANCE_PROPERTIES_name_get(swigCPtr, this);
  }

  public void setDsp(SWIGTYPE_p_FMOD_DSP value) {
    FMODJNI.FMOD_STUDIO_PLUGIN_INSTANCE_PROPERTIES_dsp_set(swigCPtr, this, SWIGTYPE_p_FMOD_DSP.getCPtr(value));
  }

  public SWIGTYPE_p_FMOD_DSP getDsp() {
    long cPtr = FMODJNI.FMOD_STUDIO_PLUGIN_INSTANCE_PROPERTIES_dsp_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_FMOD_DSP(cPtr, false);
  }

  public FMOD_STUDIO_PLUGIN_INSTANCE_PROPERTIES() {
    this(FMODJNI.new_FMOD_STUDIO_PLUGIN_INSTANCE_PROPERTIES(), true);
  }

}
