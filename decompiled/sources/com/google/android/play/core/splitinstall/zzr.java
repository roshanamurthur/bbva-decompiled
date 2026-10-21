package com.google.android.play.core.splitinstall;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f46368a = new AtomicReference(null);

    public static void zzb(zzq zzqVar) {
        AtomicReference atomicReference = f46368a;
        while (!atomicReference.compareAndSet(null, zzqVar)) {
            if (atomicReference.get() != null && atomicReference.get() != null) {
                return;
            }
        }
    }
}
