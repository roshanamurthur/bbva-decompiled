package androidx.compose.animation.core;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004klmnB#\b\u0001\u0012\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000f\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010.¢\u0006\u0004\bh\u0010iB\u001b\b\u0010\u0012\u0006\u0010\u0011\u001a\u00028\u0000\u0012\b\u00103\u001a\u0004\u0018\u00010.¢\u0006\u0004\bh\u0010jJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u001b\u001a\u00020\u00182\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001d\u001a\u00020\u00182\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u001c\u0010\u001aJ)\u0010\"\u001a\u00020\u00182\u0018\u0010\u001f\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001eR\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b \u0010!J)\u0010%\u001a\u00020\u00072\u0018\u0010\u001f\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001eR\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b#\u0010$J\u0017\u0010(\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00028\u0000H\u0001¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00028\u0000H\u0001¢\u0006\u0004\b)\u0010'J)\u0010%\u001a\u00020\u00072\u0018\u0010,\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030+R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b#\u0010-R\u0019\u00103\u001a\u0004\u0018\u00010.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R+\u0010\u0012\u001a\u00028\u00002\u0006\u00104\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R7\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000;2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000;8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b<\u00106\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R1\u0010\u0013\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u00038F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bB\u0010C\u0012\u0004\bG\u0010\u000f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010\fR+\u0010M\u001a\u00020\u00182\u0006\u00104\u001a\u00020\u00188@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bH\u00106\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR1\u0010O\u001a\u00020\u00182\u0006\u00104\u001a\u00020\u00188F@@X\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bN\u00106\u0012\u0004\bQ\u0010\u000f\u001a\u0004\bO\u0010J\"\u0004\bP\u0010LR\"\u0010V\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010E\"\u0004\bU\u0010\fR\u001b\u0010Z\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ER$\u0010^\u001a\u00028\u00002\u0006\u0010[\u001a\u00028\u00008F@@X\u0086\u000e¢\u0006\f\u001a\u0004\b\\\u00108\"\u0004\b]\u0010:R\u0011\u0010_\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b_\u0010JR\u001b\u0010c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000`8F¢\u0006\u0006\u001a\u0004\ba\u0010bR)\u0010e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001eR\b\u0012\u0004\u0012\u00028\u00000\u00000`8F¢\u0006\u0006\u001a\u0004\bd\u0010b¨\u0006o"}, d2 = {"Landroidx/compose/animation/core/Transition;", ExifInterface.LATITUDE_SOUTH, "", "", "frameTimeNanos", "", "durationScale", "", "onFrame$animation_core_release", "(JF)V", "onFrame", "onTransitionStart$animation_core_release", "(J)V", "onTransitionStart", "onTransitionEnd$animation_core_release", "()V", "onTransitionEnd", "initialState", "targetState", "playTimeNanos", "seek", "(Ljava/lang/Object;Ljava/lang/Object;J)V", "setPlaytimeAfterInitialAndTargetStateEstablished", ConstantsKt.TRANSITION_EXTRA_ID, "", "addTransition$animation_core_release", "(Landroidx/compose/animation/core/Transition;)Z", "addTransition", "removeTransition$animation_core_release", "removeTransition", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "animation", "addAnimation$animation_core_release", "(Landroidx/compose/animation/core/Transition$TransitionAnimationState;)Z", "addAnimation", "removeAnimation$animation_core_release", "(Landroidx/compose/animation/core/Transition$TransitionAnimationState;)V", "removeAnimation", "updateTarget$animation_core_release", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "updateTarget", "animateTo$animation_core_release", "animateTo", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "deferredAnimation", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;)V", "", "b", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "label", "<set-?>", "c", "Landroidx/compose/runtime/MutableState;", "getTargetState", "()Ljava/lang/Object;", "setTargetState$animation_core_release", "(Ljava/lang/Object;)V", "Landroidx/compose/animation/core/Transition$Segment;", "d", "getSegment", "()Landroidx/compose/animation/core/Transition$Segment;", "setSegment", "(Landroidx/compose/animation/core/Transition$Segment;)V", "segment", "e", "Landroidx/compose/runtime/MutableLongState;", "getPlayTimeNanos", "()J", "setPlayTimeNanos", "getPlayTimeNanos$annotations", "g", "getUpdateChildrenNeeded$animation_core_release", "()Z", "setUpdateChildrenNeeded$animation_core_release", "(Z)V", "updateChildrenNeeded", "j", "isSeeking", "setSeeking$animation_core_release", "isSeeking$annotations", "k", "J", "getLastSeekedTimeNanos$animation_core_release", "setLastSeekedTimeNanos$animation_core_release", "lastSeekedTimeNanos", "l", "Landroidx/compose/runtime/State;", "getTotalDurationNanos", "totalDurationNanos", "value", "getCurrentState", "setCurrentState$animation_core_release", "currentState", "isRunning", "", "getTransitions", "()Ljava/util/List;", "transitions", "getAnimations", "animations", "Landroidx/compose/animation/core/MutableTransitionState;", "transitionState", "<init>", "(Landroidx/compose/animation/core/MutableTransitionState;Ljava/lang/String;)V", "(Ljava/lang/Object;Ljava/lang/String;)V", "DeferredAnimation", "Segment", "a", "TransitionAnimationState", "animation-core_release"}, k = 1, mv = {1, 8, 0})
@Stable
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1156:1\n81#2:1157\n107#2,2:1158\n81#2:1160\n107#2,2:1161\n81#2:1169\n107#2,2:1170\n81#2:1172\n107#2,2:1173\n81#2:1175\n76#3:1163\n109#3,2:1164\n76#3:1166\n109#3,2:1167\n1855#4,2:1176\n1855#4,2:1178\n1855#4,2:1180\n1855#4,2:1182\n1855#4,2:1184\n1855#4,2:1193\n36#5:1186\n1097#6,6:1187\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition\n*L\n213#1:1157\n213#1:1158,2\n220#1:1160\n220#1:1161,2\n239#1:1169\n239#1:1170,2\n259#1:1172\n259#1:1173,2\n271#1:1175\n235#1:1163\n235#1:1164,2\n236#1:1166\n236#1:1167,2\n295#1:1176,2\n304#1:1178,2\n365#1:1180,2\n378#1:1182,2\n417#1:1184,2\n454#1:1193,2\n432#1:1186\n432#1:1187,6\n*E\n"})
public final class Transition<S> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableTransitionState<S> f3092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String label;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState targetState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState segment;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLongState playTimeNanos;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableLongState f3097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState updateChildrenNeeded;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> f3099h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final SnapshotStateList<Transition<?>> f3100i;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState isSeeking;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public long lastSeekedTimeNanos;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final State totalDurationNanos;

    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\u00020\u0004:\u0001,B%\b\u0000\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0014\u0012\u0006\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b*\u0010+JT\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e2#\u0010\t\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0005¢\u0006\u0002\b\b2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00028\u00010\u0005J\u000f\u0010\u0013\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR{\u0010)\u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010 R\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000!2.\u0010\"\u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010 R\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000!8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006-"}, d2 = {"Landroidx/compose/animation/core/Transition$DeferredAnimation;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lkotlin/ExtensionFunctionType;", "transitionSpec", "Lkotlin/ParameterName;", "name", "state", "targetValueByState", "Landroidx/compose/runtime/State;", "animate", "", "setupSeeking$animation_core_release", "()V", "setupSeeking", "Landroidx/compose/animation/core/TwoWayConverter;", "a", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "", "b", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "label", "Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "Landroidx/compose/animation/core/Transition;", "<set-?>", "c", "Landroidx/compose/runtime/MutableState;", "getData$animation_core_release", "()Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "setData$animation_core_release", "(Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;)V", "data", "<init>", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;)V", "DeferredAnimationData", "animation-core_release"}, k = 1, mv = {1, 8, 0})
    @InternalAnimationApi
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$DeferredAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1156:1\n81#2:1157\n107#2,2:1158\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$DeferredAnimation\n*L\n656#1:1157\n656#1:1158,2\n*E\n"})
    public final class DeferredAnimation<T, V extends AnimationVector> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final TwoWayConverter<T, V> typeConverter;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final MutableState data;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Transition<S> f3107d;

        /* JADX INFO: compiled from: Transition.kt */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\u0004\u0018\u0000*\u0004\b\u0003\u0010\u0001*\b\b\u0004\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00030\u0004Bm\u0012\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\tR\b\u0012\u0004\u0012\u00028\u00000\n\u0012#\u0010\u0019\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00110\u0010¢\u0006\u0002\b\u0012\u0012!\u0010 \u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00028\u00030\u0010¢\u0006\u0004\b$\u0010%J\u0014\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005R-\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\tR\b\u0012\u0004\u0012\u00028\u00000\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR?\u0010\u0019\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00110\u0010¢\u0006\u0002\b\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R=\u0010 \u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00028\u00030\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b\u001f\u0010\u0018R\u0014\u0010#\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/Transition$Segment;", "segment", "", "updateAnimationStates", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "Landroidx/compose/animation/core/Transition;", "p0", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "getAnimation", "()Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "animation", "Lkotlin/Function1;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lkotlin/ExtensionFunctionType;", "q0", "Lkotlin/jvm/functions/Function1;", "getTransitionSpec", "()Lkotlin/jvm/functions/Function1;", "setTransitionSpec", "(Lkotlin/jvm/functions/Function1;)V", "transitionSpec", "Lkotlin/ParameterName;", "name", "state", "r0", "getTargetValueByState", "setTargetValueByState", "targetValueByState", "getValue", "()Ljava/lang/Object;", "value", "<init>", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$TransitionAnimationState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
        public final class DeferredAnimationData<T, V extends AnimationVector> implements State<T> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Transition<S>.TransitionAnimationState<T, V> animation;

            /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public Function1<? super Segment<S>, ? extends FiniteAnimationSpec<T>> transitionSpec;

            /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public Function1<? super S, ? extends T> targetValueByState;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ Transition<S>.DeferredAnimation<T, V> f3111s0;

            public DeferredAnimationData(@NotNull DeferredAnimation deferredAnimation, @NotNull Transition<S>.TransitionAnimationState<T, V> animation, @NotNull Function1<? super Segment<S>, ? extends FiniteAnimationSpec<T>> transitionSpec, Function1<? super S, ? extends T> targetValueByState) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                Intrinsics.checkNotNullParameter(transitionSpec, "transitionSpec");
                Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState");
                this.f3111s0 = deferredAnimation;
                this.animation = animation;
                this.transitionSpec = transitionSpec;
                this.targetValueByState = targetValueByState;
            }

            @NotNull
            public final Transition<S>.TransitionAnimationState<T, V> getAnimation() {
                return this.animation;
            }

            @NotNull
            public final Function1<S, T> getTargetValueByState() {
                return this.targetValueByState;
            }

            @NotNull
            public final Function1<Segment<S>, FiniteAnimationSpec<T>> getTransitionSpec() {
                return this.transitionSpec;
            }

            @Override // androidx.compose.runtime.State
            public T getValue() {
                updateAnimationStates(this.f3111s0.f3107d.getSegment());
                return this.animation.getValue();
            }

            public final void setTargetValueByState(@NotNull Function1<? super S, ? extends T> function1) {
                Intrinsics.checkNotNullParameter(function1, "<set-?>");
                this.targetValueByState = function1;
            }

            public final void setTransitionSpec(@NotNull Function1<? super Segment<S>, ? extends FiniteAnimationSpec<T>> function1) {
                Intrinsics.checkNotNullParameter(function1, "<set-?>");
                this.transitionSpec = function1;
            }

            public final void updateAnimationStates(@NotNull Segment<S> segment) {
                Intrinsics.checkNotNullParameter(segment, "segment");
                T tInvoke = this.targetValueByState.invoke(segment.getTargetState());
                boolean zIsSeeking = this.f3111s0.f3107d.isSeeking();
                Transition<S>.TransitionAnimationState<T, V> transitionAnimationState = this.animation;
                if (zIsSeeking) {
                    transitionAnimationState.updateInitialAndTargetValue$animation_core_release(this.targetValueByState.invoke(segment.getInitialState()), tInvoke, this.transitionSpec.invoke(segment));
                } else {
                    transitionAnimationState.updateTargetValue$animation_core_release(tInvoke, this.transitionSpec.invoke(segment));
                }
            }
        }

        public DeferredAnimation(@NotNull Transition transition, @NotNull TwoWayConverter<T, V> typeConverter, String label) {
            Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
            Intrinsics.checkNotNullParameter(label, "label");
            this.f3107d = transition;
            this.typeConverter = typeConverter;
            this.label = label;
            this.data = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        }

        @NotNull
        public final State<T> animate(@NotNull Function1<? super Segment<S>, ? extends FiniteAnimationSpec<T>> transitionSpec, @NotNull Function1<? super S, ? extends T> targetValueByState) {
            Intrinsics.checkNotNullParameter(transitionSpec, "transitionSpec");
            Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState");
            Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> data$animation_core_release = getData$animation_core_release();
            Transition<S> transition = this.f3107d;
            if (data$animation_core_release == null) {
                Transition<S> transition2 = this.f3107d;
                data$animation_core_release = new DeferredAnimationData<>(this, new TransitionAnimationState(transition2, targetValueByState.invoke(transition2.getCurrentState()), AnimationStateKt.createZeroVectorFrom(this.typeConverter, targetValueByState.invoke(transition.getCurrentState())), this.typeConverter, this.label), transitionSpec, targetValueByState);
                setData$animation_core_release(data$animation_core_release);
                transition.addAnimation$animation_core_release(data$animation_core_release.getAnimation());
            }
            data$animation_core_release.setTargetValueByState(targetValueByState);
            data$animation_core_release.setTransitionSpec(transitionSpec);
            data$animation_core_release.updateAnimationStates(transition.getSegment());
            return data$animation_core_release;
        }

        @Nullable
        public final Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> getData$animation_core_release() {
            return (DeferredAnimationData) this.data.getValue();
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        public final void setData$animation_core_release(@Nullable Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> deferredAnimationData) {
            this.data.setValue(deferredAnimationData);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void setupSeeking$animation_core_release() {
            Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> data$animation_core_release = getData$animation_core_release();
            if (data$animation_core_release != null) {
                Transition<S>.TransitionAnimationState<T, V> animation = data$animation_core_release.getAnimation();
                Function1<S, T> targetValueByState = data$animation_core_release.getTargetValueByState();
                Transition<S> transition = this.f3107d;
                animation.updateInitialAndTargetValue$animation_core_release(targetValueByState.invoke(transition.getSegment().getInitialState()), data$animation_core_release.getTargetValueByState().invoke(transition.getSegment().getTargetState()), data$animation_core_release.getTransitionSpec().invoke(transition.getSegment()));
            }
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u001a\u0010\b\u001a\u00020\t*\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u0001H\u0096\u0004¢\u0006\u0002\u0010\nR\u0012\u0010\u0003\u001a\u00028\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00028\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/Transition$Segment;", ExifInterface.LATITUDE_SOUTH, "", "initialState", "getInitialState", "()Ljava/lang/Object;", "targetState", "getTargetState", "isTransitioningTo", "", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Segment<S> {

        /* JADX INFO: compiled from: Transition.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class DefaultImpls {
            @Deprecated
            public static <S> boolean isTransitioningTo(@NotNull Segment<S> segment, S s4, S s7) {
                return s.e.a(segment, s4, s7);
            }
        }

        S getInitialState();

        S getTargetState();

        boolean isTransitioningTo(S s4, S s7);
    }

    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B5\b\u0000\u0012\u0006\u0010\u0019\u001a\u00028\u0001\u0012\u0006\u0010G\u001a\u00028\u0002\u0012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001d\u0012\u0006\u0010(\u001a\u00020#¢\u0006\u0004\bH\u0010IJ\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00028\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00028\u00012\u0006\u0010\u0013\u001a\u00028\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0000¢\u0006\u0004\b\u001a\u0010\u001bR#\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010(\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R7\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00142\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010\u00148F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/RC\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002002\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010+\u001a\u0004\b2\u00103\"\u0004\b4\u00105R+\u0010=\u001a\u0002072\u0006\u0010)\u001a\u0002078@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010+\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R+\u0010C\u001a\u00028\u00012\u0006\u0010)\u001a\u00028\u00018V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010+\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006J"}, d2 = {"Landroidx/compose/animation/core/Transition$TransitionAnimationState;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/runtime/State;", "", "playTimeNanos", "", "durationScale", "", "onPlayTimeChanged$animation_core_release", "(JF)V", "onPlayTimeChanged", "seekTo$animation_core_release", "(J)V", "seekTo", "resetAnimation$animation_core_release", "()V", "resetAnimation", "targetValue", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "updateTargetValue$animation_core_release", "(Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "updateTargetValue", "initialValue", "updateInitialAndTargetValue$animation_core_release", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "updateInitialAndTargetValue", "Landroidx/compose/animation/core/TwoWayConverter;", "p0", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "", "q0", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "label", "<set-?>", "s0", "Landroidx/compose/runtime/MutableState;", "getAnimationSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "setAnimationSpec", "(Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "Landroidx/compose/animation/core/TargetBasedAnimation;", "t0", "getAnimation", "()Landroidx/compose/animation/core/TargetBasedAnimation;", "setAnimation", "(Landroidx/compose/animation/core/TargetBasedAnimation;)V", "animation", "", "u0", "isFinished$animation_core_release", "()Z", "setFinished$animation_core_release", "(Z)V", "isFinished", "x0", "getValue", "()Ljava/lang/Object;", "setValue$animation_core_release", "(Ljava/lang/Object;)V", "value", "getDurationNanos$animation_core_release", "()J", "durationNanos", "initialVelocityVector", "<init>", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
    @Stable
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$TransitionAnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n*L\n1#1,1156:1\n81#2:1157\n107#2,2:1158\n81#2:1160\n107#2,2:1161\n81#2:1163\n107#2,2:1164\n81#2:1166\n107#2,2:1167\n81#2:1172\n107#2,2:1173\n81#2:1175\n107#2,2:1176\n76#3:1169\n109#3,2:1170\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$TransitionAnimationState\n*L\n477#1:1157\n477#1:1158,2\n483#1:1160\n483#1:1161,2\n490#1:1163\n490#1:1164,2\n498#1:1166\n498#1:1167,2\n500#1:1172\n500#1:1173,2\n503#1:1175\n503#1:1176,2\n499#1:1169\n499#1:1170,2\n*E\n"})
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {

        @NotNull
        public final SpringSpec E0;
        public final /* synthetic */ Transition<S> F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final TwoWayConverter<T, V> typeConverter;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String label;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        @NotNull
        public final MutableState f3114r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final MutableState animationSpec;

        /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final MutableState animation;

        /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final MutableState isFinished;

        @NotNull
        public final MutableLongState v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        @NotNull
        public final MutableState f3118w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final MutableState value;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        @NotNull
        public V f3120y0;

        public TransitionAnimationState(Transition transition, @NotNull T t10, @NotNull V initialVelocityVector, @NotNull TwoWayConverter<T, V> typeConverter, String label) {
            T tInvoke;
            Intrinsics.checkNotNullParameter(initialVelocityVector, "initialVelocityVector");
            Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
            Intrinsics.checkNotNullParameter(label, "label");
            this.F0 = transition;
            this.typeConverter = typeConverter;
            this.label = label;
            MutableState mutableStateMutableStateOf$default = SnapshotStateKt.mutableStateOf$default(t10, null, 2, null);
            this.f3114r0 = mutableStateMutableStateOf$default;
            this.animationSpec = SnapshotStateKt.mutableStateOf$default(AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null), null, 2, null);
            this.animation = SnapshotStateKt.mutableStateOf$default(new TargetBasedAnimation(getAnimationSpec(), typeConverter, t10, mutableStateMutableStateOf$default.getValue(), initialVelocityVector), null, 2, null);
            this.isFinished = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            this.v0 = SnapshotLongStateKt.mutableLongStateOf(0L);
            this.f3118w0 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            this.value = SnapshotStateKt.mutableStateOf$default(t10, null, 2, null);
            this.f3120y0 = initialVelocityVector;
            Float f6 = VisibilityThresholdsKt.getVisibilityThresholdMap().get(typeConverter);
            if (f6 != null) {
                float fFloatValue = f6.floatValue();
                V vInvoke = typeConverter.getConvertToVector().invoke(t10);
                int size$animation_core_release = vInvoke.getSize();
                for (int i10 = 0; i10 < size$animation_core_release; i10++) {
                    vInvoke.set$animation_core_release(i10, fFloatValue);
                }
                tInvoke = this.typeConverter.getConvertFromVector().invoke(vInvoke);
            } else {
                tInvoke = null;
            }
            this.E0 = AnimationSpecKt.spring$default(0.0f, 0.0f, tInvoke, 3, null);
        }

        public static void a(TransitionAnimationState transitionAnimationState, Object obj, boolean z10, int i10) {
            if ((i10 & 1) != 0) {
                obj = transitionAnimationState.getValue();
            }
            Object obj2 = obj;
            FiniteAnimationSpec<T> animationSpec = ((i10 & 2) == 0 && z10 && !(transitionAnimationState.getAnimationSpec() instanceof SpringSpec)) ? transitionAnimationState.E0 : transitionAnimationState.getAnimationSpec();
            transitionAnimationState.animation.setValue(new TargetBasedAnimation(animationSpec, transitionAnimationState.typeConverter, obj2, transitionAnimationState.f3114r0.getValue(), transitionAnimationState.f3120y0));
            Transition.access$onChildAnimationUpdated(transitionAnimationState.F0);
        }

        @NotNull
        public final TargetBasedAnimation<T, V> getAnimation() {
            return (TargetBasedAnimation) this.animation.getValue();
        }

        @NotNull
        public final FiniteAnimationSpec<T> getAnimationSpec() {
            return (FiniteAnimationSpec) this.animationSpec.getValue();
        }

        public final long getDurationNanos$animation_core_release() {
            return getAnimation().getDurationNanos();
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        @Override // androidx.compose.runtime.State
        public T getValue() {
            return this.value.getValue();
        }

        public final boolean isFinished$animation_core_release() {
            return ((Boolean) this.isFinished.getValue()).booleanValue();
        }

        public final void onPlayTimeChanged$animation_core_release(long playTimeNanos, float durationScale) {
            long durationNanos;
            MutableLongState mutableLongState = this.v0;
            if (durationScale > 0.0f) {
                float longValue = (playTimeNanos - mutableLongState.getLongValue()) / durationScale;
                if (!(!Float.isNaN(longValue))) {
                    throw new IllegalStateException(("Duration scale adjusted time is NaN. Duration scale: " + durationScale + ",playTimeNanos: " + playTimeNanos + ", offsetTimeNanos: " + mutableLongState.getLongValue()).toString());
                }
                durationNanos = (long) longValue;
            } else {
                durationNanos = getAnimation().getDurationNanos();
            }
            setValue$animation_core_release(getAnimation().getValueFromNanos(durationNanos));
            this.f3120y0 = (V) getAnimation().getVelocityVectorFromNanos(durationNanos);
            TargetBasedAnimation<T, V> animation = getAnimation();
            animation.getClass();
            if (s.a.a(animation, durationNanos)) {
                setFinished$animation_core_release(true);
                mutableLongState.setLongValue(0L);
            }
        }

        public final void resetAnimation$animation_core_release() {
            this.f3118w0.setValue(Boolean.TRUE);
        }

        public final void seekTo$animation_core_release(long playTimeNanos) {
            setValue$animation_core_release(getAnimation().getValueFromNanos(playTimeNanos));
            this.f3120y0 = (V) getAnimation().getVelocityVectorFromNanos(playTimeNanos);
        }

        public final void setFinished$animation_core_release(boolean z10) {
            this.isFinished.setValue(Boolean.valueOf(z10));
        }

        public void setValue$animation_core_release(T t10) {
            this.value.setValue(t10);
        }

        public final void updateInitialAndTargetValue$animation_core_release(T initialValue, T targetValue, @NotNull FiniteAnimationSpec<T> animationSpec) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            this.f3114r0.setValue(targetValue);
            this.animationSpec.setValue(animationSpec);
            if (Intrinsics.areEqual(getAnimation().getInitialValue(), initialValue) && Intrinsics.areEqual(getAnimation().getTargetValue(), targetValue)) {
                return;
            }
            a(this, initialValue, false, 2);
        }

        public final void updateTargetValue$animation_core_release(T targetValue, @NotNull FiniteAnimationSpec<T> animationSpec) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            MutableState mutableState = this.f3114r0;
            boolean zAreEqual = Intrinsics.areEqual(mutableState.getValue(), targetValue);
            MutableState mutableState2 = this.f3118w0;
            if (!zAreEqual || ((Boolean) mutableState2.getValue()).booleanValue()) {
                mutableState.setValue(targetValue);
                this.animationSpec.setValue(animationSpec);
                a(this, null, !isFinished$animation_core_release(), 1);
                setFinished$animation_core_release(false);
                this.v0.setLongValue(this.F0.getPlayTimeNanos());
                mutableState2.setValue(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    public static final class a<S> implements Segment<S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final S f3121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final S f3122b;

        public a(S s4, S s7) {
            this.f3121a = s4;
            this.f3122b = s7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj instanceof Segment) {
                Segment segment = (Segment) obj;
                if (Intrinsics.areEqual(this.f3121a, segment.getInitialState())) {
                    if (Intrinsics.areEqual(this.f3122b, segment.getTargetState())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public final S getInitialState() {
            return this.f3121a;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public final S getTargetState() {
            return this.f3122b;
        }

        public final int hashCode() {
            S s4 = this.f3121a;
            int iHashCode = (s4 != null ? s4.hashCode() : 0) * 31;
            S s7 = this.f3122b;
            return iHashCode + (s7 != null ? s7.hashCode() : 0);
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public final /* synthetic */ boolean isTransitioningTo(Object obj, Object obj2) {
            return s.e.a(this, obj, obj2);
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    @DebugMetadata(c = "androidx.compose.animation.core.Transition$animateTo$1$1", f = "Transition.kt", i = {0}, l = {435}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f3123p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f3124q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Transition<S> f3125r0;

        /* JADX INFO: compiled from: Transition.kt */
        public static final class a extends Lambda implements Function1<Long, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Transition<S> f3126p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ float f3127q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Transition<S> transition, float f6) {
                super(1);
                this.f3126p0 = transition;
                this.f3127q0 = f6;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Long l6) {
                long jLongValue = l6.longValue();
                Transition<S> transition = this.f3126p0;
                if (!transition.isSeeking()) {
                    transition.onFrame$animation_core_release(jLongValue, this.f3127q0);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Transition<S> transition, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f3125r0 = transition;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(this.f3125r0, continuation);
            bVar.f3124q0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineScope coroutineScope;
            a aVar;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f3123p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.f3124q0;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.f3124q0;
                ResultKt.throwOnFailure(obj);
            }
            do {
                aVar = new a(this.f3125r0, SuspendAnimationKt.getDurationScale(coroutineScope.getCoroutineContext()));
                this.f3124q0 = coroutineScope;
                this.f3123p0 = 1;
            } while (MonotonicFrameClockKt.withFrameNanos(aVar, this) != coroutine_suspended);
            return coroutine_suspended;
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Transition<S> f3128p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ S f3129q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f3130r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Transition<S> transition, S s4, int i10) {
            super(2);
            this.f3128p0 = transition;
            this.f3129q0 = s4;
            this.f3130r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f3130r0 | 1);
            this.f3128p0.animateTo$animation_core_release(this.f3129q0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$totalDurationNanos$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1156:1\n1855#2,2:1157\n1855#2,2:1159\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$totalDurationNanos$2\n*L\n273#1:1157,2\n276#1:1159,2\n*E\n"})
    public static final class d extends Lambda implements Function0<Long> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Transition<S> f3131p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Transition<S> transition) {
            super(0);
            this.f3131p0 = transition;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            Transition<S> transition = this.f3131p0;
            Iterator<T> it = transition.f3099h.iterator();
            long jMax = 0;
            while (it.hasNext()) {
                jMax = Math.max(jMax, ((TransitionAnimationState) it.next()).getDurationNanos$animation_core_release());
            }
            Iterator<T> it2 = transition.f3100i.iterator();
            while (it2.hasNext()) {
                jMax = Math.max(jMax, ((Transition) it2.next()).getTotalDurationNanos());
            }
            return Long.valueOf(jMax);
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Transition<S> f3132p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ S f3133q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f3134r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Transition<S> transition, S s4, int i10) {
            super(2);
            this.f3132p0 = transition;
            this.f3133q0 = s4;
            this.f3134r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f3134r0 | 1);
            this.f3132p0.updateTarget$animation_core_release(this.f3133q0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @PublishedApi
    public Transition(@NotNull MutableTransitionState<S> transitionState, @Nullable String str) {
        Intrinsics.checkNotNullParameter(transitionState, "transitionState");
        this.f3092a = transitionState;
        this.label = str;
        this.targetState = SnapshotStateKt.mutableStateOf$default(getCurrentState(), null, 2, null);
        this.segment = SnapshotStateKt.mutableStateOf$default(new a(getCurrentState(), getCurrentState()), null, 2, null);
        this.playTimeNanos = SnapshotLongStateKt.mutableLongStateOf(0L);
        this.f3097f = SnapshotLongStateKt.mutableLongStateOf(Long.MIN_VALUE);
        this.updateChildrenNeeded = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.f3099h = SnapshotStateKt.mutableStateListOf();
        this.f3100i = SnapshotStateKt.mutableStateListOf();
        this.isSeeking = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.totalDurationNanos = SnapshotStateKt.derivedStateOf(new d(this));
    }

    public static final void access$onChildAnimationUpdated(Transition transition) {
        transition.setUpdateChildrenNeeded$animation_core_release(true);
        if (transition.isSeeking()) {
            long jMax = 0;
            for (Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState : transition.f3099h) {
                jMax = Math.max(jMax, transitionAnimationState.getDurationNanos$animation_core_release());
                transitionAnimationState.seekTo$animation_core_release(transition.lastSeekedTimeNanos);
            }
            transition.setUpdateChildrenNeeded$animation_core_release(false);
        }
    }

    public final boolean addAnimation$animation_core_release(@NotNull Transition<S>.TransitionAnimationState<?, ?> animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        return this.f3099h.add(animation);
    }

    public final boolean addTransition$animation_core_release(@NotNull Transition<?> transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        return this.f3100i.add(transition);
    }

    @Composable
    public final void animateTo$animation_core_release(S s4, @Nullable Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1493585151);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(s4) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(this) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1493585151, i11, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:425)");
            }
            if (!isSeeking()) {
                updateTarget$animation_core_release(s4, composerStartRestartGroup, (i11 & 14) | (i11 & 112));
                if (!Intrinsics.areEqual(s4, getCurrentState()) || isRunning() || getUpdateChildrenNeeded$animation_core_release()) {
                    int i12 = (i11 >> 3) & 14;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    boolean zChanged = composerStartRestartGroup.changed(this);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new b(this, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(this, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i12 | 64);
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(this, s4, i10));
    }

    @NotNull
    public final List<Transition<S>.TransitionAnimationState<?, ?>> getAnimations() {
        return this.f3099h;
    }

    public final S getCurrentState() {
        return this.f3092a.getCurrentState();
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: getLastSeekedTimeNanos$animation_core_release, reason: from getter */
    public final long getLastSeekedTimeNanos() {
        return this.lastSeekedTimeNanos;
    }

    public final long getPlayTimeNanos() {
        return this.playTimeNanos.getLongValue();
    }

    @NotNull
    public final Segment<S> getSegment() {
        return (Segment) this.segment.getValue();
    }

    public final S getTargetState() {
        return (S) this.targetState.getValue();
    }

    public final long getTotalDurationNanos() {
        return ((Number) this.totalDurationNanos.getValue()).longValue();
    }

    @NotNull
    public final List<Transition<?>> getTransitions() {
        return this.f3100i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getUpdateChildrenNeeded$animation_core_release() {
        return ((Boolean) this.updateChildrenNeeded.getValue()).booleanValue();
    }

    public final boolean isRunning() {
        return this.f3097f.getLongValue() != Long.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isSeeking() {
        return ((Boolean) this.isSeeking.getValue()).booleanValue();
    }

    public final void onFrame$animation_core_release(long frameTimeNanos, float durationScale) {
        MutableLongState mutableLongState = this.f3097f;
        if (mutableLongState.getLongValue() == Long.MIN_VALUE) {
            onTransitionStart$animation_core_release(frameTimeNanos);
        }
        setUpdateChildrenNeeded$animation_core_release(false);
        setPlayTimeNanos(frameTimeNanos - mutableLongState.getLongValue());
        boolean z10 = true;
        for (Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState : this.f3099h) {
            if (!transitionAnimationState.isFinished$animation_core_release()) {
                transitionAnimationState.onPlayTimeChanged$animation_core_release(getPlayTimeNanos(), durationScale);
            }
            if (!transitionAnimationState.isFinished$animation_core_release()) {
                z10 = false;
            }
        }
        for (Transition<?> transition : this.f3100i) {
            if (!Intrinsics.areEqual(transition.getTargetState(), transition.getCurrentState())) {
                transition.onFrame$animation_core_release(getPlayTimeNanos(), durationScale);
            }
            if (!Intrinsics.areEqual(transition.getTargetState(), transition.getCurrentState())) {
                z10 = false;
            }
        }
        if (z10) {
            onTransitionEnd$animation_core_release();
        }
    }

    public final void onTransitionEnd$animation_core_release() {
        this.f3097f.setLongValue(Long.MIN_VALUE);
        setCurrentState$animation_core_release(getTargetState());
        setPlayTimeNanos(0L);
        this.f3092a.setRunning$animation_core_release(false);
    }

    public final void onTransitionStart$animation_core_release(long frameTimeNanos) {
        this.f3097f.setLongValue(frameTimeNanos);
        this.f3092a.setRunning$animation_core_release(true);
    }

    public final void removeAnimation$animation_core_release(@NotNull Transition<S>.TransitionAnimationState<?, ?> animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f3099h.remove(animation);
    }

    public final boolean removeTransition$animation_core_release(@NotNull Transition<?> transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        return this.f3100i.remove(transition);
    }

    @JvmName(name = "seek")
    public final void seek(S initialState, S targetState, long playTimeNanos) {
        this.f3097f.setLongValue(Long.MIN_VALUE);
        this.f3092a.setRunning$animation_core_release(false);
        if (!isSeeking() || !Intrinsics.areEqual(getCurrentState(), initialState) || !Intrinsics.areEqual(getTargetState(), targetState)) {
            setCurrentState$animation_core_release(initialState);
            setTargetState$animation_core_release(targetState);
            setSeeking$animation_core_release(true);
            this.segment.setValue(new a(initialState, targetState));
        }
        for (Transition<?> transition : this.f3100i) {
            Intrinsics.checkNotNull(transition, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (transition.isSeeking()) {
                transition.seek(transition.getCurrentState(), transition.getTargetState(), playTimeNanos);
            }
        }
        Iterator<Transition<S>.TransitionAnimationState<?, ?>> it = this.f3099h.iterator();
        while (it.hasNext()) {
            it.next().seekTo$animation_core_release(playTimeNanos);
        }
        this.lastSeekedTimeNanos = playTimeNanos;
    }

    public final void setCurrentState$animation_core_release(S s4) {
        this.f3092a.setCurrentState$animation_core_release(s4);
    }

    public final void setLastSeekedTimeNanos$animation_core_release(long j10) {
        this.lastSeekedTimeNanos = j10;
    }

    public final void setPlayTimeNanos(long j10) {
        this.playTimeNanos.setLongValue(j10);
    }

    public final void setSeeking$animation_core_release(boolean z10) {
        this.isSeeking.setValue(Boolean.valueOf(z10));
    }

    public final void setTargetState$animation_core_release(S s4) {
        this.targetState.setValue(s4);
    }

    public final void setUpdateChildrenNeeded$animation_core_release(boolean z10) {
        this.updateChildrenNeeded.setValue(Boolean.valueOf(z10));
    }

    @Composable
    public final void updateTarget$animation_core_release(S s4, @Nullable Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-583974681);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(s4) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(this) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-583974681, i10, -1, "androidx.compose.animation.core.Transition.updateTarget (Transition.kt:400)");
            }
            if (!isSeeking() && !Intrinsics.areEqual(getTargetState(), s4)) {
                this.segment.setValue(new a(getTargetState(), s4));
                setCurrentState$animation_core_release(getTargetState());
                setTargetState$animation_core_release(s4);
                if (!isRunning()) {
                    setUpdateChildrenNeeded$animation_core_release(true);
                }
                Iterator<Transition<S>.TransitionAnimationState<?, ?>> it = this.f3099h.iterator();
                while (it.hasNext()) {
                    it.next().resetAnimation$animation_core_release();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new e(this, s4, i10));
    }

    public final void removeAnimation$animation_core_release(@NotNull Transition<S>.DeferredAnimation<?, ?> deferredAnimation) {
        Transition<S>.TransitionAnimationState<?, ?> animation;
        Intrinsics.checkNotNullParameter(deferredAnimation, "deferredAnimation");
        Transition<S>.DeferredAnimationData<?, ?>.DeferredAnimationData<?, V> data$animation_core_release = deferredAnimation.getData$animation_core_release();
        if (data$animation_core_release == 0 || (animation = data$animation_core_release.getAnimation()) == null) {
            return;
        }
        removeAnimation$animation_core_release(animation);
    }

    public /* synthetic */ Transition(MutableTransitionState mutableTransitionState, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableTransitionState, (i10 & 2) != 0 ? null : str);
    }

    public Transition(S s4, @Nullable String str) {
        this(new MutableTransitionState(s4), str);
    }

    @InternalAnimationApi
    public static /* synthetic */ void getPlayTimeNanos$annotations() {
    }

    @InternalAnimationApi
    public static /* synthetic */ void isSeeking$annotations() {
    }
}
