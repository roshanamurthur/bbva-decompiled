package com.bbva.qr.scanner.camera;

import kotlin.Metadata;
import kotlinx.coroutines.DebugKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CameraOptions.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/bbva/qr/scanner/camera/Focus;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "CONTINUOUS_PICTURE", "CONTINUOUS_VIDEO", "AUTO", "EDOF", "FIXED", "INFINITY", "MACRO", "qr_release"}, k = 1, mv = {1, 8, 0})
public enum Focus {
    CONTINUOUS_PICTURE("continuous-picture"),
    CONTINUOUS_VIDEO("continuous-video"),
    AUTO(DebugKt.DEBUG_PROPERTY_VALUE_AUTO),
    EDOF("edof"),
    FIXED("fixed"),
    INFINITY("infinity"),
    MACRO("macro");


    @NotNull
    private final String value;

    Focus(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
