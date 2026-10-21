package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
public final class l0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Matrix f17416a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final int[] f17417b = new int[2];

    @Override // androidx.compose.ui.platform.j0
    @DoNotInline
    public void a(@NotNull View view, @NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Matrix matrix2 = this.f17416a;
        matrix2.reset();
        view.transformMatrixToGlobal(matrix2);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f17417b;
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix2.postTranslate(iArr[0] - i10, iArr[1] - i11);
        AndroidMatrixConversions_androidKt.m2388setFromtUYjHk(matrix, matrix2);
    }
}
