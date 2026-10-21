package com.google.android.material.color;

import androidx.annotation.ColorInt;

/* JADX INFO: loaded from: classes10.dex */
public final class ColorRoles {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44320d;

    public ColorRoles(@ColorInt int i10, @ColorInt int i11, @ColorInt int i12, @ColorInt int i13) {
        this.f44317a = i10;
        this.f44318b = i11;
        this.f44319c = i12;
        this.f44320d = i13;
    }

    @ColorInt
    public int getAccent() {
        return this.f44317a;
    }

    @ColorInt
    public int getAccentContainer() {
        return this.f44319c;
    }

    @ColorInt
    public int getOnAccent() {
        return this.f44318b;
    }

    @ColorInt
    public int getOnAccentContainer() {
        return this.f44320d;
    }
}
