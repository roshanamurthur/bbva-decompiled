package androidx.compose.foundation.text;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextFieldScroll.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000\u001a4\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fH\u0000¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "scrollerPosition", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "", "enabled", "textFieldScrollable", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Lkotlin/Function0;", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "textLayoutResultProvider", "textFieldScroll", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,370:1\n135#2:371\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n*L\n61#1:371\n*E\n"})
public final class TextFieldScrollKt {

    /* JADX INFO: compiled from: TextFieldScroll.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: TextFieldScroll.kt */
    @SourceDebugExtension({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,370:1\n76#2:371\n36#3:372\n50#3:379\n49#3:380\n1097#4,6:373\n1097#4,6:381\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2\n*L\n69#1:371\n71#1:372\n84#1:379\n84#1:380\n71#1:373,6\n84#1:381,6\n*E\n"})
    public static final class a extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TextFieldScrollerPosition f6027p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f6028q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f6029r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TextFieldScrollerPosition textFieldScrollerPosition, MutableInteractionSource mutableInteractionSource, boolean z10) {
            super(3);
            this.f6027p0 = textFieldScrollerPosition;
            this.f6028q0 = z10;
            this.f6029r0 = mutableInteractionSource;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iA = ci.a.a(num, modifier, "$this$composed", composer2, 805428266);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(805428266, iA, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:66)");
            }
            boolean z10 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            final TextFieldScrollerPosition textFieldScrollerPosition = this.f6027p0;
            boolean z11 = textFieldScrollerPosition.getOrientation() == Orientation.Vertical || !z10;
            composer2.startReplaceableGroup(1157296644);
            boolean zChanged = composer2.changed(textFieldScrollerPosition);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new d0(textFieldScrollerPosition);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            final ScrollableState scrollableStateRememberScrollableState = ScrollableStateKt.rememberScrollableState((Function1) objRememberedValue, composer2, 0);
            composer2.startReplaceableGroup(511388516);
            boolean zChanged2 = composer2.changed(scrollableStateRememberScrollableState) | composer2.changed(textFieldScrollerPosition);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new ScrollableState(textFieldScrollerPosition) { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1

                    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final State canScrollForward;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final State canScrollBackward;

                    /* JADX INFO: compiled from: TextFieldScroll.kt */
                    public static final class a extends Lambda implements Function0<Boolean> {

                        /* JADX INFO: renamed from: p0, reason: collision with root package name */
                        public final /* synthetic */ TextFieldScrollerPosition f6036p0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public a(TextFieldScrollerPosition textFieldScrollerPosition) {
                            super(0);
                            this.f6036p0 = textFieldScrollerPosition;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            return Boolean.valueOf(this.f6036p0.getOffset() > 0.0f);
                        }
                    }

                    /* JADX INFO: compiled from: TextFieldScroll.kt */
                    public static final class b extends Lambda implements Function0<Boolean> {

                        /* JADX INFO: renamed from: p0, reason: collision with root package name */
                        public final /* synthetic */ TextFieldScrollerPosition f6037p0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public b(TextFieldScrollerPosition textFieldScrollerPosition) {
                            super(0);
                            this.f6037p0 = textFieldScrollerPosition;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            TextFieldScrollerPosition textFieldScrollerPosition = this.f6037p0;
                            return Boolean.valueOf(textFieldScrollerPosition.getOffset() < textFieldScrollerPosition.getMaximum());
                        }
                    }

                    {
                        this.canScrollForward = SnapshotStateKt.derivedStateOf(new b(textFieldScrollerPosition));
                        this.canScrollBackward = SnapshotStateKt.derivedStateOf(new a(textFieldScrollerPosition));
                    }

                    @Override // androidx.compose.foundation.gestures.ScrollableState
                    public float dispatchRawDelta(float delta) {
                        return this.f6033a.dispatchRawDelta(delta);
                    }

                    @Override // androidx.compose.foundation.gestures.ScrollableState
                    public boolean getCanScrollBackward() {
                        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
                    }

                    @Override // androidx.compose.foundation.gestures.ScrollableState
                    public boolean getCanScrollForward() {
                        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
                    }

                    @Override // androidx.compose.foundation.gestures.ScrollableState
                    public boolean isScrollInProgress() {
                        return this.f6033a.isScrollInProgress();
                    }

                    @Override // androidx.compose.foundation.gestures.ScrollableState
                    @Nullable
                    public Object scroll(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
                        return this.f6033a.scroll(mutatePriority, function2, continuation);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            Modifier modifierScrollable$default = ScrollableKt.scrollable$default(Modifier.INSTANCE, (TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1) objRememberedValue2, textFieldScrollerPosition.getOrientation(), this.f6028q0 && textFieldScrollerPosition.getMaximum() != 0.0f, z11, null, this.f6029r0, 16, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return modifierScrollable$default;
        }
    }

    public static final Rect access$getCursorRectInScroller(Density density, int i10, TransformedText transformedText, TextLayoutResult textLayoutResult, boolean z10, int i11) {
        Rect zero;
        if (textLayoutResult == null || (zero = textLayoutResult.getCursorRect(transformedText.getOffsetMapping().originalToTransformed(i10))) == null) {
            zero = Rect.INSTANCE.getZero();
        }
        Rect rect = zero;
        int iMo413roundToPx0680j_4 = density.mo413roundToPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness());
        return Rect.copy$default(rect, z10 ? (i11 - rect.getLeft()) - iMo413roundToPx0680j_4 : rect.getLeft(), 0.0f, z10 ? i11 - rect.getLeft() : rect.getLeft() + iMo413roundToPx0680j_4, 0.0f, 10, null);
    }

    @NotNull
    public static final Modifier textFieldScroll(@NotNull Modifier modifier, @NotNull TextFieldScrollerPosition scrollerPosition, @NotNull TextFieldValue textFieldValue, @NotNull VisualTransformation visualTransformation, @NotNull Function0<TextLayoutResultProxy> textLayoutResultProvider) {
        Modifier nVar;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(scrollerPosition, "scrollerPosition");
        Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(textLayoutResultProvider, "textLayoutResultProvider");
        Orientation orientation = scrollerPosition.getOrientation();
        int iM552getOffsetToFollow5zctL8 = scrollerPosition.m552getOffsetToFollow5zctL8(textFieldValue.getSelection());
        scrollerPosition.m554setPreviousSelection5zctL8(textFieldValue.getSelection());
        TransformedText transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation, textFieldValue.getAnnotatedString());
        int i10 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i10 == 1) {
            nVar = new e0.n(scrollerPosition, iM552getOffsetToFollow5zctL8, transformedTextFilterWithValidation, textLayoutResultProvider);
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            nVar = new e0.e(scrollerPosition, iM552getOffsetToFollow5zctL8, transformedTextFilterWithValidation, textLayoutResultProvider);
        }
        return ClipKt.clipToBounds(modifier).then(nVar);
    }

    @NotNull
    public static final Modifier textFieldScrollable(@NotNull Modifier modifier, @NotNull final TextFieldScrollerPosition scrollerPosition, @Nullable final MutableInteractionSource mutableInteractionSource, final boolean z10) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(scrollerPosition, "scrollerPosition");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                androidx.activity.a.c(inspectorInfo, "$this$null", "textFieldScrollable").set("scrollerPosition", scrollerPosition);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("enabled", Boolean.valueOf(z10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new a(scrollerPosition, mutableInteractionSource, z10));
    }

    public static /* synthetic */ Modifier textFieldScrollable$default(Modifier modifier, TextFieldScrollerPosition textFieldScrollerPosition, MutableInteractionSource mutableInteractionSource, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            mutableInteractionSource = null;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return textFieldScrollable(modifier, textFieldScrollerPosition, mutableInteractionSource, z10);
    }
}
