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
public final class b3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f12687p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f12688q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f12689r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ TextFieldColors f12690s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Shape f12691t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ int f12692u0;
    public final /* synthetic */ int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ int f12693w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(boolean z10, boolean z11, MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors, Shape shape, int i10, int i11, int i12) {
        super(2);
        this.f12687p0 = z10;
        this.f12688q0 = z11;
        this.f12689r0 = mutableInteractionSource;
        this.f12690s0 = textFieldColors;
        this.f12691t0 = shape;
        this.f12692u0 = i10;
        this.v0 = i11;
        this.f12693w0 = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(255570733, iIntValue, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:374)");
            }
            OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
            boolean z10 = this.f12687p0;
            boolean z11 = this.f12688q0;
            MutableInteractionSource mutableInteractionSource = this.f12689r0;
            TextFieldColors textFieldColors = this.f12690s0;
            Shape shape = this.f12691t0;
            int i10 = ((this.f12692u0 >> 9) & 14) | 12582912 | ((this.v0 >> 6) & 112);
            int i11 = this.f12693w0;
            outlinedTextFieldDefaults.m1192ContainerBoxnbWgWpA(z10, z11, mutableInteractionSource, textFieldColors, shape, 0.0f, 0.0f, composer2, i10 | ((i11 << 6) & 896) | ((i11 << 3) & 7168) | ((i11 << 9) & 57344), 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
