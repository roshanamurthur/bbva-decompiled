package l0;

import androidx.compose.material3.StateData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends Lambda implements Function1<Long, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ StateData f82714p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(StateData stateData) {
        super(1);
        this.f82714p0 = stateData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l6) {
        long jLongValue = l6.longValue();
        StateData stateData = this.f82714p0;
        stateData.getSelectedStartDate().setValue(stateData.getCalendarModel().getCanonicalDate(jLongValue));
        return Unit.INSTANCE;
    }
}
