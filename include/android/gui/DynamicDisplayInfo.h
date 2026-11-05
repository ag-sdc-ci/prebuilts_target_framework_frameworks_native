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
#include <android/gui/DisplayMode.h>
#include <android/gui/HdrCapabilities.h>
#include <binder/Parcel.h>
#include <binder/Status.h>
#include <cstdint>
#include <tuple>
#include <utils/String16.h>
#include <vector>

namespace android::gui {
class DisplayMode;
class HdrCapabilities;
}  // namespace android::gui
namespace android {
namespace gui {
class LIBBINDER_EXPORTED DynamicDisplayInfo : public ::android::Parcelable {
public:
  ::std::vector<::android::gui::DisplayMode> supportedDisplayModes;
  int32_t activeDisplayModeId = 0;
  float renderFrameRate = 0.000000f;
  ::std::vector<int32_t> supportedColorModes;
  int32_t activeColorMode = 0;
  ::android::gui::HdrCapabilities hdrCapabilities;
  bool autoLowLatencyModeSupported = false;
  bool gameContentTypeSupported = false;
  int32_t preferredBootDisplayMode = 0;
  inline bool operator==(const DynamicDisplayInfo& _rhs) const {
    return std::tie(supportedDisplayModes, activeDisplayModeId, renderFrameRate, supportedColorModes, activeColorMode, hdrCapabilities, autoLowLatencyModeSupported, gameContentTypeSupported, preferredBootDisplayMode) == std::tie(_rhs.supportedDisplayModes, _rhs.activeDisplayModeId, _rhs.renderFrameRate, _rhs.supportedColorModes, _rhs.activeColorMode, _rhs.hdrCapabilities, _rhs.autoLowLatencyModeSupported, _rhs.gameContentTypeSupported, _rhs.preferredBootDisplayMode);
  }
  inline bool operator<(const DynamicDisplayInfo& _rhs) const {
    return std::tie(supportedDisplayModes, activeDisplayModeId, renderFrameRate, supportedColorModes, activeColorMode, hdrCapabilities, autoLowLatencyModeSupported, gameContentTypeSupported, preferredBootDisplayMode) < std::tie(_rhs.supportedDisplayModes, _rhs.activeDisplayModeId, _rhs.renderFrameRate, _rhs.supportedColorModes, _rhs.activeColorMode, _rhs.hdrCapabilities, _rhs.autoLowLatencyModeSupported, _rhs.gameContentTypeSupported, _rhs.preferredBootDisplayMode);
  }
  inline bool operator!=(const DynamicDisplayInfo& _rhs) const {
    return !(*this == _rhs);
  }
  inline bool operator>(const DynamicDisplayInfo& _rhs) const {
    return _rhs < *this;
  }
  inline bool operator>=(const DynamicDisplayInfo& _rhs) const {
    return !(*this < _rhs);
  }
  inline bool operator<=(const DynamicDisplayInfo& _rhs) const {
    return !(_rhs < *this);
  }

  ::android::status_t readFromParcel(const ::android::Parcel* _aidl_parcel) final;
  ::android::status_t writeToParcel(::android::Parcel* _aidl_parcel) const final;
  static const ::android::String16& getParcelableDescriptor() {
    [[clang::no_destroy]] static const ::android::StaticString16 DESCRIPTOR (u"android.gui.DynamicDisplayInfo");
    return DESCRIPTOR;
  }
  inline std::string toString() const {
    std::ostringstream _aidl_os;
    _aidl_os << "DynamicDisplayInfo{";
    _aidl_os << "supportedDisplayModes: " << ::android::internal::ToString(supportedDisplayModes);
    _aidl_os << ", activeDisplayModeId: " << ::android::internal::ToString(activeDisplayModeId);
    _aidl_os << ", renderFrameRate: " << ::android::internal::ToString(renderFrameRate);
    _aidl_os << ", supportedColorModes: " << ::android::internal::ToString(supportedColorModes);
    _aidl_os << ", activeColorMode: " << ::android::internal::ToString(activeColorMode);
    _aidl_os << ", hdrCapabilities: " << ::android::internal::ToString(hdrCapabilities);
    _aidl_os << ", autoLowLatencyModeSupported: " << ::android::internal::ToString(autoLowLatencyModeSupported);
    _aidl_os << ", gameContentTypeSupported: " << ::android::internal::ToString(gameContentTypeSupported);
    _aidl_os << ", preferredBootDisplayMode: " << ::android::internal::ToString(preferredBootDisplayMode);
    _aidl_os << "}";
    return _aidl_os.str();
  }
};  // class DynamicDisplayInfo
}  // namespace gui
}  // namespace android
