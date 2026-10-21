package h0;

import androidx.compose.material.BottomSheetState;
import androidx.compose.material.BottomSheetValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class s extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ BottomSheetState f69090p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f69091q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(BottomSheetState bottomSheetState, CoroutineScope coroutineScope) {
        super(0);
        this.f69090p0 = bottomSheetState;
        this.f69091q0 = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        BottomSheetState bottomSheetState = this.f69090p0;
        if (bottomSheetState.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(BottomSheetValue.Collapsed).booleanValue()) {
            BuildersKt__Builders_commonKt.launch$default(this.f69091q0, null, null, new r(bottomSheetState, null), 3, null);
        }
        return Boolean.TRUE;
    }
}
