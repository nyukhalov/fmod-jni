/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public class FMOD_STUDIO_MEMORY_USAGE {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FMOD_STUDIO_MEMORY_USAGE(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FMOD_STUDIO_MEMORY_USAGE obj) {
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
        FMODJNI.delete_FMOD_STUDIO_MEMORY_USAGE(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(Object obj) {
  	if(obj == this) return true;
  	if(obj == null) return false;
  	if (! (obj instanceof FMOD_STUDIO_MEMORY_USAGE)) return false;
    return this.swigCPtr == ((FMOD_STUDIO_MEMORY_USAGE)obj).swigCPtr;
  }
  public int hashCode() {
     return (int)swigCPtr;
  }

  public void setExclusive(int value) {
    FMODJNI.FMOD_STUDIO_MEMORY_USAGE_exclusive_set(swigCPtr, this, value);
  }

  public int getExclusive() {
    return FMODJNI.FMOD_STUDIO_MEMORY_USAGE_exclusive_get(swigCPtr, this);
  }

  public void setInclusive(int value) {
    FMODJNI.FMOD_STUDIO_MEMORY_USAGE_inclusive_set(swigCPtr, this, value);
  }

  public int getInclusive() {
    return FMODJNI.FMOD_STUDIO_MEMORY_USAGE_inclusive_get(swigCPtr, this);
  }

  public void setSampledata(int value) {
    FMODJNI.FMOD_STUDIO_MEMORY_USAGE_sampledata_set(swigCPtr, this, value);
  }

  public int getSampledata() {
    return FMODJNI.FMOD_STUDIO_MEMORY_USAGE_sampledata_get(swigCPtr, this);
  }

  public FMOD_STUDIO_MEMORY_USAGE() {
    this(FMODJNI.new_FMOD_STUDIO_MEMORY_USAGE(), true);
  }

}
