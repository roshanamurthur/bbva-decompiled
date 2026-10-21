package l0;

import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.StateData;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Modifier f82542p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f82543q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f82544r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ StateData f82545s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ int f82546t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(int i10, DatePickerColors datePickerColors, StateData stateData, Modifier modifier, Function1 function1) {
        super(2);
        this.f82542p0 = modifier;
        this.f82543q0 = function1;
        this.f82544r0 = datePickerColors;
        this.f82545s0 = stateData;
        this.f82546t0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        DatePickerKt.access$YearPicker(this.f82542p0, this.f82543q0, this.f82544r0, this.f82545s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f82546t0 | 1));
        return Unit.INSTANCE;
    }
}
