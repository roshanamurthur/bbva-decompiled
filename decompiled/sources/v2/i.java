package v2;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.platform.h1;
import androidx.core.text.PrecomputedTextCompat;
import java.util.stream.IntStream;

/* JADX INFO: compiled from: UnprecomputeTextOnModificationSpannable.java */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements Spannable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f93966p0 = false;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NonNull
    public Spannable f93967q0;

    /* JADX INFO: compiled from: UnprecomputeTextOnModificationSpannable.java */
    public static class a {
        public boolean a(Spannable spannable) {
            return spannable instanceof PrecomputedTextCompat;
        }
    }

    /* JADX INFO: compiled from: UnprecomputeTextOnModificationSpannable.java */
    @RequiresApi(28)
    public static class b extends a {
        @Override // v2.i.a
        public final boolean a(Spannable spannable) {
            return h1.d(spannable) || (spannable instanceof PrecomputedTextCompat);
        }
    }

    public i(@NonNull Spannable spannable) {
        this.f93967q0 = spannable;
    }

    public final void a() {
        Spannable spannable = this.f93967q0;
        if (!this.f93966p0) {
            if ((Build.VERSION.SDK_INT < 28 ? new a() : new b()).a(spannable)) {
                this.f93967q0 = new SpannableString(spannable);
            }
        }
        this.f93966p0 = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f93967q0.charAt(i10);
    }

    @Override // java.lang.CharSequence
    @NonNull
    @RequiresApi(api = 24)
    public final IntStream chars() {
        return this.f93967q0.chars();
    }

    @Override // java.lang.CharSequence
    @NonNull
    @RequiresApi(api = 24)
    public final IntStream codePoints() {
        return this.f93967q0.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f93967q0.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f93967q0.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f93967q0.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return (T[]) this.f93967q0.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f93967q0.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f93967q0.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f93967q0.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f93967q0.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public final CharSequence subSequence(int i10, int i11) {
        return this.f93967q0.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public final String toString() {
        return this.f93967q0.toString();
    }
}
