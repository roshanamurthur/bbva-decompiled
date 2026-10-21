package com.huawei.hms.feature.tasks;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes10.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f50564a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Queue<com.huawei.hms.feature.tasks.listener.a> f50565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f50566c;

    public final void a() {
        com.huawei.hms.feature.tasks.listener.a aVarPoll;
        synchronized (this.f50564a) {
            if (this.f50565b != null && !this.f50566c) {
                this.f50566c = true;
                while (true) {
                    synchronized (this.f50564a) {
                        try {
                            aVarPoll = this.f50565b.poll();
                            if (aVarPoll == null) {
                                this.f50566c = false;
                                return;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    aVarPoll.a();
                }
            }
        }
    }

    public void a(com.huawei.hms.feature.tasks.listener.a aVar) {
        synchronized (this.f50564a) {
            try {
                if (this.f50565b == null) {
                    this.f50565b = new ArrayDeque();
                }
                this.f50565b.add(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
