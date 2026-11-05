/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /opt/android-sdk/build-tools/37.0.0/aidl --lang=cpp -I. -Iaidl -Iaosp -h gen/include -o gen/src aidl/android/gui/ARect.aidl aidl/android/gui/CachingHint.aidl aidl/android/gui/Color.aidl aidl/android/gui/CompositionPreference.aidl aidl/android/gui/ContentSamplingAttributes.aidl aidl/android/gui/CreateSurfaceResult.aidl aidl/android/gui/DisplayBrightness.aidl aidl/android/gui/DisplayConnectionType.aidl aidl/android/gui/DisplayDecorationSupport.aidl aidl/android/gui/DisplayPrimaries.aidl aidl/android/gui/DisplayStatInfo.aidl aidl/android/gui/DisplayState.aidl aidl/android/gui/DisplayedFrameStats.aidl aidl/android/gui/FrameEvent.aidl aidl/android/gui/FrameStats.aidl aidl/android/gui/HdrCapabilities.aidl aidl/android/gui/HdrConversionCapability.aidl aidl/android/gui/HdrConversionStrategy.aidl aidl/android/gui/IDisplayEventConnection.aidl aidl/android/gui/IFpsListener.aidl aidl/android/gui/IHdrConversionConstants.aidl aidl/android/gui/IHdrLayerInfoListener.aidl aidl/android/gui/IRegionSamplingListener.aidl aidl/android/gui/IScreenCaptureListener.aidl aidl/android/gui/ITunnelModeEnabledListener.aidl aidl/android/gui/PullAtomData.aidl aidl/android/gui/Rotation.aidl aidl/android/gui/SchedulingPolicy.aidl aidl/android/gui/Size.aidl aidl/android/gui/TrustedPresentationThresholds.aidl aidl/android/gui/WindowInfosListenerInfo.aidl aidl/android/gui/BitTube.aidl aidl/android/gui/CaptureArgs.aidl aidl/android/gui/DeviceProductInfo.aidl aidl/android/gui/DisplayCaptureArgs.aidl aidl/android/gui/DisplayMode.aidl aidl/android/gui/DisplayModeSpecs.aidl aidl/android/gui/DynamicDisplayInfo.aidl aidl/android/gui/FrameTimelineInfo.aidl aidl/android/gui/ISurfaceComposer.aidl aidl/android/gui/ISurfaceComposerClient.aidl aidl/android/gui/LayerCaptureArgs.aidl aidl/android/gui/LayerDebugInfo.aidl aidl/android/gui/LayerMetadata.aidl aidl/android/gui/OverlayProperties.aidl aidl/android/gui/ParcelableVsyncEventData.aidl aidl/android/gui/ScreenCaptureResults.aidl aidl/android/gui/StaticDisplayInfo.aidl android/gui/DropInputMode.aidl android/gui/FocusRequest.aidl android/gui/IWindowInfosListener.aidl android/gui/IWindowInfosPublisher.aidl android/gui/IWindowInfosReportedListener.aidl android/gui/InputApplicationInfo.aidl android/gui/StalledTransactionInfo.aidl android/gui/TouchOcclusionMode.aidl android/gui/DisplayInfo.aidl android/gui/WindowInfo.aidl android/gui/WindowInfosUpdate.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
#pragma once

#include <android/gui/SchedulingPolicy.h>
#include <binder/IBinder.h>
#include <binder/IInterface.h>
#include <binder/Status.h>
#include <cstdint>
#include <gui/VsyncEventData.h>
#include <private/gui/BitTube.h>
#include <utils/StrongPointer.h>

namespace android::gui {
class SchedulingPolicy;
}  // namespace android::gui
namespace android {
namespace gui {
class LIBBINDER_EXPORTED IDisplayEventConnectionDelegator;

class LIBBINDER_EXPORTED IDisplayEventConnection : public ::android::IInterface {
public:
  typedef IDisplayEventConnectionDelegator DefaultDelegator;
  DECLARE_META_INTERFACE(DisplayEventConnection)
  virtual ::android::binder::Status stealReceiveChannel(::android::gui::BitTube* outChannel) = 0;
  virtual ::android::binder::Status setVsyncRate(int32_t count) = 0;
  virtual ::android::binder::Status requestNextVsync() = 0;
  virtual ::android::binder::Status getLatestVsyncEventData(::android::gui::ParcelableVsyncEventData* _aidl_return) = 0;
  virtual ::android::binder::Status getSchedulingPolicy(::android::gui::SchedulingPolicy* _aidl_return) = 0;
};  // class IDisplayEventConnection

class LIBBINDER_EXPORTED IDisplayEventConnectionDefault : public IDisplayEventConnection {
public:
  ::android::IBinder* onAsBinder() override {
    return nullptr;
  }
  ::android::binder::Status stealReceiveChannel(::android::gui::BitTube* /*outChannel*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status setVsyncRate(int32_t /*count*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status requestNextVsync() override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status getLatestVsyncEventData(::android::gui::ParcelableVsyncEventData* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status getSchedulingPolicy(::android::gui::SchedulingPolicy* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
};  // class IDisplayEventConnectionDefault
}  // namespace gui
}  // namespace android
