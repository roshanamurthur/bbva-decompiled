package androidx.compose.material;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ModalBottomSheet.kt */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ModalBottomSheetState f8852p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f8853q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(ModalBottomSheetState modalBottomSheetState, CoroutineScope coroutineScope) {
        super(1);
        this.f8852p0 = modalBottomSheetState;
        this.f8853q0 = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        ModalBottomSheetState modalBottomSheetState = this.f8852p0;
        if (modalBottomSheetState.isVisible()) {
            CoroutineScope coroutineScope = this.f8853q0;
            SemanticsPropertiesKt.dismiss$default(semantics, null, new j1(modalBottomSheetState, coroutineScope), 1, null);
            if (modalBottomSheetState.getAnchoredDraggableState$material_release().getCurrentValue() == ModalBottomSheetValue.HalfExpanded) {
                SemanticsPropertiesKt.expand$default(semantics, null, new l1(modalBottomSheetState, coroutineScope), 1, null);
            } else if (modalBottomSheetState.getHasHalfExpandedState$material_release()) {
                SemanticsPropertiesKt.collapse$default(semantics, null, new n1(modalBottomSheetState, coroutineScope), 1, null);
            }
        }
        return Unit.INSTANCE;
    }
}
