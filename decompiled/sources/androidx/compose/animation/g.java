package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AnimatedContent.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g {

    /* JADX INFO: compiled from: AnimatedContent.kt */
    public static final class a extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f3230p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            return Integer.valueOf(num.intValue());
        }
    }

    /* JADX INFO: compiled from: AnimatedContent.kt */
    public static final class b extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f3231p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            return Integer.valueOf(num.intValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EnterTransition a(AnimatedContentTransitionScope animatedContentTransitionScope, int i10, FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideIntoContainer-mOhB8PU");
        }
        if ((i11 & 2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m4498boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 3, null);
        }
        if ((i11 & 4) != 0) {
            function1 = a.f3230p0;
        }
        return animatedContentTransitionScope.mo28slideIntoContainermOhB8PU(i10, finiteAnimationSpec, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExitTransition b(AnimatedContentTransitionScope animatedContentTransitionScope, int i10, FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideOutOfContainer-mOhB8PU");
        }
        if ((i11 & 2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m4498boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 3, null);
        }
        if ((i11 & 4) != 0) {
            function1 = b.f3231p0;
        }
        return animatedContentTransitionScope.mo29slideOutOfContainermOhB8PU(i10, finiteAnimationSpec, function1);
    }
}
