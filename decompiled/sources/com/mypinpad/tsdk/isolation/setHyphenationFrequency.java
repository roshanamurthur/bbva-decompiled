package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002"}, d2 = {"Lcom/mypinpad/tsdk/i/setHyphenationFrequency;", "Ljava/lang/Exception;", "Lkotlin/Exception;"}, k = 1, mv = {1, 5, 1})
public final class setHyphenationFrequency extends Exception {
    public setHyphenationFrequency(Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        super((i10 & 1) != 0 ? null : th2);
    }

    public setHyphenationFrequency() {
        this(null, 1, null);
    }
}
