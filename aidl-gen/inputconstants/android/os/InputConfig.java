/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/frameworks/native/aidl-gen/inputconstants -I /home/shadichy/Documents/bliss/los-21/frameworks/native/libs/input /home/shadichy/Documents/bliss/los-21/frameworks/native/libs/input/android/os/InputConfig.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.os;
/**
 * Input configurations flags used to determine the behavior of input windows.
 * @hide
 */
public @interface InputConfig {
  /** The default InputConfig value with no flags set. */
  public static final int DEFAULT = 0;
  /**
   * Does not construct an input channel for this window.  The channel will therefore
   * be incapable of receiving input.
   */
  public static final int NO_INPUT_CHANNEL = 1;
  /**
   * Indicates that this input window is not visible, and thus will not be considered as
   * an input target and will not obscure other windows.
   */
  public static final int NOT_VISIBLE = 2;
  /**
   * Indicates that this input window cannot be a focus target, and this will not
   * receive any input events that can only be directed for the focused window, such
   * as key events.
   */
  public static final int NOT_FOCUSABLE = 4;
  /**
   * Indicates that this input window cannot receive any events directed at a
   * specific location on the screen, such as touchscreen, mouse, and stylus events.
   * The window will not be considered as a touch target, but can still obscure other
   * windows.
   */
  public static final int NOT_TOUCHABLE = 8;
  /**
   * Indicates that this window will not accept a touch event that is split between
   * more than one window. When set:
   *  - If this window receives a DOWN event with the first pointer, all successive
   *    pointers that go down, regardless of their location on the screen, will be
   *    directed to this window;
   *  - If the DOWN event lands outside the touchable bounds of this window, no
   *    successive pointers that go down, regardless of their location on the screen,
   *    will be directed to this window.
   */
  public static final int PREVENT_SPLITTING = 16;
  /**
   * Indicates that this window shows the wallpaper behind it, so all touch events
   * that it receives should also be sent to the wallpaper.
   */
  public static final int DUPLICATE_TOUCH_TO_WALLPAPER = 32;
  /** Indicates that this the wallpaper's input window. */
  public static final int IS_WALLPAPER = 64;
  /**
   * Indicates that input events should not be dispatched to this window. When set,
   * input events directed towards this window will simply be dropped, and will not
   * be dispatched to windows behind it.
   */
  public static final int PAUSE_DISPATCHING = 128;
  /**
   * This flag is set when the window is of a trusted type that is allowed to silently
   * overlay other windows for the purpose of implementing the secure views feature.
   * Trusted overlays, such as IME windows, can partly obscure other windows without causing
   * motion events to be delivered to them with AMOTION_EVENT_FLAG_WINDOW_IS_OBSCURED.
   */
  public static final int TRUSTED_OVERLAY = 256;
  /**
   * Indicates that this window wants to listen for when there is a touch DOWN event
   * that occurs outside its touchable bounds. When such an event occurs, this window
   * will receive a MotionEvent with ACTION_OUTSIDE.
   */
  public static final int WATCH_OUTSIDE_TOUCH = 512;
  /**
   * When set, this flag allows touches to leave the current window whenever the finger
   * moves above another window. When this happens, the window that touch has just left
   * (the current window) will receive ACTION_CANCEL, and the window that touch has entered
   * will receive ACTION_DOWN, and the remainder of the touch gesture will only go to the
   * new window. Without this flag, the entire gesture is sent to the current window, even
   * if the touch leaves the window's bounds.
   */
  public static final int SLIPPERY = 1024;
  /**
   * When this window has focus, does not call user activity for all input events so
   * the application will have to do it itself.
   */
  public static final int DISABLE_USER_ACTIVITY = 2048;
  /** Internal flag used to indicate that input should be dropped on this window. */
  public static final int DROP_INPUT = 4096;
  /**
   * Internal flag used to indicate that input should be dropped on this window if this window
   * is obscured.
   */
  public static final int DROP_INPUT_IF_OBSCURED = 8192;
  /**
   * An input spy window. This window will receive all pointer events within its touchable
   * area, but will not stop events from being sent to other windows below it in z-order.
   * An input event will be dispatched to all spy windows above the top non-spy window at the
   * event's coordinates.
   */
  public static final int SPY = 16384;
  /**
   * When used with {@link #NOT_TOUCHABLE}, this window will continue to receive events from
   * a stylus device within its touchable region. All other pointer events, such as from a
   * mouse or touchscreen, will be dispatched to the windows behind it.
   * 
   * This configuration has no effect when the config {@link #NOT_TOUCHABLE} is not set.
   * 
   * It is not valid to set this configuration if {@link #TRUSTED_OVERLAY} is not set.
   */
  public static final int INTERCEPTS_STYLUS = 32768;
  /**
   * The window is a clone of another window. This may be treated differently since there's
   * likely a duplicate window with the same client token, but different bounds.
   */
  public static final int CLONE = 65536;
  /**
   * If the stylus is currently down *anywhere* on the screen, new touches will not be delivered
   * to the window with this flag. This helps prevent unexpected clicks on some system windows,
   * like StatusBar and TaskBar.
   */
  public static final int GLOBAL_STYLUS_BLOCKS_TOUCH = 131072;
}
