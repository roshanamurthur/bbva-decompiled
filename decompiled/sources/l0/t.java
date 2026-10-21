package l0;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> E0;
    public final /* synthetic */ int F0;
    public final /* synthetic */ int G0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SheetState f82923p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ float f82924q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ boolean f82925r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ float f82926s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Shape f82927t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ long f82928u0;
    public final /* synthetic */ long v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ float f82929w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ float f82930x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82931y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(SheetState sheetState, float f6, boolean z10, float f10, Shape shape, long j10, long j11, float f11, float f12, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
        super(2);
        this.f82923p0 = sheetState;
        this.f82924q0 = f6;
        this.f82925r0 = z10;
        this.f82926s0 = f10;
        this.f82927t0 = shape;
        this.f82928u0 = j10;
        this.v0 = j11;
        this.f82929w0 = f11;
        this.f82930x0 = f12;
        this.f82931y0 = function2;
        this.E0 = function3;
        this.F0 = i10;
        this.G0 = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        BottomSheetScaffoldKt.m927access$StandardBottomSheet8oydGBM(this.f82923p0, this.f82924q0, this.f82925r0, this.f82926s0, this.f82927t0, this.f82928u0, this.v0, this.f82929w0, this.f82930x0, this.f82931y0, this.E0, composer, RecomposeScopeImplKt.updateChangedFlags(this.F0 | 1), RecomposeScopeImplKt.updateChangedFlags(this.G0));
        return Unit.INSTANCE;
    }
}
