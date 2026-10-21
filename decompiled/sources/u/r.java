package u;

import androidx.compose.foundation.gestures.TransformScope;
import androidx.compose.ui.geometry.Offset;

/* JADX INFO: compiled from: TransformableState.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r {
    public static /* synthetic */ void a(TransformScope transformScope, float f6, long j10, float f10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transformBy-d-4ec7I");
        }
        if ((i10 & 1) != 0) {
            f6 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            j10 = Offset.INSTANCE.m2291getZeroF1C5BW0();
        }
        if ((i10 & 4) != 0) {
            f10 = 0.0f;
        }
        transformScope.mo177transformByd4ec7I(f6, j10, f10);
    }
}
