package androidx.core.provider;

import android.graphics.Typeface;

/* JADX INFO: compiled from: CallbackWithHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ FontsContractCompat.FontRequestCallback f20046p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Typeface f20047q0;

    public a(FontsContractCompat.FontRequestCallback fontRequestCallback, Typeface typeface) {
        this.f20046p0 = fontRequestCallback;
        this.f20047q0 = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20046p0.onTypefaceRetrieved(this.f20047q0);
    }
}
