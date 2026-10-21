package com.bbva.glomo.semaas.interceptor;

import bk.q;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SemaasInterceptorHeaderConverter.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J>\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¨\u0006\b"}, d2 = {"Lcom/bbva/glomo/semaas/interceptor/SemaasInterceptorHeaderConverter;", "", "()V", "convert", "", "", "headersMapping", "requestHeaders", "glomo-semaas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSemaasInterceptorHeaderConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemaasInterceptorHeaderConverter.kt\ncom/bbva/glomo/semaas/interceptor/SemaasInterceptorHeaderConverter\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,11:1\n125#2:12\n152#2,3:13\n*S KotlinDebug\n*F\n+ 1 SemaasInterceptorHeaderConverter.kt\ncom/bbva/glomo/semaas/interceptor/SemaasInterceptorHeaderConverter\n*L\n8#1:12\n8#1:13,3\n*E\n"})
public final class SemaasInterceptorHeaderConverter {
    @NotNull
    public final Map<String, String> convert(@NotNull Map<String, String> headersMapping, @NotNull Map<String, String> requestHeaders) {
        Intrinsics.checkNotNullParameter(headersMapping, "headersMapping");
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        ArrayList arrayList = new ArrayList(headersMapping.size());
        for (Map.Entry<String, String> entry : headersMapping.entrySet()) {
            arrayList.add(TuplesKt.to(entry.getValue(), requestHeaders.get(entry.getKey())));
        }
        return q.toMap(arrayList);
    }
}
