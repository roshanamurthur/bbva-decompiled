package com.google.android.material.color;

import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes10.dex */
public class ColorContrastOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @StyleRes
    public final int f44313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @StyleRes
    public final int f44314b;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @StyleRes
        public int f44315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @StyleRes
        public int f44316b;

        @NonNull
        public ColorContrastOptions build() {
            return new ColorContrastOptions(this);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setHighContrastThemeOverlay(@StyleRes int i10) {
            this.f44316b = i10;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setMediumContrastThemeOverlay(@StyleRes int i10) {
            this.f44315a = i10;
            return this;
        }
    }

    public ColorContrastOptions(Builder builder) {
        this.f44313a = builder.f44315a;
        this.f44314b = builder.f44316b;
    }

    @StyleRes
    public int getHighContrastThemeOverlay() {
        return this.f44314b;
    }

    @StyleRes
    public int getMediumContrastThemeOverlay() {
        return this.f44313a;
    }
}
