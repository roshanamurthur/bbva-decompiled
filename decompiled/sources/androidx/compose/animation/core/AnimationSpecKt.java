package androidx.compose.animation.core;

import androidx.compose.runtime.Stable;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a2\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007\u001a;\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a3\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u00002\u001d\u0010\u0013\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0002\b\u0012H\u0007\u001aK\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001d\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0016\u001a\u00020\u00012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a4\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001d\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0016\u001a\u00020\u00012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0007\u001aC\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000!\"\u0004\b\u0000\u0010\u00002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001a,\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000!\"\u0004\b\u0000\u0010\u00002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0007\u001a\u001e\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "durationMillis", "delayMillis", "Landroidx/compose/animation/core/Easing;", "easing", "Landroidx/compose/animation/core/TweenSpec;", "tween", "", "dampingRatio", "stiffness", "visibilityThreshold", "Landroidx/compose/animation/core/SpringSpec;", "spring", "(FFLjava/lang/Object;)Landroidx/compose/animation/core/SpringSpec;", "Lkotlin/Function1;", "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "", "Lkotlin/ExtensionFunctionType;", "init", "Landroidx/compose/animation/core/KeyframesSpec;", "keyframes", "iterations", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "animation", "Landroidx/compose/animation/core/RepeatMode;", "repeatMode", "Landroidx/compose/animation/core/StartOffset;", "initialStartOffset", "Landroidx/compose/animation/core/RepeatableSpec;", "repeatable-91I0pcU", "(ILandroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;J)Landroidx/compose/animation/core/RepeatableSpec;", "repeatable", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "infiniteRepeatable-9IiC70o", "(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;J)Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "infiniteRepeatable", "Landroidx/compose/animation/core/SnapSpec;", "snap", "animation-core_release"}, k = 2, mv = {1, 8, 0})
public final class AnimationSpecKt {
    public static final AnimationVector access$convert(TwoWayConverter twoWayConverter, Object obj) {
        if (obj == null) {
            return null;
        }
        return (AnimationVector) twoWayConverter.getConvertToVector().invoke(obj);
    }

    @Stable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This method has been deprecated in favor of the infinite repeatable function that accepts start offset.")
    public static final /* synthetic */ InfiniteRepeatableSpec infiniteRepeatable(DurationBasedAnimationSpec animation, RepeatMode repeatMode) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(repeatMode, "repeatMode");
        return new InfiniteRepeatableSpec(animation, repeatMode, StartOffset.m97constructorimpl$default(0, 0, 2, null), (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ InfiniteRepeatableSpec infiniteRepeatable$default(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        return infiniteRepeatable(durationBasedAnimationSpec, repeatMode);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: infiniteRepeatable-9IiC70o, reason: not valid java name */
    public static final <T> InfiniteRepeatableSpec<T> m77infiniteRepeatable9IiC70o(@NotNull DurationBasedAnimationSpec<T> animation, @NotNull RepeatMode repeatMode, long j10) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(repeatMode, "repeatMode");
        return new InfiniteRepeatableSpec<>(animation, repeatMode, j10, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: infiniteRepeatable-9IiC70o$default, reason: not valid java name */
    public static /* synthetic */ InfiniteRepeatableSpec m78infiniteRepeatable9IiC70o$default(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i10 & 4) != 0) {
            j10 = StartOffset.m97constructorimpl$default(0, 0, 2, null);
        }
        return m77infiniteRepeatable9IiC70o(durationBasedAnimationSpec, repeatMode, j10);
    }

    @Stable
    @NotNull
    public static final <T> KeyframesSpec<T> keyframes(@NotNull Function1<? super KeyframesSpec.KeyframesSpecConfig<T>, Unit> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = new KeyframesSpec.KeyframesSpecConfig();
        init.invoke(keyframesSpecConfig);
        return new KeyframesSpec<>(keyframesSpecConfig);
    }

    @Stable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This method has been deprecated in favor of the repeatable function that accepts start offset.")
    public static final /* synthetic */ RepeatableSpec repeatable(int i10, DurationBasedAnimationSpec animation, RepeatMode repeatMode) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(repeatMode, "repeatMode");
        return new RepeatableSpec(i10, animation, repeatMode, StartOffset.m97constructorimpl$default(0, 0, 2, null), (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ RepeatableSpec repeatable$default(int i10, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        return repeatable(i10, durationBasedAnimationSpec, repeatMode);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: repeatable-91I0pcU, reason: not valid java name */
    public static final <T> RepeatableSpec<T> m79repeatable91I0pcU(int i10, @NotNull DurationBasedAnimationSpec<T> animation, @NotNull RepeatMode repeatMode, long j10) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(repeatMode, "repeatMode");
        return new RepeatableSpec<>(i10, animation, repeatMode, j10, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: repeatable-91I0pcU$default, reason: not valid java name */
    public static /* synthetic */ RepeatableSpec m80repeatable91I0pcU$default(int i10, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i11 & 8) != 0) {
            j10 = StartOffset.m97constructorimpl$default(0, 0, 2, null);
        }
        return m79repeatable91I0pcU(i10, durationBasedAnimationSpec, repeatMode, j10);
    }

    @Stable
    @NotNull
    public static final <T> SnapSpec<T> snap(int i10) {
        return new SnapSpec<>(i10);
    }

    public static /* synthetic */ SnapSpec snap$default(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return snap(i10);
    }

    @Stable
    @NotNull
    public static final <T> SpringSpec<T> spring(float f6, float f10, @Nullable T t10) {
        return new SpringSpec<>(f6, f10, t10);
    }

    public static /* synthetic */ SpringSpec spring$default(float f6, float f10, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            f6 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f10 = 1500.0f;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return spring(f6, f10, obj);
    }

    @Stable
    @NotNull
    public static final <T> TweenSpec<T> tween(int i10, int i11, @NotNull Easing easing) {
        Intrinsics.checkNotNullParameter(easing, "easing");
        return new TweenSpec<>(i10, i11, easing);
    }

    public static /* synthetic */ TweenSpec tween$default(int i10, int i11, Easing easing, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 300;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            easing = EasingKt.getFastOutSlowInEasing();
        }
        return tween(i10, i11, easing);
    }
}
