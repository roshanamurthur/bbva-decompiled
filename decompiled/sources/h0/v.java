package h0;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material.BottomSheetScaffoldKt;
import androidx.compose.material.BottomSheetState;
import androidx.compose.material.BottomSheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.IntSize;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class v extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int E0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ BottomSheetState f69131p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f69132q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function1<IntSize, Map<BottomSheetValue, Float>> f69133r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Shape f69134s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ float f69135t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ long f69136u0;
    public final /* synthetic */ long v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ Modifier f69137w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f69138x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ int f69139y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v(BottomSheetState bottomSheetState, boolean z10, Function1<? super IntSize, ? extends Map<BottomSheetValue, Float>> function1, Shape shape, float f6, long j10, long j11, Modifier modifier, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
        super(2);
        this.f69131p0 = bottomSheetState;
        this.f69132q0 = z10;
        this.f69133r0 = function1;
        this.f69134s0 = shape;
        this.f69135t0 = f6;
        this.f69136u0 = j10;
        this.v0 = j11;
        this.f69137w0 = modifier;
        this.f69138x0 = function3;
        this.f69139y0 = i10;
        this.E0 = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        BottomSheetScaffoldKt.m678access$BottomSheet0cLKjW4(this.f69131p0, this.f69132q0, this.f69133r0, this.f69134s0, this.f69135t0, this.f69136u0, this.v0, this.f69137w0, this.f69138x0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f69139y0 | 1), this.E0);
        return Unit.INSTANCE;
    }
}
