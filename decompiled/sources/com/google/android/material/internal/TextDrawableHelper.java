package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class TextDrawableHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f44888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f44889d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public TextAppearance f44892g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f44886a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f44887b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f44890e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public WeakReference<TextDrawableDelegate> f44891f = new WeakReference<>(null);

    public interface TextDrawableDelegate {
        @NonNull
        int[] getState();

        boolean onStateChange(int[] iArr);

        void onTextSizeChange();
    }

    public class a extends TextAppearanceFontCallback {
        public a() {
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public final void onFontRetrievalFailed(int i10) {
            TextDrawableHelper textDrawableHelper = TextDrawableHelper.this;
            textDrawableHelper.f44890e = true;
            TextDrawableDelegate textDrawableDelegate = textDrawableHelper.f44891f.get();
            if (textDrawableDelegate != null) {
                textDrawableDelegate.onTextSizeChange();
            }
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public final void onFontRetrieved(@NonNull Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            TextDrawableHelper textDrawableHelper = TextDrawableHelper.this;
            textDrawableHelper.f44890e = true;
            TextDrawableDelegate textDrawableDelegate = textDrawableHelper.f44891f.get();
            if (textDrawableDelegate != null) {
                textDrawableDelegate.onTextSizeChange();
            }
        }
    }

    public TextDrawableHelper(@Nullable TextDrawableDelegate textDrawableDelegate) {
        setDelegate(textDrawableDelegate);
    }

    public final void a(String str) {
        TextPaint textPaint = this.f44886a;
        this.f44888c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.f44889d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.f44890e = false;
    }

    @Nullable
    public TextAppearance getTextAppearance() {
        return this.f44892g;
    }

    public float getTextHeight(@Nullable String str) {
        if (!this.f44890e) {
            return this.f44889d;
        }
        a(str);
        return this.f44889d;
    }

    @NonNull
    public TextPaint getTextPaint() {
        return this.f44886a;
    }

    public float getTextWidth(String str) {
        if (!this.f44890e) {
            return this.f44888c;
        }
        a(str);
        return this.f44888c;
    }

    public boolean isTextWidthDirty() {
        return this.f44890e;
    }

    public void setDelegate(@Nullable TextDrawableDelegate textDrawableDelegate) {
        this.f44891f = new WeakReference<>(textDrawableDelegate);
    }

    public void setTextAppearance(@Nullable TextAppearance textAppearance, Context context) {
        if (this.f44892g != textAppearance) {
            this.f44892g = textAppearance;
            if (textAppearance != null) {
                TextPaint textPaint = this.f44886a;
                a aVar = this.f44887b;
                textAppearance.updateMeasureState(context, textPaint, aVar);
                TextDrawableDelegate textDrawableDelegate = this.f44891f.get();
                if (textDrawableDelegate != null) {
                    textPaint.drawableState = textDrawableDelegate.getState();
                }
                textAppearance.updateDrawState(context, textPaint, aVar);
                this.f44890e = true;
            }
            TextDrawableDelegate textDrawableDelegate2 = this.f44891f.get();
            if (textDrawableDelegate2 != null) {
                textDrawableDelegate2.onTextSizeChange();
                textDrawableDelegate2.onStateChange(textDrawableDelegate2.getState());
            }
        }
    }

    public void setTextSizeDirty(boolean z10) {
        this.f44890e = z10;
    }

    public void setTextWidthDirty(boolean z10) {
        this.f44890e = z10;
    }

    public void updateTextPaintDrawState(Context context) {
        this.f44892g.updateDrawState(context, this.f44886a, this.f44887b);
    }
}
