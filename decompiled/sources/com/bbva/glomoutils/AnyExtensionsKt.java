package com.bbva.glomoutils;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import bk.d;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnyExtensions.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002\u001a\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005*\u0002H\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"toBundle", "Landroid/os/Bundle;", "", "toList", "", ExifInterface.GPS_DIRECTION_TRUE, "(Ljava/lang/Object;)Ljava/util/List;", "gl-utils_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AnyExtensionsKt {
    @Nullable
    public static final Bundle toBundle(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Bundle) {
            return (Bundle) obj;
        }
        boolean z10 = obj instanceof Map;
        if (!z10) {
            return null;
        }
        Map map = z10 ? (Map) obj : null;
        if (map != null) {
            return MapExtensionsKt.mapToBundle(map);
        }
        return null;
    }

    @NotNull
    public static final <T> List<T> toList(T t10) {
        return d.listOf(t10);
    }
}
