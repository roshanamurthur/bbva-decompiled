package l0;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.material3.AppBarKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int E0;
    public final /* synthetic */ boolean F0;
    public final /* synthetic */ Function2<Composer, Integer, Unit> G0;
    public final /* synthetic */ Function2<Composer, Integer, Unit> H0;
    public final /* synthetic */ int I0;
    public final /* synthetic */ int J0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Modifier f82562p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ float f82563q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ long f82564r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ long f82565s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ long f82566t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82567u0;
    public final /* synthetic */ TextStyle v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ float f82568w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Arrangement.Vertical f82569x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ Arrangement.Horizontal f82570y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(Modifier modifier, float f6, long j10, long j11, long j12, Function2<? super Composer, ? super Integer, Unit> function2, TextStyle textStyle, float f10, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i10, boolean z10, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, int i11, int i12) {
        super(2);
        this.f82562p0 = modifier;
        this.f82563q0 = f6;
        this.f82564r0 = j10;
        this.f82565s0 = j11;
        this.f82566t0 = j12;
        this.f82567u0 = function2;
        this.v0 = textStyle;
        this.f82568w0 = f10;
        this.f82569x0 = vertical;
        this.f82570y0 = horizontal;
        this.E0 = i10;
        this.F0 = z10;
        this.G0 = function3;
        this.H0 = function4;
        this.I0 = i11;
        this.J0 = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        AppBarKt.m911access$TopAppBarLayoutkXwM9vE(this.f82562p0, this.f82563q0, this.f82564r0, this.f82565s0, this.f82566t0, this.f82567u0, this.v0, this.f82568w0, this.f82569x0, this.f82570y0, this.E0, this.F0, this.G0, this.H0, composer, RecomposeScopeImplKt.updateChangedFlags(this.I0 | 1), RecomposeScopeImplKt.updateChangedFlags(this.J0));
        return Unit.INSTANCE;
    }
}
