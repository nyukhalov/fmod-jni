/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public enum FMOD_DEBUG_MODE {
  FMOD_DEBUG_MODE_TTY,
  FMOD_DEBUG_MODE_FILE,
  FMOD_DEBUG_MODE_CALLBACK,
  FMOD_DEBUG_MODE_FORCEINT(FMODJNI.FMOD_DEBUG_MODE_FORCEINT_get());

  public final int swigValue() {
    return swigValue;
  }

  public static FMOD_DEBUG_MODE swigToEnum(int swigValue) {
    FMOD_DEBUG_MODE[] swigValues = FMOD_DEBUG_MODE.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (FMOD_DEBUG_MODE swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + FMOD_DEBUG_MODE.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private FMOD_DEBUG_MODE() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private FMOD_DEBUG_MODE(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private FMOD_DEBUG_MODE(FMOD_DEBUG_MODE swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

