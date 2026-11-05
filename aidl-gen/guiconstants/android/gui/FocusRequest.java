/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/frameworks/native/aidl-gen/guiconstants -I /home/shadichy/Documents/bliss/los-21/frameworks/native/libs/gui /home/shadichy/Documents/bliss/los-21/frameworks/native/libs/gui/android/gui/FocusRequest.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.gui;
/** @hide */
public class FocusRequest implements android.os.Parcelable
{
  /** Input channel token used to identify the window that should gain focus. */
  public android.os.IBinder token;
  public java.lang.String windowName;
  /**
   * SYSTEM_TIME_MONOTONIC timestamp in nanos set by the client (wm) when requesting the focus
   * change. This determines which request gets precedence if there is a focus change request
   * from another source such as pointer down.
   */
  public long timestamp = 0L;
  /** Display id associated with this request. */
  public int displayId = 0;
  public static final android.os.Parcelable.Creator<FocusRequest> CREATOR = new android.os.Parcelable.Creator<FocusRequest>() {
    @Override
    public FocusRequest createFromParcel(android.os.Parcel _aidl_source) {
      FocusRequest _aidl_out = new FocusRequest();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public FocusRequest[] newArray(int _aidl_size) {
      return new FocusRequest[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeStrongBinder(token);
    _aidl_parcel.writeString(windowName);
    _aidl_parcel.writeLong(timestamp);
    _aidl_parcel.writeInt(displayId);
    int _aidl_end_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.setDataPosition(_aidl_start_pos);
    _aidl_parcel.writeInt(_aidl_end_pos - _aidl_start_pos);
    _aidl_parcel.setDataPosition(_aidl_end_pos);
  }
  public final void readFromParcel(android.os.Parcel _aidl_parcel)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    int _aidl_parcelable_size = _aidl_parcel.readInt();
    try {
      if (_aidl_parcelable_size < 4) throw new android.os.BadParcelableException("Parcelable too small");;
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      token = _aidl_parcel.readStrongBinder();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      windowName = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      timestamp = _aidl_parcel.readLong();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      displayId = _aidl_parcel.readInt();
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
