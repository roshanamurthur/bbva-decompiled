package l0;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Scaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a3 extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82413p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82414q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82415r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f82416s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ WindowInsets f82417t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82418u0;
    public final /* synthetic */ int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> f82419w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(int i10, int i11, WindowInsets windowInsets, Function2 function2, Function2 function3, Function2 function4, Function2 function5, Function3 function6) {
        super(2);
        this.f82413p0 = function2;
        this.f82414q0 = function3;
        this.f82415r0 = function4;
        this.f82416s0 = i10;
        this.f82417t0 = windowInsets;
        this.f82418u0 = function5;
        this.v0 = i11;
        this.f82419w0 = function6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        SubcomposeMeasureScope SubcomposeLayout = subcomposeMeasureScope;
        long f18296a = constraints.getF18296a();
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        int iM4357getMaxWidthimpl = Constraints.m4357getMaxWidthimpl(f18296a);
        int iM4356getMaxHeightimpl = Constraints.m4356getMaxHeightimpl(f18296a);
        return MeasureScope.CC.q(SubcomposeLayout, iM4357getMaxWidthimpl, iM4356getMaxHeightimpl, null, new androidx.compose.material3.d3(SubcomposeLayout, this.f82413p0, this.f82414q0, this.f82415r0, this.f82416s0, iM4357getMaxWidthimpl, this.f82417t0, Constraints.m4349copyZbe2FdA$default(f18296a, 0, 0, 0, 0, 10, null), this.f82418u0, this.v0, this.f82419w0, iM4356getMaxHeightimpl), 4, null);
    }
}
