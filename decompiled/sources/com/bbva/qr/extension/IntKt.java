package com.bbva.qr.extension;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Int.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toFormatIdentifier", "", "", "qr_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class IntKt {
    @NotNull
    public static final String toFormatIdentifier(int i10) {
        if (i10 == 1) {
            return "code128";
        }
        if (i10 == 3) {
            return "isbn";
        }
        if (i10 == 8) {
            return "codabar";
        }
        if (i10 == 32) {
            return "ean13";
        }
        if (i10 == 64) {
            return "ean8";
        }
        if (i10 == 128) {
            return "itf";
        }
        if (i10 == 256) {
            return "qrcode";
        }
        if (i10 == 512) {
            return "upca";
        }
        if (i10 != 1024) {
            return i10 != 2048 ? "unknown" : "pdf417";
        }
        return "upce";
    }
}
