package com.bbva.glomoutils.mappable;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MappableEngine.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\u001a\u0018\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0003\u001a$\u0010\u0000\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00030\u0004¨\u0006\u0005"}, d2 = {"toMap", "", "", "", "", "gl-utils_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MappableEngineKt {
    @NotNull
    public static final Map<String, Object> toMap(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        return MappableEngine.INSTANCE.getDefaultConverter$gl_utils_release().toMap(obj);
    }

    @NotNull
    public static final List<Map<String, Object>> toMap(@NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return MappableEngine.INSTANCE.getDefaultConverter$gl_utils_release().toMap(list);
    }
}
