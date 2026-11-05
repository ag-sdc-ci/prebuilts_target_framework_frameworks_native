/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/frameworks/native/aidl-gen/inputconstants -I /home/shadichy/Documents/bliss/los-21/frameworks/native/libs/input /home/shadichy/Documents/bliss/los-21/frameworks/native/libs/input/android/os/InputEventInjectionSync.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.os;
/**
 * Constants used to specify the input event injection synchronization mode.
 * 
 * @hide
 */
public @interface InputEventInjectionSync {
  /** Injection is asynchronous and is assumed always to be successful. */
  public static final int NONE = 0;
  /**
   * Waits for previous events to be dispatched so that the input dispatcher can determine
   * whether input event injection willbe permitted based on the current input focus.
   * Does not wait for the input event to finish processing.
   */
  public static final int WAIT_FOR_RESULT = 1;
  /** Waits for the input event to be completely processed. */
  public static final int WAIT_FOR_FINISHED = 2;
  public static final int ftl_first = 0;
  public static final int ftl_last = 2;
}
