package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.vierge.bluetoothlibrary.BluetoothState;
import g1.f;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidPopup.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aX\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aF\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\r\u0010\u0010\u001a*\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\tH\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\f\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0000\u001a\u001a\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00152\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0011\" \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\"²\u0006\u0017\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\t8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/unit/IntOffset;", TypedValues.CycleType.S_WAVE_OFFSET, "Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/window/PopupProperties;", LogKeysKt.PROPERTIES, "Landroidx/compose/runtime/Composable;", "content", "Popup-K5zGePQ", "(Landroidx/compose/ui/Alignment;JLkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Popup", "Landroidx/compose/ui/window/PopupPositionProvider;", "popupPositionProvider", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "", LogKeysKt.TAG, "PopupTestTag", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroid/view/View;", "", "isFlagSecureEnabled", "view", "testTag", "isPopupLayout", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalPopupTestTag", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalPopupTestTag", "currentContent", "ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,833:1\n50#2:834\n49#2:835\n25#2:846\n456#2,8:864\n464#2,6:878\n456#2,8:896\n464#2,6:910\n1097#3,6:836\n1097#3,6:847\n76#4:842\n76#4:843\n76#4:844\n76#4:845\n78#5,11:853\n91#5:884\n78#5,11:885\n91#5:916\n4144#6,6:872\n4144#6,6:904\n81#7:917\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt\n*L\n194#1:834\n194#1:835\n235#1:846\n309#1:864,8\n309#1:878,6\n341#1:896,8\n341#1:910,6\n194#1:836,6\n235#1:847,6\n228#1:842\n229#1:843\n230#1:844\n231#1:845\n309#1:853,11\n309#1:884\n341#1:885,11\n341#1:916\n309#1:872,6\n341#1:904,6\n233#1:917\n*E\n"})
public final class AndroidPopup_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<String> f18411a = CompositionLocalKt.compositionLocalOf$default(null, a.f18415p0, 1, null);

    /* JADX INFO: compiled from: AndroidPopup.android.kt */
    public static final class a extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f18415p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }

    /* JADX INFO: compiled from: AndroidPopup.android.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Alignment f18416p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f18417q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f18418r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ PopupProperties f18419s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f18420t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f18421u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Alignment alignment, long j10, Function0<Unit> function0, PopupProperties popupProperties, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f18416p0 = alignment;
            this.f18417q0 = j10;
            this.f18418r0 = function0;
            this.f18419s0 = popupProperties;
            this.f18420t0 = function2;
            this.f18421u0 = i10;
            this.v0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AndroidPopup_androidKt.m4627PopupK5zGePQ(this.f18416p0, this.f18417q0, this.f18418r0, this.f18419s0, this.f18420t0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f18421u0 | 1), this.v0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidPopup.android.kt */
    @SourceDebugExtension({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,833:1\n63#2,5:834\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$2\n*L\n271#1:834,5\n*E\n"})
    public static final class c extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ PopupLayout f18422p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f18423q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ PopupProperties f18424r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ String f18425s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ LayoutDirection f18426t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PopupLayout popupLayout, Function0<Unit> function0, PopupProperties popupProperties, String str, LayoutDirection layoutDirection) {
            super(1);
            this.f18422p0 = popupLayout;
            this.f18423q0 = function0;
            this.f18424r0 = popupProperties;
            this.f18425s0 = str;
            this.f18426t0 = layoutDirection;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final PopupLayout popupLayout = this.f18422p0;
            popupLayout.show();
            popupLayout.updateParameters(this.f18423q0, this.f18424r0, this.f18425s0, this.f18426t0);
            return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    PopupLayout popupLayout2 = popupLayout;
                    popupLayout2.disposeComposition();
                    popupLayout2.dismiss();
                }
            };
        }
    }

    /* JADX INFO: compiled from: AndroidPopup.android.kt */
    public static final class d extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ PopupLayout f18427p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f18428q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ PopupProperties f18429r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ String f18430s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ LayoutDirection f18431t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(PopupLayout popupLayout, Function0<Unit> function0, PopupProperties popupProperties, String str, LayoutDirection layoutDirection) {
            super(0);
            this.f18427p0 = popupLayout;
            this.f18428q0 = function0;
            this.f18429r0 = popupProperties;
            this.f18430s0 = str;
            this.f18431t0 = layoutDirection;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f18427p0.updateParameters(this.f18428q0, this.f18429r0, this.f18430s0, this.f18431t0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidPopup.android.kt */
    @SourceDebugExtension({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$4\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,833:1\n63#2,5:834\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$4\n*L\n290#1:834,5\n*E\n"})
    public static final class e extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ PopupLayout f18432p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ PopupPositionProvider f18433q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(PopupLayout popupLayout, PopupPositionProvider popupPositionProvider) {
            super(1);
            this.f18432p0 = popupLayout;
            this.f18433q0 = popupPositionProvider;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            PopupLayout popupLayout = this.f18432p0;
            popupLayout.setPositionProvider(this.f18433q0);
            popupLayout.updatePosition();
            return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                }
            };
        }
    }

    /* JADX INFO: compiled from: AndroidPopup.android.kt */
    @DebugMetadata(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5", f = "AndroidPopup.android.kt", i = {0}, l = {301}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f18434p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f18435q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ PopupLayout f18436r0;

        /* JADX INFO: compiled from: AndroidPopup.android.kt */
        public static final class a extends Lambda implements Function1<Long, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f18437p0 = new a(1);

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Long l6) {
                l6.longValue();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(PopupLayout popupLayout, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f18436r0 = popupLayout;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            f fVar = new f(this.f18436r0, continuation);
            fVar.f18435q0 = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x002b  */
        /* JADX WARN: Code duplicated, block: B:13:0x0037 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0035 -> B:14:0x0038). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = ek.a.getCOROUTINE_SUSPENDED()
                int r1 = r4.f18434p0
                r2 = 1
                if (r1 == 0) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r1 = r4.f18435q0
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.ResultKt.throwOnFailure(r5)
                r5 = r4
                goto L38
            L14:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1c:
                kotlin.ResultKt.throwOnFailure(r5)
                java.lang.Object r5 = r4.f18435q0
                kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
                r1 = r5
                r5 = r4
            L25:
                boolean r3 = kotlinx.coroutines.CoroutineScopeKt.isActive(r1)
                if (r3 == 0) goto L3e
                r5.f18435q0 = r1
                r5.f18434p0 = r2
                androidx.compose.ui.window.AndroidPopup_androidKt$f$a r3 = androidx.compose.ui.window.AndroidPopup_androidKt.f.a.f18437p0
                java.lang.Object r3 = androidx.compose.ui.platform.InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(r3, r5)
                if (r3 != r0) goto L38
                return r0
            L38:
                androidx.compose.ui.window.PopupLayout r3 = r5.f18436r0
                r3.pollForLocationOnScreenChange()
                goto L25
            L3e:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: AndroidPopup.android.kt */
    public static final class g extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ PopupLayout f18438p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(PopupLayout popupLayout) {
            super(1);
            this.f18438p0 = popupLayout;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates childCoordinates = layoutCoordinates;
            Intrinsics.checkNotNullParameter(childCoordinates, "childCoordinates");
            LayoutCoordinates parentLayoutCoordinates = childCoordinates.getParentLayoutCoordinates();
            Intrinsics.checkNotNull(parentLayoutCoordinates);
            this.f18438p0.updateParentLayoutCoordinates(parentLayoutCoordinates);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidPopup.android.kt */
    public static final class h implements MeasurePolicy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PopupLayout f18439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LayoutDirection f18440b;

        /* JADX INFO: compiled from: AndroidPopup.android.kt */
        public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f18441p0 = new a(1);

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope layout = placementScope;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                return Unit.INSTANCE;
            }
        }

        public h(PopupLayout popupLayout, LayoutDirection layoutDirection) {
            this.f18439a = popupLayout;
            this.f18440b = layoutDirection;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.a(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.b(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final MeasureResult mo113measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> list, long j10) {
            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
            Intrinsics.checkNotNullParameter(list, "<anonymous parameter 0>");
            this.f18439a.setParentLayoutDirection(this.f18440b);
            return MeasureScope.CC.q(Layout, 0, 0, null, a.f18441p0, 4, null);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.c(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.d(this, intrinsicMeasureScope, list, i10);
        }
    }

    /* JADX INFO: compiled from: AndroidPopup.android.kt */
    public static final class i extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ PopupPositionProvider f18442p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f18443q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ PopupProperties f18444r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f18445s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f18446t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f18447u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(PopupPositionProvider popupPositionProvider, Function0<Unit> function0, PopupProperties popupProperties, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f18442p0 = popupPositionProvider;
            this.f18443q0 = function0;
            this.f18444r0 = popupProperties;
            this.f18445s0 = function2;
            this.f18446t0 = i10;
            this.f18447u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AndroidPopup_androidKt.Popup(this.f18442p0, this.f18443q0, this.f18444r0, this.f18445s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f18446t0 | 1), this.f18447u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidPopup.android.kt */
    public static final class j extends Lambda implements Function0<UUID> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final j f18448p0 = new j(0);

        @Override // kotlin.jvm.functions.Function0
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* JADX INFO: compiled from: AndroidPopup.android.kt */
    @SourceDebugExtension({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$popupLayout$1$1$1\n+ 2 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,833:1\n341#2:834\n368#2:867\n78#3,11:835\n91#3:866\n456#4,8:846\n464#4,6:860\n4144#5,6:854\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$popupLayout$1$1$1\n*L\n246#1:834\n246#1:867\n246#1:835,11\n246#1:866\n246#1:846,8\n246#1:860,6\n246#1:854,6\n*E\n"})
    public static final class k extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ PopupLayout f18449p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ State<Function2<Composer, Integer, Unit>> f18450q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(PopupLayout popupLayout, State<? extends Function2<? super Composer, ? super Integer, Unit>> state) {
            super(2);
            this.f18449p0 = popupLayout;
            this.f18450q0 = state;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1302892335, iIntValue, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:244)");
                }
                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, androidx.compose.ui.window.c.f18480p0, 1, null);
                PopupLayout popupLayout = this.f18449p0;
                Modifier modifierAlpha = AlphaKt.alpha(OnRemeasuredModifierKt.onSizeChanged(modifierSemantics$default, new androidx.compose.ui.window.d(popupLayout)), popupLayout.getCanCalculatePosition() ? 1.0f : 0.0f);
                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, 606497925, true, new androidx.compose.ui.window.e(this.f18450q0));
                composer2.startReplaceableGroup(1406149896);
                AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = new MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                        return f.a(this, intrinsicMeasureScope, list, i10);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                        return f.b(this, intrinsicMeasureScope, list, i10);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @NotNull
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final MeasureResult mo113measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j10) {
                        int i10;
                        int i11;
                        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                        int size = measurables.size();
                        if (size == 0) {
                            return MeasureScope.CC.q(Layout, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$1
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                    invoke2(placementScope);
                                    return Unit.INSTANCE;
                                }
                            }, 4, null);
                        }
                        int i12 = 0;
                        if (size == 1) {
                            final Placeable placeableMo3575measureBRTryo0 = measurables.get(0).mo3575measureBRTryo0(j10);
                            return MeasureScope.CC.q(Layout, placeableMo3575measureBRTryo0.getWidth(), placeableMo3575measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$2
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                    invoke2(placementScope);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                    Placeable.PlacementScope.placeRelative$default(layout, placeableMo3575measureBRTryo0, 0, 0, 0.0f, 4, null);
                                }
                            }, 4, null);
                        }
                        final ArrayList arrayList = new ArrayList(measurables.size());
                        int size2 = measurables.size();
                        for (int i13 = 0; i13 < size2; i13++) {
                            arrayList.add(measurables.get(i13).mo3575measureBRTryo0(j10));
                        }
                        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                        if (lastIndex >= 0) {
                            int iMax = 0;
                            int iMax2 = 0;
                            while (true) {
                                Placeable placeable = (Placeable) arrayList.get(i12);
                                iMax = Math.max(iMax, placeable.getWidth());
                                iMax2 = Math.max(iMax2, placeable.getHeight());
                                if (i12 == lastIndex) {
                                    break;
                                }
                                i12++;
                            }
                            i10 = iMax;
                            i11 = iMax2;
                        } else {
                            i10 = 0;
                            i11 = 0;
                        }
                        return MeasureScope.CC.q(Layout, i10, i11, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                List<Placeable> list = arrayList;
                                int lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(list);
                                if (lastIndex2 < 0) {
                                    return;
                                }
                                int i14 = 0;
                                while (true) {
                                    Placeable.PlacementScope.placeRelative$default(layout, list.get(i14), 0, 0, 0.0f, 4, null);
                                    if (i14 == lastIndex2) {
                                        return;
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                        }, 4, null);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                        return f.c(this, intrinsicMeasureScope, list, i10);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                        return f.d(this, intrinsicMeasureScope, list, i10);
                    }
                };
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAlpha);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                Updater.m2081setimpl(composerM2074constructorimpl, androidPopup_androidKt$SimpleStack$1, companion.getSetMeasurePolicy());
                Updater.m2081setimpl(composerM2074constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
                }
                ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                composableLambda.invoke(composer2, 6);
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

    /* JADX INFO: compiled from: AndroidPopup.android.kt */
    public static final class l extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f18451p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f18452q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f18453r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(String str, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f18451p0 = str;
            this.f18452q0 = function2;
            this.f18453r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f18453r0 | 1);
            AndroidPopup_androidKt.PopupTestTag(this.f18451p0, this.f18452q0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:64:0x0126  */
    /* JADX WARN: Code duplicated, block: B:65:0x016a  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:75:0x0208  */
    /* JADX WARN: Code duplicated, block: B:77:0x0216  */
    /* JADX WARN: Code duplicated, block: B:80:0x023d  */
    /* JADX WARN: Code duplicated, block: B:85:0x024b  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Popup(@NotNull PopupPositionProvider popupPositionProvider, @Nullable Function0<Unit> function0, @Nullable PopupProperties popupProperties, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Function0<Unit> function1;
        int i13;
        PopupProperties popupProperties2;
        int i14;
        int i15;
        int i16;
        Function0<Unit> function2;
        PopupProperties popupProperties3;
        View view;
        Density density;
        String str;
        LayoutDirection layoutDirection;
        CompositionContext compositionContextRememberCompositionContext;
        State stateRememberUpdatedState;
        UUID popupId;
        Object objRememberedValue;
        LayoutDirection layoutDirection2;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM2074constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Function0<Unit> function3;
        PopupProperties popupProperties4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(popupPositionProvider, "popupPositionProvider");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-830247068);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(popupPositionProvider) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & 112) == 0) {
                function1 = function0;
                i12 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    popupProperties2 = popupProperties;
                    if (composerStartRestartGroup.changed(popupProperties2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i11 & 8) != 0) {
                    i12 |= 3072;
                } else if ((i10 & 7168) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                i16 = i12;
                if ((i16 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                    if (i17 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if (i13 != 0) {
                        popupProperties3 = new PopupProperties(false, false, false, null, false, false, 63, null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-830247068, i16, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:221)");
                    }
                    view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    str = (String) composerStartRestartGroup.consume(f18411a);
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    compositionContextRememberCompositionContext = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, composerStartRestartGroup, (i16 >> 9) & 14);
                    popupId = (UUID) RememberSaveableKt.m2165rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) j.f18448p0, composerStartRestartGroup, 3080, 6);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        Intrinsics.checkNotNullExpressionValue(popupId, "popupId");
                        layoutDirection2 = layoutDirection;
                        PopupLayout popupLayout = new PopupLayout(function2, popupProperties3, str, view, density, popupPositionProvider, popupId, null, 128, null);
                        popupLayout.setContent(compositionContextRememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(1302892335, true, new k(popupLayout, stateRememberUpdatedState)));
                        composerStartRestartGroup.updateRememberedValue(popupLayout);
                        objRememberedValue = popupLayout;
                    } else {
                        layoutDirection2 = layoutDirection;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    PopupLayout popupLayout2 = (PopupLayout) objRememberedValue;
                    Function0<Unit> function4 = function2;
                    PopupProperties popupProperties5 = popupProperties3;
                    LayoutDirection layoutDirection3 = layoutDirection2;
                    EffectsKt.DisposableEffect(popupLayout2, new c(popupLayout2, function4, popupProperties5, str, layoutDirection3), composerStartRestartGroup, 8);
                    EffectsKt.SideEffect(new d(popupLayout2, function4, popupProperties5, str, layoutDirection3), composerStartRestartGroup, 0);
                    EffectsKt.DisposableEffect(popupPositionProvider, new e(popupLayout2, popupPositionProvider), composerStartRestartGroup, i16 & 14);
                    EffectsKt.LaunchedEffect(popupLayout2, new f(popupLayout2, 0), composerStartRestartGroup, 72);
                    Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.INSTANCE, new g(popupLayout2));
                    h hVar = new h(popupLayout2, layoutDirection2);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    constructor = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOnGloballyPositioned);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl, hVar, companion.getSetMeasurePolicy());
                    Updater.m2081setimpl(composerM2074constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function3 = function2;
                    popupProperties4 = popupProperties3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    function3 = function1;
                    popupProperties4 = popupProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new i(popupPositionProvider, function3, popupProperties4, content, i10, i11));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            popupProperties2 = popupProperties;
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            i16 = i12;
            if ((i16 & 5851) == 1170) {
                if (i17 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                if (i13 != 0) {
                    popupProperties3 = new PopupProperties(false, false, false, null, false, false, 63, null);
                } else {
                    popupProperties3 = popupProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-830247068, i16, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:221)");
                }
                view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                str = (String) composerStartRestartGroup.consume(f18411a);
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                compositionContextRememberCompositionContext = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, composerStartRestartGroup, (i16 >> 9) & 14);
                popupId = (UUID) RememberSaveableKt.m2165rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) j.f18448p0, composerStartRestartGroup, 3080, 6);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Intrinsics.checkNotNullExpressionValue(popupId, "popupId");
                    layoutDirection2 = layoutDirection;
                    PopupLayout popupLayout3 = new PopupLayout(function2, popupProperties3, str, view, density, popupPositionProvider, popupId, null, 128, null);
                    popupLayout3.setContent(compositionContextRememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(1302892335, true, new k(popupLayout3, stateRememberUpdatedState)));
                    composerStartRestartGroup.updateRememberedValue(popupLayout3);
                    objRememberedValue = popupLayout3;
                } else {
                    layoutDirection2 = layoutDirection;
                }
                composerStartRestartGroup.endReplaceableGroup();
                PopupLayout popupLayout4 = (PopupLayout) objRememberedValue;
                Function0<Unit> function5 = function2;
                PopupProperties popupProperties6 = popupProperties3;
                LayoutDirection layoutDirection4 = layoutDirection2;
                EffectsKt.DisposableEffect(popupLayout4, new c(popupLayout4, function5, popupProperties6, str, layoutDirection4), composerStartRestartGroup, 8);
                EffectsKt.SideEffect(new d(popupLayout4, function5, popupProperties6, str, layoutDirection4), composerStartRestartGroup, 0);
                EffectsKt.DisposableEffect(popupPositionProvider, new e(popupLayout4, popupPositionProvider), composerStartRestartGroup, i16 & 14);
                EffectsKt.LaunchedEffect(popupLayout4, new f(popupLayout4, 0), composerStartRestartGroup, 72);
                Modifier modifierOnGloballyPositioned2 = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.INSTANCE, new g(popupLayout4));
                h hVar2 = new h(popupLayout4, layoutDirection2);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOnGloballyPositioned2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl, hVar2, companion2.getSetMeasurePolicy());
                Updater.m2081setimpl(composerM2074constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
                }
                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function2;
                popupProperties4 = popupProperties3;
            } else {
                if (i17 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                if (i13 != 0) {
                    popupProperties3 = new PopupProperties(false, false, false, null, false, false, 63, null);
                } else {
                    popupProperties3 = popupProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-830247068, i16, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:221)");
                }
                view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                str = (String) composerStartRestartGroup.consume(f18411a);
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                compositionContextRememberCompositionContext = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, composerStartRestartGroup, (i16 >> 9) & 14);
                popupId = (UUID) RememberSaveableKt.m2165rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) j.f18448p0, composerStartRestartGroup, 3080, 6);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Intrinsics.checkNotNullExpressionValue(popupId, "popupId");
                    layoutDirection2 = layoutDirection;
                    PopupLayout popupLayout5 = new PopupLayout(function2, popupProperties3, str, view, density, popupPositionProvider, popupId, null, 128, null);
                    popupLayout5.setContent(compositionContextRememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(1302892335, true, new k(popupLayout5, stateRememberUpdatedState)));
                    composerStartRestartGroup.updateRememberedValue(popupLayout5);
                    objRememberedValue = popupLayout5;
                } else {
                    layoutDirection2 = layoutDirection;
                }
                composerStartRestartGroup.endReplaceableGroup();
                PopupLayout popupLayout6 = (PopupLayout) objRememberedValue;
                Function0<Unit> function6 = function2;
                PopupProperties popupProperties7 = popupProperties3;
                LayoutDirection layoutDirection5 = layoutDirection2;
                EffectsKt.DisposableEffect(popupLayout6, new c(popupLayout6, function6, popupProperties7, str, layoutDirection5), composerStartRestartGroup, 8);
                EffectsKt.SideEffect(new d(popupLayout6, function6, popupProperties7, str, layoutDirection5), composerStartRestartGroup, 0);
                EffectsKt.DisposableEffect(popupPositionProvider, new e(popupLayout6, popupPositionProvider), composerStartRestartGroup, i16 & 14);
                EffectsKt.LaunchedEffect(popupLayout6, new f(popupLayout6, 0), composerStartRestartGroup, 72);
                Modifier modifierOnGloballyPositioned3 = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.INSTANCE, new g(popupLayout6));
                h hVar3 = new h(popupLayout6, layoutDirection2);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOnGloballyPositioned3);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl, hVar3, companion3.getSetMeasurePolicy());
                Updater.m2081setimpl(composerM2074constructorimpl, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
                }
                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function2;
                popupProperties4 = popupProperties3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new i(popupPositionProvider, function3, popupProperties4, content, i10, i11));
        }
        i12 |= 48;
        function1 = function0;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                popupProperties2 = popupProperties;
                if (composerStartRestartGroup.changed(popupProperties2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            i16 = i12;
            if ((i16 & 5851) == 1170) {
                if (i17 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                if (i13 != 0) {
                    popupProperties3 = new PopupProperties(false, false, false, null, false, false, 63, null);
                } else {
                    popupProperties3 = popupProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-830247068, i16, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:221)");
                }
                view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                str = (String) composerStartRestartGroup.consume(f18411a);
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                compositionContextRememberCompositionContext = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, composerStartRestartGroup, (i16 >> 9) & 14);
                popupId = (UUID) RememberSaveableKt.m2165rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) j.f18448p0, composerStartRestartGroup, 3080, 6);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Intrinsics.checkNotNullExpressionValue(popupId, "popupId");
                    layoutDirection2 = layoutDirection;
                    PopupLayout popupLayout7 = new PopupLayout(function2, popupProperties3, str, view, density, popupPositionProvider, popupId, null, 128, null);
                    popupLayout7.setContent(compositionContextRememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(1302892335, true, new k(popupLayout7, stateRememberUpdatedState)));
                    composerStartRestartGroup.updateRememberedValue(popupLayout7);
                    objRememberedValue = popupLayout7;
                } else {
                    layoutDirection2 = layoutDirection;
                }
                composerStartRestartGroup.endReplaceableGroup();
                PopupLayout popupLayout8 = (PopupLayout) objRememberedValue;
                Function0<Unit> function7 = function2;
                PopupProperties popupProperties8 = popupProperties3;
                LayoutDirection layoutDirection6 = layoutDirection2;
                EffectsKt.DisposableEffect(popupLayout8, new c(popupLayout8, function7, popupProperties8, str, layoutDirection6), composerStartRestartGroup, 8);
                EffectsKt.SideEffect(new d(popupLayout8, function7, popupProperties8, str, layoutDirection6), composerStartRestartGroup, 0);
                EffectsKt.DisposableEffect(popupPositionProvider, new e(popupLayout8, popupPositionProvider), composerStartRestartGroup, i16 & 14);
                EffectsKt.LaunchedEffect(popupLayout8, new f(popupLayout8, 0), composerStartRestartGroup, 72);
                Modifier modifierOnGloballyPositioned4 = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.INSTANCE, new g(popupLayout8));
                h hVar4 = new h(popupLayout8, layoutDirection2);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                constructor = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierOnGloballyPositioned4);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl, hVar4, companion4.getSetMeasurePolicy());
                Updater.m2081setimpl(composerM2074constructorimpl, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
                }
                function3ModifierMaterializerOf4.invoke(SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function2;
                popupProperties4 = popupProperties3;
            } else {
                if (i17 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                if (i13 != 0) {
                    popupProperties3 = new PopupProperties(false, false, false, null, false, false, 63, null);
                } else {
                    popupProperties3 = popupProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-830247068, i16, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:221)");
                }
                view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                str = (String) composerStartRestartGroup.consume(f18411a);
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                compositionContextRememberCompositionContext = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, composerStartRestartGroup, (i16 >> 9) & 14);
                popupId = (UUID) RememberSaveableKt.m2165rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) j.f18448p0, composerStartRestartGroup, 3080, 6);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Intrinsics.checkNotNullExpressionValue(popupId, "popupId");
                    layoutDirection2 = layoutDirection;
                    PopupLayout popupLayout9 = new PopupLayout(function2, popupProperties3, str, view, density, popupPositionProvider, popupId, null, 128, null);
                    popupLayout9.setContent(compositionContextRememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(1302892335, true, new k(popupLayout9, stateRememberUpdatedState)));
                    composerStartRestartGroup.updateRememberedValue(popupLayout9);
                    objRememberedValue = popupLayout9;
                } else {
                    layoutDirection2 = layoutDirection;
                }
                composerStartRestartGroup.endReplaceableGroup();
                PopupLayout popupLayout10 = (PopupLayout) objRememberedValue;
                Function0<Unit> function8 = function2;
                PopupProperties popupProperties9 = popupProperties3;
                LayoutDirection layoutDirection7 = layoutDirection2;
                EffectsKt.DisposableEffect(popupLayout10, new c(popupLayout10, function8, popupProperties9, str, layoutDirection7), composerStartRestartGroup, 8);
                EffectsKt.SideEffect(new d(popupLayout10, function8, popupProperties9, str, layoutDirection7), composerStartRestartGroup, 0);
                EffectsKt.DisposableEffect(popupPositionProvider, new e(popupLayout10, popupPositionProvider), composerStartRestartGroup, i16 & 14);
                EffectsKt.LaunchedEffect(popupLayout10, new f(popupLayout10, 0), composerStartRestartGroup, 72);
                Modifier modifierOnGloballyPositioned5 = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.INSTANCE, new g(popupLayout10));
                h hVar5 = new h(popupLayout10, layoutDirection2);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                constructor = companion5.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierOnGloballyPositioned5);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl, hVar5, companion5.getSetMeasurePolicy());
                Updater.m2081setimpl(composerM2074constructorimpl, currentCompositionLocalMap5, companion5.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
                }
                function3ModifierMaterializerOf5.invoke(SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function2;
                popupProperties4 = popupProperties3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new i(popupPositionProvider, function3, popupProperties4, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        popupProperties2 = popupProperties;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i12 |= i15;
        }
        i16 = i12;
        if ((i16 & 5851) == 1170) {
            if (i17 != 0) {
                function2 = null;
            } else {
                function2 = function1;
            }
            if (i13 != 0) {
                popupProperties3 = new PopupProperties(false, false, false, null, false, false, 63, null);
            } else {
                popupProperties3 = popupProperties2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-830247068, i16, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:221)");
            }
            view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            str = (String) composerStartRestartGroup.consume(f18411a);
            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            compositionContextRememberCompositionContext = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, composerStartRestartGroup, (i16 >> 9) & 14);
            popupId = (UUID) RememberSaveableKt.m2165rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) j.f18448p0, composerStartRestartGroup, 3080, 6);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Intrinsics.checkNotNullExpressionValue(popupId, "popupId");
                layoutDirection2 = layoutDirection;
                PopupLayout popupLayout11 = new PopupLayout(function2, popupProperties3, str, view, density, popupPositionProvider, popupId, null, 128, null);
                popupLayout11.setContent(compositionContextRememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(1302892335, true, new k(popupLayout11, stateRememberUpdatedState)));
                composerStartRestartGroup.updateRememberedValue(popupLayout11);
                objRememberedValue = popupLayout11;
            } else {
                layoutDirection2 = layoutDirection;
            }
            composerStartRestartGroup.endReplaceableGroup();
            PopupLayout popupLayout12 = (PopupLayout) objRememberedValue;
            Function0<Unit> function9 = function2;
            PopupProperties popupProperties10 = popupProperties3;
            LayoutDirection layoutDirection8 = layoutDirection2;
            EffectsKt.DisposableEffect(popupLayout12, new c(popupLayout12, function9, popupProperties10, str, layoutDirection8), composerStartRestartGroup, 8);
            EffectsKt.SideEffect(new d(popupLayout12, function9, popupProperties10, str, layoutDirection8), composerStartRestartGroup, 0);
            EffectsKt.DisposableEffect(popupPositionProvider, new e(popupLayout12, popupPositionProvider), composerStartRestartGroup, i16 & 14);
            EffectsKt.LaunchedEffect(popupLayout12, new f(popupLayout12, 0), composerStartRestartGroup, 72);
            Modifier modifierOnGloballyPositioned6 = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.INSTANCE, new g(popupLayout12));
            h hVar6 = new h(popupLayout12, layoutDirection2);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
            constructor = companion6.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierOnGloballyPositioned6);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl, hVar6, companion6.getSetMeasurePolicy());
            Updater.m2081setimpl(composerM2074constructorimpl, currentCompositionLocalMap6, companion6.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion6.getSetCompositeKeyHash();
            if (composerM2074constructorimpl.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            }
            function3ModifierMaterializerOf6.invoke(SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function3 = function2;
            popupProperties4 = popupProperties3;
        } else {
            if (i17 != 0) {
                function2 = null;
            } else {
                function2 = function1;
            }
            if (i13 != 0) {
                popupProperties3 = new PopupProperties(false, false, false, null, false, false, 63, null);
            } else {
                popupProperties3 = popupProperties2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-830247068, i16, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:221)");
            }
            view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            str = (String) composerStartRestartGroup.consume(f18411a);
            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            compositionContextRememberCompositionContext = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, composerStartRestartGroup, (i16 >> 9) & 14);
            popupId = (UUID) RememberSaveableKt.m2165rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) j.f18448p0, composerStartRestartGroup, 3080, 6);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Intrinsics.checkNotNullExpressionValue(popupId, "popupId");
                layoutDirection2 = layoutDirection;
                PopupLayout popupLayout13 = new PopupLayout(function2, popupProperties3, str, view, density, popupPositionProvider, popupId, null, 128, null);
                popupLayout13.setContent(compositionContextRememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(1302892335, true, new k(popupLayout13, stateRememberUpdatedState)));
                composerStartRestartGroup.updateRememberedValue(popupLayout13);
                objRememberedValue = popupLayout13;
            } else {
                layoutDirection2 = layoutDirection;
            }
            composerStartRestartGroup.endReplaceableGroup();
            PopupLayout popupLayout14 = (PopupLayout) objRememberedValue;
            Function0<Unit> function10 = function2;
            PopupProperties popupProperties11 = popupProperties3;
            LayoutDirection layoutDirection9 = layoutDirection2;
            EffectsKt.DisposableEffect(popupLayout14, new c(popupLayout14, function10, popupProperties11, str, layoutDirection9), composerStartRestartGroup, 8);
            EffectsKt.SideEffect(new d(popupLayout14, function10, popupProperties11, str, layoutDirection9), composerStartRestartGroup, 0);
            EffectsKt.DisposableEffect(popupPositionProvider, new e(popupLayout14, popupPositionProvider), composerStartRestartGroup, i16 & 14);
            EffectsKt.LaunchedEffect(popupLayout14, new f(popupLayout14, 0), composerStartRestartGroup, 72);
            Modifier modifierOnGloballyPositioned7 = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.INSTANCE, new g(popupLayout14));
            h hVar7 = new h(popupLayout14, layoutDirection2);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
            constructor = companion7.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierOnGloballyPositioned7);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl, hVar7, companion7.getSetMeasurePolicy());
            Updater.m2081setimpl(composerM2074constructorimpl, currentCompositionLocalMap7, companion7.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion7.getSetCompositeKeyHash();
            if (composerM2074constructorimpl.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            }
            function3ModifierMaterializerOf7.invoke(SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function3 = function2;
            popupProperties4 = popupProperties3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new i(popupPositionProvider, function3, popupProperties4, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:77:0x0107  */
    /* JADX WARN: Code duplicated, block: B:79:0x010f  */
    /* JADX WARN: Code duplicated, block: B:82:0x013a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0148  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Popup-K5zGePQ, reason: not valid java name */
    public static final void m4627PopupK5zGePQ(@Nullable Alignment alignment, long j10, @Nullable Function0<Unit> function0, @Nullable PopupProperties popupProperties, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        Alignment alignment2;
        int i12;
        long jIntOffset;
        int i13;
        Function0<Unit> function1;
        int i14;
        int i15;
        PopupProperties popupProperties2;
        int i16;
        int i17;
        Alignment topStart;
        boolean zChanged;
        Object objRememberedValue;
        Function0<Unit> function2;
        PopupProperties popupProperties3;
        Alignment alignment3;
        long j11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(295309329);
        int i18 = i11 & 1;
        if (i18 != 0) {
            i12 = i10 | 6;
            alignment2 = alignment;
        } else if ((i10 & 14) == 0) {
            alignment2 = alignment;
            i12 = (composerStartRestartGroup.changed(alignment2) ? 4 : 2) | i10;
        } else {
            alignment2 = alignment;
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 == 0) {
            if ((i10 & 112) == 0) {
                jIntOffset = j10;
                i12 |= composerStartRestartGroup.changed(jIntOffset) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    function1 = function0;
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 7168) == 0) {
                        popupProperties2 = popupProperties;
                        if (composerStartRestartGroup.changed(popupProperties2)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 16) != 0) {
                        i12 |= 24576;
                    } else if ((57344 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    if ((46811 & i12) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        if (i18 != 0) {
                            topStart = Alignment.INSTANCE.getTopStart();
                        } else {
                            topStart = alignment2;
                        }
                        if (i19 != 0) {
                            jIntOffset = IntOffsetKt.IntOffset(0, 0);
                        }
                        if (i13 != 0) {
                            function1 = null;
                        }
                        if (i15 != 0) {
                            popupProperties2 = new PopupProperties(false, false, false, null, false, false, 63, null);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(295309329, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:186)");
                        }
                        IntOffset intOffsetM4498boximpl = IntOffset.m4498boximpl(jIntOffset);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(intOffsetM4498boximpl) | composerStartRestartGroup.changed(topStart);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new AlignmentOffsetPositionProvider(topStart, jIntOffset, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i20 = i12 >> 3;
                        long j12 = jIntOffset;
                        Popup((AlignmentOffsetPositionProvider) objRememberedValue, function1, popupProperties2, content, composerStartRestartGroup, (i20 & 112) | (i20 & 896) | (i20 & 7168), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function2 = function1;
                        popupProperties3 = popupProperties2;
                        alignment3 = topStart;
                        j11 = j12;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        alignment3 = alignment2;
                        j11 = jIntOffset;
                        function2 = function1;
                        popupProperties3 = popupProperties2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(alignment3, j11, function2, popupProperties3, content, i10, i11));
                }
                i12 |= 3072;
                popupProperties2 = popupProperties;
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((57344 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((46811 & i12) == 9362) {
                    if (i18 != 0) {
                        topStart = Alignment.INSTANCE.getTopStart();
                    } else {
                        topStart = alignment2;
                    }
                    if (i19 != 0) {
                        jIntOffset = IntOffsetKt.IntOffset(0, 0);
                    }
                    if (i13 != 0) {
                        function1 = null;
                    }
                    if (i15 != 0) {
                        popupProperties2 = new PopupProperties(false, false, false, null, false, false, 63, null);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(295309329, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:186)");
                    }
                    IntOffset intOffsetM4498boximpl2 = IntOffset.m4498boximpl(jIntOffset);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(intOffsetM4498boximpl2) | composerStartRestartGroup.changed(topStart);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new AlignmentOffsetPositionProvider(topStart, jIntOffset, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new AlignmentOffsetPositionProvider(topStart, jIntOffset, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i21 = i12 >> 3;
                    long j13 = jIntOffset;
                    Popup((AlignmentOffsetPositionProvider) objRememberedValue, function1, popupProperties2, content, composerStartRestartGroup, (i21 & 112) | (i21 & 896) | (i21 & 7168), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2 = function1;
                    popupProperties3 = popupProperties2;
                    alignment3 = topStart;
                    j11 = j13;
                } else {
                    if (i18 != 0) {
                        topStart = Alignment.INSTANCE.getTopStart();
                    } else {
                        topStart = alignment2;
                    }
                    if (i19 != 0) {
                        jIntOffset = IntOffsetKt.IntOffset(0, 0);
                    }
                    if (i13 != 0) {
                        function1 = null;
                    }
                    if (i15 != 0) {
                        popupProperties2 = new PopupProperties(false, false, false, null, false, false, 63, null);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(295309329, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:186)");
                    }
                    IntOffset intOffsetM4498boximpl3 = IntOffset.m4498boximpl(jIntOffset);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(intOffsetM4498boximpl3) | composerStartRestartGroup.changed(topStart);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new AlignmentOffsetPositionProvider(topStart, jIntOffset, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new AlignmentOffsetPositionProvider(topStart, jIntOffset, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i22 = i12 >> 3;
                    long j14 = jIntOffset;
                    Popup((AlignmentOffsetPositionProvider) objRememberedValue, function1, popupProperties2, content, composerStartRestartGroup, (i22 & 112) | (i22 & 896) | (i22 & 7168), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2 = function1;
                    popupProperties3 = popupProperties2;
                    alignment3 = topStart;
                    j11 = j14;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(alignment3, j11, function2, popupProperties3, content, i10, i11));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            function1 = function0;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    popupProperties2 = popupProperties;
                    if (composerStartRestartGroup.changed(popupProperties2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((57344 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((46811 & i12) == 9362) {
                    if (i18 != 0) {
                        topStart = Alignment.INSTANCE.getTopStart();
                    } else {
                        topStart = alignment2;
                    }
                    if (i19 != 0) {
                        jIntOffset = IntOffsetKt.IntOffset(0, 0);
                    }
                    if (i13 != 0) {
                        function1 = null;
                    }
                    if (i15 != 0) {
                        popupProperties2 = new PopupProperties(false, false, false, null, false, false, 63, null);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(295309329, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:186)");
                    }
                    IntOffset intOffsetM4498boximpl4 = IntOffset.m4498boximpl(jIntOffset);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(intOffsetM4498boximpl4) | composerStartRestartGroup.changed(topStart);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new AlignmentOffsetPositionProvider(topStart, jIntOffset, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new AlignmentOffsetPositionProvider(topStart, jIntOffset, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i23 = i12 >> 3;
                    long j15 = jIntOffset;
                    Popup((AlignmentOffsetPositionProvider) objRememberedValue, function1, popupProperties2, content, composerStartRestartGroup, (i23 & 112) | (i23 & 896) | (i23 & 7168), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2 = function1;
                    popupProperties3 = popupProperties2;
                    alignment3 = topStart;
                    j11 = j15;
                } else {
                    if (i18 != 0) {
                        topStart = Alignment.INSTANCE.getTopStart();
                    } else {
                        topStart = alignment2;
                    }
                    if (i19 != 0) {
                        jIntOffset = IntOffsetKt.IntOffset(0, 0);
                    }
                    if (i13 != 0) {
                        function1 = null;
                    }
                    if (i15 != 0) {
                        popupProperties2 = new PopupProperties(false, false, false, null, false, false, 63, null);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(295309329, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:186)");
                    }
                    IntOffset intOffsetM4498boximpl5 = IntOffset.m4498boximpl(jIntOffset);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(intOffsetM4498boximpl5) | composerStartRestartGroup.changed(topStart);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new AlignmentOffsetPositionProvider(topStart, jIntOffset, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new AlignmentOffsetPositionProvider(topStart, jIntOffset, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i24 = i12 >> 3;
                    long j16 = jIntOffset;
                    Popup((AlignmentOffsetPositionProvider) objRememberedValue, function1, popupProperties2, content, composerStartRestartGroup, (i24 & 112) | (i24 & 896) | (i24 & 7168), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2 = function1;
                    popupProperties3 = popupProperties2;
                    alignment3 = topStart;
                    j11 = j16;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(alignment3, j11, function2, popupProperties3, content, i10, i11));
            }
            i12 |= 3072;
            popupProperties2 = popupProperties;
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            if ((46811 & i12) == 9362) {
                if (i18 != 0) {
                    topStart = Alignment.INSTANCE.getTopStart();
                } else {
                    topStart = alignment2;
                }
                if (i19 != 0) {
                    jIntOffset = IntOffsetKt.IntOffset(0, 0);
                }
                if (i13 != 0) {
                    function1 = null;
                }
                if (i15 != 0) {
                    popupProperties2 = new PopupProperties(false, false, false, null, false, false, 63, null);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(295309329, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:186)");
                }
                IntOffset intOffsetM4498boximpl6 = IntOffset.m4498boximpl(jIntOffset);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(intOffsetM4498boximpl6) | composerStartRestartGroup.changed(topStart);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new AlignmentOffsetPositionProvider(topStart, jIntOffset, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new AlignmentOffsetPositionProvider(topStart, jIntOffset, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i25 = i12 >> 3;
                long j17 = jIntOffset;
                Popup((AlignmentOffsetPositionProvider) objRememberedValue, function1, popupProperties2, content, composerStartRestartGroup, (i25 & 112) | (i25 & 896) | (i25 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2 = function1;
                popupProperties3 = popupProperties2;
                alignment3 = topStart;
                j11 = j17;
            } else {
                if (i18 != 0) {
                    topStart = Alignment.INSTANCE.getTopStart();
                } else {
                    topStart = alignment2;
                }
                if (i19 != 0) {
                    jIntOffset = IntOffsetKt.IntOffset(0, 0);
                }
                if (i13 != 0) {
                    function1 = null;
                }
                if (i15 != 0) {
                    popupProperties2 = new PopupProperties(false, false, false, null, false, false, 63, null);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(295309329, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:186)");
                }
                IntOffset intOffsetM4498boximpl7 = IntOffset.m4498boximpl(jIntOffset);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(intOffsetM4498boximpl7) | composerStartRestartGroup.changed(topStart);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new AlignmentOffsetPositionProvider(topStart, jIntOffset, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new AlignmentOffsetPositionProvider(topStart, jIntOffset, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i26 = i12 >> 3;
                long j18 = jIntOffset;
                Popup((AlignmentOffsetPositionProvider) objRememberedValue, function1, popupProperties2, content, composerStartRestartGroup, (i26 & 112) | (i26 & 896) | (i26 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2 = function1;
                popupProperties3 = popupProperties2;
                alignment3 = topStart;
                j11 = j18;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(alignment3, j11, function2, popupProperties3, content, i10, i11));
        }
        i12 |= 48;
        jIntOffset = j10;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                function1 = function0;
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    popupProperties2 = popupProperties;
                    if (composerStartRestartGroup.changed(popupProperties2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((57344 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((46811 & i12) == 9362) {
                    if (i18 != 0) {
                        topStart = Alignment.INSTANCE.getTopStart();
                    } else {
                        topStart = alignment2;
                    }
                    if (i19 != 0) {
                        jIntOffset = IntOffsetKt.IntOffset(0, 0);
                    }
                    if (i13 != 0) {
                        function1 = null;
                    }
                    if (i15 != 0) {
                        popupProperties2 = new PopupProperties(false, false, false, null, false, false, 63, null);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(295309329, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:186)");
                    }
                    IntOffset intOffsetM4498boximpl8 = IntOffset.m4498boximpl(jIntOffset);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(intOffsetM4498boximpl8) | composerStartRestartGroup.changed(topStart);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new AlignmentOffsetPositionProvider(topStart, jIntOffset, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new AlignmentOffsetPositionProvider(topStart, jIntOffset, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i27 = i12 >> 3;
                    long j19 = jIntOffset;
                    Popup((AlignmentOffsetPositionProvider) objRememberedValue, function1, popupProperties2, content, composerStartRestartGroup, (i27 & 112) | (i27 & 896) | (i27 & 7168), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2 = function1;
                    popupProperties3 = popupProperties2;
                    alignment3 = topStart;
                    j11 = j19;
                } else {
                    if (i18 != 0) {
                        topStart = Alignment.INSTANCE.getTopStart();
                    } else {
                        topStart = alignment2;
                    }
                    if (i19 != 0) {
                        jIntOffset = IntOffsetKt.IntOffset(0, 0);
                    }
                    if (i13 != 0) {
                        function1 = null;
                    }
                    if (i15 != 0) {
                        popupProperties2 = new PopupProperties(false, false, false, null, false, false, 63, null);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(295309329, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:186)");
                    }
                    IntOffset intOffsetM4498boximpl9 = IntOffset.m4498boximpl(jIntOffset);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(intOffsetM4498boximpl9) | composerStartRestartGroup.changed(topStart);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new AlignmentOffsetPositionProvider(topStart, jIntOffset, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new AlignmentOffsetPositionProvider(topStart, jIntOffset, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i28 = i12 >> 3;
                    long j110 = jIntOffset;
                    Popup((AlignmentOffsetPositionProvider) objRememberedValue, function1, popupProperties2, content, composerStartRestartGroup, (i28 & 112) | (i28 & 896) | (i28 & 7168), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2 = function1;
                    popupProperties3 = popupProperties2;
                    alignment3 = topStart;
                    j11 = j110;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(alignment3, j11, function2, popupProperties3, content, i10, i11));
            }
            i12 |= 3072;
            popupProperties2 = popupProperties;
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            if ((46811 & i12) == 9362) {
                if (i18 != 0) {
                    topStart = Alignment.INSTANCE.getTopStart();
                } else {
                    topStart = alignment2;
                }
                if (i19 != 0) {
                    jIntOffset = IntOffsetKt.IntOffset(0, 0);
                }
                if (i13 != 0) {
                    function1 = null;
                }
                if (i15 != 0) {
                    popupProperties2 = new PopupProperties(false, false, false, null, false, false, 63, null);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(295309329, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:186)");
                }
                IntOffset intOffsetM4498boximpl10 = IntOffset.m4498boximpl(jIntOffset);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(intOffsetM4498boximpl10) | composerStartRestartGroup.changed(topStart);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new AlignmentOffsetPositionProvider(topStart, jIntOffset, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new AlignmentOffsetPositionProvider(topStart, jIntOffset, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i29 = i12 >> 3;
                long j111 = jIntOffset;
                Popup((AlignmentOffsetPositionProvider) objRememberedValue, function1, popupProperties2, content, composerStartRestartGroup, (i29 & 112) | (i29 & 896) | (i29 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2 = function1;
                popupProperties3 = popupProperties2;
                alignment3 = topStart;
                j11 = j111;
            } else {
                if (i18 != 0) {
                    topStart = Alignment.INSTANCE.getTopStart();
                } else {
                    topStart = alignment2;
                }
                if (i19 != 0) {
                    jIntOffset = IntOffsetKt.IntOffset(0, 0);
                }
                if (i13 != 0) {
                    function1 = null;
                }
                if (i15 != 0) {
                    popupProperties2 = new PopupProperties(false, false, false, null, false, false, 63, null);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(295309329, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:186)");
                }
                IntOffset intOffsetM4498boximpl11 = IntOffset.m4498boximpl(jIntOffset);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(intOffsetM4498boximpl11) | composerStartRestartGroup.changed(topStart);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new AlignmentOffsetPositionProvider(topStart, jIntOffset, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new AlignmentOffsetPositionProvider(topStart, jIntOffset, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i210 = i12 >> 3;
                long j112 = jIntOffset;
                Popup((AlignmentOffsetPositionProvider) objRememberedValue, function1, popupProperties2, content, composerStartRestartGroup, (i210 & 112) | (i210 & 896) | (i210 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2 = function1;
                popupProperties3 = popupProperties2;
                alignment3 = topStart;
                j11 = j112;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(alignment3, j11, function2, popupProperties3, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        function1 = function0;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 7168) == 0) {
                popupProperties2 = popupProperties;
                if (composerStartRestartGroup.changed(popupProperties2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            if ((46811 & i12) == 9362) {
                if (i18 != 0) {
                    topStart = Alignment.INSTANCE.getTopStart();
                } else {
                    topStart = alignment2;
                }
                if (i19 != 0) {
                    jIntOffset = IntOffsetKt.IntOffset(0, 0);
                }
                if (i13 != 0) {
                    function1 = null;
                }
                if (i15 != 0) {
                    popupProperties2 = new PopupProperties(false, false, false, null, false, false, 63, null);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(295309329, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:186)");
                }
                IntOffset intOffsetM4498boximpl12 = IntOffset.m4498boximpl(jIntOffset);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(intOffsetM4498boximpl12) | composerStartRestartGroup.changed(topStart);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new AlignmentOffsetPositionProvider(topStart, jIntOffset, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new AlignmentOffsetPositionProvider(topStart, jIntOffset, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i211 = i12 >> 3;
                long j113 = jIntOffset;
                Popup((AlignmentOffsetPositionProvider) objRememberedValue, function1, popupProperties2, content, composerStartRestartGroup, (i211 & 112) | (i211 & 896) | (i211 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2 = function1;
                popupProperties3 = popupProperties2;
                alignment3 = topStart;
                j11 = j113;
            } else {
                if (i18 != 0) {
                    topStart = Alignment.INSTANCE.getTopStart();
                } else {
                    topStart = alignment2;
                }
                if (i19 != 0) {
                    jIntOffset = IntOffsetKt.IntOffset(0, 0);
                }
                if (i13 != 0) {
                    function1 = null;
                }
                if (i15 != 0) {
                    popupProperties2 = new PopupProperties(false, false, false, null, false, false, 63, null);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(295309329, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:186)");
                }
                IntOffset intOffsetM4498boximpl13 = IntOffset.m4498boximpl(jIntOffset);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(intOffsetM4498boximpl13) | composerStartRestartGroup.changed(topStart);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new AlignmentOffsetPositionProvider(topStart, jIntOffset, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new AlignmentOffsetPositionProvider(topStart, jIntOffset, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i212 = i12 >> 3;
                long j114 = jIntOffset;
                Popup((AlignmentOffsetPositionProvider) objRememberedValue, function1, popupProperties2, content, composerStartRestartGroup, (i212 & 112) | (i212 & 896) | (i212 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2 = function1;
                popupProperties3 = popupProperties2;
                alignment3 = topStart;
                j11 = j114;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(alignment3, j11, function2, popupProperties3, content, i10, i11));
        }
        i12 |= 3072;
        popupProperties2 = popupProperties;
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i12 |= i17;
        }
        if ((46811 & i12) == 9362) {
            if (i18 != 0) {
                topStart = Alignment.INSTANCE.getTopStart();
            } else {
                topStart = alignment2;
            }
            if (i19 != 0) {
                jIntOffset = IntOffsetKt.IntOffset(0, 0);
            }
            if (i13 != 0) {
                function1 = null;
            }
            if (i15 != 0) {
                popupProperties2 = new PopupProperties(false, false, false, null, false, false, 63, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(295309329, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:186)");
            }
            IntOffset intOffsetM4498boximpl14 = IntOffset.m4498boximpl(jIntOffset);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(intOffsetM4498boximpl14) | composerStartRestartGroup.changed(topStart);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new AlignmentOffsetPositionProvider(topStart, jIntOffset, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new AlignmentOffsetPositionProvider(topStart, jIntOffset, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i213 = i12 >> 3;
            long j115 = jIntOffset;
            Popup((AlignmentOffsetPositionProvider) objRememberedValue, function1, popupProperties2, content, composerStartRestartGroup, (i213 & 112) | (i213 & 896) | (i213 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function2 = function1;
            popupProperties3 = popupProperties2;
            alignment3 = topStart;
            j11 = j115;
        } else {
            if (i18 != 0) {
                topStart = Alignment.INSTANCE.getTopStart();
            } else {
                topStart = alignment2;
            }
            if (i19 != 0) {
                jIntOffset = IntOffsetKt.IntOffset(0, 0);
            }
            if (i13 != 0) {
                function1 = null;
            }
            if (i15 != 0) {
                popupProperties2 = new PopupProperties(false, false, false, null, false, false, 63, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(295309329, i12, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:186)");
            }
            IntOffset intOffsetM4498boximpl15 = IntOffset.m4498boximpl(jIntOffset);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(intOffsetM4498boximpl15) | composerStartRestartGroup.changed(topStart);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new AlignmentOffsetPositionProvider(topStart, jIntOffset, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new AlignmentOffsetPositionProvider(topStart, jIntOffset, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i214 = i12 >> 3;
            long j116 = jIntOffset;
            Popup((AlignmentOffsetPositionProvider) objRememberedValue, function1, popupProperties2, content, composerStartRestartGroup, (i214 & 112) | (i214 & 896) | (i214 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function2 = function1;
            popupProperties3 = popupProperties2;
            alignment3 = topStart;
            j11 = j116;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(alignment3, j11, function2, popupProperties3, content, i10, i11));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void PopupTestTag(@NotNull String tag, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-498879600);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(tag) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-498879600, i11, -1, "androidx.compose.ui.window.PopupTestTag (AndroidPopup.android.kt:331)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{f18411a.provides(tag)}, content, composerStartRestartGroup, (i11 & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new l(tag, content, i10));
    }

    public static final Function2 access$Popup$lambda$1(State state) {
        return (Function2) state.getValue();
    }

    public static final IntRect access$toIntBounds(Rect rect) {
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }

    @NotNull
    public static final ProvidableCompositionLocal<String> getLocalPopupTestTag() {
        return f18411a;
    }

    public static final boolean isFlagSecureEnabled(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    public static final boolean isPopupLayout(@NotNull View view, @Nullable String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        return (view instanceof PopupLayout) && (str == null || Intrinsics.areEqual(str, ((PopupLayout) view).getTestTag()));
    }

    public static /* synthetic */ boolean isPopupLayout$default(View view, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return isPopupLayout(view, str);
    }
}
