/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public class SWIGTYPE_p_FMOD_STUDIO_SYSTEM {
  private transient long swigCPtr;

  protected SWIGTYPE_p_FMOD_STUDIO_SYSTEM(long cPtr, @SuppressWarnings("unused") boolean futureUse) {
    swigCPtr = cPtr;
  }

  protected SWIGTYPE_p_FMOD_STUDIO_SYSTEM() {
    swigCPtr = 0;
  }

  protected static long getCPtr(SWIGTYPE_p_FMOD_STUDIO_SYSTEM obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public boolean equals(Object obj) {
  	if(obj == this) return true;
  	if(obj == null) return false;
  	if (! (obj instanceof SWIGTYPE_p_FMOD_STUDIO_SYSTEM)) return false;
    return this.swigCPtr == ((SWIGTYPE_p_FMOD_STUDIO_SYSTEM)obj).swigCPtr;
  }
  public int hashCode() {
     return (int)swigCPtr;
  }
}

