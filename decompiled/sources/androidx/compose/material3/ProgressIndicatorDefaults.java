package androidx.compose.material3;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.material3.tokens.CircularProgressIndicatorTokens;
import androidx.compose.material3.tokens.LinearProgressIndicatorTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ProgressIndicator.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0010\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR \u0010\u0013\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u001b8Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\u00020\u001b8Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010\"\u001a\u00020\u001b8Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b!\u0010\u001dR\u001a\u0010$\u001a\u00020\u001b8Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b#\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/material3/ProgressIndicatorDefaults;", "", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getCircularStrokeWidth-D9Ej5fM", "()F", "CircularStrokeWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getLinearStrokeCap-KaPHkGw", "()I", "LinearStrokeCap", "c", "getCircularDeterminateStrokeCap-KaPHkGw", "CircularDeterminateStrokeCap", "d", "getCircularIndeterminateStrokeCap-KaPHkGw", "CircularIndeterminateStrokeCap", "Landroidx/compose/animation/core/SpringSpec;", "", "e", "Landroidx/compose/animation/core/SpringSpec;", "getProgressAnimationSpec", "()Landroidx/compose/animation/core/SpringSpec;", "ProgressAnimationSpec", "Landroidx/compose/ui/graphics/Color;", "getLinearColor", "(Landroidx/compose/runtime/Composer;I)J", "linearColor", "getCircularColor", "circularColor", "getLinearTrackColor", "linearTrackColor", "getCircularTrackColor", "circularTrackColor", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class ProgressIndicatorDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final ProgressIndicatorDefaults INSTANCE = new ProgressIndicatorDefaults();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final float CircularStrokeWidth = CircularProgressIndicatorTokens.INSTANCE.m1537getActiveIndicatorWidthD9Ej5fM();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final int LinearStrokeCap;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final int CircularDeterminateStrokeCap;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final int CircularIndeterminateStrokeCap;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SpringSpec<Float> ProgressAnimationSpec;

    static {
        StrokeCap.Companion companion = StrokeCap.INSTANCE;
        LinearStrokeCap = companion.m2808getButtKaPHkGw();
        CircularDeterminateStrokeCap = companion.m2808getButtKaPHkGw();
        CircularIndeterminateStrokeCap = companion.m2810getSquareKaPHkGw();
        ProgressAnimationSpec = new SpringSpec<>(1.0f, 50.0f, Float.valueOf(0.001f));
    }

    @Composable
    @JvmName(name = "getCircularColor")
    public final long getCircularColor(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(1803349725);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1803349725, i10, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularColor> (ProgressIndicator.kt:509)");
        }
        long color = ColorSchemeKt.toColor(CircularProgressIndicatorTokens.INSTANCE.getActiveIndicatorColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    /* JADX INFO: renamed from: getCircularDeterminateStrokeCap-KaPHkGw, reason: not valid java name */
    public final int m1202getCircularDeterminateStrokeCapKaPHkGw() {
        return CircularDeterminateStrokeCap;
    }

    /* JADX INFO: renamed from: getCircularIndeterminateStrokeCap-KaPHkGw, reason: not valid java name */
    public final int m1203getCircularIndeterminateStrokeCapKaPHkGw() {
        return CircularIndeterminateStrokeCap;
    }

    /* JADX INFO: renamed from: getCircularStrokeWidth-D9Ej5fM, reason: not valid java name */
    public final float m1204getCircularStrokeWidthD9Ej5fM() {
        return CircularStrokeWidth;
    }

    @Composable
    @JvmName(name = "getCircularTrackColor")
    public final long getCircularTrackColor(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-404222247);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-404222247, i10, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularTrackColor> (ProgressIndicator.kt:517)");
        }
        long jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return jM2543getTransparent0d7_KjU;
    }

    @Composable
    @JvmName(name = "getLinearColor")
    public final long getLinearColor(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-914312983);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-914312983, i10, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearColor> (ProgressIndicator.kt:505)");
        }
        long color = ColorSchemeKt.toColor(LinearProgressIndicatorTokens.INSTANCE.getActiveIndicatorColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    /* JADX INFO: renamed from: getLinearStrokeCap-KaPHkGw, reason: not valid java name */
    public final int m1205getLinearStrokeCapKaPHkGw() {
        return LinearStrokeCap;
    }

    @Composable
    @JvmName(name = "getLinearTrackColor")
    public final long getLinearTrackColor(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(1677541593);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1677541593, i10, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearTrackColor> (ProgressIndicator.kt:513)");
        }
        long color = ColorSchemeKt.toColor(LinearProgressIndicatorTokens.INSTANCE.getTrackColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    @NotNull
    public final SpringSpec<Float> getProgressAnimationSpec() {
        return ProgressAnimationSpec;
    }
}
