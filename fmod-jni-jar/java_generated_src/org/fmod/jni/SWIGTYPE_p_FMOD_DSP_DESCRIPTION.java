/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public class SWIGTYPE_p_FMOD_DSP_DESCRIPTION {
  private transient long swigCPtr;

  protected SWIGTYPE_p_FMOD_DSP_DESCRIPTION(long cPtr, @SuppressWarnings("unused") boolean futureUse) {
    swigCPtr = cPtr;
  }

  protected SWIGTYPE_p_FMOD_DSP_DESCRIPTION() {
    swigCPtr = 0;
  }

  protected static long getCPtr(SWIGTYPE_p_FMOD_DSP_DESCRIPTION obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public boolean equals(Object obj) {
  	if(obj == this) return true;
  	if(obj == null) return false;
  	if (! (obj instanceof SWIGTYPE_p_FMOD_DSP_DESCRIPTION)) return false;
    return this.swigCPtr == ((SWIGTYPE_p_FMOD_DSP_DESCRIPTION)obj).swigCPtr;
  }
  public int hashCode() {
     return (int)swigCPtr;
  }
}

