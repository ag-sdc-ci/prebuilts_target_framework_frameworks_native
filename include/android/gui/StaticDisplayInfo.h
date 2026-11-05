/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /opt/android-sdk/build-tools/37.0.0/aidl --lang=cpp -I. -Iaidl -Iaosp -h gen/include -o gen/src aidl/android/gui/ARect.aidl aidl/android/gui/CachingHint.aidl aidl/android/gui/Color.aidl aidl/android/gui/CompositionPreference.aidl aidl/android/gui/ContentSamplingAttributes.aidl aidl/android/gui/CreateSurfaceResult.aidl aidl/android/gui/DisplayBrightness.aidl aidl/android/gui/DisplayConnectionType.aidl aidl/android/gui/DisplayDecorationSupport.aidl aidl/android/gui/DisplayPrimaries.aidl aidl/android/gui/DisplayStatInfo.aidl aidl/android/gui/DisplayState.aidl aidl/android/gui/DisplayedFrameStats.aidl aidl/android/gui/FrameEvent.aidl aidl/android/gui/FrameStats.aidl aidl/android/gui/HdrCapabilities.aidl aidl/android/gui/HdrConversionCapability.aidl aidl/android/gui/HdrConversionStrategy.aidl aidl/android/gui/IDisplayEventConnection.aidl aidl/android/gui/IFpsListener.aidl aidl/android/gui/IHdrConversionConstants.aidl aidl/android/gui/IHdrLayerInfoListener.aidl aidl/android/gui/IRegionSamplingListener.aidl aidl/android/gui/IScreenCaptureListener.aidl aidl/android/gui/ITunnelModeEnabledListener.aidl aidl/android/gui/PullAtomData.aidl aidl/android/gui/Rotation.aidl aidl/android/gui/SchedulingPolicy.aidl aidl/android/gui/Size.aidl aidl/android/gui/TrustedPresentationThresholds.aidl aidl/android/gui/WindowInfosListenerInfo.aidl aidl/android/gui/BitTube.aidl aidl/android/gui/CaptureArgs.aidl aidl/android/gui/DeviceProductInfo.aidl aidl/android/gui/DisplayCaptureArgs.aidl aidl/android/gui/DisplayMode.aidl aidl/android/gui/DisplayModeSpecs.aidl aidl/android/gui/DynamicDisplayInfo.aidl aidl/android/gui/FrameTimelineInfo.aidl aidl/android/gui/ISurfaceComposer.aidl aidl/android/gui/ISurfaceComposerClient.aidl aidl/android/gui/LayerCaptureArgs.aidl aidl/android/gui/LayerDebugInfo.aidl aidl/android/gui/LayerMetadata.aidl aidl/android/gui/OverlayProperties.aidl aidl/android/gui/ParcelableVsyncEventData.aidl aidl/android/gui/ScreenCaptureResults.aidl aidl/android/gui/StaticDisplayInfo.aidl android/gui/DropInputMode.aidl android/gui/FocusRequest.aidl android/gui/IWindowInfosListener.aidl android/gui/IWindowInfosPublisher.aidl android/gui/IWindowInfosReportedListener.aidl android/gui/InputApplicationInfo.aidl android/gui/StalledTransactionInfo.aidl android/gui/TouchOcclusionMode.aidl android/gui/DisplayInfo.aidl android/gui/WindowInfo.aidl android/gui/WindowInfosUpdate.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
#pragma once

#include <android/binder_to_string.h>
#include <android/gui/DeviceProductInfo.h>
#include <android/gui/DisplayConnectionType.h>
#include <android/gui/Rotation.h>
#include <binder/Parcel.h>
#include <binder/Status.h>
#include <optional>
#include <tuple>
#include <utils/String16.h>

namespace android::gui {
class DeviceProductInfo;
}  // namespace android::gui
namespace android {
namespace gui {
class LIBBINDER_EXPORTED StaticDisplayInfo : public ::android::Parcelable {
public:
  ::android::gui::DisplayConnectionType connectionType = ::android::gui::DisplayConnectionType::Internal;
  float density = 0.000000f;
  bool secure = false;
  ::std::optional<::android::gui::DeviceProductInfo> deviceProductInfo;
  ::android::gui::Rotation installOrientation = ::android::gui::Rotation::Rotation0;
  inline bool operator==(const StaticDisplayInfo& _rhs) const {
    return std::tie(connectionType, density, secure, deviceProductInfo, installOrientation) == std::tie(_rhs.connectionType, _rhs.density, _rhs.secure, _rhs.deviceProductInfo, _rhs.installOrientation);
  }
  inline bool operator<(const StaticDisplayInfo& _rhs) const {
    return std::tie(connectionType, density, secure, deviceProductInfo, installOrientation) < std::tie(_rhs.connectionType, _rhs.density, _rhs.secure, _rhs.deviceProductInfo, _rhs.installOrientation);
  }
  inline bool operator!=(const StaticDisplayInfo& _rhs) const {
    return !(*this == _rhs);
  }
  inline bool operator>(const StaticDisplayInfo& _rhs) const {
    return _rhs < *this;
  }
  inline bool operator>=(const StaticDisplayInfo& _rhs) const {
    return !(*this < _rhs);
  }
  inline bool operator<=(const StaticDisplayInfo& _rhs) const {
    return !(_rhs < *this);
  }

  ::android::status_t readFromParcel(const ::android::Parcel* _aidl_parcel) final;
  ::android::status_t writeToParcel(::android::Parcel* _aidl_parcel) const final;
  static const ::android::String16& getParcelableDescriptor() {
    [[clang::no_destroy]] static const ::android::StaticString16 DESCRIPTOR (u"android.gui.StaticDisplayInfo");
    return DESCRIPTOR;
  }
  inline std::string toString() const {
    std::ostringstream _aidl_os;
    _aidl_os << "StaticDisplayInfo{";
    _aidl_os << "connectionType: " << ::android::internal::ToString(connectionType);
    _aidl_os << ", density: " << ::android::internal::ToString(density);
    _aidl_os << ", secure: " << ::android::internal::ToString(secure);
    _aidl_os << ", deviceProductInfo: " << ::android::internal::ToString(deviceProductInfo);
    _aidl_os << ", installOrientation: " << ::android::internal::ToString(installOrientation);
    _aidl_os << "}";
    return _aidl_os.str();
  }
};  // class StaticDisplayInfo
}  // namespace gui
}  // namespace android
