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
#include <array>
#include <binder/Enums.h>
#include <binder/Parcel.h>
#include <binder/Status.h>
#include <cassert>
#include <cstdint>
#include <string>
#include <tuple>
#include <type_traits>
#include <utility>
#include <utils/String16.h>
#include <variant>
#include <vector>

#ifndef __BIONIC__
#define __assert2(a,b,c,d) ((void)0)
#endif

namespace android {
namespace gui {
class LIBBINDER_EXPORTED DeviceProductInfo : public ::android::Parcelable {
public:
  class LIBBINDER_EXPORTED ModelYear : public ::android::Parcelable {
  public:
    int32_t year = 0;
    inline bool operator==(const ModelYear& _rhs) const {
      return std::tie(year) == std::tie(_rhs.year);
    }
    inline bool operator<(const ModelYear& _rhs) const {
      return std::tie(year) < std::tie(_rhs.year);
    }
    inline bool operator!=(const ModelYear& _rhs) const {
      return !(*this == _rhs);
    }
    inline bool operator>(const ModelYear& _rhs) const {
      return _rhs < *this;
    }
    inline bool operator>=(const ModelYear& _rhs) const {
      return !(*this < _rhs);
    }
    inline bool operator<=(const ModelYear& _rhs) const {
      return !(_rhs < *this);
    }

    ::android::status_t readFromParcel(const ::android::Parcel* _aidl_parcel) final;
    ::android::status_t writeToParcel(::android::Parcel* _aidl_parcel) const final;
    static const ::android::String16& getParcelableDescriptor() {
      [[clang::no_destroy]] static const ::android::StaticString16 DESCRIPTOR (u"android.gui.DeviceProductInfo.ModelYear");
      return DESCRIPTOR;
    }
    inline std::string toString() const {
      std::ostringstream _aidl_os;
      _aidl_os << "ModelYear{";
      _aidl_os << "year: " << ::android::internal::ToString(year);
      _aidl_os << "}";
      return _aidl_os.str();
    }
  };  // class ModelYear
  class LIBBINDER_EXPORTED ManufactureYear : public ::android::Parcelable {
  public:
    ::android::gui::DeviceProductInfo::ModelYear modelYear;
    inline bool operator==(const ManufactureYear& _rhs) const {
      return std::tie(modelYear) == std::tie(_rhs.modelYear);
    }
    inline bool operator<(const ManufactureYear& _rhs) const {
      return std::tie(modelYear) < std::tie(_rhs.modelYear);
    }
    inline bool operator!=(const ManufactureYear& _rhs) const {
      return !(*this == _rhs);
    }
    inline bool operator>(const ManufactureYear& _rhs) const {
      return _rhs < *this;
    }
    inline bool operator>=(const ManufactureYear& _rhs) const {
      return !(*this < _rhs);
    }
    inline bool operator<=(const ManufactureYear& _rhs) const {
      return !(_rhs < *this);
    }

    ::android::status_t readFromParcel(const ::android::Parcel* _aidl_parcel) final;
    ::android::status_t writeToParcel(::android::Parcel* _aidl_parcel) const final;
    static const ::android::String16& getParcelableDescriptor() {
      [[clang::no_destroy]] static const ::android::StaticString16 DESCRIPTOR (u"android.gui.DeviceProductInfo.ManufactureYear");
      return DESCRIPTOR;
    }
    inline std::string toString() const {
      std::ostringstream _aidl_os;
      _aidl_os << "ManufactureYear{";
      _aidl_os << "modelYear: " << ::android::internal::ToString(modelYear);
      _aidl_os << "}";
      return _aidl_os.str();
    }
  };  // class ManufactureYear
  class LIBBINDER_EXPORTED ManufactureWeekAndYear : public ::android::Parcelable {
  public:
    ::android::gui::DeviceProductInfo::ManufactureYear manufactureYear;
    int32_t week = 0;
    inline bool operator==(const ManufactureWeekAndYear& _rhs) const {
      return std::tie(manufactureYear, week) == std::tie(_rhs.manufactureYear, _rhs.week);
    }
    inline bool operator<(const ManufactureWeekAndYear& _rhs) const {
      return std::tie(manufactureYear, week) < std::tie(_rhs.manufactureYear, _rhs.week);
    }
    inline bool operator!=(const ManufactureWeekAndYear& _rhs) const {
      return !(*this == _rhs);
    }
    inline bool operator>(const ManufactureWeekAndYear& _rhs) const {
      return _rhs < *this;
    }
    inline bool operator>=(const ManufactureWeekAndYear& _rhs) const {
      return !(*this < _rhs);
    }
    inline bool operator<=(const ManufactureWeekAndYear& _rhs) const {
      return !(_rhs < *this);
    }

    ::android::status_t readFromParcel(const ::android::Parcel* _aidl_parcel) final;
    ::android::status_t writeToParcel(::android::Parcel* _aidl_parcel) const final;
    static const ::android::String16& getParcelableDescriptor() {
      [[clang::no_destroy]] static const ::android::StaticString16 DESCRIPTOR (u"android.gui.DeviceProductInfo.ManufactureWeekAndYear");
      return DESCRIPTOR;
    }
    inline std::string toString() const {
      std::ostringstream _aidl_os;
      _aidl_os << "ManufactureWeekAndYear{";
      _aidl_os << "manufactureYear: " << ::android::internal::ToString(manufactureYear);
      _aidl_os << ", week: " << ::android::internal::ToString(week);
      _aidl_os << "}";
      return _aidl_os.str();
    }
  };  // class ManufactureWeekAndYear
  class LIBBINDER_EXPORTED ManufactureOrModelDate : public ::android::Parcelable {
  public:
    enum class Tag : int32_t {
      modelYear = 0,
      manufactureYear = 1,
      manufactureWeekAndYear = 2,
    };
    // Expose tag symbols for legacy code
    static const inline Tag modelYear = Tag::modelYear;
    static const inline Tag manufactureYear = Tag::manufactureYear;
    static const inline Tag manufactureWeekAndYear = Tag::manufactureWeekAndYear;

    template<typename _Tp>
    static constexpr bool _not_self = !std::is_same_v<std::remove_cv_t<std::remove_reference_t<_Tp>>, ManufactureOrModelDate>;

    ManufactureOrModelDate() : _value(std::in_place_index<static_cast<size_t>(modelYear)>, ::android::gui::DeviceProductInfo::ModelYear()) { }

    template <typename _Tp, typename = std::enable_if_t<
        _not_self<_Tp> &&
        std::is_constructible_v<std::variant<::android::gui::DeviceProductInfo::ModelYear, ::android::gui::DeviceProductInfo::ManufactureYear, ::android::gui::DeviceProductInfo::ManufactureWeekAndYear>, _Tp>
      >>
    // NOLINTNEXTLINE(google-explicit-constructor)
    constexpr ManufactureOrModelDate(_Tp&& _arg)
        : _value(std::forward<_Tp>(_arg)) {}

    template <size_t _Np, typename... _Tp>
    constexpr explicit ManufactureOrModelDate(std::in_place_index_t<_Np>, _Tp&&... _args)
        : _value(std::in_place_index<_Np>, std::forward<_Tp>(_args)...) {}

    template <Tag _tag, typename... _Tp>
    static ManufactureOrModelDate make(_Tp&&... _args) {
      return ManufactureOrModelDate(std::in_place_index<static_cast<size_t>(_tag)>, std::forward<_Tp>(_args)...);
    }

    template <Tag _tag, typename _Tp, typename... _Up>
    static ManufactureOrModelDate make(std::initializer_list<_Tp> _il, _Up&&... _args) {
      return ManufactureOrModelDate(std::in_place_index<static_cast<size_t>(_tag)>, std::move(_il), std::forward<_Up>(_args)...);
    }

    Tag getTag() const {
      return static_cast<Tag>(_value.index());
    }

    template <Tag _tag>
    const auto& get() const {
      if (getTag() != _tag) { __assert2(__FILE__, __LINE__, __PRETTY_FUNCTION__, "bad access: a wrong tag"); }
      return std::get<static_cast<size_t>(_tag)>(_value);
    }

    template <Tag _tag>
    auto& get() {
      if (getTag() != _tag) { __assert2(__FILE__, __LINE__, __PRETTY_FUNCTION__, "bad access: a wrong tag"); }
      return std::get<static_cast<size_t>(_tag)>(_value);
    }

    template <Tag _tag, typename... _Tp>
    void set(_Tp&&... _args) {
      _value.emplace<static_cast<size_t>(_tag)>(std::forward<_Tp>(_args)...);
    }

    inline bool operator==(const ManufactureOrModelDate& _rhs) const {
      return _value == _rhs._value;
    }
    inline bool operator<(const ManufactureOrModelDate& _rhs) const {
      return _value < _rhs._value;
    }
    inline bool operator!=(const ManufactureOrModelDate& _rhs) const {
      return !(*this == _rhs);
    }
    inline bool operator>(const ManufactureOrModelDate& _rhs) const {
      return _rhs < *this;
    }
    inline bool operator>=(const ManufactureOrModelDate& _rhs) const {
      return !(*this < _rhs);
    }
    inline bool operator<=(const ManufactureOrModelDate& _rhs) const {
      return !(_rhs < *this);
    }

    ::android::status_t readFromParcel(const ::android::Parcel* _aidl_parcel) final;
    ::android::status_t writeToParcel(::android::Parcel* _aidl_parcel) const final;
    static const ::android::String16& getParcelableDescriptor() {
      [[clang::no_destroy]] static const ::android::StaticString16 DESCRIPTOR (u"android.gui.DeviceProductInfo.ManufactureOrModelDate");
      return DESCRIPTOR;
    }
    inline std::string toString() const {
      std::ostringstream os;
      os << "ManufactureOrModelDate{";
      switch (getTag()) {
      case modelYear: os << "modelYear: " << ::android::internal::ToString(get<modelYear>()); break;
      case manufactureYear: os << "manufactureYear: " << ::android::internal::ToString(get<manufactureYear>()); break;
      case manufactureWeekAndYear: os << "manufactureWeekAndYear: " << ::android::internal::ToString(get<manufactureWeekAndYear>()); break;
      }
      os << "}";
      return os.str();
    }
  private:
    std::variant<::android::gui::DeviceProductInfo::ModelYear, ::android::gui::DeviceProductInfo::ManufactureYear, ::android::gui::DeviceProductInfo::ManufactureWeekAndYear> _value;
  };  // class ManufactureOrModelDate
  ::std::string name;
  ::std::vector<uint8_t> manufacturerPnpId;
  ::std::string productId;
  ::android::gui::DeviceProductInfo::ManufactureOrModelDate manufactureOrModelDate;
  ::std::vector<uint8_t> relativeAddress;
  inline bool operator==(const DeviceProductInfo& _rhs) const {
    return std::tie(name, manufacturerPnpId, productId, manufactureOrModelDate, relativeAddress) == std::tie(_rhs.name, _rhs.manufacturerPnpId, _rhs.productId, _rhs.manufactureOrModelDate, _rhs.relativeAddress);
  }
  inline bool operator<(const DeviceProductInfo& _rhs) const {
    return std::tie(name, manufacturerPnpId, productId, manufactureOrModelDate, relativeAddress) < std::tie(_rhs.name, _rhs.manufacturerPnpId, _rhs.productId, _rhs.manufactureOrModelDate, _rhs.relativeAddress);
  }
  inline bool operator!=(const DeviceProductInfo& _rhs) const {
    return !(*this == _rhs);
  }
  inline bool operator>(const DeviceProductInfo& _rhs) const {
    return _rhs < *this;
  }
  inline bool operator>=(const DeviceProductInfo& _rhs) const {
    return !(*this < _rhs);
  }
  inline bool operator<=(const DeviceProductInfo& _rhs) const {
    return !(_rhs < *this);
  }

  ::android::status_t readFromParcel(const ::android::Parcel* _aidl_parcel) final;
  ::android::status_t writeToParcel(::android::Parcel* _aidl_parcel) const final;
  static const ::android::String16& getParcelableDescriptor() {
    [[clang::no_destroy]] static const ::android::StaticString16 DESCRIPTOR (u"android.gui.DeviceProductInfo");
    return DESCRIPTOR;
  }
  inline std::string toString() const {
    std::ostringstream _aidl_os;
    _aidl_os << "DeviceProductInfo{";
    _aidl_os << "name: " << ::android::internal::ToString(name);
    _aidl_os << ", manufacturerPnpId: " << ::android::internal::ToString(manufacturerPnpId);
    _aidl_os << ", productId: " << ::android::internal::ToString(productId);
    _aidl_os << ", manufactureOrModelDate: " << ::android::internal::ToString(manufactureOrModelDate);
    _aidl_os << ", relativeAddress: " << ::android::internal::ToString(relativeAddress);
    _aidl_os << "}";
    return _aidl_os.str();
  }
};  // class DeviceProductInfo
}  // namespace gui
}  // namespace android
namespace android {
namespace gui {
[[nodiscard]] static inline std::string toString(DeviceProductInfo::ManufactureOrModelDate::Tag val) {
  switch(val) {
  case DeviceProductInfo::ManufactureOrModelDate::Tag::modelYear:
    return "modelYear";
  case DeviceProductInfo::ManufactureOrModelDate::Tag::manufactureYear:
    return "manufactureYear";
  case DeviceProductInfo::ManufactureOrModelDate::Tag::manufactureWeekAndYear:
    return "manufactureWeekAndYear";
  default:
    return std::to_string(static_cast<int32_t>(val));
  }
}
}  // namespace gui
}  // namespace android
namespace android {
namespace internal {
#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wc++17-extensions"
template <>
constexpr inline std::array<::android::gui::DeviceProductInfo::ManufactureOrModelDate::Tag, 3> enum_values<::android::gui::DeviceProductInfo::ManufactureOrModelDate::Tag> = {
  ::android::gui::DeviceProductInfo::ManufactureOrModelDate::Tag::modelYear,
  ::android::gui::DeviceProductInfo::ManufactureOrModelDate::Tag::manufactureYear,
  ::android::gui::DeviceProductInfo::ManufactureOrModelDate::Tag::manufactureWeekAndYear,
};
#pragma clang diagnostic pop
}  // namespace internal
}  // namespace android
