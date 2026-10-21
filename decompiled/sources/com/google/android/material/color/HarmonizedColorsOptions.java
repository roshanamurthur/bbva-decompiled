package com.google.android.material.color;

import androidx.annotation.AttrRes;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes10.dex */
public class HarmonizedColorsOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @ColorRes
    public final int[] f44340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final HarmonizedColorAttributes f44341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @AttrRes
    public final int f44342c;

    public static class Builder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public HarmonizedColorAttributes f44344b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        @ColorRes
        public int[] f44343a = new int[0];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @AttrRes
        public int f44345c = R.attr.colorPrimary;

        @NonNull
        public HarmonizedColorsOptions build() {
            return new HarmonizedColorsOptions(this);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setColorAttributeToHarmonizeWith(@AttrRes int i10) {
            this.f44345c = i10;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setColorAttributes(@Nullable HarmonizedColorAttributes harmonizedColorAttributes) {
            this.f44344b = harmonizedColorAttributes;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setColorResourceIds(@NonNull @ColorRes int[] iArr) {
            this.f44343a = iArr;
            return this;
        }
    }

    public HarmonizedColorsOptions(Builder builder) {
        this.f44340a = builder.f44343a;
        this.f44341b = builder.f44344b;
        this.f44342c = builder.f44345c;
    }

    @NonNull
    public static HarmonizedColorsOptions createMaterialDefaults() {
        return new Builder().setColorAttributes(HarmonizedColorAttributes.createMaterialDefaults()).build();
    }

    @AttrRes
    public int getColorAttributeToHarmonizeWith() {
        return this.f44342c;
    }

    @Nullable
    public HarmonizedColorAttributes getColorAttributes() {
        return this.f44341b;
    }

    @NonNull
    @ColorRes
    public int[] getColorResourceIds() {
        return this.f44340a;
    }
}
