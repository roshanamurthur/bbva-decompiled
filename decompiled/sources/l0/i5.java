package l0;

import androidx.compose.material3.TimePickerState;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i5 extends Lambda implements Function1<IntSize, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f82620p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(TimePickerState timePickerState) {
        super(1);
        this.f82620p0 = timePickerState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(IntSize intSize) {
        this.f82620p0.m1421setCentergyyYBs$material3_release(IntSizeKt.m4555getCenterozmzZPI(intSize.getF18319a()));
        return Unit.INSTANCE;
    }
}
