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
#include <utils/Errors.h>
#include <android/os/IInputFlinger.h>

namespace android {
namespace os {
class LIBBINDER_EXPORTED BpInputFlinger : public ::android::BpInterface<IInputFlinger> {
public:
  explicit BpInputFlinger(const ::android::sp<::android::IBinder>& _aidl_impl);
  virtual ~BpInputFlinger() = default;
  ::android::binder::Status createInputChannel(const ::std::string& name, ::android::os::InputChannelCore* _aidl_return) override;
  ::android::binder::Status removeInputChannel(const ::android::sp<::android::IBinder>& connectionToken) override;
  ::android::binder::Status setFocusedWindow(const ::android::gui::FocusRequest& request) override;
};  // class BpInputFlinger
}  // namespace os
}  // namespace android
