package h3;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: ViewUtilsApi29.java */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(29)
public final class w extends v {
    @Override // h3.s
    public final float a(@NonNull View view) {
        return view.getTransitionAlpha();
    }

    @Override // h3.s
    public final void b(@NonNull View view, float f6) {
        view.setTransitionAlpha(f6);
    }

    @Override // h3.v, h3.s
    public final void c(@NonNull View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // h3.t
    public final void d(@NonNull View view, @Nullable Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // h3.t
    public final void e(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // h3.t
    public final void f(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // h3.u
    public final void g(@NonNull View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }
}
