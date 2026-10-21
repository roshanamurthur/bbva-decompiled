package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u0000 s*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001sBD\u0012\u0006\u0010p\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011\u0012#\b\u0002\u0010(\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020#0\u001f¢\u0006\u0004\bq\u0010rJ#\u0010\t\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\r\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u0000H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u00002\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR5\u0010(\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020#0\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R+\u00100\u001a\u00028\u00002\u0006\u0010)\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R+\u00102\u001a\u00020#2\u0006\u0010)\u001a\u00020#8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010+\u001a\u0004\b2\u00103\"\u0004\b4\u00105RC\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00038@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010+\u001a\u0004\b7\u00108\"\u0004\b9\u0010\bR\"\u0010A\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010E\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u0010<\u001a\u0004\bC\u0010>\"\u0004\bD\u0010@RO\u0010L\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040F2\u0018\u0010)\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040F8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010+\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR+\u0010Q\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00048@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010>\"\u0004\bP\u0010@R/\u0010X\u001a\u0004\u0018\u00010R2\b\u0010)\u001a\u0004\u0018\u00010R8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bS\u0010+\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001a\u0010^\u001a\u00020Y8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u0017\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00040_8F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00040_8F¢\u0006\u0006\u001a\u0004\bc\u0010aR\u001a\u0010\u000e\u001a\u00028\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bf\u0010g\u001a\u0004\be\u0010-R \u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000h8FX\u0087\u0004¢\u0006\f\u0012\u0004\bk\u0010g\u001a\u0004\bi\u0010jR\u001a\u0010o\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\bn\u0010g\u001a\u0004\bm\u0010>\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006t"}, d2 = {"Landroidx/compose/material/SwipeableState;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "", "newAnchors", "", "ensureInit$material_release", "(Ljava/util/Map;)V", "ensureInit", "oldAnchors", "processNewAnchors$material_release", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processNewAnchors", "targetValue", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationSpec;", "anim", "animateTo", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "velocity", "performFling", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "performDrag", "a", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec$material_release", "()Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newValue", "", "b", "Lkotlin/jvm/functions/Function1;", "getConfirmStateChange$material_release", "()Lkotlin/jvm/functions/Function1;", "confirmStateChange", "<set-?>", "c", "Landroidx/compose/runtime/MutableState;", "getCurrentValue", "()Ljava/lang/Object;", "setCurrentValue", "(Ljava/lang/Object;)V", "currentValue", "d", "isAnimationRunning", "()Z", "setAnimationRunning", "(Z)V", "i", "getAnchors$material_release", "()Ljava/util/Map;", "setAnchors$material_release", "anchors", "k", "F", "getMinBound$material_release", "()F", "setMinBound$material_release", "(F)V", "minBound", "l", "getMaxBound$material_release", "setMaxBound$material_release", "maxBound", "Lkotlin/Function2;", "m", "getThresholds$material_release", "()Lkotlin/jvm/functions/Function2;", "setThresholds$material_release", "(Lkotlin/jvm/functions/Function2;)V", "thresholds", "n", "Landroidx/compose/runtime/MutableFloatState;", "getVelocityThreshold$material_release", "setVelocityThreshold$material_release", "velocityThreshold", "Landroidx/compose/material/ResistanceConfig;", "o", "getResistance$material_release", "()Landroidx/compose/material/ResistanceConfig;", "setResistance$material_release", "(Landroidx/compose/material/ResistanceConfig;)V", "resistance", "Landroidx/compose/foundation/gestures/DraggableState;", "p", "Landroidx/compose/foundation/gestures/DraggableState;", "getDraggableState$material_release", "()Landroidx/compose/foundation/gestures/DraggableState;", "draggableState", "Landroidx/compose/runtime/State;", "getOffset", "()Landroidx/compose/runtime/State;", TypedValues.CycleType.S_WAVE_OFFSET, "getOverflow", "overflow", "getTargetValue", "getTargetValue$annotations", "()V", "Landroidx/compose/material/SwipeProgress;", "getProgress", "()Landroidx/compose/material/SwipeProgress;", "getProgress$annotations", "progress", "getDirection", "getDirection$annotations", "direction", "initialValue", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "Companion", "material_release"}, k = 1, mv = {1, 8, 0})
@Stable
@ExperimentalMaterialApi
@SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableState\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,890:1\n20#2:891\n22#2:895\n50#3:892\n55#3:894\n106#4:893\n81#5:896\n107#5,2:897\n81#5:899\n107#5,2:900\n81#5:902\n107#5,2:903\n81#5:933\n107#5,2:934\n81#5:939\n107#5,2:940\n2333#6,14:905\n2333#6,14:919\n75#7:936\n108#7,2:937\n1#8:942\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableState\n*L\n128#1:891\n128#1:895\n128#1:892\n128#1:894\n128#1:893\n91#1:896\n91#1:897,2\n97#1:899\n97#1:900,2\n124#1:902\n124#1:903,2\n195#1:933\n195#1:934,2\n199#1:939\n199#1:940,2\n174#1:905,14\n180#1:919,14\n197#1:936\n197#1:937,2\n*E\n"})
public class SwipeableState<T> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AnimationSpec<Float> animationSpec;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<T, Boolean> confirmStateChange;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState currentValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState isAnimationRunning;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableFloatState f7922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableFloatState f7923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableFloatState f7924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final MutableState<Float> f7925h;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState anchors;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Flow<Map<Float, T>> f7927j;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public float minBound;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public float maxBound;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final MutableState thresholds;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableFloatState velocityThreshold;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState resistance;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DraggableState draggableState;

    /* JADX INFO: compiled from: Swipeable.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JD\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0001\u0010\u0006*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\f0\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/material/SwipeableState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/SwipeableState;", ExifInterface.GPS_DIRECTION_TRUE, "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: Swipeable.kt */
        public static final class a extends Lambda implements Function2<SaverScope, SwipeableState<T>, T> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f7933p0 = new a(2);

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SaverScope saverScope, Object obj) {
                SaverScope Saver = saverScope;
                SwipeableState it = (SwipeableState) obj;
                Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getCurrentValue();
            }
        }

        /* JADX INFO: compiled from: Swipeable.kt */
        public static final class b extends Lambda implements Function1<T, SwipeableState<T>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ AnimationSpec<Float> f7934p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Function1<T, Boolean> f7935q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> function1) {
                super(1);
                this.f7934p0 = animationSpec;
                this.f7935q0 = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new SwipeableState(it, this.f7934p0, this.f7935q0);
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> Saver<SwipeableState<T>, T> Saver(@NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super T, Boolean> confirmStateChange) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return SaverKt.Saver(a.f7933p0, new b(animationSpec, confirmStateChange));
        }
    }

    /* JADX INFO: compiled from: Swipeable.kt */
    public static final class a extends Lambda implements Function1<T, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f7936p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: Swipeable.kt */
    @SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableState$animateTo$2\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,890:1\n467#2,7:891\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableState$animateTo$2\n*L\n340#1:891,7\n*E\n"})
    public static final class b implements FlowCollector<Map<Float, ? extends T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ T f7937p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SwipeableState<T> f7938q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ AnimationSpec<Float> f7939r0;

        /* JADX INFO: compiled from: Swipeable.kt */
        @DebugMetadata(c = "androidx.compose.material.SwipeableState$animateTo$2", f = "Swipeable.kt", i = {0, 0}, l = {335}, m = "emit", n = {"this", "anchors"}, s = {"L$0", "L$1"})
        public static final class a extends ContinuationImpl {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public b f7940p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public Map f7941q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public /* synthetic */ Object f7942r0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public int f7944t0;

            public a(Continuation<? super a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f7942r0 = obj;
                this.f7944t0 |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(T t10, SwipeableState<T> swipeableState, AnimationSpec<Float> animationSpec) {
            this.f7937p0 = t10;
            this.f7938q0 = swipeableState;
            this.f7939r0 = animationSpec;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x007d  */
        /* JADX WARN: Code duplicated, block: B:33:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:48:0x0119  */
        /* JADX WARN: Code duplicated, block: B:55:0x0096 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:57:0x0077 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:60:0x00ff A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:62:0x00e0 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(@NotNull Map<Float, ? extends T> map, @NotNull Continuation<? super Unit> continuation) throws Throwable {
            a aVar;
            b bVar;
            float floatValue;
            LinkedHashMap linkedHashMap;
            Object objFirstOrNull;
            SwipeableState<T> swipeableState;
            float floatValue2;
            LinkedHashMap linkedHashMap2;
            Object objFirstOrNull2;
            SwipeableState<T> swipeableState2;
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i10 = aVar.f7944t0;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f7944t0 = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(continuation);
                }
            } else {
                aVar = new a(continuation);
            }
            Object obj = aVar.f7942r0;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i11 = aVar.f7944t0;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map = aVar.f7941q0;
                bVar = aVar.f7940p0;
                try {
                    ResultKt.throwOnFailure(obj);
                    floatValue2 = bVar.f7938q0.f7924g.getFloatValue();
                    linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry<Float, ? extends T> entry : map.entrySet()) {
                        if (Math.abs(entry.getKey().floatValue() - floatValue2) < 0.5f) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    objFirstOrNull2 = CollectionsKt___CollectionsKt.firstOrNull(linkedHashMap2.values());
                    swipeableState2 = bVar.f7938q0;
                    if (objFirstOrNull2 == null) {
                        objFirstOrNull2 = swipeableState2.getCurrentValue();
                    }
                    SwipeableState.access$setCurrentValue(swipeableState2, objFirstOrNull2);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    floatValue = bVar.f7938q0.f7924g.getFloatValue();
                    linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<Float, ? extends T> entry2 : map.entrySet()) {
                        if (Math.abs(entry2.getKey().floatValue() - floatValue) < 0.5f) {
                            linkedHashMap.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    objFirstOrNull = CollectionsKt___CollectionsKt.firstOrNull(linkedHashMap.values());
                    swipeableState = bVar.f7938q0;
                    if (objFirstOrNull == null) {
                        objFirstOrNull = swipeableState.getCurrentValue();
                    }
                    SwipeableState.access$setCurrentValue(swipeableState, objFirstOrNull);
                    throw th;
                }
            }
            ResultKt.throwOnFailure(obj);
            try {
                Float fAccess$getOffset = SwipeableKt.access$getOffset(map, this.f7937p0);
                if (fAccess$getOffset == null) {
                    throw new IllegalArgumentException("The target value must have an associated anchor.".toString());
                }
                SwipeableState<T> swipeableState3 = this.f7938q0;
                float fFloatValue = fAccess$getOffset.floatValue();
                AnimationSpec<Float> animationSpec = this.f7939r0;
                aVar.f7940p0 = this;
                aVar.f7941q0 = map;
                aVar.f7944t0 = 1;
                if (SwipeableState.access$animateInternalToOffset(swipeableState3, fFloatValue, animationSpec, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bVar = this;
                floatValue2 = bVar.f7938q0.f7924g.getFloatValue();
                linkedHashMap2 = new LinkedHashMap();
                while (r8.hasNext()) {
                    if (Math.abs(entry.getKey().floatValue() - floatValue2) < 0.5f) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                objFirstOrNull2 = CollectionsKt___CollectionsKt.firstOrNull(linkedHashMap2.values());
                swipeableState2 = bVar.f7938q0;
                if (objFirstOrNull2 == null) {
                    objFirstOrNull2 = swipeableState2.getCurrentValue();
                }
                SwipeableState.access$setCurrentValue(swipeableState2, objFirstOrNull2);
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                th = th3;
                bVar = this;
                floatValue = bVar.f7938q0.f7924g.getFloatValue();
                linkedHashMap = new LinkedHashMap();
                while (r8.hasNext()) {
                    if (Math.abs(entry2.getKey().floatValue() - floatValue) < 0.5f) {
                        linkedHashMap.put(entry2.getKey(), entry2.getValue());
                    }
                }
                objFirstOrNull = CollectionsKt___CollectionsKt.firstOrNull(linkedHashMap.values());
                swipeableState = bVar.f7938q0;
                if (objFirstOrNull == null) {
                    objFirstOrNull = swipeableState.getCurrentValue();
                }
                SwipeableState.access$setCurrentValue(swipeableState, objFirstOrNull);
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: Swipeable.kt */
    public static final class c extends Lambda implements Function1<Float, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SwipeableState<T> f7945p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SwipeableState<T> swipeableState) {
            super(1);
            this.f7945p0 = swipeableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Float f6) {
            float fFloatValue = f6.floatValue();
            SwipeableState<T> swipeableState = this.f7945p0;
            float floatValue = swipeableState.f7924g.getFloatValue() + fFloatValue;
            float fCoerceIn = kotlin.ranges.c.coerceIn(floatValue, swipeableState.getMinBound(), swipeableState.getMaxBound());
            float f10 = floatValue - fCoerceIn;
            ResistanceConfig resistance$material_release = swipeableState.getResistance$material_release();
            swipeableState.f7922e.setFloatValue(fCoerceIn + (resistance$material_release != null ? resistance$material_release.computeResistance(f10) : 0.0f));
            swipeableState.f7923f.setFloatValue(f10);
            swipeableState.f7924g.setFloatValue(floatValue);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Swipeable.kt */
    public static final class d extends Lambda implements Function0<Map<Float, ? extends T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SwipeableState<T> f7946p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(SwipeableState<T> swipeableState) {
            super(0);
            this.f7946p0 = swipeableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f7946p0.getAnchors$material_release();
        }
    }

    /* JADX INFO: compiled from: Swipeable.kt */
    public static final class e implements FlowCollector<Map<Float, ? extends T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SwipeableState<T> f7947p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ float f7948q0;

        public e(SwipeableState<T> swipeableState, float f6) {
            this.f7947p0 = swipeableState;
            this.f7948q0 = f6;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            Map map = (Map) obj;
            SwipeableState<T> swipeableState = this.f7947p0;
            Float fAccess$getOffset = SwipeableKt.access$getOffset(map, swipeableState.getCurrentValue());
            Intrinsics.checkNotNull(fAccess$getOffset);
            float fFloatValue = fAccess$getOffset.floatValue();
            Object obj2 = map.get(Boxing.boxFloat(SwipeableKt.access$computeTarget(swipeableState.getOffset().getValue().floatValue(), fFloatValue, map.keySet(), swipeableState.getThresholds$material_release(), this.f7948q0, swipeableState.getVelocityThreshold$material_release())));
            if (obj2 == null || !((Boolean) swipeableState.getConfirmStateChange$material_release().invoke(obj2)).booleanValue()) {
                Object objAccess$animateInternalToOffset = SwipeableState.access$animateInternalToOffset(swipeableState, fFloatValue, swipeableState.getAnimationSpec$material_release(), continuation);
                return objAccess$animateInternalToOffset == ek.a.getCOROUTINE_SUSPENDED() ? objAccess$animateInternalToOffset : Unit.INSTANCE;
            }
            Object objAnimateTo$default = SwipeableState.animateTo$default(this.f7947p0, obj2, null, continuation, 2, null);
            return objAnimateTo$default == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Swipeable.kt */
    @DebugMetadata(c = "androidx.compose.material.SwipeableState", f = "Swipeable.kt", i = {1, 1, 1, 2, 2, 2}, l = {159, 183, 186}, m = "processNewAnchors$material_release", n = {"this", "newAnchors", "targetOffset", "this", "newAnchors", "targetOffset"}, s = {"L$0", "L$1", "F$0", "L$0", "L$1", "F$0"})
    public static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public SwipeableState f7949p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Map f7950q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public float f7951r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f7952s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ SwipeableState<T> f7953t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f7954u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(SwipeableState<T> swipeableState, Continuation<? super f> continuation) {
            super(continuation);
            this.f7953t0 = swipeableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f7952s0 = obj;
            this.f7954u0 |= Integer.MIN_VALUE;
            return this.f7953t0.processNewAnchors$material_release(null, null, this);
        }
    }

    /* JADX INFO: compiled from: Swipeable.kt */
    @DebugMetadata(c = "androidx.compose.material.SwipeableState$snapInternalToOffset$2", f = "Swipeable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f7955p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ float f7956q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SwipeableState<T> f7957r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(SwipeableState swipeableState, float f6, Continuation continuation) {
            super(2, continuation);
            this.f7956q0 = f6;
            this.f7957r0 = swipeableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            g gVar = new g(this.f7957r0, this.f7956q0, continuation);
            gVar.f7955p0 = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DragScope dragScope, Continuation<? super Unit> continuation) {
            return ((g) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ((DragScope) this.f7955p0).dragBy(this.f7956q0 - this.f7957r0.f7924g.getFloatValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Swipeable.kt */
    public static final class h implements FlowCollector<Map<Float, ? extends T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ T f7958p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SwipeableState<T> f7959q0;

        /* JADX INFO: compiled from: Swipeable.kt */
        @DebugMetadata(c = "androidx.compose.material.SwipeableState$snapTo$2", f = "Swipeable.kt", i = {0}, l = {TypedValues.AttributesType.TYPE_PATH_ROTATE}, m = "emit", n = {"this"}, s = {"L$0"})
        public static final class a extends ContinuationImpl {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public h f7960p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public /* synthetic */ Object f7961q0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public int f7963s0;

            public a(Continuation<? super a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f7961q0 = obj;
                this.f7963s0 |= Integer.MIN_VALUE;
                return h.this.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public h(SwipeableState swipeableState, Object obj) {
            this.f7958p0 = obj;
            this.f7959q0 = swipeableState;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(@NotNull Map<Float, ? extends T> map, @NotNull Continuation<? super Unit> continuation) {
            a aVar;
            h hVar;
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i10 = aVar.f7963s0;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f7963s0 = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(continuation);
                }
            } else {
                aVar = new a(continuation);
            }
            Object obj = aVar.f7961q0;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i11 = aVar.f7963s0;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                Float fAccess$getOffset = SwipeableKt.access$getOffset(map, this.f7958p0);
                if (fAccess$getOffset == null) {
                    throw new IllegalArgumentException("The target value must have an associated anchor.".toString());
                }
                float fFloatValue = fAccess$getOffset.floatValue();
                aVar.f7960p0 = this;
                aVar.f7963s0 = 1;
                if (this.f7959q0.a(fFloatValue, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                hVar = this;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hVar = aVar.f7960p0;
                ResultKt.throwOnFailure(obj);
            }
            SwipeableState.access$setCurrentValue(hVar.f7959q0, hVar.f7958p0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Swipeable.kt */
    public static final class i extends Lambda implements Function2<Float, Float, Float> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i f7964p0 = new i(2);

        @Override // kotlin.jvm.functions.Function2
        public final Float invoke(Float f6, Float f10) {
            f6.floatValue();
            f10.floatValue();
            return Float.valueOf(0.0f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableState(T t10, @NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super T, Boolean> confirmStateChange) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        this.animationSpec = animationSpec;
        this.confirmStateChange = confirmStateChange;
        this.currentValue = SnapshotStateKt.mutableStateOf$default(t10, null, 2, null);
        this.isAnimationRunning = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.f7922e = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.f7923f = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.f7924g = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.f7925h = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.anchors = SnapshotStateKt.mutableStateOf$default(bk.q.emptyMap(), null, 2, null);
        final Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new d(this));
        this.f7927j = FlowKt.take(new Flow<Map<Float, ? extends T>>() { // from class: androidx.compose.material.SwipeableState$special$$inlined$filter$1

            /* JADX INFO: renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Swipeable.kt\nandroidx/compose/material/SwipeableState\n*L\n1#1,222:1\n21#2:223\n22#2:225\n128#3:224\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f7966p0;

                /* JADX INFO: renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material.SwipeableState$special$$inlined$filter$1$2", f = "Swipeable.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: p0, reason: collision with root package name */
                    public /* synthetic */ Object f7967p0;

                    /* JADX INFO: renamed from: q0, reason: collision with root package name */
                    public int f7968q0;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f7967p0 = obj;
                        this.f7968q0 |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f7966p0 = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i10 = anonymousClass1.f7968q0;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7968q0 = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.f7967p0;
                    Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                    int i11 = anonymousClass1.f7968q0;
                    if (i11 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        if (!((Map) obj).isEmpty()) {
                            anonymousClass1.f7968q0 = 1;
                            if (this.f7966p0.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowSnapshotFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == ek.a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, 1);
        this.minBound = Float.NEGATIVE_INFINITY;
        this.maxBound = Float.POSITIVE_INFINITY;
        this.thresholds = SnapshotStateKt.mutableStateOf$default(i.f7964p0, null, 2, null);
        this.velocityThreshold = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.resistance = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.draggableState = DraggableKt.DraggableState(new c(this));
    }

    public static final Object access$animateInternalToOffset(SwipeableState swipeableState, float f6, AnimationSpec animationSpec, Continuation continuation) {
        Object objA = u.e.a(swipeableState.draggableState, null, new h0.i3(swipeableState, f6, animationSpec, null), continuation, 1, null);
        return objA == ek.a.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }

    public static final void access$setCurrentValue(SwipeableState swipeableState, Object obj) {
        swipeableState.currentValue.setValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(SwipeableState swipeableState, Object obj, AnimationSpec animationSpec, Continuation continuation, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
        }
        if ((i10 & 2) != 0) {
            animationSpec = swipeableState.animationSpec;
        }
        return swipeableState.animateTo(obj, animationSpec, continuation);
    }

    public final Object a(float f6, Continuation<? super Unit> continuation) {
        Object objA = u.e.a(this.draggableState, null, new g(this, f6, null), continuation, 1, null);
        return objA == ek.a.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }

    @ExperimentalMaterialApi
    @Nullable
    public final Object animateTo(T t10, @NotNull AnimationSpec<Float> animationSpec, @NotNull Continuation<? super Unit> continuation) {
        Object objCollect = this.f7927j.collect(new b(t10, this, animationSpec), continuation);
        return objCollect == ek.a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    public final void ensureInit$material_release(@NotNull Map<Float, ? extends T> newAnchors) {
        Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
        if (getAnchors$material_release().isEmpty()) {
            Float fAccess$getOffset = SwipeableKt.access$getOffset(newAnchors, getCurrentValue());
            if (fAccess$getOffset == null) {
                throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
            }
            this.f7922e.setFloatValue(fAccess$getOffset.floatValue());
            this.f7924g.setFloatValue(fAccess$getOffset.floatValue());
        }
    }

    @NotNull
    public final Map<Float, T> getAnchors$material_release() {
        return (Map) this.anchors.getValue();
    }

    @NotNull
    public final AnimationSpec<Float> getAnimationSpec$material_release() {
        return this.animationSpec;
    }

    @NotNull
    public final Function1<T, Boolean> getConfirmStateChange$material_release() {
        return this.confirmStateChange;
    }

    public final T getCurrentValue() {
        return this.currentValue.getValue();
    }

    public final float getDirection() {
        Float fAccess$getOffset = SwipeableKt.access$getOffset(getAnchors$material_release(), getCurrentValue());
        if (fAccess$getOffset == null) {
            return 0.0f;
        }
        return Math.signum(getOffset().getValue().floatValue() - fAccess$getOffset.floatValue());
    }

    @NotNull
    /* JADX INFO: renamed from: getDraggableState$material_release, reason: from getter */
    public final DraggableState getDraggableState() {
        return this.draggableState;
    }

    /* JADX INFO: renamed from: getMaxBound$material_release, reason: from getter */
    public final float getMaxBound() {
        return this.maxBound;
    }

    /* JADX INFO: renamed from: getMinBound$material_release, reason: from getter */
    public final float getMinBound() {
        return this.minBound;
    }

    @NotNull
    public final State<Float> getOffset() {
        return this.f7922e;
    }

    @NotNull
    public final State<Float> getOverflow() {
        return this.f7923f;
    }

    @NotNull
    public final SwipeProgress<T> getProgress() {
        Object currentValue;
        Object value;
        float fFloatValue;
        List listA = SwipeableKt.a(getOffset().getValue().floatValue(), getAnchors$material_release().keySet());
        int size = listA.size();
        if (size == 0) {
            T currentValue2 = getCurrentValue();
            currentValue = getCurrentValue();
            value = currentValue2;
            fFloatValue = 1.0f;
        } else if (size != 1) {
            Pair pair = getDirection() > 0.0f ? TuplesKt.to(listA.get(0), listA.get(1)) : TuplesKt.to(listA.get(1), listA.get(0));
            float fFloatValue2 = ((Number) pair.component1()).floatValue();
            float fFloatValue3 = ((Number) pair.component2()).floatValue();
            value = bk.q.getValue(getAnchors$material_release(), Float.valueOf(fFloatValue2));
            currentValue = bk.q.getValue(getAnchors$material_release(), Float.valueOf(fFloatValue3));
            fFloatValue = (getOffset().getValue().floatValue() - fFloatValue2) / (fFloatValue3 - fFloatValue2);
        } else {
            Object value2 = bk.q.getValue(getAnchors$material_release(), listA.get(0));
            currentValue = bk.q.getValue(getAnchors$material_release(), listA.get(0));
            fFloatValue = 1.0f;
            value = value2;
        }
        return new SwipeProgress<>(value, currentValue, fFloatValue);
    }

    @Nullable
    public final ResistanceConfig getResistance$material_release() {
        return (ResistanceConfig) this.resistance.getValue();
    }

    public final T getTargetValue() {
        float fAccess$computeTarget;
        Float value = this.f7925h.getValue();
        if (value != null) {
            fAccess$computeTarget = value.floatValue();
        } else {
            float fFloatValue = getOffset().getValue().floatValue();
            Float fAccess$getOffset = SwipeableKt.access$getOffset(getAnchors$material_release(), getCurrentValue());
            fAccess$computeTarget = SwipeableKt.access$computeTarget(fFloatValue, fAccess$getOffset != null ? fAccess$getOffset.floatValue() : getOffset().getValue().floatValue(), getAnchors$material_release().keySet(), getThresholds$material_release(), 0.0f, Float.POSITIVE_INFINITY);
        }
        T t10 = getAnchors$material_release().get(Float.valueOf(fAccess$computeTarget));
        return t10 == null ? getCurrentValue() : t10;
    }

    @NotNull
    public final Function2<Float, Float, Float> getThresholds$material_release() {
        return (Function2) this.thresholds.getValue();
    }

    public final float getVelocityThreshold$material_release() {
        return this.velocityThreshold.getFloatValue();
    }

    public final boolean isAnimationRunning() {
        return ((Boolean) this.isAnimationRunning.getValue()).booleanValue();
    }

    public final float performDrag(float delta) {
        MutableFloatState mutableFloatState = this.f7924g;
        float fCoerceIn = kotlin.ranges.c.coerceIn(mutableFloatState.getFloatValue() + delta, this.minBound, this.maxBound) - mutableFloatState.getFloatValue();
        if (Math.abs(fCoerceIn) > 0.0f) {
            this.draggableState.dispatchRawDelta(fCoerceIn);
        }
        return fCoerceIn;
    }

    @Nullable
    public final Object performFling(float f6, @NotNull Continuation<? super Unit> continuation) {
        Object objCollect = this.f7927j.collect(new e(this, f6), continuation);
        return objCollect == ek.a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:90:0x0239 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:91:0x023a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v21, types: [float] */
    /* JADX WARN: Type inference failed for: r11v74, types: [float] */
    /* JADX WARN: Type inference failed for: r11v76, types: [float] */
    /* JADX WARN: Type inference failed for: r11v87 */
    /* JADX WARN: Type inference failed for: r11v88 */
    /* JADX WARN: Type inference failed for: r11v89 */
    /* JADX WARN: Type inference failed for: r11v90 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Nullable
    public final Object processNewAnchors$material_release(@NotNull Map<Float, ? extends T> map, @NotNull Map<Float, ? extends T> map2, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        f fVar;
        SwipeableState swipeableState;
        Object next;
        SwipeableState swipeableState2;
        SwipeableState swipeableState3;
        Object next2;
        SwipeableState swipeableState4;
        float f6;
        float f10;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i10 = fVar.f7954u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f7954u0 = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, continuation);
            }
        } else {
            fVar = new f(this, continuation);
        }
        Object obj = fVar.f7952s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        ?? r1 = fVar.f7954u0;
        try {
            if (r1 == 0) {
                ResultKt.throwOnFailure(obj);
                if (map.isEmpty()) {
                    Float fM5661minOrNull = CollectionsKt___CollectionsKt.m5661minOrNull((Iterable<Float>) map2.keySet());
                    Intrinsics.checkNotNull(fM5661minOrNull);
                    this.minBound = fM5661minOrNull.floatValue();
                    Float fM5653maxOrNull = CollectionsKt___CollectionsKt.m5653maxOrNull((Iterable<Float>) map2.keySet());
                    Intrinsics.checkNotNull(fM5653maxOrNull);
                    this.maxBound = fM5653maxOrNull.floatValue();
                    Float fAccess$getOffset = SwipeableKt.access$getOffset(map2, getCurrentValue());
                    if (fAccess$getOffset == null) {
                        throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
                    }
                    float fFloatValue = fAccess$getOffset.floatValue();
                    fVar.f7954u0 = 1;
                    if (a(fFloatValue, fVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                if (!Intrinsics.areEqual(map2, map)) {
                    this.minBound = Float.NEGATIVE_INFINITY;
                    this.maxBound = Float.POSITIVE_INFINITY;
                    Float value = this.f7925h.getValue();
                    if (value != null) {
                        Float fAccess$getOffset2 = SwipeableKt.access$getOffset(map2, map.get(value));
                        if (fAccess$getOffset2 != null) {
                            map = (Map<Float, ? extends T>) fAccess$getOffset2.floatValue();
                        } else {
                            Iterator<T> it = map2.keySet().iterator();
                            if (it.hasNext()) {
                                next2 = it.next();
                                if (it.hasNext()) {
                                    float fAbs = Math.abs(((Number) next2).floatValue() - value.floatValue());
                                    do {
                                        Object next3 = it.next();
                                        float fAbs2 = Math.abs(((Number) next3).floatValue() - value.floatValue());
                                        if (Float.compare(fAbs, fAbs2) > 0) {
                                            next2 = next3;
                                            fAbs = fAbs2;
                                        }
                                    } while (it.hasNext());
                                }
                            } else {
                                next2 = null;
                            }
                            Intrinsics.checkNotNull(next2);
                            map = (Map<Float, ? extends T>) ((Number) next2).floatValue();
                        }
                    } else {
                        T currentValue = map.get(getOffset().getValue());
                        if (Intrinsics.areEqual(currentValue, getCurrentValue())) {
                            currentValue = getCurrentValue();
                        }
                        Float fAccess$getOffset3 = SwipeableKt.access$getOffset(map2, currentValue);
                        if (fAccess$getOffset3 != null) {
                            map = fAccess$getOffset3.floatValue();
                        } else {
                            Iterator<T> it2 = map2.keySet().iterator();
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (it2.hasNext()) {
                                    float fAbs3 = Math.abs(((Number) next).floatValue() - getOffset().getValue().floatValue());
                                    do {
                                        Object next4 = it2.next();
                                        float fAbs4 = Math.abs(((Number) next4).floatValue() - getOffset().getValue().floatValue());
                                        if (Float.compare(fAbs3, fAbs4) > 0) {
                                            next = next4;
                                            fAbs3 = fAbs4;
                                        }
                                    } while (it2.hasNext());
                                }
                            } else {
                                next = null;
                            }
                            Intrinsics.checkNotNull(next);
                            map = ((Number) next).floatValue();
                        }
                    }
                    try {
                        AnimationSpec<Float> animationSpec = this.animationSpec;
                        fVar.f7949p0 = this;
                        fVar.f7950q0 = map2;
                        fVar.f7951r0 = (float) map;
                        fVar.f7954u0 = 2;
                        Object objA = u.e.a(this.draggableState, null, new h0.i3(this, (float) map, animationSpec, null), fVar, 1, null);
                        if (objA != ek.a.getCOROUTINE_SUSPENDED()) {
                            objA = Unit.INSTANCE;
                        }
                        if (objA == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        swipeableState3 = this;
                        f6 = map;
                        swipeableState3.currentValue.setValue(bk.q.getValue(map2, Boxing.boxFloat(f6)));
                        Float fM5661minOrNull2 = CollectionsKt___CollectionsKt.m5661minOrNull((Iterable<Float>) map2.keySet());
                        Intrinsics.checkNotNull(fM5661minOrNull2);
                        swipeableState3.minBound = fM5661minOrNull2.floatValue();
                        Float fM5653maxOrNull2 = CollectionsKt___CollectionsKt.m5653maxOrNull((Iterable<Float>) map2.keySet());
                        Intrinsics.checkNotNull(fM5653maxOrNull2);
                        swipeableState3.maxBound = fM5653maxOrNull2.floatValue();
                    } catch (CancellationException unused) {
                        swipeableState2 = this;
                        fVar.f7949p0 = swipeableState2;
                        fVar.f7950q0 = map2;
                        fVar.f7951r0 = map;
                        fVar.f7954u0 = 3;
                        if (swipeableState2.a(map, fVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        swipeableState4 = swipeableState2;
                        f10 = map;
                        swipeableState4.currentValue.setValue(bk.q.getValue(map2, Boxing.boxFloat(f10)));
                        Float fM5661minOrNull3 = CollectionsKt___CollectionsKt.m5661minOrNull((Iterable<Float>) map2.keySet());
                        Intrinsics.checkNotNull(fM5661minOrNull3);
                        swipeableState4.minBound = fM5661minOrNull3.floatValue();
                        Float fM5653maxOrNull3 = CollectionsKt___CollectionsKt.m5653maxOrNull((Iterable<Float>) map2.keySet());
                        Intrinsics.checkNotNull(fM5653maxOrNull3);
                        swipeableState4.maxBound = fM5653maxOrNull3.floatValue();
                    } catch (Throwable th2) {
                        th = th2;
                        swipeableState = this;
                        swipeableState.currentValue.setValue(bk.q.getValue(map2, Boxing.boxFloat(map)));
                        Float fM5661minOrNull4 = CollectionsKt___CollectionsKt.m5661minOrNull((Iterable<Float>) map2.keySet());
                        Intrinsics.checkNotNull(fM5661minOrNull4);
                        swipeableState.minBound = fM5661minOrNull4.floatValue();
                        Float fM5653maxOrNull4 = CollectionsKt___CollectionsKt.m5653maxOrNull((Iterable<Float>) map2.keySet());
                        Intrinsics.checkNotNull(fM5653maxOrNull4);
                        swipeableState.maxBound = fM5653maxOrNull4.floatValue();
                        throw th;
                    }
                }
            } else {
                if (r1 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (r1 == 2) {
                    map = (Map<Float, ? extends T>) fVar.f7951r0;
                    map2 = fVar.f7950q0;
                    swipeableState2 = fVar.f7949p0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        swipeableState3 = swipeableState2;
                        f6 = map;
                        swipeableState3.currentValue.setValue(bk.q.getValue(map2, Boxing.boxFloat(f6)));
                        Float fM5661minOrNull5 = CollectionsKt___CollectionsKt.m5661minOrNull((Iterable<Float>) map2.keySet());
                        Intrinsics.checkNotNull(fM5661minOrNull5);
                        swipeableState3.minBound = fM5661minOrNull5.floatValue();
                        Float fM5653maxOrNull5 = CollectionsKt___CollectionsKt.m5653maxOrNull((Iterable<Float>) map2.keySet());
                        Intrinsics.checkNotNull(fM5653maxOrNull5);
                        swipeableState3.maxBound = fM5653maxOrNull5.floatValue();
                    } catch (CancellationException unused2) {
                        fVar.f7949p0 = swipeableState2;
                        fVar.f7950q0 = map2;
                        fVar.f7951r0 = map;
                        fVar.f7954u0 = 3;
                        if (swipeableState2.a(map, fVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        swipeableState4 = swipeableState2;
                        f10 = map;
                        swipeableState4.currentValue.setValue(bk.q.getValue(map2, Boxing.boxFloat(f10)));
                        Float fM5661minOrNull6 = CollectionsKt___CollectionsKt.m5661minOrNull((Iterable<Float>) map2.keySet());
                        Intrinsics.checkNotNull(fM5661minOrNull6);
                        swipeableState4.minBound = fM5661minOrNull6.floatValue();
                        Float fM5653maxOrNull6 = CollectionsKt___CollectionsKt.m5653maxOrNull((Iterable<Float>) map2.keySet());
                        Intrinsics.checkNotNull(fM5653maxOrNull6);
                        swipeableState4.maxBound = fM5653maxOrNull6.floatValue();
                    }
                } else {
                    if (r1 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    map = (Map<Float, ? extends T>) fVar.f7951r0;
                    map2 = fVar.f7950q0;
                    swipeableState = fVar.f7949p0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        swipeableState4 = swipeableState;
                        f10 = map;
                        swipeableState4.currentValue.setValue(bk.q.getValue(map2, Boxing.boxFloat(f10)));
                        Float fM5661minOrNull7 = CollectionsKt___CollectionsKt.m5661minOrNull((Iterable<Float>) map2.keySet());
                        Intrinsics.checkNotNull(fM5661minOrNull7);
                        swipeableState4.minBound = fM5661minOrNull7.floatValue();
                        Float fM5653maxOrNull7 = CollectionsKt___CollectionsKt.m5653maxOrNull((Iterable<Float>) map2.keySet());
                        Intrinsics.checkNotNull(fM5653maxOrNull7);
                        swipeableState4.maxBound = fM5653maxOrNull7.floatValue();
                    } catch (Throwable th3) {
                        th = th3;
                        swipeableState.currentValue.setValue(bk.q.getValue(map2, Boxing.boxFloat(map)));
                        Float fM5661minOrNull8 = CollectionsKt___CollectionsKt.m5661minOrNull((Iterable<Float>) map2.keySet());
                        Intrinsics.checkNotNull(fM5661minOrNull8);
                        swipeableState.minBound = fM5661minOrNull8.floatValue();
                        Float fM5653maxOrNull8 = CollectionsKt___CollectionsKt.m5653maxOrNull((Iterable<Float>) map2.keySet());
                        Intrinsics.checkNotNull(fM5653maxOrNull8);
                        swipeableState.maxBound = fM5653maxOrNull8.floatValue();
                        throw th;
                    }
                }
            }
            return Unit.INSTANCE;
        } catch (Throwable th4) {
            th = th4;
            swipeableState = r1;
        }
    }

    public final void setAnchors$material_release(@NotNull Map<Float, ? extends T> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.anchors.setValue(map);
    }

    public final void setMaxBound$material_release(float f6) {
        this.maxBound = f6;
    }

    public final void setMinBound$material_release(float f6) {
        this.minBound = f6;
    }

    public final void setResistance$material_release(@Nullable ResistanceConfig resistanceConfig) {
        this.resistance.setValue(resistanceConfig);
    }

    public final void setThresholds$material_release(@NotNull Function2<? super Float, ? super Float, Float> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.thresholds.setValue(function2);
    }

    public final void setVelocityThreshold$material_release(float f6) {
        this.velocityThreshold.setFloatValue(f6);
    }

    @ExperimentalMaterialApi
    @Nullable
    public final Object snapTo(T t10, @NotNull Continuation<? super Unit> continuation) {
        Object objCollect = this.f7927j.collect(new h(this, t10), continuation);
        return objCollect == ek.a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getDirection$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getProgress$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getTargetValue$annotations() {
    }

    public /* synthetic */ SwipeableState(Object obj, AnimationSpec animationSpec, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i10 & 4) != 0 ? a.f7936p0 : function1);
    }
}
