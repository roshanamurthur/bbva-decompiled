package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import com.adobe.marketing.mobile.EventDataKeys;
import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Dp.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a%\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u00020\b2\u0006\u00107\u001a\u00020\bH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a%\u0010:\u001a\u00020\u00022\u0006\u00102\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b;\u00109\u001a-\u0010<\u001a\u00020\b2\u0006\u0010=\u001a\u00020\b2\u0006\u0010>\u001a\u00020\b2\u0006\u0010?\u001a\u00020\u000eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a-\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u00012\u0006\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u000eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bB\u0010C\u001a-\u0010<\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u000eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010C\u001a&\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bH\u0010I\u001a&\u0010J\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bK\u0010I\u001a\"\u0010L\u001a\u00020\b*\u00020\b2\u0006\u0010M\u001a\u00020\bH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bN\u0010I\u001a\"\u0010O\u001a\u00020\b*\u00020\b2\u0006\u0010P\u001a\u00020\bH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bQ\u0010I\u001a*\u0010R\u001a\u00020\b*\u00020\b2\u0006\u0010M\u001a\u00020\b2\u0006\u0010P\u001a\u00020\bH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bS\u0010A\u001a+\u0010T\u001a\u00020\b*\u00020\b2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\b0VH\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bW\u0010X\u001a+\u0010T\u001a\u00020\u0001*\u00020\u00012\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00010VH\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bY\u0010Z\u001a+\u0010T\u001a\u00020\u0002*\u00020\u00022\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00020VH\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b[\u0010Z\u001a\"\u0010\\\u001a\u00020\b*\u00020\t2\u0006\u0010]\u001a\u00020\bH\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b^\u0010_\u001a\"\u0010\\\u001a\u00020\b*\u00020\u000e2\u0006\u0010]\u001a\u00020\bH\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b^\u0010I\u001a\"\u0010\\\u001a\u00020\u0002*\u00020\u000e2\u0006\u0010.\u001a\u00020\u0002H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b`\u0010a\u001a\"\u0010\\\u001a\u00020\b*\u00020\u00112\u0006\u0010]\u001a\u00020\bH\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b^\u0010b\u001a\"\u0010\\\u001a\u00020\u0002*\u00020\u00112\u0006\u0010.\u001a\u00020\u0002H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b`\u0010c\"!\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\"\u0010\u0007\u001a\u00020\b*\u00020\t8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\"\u0010\u0007\u001a\u00020\b*\u00020\u000e8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\n\u0010\u000f\u001a\u0004\b\f\u0010\u0010\"\"\u0010\u0007\u001a\u00020\b*\u00020\u00118Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\n\u0010\u0012\u001a\u0004\b\f\u0010\u0013\"\"\u0010\u0014\u001a\u00020\b*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\"\u0010\u001a\u001a\u00020\u001b*\u00020\b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u001e\"\"\u0010\u001f\u001a\u00020\u001b*\u00020\b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b \u0010\u000f\u001a\u0004\b!\u0010\u001e\"\"\u0010\u001f\u001a\u00020\u001b*\u00020\u00018Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010$\"\"\u0010\u001f\u001a\u00020\u001b*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010$\"\"\u0010'\u001a\u00020\u001b*\u00020\b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b(\u0010\u000f\u001a\u0004\b)\u0010\u001e\"\"\u0010'\u001a\u00020\u001b*\u00020\u00018Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b*\u0010\u0004\u001a\u0004\b+\u0010$\"\"\u0010'\u001a\u00020\u001b*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010$\"\"\u0010.\u001a\u00020\u0002*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b/\u0010\u0017\u001a\u0004\b0\u00101\"\"\u00102\u001a\u00020\b*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b3\u0010\u0017\u001a\u0004\b4\u0010\u0019\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006d"}, d2 = {"center", "Landroidx/compose/ui/unit/DpOffset;", "Landroidx/compose/ui/unit/DpSize;", "getCenter-EaSLcWc$annotations", "(J)V", "getCenter-EaSLcWc", "(J)J", "dp", "Landroidx/compose/ui/unit/Dp;", "", "getDp$annotations", "(D)V", "getDp", "(D)F", "", "(F)V", "(F)F", "", "(I)V", "(I)F", "height", "Landroidx/compose/ui/unit/DpRect;", "getHeight$annotations", "(Landroidx/compose/ui/unit/DpRect;)V", "getHeight", "(Landroidx/compose/ui/unit/DpRect;)F", "isFinite", "", "isFinite-0680j_4$annotations", "isFinite-0680j_4", "(F)Z", "isSpecified", "isSpecified-0680j_4$annotations", "isSpecified-0680j_4", "isSpecified-jo-Fl9I$annotations", "isSpecified-jo-Fl9I", "(J)Z", "isSpecified-EaSLcWc$annotations", "isSpecified-EaSLcWc", "isUnspecified", "isUnspecified-0680j_4$annotations", "isUnspecified-0680j_4", "isUnspecified-jo-Fl9I$annotations", "isUnspecified-jo-Fl9I", "isUnspecified-EaSLcWc$annotations", "isUnspecified-EaSLcWc", "size", "getSize$annotations", "getSize", "(Landroidx/compose/ui/unit/DpRect;)J", "width", "getWidth$annotations", "getWidth", "DpOffset", "x", "y", "DpOffset-YgX7TsA", "(FF)J", "DpSize", "DpSize-YgX7TsA", "lerp", EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "fraction", "lerp-Md-fbLM", "(FFF)F", "lerp-xhh869w", "(JJF)J", "lerp-IDex15A", VDVideoSelfieConfiguration.MAX, "a", "b", "max-YgX7TsA", "(FF)F", "min", "min-YgX7TsA", "coerceAtLeast", "minimumValue", "coerceAtLeast-YgX7TsA", "coerceAtMost", "maximumValue", "coerceAtMost-YgX7TsA", "coerceIn", "coerceIn-2z7ARbQ", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-D5KLDUw", "(FLkotlin/jvm/functions/Function0;)F", "takeOrElse-gVKV90s", "(JLkotlin/jvm/functions/Function0;)J", "takeOrElse-itqla9I", "times", "other", "times-3ABfNKs", "(DF)F", "times-6HolHcs", "(FJ)J", "(IF)F", "(IJ)J", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,557:1\n130#1:558\n337#1:562\n473#1:566\n544#1:570\n550#1:572\n25#2,3:559\n25#2,3:563\n71#3:567\n58#3:568\n58#3:569\n58#3:571\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n144#1:558\n351#1:562\n487#1:566\n556#1:570\n556#1:572\n254#1:559,3\n372#1:563,3\n495#1:567\n544#1:568\n550#1:569\n556#1:571\n*E\n"})
public final class DpKt {
    @Stable
    /* JADX INFO: renamed from: DpOffset-YgX7TsA, reason: not valid java name */
    public static final long m4410DpOffsetYgX7TsA(float f6, float f10) {
        return DpOffset.m4445constructorimpl((((long) Float.floatToIntBits(f10)) & 4294967295L) | (Float.floatToIntBits(f6) << 32));
    }

    @Stable
    /* JADX INFO: renamed from: DpSize-YgX7TsA, reason: not valid java name */
    public static final long m4411DpSizeYgX7TsA(float f6, float f10) {
        return DpSize.m4478constructorimpl((((long) Float.floatToIntBits(f10)) & 4294967295L) | (Float.floatToIntBits(f6) << 32));
    }

    @Stable
    /* JADX INFO: renamed from: coerceAtLeast-YgX7TsA, reason: not valid java name */
    public static final float m4412coerceAtLeastYgX7TsA(float f6, float f10) {
        return Dp.m4389constructorimpl(c.coerceAtLeast(f6, f10));
    }

    @Stable
    /* JADX INFO: renamed from: coerceAtMost-YgX7TsA, reason: not valid java name */
    public static final float m4413coerceAtMostYgX7TsA(float f6, float f10) {
        return Dp.m4389constructorimpl(c.coerceAtMost(f6, f10));
    }

    @Stable
    /* JADX INFO: renamed from: coerceIn-2z7ARbQ, reason: not valid java name */
    public static final float m4414coerceIn2z7ARbQ(float f6, float f10, float f11) {
        return Dp.m4389constructorimpl(c.coerceIn(f6, f10, f11));
    }

    /* JADX INFO: renamed from: getCenter-EaSLcWc, reason: not valid java name */
    public static final long m4415getCenterEaSLcWc(long j10) {
        return m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(DpSize.m4487getWidthD9Ej5fM(j10) / 2.0f), Dp.m4389constructorimpl(DpSize.m4485getHeightD9Ej5fM(j10) / 2.0f));
    }

    public static final float getDp(int i10) {
        return Dp.m4389constructorimpl(i10);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(double d2) {
    }

    public static final float getHeight(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return Dp.m4389constructorimpl(dpRect.m4471getBottomD9Ej5fM() - dpRect.m4474getTopD9Ej5fM());
    }

    public static final long getSize(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return m4411DpSizeYgX7TsA(Dp.m4389constructorimpl(dpRect.m4473getRightD9Ej5fM() - dpRect.m4472getLeftD9Ej5fM()), Dp.m4389constructorimpl(dpRect.m4471getBottomD9Ej5fM() - dpRect.m4474getTopD9Ej5fM()));
    }

    public static final float getWidth(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return Dp.m4389constructorimpl(dpRect.m4473getRightD9Ej5fM() - dpRect.m4472getLeftD9Ej5fM());
    }

    /* JADX INFO: renamed from: isFinite-0680j_4, reason: not valid java name */
    public static final boolean m4417isFinite0680j_4(float f6) {
        return !(f6 == Float.POSITIVE_INFINITY);
    }

    /* JADX INFO: renamed from: isSpecified-0680j_4, reason: not valid java name */
    public static final boolean m4419isSpecified0680j_4(float f6) {
        return !Float.isNaN(f6);
    }

    /* JADX INFO: renamed from: isSpecified-EaSLcWc, reason: not valid java name */
    public static final boolean m4421isSpecifiedEaSLcWc(long j10) {
        return j10 != DpSize.INSTANCE.m4496getUnspecifiedMYxV2XQ();
    }

    /* JADX INFO: renamed from: isSpecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m4423isSpecifiedjoFl9I(long j10) {
        return j10 != DpOffset.INSTANCE.m4459getUnspecifiedRKDOV3M();
    }

    /* JADX INFO: renamed from: isUnspecified-0680j_4, reason: not valid java name */
    public static final boolean m4425isUnspecified0680j_4(float f6) {
        return Float.isNaN(f6);
    }

    /* JADX INFO: renamed from: isUnspecified-EaSLcWc, reason: not valid java name */
    public static final boolean m4427isUnspecifiedEaSLcWc(long j10) {
        return j10 == DpSize.INSTANCE.m4496getUnspecifiedMYxV2XQ();
    }

    /* JADX INFO: renamed from: isUnspecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m4429isUnspecifiedjoFl9I(long j10) {
        return j10 == DpOffset.INSTANCE.m4459getUnspecifiedRKDOV3M();
    }

    @Stable
    /* JADX INFO: renamed from: lerp-IDex15A, reason: not valid java name */
    public static final long m4431lerpIDex15A(long j10, long j11, float f6) {
        return m4411DpSizeYgX7TsA(m4432lerpMdfbLM(DpSize.m4487getWidthD9Ej5fM(j10), DpSize.m4487getWidthD9Ej5fM(j11), f6), m4432lerpMdfbLM(DpSize.m4485getHeightD9Ej5fM(j10), DpSize.m4485getHeightD9Ej5fM(j11), f6));
    }

    @Stable
    /* JADX INFO: renamed from: lerp-Md-fbLM, reason: not valid java name */
    public static final float m4432lerpMdfbLM(float f6, float f10, float f11) {
        return Dp.m4389constructorimpl(MathHelpersKt.lerp(f6, f10, f11));
    }

    @Stable
    /* JADX INFO: renamed from: lerp-xhh869w, reason: not valid java name */
    public static final long m4433lerpxhh869w(long j10, long j11, float f6) {
        return m4410DpOffsetYgX7TsA(m4432lerpMdfbLM(DpOffset.m4450getXD9Ej5fM(j10), DpOffset.m4450getXD9Ej5fM(j11), f6), m4432lerpMdfbLM(DpOffset.m4452getYD9Ej5fM(j10), DpOffset.m4452getYD9Ej5fM(j11), f6));
    }

    @Stable
    /* JADX INFO: renamed from: max-YgX7TsA, reason: not valid java name */
    public static final float m4434maxYgX7TsA(float f6, float f10) {
        return Dp.m4389constructorimpl(Math.max(f6, f10));
    }

    @Stable
    /* JADX INFO: renamed from: min-YgX7TsA, reason: not valid java name */
    public static final float m4435minYgX7TsA(float f6, float f10) {
        return Dp.m4389constructorimpl(Math.min(f6, f10));
    }

    /* JADX INFO: renamed from: takeOrElse-D5KLDUw, reason: not valid java name */
    public static final float m4436takeOrElseD5KLDUw(float f6, @NotNull Function0<Dp> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return Float.isNaN(f6) ^ true ? f6 : block.invoke().m4403unboximpl();
    }

    /* JADX INFO: renamed from: takeOrElse-gVKV90s, reason: not valid java name */
    public static final long m4437takeOrElsegVKV90s(long j10, @NotNull Function0<DpOffset> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return j10 != DpOffset.INSTANCE.m4459getUnspecifiedRKDOV3M() ? j10 : block.invoke().getF18303a();
    }

    /* JADX INFO: renamed from: takeOrElse-itqla9I, reason: not valid java name */
    public static final long m4438takeOrElseitqla9I(long j10, @NotNull Function0<DpSize> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return j10 != DpSize.INSTANCE.m4496getUnspecifiedMYxV2XQ() ? j10 : block.invoke().getF18310a();
    }

    @Stable
    /* JADX INFO: renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m4440times3ABfNKs(float f6, float f10) {
        return Dp.m4389constructorimpl(f6 * f10);
    }

    @Stable
    /* JADX INFO: renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m4443times6HolHcs(int i10, long j10) {
        return DpSize.m4493timesGh9hcWk(j10, i10);
    }

    public static final float getDp(double d2) {
        return Dp.m4389constructorimpl((float) d2);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(float f6) {
    }

    @Stable
    /* JADX INFO: renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m4439times3ABfNKs(double d2, float f6) {
        return Dp.m4389constructorimpl(((float) d2) * f6);
    }

    @Stable
    /* JADX INFO: renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m4442times6HolHcs(float f6, long j10) {
        return DpSize.m4492timesGh9hcWk(j10, f6);
    }

    public static final float getDp(float f6) {
        return Dp.m4389constructorimpl(f6);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(int i10) {
    }

    @Stable
    /* JADX INFO: renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m4441times3ABfNKs(int i10, float f6) {
        return Dp.m4389constructorimpl(i10 * f6);
    }

    @Stable
    /* JADX INFO: renamed from: getCenter-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m4416getCenterEaSLcWc$annotations(long j10) {
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations(DpRect dpRect) {
    }

    @Stable
    public static /* synthetic */ void getSize$annotations(DpRect dpRect) {
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations(DpRect dpRect) {
    }

    @Stable
    /* JADX INFO: renamed from: isFinite-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m4418isFinite0680j_4$annotations(float f6) {
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m4420isSpecified0680j_4$annotations(float f6) {
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m4422isSpecifiedEaSLcWc$annotations(long j10) {
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m4424isSpecifiedjoFl9I$annotations(long j10) {
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m4426isUnspecified0680j_4$annotations(float f6) {
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m4428isUnspecifiedEaSLcWc$annotations(long j10) {
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m4430isUnspecifiedjoFl9I$annotations(long j10) {
    }
}
