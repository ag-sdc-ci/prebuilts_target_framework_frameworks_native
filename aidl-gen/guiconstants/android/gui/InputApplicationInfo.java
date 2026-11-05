/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/frameworks/native/aidl-gen/guiconstants -I /home/shadichy/Documents/bliss/los-21/frameworks/native/libs/gui /home/shadichy/Documents/bliss/los-21/frameworks/native/libs/gui/android/gui/InputApplicationInfo.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.gui;
public class InputApplicationInfo implements android.os.Parcelable
{
  public android.os.IBinder token;
  public java.lang.String name;
  public long dispatchingTimeoutMillis = 0L;
  public static final android.os.Parcelable.Creator<InputApplicationInfo> CREATOR = new android.os.Parcelable.Creator<InputApplicationInfo>() {
    @Override
    public InputApplicationInfo createFromParcel(android.os.Parcel _aidl_source) {
      InputApplicationInfo _aidl_out = new InputApplicationInfo();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public InputApplicationInfo[] newArray(int _aidl_size) {
      return new InputApplicationInfo[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeStrongBinder(token);
    _aidl_parcel.writeString(name);
    _aidl_parcel.writeLong(dispatchingTimeoutMillis);
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
      name = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      dispatchingTimeoutMillis = _aidl_parcel.readLong();
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
