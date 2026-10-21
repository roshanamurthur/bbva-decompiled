package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.util.MathHelpersKt;
import com.adobe.marketing.mobile.EventDataKeys;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ScaleFactor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\t\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\n\u001a\u00020\u0003*\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\bø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\"\u0010\u000f\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\"\u0010\u000f\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000bH\u0087\u0002ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000e\u001a\"\u0010\u0013\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000e\u001a-\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0000H\u0007ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\"\"\u0010\u001f\u001a\u00020\u001a*\u00020\u00038Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\"\"\u0010\"\u001a\u00020\u001a*\u00020\u00038Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b!\u0010\u001e\u001a\u0004\b \u0010\u001c\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"", "scaleX", "scaleY", "Landroidx/compose/ui/layout/ScaleFactor;", "ScaleFactor", "(FF)J", "Lkotlin/Function0;", "block", "takeOrElse-oyDd2qo", "(JLkotlin/jvm/functions/Function0;)J", "takeOrElse", "Landroidx/compose/ui/geometry/Size;", "scaleFactor", "times-UQTWf7w", "(JJ)J", "times", "size", "times-m-w2e94", "div-UQTWf7w", "div", EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "fraction", "lerp--bDIf60", "(JJF)J", "lerp", "", "isSpecified-FK8aYYs", "(J)Z", "isSpecified-FK8aYYs$annotations", "(J)V", "isSpecified", "isUnspecified-FK8aYYs", "isUnspecified-FK8aYYs$annotations", "isUnspecified", "ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScaleFactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,197:1\n130#1:201\n25#2,3:198\n*S KotlinDebug\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n*L\n144#1:201\n31#1:198,3\n*E\n"})
public final class ScaleFactorKt {
    @Stable
    public static final long ScaleFactor(float f6, float f10) {
        return ScaleFactor.m3624constructorimpl((((long) Float.floatToIntBits(f10)) & 4294967295L) | (Float.floatToIntBits(f6) << 32));
    }

    public static final float access$roundToTenths(float f6) {
        float f10 = 10;
        float f11 = f6 * f10;
        int i10 = (int) f11;
        if (f11 - i10 >= 0.5f) {
            i10++;
        }
        return i10 / f10;
    }

    @Stable
    /* JADX INFO: renamed from: div-UQTWf7w, reason: not valid java name */
    public static final long m3638divUQTWf7w(long j10, long j11) {
        return SizeKt.Size(Size.m2344getWidthimpl(j10) / ScaleFactor.m3630getScaleXimpl(j11), Size.m2341getHeightimpl(j10) / ScaleFactor.m3631getScaleYimpl(j11));
    }

    /* JADX INFO: renamed from: isSpecified-FK8aYYs, reason: not valid java name */
    public static final boolean m3639isSpecifiedFK8aYYs(long j10) {
        return j10 != ScaleFactor.Companion.m3637getUnspecified_hLwfpc();
    }

    /* JADX INFO: renamed from: isUnspecified-FK8aYYs, reason: not valid java name */
    public static final boolean m3641isUnspecifiedFK8aYYs(long j10) {
        return j10 == ScaleFactor.Companion.m3637getUnspecified_hLwfpc();
    }

    @Stable
    /* JADX INFO: renamed from: lerp--bDIf60, reason: not valid java name */
    public static final long m3643lerpbDIf60(long j10, long j11, float f6) {
        return ScaleFactor(MathHelpersKt.lerp(ScaleFactor.m3630getScaleXimpl(j10), ScaleFactor.m3630getScaleXimpl(j11), f6), MathHelpersKt.lerp(ScaleFactor.m3631getScaleYimpl(j10), ScaleFactor.m3631getScaleYimpl(j11), f6));
    }

    /* JADX INFO: renamed from: takeOrElse-oyDd2qo, reason: not valid java name */
    public static final long m3644takeOrElseoyDd2qo(long j10, @NotNull Function0<ScaleFactor> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return j10 != ScaleFactor.Companion.m3637getUnspecified_hLwfpc() ? j10 : block.invoke().m3635unboximpl();
    }

    @Stable
    /* JADX INFO: renamed from: times-UQTWf7w, reason: not valid java name */
    public static final long m3645timesUQTWf7w(long j10, long j11) {
        return SizeKt.Size(ScaleFactor.m3630getScaleXimpl(j11) * Size.m2344getWidthimpl(j10), ScaleFactor.m3631getScaleYimpl(j11) * Size.m2341getHeightimpl(j10));
    }

    @Stable
    /* JADX INFO: renamed from: times-m-w2e94, reason: not valid java name */
    public static final long m3646timesmw2e94(long j10, long j11) {
        return m3645timesUQTWf7w(j11, j10);
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m3640isSpecifiedFK8aYYs$annotations(long j10) {
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m3642isUnspecifiedFK8aYYs$annotations(long j10) {
    }
}
