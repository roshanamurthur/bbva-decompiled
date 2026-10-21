package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: DateRangePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends Lambda implements Function1<LazyListScope, Unit> {
    public final /* synthetic */ String E0;
    public final /* synthetic */ String F0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ StateData f12739p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CalendarMonth f12740q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f12741r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f12742s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Function1<Long, Unit> f12743t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ CalendarDate f12744u0;
    public final /* synthetic */ Function1<Long, Boolean> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ int f12745w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ LazyListState f12746x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f12747y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d1(StateData stateData, CalendarMonth calendarMonth, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, Function1<? super Long, Unit> function1, CalendarDate calendarDate, Function1<? super Long, Boolean> function2, int i10, LazyListState lazyListState, CoroutineScope coroutineScope, String str, String str2) {
        super(1);
        this.f12739p0 = stateData;
        this.f12740q0 = calendarMonth;
        this.f12741r0 = datePickerFormatter;
        this.f12742s0 = datePickerColors;
        this.f12743t0 = function1;
        this.f12744u0 = calendarDate;
        this.v0 = function2;
        this.f12745w0 = i10;
        this.f12746x0 = lazyListState;
        this.f12747y0 = coroutineScope;
        this.E0 = str;
        this.F0 = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        androidx.compose.foundation.lazy.a.k(LazyColumn, this.f12739p0.getTotalMonthsInRange(), null, null, ComposableLambdaKt.composableLambdaInstance(1246706073, true, new c1(this.f12739p0, this.f12740q0, this.f12741r0, this.f12742s0, this.f12743t0, this.f12744u0, this.v0, this.f12745w0, this.f12746x0, this.f12747y0, this.E0, this.F0)), 6, null);
        return Unit.INSTANCE;
    }
}
