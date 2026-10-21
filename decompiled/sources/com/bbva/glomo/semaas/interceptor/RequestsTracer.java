package com.bbva.glomo.semaas.interceptor;

import com.bbva.glomohybrid.logs.LogKeysKt;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RequestsTracer.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH&¨\u0006\n"}, d2 = {"Lcom/bbva/glomo/semaas/interceptor/RequestsTracer;", "", LogKeysKt.TRACE, "", LogKeysKt.START_DATE, "", LogKeysKt.END_DATE, "headers", "", "", "glomo-semaas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface RequestsTracer {
    void trace(long startDate, long endDate, @NotNull Map<String, String> headers);
}
