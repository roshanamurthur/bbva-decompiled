package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedRange;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextFieldSelectionManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a%\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"TextFieldSelectionHandle", "", "isStartHandle", "", "direction", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "(ZLandroidx/compose/ui/text/style/ResolvedTextDirection;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "calculateSelectionMagnifierCenterAndroid", "Landroidx/compose/ui/geometry/Offset;", "magnifierSize", "Landroidx/compose/ui/unit/IntSize;", "calculateSelectionMagnifierCenterAndroid-O0kMr_c", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;J)J", "isSelectionHandleInVisibleBound", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManagerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,906:1\n50#2:907\n49#2:908\n1097#3,6:909\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManagerKt\n*L\n809#1:907\n809#1:908\n809#1:909,6\n*E\n"})
public final class TextFieldSelectionManagerKt {

    /* JADX INFO: compiled from: TextFieldSelectionManager.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: TextFieldSelectionManager.kt */
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$1", f = "TextFieldSelectionManager.kt", i = {}, l = {820}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f6437p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f6438q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ TextDragObserver f6439r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TextDragObserver textDragObserver, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f6439r0 = textDragObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f6439r0, continuation);
            aVar.f6438q0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((a) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f6437p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.f6438q0;
                this.f6437p0 = 1;
                if (LongPressTextDragObserverKt.detectDownAndDragGesturesWithObserver(pointerInputScope, this.f6439r0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TextFieldSelectionManager.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f6440p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ResolvedTextDirection f6441q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionManager f6442r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f6443s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, ResolvedTextDirection resolvedTextDirection, TextFieldSelectionManager textFieldSelectionManager, int i10) {
            super(2);
            this.f6440p0 = z10;
            this.f6441q0 = resolvedTextDirection;
            this.f6442r0 = textFieldSelectionManager;
            this.f6443s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f6443s0 | 1);
            ResolvedTextDirection resolvedTextDirection = this.f6441q0;
            TextFieldSelectionManager textFieldSelectionManager = this.f6442r0;
            TextFieldSelectionManagerKt.TextFieldSelectionHandle(this.f6440p0, resolvedTextDirection, textFieldSelectionManager, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TextFieldSelectionHandle(boolean z10, @NotNull ResolvedTextDirection direction, @NotNull TextFieldSelectionManager manager, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1344558920);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1344558920, i10, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:803)");
        }
        Boolean boolValueOf = Boolean.valueOf(z10);
        composerStartRestartGroup.startReplaceableGroup(511388516);
        boolean zChanged = composerStartRestartGroup.changed(boolValueOf) | composerStartRestartGroup.changed(manager);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = manager.handleDragObserver$foundation_release(z10);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        TextDragObserver textDragObserver = (TextDragObserver) objRememberedValue;
        int i11 = i10 << 3;
        AndroidSelectionHandles_androidKt.m597SelectionHandle8fL75g(manager.m647getHandlePositiontuRUvjQ$foundation_release(z10), z10, direction, TextRange.m3966getReversedimpl(manager.getValue$foundation_release().getSelection()), SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, textDragObserver, new a(textDragObserver, null)), null, composerStartRestartGroup, (i11 & 112) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i11 & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, direction, manager, i10));
    }

    /* JADX INFO: renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c, reason: not valid java name */
    public static final long m648calculateSelectionMagnifierCenterAndroidO0kMr_c(@NotNull TextFieldSelectionManager manager, long j10) {
        int iM3967getStartimpl;
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        TextDelegate textDelegate;
        AnnotatedString text;
        LayoutCoordinates layoutCoordinates;
        TextLayoutResultProxy layoutResult2;
        LayoutCoordinates innerTextFieldCoordinates;
        Intrinsics.checkNotNullParameter(manager, "manager");
        if (manager.getValue$foundation_release().getText().length() == 0) {
            return Offset.INSTANCE.m2290getUnspecifiedF1C5BW0();
        }
        Handle draggingHandle = manager.getDraggingHandle();
        int i10 = draggingHandle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i10 == -1) {
            return Offset.INSTANCE.m2290getUnspecifiedF1C5BW0();
        }
        if (i10 == 1 || i10 == 2) {
            iM3967getStartimpl = TextRange.m3967getStartimpl(manager.getValue$foundation_release().getSelection());
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            iM3967getStartimpl = TextRange.m3962getEndimpl(manager.getValue$foundation_release().getSelection());
        }
        int iOriginalToTransformed = manager.getOffsetMapping().originalToTransformed(iM3967getStartimpl);
        TextFieldState state$foundation_release = manager.getState();
        if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
            return Offset.INSTANCE.m2290getUnspecifiedF1C5BW0();
        }
        TextFieldState state$foundation_release2 = manager.getState();
        if (state$foundation_release2 == null || (textDelegate = state$foundation_release2.getTextDelegate()) == null || (text = textDelegate.getText()) == null) {
            return Offset.INSTANCE.m2290getUnspecifiedF1C5BW0();
        }
        int iCoerceIn = kotlin.ranges.c.coerceIn(iOriginalToTransformed, (ClosedRange<Integer>) StringsKt__StringsKt.getIndices(text));
        long jM2305getCenterF1C5BW0 = value.getBoundingBox(iCoerceIn).m2305getCenterF1C5BW0();
        TextFieldState state$foundation_release3 = manager.getState();
        if (state$foundation_release3 == null || (layoutCoordinates = state$foundation_release3.getLayoutCoordinates()) == null) {
            return Offset.INSTANCE.m2290getUnspecifiedF1C5BW0();
        }
        TextFieldState state$foundation_release4 = manager.getState();
        if (state$foundation_release4 == null || (layoutResult2 = state$foundation_release4.getLayoutResult()) == null || (innerTextFieldCoordinates = layoutResult2.getInnerTextFieldCoordinates()) == null) {
            return Offset.INSTANCE.m2290getUnspecifiedF1C5BW0();
        }
        Offset offsetM645getCurrentDragPosition_m7T9E = manager.m645getCurrentDragPosition_m7T9E();
        if (offsetM645getCurrentDragPosition_m7T9E == null) {
            return Offset.INSTANCE.m2290getUnspecifiedF1C5BW0();
        }
        float fM2275getXimpl = Offset.m2275getXimpl(innerTextFieldCoordinates.mo3582localPositionOfR5De75A(layoutCoordinates, offsetM645getCurrentDragPosition_m7T9E.getF15533a()));
        int lineForOffset = value.getLineForOffset(iCoerceIn);
        int lineStart = value.getLineStart(lineForOffset);
        int lineEnd = value.getLineEnd(lineForOffset, true);
        boolean z10 = TextRange.m3967getStartimpl(manager.getValue$foundation_release().getSelection()) > TextRange.m3962getEndimpl(manager.getValue$foundation_release().getSelection());
        float horizontalPosition = TextSelectionDelegateKt.getHorizontalPosition(value, lineStart, true, z10);
        float horizontalPosition2 = TextSelectionDelegateKt.getHorizontalPosition(value, lineEnd, false, z10);
        float fCoerceIn = kotlin.ranges.c.coerceIn(fM2275getXimpl, Math.min(horizontalPosition, horizontalPosition2), Math.max(horizontalPosition, horizontalPosition2));
        return Math.abs(fM2275getXimpl - fCoerceIn) > ((float) (IntSize.m4549getWidthimpl(j10) / 2)) ? Offset.INSTANCE.m2290getUnspecifiedF1C5BW0() : layoutCoordinates.mo3582localPositionOfR5De75A(innerTextFieldCoordinates, OffsetKt.Offset(fCoerceIn, Offset.m2276getYimpl(jM2305getCenterF1C5BW0)));
    }

    public static final boolean isSelectionHandleInVisibleBound(@NotNull TextFieldSelectionManager textFieldSelectionManager, boolean z10) {
        LayoutCoordinates layoutCoordinates;
        Rect rectVisibleBounds;
        Intrinsics.checkNotNullParameter(textFieldSelectionManager, "<this>");
        TextFieldState state$foundation_release = textFieldSelectionManager.getState();
        if (state$foundation_release == null || (layoutCoordinates = state$foundation_release.getLayoutCoordinates()) == null || (rectVisibleBounds = SelectionManagerKt.visibleBounds(layoutCoordinates)) == null) {
            return false;
        }
        return SelectionManagerKt.m633containsInclusiveUv8p0NA(rectVisibleBounds, textFieldSelectionManager.m647getHandlePositiontuRUvjQ$foundation_release(z10));
    }
}
