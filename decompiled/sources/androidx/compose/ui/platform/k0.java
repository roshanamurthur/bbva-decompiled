package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final int[] f17412a = new int[2];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final float[] f17413b = Matrix.m2700constructorimpl$default(null, 1, null);

    @Override // androidx.compose.ui.platform.j0
    public final void a(@NotNull View view, @NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Matrix.m2709resetimpl(matrix);
        c(view, matrix);
    }

    public final void b(float[] fArr, float f6, float f10) {
        float[] fArr2 = this.f17413b;
        Matrix.m2709resetimpl(fArr2);
        Matrix.m2720translateimpl$default(this.f17413b, f6, f10, 0.0f, 4, null);
        AndroidComposeView_androidKt.m3785access$preTransformJiSxe2E(fArr, fArr2);
    }

    public final void c(View view, float[] fArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            c((View) parent, fArr);
            b(fArr, -view.getScrollX(), -view.getScrollY());
            b(fArr, view.getLeft(), view.getTop());
        } else {
            int[] iArr = this.f17412a;
            view.getLocationInWindow(iArr);
            b(fArr, -view.getScrollX(), -view.getScrollY());
            b(fArr, iArr[0], iArr[1]);
        }
        android.graphics.Matrix viewMatrix = view.getMatrix();
        if (viewMatrix.isIdentity()) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(viewMatrix, "viewMatrix");
        float[] fArr2 = this.f17413b;
        AndroidMatrixConversions_androidKt.m2388setFromtUYjHk(fArr2, viewMatrix);
        AndroidComposeView_androidKt.m3785access$preTransformJiSxe2E(fArr, fArr2);
    }
}
