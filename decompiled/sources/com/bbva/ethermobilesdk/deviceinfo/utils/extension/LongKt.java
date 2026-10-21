package com.bbva.ethermobilesdk.deviceinfo.utils.extension;

import android.content.Context;
import android.text.format.Formatter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Long.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"formatResultFileSizeToString", "", "", "context", "Landroid/content/Context;", "deviceinfo_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LongKt {
    @NotNull
    public static final String formatResultFileSizeToString(long j10, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String fileSize = Formatter.formatFileSize(context, j10);
        Intrinsics.checkNotNullExpressionValue(fileSize, "formatFileSize(context, this)");
        return fileSize;
    }
}
