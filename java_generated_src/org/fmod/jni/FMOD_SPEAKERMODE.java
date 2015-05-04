/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public final class FMOD_SPEAKERMODE {
  public final static FMOD_SPEAKERMODE FMOD_SPEAKERMODE_DEFAULT = new FMOD_SPEAKERMODE("FMOD_SPEAKERMODE_DEFAULT");
  public final static FMOD_SPEAKERMODE FMOD_SPEAKERMODE_RAW = new FMOD_SPEAKERMODE("FMOD_SPEAKERMODE_RAW");
  public final static FMOD_SPEAKERMODE FMOD_SPEAKERMODE_MONO = new FMOD_SPEAKERMODE("FMOD_SPEAKERMODE_MONO");
  public final static FMOD_SPEAKERMODE FMOD_SPEAKERMODE_STEREO = new FMOD_SPEAKERMODE("FMOD_SPEAKERMODE_STEREO");
  public final static FMOD_SPEAKERMODE FMOD_SPEAKERMODE_QUAD = new FMOD_SPEAKERMODE("FMOD_SPEAKERMODE_QUAD");
  public final static FMOD_SPEAKERMODE FMOD_SPEAKERMODE_SURROUND = new FMOD_SPEAKERMODE("FMOD_SPEAKERMODE_SURROUND");
  public final static FMOD_SPEAKERMODE FMOD_SPEAKERMODE_5POINT1 = new FMOD_SPEAKERMODE("FMOD_SPEAKERMODE_5POINT1");
  public final static FMOD_SPEAKERMODE FMOD_SPEAKERMODE_7POINT1 = new FMOD_SPEAKERMODE("FMOD_SPEAKERMODE_7POINT1");
  public final static FMOD_SPEAKERMODE FMOD_SPEAKERMODE_MAX = new FMOD_SPEAKERMODE("FMOD_SPEAKERMODE_MAX");
  public final static FMOD_SPEAKERMODE FMOD_SPEAKERMODE_FORCEINT = new FMOD_SPEAKERMODE("FMOD_SPEAKERMODE_FORCEINT", fmodJNI.FMOD_SPEAKERMODE_FORCEINT_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static FMOD_SPEAKERMODE swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + FMOD_SPEAKERMODE.class + " with value " + swigValue);
  }

  private FMOD_SPEAKERMODE(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private FMOD_SPEAKERMODE(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private FMOD_SPEAKERMODE(String swigName, FMOD_SPEAKERMODE swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static FMOD_SPEAKERMODE[] swigValues = { FMOD_SPEAKERMODE_DEFAULT, FMOD_SPEAKERMODE_RAW, FMOD_SPEAKERMODE_MONO, FMOD_SPEAKERMODE_STEREO, FMOD_SPEAKERMODE_QUAD, FMOD_SPEAKERMODE_SURROUND, FMOD_SPEAKERMODE_5POINT1, FMOD_SPEAKERMODE_7POINT1, FMOD_SPEAKERMODE_MAX, FMOD_SPEAKERMODE_FORCEINT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

