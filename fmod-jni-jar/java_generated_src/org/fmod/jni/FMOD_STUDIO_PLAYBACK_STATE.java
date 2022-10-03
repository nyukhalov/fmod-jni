/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public enum FMOD_STUDIO_PLAYBACK_STATE {
  FMOD_STUDIO_PLAYBACK_PLAYING,
  FMOD_STUDIO_PLAYBACK_SUSTAINING,
  FMOD_STUDIO_PLAYBACK_STOPPED,
  FMOD_STUDIO_PLAYBACK_STARTING,
  FMOD_STUDIO_PLAYBACK_STOPPING,
  FMOD_STUDIO_PLAYBACK_FORCEINT(FMODJNI.FMOD_STUDIO_PLAYBACK_FORCEINT_get());

  public final int swigValue() {
    return swigValue;
  }

  public static FMOD_STUDIO_PLAYBACK_STATE swigToEnum(int swigValue) {
    FMOD_STUDIO_PLAYBACK_STATE[] swigValues = FMOD_STUDIO_PLAYBACK_STATE.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (FMOD_STUDIO_PLAYBACK_STATE swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + FMOD_STUDIO_PLAYBACK_STATE.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private FMOD_STUDIO_PLAYBACK_STATE() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private FMOD_STUDIO_PLAYBACK_STATE(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private FMOD_STUDIO_PLAYBACK_STATE(FMOD_STUDIO_PLAYBACK_STATE swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

