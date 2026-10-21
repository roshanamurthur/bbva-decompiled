package com.google.firebase.messaging;

import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: RequestDeduplicator.java */
/* JADX INFO: loaded from: classes10.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f48650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    public final ArrayMap f48651b = new ArrayMap();

    public n(ExecutorService executorService) {
        this.f48650a = executorService;
    }
}
