package y0;

import android.graphics.ColorSpace;
import android.graphics.RectF;
import android.view.View;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.platform.d0;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.RelativeCornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.firebase.storage.StorageTask;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements DoubleFunction, SynchronizationGuard.CriticalSection, AccessibilityViewCommand, ShapeAppearanceModel.CornerSizeUnaryOperator, com.google.firebase.storage.t.a {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f94720p0;

    public /* synthetic */ g(Object obj) {
        this.f94720p0 = obj;
    }

    @Override // com.google.firebase.storage.t.a
    public final void a(Object obj, StorageTask.ProvideError provideError) {
        StorageTask<?> storageTask = (StorageTask) this.f94720p0;
        HashMap<Integer, HashSet<Integer>> map = StorageTask.f49037i;
        storageTask.getClass();
        com.google.firebase.storage.q.f49184c.b(storageTask);
        ((OnCompleteListener) obj).onComplete(storageTask);
    }

    @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
    public final CornerSize apply(CornerSize cornerSize) {
        RectF rectF = (RectF) this.f94720p0;
        RectF rectF2 = qe.s.f92861a;
        return RelativeCornerSize.createFromCornerSize(rectF, cornerSize);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public final Object execute() {
        return ((ClientHealthMetricsStore) this.f94720p0).loadClientMetrics();
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d2) {
        ColorSpace this_composeColorSpace = (ColorSpace) this.f94720p0;
        Intrinsics.checkNotNullParameter(this_composeColorSpace, "$this_composeColorSpace");
        return d0.d(this_composeColorSpace).getOetf().applyAsDouble(d2);
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        BottomSheetDragHandleView bottomSheetDragHandleView = (BottomSheetDragHandleView) this.f94720p0;
        int i10 = BottomSheetDragHandleView.G0;
        return bottomSheetDragHandleView.a();
    }
}
