/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public enum FMOD_STUDIO_USER_PROPERTY_TYPE {
  FMOD_STUDIO_USER_PROPERTY_TYPE_INTEGER,
  FMOD_STUDIO_USER_PROPERTY_TYPE_BOOLEAN,
  FMOD_STUDIO_USER_PROPERTY_TYPE_FLOAT,
  FMOD_STUDIO_USER_PROPERTY_TYPE_STRING,
  FMOD_STUDIO_USER_PROPERTY_TYPE_FORCEINT(FMODJNI.FMOD_STUDIO_USER_PROPERTY_TYPE_FORCEINT_get());

  public final int swigValue() {
    return swigValue;
  }

  public static FMOD_STUDIO_USER_PROPERTY_TYPE swigToEnum(int swigValue) {
    FMOD_STUDIO_USER_PROPERTY_TYPE[] swigValues = FMOD_STUDIO_USER_PROPERTY_TYPE.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (FMOD_STUDIO_USER_PROPERTY_TYPE swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + FMOD_STUDIO_USER_PROPERTY_TYPE.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private FMOD_STUDIO_USER_PROPERTY_TYPE() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private FMOD_STUDIO_USER_PROPERTY_TYPE(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private FMOD_STUDIO_USER_PROPERTY_TYPE(FMOD_STUDIO_USER_PROPERTY_TYPE swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

