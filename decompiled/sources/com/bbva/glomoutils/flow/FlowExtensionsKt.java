package com.bbva.glomoutils.flow;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FlowExtensions.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001¨\u0006\u0003"}, d2 = {"orEmpty", "Lkotlinx/coroutines/flow/Flow;", ExifInterface.GPS_DIRECTION_TRUE, "gl-utils_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FlowExtensionsKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> Flow<T> orEmpty(@Nullable Flow<? extends T> flow) {
        return flow == 0 ? FlowKt.emptyFlow() : flow;
    }
}
