package androidx.compose.material3;

import android.view.View;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.util.Map;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ModalBottomSheet.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a¨\u0001\u0010\u0019\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\t2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u009e\u0001\u0010\u0019\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\t2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u000f2\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a/\u0010 \u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001c0\u0013H\u0007¢\u0006\u0004\b \u0010!\u001a8\u0010\"\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000fH\u0001¢\u0006\u0004\b\"\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/SheetState;", "sheetState", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "scrimColor", "Landroidx/compose/runtime/Composable;", "dragHandle", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "content", "ModalBottomSheet-EP0qOeE", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;Landroidx/compose/ui/graphics/Shape;JJFJLkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "ModalBottomSheet", "ModalBottomSheet-xOkiWaM", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;Landroidx/compose/ui/graphics/Shape;JJFJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "", "skipPartiallyExpanded", "Landroidx/compose/material3/SheetValue;", "confirmValueChange", "rememberModalBottomSheetState", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "ModalBottomSheetPopup", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nModalBottomSheet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,571:1\n474#2,4:572\n478#2,2:580\n482#2:586\n25#3:576\n50#3:587\n49#3:588\n36#3:595\n36#3:603\n50#3:610\n49#3:611\n25#3:619\n1114#4,3:577\n1117#4,3:583\n1114#4,6:589\n1114#4,6:596\n1114#4,6:604\n1114#4,6:612\n1114#4,6:620\n474#5:582\n646#6:602\n76#7:618\n76#8:626\n76#8:627\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt\n*L\n136#1:572,4\n136#1:580,2\n136#1:586\n136#1:576\n153#1:587\n153#1:588\n270#1:595\n334#1:603\n347#1:610\n347#1:611\n425#1:619\n136#1:577,3\n136#1:583,3\n153#1:589,6\n270#1:596,6\n334#1:604,6\n347#1:612,6\n425#1:620,6\n136#1:582\n327#1:602\n421#1:618\n328#1:626\n424#1:627\n*E\n"})
public final class ModalBottomSheet_androidKt {

    /* JADX INFO: compiled from: ModalBottomSheet.android.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SheetState f10649p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f10650q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f10651r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SheetState sheetState, Function0 function0, CoroutineScope coroutineScope) {
            super(0);
            this.f10649p0 = sheetState;
            this.f10650q0 = coroutineScope;
            this.f10651r0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            SheetState sheetState = this.f10649p0;
            if (sheetState.getCurrentValue() == SheetValue.Expanded && sheetState.getHasPartiallyExpandedState()) {
                BuildersKt__Builders_commonKt.launch$default(this.f10650q0, null, null, new s1(sheetState, null), 3, null);
            } else {
                BuildersKt__Builders_commonKt.launch$default(this.f10650q0, null, null, new t1(sheetState, null), 3, null).invokeOnCompletion(new u1(this.f10651r0));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ModalBottomSheet.android.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ float E0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> F0;
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> G0;
        public final /* synthetic */ int H0;
        public final /* synthetic */ CoroutineScope I0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long f10652p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f10653q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SheetState f10654r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f10655s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10656t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ AnchorChangeHandler<SheetValue> f10657u0;
        public final /* synthetic */ Function1<Float, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Shape f10658w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ long f10659x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ long f10660y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, h hVar, SheetState sheetState, int i10, Modifier modifier, AnchorChangeHandler anchorChangeHandler, i iVar, Shape shape, long j11, long j12, float f6, Function2 function2, Function3 function3, int i11, CoroutineScope coroutineScope) {
            super(2);
            this.f10652p0 = j10;
            this.f10653q0 = hVar;
            this.f10654r0 = sheetState;
            this.f10655s0 = i10;
            this.f10656t0 = modifier;
            this.f10657u0 = anchorChangeHandler;
            this.v0 = iVar;
            this.f10658w0 = shape;
            this.f10659x0 = j11;
            this.f10660y0 = j12;
            this.E0 = f6;
            this.F0 = function2;
            this.G0 = function3;
            this.H0 = i11;
            this.I0 = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1424497392, iIntValue, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.android.kt:176)");
                }
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 574030426, true, new f2(this.f10652p0, this.f10653q0, this.f10654r0, this.f10655s0, this.f10656t0, this.f10657u0, this.v0, this.f10658w0, this.f10659x0, this.f10660y0, this.E0, this.F0, this.G0, this.H0, this.I0)), composer2, 3078, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ModalBottomSheet.android.kt */
    @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3$1", f = "ModalBottomSheet.android.kt", i = {}, l = {271}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f10661p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SheetState f10662q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SheetState sheetState, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f10662q0 = sheetState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.f10662q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f10661p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f10661p0 = 1;
                if (this.f10662q0.show(this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: ModalBottomSheet.android.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> E0;
        public final /* synthetic */ int F0;
        public final /* synthetic */ int G0;
        public final /* synthetic */ int H0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f10663p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10664q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SheetState f10665r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Shape f10666s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ long f10667t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ long f10668u0;
        public final /* synthetic */ float v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ long f10669w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10670x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ WindowInsets f10671y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function0<Unit> function0, Modifier modifier, SheetState sheetState, Shape shape, long j10, long j11, float f6, long j12, Function2<? super Composer, ? super Integer, Unit> function2, WindowInsets windowInsets, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11, int i12) {
            super(2);
            this.f10663p0 = function0;
            this.f10664q0 = modifier;
            this.f10665r0 = sheetState;
            this.f10666s0 = shape;
            this.f10667t0 = j10;
            this.f10668u0 = j11;
            this.v0 = f6;
            this.f10669w0 = j12;
            this.f10670x0 = function2;
            this.f10671y0 = windowInsets;
            this.E0 = function3;
            this.F0 = i10;
            this.G0 = i11;
            this.H0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ModalBottomSheet_androidKt.m1169ModalBottomSheetEP0qOeE(this.f10663p0, this.f10664q0, this.f10665r0, this.f10666s0, this.f10667t0, this.f10668u0, this.v0, this.f10669w0, this.f10670x0, this.f10671y0, this.E0, composer, RecomposeScopeImplKt.updateChangedFlags(this.F0 | 1), RecomposeScopeImplKt.updateChangedFlags(this.G0), this.H0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ModalBottomSheet.android.kt */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;
        public final /* synthetic */ int F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f10672p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10673q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SheetState f10674r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Shape f10675s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ long f10676t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ long f10677u0;
        public final /* synthetic */ float v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ long f10678w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10679x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f10680y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Function0<Unit> function0, Modifier modifier, SheetState sheetState, Shape shape, long j10, long j11, float f6, long j12, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f10672p0 = function0;
            this.f10673q0 = modifier;
            this.f10674r0 = sheetState;
            this.f10675s0 = shape;
            this.f10676t0 = j10;
            this.f10677u0 = j11;
            this.v0 = f6;
            this.f10678w0 = j12;
            this.f10679x0 = function2;
            this.f10680y0 = function3;
            this.E0 = i10;
            this.F0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ModalBottomSheet_androidKt.m1170ModalBottomSheetxOkiWaM(this.f10672p0, this.f10673q0, this.f10674r0, this.f10675s0, this.f10676t0, this.f10677u0, this.v0, this.f10678w0, this.f10679x0, this.f10680y0, composer, RecomposeScopeImplKt.updateChangedFlags(this.E0 | 1), this.F0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ModalBottomSheet.android.kt */
    public static final class f extends Lambda implements Function2<SheetValue, Float, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f10681p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SheetState f10682q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(SheetState sheetState, CoroutineScope coroutineScope) {
            super(2);
            this.f10681p0 = coroutineScope;
            this.f10682q0 = sheetState;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(SheetValue sheetValue, Float f6) {
            SheetValue target = sheetValue;
            float fFloatValue = f6.floatValue();
            Intrinsics.checkNotNullParameter(target, "target");
            BuildersKt__Builders_commonKt.launch$default(this.f10681p0, null, null, new g2(this.f10682q0, target, fFloatValue, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ModalBottomSheet.android.kt */
    public static final class g extends Lambda implements Function1<SheetValue, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SheetState f10683p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f10684q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(SheetState sheetState, CoroutineScope coroutineScope) {
            super(1);
            this.f10683p0 = sheetState;
            this.f10684q0 = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SheetValue sheetValue) {
            SheetValue target = sheetValue;
            Intrinsics.checkNotNullParameter(target, "target");
            SheetState sheetState = this.f10683p0;
            if (!sheetState.trySnapTo$material3_release(target)) {
                BuildersKt__Builders_commonKt.launch$default(this.f10684q0, null, null, new h2(sheetState, target, null), 3, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ModalBottomSheet.android.kt */
    public static final class h extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SheetState f10685p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f10686q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f10687r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(SheetState sheetState, Function0 function0, CoroutineScope coroutineScope) {
            super(0);
            this.f10685p0 = sheetState;
            this.f10686q0 = coroutineScope;
            this.f10687r0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            SheetState sheetState = this.f10685p0;
            if (sheetState.getSwipeableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Hidden).booleanValue()) {
                BuildersKt__Builders_commonKt.launch$default(this.f10686q0, null, null, new i2(sheetState, null), 3, null).invokeOnCompletion(new j2(sheetState, this.f10687r0));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ModalBottomSheet.android.kt */
    public static final class i extends Lambda implements Function1<Float, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f10688p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SheetState f10689q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f10690r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(SheetState sheetState, Function0 function0, CoroutineScope coroutineScope) {
            super(1);
            this.f10688p0 = coroutineScope;
            this.f10689q0 = sheetState;
            this.f10690r0 = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Float f6) {
            float fFloatValue = f6.floatValue();
            CoroutineScope coroutineScope = this.f10688p0;
            SheetState sheetState = this.f10689q0;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new k2(sheetState, fFloatValue, null), 3, null).invokeOnCompletion(new l2(sheetState, this.f10690r0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ModalBottomSheet.android.kt */
    @SourceDebugExtension({"SMAP\nModalBottomSheet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheetPopup$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,571:1\n62#2,5:572\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheetPopup$1\n*L\n449#1:572,5\n*E\n"})
    public static final class j extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ l0.g2 f10691p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(l0.g2 g2Var) {
            super(1);
            this.f10691p0 = g2Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final l0.g2 g2Var = this.f10691p0;
            g2Var.E0.addView(g2Var, g2Var.F0);
            return new DisposableEffectResult() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetPopup$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    l0.g2 g2Var2 = g2Var;
                    g2Var2.disposeComposition();
                    g2Var2.getClass();
                    ViewTreeLifecycleOwner.set(g2Var2, null);
                    ViewTreeSavedStateRegistryOwner.set(g2Var2, null);
                    g2Var2.f82576y0.getViewTreeObserver().removeOnGlobalLayoutListener(g2Var2);
                    g2Var2.E0.removeViewImmediate(g2Var2);
                }
            };
        }
    }

    /* JADX INFO: compiled from: ModalBottomSheet.android.kt */
    public static final class k extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f10692p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ WindowInsets f10693q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10694r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f10695s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(Function0<Unit> function0, WindowInsets windowInsets, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f10692p0 = function0;
            this.f10693q0 = windowInsets;
            this.f10694r0 = function2;
            this.f10695s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f10695s0 | 1);
            WindowInsets windowInsets = this.f10693q0;
            Function2<Composer, Integer, Unit> function2 = this.f10694r0;
            ModalBottomSheet_androidKt.ModalBottomSheetPopup(this.f10692p0, windowInsets, function2, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ModalBottomSheet.android.kt */
    public static final class l extends Lambda implements Function0<UUID> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final l f10696p0 = new l(0);

        @Override // kotlin.jvm.functions.Function0
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* JADX INFO: compiled from: ModalBottomSheet.android.kt */
    @SourceDebugExtension({"SMAP\nModalBottomSheet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheetPopup$modalBottomSheetWindow$1$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,571:1\n67#2,6:572\n73#2:604\n77#2:609\n75#3:578\n76#3,11:580\n89#3:608\n76#4:579\n460#5,13:591\n473#5,3:605\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheetPopup$modalBottomSheetWindow$1$1$1\n*L\n434#1:572,6\n434#1:604\n434#1:609\n434#1:578\n434#1:580,11\n434#1:608\n434#1:579\n434#1:591,13\n434#1:605,3\n*E\n"})
    public static final class m extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ WindowInsets f10697p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ State<Function2<Composer, Integer, Unit>> f10698q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m(WindowInsets windowInsets, State<? extends Function2<? super Composer, ? super Integer, Unit>> state) {
            super(2);
            this.f10697p0 = windowInsets;
            this.f10698q0 = state;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(861223805, iIntValue, -1, "androidx.compose.material3.ModalBottomSheetPopup.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:432)");
                }
                Modifier modifierImePadding = WindowInsetsPadding_androidKt.imePadding(WindowInsetsPaddingKt.windowInsetsPadding(SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, m2.f12995p0, 1, null), this.f10697p0));
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC = androidx.databinding.f.c(Alignment.INSTANCE, false, composer2, 0, -1323940314);
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierImePadding);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion, composerM2074constructorimpl, measurePolicyC, composerM2074constructorimpl, density));
                ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ModalBottomSheet_androidKt.access$ModalBottomSheetPopup$lambda$5(this.f10698q0).invoke(composer2, 0);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ModalBottomSheet.android.kt */
    public static final class n extends Lambda implements Function1<SheetValue, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final n f10701p0 = new n(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(SheetValue sheetValue) {
            SheetValue it = sheetValue;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0123  */
    /* JADX WARN: Code duplicated, block: B:109:0x0139  */
    /* JADX WARN: Code duplicated, block: B:112:0x013f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0142  */
    /* JADX WARN: Code duplicated, block: B:115:0x0146  */
    /* JADX WARN: Code duplicated, block: B:117:0x014c  */
    /* JADX WARN: Code duplicated, block: B:118:0x014e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0152  */
    /* JADX WARN: Code duplicated, block: B:129:0x017e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0192  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:159:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:160:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:163:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:164:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:167:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:168:0x0202  */
    /* JADX WARN: Code duplicated, block: B:171:0x0207  */
    /* JADX WARN: Code duplicated, block: B:172:0x0212  */
    /* JADX WARN: Code duplicated, block: B:174:0x0216  */
    /* JADX WARN: Code duplicated, block: B:175:0x021d  */
    /* JADX WARN: Code duplicated, block: B:178:0x0223  */
    /* JADX WARN: Code duplicated, block: B:179:0x022c  */
    /* JADX WARN: Code duplicated, block: B:181:0x0230  */
    /* JADX WARN: Code duplicated, block: B:182:0x0237  */
    /* JADX WARN: Code duplicated, block: B:185:0x023d  */
    /* JADX WARN: Code duplicated, block: B:187:0x0254  */
    /* JADX WARN: Code duplicated, block: B:190:0x0269  */
    /* JADX WARN: Code duplicated, block: B:193:0x0283  */
    /* JADX WARN: Code duplicated, block: B:196:0x02be  */
    /* JADX WARN: Code duplicated, block: B:198:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:201:0x0329  */
    /* JADX WARN: Code duplicated, block: B:203:0x033b  */
    /* JADX WARN: Code duplicated, block: B:205:0x0341  */
    /* JADX WARN: Code duplicated, block: B:207:0x0355  */
    /* JADX WARN: Code duplicated, block: B:210:0x035d  */
    /* JADX WARN: Code duplicated, block: B:215:0x0377  */
    /* JADX WARN: Code duplicated, block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:91:0x0101  */
    /* JADX WARN: Code duplicated, block: B:92:0x0108  */
    /* JADX WARN: Code duplicated, block: B:94:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x0116  */
    /* JADX WARN: Code duplicated, block: B:97:0x0119  */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: ModalBottomSheet-EP0qOeE, reason: not valid java name */
    public static final void m1169ModalBottomSheetEP0qOeE(@NotNull Function0<Unit> onDismissRequest, @Nullable Modifier modifier, @Nullable SheetState sheetState, @Nullable Shape shape, long j10, long j11, float f6, long j12, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable WindowInsets windowInsets, @NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11, int i12) {
        int i13;
        Modifier modifier2;
        SheetState sheetState2;
        Shape shape2;
        long j13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Modifier modifier3;
        SheetState sheetStateRememberModalBottomSheetState;
        Shape expandedShape;
        long containerColor;
        long jM1014contentColorForek8zF_U;
        float fM923getElevationD9Ej5fM;
        long scrimColor;
        Function2<? super Composer, ? super Integer, Unit> function2M1037getLambda1$material3_release;
        WindowInsets windowInsets2;
        Shape shape3;
        long j14;
        int i21;
        Object objB;
        Composer.Companion companion;
        CoroutineScope coroutineScope;
        int i22;
        boolean zChanged;
        Object objRememberedValue;
        Composer composer2;
        SheetState sheetState3;
        SheetState sheetState4;
        Modifier modifier4;
        WindowInsets windowInsets3;
        SheetState sheetState5;
        Shape shape4;
        long j15;
        long j16;
        float f10;
        long j17;
        Function2<? super Composer, ? super Integer, Unit> function3;
        boolean zChanged2;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-879758728);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i13 = (composerStartRestartGroup.changedInstance(onDismissRequest) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        int i23 = i12 & 2;
        if (i23 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i13 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i10 & 896) == 0) {
                if ((i12 & 4) == 0) {
                    sheetState2 = sheetState;
                    int i24 = composerStartRestartGroup.changed(sheetState2) ? 256 : 128;
                    i13 |= i24;
                } else {
                    sheetState2 = sheetState;
                }
                i13 |= i24;
            } else {
                sheetState2 = sheetState;
            }
            if ((i10 & 7168) == 0) {
                if ((i12 & 8) == 0) {
                    shape2 = shape;
                    int i25 = composerStartRestartGroup.changed(shape2) ? 2048 : 1024;
                    i13 |= i25;
                } else {
                    shape2 = shape;
                }
                i13 |= i25;
            } else {
                shape2 = shape;
            }
            if ((57344 & i10) == 0) {
                if ((i12 & 16) == 0) {
                    j13 = j10;
                    int i26 = composerStartRestartGroup.changed(j13) ? 16384 : 8192;
                    i13 |= i26;
                } else {
                    j13 = j10;
                }
                i13 |= i26;
            } else {
                j13 = j10;
            }
            if ((458752 & i10) == 0) {
                if ((i12 & 32) == 0) {
                    i14 = i23;
                    int i27 = composerStartRestartGroup.changed(j11) ? 131072 : 65536;
                    i13 |= i27;
                } else {
                    i14 = i23;
                }
                i13 |= i27;
            } else {
                i14 = i23;
            }
            i15 = i12 & 64;
            if (i15 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(f6)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i13 |= i16;
            }
            if ((i10 & 29360128) != 0) {
                i13 |= ((i12 & 128) == 0 || !composerStartRestartGroup.changed(j12)) ? 4194304 : 8388608;
            }
            i17 = i12 & 256;
            if (i17 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i18 = 33554432;
                }
                i13 |= i18;
            }
            if ((i10 & 1879048192) != 0) {
                i13 |= ((i12 & 512) == 0 || !composerStartRestartGroup.changed(windowInsets)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            if ((i12 & 1024) != 0) {
                i19 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i20 = 4;
                } else {
                    i20 = 2;
                }
                i19 = i11 | i20;
            } else {
                i19 = i11;
            }
            if ((i13 & 1533916891) != 306783378 && (i19 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                windowInsets3 = windowInsets;
                modifier4 = modifier2;
                sheetState5 = sheetState2;
                shape4 = shape2;
                j15 = j13;
                composer2 = composerStartRestartGroup;
                j16 = j11;
                f10 = f6;
                j17 = j12;
                function3 = function2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i12 & 4) != 0) {
                        sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                        i13 &= -897;
                    } else {
                        sheetStateRememberModalBottomSheetState = sheetState2;
                    }
                    if ((i12 & 8) != 0) {
                        expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                        i13 &= -7169;
                    } else {
                        expandedShape = shape2;
                    }
                    if ((i12 & 16) != 0) {
                        containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i13 &= -57345;
                    } else {
                        containerColor = j13;
                    }
                    if ((i12 & 32) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 12) & 14);
                        i13 &= -458753;
                    } else {
                        jM1014contentColorForek8zF_U = j11;
                    }
                    if (i15 != 0) {
                        fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM = f6;
                    }
                    if ((i12 & 128) != 0) {
                        scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i13 &= -29360129;
                    } else {
                        scrimColor = j12;
                    }
                    if (i17 != 0) {
                        function2M1037getLambda1$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1037getLambda1$material3_release();
                    } else {
                        function2M1037getLambda1$material3_release = function2;
                    }
                    if ((i12 & 512) != 0) {
                        i13 &= -1879048193;
                        windowInsets2 = BottomSheetDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    shape3 = expandedShape;
                    j14 = containerColor;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                    }
                    if ((i12 & 128) != 0) {
                        i13 &= -29360129;
                    }
                    if ((i12 & 512) != 0) {
                        i13 &= -1879048193;
                    }
                    jM1014contentColorForek8zF_U = j11;
                    fM923getElevationD9Ej5fM = f6;
                    scrimColor = j12;
                    function2M1037getLambda1$material3_release = function2;
                    modifier3 = modifier2;
                    sheetStateRememberModalBottomSheetState = sheetState2;
                    shape3 = shape2;
                    j14 = j13;
                    windowInsets2 = windowInsets;
                }
                i21 = i13;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-879758728, i21, i19, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:122)");
                }
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                companion = Composer.INSTANCE;
                if (objB == companion.getEmpty()) {
                    objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                h hVar = new h(sheetStateRememberModalBottomSheetState, onDismissRequest, coroutineScope);
                i iVar = new i(sheetStateRememberModalBottomSheetState, onDismissRequest, coroutineScope);
                i22 = ((i21 >> 6) & 14) | 64;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState) | composerStartRestartGroup.changed(coroutineScope);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = access$ModalBottomSheetAnchorChangeHandler(sheetStateRememberModalBottomSheetState, new f(sheetStateRememberModalBottomSheetState, coroutineScope), new g(sheetStateRememberModalBottomSheetState, coroutineScope));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier5 = modifier3;
                Modifier modifier6 = modifier3;
                WindowInsets windowInsets4 = windowInsets2;
                composer2 = composerStartRestartGroup;
                sheetState3 = sheetStateRememberModalBottomSheetState;
                ModalBottomSheetPopup(new a(sheetStateRememberModalBottomSheetState, onDismissRequest, coroutineScope), windowInsets4, ComposableLambdaKt.composableLambda(composer2, 1424497392, true, new b(scrimColor, hVar, sheetStateRememberModalBottomSheetState, i21, modifier5, (AnchorChangeHandler) objRememberedValue, iVar, shape3, j14, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, function2M1037getLambda1$material3_release, content, i19, coroutineScope)), composer2, ((i21 >> 24) & 112) | BluetoothState.REQUEST_CONNECT_DEVICE);
                if (sheetState3.getHasExpandedState()) {
                    composer2.startReplaceableGroup(1157296644);
                    sheetState4 = sheetState3;
                    zChanged2 = composer2.changed(sheetState4);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new c(sheetState4, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(sheetState4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, i22);
                } else {
                    sheetState4 = sheetState3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier6;
                windowInsets3 = windowInsets4;
                sheetState5 = sheetState4;
                shape4 = shape3;
                j15 = j14;
                j16 = jM1014contentColorForek8zF_U;
                f10 = fM923getElevationD9Ej5fM;
                j17 = scrimColor;
                function3 = function2M1037getLambda1$material3_release;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(onDismissRequest, modifier4, sheetState5, shape4, j15, j16, f10, j17, function3, windowInsets3, content, i10, i11, i12));
        }
        i13 |= 48;
        modifier2 = modifier;
        if ((i10 & 896) == 0) {
            if ((i12 & 4) == 0) {
                sheetState2 = sheetState;
                if (composerStartRestartGroup.changed(sheetState2)) {
                }
                i13 |= i24;
            } else {
                sheetState2 = sheetState;
            }
            i13 |= i24;
        } else {
            sheetState2 = sheetState;
        }
        if ((i10 & 7168) == 0) {
            if ((i12 & 8) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i13 |= i25;
            } else {
                shape2 = shape;
            }
            i13 |= i25;
        } else {
            shape2 = shape;
        }
        if ((57344 & i10) == 0) {
            if ((i12 & 16) == 0) {
                j13 = j10;
                if (composerStartRestartGroup.changed(j13)) {
                }
                i13 |= i26;
            } else {
                j13 = j10;
            }
            i13 |= i26;
        } else {
            j13 = j10;
        }
        if ((458752 & i10) == 0) {
            if ((i12 & 32) == 0) {
                i14 = i23;
                if (composerStartRestartGroup.changed(j11)) {
                }
                i13 |= i27;
            } else {
                i14 = i23;
            }
            i13 |= i27;
        } else {
            i14 = i23;
        }
        i15 = i12 & 64;
        if (i15 != 0) {
            i13 |= 1572864;
        } else if ((i10 & 3670016) == 0) {
            if (composerStartRestartGroup.changed(f6)) {
                i16 = 1048576;
            } else {
                i16 = 524288;
            }
            i13 |= i16;
        }
        if ((i10 & 29360128) != 0) {
            i13 |= ((i12 & 128) == 0 || !composerStartRestartGroup.changed(j12)) ? 4194304 : 8388608;
        }
        i17 = i12 & 256;
        if (i17 != 0) {
            i13 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            if (composerStartRestartGroup.changedInstance(function2)) {
                i18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i18 = 33554432;
            }
            i13 |= i18;
        }
        if ((i10 & 1879048192) != 0) {
            i13 |= ((i12 & 512) == 0 || !composerStartRestartGroup.changed(windowInsets)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
        }
        if ((i12 & 1024) != 0) {
            i19 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i19 = i11 | i20;
        } else {
            i19 = i11;
        }
        if ((i13 & 1533916891) != 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i12 & 4) != 0) {
                    sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                    i13 &= -897;
                } else {
                    sheetStateRememberModalBottomSheetState = sheetState2;
                }
                if ((i12 & 8) != 0) {
                    expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                    i13 &= -7169;
                } else {
                    expandedShape = shape2;
                }
                if ((i12 & 16) != 0) {
                    containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i13 &= -57345;
                } else {
                    containerColor = j13;
                }
                if ((i12 & 32) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 12) & 14);
                    i13 &= -458753;
                } else {
                    jM1014contentColorForek8zF_U = j11;
                }
                if (i15 != 0) {
                    fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                } else {
                    fM923getElevationD9Ej5fM = f6;
                }
                if ((i12 & 128) != 0) {
                    scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    i13 &= -29360129;
                } else {
                    scrimColor = j12;
                }
                if (i17 != 0) {
                    function2M1037getLambda1$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1037getLambda1$material3_release();
                } else {
                    function2M1037getLambda1$material3_release = function2;
                }
                if ((i12 & 512) != 0) {
                    i13 &= -1879048193;
                    windowInsets2 = BottomSheetDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                } else {
                    windowInsets2 = windowInsets;
                }
                shape3 = expandedShape;
                j14 = containerColor;
            } else {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i12 & 4) != 0) {
                    sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                    i13 &= -897;
                } else {
                    sheetStateRememberModalBottomSheetState = sheetState2;
                }
                if ((i12 & 8) != 0) {
                    expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                    i13 &= -7169;
                } else {
                    expandedShape = shape2;
                }
                if ((i12 & 16) != 0) {
                    containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i13 &= -57345;
                } else {
                    containerColor = j13;
                }
                if ((i12 & 32) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 12) & 14);
                    i13 &= -458753;
                } else {
                    jM1014contentColorForek8zF_U = j11;
                }
                if (i15 != 0) {
                    fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                } else {
                    fM923getElevationD9Ej5fM = f6;
                }
                if ((i12 & 128) != 0) {
                    scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    i13 &= -29360129;
                } else {
                    scrimColor = j12;
                }
                if (i17 != 0) {
                    function2M1037getLambda1$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1037getLambda1$material3_release();
                } else {
                    function2M1037getLambda1$material3_release = function2;
                }
                if ((i12 & 512) != 0) {
                    i13 &= -1879048193;
                    windowInsets2 = BottomSheetDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                } else {
                    windowInsets2 = windowInsets;
                }
                shape3 = expandedShape;
                j14 = containerColor;
            }
            i21 = i13;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-879758728, i21, i19, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:122)");
            }
            objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
            companion = Composer.INSTANCE;
            if (objB == companion.getEmpty()) {
                objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            h hVar2 = new h(sheetStateRememberModalBottomSheetState, onDismissRequest, coroutineScope);
            i iVar2 = new i(sheetStateRememberModalBottomSheetState, onDismissRequest, coroutineScope);
            i22 = ((i21 >> 6) & 14) | 64;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState) | composerStartRestartGroup.changed(coroutineScope);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = access$ModalBottomSheetAnchorChangeHandler(sheetStateRememberModalBottomSheetState, new f(sheetStateRememberModalBottomSheetState, coroutineScope), new g(sheetStateRememberModalBottomSheetState, coroutineScope));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = access$ModalBottomSheetAnchorChangeHandler(sheetStateRememberModalBottomSheetState, new f(sheetStateRememberModalBottomSheetState, coroutineScope), new g(sheetStateRememberModalBottomSheetState, coroutineScope));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifier7 = modifier3;
            Modifier modifier8 = modifier3;
            WindowInsets windowInsets5 = windowInsets2;
            composer2 = composerStartRestartGroup;
            sheetState3 = sheetStateRememberModalBottomSheetState;
            ModalBottomSheetPopup(new a(sheetStateRememberModalBottomSheetState, onDismissRequest, coroutineScope), windowInsets5, ComposableLambdaKt.composableLambda(composer2, 1424497392, true, new b(scrimColor, hVar2, sheetStateRememberModalBottomSheetState, i21, modifier7, (AnchorChangeHandler) objRememberedValue, iVar2, shape3, j14, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, function2M1037getLambda1$material3_release, content, i19, coroutineScope)), composer2, ((i21 >> 24) & 112) | BluetoothState.REQUEST_CONNECT_DEVICE);
            if (sheetState3.getHasExpandedState()) {
                composer2.startReplaceableGroup(1157296644);
                sheetState4 = sheetState3;
                zChanged2 = composer2.changed(sheetState4);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new c(sheetState4, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new c(sheetState4, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                EffectsKt.LaunchedEffect(sheetState4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, i22);
            } else {
                sheetState4 = sheetState3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier8;
            windowInsets3 = windowInsets5;
            sheetState5 = sheetState4;
            shape4 = shape3;
            j15 = j14;
            j16 = jM1014contentColorForek8zF_U;
            f10 = fM923getElevationD9Ej5fM;
            j17 = scrimColor;
            function3 = function2M1037getLambda1$material3_release;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i12 & 4) != 0) {
                    sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                    i13 &= -897;
                } else {
                    sheetStateRememberModalBottomSheetState = sheetState2;
                }
                if ((i12 & 8) != 0) {
                    expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                    i13 &= -7169;
                } else {
                    expandedShape = shape2;
                }
                if ((i12 & 16) != 0) {
                    containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i13 &= -57345;
                } else {
                    containerColor = j13;
                }
                if ((i12 & 32) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 12) & 14);
                    i13 &= -458753;
                } else {
                    jM1014contentColorForek8zF_U = j11;
                }
                if (i15 != 0) {
                    fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                } else {
                    fM923getElevationD9Ej5fM = f6;
                }
                if ((i12 & 128) != 0) {
                    scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    i13 &= -29360129;
                } else {
                    scrimColor = j12;
                }
                if (i17 != 0) {
                    function2M1037getLambda1$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1037getLambda1$material3_release();
                } else {
                    function2M1037getLambda1$material3_release = function2;
                }
                if ((i12 & 512) != 0) {
                    i13 &= -1879048193;
                    windowInsets2 = BottomSheetDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                } else {
                    windowInsets2 = windowInsets;
                }
                shape3 = expandedShape;
                j14 = containerColor;
            } else {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i12 & 4) != 0) {
                    sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                    i13 &= -897;
                } else {
                    sheetStateRememberModalBottomSheetState = sheetState2;
                }
                if ((i12 & 8) != 0) {
                    expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                    i13 &= -7169;
                } else {
                    expandedShape = shape2;
                }
                if ((i12 & 16) != 0) {
                    containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i13 &= -57345;
                } else {
                    containerColor = j13;
                }
                if ((i12 & 32) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i13 >> 12) & 14);
                    i13 &= -458753;
                } else {
                    jM1014contentColorForek8zF_U = j11;
                }
                if (i15 != 0) {
                    fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                } else {
                    fM923getElevationD9Ej5fM = f6;
                }
                if ((i12 & 128) != 0) {
                    scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    i13 &= -29360129;
                } else {
                    scrimColor = j12;
                }
                if (i17 != 0) {
                    function2M1037getLambda1$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1037getLambda1$material3_release();
                } else {
                    function2M1037getLambda1$material3_release = function2;
                }
                if ((i12 & 512) != 0) {
                    i13 &= -1879048193;
                    windowInsets2 = BottomSheetDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                } else {
                    windowInsets2 = windowInsets;
                }
                shape3 = expandedShape;
                j14 = containerColor;
            }
            i21 = i13;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-879758728, i21, i19, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:122)");
            }
            objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
            companion = Composer.INSTANCE;
            if (objB == companion.getEmpty()) {
                objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            h hVar3 = new h(sheetStateRememberModalBottomSheetState, onDismissRequest, coroutineScope);
            i iVar3 = new i(sheetStateRememberModalBottomSheetState, onDismissRequest, coroutineScope);
            i22 = ((i21 >> 6) & 14) | 64;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState) | composerStartRestartGroup.changed(coroutineScope);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = access$ModalBottomSheetAnchorChangeHandler(sheetStateRememberModalBottomSheetState, new f(sheetStateRememberModalBottomSheetState, coroutineScope), new g(sheetStateRememberModalBottomSheetState, coroutineScope));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = access$ModalBottomSheetAnchorChangeHandler(sheetStateRememberModalBottomSheetState, new f(sheetStateRememberModalBottomSheetState, coroutineScope), new g(sheetStateRememberModalBottomSheetState, coroutineScope));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifier9 = modifier3;
            Modifier modifier10 = modifier3;
            WindowInsets windowInsets6 = windowInsets2;
            composer2 = composerStartRestartGroup;
            sheetState3 = sheetStateRememberModalBottomSheetState;
            ModalBottomSheetPopup(new a(sheetStateRememberModalBottomSheetState, onDismissRequest, coroutineScope), windowInsets6, ComposableLambdaKt.composableLambda(composer2, 1424497392, true, new b(scrimColor, hVar3, sheetStateRememberModalBottomSheetState, i21, modifier9, (AnchorChangeHandler) objRememberedValue, iVar3, shape3, j14, jM1014contentColorForek8zF_U, fM923getElevationD9Ej5fM, function2M1037getLambda1$material3_release, content, i19, coroutineScope)), composer2, ((i21 >> 24) & 112) | BluetoothState.REQUEST_CONNECT_DEVICE);
            if (sheetState3.getHasExpandedState()) {
                composer2.startReplaceableGroup(1157296644);
                sheetState4 = sheetState3;
                zChanged2 = composer2.changed(sheetState4);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new c(sheetState4, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new c(sheetState4, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                EffectsKt.LaunchedEffect(sheetState4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, i22);
            } else {
                sheetState4 = sheetState3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier10;
            windowInsets3 = windowInsets6;
            sheetState5 = sheetState4;
            shape4 = shape3;
            j15 = j14;
            j16 = jM1014contentColorForek8zF_U;
            f10 = fM923getElevationD9Ej5fM;
            j17 = scrimColor;
            function3 = function2M1037getLambda1$material3_release;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(onDismissRequest, modifier4, sheetState5, shape4, j15, j16, f10, j17, function3, windowInsets3, content, i10, i11, i12));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0126  */
    /* JADX WARN: Code duplicated, block: B:105:0x012b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0131  */
    /* JADX WARN: Code duplicated, block: B:108:0x0134  */
    /* JADX WARN: Code duplicated, block: B:111:0x0141  */
    /* JADX WARN: Code duplicated, block: B:115:0x015b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0165  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:146:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:149:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:150:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:153:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:155:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:156:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:159:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:160:0x0208  */
    /* JADX WARN: Code duplicated, block: B:162:0x020c  */
    /* JADX WARN: Code duplicated, block: B:164:0x0223  */
    /* JADX WARN: Code duplicated, block: B:167:0x0231  */
    /* JADX WARN: Code duplicated, block: B:170:0x0280  */
    /* JADX WARN: Code duplicated, block: B:175:0x029a  */
    /* JADX WARN: Code duplicated, block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x0101  */
    /* JADX WARN: Code duplicated, block: B:91:0x0108  */
    /* JADX WARN: Code duplicated, block: B:93:0x010e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0114  */
    /* JADX WARN: Code duplicated, block: B:96:0x0117  */
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use ModalBottomSheet overload with windowInset parameter.")
    @Composable
    /* JADX INFO: renamed from: ModalBottomSheet-xOkiWaM, reason: not valid java name */
    public static final /* synthetic */ void m1170ModalBottomSheetxOkiWaM(Function0 onDismissRequest, Modifier modifier, SheetState sheetState, Shape shape, long j10, long j11, float f6, long j12, Function2 function2, Function3 content, Composer composer, int i10, int i11) {
        int i12;
        SheetState sheetState2;
        Shape shape2;
        long jM1014contentColorForek8zF_U;
        int i13;
        float f10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Modifier modifier2;
        SheetState sheetStateRememberModalBottomSheetState;
        Shape expandedShape;
        long containerColor;
        float fM923getElevationD9Ej5fM;
        long scrimColor;
        Function2 function2M1038getLambda2$material3_release;
        long j13;
        long j14;
        float f11;
        long j15;
        SheetState sheetState3;
        Shape shape3;
        Composer composer2;
        Modifier modifier3;
        SheetState sheetState4;
        Shape shape4;
        long j16;
        long j17;
        float f12;
        long j18;
        Function2 function3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i20;
        int i21;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1311611302);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(onDismissRequest) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i22 = i11 & 2;
        if (i22 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i10 & 896) == 0) {
                if ((i11 & 4) == 0) {
                    sheetState2 = sheetState;
                    int i23 = composerStartRestartGroup.changed(sheetState2) ? 256 : 128;
                    i12 |= i23;
                } else {
                    sheetState2 = sheetState;
                }
                i12 |= i23;
            } else {
                sheetState2 = sheetState;
            }
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    shape2 = shape;
                    int i24 = composerStartRestartGroup.changed(shape2) ? 2048 : 1024;
                    i12 |= i24;
                } else {
                    shape2 = shape;
                }
                i12 |= i24;
            } else {
                shape2 = shape;
            }
            if ((i10 & 57344) != 0) {
                i12 |= ((i11 & 16) == 0 || !composerStartRestartGroup.changed(j10)) ? 8192 : 16384;
            }
            if ((i10 & 458752) == 0) {
                jM1014contentColorForek8zF_U = j11;
                if ((i11 & 32) == 0 || !composerStartRestartGroup.changed(jM1014contentColorForek8zF_U)) {
                    i21 = 65536;
                } else {
                    i21 = 131072;
                }
                i12 |= i21;
            } else {
                jM1014contentColorForek8zF_U = j11;
            }
            i13 = i11 & 64;
            if (i13 != 0) {
                if ((i10 & 3670016) == 0) {
                    f10 = f6;
                    if (composerStartRestartGroup.changed(f10)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i12 |= i14;
                }
                if ((i10 & 29360128) == 0) {
                    int i25 = i12;
                    if ((i11 & 128) == 0 || !composerStartRestartGroup.changed(j12)) {
                        i20 = 4194304;
                    } else {
                        i20 = 8388608;
                    }
                    i15 = i25 | i20;
                } else {
                    i15 = i12;
                }
                i16 = i11 & 256;
                if (i16 != 0) {
                    i15 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i17 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i17 = 33554432;
                    }
                    i15 |= i17;
                }
                if ((i11 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i18 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i18 = 268435456;
                        }
                    }
                    i19 = i15;
                    if ((i19 & 1533916891) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 4) != 0) {
                                sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                                i19 &= -897;
                            } else {
                                sheetStateRememberModalBottomSheetState = sheetState2;
                            }
                            if ((i11 & 8) != 0) {
                                expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                                i19 &= -7169;
                            } else {
                                expandedShape = shape2;
                            }
                            if ((i11 & 16) != 0) {
                                containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i19 &= -57345;
                            } else {
                                containerColor = j10;
                            }
                            if ((i11 & 32) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i19 >> 12) & 14);
                                i19 &= -458753;
                            }
                            if (i13 != 0) {
                                fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                            } else {
                                fM923getElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 128) != 0) {
                                scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                                i19 &= -29360129;
                            } else {
                                scrimColor = j12;
                            }
                            if (i16 != 0) {
                                function2M1038getLambda2$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1038getLambda2$material3_release();
                            } else {
                                function2M1038getLambda2$material3_release = function2;
                            }
                            j13 = containerColor;
                            j14 = jM1014contentColorForek8zF_U;
                            f11 = fM923getElevationD9Ej5fM;
                            j15 = scrimColor;
                            sheetState3 = sheetStateRememberModalBottomSheetState;
                            shape3 = expandedShape;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i11 & 4) != 0) {
                                i19 &= -897;
                            }
                            if ((i11 & 8) != 0) {
                                i19 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                i19 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                i19 &= -458753;
                            }
                            if ((i11 & 128) != 0) {
                                i19 &= -29360129;
                            }
                            modifier2 = modifier;
                            j13 = j10;
                            j15 = j12;
                            function2M1038getLambda2$material3_release = function2;
                            sheetState3 = sheetState2;
                            shape3 = shape2;
                            j14 = jM1014contentColorForek8zF_U;
                            f11 = f10;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1311611302, i19, -1, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:281)");
                        }
                        composer2 = composerStartRestartGroup;
                        m1169ModalBottomSheetEP0qOeE(onDismissRequest, modifier2, sheetState3, shape3, j13, j14, f11, j15, function2M1038getLambda2$material3_release, null, content, composer2, (i19 & 14) | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (i19 & 3670016) | (i19 & 29360128) | (i19 & 234881024), (i19 >> 27) & 14, 512);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        sheetState4 = sheetState3;
                        shape4 = shape3;
                        j16 = j13;
                        j17 = j14;
                        f12 = f11;
                        j18 = j15;
                        function3 = function2M1038getLambda2$material3_release;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        sheetState4 = sheetState2;
                        shape4 = shape2;
                        j17 = jM1014contentColorForek8zF_U;
                        composer2 = composerStartRestartGroup;
                        f12 = f10;
                        j16 = j10;
                        j18 = j12;
                        function3 = function2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new e(onDismissRequest, modifier3, sheetState4, shape4, j16, j17, f12, j18, function3, content, i10, i11));
                }
                i18 = 805306368;
                i15 |= i18;
                i19 = i15;
                if ((i19 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                            i19 &= -897;
                        } else {
                            sheetStateRememberModalBottomSheetState = sheetState2;
                        }
                        if ((i11 & 8) != 0) {
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i19 &= -7169;
                        } else {
                            expandedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i19 &= -57345;
                        } else {
                            containerColor = j10;
                        }
                        if ((i11 & 32) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i19 >> 12) & 14);
                            i19 &= -458753;
                        }
                        if (i13 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 128) != 0) {
                            scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i19 &= -29360129;
                        } else {
                            scrimColor = j12;
                        }
                        if (i16 != 0) {
                            function2M1038getLambda2$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1038getLambda2$material3_release();
                        } else {
                            function2M1038getLambda2$material3_release = function2;
                        }
                        j13 = containerColor;
                        j14 = jM1014contentColorForek8zF_U;
                        f11 = fM923getElevationD9Ej5fM;
                        j15 = scrimColor;
                        sheetState3 = sheetStateRememberModalBottomSheetState;
                        shape3 = expandedShape;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                            i19 &= -897;
                        } else {
                            sheetStateRememberModalBottomSheetState = sheetState2;
                        }
                        if ((i11 & 8) != 0) {
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i19 &= -7169;
                        } else {
                            expandedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i19 &= -57345;
                        } else {
                            containerColor = j10;
                        }
                        if ((i11 & 32) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i19 >> 12) & 14);
                            i19 &= -458753;
                        }
                        if (i13 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 128) != 0) {
                            scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i19 &= -29360129;
                        } else {
                            scrimColor = j12;
                        }
                        if (i16 != 0) {
                            function2M1038getLambda2$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1038getLambda2$material3_release();
                        } else {
                            function2M1038getLambda2$material3_release = function2;
                        }
                        j13 = containerColor;
                        j14 = jM1014contentColorForek8zF_U;
                        f11 = fM923getElevationD9Ej5fM;
                        j15 = scrimColor;
                        sheetState3 = sheetStateRememberModalBottomSheetState;
                        shape3 = expandedShape;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1311611302, i19, -1, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:281)");
                    }
                    composer2 = composerStartRestartGroup;
                    m1169ModalBottomSheetEP0qOeE(onDismissRequest, modifier2, sheetState3, shape3, j13, j14, f11, j15, function2M1038getLambda2$material3_release, null, content, composer2, (i19 & 14) | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (i19 & 3670016) | (i19 & 29360128) | (i19 & 234881024), (i19 >> 27) & 14, 512);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    sheetState4 = sheetState3;
                    shape4 = shape3;
                    j16 = j13;
                    j17 = j14;
                    f12 = f11;
                    j18 = j15;
                    function3 = function2M1038getLambda2$material3_release;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                            i19 &= -897;
                        } else {
                            sheetStateRememberModalBottomSheetState = sheetState2;
                        }
                        if ((i11 & 8) != 0) {
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i19 &= -7169;
                        } else {
                            expandedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i19 &= -57345;
                        } else {
                            containerColor = j10;
                        }
                        if ((i11 & 32) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i19 >> 12) & 14);
                            i19 &= -458753;
                        }
                        if (i13 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 128) != 0) {
                            scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i19 &= -29360129;
                        } else {
                            scrimColor = j12;
                        }
                        if (i16 != 0) {
                            function2M1038getLambda2$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1038getLambda2$material3_release();
                        } else {
                            function2M1038getLambda2$material3_release = function2;
                        }
                        j13 = containerColor;
                        j14 = jM1014contentColorForek8zF_U;
                        f11 = fM923getElevationD9Ej5fM;
                        j15 = scrimColor;
                        sheetState3 = sheetStateRememberModalBottomSheetState;
                        shape3 = expandedShape;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                            i19 &= -897;
                        } else {
                            sheetStateRememberModalBottomSheetState = sheetState2;
                        }
                        if ((i11 & 8) != 0) {
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i19 &= -7169;
                        } else {
                            expandedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i19 &= -57345;
                        } else {
                            containerColor = j10;
                        }
                        if ((i11 & 32) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i19 >> 12) & 14);
                            i19 &= -458753;
                        }
                        if (i13 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 128) != 0) {
                            scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i19 &= -29360129;
                        } else {
                            scrimColor = j12;
                        }
                        if (i16 != 0) {
                            function2M1038getLambda2$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1038getLambda2$material3_release();
                        } else {
                            function2M1038getLambda2$material3_release = function2;
                        }
                        j13 = containerColor;
                        j14 = jM1014contentColorForek8zF_U;
                        f11 = fM923getElevationD9Ej5fM;
                        j15 = scrimColor;
                        sheetState3 = sheetStateRememberModalBottomSheetState;
                        shape3 = expandedShape;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1311611302, i19, -1, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:281)");
                    }
                    composer2 = composerStartRestartGroup;
                    m1169ModalBottomSheetEP0qOeE(onDismissRequest, modifier2, sheetState3, shape3, j13, j14, f11, j15, function2M1038getLambda2$material3_release, null, content, composer2, (i19 & 14) | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (i19 & 3670016) | (i19 & 29360128) | (i19 & 234881024), (i19 >> 27) & 14, 512);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    sheetState4 = sheetState3;
                    shape4 = shape3;
                    j16 = j13;
                    j17 = j14;
                    f12 = f11;
                    j18 = j15;
                    function3 = function2M1038getLambda2$material3_release;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(onDismissRequest, modifier3, sheetState4, shape4, j16, j17, f12, j18, function3, content, i10, i11));
            }
            i12 |= 1572864;
            f10 = f6;
            if ((i10 & 29360128) == 0) {
                int i26 = i12;
                if ((i11 & 128) == 0) {
                    i20 = 4194304;
                } else {
                    i20 = 4194304;
                }
                i15 = i26 | i20;
            } else {
                i15 = i12;
            }
            i16 = i11 & 256;
            if (i16 != 0) {
                i15 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i17 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i17 = 33554432;
                }
                i15 |= i17;
            }
            if ((i11 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i18 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i18 = 268435456;
                    }
                }
                i19 = i15;
                if ((i19 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                            i19 &= -897;
                        } else {
                            sheetStateRememberModalBottomSheetState = sheetState2;
                        }
                        if ((i11 & 8) != 0) {
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i19 &= -7169;
                        } else {
                            expandedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i19 &= -57345;
                        } else {
                            containerColor = j10;
                        }
                        if ((i11 & 32) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i19 >> 12) & 14);
                            i19 &= -458753;
                        }
                        if (i13 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 128) != 0) {
                            scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i19 &= -29360129;
                        } else {
                            scrimColor = j12;
                        }
                        if (i16 != 0) {
                            function2M1038getLambda2$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1038getLambda2$material3_release();
                        } else {
                            function2M1038getLambda2$material3_release = function2;
                        }
                        j13 = containerColor;
                        j14 = jM1014contentColorForek8zF_U;
                        f11 = fM923getElevationD9Ej5fM;
                        j15 = scrimColor;
                        sheetState3 = sheetStateRememberModalBottomSheetState;
                        shape3 = expandedShape;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                            i19 &= -897;
                        } else {
                            sheetStateRememberModalBottomSheetState = sheetState2;
                        }
                        if ((i11 & 8) != 0) {
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i19 &= -7169;
                        } else {
                            expandedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i19 &= -57345;
                        } else {
                            containerColor = j10;
                        }
                        if ((i11 & 32) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i19 >> 12) & 14);
                            i19 &= -458753;
                        }
                        if (i13 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 128) != 0) {
                            scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i19 &= -29360129;
                        } else {
                            scrimColor = j12;
                        }
                        if (i16 != 0) {
                            function2M1038getLambda2$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1038getLambda2$material3_release();
                        } else {
                            function2M1038getLambda2$material3_release = function2;
                        }
                        j13 = containerColor;
                        j14 = jM1014contentColorForek8zF_U;
                        f11 = fM923getElevationD9Ej5fM;
                        j15 = scrimColor;
                        sheetState3 = sheetStateRememberModalBottomSheetState;
                        shape3 = expandedShape;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1311611302, i19, -1, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:281)");
                    }
                    composer2 = composerStartRestartGroup;
                    m1169ModalBottomSheetEP0qOeE(onDismissRequest, modifier2, sheetState3, shape3, j13, j14, f11, j15, function2M1038getLambda2$material3_release, null, content, composer2, (i19 & 14) | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (i19 & 3670016) | (i19 & 29360128) | (i19 & 234881024), (i19 >> 27) & 14, 512);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    sheetState4 = sheetState3;
                    shape4 = shape3;
                    j16 = j13;
                    j17 = j14;
                    f12 = f11;
                    j18 = j15;
                    function3 = function2M1038getLambda2$material3_release;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                            i19 &= -897;
                        } else {
                            sheetStateRememberModalBottomSheetState = sheetState2;
                        }
                        if ((i11 & 8) != 0) {
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i19 &= -7169;
                        } else {
                            expandedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i19 &= -57345;
                        } else {
                            containerColor = j10;
                        }
                        if ((i11 & 32) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i19 >> 12) & 14);
                            i19 &= -458753;
                        }
                        if (i13 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 128) != 0) {
                            scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i19 &= -29360129;
                        } else {
                            scrimColor = j12;
                        }
                        if (i16 != 0) {
                            function2M1038getLambda2$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1038getLambda2$material3_release();
                        } else {
                            function2M1038getLambda2$material3_release = function2;
                        }
                        j13 = containerColor;
                        j14 = jM1014contentColorForek8zF_U;
                        f11 = fM923getElevationD9Ej5fM;
                        j15 = scrimColor;
                        sheetState3 = sheetStateRememberModalBottomSheetState;
                        shape3 = expandedShape;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                            i19 &= -897;
                        } else {
                            sheetStateRememberModalBottomSheetState = sheetState2;
                        }
                        if ((i11 & 8) != 0) {
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i19 &= -7169;
                        } else {
                            expandedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i19 &= -57345;
                        } else {
                            containerColor = j10;
                        }
                        if ((i11 & 32) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i19 >> 12) & 14);
                            i19 &= -458753;
                        }
                        if (i13 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 128) != 0) {
                            scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i19 &= -29360129;
                        } else {
                            scrimColor = j12;
                        }
                        if (i16 != 0) {
                            function2M1038getLambda2$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1038getLambda2$material3_release();
                        } else {
                            function2M1038getLambda2$material3_release = function2;
                        }
                        j13 = containerColor;
                        j14 = jM1014contentColorForek8zF_U;
                        f11 = fM923getElevationD9Ej5fM;
                        j15 = scrimColor;
                        sheetState3 = sheetStateRememberModalBottomSheetState;
                        shape3 = expandedShape;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1311611302, i19, -1, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:281)");
                    }
                    composer2 = composerStartRestartGroup;
                    m1169ModalBottomSheetEP0qOeE(onDismissRequest, modifier2, sheetState3, shape3, j13, j14, f11, j15, function2M1038getLambda2$material3_release, null, content, composer2, (i19 & 14) | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (i19 & 3670016) | (i19 & 29360128) | (i19 & 234881024), (i19 >> 27) & 14, 512);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    sheetState4 = sheetState3;
                    shape4 = shape3;
                    j16 = j13;
                    j17 = j14;
                    f12 = f11;
                    j18 = j15;
                    function3 = function2M1038getLambda2$material3_release;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(onDismissRequest, modifier3, sheetState4, shape4, j16, j17, f12, j18, function3, content, i10, i11));
            }
            i18 = 805306368;
            i15 |= i18;
            i19 = i15;
            if ((i19 & 1533916891) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                        i19 &= -897;
                    } else {
                        sheetStateRememberModalBottomSheetState = sheetState2;
                    }
                    if ((i11 & 8) != 0) {
                        expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                        i19 &= -7169;
                    } else {
                        expandedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i19 &= -57345;
                    } else {
                        containerColor = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i19 >> 12) & 14);
                        i19 &= -458753;
                    }
                    if (i13 != 0) {
                        fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 128) != 0) {
                        scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i19 &= -29360129;
                    } else {
                        scrimColor = j12;
                    }
                    if (i16 != 0) {
                        function2M1038getLambda2$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1038getLambda2$material3_release();
                    } else {
                        function2M1038getLambda2$material3_release = function2;
                    }
                    j13 = containerColor;
                    j14 = jM1014contentColorForek8zF_U;
                    f11 = fM923getElevationD9Ej5fM;
                    j15 = scrimColor;
                    sheetState3 = sheetStateRememberModalBottomSheetState;
                    shape3 = expandedShape;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                        i19 &= -897;
                    } else {
                        sheetStateRememberModalBottomSheetState = sheetState2;
                    }
                    if ((i11 & 8) != 0) {
                        expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                        i19 &= -7169;
                    } else {
                        expandedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i19 &= -57345;
                    } else {
                        containerColor = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i19 >> 12) & 14);
                        i19 &= -458753;
                    }
                    if (i13 != 0) {
                        fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 128) != 0) {
                        scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i19 &= -29360129;
                    } else {
                        scrimColor = j12;
                    }
                    if (i16 != 0) {
                        function2M1038getLambda2$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1038getLambda2$material3_release();
                    } else {
                        function2M1038getLambda2$material3_release = function2;
                    }
                    j13 = containerColor;
                    j14 = jM1014contentColorForek8zF_U;
                    f11 = fM923getElevationD9Ej5fM;
                    j15 = scrimColor;
                    sheetState3 = sheetStateRememberModalBottomSheetState;
                    shape3 = expandedShape;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1311611302, i19, -1, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:281)");
                }
                composer2 = composerStartRestartGroup;
                m1169ModalBottomSheetEP0qOeE(onDismissRequest, modifier2, sheetState3, shape3, j13, j14, f11, j15, function2M1038getLambda2$material3_release, null, content, composer2, (i19 & 14) | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (i19 & 3670016) | (i19 & 29360128) | (i19 & 234881024), (i19 >> 27) & 14, 512);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                sheetState4 = sheetState3;
                shape4 = shape3;
                j16 = j13;
                j17 = j14;
                f12 = f11;
                j18 = j15;
                function3 = function2M1038getLambda2$material3_release;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                        i19 &= -897;
                    } else {
                        sheetStateRememberModalBottomSheetState = sheetState2;
                    }
                    if ((i11 & 8) != 0) {
                        expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                        i19 &= -7169;
                    } else {
                        expandedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i19 &= -57345;
                    } else {
                        containerColor = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i19 >> 12) & 14);
                        i19 &= -458753;
                    }
                    if (i13 != 0) {
                        fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 128) != 0) {
                        scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i19 &= -29360129;
                    } else {
                        scrimColor = j12;
                    }
                    if (i16 != 0) {
                        function2M1038getLambda2$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1038getLambda2$material3_release();
                    } else {
                        function2M1038getLambda2$material3_release = function2;
                    }
                    j13 = containerColor;
                    j14 = jM1014contentColorForek8zF_U;
                    f11 = fM923getElevationD9Ej5fM;
                    j15 = scrimColor;
                    sheetState3 = sheetStateRememberModalBottomSheetState;
                    shape3 = expandedShape;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                        i19 &= -897;
                    } else {
                        sheetStateRememberModalBottomSheetState = sheetState2;
                    }
                    if ((i11 & 8) != 0) {
                        expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                        i19 &= -7169;
                    } else {
                        expandedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i19 &= -57345;
                    } else {
                        containerColor = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i19 >> 12) & 14);
                        i19 &= -458753;
                    }
                    if (i13 != 0) {
                        fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 128) != 0) {
                        scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i19 &= -29360129;
                    } else {
                        scrimColor = j12;
                    }
                    if (i16 != 0) {
                        function2M1038getLambda2$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1038getLambda2$material3_release();
                    } else {
                        function2M1038getLambda2$material3_release = function2;
                    }
                    j13 = containerColor;
                    j14 = jM1014contentColorForek8zF_U;
                    f11 = fM923getElevationD9Ej5fM;
                    j15 = scrimColor;
                    sheetState3 = sheetStateRememberModalBottomSheetState;
                    shape3 = expandedShape;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1311611302, i19, -1, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:281)");
                }
                composer2 = composerStartRestartGroup;
                m1169ModalBottomSheetEP0qOeE(onDismissRequest, modifier2, sheetState3, shape3, j13, j14, f11, j15, function2M1038getLambda2$material3_release, null, content, composer2, (i19 & 14) | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (i19 & 3670016) | (i19 & 29360128) | (i19 & 234881024), (i19 >> 27) & 14, 512);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                sheetState4 = sheetState3;
                shape4 = shape3;
                j16 = j13;
                j17 = j14;
                f12 = f11;
                j18 = j15;
                function3 = function2M1038getLambda2$material3_release;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(onDismissRequest, modifier3, sheetState4, shape4, j16, j17, f12, j18, function3, content, i10, i11));
        }
        i12 |= 48;
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                sheetState2 = sheetState;
                if (composerStartRestartGroup.changed(sheetState2)) {
                }
                i12 |= i23;
            } else {
                sheetState2 = sheetState;
            }
            i12 |= i23;
        } else {
            sheetState2 = sheetState;
        }
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i12 |= i24;
            } else {
                shape2 = shape;
            }
            i12 |= i24;
        } else {
            shape2 = shape;
        }
        if ((i10 & 57344) != 0) {
            i12 |= ((i11 & 16) == 0 || !composerStartRestartGroup.changed(j10)) ? 8192 : 16384;
        }
        if ((i10 & 458752) == 0) {
            jM1014contentColorForek8zF_U = j11;
            if ((i11 & 32) == 0) {
                i21 = 65536;
            } else {
                i21 = 65536;
            }
            i12 |= i21;
        } else {
            jM1014contentColorForek8zF_U = j11;
        }
        i13 = i11 & 64;
        if (i13 != 0) {
            if ((i10 & 3670016) == 0) {
                f10 = f6;
                if (composerStartRestartGroup.changed(f10)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i12 |= i14;
            }
            if ((i10 & 29360128) == 0) {
                int i27 = i12;
                if ((i11 & 128) == 0) {
                    i20 = 4194304;
                } else {
                    i20 = 4194304;
                }
                i15 = i27 | i20;
            } else {
                i15 = i12;
            }
            i16 = i11 & 256;
            if (i16 != 0) {
                i15 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i17 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i17 = 33554432;
                }
                i15 |= i17;
            }
            if ((i11 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i18 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i18 = 268435456;
                    }
                }
                i19 = i15;
                if ((i19 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                            i19 &= -897;
                        } else {
                            sheetStateRememberModalBottomSheetState = sheetState2;
                        }
                        if ((i11 & 8) != 0) {
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i19 &= -7169;
                        } else {
                            expandedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i19 &= -57345;
                        } else {
                            containerColor = j10;
                        }
                        if ((i11 & 32) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i19 >> 12) & 14);
                            i19 &= -458753;
                        }
                        if (i13 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 128) != 0) {
                            scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i19 &= -29360129;
                        } else {
                            scrimColor = j12;
                        }
                        if (i16 != 0) {
                            function2M1038getLambda2$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1038getLambda2$material3_release();
                        } else {
                            function2M1038getLambda2$material3_release = function2;
                        }
                        j13 = containerColor;
                        j14 = jM1014contentColorForek8zF_U;
                        f11 = fM923getElevationD9Ej5fM;
                        j15 = scrimColor;
                        sheetState3 = sheetStateRememberModalBottomSheetState;
                        shape3 = expandedShape;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                            i19 &= -897;
                        } else {
                            sheetStateRememberModalBottomSheetState = sheetState2;
                        }
                        if ((i11 & 8) != 0) {
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i19 &= -7169;
                        } else {
                            expandedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i19 &= -57345;
                        } else {
                            containerColor = j10;
                        }
                        if ((i11 & 32) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i19 >> 12) & 14);
                            i19 &= -458753;
                        }
                        if (i13 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 128) != 0) {
                            scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i19 &= -29360129;
                        } else {
                            scrimColor = j12;
                        }
                        if (i16 != 0) {
                            function2M1038getLambda2$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1038getLambda2$material3_release();
                        } else {
                            function2M1038getLambda2$material3_release = function2;
                        }
                        j13 = containerColor;
                        j14 = jM1014contentColorForek8zF_U;
                        f11 = fM923getElevationD9Ej5fM;
                        j15 = scrimColor;
                        sheetState3 = sheetStateRememberModalBottomSheetState;
                        shape3 = expandedShape;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1311611302, i19, -1, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:281)");
                    }
                    composer2 = composerStartRestartGroup;
                    m1169ModalBottomSheetEP0qOeE(onDismissRequest, modifier2, sheetState3, shape3, j13, j14, f11, j15, function2M1038getLambda2$material3_release, null, content, composer2, (i19 & 14) | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (i19 & 3670016) | (i19 & 29360128) | (i19 & 234881024), (i19 >> 27) & 14, 512);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    sheetState4 = sheetState3;
                    shape4 = shape3;
                    j16 = j13;
                    j17 = j14;
                    f12 = f11;
                    j18 = j15;
                    function3 = function2M1038getLambda2$material3_release;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                            i19 &= -897;
                        } else {
                            sheetStateRememberModalBottomSheetState = sheetState2;
                        }
                        if ((i11 & 8) != 0) {
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i19 &= -7169;
                        } else {
                            expandedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i19 &= -57345;
                        } else {
                            containerColor = j10;
                        }
                        if ((i11 & 32) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i19 >> 12) & 14);
                            i19 &= -458753;
                        }
                        if (i13 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 128) != 0) {
                            scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i19 &= -29360129;
                        } else {
                            scrimColor = j12;
                        }
                        if (i16 != 0) {
                            function2M1038getLambda2$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1038getLambda2$material3_release();
                        } else {
                            function2M1038getLambda2$material3_release = function2;
                        }
                        j13 = containerColor;
                        j14 = jM1014contentColorForek8zF_U;
                        f11 = fM923getElevationD9Ej5fM;
                        j15 = scrimColor;
                        sheetState3 = sheetStateRememberModalBottomSheetState;
                        shape3 = expandedShape;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                            i19 &= -897;
                        } else {
                            sheetStateRememberModalBottomSheetState = sheetState2;
                        }
                        if ((i11 & 8) != 0) {
                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                            i19 &= -7169;
                        } else {
                            expandedShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i19 &= -57345;
                        } else {
                            containerColor = j10;
                        }
                        if ((i11 & 32) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i19 >> 12) & 14);
                            i19 &= -458753;
                        }
                        if (i13 != 0) {
                            fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                        } else {
                            fM923getElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 128) != 0) {
                            scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i19 &= -29360129;
                        } else {
                            scrimColor = j12;
                        }
                        if (i16 != 0) {
                            function2M1038getLambda2$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1038getLambda2$material3_release();
                        } else {
                            function2M1038getLambda2$material3_release = function2;
                        }
                        j13 = containerColor;
                        j14 = jM1014contentColorForek8zF_U;
                        f11 = fM923getElevationD9Ej5fM;
                        j15 = scrimColor;
                        sheetState3 = sheetStateRememberModalBottomSheetState;
                        shape3 = expandedShape;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1311611302, i19, -1, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:281)");
                    }
                    composer2 = composerStartRestartGroup;
                    m1169ModalBottomSheetEP0qOeE(onDismissRequest, modifier2, sheetState3, shape3, j13, j14, f11, j15, function2M1038getLambda2$material3_release, null, content, composer2, (i19 & 14) | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (i19 & 3670016) | (i19 & 29360128) | (i19 & 234881024), (i19 >> 27) & 14, 512);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    sheetState4 = sheetState3;
                    shape4 = shape3;
                    j16 = j13;
                    j17 = j14;
                    f12 = f11;
                    j18 = j15;
                    function3 = function2M1038getLambda2$material3_release;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(onDismissRequest, modifier3, sheetState4, shape4, j16, j17, f12, j18, function3, content, i10, i11));
            }
            i18 = 805306368;
            i15 |= i18;
            i19 = i15;
            if ((i19 & 1533916891) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                        i19 &= -897;
                    } else {
                        sheetStateRememberModalBottomSheetState = sheetState2;
                    }
                    if ((i11 & 8) != 0) {
                        expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                        i19 &= -7169;
                    } else {
                        expandedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i19 &= -57345;
                    } else {
                        containerColor = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i19 >> 12) & 14);
                        i19 &= -458753;
                    }
                    if (i13 != 0) {
                        fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 128) != 0) {
                        scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i19 &= -29360129;
                    } else {
                        scrimColor = j12;
                    }
                    if (i16 != 0) {
                        function2M1038getLambda2$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1038getLambda2$material3_release();
                    } else {
                        function2M1038getLambda2$material3_release = function2;
                    }
                    j13 = containerColor;
                    j14 = jM1014contentColorForek8zF_U;
                    f11 = fM923getElevationD9Ej5fM;
                    j15 = scrimColor;
                    sheetState3 = sheetStateRememberModalBottomSheetState;
                    shape3 = expandedShape;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                        i19 &= -897;
                    } else {
                        sheetStateRememberModalBottomSheetState = sheetState2;
                    }
                    if ((i11 & 8) != 0) {
                        expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                        i19 &= -7169;
                    } else {
                        expandedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i19 &= -57345;
                    } else {
                        containerColor = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i19 >> 12) & 14);
                        i19 &= -458753;
                    }
                    if (i13 != 0) {
                        fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 128) != 0) {
                        scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i19 &= -29360129;
                    } else {
                        scrimColor = j12;
                    }
                    if (i16 != 0) {
                        function2M1038getLambda2$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1038getLambda2$material3_release();
                    } else {
                        function2M1038getLambda2$material3_release = function2;
                    }
                    j13 = containerColor;
                    j14 = jM1014contentColorForek8zF_U;
                    f11 = fM923getElevationD9Ej5fM;
                    j15 = scrimColor;
                    sheetState3 = sheetStateRememberModalBottomSheetState;
                    shape3 = expandedShape;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1311611302, i19, -1, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:281)");
                }
                composer2 = composerStartRestartGroup;
                m1169ModalBottomSheetEP0qOeE(onDismissRequest, modifier2, sheetState3, shape3, j13, j14, f11, j15, function2M1038getLambda2$material3_release, null, content, composer2, (i19 & 14) | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (i19 & 3670016) | (i19 & 29360128) | (i19 & 234881024), (i19 >> 27) & 14, 512);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                sheetState4 = sheetState3;
                shape4 = shape3;
                j16 = j13;
                j17 = j14;
                f12 = f11;
                j18 = j15;
                function3 = function2M1038getLambda2$material3_release;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                        i19 &= -897;
                    } else {
                        sheetStateRememberModalBottomSheetState = sheetState2;
                    }
                    if ((i11 & 8) != 0) {
                        expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                        i19 &= -7169;
                    } else {
                        expandedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i19 &= -57345;
                    } else {
                        containerColor = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i19 >> 12) & 14);
                        i19 &= -458753;
                    }
                    if (i13 != 0) {
                        fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 128) != 0) {
                        scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i19 &= -29360129;
                    } else {
                        scrimColor = j12;
                    }
                    if (i16 != 0) {
                        function2M1038getLambda2$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1038getLambda2$material3_release();
                    } else {
                        function2M1038getLambda2$material3_release = function2;
                    }
                    j13 = containerColor;
                    j14 = jM1014contentColorForek8zF_U;
                    f11 = fM923getElevationD9Ej5fM;
                    j15 = scrimColor;
                    sheetState3 = sheetStateRememberModalBottomSheetState;
                    shape3 = expandedShape;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                        i19 &= -897;
                    } else {
                        sheetStateRememberModalBottomSheetState = sheetState2;
                    }
                    if ((i11 & 8) != 0) {
                        expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                        i19 &= -7169;
                    } else {
                        expandedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i19 &= -57345;
                    } else {
                        containerColor = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i19 >> 12) & 14);
                        i19 &= -458753;
                    }
                    if (i13 != 0) {
                        fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 128) != 0) {
                        scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i19 &= -29360129;
                    } else {
                        scrimColor = j12;
                    }
                    if (i16 != 0) {
                        function2M1038getLambda2$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1038getLambda2$material3_release();
                    } else {
                        function2M1038getLambda2$material3_release = function2;
                    }
                    j13 = containerColor;
                    j14 = jM1014contentColorForek8zF_U;
                    f11 = fM923getElevationD9Ej5fM;
                    j15 = scrimColor;
                    sheetState3 = sheetStateRememberModalBottomSheetState;
                    shape3 = expandedShape;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1311611302, i19, -1, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:281)");
                }
                composer2 = composerStartRestartGroup;
                m1169ModalBottomSheetEP0qOeE(onDismissRequest, modifier2, sheetState3, shape3, j13, j14, f11, j15, function2M1038getLambda2$material3_release, null, content, composer2, (i19 & 14) | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (i19 & 3670016) | (i19 & 29360128) | (i19 & 234881024), (i19 >> 27) & 14, 512);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                sheetState4 = sheetState3;
                shape4 = shape3;
                j16 = j13;
                j17 = j14;
                f12 = f11;
                j18 = j15;
                function3 = function2M1038getLambda2$material3_release;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(onDismissRequest, modifier3, sheetState4, shape4, j16, j17, f12, j18, function3, content, i10, i11));
        }
        i12 |= 1572864;
        f10 = f6;
        if ((i10 & 29360128) == 0) {
            int i28 = i12;
            if ((i11 & 128) == 0) {
                i20 = 4194304;
            } else {
                i20 = 4194304;
            }
            i15 = i28 | i20;
        } else {
            i15 = i12;
        }
        i16 = i11 & 256;
        if (i16 != 0) {
            i15 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            if (composerStartRestartGroup.changedInstance(function2)) {
                i17 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i17 = 33554432;
            }
            i15 |= i17;
        }
        if ((i11 & 512) != 0) {
            if ((1879048192 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i18 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i18 = 268435456;
                }
            }
            i19 = i15;
            if ((i19 & 1533916891) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                        i19 &= -897;
                    } else {
                        sheetStateRememberModalBottomSheetState = sheetState2;
                    }
                    if ((i11 & 8) != 0) {
                        expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                        i19 &= -7169;
                    } else {
                        expandedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i19 &= -57345;
                    } else {
                        containerColor = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i19 >> 12) & 14);
                        i19 &= -458753;
                    }
                    if (i13 != 0) {
                        fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 128) != 0) {
                        scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i19 &= -29360129;
                    } else {
                        scrimColor = j12;
                    }
                    if (i16 != 0) {
                        function2M1038getLambda2$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1038getLambda2$material3_release();
                    } else {
                        function2M1038getLambda2$material3_release = function2;
                    }
                    j13 = containerColor;
                    j14 = jM1014contentColorForek8zF_U;
                    f11 = fM923getElevationD9Ej5fM;
                    j15 = scrimColor;
                    sheetState3 = sheetStateRememberModalBottomSheetState;
                    shape3 = expandedShape;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                        i19 &= -897;
                    } else {
                        sheetStateRememberModalBottomSheetState = sheetState2;
                    }
                    if ((i11 & 8) != 0) {
                        expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                        i19 &= -7169;
                    } else {
                        expandedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i19 &= -57345;
                    } else {
                        containerColor = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i19 >> 12) & 14);
                        i19 &= -458753;
                    }
                    if (i13 != 0) {
                        fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 128) != 0) {
                        scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i19 &= -29360129;
                    } else {
                        scrimColor = j12;
                    }
                    if (i16 != 0) {
                        function2M1038getLambda2$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1038getLambda2$material3_release();
                    } else {
                        function2M1038getLambda2$material3_release = function2;
                    }
                    j13 = containerColor;
                    j14 = jM1014contentColorForek8zF_U;
                    f11 = fM923getElevationD9Ej5fM;
                    j15 = scrimColor;
                    sheetState3 = sheetStateRememberModalBottomSheetState;
                    shape3 = expandedShape;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1311611302, i19, -1, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:281)");
                }
                composer2 = composerStartRestartGroup;
                m1169ModalBottomSheetEP0qOeE(onDismissRequest, modifier2, sheetState3, shape3, j13, j14, f11, j15, function2M1038getLambda2$material3_release, null, content, composer2, (i19 & 14) | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (i19 & 3670016) | (i19 & 29360128) | (i19 & 234881024), (i19 >> 27) & 14, 512);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                sheetState4 = sheetState3;
                shape4 = shape3;
                j16 = j13;
                j17 = j14;
                f12 = f11;
                j18 = j15;
                function3 = function2M1038getLambda2$material3_release;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                        i19 &= -897;
                    } else {
                        sheetStateRememberModalBottomSheetState = sheetState2;
                    }
                    if ((i11 & 8) != 0) {
                        expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                        i19 &= -7169;
                    } else {
                        expandedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i19 &= -57345;
                    } else {
                        containerColor = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i19 >> 12) & 14);
                        i19 &= -458753;
                    }
                    if (i13 != 0) {
                        fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 128) != 0) {
                        scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i19 &= -29360129;
                    } else {
                        scrimColor = j12;
                    }
                    if (i16 != 0) {
                        function2M1038getLambda2$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1038getLambda2$material3_release();
                    } else {
                        function2M1038getLambda2$material3_release = function2;
                    }
                    j13 = containerColor;
                    j14 = jM1014contentColorForek8zF_U;
                    f11 = fM923getElevationD9Ej5fM;
                    j15 = scrimColor;
                    sheetState3 = sheetStateRememberModalBottomSheetState;
                    shape3 = expandedShape;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                        i19 &= -897;
                    } else {
                        sheetStateRememberModalBottomSheetState = sheetState2;
                    }
                    if ((i11 & 8) != 0) {
                        expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                        i19 &= -7169;
                    } else {
                        expandedShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i19 &= -57345;
                    } else {
                        containerColor = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i19 >> 12) & 14);
                        i19 &= -458753;
                    }
                    if (i13 != 0) {
                        fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                    } else {
                        fM923getElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 128) != 0) {
                        scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i19 &= -29360129;
                    } else {
                        scrimColor = j12;
                    }
                    if (i16 != 0) {
                        function2M1038getLambda2$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1038getLambda2$material3_release();
                    } else {
                        function2M1038getLambda2$material3_release = function2;
                    }
                    j13 = containerColor;
                    j14 = jM1014contentColorForek8zF_U;
                    f11 = fM923getElevationD9Ej5fM;
                    j15 = scrimColor;
                    sheetState3 = sheetStateRememberModalBottomSheetState;
                    shape3 = expandedShape;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1311611302, i19, -1, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:281)");
                }
                composer2 = composerStartRestartGroup;
                m1169ModalBottomSheetEP0qOeE(onDismissRequest, modifier2, sheetState3, shape3, j13, j14, f11, j15, function2M1038getLambda2$material3_release, null, content, composer2, (i19 & 14) | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (i19 & 3670016) | (i19 & 29360128) | (i19 & 234881024), (i19 >> 27) & 14, 512);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                sheetState4 = sheetState3;
                shape4 = shape3;
                j16 = j13;
                j17 = j14;
                f12 = f11;
                j18 = j15;
                function3 = function2M1038getLambda2$material3_release;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(onDismissRequest, modifier3, sheetState4, shape4, j16, j17, f12, j18, function3, content, i10, i11));
        }
        i18 = 805306368;
        i15 |= i18;
        i19 = i15;
        if ((i19 & 1533916891) == 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 4) != 0) {
                    sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                    i19 &= -897;
                } else {
                    sheetStateRememberModalBottomSheetState = sheetState2;
                }
                if ((i11 & 8) != 0) {
                    expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                    i19 &= -7169;
                } else {
                    expandedShape = shape2;
                }
                if ((i11 & 16) != 0) {
                    containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i19 &= -57345;
                } else {
                    containerColor = j10;
                }
                if ((i11 & 32) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i19 >> 12) & 14);
                    i19 &= -458753;
                }
                if (i13 != 0) {
                    fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                } else {
                    fM923getElevationD9Ej5fM = f10;
                }
                if ((i11 & 128) != 0) {
                    scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    i19 &= -29360129;
                } else {
                    scrimColor = j12;
                }
                if (i16 != 0) {
                    function2M1038getLambda2$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1038getLambda2$material3_release();
                } else {
                    function2M1038getLambda2$material3_release = function2;
                }
                j13 = containerColor;
                j14 = jM1014contentColorForek8zF_U;
                f11 = fM923getElevationD9Ej5fM;
                j15 = scrimColor;
                sheetState3 = sheetStateRememberModalBottomSheetState;
                shape3 = expandedShape;
            } else {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 4) != 0) {
                    sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                    i19 &= -897;
                } else {
                    sheetStateRememberModalBottomSheetState = sheetState2;
                }
                if ((i11 & 8) != 0) {
                    expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                    i19 &= -7169;
                } else {
                    expandedShape = shape2;
                }
                if ((i11 & 16) != 0) {
                    containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i19 &= -57345;
                } else {
                    containerColor = j10;
                }
                if ((i11 & 32) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i19 >> 12) & 14);
                    i19 &= -458753;
                }
                if (i13 != 0) {
                    fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                } else {
                    fM923getElevationD9Ej5fM = f10;
                }
                if ((i11 & 128) != 0) {
                    scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    i19 &= -29360129;
                } else {
                    scrimColor = j12;
                }
                if (i16 != 0) {
                    function2M1038getLambda2$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1038getLambda2$material3_release();
                } else {
                    function2M1038getLambda2$material3_release = function2;
                }
                j13 = containerColor;
                j14 = jM1014contentColorForek8zF_U;
                f11 = fM923getElevationD9Ej5fM;
                j15 = scrimColor;
                sheetState3 = sheetStateRememberModalBottomSheetState;
                shape3 = expandedShape;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1311611302, i19, -1, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:281)");
            }
            composer2 = composerStartRestartGroup;
            m1169ModalBottomSheetEP0qOeE(onDismissRequest, modifier2, sheetState3, shape3, j13, j14, f11, j15, function2M1038getLambda2$material3_release, null, content, composer2, (i19 & 14) | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (i19 & 3670016) | (i19 & 29360128) | (i19 & 234881024), (i19 >> 27) & 14, 512);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            sheetState4 = sheetState3;
            shape4 = shape3;
            j16 = j13;
            j17 = j14;
            f12 = f11;
            j18 = j15;
            function3 = function2M1038getLambda2$material3_release;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 4) != 0) {
                    sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                    i19 &= -897;
                } else {
                    sheetStateRememberModalBottomSheetState = sheetState2;
                }
                if ((i11 & 8) != 0) {
                    expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                    i19 &= -7169;
                } else {
                    expandedShape = shape2;
                }
                if ((i11 & 16) != 0) {
                    containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i19 &= -57345;
                } else {
                    containerColor = j10;
                }
                if ((i11 & 32) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i19 >> 12) & 14);
                    i19 &= -458753;
                }
                if (i13 != 0) {
                    fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                } else {
                    fM923getElevationD9Ej5fM = f10;
                }
                if ((i11 & 128) != 0) {
                    scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    i19 &= -29360129;
                } else {
                    scrimColor = j12;
                }
                if (i16 != 0) {
                    function2M1038getLambda2$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1038getLambda2$material3_release();
                } else {
                    function2M1038getLambda2$material3_release = function2;
                }
                j13 = containerColor;
                j14 = jM1014contentColorForek8zF_U;
                f11 = fM923getElevationD9Ej5fM;
                j15 = scrimColor;
                sheetState3 = sheetStateRememberModalBottomSheetState;
                shape3 = expandedShape;
            } else {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 4) != 0) {
                    sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                    i19 &= -897;
                } else {
                    sheetStateRememberModalBottomSheetState = sheetState2;
                }
                if ((i11 & 8) != 0) {
                    expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                    i19 &= -7169;
                } else {
                    expandedShape = shape2;
                }
                if ((i11 & 16) != 0) {
                    containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i19 &= -57345;
                } else {
                    containerColor = j10;
                }
                if ((i11 & 32) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i19 >> 12) & 14);
                    i19 &= -458753;
                }
                if (i13 != 0) {
                    fM923getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m923getElevationD9Ej5fM();
                } else {
                    fM923getElevationD9Ej5fM = f10;
                }
                if ((i11 & 128) != 0) {
                    scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    i19 &= -29360129;
                } else {
                    scrimColor = j12;
                }
                if (i16 != 0) {
                    function2M1038getLambda2$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1038getLambda2$material3_release();
                } else {
                    function2M1038getLambda2$material3_release = function2;
                }
                j13 = containerColor;
                j14 = jM1014contentColorForek8zF_U;
                f11 = fM923getElevationD9Ej5fM;
                j15 = scrimColor;
                sheetState3 = sheetStateRememberModalBottomSheetState;
                shape3 = expandedShape;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1311611302, i19, -1, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:281)");
            }
            composer2 = composerStartRestartGroup;
            m1169ModalBottomSheetEP0qOeE(onDismissRequest, modifier2, sheetState3, shape3, j13, j14, f11, j15, function2M1038getLambda2$material3_release, null, content, composer2, (i19 & 14) | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (i19 & 3670016) | (i19 & 29360128) | (i19 & 234881024), (i19 >> 27) & 14, 512);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            sheetState4 = sheetState3;
            shape4 = shape3;
            j16 = j13;
            j17 = j14;
            f12 = f11;
            j18 = j15;
            function3 = function2M1038getLambda2$material3_release;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new e(onDismissRequest, modifier3, sheetState4, shape4, j16, j17, f12, j18, function3, content, i10, i11));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ModalBottomSheetPopup(@NotNull Function0<Unit> onDismissRequest, @NotNull WindowInsets windowInsets, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-627217336);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(onDismissRequest) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(windowInsets) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-627217336, i12, -1, "androidx.compose.material3.ModalBottomSheetPopup (ModalBottomSheet.android.kt:415)");
            }
            View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            UUID id = (UUID) RememberSaveableKt.m2165rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) l.f10696p0, composerStartRestartGroup, 3080, 6);
            CompositionContext compositionContextRememberCompositionContext = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, composerStartRestartGroup, (i12 >> 6) & 14);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Object obj = objRememberedValue;
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Intrinsics.checkNotNullExpressionValue(id, "id");
                l0.g2 g2Var = new l0.g2(onDismissRequest, view, id);
                g2Var.setCustomContent(compositionContextRememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(861223805, true, new m(windowInsets, stateRememberUpdatedState)));
                composerStartRestartGroup.updateRememberedValue(g2Var);
                obj = g2Var;
            }
            composerStartRestartGroup.endReplaceableGroup();
            l0.g2 g2Var2 = (l0.g2) obj;
            EffectsKt.DisposableEffect(g2Var2, new j(g2Var2), composerStartRestartGroup, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new k(onDismissRequest, windowInsets, content, i10));
    }

    public static final AnchorChangeHandler access$ModalBottomSheetAnchorChangeHandler(final SheetState sheetState, final Function2 function2, final Function1 function1) {
        return new AnchorChangeHandler<SheetValue>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetAnchorChangeHandler$1

            /* JADX INFO: compiled from: ModalBottomSheet.android.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[SheetValue.values().length];
                    try {
                        iArr[SheetValue.Hidden.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[SheetValue.Expanded.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.compose.material3.AnchorChangeHandler
            public final void onAnchorsChanged(SheetValue sheetValue, Map<SheetValue, Float> previousAnchors, Map<SheetValue, Float> newAnchors) {
                SheetValue sheetValue2;
                SheetValue previousTarget = sheetValue;
                Intrinsics.checkNotNullParameter(previousTarget, "previousTarget");
                Intrinsics.checkNotNullParameter(previousAnchors, "previousAnchors");
                Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
                Float f6 = previousAnchors.get(previousTarget);
                int i10 = WhenMappings.$EnumSwitchMapping$0[previousTarget.ordinal()];
                if (i10 == 1) {
                    sheetValue2 = SheetValue.Hidden;
                } else {
                    if (i10 != 2 && i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sheetValue2 = SheetValue.PartiallyExpanded;
                    if (!newAnchors.containsKey(sheetValue2)) {
                        sheetValue2 = SheetValue.Expanded;
                        if (!newAnchors.containsKey(sheetValue2)) {
                            sheetValue2 = SheetValue.Hidden;
                        }
                    }
                }
                if (Intrinsics.areEqual(((Number) bk.q.getValue(newAnchors, sheetValue2)).floatValue(), f6)) {
                    return;
                }
                SheetState sheetState2 = sheetState;
                if (!sheetState2.getSwipeableState$material3_release().isAnimationRunning() && !previousAnchors.isEmpty()) {
                    function1.invoke(sheetValue2);
                } else {
                    function2.invoke(sheetValue2, Float.valueOf(sheetState2.getSwipeableState$material3_release().getLastVelocity()));
                }
            }
        };
    }

    public static final Function2 access$ModalBottomSheetPopup$lambda$5(State state) {
        return (Function2) state.getValue();
    }

    /* JADX INFO: renamed from: access$Scrim-3J-VO9M, reason: not valid java name */
    public static final void m1171access$Scrim3JVO9M(long j10, Function0 function0, boolean z10, Composer composer, int i10) {
        int i11;
        Modifier modifierClearAndSetSemantics;
        Composer composerStartRestartGroup = composer.startRestartGroup(1053897700);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1053897700, i11, -1, "androidx.compose.material3.Scrim (ModalBottomSheet.android.kt:321)");
            }
            if (j10 != Color.INSTANCE.m2544getUnspecified0d7_KjU()) {
                State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z10 ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                composerStartRestartGroup.startReplaceableGroup(-1858721447);
                if (z10) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    boolean zChanged = composerStartRestartGroup.changed(function0);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new l0.j2(function0, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifierClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(SuspendingPointerInputFilterKt.pointerInput(companion, function0, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue), l0.k2.f82657p0);
                } else {
                    modifierClearAndSetSemantics = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifierClearAndSetSemantics);
                Color colorM2498boximpl = Color.m2498boximpl(j10);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                boolean zChanged2 = composerStartRestartGroup.changed(colorM2498boximpl) | composerStartRestartGroup.changed(stateAnimateFloatAsState);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new l0.h2(j10, stateAnimateFloatAsState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierThen, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new l0.i2(j10, function0, z10, i10));
    }

    public static final /* synthetic */ Object access$modalBottomSheetSwipeable$suspendConversion0(Function2 function2, CoroutineScope coroutineScope, float f6, Continuation continuation) {
        function2.invoke(coroutineScope, Boxing.boxFloat(f6));
        return Unit.INSTANCE;
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    public static final SheetState rememberModalBottomSheetState(boolean z10, @Nullable Function1<? super SheetValue, Boolean> function1, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-1261794383);
        if ((i11 & 1) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i11 & 2) != 0) {
            function1 = n.f10701p0;
        }
        Function1<? super SheetValue, Boolean> function2 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1261794383, i10, -1, "androidx.compose.material3.rememberModalBottomSheetState (ModalBottomSheet.android.kt:315)");
        }
        SheetState sheetStateRememberSheetState = SheetDefaultsKt.rememberSheetState(z11, function2, SheetValue.Hidden, false, composer, (i10 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | (i10 & 112), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return sheetStateRememberSheetState;
    }
}
