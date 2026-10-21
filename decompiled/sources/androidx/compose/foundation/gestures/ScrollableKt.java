package androidx.compose.foundation.gestures;

import androidx.camera.camera2.internal.compat.u;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
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
import u.f;
import u.j;
import u.l;
import u.m;
import u.n;
import u0.h;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aF\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u001aR\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007\" \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u001a\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/ScrollableState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "reverseDirection", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "scrollable", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "c", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getModifierLocalScrollableContainer", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "ModifierLocalScrollableContainer", "Landroidx/compose/ui/MotionDurationScale;", "d", "Landroidx/compose/ui/MotionDurationScale;", "getDefaultScrollMotionDurationScale", "()Landroidx/compose/ui/MotionDurationScale;", "DefaultScrollMotionDurationScale", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,637:1\n135#2:638\n25#3:639\n36#3:646\n25#3:653\n36#3:660\n50#3:667\n49#3:668\n1097#4,6:640\n1097#4,6:647\n1097#4,6:654\n1097#4,6:661\n1097#4,6:669\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt\n*L\n152#1:638\n258#1:639\n269#1:646\n272#1:653\n282#1:660\n284#1:667\n284#1:668\n258#1:640,6\n269#1:647,6\n272#1:654,6\n282#1:661,6\n284#1:669,6\n*E\n"})
public final class ScrollableKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f3815a = new b(3, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ScrollableKt$NoOpScrollScope$1 f3816b = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollableKt$NoOpScrollScope$1
        @Override // androidx.compose.foundation.gestures.ScrollScope
        public float scrollBy(float pixels) {
            return pixels;
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final ProvidableModifierLocal<Boolean> f3817c = ModifierLocalKt.modifierLocalOf(a.f3819p0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final ScrollableKt$DefaultScrollMotionDurationScale$1 f3818d = new MotionDurationScale() { // from class: androidx.compose.foundation.gestures.ScrollableKt$DefaultScrollMotionDurationScale$1
        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public <R> R fold(R r3, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) MotionDurationScale.DefaultImpls.fold(this, r3, function2);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        @Nullable
        public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
            return (E) MotionDurationScale.DefaultImpls.get(this, key);
        }

        @Override // androidx.compose.ui.MotionDurationScale, kotlin.coroutines.CoroutineContext.Element
        public final /* synthetic */ CoroutineContext.Key getKey() {
            return h.a(this);
        }

        @Override // androidx.compose.ui.MotionDurationScale
        public float getScaleFactor() {
            return 1.0f;
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        @NotNull
        public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
            return MotionDurationScale.DefaultImpls.minusKey(this, key);
        }

        @Override // kotlin.coroutines.CoroutineContext
        @NotNull
        public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
            return MotionDurationScale.DefaultImpls.plus(this, coroutineContext);
        }
    };

    /* JADX INFO: compiled from: Scrollable.kt */
    public static final class a extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f3819p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: compiled from: Scrollable.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableKt$NoOpOnDragStarted$1", f = "Scrollable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function3<CoroutineScope, Offset, Continuation<? super Unit>, Object> {
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, Offset offset, Continuation<? super Unit> continuation) {
            offset.getF15533a();
            return new b(3, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Scrollable.kt */
    @SourceDebugExtension({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt$scrollable$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,637:1\n486#2,4:638\n490#2,2:646\n494#2:652\n25#3:642\n83#3,3:653\n1097#4,3:643\n1100#4,3:649\n1097#4,6:656\n486#5:648\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt$scrollable$2\n*L\n163#1:638,4\n163#1:646,2\n163#1:652\n163#1:642\n165#1:653,3\n163#1:643,3\n163#1:649,3\n165#1:656,6\n163#1:648\n*E\n"})
    public static final class c extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Orientation f3820p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ScrollableState f3821q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f3822r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f3823s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ FlingBehavior f3824t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ OverscrollEffect f3825u0;
        public final /* synthetic */ boolean v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Orientation orientation, ScrollableState scrollableState, OverscrollEffect overscrollEffect, boolean z10, boolean z11, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource) {
            super(3);
            this.f3820p0 = orientation;
            this.f3821q0 = scrollableState;
            this.f3822r0 = z10;
            this.f3823s0 = mutableInteractionSource;
            this.f3824t0 = flingBehavior;
            this.f3825u0 = overscrollEffect;
            this.v0 = z11;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iA = ci.a.a(num, modifier, "$this$composed", composer2, -629830927);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-629830927, iA, -1, "androidx.compose.foundation.gestures.scrollable.<anonymous> (Scrollable.kt:161)");
            }
            Object objB = androidx.databinding.c.b(composer2, 773894976, -492369756);
            if (objB == Composer.INSTANCE.getEmpty()) {
                objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
            }
            composer2.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
            composer2.endReplaceableGroup();
            Orientation orientation = this.f3820p0;
            ScrollableState scrollableState = this.f3821q0;
            boolean z10 = this.f3822r0;
            Object[] objArr = {coroutineScope, orientation, scrollableState, Boolean.valueOf(z10)};
            composer2.startReplaceableGroup(-568225417);
            boolean zChanged = false;
            for (int i10 = 0; i10 < 4; i10++) {
                zChanged |= composer2.changed(objArr[i10]);
            }
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ContentInViewModifier(coroutineScope, orientation, scrollableState, z10);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            Modifier modifier2 = Modifier.INSTANCE;
            Modifier modifierAccess$pointerScrollable = ScrollableKt.access$pointerScrollable(FocusableKt.focusGroup(modifier2).then(((ContentInViewModifier) objRememberedValue).getModifier()), this.f3823s0, this.f3820p0, this.f3822r0, this.f3821q0, this.f3824t0, this.f3825u0, this.v0, composer2, 0);
            if (this.v0) {
                modifier2 = f.f93647a;
            }
            Modifier modifierThen = modifierAccess$pointerScrollable.then(modifier2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return modifierThen;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003f -> B:18:0x0042). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object access$awaitScrollEvent(androidx.compose.ui.input.pointer.AwaitPointerEventScope r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof u.k
            if (r0 == 0) goto L13
            r0 = r6
            u.k r0 = (u.k) r0
            int r1 = r0.f93679r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f93679r0 = r1
            goto L18
        L13:
            u.k r0 = new u.k
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f93678q0
            java.lang.Object r1 = ek.a.getCOROUTINE_SUSPENDED()
            int r2 = r0.f93679r0
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = r0.f93677p0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L42
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.throwOnFailure(r6)
        L36:
            r0.f93677p0 = r5
            r0.f93679r0 = r3
            r6 = 0
            java.lang.Object r6 = e1.a.t(r5, r6, r0, r3, r6)
            if (r6 != r1) goto L42
            goto L55
        L42:
            androidx.compose.ui.input.pointer.PointerEvent r6 = (androidx.compose.ui.input.pointer.PointerEvent) r6
            int r2 = r6.getType()
            androidx.compose.ui.input.pointer.PointerEventType$Companion r4 = androidx.compose.ui.input.pointer.PointerEventType.INSTANCE
            int r4 = r4.m3437getScroll7fucELk()
            boolean r2 = androidx.compose.ui.input.pointer.PointerEventType.m3428equalsimpl0(r2, r4)
            if (r2 == 0) goto L36
            r1 = r6
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.access$awaitScrollEvent(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Modifier access$pointerScrollable(Modifier modifier, MutableInteractionSource mutableInteractionSource, Orientation orientation, boolean z10, ScrollableState scrollableState, FlingBehavior flingBehavior, OverscrollEffect overscrollEffect, boolean z11, Composer composer, int i10) {
        composer.startReplaceableGroup(-2012025036);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2012025036, i10, -1, "androidx.compose.foundation.gestures.pointerScrollable (Scrollable.kt:247)");
        }
        composer.startReplaceableGroup(-1730185954);
        FlingBehavior flingBehavior2 = flingBehavior == null ? ScrollableDefaults.INSTANCE.flingBehavior(composer, 6) : flingBehavior;
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateOf$default(new NestedScrollDispatcher(), null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new ScrollingLogic(orientation, z10, mutableState, scrollableState, flingBehavior2, overscrollEffect), composer, 0);
        Object objValueOf = Boolean.valueOf(z11);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(objValueOf);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = access$scrollableNestedScrollConnection(stateRememberUpdatedState, z11);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        NestedScrollConnection nestedScrollConnection = (NestedScrollConnection) objRememberedValue2;
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new j(stateRememberUpdatedState);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        j jVar = (j) objRememberedValue3;
        ScrollConfig scrollConfigPlatformScrollConfig = AndroidScrollable_androidKt.platformScrollConfig(composer, 0);
        b bVar = f3815a;
        l lVar = l.f93680p0;
        composer.startReplaceableGroup(1157296644);
        boolean zChanged2 = composer.changed(stateRememberUpdatedState);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new m(stateRememberUpdatedState);
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceableGroup();
        Function0 function0 = (Function0) objRememberedValue4;
        composer.startReplaceableGroup(511388516);
        boolean zChanged3 = composer.changed(mutableState) | composer.changed(stateRememberUpdatedState);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new n(mutableState, stateRememberUpdatedState, null);
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceableGroup();
        Modifier modifierNestedScroll = NestedScrollModifierKt.nestedScroll(modifier.then(new DraggableElement(jVar, lVar, orientation, z11, mutableInteractionSource, function0, bVar, (Function3) objRememberedValue5, false)).then(new MouseWheelScrollElement(stateRememberUpdatedState, scrollConfigPlatformScrollConfig)), nestedScrollConnection, (NestedScrollDispatcher) mutableState.getValue());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifierNestedScroll;
    }

    public static final NestedScrollConnection access$scrollableNestedScrollConnection(State state, boolean z10) {
        return new ScrollableKt$scrollableNestedScrollConnection$1(state, z10);
    }

    @NotNull
    public static final MotionDurationScale getDefaultScrollMotionDurationScale() {
        return f3818d;
    }

    @NotNull
    public static final ProvidableModifierLocal<Boolean> getModifierLocalScrollableContainer() {
        return f3817c;
    }

    @NotNull
    public static final Modifier scrollable(@NotNull Modifier modifier, @NotNull ScrollableState state, @NotNull Orientation orientation, boolean z10, boolean z11, @Nullable FlingBehavior flingBehavior, @Nullable MutableInteractionSource mutableInteractionSource) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return scrollable(modifier, state, orientation, null, z10, z11, flingBehavior, mutableInteractionSource);
    }

    public static /* synthetic */ Modifier scrollable$default(Modifier modifier, ScrollableState scrollableState, Orientation orientation, boolean z10, boolean z11, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return scrollable(modifier, scrollableState, orientation, z12, z11, (i10 & 16) != 0 ? null : flingBehavior, (i10 & 32) != 0 ? null : mutableInteractionSource);
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final Modifier scrollable(@NotNull Modifier modifier, @NotNull final ScrollableState state, @NotNull final Orientation orientation, @Nullable final OverscrollEffect overscrollEffect, final boolean z10, final boolean z11, @Nullable final FlingBehavior flingBehavior, @Nullable final MutableInteractionSource mutableInteractionSource) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.gestures.ScrollableKt$scrollable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                androidx.activity.a.c(inspectorInfo, "$this$null", "scrollable").set("orientation", orientation);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("state", state);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("overscrollEffect", overscrollEffect);
                com.google.android.gms.internal.mlkit_vision_barcode_bundled.a.b(z11, com.google.android.gms.internal.mlkit_vision_barcode_bundled.a.b(z10, inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String(), "enabled", inspectorInfo), "reverseDirection", inspectorInfo).set("flingBehavior", flingBehavior);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("interactionSource", mutableInteractionSource);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new c(orientation, state, overscrollEffect, z11, z10, flingBehavior, mutableInteractionSource));
    }
}
