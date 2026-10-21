package com.bbva.glomohybrid.logs.extensions;

import bk.q;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.glomohybrid.logs.model.Trace;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TraceExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"plus", "", "", "", LogKeysKt.TRACE, "Lcom/bbva/glomohybrid/logs/model/Trace;", "glomo-logs_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TraceExtensionsKt {
    @NotNull
    public static final Map<String, Object> plus(@NotNull Map<String, ? extends Object> map, @NotNull Trace trace) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(trace, "trace");
        return q.plus(map, q.mapOf(TuplesKt.to("name", trace.getName()), TuplesKt.to(LogKeysKt.START_DATE, trace.getCom.bbva.glomohybrid.logs.LogKeysKt.START_DATE java.lang.String()), TuplesKt.to(LogKeysKt.END_DATE, trace.getCom.bbva.glomohybrid.logs.LogKeysKt.END_DATE java.lang.String()), TuplesKt.to(LogKeysKt.PROPERTIES, trace.getProperties())));
    }
}
