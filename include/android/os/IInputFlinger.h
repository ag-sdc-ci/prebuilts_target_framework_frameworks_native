/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /opt/android-sdk/build-tools/37.0.0/aidl --lang=cpp -I/pp/apex/frameworks_native/src/ext-frameworks-native/libs/input -I/pp/apex/frameworks_native/src/ext-frameworks-native/libs/gui -I/pp/apex/frameworks_native/src/ext-frameworks-native/libs/gui/aidl -h /pp/apex/frameworks_native/src/ext-frameworks-native/include_gen -o /pp/apex/frameworks_native/src/ext-frameworks-native/include_gen/src /pp/apex/frameworks_native/src/ext-frameworks-native/libs/input/android/os/IInputFlinger.aidl /pp/apex/frameworks_native/src/ext-frameworks-native/libs/input/android/os/InputChannelCore.aidl /pp/apex/frameworks_native/src/ext-frameworks-native/libs/input/android/os/InputEventInjectionResult.aidl /pp/apex/frameworks_native/src/ext-frameworks-native/libs/input/android/os/InputEventInjectionSync.aidl /pp/apex/frameworks_native/src/ext-frameworks-native/libs/input/android/os/IInputConstants.aidl /pp/apex/frameworks_native/src/ext-frameworks-native/libs/input/android/os/InputConfig.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
#pragma once

#include <android/gui/FocusRequest.h>
#include <android/os/InputChannelCore.h>
#include <binder/IBinder.h>
#include <binder/IInterface.h>
#include <binder/Status.h>
#include <string>
#include <utils/StrongPointer.h>

namespace android::gui {
class FocusRequest;
}  // namespace android::gui
namespace android::os {
class InputChannelCore;
}  // namespace android::os
namespace android {
namespace os {
class LIBBINDER_EXPORTED IInputFlingerDelegator;

class LIBBINDER_EXPORTED IInputFlinger : public ::android::IInterface {
public:
  typedef IInputFlingerDelegator DefaultDelegator;
  DECLARE_META_INTERFACE(InputFlinger)
  virtual ::android::binder::Status createInputChannel(const ::std::string& name, ::android::os::InputChannelCore* _aidl_return) = 0;
  virtual ::android::binder::Status removeInputChannel(const ::android::sp<::android::IBinder>& connectionToken) = 0;
  virtual ::android::binder::Status setFocusedWindow(const ::android::gui::FocusRequest& request) = 0;
};  // class IInputFlinger

class LIBBINDER_EXPORTED IInputFlingerDefault : public IInputFlinger {
public:
  ::android::IBinder* onAsBinder() override {
    return nullptr;
  }
  ::android::binder::Status createInputChannel(const ::std::string& /*name*/, ::android::os::InputChannelCore* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status removeInputChannel(const ::android::sp<::android::IBinder>& /*connectionToken*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status setFocusedWindow(const ::android::gui::FocusRequest& /*request*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
};  // class IInputFlingerDefault
}  // namespace os
}  // namespace android
