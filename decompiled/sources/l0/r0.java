package l0;

import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int E0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Modifier f82829p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f82830q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f82831r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ boolean f82832s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ boolean f82833t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ boolean f82834u0;
    public final /* synthetic */ boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ String f82835w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f82836x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82837y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r0(Modifier modifier, boolean z10, Function0<Unit> function0, boolean z11, boolean z12, boolean z13, boolean z14, String str, DatePickerColors datePickerColors, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
        super(2);
        this.f82829p0 = modifier;
        this.f82830q0 = z10;
        this.f82831r0 = function0;
        this.f82832s0 = z11;
        this.f82833t0 = z12;
        this.f82834u0 = z13;
        this.v0 = z14;
        this.f82835w0 = str;
        this.f82836x0 = datePickerColors;
        this.f82837y0 = function2;
        this.E0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        DatePickerKt.access$Day(this.f82829p0, this.f82830q0, this.f82831r0, this.f82832s0, this.f82833t0, this.f82834u0, this.v0, this.f82835w0, this.f82836x0, this.f82837y0, composer, RecomposeScopeImplKt.updateChangedFlags(this.E0 | 1));
        return Unit.INSTANCE;
    }
}
