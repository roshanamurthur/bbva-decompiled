package h0;

import androidx.compose.material.BottomSheetState;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ BottomSheetState f69107p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f69108q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(BottomSheetState bottomSheetState, CoroutineScope coroutineScope) {
        super(1);
        this.f69107p0 = bottomSheetState;
        this.f69108q0 = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        BottomSheetState bottomSheetState = this.f69107p0;
        if (bottomSheetState.getAnchoredDraggableState$material_release().getAnchors$material_release().size() > 1) {
            boolean zIsCollapsed = bottomSheetState.isCollapsed();
            CoroutineScope coroutineScope = this.f69108q0;
            if (zIsCollapsed) {
                SemanticsPropertiesKt.expand$default(semantics, null, new q(bottomSheetState, coroutineScope), 1, null);
            } else {
                SemanticsPropertiesKt.collapse$default(semantics, null, new s(bottomSheetState, coroutineScope), 1, null);
            }
        }
        return Unit.INSTANCE;
    }
}
