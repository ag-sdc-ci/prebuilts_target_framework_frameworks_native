/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/frameworks/native/aidl-gen/installd -I /home/shadichy/Documents/bliss/los-21/frameworks/native/cmds/installd/binder /home/shadichy/Documents/bliss/los-21/frameworks/native/cmds/installd/binder/android/os/storage/CrateMetadata.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.os.storage;
/** {@hide} */
public class CrateMetadata implements android.os.Parcelable
{
  /**
   * To tell which uid the crate belong to.
   * <p>Because installd query all of crates in specified userId, the install may return the list
   * whose elements have the same crate id but different uid and package name.
   * It needs to tell the caller the difference between these elements.
   */
  public int uid = 0;
  /**
   * To tell which the package the crate belong to.
   * <p>Because installd query all of crates in specified uid, the install may return the list
   * whose elements have the same uid and crate id but different package name.
   * It needs to tell the caller the difference between these elements.
   */
  public java.lang.String packageName;
  /**
   * To tell the crate id that is the child directory/folder name in crates
   * root.
   */
  public java.lang.String id;
  public static final android.os.Parcelable.Creator<CrateMetadata> CREATOR = new android.os.Parcelable.Creator<CrateMetadata>() {
    @Override
    public CrateMetadata createFromParcel(android.os.Parcel _aidl_source) {
      CrateMetadata _aidl_out = new CrateMetadata();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public CrateMetadata[] newArray(int _aidl_size) {
      return new CrateMetadata[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(uid);
    _aidl_parcel.writeString(packageName);
    _aidl_parcel.writeString(id);
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
      uid = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      packageName = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      id = _aidl_parcel.readString();
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
