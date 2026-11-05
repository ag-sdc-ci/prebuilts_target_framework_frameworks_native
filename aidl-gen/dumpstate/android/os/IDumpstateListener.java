/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/frameworks/native/aidl-gen/dumpstate -I /home/shadichy/Documents/bliss/los-21/frameworks/native/cmds/dumpstate/binder /home/shadichy/Documents/bliss/los-21/frameworks/native/cmds/dumpstate/binder/android/os/IDumpstateListener.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.os;
/**
 * Listener for dumpstate events.
 * 
 * <p>When bugreport creation is complete one of {@code onError} or {@code onFinished} is called.
 * 
 * 
 * {@hide}
 */
public interface IDumpstateListener extends android.os.IInterface
{
  /** Default implementation for IDumpstateListener. */
  public static class Default implements android.os.IDumpstateListener
  {
    /**
     * Called when there is a progress update.
     * 
     * @param progress the progress in [0, 100]
     */
    @Override public void onProgress(int progress) throws android.os.RemoteException
    {
    }
    /** Called on an error condition with one of the error codes listed above. */
    @Override public void onError(int errorCode) throws android.os.RemoteException
    {
    }
    /**
     * Called when taking bugreport finishes successfully.
     * 
     * @param bugreportFile The location of the bugreport file
     */
    @Override public void onFinished(java.lang.String bugreportFile) throws android.os.RemoteException
    {
    }
    /** Called when screenshot is taken. */
    @Override public void onScreenshotTaken(boolean success) throws android.os.RemoteException
    {
    }
    /** Called when ui intensive bugreport dumps are finished. */
    @Override public void onUiIntensiveBugreportDumpsFinished() throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.os.IDumpstateListener
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.os.IDumpstateListener interface,
     * generating a proxy if needed.
     */
    public static android.os.IDumpstateListener asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.os.IDumpstateListener))) {
        return ((android.os.IDumpstateListener)iin);
      }
      return new android.os.IDumpstateListener.Stub.Proxy(obj);
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
        case TRANSACTION_onProgress:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.onProgress(_arg0);
          break;
        }
        case TRANSACTION_onError:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.onError(_arg0);
          break;
        }
        case TRANSACTION_onFinished:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.onFinished(_arg0);
          break;
        }
        case TRANSACTION_onScreenshotTaken:
        {
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.onScreenshotTaken(_arg0);
          break;
        }
        case TRANSACTION_onUiIntensiveBugreportDumpsFinished:
        {
          this.onUiIntensiveBugreportDumpsFinished();
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static final class Proxy implements android.os.IDumpstateListener
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
       * Called when there is a progress update.
       * 
       * @param progress the progress in [0, 100]
       */
      @Override public void onProgress(int progress) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(progress);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onProgress, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      /** Called on an error condition with one of the error codes listed above. */
      @Override public void onError(int errorCode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(errorCode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onError, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Called when taking bugreport finishes successfully.
       * 
       * @param bugreportFile The location of the bugreport file
       */
      @Override public void onFinished(java.lang.String bugreportFile) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(bugreportFile);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onFinished, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      /** Called when screenshot is taken. */
      @Override public void onScreenshotTaken(boolean success) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((success)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_onScreenshotTaken, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      /** Called when ui intensive bugreport dumps are finished. */
      @Override public void onUiIntensiveBugreportDumpsFinished() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onUiIntensiveBugreportDumpsFinished, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_onProgress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_onFinished = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_onScreenshotTaken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_onUiIntensiveBugreportDumpsFinished = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android.os.IDumpstateListener";
  // NOTE: If you add to or change these error codes, please also change the corresponding enums
  // in system server, in BugreportManager.java.
  /** Options specified are invalid or incompatible */
  public static final int BUGREPORT_ERROR_INVALID_INPUT = 1;
  /** Bugreport encountered a runtime error */
  public static final int BUGREPORT_ERROR_RUNTIME_ERROR = 2;
  /** User denied consent to share the bugreport with the specified app */
  public static final int BUGREPORT_ERROR_USER_DENIED_CONSENT = 3;
  /** The request to get user consent timed out */
  public static final int BUGREPORT_ERROR_USER_CONSENT_TIMED_OUT = 4;
  /** There is currently a bugreport running. The caller should try again later. */
  public static final int BUGREPORT_ERROR_ANOTHER_REPORT_IN_PROGRESS = 5;
  /** There is no bugreport to retrieve for the given caller. */
  public static final int BUGREPORT_ERROR_NO_BUGREPORT_TO_RETRIEVE = 6;
  /**
   * Called when there is a progress update.
   * 
   * @param progress the progress in [0, 100]
   */
  public void onProgress(int progress) throws android.os.RemoteException;
  /** Called on an error condition with one of the error codes listed above. */
  public void onError(int errorCode) throws android.os.RemoteException;
  /**
   * Called when taking bugreport finishes successfully.
   * 
   * @param bugreportFile The location of the bugreport file
   */
  public void onFinished(java.lang.String bugreportFile) throws android.os.RemoteException;
  /** Called when screenshot is taken. */
  public void onScreenshotTaken(boolean success) throws android.os.RemoteException;
  /** Called when ui intensive bugreport dumps are finished. */
  public void onUiIntensiveBugreportDumpsFinished() throws android.os.RemoteException;
}
