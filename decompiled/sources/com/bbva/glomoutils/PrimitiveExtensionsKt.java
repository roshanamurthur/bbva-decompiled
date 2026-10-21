package com.bbva.glomoutils;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PrimitiveExtensions.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"or", "", "value", "(Ljava/lang/Boolean;Z)Z", "gl-utils_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PrimitiveExtensionsKt {
    public static final boolean or(@Nullable Boolean bool, boolean z10) {
        return bool != null ? bool.booleanValue() : z10;
    }
}
