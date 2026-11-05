/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/frameworks/native/aidl-gen/installd -I /home/shadichy/Documents/bliss/los-21/frameworks/native/cmds/installd/binder /home/shadichy/Documents/bliss/los-21/frameworks/native/cmds/installd/binder/android/os/IInstalld.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.os;
/** {@hide} */
public interface IInstalld extends android.os.IInterface
{
  /** Default implementation for IInstalld. */
  public static class Default implements android.os.IInstalld
  {
    @Override public void createUserData(java.lang.String uuid, int userId, int userSerial, int flags) throws android.os.RemoteException
    {
    }
    @Override public void destroyUserData(java.lang.String uuid, int userId, int flags) throws android.os.RemoteException
    {
    }
    @Override public void setFirstBoot() throws android.os.RemoteException
    {
    }
    @Override public android.os.CreateAppDataResult createAppData(android.os.CreateAppDataArgs args) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.os.CreateAppDataResult[] createAppDataBatched(android.os.CreateAppDataArgs[] args) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void reconcileSdkData(android.os.ReconcileSdkDataArgs args) throws android.os.RemoteException
    {
    }
    @Override public void restoreconAppData(java.lang.String uuid, java.lang.String packageName, int userId, int flags, int appId, java.lang.String seInfo) throws android.os.RemoteException
    {
    }
    @Override public void migrateAppData(java.lang.String uuid, java.lang.String packageName, int userId, int flags) throws android.os.RemoteException
    {
    }
    @Override public void clearAppData(java.lang.String uuid, java.lang.String packageName, int userId, int flags, long ceDataInode) throws android.os.RemoteException
    {
    }
    @Override public void destroyAppData(java.lang.String uuid, java.lang.String packageName, int userId, int flags, long ceDataInode) throws android.os.RemoteException
    {
    }
    @Override public void fixupAppData(java.lang.String uuid, int flags) throws android.os.RemoteException
    {
    }
    @Override public long[] getAppSize(java.lang.String uuid, java.lang.String[] packageNames, int userId, int flags, int appId, long[] ceDataInodes, java.lang.String[] codePaths) throws android.os.RemoteException
    {
      return null;
    }
    @Override public long[] getUserSize(java.lang.String uuid, int userId, int flags, int[] appIds) throws android.os.RemoteException
    {
      return null;
    }
    @Override public long[] getExternalSize(java.lang.String uuid, int userId, int flags, int[] appIds) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.os.storage.CrateMetadata[] getAppCrates(java.lang.String uuid, java.lang.String[] packageNames, int userId) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.os.storage.CrateMetadata[] getUserCrates(java.lang.String uuid, int userId) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void setAppQuota(java.lang.String uuid, int userId, int appId, long cacheQuota) throws android.os.RemoteException
    {
    }
    @Override public void moveCompleteApp(java.lang.String fromUuid, java.lang.String toUuid, java.lang.String packageName, int appId, java.lang.String seInfo, int targetSdkVersion, java.lang.String fromCodePath) throws android.os.RemoteException
    {
    }
    // Returns false if it is cancelled. Returns true if it is completed or have other errors.
    @Override public boolean dexopt(java.lang.String apkPath, int uid, java.lang.String packageName, java.lang.String instructionSet, int dexoptNeeded, java.lang.String outputPath, int dexFlags, java.lang.String compilerFilter, java.lang.String uuid, java.lang.String sharedLibraries, java.lang.String seInfo, boolean downgrade, int targetSdkVersion, java.lang.String profileName, java.lang.String dexMetadataPath, java.lang.String compilationReason) throws android.os.RemoteException
    {
      return false;
    }
    // Blocks (when block is true) or unblock (when block is false) dexopt.
    // Blocking also invloves cancelling the currently running dexopt.
    @Override public void controlDexOptBlocking(boolean block) throws android.os.RemoteException
    {
    }
    @Override public void rmdex(java.lang.String codePath, java.lang.String instructionSet) throws android.os.RemoteException
    {
    }
    @Override public int mergeProfiles(int uid, java.lang.String packageName, java.lang.String profileName) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public boolean dumpProfiles(int uid, java.lang.String packageName, java.lang.String profileName, java.lang.String codePath, boolean dumpClassesAndMethods) throws android.os.RemoteException
    {
      return false;
    }
    @Override public boolean copySystemProfile(java.lang.String systemProfile, int uid, java.lang.String packageName, java.lang.String profileName) throws android.os.RemoteException
    {
      return false;
    }
    @Override public void clearAppProfiles(java.lang.String packageName, java.lang.String profileName) throws android.os.RemoteException
    {
    }
    @Override public void destroyAppProfiles(java.lang.String packageName) throws android.os.RemoteException
    {
    }
    @Override public void deleteReferenceProfile(java.lang.String packageName, java.lang.String profileName) throws android.os.RemoteException
    {
    }
    @Override public boolean createProfileSnapshot(int appId, java.lang.String packageName, java.lang.String profileName, java.lang.String classpath) throws android.os.RemoteException
    {
      return false;
    }
    @Override public void destroyProfileSnapshot(java.lang.String packageName, java.lang.String profileName) throws android.os.RemoteException
    {
    }
    @Override public void rmPackageDir(java.lang.String packageName, java.lang.String packageDir) throws android.os.RemoteException
    {
    }
    @Override public void freeCache(java.lang.String uuid, long targetFreeBytes, int flags) throws android.os.RemoteException
    {
    }
    @Override public void linkNativeLibraryDirectory(java.lang.String uuid, java.lang.String packageName, java.lang.String nativeLibPath32, int userId) throws android.os.RemoteException
    {
    }
    @Override public void createOatDir(java.lang.String packageName, java.lang.String oatDir, java.lang.String instructionSet) throws android.os.RemoteException
    {
    }
    @Override public void linkFile(java.lang.String packageName, java.lang.String relativePath, java.lang.String fromBase, java.lang.String toBase) throws android.os.RemoteException
    {
    }
    @Override public void moveAb(java.lang.String packageName, java.lang.String apkPath, java.lang.String instructionSet, java.lang.String outputPath) throws android.os.RemoteException
    {
    }
    @Override public long deleteOdex(java.lang.String packageName, java.lang.String apkPath, java.lang.String instructionSet, java.lang.String outputPath) throws android.os.RemoteException
    {
      return 0L;
    }
    @Override public boolean reconcileSecondaryDexFile(java.lang.String dexPath, java.lang.String pkgName, int uid, java.lang.String[] isas, java.lang.String volume_uuid, int storage_flag) throws android.os.RemoteException
    {
      return false;
    }
    @Override public byte[] hashSecondaryDexFile(java.lang.String dexPath, java.lang.String pkgName, int uid, java.lang.String volumeUuid, int storageFlag) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void invalidateMounts() throws android.os.RemoteException
    {
    }
    @Override public boolean isQuotaSupported(java.lang.String uuid) throws android.os.RemoteException
    {
      return false;
    }
    @Override public boolean prepareAppProfile(java.lang.String packageName, int userId, int appId, java.lang.String profileName, java.lang.String codePath, java.lang.String dexMetadata) throws android.os.RemoteException
    {
      return false;
    }
    @Override public long snapshotAppData(java.lang.String uuid, java.lang.String packageName, int userId, int snapshotId, int storageFlags) throws android.os.RemoteException
    {
      return 0L;
    }
    @Override public void restoreAppDataSnapshot(java.lang.String uuid, java.lang.String packageName, int appId, java.lang.String seInfo, int user, int snapshotId, int storageflags) throws android.os.RemoteException
    {
    }
    @Override public void destroyAppDataSnapshot(java.lang.String uuid, java.lang.String packageName, int userId, long ceSnapshotInode, int snapshotId, int storageFlags) throws android.os.RemoteException
    {
    }
    @Override public void destroyCeSnapshotsNotSpecified(java.lang.String uuid, int userId, int[] retainSnapshotIds) throws android.os.RemoteException
    {
    }
    @Override public void tryMountDataMirror(java.lang.String volumeUuid) throws android.os.RemoteException
    {
    }
    @Override public void onPrivateVolumeRemoved(java.lang.String volumeUuid) throws android.os.RemoteException
    {
    }
    @Override public void migrateLegacyObbData() throws android.os.RemoteException
    {
    }
    @Override public void cleanupInvalidPackageDirs(java.lang.String uuid, int userId, int flags) throws android.os.RemoteException
    {
    }
    @Override public int getOdexVisibility(java.lang.String packageName, java.lang.String apkPath, java.lang.String instructionSet, java.lang.String outputPath) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public android.os.IInstalld.IFsveritySetupAuthToken createFsveritySetupAuthToken(android.os.ParcelFileDescriptor authFd, int uid) throws android.os.RemoteException
    {
      return null;
    }
    @Override public int enableFsverity(android.os.IInstalld.IFsveritySetupAuthToken authToken, java.lang.String filePath, java.lang.String packageName) throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.os.IInstalld
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.os.IInstalld interface,
     * generating a proxy if needed.
     */
    public static android.os.IInstalld asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.os.IInstalld))) {
        return ((android.os.IInstalld)iin);
      }
      return new android.os.IInstalld.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(DESCRIPTOR);
      }
      switch (code)
      {
        case TRANSACTION_createUserData:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          this.createUserData(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_destroyUserData:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          this.destroyUserData(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setFirstBoot:
        {
          this.setFirstBoot();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_createAppData:
        {
          android.os.CreateAppDataArgs _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.CreateAppDataArgs.CREATOR);
          android.os.CreateAppDataResult _result = this.createAppData(_arg0);
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_createAppDataBatched:
        {
          android.os.CreateAppDataArgs[] _arg0;
          _arg0 = data.createTypedArray(android.os.CreateAppDataArgs.CREATOR);
          android.os.CreateAppDataResult[] _result = this.createAppDataBatched(_arg0);
          reply.writeNoException();
          reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_reconcileSdkData:
        {
          android.os.ReconcileSdkDataArgs _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.ReconcileSdkDataArgs.CREATOR);
          this.reconcileSdkData(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_restoreconAppData:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          int _arg4;
          _arg4 = data.readInt();
          java.lang.String _arg5;
          _arg5 = data.readString();
          this.restoreconAppData(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_migrateAppData:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          this.migrateAppData(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_clearAppData:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          long _arg4;
          _arg4 = data.readLong();
          this.clearAppData(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_destroyAppData:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          long _arg4;
          _arg4 = data.readLong();
          this.destroyAppData(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_fixupAppData:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          this.fixupAppData(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_getAppSize:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String[] _arg1;
          _arg1 = data.createStringArray();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          int _arg4;
          _arg4 = data.readInt();
          long[] _arg5;
          _arg5 = data.createLongArray();
          java.lang.String[] _arg6;
          _arg6 = data.createStringArray();
          long[] _result = this.getAppSize(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
          reply.writeNoException();
          reply.writeLongArray(_result);
          break;
        }
        case TRANSACTION_getUserSize:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int[] _arg3;
          _arg3 = data.createIntArray();
          long[] _result = this.getUserSize(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeLongArray(_result);
          break;
        }
        case TRANSACTION_getExternalSize:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int[] _arg3;
          _arg3 = data.createIntArray();
          long[] _result = this.getExternalSize(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeLongArray(_result);
          break;
        }
        case TRANSACTION_getAppCrates:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String[] _arg1;
          _arg1 = data.createStringArray();
          int _arg2;
          _arg2 = data.readInt();
          android.os.storage.CrateMetadata[] _result = this.getAppCrates(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_getUserCrates:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          android.os.storage.CrateMetadata[] _result = this.getUserCrates(_arg0, _arg1);
          reply.writeNoException();
          reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_setAppQuota:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          long _arg3;
          _arg3 = data.readLong();
          this.setAppQuota(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_moveCompleteApp:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          int _arg3;
          _arg3 = data.readInt();
          java.lang.String _arg4;
          _arg4 = data.readString();
          int _arg5;
          _arg5 = data.readInt();
          java.lang.String _arg6;
          _arg6 = data.readString();
          this.moveCompleteApp(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_dexopt:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          java.lang.String _arg2;
          _arg2 = data.readString();
          java.lang.String _arg3;
          _arg3 = data.readString();
          int _arg4;
          _arg4 = data.readInt();
          java.lang.String _arg5;
          _arg5 = data.readString();
          int _arg6;
          _arg6 = data.readInt();
          java.lang.String _arg7;
          _arg7 = data.readString();
          java.lang.String _arg8;
          _arg8 = data.readString();
          java.lang.String _arg9;
          _arg9 = data.readString();
          java.lang.String _arg10;
          _arg10 = data.readString();
          boolean _arg11;
          _arg11 = (0!=data.readInt());
          int _arg12;
          _arg12 = data.readInt();
          java.lang.String _arg13;
          _arg13 = data.readString();
          java.lang.String _arg14;
          _arg14 = data.readString();
          java.lang.String _arg15;
          _arg15 = data.readString();
          boolean _result = this.dexopt(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8, _arg9, _arg10, _arg11, _arg12, _arg13, _arg14, _arg15);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_controlDexOptBlocking:
        {
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.controlDexOptBlocking(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_rmdex:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.rmdex(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_mergeProfiles:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          int _result = this.mergeProfiles(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_dumpProfiles:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          java.lang.String _arg3;
          _arg3 = data.readString();
          boolean _arg4;
          _arg4 = (0!=data.readInt());
          boolean _result = this.dumpProfiles(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_copySystemProfile:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          java.lang.String _arg2;
          _arg2 = data.readString();
          java.lang.String _arg3;
          _arg3 = data.readString();
          boolean _result = this.copySystemProfile(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_clearAppProfiles:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.clearAppProfiles(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_destroyAppProfiles:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.destroyAppProfiles(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_deleteReferenceProfile:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.deleteReferenceProfile(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_createProfileSnapshot:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          java.lang.String _arg3;
          _arg3 = data.readString();
          boolean _result = this.createProfileSnapshot(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_destroyProfileSnapshot:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.destroyProfileSnapshot(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_rmPackageDir:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.rmPackageDir(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_freeCache:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          long _arg1;
          _arg1 = data.readLong();
          int _arg2;
          _arg2 = data.readInt();
          this.freeCache(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_linkNativeLibraryDirectory:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          int _arg3;
          _arg3 = data.readInt();
          this.linkNativeLibraryDirectory(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_createOatDir:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          this.createOatDir(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_linkFile:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          java.lang.String _arg3;
          _arg3 = data.readString();
          this.linkFile(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_moveAb:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          java.lang.String _arg3;
          _arg3 = data.readString();
          this.moveAb(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_deleteOdex:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          java.lang.String _arg3;
          _arg3 = data.readString();
          long _result = this.deleteOdex(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeLong(_result);
          break;
        }
        case TRANSACTION_reconcileSecondaryDexFile:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          java.lang.String[] _arg3;
          _arg3 = data.createStringArray();
          java.lang.String _arg4;
          _arg4 = data.readString();
          int _arg5;
          _arg5 = data.readInt();
          boolean _result = this.reconcileSecondaryDexFile(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_hashSecondaryDexFile:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          java.lang.String _arg3;
          _arg3 = data.readString();
          int _arg4;
          _arg4 = data.readInt();
          byte[] _result = this.hashSecondaryDexFile(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_invalidateMounts:
        {
          this.invalidateMounts();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_isQuotaSupported:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          boolean _result = this.isQuotaSupported(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_prepareAppProfile:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          java.lang.String _arg3;
          _arg3 = data.readString();
          java.lang.String _arg4;
          _arg4 = data.readString();
          java.lang.String _arg5;
          _arg5 = data.readString();
          boolean _result = this.prepareAppProfile(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_snapshotAppData:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          int _arg4;
          _arg4 = data.readInt();
          long _result = this.snapshotAppData(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeLong(_result);
          break;
        }
        case TRANSACTION_restoreAppDataSnapshot:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          java.lang.String _arg3;
          _arg3 = data.readString();
          int _arg4;
          _arg4 = data.readInt();
          int _arg5;
          _arg5 = data.readInt();
          int _arg6;
          _arg6 = data.readInt();
          this.restoreAppDataSnapshot(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_destroyAppDataSnapshot:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          long _arg3;
          _arg3 = data.readLong();
          int _arg4;
          _arg4 = data.readInt();
          int _arg5;
          _arg5 = data.readInt();
          this.destroyAppDataSnapshot(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_destroyCeSnapshotsNotSpecified:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int[] _arg2;
          _arg2 = data.createIntArray();
          this.destroyCeSnapshotsNotSpecified(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_tryMountDataMirror:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.tryMountDataMirror(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onPrivateVolumeRemoved:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.onPrivateVolumeRemoved(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_migrateLegacyObbData:
        {
          this.migrateLegacyObbData();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_cleanupInvalidPackageDirs:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          this.cleanupInvalidPackageDirs(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_getOdexVisibility:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          java.lang.String _arg3;
          _arg3 = data.readString();
          int _result = this.getOdexVisibility(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_createFsveritySetupAuthToken:
        {
          android.os.ParcelFileDescriptor _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.ParcelFileDescriptor.CREATOR);
          int _arg1;
          _arg1 = data.readInt();
          android.os.IInstalld.IFsveritySetupAuthToken _result = this.createFsveritySetupAuthToken(_arg0, _arg1);
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_enableFsverity:
        {
          android.os.IInstalld.IFsveritySetupAuthToken _arg0;
          _arg0 = android.os.IInstalld.IFsveritySetupAuthToken.Stub.asInterface(data.readStrongBinder());
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          int _result = this.enableFsverity(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static final class Proxy implements android.os.IInstalld
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public final java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public void createUserData(java.lang.String uuid, int userId, int userSerial, int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uuid);
          _data.writeInt(userId);
          _data.writeInt(userSerial);
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_createUserData, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void destroyUserData(java.lang.String uuid, int userId, int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uuid);
          _data.writeInt(userId);
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_destroyUserData, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setFirstBoot() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setFirstBoot, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public android.os.CreateAppDataResult createAppData(android.os.CreateAppDataArgs args) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.os.CreateAppDataResult _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, args, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_createAppData, _data, _reply, 0);
          _reply.readException();
          _result = _Parcel.readTypedObject(_reply, android.os.CreateAppDataResult.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.os.CreateAppDataResult[] createAppDataBatched(android.os.CreateAppDataArgs[] args) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.os.CreateAppDataResult[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedArray(args, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_createAppDataBatched, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createTypedArray(android.os.CreateAppDataResult.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void reconcileSdkData(android.os.ReconcileSdkDataArgs args) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, args, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_reconcileSdkData, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void restoreconAppData(java.lang.String uuid, java.lang.String packageName, int userId, int flags, int appId, java.lang.String seInfo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uuid);
          _data.writeString(packageName);
          _data.writeInt(userId);
          _data.writeInt(flags);
          _data.writeInt(appId);
          _data.writeString(seInfo);
          boolean _status = mRemote.transact(Stub.TRANSACTION_restoreconAppData, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void migrateAppData(java.lang.String uuid, java.lang.String packageName, int userId, int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uuid);
          _data.writeString(packageName);
          _data.writeInt(userId);
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_migrateAppData, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void clearAppData(java.lang.String uuid, java.lang.String packageName, int userId, int flags, long ceDataInode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uuid);
          _data.writeString(packageName);
          _data.writeInt(userId);
          _data.writeInt(flags);
          _data.writeLong(ceDataInode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_clearAppData, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void destroyAppData(java.lang.String uuid, java.lang.String packageName, int userId, int flags, long ceDataInode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uuid);
          _data.writeString(packageName);
          _data.writeInt(userId);
          _data.writeInt(flags);
          _data.writeLong(ceDataInode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_destroyAppData, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void fixupAppData(java.lang.String uuid, int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uuid);
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_fixupAppData, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public long[] getAppSize(java.lang.String uuid, java.lang.String[] packageNames, int userId, int flags, int appId, long[] ceDataInodes, java.lang.String[] codePaths) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        long[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uuid);
          _data.writeStringArray(packageNames);
          _data.writeInt(userId);
          _data.writeInt(flags);
          _data.writeInt(appId);
          _data.writeLongArray(ceDataInodes);
          _data.writeStringArray(codePaths);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAppSize, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createLongArray();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public long[] getUserSize(java.lang.String uuid, int userId, int flags, int[] appIds) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        long[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uuid);
          _data.writeInt(userId);
          _data.writeInt(flags);
          _data.writeIntArray(appIds);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getUserSize, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createLongArray();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public long[] getExternalSize(java.lang.String uuid, int userId, int flags, int[] appIds) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        long[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uuid);
          _data.writeInt(userId);
          _data.writeInt(flags);
          _data.writeIntArray(appIds);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getExternalSize, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createLongArray();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.os.storage.CrateMetadata[] getAppCrates(java.lang.String uuid, java.lang.String[] packageNames, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.os.storage.CrateMetadata[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uuid);
          _data.writeStringArray(packageNames);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAppCrates, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createTypedArray(android.os.storage.CrateMetadata.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.os.storage.CrateMetadata[] getUserCrates(java.lang.String uuid, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.os.storage.CrateMetadata[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uuid);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getUserCrates, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createTypedArray(android.os.storage.CrateMetadata.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void setAppQuota(java.lang.String uuid, int userId, int appId, long cacheQuota) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uuid);
          _data.writeInt(userId);
          _data.writeInt(appId);
          _data.writeLong(cacheQuota);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setAppQuota, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void moveCompleteApp(java.lang.String fromUuid, java.lang.String toUuid, java.lang.String packageName, int appId, java.lang.String seInfo, int targetSdkVersion, java.lang.String fromCodePath) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(fromUuid);
          _data.writeString(toUuid);
          _data.writeString(packageName);
          _data.writeInt(appId);
          _data.writeString(seInfo);
          _data.writeInt(targetSdkVersion);
          _data.writeString(fromCodePath);
          boolean _status = mRemote.transact(Stub.TRANSACTION_moveCompleteApp, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      // Returns false if it is cancelled. Returns true if it is completed or have other errors.
      @Override public boolean dexopt(java.lang.String apkPath, int uid, java.lang.String packageName, java.lang.String instructionSet, int dexoptNeeded, java.lang.String outputPath, int dexFlags, java.lang.String compilerFilter, java.lang.String uuid, java.lang.String sharedLibraries, java.lang.String seInfo, boolean downgrade, int targetSdkVersion, java.lang.String profileName, java.lang.String dexMetadataPath, java.lang.String compilationReason) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(apkPath);
          _data.writeInt(uid);
          _data.writeString(packageName);
          _data.writeString(instructionSet);
          _data.writeInt(dexoptNeeded);
          _data.writeString(outputPath);
          _data.writeInt(dexFlags);
          _data.writeString(compilerFilter);
          _data.writeString(uuid);
          _data.writeString(sharedLibraries);
          _data.writeString(seInfo);
          _data.writeInt(((downgrade)?(1):(0)));
          _data.writeInt(targetSdkVersion);
          _data.writeString(profileName);
          _data.writeString(dexMetadataPath);
          _data.writeString(compilationReason);
          boolean _status = mRemote.transact(Stub.TRANSACTION_dexopt, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      // Blocks (when block is true) or unblock (when block is false) dexopt.
      // Blocking also invloves cancelling the currently running dexopt.
      @Override public void controlDexOptBlocking(boolean block) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((block)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_controlDexOptBlocking, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void rmdex(java.lang.String codePath, java.lang.String instructionSet) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(codePath);
          _data.writeString(instructionSet);
          boolean _status = mRemote.transact(Stub.TRANSACTION_rmdex, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public int mergeProfiles(int uid, java.lang.String packageName, java.lang.String profileName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(uid);
          _data.writeString(packageName);
          _data.writeString(profileName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_mergeProfiles, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public boolean dumpProfiles(int uid, java.lang.String packageName, java.lang.String profileName, java.lang.String codePath, boolean dumpClassesAndMethods) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(uid);
          _data.writeString(packageName);
          _data.writeString(profileName);
          _data.writeString(codePath);
          _data.writeInt(((dumpClassesAndMethods)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_dumpProfiles, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public boolean copySystemProfile(java.lang.String systemProfile, int uid, java.lang.String packageName, java.lang.String profileName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(systemProfile);
          _data.writeInt(uid);
          _data.writeString(packageName);
          _data.writeString(profileName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_copySystemProfile, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void clearAppProfiles(java.lang.String packageName, java.lang.String profileName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          _data.writeString(profileName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_clearAppProfiles, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void destroyAppProfiles(java.lang.String packageName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_destroyAppProfiles, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void deleteReferenceProfile(java.lang.String packageName, java.lang.String profileName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          _data.writeString(profileName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_deleteReferenceProfile, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public boolean createProfileSnapshot(int appId, java.lang.String packageName, java.lang.String profileName, java.lang.String classpath) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(appId);
          _data.writeString(packageName);
          _data.writeString(profileName);
          _data.writeString(classpath);
          boolean _status = mRemote.transact(Stub.TRANSACTION_createProfileSnapshot, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void destroyProfileSnapshot(java.lang.String packageName, java.lang.String profileName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          _data.writeString(profileName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_destroyProfileSnapshot, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void rmPackageDir(java.lang.String packageName, java.lang.String packageDir) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          _data.writeString(packageDir);
          boolean _status = mRemote.transact(Stub.TRANSACTION_rmPackageDir, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void freeCache(java.lang.String uuid, long targetFreeBytes, int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uuid);
          _data.writeLong(targetFreeBytes);
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_freeCache, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void linkNativeLibraryDirectory(java.lang.String uuid, java.lang.String packageName, java.lang.String nativeLibPath32, int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uuid);
          _data.writeString(packageName);
          _data.writeString(nativeLibPath32);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_linkNativeLibraryDirectory, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void createOatDir(java.lang.String packageName, java.lang.String oatDir, java.lang.String instructionSet) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          _data.writeString(oatDir);
          _data.writeString(instructionSet);
          boolean _status = mRemote.transact(Stub.TRANSACTION_createOatDir, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void linkFile(java.lang.String packageName, java.lang.String relativePath, java.lang.String fromBase, java.lang.String toBase) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          _data.writeString(relativePath);
          _data.writeString(fromBase);
          _data.writeString(toBase);
          boolean _status = mRemote.transact(Stub.TRANSACTION_linkFile, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void moveAb(java.lang.String packageName, java.lang.String apkPath, java.lang.String instructionSet, java.lang.String outputPath) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          _data.writeString(apkPath);
          _data.writeString(instructionSet);
          _data.writeString(outputPath);
          boolean _status = mRemote.transact(Stub.TRANSACTION_moveAb, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public long deleteOdex(java.lang.String packageName, java.lang.String apkPath, java.lang.String instructionSet, java.lang.String outputPath) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        long _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          _data.writeString(apkPath);
          _data.writeString(instructionSet);
          _data.writeString(outputPath);
          boolean _status = mRemote.transact(Stub.TRANSACTION_deleteOdex, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readLong();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public boolean reconcileSecondaryDexFile(java.lang.String dexPath, java.lang.String pkgName, int uid, java.lang.String[] isas, java.lang.String volume_uuid, int storage_flag) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(dexPath);
          _data.writeString(pkgName);
          _data.writeInt(uid);
          _data.writeStringArray(isas);
          _data.writeString(volume_uuid);
          _data.writeInt(storage_flag);
          boolean _status = mRemote.transact(Stub.TRANSACTION_reconcileSecondaryDexFile, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public byte[] hashSecondaryDexFile(java.lang.String dexPath, java.lang.String pkgName, int uid, java.lang.String volumeUuid, int storageFlag) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(dexPath);
          _data.writeString(pkgName);
          _data.writeInt(uid);
          _data.writeString(volumeUuid);
          _data.writeInt(storageFlag);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hashSecondaryDexFile, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createByteArray();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void invalidateMounts() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_invalidateMounts, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public boolean isQuotaSupported(java.lang.String uuid) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uuid);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isQuotaSupported, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public boolean prepareAppProfile(java.lang.String packageName, int userId, int appId, java.lang.String profileName, java.lang.String codePath, java.lang.String dexMetadata) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          _data.writeInt(userId);
          _data.writeInt(appId);
          _data.writeString(profileName);
          _data.writeString(codePath);
          _data.writeString(dexMetadata);
          boolean _status = mRemote.transact(Stub.TRANSACTION_prepareAppProfile, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public long snapshotAppData(java.lang.String uuid, java.lang.String packageName, int userId, int snapshotId, int storageFlags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        long _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uuid);
          _data.writeString(packageName);
          _data.writeInt(userId);
          _data.writeInt(snapshotId);
          _data.writeInt(storageFlags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_snapshotAppData, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readLong();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void restoreAppDataSnapshot(java.lang.String uuid, java.lang.String packageName, int appId, java.lang.String seInfo, int user, int snapshotId, int storageflags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uuid);
          _data.writeString(packageName);
          _data.writeInt(appId);
          _data.writeString(seInfo);
          _data.writeInt(user);
          _data.writeInt(snapshotId);
          _data.writeInt(storageflags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_restoreAppDataSnapshot, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void destroyAppDataSnapshot(java.lang.String uuid, java.lang.String packageName, int userId, long ceSnapshotInode, int snapshotId, int storageFlags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uuid);
          _data.writeString(packageName);
          _data.writeInt(userId);
          _data.writeLong(ceSnapshotInode);
          _data.writeInt(snapshotId);
          _data.writeInt(storageFlags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_destroyAppDataSnapshot, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void destroyCeSnapshotsNotSpecified(java.lang.String uuid, int userId, int[] retainSnapshotIds) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uuid);
          _data.writeInt(userId);
          _data.writeIntArray(retainSnapshotIds);
          boolean _status = mRemote.transact(Stub.TRANSACTION_destroyCeSnapshotsNotSpecified, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void tryMountDataMirror(java.lang.String volumeUuid) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(volumeUuid);
          boolean _status = mRemote.transact(Stub.TRANSACTION_tryMountDataMirror, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onPrivateVolumeRemoved(java.lang.String volumeUuid) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(volumeUuid);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onPrivateVolumeRemoved, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void migrateLegacyObbData() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_migrateLegacyObbData, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void cleanupInvalidPackageDirs(java.lang.String uuid, int userId, int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uuid);
          _data.writeInt(userId);
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_cleanupInvalidPackageDirs, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public int getOdexVisibility(java.lang.String packageName, java.lang.String apkPath, java.lang.String instructionSet, java.lang.String outputPath) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          _data.writeString(apkPath);
          _data.writeString(instructionSet);
          _data.writeString(outputPath);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getOdexVisibility, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.os.IInstalld.IFsveritySetupAuthToken createFsveritySetupAuthToken(android.os.ParcelFileDescriptor authFd, int uid) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.os.IInstalld.IFsveritySetupAuthToken _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, authFd, 0);
          _data.writeInt(uid);
          boolean _status = mRemote.transact(Stub.TRANSACTION_createFsveritySetupAuthToken, _data, _reply, 0);
          _reply.readException();
          _result = android.os.IInstalld.IFsveritySetupAuthToken.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int enableFsverity(android.os.IInstalld.IFsveritySetupAuthToken authToken, java.lang.String filePath, java.lang.String packageName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(authToken);
          _data.writeString(filePath);
          _data.writeString(packageName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_enableFsverity, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    /** @hide */
    public static final java.lang.String DESCRIPTOR = "android.os.IInstalld";
    static final int TRANSACTION_createUserData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_destroyUserData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_setFirstBoot = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_createAppData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_createAppDataBatched = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_reconcileSdkData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_restoreconAppData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_migrateAppData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_clearAppData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_destroyAppData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_fixupAppData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_getAppSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_getUserSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_getExternalSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_getAppCrates = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_getUserCrates = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_setAppQuota = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_moveCompleteApp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_dexopt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_controlDexOptBlocking = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_rmdex = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_mergeProfiles = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
    static final int TRANSACTION_dumpProfiles = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
    static final int TRANSACTION_copySystemProfile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
    static final int TRANSACTION_clearAppProfiles = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
    static final int TRANSACTION_destroyAppProfiles = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
    static final int TRANSACTION_deleteReferenceProfile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
    static final int TRANSACTION_createProfileSnapshot = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
    static final int TRANSACTION_destroyProfileSnapshot = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
    static final int TRANSACTION_rmPackageDir = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
    static final int TRANSACTION_freeCache = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
    static final int TRANSACTION_linkNativeLibraryDirectory = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
    static final int TRANSACTION_createOatDir = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
    static final int TRANSACTION_linkFile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
    static final int TRANSACTION_moveAb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
    static final int TRANSACTION_deleteOdex = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
    static final int TRANSACTION_reconcileSecondaryDexFile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
    static final int TRANSACTION_hashSecondaryDexFile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
    static final int TRANSACTION_invalidateMounts = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
    static final int TRANSACTION_isQuotaSupported = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
    static final int TRANSACTION_prepareAppProfile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
    static final int TRANSACTION_snapshotAppData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
    static final int TRANSACTION_restoreAppDataSnapshot = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
    static final int TRANSACTION_destroyAppDataSnapshot = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
    static final int TRANSACTION_destroyCeSnapshotsNotSpecified = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
    static final int TRANSACTION_tryMountDataMirror = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
    static final int TRANSACTION_onPrivateVolumeRemoved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 46);
    static final int TRANSACTION_migrateLegacyObbData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 47);
    static final int TRANSACTION_cleanupInvalidPackageDirs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 48);
    static final int TRANSACTION_getOdexVisibility = (android.os.IBinder.FIRST_CALL_TRANSACTION + 49);
    static final int TRANSACTION_createFsveritySetupAuthToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 50);
    static final int TRANSACTION_enableFsverity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 51);
  }
  public static final int FLAG_STORAGE_DE = 1;
  public static final int FLAG_STORAGE_CE = 2;
  public static final int FLAG_STORAGE_EXTERNAL = 4;
  public static final int FLAG_STORAGE_SDK = 8;
  public static final int FLAG_CLEAR_CACHE_ONLY = 16;
  public static final int FLAG_CLEAR_CODE_CACHE_ONLY = 32;
  public static final int FLAG_FREE_CACHE_V2 = 256;
  public static final int FLAG_FREE_CACHE_V2_DEFY_QUOTA = 512;
  public static final int FLAG_FREE_CACHE_NOOP = 1024;
  // Set below flag to clear cache irrespective of target free bytes required
  public static final int FLAG_FREE_CACHE_DEFY_TARGET_FREE_BYTES = 2048;
  public static final int FLAG_USE_QUOTA = 4096;
  public static final int FLAG_FORCE = 8192;
  public static final int FLAG_CLEAR_APP_DATA_KEEP_ART_PROFILES = 131072;
  public void createUserData(java.lang.String uuid, int userId, int userSerial, int flags) throws android.os.RemoteException;
  public void destroyUserData(java.lang.String uuid, int userId, int flags) throws android.os.RemoteException;
  public void setFirstBoot() throws android.os.RemoteException;
  public android.os.CreateAppDataResult createAppData(android.os.CreateAppDataArgs args) throws android.os.RemoteException;
  public android.os.CreateAppDataResult[] createAppDataBatched(android.os.CreateAppDataArgs[] args) throws android.os.RemoteException;
  public void reconcileSdkData(android.os.ReconcileSdkDataArgs args) throws android.os.RemoteException;
  public void restoreconAppData(java.lang.String uuid, java.lang.String packageName, int userId, int flags, int appId, java.lang.String seInfo) throws android.os.RemoteException;
  public void migrateAppData(java.lang.String uuid, java.lang.String packageName, int userId, int flags) throws android.os.RemoteException;
  public void clearAppData(java.lang.String uuid, java.lang.String packageName, int userId, int flags, long ceDataInode) throws android.os.RemoteException;
  public void destroyAppData(java.lang.String uuid, java.lang.String packageName, int userId, int flags, long ceDataInode) throws android.os.RemoteException;
  public void fixupAppData(java.lang.String uuid, int flags) throws android.os.RemoteException;
  public long[] getAppSize(java.lang.String uuid, java.lang.String[] packageNames, int userId, int flags, int appId, long[] ceDataInodes, java.lang.String[] codePaths) throws android.os.RemoteException;
  public long[] getUserSize(java.lang.String uuid, int userId, int flags, int[] appIds) throws android.os.RemoteException;
  public long[] getExternalSize(java.lang.String uuid, int userId, int flags, int[] appIds) throws android.os.RemoteException;
  public android.os.storage.CrateMetadata[] getAppCrates(java.lang.String uuid, java.lang.String[] packageNames, int userId) throws android.os.RemoteException;
  public android.os.storage.CrateMetadata[] getUserCrates(java.lang.String uuid, int userId) throws android.os.RemoteException;
  public void setAppQuota(java.lang.String uuid, int userId, int appId, long cacheQuota) throws android.os.RemoteException;
  public void moveCompleteApp(java.lang.String fromUuid, java.lang.String toUuid, java.lang.String packageName, int appId, java.lang.String seInfo, int targetSdkVersion, java.lang.String fromCodePath) throws android.os.RemoteException;
  // Returns false if it is cancelled. Returns true if it is completed or have other errors.
  public boolean dexopt(java.lang.String apkPath, int uid, java.lang.String packageName, java.lang.String instructionSet, int dexoptNeeded, java.lang.String outputPath, int dexFlags, java.lang.String compilerFilter, java.lang.String uuid, java.lang.String sharedLibraries, java.lang.String seInfo, boolean downgrade, int targetSdkVersion, java.lang.String profileName, java.lang.String dexMetadataPath, java.lang.String compilationReason) throws android.os.RemoteException;
  // Blocks (when block is true) or unblock (when block is false) dexopt.
  // Blocking also invloves cancelling the currently running dexopt.
  public void controlDexOptBlocking(boolean block) throws android.os.RemoteException;
  public void rmdex(java.lang.String codePath, java.lang.String instructionSet) throws android.os.RemoteException;
  public int mergeProfiles(int uid, java.lang.String packageName, java.lang.String profileName) throws android.os.RemoteException;
  public boolean dumpProfiles(int uid, java.lang.String packageName, java.lang.String profileName, java.lang.String codePath, boolean dumpClassesAndMethods) throws android.os.RemoteException;
  public boolean copySystemProfile(java.lang.String systemProfile, int uid, java.lang.String packageName, java.lang.String profileName) throws android.os.RemoteException;
  public void clearAppProfiles(java.lang.String packageName, java.lang.String profileName) throws android.os.RemoteException;
  public void destroyAppProfiles(java.lang.String packageName) throws android.os.RemoteException;
  public void deleteReferenceProfile(java.lang.String packageName, java.lang.String profileName) throws android.os.RemoteException;
  public boolean createProfileSnapshot(int appId, java.lang.String packageName, java.lang.String profileName, java.lang.String classpath) throws android.os.RemoteException;
  public void destroyProfileSnapshot(java.lang.String packageName, java.lang.String profileName) throws android.os.RemoteException;
  public void rmPackageDir(java.lang.String packageName, java.lang.String packageDir) throws android.os.RemoteException;
  public void freeCache(java.lang.String uuid, long targetFreeBytes, int flags) throws android.os.RemoteException;
  public void linkNativeLibraryDirectory(java.lang.String uuid, java.lang.String packageName, java.lang.String nativeLibPath32, int userId) throws android.os.RemoteException;
  public void createOatDir(java.lang.String packageName, java.lang.String oatDir, java.lang.String instructionSet) throws android.os.RemoteException;
  public void linkFile(java.lang.String packageName, java.lang.String relativePath, java.lang.String fromBase, java.lang.String toBase) throws android.os.RemoteException;
  public void moveAb(java.lang.String packageName, java.lang.String apkPath, java.lang.String instructionSet, java.lang.String outputPath) throws android.os.RemoteException;
  public long deleteOdex(java.lang.String packageName, java.lang.String apkPath, java.lang.String instructionSet, java.lang.String outputPath) throws android.os.RemoteException;
  public boolean reconcileSecondaryDexFile(java.lang.String dexPath, java.lang.String pkgName, int uid, java.lang.String[] isas, java.lang.String volume_uuid, int storage_flag) throws android.os.RemoteException;
  public byte[] hashSecondaryDexFile(java.lang.String dexPath, java.lang.String pkgName, int uid, java.lang.String volumeUuid, int storageFlag) throws android.os.RemoteException;
  public void invalidateMounts() throws android.os.RemoteException;
  public boolean isQuotaSupported(java.lang.String uuid) throws android.os.RemoteException;
  public boolean prepareAppProfile(java.lang.String packageName, int userId, int appId, java.lang.String profileName, java.lang.String codePath, java.lang.String dexMetadata) throws android.os.RemoteException;
  public long snapshotAppData(java.lang.String uuid, java.lang.String packageName, int userId, int snapshotId, int storageFlags) throws android.os.RemoteException;
  public void restoreAppDataSnapshot(java.lang.String uuid, java.lang.String packageName, int appId, java.lang.String seInfo, int user, int snapshotId, int storageflags) throws android.os.RemoteException;
  public void destroyAppDataSnapshot(java.lang.String uuid, java.lang.String packageName, int userId, long ceSnapshotInode, int snapshotId, int storageFlags) throws android.os.RemoteException;
  public void destroyCeSnapshotsNotSpecified(java.lang.String uuid, int userId, int[] retainSnapshotIds) throws android.os.RemoteException;
  public void tryMountDataMirror(java.lang.String volumeUuid) throws android.os.RemoteException;
  public void onPrivateVolumeRemoved(java.lang.String volumeUuid) throws android.os.RemoteException;
  public void migrateLegacyObbData() throws android.os.RemoteException;
  public void cleanupInvalidPackageDirs(java.lang.String uuid, int userId, int flags) throws android.os.RemoteException;
  public int getOdexVisibility(java.lang.String packageName, java.lang.String apkPath, java.lang.String instructionSet, java.lang.String outputPath) throws android.os.RemoteException;
  public android.os.IInstalld.IFsveritySetupAuthToken createFsveritySetupAuthToken(android.os.ParcelFileDescriptor authFd, int uid) throws android.os.RemoteException;
  public int enableFsverity(android.os.IInstalld.IFsveritySetupAuthToken authToken, java.lang.String filePath, java.lang.String packageName) throws android.os.RemoteException;
  public interface IFsveritySetupAuthToken extends android.os.IInterface
  {
    /** Default implementation for IFsveritySetupAuthToken. */
    public static class Default implements android.os.IInstalld.IFsveritySetupAuthToken
    {
      @Override
      public android.os.IBinder asBinder() {
        return null;
      }
    }
    /** Local-side IPC implementation stub class. */
    public static abstract class Stub extends android.os.Binder implements android.os.IInstalld.IFsveritySetupAuthToken
    {
      /** Construct the stub and attach it to the interface. */
      @SuppressWarnings("this-escape")
      public Stub()
      {
        this.attachInterface(this, DESCRIPTOR);
      }
      /**
       * Cast an IBinder object into an android.os.IInstalld.IFsveritySetupAuthToken interface,
       * generating a proxy if needed.
       */
      public static android.os.IInstalld.IFsveritySetupAuthToken asInterface(android.os.IBinder obj)
      {
        if ((obj==null)) {
          return null;
        }
        android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
        if (((iin!=null)&&(iin instanceof android.os.IInstalld.IFsveritySetupAuthToken))) {
          return ((android.os.IInstalld.IFsveritySetupAuthToken)iin);
        }
        return new android.os.IInstalld.IFsveritySetupAuthToken.Stub.Proxy(obj);
      }
      @Override public android.os.IBinder asBinder()
      {
        return this;
      }
      @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
      {
        switch (code)
        {
          default:
          {
            return super.onTransact(code, data, reply, flags);
          }
        }
      }
      private static final class Proxy implements android.os.IInstalld.IFsveritySetupAuthToken
      {
        private android.os.IBinder mRemote;
        Proxy(android.os.IBinder remote)
        {
          mRemote = remote;
        }
        @Override public android.os.IBinder asBinder()
        {
          return mRemote;
        }
        public final java.lang.String getInterfaceDescriptor()
        {
          return DESCRIPTOR;
        }
      }
    }
    /** @hide */
    public static final java.lang.String DESCRIPTOR = "android.os.IInstalld.IFsveritySetupAuthToken";
  }
  /** @hide */
  static class _Parcel {
    static private <T> T readTypedObject(
        android.os.Parcel parcel,
        android.os.Parcelable.Creator<T> c) {
      if (parcel.readInt() != 0) {
          return c.createFromParcel(parcel);
      } else {
          return null;
      }
    }
    static private <T extends android.os.Parcelable> void writeTypedObject(
        android.os.Parcel parcel, T value, int parcelableFlags) {
      if (value != null) {
        parcel.writeInt(1);
        value.writeToParcel(parcel, parcelableFlags);
      } else {
        parcel.writeInt(0);
      }
    }
  }
}
