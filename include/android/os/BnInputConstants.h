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
#include <android/os/IInputConstants.h>
#include <android/os/BnInputConstants.h>
#include <binder/Delegate.h>


namespace android {
namespace os {
class LIBBINDER_EXPORTED BnInputConstants : public ::android::BnInterface<IInputConstants> {
public:
  explicit BnInputConstants();
  ::android::status_t onTransact(uint32_t _aidl_code, const ::android::Parcel& _aidl_data, ::android::Parcel* _aidl_reply, uint32_t _aidl_flags) override;
};  // class BnInputConstants

class LIBBINDER_EXPORTED IInputConstantsDelegator : public BnInputConstants {
public:
  explicit IInputConstantsDelegator(const ::android::sp<IInputConstants> &impl) : _aidl_delegate(impl) {}

  ::android::sp<IInputConstants> getImpl() { return _aidl_delegate; }
private:
  ::android::sp<IInputConstants> _aidl_delegate;
};  // class IInputConstantsDelegator
}  // namespace os
}  // namespace android
