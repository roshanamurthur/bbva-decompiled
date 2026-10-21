package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: MaterialShapeDrawable.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements ShapeAppearanceModel.CornerSizeUnaryOperator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ float f45336p0;

    public a(float f6) {
        this.f45336p0 = f6;
    }

    @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
    @NonNull
    public final CornerSize apply(@NonNull CornerSize cornerSize) {
        return cornerSize instanceof RelativeCornerSize ? cornerSize : new AdjustedCornerSize(this.f45336p0, cornerSize);
    }
}
