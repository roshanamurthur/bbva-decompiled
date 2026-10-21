package androidx.compose.material;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ModalBottomSheet.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ModalBottomSheetState f8823p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f8824q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(ModalBottomSheetState modalBottomSheetState, CoroutineScope coroutineScope) {
        super(0);
        this.f8823p0 = modalBottomSheetState;
        this.f8824q0 = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        ModalBottomSheetState modalBottomSheetState = this.f8823p0;
        if (modalBottomSheetState.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Expanded).booleanValue()) {
            BuildersKt__Builders_commonKt.launch$default(this.f8824q0, null, null, new k1(modalBottomSheetState, null), 3, null);
        }
        return Boolean.TRUE;
    }
}
