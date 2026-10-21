package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyLayoutAnimateItemModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B\u0018\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\nø\u0001\u0001¢\u0006\u0004\b$\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u001b\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\u0002H\u0016R+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006@\u0006X\u0086\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R+\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R+\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u0007R4\u0010#\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00048F@BX\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u0007\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "", "cancelAnimation", "Landroidx/compose/ui/unit/IntOffset;", "delta", "animatePlacementDelta--gyyYBs", "(J)V", "animatePlacementDelta", "onDetach", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "H0", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getPlacementAnimationSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "setPlacementAnimationSpec", "(Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "placementAnimationSpec", "", "<set-?>", "I0", "Landroidx/compose/runtime/MutableState;", "isAnimationInProgress", "()Z", "setAnimationInProgress", "(Z)V", "J0", "J", "getRawOffset-nOcc-ac", "()J", "setRawOffset--gyyYBs", "rawOffset", "L0", "getPlacementDelta-nOcc-ac", "setPlacementDelta--gyyYBs", "placementDelta", "<init>", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyLayoutAnimateItemModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutAnimateItemModifierNode.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,135:1\n81#2:136\n107#2,2:137\n81#2:139\n107#2,2:140\n79#3:142\n*S KotlinDebug\n*F\n+ 1 LazyLayoutAnimateItemModifierNode.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode\n*L\n42#1:136\n42#1:137,2\n60#1:139\n60#1:140,2\n80#1:142\n*E\n"})
public final class LazyLayoutAnimateItemModifierNode extends Modifier.Node {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final long M0 = IntOffsetKt.IntOffset(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @NotNull
    public FiniteAnimationSpec<IntOffset> placementAnimationSpec;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    @NotNull
    public final MutableState isAnimationInProgress;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    public long rawOffset;

    @NotNull
    public final Animatable<IntOffset, AnimationVector2D> K0;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    @NotNull
    public final MutableState placementDelta;

    /* JADX INFO: compiled from: LazyLayoutAnimateItemModifierNode.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode$Companion;", "", "()V", "NotInitialized", "Landroidx/compose/ui/unit/IntOffset;", "getNotInitialized-nOcc-ac", "()J", "J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getNotInitialized-nOcc-ac, reason: not valid java name */
        public final long m399getNotInitializednOccac() {
            return LazyLayoutAnimateItemModifierNode.M0;
        }
    }

    /* JADX INFO: compiled from: LazyLayoutAnimateItemModifierNode.kt */
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1", f = "LazyLayoutAnimateItemModifierNode.kt", i = {0}, l = {97, 103}, m = "invokeSuspend", n = {"spec"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nLazyLayoutAnimateItemModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutAnimateItemModifierNode.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,135:1\n79#2:136\n*S KotlinDebug\n*F\n+ 1 LazyLayoutAnimateItemModifierNode.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1\n*L\n102#1:136\n*E\n"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public FiniteAnimationSpec f4951p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f4952q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f4954s0;

        /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: LazyLayoutAnimateItemModifierNode.kt */
        @SourceDebugExtension({"SMAP\nLazyLayoutAnimateItemModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutAnimateItemModifierNode.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1$1\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,135:1\n79#2:136\n*S KotlinDebug\n*F\n+ 1 LazyLayoutAnimateItemModifierNode.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1$1\n*L\n105#1:136\n*E\n"})
        public static final class C0033a extends Lambda implements Function1<Animatable<IntOffset, AnimationVector2D>, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ LazyLayoutAnimateItemModifierNode f4955p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ long f4956q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0033a(LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode, long j10) {
                super(1);
                this.f4955p0 = lazyLayoutAnimateItemModifierNode;
                this.f4956q0 = j10;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Animatable<IntOffset, AnimationVector2D> animatable) {
                Animatable<IntOffset, AnimationVector2D> animateTo = animatable;
                Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                long f18312a = animateTo.getValue().getF18312a();
                int iM4507getXimpl = IntOffset.m4507getXimpl(f18312a);
                long j10 = this.f4956q0;
                LazyLayoutAnimateItemModifierNode.m394access$setPlacementDeltagyyYBs(this.f4955p0, IntOffsetKt.IntOffset(iM4507getXimpl - IntOffset.m4507getXimpl(j10), IntOffset.m4508getYimpl(f18312a) - IntOffset.m4508getYimpl(j10)));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j10, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f4954s0 = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LazyLayoutAnimateItemModifierNode.this.new a(this.f4954s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            FiniteAnimationSpec<IntOffset> placementAnimationSpec;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f4952q0;
            long j10 = this.f4954s0;
            LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode = LazyLayoutAnimateItemModifierNode.this;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        placementAnimationSpec = this.f4951p0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    LazyLayoutAnimateItemModifierNode.access$setAnimationInProgress(lazyLayoutAnimateItemModifierNode, false);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                placementAnimationSpec = (!lazyLayoutAnimateItemModifierNode.K0.isRunning() || (lazyLayoutAnimateItemModifierNode.getPlacementAnimationSpec() instanceof SpringSpec)) ? lazyLayoutAnimateItemModifierNode.getPlacementAnimationSpec() : LazyLayoutAnimateItemModifierNodeKt.f4959a;
                if (!lazyLayoutAnimateItemModifierNode.K0.isRunning()) {
                    Animatable animatable = lazyLayoutAnimateItemModifierNode.K0;
                    IntOffset intOffsetM4498boximpl = IntOffset.m4498boximpl(j10);
                    this.f4951p0 = placementAnimationSpec;
                    this.f4952q0 = 1;
                    if (animatable.snapTo(intOffsetM4498boximpl, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                FiniteAnimationSpec<IntOffset> finiteAnimationSpec = placementAnimationSpec;
                long f18312a = ((IntOffset) lazyLayoutAnimateItemModifierNode.K0.getValue()).getF18312a();
                long jIntOffset = IntOffsetKt.IntOffset(IntOffset.m4507getXimpl(f18312a) - IntOffset.m4507getXimpl(j10), IntOffset.m4508getYimpl(f18312a) - IntOffset.m4508getYimpl(j10));
                Animatable animatable2 = lazyLayoutAnimateItemModifierNode.K0;
                IntOffset intOffsetM4498boximpl2 = IntOffset.m4498boximpl(jIntOffset);
                C0033a c0033a = new C0033a(lazyLayoutAnimateItemModifierNode, jIntOffset);
                this.f4951p0 = null;
                this.f4952q0 = 2;
                if (Animatable.animateTo$default(animatable2, intOffsetM4498boximpl2, finiteAnimationSpec, null, c0033a, this, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                LazyLayoutAnimateItemModifierNode.access$setAnimationInProgress(lazyLayoutAnimateItemModifierNode, false);
            } catch (CancellationException unused) {
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LazyLayoutAnimateItemModifierNode.kt */
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode$cancelAnimation$1", f = "LazyLayoutAnimateItemModifierNode.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f4957p0;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LazyLayoutAnimateItemModifierNode.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f4957p0;
            LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode = LazyLayoutAnimateItemModifierNode.this;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable animatable = lazyLayoutAnimateItemModifierNode.K0;
                IntOffset intOffsetM4498boximpl = IntOffset.m4498boximpl(IntOffset.INSTANCE.m4517getZeronOccac());
                this.f4957p0 = 1;
                if (animatable.snapTo(intOffsetM4498boximpl, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            LazyLayoutAnimateItemModifierNode.m394access$setPlacementDeltagyyYBs(lazyLayoutAnimateItemModifierNode, IntOffset.INSTANCE.m4517getZeronOccac());
            LazyLayoutAnimateItemModifierNode.access$setAnimationInProgress(lazyLayoutAnimateItemModifierNode, false);
            return Unit.INSTANCE;
        }
    }

    public LazyLayoutAnimateItemModifierNode(@NotNull FiniteAnimationSpec<IntOffset> placementAnimationSpec) {
        Intrinsics.checkNotNullParameter(placementAnimationSpec, "placementAnimationSpec");
        this.placementAnimationSpec = placementAnimationSpec;
        this.isAnimationInProgress = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.rawOffset = M0;
        IntOffset.Companion companion = IntOffset.INSTANCE;
        this.K0 = new Animatable<>(IntOffset.m4498boximpl(companion.m4517getZeronOccac()), VectorConvertersKt.getVectorConverter(companion), null, null, 12, null);
        this.placementDelta = SnapshotStateKt.mutableStateOf$default(IntOffset.m4498boximpl(companion.m4517getZeronOccac()), null, 2, null);
    }

    public static final void access$setAnimationInProgress(LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode, boolean z10) {
        lazyLayoutAnimateItemModifierNode.isAnimationInProgress.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: access$setPlacementDelta--gyyYBs, reason: not valid java name */
    public static final void m394access$setPlacementDeltagyyYBs(LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode, long j10) {
        lazyLayoutAnimateItemModifierNode.placementDelta.setValue(IntOffset.m4498boximpl(j10));
    }

    /* JADX INFO: renamed from: animatePlacementDelta--gyyYBs, reason: not valid java name */
    public final void m395animatePlacementDeltagyyYBs(long delta) {
        long jM396getPlacementDeltanOccac = m396getPlacementDeltanOccac();
        long jIntOffset = IntOffsetKt.IntOffset(IntOffset.m4507getXimpl(jM396getPlacementDeltanOccac) - IntOffset.m4507getXimpl(delta), IntOffset.m4508getYimpl(jM396getPlacementDeltanOccac) - IntOffset.m4508getYimpl(delta));
        this.placementDelta.setValue(IntOffset.m4498boximpl(jIntOffset));
        this.isAnimationInProgress.setValue(Boolean.TRUE);
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new a(jIntOffset, null), 3, null);
    }

    public final void cancelAnimation() {
        if (isAnimationInProgress()) {
            BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new b(null), 3, null);
        }
    }

    @NotNull
    public final FiniteAnimationSpec<IntOffset> getPlacementAnimationSpec() {
        return this.placementAnimationSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getPlacementDelta-nOcc-ac, reason: not valid java name */
    public final long m396getPlacementDeltanOccac() {
        return ((IntOffset) this.placementDelta.getValue()).getF18312a();
    }

    /* JADX INFO: renamed from: getRawOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getRawOffset() {
        return this.rawOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isAnimationInProgress() {
        return ((Boolean) this.isAnimationInProgress.getValue()).booleanValue();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.placementDelta.setValue(IntOffset.m4498boximpl(IntOffset.INSTANCE.m4517getZeronOccac()));
        this.isAnimationInProgress.setValue(Boolean.FALSE);
        this.rawOffset = M0;
    }

    public final void setPlacementAnimationSpec(@NotNull FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        Intrinsics.checkNotNullParameter(finiteAnimationSpec, "<set-?>");
        this.placementAnimationSpec = finiteAnimationSpec;
    }

    /* JADX INFO: renamed from: setRawOffset--gyyYBs, reason: not valid java name */
    public final void m398setRawOffsetgyyYBs(long j10) {
        this.rawOffset = j10;
    }
}
