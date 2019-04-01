/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public enum FMOD_STUDIO_EVENT_PROPERTY {
  FMOD_STUDIO_EVENT_PROPERTY_CHANNELPRIORITY,
  FMOD_STUDIO_EVENT_PROPERTY_SCHEDULE_DELAY,
  FMOD_STUDIO_EVENT_PROPERTY_SCHEDULE_LOOKAHEAD,
  FMOD_STUDIO_EVENT_PROPERTY_MINIMUM_DISTANCE,
  FMOD_STUDIO_EVENT_PROPERTY_MAXIMUM_DISTANCE,
  FMOD_STUDIO_EVENT_PROPERTY_MAX,
  FMOD_STUDIO_EVENT_PROPERTY_FORCEINT(FMODJNI.FMOD_STUDIO_EVENT_PROPERTY_FORCEINT_get());

  public final int swigValue() {
    return swigValue;
  }

  public static FMOD_STUDIO_EVENT_PROPERTY swigToEnum(int swigValue) {
    FMOD_STUDIO_EVENT_PROPERTY[] swigValues = FMOD_STUDIO_EVENT_PROPERTY.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (FMOD_STUDIO_EVENT_PROPERTY swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + FMOD_STUDIO_EVENT_PROPERTY.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private FMOD_STUDIO_EVENT_PROPERTY() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private FMOD_STUDIO_EVENT_PROPERTY(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private FMOD_STUDIO_EVENT_PROPERTY(FMOD_STUDIO_EVENT_PROPERTY swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

