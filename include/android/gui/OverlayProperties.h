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
#include <android/gui/OverlayProperties.h>
#include <binder/Parcel.h>
#include <binder/Status.h>
#include <cstdint>
#include <tuple>
#include <utils/String16.h>
#include <vector>

namespace android {
namespace gui {
class LIBBINDER_EXPORTED OverlayProperties : public ::android::Parcelable {
public:
  class LIBBINDER_EXPORTED SupportedBufferCombinations : public ::android::Parcelable {
  public:
    ::std::vector<int32_t> pixelFormats;
    ::std::vector<int32_t> standards;
    ::std::vector<int32_t> transfers;
    ::std::vector<int32_t> ranges;
    inline bool operator==(const SupportedBufferCombinations& _rhs) const {
      return std::tie(pixelFormats, standards, transfers, ranges) == std::tie(_rhs.pixelFormats, _rhs.standards, _rhs.transfers, _rhs.ranges);
    }
    inline bool operator<(const SupportedBufferCombinations& _rhs) const {
      return std::tie(pixelFormats, standards, transfers, ranges) < std::tie(_rhs.pixelFormats, _rhs.standards, _rhs.transfers, _rhs.ranges);
    }
    inline bool operator!=(const SupportedBufferCombinations& _rhs) const {
      return !(*this == _rhs);
    }
    inline bool operator>(const SupportedBufferCombinations& _rhs) const {
      return _rhs < *this;
    }
    inline bool operator>=(const SupportedBufferCombinations& _rhs) const {
      return !(*this < _rhs);
    }
    inline bool operator<=(const SupportedBufferCombinations& _rhs) const {
      return !(_rhs < *this);
    }

    ::android::status_t readFromParcel(const ::android::Parcel* _aidl_parcel) final;
    ::android::status_t writeToParcel(::android::Parcel* _aidl_parcel) const final;
    static const ::android::String16& getParcelableDescriptor() {
      [[clang::no_destroy]] static const ::android::StaticString16 DESCRIPTOR (u"android.gui.OverlayProperties.SupportedBufferCombinations");
      return DESCRIPTOR;
    }
    inline std::string toString() const {
      std::ostringstream _aidl_os;
      _aidl_os << "SupportedBufferCombinations{";
      _aidl_os << "pixelFormats: " << ::android::internal::ToString(pixelFormats);
      _aidl_os << ", standards: " << ::android::internal::ToString(standards);
      _aidl_os << ", transfers: " << ::android::internal::ToString(transfers);
      _aidl_os << ", ranges: " << ::android::internal::ToString(ranges);
      _aidl_os << "}";
      return _aidl_os.str();
    }
  };  // class SupportedBufferCombinations
  ::std::vector<::android::gui::OverlayProperties::SupportedBufferCombinations> combinations;
  bool supportMixedColorSpaces = false;
  inline bool operator==(const OverlayProperties& _rhs) const {
    return std::tie(combinations, supportMixedColorSpaces) == std::tie(_rhs.combinations, _rhs.supportMixedColorSpaces);
  }
  inline bool operator<(const OverlayProperties& _rhs) const {
    return std::tie(combinations, supportMixedColorSpaces) < std::tie(_rhs.combinations, _rhs.supportMixedColorSpaces);
  }
  inline bool operator!=(const OverlayProperties& _rhs) const {
    return !(*this == _rhs);
  }
  inline bool operator>(const OverlayProperties& _rhs) const {
    return _rhs < *this;
  }
  inline bool operator>=(const OverlayProperties& _rhs) const {
    return !(*this < _rhs);
  }
  inline bool operator<=(const OverlayProperties& _rhs) const {
    return !(_rhs < *this);
  }

  ::android::status_t readFromParcel(const ::android::Parcel* _aidl_parcel) final;
  ::android::status_t writeToParcel(::android::Parcel* _aidl_parcel) const final;
  static const ::android::String16& getParcelableDescriptor() {
    [[clang::no_destroy]] static const ::android::StaticString16 DESCRIPTOR (u"android.gui.OverlayProperties");
    return DESCRIPTOR;
  }
  inline std::string toString() const {
    std::ostringstream _aidl_os;
    _aidl_os << "OverlayProperties{";
    _aidl_os << "combinations: " << ::android::internal::ToString(combinations);
    _aidl_os << ", supportMixedColorSpaces: " << ::android::internal::ToString(supportMixedColorSpaces);
    _aidl_os << "}";
    return _aidl_os.str();
  }
};  // class OverlayProperties
}  // namespace gui
}  // namespace android
