package com.google.android.material.color;

import android.app.Activity;
import android.graphics.Bitmap;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import com.google.android.material.color.utilities.QuantizerCelebi;
import com.google.android.material.color.utilities.Score;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes10.dex */
public class DynamicColorsOptions {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f44326e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f44327f = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @StyleRes
    public final int f44328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final DynamicColors.Precondition f44329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final DynamicColors.OnAppliedCallback f44330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Integer f44331d;

    public class a implements DynamicColors.Precondition {
        @Override // com.google.android.material.color.DynamicColors.Precondition
        public final boolean shouldApplyDynamicColors(@NonNull Activity activity, int i10) {
            return true;
        }
    }

    public DynamicColorsOptions(Builder builder) {
        this.f44328a = builder.f44332a;
        this.f44329b = builder.f44333b;
        this.f44330c = builder.f44334c;
        Integer num = builder.f44336e;
        if (num != null) {
            this.f44331d = num;
            return;
        }
        Bitmap bitmap = builder.f44335d;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            this.f44331d = Integer.valueOf(Score.score(QuantizerCelebi.quantize(iArr, 128)).get(0).intValue());
        }
    }

    @Nullable
    public Integer getContentBasedSeedColor() {
        return this.f44331d;
    }

    @NonNull
    public DynamicColors.OnAppliedCallback getOnAppliedCallback() {
        return this.f44330c;
    }

    @NonNull
    public DynamicColors.Precondition getPrecondition() {
        return this.f44329b;
    }

    @StyleRes
    public int getThemeOverlay() {
        return this.f44328a;
    }

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @StyleRes
        public int f44332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public DynamicColors.Precondition f44333b = DynamicColorsOptions.f44326e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public DynamicColors.OnAppliedCallback f44334c = DynamicColorsOptions.f44327f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Bitmap f44335d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public Integer f44336e;

        @NonNull
        public DynamicColorsOptions build() {
            return new DynamicColorsOptions(this);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setContentBasedSource(@NonNull Bitmap bitmap) {
            this.f44335d = bitmap;
            this.f44336e = null;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setOnAppliedCallback(@NonNull DynamicColors.OnAppliedCallback onAppliedCallback) {
            this.f44334c = onAppliedCallback;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setPrecondition(@NonNull DynamicColors.Precondition precondition) {
            this.f44333b = precondition;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setThemeOverlay(@StyleRes int i10) {
            this.f44332a = i10;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setContentBasedSource(@ColorInt int i10) {
            this.f44335d = null;
            this.f44336e = Integer.valueOf(i10);
            return this;
        }
    }

    public class b implements DynamicColors.OnAppliedCallback {
        @Override // com.google.android.material.color.DynamicColors.OnAppliedCallback
        public final void onApplied(@NonNull Activity activity) {
        }
    }
}
