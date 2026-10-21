package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SelectionManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g extends Lambda implements Function0<Offset> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SelectionManager f6476p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ MutableState<IntSize> f6477q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SelectionManager selectionManager, MutableState<IntSize> mutableState) {
        super(0);
        this.f6476p0 = selectionManager;
        this.f6477q0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Offset invoke() {
        return Offset.m2264boximpl(SelectionManagerKt.m632calculateSelectionMagnifierCenterAndroidO0kMr_c(this.f6476p0, this.f6477q0.getValue().getF18319a()));
    }
}
