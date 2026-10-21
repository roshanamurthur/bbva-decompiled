package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0000\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/mypinpad/tsdk/i/getStackTrace;", "Lcom/mypinpad/tsdk/i/setOnCapturedPointerListener;"}, k = 1, mv = {1, 5, 1})
public final class getStackTrace extends setOnCapturedPointerListener {
    public getStackTrace(Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        super((i10 & 1) != 0 ? null : th2, null);
    }

    public getStackTrace() {
        this(null, 1, null);
    }
}
