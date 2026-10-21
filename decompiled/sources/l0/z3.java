package l0;

import androidx.compose.material3.SnackbarKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Snackbar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class z3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f83070p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f83071q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f83072r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ TextStyle f83073s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ long f83074t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ long f83075u0;
    public final /* synthetic */ int v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z3(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, TextStyle textStyle, long j10, long j11, int i10) {
        super(2);
        this.f83070p0 = function2;
        this.f83071q0 = function3;
        this.f83072r0 = function4;
        this.f83073s0 = textStyle;
        this.f83074t0 = j10;
        this.f83075u0 = j11;
        this.v0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        SnackbarKt.m1248access$NewLineButtonSnackbarkKq0p4A(this.f83070p0, this.f83071q0, this.f83072r0, this.f83073s0, this.f83074t0, this.f83075u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1));
        return Unit.INSTANCE;
    }
}
