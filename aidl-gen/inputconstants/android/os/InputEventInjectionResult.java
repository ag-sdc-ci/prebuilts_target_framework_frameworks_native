/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/frameworks/native/aidl-gen/inputconstants -I /home/shadichy/Documents/bliss/los-21/frameworks/native/libs/input /home/shadichy/Documents/bliss/los-21/frameworks/native/libs/input/android/os/InputEventInjectionResult.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.os;
/**
 * Constants used to report the outcome of input event injection.
 * 
 * @hide
 */
public @interface InputEventInjectionResult {
  /** (INTERNAL USE ONLY) Specifies that injection is pending and its outcome is unknown. */
  public static final int PENDING = -1;
  /** Injection succeeded. */
  public static final int SUCCEEDED = 0;
  /** Injection failed because the injected event did not target the appropriate window. */
  public static final int TARGET_MISMATCH = 1;
  /** Injection failed because there were no available input targets. */
  public static final int FAILED = 2;
  /** Injection failed due to a timeout. */
  public static final int TIMED_OUT = 3;
  public static final int ftl_first = -1;
  public static final int ftl_last = 3;
}
