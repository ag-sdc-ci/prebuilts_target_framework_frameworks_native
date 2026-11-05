/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /opt/android-sdk/build-tools/37.0.0/aidl --lang=cpp -I. -Iaidl -Iaosp -h gen/include -o gen/src aidl/android/gui/ARect.aidl aidl/android/gui/CachingHint.aidl aidl/android/gui/Color.aidl aidl/android/gui/CompositionPreference.aidl aidl/android/gui/ContentSamplingAttributes.aidl aidl/android/gui/CreateSurfaceResult.aidl aidl/android/gui/DisplayBrightness.aidl aidl/android/gui/DisplayConnectionType.aidl aidl/android/gui/DisplayDecorationSupport.aidl aidl/android/gui/DisplayPrimaries.aidl aidl/android/gui/DisplayStatInfo.aidl aidl/android/gui/DisplayState.aidl aidl/android/gui/DisplayedFrameStats.aidl aidl/android/gui/FrameEvent.aidl aidl/android/gui/FrameStats.aidl aidl/android/gui/HdrCapabilities.aidl aidl/android/gui/HdrConversionCapability.aidl aidl/android/gui/HdrConversionStrategy.aidl aidl/android/gui/IDisplayEventConnection.aidl aidl/android/gui/IFpsListener.aidl aidl/android/gui/IHdrConversionConstants.aidl aidl/android/gui/IHdrLayerInfoListener.aidl aidl/android/gui/IRegionSamplingListener.aidl aidl/android/gui/IScreenCaptureListener.aidl aidl/android/gui/ITunnelModeEnabledListener.aidl aidl/android/gui/PullAtomData.aidl aidl/android/gui/Rotation.aidl aidl/android/gui/SchedulingPolicy.aidl aidl/android/gui/Size.aidl aidl/android/gui/TrustedPresentationThresholds.aidl aidl/android/gui/WindowInfosListenerInfo.aidl aidl/android/gui/BitTube.aidl aidl/android/gui/CaptureArgs.aidl aidl/android/gui/DeviceProductInfo.aidl aidl/android/gui/DisplayCaptureArgs.aidl aidl/android/gui/DisplayMode.aidl aidl/android/gui/DisplayModeSpecs.aidl aidl/android/gui/DynamicDisplayInfo.aidl aidl/android/gui/FrameTimelineInfo.aidl aidl/android/gui/ISurfaceComposer.aidl aidl/android/gui/ISurfaceComposerClient.aidl aidl/android/gui/LayerCaptureArgs.aidl aidl/android/gui/LayerDebugInfo.aidl aidl/android/gui/LayerMetadata.aidl aidl/android/gui/OverlayProperties.aidl aidl/android/gui/ParcelableVsyncEventData.aidl aidl/android/gui/ScreenCaptureResults.aidl aidl/android/gui/StaticDisplayInfo.aidl android/gui/DropInputMode.aidl android/gui/FocusRequest.aidl android/gui/IWindowInfosListener.aidl android/gui/IWindowInfosPublisher.aidl android/gui/IWindowInfosReportedListener.aidl android/gui/InputApplicationInfo.aidl android/gui/StalledTransactionInfo.aidl android/gui/TouchOcclusionMode.aidl android/gui/DisplayInfo.aidl android/gui/WindowInfo.aidl android/gui/WindowInfosUpdate.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
#pragma once

#include <binder/IInterface.h>
#include <android/gui/ISurfaceComposerClient.h>
#include <android/gui/BnSurfaceComposerClient.h>
#include <binder/Delegate.h>


namespace android {
namespace gui {
class LIBBINDER_EXPORTED BnSurfaceComposerClient : public ::android::BnInterface<ISurfaceComposerClient> {
public:
  static constexpr uint32_t TRANSACTION_createSurface = ::android::IBinder::FIRST_CALL_TRANSACTION + 0;
  static constexpr uint32_t TRANSACTION_clearLayerFrameStats = ::android::IBinder::FIRST_CALL_TRANSACTION + 1;
  static constexpr uint32_t TRANSACTION_getLayerFrameStats = ::android::IBinder::FIRST_CALL_TRANSACTION + 2;
  static constexpr uint32_t TRANSACTION_mirrorSurface = ::android::IBinder::FIRST_CALL_TRANSACTION + 3;
  static constexpr uint32_t TRANSACTION_mirrorDisplay = ::android::IBinder::FIRST_CALL_TRANSACTION + 4;
  static constexpr uint32_t TRANSACTION_getSchedulingPolicy = ::android::IBinder::FIRST_CALL_TRANSACTION + 5;
  explicit BnSurfaceComposerClient();
  ::android::status_t onTransact(uint32_t _aidl_code, const ::android::Parcel& _aidl_data, ::android::Parcel* _aidl_reply, uint32_t _aidl_flags) override;
};  // class BnSurfaceComposerClient

class LIBBINDER_EXPORTED ISurfaceComposerClientDelegator : public BnSurfaceComposerClient {
public:
  explicit ISurfaceComposerClientDelegator(const ::android::sp<ISurfaceComposerClient> &impl) : _aidl_delegate(impl) {}

  ::android::sp<ISurfaceComposerClient> getImpl() { return _aidl_delegate; }
  ::android::binder::Status createSurface(const ::std::string& name, int32_t flags, const ::android::sp<::android::IBinder>& parent, const ::android::gui::LayerMetadata& metadata, ::android::gui::CreateSurfaceResult* _aidl_return) override {
    return _aidl_delegate->createSurface(name, flags, parent, metadata, _aidl_return);
  }
  ::android::binder::Status clearLayerFrameStats(const ::android::sp<::android::IBinder>& handle) override {
    return _aidl_delegate->clearLayerFrameStats(handle);
  }
  ::android::binder::Status getLayerFrameStats(const ::android::sp<::android::IBinder>& handle, ::android::gui::FrameStats* _aidl_return) override {
    return _aidl_delegate->getLayerFrameStats(handle, _aidl_return);
  }
  ::android::binder::Status mirrorSurface(const ::android::sp<::android::IBinder>& mirrorFromHandle, ::android::gui::CreateSurfaceResult* _aidl_return) override {
    return _aidl_delegate->mirrorSurface(mirrorFromHandle, _aidl_return);
  }
  ::android::binder::Status mirrorDisplay(int64_t displayId, ::android::gui::CreateSurfaceResult* _aidl_return) override {
    return _aidl_delegate->mirrorDisplay(displayId, _aidl_return);
  }
  ::android::binder::Status getSchedulingPolicy(::android::gui::SchedulingPolicy* _aidl_return) override {
    return _aidl_delegate->getSchedulingPolicy(_aidl_return);
  }
private:
  ::android::sp<ISurfaceComposerClient> _aidl_delegate;
};  // class ISurfaceComposerClientDelegator
}  // namespace gui
}  // namespace android
