package com.google.android.material.color;

import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import com.google.android.material.R;

/* JADX INFO: loaded from: classes10.dex */
public final class HarmonizedColorAttributes {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f44337c = {R.attr.colorError, R.attr.colorOnError, R.attr.colorErrorContainer, R.attr.colorOnErrorContainer};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f44338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @StyleRes
    public final int f44339b;

    public HarmonizedColorAttributes(@AttrRes @NonNull int[] iArr, @StyleRes int i10) {
        if (i10 != 0 && iArr.length == 0) {
            throw new IllegalArgumentException("Theme overlay should be used with the accompanying int[] attributes.");
        }
        this.f44338a = iArr;
        this.f44339b = i10;
    }

    @NonNull
    public static HarmonizedColorAttributes create(@AttrRes @NonNull int[] iArr) {
        return new HarmonizedColorAttributes(iArr, 0);
    }

    @NonNull
    public static HarmonizedColorAttributes createMaterialDefaults() {
        return create(f44337c, R.style.ThemeOverlay_Material3_HarmonizedColors);
    }

    @NonNull
    public int[] getAttributes() {
        return this.f44338a;
    }

    @StyleRes
    public int getThemeOverlay() {
        return this.f44339b;
    }

    @NonNull
    public static HarmonizedColorAttributes create(@AttrRes @NonNull int[] iArr, @StyleRes int i10) {
        return new HarmonizedColorAttributes(iArr, i10);
    }
}
