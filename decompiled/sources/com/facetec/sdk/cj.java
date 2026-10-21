package com.facetec.sdk;

/* JADX INFO: loaded from: classes9.dex */
enum cj {
    ZOOM_CLOSE,
    ZOOM_FAR,
    PROCESSING_COMPLETE_TIMED_OUT,
    PROCESSING_COMPLETE_SUCCESS,
    PROCESSING_COMPLETE_RETRY,
    PROCESSING_COMPLETE_STILL_COMPUTING;

    public final boolean e() {
        return this == PROCESSING_COMPLETE_RETRY || this == PROCESSING_COMPLETE_SUCCESS;
    }
}
