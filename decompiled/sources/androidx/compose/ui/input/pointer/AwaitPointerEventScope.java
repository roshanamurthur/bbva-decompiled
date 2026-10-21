package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.RestrictsSuspension;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
/* JADX INFO: loaded from: classes.dex */
@RestrictsSuspension
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0013H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0014JH\u0010\u0015\u001a\u0002H\u0016\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0017\u001a\u00020\u00182'\u0010\u0019\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001a¢\u0006\u0002\b\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJJ\u0010\u001f\u001a\u0004\u0018\u0001H\u0016\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0017\u001a\u00020\u00182'\u0010\u0019\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001a¢\u0006\u0002\b\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001eR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001d\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000bX¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\f\u0010\tR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006 À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/unit/Density;", "currentEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "getCurrentEvent", "()Landroidx/compose/ui/input/pointer/PointerEvent;", "extendedTouchPadding", "Landroidx/compose/ui/geometry/Size;", "getExtendedTouchPadding-NH-jbRc", "()J", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "awaitPointerEvent", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTimeout", ExifInterface.GPS_DIRECTION_TRUE, "timeMillis", "", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTimeoutOrNull", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface AwaitPointerEventScope extends Density {

    /* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
        public static long m3397getExtendedTouchPaddingNHjbRc(@NotNull AwaitPointerEventScope awaitPointerEventScope) {
            return e1.a.a(awaitPointerEventScope);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m3398roundToPxR2X_6o(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j10) {
            return x1.a.a(awaitPointerEventScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m3399roundToPx0680j_4(@NotNull AwaitPointerEventScope awaitPointerEventScope, float f6) {
            return x1.a.b(awaitPointerEventScope, f6);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m3400toDpGaN1DYA(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j10) {
            return x1.a.c(awaitPointerEventScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3401toDpu2uoSUM(@NotNull AwaitPointerEventScope awaitPointerEventScope, float f6) {
            return x1.a.d(awaitPointerEventScope, f6);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m3403toDpSizekrfVVM(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j10) {
            return x1.a.f(awaitPointerEventScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m3404toPxR2X_6o(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j10) {
            return x1.a.g(awaitPointerEventScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m3405toPx0680j_4(@NotNull AwaitPointerEventScope awaitPointerEventScope, float f6) {
            return x1.a.h(awaitPointerEventScope, f6);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull AwaitPointerEventScope awaitPointerEventScope, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return x1.a.i(awaitPointerEventScope, receiver);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m3406toSizeXkaWNTQ(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j10) {
            return x1.a.j(awaitPointerEventScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m3407toSp0xMU5do(@NotNull AwaitPointerEventScope awaitPointerEventScope, float f6) {
            return x1.a.k(awaitPointerEventScope, f6);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3408toSpkPz2Gy4(@NotNull AwaitPointerEventScope awaitPointerEventScope, float f6) {
            return x1.a.l(awaitPointerEventScope, f6);
        }

        @Deprecated
        @Nullable
        public static <T> Object withTimeout(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j10, @NotNull Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
            return e1.a.b(awaitPointerEventScope, j10, function2, continuation);
        }

        @Deprecated
        @Nullable
        public static <T> Object withTimeoutOrNull(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j10, @NotNull Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
            return e1.a.c(awaitPointerEventScope, j10, function2, continuation);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3402toDpu2uoSUM(@NotNull AwaitPointerEventScope awaitPointerEventScope, int i10) {
            return x1.a.e(awaitPointerEventScope, i10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3409toSpkPz2Gy4(@NotNull AwaitPointerEventScope awaitPointerEventScope, int i10) {
            return x1.a.m(awaitPointerEventScope, i10);
        }
    }

    @Nullable
    Object awaitPointerEvent(@NotNull PointerEventPass pointerEventPass, @NotNull Continuation<? super PointerEvent> continuation);

    @NotNull
    PointerEvent getCurrentEvent();

    /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
    long mo3395getExtendedTouchPaddingNHjbRc();

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo3396getSizeYbymL2g();

    @NotNull
    ViewConfiguration getViewConfiguration();

    @Nullable
    <T> Object withTimeout(long j10, @NotNull Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation);

    @Nullable
    <T> Object withTimeoutOrNull(long j10, @NotNull Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation);
}
