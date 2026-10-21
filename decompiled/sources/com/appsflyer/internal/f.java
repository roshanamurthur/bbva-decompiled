package com.appsflyer.internal;

import android.util.Log;
import com.mypinpad.tsdk.isolation.setImeActionLabel;
import com.mypinpad.tsdk.isolation.xi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f26404p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f26405q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f26406r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Object f26407s0;

    public /* synthetic */ f(Object obj, Object obj2, int i10, Object obj3) {
        this.f26404p0 = i10;
        this.f26405q0 = obj;
        this.f26406r0 = obj2;
        this.f26407s0 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        int i10 = this.f26404p0;
        Object obj = this.f26406r0;
        Object obj2 = this.f26405q0;
        Object obj3 = this.f26407s0;
        switch (i10) {
            case 0:
                AFc1wSDK.valueOf((AFc1wSDK) obj2, (Throwable) obj, (String) obj3);
                break;
            case 1:
                xi.setDividerPadding(new Object[]{(xi) obj2, (setImeActionLabel) obj, (CompletableDeferred) obj3}, 1917066951, -1917066936, (int) System.currentTimeMillis());
                break;
            default:
                String tag = (String) obj3;
                Throwable tr = (Throwable) obj;
                Intrinsics.checkNotNullParameter(tag, "$tag");
                Intrinsics.checkNotNullParameter(tr, "$tr");
                Log.wtf(tag, (String) obj2, tr);
                break;
        }
    }

    public /* synthetic */ f(String str, String str2, Throwable th2) {
        this.f26404p0 = 2;
        this.f26407s0 = str;
        this.f26405q0 = str2;
        this.f26406r0 = th2;
    }
}
