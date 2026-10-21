package com.google.mlkit.common.sdkinternal;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends PhantomReference implements Cleaner.Cleanable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f49430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f49431b;

    public /* synthetic */ a(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable) {
        super(obj, referenceQueue);
        this.f49430a = set;
        this.f49431b = runnable;
    }

    @Override // com.google.mlkit.common.sdkinternal.Cleaner.Cleanable
    public final void clean() {
        if (this.f49430a.remove(this)) {
            clear();
            this.f49431b.run();
        }
    }
}
