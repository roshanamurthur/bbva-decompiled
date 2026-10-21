package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ModalBottomSheet.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c2 extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SheetState f12718p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f12719q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(SheetState sheetState, CoroutineScope coroutineScope) {
        super(0);
        this.f12718p0 = sheetState;
        this.f12719q0 = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        SheetState sheetState = this.f12718p0;
        if (sheetState.getSwipeableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.PartiallyExpanded).booleanValue()) {
            BuildersKt__Builders_commonKt.launch$default(this.f12719q0, null, null, new b2(sheetState, null), 3, null);
        }
        return Boolean.TRUE;
    }
}
