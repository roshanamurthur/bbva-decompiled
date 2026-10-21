package androidx.compose.animation.core;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InfiniteTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u0011\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002R\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002R\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002R\u00020\u00000\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Landroidx/compose/animation/core/InfiniteTransition;", "", "Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;", "animation", "", "addAnimation$animation_core_release", "(Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;)V", "addAnimation", "removeAnimation$animation_core_release", "removeAnimation", "run$animation_core_release", "(Landroidx/compose/runtime/Composer;I)V", "run", "", "a", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "label", "", "getAnimations", "()Ljava/util/List;", "animations", "<init>", "(Ljava/lang/String;)V", "TransitionAnimationState", "animation-core_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,364:1\n1182#2:365\n1161#2,2:366\n81#3:368\n107#3,2:369\n81#3:371\n107#3,2:372\n25#4:374\n1097#5,6:375\n460#6,11:381\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition\n*L\n150#1:365\n150#1:366,2\n151#1:368\n151#1:369,2\n153#1:371\n153#1:372,2\n173#1:374\n173#1:375,6\n217#1:381,11\n*E\n"})
public final class InfiniteTransition {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String label;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableVector<TransitionAnimationState<?, ?>> f2975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableState f2976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f2977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableState f2978e;

    /* JADX INFO: compiled from: InfiniteTransition.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004BC\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 \u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010+\u001a\u00020&¢\u0006\u0004\bF\u0010GJ-\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0015\u0010\u0013R\"\u0010\u0005\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u0006\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR#\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010+\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R+\u00101\u001a\u00028\u00002\u0006\u0010,\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u0010\u001cR0\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105RB\u0010=\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001062\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001068\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006H"}, d2 = {"Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/runtime/State;", "initialValue", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "", "updateValues$animation_core_release", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;)V", "updateValues", "", "playTimeNanos", "onPlayTimeChanged$animation_core_release", "(J)V", "onPlayTimeChanged", "skipToEnd$animation_core_release", "()V", "skipToEnd", "reset$animation_core_release", "reset", "p0", "Ljava/lang/Object;", "getInitialValue$animation_core_release", "()Ljava/lang/Object;", "setInitialValue$animation_core_release", "(Ljava/lang/Object;)V", "q0", "getTargetValue$animation_core_release", "setTargetValue$animation_core_release", "Landroidx/compose/animation/core/TwoWayConverter;", "r0", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "", "s0", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "label", "<set-?>", "t0", "Landroidx/compose/runtime/MutableState;", "getValue", "setValue$animation_core_release", "value", "u0", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/animation/core/TargetBasedAnimation;", "v0", "Landroidx/compose/animation/core/TargetBasedAnimation;", "getAnimation", "()Landroidx/compose/animation/core/TargetBasedAnimation;", "setAnimation$animation_core_release", "(Landroidx/compose/animation/core/TargetBasedAnimation;)V", "animation", "", "w0", "Z", "isFinished$animation_core_release", "()Z", "setFinished$animation_core_release", "(Z)V", "isFinished", "<init>", "(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,364:1\n81#2:365\n107#2,2:366\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState\n*L\n76#1:365\n76#1:366,2\n*E\n"})
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {
        public final /* synthetic */ InfiniteTransition E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        public T initialValue;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        public T targetValue;

        /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final TwoWayConverter<T, V> typeConverter;

        /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String label;

        /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final MutableState value;

        /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public AnimationSpec<T> animationSpec;

        /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
        @NotNull
        public TargetBasedAnimation<T, V> animation;

        /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
        public boolean isFinished;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public boolean f2986x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public long f2987y0;

        public TransitionAnimationState(InfiniteTransition infiniteTransition, T t10, @NotNull T t11, @NotNull TwoWayConverter<T, V> typeConverter, @NotNull AnimationSpec<T> animationSpec, String label) {
            Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(label, "label");
            this.E0 = infiniteTransition;
            this.initialValue = t10;
            this.targetValue = t11;
            this.typeConverter = typeConverter;
            this.label = label;
            this.value = SnapshotStateKt.mutableStateOf$default(t10, null, 2, null);
            this.animationSpec = animationSpec;
            this.animation = new TargetBasedAnimation<>(animationSpec, typeConverter, this.initialValue, this.targetValue, (AnimationVector) null, 16, (DefaultConstructorMarker) null);
        }

        @NotNull
        public final TargetBasedAnimation<T, V> getAnimation() {
            return this.animation;
        }

        @NotNull
        public final AnimationSpec<T> getAnimationSpec() {
            return this.animationSpec;
        }

        public final T getInitialValue$animation_core_release() {
            return this.initialValue;
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }

        public final T getTargetValue$animation_core_release() {
            return this.targetValue;
        }

        @NotNull
        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        @Override // androidx.compose.runtime.State
        public T getValue() {
            return this.value.getValue();
        }

        /* JADX INFO: renamed from: isFinished$animation_core_release, reason: from getter */
        public final boolean getIsFinished() {
            return this.isFinished;
        }

        public final void onPlayTimeChanged$animation_core_release(long playTimeNanos) {
            InfiniteTransition.access$setRefreshChildNeeded(this.E0, false);
            if (this.f2986x0) {
                this.f2986x0 = false;
                this.f2987y0 = playTimeNanos;
            }
            long j10 = playTimeNanos - this.f2987y0;
            setValue$animation_core_release(this.animation.getValueFromNanos(j10));
            TargetBasedAnimation<T, V> targetBasedAnimation = this.animation;
            targetBasedAnimation.getClass();
            this.isFinished = s.a.a(targetBasedAnimation, j10);
        }

        public final void reset$animation_core_release() {
            this.f2986x0 = true;
        }

        public final void setAnimation$animation_core_release(@NotNull TargetBasedAnimation<T, V> targetBasedAnimation) {
            Intrinsics.checkNotNullParameter(targetBasedAnimation, "<set-?>");
            this.animation = targetBasedAnimation;
        }

        public final void setFinished$animation_core_release(boolean z10) {
            this.isFinished = z10;
        }

        public final void setInitialValue$animation_core_release(T t10) {
            this.initialValue = t10;
        }

        public final void setTargetValue$animation_core_release(T t10) {
            this.targetValue = t10;
        }

        public void setValue$animation_core_release(T t10) {
            this.value.setValue(t10);
        }

        public final void skipToEnd$animation_core_release() {
            setValue$animation_core_release(this.animation.getTargetValue());
            this.f2986x0 = true;
        }

        public final void updateValues$animation_core_release(T initialValue, T targetValue, @NotNull AnimationSpec<T> animationSpec) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            this.initialValue = initialValue;
            this.targetValue = targetValue;
            this.animationSpec = animationSpec;
            this.animation = new TargetBasedAnimation<>(animationSpec, this.typeConverter, initialValue, targetValue, (AnimationVector) null, 16, (DefaultConstructorMarker) null);
            InfiniteTransition.access$setRefreshChildNeeded(this.E0, true);
            this.isFinished = false;
            this.f2986x0 = true;
        }
    }

    /* JADX INFO: compiled from: InfiniteTransition.kt */
    @DebugMetadata(c = "androidx.compose.animation.core.InfiniteTransition$run$1", f = "InfiniteTransition.kt", i = {0, 0, 1, 1}, l = {181, 205}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "durationScale", "$this$LaunchedEffect", "durationScale"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Ref.FloatRef f2988p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f2989q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f2990r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ MutableState<State<Long>> f2991s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ InfiniteTransition f2992t0;

        /* JADX INFO: renamed from: androidx.compose.animation.core.InfiniteTransition$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: InfiniteTransition.kt */
        @SourceDebugExtension({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$run$1$1\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,364:1\n460#2,11:365\n460#2,11:376\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$run$1$1\n*L\n187#1:365,11\n194#1:376,11\n*E\n"})
        public static final class C0009a extends Lambda implements Function1<Long, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ MutableState<State<Long>> f2993p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ InfiniteTransition f2994q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ Ref.FloatRef f2995r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f2996s0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0009a(MutableState<State<Long>> mutableState, InfiniteTransition infiniteTransition, Ref.FloatRef floatRef, CoroutineScope coroutineScope) {
                super(1);
                this.f2993p0 = mutableState;
                this.f2994q0 = infiniteTransition;
                this.f2995r0 = floatRef;
                this.f2996s0 = coroutineScope;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Long l6) {
                long jLongValue = l6.longValue();
                State<Long> value = this.f2993p0.getValue();
                long jLongValue2 = value != null ? value.getValue().longValue() : jLongValue;
                InfiniteTransition infiniteTransition = this.f2994q0;
                long j10 = infiniteTransition.f2977d;
                int i10 = 0;
                CoroutineScope coroutineScope = this.f2996s0;
                Ref.FloatRef floatRef = this.f2995r0;
                if (j10 == Long.MIN_VALUE || floatRef.element != SuspendAnimationKt.getDurationScale(coroutineScope.getCoroutineContext())) {
                    infiniteTransition.f2977d = jLongValue;
                    MutableVector mutableVector = infiniteTransition.f2975b;
                    int size = mutableVector.getSize();
                    if (size > 0) {
                        Object[] content = mutableVector.getContent();
                        int i11 = 0;
                        do {
                            ((TransitionAnimationState) content[i11]).reset$animation_core_release();
                            i11++;
                        } while (i11 < size);
                    }
                    floatRef.element = SuspendAnimationKt.getDurationScale(coroutineScope.getCoroutineContext());
                }
                if (floatRef.element == 0.0f) {
                    MutableVector mutableVector2 = infiniteTransition.f2975b;
                    int size2 = mutableVector2.getSize();
                    if (size2 > 0) {
                        Object[] content2 = mutableVector2.getContent();
                        do {
                            ((TransitionAnimationState) content2[i10]).skipToEnd$animation_core_release();
                            i10++;
                        } while (i10 < size2);
                    }
                } else {
                    InfiniteTransition.access$onFrame(infiniteTransition, (long) ((jLongValue2 - infiniteTransition.f2977d) / floatRef.element));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: InfiniteTransition.kt */
        public static final class b extends Lambda implements Function0<Float> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f2997p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(CoroutineScope coroutineScope) {
                super(0);
                this.f2997p0 = coroutineScope;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Float invoke() {
                return Float.valueOf(SuspendAnimationKt.getDurationScale(this.f2997p0.getCoroutineContext()));
            }
        }

        /* JADX INFO: compiled from: InfiniteTransition.kt */
        @DebugMetadata(c = "androidx.compose.animation.core.InfiniteTransition$run$1$3", f = "InfiniteTransition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<Float, Continuation<? super Boolean>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public /* synthetic */ float f2998p0;

            public c() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                c cVar = new c(2, continuation);
                cVar.f2998p0 = ((Number) obj).floatValue();
                return cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Float f6, Continuation<? super Boolean> continuation) {
                return ((c) create(Float.valueOf(f6.floatValue()), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ek.a.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.f2998p0 > 0.0f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MutableState<State<Long>> mutableState, InfiniteTransition infiniteTransition, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f2991s0 = mutableState;
            this.f2992t0 = infiniteTransition;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f2991s0, this.f2992t0, continuation);
            aVar.f2990r0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0053 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:17:0x005b  */
        /* JADX WARN: Code duplicated, block: B:19:0x0076 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0059 -> B:12:0x003e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0074 -> B:12:0x003e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:17:0x005b
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = ek.a.getCOROUTINE_SUSPENDED()
                int r1 = r8.f2989q0
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L2d
                if (r1 == r2) goto L21
                if (r1 != r3) goto L19
                kotlin.jvm.internal.Ref$FloatRef r1 = r8.f2988p0
                java.lang.Object r4 = r8.f2990r0
                kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
                kotlin.ResultKt.throwOnFailure(r9)
                r9 = r4
                goto L3d
            L19:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L21:
                kotlin.jvm.internal.Ref$FloatRef r1 = r8.f2988p0
                java.lang.Object r4 = r8.f2990r0
                kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
                kotlin.ResultKt.throwOnFailure(r9)
                r9 = r4
                r4 = r8
                goto L54
            L2d:
                kotlin.ResultKt.throwOnFailure(r9)
                java.lang.Object r9 = r8.f2990r0
                kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
                kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
                r1.<init>()
                r4 = 1065353216(0x3f800000, float:1.0)
                r1.element = r4
            L3d:
                r4 = r8
            L3e:
                androidx.compose.animation.core.InfiniteTransition$a$a r5 = new androidx.compose.animation.core.InfiniteTransition$a$a
                androidx.compose.runtime.MutableState<androidx.compose.runtime.State<java.lang.Long>> r6 = r4.f2991s0
                androidx.compose.animation.core.InfiniteTransition r7 = r4.f2992t0
                r5.<init>(r6, r7, r1, r9)
                r4.f2990r0 = r9
                r4.f2988p0 = r1
                r4.f2989q0 = r2
                java.lang.Object r5 = androidx.compose.animation.core.InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(r5, r4)
                if (r5 != r0) goto L54
                return r0
            L54:
                float r5 = r1.element
                r6 = 0
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 != 0) goto L3e
                androidx.compose.animation.core.InfiniteTransition$a$b r5 = new androidx.compose.animation.core.InfiniteTransition$a$b
                r5.<init>(r9)
                kotlinx.coroutines.flow.Flow r5 = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(r5)
                androidx.compose.animation.core.InfiniteTransition$a$c r6 = new androidx.compose.animation.core.InfiniteTransition$a$c
                r7 = 0
                r6.<init>(r3, r7)
                r4.f2990r0 = r9
                r4.f2988p0 = r1
                r4.f2989q0 = r3
                java.lang.Object r5 = kotlinx.coroutines.flow.FlowKt.first(r5, r6, r4)
                if (r5 != r0) goto L3e
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.InfiniteTransition.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: InfiniteTransition.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f3000q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10) {
            super(2);
            this.f3000q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f3000q0 | 1);
            InfiniteTransition.this.run$animation_core_release(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public InfiniteTransition(@NotNull String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.label = label;
        this.f2975b = new MutableVector<>(new TransitionAnimationState[16], 0);
        this.f2976c = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.f2977d = Long.MIN_VALUE;
        this.f2978e = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    }

    public static final void access$onFrame(InfiniteTransition infiniteTransition, long j10) {
        boolean z10;
        MutableVector<TransitionAnimationState<?, ?>> mutableVector = infiniteTransition.f2975b;
        int size = mutableVector.getSize();
        if (size > 0) {
            TransitionAnimationState<?, ?>[] content = mutableVector.getContent();
            z10 = true;
            int i10 = 0;
            do {
                TransitionAnimationState<?, ?> transitionAnimationState = content[i10];
                if (!transitionAnimationState.getIsFinished()) {
                    transitionAnimationState.onPlayTimeChanged$animation_core_release(j10);
                }
                if (!transitionAnimationState.getIsFinished()) {
                    z10 = false;
                }
                i10++;
            } while (i10 < size);
        } else {
            z10 = true;
        }
        infiniteTransition.f2978e.setValue(Boolean.valueOf(!z10));
    }

    public static final void access$setRefreshChildNeeded(InfiniteTransition infiniteTransition, boolean z10) {
        infiniteTransition.f2976c.setValue(Boolean.valueOf(z10));
    }

    public final void addAnimation$animation_core_release(@NotNull TransitionAnimationState<?, ?> animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f2975b.add(animation);
        this.f2976c.setValue(Boolean.TRUE);
    }

    @NotNull
    public final List<TransitionAnimationState<?, ?>> getAnimations() {
        return this.f2975b.asMutableList();
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    public final void removeAnimation$animation_core_release(@NotNull TransitionAnimationState<?, ?> animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f2975b.remove(animation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    public final void run$animation_core_release(@Nullable Composer composer, int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-318043801);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-318043801, i10, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:171)");
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        if (((Boolean) this.f2978e.getValue()).booleanValue() || ((Boolean) this.f2976c.getValue()).booleanValue()) {
            EffectsKt.LaunchedEffect(this, new a(mutableState, this, null), composerStartRestartGroup, 72);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(i10));
    }
}
