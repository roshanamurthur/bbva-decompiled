package l0;

import androidx.compose.material3.TimePickerColors;
import androidx.compose.material3.TimePickerState;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.unit.DpOffset;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m5 extends Lambda implements Function1<ContentDrawScope, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f82710p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ TimePickerColors f82711q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(TimePickerState timePickerState, TimePickerColors timePickerColors) {
        super(1);
        this.f82710p0 = timePickerState;
        this.f82711q0 = timePickerColors;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ContentDrawScope contentDrawScope) {
        ContentDrawScope drawWithContent = contentDrawScope;
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        TimePickerState timePickerState = this.f82710p0;
        long jOffset = OffsetKt.Offset(drawWithContent.mo415toPx0680j_4(DpOffset.m4450getXD9Ej5fM(timePickerState.m1420getSelectorPosRKDOV3M$material3_release())), drawWithContent.mo415toPx0680j_4(DpOffset.m4452getYD9Ej5fM(timePickerState.m1420getSelectorPosRKDOV3M$material3_release())));
        TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
        float f6 = 2;
        float fMo415toPx0680j_4 = drawWithContent.mo415toPx0680j_4(timePickerTokens.m1983getClockDialSelectorHandleContainerSizeD9Ej5fM()) / f6;
        TimePickerColors timePickerColors = this.f82711q0;
        long selectorColor = timePickerColors.getSelectorColor();
        long jM2534getBlack0d7_KjU = Color.INSTANCE.m2534getBlack0d7_KjU();
        BlendMode.Companion companion = BlendMode.INSTANCE;
        a1.b.x(drawWithContent, jM2534getBlack0d7_KjU, fMo415toPx0680j_4, jOffset, 0.0f, null, null, companion.m2432getClear0nO6VwU(), 56, null);
        drawWithContent.drawContent();
        a1.b.x(drawWithContent, selectorColor, fMo415toPx0680j_4, jOffset, 0.0f, null, null, companion.m2460getXor0nO6VwU(), 56, null);
        a1.b.C(drawWithContent, selectorColor, SizeKt.m2354getCenteruvyYCjk(drawWithContent.mo2909getSizeNHjbRc()), Offset.m2279minusMKHz9U(jOffset, OffsetKt.Offset(((float) Math.cos(timePickerState.getCurrentAngle$material3_release().getValue().floatValue())) * fMo415toPx0680j_4, ((float) Math.sin(timePickerState.getCurrentAngle$material3_release().getValue().floatValue())) * fMo415toPx0680j_4)), drawWithContent.mo415toPx0680j_4(timePickerTokens.m1984getClockDialSelectorTrackContainerWidthD9Ej5fM()), 0, null, 0.0f, null, companion.m2459getSrcOver0nO6VwU(), 240, null);
        a1.b.x(drawWithContent, selectorColor, drawWithContent.mo415toPx0680j_4(timePickerTokens.m1982getClockDialSelectorCenterContainerSizeD9Ej5fM()) / f6, SizeKt.m2354getCenteruvyYCjk(drawWithContent.mo2909getSizeNHjbRc()), 0.0f, null, null, 0, 120, null);
        a1.b.x(drawWithContent, timePickerColors.m1392clockDialContentColorvNxB06k$material3_release(true), fMo415toPx0680j_4, jOffset, 0.0f, null, null, companion.m2442getDstOver0nO6VwU(), 56, null);
        return Unit.INSTANCE;
    }
}
