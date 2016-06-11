/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public class FMOD_PLUGINLIST {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FMOD_PLUGINLIST(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FMOD_PLUGINLIST obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        FMODJNI.delete_FMOD_PLUGINLIST(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(Object obj) {
  	if(obj == this) return true;
  	if(obj == null) return false;
  	if (! (obj instanceof FMOD_PLUGINLIST)) return false;
    return this.swigCPtr == ((FMOD_PLUGINLIST)obj).swigCPtr;
  }
  public int hashCode() {
     return (int)swigCPtr;
  }

  public void setType(FMOD_PLUGINTYPE value) {
    FMODJNI.FMOD_PLUGINLIST_type_set(swigCPtr, this, value.swigValue());
  }

  public FMOD_PLUGINTYPE getType() {
    return FMOD_PLUGINTYPE.swigToEnum(FMODJNI.FMOD_PLUGINLIST_type_get(swigCPtr, this));
  }

  public void setDescription(SWIGTYPE_p_void value) {
    FMODJNI.FMOD_PLUGINLIST_description_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getDescription() {
    long cPtr = FMODJNI.FMOD_PLUGINLIST_description_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public FMOD_PLUGINLIST() {
    this(FMODJNI.new_FMOD_PLUGINLIST(), true);
  }

}
