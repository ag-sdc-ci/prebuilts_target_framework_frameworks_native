/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /opt/android-sdk/build-tools/37.0.0/aidl --lang=cpp -I. -Iaidl -Iaosp -h gen/include -o gen/src aidl/android/gui/ARect.aidl aidl/android/gui/CachingHint.aidl aidl/android/gui/Color.aidl aidl/android/gui/CompositionPreference.aidl aidl/android/gui/ContentSamplingAttributes.aidl aidl/android/gui/CreateSurfaceResult.aidl aidl/android/gui/DisplayBrightness.aidl aidl/android/gui/DisplayConnectionType.aidl aidl/android/gui/DisplayDecorationSupport.aidl aidl/android/gui/DisplayPrimaries.aidl aidl/android/gui/DisplayStatInfo.aidl aidl/android/gui/DisplayState.aidl aidl/android/gui/DisplayedFrameStats.aidl aidl/android/gui/FrameEvent.aidl aidl/android/gui/FrameStats.aidl aidl/android/gui/HdrCapabilities.aidl aidl/android/gui/HdrConversionCapability.aidl aidl/android/gui/HdrConversionStrategy.aidl aidl/android/gui/IDisplayEventConnection.aidl aidl/android/gui/IFpsListener.aidl aidl/android/gui/IHdrConversionConstants.aidl aidl/android/gui/IHdrLayerInfoListener.aidl aidl/android/gui/IRegionSamplingListener.aidl aidl/android/gui/IScreenCaptureListener.aidl aidl/android/gui/ITunnelModeEnabledListener.aidl aidl/android/gui/PullAtomData.aidl aidl/android/gui/Rotation.aidl aidl/android/gui/SchedulingPolicy.aidl aidl/android/gui/Size.aidl aidl/android/gui/TrustedPresentationThresholds.aidl aidl/android/gui/WindowInfosListenerInfo.aidl aidl/android/gui/BitTube.aidl aidl/android/gui/CaptureArgs.aidl aidl/android/gui/DeviceProductInfo.aidl aidl/android/gui/DisplayCaptureArgs.aidl aidl/android/gui/DisplayMode.aidl aidl/android/gui/DisplayModeSpecs.aidl aidl/android/gui/DynamicDisplayInfo.aidl aidl/android/gui/FrameTimelineInfo.aidl aidl/android/gui/ISurfaceComposer.aidl aidl/android/gui/ISurfaceComposerClient.aidl aidl/android/gui/LayerCaptureArgs.aidl aidl/android/gui/LayerDebugInfo.aidl aidl/android/gui/LayerMetadata.aidl aidl/android/gui/OverlayProperties.aidl aidl/android/gui/ParcelableVsyncEventData.aidl aidl/android/gui/ScreenCaptureResults.aidl aidl/android/gui/StaticDisplayInfo.aidl android/gui/DropInputMode.aidl android/gui/FocusRequest.aidl android/gui/IWindowInfosListener.aidl android/gui/IWindowInfosPublisher.aidl android/gui/IWindowInfosReportedListener.aidl android/gui/InputApplicationInfo.aidl android/gui/StalledTransactionInfo.aidl android/gui/TouchOcclusionMode.aidl android/gui/DisplayInfo.aidl android/gui/WindowInfo.aidl android/gui/WindowInfosUpdate.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
#pragma once

#include <android/gui/ARect.h>
#include <android/gui/Color.h>
#include <android/gui/CompositionPreference.h>
#include <android/gui/ContentSamplingAttributes.h>
#include <android/gui/DisplayBrightness.h>
#include <android/gui/DisplayDecorationSupport.h>
#include <android/gui/DisplayModeSpecs.h>
#include <android/gui/DisplayPrimaries.h>
#include <android/gui/DisplayStatInfo.h>
#include <android/gui/DisplayState.h>
#include <android/gui/DisplayedFrameStats.h>
#include <android/gui/DynamicDisplayInfo.h>
#include <android/gui/FrameEvent.h>
#include <android/gui/FrameStats.h>
#include <android/gui/HdrConversionCapability.h>
#include <android/gui/HdrConversionStrategy.h>
#include <android/gui/IDisplayEventConnection.h>
#include <android/gui/IFpsListener.h>
#include <android/gui/IHdrLayerInfoListener.h>
#include <android/gui/IRegionSamplingListener.h>
#include <android/gui/IScreenCaptureListener.h>
#include <android/gui/ISurfaceComposer.h>
#include <android/gui/ISurfaceComposerClient.h>
#include <android/gui/ITunnelModeEnabledListener.h>
#include <android/gui/IWindowInfosListener.h>
#include <android/gui/OverlayProperties.h>
#include <android/gui/PullAtomData.h>
#include <android/gui/SchedulingPolicy.h>
#include <android/gui/StalledTransactionInfo.h>
#include <android/gui/StaticDisplayInfo.h>
#include <android/gui/WindowInfosListenerInfo.h>
#include <array>
#include <binder/Enums.h>
#include <binder/IBinder.h>
#include <binder/IInterface.h>
#include <binder/Status.h>
#include <cstdint>
#include <gui/DisplayCaptureArgs.h>
#include <gui/LayerCaptureArgs.h>
#include <gui/LayerDebugInfo.h>
#include <gui/ScreenCaptureResults.h>
#include <optional>
#include <string>
#include <utils/StrongPointer.h>
#include <vector>

namespace android::gui {
class ARect;
class Color;
class CompositionPreference;
class ContentSamplingAttributes;
class DisplayBrightness;
class DisplayDecorationSupport;
class DisplayModeSpecs;
class DisplayPrimaries;
class DisplayStatInfo;
class DisplayState;
class DisplayedFrameStats;
class DynamicDisplayInfo;
class FrameStats;
class HdrConversionCapability;
class IDisplayEventConnection;
class IFpsListener;
class IHdrLayerInfoListener;
class IRegionSamplingListener;
class IScreenCaptureListener;
class ISurfaceComposerClient;
class ITunnelModeEnabledListener;
class IWindowInfosListener;
class OverlayProperties;
class PullAtomData;
class SchedulingPolicy;
class StalledTransactionInfo;
class StaticDisplayInfo;
class WindowInfosListenerInfo;
}  // namespace android::gui
namespace android {
namespace gui {
class LIBBINDER_EXPORTED ISurfaceComposerDelegator;

class LIBBINDER_EXPORTED ISurfaceComposer : public ::android::IInterface {
public:
  typedef ISurfaceComposerDelegator DefaultDelegator;
  DECLARE_META_INTERFACE(SurfaceComposer)
  enum class VsyncSource : int8_t {
    eVsyncSourceApp = 0,
    eVsyncSourceSurfaceFlinger = 1,
  };
  enum class EventRegistration : int8_t {
    modeChanged = 1,
    frameRateOverride = 2,
  };
  virtual ::android::binder::Status bootFinished() = 0;
  virtual ::android::binder::Status createDisplayEventConnection(::android::gui::ISurfaceComposer::VsyncSource vsyncSource, ::android::gui::ISurfaceComposer::EventRegistration eventRegistration, const ::android::sp<::android::IBinder>& layerHandle, ::android::sp<::android::gui::IDisplayEventConnection>* _aidl_return) = 0;
  virtual ::android::binder::Status createConnection(::android::sp<::android::gui::ISurfaceComposerClient>* _aidl_return) = 0;
  virtual ::android::binder::Status createDisplay(const ::std::string& displayName, bool secure, float requestedRefreshRate, ::android::sp<::android::IBinder>* _aidl_return) = 0;
  virtual ::android::binder::Status destroyDisplay(const ::android::sp<::android::IBinder>& display) = 0;
  virtual ::android::binder::Status getPhysicalDisplayIds(::std::vector<int64_t>* _aidl_return) = 0;
  virtual ::android::binder::Status getPhysicalDisplayToken(int64_t displayId, ::android::sp<::android::IBinder>* _aidl_return) = 0;
  virtual ::android::binder::Status getSupportedFrameTimestamps(::std::vector<::android::gui::FrameEvent>* _aidl_return) = 0;
  virtual ::android::binder::Status setPowerMode(const ::android::sp<::android::IBinder>& display, int32_t mode) = 0;
  virtual ::android::binder::Status getDisplayStats(const ::android::sp<::android::IBinder>& display, ::android::gui::DisplayStatInfo* _aidl_return) = 0;
  virtual ::android::binder::Status getDisplayState(const ::android::sp<::android::IBinder>& display, ::android::gui::DisplayState* _aidl_return) = 0;
  virtual ::android::binder::Status getStaticDisplayInfo(int64_t displayId, ::android::gui::StaticDisplayInfo* _aidl_return) = 0;
  virtual ::android::binder::Status getDynamicDisplayInfoFromId(int64_t displayId, ::android::gui::DynamicDisplayInfo* _aidl_return) = 0;
  virtual ::android::binder::Status getDynamicDisplayInfoFromToken(const ::android::sp<::android::IBinder>& display, ::android::gui::DynamicDisplayInfo* _aidl_return) = 0;
  virtual ::android::binder::Status getDisplayNativePrimaries(const ::android::sp<::android::IBinder>& display, ::android::gui::DisplayPrimaries* _aidl_return) = 0;
  virtual ::android::binder::Status setActiveColorMode(const ::android::sp<::android::IBinder>& display, int32_t colorMode) = 0;
  virtual ::android::binder::Status setBootDisplayMode(const ::android::sp<::android::IBinder>& display, int32_t displayModeId) = 0;
  virtual ::android::binder::Status clearBootDisplayMode(const ::android::sp<::android::IBinder>& display) = 0;
  virtual ::android::binder::Status getBootDisplayModeSupport(bool* _aidl_return) = 0;
  virtual ::android::binder::Status getHdrConversionCapabilities(::std::vector<::android::gui::HdrConversionCapability>* _aidl_return) = 0;
  virtual ::android::binder::Status setHdrConversionStrategy(const ::android::gui::HdrConversionStrategy& hdrConversionStrategy, int32_t* _aidl_return) = 0;
  virtual ::android::binder::Status getHdrOutputConversionSupport(bool* _aidl_return) = 0;
  virtual ::android::binder::Status setAutoLowLatencyMode(const ::android::sp<::android::IBinder>& display, bool on) = 0;
  virtual ::android::binder::Status setGameContentType(const ::android::sp<::android::IBinder>& display, bool on) = 0;
  virtual ::android::binder::Status captureDisplay(const ::android::gui::DisplayCaptureArgs& args, const ::android::sp<::android::gui::IScreenCaptureListener>& listener) = 0;
  virtual ::android::binder::Status captureDisplayById(int64_t displayId, const ::android::gui::CaptureArgs& args, const ::android::sp<::android::gui::IScreenCaptureListener>& listener) = 0;
  virtual ::android::binder::Status captureLayersSync(const ::android::gui::LayerCaptureArgs& args, ::android::gui::ScreenCaptureResults* _aidl_return) = 0;
  virtual ::android::binder::Status captureLayers(const ::android::gui::LayerCaptureArgs& args, const ::android::sp<::android::gui::IScreenCaptureListener>& listener) = 0;
  virtual ::android::binder::Status clearAnimationFrameStats() = 0;
  virtual ::android::binder::Status getAnimationFrameStats(::android::gui::FrameStats* _aidl_return) = 0;
  virtual ::android::binder::Status overrideHdrTypes(const ::android::sp<::android::IBinder>& display, const ::std::vector<int32_t>& hdrTypes) = 0;
  virtual ::android::binder::Status onPullAtom(int32_t atomId, ::android::gui::PullAtomData* _aidl_return) = 0;
  virtual ::android::binder::Status getLayerDebugInfo(::std::vector<::android::gui::LayerDebugInfo>* _aidl_return) = 0;
  virtual ::android::binder::Status getCompositionPreference(::android::gui::CompositionPreference* _aidl_return) = 0;
  virtual ::android::binder::Status getDisplayedContentSamplingAttributes(const ::android::sp<::android::IBinder>& display, ::android::gui::ContentSamplingAttributes* _aidl_return) = 0;
  virtual ::android::binder::Status setDisplayContentSamplingEnabled(const ::android::sp<::android::IBinder>& display, bool enable, int8_t componentMask, int64_t maxFrames) = 0;
  virtual ::android::binder::Status getDisplayedContentSample(const ::android::sp<::android::IBinder>& display, int64_t maxFrames, int64_t timestamp, ::android::gui::DisplayedFrameStats* _aidl_return) = 0;
  virtual ::android::binder::Status getProtectedContentSupport(bool* _aidl_return) = 0;
  virtual ::android::binder::Status isWideColorDisplay(const ::android::sp<::android::IBinder>& token, bool* _aidl_return) = 0;
  virtual ::android::binder::Status addRegionSamplingListener(const ::android::gui::ARect& samplingArea, const ::android::sp<::android::IBinder>& stopLayerHandle, const ::android::sp<::android::gui::IRegionSamplingListener>& listener) = 0;
  virtual ::android::binder::Status removeRegionSamplingListener(const ::android::sp<::android::gui::IRegionSamplingListener>& listener) = 0;
  virtual ::android::binder::Status addFpsListener(int32_t taskId, const ::android::sp<::android::gui::IFpsListener>& listener) = 0;
  virtual ::android::binder::Status removeFpsListener(const ::android::sp<::android::gui::IFpsListener>& listener) = 0;
  virtual ::android::binder::Status addTunnelModeEnabledListener(const ::android::sp<::android::gui::ITunnelModeEnabledListener>& listener) = 0;
  virtual ::android::binder::Status removeTunnelModeEnabledListener(const ::android::sp<::android::gui::ITunnelModeEnabledListener>& listener) = 0;
  virtual ::android::binder::Status setDesiredDisplayModeSpecs(const ::android::sp<::android::IBinder>& displayToken, const ::android::gui::DisplayModeSpecs& specs) = 0;
  virtual ::android::binder::Status getDesiredDisplayModeSpecs(const ::android::sp<::android::IBinder>& displayToken, ::android::gui::DisplayModeSpecs* _aidl_return) = 0;
  virtual ::android::binder::Status getDisplayBrightnessSupport(const ::android::sp<::android::IBinder>& displayToken, bool* _aidl_return) = 0;
  virtual ::android::binder::Status setDisplayBrightness(const ::android::sp<::android::IBinder>& displayToken, const ::android::gui::DisplayBrightness& brightness) = 0;
  virtual ::android::binder::Status addHdrLayerInfoListener(const ::android::sp<::android::IBinder>& displayToken, const ::android::sp<::android::gui::IHdrLayerInfoListener>& listener) = 0;
  virtual ::android::binder::Status removeHdrLayerInfoListener(const ::android::sp<::android::IBinder>& displayToken, const ::android::sp<::android::gui::IHdrLayerInfoListener>& listener) = 0;
  virtual ::android::binder::Status notifyPowerBoost(int32_t boostId) = 0;
  virtual ::android::binder::Status setGlobalShadowSettings(const ::android::gui::Color& ambientColor, const ::android::gui::Color& spotColor, float lightPosY, float lightPosZ, float lightRadius) = 0;
  virtual ::android::binder::Status getDisplayDecorationSupport(const ::android::sp<::android::IBinder>& displayToken, ::std::optional<::android::gui::DisplayDecorationSupport>* _aidl_return) = 0;
  virtual ::android::binder::Status setGameModeFrameRateOverride(int32_t uid, float frameRate) = 0;
  virtual ::android::binder::Status setGameDefaultFrameRateOverride(int32_t uid, float frameRate) = 0;
  virtual ::android::binder::Status updateSmallAreaDetection(const ::std::vector<int32_t>& appIds, const ::std::vector<float>& thresholds) = 0;
  virtual ::android::binder::Status setSmallAreaDetectionThreshold(int32_t appId, float threshold) = 0;
  virtual ::android::binder::Status enableRefreshRateOverlay(bool active) = 0;
  virtual ::android::binder::Status setDebugFlash(int32_t delay) = 0;
  virtual ::android::binder::Status scheduleComposite() = 0;
  virtual ::android::binder::Status scheduleCommit() = 0;
  virtual ::android::binder::Status forceClientComposition(bool enabled) = 0;
  virtual ::android::binder::Status getGpuContextPriority(int32_t* _aidl_return) = 0;
  virtual ::android::binder::Status getMaxAcquiredBufferCount(int32_t* _aidl_return) = 0;
  virtual ::android::binder::Status addWindowInfosListener(const ::android::sp<::android::gui::IWindowInfosListener>& windowInfosListener, ::android::gui::WindowInfosListenerInfo* _aidl_return) = 0;
  virtual ::android::binder::Status removeWindowInfosListener(const ::android::sp<::android::gui::IWindowInfosListener>& windowInfosListener) = 0;
  virtual ::android::binder::Status getOverlaySupport(::android::gui::OverlayProperties* _aidl_return) = 0;
  virtual ::android::binder::Status getStalledTransactionInfo(int32_t pid, ::std::optional<::android::gui::StalledTransactionInfo>* _aidl_return) = 0;
  virtual ::android::binder::Status getSchedulingPolicy(::android::gui::SchedulingPolicy* _aidl_return) = 0;
};  // class ISurfaceComposer

class LIBBINDER_EXPORTED ISurfaceComposerDefault : public ISurfaceComposer {
public:
  ::android::IBinder* onAsBinder() override {
    return nullptr;
  }
  ::android::binder::Status bootFinished() override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status createDisplayEventConnection(::android::gui::ISurfaceComposer::VsyncSource /*vsyncSource*/, ::android::gui::ISurfaceComposer::EventRegistration /*eventRegistration*/, const ::android::sp<::android::IBinder>& /*layerHandle*/, ::android::sp<::android::gui::IDisplayEventConnection>* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status createConnection(::android::sp<::android::gui::ISurfaceComposerClient>* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status createDisplay(const ::std::string& /*displayName*/, bool /*secure*/, float /*requestedRefreshRate*/, ::android::sp<::android::IBinder>* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status destroyDisplay(const ::android::sp<::android::IBinder>& /*display*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status getPhysicalDisplayIds(::std::vector<int64_t>* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status getPhysicalDisplayToken(int64_t /*displayId*/, ::android::sp<::android::IBinder>* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status getSupportedFrameTimestamps(::std::vector<::android::gui::FrameEvent>* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status setPowerMode(const ::android::sp<::android::IBinder>& /*display*/, int32_t /*mode*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status getDisplayStats(const ::android::sp<::android::IBinder>& /*display*/, ::android::gui::DisplayStatInfo* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status getDisplayState(const ::android::sp<::android::IBinder>& /*display*/, ::android::gui::DisplayState* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status getStaticDisplayInfo(int64_t /*displayId*/, ::android::gui::StaticDisplayInfo* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status getDynamicDisplayInfoFromId(int64_t /*displayId*/, ::android::gui::DynamicDisplayInfo* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status getDynamicDisplayInfoFromToken(const ::android::sp<::android::IBinder>& /*display*/, ::android::gui::DynamicDisplayInfo* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status getDisplayNativePrimaries(const ::android::sp<::android::IBinder>& /*display*/, ::android::gui::DisplayPrimaries* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status setActiveColorMode(const ::android::sp<::android::IBinder>& /*display*/, int32_t /*colorMode*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status setBootDisplayMode(const ::android::sp<::android::IBinder>& /*display*/, int32_t /*displayModeId*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status clearBootDisplayMode(const ::android::sp<::android::IBinder>& /*display*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status getBootDisplayModeSupport(bool* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status getHdrConversionCapabilities(::std::vector<::android::gui::HdrConversionCapability>* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status setHdrConversionStrategy(const ::android::gui::HdrConversionStrategy& /*hdrConversionStrategy*/, int32_t* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status getHdrOutputConversionSupport(bool* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status setAutoLowLatencyMode(const ::android::sp<::android::IBinder>& /*display*/, bool /*on*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status setGameContentType(const ::android::sp<::android::IBinder>& /*display*/, bool /*on*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status captureDisplay(const ::android::gui::DisplayCaptureArgs& /*args*/, const ::android::sp<::android::gui::IScreenCaptureListener>& /*listener*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status captureDisplayById(int64_t /*displayId*/, const ::android::gui::CaptureArgs& /*args*/, const ::android::sp<::android::gui::IScreenCaptureListener>& /*listener*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status captureLayersSync(const ::android::gui::LayerCaptureArgs& /*args*/, ::android::gui::ScreenCaptureResults* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status captureLayers(const ::android::gui::LayerCaptureArgs& /*args*/, const ::android::sp<::android::gui::IScreenCaptureListener>& /*listener*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status clearAnimationFrameStats() override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status getAnimationFrameStats(::android::gui::FrameStats* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status overrideHdrTypes(const ::android::sp<::android::IBinder>& /*display*/, const ::std::vector<int32_t>& /*hdrTypes*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status onPullAtom(int32_t /*atomId*/, ::android::gui::PullAtomData* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status getLayerDebugInfo(::std::vector<::android::gui::LayerDebugInfo>* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status getCompositionPreference(::android::gui::CompositionPreference* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status getDisplayedContentSamplingAttributes(const ::android::sp<::android::IBinder>& /*display*/, ::android::gui::ContentSamplingAttributes* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status setDisplayContentSamplingEnabled(const ::android::sp<::android::IBinder>& /*display*/, bool /*enable*/, int8_t /*componentMask*/, int64_t /*maxFrames*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status getDisplayedContentSample(const ::android::sp<::android::IBinder>& /*display*/, int64_t /*maxFrames*/, int64_t /*timestamp*/, ::android::gui::DisplayedFrameStats* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status getProtectedContentSupport(bool* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status isWideColorDisplay(const ::android::sp<::android::IBinder>& /*token*/, bool* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status addRegionSamplingListener(const ::android::gui::ARect& /*samplingArea*/, const ::android::sp<::android::IBinder>& /*stopLayerHandle*/, const ::android::sp<::android::gui::IRegionSamplingListener>& /*listener*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status removeRegionSamplingListener(const ::android::sp<::android::gui::IRegionSamplingListener>& /*listener*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status addFpsListener(int32_t /*taskId*/, const ::android::sp<::android::gui::IFpsListener>& /*listener*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status removeFpsListener(const ::android::sp<::android::gui::IFpsListener>& /*listener*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status addTunnelModeEnabledListener(const ::android::sp<::android::gui::ITunnelModeEnabledListener>& /*listener*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status removeTunnelModeEnabledListener(const ::android::sp<::android::gui::ITunnelModeEnabledListener>& /*listener*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status setDesiredDisplayModeSpecs(const ::android::sp<::android::IBinder>& /*displayToken*/, const ::android::gui::DisplayModeSpecs& /*specs*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status getDesiredDisplayModeSpecs(const ::android::sp<::android::IBinder>& /*displayToken*/, ::android::gui::DisplayModeSpecs* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status getDisplayBrightnessSupport(const ::android::sp<::android::IBinder>& /*displayToken*/, bool* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status setDisplayBrightness(const ::android::sp<::android::IBinder>& /*displayToken*/, const ::android::gui::DisplayBrightness& /*brightness*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status addHdrLayerInfoListener(const ::android::sp<::android::IBinder>& /*displayToken*/, const ::android::sp<::android::gui::IHdrLayerInfoListener>& /*listener*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status removeHdrLayerInfoListener(const ::android::sp<::android::IBinder>& /*displayToken*/, const ::android::sp<::android::gui::IHdrLayerInfoListener>& /*listener*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status notifyPowerBoost(int32_t /*boostId*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status setGlobalShadowSettings(const ::android::gui::Color& /*ambientColor*/, const ::android::gui::Color& /*spotColor*/, float /*lightPosY*/, float /*lightPosZ*/, float /*lightRadius*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status getDisplayDecorationSupport(const ::android::sp<::android::IBinder>& /*displayToken*/, ::std::optional<::android::gui::DisplayDecorationSupport>* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status setGameModeFrameRateOverride(int32_t /*uid*/, float /*frameRate*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status setGameDefaultFrameRateOverride(int32_t /*uid*/, float /*frameRate*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status updateSmallAreaDetection(const ::std::vector<int32_t>& /*appIds*/, const ::std::vector<float>& /*thresholds*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status setSmallAreaDetectionThreshold(int32_t /*appId*/, float /*threshold*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status enableRefreshRateOverlay(bool /*active*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status setDebugFlash(int32_t /*delay*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status scheduleComposite() override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status scheduleCommit() override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status forceClientComposition(bool /*enabled*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status getGpuContextPriority(int32_t* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status getMaxAcquiredBufferCount(int32_t* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status addWindowInfosListener(const ::android::sp<::android::gui::IWindowInfosListener>& /*windowInfosListener*/, ::android::gui::WindowInfosListenerInfo* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status removeWindowInfosListener(const ::android::sp<::android::gui::IWindowInfosListener>& /*windowInfosListener*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status getOverlaySupport(::android::gui::OverlayProperties* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status getStalledTransactionInfo(int32_t /*pid*/, ::std::optional<::android::gui::StalledTransactionInfo>* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status getSchedulingPolicy(::android::gui::SchedulingPolicy* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
};  // class ISurfaceComposerDefault
}  // namespace gui
}  // namespace android
namespace android {
namespace gui {
[[nodiscard]] static inline std::string toString(ISurfaceComposer::VsyncSource val) {
  switch(val) {
  case ISurfaceComposer::VsyncSource::eVsyncSourceApp:
    return "eVsyncSourceApp";
  case ISurfaceComposer::VsyncSource::eVsyncSourceSurfaceFlinger:
    return "eVsyncSourceSurfaceFlinger";
  default:
    return std::to_string(static_cast<int8_t>(val));
  }
}
}  // namespace gui
}  // namespace android
namespace android {
namespace internal {
#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wc++17-extensions"
template <>
constexpr inline std::array<::android::gui::ISurfaceComposer::VsyncSource, 2> enum_values<::android::gui::ISurfaceComposer::VsyncSource> = {
  ::android::gui::ISurfaceComposer::VsyncSource::eVsyncSourceApp,
  ::android::gui::ISurfaceComposer::VsyncSource::eVsyncSourceSurfaceFlinger,
};
#pragma clang diagnostic pop
}  // namespace internal
}  // namespace android
namespace android {
namespace gui {
[[nodiscard]] static inline std::string toString(ISurfaceComposer::EventRegistration val) {
  switch(val) {
  case ISurfaceComposer::EventRegistration::modeChanged:
    return "modeChanged";
  case ISurfaceComposer::EventRegistration::frameRateOverride:
    return "frameRateOverride";
  default:
    return std::to_string(static_cast<int8_t>(val));
  }
}
}  // namespace gui
}  // namespace android
namespace android {
namespace internal {
#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wc++17-extensions"
template <>
constexpr inline std::array<::android::gui::ISurfaceComposer::EventRegistration, 2> enum_values<::android::gui::ISurfaceComposer::EventRegistration> = {
  ::android::gui::ISurfaceComposer::EventRegistration::modeChanged,
  ::android::gui::ISurfaceComposer::EventRegistration::frameRateOverride,
};
#pragma clang diagnostic pop
}  // namespace internal
}  // namespace android
