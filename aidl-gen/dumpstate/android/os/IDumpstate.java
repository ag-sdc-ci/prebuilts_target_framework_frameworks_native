/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/frameworks/native/aidl-gen/dumpstate -I /home/shadichy/Documents/bliss/los-21/frameworks/native/cmds/dumpstate/binder /home/shadichy/Documents/bliss/los-21/frameworks/native/cmds/dumpstate/binder/android/os/IDumpstate.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.os;
/**
 * Binder interface for the currently running dumpstate process.
 * {@hide}
 */
public interface IDumpstate extends android.os.IInterface
{
  /** Default implementation for IDumpstate. */
  public static class Default implements android.os.IDumpstate
  {
    /**
     * Speculatively pre-dumps UI data for a bugreport request that might come later.
     * 
     * <p>Triggers the dump of certain critical UI data, e.g. traces stored in short
     * ring buffers that might get lost by the time the actual bugreport is requested.
     * 
     * <p>{@code startBugreport} will then pick the pre-dumped data if:
     * - {@link BUGREPORT_FLAG_USE_PREDUMPED_UI_DATA} is specified.
     * - {@code preDumpUiData} and {@code startBugreport} were called by the same UID.
     * 
     * @param callingPackage package of the original application that requested the report.
     */
    @Override public void preDumpUiData(java.lang.String callingPackage) throws android.os.RemoteException
    {
    }
    /**
     * Starts a bugreport in the background.
     * 
     * <p>Shows the user a dialog to get consent for sharing the bugreport with the calling
     * application. If they deny {@link IDumpstateListener#onError} will be called. If they
     * consent and bugreport generation is successful artifacts will be copied to the given fds and
     * {@link IDumpstateListener#onFinished} will be called. If there
     * are errors in bugreport generation {@link IDumpstateListener#onError} will be called.
     * 
     * @param callingUid UID of the original application that requested the report.
     * @param callingPackage package of the original application that requested the report.
     * @param bugreportFd the file to which the zipped bugreport should be written
     * @param screenshotFd the file to which screenshot should be written
     * @param bugreportMode the mode that specifies other run time options; must be one of above
     * @param bugreportFlags flags to customize the bugreport generation
     * @param listener callback for updates; optional
     * @param isScreenshotRequested indicates screenshot is requested or not
     */
    @Override public void startBugreport(int callingUid, java.lang.String callingPackage, java.io.FileDescriptor bugreportFd, java.io.FileDescriptor screenshotFd, int bugreportMode, int bugreportFlags, android.os.IDumpstateListener listener, boolean isScreenshotRequested) throws android.os.RemoteException
    {
    }
    /**
     * Cancels the bugreport currently in progress.
     * 
     * <p>The caller must match the original caller of {@link #startBugreport} in order for the
     * report to actually be cancelled. A {@link SecurityException} is reported if a mismatch is
     * detected.
     * 
     * @param callingUid UID of the original application that requested the cancellation.
     * @param callingPackage package of the original application that requested the cancellation.
     */
    @Override public void cancelBugreport(int callingUid, java.lang.String callingPackage) throws android.os.RemoteException
    {
    }
    /**
     * Retrieves a previously generated bugreport.
     * 
     * <p>The caller must have previously generated a bugreport using
     * {@link #startBugreport} with the {@link BUGREPORT_FLAG_DEFER_CONSENT}
     * flag set.
     * 
     * @param callingUid UID of the original application that requested the report.
     * @param callingPackage package of the original application that requested the report.
     * @param userId user Id of the original package that requested the report.
     * @param bugreportFd the file to which the zipped bugreport should be written
     * @param bugreportFile the path of the bugreport file
     * @param keepBugreportOnRetrieval boolean to indicate if the bugreport should be kept in the
     * platform after it has been retrieved by the caller.
     * @param listener callback for updates; optional
     */
    @Override public void retrieveBugreport(int callingUid, java.lang.String callingPackage, int userId, java.io.FileDescriptor bugreportFd, java.lang.String bugreportFile, boolean keepBugreportOnRetrieval, android.os.IDumpstateListener listener) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.os.IDumpstate
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.os.IDumpstate interface,
     * generating a proxy if needed.
     */
    public static android.os.IDumpstate asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.os.IDumpstate))) {
        return ((android.os.IDumpstate)iin);
      }
      return new android.os.IDumpstate.Stub.Proxy(obj);
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
        case TRANSACTION_preDumpUiData:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.preDumpUiData(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_startBugreport:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.io.FileDescriptor _arg2;
          _arg2 = data.readRawFileDescriptor();
          java.io.FileDescriptor _arg3;
          _arg3 = data.readRawFileDescriptor();
          int _arg4;
          _arg4 = data.readInt();
          int _arg5;
          _arg5 = data.readInt();
          android.os.IDumpstateListener _arg6;
          _arg6 = android.os.IDumpstateListener.Stub.asInterface(data.readStrongBinder());
          boolean _arg7;
          _arg7 = (0!=data.readInt());
          this.startBugreport(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_cancelBugreport:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.cancelBugreport(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_retrieveBugreport:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          java.io.FileDescriptor _arg3;
          _arg3 = data.readRawFileDescriptor();
          java.lang.String _arg4;
          _arg4 = data.readString();
          boolean _arg5;
          _arg5 = (0!=data.readInt());
          android.os.IDumpstateListener _arg6;
          _arg6 = android.os.IDumpstateListener.Stub.asInterface(data.readStrongBinder());
          this.retrieveBugreport(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
          reply.writeNoException();
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static final class Proxy implements android.os.IDumpstate
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
      /**
       * Speculatively pre-dumps UI data for a bugreport request that might come later.
       * 
       * <p>Triggers the dump of certain critical UI data, e.g. traces stored in short
       * ring buffers that might get lost by the time the actual bugreport is requested.
       * 
       * <p>{@code startBugreport} will then pick the pre-dumped data if:
       * - {@link BUGREPORT_FLAG_USE_PREDUMPED_UI_DATA} is specified.
       * - {@code preDumpUiData} and {@code startBugreport} were called by the same UID.
       * 
       * @param callingPackage package of the original application that requested the report.
       */
      @Override public void preDumpUiData(java.lang.String callingPackage) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(callingPackage);
          boolean _status = mRemote.transact(Stub.TRANSACTION_preDumpUiData, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * Starts a bugreport in the background.
       * 
       * <p>Shows the user a dialog to get consent for sharing the bugreport with the calling
       * application. If they deny {@link IDumpstateListener#onError} will be called. If they
       * consent and bugreport generation is successful artifacts will be copied to the given fds and
       * {@link IDumpstateListener#onFinished} will be called. If there
       * are errors in bugreport generation {@link IDumpstateListener#onError} will be called.
       * 
       * @param callingUid UID of the original application that requested the report.
       * @param callingPackage package of the original application that requested the report.
       * @param bugreportFd the file to which the zipped bugreport should be written
       * @param screenshotFd the file to which screenshot should be written
       * @param bugreportMode the mode that specifies other run time options; must be one of above
       * @param bugreportFlags flags to customize the bugreport generation
       * @param listener callback for updates; optional
       * @param isScreenshotRequested indicates screenshot is requested or not
       */
      @Override public void startBugreport(int callingUid, java.lang.String callingPackage, java.io.FileDescriptor bugreportFd, java.io.FileDescriptor screenshotFd, int bugreportMode, int bugreportFlags, android.os.IDumpstateListener listener, boolean isScreenshotRequested) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(callingUid);
          _data.writeString(callingPackage);
          _data.writeRawFileDescriptor(bugreportFd);
          _data.writeRawFileDescriptor(screenshotFd);
          _data.writeInt(bugreportMode);
          _data.writeInt(bugreportFlags);
          _data.writeStrongInterface(listener);
          _data.writeInt(((isScreenshotRequested)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_startBugreport, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * Cancels the bugreport currently in progress.
       * 
       * <p>The caller must match the original caller of {@link #startBugreport} in order for the
       * report to actually be cancelled. A {@link SecurityException} is reported if a mismatch is
       * detected.
       * 
       * @param callingUid UID of the original application that requested the cancellation.
       * @param callingPackage package of the original application that requested the cancellation.
       */
      @Override public void cancelBugreport(int callingUid, java.lang.String callingPackage) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(callingUid);
          _data.writeString(callingPackage);
          boolean _status = mRemote.transact(Stub.TRANSACTION_cancelBugreport, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * Retrieves a previously generated bugreport.
       * 
       * <p>The caller must have previously generated a bugreport using
       * {@link #startBugreport} with the {@link BUGREPORT_FLAG_DEFER_CONSENT}
       * flag set.
       * 
       * @param callingUid UID of the original application that requested the report.
       * @param callingPackage package of the original application that requested the report.
       * @param userId user Id of the original package that requested the report.
       * @param bugreportFd the file to which the zipped bugreport should be written
       * @param bugreportFile the path of the bugreport file
       * @param keepBugreportOnRetrieval boolean to indicate if the bugreport should be kept in the
       * platform after it has been retrieved by the caller.
       * @param listener callback for updates; optional
       */
      @Override public void retrieveBugreport(int callingUid, java.lang.String callingPackage, int userId, java.io.FileDescriptor bugreportFd, java.lang.String bugreportFile, boolean keepBugreportOnRetrieval, android.os.IDumpstateListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(callingUid);
          _data.writeString(callingPackage);
          _data.writeInt(userId);
          _data.writeRawFileDescriptor(bugreportFd);
          _data.writeString(bugreportFile);
          _data.writeInt(((keepBugreportOnRetrieval)?(1):(0)));
          _data.writeStrongInterface(listener);
          boolean _status = mRemote.transact(Stub.TRANSACTION_retrieveBugreport, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_preDumpUiData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_startBugreport = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_cancelBugreport = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_retrieveBugreport = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android.os.IDumpstate";
  // NOTE: If you add to or change these modes, please also change the corresponding enums
  // in system server, in BugreportParams.java.
  // These modes encapsulate a set of run time options for generating bugreports.
  // Takes a bugreport without user interference.
  public static final int BUGREPORT_MODE_FULL = 0;
  // Interactive bugreport, i.e. triggered by the user.
  public static final int BUGREPORT_MODE_INTERACTIVE = 1;
  // Remote bugreport triggered by DevicePolicyManager, for e.g.
  public static final int BUGREPORT_MODE_REMOTE = 2;
  // Bugreport triggered on a wear device.
  public static final int BUGREPORT_MODE_WEAR = 3;
  // Bugreport limited to only telephony info.
  public static final int BUGREPORT_MODE_TELEPHONY = 4;
  // Bugreport limited to only wifi info.
  public static final int BUGREPORT_MODE_WIFI = 5;
  // Default mode.
  public static final int BUGREPORT_MODE_DEFAULT = 6;
  // Bugreport taken for onboarding related flows.
  public static final int BUGREPORT_MODE_ONBOARDING = 7;
  // Use pre-dumped data.
  public static final int BUGREPORT_FLAG_USE_PREDUMPED_UI_DATA = 1;
  // Defer user consent.
  public static final int BUGREPORT_FLAG_DEFER_CONSENT = 2;
  // Keep bugreport stored after retrieval.
  public static final int BUGREPORT_FLAG_KEEP_BUGREPORT_ON_RETRIEVAL = 4;
  /**
   * Speculatively pre-dumps UI data for a bugreport request that might come later.
   * 
   * <p>Triggers the dump of certain critical UI data, e.g. traces stored in short
   * ring buffers that might get lost by the time the actual bugreport is requested.
   * 
   * <p>{@code startBugreport} will then pick the pre-dumped data if:
   * - {@link BUGREPORT_FLAG_USE_PREDUMPED_UI_DATA} is specified.
   * - {@code preDumpUiData} and {@code startBugreport} were called by the same UID.
   * 
   * @param callingPackage package of the original application that requested the report.
   */
  public void preDumpUiData(java.lang.String callingPackage) throws android.os.RemoteException;
  /**
   * Starts a bugreport in the background.
   * 
   * <p>Shows the user a dialog to get consent for sharing the bugreport with the calling
   * application. If they deny {@link IDumpstateListener#onError} will be called. If they
   * consent and bugreport generation is successful artifacts will be copied to the given fds and
   * {@link IDumpstateListener#onFinished} will be called. If there
   * are errors in bugreport generation {@link IDumpstateListener#onError} will be called.
   * 
   * @param callingUid UID of the original application that requested the report.
   * @param callingPackage package of the original application that requested the report.
   * @param bugreportFd the file to which the zipped bugreport should be written
   * @param screenshotFd the file to which screenshot should be written
   * @param bugreportMode the mode that specifies other run time options; must be one of above
   * @param bugreportFlags flags to customize the bugreport generation
   * @param listener callback for updates; optional
   * @param isScreenshotRequested indicates screenshot is requested or not
   */
  public void startBugreport(int callingUid, java.lang.String callingPackage, java.io.FileDescriptor bugreportFd, java.io.FileDescriptor screenshotFd, int bugreportMode, int bugreportFlags, android.os.IDumpstateListener listener, boolean isScreenshotRequested) throws android.os.RemoteException;
  /**
   * Cancels the bugreport currently in progress.
   * 
   * <p>The caller must match the original caller of {@link #startBugreport} in order for the
   * report to actually be cancelled. A {@link SecurityException} is reported if a mismatch is
   * detected.
   * 
   * @param callingUid UID of the original application that requested the cancellation.
   * @param callingPackage package of the original application that requested the cancellation.
   */
  public void cancelBugreport(int callingUid, java.lang.String callingPackage) throws android.os.RemoteException;
  /**
   * Retrieves a previously generated bugreport.
   * 
   * <p>The caller must have previously generated a bugreport using
   * {@link #startBugreport} with the {@link BUGREPORT_FLAG_DEFER_CONSENT}
   * flag set.
   * 
   * @param callingUid UID of the original application that requested the report.
   * @param callingPackage package of the original application that requested the report.
   * @param userId user Id of the original package that requested the report.
   * @param bugreportFd the file to which the zipped bugreport should be written
   * @param bugreportFile the path of the bugreport file
   * @param keepBugreportOnRetrieval boolean to indicate if the bugreport should be kept in the
   * platform after it has been retrieved by the caller.
   * @param listener callback for updates; optional
   */
  public void retrieveBugreport(int callingUid, java.lang.String callingPackage, int userId, java.io.FileDescriptor bugreportFd, java.lang.String bugreportFile, boolean keepBugreportOnRetrieval, android.os.IDumpstateListener listener) throws android.os.RemoteException;
}
