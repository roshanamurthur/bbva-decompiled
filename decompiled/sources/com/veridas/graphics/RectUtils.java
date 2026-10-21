package com.veridas.graphics;

import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RectUtils.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00052\b\u0010\u0006\u001a\u0004\u0018\u0001H\u00052\b\u0010\u0007\u001a\u0004\u0018\u0001H\u0005H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/veridas/graphics/RectUtils;", "", "()V", "safeEquals", "", ExifInterface.GPS_DIRECTION_TRUE, "a", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RectUtils {

    @NotNull
    public static final RectUtils INSTANCE = new RectUtils();

    private RectUtils() {
    }

    @JvmStatic
    public static final <T> boolean safeEquals(@Nullable T a10, @Nullable T b10) {
        return Intrinsics.areEqual(a10, b10);
    }
}
