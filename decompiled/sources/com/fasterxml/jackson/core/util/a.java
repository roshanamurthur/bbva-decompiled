package com.fasterxml.jackson.core.util;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: ThreadLocalBufferManager.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f43168a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f43169b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReferenceQueue<BufferRecycler> f43170c = new ReferenceQueue<>();

    /* JADX INFO: renamed from: com.fasterxml.jackson.core.util.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ThreadLocalBufferManager.java */
    public static final class C0193a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f43171a = new a();
    }
}
