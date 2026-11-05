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
enum class InputEventInjectionSync : int32_t {
  NONE = 0,
  WAIT_FOR_RESULT = 1,
  WAIT_FOR_FINISHED = 2,
  ftl_first = 0,
  ftl_last = 2,
};
}  // namespace os
}  // namespace android
namespace android {
namespace os {
[[nodiscard]] static inline std::string toString(InputEventInjectionSync val) {
  switch(val) {
  case InputEventInjectionSync::NONE:
    return "NONE";
  case InputEventInjectionSync::WAIT_FOR_RESULT:
    return "WAIT_FOR_RESULT";
  case InputEventInjectionSync::WAIT_FOR_FINISHED:
    return "WAIT_FOR_FINISHED";
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
constexpr inline std::array<::android::os::InputEventInjectionSync, 5> enum_values<::android::os::InputEventInjectionSync> = {
  ::android::os::InputEventInjectionSync::NONE,
  ::android::os::InputEventInjectionSync::WAIT_FOR_RESULT,
  ::android::os::InputEventInjectionSync::WAIT_FOR_FINISHED,
  ::android::os::InputEventInjectionSync::ftl_first,
  ::android::os::InputEventInjectionSync::ftl_last,
};
#pragma clang diagnostic pop
}  // namespace internal
}  // namespace android
