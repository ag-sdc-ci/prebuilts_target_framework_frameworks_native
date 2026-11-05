/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/frameworks/native/aidl-gen/incidentcompanion -I /home/shadichy/Documents/bliss/los-21/frameworks/native/libs/incidentcompanion/binder /home/shadichy/Documents/bliss/los-21/frameworks/native/libs/incidentcompanion/binder/android/os/IIncidentAuthListener.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.os;
/**
 * Callback for IIncidentCompanion.
 * 
 * @hide
 */
public interface IIncidentAuthListener extends android.os.IInterface
{
  /** Default implementation for IIncidentAuthListener. */
  public static class Default implements android.os.IIncidentAuthListener
  {
    /** The user approved the incident or bug report to be sent. */
    @Override public void onReportApproved() throws android.os.RemoteException
    {
    }
    /** The user did not approve the incident or bug report to be sent. */
    @Override public void onReportDenied() throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.os.IIncidentAuthListener
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.os.IIncidentAuthListener interface,
     * generating a proxy if needed.
     */
    public static android.os.IIncidentAuthListener asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.os.IIncidentAuthListener))) {
        return ((android.os.IIncidentAuthListener)iin);
      }
      return new android.os.IIncidentAuthListener.Stub.Proxy(obj);
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
        case TRANSACTION_onReportApproved:
        {
          this.onReportApproved();
          break;
        }
        case TRANSACTION_onReportDenied:
        {
          this.onReportDenied();
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static final class Proxy implements android.os.IIncidentAuthListener
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
      /** The user approved the incident or bug report to be sent. */
      @Override public void onReportApproved() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onReportApproved, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      /** The user did not approve the incident or bug report to be sent. */
      @Override public void onReportDenied() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onReportDenied, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_onReportApproved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onReportDenied = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android.os.IIncidentAuthListener";
  /** The user approved the incident or bug report to be sent. */
  public void onReportApproved() throws android.os.RemoteException;
  /** The user did not approve the incident or bug report to be sent. */
  public void onReportDenied() throws android.os.RemoteException;
}
