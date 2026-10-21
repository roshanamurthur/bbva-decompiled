package com.bbva.semaas;

import androidx.camera.core.impl.utils.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Config.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/bbva/semaas/OmegaConfig;", "Lcom/bbva/semaas/ServiceConfig;", "host", "", "namespace", "mrId", "timeSpan", "", "chunkSize", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "semaas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OmegaConfig extends ServiceConfig {
    public /* synthetic */ OmegaConfig(String str, String str2, String str3, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i12 & 8) != 0 ? 10 : i10, (i12 & 16) != 0 ? 100 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OmegaConfig(@NotNull String host, @NotNull String namespace, @NotNull String mrId, int i10, int i11) {
        super(host, c.b(new StringBuilder("/v1/ns/"), namespace, "/mrs/", mrId, "/logs"), i10, i11);
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Intrinsics.checkNotNullParameter(mrId, "mrId");
    }
}
