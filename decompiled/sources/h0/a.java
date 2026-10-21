package h0;

import androidx.compose.material.AnchoredDragScope;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a {
    public static /* synthetic */ void a(AnchoredDragScope anchoredDragScope, float f6, float f10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dragTo");
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        anchoredDragScope.dragTo(f6, f10);
    }
}
