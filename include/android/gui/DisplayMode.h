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
#include <android/gui/Size.h>
#include <binder/Parcel.h>
#include <binder/Status.h>
#include <cstdint>
#include <tuple>
#include <utils/String16.h>
#include <vector>

namespace android::gui {
class Size;
}  // namespace android::gui
namespace android {
namespace gui {
class LIBBINDER_EXPORTED DisplayMode : public ::android::Parcelable {
public:
  int32_t id = 0;
  ::android::gui::Size resolution;
  float xDpi = 0.000000f;
  float yDpi = 0.000000f;
  ::std::vector<int32_t> supportedHdrTypes;
  float peakRefreshRate = 0.000000f;
  float vsyncRate = 0.000000f;
  int64_t appVsyncOffset = 0L;
  int64_t sfVsyncOffset = 0L;
  int64_t presentationDeadline = 0L;
  int32_t group = -1;
  inline bool operator==(const DisplayMode& _rhs) const {
    return std::tie(id, resolution, xDpi, yDpi, supportedHdrTypes, peakRefreshRate, vsyncRate, appVsyncOffset, sfVsyncOffset, presentationDeadline, group) == std::tie(_rhs.id, _rhs.resolution, _rhs.xDpi, _rhs.yDpi, _rhs.supportedHdrTypes, _rhs.peakRefreshRate, _rhs.vsyncRate, _rhs.appVsyncOffset, _rhs.sfVsyncOffset, _rhs.presentationDeadline, _rhs.group);
  }
  inline bool operator<(const DisplayMode& _rhs) const {
    return std::tie(id, resolution, xDpi, yDpi, supportedHdrTypes, peakRefreshRate, vsyncRate, appVsyncOffset, sfVsyncOffset, presentationDeadline, group) < std::tie(_rhs.id, _rhs.resolution, _rhs.xDpi, _rhs.yDpi, _rhs.supportedHdrTypes, _rhs.peakRefreshRate, _rhs.vsyncRate, _rhs.appVsyncOffset, _rhs.sfVsyncOffset, _rhs.presentationDeadline, _rhs.group);
  }
  inline bool operator!=(const DisplayMode& _rhs) const {
    return !(*this == _rhs);
  }
  inline bool operator>(const DisplayMode& _rhs) const {
    return _rhs < *this;
  }
  inline bool operator>=(const DisplayMode& _rhs) const {
    return !(*this < _rhs);
  }
  inline bool operator<=(const DisplayMode& _rhs) const {
    return !(_rhs < *this);
  }

  ::android::status_t readFromParcel(const ::android::Parcel* _aidl_parcel) final;
  ::android::status_t writeToParcel(::android::Parcel* _aidl_parcel) const final;
  static const ::android::String16& getParcelableDescriptor() {
    [[clang::no_destroy]] static const ::android::StaticString16 DESCRIPTOR (u"android.gui.DisplayMode");
    return DESCRIPTOR;
  }
  inline std::string toString() const {
    std::ostringstream _aidl_os;
    _aidl_os << "DisplayMode{";
    _aidl_os << "id: " << ::android::internal::ToString(id);
    _aidl_os << ", resolution: " << ::android::internal::ToString(resolution);
    _aidl_os << ", xDpi: " << ::android::internal::ToString(xDpi);
    _aidl_os << ", yDpi: " << ::android::internal::ToString(yDpi);
    _aidl_os << ", supportedHdrTypes: " << ::android::internal::ToString(supportedHdrTypes);
    _aidl_os << ", peakRefreshRate: " << ::android::internal::ToString(peakRefreshRate);
    _aidl_os << ", vsyncRate: " << ::android::internal::ToString(vsyncRate);
    _aidl_os << ", appVsyncOffset: " << ::android::internal::ToString(appVsyncOffset);
    _aidl_os << ", sfVsyncOffset: " << ::android::internal::ToString(sfVsyncOffset);
    _aidl_os << ", presentationDeadline: " << ::android::internal::ToString(presentationDeadline);
    _aidl_os << ", group: " << ::android::internal::ToString(group);
    _aidl_os << "}";
    return _aidl_os.str();
  }
};  // class DisplayMode
}  // namespace gui
}  // namespace android
