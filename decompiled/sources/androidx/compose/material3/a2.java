package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ModalBottomSheet.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a2 extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SheetState f12661p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f12662q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ SheetState f12663r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(SheetState sheetState, CoroutineScope coroutineScope, SheetState sheetState2) {
        super(0);
        this.f12661p0 = sheetState;
        this.f12662q0 = coroutineScope;
        this.f12663r0 = sheetState2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        if (this.f12661p0.getSwipeableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Expanded).booleanValue()) {
            BuildersKt__Builders_commonKt.launch$default(this.f12662q0, null, null, new z1(this.f12663r0, null), 3, null);
        }
        return Boolean.TRUE;
    }
}
