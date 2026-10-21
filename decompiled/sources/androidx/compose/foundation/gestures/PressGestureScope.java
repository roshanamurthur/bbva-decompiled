package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TapGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "awaitRelease", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryAwaitRelease", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PressGestureScope extends Density {

    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m205roundToPxR2X_6o(@NotNull PressGestureScope pressGestureScope, long j10) {
            return x1.a.a(pressGestureScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m206roundToPx0680j_4(@NotNull PressGestureScope pressGestureScope, float f6) {
            return x1.a.b(pressGestureScope, f6);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m207toDpGaN1DYA(@NotNull PressGestureScope pressGestureScope, long j10) {
            return x1.a.c(pressGestureScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m208toDpu2uoSUM(@NotNull PressGestureScope pressGestureScope, float f6) {
            return x1.a.d(pressGestureScope, f6);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m210toDpSizekrfVVM(@NotNull PressGestureScope pressGestureScope, long j10) {
            return x1.a.f(pressGestureScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m211toPxR2X_6o(@NotNull PressGestureScope pressGestureScope, long j10) {
            return x1.a.g(pressGestureScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m212toPx0680j_4(@NotNull PressGestureScope pressGestureScope, float f6) {
            return x1.a.h(pressGestureScope, f6);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull PressGestureScope pressGestureScope, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return x1.a.i(pressGestureScope, receiver);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m213toSizeXkaWNTQ(@NotNull PressGestureScope pressGestureScope, long j10) {
            return x1.a.j(pressGestureScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m214toSp0xMU5do(@NotNull PressGestureScope pressGestureScope, float f6) {
            return x1.a.k(pressGestureScope, f6);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m215toSpkPz2Gy4(@NotNull PressGestureScope pressGestureScope, float f6) {
            return x1.a.l(pressGestureScope, f6);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m209toDpu2uoSUM(@NotNull PressGestureScope pressGestureScope, int i10) {
            return x1.a.e(pressGestureScope, i10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m216toSpkPz2Gy4(@NotNull PressGestureScope pressGestureScope, int i10) {
            return x1.a.m(pressGestureScope, i10);
        }
    }

    @Nullable
    Object awaitRelease(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object tryAwaitRelease(@NotNull Continuation<? super Boolean> continuation);
}
