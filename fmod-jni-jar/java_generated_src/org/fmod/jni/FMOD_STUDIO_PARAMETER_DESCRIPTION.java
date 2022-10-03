/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public class FMOD_STUDIO_PARAMETER_DESCRIPTION {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FMOD_STUDIO_PARAMETER_DESCRIPTION(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FMOD_STUDIO_PARAMETER_DESCRIPTION obj) {
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
        FMODJNI.delete_FMOD_STUDIO_PARAMETER_DESCRIPTION(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(Object obj) {
  	if(obj == this) return true;
  	if(obj == null) return false;
  	if (! (obj instanceof FMOD_STUDIO_PARAMETER_DESCRIPTION)) return false;
    return this.swigCPtr == ((FMOD_STUDIO_PARAMETER_DESCRIPTION)obj).swigCPtr;
  }
  public int hashCode() {
     return (int)swigCPtr;
  }

  public void setName(String value) {
    FMODJNI.FMOD_STUDIO_PARAMETER_DESCRIPTION_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return FMODJNI.FMOD_STUDIO_PARAMETER_DESCRIPTION_name_get(swigCPtr, this);
  }

  public void setId(FMOD_STUDIO_PARAMETER_ID value) {
    FMODJNI.FMOD_STUDIO_PARAMETER_DESCRIPTION_id_set(swigCPtr, this, FMOD_STUDIO_PARAMETER_ID.getCPtr(value), value);
  }

  public FMOD_STUDIO_PARAMETER_ID getId() {
    long cPtr = FMODJNI.FMOD_STUDIO_PARAMETER_DESCRIPTION_id_get(swigCPtr, this);
    return (cPtr == 0) ? null : new FMOD_STUDIO_PARAMETER_ID(cPtr, false);
  }

  public void setMinimum(float value) {
    FMODJNI.FMOD_STUDIO_PARAMETER_DESCRIPTION_minimum_set(swigCPtr, this, value);
  }

  public float getMinimum() {
    return FMODJNI.FMOD_STUDIO_PARAMETER_DESCRIPTION_minimum_get(swigCPtr, this);
  }

  public void setMaximum(float value) {
    FMODJNI.FMOD_STUDIO_PARAMETER_DESCRIPTION_maximum_set(swigCPtr, this, value);
  }

  public float getMaximum() {
    return FMODJNI.FMOD_STUDIO_PARAMETER_DESCRIPTION_maximum_get(swigCPtr, this);
  }

  public void setDefaultvalue(float value) {
    FMODJNI.FMOD_STUDIO_PARAMETER_DESCRIPTION_defaultvalue_set(swigCPtr, this, value);
  }

  public float getDefaultvalue() {
    return FMODJNI.FMOD_STUDIO_PARAMETER_DESCRIPTION_defaultvalue_get(swigCPtr, this);
  }

  public void setType(FMOD_STUDIO_PARAMETER_TYPE value) {
    FMODJNI.FMOD_STUDIO_PARAMETER_DESCRIPTION_type_set(swigCPtr, this, value.swigValue());
  }

  public FMOD_STUDIO_PARAMETER_TYPE getType() {
    return FMOD_STUDIO_PARAMETER_TYPE.swigToEnum(FMODJNI.FMOD_STUDIO_PARAMETER_DESCRIPTION_type_get(swigCPtr, this));
  }

  public void setFlags(long value) {
    FMODJNI.FMOD_STUDIO_PARAMETER_DESCRIPTION_flags_set(swigCPtr, this, value);
  }

  public long getFlags() {
    return FMODJNI.FMOD_STUDIO_PARAMETER_DESCRIPTION_flags_get(swigCPtr, this);
  }

  public void setGuid(FMOD_GUID value) {
    FMODJNI.FMOD_STUDIO_PARAMETER_DESCRIPTION_guid_set(swigCPtr, this, FMOD_GUID.getCPtr(value), value);
  }

  public FMOD_GUID getGuid() {
    long cPtr = FMODJNI.FMOD_STUDIO_PARAMETER_DESCRIPTION_guid_get(swigCPtr, this);
    return (cPtr == 0) ? null : new FMOD_GUID(cPtr, false);
  }

  public FMOD_STUDIO_PARAMETER_DESCRIPTION() {
    this(FMODJNI.new_FMOD_STUDIO_PARAMETER_DESCRIPTION(), true);
  }

}
