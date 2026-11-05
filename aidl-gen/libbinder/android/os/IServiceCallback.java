/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/frameworks/native/aidl-gen/libbinder -I /home/shadichy/Documents/bliss/los-21/frameworks/native/libs/binder/aidl /home/shadichy/Documents/bliss/los-21/frameworks/native/libs/binder/aidl/android/os/IServiceCallback.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.os;
/** @hide */
public interface IServiceCallback extends android.os.IInterface
{
  /** Default implementation for IServiceCallback. */
  public static class Default implements android.os.IServiceCallback
  {
    /**
     * Called when a service is registered.
     * 
     * @param name the service name that has been registered with
     * @param binder the binder that is registered
     */
    @Override public void onRegistration(java.lang.String name, android.os.IBinder binder) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.os.IServiceCallback
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.os.IServiceCallback interface,
     * generating a proxy if needed.
     */
    public static android.os.IServiceCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.os.IServiceCallback))) {
        return ((android.os.IServiceCallback)iin);
      }
      return new android.os.IServiceCallback.Stub.Proxy(obj);
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
        case TRANSACTION_onRegistration:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          android.os.IBinder _arg1;
          _arg1 = data.readStrongBinder();
          this.onRegistration(_arg0, _arg1);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static final class Proxy implements android.os.IServiceCallback
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
       * Called when a service is registered.
       * 
       * @param name the service name that has been registered with
       * @param binder the binder that is registered
       */
      @Override public void onRegistration(java.lang.String name, android.os.IBinder binder) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(name);
          _data.writeStrongBinder(binder);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onRegistration, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_onRegistration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android.os.IServiceCallback";
  /**
   * Called when a service is registered.
   * 
   * @param name the service name that has been registered with
   * @param binder the binder that is registered
   */
  public void onRegistration(java.lang.String name, android.os.IBinder binder) throws android.os.RemoteException;
}
