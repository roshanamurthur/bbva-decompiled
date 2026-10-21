package l0;

import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerFormatter;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.StateData;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ StateData f82694p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f82695q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function1<Long, Boolean> f82696r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f82697s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ int f82698t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m0(StateData stateData, DatePickerFormatter datePickerFormatter, Function1<? super Long, Boolean> function1, DatePickerColors datePickerColors, int i10) {
        super(2);
        this.f82694p0 = stateData;
        this.f82695q0 = datePickerFormatter;
        this.f82696r0 = function1;
        this.f82697s0 = datePickerColors;
        this.f82698t0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        DatePickerKt.access$DatePickerContent(this.f82694p0, this.f82695q0, this.f82696r0, this.f82697s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f82698t0 | 1));
        return Unit.INSTANCE;
    }
}
