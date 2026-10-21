package l0;

import androidx.compose.material3.TimePickerState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t4 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f82961p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f82962q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f82963r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ float f82964s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ boolean f82965t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Offset> f82966u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(boolean z10, CoroutineScope coroutineScope, TimePickerState timePickerState, float f6, boolean z11, MutableState<Offset> mutableState) {
        super(1);
        this.f82961p0 = z10;
        this.f82962q0 = coroutineScope;
        this.f82963r0 = timePickerState;
        this.f82964s0 = f6;
        this.f82965t0 = z11;
        this.f82966u0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.onClick$default(semantics, null, new s4(this.f82962q0, this.f82963r0, this.f82964s0, this.f82965t0, this.f82966u0), 1, null);
        SemanticsPropertiesKt.setSelected(semantics, this.f82961p0);
        return Unit.INSTANCE;
    }
}
