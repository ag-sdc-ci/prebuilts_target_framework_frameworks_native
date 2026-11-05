/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/frameworks/native/aidl-gen/libbinder -I /home/shadichy/Documents/bliss/los-21/frameworks/native/libs/binder/aidl /home/shadichy/Documents/bliss/los-21/frameworks/native/libs/binder/aidl/android/os/ServiceDebugInfo.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.os;
/**
 * Debug information associated with a registered service
 * @hide
 */
public class ServiceDebugInfo implements android.os.Parcelable
{
  /** Service name (see IServiceManager.addService/checkService/getService) */
  public java.lang.String name;
  /** PID of service at the time of registration (may no longer be valid). */
  public int debugPid = 0;
  public static final android.os.Parcelable.Creator<ServiceDebugInfo> CREATOR = new android.os.Parcelable.Creator<ServiceDebugInfo>() {
    @Override
    public ServiceDebugInfo createFromParcel(android.os.Parcel _aidl_source) {
      ServiceDebugInfo _aidl_out = new ServiceDebugInfo();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public ServiceDebugInfo[] newArray(int _aidl_size) {
      return new ServiceDebugInfo[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeString(name);
    _aidl_parcel.writeInt(debugPid);
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
      name = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      debugPid = _aidl_parcel.readInt();
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
