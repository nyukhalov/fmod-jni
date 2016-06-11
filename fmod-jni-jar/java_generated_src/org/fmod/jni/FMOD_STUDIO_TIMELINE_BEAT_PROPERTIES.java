/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public class FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        FMODJNI.delete_FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(Object obj) {
  	if(obj == this) return true;
  	if(obj == null) return false;
  	if (! (obj instanceof FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES)) return false;
    return this.swigCPtr == ((FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES)obj).swigCPtr;
  }
  public int hashCode() {
     return (int)swigCPtr;
  }

  public void setBar(int value) {
    FMODJNI.FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES_bar_set(swigCPtr, this, value);
  }

  public int getBar() {
    return FMODJNI.FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES_bar_get(swigCPtr, this);
  }

  public void setBeat(int value) {
    FMODJNI.FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES_beat_set(swigCPtr, this, value);
  }

  public int getBeat() {
    return FMODJNI.FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES_beat_get(swigCPtr, this);
  }

  public void setPosition(int value) {
    FMODJNI.FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES_position_set(swigCPtr, this, value);
  }

  public int getPosition() {
    return FMODJNI.FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES_position_get(swigCPtr, this);
  }

  public void setTempo(float value) {
    FMODJNI.FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES_tempo_set(swigCPtr, this, value);
  }

  public float getTempo() {
    return FMODJNI.FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES_tempo_get(swigCPtr, this);
  }

  public void setTimeSignatureUpper(int value) {
    FMODJNI.FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES_timeSignatureUpper_set(swigCPtr, this, value);
  }

  public int getTimeSignatureUpper() {
    return FMODJNI.FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES_timeSignatureUpper_get(swigCPtr, this);
  }

  public void setTimeSignatureLower(int value) {
    FMODJNI.FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES_timeSignatureLower_set(swigCPtr, this, value);
  }

  public int getTimeSignatureLower() {
    return FMODJNI.FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES_timeSignatureLower_get(swigCPtr, this);
  }

  public FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES() {
    this(FMODJNI.new_FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES(), true);
  }

}
