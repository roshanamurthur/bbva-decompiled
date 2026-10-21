package com.airbnb.lottie;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class LottieResult<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final V f25657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Throwable f25658b;

    public LottieResult(V v3) {
        this.f25657a = v3;
        this.f25658b = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieResult)) {
            return false;
        }
        LottieResult lottieResult = (LottieResult) obj;
        if (getValue() != null && getValue().equals(lottieResult.getValue())) {
            return true;
        }
        if (getException() == null || lottieResult.getException() == null) {
            return false;
        }
        return getException().toString().equals(getException().toString());
    }

    @Nullable
    public Throwable getException() {
        return this.f25658b;
    }

    @Nullable
    public V getValue() {
        return this.f25657a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getValue(), getException()});
    }

    public LottieResult(Throwable th2) {
        this.f25658b = th2;
        this.f25657a = null;
    }
}
