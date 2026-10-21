package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import androidx.annotation.NonNull;
import androidx.datastore.preferences.protobuf.e;

/* JADX INFO: loaded from: classes10.dex */
public class MatrixEvaluator implements TypeEvaluator<Matrix> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f43901a = new float[9];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f43902b = new float[9];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f43903c = new Matrix();

    @Override // android.animation.TypeEvaluator
    @NonNull
    public Matrix evaluate(float f6, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
        float[] fArr = this.f43901a;
        matrix.getValues(fArr);
        float[] fArr2 = this.f43902b;
        matrix2.getValues(fArr2);
        for (int i10 = 0; i10 < 9; i10++) {
            float f10 = fArr2[i10];
            float f11 = fArr[i10];
            fArr2[i10] = e.a(f10, f11, f6, f11);
        }
        Matrix matrix3 = this.f43903c;
        matrix3.setValues(fArr2);
        return matrix3;
    }
}
