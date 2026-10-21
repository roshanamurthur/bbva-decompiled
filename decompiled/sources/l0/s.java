package l0;

import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class s extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SheetState f82850p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f82851q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ String f82852r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ String f82853s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ String f82854t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f82855u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(SheetState sheetState, boolean z10, String str, String str2, String str3, CoroutineScope coroutineScope) {
        super(1);
        this.f82850p0 = sheetState;
        this.f82851q0 = z10;
        this.f82852r0 = str;
        this.f82853s0 = str2;
        this.f82854t0 = str3;
        this.f82855u0 = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SheetState sheetState = this.f82850p0;
        if (sheetState.getSwipeableState$material3_release().getAnchors$material3_release().size() > 1 && this.f82851q0) {
            SheetValue currentValue = sheetState.getCurrentValue();
            SheetValue sheetValue = SheetValue.PartiallyExpanded;
            CoroutineScope coroutineScope = this.f82855u0;
            if (currentValue == sheetValue) {
                if (sheetState.getSwipeableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Expanded).booleanValue()) {
                    SemanticsPropertiesKt.expand(semantics, this.f82852r0, new n(sheetState, coroutineScope));
                }
            } else if (sheetState.getSwipeableState$material3_release().getConfirmValueChange$material3_release().invoke(sheetValue).booleanValue()) {
                SemanticsPropertiesKt.collapse(semantics, this.f82853s0, new p(sheetState, coroutineScope));
            }
            if (!sheetState.getSkipHiddenState()) {
                SemanticsPropertiesKt.dismiss(semantics, this.f82854t0, new r(sheetState, coroutineScope));
            }
        }
        return Unit.INSTANCE;
    }
}
