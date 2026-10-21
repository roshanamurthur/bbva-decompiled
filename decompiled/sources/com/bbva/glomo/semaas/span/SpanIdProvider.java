package com.bbva.glomo.semaas.span;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SpanIdProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"Lcom/bbva/glomo/semaas/span/SpanIdProvider;", "", "getSpanId", "", "glomo-semaas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SpanIdProvider {

    /* JADX INFO: compiled from: SpanIdProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static String getSpanId(@NotNull SpanIdProvider spanIdProvider) {
            return "";
        }
    }

    @NotNull
    String getSpanId();
}
