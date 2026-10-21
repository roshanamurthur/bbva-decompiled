package androidx.compose.foundation.text;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TextFieldCursor.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r extends Lambda implements Function1<ContentDrawScope, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Animatable<Float, AnimationVector1D> f6265p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ OffsetMapping f6266q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f6267r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ TextFieldState f6268s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Brush f6269t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Animatable<Float, AnimationVector1D> animatable, OffsetMapping offsetMapping, TextFieldValue textFieldValue, TextFieldState textFieldState, Brush brush) {
        super(1);
        this.f6265p0 = animatable;
        this.f6266q0 = offsetMapping;
        this.f6267r0 = textFieldValue;
        this.f6268s0 = textFieldState;
        this.f6269t0 = brush;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ContentDrawScope contentDrawScope) {
        Rect rect;
        TextLayoutResult value;
        ContentDrawScope drawWithContent = contentDrawScope;
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.drawContent();
        float fCoerceIn = kotlin.ranges.c.coerceIn(this.f6265p0.getValue().floatValue(), 0.0f, 1.0f);
        if (fCoerceIn != 0.0f) {
            int iOriginalToTransformed = this.f6266q0.originalToTransformed(TextRange.m3967getStartimpl(this.f6267r0.getSelection()));
            TextLayoutResultProxy layoutResult = this.f6268s0.getLayoutResult();
            if (layoutResult == null || (value = layoutResult.getValue()) == null || (rect = value.getCursorRect(iOriginalToTransformed)) == null) {
                rect = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
            }
            float fMo415toPx0680j_4 = drawWithContent.mo415toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness());
            float f6 = fMo415toPx0680j_4 / 2;
            float fCoerceAtMost = kotlin.ranges.c.coerceAtMost(rect.getLeft() + f6, Size.m2344getWidthimpl(drawWithContent.mo2909getSizeNHjbRc()) - f6);
            a1.b.B(drawWithContent, this.f6269t0, OffsetKt.Offset(fCoerceAtMost, rect.getTop()), OffsetKt.Offset(fCoerceAtMost, rect.getBottom()), fMo415toPx0680j_4, 0, null, fCoerceIn, null, 0, 432, null);
        }
        return Unit.INSTANCE;
    }
}
