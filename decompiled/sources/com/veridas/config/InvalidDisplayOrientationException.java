package com.veridas.config;

import androidx.camera.camera2.internal.h0;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InvalidDisplayOrientationException.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/veridas/config/InvalidDisplayOrientationException;", "Lcom/veridas/config/ConfigurationException;", "value", "", "(Ljava/lang/String;)V", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InvalidDisplayOrientationException extends ConfigurationException {
    public InvalidDisplayOrientationException(@Nullable String str) {
        super(h0.b("Value \"", str, "\" cannot be converted to a display orientation."));
    }
}
