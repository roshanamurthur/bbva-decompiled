package com.bbva.semaas.cache;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MapCacheEntrySerializer.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"mapCacheEntrySerializer", "Lcom/bbva/semaas/cache/MapCacheEntrySerializer;", ExifInterface.GPS_DIRECTION_TRUE, "innerSerializer", "Lkotlinx/serialization/KSerializer;", "semaas_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MapCacheEntrySerializerKt {
    @NotNull
    public static final <T> MapCacheEntrySerializer<T> mapCacheEntrySerializer(@NotNull KSerializer<T> innerSerializer) {
        Intrinsics.checkNotNullParameter(innerSerializer, "innerSerializer");
        return new MapCacheEntrySerializer<>(innerSerializer);
    }
}
