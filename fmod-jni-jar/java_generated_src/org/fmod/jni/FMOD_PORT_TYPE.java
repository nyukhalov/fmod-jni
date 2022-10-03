/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public enum FMOD_PORT_TYPE {
  FMOD_PORT_TYPE_MUSIC,
  FMOD_PORT_TYPE_COPYRIGHT_MUSIC,
  FMOD_PORT_TYPE_VOICE,
  FMOD_PORT_TYPE_CONTROLLER,
  FMOD_PORT_TYPE_PERSONAL,
  FMOD_PORT_TYPE_VIBRATION,
  FMOD_PORT_TYPE_AUX,
  FMOD_PORT_TYPE_MAX,
  FMOD_PORT_TYPE_FORCEINT(FMODJNI.FMOD_PORT_TYPE_FORCEINT_get());

  public final int swigValue() {
    return swigValue;
  }

  public static FMOD_PORT_TYPE swigToEnum(int swigValue) {
    FMOD_PORT_TYPE[] swigValues = FMOD_PORT_TYPE.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (FMOD_PORT_TYPE swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + FMOD_PORT_TYPE.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private FMOD_PORT_TYPE() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private FMOD_PORT_TYPE(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private FMOD_PORT_TYPE(FMOD_PORT_TYPE swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

