package com.bbva.glomoutils.mappable;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MappableEngine.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\f\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/bbva/glomoutils/mappable/MappableEngine;", "", "Lcom/bbva/glomoutils/mappable/MappableConverter;", "converter", "", "setDefault", "a", "Lcom/bbva/glomoutils/mappable/MappableConverter;", "getDefaultConverter$gl_utils_release", "()Lcom/bbva/glomoutils/mappable/MappableConverter;", "setDefaultConverter$gl_utils_release", "(Lcom/bbva/glomoutils/mappable/MappableConverter;)V", "defaultConverter", "<init>", "()V", "gl-utils_release"}, k = 1, mv = {1, 9, 0})
public final class MappableEngine {

    @NotNull
    public static final MappableEngine INSTANCE = new MappableEngine();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static MappableConverter defaultConverter = new GsonMappableConverter();

    @NotNull
    public final MappableConverter getDefaultConverter$gl_utils_release() {
        return defaultConverter;
    }

    public final void setDefault(@NotNull MappableConverter converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        defaultConverter = converter;
    }

    public final void setDefaultConverter$gl_utils_release(@NotNull MappableConverter mappableConverter) {
        Intrinsics.checkNotNullParameter(mappableConverter, "<set-?>");
        defaultConverter = mappableConverter;
    }
}
