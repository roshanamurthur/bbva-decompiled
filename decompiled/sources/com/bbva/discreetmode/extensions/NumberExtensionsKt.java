package com.bbva.discreetmode.extensions;

import kotlin.Metadata;

/* JADX INFO: compiled from: NumberExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0001H\u0000¨\u0006\u0003"}, d2 = {"toMicroSeconds", "", "toMilliSeconds", "discreetmode_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class NumberExtensionsKt {
    public static final long toMicroSeconds(long j10) {
        long j11 = 1000;
        return j10 * j11 * j11;
    }

    public static final long toMilliSeconds(long j10) {
        return j10 * ((long) 1000);
    }
}
