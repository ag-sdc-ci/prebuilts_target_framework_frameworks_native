/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/frameworks/native/aidl-gen/incidentcompanion -I /home/shadichy/Documents/bliss/los-21/frameworks/native/libs/incidentcompanion/binder /home/shadichy/Documents/bliss/los-21/frameworks/native/libs/incidentcompanion/binder/android/os/IIncidentCompanion.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.os;
/**
 * Helper service for incidentd and dumpstated to provide user feedback
 * and authorization for bug and inicdent reports to be taken.
 * 
 * @hide
 */
public interface IIncidentCompanion extends android.os.IInterface
{
  /** Default implementation for IIncidentCompanion. */
  public static class Default implements android.os.IIncidentCompanion
  {
    /**
     * Request an authorization for an incident or bug report.
     * // TODO(b/111441001): Add the permission
     * <p>
     * This function requires the ___ permission.
     * 
     * @param callingUid The original application that requested the report.  This function
     *      returns via the callback whether the application should be trusted.  It is up
     *      to the caller to actually implement the restriction to take or not take
     *      the incident or bug report.
     * @param receiverClass The class that will be the eventual broacast receiver for the
     *      INCIDENT_REPORT_READY message. Used as part of the id in incidentd.
     * @param reportId The incident report ID.  Incidentd should call with this parameter, but
     *     everyone else should pass null or empty string.
     * @param flags FLAG_CONFIRMATION_DIALOG (0x1) - to show this as a dialog.  Otherwise
     *      a dialog will be shown as a notification.
     * @param callback Interface to receive results.  The results may not come back for
     *      a long (user's choice) time, or ever (if they never respond to the notification).
     *      Authorization requests are not persisted across reboot.  It is up to the calling
     *      service to request another authorization after reboot if they still would like
     *      to send their report.
     */
    @Override public void authorizeReport(int callingUid, java.lang.String callingPackage, java.lang.String receiverClass, java.lang.String reportId, int flags, android.os.IIncidentAuthListener callback) throws android.os.RemoteException
    {
    }
    /** Cancel an authorization. */
    @Override public void cancelAuthorization(android.os.IIncidentAuthListener callback) throws android.os.RemoteException
    {
    }
    /** Send the report ready broadcast on behalf of incidentd. */
    @Override public void sendReportReadyBroadcast(java.lang.String pkg, java.lang.String cls) throws android.os.RemoteException
    {
    }
    /** Return the list of pending approvals. */
    @Override public java.util.List<java.lang.String> getPendingReports() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * The user has authorized the report to be shared.
     * 
     * @param uri the report.
     */
    @Override public void approveReport(java.lang.String uri) throws android.os.RemoteException
    {
    }
    /**
     * The user has denied the report from being shared.
     * 
     * @param uri the report.
     */
    @Override public void denyReport(java.lang.String uri) throws android.os.RemoteException
    {
    }
    /**
     * List the incident reports for the given ComponentName.  The receiver
     * must be for a package inside the caller.
     */
    @Override public java.util.List<java.lang.String> getIncidentReportList(java.lang.String pkg, java.lang.String cls) throws android.os.RemoteException
    {
      return null;
    }
    /** Get the IncidentReport object. */
    @Override public android.os.IncidentManager.IncidentReport getIncidentReport(java.lang.String pkg, java.lang.String cls, java.lang.String id) throws android.os.RemoteException
    {
      return null;
    }
    /** Signal that the client is done with this incident report and it can be deleted. */
    @Override public void deleteIncidentReports(java.lang.String pkg, java.lang.String cls, java.lang.String id) throws android.os.RemoteException
    {
    }
    /**
     * Signal that the client is done with all incident reports from this package.
     * Especially useful for testing.
     */
    @Override public void deleteAllIncidentReports(java.lang.String pkg) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.os.IIncidentCompanion
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.os.IIncidentCompanion interface,
     * generating a proxy if needed.
     */
    public static android.os.IIncidentCompanion asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.os.IIncidentCompanion))) {
        return ((android.os.IIncidentCompanion)iin);
      }
      return new android.os.IIncidentCompanion.Stub.Proxy(obj);
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
        case TRANSACTION_authorizeReport:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          java.lang.String _arg3;
          _arg3 = data.readString();
          int _arg4;
          _arg4 = data.readInt();
          android.os.IIncidentAuthListener _arg5;
          _arg5 = android.os.IIncidentAuthListener.Stub.asInterface(data.readStrongBinder());
          this.authorizeReport(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          break;
        }
        case TRANSACTION_cancelAuthorization:
        {
          android.os.IIncidentAuthListener _arg0;
          _arg0 = android.os.IIncidentAuthListener.Stub.asInterface(data.readStrongBinder());
          this.cancelAuthorization(_arg0);
          break;
        }
        case TRANSACTION_sendReportReadyBroadcast:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.sendReportReadyBroadcast(_arg0, _arg1);
          break;
        }
        case TRANSACTION_getPendingReports:
        {
          java.util.List<java.lang.String> _result = this.getPendingReports();
          reply.writeNoException();
          reply.writeStringList(_result);
          break;
        }
        case TRANSACTION_approveReport:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.approveReport(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_denyReport:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.denyReport(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_getIncidentReportList:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.util.List<java.lang.String> _result = this.getIncidentReportList(_arg0, _arg1);
          reply.writeNoException();
          reply.writeStringList(_result);
          break;
        }
        case TRANSACTION_getIncidentReport:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          android.os.IncidentManager.IncidentReport _result = this.getIncidentReport(_arg0, _arg1, _arg2);
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_deleteIncidentReports:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          this.deleteIncidentReports(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_deleteAllIncidentReports:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.deleteAllIncidentReports(_arg0);
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
    private static final class Proxy implements android.os.IIncidentCompanion
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
       * Request an authorization for an incident or bug report.
       * // TODO(b/111441001): Add the permission
       * <p>
       * This function requires the ___ permission.
       * 
       * @param callingUid The original application that requested the report.  This function
       *      returns via the callback whether the application should be trusted.  It is up
       *      to the caller to actually implement the restriction to take or not take
       *      the incident or bug report.
       * @param receiverClass The class that will be the eventual broacast receiver for the
       *      INCIDENT_REPORT_READY message. Used as part of the id in incidentd.
       * @param reportId The incident report ID.  Incidentd should call with this parameter, but
       *     everyone else should pass null or empty string.
       * @param flags FLAG_CONFIRMATION_DIALOG (0x1) - to show this as a dialog.  Otherwise
       *      a dialog will be shown as a notification.
       * @param callback Interface to receive results.  The results may not come back for
       *      a long (user's choice) time, or ever (if they never respond to the notification).
       *      Authorization requests are not persisted across reboot.  It is up to the calling
       *      service to request another authorization after reboot if they still would like
       *      to send their report.
       */
      @Override public void authorizeReport(int callingUid, java.lang.String callingPackage, java.lang.String receiverClass, java.lang.String reportId, int flags, android.os.IIncidentAuthListener callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(callingUid);
          _data.writeString(callingPackage);
          _data.writeString(receiverClass);
          _data.writeString(reportId);
          _data.writeInt(flags);
          _data.writeStrongInterface(callback);
          boolean _status = mRemote.transact(Stub.TRANSACTION_authorizeReport, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      /** Cancel an authorization. */
      @Override public void cancelAuthorization(android.os.IIncidentAuthListener callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(callback);
          boolean _status = mRemote.transact(Stub.TRANSACTION_cancelAuthorization, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      /** Send the report ready broadcast on behalf of incidentd. */
      @Override public void sendReportReadyBroadcast(java.lang.String pkg, java.lang.String cls) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(pkg);
          _data.writeString(cls);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sendReportReadyBroadcast, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      /** Return the list of pending approvals. */
      @Override public java.util.List<java.lang.String> getPendingReports() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<java.lang.String> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPendingReports, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createStringArrayList();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * The user has authorized the report to be shared.
       * 
       * @param uri the report.
       */
      @Override public void approveReport(java.lang.String uri) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uri);
          boolean _status = mRemote.transact(Stub.TRANSACTION_approveReport, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * The user has denied the report from being shared.
       * 
       * @param uri the report.
       */
      @Override public void denyReport(java.lang.String uri) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uri);
          boolean _status = mRemote.transact(Stub.TRANSACTION_denyReport, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * List the incident reports for the given ComponentName.  The receiver
       * must be for a package inside the caller.
       */
      @Override public java.util.List<java.lang.String> getIncidentReportList(java.lang.String pkg, java.lang.String cls) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<java.lang.String> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(pkg);
          _data.writeString(cls);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getIncidentReportList, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createStringArrayList();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /** Get the IncidentReport object. */
      @Override public android.os.IncidentManager.IncidentReport getIncidentReport(java.lang.String pkg, java.lang.String cls, java.lang.String id) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.os.IncidentManager.IncidentReport _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(pkg);
          _data.writeString(cls);
          _data.writeString(id);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getIncidentReport, _data, _reply, 0);
          _reply.readException();
          _result = _Parcel.readTypedObject(_reply, android.os.IncidentManager.IncidentReport.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /** Signal that the client is done with this incident report and it can be deleted. */
      @Override public void deleteIncidentReports(java.lang.String pkg, java.lang.String cls, java.lang.String id) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(pkg);
          _data.writeString(cls);
          _data.writeString(id);
          boolean _status = mRemote.transact(Stub.TRANSACTION_deleteIncidentReports, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * Signal that the client is done with all incident reports from this package.
       * Especially useful for testing.
       */
      @Override public void deleteAllIncidentReports(java.lang.String pkg) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(pkg);
          boolean _status = mRemote.transact(Stub.TRANSACTION_deleteAllIncidentReports, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_authorizeReport = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_cancelAuthorization = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_sendReportReadyBroadcast = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_getPendingReports = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_approveReport = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_denyReport = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_getIncidentReportList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_getIncidentReport = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_deleteIncidentReports = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_deleteAllIncidentReports = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android.os.IIncidentCompanion";
  /**
   * Request an authorization for an incident or bug report.
   * // TODO(b/111441001): Add the permission
   * <p>
   * This function requires the ___ permission.
   * 
   * @param callingUid The original application that requested the report.  This function
   *      returns via the callback whether the application should be trusted.  It is up
   *      to the caller to actually implement the restriction to take or not take
   *      the incident or bug report.
   * @param receiverClass The class that will be the eventual broacast receiver for the
   *      INCIDENT_REPORT_READY message. Used as part of the id in incidentd.
   * @param reportId The incident report ID.  Incidentd should call with this parameter, but
   *     everyone else should pass null or empty string.
   * @param flags FLAG_CONFIRMATION_DIALOG (0x1) - to show this as a dialog.  Otherwise
   *      a dialog will be shown as a notification.
   * @param callback Interface to receive results.  The results may not come back for
   *      a long (user's choice) time, or ever (if they never respond to the notification).
   *      Authorization requests are not persisted across reboot.  It is up to the calling
   *      service to request another authorization after reboot if they still would like
   *      to send their report.
   */
  public void authorizeReport(int callingUid, java.lang.String callingPackage, java.lang.String receiverClass, java.lang.String reportId, int flags, android.os.IIncidentAuthListener callback) throws android.os.RemoteException;
  /** Cancel an authorization. */
  public void cancelAuthorization(android.os.IIncidentAuthListener callback) throws android.os.RemoteException;
  /** Send the report ready broadcast on behalf of incidentd. */
  public void sendReportReadyBroadcast(java.lang.String pkg, java.lang.String cls) throws android.os.RemoteException;
  /** Return the list of pending approvals. */
  public java.util.List<java.lang.String> getPendingReports() throws android.os.RemoteException;
  /**
   * The user has authorized the report to be shared.
   * 
   * @param uri the report.
   */
  public void approveReport(java.lang.String uri) throws android.os.RemoteException;
  /**
   * The user has denied the report from being shared.
   * 
   * @param uri the report.
   */
  public void denyReport(java.lang.String uri) throws android.os.RemoteException;
  /**
   * List the incident reports for the given ComponentName.  The receiver
   * must be for a package inside the caller.
   */
  public java.util.List<java.lang.String> getIncidentReportList(java.lang.String pkg, java.lang.String cls) throws android.os.RemoteException;
  /** Get the IncidentReport object. */
  public android.os.IncidentManager.IncidentReport getIncidentReport(java.lang.String pkg, java.lang.String cls, java.lang.String id) throws android.os.RemoteException;
  /** Signal that the client is done with this incident report and it can be deleted. */
  public void deleteIncidentReports(java.lang.String pkg, java.lang.String cls, java.lang.String id) throws android.os.RemoteException;
  /**
   * Signal that the client is done with all incident reports from this package.
   * Especially useful for testing.
   */
  public void deleteAllIncidentReports(java.lang.String pkg) throws android.os.RemoteException;
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
