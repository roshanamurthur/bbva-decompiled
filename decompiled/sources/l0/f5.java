package l0;

import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.TimePickerColors;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f5 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Modifier f82553p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f82554q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function1<TextFieldValue, Unit> f82555r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f82556s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ int f82557t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ KeyboardOptions f82558u0;
    public final /* synthetic */ KeyboardActions v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ TimePickerColors f82559w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ int f82560x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ int f82561y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f5(Modifier modifier, TextFieldValue textFieldValue, Function1<? super TextFieldValue, Unit> function1, TimePickerState timePickerState, int i10, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, TimePickerColors timePickerColors, int i11, int i12) {
        super(2);
        this.f82553p0 = modifier;
        this.f82554q0 = textFieldValue;
        this.f82555r0 = function1;
        this.f82556s0 = timePickerState;
        this.f82557t0 = i10;
        this.f82558u0 = keyboardOptions;
        this.v0 = keyboardActions;
        this.f82559w0 = timePickerColors;
        this.f82560x0 = i11;
        this.f82561y0 = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        TimePickerKt.m1405access$TimePickerTextFieldlxUZ_iY(this.f82553p0, this.f82554q0, this.f82555r0, this.f82556s0, this.f82557t0, this.f82558u0, this.v0, this.f82559w0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f82560x0 | 1), this.f82561y0);
        return Unit.INSTANCE;
    }
}
