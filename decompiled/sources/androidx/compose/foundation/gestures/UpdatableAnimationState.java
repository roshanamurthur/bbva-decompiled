package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VectorizedSpringSpec;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UpdatableAnimationState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015JO\u0010\u000b\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0086@ø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/gestures/UpdatableAnimationState;", "", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "valueDelta", "", "beforeFrame", "Lkotlin/Function0;", "afterFrame", "animateToZero", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "F", "getValue", "()F", "setValue", "(F)V", "value", "<init>", "()V", "a", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class UpdatableAnimationState {

    @Deprecated
    public static final float VisibilityThreshold = 0.01f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f3993e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final AnimationVector1D f3994f = new AnimationVector1D(0.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final VectorizedSpringSpec<AnimationVector1D> f3995g = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null).vectorize((TwoWayConverter) VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f3996a = Long.MIN_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public AnimationVector1D f3997b = f3994f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public float value;

    /* JADX INFO: compiled from: UpdatableAnimationState.kt */
    public static final class a {
    }

    /* JADX INFO: compiled from: UpdatableAnimationState.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", i = {0, 0, 0, 0, 1, 1}, l = {100, 146}, m = "animateToZero", n = {"this", "beforeFrame", "afterFrame", "durationScale", "this", "afterFrame"}, s = {"L$0", "L$1", "L$2", "F$0", "L$0", "L$1"})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public UpdatableAnimationState f4000p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Function f4001q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Function0 f4002r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public float f4003s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public /* synthetic */ Object f4004t0;
        public int v0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f4004t0 = obj;
            this.v0 |= Integer.MIN_VALUE;
            return UpdatableAnimationState.this.animateToZero(null, null, this);
        }
    }

    /* JADX INFO: compiled from: UpdatableAnimationState.kt */
    public static final class c extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ float f4007q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<Float, Unit> f4008r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(float f6, Function1<? super Float, Unit> function1) {
            super(1);
            this.f4007q0 = f6;
            this.f4008r0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l6) {
            long jRoundToLong;
            long jLongValue = l6.longValue();
            UpdatableAnimationState updatableAnimationState = UpdatableAnimationState.this;
            if (updatableAnimationState.f3996a == Long.MIN_VALUE) {
                updatableAnimationState.f3996a = jLongValue;
            }
            AnimationVector1D animationVector1D = new AnimationVector1D(updatableAnimationState.getValue());
            float f6 = this.f4007q0;
            if (f6 == 0.0f) {
                UpdatableAnimationState.f3993e.getClass();
                VectorizedSpringSpec vectorizedSpringSpec = UpdatableAnimationState.f3995g;
                AnimationVector1D animationVector1D2 = new AnimationVector1D(updatableAnimationState.getValue());
                UpdatableAnimationState.f3993e.getClass();
                jRoundToLong = vectorizedSpringSpec.getDurationNanos(animationVector1D2, UpdatableAnimationState.f3994f, updatableAnimationState.f3997b);
            } else {
                jRoundToLong = mk.c.roundToLong((jLongValue - updatableAnimationState.f3996a) / f6);
            }
            long j10 = jRoundToLong;
            UpdatableAnimationState.f3993e.getClass();
            VectorizedSpringSpec vectorizedSpringSpec2 = UpdatableAnimationState.f3995g;
            UpdatableAnimationState.f3993e.getClass();
            float value = ((AnimationVector1D) vectorizedSpringSpec2.getValueFromNanos(j10, animationVector1D, UpdatableAnimationState.f3994f, updatableAnimationState.f3997b)).getValue();
            UpdatableAnimationState.f3993e.getClass();
            VectorizedSpringSpec vectorizedSpringSpec3 = UpdatableAnimationState.f3995g;
            UpdatableAnimationState.f3993e.getClass();
            updatableAnimationState.f3997b = (AnimationVector1D) vectorizedSpringSpec3.getVelocityFromNanos(j10, animationVector1D, UpdatableAnimationState.f3994f, updatableAnimationState.f3997b);
            updatableAnimationState.f3996a = jLongValue;
            float value2 = updatableAnimationState.getValue() - value;
            updatableAnimationState.setValue(value);
            this.f4008r0.invoke(Float.valueOf(value2));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: UpdatableAnimationState.kt */
    public static final class d extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<Float, Unit> f4010q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super Float, Unit> function1) {
            super(1);
            this.f4010q0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l6) {
            l6.longValue();
            UpdatableAnimationState updatableAnimationState = UpdatableAnimationState.this;
            float value = updatableAnimationState.getValue();
            updatableAnimationState.setValue(0.0f);
            this.f4010q0.invoke(Float.valueOf(value));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0087 A[Catch: all -> 0x00e4, PHI: r0 r2 r3 r4 r12 r13
      0x0087: PHI (r0v17 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>) = 
      (r0v12 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>)
      (r0v18 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>)
     binds: [B:30:0x007d, B:39:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r2v10 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r2v7 kotlin.jvm.functions.Function0<kotlin.Unit>), (r2v11 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:30:0x007d, B:39:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r3v4 androidx.compose.foundation.gestures.UpdatableAnimationState) = 
      (r3v1 androidx.compose.foundation.gestures.UpdatableAnimationState)
      (r3v5 androidx.compose.foundation.gestures.UpdatableAnimationState)
     binds: [B:30:0x007d, B:39:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r4v4 ??) = (r4v2 ??), (r4v9 ??) binds: [B:30:0x007d, B:39:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r12v2 java.lang.Object) = (r12v0 java.lang.Object), (r12v3 java.lang.Object) binds: [B:30:0x007d, B:39:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r13v1 float) = (r13v0 float), (r13v2 float) binds: [B:30:0x007d, B:39:0x00b5] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x00e4, blocks: (B:37:0x00b0, B:31:0x0087, B:34:0x009a), top: B:56:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x009a A[Catch: all -> 0x00e4, TryCatch #0 {all -> 0x00e4, blocks: (B:37:0x00b0, B:31:0x0087, B:34:0x009a), top: B:56:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00af A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [androidx.compose.foundation.gestures.UpdatableAnimationState] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.foundation.gestures.UpdatableAnimationState$b, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.foundation.gestures.UpdatableAnimationState] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.foundation.gestures.UpdatableAnimationState$b, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.foundation.gestures.UpdatableAnimationState$b, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ad -> B:56:0x00b0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object animateToZero(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r18, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r19, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.UpdatableAnimationState.animateToZero(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final float getValue() {
        return this.value;
    }

    public final void setValue(float f6) {
        this.value = f6;
    }
}
