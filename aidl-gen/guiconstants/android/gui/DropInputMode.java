/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/frameworks/native/aidl-gen/guiconstants -I /home/shadichy/Documents/bliss/los-21/frameworks/native/libs/gui /home/shadichy/Documents/bliss/los-21/frameworks/native/libs/gui/android/gui/DropInputMode.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.gui;
/**
 * Input event drop modes: Input event drop options for windows and its children.
 * 
 * @hide
 */
public @interface DropInputMode {
  /** Default mode, input events are sent to the target as usual. */
  public static final int NONE = 0;
  /**
   * Window and its children will not receive any input even if it has a valid input channel.
   * Touches and keys will be dropped. If a window is focused, it will remain focused but will
   * not receive any keys. If the window has a touchable region and is the target of an input
   * event, the event will be dropped and will not go to the window behind. ref: b/197296414
   */
  public static final int ALL = 1;
  /**
   * Similar to DROP but input events are only dropped if the window is considered to be
   * obscured. ref: b/197364677
   */
  public static final int OBSCURED = 2;
}
