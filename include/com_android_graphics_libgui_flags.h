#pragma once

#ifndef COM_ANDROID_GRAPHICS_LIBGUI_FLAGS
#define COM_ANDROID_GRAPHICS_LIBGUI_FLAGS(FLAG) COM_ANDROID_GRAPHICS_LIBGUI_FLAGS_##FLAG
#endif
#ifndef COM_ANDROID_GRAPHICS_LIBGUI_FLAGS_BQ_SETFRAMERATE
#define COM_ANDROID_GRAPHICS_LIBGUI_FLAGS_BQ_SETFRAMERATE false
#endif
#ifndef COM_ANDROID_GRAPHICS_LIBGUI_FLAGS_FRAMETIMESTAMPS_PREVIOUSRELEASE
#define COM_ANDROID_GRAPHICS_LIBGUI_FLAGS_FRAMETIMESTAMPS_PREVIOUSRELEASE false
#endif

#ifdef __cplusplus
#include <memory>

namespace com::android::graphics::libgui::flags {

class flag_provider_interface {
public:
    virtual ~flag_provider_interface() = default;
    virtual bool bq_setframerate() = 0;
    virtual bool frametimestamps_previousrelease() = 0;
};

extern std::unique_ptr<flag_provider_interface> provider_;

inline bool bq_setframerate() {
    return false;
}
inline bool frametimestamps_previousrelease() {
    return false;
}

} // namespace com::android::graphics::libgui::flags

extern "C" {
#endif // __cplusplus

bool com_android_graphics_libgui_flags_bq_setframerate();
bool com_android_graphics_libgui_flags_frametimestamps_previousrelease();

#ifdef __cplusplus
} // extern "C"
#endif
