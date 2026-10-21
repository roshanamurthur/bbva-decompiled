package com.bbva.ui.compose;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import com.bbva.ui.compose.theme.Theme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Button.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class b extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ State<Color> f37284p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f37285q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f37286r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(State<Color> state, PaddingValues paddingValues, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3) {
        super(2);
        this.f37284p0 = state;
        this.f37285q0 = paddingValues;
        this.f37286r0 = function3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-555238697, iIntValue, -1, "com.bbva.ui.compose.Button.<anonymous>.<anonymous> (Button.kt:304)");
            }
            TextStyle button = Theme.INSTANCE.getTypography(composer2, 6).getButton();
            TextKt.ProvideTextStyle(button.m3985copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3927getColor0d7_KjU() : ButtonKt.access$Button_uPCbpMU$lambda$21(this.f37284p0), (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & 256) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & 512) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & 1024) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & 32768) != 0 ? button.paragraphStyle.getTextAlign() : null, (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & 1048576) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & 4194304) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), ComposableLambdaKt.composableLambda(composer2, -775553976, true, new a(this.f37285q0, this.f37286r0)), composer2, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
