/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public class FMOD_CREATESOUNDEXINFO {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FMOD_CREATESOUNDEXINFO(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FMOD_CREATESOUNDEXINFO obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        FMODJNI.delete_FMOD_CREATESOUNDEXINFO(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(Object obj) {
  	if(obj == this) return true;
  	if(obj == null) return false;
  	if (! (obj instanceof FMOD_CREATESOUNDEXINFO)) return false;
    return this.swigCPtr == ((FMOD_CREATESOUNDEXINFO)obj).swigCPtr;
  }
  public int hashCode() {
     return (int)swigCPtr;
  }

  public void setCbsize(int value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_cbsize_set(swigCPtr, this, value);
  }

  public int getCbsize() {
    return FMODJNI.FMOD_CREATESOUNDEXINFO_cbsize_get(swigCPtr, this);
  }

  public void setLength(long value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_length_set(swigCPtr, this, value);
  }

  public long getLength() {
    return FMODJNI.FMOD_CREATESOUNDEXINFO_length_get(swigCPtr, this);
  }

  public void setFileoffset(long value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_fileoffset_set(swigCPtr, this, value);
  }

  public long getFileoffset() {
    return FMODJNI.FMOD_CREATESOUNDEXINFO_fileoffset_get(swigCPtr, this);
  }

  public void setNumchannels(int value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_numchannels_set(swigCPtr, this, value);
  }

  public int getNumchannels() {
    return FMODJNI.FMOD_CREATESOUNDEXINFO_numchannels_get(swigCPtr, this);
  }

  public void setDefaultfrequency(int value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_defaultfrequency_set(swigCPtr, this, value);
  }

  public int getDefaultfrequency() {
    return FMODJNI.FMOD_CREATESOUNDEXINFO_defaultfrequency_get(swigCPtr, this);
  }

  public void setFormat(FMOD_SOUND_FORMAT value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_format_set(swigCPtr, this, value.swigValue());
  }

  public FMOD_SOUND_FORMAT getFormat() {
    return FMOD_SOUND_FORMAT.swigToEnum(FMODJNI.FMOD_CREATESOUNDEXINFO_format_get(swigCPtr, this));
  }

  public void setDecodebuffersize(long value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_decodebuffersize_set(swigCPtr, this, value);
  }

  public long getDecodebuffersize() {
    return FMODJNI.FMOD_CREATESOUNDEXINFO_decodebuffersize_get(swigCPtr, this);
  }

  public void setInitialsubsound(int value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_initialsubsound_set(swigCPtr, this, value);
  }

  public int getInitialsubsound() {
    return FMODJNI.FMOD_CREATESOUNDEXINFO_initialsubsound_get(swigCPtr, this);
  }

  public void setNumsubsounds(int value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_numsubsounds_set(swigCPtr, this, value);
  }

  public int getNumsubsounds() {
    return FMODJNI.FMOD_CREATESOUNDEXINFO_numsubsounds_get(swigCPtr, this);
  }

  public void setInclusionlistnum(int value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_inclusionlistnum_set(swigCPtr, this, value);
  }

  public int getInclusionlistnum() {
    return FMODJNI.FMOD_CREATESOUNDEXINFO_inclusionlistnum_get(swigCPtr, this);
  }

  public void setPcmreadcallback(SWIGTYPE_p_f_p_struct_FMOD_SOUND_p_void_unsigned_int__FMOD_RESULT value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_pcmreadcallback_set(swigCPtr, this, SWIGTYPE_p_f_p_struct_FMOD_SOUND_p_void_unsigned_int__FMOD_RESULT.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_struct_FMOD_SOUND_p_void_unsigned_int__FMOD_RESULT getPcmreadcallback() {
    long cPtr = FMODJNI.FMOD_CREATESOUNDEXINFO_pcmreadcallback_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_struct_FMOD_SOUND_p_void_unsigned_int__FMOD_RESULT(cPtr, false);
  }

  public void setPcmsetposcallback(SWIGTYPE_p_f_p_struct_FMOD_SOUND_int_unsigned_int_unsigned_int__FMOD_RESULT value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_pcmsetposcallback_set(swigCPtr, this, SWIGTYPE_p_f_p_struct_FMOD_SOUND_int_unsigned_int_unsigned_int__FMOD_RESULT.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_struct_FMOD_SOUND_int_unsigned_int_unsigned_int__FMOD_RESULT getPcmsetposcallback() {
    long cPtr = FMODJNI.FMOD_CREATESOUNDEXINFO_pcmsetposcallback_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_struct_FMOD_SOUND_int_unsigned_int_unsigned_int__FMOD_RESULT(cPtr, false);
  }

  public void setNonblockcallback(SWIGTYPE_p_f_p_struct_FMOD_SOUND_enum_FMOD_RESULT__FMOD_RESULT value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_nonblockcallback_set(swigCPtr, this, SWIGTYPE_p_f_p_struct_FMOD_SOUND_enum_FMOD_RESULT__FMOD_RESULT.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_struct_FMOD_SOUND_enum_FMOD_RESULT__FMOD_RESULT getNonblockcallback() {
    long cPtr = FMODJNI.FMOD_CREATESOUNDEXINFO_nonblockcallback_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_struct_FMOD_SOUND_enum_FMOD_RESULT__FMOD_RESULT(cPtr, false);
  }

  public void setDlsname(String value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_dlsname_set(swigCPtr, this, value);
  }

  public String getDlsname() {
    return FMODJNI.FMOD_CREATESOUNDEXINFO_dlsname_get(swigCPtr, this);
  }

  public void setEncryptionkey(String value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_encryptionkey_set(swigCPtr, this, value);
  }

  public String getEncryptionkey() {
    return FMODJNI.FMOD_CREATESOUNDEXINFO_encryptionkey_get(swigCPtr, this);
  }

  public void setMaxpolyphony(int value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_maxpolyphony_set(swigCPtr, this, value);
  }

  public int getMaxpolyphony() {
    return FMODJNI.FMOD_CREATESOUNDEXINFO_maxpolyphony_get(swigCPtr, this);
  }

  public void setUserdata(SWIGTYPE_p_void value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_userdata_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getUserdata() {
    long cPtr = FMODJNI.FMOD_CREATESOUNDEXINFO_userdata_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setSuggestedsoundtype(FMOD_SOUND_TYPE value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_suggestedsoundtype_set(swigCPtr, this, value.swigValue());
  }

  public FMOD_SOUND_TYPE getSuggestedsoundtype() {
    return FMOD_SOUND_TYPE.swigToEnum(FMODJNI.FMOD_CREATESOUNDEXINFO_suggestedsoundtype_get(swigCPtr, this));
  }

  public void setFileuseropen(SWIGTYPE_p_f_p_q_const__char_p_unsigned_int_p_p_void_p_void__FMOD_RESULT value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_fileuseropen_set(swigCPtr, this, SWIGTYPE_p_f_p_q_const__char_p_unsigned_int_p_p_void_p_void__FMOD_RESULT.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_q_const__char_p_unsigned_int_p_p_void_p_void__FMOD_RESULT getFileuseropen() {
    long cPtr = FMODJNI.FMOD_CREATESOUNDEXINFO_fileuseropen_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_q_const__char_p_unsigned_int_p_p_void_p_void__FMOD_RESULT(cPtr, false);
  }

  public void setFileuserclose(SWIGTYPE_p_f_p_void_p_void__FMOD_RESULT value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_fileuserclose_set(swigCPtr, this, SWIGTYPE_p_f_p_void_p_void__FMOD_RESULT.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void_p_void__FMOD_RESULT getFileuserclose() {
    long cPtr = FMODJNI.FMOD_CREATESOUNDEXINFO_fileuserclose_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void_p_void__FMOD_RESULT(cPtr, false);
  }

  public void setFileuserread(SWIGTYPE_p_f_p_void_p_void_unsigned_int_p_unsigned_int_p_void__FMOD_RESULT value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_fileuserread_set(swigCPtr, this, SWIGTYPE_p_f_p_void_p_void_unsigned_int_p_unsigned_int_p_void__FMOD_RESULT.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void_p_void_unsigned_int_p_unsigned_int_p_void__FMOD_RESULT getFileuserread() {
    long cPtr = FMODJNI.FMOD_CREATESOUNDEXINFO_fileuserread_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void_p_void_unsigned_int_p_unsigned_int_p_void__FMOD_RESULT(cPtr, false);
  }

  public void setFileuserseek(SWIGTYPE_p_f_p_void_unsigned_int_p_void__FMOD_RESULT value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_fileuserseek_set(swigCPtr, this, SWIGTYPE_p_f_p_void_unsigned_int_p_void__FMOD_RESULT.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void_unsigned_int_p_void__FMOD_RESULT getFileuserseek() {
    long cPtr = FMODJNI.FMOD_CREATESOUNDEXINFO_fileuserseek_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void_unsigned_int_p_void__FMOD_RESULT(cPtr, false);
  }

  public void setFileuserasyncread(SWIGTYPE_p_f_p_struct_FMOD_ASYNCREADINFO_p_void__FMOD_RESULT value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_fileuserasyncread_set(swigCPtr, this, SWIGTYPE_p_f_p_struct_FMOD_ASYNCREADINFO_p_void__FMOD_RESULT.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_struct_FMOD_ASYNCREADINFO_p_void__FMOD_RESULT getFileuserasyncread() {
    long cPtr = FMODJNI.FMOD_CREATESOUNDEXINFO_fileuserasyncread_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_struct_FMOD_ASYNCREADINFO_p_void__FMOD_RESULT(cPtr, false);
  }

  public void setFileuserasynccancel(SWIGTYPE_p_f_p_struct_FMOD_ASYNCREADINFO_p_void__FMOD_RESULT value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_fileuserasynccancel_set(swigCPtr, this, SWIGTYPE_p_f_p_struct_FMOD_ASYNCREADINFO_p_void__FMOD_RESULT.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_struct_FMOD_ASYNCREADINFO_p_void__FMOD_RESULT getFileuserasynccancel() {
    long cPtr = FMODJNI.FMOD_CREATESOUNDEXINFO_fileuserasynccancel_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_struct_FMOD_ASYNCREADINFO_p_void__FMOD_RESULT(cPtr, false);
  }

  public void setFileuserdata(SWIGTYPE_p_void value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_fileuserdata_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getFileuserdata() {
    long cPtr = FMODJNI.FMOD_CREATESOUNDEXINFO_fileuserdata_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setFilebuffersize(int value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_filebuffersize_set(swigCPtr, this, value);
  }

  public int getFilebuffersize() {
    return FMODJNI.FMOD_CREATESOUNDEXINFO_filebuffersize_get(swigCPtr, this);
  }

  public void setChannelorder(FMOD_CHANNELORDER value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_channelorder_set(swigCPtr, this, value.swigValue());
  }

  public FMOD_CHANNELORDER getChannelorder() {
    return FMOD_CHANNELORDER.swigToEnum(FMODJNI.FMOD_CREATESOUNDEXINFO_channelorder_get(swigCPtr, this));
  }

  public void setInitialsoundgroup(SWIGTYPE_p_FMOD_SOUNDGROUP value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_initialsoundgroup_set(swigCPtr, this, SWIGTYPE_p_FMOD_SOUNDGROUP.getCPtr(value));
  }

  public SWIGTYPE_p_FMOD_SOUNDGROUP getInitialsoundgroup() {
    long cPtr = FMODJNI.FMOD_CREATESOUNDEXINFO_initialsoundgroup_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_FMOD_SOUNDGROUP(cPtr, false);
  }

  public void setInitialseekposition(long value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_initialseekposition_set(swigCPtr, this, value);
  }

  public long getInitialseekposition() {
    return FMODJNI.FMOD_CREATESOUNDEXINFO_initialseekposition_get(swigCPtr, this);
  }

  public void setInitialseekpostype(long value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_initialseekpostype_set(swigCPtr, this, value);
  }

  public long getInitialseekpostype() {
    return FMODJNI.FMOD_CREATESOUNDEXINFO_initialseekpostype_get(swigCPtr, this);
  }

  public void setIgnoresetfilesystem(int value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_ignoresetfilesystem_set(swigCPtr, this, value);
  }

  public int getIgnoresetfilesystem() {
    return FMODJNI.FMOD_CREATESOUNDEXINFO_ignoresetfilesystem_get(swigCPtr, this);
  }

  public void setAudioqueuepolicy(long value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_audioqueuepolicy_set(swigCPtr, this, value);
  }

  public long getAudioqueuepolicy() {
    return FMODJNI.FMOD_CREATESOUNDEXINFO_audioqueuepolicy_get(swigCPtr, this);
  }

  public void setMinmidigranularity(long value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_minmidigranularity_set(swigCPtr, this, value);
  }

  public long getMinmidigranularity() {
    return FMODJNI.FMOD_CREATESOUNDEXINFO_minmidigranularity_get(swigCPtr, this);
  }

  public void setNonblockthreadid(int value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_nonblockthreadid_set(swigCPtr, this, value);
  }

  public int getNonblockthreadid() {
    return FMODJNI.FMOD_CREATESOUNDEXINFO_nonblockthreadid_get(swigCPtr, this);
  }

  public void setFsbguid(FMOD_GUID value) {
    FMODJNI.FMOD_CREATESOUNDEXINFO_fsbguid_set(swigCPtr, this, FMOD_GUID.getCPtr(value), value);
  }

  public FMOD_GUID getFsbguid() {
    long cPtr = FMODJNI.FMOD_CREATESOUNDEXINFO_fsbguid_get(swigCPtr, this);
    return (cPtr == 0) ? null : new FMOD_GUID(cPtr, false);
  }

  public FMOD_CREATESOUNDEXINFO() {
    this(FMODJNI.new_FMOD_CREATESOUNDEXINFO(), true);
  }

}
