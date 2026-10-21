package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends Lambda implements Function1<DisplayMode, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ DatePickerState f12680p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(DatePickerState datePickerState) {
        super(1);
        this.f12680p0 = datePickerState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DisplayMode displayMode) {
        this.f12680p0.getStateData().m1250switchDisplayModevCnGnXg(displayMode.getF10188a());
        return Unit.INSTANCE;
    }
}
