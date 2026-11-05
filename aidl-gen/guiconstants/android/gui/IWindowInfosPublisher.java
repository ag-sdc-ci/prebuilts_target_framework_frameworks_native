/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/frameworks/native/aidl-gen/guiconstants -I /home/shadichy/Documents/bliss/los-21/frameworks/native/libs/gui /home/shadichy/Documents/bliss/los-21/frameworks/native/libs/gui/android/gui/IWindowInfosPublisher.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.gui;
/** @hide */
public interface IWindowInfosPublisher extends android.os.IInterface
{
  /** Default implementation for IWindowInfosPublisher. */
  public static class Default implements android.gui.IWindowInfosPublisher
  {
    @Override public void ackWindowInfosReceived(long vsyncId, long listenerId) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.gui.IWindowInfosPublisher
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.gui.IWindowInfosPublisher interface,
     * generating a proxy if needed.
     */
    public static android.gui.IWindowInfosPublisher asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.gui.IWindowInfosPublisher))) {
        return ((android.gui.IWindowInfosPublisher)iin);
      }
      return new android.gui.IWindowInfosPublisher.Stub.Proxy(obj);
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
        case TRANSACTION_ackWindowInfosReceived:
        {
          long _arg0;
          _arg0 = data.readLong();
          long _arg1;
          _arg1 = data.readLong();
          this.ackWindowInfosReceived(_arg0, _arg1);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static final class Proxy implements android.gui.IWindowInfosPublisher
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
      @Override public void ackWindowInfosReceived(long vsyncId, long listenerId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeLong(vsyncId);
          _data.writeLong(listenerId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_ackWindowInfosReceived, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_ackWindowInfosReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android.gui.IWindowInfosPublisher";
  public void ackWindowInfosReceived(long vsyncId, long listenerId) throws android.os.RemoteException;
}
