/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public class FMOD_STUDIO_BUFFER_USAGE {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FMOD_STUDIO_BUFFER_USAGE(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FMOD_STUDIO_BUFFER_USAGE obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        FMODJNI.delete_FMOD_STUDIO_BUFFER_USAGE(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(Object obj) {
  	if(obj == this) return true;
  	if(obj == null) return false;
  	if (! (obj instanceof FMOD_STUDIO_BUFFER_USAGE)) return false;
    return this.swigCPtr == ((FMOD_STUDIO_BUFFER_USAGE)obj).swigCPtr;
  }
  public int hashCode() {
     return (int)swigCPtr;
  }

  public void setStudiocommandqueue(FMOD_STUDIO_BUFFER_INFO value) {
    FMODJNI.FMOD_STUDIO_BUFFER_USAGE_studiocommandqueue_set(swigCPtr, this, FMOD_STUDIO_BUFFER_INFO.getCPtr(value), value);
  }

  public FMOD_STUDIO_BUFFER_INFO getStudiocommandqueue() {
    long cPtr = FMODJNI.FMOD_STUDIO_BUFFER_USAGE_studiocommandqueue_get(swigCPtr, this);
    return (cPtr == 0) ? null : new FMOD_STUDIO_BUFFER_INFO(cPtr, false);
  }

  public void setStudiohandle(FMOD_STUDIO_BUFFER_INFO value) {
    FMODJNI.FMOD_STUDIO_BUFFER_USAGE_studiohandle_set(swigCPtr, this, FMOD_STUDIO_BUFFER_INFO.getCPtr(value), value);
  }

  public FMOD_STUDIO_BUFFER_INFO getStudiohandle() {
    long cPtr = FMODJNI.FMOD_STUDIO_BUFFER_USAGE_studiohandle_get(swigCPtr, this);
    return (cPtr == 0) ? null : new FMOD_STUDIO_BUFFER_INFO(cPtr, false);
  }

  public FMOD_STUDIO_BUFFER_USAGE() {
    this(FMODJNI.new_FMOD_STUDIO_BUFFER_USAGE(), true);
  }

}
