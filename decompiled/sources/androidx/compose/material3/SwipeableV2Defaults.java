package androidx.compose.material3;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SwipeableV2.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b+\u0010\u0019J\u0084\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u000326\u0010\f\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00052!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u000b0\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011R&\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R)\u0010!\u001a\u00020\u001b8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010\u0019\u001a\u0004\b\u001e\u0010\u001fRF\u0010*\u001a(\u0012\u0004\u0012\u00020\"\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0002\b$8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010\u0019\u001a\u0004\b'\u0010(\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006,"}, d2 = {"Landroidx/compose/material3/SwipeableV2Defaults;", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/material3/SwipeableV2State;", "state", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "target", "", "velocity", "", "animate", "Lkotlin/Function1;", "snap", "Landroidx/compose/material3/AnchorChangeHandler;", "ReconcileAnimationOnAnchorChangeHandler$material3_release", "(Landroidx/compose/material3/SwipeableV2State;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Landroidx/compose/material3/AnchorChangeHandler;", "ReconcileAnimationOnAnchorChangeHandler", "Landroidx/compose/animation/core/SpringSpec;", "a", "Landroidx/compose/animation/core/SpringSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/SpringSpec;", "getAnimationSpec$annotations", "()V", "AnimationSpec", "Landroidx/compose/ui/unit/Dp;", "b", "F", "getVelocityThreshold-D9Ej5fM", "()F", "getVelocityThreshold-D9Ej5fM$annotations", "VelocityThreshold", "Landroidx/compose/ui/unit/Density;", "totalDistance", "Lkotlin/ExtensionFunctionType;", "c", "Lkotlin/jvm/functions/Function2;", "getPositionalThreshold", "()Lkotlin/jvm/functions/Function2;", "getPositionalThreshold$annotations", "PositionalThreshold", "<init>", "material3_release"}, k = 1, mv = {1, 8, 0})
@Stable
@SourceDebugExtension({"SMAP\nSwipeableV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material3/SwipeableV2Defaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,692:1\n154#2:693\n154#2:694\n*S KotlinDebug\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material3/SwipeableV2Defaults\n*L\n581#1:693\n588#1:694\n*E\n"})
public final class SwipeableV2Defaults {

    @NotNull
    public static final SwipeableV2Defaults INSTANCE = new SwipeableV2Defaults();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SpringSpec<Float> AnimationSpec = new SpringSpec<>(0.0f, 0.0f, null, 7, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final float VelocityThreshold = Dp.m4389constructorimpl(125);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Function2<Density, Float, Float> PositionalThreshold = SwipeableV2Kt.m1340fixedPositionalThreshold0680j_4(Dp.m4389constructorimpl(56));

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SwipeableV2.kt */
    public static final class a<T> implements AnchorChangeHandler<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function2<T, Float, Unit> f11810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SwipeableV2State<T> f11811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Unit> f11812c;

        public a(SwipeableV2State swipeableV2State, Function2 function2, Function1 function1) {
            this.f11810a = function2;
            this.f11811b = swipeableV2State;
            this.f11812c = function1;
        }

        @Override // androidx.compose.material3.AnchorChangeHandler
        public final void onAnchorsChanged(T t10, @NotNull Map<T, Float> previousAnchors, @NotNull Map<T, Float> newAnchors) {
            Intrinsics.checkNotNullParameter(previousAnchors, "previousAnchors");
            Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
            Float f6 = previousAnchors.get(t10);
            Float f10 = newAnchors.get(t10);
            if (Intrinsics.areEqual(f6, f10)) {
                return;
            }
            SwipeableV2State<T> swipeableV2State = this.f11811b;
            if (f10 != null) {
                this.f11810a.invoke(t10, Float.valueOf(swipeableV2State.getLastVelocity()));
            } else {
                this.f11812c.invoke((T) SwipeableV2Kt.a(newAnchors, swipeableV2State.requireOffset(), false));
            }
        }
    }

    @ExperimentalMaterial3Api
    @NotNull
    public final <T> AnchorChangeHandler<T> ReconcileAnimationOnAnchorChangeHandler$material3_release(@NotNull SwipeableV2State<T> state, @NotNull Function2<? super T, ? super Float, Unit> animate, @NotNull Function1<? super T, Unit> snap) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(animate, "animate");
        Intrinsics.checkNotNullParameter(snap, "snap");
        return new a(state, animate, snap);
    }

    @NotNull
    public final SpringSpec<Float> getAnimationSpec() {
        return AnimationSpec;
    }

    @NotNull
    public final Function2<Density, Float, Float> getPositionalThreshold() {
        return PositionalThreshold;
    }

    /* JADX INFO: renamed from: getVelocityThreshold-D9Ej5fM, reason: not valid java name */
    public final float m1339getVelocityThresholdD9Ej5fM() {
        return VelocityThreshold;
    }

    @ExperimentalMaterial3Api
    public static /* synthetic */ void getAnimationSpec$annotations() {
    }

    @ExperimentalMaterial3Api
    public static /* synthetic */ void getPositionalThreshold$annotations() {
    }

    @ExperimentalMaterial3Api
    /* JADX INFO: renamed from: getVelocityThreshold-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m1338getVelocityThresholdD9Ej5fM$annotations() {
    }
}
