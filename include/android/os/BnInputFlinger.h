/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /opt/android-sdk/build-tools/37.0.0/aidl --lang=cpp -I/pp/apex/frameworks_native/src/ext-frameworks-native/libs/input -I/pp/apex/frameworks_native/src/ext-frameworks-native/libs/gui -I/pp/apex/frameworks_native/src/ext-frameworks-native/libs/gui/aidl -h /pp/apex/frameworks_native/src/ext-frameworks-native/include_gen -o /pp/apex/frameworks_native/src/ext-frameworks-native/include_gen/src /pp/apex/frameworks_native/src/ext-frameworks-native/libs/input/android/os/IInputFlinger.aidl /pp/apex/frameworks_native/src/ext-frameworks-native/libs/input/android/os/InputChannelCore.aidl /pp/apex/frameworks_native/src/ext-frameworks-native/libs/input/android/os/InputEventInjectionResult.aidl /pp/apex/frameworks_native/src/ext-frameworks-native/libs/input/android/os/InputEventInjectionSync.aidl /pp/apex/frameworks_native/src/ext-frameworks-native/libs/input/android/os/IInputConstants.aidl /pp/apex/frameworks_native/src/ext-frameworks-native/libs/input/android/os/InputConfig.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
#pragma once

#include <binder/IInterface.h>
#include <android/os/IInputFlinger.h>
#include <android/os/BnInputFlinger.h>
#include <binder/Delegate.h>


namespace android {
namespace os {
class LIBBINDER_EXPORTED BnInputFlinger : public ::android::BnInterface<IInputFlinger> {
public:
  static constexpr uint32_t TRANSACTION_createInputChannel = ::android::IBinder::FIRST_CALL_TRANSACTION + 0;
  static constexpr uint32_t TRANSACTION_removeInputChannel = ::android::IBinder::FIRST_CALL_TRANSACTION + 1;
  static constexpr uint32_t TRANSACTION_setFocusedWindow = ::android::IBinder::FIRST_CALL_TRANSACTION + 2;
  explicit BnInputFlinger();
  ::android::status_t onTransact(uint32_t _aidl_code, const ::android::Parcel& _aidl_data, ::android::Parcel* _aidl_reply, uint32_t _aidl_flags) override;
};  // class BnInputFlinger

class LIBBINDER_EXPORTED IInputFlingerDelegator : public BnInputFlinger {
public:
  explicit IInputFlingerDelegator(const ::android::sp<IInputFlinger> &impl) : _aidl_delegate(impl) {}

  ::android::sp<IInputFlinger> getImpl() { return _aidl_delegate; }
  ::android::binder::Status createInputChannel(const ::std::string& name, ::android::os::InputChannelCore* _aidl_return) override {
    return _aidl_delegate->createInputChannel(name, _aidl_return);
  }
  ::android::binder::Status removeInputChannel(const ::android::sp<::android::IBinder>& connectionToken) override {
    return _aidl_delegate->removeInputChannel(connectionToken);
  }
  ::android::binder::Status setFocusedWindow(const ::android::gui::FocusRequest& request) override {
    return _aidl_delegate->setFocusedWindow(request);
  }
private:
  ::android::sp<IInputFlinger> _aidl_delegate;
};  // class IInputFlingerDelegator
}  // namespace os
}  // namespace android
