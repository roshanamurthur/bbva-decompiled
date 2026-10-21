package com.bbva.localstorage.extension;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Any.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a!\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\u0000¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"valueOrDefault", ExifInterface.GPS_DIRECTION_TRUE, "", "default", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "local-storage_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AnyKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T valueOrDefault(@Nullable Object obj, T t10) {
        return obj == 0 ? t10 : obj;
    }
}
