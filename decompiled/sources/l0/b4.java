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
public final class b4 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82452p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82453q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82454r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ TextStyle f82455s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ long f82456t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ long f82457u0;
    public final /* synthetic */ int v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b4(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, TextStyle textStyle, long j10, long j11, int i10) {
        super(2);
        this.f82452p0 = function2;
        this.f82453q0 = function3;
        this.f82454r0 = function4;
        this.f82455s0 = textStyle;
        this.f82456t0 = j10;
        this.f82457u0 = j11;
        this.v0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        SnackbarKt.m1249access$OneRowSnackbarkKq0p4A(this.f82452p0, this.f82453q0, this.f82454r0, this.f82455s0, this.f82456t0, this.f82457u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1));
        return Unit.INSTANCE;
    }
}
