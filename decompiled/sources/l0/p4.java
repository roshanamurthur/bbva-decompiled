package l0;

import androidx.compose.material3.TimePickerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class p4 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Modifier f82801p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ float f82802q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82803r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f82804s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ int f82805t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(float f6, int i10, int i11, Modifier modifier, Function2 function2) {
        super(2);
        this.f82801p0 = modifier;
        this.f82802q0 = f6;
        this.f82803r0 = function2;
        this.f82804s0 = i10;
        this.f82805t0 = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        TimePickerKt.m1404access$CircularLayoutuFdPcIQ(this.f82801p0, this.f82802q0, this.f82803r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f82804s0 | 1), this.f82805t0);
        return Unit.INSTANCE;
    }
}
