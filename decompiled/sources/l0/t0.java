package l0;

import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerFormatter;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DatePickerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ DatePickerState f82932p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f82933q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function1<Long, Boolean> f82934r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f82935s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ int f82936t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t0(DatePickerState datePickerState, DatePickerFormatter datePickerFormatter, Function1<? super Long, Boolean> function1, DatePickerColors datePickerColors, int i10) {
        super(2);
        this.f82932p0 = datePickerState;
        this.f82933q0 = datePickerFormatter;
        this.f82934r0 = function1;
        this.f82935s0 = datePickerColors;
        this.f82936t0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        DatePickerKt.access$SwitchableDateEntryContent(this.f82932p0, this.f82933q0, this.f82934r0, this.f82935s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f82936t0 | 1));
        return Unit.INSTANCE;
    }
}
