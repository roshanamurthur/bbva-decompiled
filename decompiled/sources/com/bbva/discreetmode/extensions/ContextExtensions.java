package com.bbva.discreetmode.extensions;

import android.content.Context;
import androidx.core.content.ContextCompat;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ContextExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000¨\u0006\u0003"}, d2 = {"isCameraPermissionGranted", "", "Landroid/content/Context;", "discreetmode_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
@JvmName(name = "ContextExtensions")
public final class ContextExtensions {
    public static final boolean isCameraPermissionGranted(@Nullable Context context) {
        return context != null && ContextCompat.checkSelfPermission(context, "android.permission.CAMERA") == 0;
    }
}
