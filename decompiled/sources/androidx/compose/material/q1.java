package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: OutlinedTextField.kt */
/* JADX INFO: loaded from: classes.dex */
public final class q1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f8913p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f8914q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f8915r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ TextFieldColors f8916s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Shape f8917t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ int f8918u0;
    public final /* synthetic */ int v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(boolean z10, boolean z11, MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors, Shape shape, int i10, int i11) {
        super(2);
        this.f8913p0 = z10;
        this.f8914q0 = z11;
        this.f8915r0 = mutableInteractionSource;
        this.f8916s0 = textFieldColors;
        this.f8917t0 = shape;
        this.f8918u0 = i10;
        this.v0 = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1823843281, iIntValue, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:204)");
            }
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
            boolean z10 = this.f8913p0;
            boolean z11 = this.f8914q0;
            MutableInteractionSource mutableInteractionSource = this.f8915r0;
            TextFieldColors textFieldColors = this.f8916s0;
            Shape shape = this.f8917t0;
            int i10 = ((this.f8918u0 >> 9) & 14) | 12582912;
            int i11 = this.v0;
            textFieldDefaults.m863BorderBoxnbWgWpA(z10, z11, mutableInteractionSource, textFieldColors, shape, 0.0f, 0.0f, composer2, i10 | ((i11 << 3) & 112) | ((i11 >> 15) & 896) | ((i11 >> 18) & 7168) | ((i11 >> 12) & 57344), 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
