package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ModalBottomSheet.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d2 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SheetState f12748p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ String f12749q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ String f12750r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ String f12751s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f12752t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f12753u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(SheetState sheetState, String str, String str2, String str3, Function0<Unit> function0, CoroutineScope coroutineScope) {
        super(1);
        this.f12748p0 = sheetState;
        this.f12749q0 = str;
        this.f12750r0 = str2;
        this.f12751s0 = str3;
        this.f12752t0 = function0;
        this.f12753u0 = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.dismiss(semantics, this.f12749q0, new y1(this.f12752t0));
        SheetState sheetState = this.f12748p0;
        SheetValue currentValue = sheetState.getCurrentValue();
        SheetValue sheetValue = SheetValue.PartiallyExpanded;
        CoroutineScope coroutineScope = this.f12753u0;
        if (currentValue == sheetValue) {
            SemanticsPropertiesKt.expand(semantics, this.f12750r0, new a2(sheetState, coroutineScope, sheetState));
        } else if (sheetState.getHasPartiallyExpandedState()) {
            SemanticsPropertiesKt.collapse(semantics, this.f12751s0, new c2(sheetState, coroutineScope));
        }
        return Unit.INSTANCE;
    }
}
