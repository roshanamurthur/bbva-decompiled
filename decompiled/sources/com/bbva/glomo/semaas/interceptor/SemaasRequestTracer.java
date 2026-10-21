package com.bbva.glomo.semaas.interceptor;

import bk.p;
import bk.q;
import com.bbva.ethermobile.elogger.EtherLogger;
import com.bbva.ethermobile.elogger.LoggableItem;
import com.bbva.glomo.semaas.FilterLogLevel;
import com.bbva.glomohybrid.logs.LogKeysKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SemaasRequestTracer.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/glomo/semaas/interceptor/SemaasRequestTracer;", "Lcom/bbva/glomo/semaas/interceptor/RequestsTracer;", "()V", LogKeysKt.TRACE, "", LogKeysKt.START_DATE, "", LogKeysKt.END_DATE, "headers", "", "", "Companion", "glomo-semaas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SemaasRequestTracer implements RequestsTracer {
    @Override // com.bbva.glomo.semaas.interceptor.RequestsTracer
    public void trace(long startDate, long endDate, @NotNull Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        EtherLogger etherLogger = EtherLogger.INSTANCE;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = TuplesKt.to("type", LogKeysKt.TRACE);
        pairArr[1] = TuplesKt.to("level", Integer.valueOf(FilterLogLevel.Info.ordinal()));
        pairArr[2] = TuplesKt.to("name", "request");
        pairArr[3] = TuplesKt.to(LogKeysKt.START_DATE, Long.valueOf(startDate));
        pairArr[4] = TuplesKt.to(LogKeysKt.END_DATE, Long.valueOf(endDate));
        String str = headers.get("requestId");
        if (str == null) {
            str = "";
        }
        pairArr[5] = TuplesKt.to(LogKeysKt.PROPERTIES, p.mapOf(TuplesKt.to("requestId", str)));
        EtherLogger.log$default(etherLogger, null, "com.bbva.semaas", null, new LoggableItem(q.mapOf(pairArr)), 5, null);
    }
}
