package l0;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ChipKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int E0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82462p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ TextStyle f82463q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ long f82464r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82465s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82466t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82467u0;
    public final /* synthetic */ long v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ long f82468w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ float f82469x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f82470y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c0(Function2<? super Composer, ? super Integer, Unit> function2, TextStyle textStyle, long j10, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, Function2<? super Composer, ? super Integer, Unit> function5, long j11, long j12, float f6, PaddingValues paddingValues, int i10) {
        super(2);
        this.f82462p0 = function2;
        this.f82463q0 = textStyle;
        this.f82464r0 = j10;
        this.f82465s0 = function3;
        this.f82466t0 = function4;
        this.f82467u0 = function5;
        this.v0 = j11;
        this.f82468w0 = j12;
        this.f82469x0 = f6;
        this.f82470y0 = paddingValues;
        this.E0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        ChipKt.m950access$ChipContentfe0OD_I(this.f82462p0, this.f82463q0, this.f82464r0, this.f82465s0, this.f82466t0, this.f82467u0, this.v0, this.f82468w0, this.f82469x0, this.f82470y0, composer, RecomposeScopeImplKt.updateChangedFlags(this.E0 | 1));
        return Unit.INSTANCE;
    }
}
