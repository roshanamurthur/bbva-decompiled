package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: compiled from: AppCompatTextHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TextView f1618p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Typeface f1619q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f1620r0;

    public i0(TextView textView, Typeface typeface, int i10) {
        this.f1618p0 = textView;
        this.f1619q0 = typeface;
        this.f1620r0 = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1618p0.setTypeface(this.f1619q0, this.f1620r0);
    }
}
