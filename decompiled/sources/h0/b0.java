package h0;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.BottomSheetScaffoldKt;
import androidx.compose.material.BottomSheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f68646p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> f68647q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function3<Integer, Composer, Integer, Unit> f68648r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f68649s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f68650t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ float f68651u0;
    public final /* synthetic */ int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ Function0<Float> f68652w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ BottomSheetState f68653x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ int f68654y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(float f6, int i10, int i11, BottomSheetState bottomSheetState, Function0 function0, Function2 function2, Function2 function3, Function2 function4, Function3 function5, Function3 function6) {
        super(2);
        this.f68646p0 = function2;
        this.f68647q0 = function5;
        this.f68648r0 = function6;
        this.f68649s0 = function3;
        this.f68650t0 = function4;
        this.f68651u0 = f6;
        this.v0 = i10;
        this.f68652w0 = function0;
        this.f68653x0 = bottomSheetState;
        this.f68654y0 = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        BottomSheetScaffoldKt.m679access$BottomSheetScaffoldLayoutKCBPh4w(this.f68646p0, this.f68647q0, this.f68648r0, this.f68649s0, this.f68650t0, this.f68651u0, this.v0, this.f68652w0, this.f68653x0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f68654y0 | 1));
        return Unit.INSTANCE;
    }
}
