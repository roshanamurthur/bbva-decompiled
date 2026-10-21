package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.bbva.androidtoolkit.utils.PluginUtils;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextFieldDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/TextFieldDelegate;", "", "()V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextFieldDelegate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: TextFieldDelegate.kt */
    @Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J#\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ5\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0001¢\u0006\u0002\b\u0016JK\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00130\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0013H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"JE\u0010#\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\b*J1\u0010+\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020'2\u0006\u0010,\u001a\u00020-2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0/H\u0001¢\u0006\u0002\b0JA\u00101\u001a\u00020\u000b2\f\u00102\u001a\b\u0012\u0004\u0012\u000204032\u0006\u0010,\u001a\u00020-2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0/2\b\u00105\u001a\u0004\u0018\u00010'H\u0001¢\u0006\u0002\b6JX\u00107\u001a\u00020'2\u0006\u00108\u001a\u0002092\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020-2\u0006\u0010:\u001a\u00020;2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0/2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u000b0/H\u0001ø\u0001\u0001¢\u0006\u0002\b>JX\u0010?\u001a\u00020'2\u0006\u00108\u001a\u0002092\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020-2\u0006\u0010:\u001a\u00020;2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0/2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u000b0/H\u0001ø\u0001\u0001¢\u0006\u0002\b@JI\u0010A\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020C2\u0006\u0010\u0012\u001a\u00020D2\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0/H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bE\u0010F\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006G"}, d2 = {"Landroidx/compose/foundation/text/TextFieldDelegate$Companion;", "", "()V", "applyCompositionDecoration", "Landroidx/compose/ui/text/input/TransformedText;", "compositionRange", "Landroidx/compose/ui/text/TextRange;", "transformed", "applyCompositionDecoration-72CqOWE", "(JLandroidx/compose/ui/text/input/TransformedText;)Landroidx/compose/ui/text/input/TransformedText;", "draw", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "selectionPaint", "Landroidx/compose/ui/graphics/Paint;", "draw$foundation_release", PluginUtils.IDENTIFIER_LAYOUT, "Lkotlin/Triple;", "", "textDelegate", "Landroidx/compose/foundation/text/TextDelegate;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "prevResultText", "layout-_EkL_-Y$foundation_release", "(Landroidx/compose/foundation/text/TextDelegate;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextLayoutResult;)Lkotlin/Triple;", "notifyFocusedRect", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "textInputSession", "Landroidx/compose/ui/text/input/TextInputSession;", "hasFocus", "", "notifyFocusedRect$foundation_release", "onBlur", "editProcessor", "Landroidx/compose/ui/text/input/EditProcessor;", "onValueChange", "Lkotlin/Function1;", "onBlur$foundation_release", "onEditCommand", "ops", "", "Landroidx/compose/ui/text/input/EditCommand;", "session", "onEditCommand$foundation_release", "onFocus", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "onImeActionPerformed", "Landroidx/compose/ui/text/input/ImeAction;", "onFocus$foundation_release", "restartInput", "restartInput$foundation_release", "setCursorOffset", "position", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "setCursorOffset-ULxng0E$foundation_release", "(JLandroidx/compose/foundation/text/TextLayoutResultProxy;Landroidx/compose/ui/text/input/EditProcessor;Landroidx/compose/ui/text/input/OffsetMapping;Lkotlin/jvm/functions/Function1;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: TextFieldDelegate.kt */
        public static final class a extends Lambda implements Function1<List<? extends EditCommand>, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ EditProcessor f5986p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Function1<TextFieldValue, Unit> f5987q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef<TextInputSession> f5988r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(EditProcessor editProcessor, Function1<? super TextFieldValue, Unit> function1, Ref.ObjectRef<TextInputSession> objectRef) {
                super(1);
                this.f5986p0 = editProcessor;
                this.f5987q0 = function1;
                this.f5988r0 = objectRef;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(List<? extends EditCommand> list) throws IOException {
                List<? extends EditCommand> it = list;
                Intrinsics.checkNotNullParameter(it, "it");
                TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(it, this.f5986p0, this.f5987q0, this.f5988r0.element);
                return Unit.INSTANCE;
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: layout-_EkL_-Y$foundation_release$default, reason: not valid java name */
        public static /* synthetic */ Triple m543layout_EkL_Y$foundation_release$default(Companion companion, TextDelegate textDelegate, long j10, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                textLayoutResult = null;
            }
            return companion.m545layout_EkL_Y$foundation_release(textDelegate, j10, layoutDirection, textLayoutResult);
        }

        @NotNull
        /* JADX INFO: renamed from: applyCompositionDecoration-72CqOWE, reason: not valid java name */
        public final TransformedText m544applyCompositionDecoration72CqOWE(long compositionRange, @NotNull TransformedText transformed) {
            Intrinsics.checkNotNullParameter(transformed, "transformed");
            AnnotatedString.Builder builder = new AnnotatedString.Builder(transformed.getText());
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (DefaultConstructorMarker) null), transformed.getOffsetMapping().originalToTransformed(TextRange.m3967getStartimpl(compositionRange)), transformed.getOffsetMapping().originalToTransformed(TextRange.m3962getEndimpl(compositionRange)));
            return new TransformedText(builder.toAnnotatedString(), transformed.getOffsetMapping());
        }

        @JvmStatic
        public final void draw$foundation_release(@NotNull Canvas canvas, @NotNull TextFieldValue value, @NotNull OffsetMapping offsetMapping, @NotNull TextLayoutResult textLayoutResult, @NotNull Paint selectionPaint) {
            int iOriginalToTransformed;
            int iOriginalToTransformed2;
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
            Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
            Intrinsics.checkNotNullParameter(selectionPaint, "selectionPaint");
            if (!TextRange.m3961getCollapsedimpl(value.getSelection()) && (iOriginalToTransformed = offsetMapping.originalToTransformed(TextRange.m3965getMinimpl(value.getSelection()))) != (iOriginalToTransformed2 = offsetMapping.originalToTransformed(TextRange.m3964getMaximpl(value.getSelection())))) {
                canvas.drawPath(textLayoutResult.getPathForRange(iOriginalToTransformed, iOriginalToTransformed2), selectionPaint);
            }
            TextPainter.INSTANCE.paint(canvas, textLayoutResult);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: layout-_EkL_-Y$foundation_release, reason: not valid java name */
        public final Triple<Integer, Integer, TextLayoutResult> m545layout_EkL_Y$foundation_release(@NotNull TextDelegate textDelegate, long constraints, @NotNull LayoutDirection layoutDirection, @Nullable TextLayoutResult prevResultText) {
            Intrinsics.checkNotNullParameter(textDelegate, "textDelegate");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            TextLayoutResult textLayoutResultM535layoutNN6EwU = textDelegate.m535layoutNN6EwU(constraints, layoutDirection, prevResultText);
            return new Triple<>(Integer.valueOf(IntSize.m4549getWidthimpl(textLayoutResultM535layoutNN6EwU.getSize())), Integer.valueOf(IntSize.m4548getHeightimpl(textLayoutResultM535layoutNN6EwU.getSize())), textLayoutResultM535layoutNN6EwU);
        }

        @JvmStatic
        public final void notifyFocusedRect$foundation_release(@NotNull TextFieldValue value, @NotNull TextDelegate textDelegate, @NotNull TextLayoutResult textLayoutResult, @NotNull LayoutCoordinates layoutCoordinates, @NotNull TextInputSession textInputSession, boolean hasFocus, @NotNull OffsetMapping offsetMapping) {
            Rect boundingBox;
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(textDelegate, "textDelegate");
            Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
            Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
            Intrinsics.checkNotNullParameter(textInputSession, "textInputSession");
            Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
            if (hasFocus) {
                int iOriginalToTransformed = offsetMapping.originalToTransformed(TextRange.m3964getMaximpl(value.getSelection()));
                if (iOriginalToTransformed < textLayoutResult.getLayoutInput().getText().length()) {
                    boundingBox = textLayoutResult.getBoundingBox(iOriginalToTransformed);
                } else {
                    boundingBox = iOriginalToTransformed != 0 ? textLayoutResult.getBoundingBox(iOriginalToTransformed - 1) : new Rect(0.0f, 0.0f, 1.0f, IntSize.m4548getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null)));
                }
                long jMo3583localToRootMKHz9U = layoutCoordinates.mo3583localToRootMKHz9U(OffsetKt.Offset(boundingBox.getLeft(), boundingBox.getTop()));
                textInputSession.notifyFocusedRect(RectKt.m2315Recttz77jQw(OffsetKt.Offset(Offset.m2275getXimpl(jMo3583localToRootMKHz9U), Offset.m2276getYimpl(jMo3583localToRootMKHz9U)), SizeKt.Size(boundingBox.getWidth(), boundingBox.getHeight())));
            }
        }

        @JvmStatic
        public final void onBlur$foundation_release(@NotNull TextInputSession textInputSession, @NotNull EditProcessor editProcessor, @NotNull Function1<? super TextFieldValue, Unit> onValueChange) {
            Intrinsics.checkNotNullParameter(textInputSession, "textInputSession");
            Intrinsics.checkNotNullParameter(editProcessor, "editProcessor");
            Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
            onValueChange.invoke(TextFieldValue.m4171copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null));
            textInputSession.dispose();
        }

        @JvmStatic
        public final void onEditCommand$foundation_release(@NotNull List<? extends EditCommand> ops, @NotNull EditProcessor editProcessor, @NotNull Function1<? super TextFieldValue, Unit> onValueChange, @Nullable TextInputSession session) throws IOException {
            Intrinsics.checkNotNullParameter(ops, "ops");
            Intrinsics.checkNotNullParameter(editProcessor, "editProcessor");
            Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
            TextFieldValue textFieldValueApply = editProcessor.apply(ops);
            if (session != null) {
                session.updateState(null, textFieldValueApply);
            }
            onValueChange.invoke(textFieldValueApply);
        }

        @JvmStatic
        @NotNull
        public final TextInputSession onFocus$foundation_release(@NotNull TextInputService textInputService, @NotNull TextFieldValue value, @NotNull EditProcessor editProcessor, @NotNull ImeOptions imeOptions, @NotNull Function1<? super TextFieldValue, Unit> onValueChange, @NotNull Function1<? super ImeAction, Unit> onImeActionPerformed) {
            Intrinsics.checkNotNullParameter(textInputService, "textInputService");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(editProcessor, "editProcessor");
            Intrinsics.checkNotNullParameter(imeOptions, "imeOptions");
            Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
            Intrinsics.checkNotNullParameter(onImeActionPerformed, "onImeActionPerformed");
            return restartInput$foundation_release(textInputService, value, editProcessor, imeOptions, onValueChange, onImeActionPerformed);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, androidx.compose.ui.text.input.TextInputSession] */
        @JvmStatic
        @NotNull
        public final TextInputSession restartInput$foundation_release(@NotNull TextInputService textInputService, @NotNull TextFieldValue value, @NotNull EditProcessor editProcessor, @NotNull ImeOptions imeOptions, @NotNull Function1<? super TextFieldValue, Unit> onValueChange, @NotNull Function1<? super ImeAction, Unit> onImeActionPerformed) {
            Intrinsics.checkNotNullParameter(textInputService, "textInputService");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(editProcessor, "editProcessor");
            Intrinsics.checkNotNullParameter(imeOptions, "imeOptions");
            Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
            Intrinsics.checkNotNullParameter(onImeActionPerformed, "onImeActionPerformed");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? StartInput = textInputService.startInput(value, imeOptions, new a(editProcessor, onValueChange, objectRef), onImeActionPerformed);
            objectRef.element = StartInput;
            return StartInput;
        }

        @JvmStatic
        /* JADX INFO: renamed from: setCursorOffset-ULxng0E$foundation_release, reason: not valid java name */
        public final void m546setCursorOffsetULxng0E$foundation_release(long position, @NotNull TextLayoutResultProxy textLayoutResult, @NotNull EditProcessor editProcessor, @NotNull OffsetMapping offsetMapping, @NotNull Function1<? super TextFieldValue, Unit> onValueChange) {
            Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
            Intrinsics.checkNotNullParameter(editProcessor, "editProcessor");
            Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
            Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
            onValueChange.invoke(TextFieldValue.m4171copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (AnnotatedString) null, TextRangeKt.TextRange(offsetMapping.transformedToOriginal(TextLayoutResultProxy.m559getOffsetForPosition3MmeM6k$default(textLayoutResult, position, false, 2, null))), (TextRange) null, 5, (Object) null));
        }
    }
}
