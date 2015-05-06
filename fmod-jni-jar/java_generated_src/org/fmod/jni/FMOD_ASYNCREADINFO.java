/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public class FMOD_ASYNCREADINFO {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected FMOD_ASYNCREADINFO(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FMOD_ASYNCREADINFO obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        FMODJNI.delete_FMOD_ASYNCREADINFO(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setHandle(SWIGTYPE_p_void value) {
    FMODJNI.FMOD_ASYNCREADINFO_handle_set(swigCPtr, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getHandle() {
    long cPtr = FMODJNI.FMOD_ASYNCREADINFO_handle_get(swigCPtr);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setOffset(long value) {
    FMODJNI.FMOD_ASYNCREADINFO_offset_set(swigCPtr, value);
  }

  public long getOffset() {
    return FMODJNI.FMOD_ASYNCREADINFO_offset_get(swigCPtr);
  }

  public void setSizebytes(long value) {
    FMODJNI.FMOD_ASYNCREADINFO_sizebytes_set(swigCPtr, value);
  }

  public long getSizebytes() {
    return FMODJNI.FMOD_ASYNCREADINFO_sizebytes_get(swigCPtr);
  }

  public void setPriority(int value) {
    FMODJNI.FMOD_ASYNCREADINFO_priority_set(swigCPtr, value);
  }

  public int getPriority() {
    return FMODJNI.FMOD_ASYNCREADINFO_priority_get(swigCPtr);
  }

  public void setUserdata(SWIGTYPE_p_void value) {
    FMODJNI.FMOD_ASYNCREADINFO_userdata_set(swigCPtr, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getUserdata() {
    long cPtr = FMODJNI.FMOD_ASYNCREADINFO_userdata_get(swigCPtr);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setBuffer(SWIGTYPE_p_void value) {
    FMODJNI.FMOD_ASYNCREADINFO_buffer_set(swigCPtr, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getBuffer() {
    long cPtr = FMODJNI.FMOD_ASYNCREADINFO_buffer_get(swigCPtr);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setBytesread(long value) {
    FMODJNI.FMOD_ASYNCREADINFO_bytesread_set(swigCPtr, value);
  }

  public long getBytesread() {
    return FMODJNI.FMOD_ASYNCREADINFO_bytesread_get(swigCPtr);
  }

  public void setDone(SWIGTYPE_p_f_p_struct_FMOD_ASYNCREADINFO_enum_FMOD_RESULT__void value) {
    FMODJNI.FMOD_ASYNCREADINFO_done_set(swigCPtr, SWIGTYPE_p_f_p_struct_FMOD_ASYNCREADINFO_enum_FMOD_RESULT__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_struct_FMOD_ASYNCREADINFO_enum_FMOD_RESULT__void getDone() {
    long cPtr = FMODJNI.FMOD_ASYNCREADINFO_done_get(swigCPtr);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_struct_FMOD_ASYNCREADINFO_enum_FMOD_RESULT__void(cPtr, false);
  }

  public FMOD_ASYNCREADINFO() {
    this(FMODJNI.new_FMOD_ASYNCREADINFO(), true);
  }

}
