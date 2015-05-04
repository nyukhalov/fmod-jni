/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public final class FMOD_SPEAKER {
  public final static FMOD_SPEAKER FMOD_SPEAKER_FRONT_LEFT = new FMOD_SPEAKER("FMOD_SPEAKER_FRONT_LEFT");
  public final static FMOD_SPEAKER FMOD_SPEAKER_FRONT_RIGHT = new FMOD_SPEAKER("FMOD_SPEAKER_FRONT_RIGHT");
  public final static FMOD_SPEAKER FMOD_SPEAKER_FRONT_CENTER = new FMOD_SPEAKER("FMOD_SPEAKER_FRONT_CENTER");
  public final static FMOD_SPEAKER FMOD_SPEAKER_LOW_FREQUENCY = new FMOD_SPEAKER("FMOD_SPEAKER_LOW_FREQUENCY");
  public final static FMOD_SPEAKER FMOD_SPEAKER_SURROUND_LEFT = new FMOD_SPEAKER("FMOD_SPEAKER_SURROUND_LEFT");
  public final static FMOD_SPEAKER FMOD_SPEAKER_SURROUND_RIGHT = new FMOD_SPEAKER("FMOD_SPEAKER_SURROUND_RIGHT");
  public final static FMOD_SPEAKER FMOD_SPEAKER_BACK_LEFT = new FMOD_SPEAKER("FMOD_SPEAKER_BACK_LEFT");
  public final static FMOD_SPEAKER FMOD_SPEAKER_BACK_RIGHT = new FMOD_SPEAKER("FMOD_SPEAKER_BACK_RIGHT");
  public final static FMOD_SPEAKER FMOD_SPEAKER_MAX = new FMOD_SPEAKER("FMOD_SPEAKER_MAX");
  public final static FMOD_SPEAKER FMOD_SPEAKER_FORCEINT = new FMOD_SPEAKER("FMOD_SPEAKER_FORCEINT", fmodJNI.FMOD_SPEAKER_FORCEINT_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static FMOD_SPEAKER swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + FMOD_SPEAKER.class + " with value " + swigValue);
  }

  private FMOD_SPEAKER(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private FMOD_SPEAKER(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private FMOD_SPEAKER(String swigName, FMOD_SPEAKER swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static FMOD_SPEAKER[] swigValues = { FMOD_SPEAKER_FRONT_LEFT, FMOD_SPEAKER_FRONT_RIGHT, FMOD_SPEAKER_FRONT_CENTER, FMOD_SPEAKER_LOW_FREQUENCY, FMOD_SPEAKER_SURROUND_LEFT, FMOD_SPEAKER_SURROUND_RIGHT, FMOD_SPEAKER_BACK_LEFT, FMOD_SPEAKER_BACK_RIGHT, FMOD_SPEAKER_MAX, FMOD_SPEAKER_FORCEINT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

