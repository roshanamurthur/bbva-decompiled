package com.bbva.datepicker.extensions;

import kotlin.Metadata;

/* JADX INFO: compiled from: Extensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"isNotEmpty", "", "", "datepicker_release"}, k = 2, mv = {1, 4, 2})
public final class ExtensionsKt {
    public static final boolean isNotEmpty(long j10) {
        return j10 != -1 && j10 > 0;
    }
}
