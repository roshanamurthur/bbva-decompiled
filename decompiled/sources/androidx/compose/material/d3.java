package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TextFieldImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ float f8425p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ long f8426q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f8427r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f8428s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ boolean f8429t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ long f8430u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d3(float f6, long j10, Function2<? super Composer, ? super Integer, Unit> function2, int i10, boolean z10, long j11) {
        super(2);
        this.f8425p0 = f6;
        this.f8426q0 = j10;
        this.f8427r0 = function2;
        this.f8428s0 = i10;
        this.f8429t0 = z10;
        this.f8430u0 = j11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(362863774, iIntValue, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:121)");
            }
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            TextStyle textStyleLerp = TextStyleKt.lerp(materialTheme.getTypography(composer2, 6).getSubtitle1(), materialTheme.getTypography(composer2, 6).getCaption(), this.f8425p0);
            TextFieldImplKt.m875DecorationeuL9pac(this.f8426q0, this.f8429t0 ? textStyleLerp.m3985copyv2rsoow((16252927 & 1) != 0 ? textStyleLerp.spanStyle.m3927getColor0d7_KjU() : this.f8430u0, (16252927 & 2) != 0 ? textStyleLerp.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? textStyleLerp.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? textStyleLerp.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? textStyleLerp.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? textStyleLerp.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? textStyleLerp.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? textStyleLerp.spanStyle.getLetterSpacing() : 0L, (16252927 & 256) != 0 ? textStyleLerp.spanStyle.getBaselineShift() : null, (16252927 & 512) != 0 ? textStyleLerp.spanStyle.getTextGeometricTransform() : null, (16252927 & 1024) != 0 ? textStyleLerp.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? textStyleLerp.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? textStyleLerp.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? textStyleLerp.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? textStyleLerp.spanStyle.getDrawStyle() : null, (16252927 & 32768) != 0 ? textStyleLerp.paragraphStyle.getTextAlign() : null, (16252927 & 65536) != 0 ? textStyleLerp.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? textStyleLerp.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? textStyleLerp.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? textStyleLerp.platformStyle : null, (16252927 & 1048576) != 0 ? textStyleLerp.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? textStyleLerp.paragraphStyle.getLineBreak() : null, (16252927 & 4194304) != 0 ? textStyleLerp.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? textStyleLerp.paragraphStyle.getTextMotion() : null) : textStyleLerp, null, this.f8427r0, composer2, ((this.f8428s0 >> 6) & 14) | BluetoothState.REQUEST_CONNECT_DEVICE, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
