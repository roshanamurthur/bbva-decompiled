package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f48622p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f48623q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f48624r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Object f48625s0;

    public /* synthetic */ c(Object obj, Object obj2, int i10, Object obj3) {
        this.f48622p0 = i10;
        this.f48623q0 = obj;
        this.f48624r0 = obj2;
        this.f48625s0 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f48622p0;
        Object obj = this.f48625s0;
        Object obj2 = this.f48623q0;
        switch (i10) {
            case 0:
                ((EnhancedIntentService) obj2).lambda$processIntent$0((Intent) this.f48624r0, (TaskCompletionSource) obj);
                break;
            default:
                String tag = (String) obj2;
                Throwable tr = (Throwable) obj;
                Intrinsics.checkNotNullParameter(tag, "$tag");
                Intrinsics.checkNotNullParameter(tr, "$tr");
                break;
        }
    }
}
