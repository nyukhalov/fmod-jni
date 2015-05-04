/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public class FMOD_STUDIO_BANK_INFO {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected FMOD_STUDIO_BANK_INFO(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FMOD_STUDIO_BANK_INFO obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        fmodJNI.delete_FMOD_STUDIO_BANK_INFO(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSize(int value) {
    fmodJNI.FMOD_STUDIO_BANK_INFO_size_set(swigCPtr, this, value);
  }

  public int getSize() {
    return fmodJNI.FMOD_STUDIO_BANK_INFO_size_get(swigCPtr, this);
  }

  public void setUserData(SWIGTYPE_p_void value) {
    fmodJNI.FMOD_STUDIO_BANK_INFO_userData_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getUserData() {
    long cPtr = fmodJNI.FMOD_STUDIO_BANK_INFO_userData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setUserDataLength(int value) {
    fmodJNI.FMOD_STUDIO_BANK_INFO_userDataLength_set(swigCPtr, this, value);
  }

  public int getUserDataLength() {
    return fmodJNI.FMOD_STUDIO_BANK_INFO_userDataLength_get(swigCPtr, this);
  }

  public void setOpenCallback(SWIGTYPE_p_f_p_q_const__char_p_unsigned_int_p_p_void_p_void__FMOD_RESULT value) {
    fmodJNI.FMOD_STUDIO_BANK_INFO_openCallback_set(swigCPtr, this, SWIGTYPE_p_f_p_q_const__char_p_unsigned_int_p_p_void_p_void__FMOD_RESULT.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_q_const__char_p_unsigned_int_p_p_void_p_void__FMOD_RESULT getOpenCallback() {
    long cPtr = fmodJNI.FMOD_STUDIO_BANK_INFO_openCallback_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_q_const__char_p_unsigned_int_p_p_void_p_void__FMOD_RESULT(cPtr, false);
  }

  public void setCloseCallback(SWIGTYPE_p_f_p_void_p_void__FMOD_RESULT value) {
    fmodJNI.FMOD_STUDIO_BANK_INFO_closeCallback_set(swigCPtr, this, SWIGTYPE_p_f_p_void_p_void__FMOD_RESULT.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void_p_void__FMOD_RESULT getCloseCallback() {
    long cPtr = fmodJNI.FMOD_STUDIO_BANK_INFO_closeCallback_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void_p_void__FMOD_RESULT(cPtr, false);
  }

  public void setReadCallback(SWIGTYPE_p_f_p_void_p_void_unsigned_int_p_unsigned_int_p_void__FMOD_RESULT value) {
    fmodJNI.FMOD_STUDIO_BANK_INFO_readCallback_set(swigCPtr, this, SWIGTYPE_p_f_p_void_p_void_unsigned_int_p_unsigned_int_p_void__FMOD_RESULT.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void_p_void_unsigned_int_p_unsigned_int_p_void__FMOD_RESULT getReadCallback() {
    long cPtr = fmodJNI.FMOD_STUDIO_BANK_INFO_readCallback_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void_p_void_unsigned_int_p_unsigned_int_p_void__FMOD_RESULT(cPtr, false);
  }

  public void setSeekCallback(SWIGTYPE_p_f_p_void_unsigned_int_p_void__FMOD_RESULT value) {
    fmodJNI.FMOD_STUDIO_BANK_INFO_seekCallback_set(swigCPtr, this, SWIGTYPE_p_f_p_void_unsigned_int_p_void__FMOD_RESULT.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void_unsigned_int_p_void__FMOD_RESULT getSeekCallback() {
    long cPtr = fmodJNI.FMOD_STUDIO_BANK_INFO_seekCallback_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void_unsigned_int_p_void__FMOD_RESULT(cPtr, false);
  }

  public FMOD_STUDIO_BANK_INFO() {
    this(fmodJNI.new_FMOD_STUDIO_BANK_INFO(), true);
  }

}
