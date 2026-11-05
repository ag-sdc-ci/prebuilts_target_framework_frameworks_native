/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/frameworks/native/aidl-gen/guiconstants -I /home/shadichy/Documents/bliss/los-21/frameworks/native/libs/gui /home/shadichy/Documents/bliss/los-21/frameworks/native/libs/gui/android/gui/TouchOcclusionMode.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.gui;
/**
 * Touch occlusion modes: These modes represent how windows are taken into
 * consideration in order to decide whether to block obscured touches or
 * not.
 * 
 * @hide
 */
public @interface TouchOcclusionMode {
  /**
   * Touches that pass through this window will be blocked if they are
   * consumed by a different UID and this window is not trusted.
   */
  public static final int BLOCK_UNTRUSTED = 0;
  /**
   * The window's opacity will be taken into consideration for touch
   * occlusion rules if the touch passes through it and the window is not
   * trusted.
   */
  public static final int USE_OPACITY = 1;
  /**
   * The window won't count for touch occlusion rules if the touch passes
   * through it.
   */
  public static final int ALLOW = 2;
  public static final int ftl_last = 2;
}
