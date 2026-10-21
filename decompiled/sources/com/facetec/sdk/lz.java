package com.facetec.sdk;

/* JADX INFO: loaded from: classes9.dex */
public enum lz {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);


    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f42382j;

    lz(int i10) {
        this.f42382j = i10;
    }

    public static lz e(int i10) {
        for (lz lzVar : values()) {
            if (lzVar.f42382j == i10) {
                return lzVar;
            }
        }
        return null;
    }
}
