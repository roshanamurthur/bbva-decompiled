package l0;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.ShapesKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b5 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f82458p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ TextFieldColors f82459q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors) {
        super(2);
        this.f82458p0 = mutableInteractionSource;
        this.f82459q0 = textFieldColors;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-968963953, iIntValue, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1456)");
            }
            OutlinedTextFieldDefaults.INSTANCE.m1192ContainerBoxnbWgWpA(true, false, this.f82458p0, this.f82459q0, ShapesKt.toShape(TimeInputTokens.INSTANCE.getTimeFieldContainerShape(), composer2, 6), 0.0f, 0.0f, composer2, 12583350, 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
