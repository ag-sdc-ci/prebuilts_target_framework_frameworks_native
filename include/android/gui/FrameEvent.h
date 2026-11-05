/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /opt/android-sdk/build-tools/37.0.0/aidl --lang=cpp -I. -Iaidl -Iaosp -h gen/include -o gen/src aidl/android/gui/ARect.aidl aidl/android/gui/CachingHint.aidl aidl/android/gui/Color.aidl aidl/android/gui/CompositionPreference.aidl aidl/android/gui/ContentSamplingAttributes.aidl aidl/android/gui/CreateSurfaceResult.aidl aidl/android/gui/DisplayBrightness.aidl aidl/android/gui/DisplayConnectionType.aidl aidl/android/gui/DisplayDecorationSupport.aidl aidl/android/gui/DisplayPrimaries.aidl aidl/android/gui/DisplayStatInfo.aidl aidl/android/gui/DisplayState.aidl aidl/android/gui/DisplayedFrameStats.aidl aidl/android/gui/FrameEvent.aidl aidl/android/gui/FrameStats.aidl aidl/android/gui/HdrCapabilities.aidl aidl/android/gui/HdrConversionCapability.aidl aidl/android/gui/HdrConversionStrategy.aidl aidl/android/gui/IDisplayEventConnection.aidl aidl/android/gui/IFpsListener.aidl aidl/android/gui/IHdrConversionConstants.aidl aidl/android/gui/IHdrLayerInfoListener.aidl aidl/android/gui/IRegionSamplingListener.aidl aidl/android/gui/IScreenCaptureListener.aidl aidl/android/gui/ITunnelModeEnabledListener.aidl aidl/android/gui/PullAtomData.aidl aidl/android/gui/Rotation.aidl aidl/android/gui/SchedulingPolicy.aidl aidl/android/gui/Size.aidl aidl/android/gui/TrustedPresentationThresholds.aidl aidl/android/gui/WindowInfosListenerInfo.aidl aidl/android/gui/BitTube.aidl aidl/android/gui/CaptureArgs.aidl aidl/android/gui/DeviceProductInfo.aidl aidl/android/gui/DisplayCaptureArgs.aidl aidl/android/gui/DisplayMode.aidl aidl/android/gui/DisplayModeSpecs.aidl aidl/android/gui/DynamicDisplayInfo.aidl aidl/android/gui/FrameTimelineInfo.aidl aidl/android/gui/ISurfaceComposer.aidl aidl/android/gui/ISurfaceComposerClient.aidl aidl/android/gui/LayerCaptureArgs.aidl aidl/android/gui/LayerDebugInfo.aidl aidl/android/gui/LayerMetadata.aidl aidl/android/gui/OverlayProperties.aidl aidl/android/gui/ParcelableVsyncEventData.aidl aidl/android/gui/ScreenCaptureResults.aidl aidl/android/gui/StaticDisplayInfo.aidl android/gui/DropInputMode.aidl android/gui/FocusRequest.aidl android/gui/IWindowInfosListener.aidl android/gui/IWindowInfosPublisher.aidl android/gui/IWindowInfosReportedListener.aidl android/gui/InputApplicationInfo.aidl android/gui/StalledTransactionInfo.aidl android/gui/TouchOcclusionMode.aidl android/gui/DisplayInfo.aidl android/gui/WindowInfo.aidl android/gui/WindowInfosUpdate.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
#pragma once

#include <array>
#include <binder/Enums.h>
#include <cstdint>
#include <string>

namespace android {
namespace gui {
enum class FrameEvent : int32_t {
  POSTED = 0,
  REQUESTED_PRESENT = 1,
  LATCH = 2,
  ACQUIRE = 3,
  FIRST_REFRESH_START = 4,
  LAST_REFRESH_START = 5,
  GPU_COMPOSITION_DONE = 6,
  DISPLAY_PRESENT = 7,
  DEQUEUE_READY = 8,
  RELEASE = 9,
  EVENT_COUNT = 10,
};
}  // namespace gui
}  // namespace android
namespace android {
namespace gui {
[[nodiscard]] static inline std::string toString(FrameEvent val) {
  switch(val) {
  case FrameEvent::POSTED:
    return "POSTED";
  case FrameEvent::REQUESTED_PRESENT:
    return "REQUESTED_PRESENT";
  case FrameEvent::LATCH:
    return "LATCH";
  case FrameEvent::ACQUIRE:
    return "ACQUIRE";
  case FrameEvent::FIRST_REFRESH_START:
    return "FIRST_REFRESH_START";
  case FrameEvent::LAST_REFRESH_START:
    return "LAST_REFRESH_START";
  case FrameEvent::GPU_COMPOSITION_DONE:
    return "GPU_COMPOSITION_DONE";
  case FrameEvent::DISPLAY_PRESENT:
    return "DISPLAY_PRESENT";
  case FrameEvent::DEQUEUE_READY:
    return "DEQUEUE_READY";
  case FrameEvent::RELEASE:
    return "RELEASE";
  case FrameEvent::EVENT_COUNT:
    return "EVENT_COUNT";
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
constexpr inline std::array<::android::gui::FrameEvent, 11> enum_values<::android::gui::FrameEvent> = {
  ::android::gui::FrameEvent::POSTED,
  ::android::gui::FrameEvent::REQUESTED_PRESENT,
  ::android::gui::FrameEvent::LATCH,
  ::android::gui::FrameEvent::ACQUIRE,
  ::android::gui::FrameEvent::FIRST_REFRESH_START,
  ::android::gui::FrameEvent::LAST_REFRESH_START,
  ::android::gui::FrameEvent::GPU_COMPOSITION_DONE,
  ::android::gui::FrameEvent::DISPLAY_PRESENT,
  ::android::gui::FrameEvent::DEQUEUE_READY,
  ::android::gui::FrameEvent::RELEASE,
  ::android::gui::FrameEvent::EVENT_COUNT,
};
#pragma clang diagnostic pop
}  // namespace internal
}  // namespace android
