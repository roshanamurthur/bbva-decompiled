package com.google.firebase.installations.time;

/* JADX INFO: loaded from: classes10.dex */
public class SystemClock implements Clock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SystemClock f48510a;

    public static SystemClock getInstance() {
        if (f48510a == null) {
            f48510a = new SystemClock();
        }
        return f48510a;
    }

    @Override // com.google.firebase.installations.time.Clock
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
