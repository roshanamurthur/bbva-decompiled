package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: OutlinedTextField.kt */
/* JADX INFO: loaded from: classes.dex */
public final class y2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f14389p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f14390q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f14391r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ TextFieldColors f14392s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Shape f14393t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ int f14394u0;
    public final /* synthetic */ int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ int f14395w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(boolean z10, boolean z11, MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors, Shape shape, int i10, int i11, int i12) {
        super(2);
        this.f14389p0 = z10;
        this.f14390q0 = z11;
        this.f14391r0 = mutableInteractionSource;
        this.f14392s0 = textFieldColors;
        this.f14393t0 = shape;
        this.f14394u0 = i10;
        this.v0 = i11;
        this.f14395w0 = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2108828640, iIntValue, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:215)");
            }
            OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
            boolean z10 = this.f14389p0;
            boolean z11 = this.f14390q0;
            MutableInteractionSource mutableInteractionSource = this.f14391r0;
            TextFieldColors textFieldColors = this.f14392s0;
            Shape shape = this.f14393t0;
            int i10 = ((this.f14394u0 >> 9) & 14) | 12582912 | ((this.v0 >> 6) & 112);
            int i11 = this.f14395w0;
            outlinedTextFieldDefaults.m1192ContainerBoxnbWgWpA(z10, z11, mutableInteractionSource, textFieldColors, shape, 0.0f, 0.0f, composer2, i10 | ((i11 << 6) & 896) | ((i11 << 3) & 7168) | ((i11 << 9) & 57344), 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
