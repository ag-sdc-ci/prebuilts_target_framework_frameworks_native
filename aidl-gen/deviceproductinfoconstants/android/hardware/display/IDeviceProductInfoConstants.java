/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/frameworks/native/aidl-gen/deviceproductinfoconstants -I /home/shadichy/Documents/bliss/los-21/frameworks/native/aidl /home/shadichy/Documents/bliss/los-21/frameworks/native/aidl/android/hardware/display/IDeviceProductInfoConstants.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.display;
/** @hide */
public interface IDeviceProductInfoConstants extends android.os.IInterface
{
  /** Default implementation for IDeviceProductInfoConstants. */
  public static class Default implements android.hardware.display.IDeviceProductInfoConstants
  {
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.hardware.display.IDeviceProductInfoConstants
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.display.IDeviceProductInfoConstants interface,
     * generating a proxy if needed.
     */
    public static android.hardware.display.IDeviceProductInfoConstants asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.display.IDeviceProductInfoConstants))) {
        return ((android.hardware.display.IDeviceProductInfoConstants)iin);
      }
      return new android.hardware.display.IDeviceProductInfoConstants.Stub.Proxy(obj);
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
    private static final class Proxy implements android.hardware.display.IDeviceProductInfoConstants
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
  public static final java.lang.String DESCRIPTOR = "android.hardware.display.IDeviceProductInfoConstants";
  /** The device connection to the display sink is unknown. */
  public static final int CONNECTION_TO_SINK_UNKNOWN = 0;
  /** The device is built-in in the display sink. */
  public static final int CONNECTION_TO_SINK_BUILT_IN = 1;
  /** The device is directly connected to the display sink. */
  public static final int CONNECTION_TO_SINK_DIRECT = 2;
  /** The device is transitively connected to the display sink. */
  public static final int CONNECTION_TO_SINK_TRANSITIVE = 3;
}
