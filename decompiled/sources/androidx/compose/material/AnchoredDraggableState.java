package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragScope;
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
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b6\b\u0001\u0018\u0000 t*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002utBu\u0012\u0006\u0010q\u001a\u00028\u0000\u0012!\u0010/\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u00030)\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000300\u0012\u000e\b\u0002\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000306\u0012#\b\u0002\u0010?\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u000e0)¢\u0006\u0004\br\u0010sJ\u0006\u0010\u0004\u001a\u00020\u0003J5\u0010\f\u001a\u00020\t2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013Jg\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u00142H\u0010\u001d\u001aD\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0016¢\u0006\u0002\b\u001cH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJo\u0010\u001e\u001a\u00020\t2\u0006\u0010 \u001a\u00028\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142H\u0010\u001d\u001aD\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0016¢\u0006\u0002\b\u001cH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010!J\u0017\u0010%\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0003H\u0000¢\u0006\u0004\b#\u0010$J\u000e\u0010&\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0003J\u0017\u0010(\u001a\u00020\u000e2\u0006\u0010 \u001a\u00028\u0000H\u0000¢\u0006\u0004\b'\u0010\u0010R5\u0010/\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u00030)8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R \u00105\u001a\b\u0012\u0004\u0012\u00020\u0003008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0003068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R5\u0010?\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u000e0)8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010,\u001a\u0004\b>\u0010.R\u001a\u0010E\u001a\u00020@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR+\u0010M\u001a\u00028\u00002\u0006\u0010F\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001b\u0010 \u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010JR\u001b\u0010S\u001a\u00028\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010O\u001a\u0004\bR\u0010JR1\u0010[\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u00038F@BX\u0086\u008e\u0002¢\u0006\u0018\n\u0004\bT\u0010H\u0012\u0004\bY\u0010Z\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001b\u0010^\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010O\u001a\u0004\b]\u0010VR+\u0010c\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u00038F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010V\"\u0004\bb\u0010XR\u001b\u0010f\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bd\u0010O\u001a\u0004\be\u0010VR\u001b\u0010i\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bg\u0010O\u001a\u0004\bh\u0010VRC\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u00058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bj\u0010H\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u0011\u0010o\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bo\u0010p\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006v"}, d2 = {"Landroidx/compose/material/AnchoredDraggableState;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "requireOffset", "", "newAnchors", "Landroidx/compose/material/AnchoredDraggableState$AnchorChangedCallback;", "onAnchorsChanged", "", "updateAnchors$material_release", "(Ljava/util/Map;Landroidx/compose/material/AnchoredDraggableState$AnchorChangedCallback;)V", "updateAnchors", "value", "", "hasAnchorForValue", "(Ljava/lang/Object;)Z", "velocity", "settle", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function3;", "Landroidx/compose/material/AnchoredDragScope;", "Lkotlin/ParameterName;", "name", "anchors", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "block", "anchoredDrag", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "targetValue", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "newOffsetForDelta$material_release", "(F)F", "newOffsetForDelta", "dispatchRawDelta", "trySnapTo$material_release", "trySnapTo", "Lkotlin/Function1;", "totalDistance", "a", "Lkotlin/jvm/functions/Function1;", "getPositionalThreshold$material_release", "()Lkotlin/jvm/functions/Function1;", "positionalThreshold", "Lkotlin/Function0;", "b", "Lkotlin/jvm/functions/Function0;", "getVelocityThreshold$material_release", "()Lkotlin/jvm/functions/Function0;", "velocityThreshold", "Landroidx/compose/animation/core/AnimationSpec;", "c", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "newValue", "d", "getConfirmValueChange$material_release", "confirmValueChange", "Landroidx/compose/foundation/gestures/DraggableState;", "f", "Landroidx/compose/foundation/gestures/DraggableState;", "getDraggableState$material_release", "()Landroidx/compose/foundation/gestures/DraggableState;", "draggableState", "<set-?>", "g", "Landroidx/compose/runtime/MutableState;", "getCurrentValue", "()Ljava/lang/Object;", "setCurrentValue", "(Ljava/lang/Object;)V", "currentValue", "h", "Landroidx/compose/runtime/State;", "getTargetValue", "i", "getClosestValue$material_release", "closestValue", "j", "getOffset", "()F", "setOffset", "(F)V", "getOffset$annotations", "()V", TypedValues.CycleType.S_WAVE_OFFSET, "k", "getProgress", "progress", "l", "Landroidx/compose/runtime/MutableFloatState;", "getLastVelocity", "setLastVelocity", "lastVelocity", "m", "getMinOffset", "minOffset", "n", "getMaxOffset", "maxOffset", "p", "getAnchors$material_release", "()Ljava/util/Map;", "setAnchors$material_release", "(Ljava/util/Map;)V", "isAnimationRunning", "()Z", "initialValue", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "Companion", "AnchorChangedCallback", "material_release"}, k = 1, mv = {1, 8, 0})
@Stable
@ExperimentalMaterialApi
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/AnchoredDraggableState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,710:1\n81#2:711\n107#2,2:712\n81#2:714\n81#2:715\n81#2:716\n107#2,2:717\n81#2:719\n81#2:723\n81#2:724\n81#2:725\n107#2,2:726\n81#2:728\n107#2,2:729\n75#3:720\n108#3,2:721\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/AnchoredDraggableState\n*L\n162#1:711\n162#1:712,2\n170#1:714\n184#1:715\n203#1:716\n203#1:717,2\n231#1:719\n255#1:723\n261#1:724\n263#1:725\n263#1:726,2\n265#1:728\n265#1:729,2\n248#1:720\n248#1:721,2\n*E\n"})
public final class AnchoredDraggableState<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<Float, Float> positionalThreshold;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Float> velocityThreshold;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AnimationSpec<Float> animationSpec;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<T, Boolean> confirmValueChange;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final InternalMutatorMutex f6572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final AnchoredDraggableState$draggableState$1 f6573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState currentValue;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final State targetValue;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final State closestValue;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState offset;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final State progress;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableFloatState lastVelocity;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final State minOffset;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final State maxOffset;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final MutableState f6581o;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState anchors;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final AnchoredDraggableState$anchoredDragScope$1 f6583q;

    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0003\bç\u0080\u0001\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J=\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0002\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/material/AnchoredDraggableState$AnchorChangedCallback;", ExifInterface.GPS_DIRECTION_TRUE, "", "onAnchorsChanged", "", "previousTargetValue", "previousAnchors", "", "", "newAnchors", "(Ljava/lang/Object;Ljava/util/Map;Ljava/util/Map;)V", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ExperimentalMaterialApi
    public interface AnchorChangedCallback<T> {
        void onAnchorsChanged(T previousTargetValue, @NotNull Map<T, Float> previousAnchors, @NotNull Map<T, Float> newAnchors);
    }

    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jw\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0001\u0010\u0006*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\f0\u000b2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0012H\u0007¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/AnchoredDraggableState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/AnchoredDraggableState;", ExifInterface.GPS_DIRECTION_TRUE, "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmValueChange", "Lkotlin/Function1;", "", "positionalThreshold", "Lkotlin/ParameterName;", "name", "distance", "velocityThreshold", "Lkotlin/Function0;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: AnchoredDraggable.kt */
        public static final class a extends Lambda implements Function2<SaverScope, AnchoredDraggableState<T>, T> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f6584p0 = new a(2);

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SaverScope saverScope, Object obj) {
                SaverScope Saver = saverScope;
                AnchoredDraggableState it = (AnchoredDraggableState) obj;
                Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getCurrentValue();
            }
        }

        /* JADX INFO: compiled from: AnchoredDraggable.kt */
        public static final class b extends Lambda implements Function1<T, AnchoredDraggableState<T>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Function1<Float, Float> f6585p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Function0<Float> f6586q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ AnimationSpec<Float> f6587r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ Function1<T, Boolean> f6588s0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AnimationSpec animationSpec, Function1 function1, Function1 function2, Function0 function0) {
                super(1);
                this.f6585p0 = function1;
                this.f6586q0 = function0;
                this.f6587r0 = animationSpec;
                this.f6588s0 = function2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new AnchoredDraggableState(it, this.f6585p0, this.f6586q0, this.f6587r0, this.f6588s0);
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @ExperimentalMaterialApi
        @NotNull
        public final <T> Saver<AnchoredDraggableState<T>, T> Saver(@NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super T, Boolean> confirmValueChange, @NotNull Function1<? super Float, Float> positionalThreshold, @NotNull Function0<Float> velocityThreshold) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
            Intrinsics.checkNotNullParameter(positionalThreshold, "positionalThreshold");
            Intrinsics.checkNotNullParameter(velocityThreshold, "velocityThreshold");
            return SaverKt.Saver(a.f6584p0, new b(animationSpec, positionalThreshold, confirmValueChange, velocityThreshold));
        }
    }

    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    public static final class a extends Lambda implements Function1<T, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f6589p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    public static final class b extends Lambda implements Function0<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ AnchoredDraggableState<T> f6591p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AnchoredDraggableState<T> anchoredDraggableState) {
            super(0);
            this.f6591p0 = anchoredDraggableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            AnchoredDraggableState<T> anchoredDraggableState = this.f6591p0;
            T t10 = (T) AnchoredDraggableState.access$getAnimationTarget(anchoredDraggableState);
            if (t10 != null) {
                return t10;
            }
            float offset = anchoredDraggableState.getOffset();
            return !Float.isNaN(offset) ? (T) AnchoredDraggableState.access$computeTargetWithoutThresholds(anchoredDraggableState, offset, anchoredDraggableState.getCurrentValue()) : anchoredDraggableState.getCurrentValue();
        }
    }

    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableState$doAnchoredDrag$2", f = "AnchoredDraggable.kt", i = {}, l = {441}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/AnchoredDraggableState$doAnchoredDrag$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,710:1\n288#2,2:711\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/AnchoredDraggableState$doAnchoredDrag$2\n*L\n450#1:711,2\n*E\n"})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f6592p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ T f6593q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ AnchoredDraggableState<T> f6594r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ MutatePriority f6595s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function3<AnchoredDragScope, Map<T, Float>, Continuation<? super Unit>, Object> f6596t0;

        /* JADX INFO: compiled from: AnchoredDraggable.kt */
        @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableState$doAnchoredDrag$2$1", f = "AnchoredDraggable.kt", i = {}, l = {443}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f6597p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ T f6598q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ AnchoredDraggableState<T> f6599r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ Function3<AnchoredDragScope, Map<T, Float>, Continuation<? super Unit>, Object> f6600s0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(T t10, AnchoredDraggableState<T> anchoredDraggableState, Function3<? super AnchoredDragScope, ? super Map<T, Float>, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f6598q0 = t10;
                this.f6599r0 = anchoredDraggableState;
                this.f6600s0 = function3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new a(this.f6598q0, this.f6599r0, this.f6600s0, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super Unit> continuation) {
                return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f6597p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    AnchoredDraggableState<T> anchoredDraggableState = this.f6599r0;
                    T t10 = this.f6598q0;
                    if (t10 != null) {
                        AnchoredDraggableState.access$setAnimationTarget(anchoredDraggableState, t10);
                    }
                    AnchoredDragScope anchoredDragScope = anchoredDraggableState.f6583q;
                    Map<T, Float> anchors$material_release = anchoredDraggableState.getAnchors$material_release();
                    this.f6597p0 = 1;
                    if (this.f6600s0.invoke(anchoredDragScope, anchors$material_release, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(AnchoredDraggableState anchoredDraggableState, Object obj, MutatePriority mutatePriority, Function3 function3, Continuation continuation) {
            super(2, continuation);
            this.f6593q0 = obj;
            this.f6594r0 = anchoredDraggableState;
            this.f6595s0 = mutatePriority;
            this.f6596t0 = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.f6594r0, this.f6593q0, this.f6595s0, this.f6596t0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            T next;
            Object key;
            T next2;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f6592p0;
            T t10 = this.f6593q0;
            AnchoredDraggableState<T> anchoredDraggableState = this.f6594r0;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (t10 == null || anchoredDraggableState.getAnchors$material_release().containsKey(t10)) {
                        InternalMutatorMutex internalMutatorMutex = anchoredDraggableState.f6572e;
                        MutatePriority mutatePriority = this.f6595s0;
                        a aVar = new a(t10, anchoredDraggableState, this.f6596t0, null);
                        this.f6592p0 = 1;
                        if (internalMutatorMutex.mutate(mutatePriority, aVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (anchoredDraggableState.getConfirmValueChange$material_release().invoke(t10).booleanValue()) {
                        AnchoredDraggableState.access$setCurrentValue(anchoredDraggableState, t10);
                    }
                    return Unit.INSTANCE;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (t10 != null) {
                    AnchoredDraggableState.access$setAnimationTarget(anchoredDraggableState, null);
                }
                Iterator<T> it = anchoredDraggableState.getAnchors$material_release().entrySet().iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (Math.abs(((Number) ((Map.Entry) next2).getValue()).floatValue() - anchoredDraggableState.getOffset()) >= 0.5f);
                Map.Entry entry = (Map.Entry) next2;
                key = entry != null ? entry.getKey() : null;
                if (key != null && ((Boolean) anchoredDraggableState.getConfirmValueChange$material_release().invoke(key)).booleanValue()) {
                    AnchoredDraggableState.access$setCurrentValue(anchoredDraggableState, key);
                }
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                if (t10 != null) {
                    AnchoredDraggableState.access$setAnimationTarget(anchoredDraggableState, null);
                }
                Iterator<T> it2 = anchoredDraggableState.getAnchors$material_release().entrySet().iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (Math.abs(((Number) ((Map.Entry) next).getValue()).floatValue() - anchoredDraggableState.getOffset()) >= 0.5f);
                Map.Entry entry2 = (Map.Entry) next;
                key = entry2 != null ? entry2.getKey() : null;
                if (key != null && ((Boolean) anchoredDraggableState.getConfirmValueChange$material_release().invoke(key)).booleanValue()) {
                    AnchoredDraggableState.access$setCurrentValue(anchoredDraggableState, key);
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    public static final class d extends Lambda implements Function0<Float> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ AnchoredDraggableState<T> f6601p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AnchoredDraggableState<T> anchoredDraggableState) {
            super(0);
            this.f6601p0 = anchoredDraggableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            Float fAccess$maxOrNull = AnchoredDraggableKt.access$maxOrNull(this.f6601p0.getAnchors$material_release());
            return Float.valueOf(fAccess$maxOrNull != null ? fAccess$maxOrNull.floatValue() : Float.POSITIVE_INFINITY);
        }
    }

    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    public static final class e extends Lambda implements Function0<Float> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ AnchoredDraggableState<T> f6608p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AnchoredDraggableState<T> anchoredDraggableState) {
            super(0);
            this.f6608p0 = anchoredDraggableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            Float fAccess$minOrNull = AnchoredDraggableKt.access$minOrNull(this.f6608p0.getAnchors$material_release());
            return Float.valueOf(fAccess$minOrNull != null ? fAccess$minOrNull.floatValue() : Float.NEGATIVE_INFINITY);
        }
    }

    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    public static final class f extends Lambda implements Function0<Float> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ AnchoredDraggableState<T> f6609p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AnchoredDraggableState<T> anchoredDraggableState) {
            super(0);
            this.f6609p0 = anchoredDraggableState;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x004f  */
        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            AnchoredDraggableState<T> anchoredDraggableState = this.f6609p0;
            Float f6 = anchoredDraggableState.getAnchors$material_release().get(anchoredDraggableState.getCurrentValue());
            float f10 = 0.0f;
            float fFloatValue = f6 != null ? f6.floatValue() : 0.0f;
            Float f11 = anchoredDraggableState.getAnchors$material_release().get(anchoredDraggableState.getClosestValue$material_release());
            float fFloatValue2 = (f11 != null ? f11.floatValue() : 0.0f) - fFloatValue;
            if (Math.abs(fFloatValue2) > 1.0E-6f) {
                float fRequireOffset = (anchoredDraggableState.requireOffset() - fFloatValue) / fFloatValue2;
                if (fRequireOffset >= 1.0E-6f) {
                    if (fRequireOffset > 0.999999f) {
                        f10 = 1.0f;
                    } else {
                        f10 = fRequireOffset;
                    }
                }
            } else {
                f10 = 1.0f;
            }
            return Float.valueOf(f10);
        }
    }

    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    public static final class g extends Lambda implements Function0<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ AnchoredDraggableState<T> f6610p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AnchoredDraggableState<T> anchoredDraggableState) {
            super(0);
            this.f6610p0 = anchoredDraggableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            AnchoredDraggableState<T> anchoredDraggableState = this.f6610p0;
            T t10 = (T) AnchoredDraggableState.access$getAnimationTarget(anchoredDraggableState);
            if (t10 != null) {
                return t10;
            }
            float offset = anchoredDraggableState.getOffset();
            return !Float.isNaN(offset) ? (T) AnchoredDraggableState.access$computeTarget(anchoredDraggableState, offset, anchoredDraggableState.getCurrentValue(), 0.0f) : anchoredDraggableState.getCurrentValue();
        }
    }

    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    public static final class h extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ AnchoredDraggableState<T> f6611p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ T f6612q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(AnchoredDraggableState<T> anchoredDraggableState, T t10) {
            super(0);
            this.f6611p0 = anchoredDraggableState;
            this.f6612q0 = t10;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            AnchoredDraggableState<T> anchoredDraggableState = this.f6611p0;
            AnchoredDragScope anchoredDragScope = anchoredDraggableState.f6583q;
            Map<T, Float> anchors$material_release = anchoredDraggableState.getAnchors$material_release();
            T t10 = this.f6612q0;
            Float f6 = anchors$material_release.get(t10);
            if (f6 != null) {
                h0.a.a(anchoredDragScope, f6.floatValue(), 0.0f, 2, null);
                AnchoredDraggableState.access$setAnimationTarget(anchoredDraggableState, null);
            }
            AnchoredDraggableState.access$setCurrentValue(anchoredDraggableState, t10);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v20, types: [androidx.compose.material.AnchoredDraggableState$anchoredDragScope$1] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.material.AnchoredDraggableState$draggableState$1] */
    public AnchoredDraggableState(T t10, @NotNull Function1<? super Float, Float> positionalThreshold, @NotNull Function0<Float> velocityThreshold, @NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super T, Boolean> confirmValueChange) {
        Intrinsics.checkNotNullParameter(positionalThreshold, "positionalThreshold");
        Intrinsics.checkNotNullParameter(velocityThreshold, "velocityThreshold");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
        this.positionalThreshold = positionalThreshold;
        this.velocityThreshold = velocityThreshold;
        this.animationSpec = animationSpec;
        this.confirmValueChange = confirmValueChange;
        this.f6572e = new InternalMutatorMutex();
        this.f6573f = new DraggableState(this) { // from class: androidx.compose.material.AnchoredDraggableState$draggableState$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final AnchoredDraggableState$draggableState$1$dragScope$1 f6602a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AnchoredDraggableState<T> f6603b;

            /* JADX INFO: Add missing generic type declarations: [T] */
            /* JADX INFO: compiled from: AnchoredDraggable.kt */
            @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/AnchoredDraggableState$draggableState$1$drag$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,710:1\n1#2:711\n*E\n"})
            public static final class a<T> extends SuspendLambda implements Function3<AnchoredDragScope, Map<T, ? extends Float>, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public int f6604p0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ Function2<DragScope, Continuation<? super Unit>, Object> f6606r0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Function2 function2, Continuation continuation) {
                    super(3, continuation);
                    this.f6606r0 = function2;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(AnchoredDragScope anchoredDragScope, Object obj, Continuation<? super Unit> continuation) {
                    return AnchoredDraggableState$draggableState$1.this.new a(this.f6606r0, continuation).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                    int i10 = this.f6604p0;
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        AnchoredDraggableState$draggableState$1$dragScope$1 anchoredDraggableState$draggableState$1$dragScope$1 = AnchoredDraggableState$draggableState$1.this.f6602a;
                        this.f6604p0 = 1;
                        if (this.f6606r0.invoke(anchoredDraggableState$draggableState$1$dragScope$1, this) == coroutine_suspended) {
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

            /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.material.AnchoredDraggableState$draggableState$1$dragScope$1] */
            {
                this.f6603b = this;
                this.f6602a = new DragScope() { // from class: androidx.compose.material.AnchoredDraggableState$draggableState$1$dragScope$1
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // androidx.compose.foundation.gestures.DragScope
                    public void dragBy(float pixels) {
                        AnchoredDraggableState<T> anchoredDraggableState = this;
                        h0.a.a(anchoredDraggableState.f6583q, anchoredDraggableState.newOffsetForDelta$material_release(pixels), 0.0f, 2, null);
                    }
                };
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // androidx.compose.foundation.gestures.DraggableState
            public void dispatchRawDelta(float delta) {
                this.f6603b.dispatchRawDelta(delta);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // androidx.compose.foundation.gestures.DraggableState
            @Nullable
            public Object drag(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super DragScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
                Object objAnchoredDrag = this.f6603b.anchoredDrag(mutatePriority, new a(function2, null), continuation);
                return objAnchoredDrag == ek.a.getCOROUTINE_SUSPENDED() ? objAnchoredDrag : Unit.INSTANCE;
            }
        };
        this.currentValue = SnapshotStateKt.mutableStateOf$default(t10, null, 2, null);
        this.targetValue = SnapshotStateKt.derivedStateOf(new g(this));
        this.closestValue = SnapshotStateKt.derivedStateOf(new b(this));
        this.offset = SnapshotStateKt.mutableStateOf$default(Float.valueOf(Float.NaN), null, 2, null);
        this.progress = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new f(this));
        this.lastVelocity = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.minOffset = SnapshotStateKt.derivedStateOf(new e(this));
        this.maxOffset = SnapshotStateKt.derivedStateOf(new d(this));
        this.f6581o = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.anchors = SnapshotStateKt.mutableStateOf$default(bk.q.emptyMap(), null, 2, null);
        this.f6583q = new AnchoredDragScope(this) { // from class: androidx.compose.material.AnchoredDraggableState$anchoredDragScope$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AnchoredDraggableState<T> f6590a;

            {
                this.f6590a = this;
            }

            @Override // androidx.compose.material.AnchoredDragScope
            public void dragTo(float newOffset, float lastKnownVelocity) {
                AnchoredDraggableState<T> anchoredDraggableState = this.f6590a;
                anchoredDraggableState.offset.setValue(Float.valueOf(newOffset));
                anchoredDraggableState.lastVelocity.setFloatValue(lastKnownVelocity);
            }
        };
    }

    public static final /* synthetic */ Object access$computeTarget(AnchoredDraggableState anchoredDraggableState, float f6, Object obj, float f10) {
        return anchoredDraggableState.a(f6, f10, obj);
    }

    public static final Object access$computeTargetWithoutThresholds(AnchoredDraggableState anchoredDraggableState, float f6, Object obj) {
        Map<T, Float> anchors$material_release = anchoredDraggableState.getAnchors$material_release();
        Float f10 = anchors$material_release.get(obj);
        if (Intrinsics.areEqual(f10, f6) || f10 == null) {
            return obj;
        }
        return f10.floatValue() < f6 ? AnchoredDraggableKt.a(anchors$material_release, f6, true) : AnchoredDraggableKt.a(anchors$material_release, f6, false);
    }

    public static final Object access$getAnimationTarget(AnchoredDraggableState anchoredDraggableState) {
        return anchoredDraggableState.f6581o.getValue();
    }

    public static final void access$setAnimationTarget(AnchoredDraggableState anchoredDraggableState, Object obj) {
        anchoredDraggableState.f6581o.setValue(obj);
    }

    public static final void access$setCurrentValue(AnchoredDraggableState anchoredDraggableState, Object obj) {
        anchoredDraggableState.currentValue.setValue(obj);
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, MutatePriority mutatePriority, Function3 function3, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(mutatePriority, function3, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateAnchors$material_release$default(AnchoredDraggableState anchoredDraggableState, Map map, AnchorChangedCallback anchorChangedCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            anchorChangedCallback = null;
        }
        anchoredDraggableState.updateAnchors$material_release(map, anchorChangedCallback);
    }

    public final Object a(float f6, float f10, Object obj) {
        Object objA;
        Map<T, Float> anchors$material_release = getAnchors$material_release();
        Float f11 = anchors$material_release.get(obj);
        float fFloatValue = this.velocityThreshold.invoke().floatValue();
        if (Intrinsics.areEqual(f11, f6) || f11 == null) {
            return obj;
        }
        float fFloatValue2 = f11.floatValue();
        Function1<Float, Float> function1 = this.positionalThreshold;
        if (fFloatValue2 < f6) {
            if (f10 >= fFloatValue) {
                return AnchoredDraggableKt.a(anchors$material_release, f6, true);
            }
            objA = AnchoredDraggableKt.a(anchors$material_release, f6, true);
            if (f6 < Math.abs(f11.floatValue() + Math.abs(function1.invoke(Float.valueOf(Math.abs(((Number) bk.q.getValue(anchors$material_release, objA)).floatValue() - f11.floatValue()))).floatValue()))) {
                return obj;
            }
        } else {
            if (f10 <= (-fFloatValue)) {
                return AnchoredDraggableKt.a(anchors$material_release, f6, false);
            }
            objA = AnchoredDraggableKt.a(anchors$material_release, f6, false);
            float fAbs = Math.abs(f11.floatValue() - Math.abs(function1.invoke(Float.valueOf(Math.abs(f11.floatValue() - ((Number) bk.q.getValue(anchors$material_release, objA)).floatValue()))).floatValue()));
            if (f6 < 0.0f) {
                if (Math.abs(f6) < fAbs) {
                    return obj;
                }
            } else if (f6 > fAbs) {
                return obj;
            }
        }
        return objA;
    }

    @Nullable
    public final Object anchoredDrag(@NotNull MutatePriority mutatePriority, @NotNull Function3<? super AnchoredDragScope, ? super Map<T, Float>, ? super Continuation<? super Unit>, ? extends Object> function3, @NotNull Continuation<? super Unit> continuation) {
        Object objB = b(null, mutatePriority, function3, continuation);
        return objB == ek.a.getCOROUTINE_SUSPENDED() ? objB : Unit.INSTANCE;
    }

    public final Object b(T t10, MutatePriority mutatePriority, Function3<? super AnchoredDragScope, ? super Map<T, Float>, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new c(this, t10, mutatePriority, function3, null), continuation);
        return objCoroutineScope == ek.a.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    public final float dispatchRawDelta(float delta) {
        float fNewOffsetForDelta$material_release = newOffsetForDelta$material_release(delta);
        float offset = Float.isNaN(getOffset()) ? 0.0f : getOffset();
        this.offset.setValue(Float.valueOf(fNewOffsetForDelta$material_release));
        return fNewOffsetForDelta$material_release - offset;
    }

    @NotNull
    public final Map<T, Float> getAnchors$material_release() {
        return (Map) this.anchors.getValue();
    }

    @NotNull
    public final AnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final T getClosestValue$material_release() {
        return (T) this.closestValue.getValue();
    }

    @NotNull
    public final Function1<T, Boolean> getConfirmValueChange$material_release() {
        return this.confirmValueChange;
    }

    public final T getCurrentValue() {
        return this.currentValue.getValue();
    }

    @NotNull
    public final DraggableState getDraggableState$material_release() {
        return this.f6573f;
    }

    public final float getLastVelocity() {
        return this.lastVelocity.getFloatValue();
    }

    public final float getMaxOffset() {
        return ((Number) this.maxOffset.getValue()).floatValue();
    }

    public final float getMinOffset() {
        return ((Number) this.minOffset.getValue()).floatValue();
    }

    public final float getOffset() {
        return ((Number) this.offset.getValue()).floatValue();
    }

    @NotNull
    public final Function1<Float, Float> getPositionalThreshold$material_release() {
        return this.positionalThreshold;
    }

    public final float getProgress() {
        return ((Number) this.progress.getValue()).floatValue();
    }

    public final T getTargetValue() {
        return (T) this.targetValue.getValue();
    }

    @NotNull
    public final Function0<Float> getVelocityThreshold$material_release() {
        return this.velocityThreshold;
    }

    public final boolean hasAnchorForValue(T value) {
        return getAnchors$material_release().containsKey(value);
    }

    public final boolean isAnimationRunning() {
        return this.f6581o.getValue() != null;
    }

    public final float newOffsetForDelta$material_release(float delta) {
        return kotlin.ranges.c.coerceIn((Float.isNaN(getOffset()) ? 0.0f : getOffset()) + delta, getMinOffset(), getMaxOffset());
    }

    public final float requireOffset() {
        if (!Float.isNaN(getOffset())) {
            return getOffset();
        }
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString());
    }

    public final void setAnchors$material_release(@NotNull Map<T, Float> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.anchors.setValue(map);
    }

    @Nullable
    public final Object settle(float f6, @NotNull Continuation<? super Unit> continuation) {
        T currentValue = getCurrentValue();
        Object objA = a(requireOffset(), f6, currentValue);
        if (this.confirmValueChange.invoke((T) objA).booleanValue()) {
            Object objAnimateTo = AnchoredDraggableKt.animateTo(this, objA, f6, continuation);
            return objAnimateTo == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo : Unit.INSTANCE;
        }
        Object objAnimateTo2 = AnchoredDraggableKt.animateTo(this, currentValue, f6, continuation);
        return objAnimateTo2 == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo2 : Unit.INSTANCE;
    }

    public final boolean trySnapTo$material_release(T targetValue) {
        return this.f6572e.tryMutate(new h(this, targetValue));
    }

    public final void updateAnchors$material_release(@NotNull Map<T, Float> newAnchors, @Nullable AnchorChangedCallback<T> onAnchorsChanged) {
        Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
        if (Intrinsics.areEqual(getAnchors$material_release(), newAnchors)) {
            return;
        }
        Map<T, Float> anchors$material_release = getAnchors$material_release();
        T targetValue = getTargetValue();
        boolean zIsEmpty = getAnchors$material_release().isEmpty();
        setAnchors$material_release(newAnchors);
        boolean z10 = getAnchors$material_release().get(getCurrentValue()) != null;
        if (zIsEmpty && z10) {
            trySnapTo$material_release(getCurrentValue());
        } else if (onAnchorsChanged != null) {
            onAnchorsChanged.onAnchorsChanged(targetValue, anchors$material_release, newAnchors);
        }
    }

    @Nullable
    public final Object anchoredDrag(T t10, @NotNull MutatePriority mutatePriority, @NotNull Function3<? super AnchoredDragScope, ? super Map<T, Float>, ? super Continuation<? super Unit>, ? extends Object> function3, @NotNull Continuation<? super Unit> continuation) {
        Object objB = b(t10, mutatePriority, function3, continuation);
        return objB == ek.a.getCOROUTINE_SUSPENDED() ? objB : Unit.INSTANCE;
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, Object obj, MutatePriority mutatePriority, Function3 function3, Continuation continuation, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(obj, mutatePriority, function3, continuation);
    }

    public static /* synthetic */ void getOffset$annotations() {
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, Function1 function1, Function0 function0, AnimationSpec animationSpec, Function1 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, function1, function0, (i10 & 8) != 0 ? AnchoredDraggableDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i10 & 16) != 0 ? a.f6589p0 : function2);
    }
}
