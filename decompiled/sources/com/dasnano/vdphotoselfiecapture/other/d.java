package com.dasnano.vdphotoselfiecapture.other;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f39716b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f39715a = i10;
        this.f39716b = obj;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        int i10 = this.f39715a;
        Object obj2 = this.f39716b;
        switch (i10) {
            case 0:
                Function1 tmp0 = (Function1) obj2;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            default:
                ((TaskCompletionSource) obj2).setResult(obj);
                break;
        }
    }
}
