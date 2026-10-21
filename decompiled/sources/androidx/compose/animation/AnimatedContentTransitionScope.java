package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.IntOffset;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnimatedContent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u001bJR\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2#\b\u0002\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\f0\u000bH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011JR\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2#\b\u0002\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\f0\u000bH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u0018*\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH¦\u0004\u0082\u0001\u0001\u001cø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScope;", ExifInterface.LATITUDE_SOUTH, "Landroidx/compose/animation/core/Transition$Segment;", "slideIntoContainer", "Landroidx/compose/animation/EnterTransition;", "towards", "Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntOffset;", "initialOffset", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "offsetForFullSlide", "slideIntoContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;", "slideOutOfContainer", "Landroidx/compose/animation/ExitTransition;", "targetOffset", "slideOutOfContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;", "using", "Landroidx/compose/animation/ContentTransform;", "sizeTransform", "Landroidx/compose/animation/SizeTransform;", "SlideDirection", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface AnimatedContentTransitionScope<S> extends Transition.Segment<S> {
    @NotNull
    /* JADX INFO: renamed from: slideIntoContainer-mOhB8PU, reason: not valid java name */
    EnterTransition mo28slideIntoContainermOhB8PU(int towards, @NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull Function1<? super Integer, Integer> initialOffset);

    @NotNull
    /* JADX INFO: renamed from: slideOutOfContainer-mOhB8PU, reason: not valid java name */
    ExitTransition mo29slideOutOfContainermOhB8PU(int towards, @NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull Function1<? super Integer, Integer> targetOffset);

    @NotNull
    ContentTransform using(@NotNull ContentTransform contentTransform, @Nullable SizeTransform sizeTransform);

    /* JADX INFO: compiled from: AnimatedContent.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r\u0088\u0001\u000f\u0092\u0001\u00020\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "value", "constructor-impl", "Companion", "animation_release"}, k = 1, mv = {1, 8, 0})
    @Immutable
    @JvmInline
    public static final class SlideDirection {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f2571b = m31constructorimpl(0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f2572c = m31constructorimpl(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f2573d = m31constructorimpl(2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f2574e = m31constructorimpl(3);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f2575f = m31constructorimpl(4);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f2576g = m31constructorimpl(5);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2577a;

        /* JADX INFO: compiled from: AnimatedContent.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection$Companion;", "", "()V", "Down", "Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection;", "getDown-DKzdypw", "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "End", "getEnd-DKzdypw", "Left", "getLeft-DKzdypw", "Right", "getRight-DKzdypw", "Start", "getStart-DKzdypw", "Up", "getUp-DKzdypw", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: getDown-DKzdypw, reason: not valid java name */
            public final int m37getDownDKzdypw() {
                return SlideDirection.f2574e;
            }

            /* JADX INFO: renamed from: getEnd-DKzdypw, reason: not valid java name */
            public final int m38getEndDKzdypw() {
                return SlideDirection.f2576g;
            }

            /* JADX INFO: renamed from: getLeft-DKzdypw, reason: not valid java name */
            public final int m39getLeftDKzdypw() {
                return SlideDirection.f2571b;
            }

            /* JADX INFO: renamed from: getRight-DKzdypw, reason: not valid java name */
            public final int m40getRightDKzdypw() {
                return SlideDirection.f2572c;
            }

            /* JADX INFO: renamed from: getStart-DKzdypw, reason: not valid java name */
            public final int m41getStartDKzdypw() {
                return SlideDirection.f2575f;
            }

            /* JADX INFO: renamed from: getUp-DKzdypw, reason: not valid java name */
            public final int m42getUpDKzdypw() {
                return SlideDirection.f2573d;
            }
        }

        public /* synthetic */ SlideDirection(int i10) {
            this.f2577a = i10;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ SlideDirection m30boximpl(int i10) {
            return new SlideDirection(i10);
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m32equalsimpl(int i10, Object obj) {
            return (obj instanceof SlideDirection) && i10 == ((SlideDirection) obj).getF2577a();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m33equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        @NotNull
        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m35toStringimpl(int i10) {
            if (m33equalsimpl0(i10, f2571b)) {
                return "Left";
            }
            if (m33equalsimpl0(i10, f2572c)) {
                return "Right";
            }
            if (m33equalsimpl0(i10, f2573d)) {
                return "Up";
            }
            if (m33equalsimpl0(i10, f2574e)) {
                return "Down";
            }
            if (m33equalsimpl0(i10, f2575f)) {
                return "Start";
            }
            return m33equalsimpl0(i10, f2576g) ? "End" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m32equalsimpl(this.f2577a, obj);
        }

        public int hashCode() {
            return m34hashCodeimpl(this.f2577a);
        }

        @NotNull
        public String toString() {
            return m35toStringimpl(this.f2577a);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getF2577a() {
            return this.f2577a;
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m31constructorimpl(int i10) {
            return i10;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m34hashCodeimpl(int i10) {
            return i10;
        }
    }
}
