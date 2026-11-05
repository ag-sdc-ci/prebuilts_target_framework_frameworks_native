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
#include <android/gui/DisplayModeSpecs.h>
#include <binder/Parcel.h>
#include <binder/Status.h>
#include <cstdint>
#include <tuple>
#include <utils/String16.h>

namespace android {
namespace gui {
class LIBBINDER_EXPORTED DisplayModeSpecs : public ::android::Parcelable {
public:
  class LIBBINDER_EXPORTED RefreshRateRanges : public ::android::Parcelable {
  public:
    class LIBBINDER_EXPORTED RefreshRateRange : public ::android::Parcelable {
    public:
      float min = 0.000000f;
      float max = 0.000000f;
      inline bool operator==(const RefreshRateRange& _rhs) const {
        return std::tie(min, max) == std::tie(_rhs.min, _rhs.max);
      }
      inline bool operator<(const RefreshRateRange& _rhs) const {
        return std::tie(min, max) < std::tie(_rhs.min, _rhs.max);
      }
      inline bool operator!=(const RefreshRateRange& _rhs) const {
        return !(*this == _rhs);
      }
      inline bool operator>(const RefreshRateRange& _rhs) const {
        return _rhs < *this;
      }
      inline bool operator>=(const RefreshRateRange& _rhs) const {
        return !(*this < _rhs);
      }
      inline bool operator<=(const RefreshRateRange& _rhs) const {
        return !(_rhs < *this);
      }

      ::android::status_t readFromParcel(const ::android::Parcel* _aidl_parcel) final;
      ::android::status_t writeToParcel(::android::Parcel* _aidl_parcel) const final;
      static const ::android::String16& getParcelableDescriptor() {
        [[clang::no_destroy]] static const ::android::StaticString16 DESCRIPTOR (u"android.gui.DisplayModeSpecs.RefreshRateRanges.RefreshRateRange");
        return DESCRIPTOR;
      }
      inline std::string toString() const {
        std::ostringstream _aidl_os;
        _aidl_os << "RefreshRateRange{";
        _aidl_os << "min: " << ::android::internal::ToString(min);
        _aidl_os << ", max: " << ::android::internal::ToString(max);
        _aidl_os << "}";
        return _aidl_os.str();
      }
    };  // class RefreshRateRange
    ::android::gui::DisplayModeSpecs::RefreshRateRanges::RefreshRateRange physical;
    ::android::gui::DisplayModeSpecs::RefreshRateRanges::RefreshRateRange render;
    inline bool operator==(const RefreshRateRanges& _rhs) const {
      return std::tie(physical, render) == std::tie(_rhs.physical, _rhs.render);
    }
    inline bool operator<(const RefreshRateRanges& _rhs) const {
      return std::tie(physical, render) < std::tie(_rhs.physical, _rhs.render);
    }
    inline bool operator!=(const RefreshRateRanges& _rhs) const {
      return !(*this == _rhs);
    }
    inline bool operator>(const RefreshRateRanges& _rhs) const {
      return _rhs < *this;
    }
    inline bool operator>=(const RefreshRateRanges& _rhs) const {
      return !(*this < _rhs);
    }
    inline bool operator<=(const RefreshRateRanges& _rhs) const {
      return !(_rhs < *this);
    }

    ::android::status_t readFromParcel(const ::android::Parcel* _aidl_parcel) final;
    ::android::status_t writeToParcel(::android::Parcel* _aidl_parcel) const final;
    static const ::android::String16& getParcelableDescriptor() {
      [[clang::no_destroy]] static const ::android::StaticString16 DESCRIPTOR (u"android.gui.DisplayModeSpecs.RefreshRateRanges");
      return DESCRIPTOR;
    }
    inline std::string toString() const {
      std::ostringstream _aidl_os;
      _aidl_os << "RefreshRateRanges{";
      _aidl_os << "physical: " << ::android::internal::ToString(physical);
      _aidl_os << ", render: " << ::android::internal::ToString(render);
      _aidl_os << "}";
      return _aidl_os.str();
    }
  };  // class RefreshRateRanges
  int32_t defaultMode = 0;
  bool allowGroupSwitching = false;
  ::android::gui::DisplayModeSpecs::RefreshRateRanges primaryRanges;
  ::android::gui::DisplayModeSpecs::RefreshRateRanges appRequestRanges;
  inline bool operator==(const DisplayModeSpecs& _rhs) const {
    return std::tie(defaultMode, allowGroupSwitching, primaryRanges, appRequestRanges) == std::tie(_rhs.defaultMode, _rhs.allowGroupSwitching, _rhs.primaryRanges, _rhs.appRequestRanges);
  }
  inline bool operator<(const DisplayModeSpecs& _rhs) const {
    return std::tie(defaultMode, allowGroupSwitching, primaryRanges, appRequestRanges) < std::tie(_rhs.defaultMode, _rhs.allowGroupSwitching, _rhs.primaryRanges, _rhs.appRequestRanges);
  }
  inline bool operator!=(const DisplayModeSpecs& _rhs) const {
    return !(*this == _rhs);
  }
  inline bool operator>(const DisplayModeSpecs& _rhs) const {
    return _rhs < *this;
  }
  inline bool operator>=(const DisplayModeSpecs& _rhs) const {
    return !(*this < _rhs);
  }
  inline bool operator<=(const DisplayModeSpecs& _rhs) const {
    return !(_rhs < *this);
  }

  ::android::status_t readFromParcel(const ::android::Parcel* _aidl_parcel) final;
  ::android::status_t writeToParcel(::android::Parcel* _aidl_parcel) const final;
  static const ::android::String16& getParcelableDescriptor() {
    [[clang::no_destroy]] static const ::android::StaticString16 DESCRIPTOR (u"android.gui.DisplayModeSpecs");
    return DESCRIPTOR;
  }
  inline std::string toString() const {
    std::ostringstream _aidl_os;
    _aidl_os << "DisplayModeSpecs{";
    _aidl_os << "defaultMode: " << ::android::internal::ToString(defaultMode);
    _aidl_os << ", allowGroupSwitching: " << ::android::internal::ToString(allowGroupSwitching);
    _aidl_os << ", primaryRanges: " << ::android::internal::ToString(primaryRanges);
    _aidl_os << ", appRequestRanges: " << ::android::internal::ToString(appRequestRanges);
    _aidl_os << "}";
    return _aidl_os.str();
  }
};  // class DisplayModeSpecs
}  // namespace gui
}  // namespace android
