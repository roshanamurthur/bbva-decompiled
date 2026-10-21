package l0;

import androidx.compose.material3.DateRangePickerKt;
import androidx.compose.material3.StateData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: DateRangePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends Lambda implements Function1<Long, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ StateData f82678p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(StateData stateData) {
        super(1);
        this.f82678p0 = stateData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l6) {
        DateRangePickerKt.access$updateDateSelection(this.f82678p0, l6.longValue());
        return Unit.INSTANCE;
    }
}
