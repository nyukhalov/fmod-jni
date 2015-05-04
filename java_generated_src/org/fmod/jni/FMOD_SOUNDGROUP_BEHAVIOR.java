/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public final class FMOD_SOUNDGROUP_BEHAVIOR {
  public final static FMOD_SOUNDGROUP_BEHAVIOR FMOD_SOUNDGROUP_BEHAVIOR_FAIL = new FMOD_SOUNDGROUP_BEHAVIOR("FMOD_SOUNDGROUP_BEHAVIOR_FAIL");
  public final static FMOD_SOUNDGROUP_BEHAVIOR FMOD_SOUNDGROUP_BEHAVIOR_MUTE = new FMOD_SOUNDGROUP_BEHAVIOR("FMOD_SOUNDGROUP_BEHAVIOR_MUTE");
  public final static FMOD_SOUNDGROUP_BEHAVIOR FMOD_SOUNDGROUP_BEHAVIOR_STEALLOWEST = new FMOD_SOUNDGROUP_BEHAVIOR("FMOD_SOUNDGROUP_BEHAVIOR_STEALLOWEST");
  public final static FMOD_SOUNDGROUP_BEHAVIOR FMOD_SOUNDGROUP_BEHAVIOR_MAX = new FMOD_SOUNDGROUP_BEHAVIOR("FMOD_SOUNDGROUP_BEHAVIOR_MAX");
  public final static FMOD_SOUNDGROUP_BEHAVIOR FMOD_SOUNDGROUP_BEHAVIOR_FORCEINT = new FMOD_SOUNDGROUP_BEHAVIOR("FMOD_SOUNDGROUP_BEHAVIOR_FORCEINT", fmodJNI.FMOD_SOUNDGROUP_BEHAVIOR_FORCEINT_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static FMOD_SOUNDGROUP_BEHAVIOR swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + FMOD_SOUNDGROUP_BEHAVIOR.class + " with value " + swigValue);
  }

  private FMOD_SOUNDGROUP_BEHAVIOR(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private FMOD_SOUNDGROUP_BEHAVIOR(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private FMOD_SOUNDGROUP_BEHAVIOR(String swigName, FMOD_SOUNDGROUP_BEHAVIOR swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static FMOD_SOUNDGROUP_BEHAVIOR[] swigValues = { FMOD_SOUNDGROUP_BEHAVIOR_FAIL, FMOD_SOUNDGROUP_BEHAVIOR_MUTE, FMOD_SOUNDGROUP_BEHAVIOR_STEALLOWEST, FMOD_SOUNDGROUP_BEHAVIOR_MAX, FMOD_SOUNDGROUP_BEHAVIOR_FORCEINT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

