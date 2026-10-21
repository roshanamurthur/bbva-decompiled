package com.google.android.material.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.graphics.drawable.DrawableWrapperCompat;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ScaledDrawableWrapper extends DrawableWrapperCompat {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f44635q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f44636r0;

    public ScaledDrawableWrapper(@NonNull Drawable drawable, int i10, int i11) {
        super(drawable);
        this.f44635q0 = i10;
        this.f44636r0 = i11;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f44636r0;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f44635q0;
    }
}
