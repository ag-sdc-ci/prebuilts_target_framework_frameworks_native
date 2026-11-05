/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /opt/android-sdk/build-tools/37.0.0/aidl --lang=cpp -I/pp/apex/frameworks_native/src/ext-frameworks-native/libs/input -I/pp/apex/frameworks_native/src/ext-frameworks-native/libs/gui -I/pp/apex/frameworks_native/src/ext-frameworks-native/libs/gui/aidl -h /pp/apex/frameworks_native/src/ext-frameworks-native/include_gen -o /pp/apex/frameworks_native/src/ext-frameworks-native/include_gen/src /pp/apex/frameworks_native/src/ext-frameworks-native/libs/input/android/os/IInputFlinger.aidl /pp/apex/frameworks_native/src/ext-frameworks-native/libs/input/android/os/InputChannelCore.aidl /pp/apex/frameworks_native/src/ext-frameworks-native/libs/input/android/os/InputEventInjectionResult.aidl /pp/apex/frameworks_native/src/ext-frameworks-native/libs/input/android/os/InputEventInjectionSync.aidl /pp/apex/frameworks_native/src/ext-frameworks-native/libs/input/android/os/IInputConstants.aidl /pp/apex/frameworks_native/src/ext-frameworks-native/libs/input/android/os/InputConfig.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
#pragma once

#include <binder/IBinder.h>
#include <binder/IInterface.h>
#include <binder/Status.h>
#include <cstdint>
#include <utils/StrongPointer.h>

namespace android {
namespace os {
class LIBBINDER_EXPORTED IInputConstantsDelegator;

class LIBBINDER_EXPORTED IInputConstants : public ::android::IInterface {
public:
  typedef IInputConstantsDelegator DefaultDelegator;
  DECLARE_META_INTERFACE(InputConstants)
  enum : int32_t { UNMULTIPLIED_DEFAULT_DISPATCHING_TIMEOUT_MILLIS = 5000 };
  enum : int32_t { INVALID_BATTERY_CAPACITY = -1 };
  enum : int32_t { INVALID_INPUT_EVENT_ID = 0 };
  enum : int32_t { INVALID_INPUT_DEVICE_ID = -2 };
  enum : int32_t { POLICY_FLAG_INJECTED_FROM_ACCESSIBILITY = 131072 };
  enum : int32_t { INPUT_EVENT_FLAG_IS_ACCESSIBILITY_EVENT = 2048 };
  enum : int32_t { DEFAULT_POINTER_ACCELERATION = 3 };
  enum : int32_t { VELOCITY_TRACKER_STRATEGY_DEFAULT = -1 };
  enum : int32_t { VELOCITY_TRACKER_STRATEGY_IMPULSE = 0 };
  enum : int32_t { VELOCITY_TRACKER_STRATEGY_LSQ1 = 1 };
  enum : int32_t { VELOCITY_TRACKER_STRATEGY_LSQ2 = 2 };
  enum : int32_t { VELOCITY_TRACKER_STRATEGY_LSQ3 = 3 };
  enum : int32_t { VELOCITY_TRACKER_STRATEGY_WLSQ2_DELTA = 4 };
  enum : int32_t { VELOCITY_TRACKER_STRATEGY_WLSQ2_CENTRAL = 5 };
  enum : int32_t { VELOCITY_TRACKER_STRATEGY_WLSQ2_RECENT = 6 };
  enum : int32_t { VELOCITY_TRACKER_STRATEGY_INT1 = 7 };
  enum : int32_t { VELOCITY_TRACKER_STRATEGY_INT2 = 8 };
  enum : int32_t { VELOCITY_TRACKER_STRATEGY_LEGACY = 9 };
};  // class IInputConstants

class LIBBINDER_EXPORTED IInputConstantsDefault : public IInputConstants {
public:
  ::android::IBinder* onAsBinder() override {
    return nullptr;
  }
};  // class IInputConstantsDefault
}  // namespace os
}  // namespace android
