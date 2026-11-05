/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/frameworks/native/aidl-gen/inputconstants -I /home/shadichy/Documents/bliss/los-21/frameworks/native/libs/input /home/shadichy/Documents/bliss/los-21/frameworks/native/libs/input/android/os/IInputConstants.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.os;
/** @hide */
public interface IInputConstants extends android.os.IInterface
{
  /** Default implementation for IInputConstants. */
  public static class Default implements android.os.IInputConstants
  {
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.os.IInputConstants
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.os.IInputConstants interface,
     * generating a proxy if needed.
     */
    public static android.os.IInputConstants asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.os.IInputConstants))) {
        return ((android.os.IInputConstants)iin);
      }
      return new android.os.IInputConstants.Stub.Proxy(obj);
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
    private static final class Proxy implements android.os.IInputConstants
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
  public static final java.lang.String DESCRIPTOR = "android.os.IInputConstants";
  // This should be multiplied by the value of the system property ro.hw_timeout_multiplier before
  // use. A pre-multiplied constant is available in Java in
  // android.os.InputConstants.DEFAULT_DISPATCHING_TIMEOUT_MILLIS.
  public static final int UNMULTIPLIED_DEFAULT_DISPATCHING_TIMEOUT_MILLIS = 5000;
  // 5 seconds
  // Indicate invalid battery capacity
  public static final int INVALID_BATTERY_CAPACITY = -1;
  /**
   * Every input event has an id. This constant value is used when a valid input event id is not
   * available.
   */
  public static final int INVALID_INPUT_EVENT_ID = 0;
  /**
   * Every input device has an id. This constant value is used when a valid input device id is not
   * available.
   * The virtual keyboard uses -1 as the input device id. Therefore, we use -2 as the value for
   * an invalid input device.
   */
  public static final int INVALID_INPUT_DEVICE_ID = -2;
  /**
   * The input event was injected from accessibility. Used in policyFlags for input event
   * injection.
   */
  public static final int POLICY_FLAG_INJECTED_FROM_ACCESSIBILITY = 131072;
  /**
   * The input event was generated or modified by accessibility service.
   * Shared by both KeyEvent and MotionEvent flags, so this value should not overlap with either
   * set of flags, including in input/Input.h and in android/input.h.
   */
  public static final int INPUT_EVENT_FLAG_IS_ACCESSIBILITY_EVENT = 2048;
  /** The default pointer acceleration value. */
  public static final int DEFAULT_POINTER_ACCELERATION = 3;
  /**
   * Use the default Velocity Tracker Strategy. Different axes may use different default
   * strategies.
   */
  public static final int VELOCITY_TRACKER_STRATEGY_DEFAULT = -1;
  /**
   * Velocity Tracker Strategy: Impulse.
   * Physical model of pushing an object.  Quality: VERY GOOD.
   * Works with duplicate coordinates, unclean finger liftoff.
   */
  public static final int VELOCITY_TRACKER_STRATEGY_IMPULSE = 0;
  /**
   * Velocity Tracker Strategy: LSQ1.
   * 1st order least squares.  Quality: POOR.
   * Frequently underfits the touch data especially when the finger accelerates
   * or changes direction.  Often underestimates velocity.  The direction
   * is overly influenced by historical touch points.
   */
  public static final int VELOCITY_TRACKER_STRATEGY_LSQ1 = 1;
  /**
   * Velocity Tracker Strategy: LSQ2.
   * 2nd order least squares.  Quality: VERY GOOD.
   * Pretty much ideal, but can be confused by certain kinds of touch data,
   * particularly if the panel has a tendency to generate delayed,
   * duplicate or jittery touch coordinates when the finger is released.
   */
  public static final int VELOCITY_TRACKER_STRATEGY_LSQ2 = 2;
  /**
   * Velocity Tracker Strategy: LSQ3.
   * 3rd order least squares.  Quality: UNUSABLE.
   * Frequently overfits the touch data yielding wildly divergent estimates
   * of the velocity when the finger is released.
   */
  public static final int VELOCITY_TRACKER_STRATEGY_LSQ3 = 3;
  /**
   * Velocity Tracker Strategy: WLSQ2_DELTA.
   * 2nd order weighted least squares, delta weighting.  Quality: EXPERIMENTAL
   */
  public static final int VELOCITY_TRACKER_STRATEGY_WLSQ2_DELTA = 4;
  /**
   * Velocity Tracker Strategy: WLSQ2_CENTRAL.
   * 2nd order weighted least squares, central weighting.  Quality: EXPERIMENTALe
   */
  public static final int VELOCITY_TRACKER_STRATEGY_WLSQ2_CENTRAL = 5;
  /**
   * Velocity Tracker Strategy: WLSQ2_RECENT.
   * 2nd order weighted least squares, recent weighting.  Quality: EXPERIMENTAL
   */
  public static final int VELOCITY_TRACKER_STRATEGY_WLSQ2_RECENT = 6;
  /**
   * Velocity Tracker Strategy: INT1.
   * 1st order integrating filter.  Quality: GOOD.
   * Not as good as 'lsq2' because it cannot estimate acceleration but it is
   * more tolerant of errors.  Like 'lsq1', this strategy tends to underestimate
   * the velocity of a fling but this strategy tends to respond to changes in
   * direction more quickly and accurately.
   */
  public static final int VELOCITY_TRACKER_STRATEGY_INT1 = 7;
  /**
   * Velocity Tracker Strategy: INT2.
   * 2nd order integrating filter.  Quality: EXPERIMENTAL.
   * For comparison purposes only.  Unlike 'int1' this strategy can compensate
   * for acceleration but it typically overestimates the effect.
   */
  public static final int VELOCITY_TRACKER_STRATEGY_INT2 = 8;
  /**
   * Velocity Tracker Strategy: Legacy.
   * Legacy velocity tracker algorithm.  Quality: POOR.
   * For comparison purposes only.  This algorithm is strongly influenced by
   * old data points, consistently underestimates velocity and takes a very long
   * time to adjust to changes in direction.
   */
  public static final int VELOCITY_TRACKER_STRATEGY_LEGACY = 9;
}
