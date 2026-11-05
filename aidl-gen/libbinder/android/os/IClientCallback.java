/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/frameworks/native/aidl-gen/libbinder -I /home/shadichy/Documents/bliss/los-21/frameworks/native/libs/binder/aidl /home/shadichy/Documents/bliss/los-21/frameworks/native/libs/binder/aidl/android/os/IClientCallback.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.os;
/** @hide */
public interface IClientCallback extends android.os.IInterface
{
  /** Default implementation for IClientCallback. */
  public static class Default implements android.os.IClientCallback
  {
    /**
     * This is called when there is a transition between having >= 1 clients and having 0 clients
     * (or vice versa).
     * 
     * Upon receiving hasClients false, if the process decides to exit, it is recommended to try to
     * unregister using IServiceManager's tryUnregister before quitting in case another client
     * associates.
     * 
     * @param registered binder 'server' registered with IServiceManager's registerClientCallback
     * @param hasClients whether there are currently clients
     *     true - when there are >= 1 clients. This must be called as soon as IServiceManager::get
     *         is called (no race).
     *     false - when there are 0 clients. This may be delayed if it is thought that another
     *         may be used again soon.
     */
    @Override public void onClients(android.os.IBinder registered, boolean hasClients) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.os.IClientCallback
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.os.IClientCallback interface,
     * generating a proxy if needed.
     */
    public static android.os.IClientCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.os.IClientCallback))) {
        return ((android.os.IClientCallback)iin);
      }
      return new android.os.IClientCallback.Stub.Proxy(obj);
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
        case TRANSACTION_onClients:
        {
          android.os.IBinder _arg0;
          _arg0 = data.readStrongBinder();
          boolean _arg1;
          _arg1 = (0!=data.readInt());
          this.onClients(_arg0, _arg1);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static final class Proxy implements android.os.IClientCallback
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
       * This is called when there is a transition between having >= 1 clients and having 0 clients
       * (or vice versa).
       * 
       * Upon receiving hasClients false, if the process decides to exit, it is recommended to try to
       * unregister using IServiceManager's tryUnregister before quitting in case another client
       * associates.
       * 
       * @param registered binder 'server' registered with IServiceManager's registerClientCallback
       * @param hasClients whether there are currently clients
       *     true - when there are >= 1 clients. This must be called as soon as IServiceManager::get
       *         is called (no race).
       *     false - when there are 0 clients. This may be delayed if it is thought that another
       *         may be used again soon.
       */
      @Override public void onClients(android.os.IBinder registered, boolean hasClients) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder(registered);
          _data.writeInt(((hasClients)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_onClients, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_onClients = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android.os.IClientCallback";
  /**
   * This is called when there is a transition between having >= 1 clients and having 0 clients
   * (or vice versa).
   * 
   * Upon receiving hasClients false, if the process decides to exit, it is recommended to try to
   * unregister using IServiceManager's tryUnregister before quitting in case another client
   * associates.
   * 
   * @param registered binder 'server' registered with IServiceManager's registerClientCallback
   * @param hasClients whether there are currently clients
   *     true - when there are >= 1 clients. This must be called as soon as IServiceManager::get
   *         is called (no race).
   *     false - when there are 0 clients. This may be delayed if it is thought that another
   *         may be used again soon.
   */
  public void onClients(android.os.IBinder registered, boolean hasClients) throws android.os.RemoteException;
}
