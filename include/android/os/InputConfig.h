/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /opt/android-sdk/build-tools/37.0.0/aidl --lang=cpp -I/pp/apex/frameworks_native/src/ext-frameworks-native/libs/input -I/pp/apex/frameworks_native/src/ext-frameworks-native/libs/gui -I/pp/apex/frameworks_native/src/ext-frameworks-native/libs/gui/aidl -h /pp/apex/frameworks_native/src/ext-frameworks-native/include_gen -o /pp/apex/frameworks_native/src/ext-frameworks-native/include_gen/src /pp/apex/frameworks_native/src/ext-frameworks-native/libs/input/android/os/IInputFlinger.aidl /pp/apex/frameworks_native/src/ext-frameworks-native/libs/input/android/os/InputChannelCore.aidl /pp/apex/frameworks_native/src/ext-frameworks-native/libs/input/android/os/InputEventInjectionResult.aidl /pp/apex/frameworks_native/src/ext-frameworks-native/libs/input/android/os/InputEventInjectionSync.aidl /pp/apex/frameworks_native/src/ext-frameworks-native/libs/input/android/os/IInputConstants.aidl /pp/apex/frameworks_native/src/ext-frameworks-native/libs/input/android/os/InputConfig.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
#pragma once

#include <array>
#include <binder/Enums.h>
#include <cstdint>
#include <string>

namespace android {
namespace os {
enum class InputConfig : int32_t {
  DEFAULT = 0,
  NO_INPUT_CHANNEL = 1,
  NOT_VISIBLE = 2,
  NOT_FOCUSABLE = 4,
  NOT_TOUCHABLE = 8,
  PREVENT_SPLITTING = 16,
  DUPLICATE_TOUCH_TO_WALLPAPER = 32,
  IS_WALLPAPER = 64,
  PAUSE_DISPATCHING = 128,
  TRUSTED_OVERLAY = 256,
  WATCH_OUTSIDE_TOUCH = 512,
  SLIPPERY = 1024,
  DISABLE_USER_ACTIVITY = 2048,
  DROP_INPUT = 4096,
  DROP_INPUT_IF_OBSCURED = 8192,
  SPY = 16384,
  INTERCEPTS_STYLUS = 32768,
  CLONE = 65536,
  GLOBAL_STYLUS_BLOCKS_TOUCH = 131072,
};
}  // namespace os
}  // namespace android
namespace android {
namespace os {
[[nodiscard]] static inline std::string toString(InputConfig val) {
  switch(val) {
  case InputConfig::DEFAULT:
    return "DEFAULT";
  case InputConfig::NO_INPUT_CHANNEL:
    return "NO_INPUT_CHANNEL";
  case InputConfig::NOT_VISIBLE:
    return "NOT_VISIBLE";
  case InputConfig::NOT_FOCUSABLE:
    return "NOT_FOCUSABLE";
  case InputConfig::NOT_TOUCHABLE:
    return "NOT_TOUCHABLE";
  case InputConfig::PREVENT_SPLITTING:
    return "PREVENT_SPLITTING";
  case InputConfig::DUPLICATE_TOUCH_TO_WALLPAPER:
    return "DUPLICATE_TOUCH_TO_WALLPAPER";
  case InputConfig::IS_WALLPAPER:
    return "IS_WALLPAPER";
  case InputConfig::PAUSE_DISPATCHING:
    return "PAUSE_DISPATCHING";
  case InputConfig::TRUSTED_OVERLAY:
    return "TRUSTED_OVERLAY";
  case InputConfig::WATCH_OUTSIDE_TOUCH:
    return "WATCH_OUTSIDE_TOUCH";
  case InputConfig::SLIPPERY:
    return "SLIPPERY";
  case InputConfig::DISABLE_USER_ACTIVITY:
    return "DISABLE_USER_ACTIVITY";
  case InputConfig::DROP_INPUT:
    return "DROP_INPUT";
  case InputConfig::DROP_INPUT_IF_OBSCURED:
    return "DROP_INPUT_IF_OBSCURED";
  case InputConfig::SPY:
    return "SPY";
  case InputConfig::INTERCEPTS_STYLUS:
    return "INTERCEPTS_STYLUS";
  case InputConfig::CLONE:
    return "CLONE";
  case InputConfig::GLOBAL_STYLUS_BLOCKS_TOUCH:
    return "GLOBAL_STYLUS_BLOCKS_TOUCH";
  default:
    return std::to_string(static_cast<int32_t>(val));
  }
}
}  // namespace os
}  // namespace android
namespace android {
namespace internal {
#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wc++17-extensions"
template <>
constexpr inline std::array<::android::os::InputConfig, 19> enum_values<::android::os::InputConfig> = {
  ::android::os::InputConfig::DEFAULT,
  ::android::os::InputConfig::NO_INPUT_CHANNEL,
  ::android::os::InputConfig::NOT_VISIBLE,
  ::android::os::InputConfig::NOT_FOCUSABLE,
  ::android::os::InputConfig::NOT_TOUCHABLE,
  ::android::os::InputConfig::PREVENT_SPLITTING,
  ::android::os::InputConfig::DUPLICATE_TOUCH_TO_WALLPAPER,
  ::android::os::InputConfig::IS_WALLPAPER,
  ::android::os::InputConfig::PAUSE_DISPATCHING,
  ::android::os::InputConfig::TRUSTED_OVERLAY,
  ::android::os::InputConfig::WATCH_OUTSIDE_TOUCH,
  ::android::os::InputConfig::SLIPPERY,
  ::android::os::InputConfig::DISABLE_USER_ACTIVITY,
  ::android::os::InputConfig::DROP_INPUT,
  ::android::os::InputConfig::DROP_INPUT_IF_OBSCURED,
  ::android::os::InputConfig::SPY,
  ::android::os::InputConfig::INTERCEPTS_STYLUS,
  ::android::os::InputConfig::CLONE,
  ::android::os::InputConfig::GLOBAL_STYLUS_BLOCKS_TOUCH,
};
#pragma clang diagnostic pop
}  // namespace internal
}  // namespace android
