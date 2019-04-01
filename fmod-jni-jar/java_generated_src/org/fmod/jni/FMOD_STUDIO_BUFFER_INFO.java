/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public class FMOD_STUDIO_BUFFER_INFO {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FMOD_STUDIO_BUFFER_INFO(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FMOD_STUDIO_BUFFER_INFO obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        FMODJNI.delete_FMOD_STUDIO_BUFFER_INFO(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(Object obj) {
  	if(obj == this) return true;
  	if(obj == null) return false;
  	if (! (obj instanceof FMOD_STUDIO_BUFFER_INFO)) return false;
    return this.swigCPtr == ((FMOD_STUDIO_BUFFER_INFO)obj).swigCPtr;
  }
  public int hashCode() {
     return (int)swigCPtr;
  }

  public void setCurrentusage(int value) {
    FMODJNI.FMOD_STUDIO_BUFFER_INFO_currentusage_set(swigCPtr, this, value);
  }

  public int getCurrentusage() {
    return FMODJNI.FMOD_STUDIO_BUFFER_INFO_currentusage_get(swigCPtr, this);
  }

  public void setPeakusage(int value) {
    FMODJNI.FMOD_STUDIO_BUFFER_INFO_peakusage_set(swigCPtr, this, value);
  }

  public int getPeakusage() {
    return FMODJNI.FMOD_STUDIO_BUFFER_INFO_peakusage_get(swigCPtr, this);
  }

  public void setCapacity(int value) {
    FMODJNI.FMOD_STUDIO_BUFFER_INFO_capacity_set(swigCPtr, this, value);
  }

  public int getCapacity() {
    return FMODJNI.FMOD_STUDIO_BUFFER_INFO_capacity_get(swigCPtr, this);
  }

  public void setStallcount(int value) {
    FMODJNI.FMOD_STUDIO_BUFFER_INFO_stallcount_set(swigCPtr, this, value);
  }

  public int getStallcount() {
    return FMODJNI.FMOD_STUDIO_BUFFER_INFO_stallcount_get(swigCPtr, this);
  }

  public void setStalltime(float value) {
    FMODJNI.FMOD_STUDIO_BUFFER_INFO_stalltime_set(swigCPtr, this, value);
  }

  public float getStalltime() {
    return FMODJNI.FMOD_STUDIO_BUFFER_INFO_stalltime_get(swigCPtr, this);
  }

  public FMOD_STUDIO_BUFFER_INFO() {
    this(FMODJNI.new_FMOD_STUDIO_BUFFER_INFO(), true);
  }

}
