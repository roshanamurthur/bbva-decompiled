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
public final class w0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Modifier f83012p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f83013q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ boolean f83014r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f83015s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ String f83016t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f83017u0;
    public final /* synthetic */ Function2<Composer, Integer, Unit> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ int f83018w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w0(Modifier modifier, boolean z10, boolean z11, Function0<Unit> function0, String str, DatePickerColors datePickerColors, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
        super(2);
        this.f83012p0 = modifier;
        this.f83013q0 = z10;
        this.f83014r0 = z11;
        this.f83015s0 = function0;
        this.f83016t0 = str;
        this.f83017u0 = datePickerColors;
        this.v0 = function2;
        this.f83018w0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        DatePickerKt.access$Year(this.f83012p0, this.f83013q0, this.f83014r0, this.f83015s0, this.f83016t0, this.f83017u0, this.v0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f83018w0 | 1));
        return Unit.INSTANCE;
    }
}
