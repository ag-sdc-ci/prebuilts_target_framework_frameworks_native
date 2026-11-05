/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /opt/android-sdk/build-tools/37.0.0/aidl --lang=cpp -I/pp/apex/frameworks_native/src/ext-frameworks-native/libs/input -I/pp/apex/frameworks_native/src/ext-frameworks-native/libs/gui -I/pp/apex/frameworks_native/src/ext-frameworks-native/libs/gui/aidl -h /pp/apex/frameworks_native/src/ext-frameworks-native/include_gen -o /pp/apex/frameworks_native/src/ext-frameworks-native/include_gen/src /pp/apex/frameworks_native/src/ext-frameworks-native/libs/input/android/os/IInputFlinger.aidl /pp/apex/frameworks_native/src/ext-frameworks-native/libs/input/android/os/InputChannelCore.aidl /pp/apex/frameworks_native/src/ext-frameworks-native/libs/input/android/os/InputEventInjectionResult.aidl /pp/apex/frameworks_native/src/ext-frameworks-native/libs/input/android/os/InputEventInjectionSync.aidl /pp/apex/frameworks_native/src/ext-frameworks-native/libs/input/android/os/IInputConstants.aidl /pp/apex/frameworks_native/src/ext-frameworks-native/libs/input/android/os/InputConfig.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
#pragma once

#include <android/binder_to_string.h>
#include <binder/IBinder.h>
#include <binder/Parcel.h>
#include <binder/ParcelFileDescriptor.h>
#include <binder/Status.h>
#include <string>
#include <tuple>
#include <utils/String16.h>

namespace android {
namespace os {
class LIBBINDER_EXPORTED InputChannelCore : public ::android::Parcelable {
public:
  ::std::string name;
  ::android::os::ParcelFileDescriptor fd;
  ::android::sp<::android::IBinder> token;
  inline bool operator==(const InputChannelCore& _rhs) const {
    return std::tie(name, fd, token) == std::tie(_rhs.name, _rhs.fd, _rhs.token);
  }
  inline bool operator<(const InputChannelCore& _rhs) const {
    return std::tie(name, fd, token) < std::tie(_rhs.name, _rhs.fd, _rhs.token);
  }
  inline bool operator!=(const InputChannelCore& _rhs) const {
    return !(*this == _rhs);
  }
  inline bool operator>(const InputChannelCore& _rhs) const {
    return _rhs < *this;
  }
  inline bool operator>=(const InputChannelCore& _rhs) const {
    return !(*this < _rhs);
  }
  inline bool operator<=(const InputChannelCore& _rhs) const {
    return !(_rhs < *this);
  }

  ::android::status_t readFromParcel(const ::android::Parcel* _aidl_parcel) final;
  ::android::status_t writeToParcel(::android::Parcel* _aidl_parcel) const final;
  static const ::android::String16& getParcelableDescriptor() {
    [[clang::no_destroy]] static const ::android::StaticString16 DESCRIPTOR (u"android.os.InputChannelCore");
    return DESCRIPTOR;
  }
  inline std::string toString() const {
    std::ostringstream _aidl_os;
    _aidl_os << "InputChannelCore{";
    _aidl_os << "name: " << ::android::internal::ToString(name);
    _aidl_os << ", fd: " << ::android::internal::ToString(fd);
    _aidl_os << ", token: " << ::android::internal::ToString(token);
    _aidl_os << "}";
    return _aidl_os.str();
  }
};  // class InputChannelCore
}  // namespace os
}  // namespace android
