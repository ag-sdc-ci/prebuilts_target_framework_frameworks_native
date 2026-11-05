/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/frameworks/native/aidl-gen/installd -I /home/shadichy/Documents/bliss/los-21/frameworks/native/cmds/installd/binder /home/shadichy/Documents/bliss/los-21/frameworks/native/cmds/installd/binder/android/os/CreateAppDataResult.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.os;
/** {@hide} */
public class CreateAppDataResult implements android.os.Parcelable
{
  public long ceDataInode = 0L;
  public long deDataInode = 0L;
  public int exceptionCode = 0;
  public java.lang.String exceptionMessage;
  public static final android.os.Parcelable.Creator<CreateAppDataResult> CREATOR = new android.os.Parcelable.Creator<CreateAppDataResult>() {
    @Override
    public CreateAppDataResult createFromParcel(android.os.Parcel _aidl_source) {
      CreateAppDataResult _aidl_out = new CreateAppDataResult();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public CreateAppDataResult[] newArray(int _aidl_size) {
      return new CreateAppDataResult[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeLong(ceDataInode);
    _aidl_parcel.writeLong(deDataInode);
    _aidl_parcel.writeInt(exceptionCode);
    _aidl_parcel.writeString(exceptionMessage);
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
      ceDataInode = _aidl_parcel.readLong();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      deDataInode = _aidl_parcel.readLong();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      exceptionCode = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      exceptionMessage = _aidl_parcel.readString();
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
