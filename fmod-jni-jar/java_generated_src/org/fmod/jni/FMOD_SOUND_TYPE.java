/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public enum FMOD_SOUND_TYPE {
  FMOD_SOUND_TYPE_UNKNOWN,
  FMOD_SOUND_TYPE_AIFF,
  FMOD_SOUND_TYPE_ASF,
  FMOD_SOUND_TYPE_AT3,
  FMOD_SOUND_TYPE_DLS,
  FMOD_SOUND_TYPE_FLAC,
  FMOD_SOUND_TYPE_FSB,
  FMOD_SOUND_TYPE_GCADPCM,
  FMOD_SOUND_TYPE_IT,
  FMOD_SOUND_TYPE_MIDI,
  FMOD_SOUND_TYPE_MOD,
  FMOD_SOUND_TYPE_MPEG,
  FMOD_SOUND_TYPE_OGGVORBIS,
  FMOD_SOUND_TYPE_PLAYLIST,
  FMOD_SOUND_TYPE_RAW,
  FMOD_SOUND_TYPE_S3M,
  FMOD_SOUND_TYPE_USER,
  FMOD_SOUND_TYPE_WAV,
  FMOD_SOUND_TYPE_XM,
  FMOD_SOUND_TYPE_XMA,
  FMOD_SOUND_TYPE_VAG,
  FMOD_SOUND_TYPE_AUDIOQUEUE,
  FMOD_SOUND_TYPE_XWMA,
  FMOD_SOUND_TYPE_BCWAV,
  FMOD_SOUND_TYPE_AT9,
  FMOD_SOUND_TYPE_VORBIS,
  FMOD_SOUND_TYPE_MEDIA_FOUNDATION,
  FMOD_SOUND_TYPE_MEDIACODEC,
  FMOD_SOUND_TYPE_FADPCM,
  FMOD_SOUND_TYPE_MAX,
  FMOD_SOUND_TYPE_FORCEINT(FMODJNI.FMOD_SOUND_TYPE_FORCEINT_get());

  public final int swigValue() {
    return swigValue;
  }

  public static FMOD_SOUND_TYPE swigToEnum(int swigValue) {
    FMOD_SOUND_TYPE[] swigValues = FMOD_SOUND_TYPE.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (FMOD_SOUND_TYPE swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + FMOD_SOUND_TYPE.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private FMOD_SOUND_TYPE() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private FMOD_SOUND_TYPE(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private FMOD_SOUND_TYPE(FMOD_SOUND_TYPE swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

