package androidx.compose.material;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f8434p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f8435q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f8436r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f8437s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f8438t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ int f8439u0;
    public final /* synthetic */ SelectableChipColors v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ boolean f8440w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ int f8441x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ State<Color> f8442y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(int i10, int i11, SelectableChipColors selectableChipColors, State state, Function2 function2, Function2 function3, Function2 function4, Function3 function5, boolean z10, boolean z11) {
        super(2);
        this.f8434p0 = function2;
        this.f8435q0 = z10;
        this.f8436r0 = function3;
        this.f8437s0 = function4;
        this.f8438t0 = function5;
        this.f8439u0 = i10;
        this.v0 = selectableChipColors;
        this.f8440w0 = z11;
        this.f8441x0 = i11;
        this.f8442y0 = state;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1582291359, iIntValue, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous> (Chip.kt:210)");
            }
            TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer2, 6).getBody2();
            Function2<Composer, Integer, Unit> function2 = this.f8434p0;
            boolean z10 = this.f8435q0;
            Function2<Composer, Integer, Unit> function3 = this.f8436r0;
            Function2<Composer, Integer, Unit> function4 = this.f8437s0;
            Function3<RowScope, Composer, Integer, Unit> function5 = this.f8438t0;
            TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer2, -1543702066, true, new d0(this.f8439u0, this.f8441x0, this.v0, this.f8442y0, function2, function3, function4, function5, z10, this.f8440w0)), composer2, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
