package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: DateRangePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends Lambda implements Function1<DisplayMode, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ DateRangePickerState f14344p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(DateRangePickerState dateRangePickerState) {
        super(1);
        this.f14344p0 = dateRangePickerState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DisplayMode displayMode) {
        this.f14344p0.getStateData().m1250switchDisplayModevCnGnXg(displayMode.getF10188a());
        return Unit.INSTANCE;
    }
}
