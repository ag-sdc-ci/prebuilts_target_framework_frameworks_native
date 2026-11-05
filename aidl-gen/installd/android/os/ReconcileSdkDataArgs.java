/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/frameworks/native/aidl-gen/installd -I /home/shadichy/Documents/bliss/los-21/frameworks/native/cmds/installd/binder /home/shadichy/Documents/bliss/los-21/frameworks/native/cmds/installd/binder/android/os/ReconcileSdkDataArgs.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.os;
/** {@hide} */
public class ReconcileSdkDataArgs implements android.os.Parcelable
{
  public java.lang.String uuid;
  public java.lang.String packageName;
  public java.util.List<java.lang.String> subDirNames;
  public int userId = 0;
  public int appId = 0;
  public int previousAppId = 0;
  public java.lang.String seInfo;
  public int flags = 0;
  public static final android.os.Parcelable.Creator<ReconcileSdkDataArgs> CREATOR = new android.os.Parcelable.Creator<ReconcileSdkDataArgs>() {
    @Override
    public ReconcileSdkDataArgs createFromParcel(android.os.Parcel _aidl_source) {
      ReconcileSdkDataArgs _aidl_out = new ReconcileSdkDataArgs();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public ReconcileSdkDataArgs[] newArray(int _aidl_size) {
      return new ReconcileSdkDataArgs[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeString(uuid);
    _aidl_parcel.writeString(packageName);
    _aidl_parcel.writeStringList(subDirNames);
    _aidl_parcel.writeInt(userId);
    _aidl_parcel.writeInt(appId);
    _aidl_parcel.writeInt(previousAppId);
    _aidl_parcel.writeString(seInfo);
    _aidl_parcel.writeInt(flags);
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
      uuid = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      packageName = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      subDirNames = _aidl_parcel.createStringArrayList();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      userId = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      appId = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      previousAppId = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      seInfo = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      flags = _aidl_parcel.readInt();
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
