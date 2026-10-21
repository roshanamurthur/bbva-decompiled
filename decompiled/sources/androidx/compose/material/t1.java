package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Scaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f9020p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f9021q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f9022r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> f9023s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f9024t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f9025u0;
    public final /* synthetic */ int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ int f9026w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Function3<SnackbarHostState, Composer, Integer, Unit> f9027x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ ScaffoldState f9028y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t1(boolean z10, int i10, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, Function2<? super Composer, ? super Integer, Unit> function5, int i11, int i12, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function6, ScaffoldState scaffoldState) {
        super(2);
        this.f9020p0 = z10;
        this.f9021q0 = i10;
        this.f9022r0 = function2;
        this.f9023s0 = function3;
        this.f9024t0 = function4;
        this.f9025u0 = function5;
        this.v0 = i11;
        this.f9026w0 = i12;
        this.f9027x0 = function6;
        this.f9028y0 = scaffoldState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1128984656, iIntValue, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:179)");
            }
            boolean z10 = this.f9020p0;
            int i10 = this.f9021q0;
            Function2<Composer, Integer, Unit> function2 = this.f9022r0;
            Function3<PaddingValues, Composer, Integer, Unit> function3 = this.f9023s0;
            Function3<SnackbarHostState, Composer, Integer, Unit> function4 = this.f9027x0;
            ScaffoldState scaffoldState = this.f9028y0;
            int i11 = this.v0;
            ScaffoldKt.m813access$ScaffoldLayoutMDYNRJg(z10, i10, function2, function3, ComposableLambdaKt.composableLambda(composer2, 533782017, true, new s1(function4, scaffoldState, i11)), this.f9024t0, this.f9025u0, composer2, ((i11 >> 21) & 14) | 24576 | ((i11 >> 15) & 112) | (i11 & 896) | ((this.f9026w0 >> 12) & 7168) | (458752 & i11) | ((i11 << 9) & 3670016));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
