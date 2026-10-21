package com.bbva.glomohybrid.login.data;

import kotlin.Metadata;

/* JADX INFO: compiled from: MemoryFailureCounter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/login/data/MemoryFailureCounter;", "", "", "increment", "reset", "", "attempts", "<init>", "()V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class MemoryFailureCounter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33327a = 0;

    /* JADX INFO: renamed from: attempts, reason: from getter */
    public final int getF33327a() {
        return this.f33327a;
    }

    public final void increment() {
        this.f33327a++;
    }

    public final void reset() {
        this.f33327a = 0;
    }
}
