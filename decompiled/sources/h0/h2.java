package h0;

import androidx.compose.foundation.layout.PaddingValues;
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
public final class h2 extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f68795p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f68796q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f68797r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f68798s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ boolean f68799t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f68800u0;
    public final /* synthetic */ int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> f68801w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(int i10, int i11, Function2 function2, Function2 function3, Function2 function4, Function2 function5, Function3 function6, boolean z10) {
        super(2);
        this.f68795p0 = function2;
        this.f68796q0 = function3;
        this.f68797r0 = function4;
        this.f68798s0 = i10;
        this.f68799t0 = z10;
        this.f68800u0 = function5;
        this.v0 = i11;
        this.f68801w0 = function6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        SubcomposeMeasureScope SubcomposeLayout = subcomposeMeasureScope;
        long f18296a = constraints.getF18296a();
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        int iM4357getMaxWidthimpl = Constraints.m4357getMaxWidthimpl(f18296a);
        int iM4356getMaxHeightimpl = Constraints.m4356getMaxHeightimpl(f18296a);
        return MeasureScope.CC.q(SubcomposeLayout, iM4357getMaxWidthimpl, iM4356getMaxHeightimpl, null, new androidx.compose.material.u1(SubcomposeLayout, this.f68795p0, this.f68796q0, this.f68797r0, this.f68798s0, iM4357getMaxWidthimpl, this.f68799t0, iM4356getMaxHeightimpl, Constraints.m4349copyZbe2FdA$default(f18296a, 0, 0, 0, 0, 10, null), this.f68800u0, this.v0, this.f68801w0), 4, null);
    }
}
