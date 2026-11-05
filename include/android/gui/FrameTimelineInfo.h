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
#include <binder/Parcel.h>
#include <binder/Status.h>
#include <cstdint>
#include <tuple>
#include <utils/String16.h>

namespace android {
namespace gui {
class LIBBINDER_EXPORTED FrameTimelineInfo : public ::android::Parcelable {
public:
  int64_t vsyncId = -1L;
  int32_t inputEventId = 0;
  int64_t startTimeNanos = 0L;
  bool useForRefreshRateSelection = false;
  int64_t skippedFrameVsyncId = -1L;
  int64_t skippedFrameStartTimeNanos = 0L;
  inline bool operator==(const FrameTimelineInfo& _rhs) const {
    return std::tie(vsyncId, inputEventId, startTimeNanos, useForRefreshRateSelection, skippedFrameVsyncId, skippedFrameStartTimeNanos) == std::tie(_rhs.vsyncId, _rhs.inputEventId, _rhs.startTimeNanos, _rhs.useForRefreshRateSelection, _rhs.skippedFrameVsyncId, _rhs.skippedFrameStartTimeNanos);
  }
  inline bool operator<(const FrameTimelineInfo& _rhs) const {
    return std::tie(vsyncId, inputEventId, startTimeNanos, useForRefreshRateSelection, skippedFrameVsyncId, skippedFrameStartTimeNanos) < std::tie(_rhs.vsyncId, _rhs.inputEventId, _rhs.startTimeNanos, _rhs.useForRefreshRateSelection, _rhs.skippedFrameVsyncId, _rhs.skippedFrameStartTimeNanos);
  }
  inline bool operator!=(const FrameTimelineInfo& _rhs) const {
    return !(*this == _rhs);
  }
  inline bool operator>(const FrameTimelineInfo& _rhs) const {
    return _rhs < *this;
  }
  inline bool operator>=(const FrameTimelineInfo& _rhs) const {
    return !(*this < _rhs);
  }
  inline bool operator<=(const FrameTimelineInfo& _rhs) const {
    return !(_rhs < *this);
  }

  enum : int64_t { INVALID_VSYNC_ID = -1L };
  ::android::status_t readFromParcel(const ::android::Parcel* _aidl_parcel) final;
  ::android::status_t writeToParcel(::android::Parcel* _aidl_parcel) const final;
  static const ::android::String16& getParcelableDescriptor() {
    [[clang::no_destroy]] static const ::android::StaticString16 DESCRIPTOR (u"android.gui.FrameTimelineInfo");
    return DESCRIPTOR;
  }
  inline std::string toString() const {
    std::ostringstream _aidl_os;
    _aidl_os << "FrameTimelineInfo{";
    _aidl_os << "vsyncId: " << ::android::internal::ToString(vsyncId);
    _aidl_os << ", inputEventId: " << ::android::internal::ToString(inputEventId);
    _aidl_os << ", startTimeNanos: " << ::android::internal::ToString(startTimeNanos);
    _aidl_os << ", useForRefreshRateSelection: " << ::android::internal::ToString(useForRefreshRateSelection);
    _aidl_os << ", skippedFrameVsyncId: " << ::android::internal::ToString(skippedFrameVsyncId);
    _aidl_os << ", skippedFrameStartTimeNanos: " << ::android::internal::ToString(skippedFrameStartTimeNanos);
    _aidl_os << "}";
    return _aidl_os.str();
  }
};  // class FrameTimelineInfo
}  // namespace gui
}  // namespace android
