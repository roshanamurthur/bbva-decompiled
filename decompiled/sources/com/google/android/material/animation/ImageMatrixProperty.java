package com.google.android.material.animation;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public class ImageMatrixProperty extends Property<ImageView, Matrix> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f43900a;

    public ImageMatrixProperty() {
        super(Matrix.class, "imageMatrixProperty");
        this.f43900a = new Matrix();
    }

    @Override // android.util.Property
    @NonNull
    public Matrix get(@NonNull ImageView imageView) {
        Matrix matrix = this.f43900a;
        matrix.set(imageView.getImageMatrix());
        return matrix;
    }

    @Override // android.util.Property
    public void set(@NonNull ImageView imageView, @NonNull Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
