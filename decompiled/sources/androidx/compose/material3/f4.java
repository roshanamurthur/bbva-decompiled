package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TextFieldImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f4 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ float f12830p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ long f12831q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f12832r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f12833s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ boolean f12834t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ long f12835u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f4(float f6, long j10, Function2<? super Composer, ? super Integer, Unit> function2, int i10, boolean z10, long j11) {
        super(2);
        this.f12830p0 = f6;
        this.f12831q0 = j10;
        this.f12832r0 = function2;
        this.f12833s0 = i10;
        this.f12834t0 = z10;
        this.f12835u0 = j11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-382297919, iIntValue, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:117)");
            }
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            TextStyle textStyleLerp = TextStyleKt.lerp(materialTheme.getTypography(composer2, 6).getBodyLarge(), materialTheme.getTypography(composer2, 6).getBodySmall(), this.f12830p0);
            TextFieldImplKt.m1385DecorationKTwxG1Y(this.f12831q0, this.f12834t0 ? textStyleLerp.m3981copyCXVQc50((3653631 & 1) != 0 ? textStyleLerp.spanStyle.m3927getColor0d7_KjU() : this.f12835u0, (3653631 & 2) != 0 ? textStyleLerp.spanStyle.getFontSize() : 0L, (3653631 & 4) != 0 ? textStyleLerp.spanStyle.getFontWeight() : null, (3653631 & 8) != 0 ? textStyleLerp.spanStyle.getFontStyle() : null, (3653631 & 16) != 0 ? textStyleLerp.spanStyle.getFontSynthesis() : null, (3653631 & 32) != 0 ? textStyleLerp.spanStyle.getFontFamily() : null, (3653631 & 64) != 0 ? textStyleLerp.spanStyle.getFontFeatureSettings() : null, (3653631 & 128) != 0 ? textStyleLerp.spanStyle.getLetterSpacing() : 0L, (3653631 & 256) != 0 ? textStyleLerp.spanStyle.getBaselineShift() : null, (3653631 & 512) != 0 ? textStyleLerp.spanStyle.getTextGeometricTransform() : null, (3653631 & 1024) != 0 ? textStyleLerp.spanStyle.getLocaleList() : null, (3653631 & 2048) != 0 ? textStyleLerp.spanStyle.getBackground() : 0L, (3653631 & 4096) != 0 ? textStyleLerp.spanStyle.getTextDecoration() : null, (3653631 & 8192) != 0 ? textStyleLerp.spanStyle.getShadow() : null, (3653631 & 16384) != 0 ? textStyleLerp.paragraphStyle.getTextAlign() : null, (3653631 & 32768) != 0 ? textStyleLerp.paragraphStyle.getTextDirection() : null, (3653631 & 65536) != 0 ? textStyleLerp.paragraphStyle.getLineHeight() : 0L, (3653631 & 131072) != 0 ? textStyleLerp.paragraphStyle.getTextIndent() : null, (3653631 & 262144) != 0 ? textStyleLerp.platformStyle : null, (3653631 & 524288) != 0 ? textStyleLerp.paragraphStyle.getLineHeightStyle() : null, (3653631 & 1048576) != 0 ? textStyleLerp.paragraphStyle.getLineBreak() : null, (3653631 & 2097152) != 0 ? textStyleLerp.paragraphStyle.getHyphens() : null) : textStyleLerp, this.f12832r0, composer2, (this.f12833s0 >> 6) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
