/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public class FMOD_ERRORCALLBACK_INFO {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FMOD_ERRORCALLBACK_INFO(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FMOD_ERRORCALLBACK_INFO obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        FMODJNI.delete_FMOD_ERRORCALLBACK_INFO(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(Object obj) {
  	if(obj == this) return true;
  	if(obj == null) return false;
  	if (! (obj instanceof FMOD_ERRORCALLBACK_INFO)) return false;
    return this.swigCPtr == ((FMOD_ERRORCALLBACK_INFO)obj).swigCPtr;
  }
  public int hashCode() {
     return (int)swigCPtr;
  }

  public void setResult(FMOD_RESULT value) {
    FMODJNI.FMOD_ERRORCALLBACK_INFO_result_set(swigCPtr, this, value.swigValue());
  }

  public FMOD_RESULT getResult() {
    return FMOD_RESULT.swigToEnum(FMODJNI.FMOD_ERRORCALLBACK_INFO_result_get(swigCPtr, this));
  }

  public void setInstancetype(FMOD_ERRORCALLBACK_INSTANCETYPE value) {
    FMODJNI.FMOD_ERRORCALLBACK_INFO_instancetype_set(swigCPtr, this, value.swigValue());
  }

  public FMOD_ERRORCALLBACK_INSTANCETYPE getInstancetype() {
    return FMOD_ERRORCALLBACK_INSTANCETYPE.swigToEnum(FMODJNI.FMOD_ERRORCALLBACK_INFO_instancetype_get(swigCPtr, this));
  }

  public void setInstance(SWIGTYPE_p_void value) {
    FMODJNI.FMOD_ERRORCALLBACK_INFO_instance_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getInstance() {
    long cPtr = FMODJNI.FMOD_ERRORCALLBACK_INFO_instance_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setFunctionname(String value) {
    FMODJNI.FMOD_ERRORCALLBACK_INFO_functionname_set(swigCPtr, this, value);
  }

  public String getFunctionname() {
    return FMODJNI.FMOD_ERRORCALLBACK_INFO_functionname_get(swigCPtr, this);
  }

  public void setFunctionparams(String value) {
    FMODJNI.FMOD_ERRORCALLBACK_INFO_functionparams_set(swigCPtr, this, value);
  }

  public String getFunctionparams() {
    return FMODJNI.FMOD_ERRORCALLBACK_INFO_functionparams_get(swigCPtr, this);
  }

  public FMOD_ERRORCALLBACK_INFO() {
    this(FMODJNI.new_FMOD_ERRORCALLBACK_INFO(), true);
  }

}
