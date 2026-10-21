package com.airbnb.lottie;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class TextDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f25669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final LottieAnimationView f25670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final LottieDrawable f25671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25672d;

    @VisibleForTesting
    public TextDelegate() {
        this.f25669a = new HashMap();
        this.f25672d = true;
        this.f25670b = null;
        this.f25671c = null;
    }

    public String getText(String str) {
        return str;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final String getTextInternal(String str, String str2) {
        boolean z10 = this.f25672d;
        HashMap map = this.f25669a;
        if (z10 && map.containsKey(str2)) {
            return (String) map.get(str2);
        }
        String text = getText(str, str2);
        if (this.f25672d) {
            map.put(str2, text);
        }
        return text;
    }

    public void invalidateAllText() {
        this.f25669a.clear();
        LottieAnimationView lottieAnimationView = this.f25670b;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        LottieDrawable lottieDrawable = this.f25671c;
        if (lottieDrawable != null) {
            lottieDrawable.invalidateSelf();
        }
    }

    public void invalidateText(String str) {
        this.f25669a.remove(str);
        LottieAnimationView lottieAnimationView = this.f25670b;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        LottieDrawable lottieDrawable = this.f25671c;
        if (lottieDrawable != null) {
            lottieDrawable.invalidateSelf();
        }
    }

    public void setCacheText(boolean z10) {
        this.f25672d = z10;
    }

    public void setText(String str, String str2) {
        this.f25669a.put(str, str2);
        LottieAnimationView lottieAnimationView = this.f25670b;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        LottieDrawable lottieDrawable = this.f25671c;
        if (lottieDrawable != null) {
            lottieDrawable.invalidateSelf();
        }
    }

    public String getText(String str, String str2) {
        return getText(str2);
    }

    public TextDelegate(LottieAnimationView lottieAnimationView) {
        this.f25669a = new HashMap();
        this.f25672d = true;
        this.f25670b = lottieAnimationView;
        this.f25671c = null;
    }

    public TextDelegate(LottieDrawable lottieDrawable) {
        this.f25669a = new HashMap();
        this.f25672d = true;
        this.f25671c = lottieDrawable;
        this.f25670b = null;
    }
}
