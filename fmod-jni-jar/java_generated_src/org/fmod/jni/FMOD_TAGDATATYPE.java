/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public enum FMOD_TAGDATATYPE {
  FMOD_TAGDATATYPE_BINARY,
  FMOD_TAGDATATYPE_INT,
  FMOD_TAGDATATYPE_FLOAT,
  FMOD_TAGDATATYPE_STRING,
  FMOD_TAGDATATYPE_STRING_UTF16,
  FMOD_TAGDATATYPE_STRING_UTF16BE,
  FMOD_TAGDATATYPE_STRING_UTF8,
  FMOD_TAGDATATYPE_MAX,
  FMOD_TAGDATATYPE_FORCEINT(FMODJNI.FMOD_TAGDATATYPE_FORCEINT_get());

  public final int swigValue() {
    return swigValue;
  }

  public static FMOD_TAGDATATYPE swigToEnum(int swigValue) {
    FMOD_TAGDATATYPE[] swigValues = FMOD_TAGDATATYPE.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (FMOD_TAGDATATYPE swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + FMOD_TAGDATATYPE.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private FMOD_TAGDATATYPE() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private FMOD_TAGDATATYPE(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private FMOD_TAGDATATYPE(FMOD_TAGDATATYPE swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

