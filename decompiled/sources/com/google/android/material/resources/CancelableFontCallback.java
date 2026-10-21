package com.google.android.material.resources;

import android.graphics.Typeface;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class CancelableFontCallback extends TextAppearanceFontCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Typeface f45093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApplyFont f45094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45095c;

    public interface ApplyFont {
        void apply(Typeface typeface);
    }

    public CancelableFontCallback(ApplyFont applyFont, Typeface typeface) {
        this.f45093a = typeface;
        this.f45094b = applyFont;
    }

    public void cancel() {
        this.f45095c = true;
    }

    @Override // com.google.android.material.resources.TextAppearanceFontCallback
    public void onFontRetrievalFailed(int i10) {
        if (this.f45095c) {
            return;
        }
        this.f45094b.apply(this.f45093a);
    }

    @Override // com.google.android.material.resources.TextAppearanceFontCallback
    public void onFontRetrieved(Typeface typeface, boolean z10) {
        if (this.f45095c) {
            return;
        }
        this.f45094b.apply(typeface);
    }
}
