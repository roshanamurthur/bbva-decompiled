package androidx.core.provider;

import android.os.Handler;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: CallbackWithHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final FontsContractCompat.FontRequestCallback f20050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Handler f20051b;

    public c(@NonNull FontsContractCompat.FontRequestCallback fontRequestCallback, @NonNull Handler handler) {
        this.f20050a = fontRequestCallback;
        this.f20051b = handler;
    }

    public final void a(@NonNull i.a aVar) {
        int i10 = aVar.f20068b;
        Handler handler = this.f20051b;
        FontsContractCompat.FontRequestCallback fontRequestCallback = this.f20050a;
        if (i10 == 0) {
            handler.post(new a(fontRequestCallback, aVar.f20067a));
        } else {
            handler.post(new b(fontRequestCallback, i10));
        }
    }

    public c(@NonNull FontsContractCompat.FontRequestCallback fontRequestCallback) {
        this.f20050a = fontRequestCallback;
        this.f20051b = k2.a.a();
    }
}
