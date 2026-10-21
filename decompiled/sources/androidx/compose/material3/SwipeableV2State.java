package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
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
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SwipeableV2.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b8\b\u0001\u0018\u0000 p*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001pB\u0081\u0001\u0012\u0006\u0010m\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001b\u0012#\b\u0002\u0010)\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00070!\u0012.\b\u0002\u00102\u001a(\u0012\u0004\u0012\u00020+\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00030*¢\u0006\u0002\b-\u0012\b\b\u0002\u00108\u001a\u000203ø\u0001\u0000¢\u0006\u0004\bn\u0010oJ\u0006\u0010\u0004\u001a\u00020\u0003J#\u0010\n\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0019\u0010\rR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR5\u0010)\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00070!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R@\u00102\u001a(\u0012\u0004\u0012\u00020+\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00030*¢\u0006\u0002\b-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R#\u00108\u001a\u0002038\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u0010>\u001a\u0002098\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R+\u0010F\u001a\u00028\u00002\u0006\u0010?\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001b\u0010\u000e\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010CR/\u0010O\u001a\u0004\u0018\u00010\u00032\b\u0010?\u001a\u0004\u0018\u00010\u00038F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bJ\u0010A\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001b\u0010R\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bP\u0010H\u001a\u0004\bQ\u00107R+\u0010W\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u00038F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bS\u0010A\u001a\u0004\bT\u00107\"\u0004\bU\u0010VR\u001b\u0010Z\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bX\u0010H\u001a\u0004\bY\u00107R\u001b\u0010]\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b[\u0010H\u001a\u0004\b\\\u00107RC\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u00058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b^\u0010A\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR$\u0010j\u001a\u0004\u0018\u00010+8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u0011\u0010k\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bk\u0010l\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006q"}, d2 = {"Landroidx/compose/material3/SwipeableV2State;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "requireOffset", "", "newAnchors", "", "updateAnchors$material3_release", "(Ljava/util/Map;)Z", "updateAnchors", "value", "hasAnchorForValue", "(Ljava/lang/Object;)Z", "targetValue", "", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "velocity", "animateTo", "(Ljava/lang/Object;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "settle", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "dispatchRawDelta", "trySnapTo$material3_release", "trySnapTo", "Landroidx/compose/animation/core/AnimationSpec;", "a", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec$material3_release", "()Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newValue", "b", "Lkotlin/jvm/functions/Function1;", "getConfirmValueChange$material3_release", "()Lkotlin/jvm/functions/Function1;", "confirmValueChange", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "totalDistance", "Lkotlin/ExtensionFunctionType;", "c", "Lkotlin/jvm/functions/Function2;", "getPositionalThreshold$material3_release", "()Lkotlin/jvm/functions/Function2;", "positionalThreshold", "Landroidx/compose/ui/unit/Dp;", "d", "F", "getVelocityThreshold-D9Ej5fM$material3_release", "()F", "velocityThreshold", "Landroidx/compose/foundation/gestures/DraggableState;", "f", "Landroidx/compose/foundation/gestures/DraggableState;", "getSwipeDraggableState$material3_release", "()Landroidx/compose/foundation/gestures/DraggableState;", "swipeDraggableState", "<set-?>", "g", "Landroidx/compose/runtime/MutableState;", "getCurrentValue", "()Ljava/lang/Object;", "setCurrentValue", "(Ljava/lang/Object;)V", "currentValue", "h", "Landroidx/compose/runtime/State;", "getTargetValue", "i", "getOffset", "()Ljava/lang/Float;", "setOffset", "(Ljava/lang/Float;)V", TypedValues.CycleType.S_WAVE_OFFSET, "j", "getProgress", "progress", "k", "getLastVelocity", "setLastVelocity", "(F)V", "lastVelocity", "l", "getMinOffset", "minOffset", "m", "getMaxOffset", "maxOffset", "o", "getAnchors$material3_release", "()Ljava/util/Map;", "setAnchors$material3_release", "(Ljava/util/Map;)V", "anchors", "p", "Landroidx/compose/ui/unit/Density;", "getDensity$material3_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$material3_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "isAnimationRunning", "()Z", "initialValue", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
@Stable
@SourceDebugExtension({"SMAP\nSwipeableV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material3/SwipeableV2State\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,692:1\n76#2:693\n102#2,2:694\n76#2:696\n76#2:697\n102#2,2:698\n76#2:700\n76#2:701\n102#2,2:702\n76#2:704\n76#2:705\n76#2:706\n102#2,2:707\n76#2:709\n102#2,2:710\n288#3,2:712\n1#4:714\n*S KotlinDebug\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material3/SwipeableV2State\n*L\n199#1:693\n199#1:694,2\n207#1:696\n230#1:697\n230#1:698,2\n253#1:700\n270#1:701\n270#1:702,2\n277#1:704\n283#1:705\n285#1:706\n285#1:707,2\n287#1:709\n287#1:710,2\n369#1:712,2\n*E\n"})
public final class SwipeableV2State<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AnimationSpec<Float> animationSpec;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<T, Boolean> confirmValueChange;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function2<Density, Float, Float> positionalThreshold;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final float velocityThreshold;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final InternalMutatorMutex f11838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final SwipeableV2State$swipeDraggableState$1 f11839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState currentValue;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final State targetValue;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState offset;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final State progress;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState lastVelocity;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final State minOffset;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final State maxOffset;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final MutableState f11846n;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState anchors;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Density density;

    /* JADX INFO: compiled from: SwipeableV2.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0089\u0001\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0001\u0010\u0006*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\f0\u000b2,\u0010\r\u001a(\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\t0\u000e¢\u0006\u0002\b\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/material3/SwipeableV2State$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/SwipeableV2State;", ExifInterface.GPS_DIRECTION_TRUE, "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmValueChange", "Lkotlin/Function1;", "", "positionalThreshold", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/ParameterName;", "name", "distance", "Lkotlin/ExtensionFunctionType;", "velocityThreshold", "Landroidx/compose/ui/unit/Dp;", "Saver-eqLRuRQ", "(Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;F)Landroidx/compose/runtime/saveable/Saver;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: SwipeableV2.kt */
        public static final class a extends Lambda implements Function2<SaverScope, SwipeableV2State<T>, T> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f11849p0 = new a(2);

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SaverScope saverScope, Object obj) {
                SaverScope Saver = saverScope;
                SwipeableV2State it = (SwipeableV2State) obj;
                Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getCurrentValue();
            }
        }

        /* JADX INFO: compiled from: SwipeableV2.kt */
        public static final class b extends Lambda implements Function1<T, SwipeableV2State<T>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ AnimationSpec<Float> f11850p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Function1<T, Boolean> f11851q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ Function2<Density, Float, Float> f11852r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ float f11853s0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> function1, Function2<? super Density, ? super Float, Float> function2, float f6) {
                super(1);
                this.f11850p0 = animationSpec;
                this.f11851q0 = function1;
                this.f11852r0 = function2;
                this.f11853s0 = f6;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new SwipeableV2State(it, this.f11850p0, this.f11851q0, this.f11852r0, this.f11853s0, null);
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @ExperimentalMaterial3Api
        @NotNull
        /* JADX INFO: renamed from: Saver-eqLRuRQ, reason: not valid java name */
        public final <T> Saver<SwipeableV2State<T>, T> m1342SavereqLRuRQ(@NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super T, Boolean> confirmValueChange, @NotNull Function2<? super Density, ? super Float, Float> positionalThreshold, float velocityThreshold) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
            Intrinsics.checkNotNullParameter(positionalThreshold, "positionalThreshold");
            return SaverKt.Saver(a.f11849p0, new b(animationSpec, confirmValueChange, positionalThreshold, velocityThreshold));
        }
    }

    /* JADX INFO: compiled from: SwipeableV2.kt */
    public static final class a extends Lambda implements Function1<T, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f11854p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: SwipeableV2.kt */
    @DebugMetadata(c = "androidx.compose.material3.SwipeableV2State", f = "SwipeableV2.kt", i = {0}, l = {ResultCode.ERROR_CONN_SSL_GENERIC}, m = "animateTo", n = {"this"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public SwipeableV2State f11855p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f11856q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SwipeableV2State<T> f11857r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f11858s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SwipeableV2State<T> swipeableV2State, Continuation<? super b> continuation) {
            super(continuation);
            this.f11857r0 = swipeableV2State;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f11856q0 = obj;
            this.f11858s0 |= Integer.MIN_VALUE;
            return this.f11857r0.animateTo(null, 0.0f, this);
        }
    }

    /* JADX INFO: compiled from: SwipeableV2.kt */
    @DebugMetadata(c = "androidx.compose.material3.SwipeableV2State$animateTo$2", f = "SwipeableV2.kt", i = {}, l = {ResultCode.ERROR_CONN_SSL_KEY}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f11859p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SwipeableV2State<T> f11860q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ T f11861r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Float f11862s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ float f11863t0;

        /* JADX INFO: compiled from: SwipeableV2.kt */
        public static final class a extends Lambda implements Function2<Float, Float, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ SwipeableV2State<T> f11864p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Ref.FloatRef f11865q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SwipeableV2State<T> swipeableV2State, Ref.FloatRef floatRef) {
                super(2);
                this.f11864p0 = swipeableV2State;
                this.f11865q0 = floatRef;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(Float f6, Float f10) {
                float fFloatValue = f6.floatValue();
                float fFloatValue2 = f10.floatValue();
                Float fValueOf = Float.valueOf(fFloatValue);
                SwipeableV2State<T> swipeableV2State = this.f11864p0;
                SwipeableV2State.access$setOffset(swipeableV2State, fValueOf);
                this.f11865q0.element = fFloatValue;
                SwipeableV2State.access$setLastVelocity(swipeableV2State, fFloatValue2);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SwipeableV2State<T> swipeableV2State, T t10, Float f6, float f10, Continuation<? super c> continuation) {
            super(1, continuation);
            this.f11860q0 = swipeableV2State;
            this.f11861r0 = t10;
            this.f11862s0 = f6;
            this.f11863t0 = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new c(this.f11860q0, this.f11861r0, this.f11862s0, this.f11863t0, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((c) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f11859p0;
            SwipeableV2State<T> swipeableV2State = this.f11860q0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                SwipeableV2State.access$setAnimationTarget(swipeableV2State, this.f11861r0);
                Ref.FloatRef floatRef = new Ref.FloatRef();
                Float offset = swipeableV2State.getOffset();
                float fFloatValue = offset != null ? offset.floatValue() : 0.0f;
                floatRef.element = fFloatValue;
                float fFloatValue2 = this.f11862s0.floatValue();
                float f6 = this.f11863t0;
                AnimationSpec<Float> animationSpec$material3_release = swipeableV2State.getAnimationSpec$material3_release();
                a aVar = new a(swipeableV2State, floatRef);
                this.f11859p0 = 1;
                if (SuspendAnimationKt.animate(fFloatValue, fFloatValue2, f6, animationSpec$material3_release, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SwipeableV2State.access$setLastVelocity(swipeableV2State, 0.0f);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SwipeableV2.kt */
    @DebugMetadata(c = "androidx.compose.material3.SwipeableV2State$snapTo$2", f = "SwipeableV2.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SwipeableV2State<T> f11866p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ T f11867q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(SwipeableV2State<T> swipeableV2State, T t10, Continuation<? super d> continuation) {
            super(1, continuation);
            this.f11866p0 = swipeableV2State;
            this.f11867q0 = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new d(this.f11866p0, this.f11867q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((d) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            SwipeableV2State.access$snap(this.f11866p0, this.f11867q0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SwipeableV2.kt */
    public static final class e extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SwipeableV2State<T> f11868p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ T f11869q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(SwipeableV2State<T> swipeableV2State, T t10) {
            super(0);
            this.f11868p0 = swipeableV2State;
            this.f11869q0 = t10;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            SwipeableV2State.access$snap(this.f11868p0, this.f11869q0);
            return Unit.INSTANCE;
        }
    }

    public SwipeableV2State() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.material3.SwipeableV2State$swipeDraggableState$1] */
    public SwipeableV2State(Object obj, AnimationSpec animationSpec, Function1 confirmValueChange, Function2 positionalThreshold, float f6, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
        Intrinsics.checkNotNullParameter(positionalThreshold, "positionalThreshold");
        this.animationSpec = animationSpec;
        this.confirmValueChange = confirmValueChange;
        this.positionalThreshold = positionalThreshold;
        this.velocityThreshold = f6;
        this.f11838e = new InternalMutatorMutex();
        this.f11839f = new DraggableState(this) { // from class: androidx.compose.material3.SwipeableV2State$swipeDraggableState$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final SwipeableV2State$swipeDraggableState$1$dragScope$1 f11870a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SwipeableV2State<Object> f11871b;

            /* JADX INFO: compiled from: SwipeableV2.kt */
            @DebugMetadata(c = "androidx.compose.material3.SwipeableV2State$swipeDraggableState$1$drag$2", f = "SwipeableV2.kt", i = {}, l = {188}, m = "invokeSuspend", n = {}, s = {})
            public static final class a extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public int f11872p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ Function2<DragScope, Continuation<? super Unit>, Object> f11873q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ SwipeableV2State$swipeDraggableState$1 f11874r0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Function2 function2, SwipeableV2State$swipeDraggableState$1 swipeableV2State$swipeDraggableState$1, Continuation continuation) {
                    super(1, continuation);
                    this.f11873q0 = function2;
                    this.f11874r0 = swipeableV2State$swipeDraggableState$1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                    return new a(this.f11873q0, this.f11874r0, continuation);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Continuation<? super Unit> continuation) {
                    return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                    int i10 = this.f11872p0;
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        SwipeableV2State$swipeDraggableState$1$dragScope$1 swipeableV2State$swipeDraggableState$1$dragScope$1 = this.f11874r0.f11870a;
                        this.f11872p0 = 1;
                        if (this.f11873q0.invoke(swipeableV2State$swipeDraggableState$1$dragScope$1, this) == coroutine_suspended) {
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

            /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.material3.SwipeableV2State$swipeDraggableState$1$dragScope$1] */
            {
                this.f11871b = this;
                this.f11870a = new DragScope() { // from class: androidx.compose.material3.SwipeableV2State$swipeDraggableState$1$dragScope$1
                    @Override // androidx.compose.foundation.gestures.DragScope
                    public void dragBy(float pixels) {
                        this.dispatchRawDelta(pixels);
                    }
                };
            }

            @Override // androidx.compose.foundation.gestures.DraggableState
            public void dispatchRawDelta(float delta) {
                this.f11871b.dispatchRawDelta(delta);
            }

            @Override // androidx.compose.foundation.gestures.DraggableState
            @Nullable
            public Object drag(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super DragScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
                Object objAccess$swipe = SwipeableV2State.access$swipe(this.f11871b, mutatePriority, new a(function2, this, null), continuation);
                return objAccess$swipe == ek.a.getCOROUTINE_SUSPENDED() ? objAccess$swipe : Unit.INSTANCE;
            }
        };
        this.currentValue = SnapshotStateKt.mutableStateOf$default(obj, null, 2, null);
        this.targetValue = SnapshotStateKt.derivedStateOf(new l0.j4(this));
        this.offset = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.progress = SnapshotStateKt.derivedStateOf(new l0.h4(this));
        this.lastVelocity = SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
        this.minOffset = SnapshotStateKt.derivedStateOf(new l0.g4(this));
        this.maxOffset = SnapshotStateKt.derivedStateOf(new l0.f4(this));
        this.f11846n = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.anchors = SnapshotStateKt.mutableStateOf$default(bk.q.emptyMap(), null, 2, null);
    }

    public static final void access$setAnimationTarget(SwipeableV2State swipeableV2State, Object obj) {
        swipeableV2State.f11846n.setValue(obj);
    }

    public static final void access$setLastVelocity(SwipeableV2State swipeableV2State, float f6) {
        swipeableV2State.lastVelocity.setValue(Float.valueOf(f6));
    }

    public static final void access$setOffset(SwipeableV2State swipeableV2State, Float f6) {
        swipeableV2State.offset.setValue(f6);
    }

    public static final void access$snap(SwipeableV2State swipeableV2State, Object obj) {
        Float f6 = swipeableV2State.getAnchors$material3_release().get(obj);
        MutableState mutableState = swipeableV2State.currentValue;
        if (f6 == null) {
            mutableState.setValue(obj);
            return;
        }
        float fFloatValue = f6.floatValue();
        Float offset = swipeableV2State.getOffset();
        swipeableV2State.dispatchRawDelta(fFloatValue - (offset != null ? offset.floatValue() : 0.0f));
        mutableState.setValue(obj);
        swipeableV2State.f11846n.setValue(null);
    }

    public static final Object access$swipe(SwipeableV2State swipeableV2State, MutatePriority mutatePriority, Function1 function1, Continuation continuation) {
        swipeableV2State.getClass();
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new l0.i4(swipeableV2State, mutatePriority, function1, null), continuation);
        return objCoroutineScope == ek.a.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animateTo$default(SwipeableV2State swipeableV2State, Object obj, float f6, Continuation continuation, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            f6 = swipeableV2State.getLastVelocity();
        }
        return swipeableV2State.animateTo(obj, f6, continuation);
    }

    public final Object a(float f6, float f10, Object obj) {
        Object objA;
        Map<T, Float> anchors$material3_release = getAnchors$material3_release();
        Float f11 = anchors$material3_release.get(obj);
        Density density = this.density;
        if (density == null) {
            throw new IllegalArgumentException(("SwipeableState did not have a density attached. Are you using Modifier.swipeable with this=" + this + " SwipeableState?").toString());
        }
        float fMo415toPx0680j_4 = density.mo415toPx0680j_4(this.velocityThreshold);
        if (Intrinsics.areEqual(f11, f6) || f11 == null) {
            return obj;
        }
        float fFloatValue = f11.floatValue();
        Function2<Density, Float, Float> function2 = this.positionalThreshold;
        if (fFloatValue < f6) {
            if (f10 >= fMo415toPx0680j_4) {
                return SwipeableV2Kt.a(anchors$material3_release, f6, true);
            }
            objA = SwipeableV2Kt.a(anchors$material3_release, f6, true);
            if (f6 < Math.abs(f11.floatValue() + Math.abs(function2.invoke(density, Float.valueOf(Math.abs(((Number) bk.q.getValue(anchors$material3_release, objA)).floatValue() - f11.floatValue()))).floatValue()))) {
                return obj;
            }
        } else {
            if (f10 <= (-fMo415toPx0680j_4)) {
                return SwipeableV2Kt.a(anchors$material3_release, f6, false);
            }
            objA = SwipeableV2Kt.a(anchors$material3_release, f6, false);
            float fAbs = Math.abs(f11.floatValue() - Math.abs(function2.invoke(density, Float.valueOf(Math.abs(f11.floatValue() - ((Number) bk.q.getValue(anchors$material3_release, objA)).floatValue()))).floatValue()));
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

    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:56:0x0101  */
    /* JADX WARN: Code duplicated, block: B:58:0x0107  */
    /* JADX WARN: Code duplicated, block: B:71:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object animateTo(T t10, float f6, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        b bVar;
        SwipeableV2State<T> swipeableV2State;
        float fRequireOffset;
        Iterator<T> it;
        T next;
        Object key;
        float fRequireOffset2;
        Iterator<T> it2;
        T next2;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f11858s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f11858s0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, continuation);
            }
        } else {
            bVar = new b(this, continuation);
        }
        Object obj = bVar.f11856q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f11858s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            Float f10 = getAnchors$material3_release().get(t10);
            if (f10 != null) {
                try {
                    c cVar = new c(this, t10, f10, f6, null);
                    bVar.f11855p0 = this;
                    bVar.f11858s0 = 1;
                    try {
                        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new l0.i4(this, MutatePriority.Default, cVar, null), bVar);
                        if (objCoroutineScope != ek.a.getCOROUTINE_SUSPENDED()) {
                            objCoroutineScope = Unit.INSTANCE;
                        }
                        if (objCoroutineScope == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        swipeableV2State = this;
                        swipeableV2State.f11846n.setValue(null);
                        fRequireOffset2 = swipeableV2State.requireOffset();
                        it2 = swipeableV2State.getAnchors$material3_release().entrySet().iterator();
                        do {
                            if (it2.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it2.next();
                        } while (Math.abs(((Number) ((Map.Entry) next2).getValue()).floatValue() - fRequireOffset2) >= 0.5f);
                        Map.Entry entry = (Map.Entry) next2;
                        if (entry != null) {
                        }
                        if (key == null) {
                            key = swipeableV2State.getCurrentValue();
                        }
                        swipeableV2State.currentValue.setValue(key);
                    } catch (Throwable th2) {
                        th = th2;
                        swipeableV2State = this;
                        swipeableV2State.f11846n.setValue(null);
                        fRequireOffset = swipeableV2State.requireOffset();
                        it = swipeableV2State.getAnchors$material3_release().entrySet().iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (Math.abs(((Number) ((Map.Entry) next).getValue()).floatValue() - fRequireOffset) >= 0.5f);
                        Map.Entry entry2 = (Map.Entry) next;
                        if (entry2 != null) {
                        }
                        if (key == null) {
                            key = swipeableV2State.getCurrentValue();
                        }
                        swipeableV2State.currentValue.setValue(key);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                this.currentValue.setValue(t10);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            swipeableV2State = bVar.f11855p0;
            try {
                ResultKt.throwOnFailure(obj);
                swipeableV2State.f11846n.setValue(null);
                fRequireOffset2 = swipeableV2State.requireOffset();
                it2 = swipeableV2State.getAnchors$material3_release().entrySet().iterator();
                do {
                    if (it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (Math.abs(((Number) ((Map.Entry) next2).getValue()).floatValue() - fRequireOffset2) >= 0.5f);
                Map.Entry entry3 = (Map.Entry) next2;
                key = entry3 != null ? entry3.getKey() : null;
                if (key == null) {
                    key = swipeableV2State.getCurrentValue();
                }
                swipeableV2State.currentValue.setValue(key);
            } catch (Throwable th4) {
                th = th4;
                swipeableV2State.f11846n.setValue(null);
                fRequireOffset = swipeableV2State.requireOffset();
                it = swipeableV2State.getAnchors$material3_release().entrySet().iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (Math.abs(((Number) ((Map.Entry) next).getValue()).floatValue() - fRequireOffset) >= 0.5f);
                Map.Entry entry4 = (Map.Entry) next;
                key = entry4 != null ? entry4.getKey() : null;
                if (key == null) {
                    key = swipeableV2State.getCurrentValue();
                }
                swipeableV2State.currentValue.setValue(key);
                throw th;
            }
        }
        return Unit.INSTANCE;
    }

    public final float dispatchRawDelta(float delta) {
        Float offset = getOffset();
        float fFloatValue = offset != null ? offset.floatValue() : 0.0f;
        float fCoerceIn = kotlin.ranges.c.coerceIn(delta + fFloatValue, getMinOffset(), getMaxOffset()) - fFloatValue;
        if (Math.abs(fCoerceIn) >= 0.0f) {
            Float offset2 = getOffset();
            this.offset.setValue(Float.valueOf(kotlin.ranges.c.coerceIn((offset2 != null ? offset2.floatValue() : 0.0f) + fCoerceIn, getMinOffset(), getMaxOffset())));
        }
        return fCoerceIn;
    }

    @NotNull
    public final Map<T, Float> getAnchors$material3_release() {
        return (Map) this.anchors.getValue();
    }

    @NotNull
    public final AnimationSpec<Float> getAnimationSpec$material3_release() {
        return this.animationSpec;
    }

    @NotNull
    public final Function1<T, Boolean> getConfirmValueChange$material3_release() {
        return this.confirmValueChange;
    }

    public final T getCurrentValue() {
        return this.currentValue.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: getDensity$material3_release, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    public final float getLastVelocity() {
        return ((Number) this.lastVelocity.getValue()).floatValue();
    }

    public final float getMaxOffset() {
        return ((Number) this.maxOffset.getValue()).floatValue();
    }

    public final float getMinOffset() {
        return ((Number) this.minOffset.getValue()).floatValue();
    }

    @Nullable
    public final Float getOffset() {
        return (Float) this.offset.getValue();
    }

    @NotNull
    public final Function2<Density, Float, Float> getPositionalThreshold$material3_release() {
        return this.positionalThreshold;
    }

    public final float getProgress() {
        return ((Number) this.progress.getValue()).floatValue();
    }

    @NotNull
    public final DraggableState getSwipeDraggableState$material3_release() {
        return this.f11839f;
    }

    public final T getTargetValue() {
        return (T) this.targetValue.getValue();
    }

    /* JADX INFO: renamed from: getVelocityThreshold-D9Ej5fM$material3_release, reason: not valid java name and from getter */
    public final float getVelocityThreshold() {
        return this.velocityThreshold;
    }

    public final boolean hasAnchorForValue(T value) {
        return getAnchors$material3_release().containsKey(value);
    }

    public final boolean isAnimationRunning() {
        return this.f11846n.getValue() != null;
    }

    public final float requireOffset() {
        Float offset = getOffset();
        if (offset != null) {
            return offset.floatValue();
        }
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString());
    }

    public final void setAnchors$material3_release(@NotNull Map<T, Float> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.anchors.setValue(map);
    }

    public final void setDensity$material3_release(@Nullable Density density) {
        this.density = density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object settle(float f6, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object currentValue = getCurrentValue();
        Object objA = a(requireOffset(), f6, currentValue);
        if (this.confirmValueChange.invoke((T) objA).booleanValue()) {
            Object objAnimateTo = animateTo(objA, f6, continuation);
            return objAnimateTo == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo : Unit.INSTANCE;
        }
        Object objAnimateTo2 = animateTo(currentValue, f6, continuation);
        return objAnimateTo2 == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateTo2 : Unit.INSTANCE;
    }

    @Nullable
    public final Object snapTo(T t10, @NotNull Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new l0.i4(this, MutatePriority.Default, new d(this, t10, null), null), continuation);
        if (objCoroutineScope != ek.a.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope == ek.a.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    public final boolean trySnapTo$material3_release(T targetValue) {
        return this.f11838e.tryMutate(new e(this, targetValue));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
    public final boolean updateAnchors$material3_release(@NotNull Map<T, Float> newAnchors) {
        Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
        boolean zIsEmpty = getAnchors$material3_release().isEmpty();
        setAnchors$material3_release(newAnchors);
        if (zIsEmpty) {
            T currentValue = getCurrentValue();
            boolean z10 = getAnchors$material3_release().get(currentValue) != null;
            if (z10) {
                trySnapTo$material3_release(currentValue);
            }
            if (z10) {
                if (zIsEmpty) {
                    return false;
                }
            }
        } else if (zIsEmpty) {
            return false;
        }
        return true;
    }

    public /* synthetic */ SwipeableV2State(Object obj, AnimationSpec animationSpec, Function1 function1, Function2 function2, float f6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? SwipeableV2Defaults.INSTANCE.getAnimationSpec() : animationSpec, (i10 & 4) != 0 ? a.f11854p0 : function1, (i10 & 8) != 0 ? SwipeableV2Defaults.INSTANCE.getPositionalThreshold() : function2, (i10 & 16) != 0 ? SwipeableV2Defaults.INSTANCE.m1339getVelocityThresholdD9Ej5fM() : f6, null);
    }
}
