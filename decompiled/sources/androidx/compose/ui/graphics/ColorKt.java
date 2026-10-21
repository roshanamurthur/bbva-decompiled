package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;
import com.adobe.marketing.mobile.EventDataKeys;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Color.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\u001a>\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\f\u001a\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000e\u001a4\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000f\u001a-\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0000H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a!\u0010\u0019\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0019\u0010\u001c\u001a\u00020\u0000*\u00020\u0007H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0019\u0010\u001f\u001a\u00020\n*\u00020\u0007H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a+\u0010$\u001a\u00020\u0007*\u00020\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070 H\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\"\"\u0010*\u001a\u00020%*\u00020\u00078Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'\"\"\u0010-\u001a\u00020%*\u00020\u00078Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010'\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006."}, d2 = {"", "red", "green", "blue", "alpha", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "Landroidx/compose/ui/graphics/Color;", "Color", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "", "color", "(I)J", "", "(J)J", "(IIII)J", EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "fraction", "lerp-jxsXWHM", "(JJF)J", "lerp", "background", "compositeOver--OWjLjI", "(JJ)J", "compositeOver", "luminance-8_81llA", "(J)F", "luminance", "toArgb-8_81llA", "(J)I", "toArgb", "Lkotlin/Function0;", "block", "takeOrElse-DxMtmZc", "(JLkotlin/jvm/functions/Function0;)J", "takeOrElse", "", "isSpecified-8_81llA", "(J)Z", "isSpecified-8_81llA$annotations", "(J)V", "isSpecified", "isUnspecified-8_81llA", "isUnspecified-8_81llA$annotations", "isUnspecified", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,672:1\n587#1:673\n587#1:674\n587#1:675\n646#1:676\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n567#1:673\n568#1:674\n569#1:675\n658#1:676\n*E\n"})
public final class ColorKt {
    @Stable
    public static final long Color(float f6, float f10, float f11, float f12, @NotNull ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        float minValue = colorSpace.getMinValue(0);
        if (f6 <= colorSpace.getMaxValue(0) && minValue <= f6) {
            float minValue2 = colorSpace.getMinValue(1);
            if (f10 <= colorSpace.getMaxValue(1) && minValue2 <= f10) {
                float minValue3 = colorSpace.getMinValue(2);
                if (f11 <= colorSpace.getMaxValue(2) && minValue3 <= f11 && 0.0f <= f12 && f12 <= 1.0f) {
                    if (colorSpace.getIsSrgb()) {
                        return Color.m2504constructorimpl(ULong.m5595constructorimpl(ULong.m5595constructorimpl(ULong.m5595constructorimpl((((((int) ((f6 * 255.0f) + 0.5f)) << 16) | (((int) ((f12 * 255.0f) + 0.5f)) << 24)) | (((int) ((f10 * 255.0f) + 0.5f)) << 8)) | ((int) ((f11 * 255.0f) + 0.5f))) & 4294967295L) << 32));
                    }
                    if (colorSpace.getComponentCount() != 3) {
                        throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components".toString());
                    }
                    int id = colorSpace.getId();
                    if (id == -1) {
                        throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces".toString());
                    }
                    short sM2608constructorimpl = Float16.m2608constructorimpl(f6);
                    return Color.m2504constructorimpl(ULong.m5595constructorimpl(ULong.m5595constructorimpl(ULong.m5595constructorimpl(ULong.m5595constructorimpl(ULong.m5595constructorimpl(ULong.m5595constructorimpl(ULong.m5595constructorimpl(Float16.m2608constructorimpl(f10)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ULong.m5595constructorimpl(ULong.m5595constructorimpl(ULong.m5595constructorimpl(sM2608constructorimpl) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48)) | ULong.m5595constructorimpl(ULong.m5595constructorimpl(ULong.m5595constructorimpl(Float16.m2608constructorimpl(f11)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16)) | ULong.m5595constructorimpl(ULong.m5595constructorimpl(ULong.m5595constructorimpl((int) ((Math.max(0.0f, Math.min(f12, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6)) | ULong.m5595constructorimpl(ULong.m5595constructorimpl(id) & 63)));
                }
            }
        }
        throw new IllegalArgumentException(("red = " + f6 + ", green = " + f10 + ", blue = " + f11 + ", alpha = " + f12 + " outside the range for " + colorSpace).toString());
    }

    public static /* synthetic */ long Color$default(float f6, float f10, float f11, float f12, ColorSpace colorSpace, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            f12 = 1.0f;
        }
        if ((i10 & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return Color(f6, f10, f11, f12, colorSpace);
    }

    @Stable
    /* JADX INFO: renamed from: compositeOver--OWjLjI, reason: not valid java name */
    public static final long m2553compositeOverOWjLjI(long j10, long j11) {
        float f6;
        float f10;
        long jM2505convertvNxB06k = Color.m2505convertvNxB06k(j10, Color.m2512getColorSpaceimpl(j11));
        float fM2510getAlphaimpl = Color.m2510getAlphaimpl(j11);
        float fM2510getAlphaimpl2 = Color.m2510getAlphaimpl(jM2505convertvNxB06k);
        float f11 = 1.0f - fM2510getAlphaimpl2;
        float f12 = (fM2510getAlphaimpl * f11) + fM2510getAlphaimpl2;
        float fM2514getRedimpl = Color.m2514getRedimpl(jM2505convertvNxB06k);
        float fM2514getRedimpl2 = Color.m2514getRedimpl(j11);
        float f13 = 0.0f;
        if (f12 == 0.0f) {
            f6 = 0.0f;
        } else {
            f6 = (((fM2514getRedimpl2 * fM2510getAlphaimpl) * f11) + (fM2514getRedimpl * fM2510getAlphaimpl2)) / f12;
        }
        float fM2513getGreenimpl = Color.m2513getGreenimpl(jM2505convertvNxB06k);
        float fM2513getGreenimpl2 = Color.m2513getGreenimpl(j11);
        if (f12 == 0.0f) {
            f10 = 0.0f;
        } else {
            f10 = (((fM2513getGreenimpl2 * fM2510getAlphaimpl) * f11) + (fM2513getGreenimpl * fM2510getAlphaimpl2)) / f12;
        }
        float fM2511getBlueimpl = Color.m2511getBlueimpl(jM2505convertvNxB06k);
        float fM2511getBlueimpl2 = Color.m2511getBlueimpl(j11);
        if (f12 != 0.0f) {
            f13 = (((fM2511getBlueimpl2 * fM2510getAlphaimpl) * f11) + (fM2511getBlueimpl * fM2510getAlphaimpl2)) / f12;
        }
        return Color(f6, f10, f13, f12, Color.m2512getColorSpaceimpl(j11));
    }

    /* JADX INFO: renamed from: isSpecified-8_81llA, reason: not valid java name */
    public static final boolean m2554isSpecified8_81llA(long j10) {
        return j10 != Color.INSTANCE.m2544getUnspecified0d7_KjU();
    }

    /* JADX INFO: renamed from: isUnspecified-8_81llA, reason: not valid java name */
    public static final boolean m2556isUnspecified8_81llA(long j10) {
        return j10 == Color.INSTANCE.m2544getUnspecified0d7_KjU();
    }

    @Stable
    /* JADX INFO: renamed from: lerp-jxsXWHM, reason: not valid java name */
    public static final long m2558lerpjxsXWHM(long j10, long j11, float f6) {
        ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
        long jM2505convertvNxB06k = Color.m2505convertvNxB06k(j10, oklab);
        long jM2505convertvNxB06k2 = Color.m2505convertvNxB06k(j11, oklab);
        float fM2510getAlphaimpl = Color.m2510getAlphaimpl(jM2505convertvNxB06k);
        float fM2514getRedimpl = Color.m2514getRedimpl(jM2505convertvNxB06k);
        float fM2513getGreenimpl = Color.m2513getGreenimpl(jM2505convertvNxB06k);
        float fM2511getBlueimpl = Color.m2511getBlueimpl(jM2505convertvNxB06k);
        float fM2510getAlphaimpl2 = Color.m2510getAlphaimpl(jM2505convertvNxB06k2);
        float fM2514getRedimpl2 = Color.m2514getRedimpl(jM2505convertvNxB06k2);
        float fM2513getGreenimpl2 = Color.m2513getGreenimpl(jM2505convertvNxB06k2);
        float fM2511getBlueimpl2 = Color.m2511getBlueimpl(jM2505convertvNxB06k2);
        return Color.m2505convertvNxB06k(Color(MathHelpersKt.lerp(fM2514getRedimpl, fM2514getRedimpl2, f6), MathHelpersKt.lerp(fM2513getGreenimpl, fM2513getGreenimpl2, f6), MathHelpersKt.lerp(fM2511getBlueimpl, fM2511getBlueimpl2, f6), MathHelpersKt.lerp(fM2510getAlphaimpl, fM2510getAlphaimpl2, f6), oklab), Color.m2512getColorSpaceimpl(j11));
    }

    @Stable
    /* JADX INFO: renamed from: luminance-8_81llA, reason: not valid java name */
    public static final float m2559luminance8_81llA(long j10) {
        ColorSpace colorSpaceM2512getColorSpaceimpl = Color.m2512getColorSpaceimpl(j10);
        if (!ColorModel.m2861equalsimpl0(colorSpaceM2512getColorSpaceimpl.getModel(), ColorModel.INSTANCE.m2868getRgbxdoWZVw())) {
            throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ColorModel.m2864toStringimpl(colorSpaceM2512getColorSpaceimpl.getModel()))).toString());
        }
        Intrinsics.checkNotNull(colorSpaceM2512getColorSpaceimpl, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        DoubleFunction eotfFunc$ui_graphics_release = ((Rgb) colorSpaceM2512getColorSpaceimpl).getEotfFunc$ui_graphics_release();
        double dInvoke = eotfFunc$ui_graphics_release.invoke(Color.m2514getRedimpl(j10));
        float fInvoke = (float) ((eotfFunc$ui_graphics_release.invoke(Color.m2511getBlueimpl(j10)) * 0.0722d) + (eotfFunc$ui_graphics_release.invoke(Color.m2513getGreenimpl(j10)) * 0.7152d) + (dInvoke * 0.2126d));
        float f6 = 0.0f;
        if (fInvoke > 0.0f) {
            f6 = 1.0f;
            if (fInvoke < 1.0f) {
                return fInvoke;
            }
        }
        return f6;
    }

    /* JADX INFO: renamed from: takeOrElse-DxMtmZc, reason: not valid java name */
    public static final long m2560takeOrElseDxMtmZc(long j10, @NotNull Function0<Color> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return j10 != Color.INSTANCE.m2544getUnspecified0d7_KjU() ? j10 : block.invoke().m2518unboximpl();
    }

    @Stable
    /* JADX INFO: renamed from: toArgb-8_81llA, reason: not valid java name */
    public static final int m2561toArgb8_81llA(long j10) {
        return (int) ULong.m5595constructorimpl(Color.m2505convertvNxB06k(j10, ColorSpaces.INSTANCE.getSrgb()) >>> 32);
    }

    public static /* synthetic */ long Color$default(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i13 = 255;
        }
        return Color(i10, i11, i12, i13);
    }

    @Stable
    public static final long Color(int i10) {
        return Color.m2504constructorimpl(ULong.m5595constructorimpl(ULong.m5595constructorimpl(i10) << 32));
    }

    @Stable
    public static final long Color(long j10) {
        return Color.m2504constructorimpl(ULong.m5595constructorimpl(ULong.m5595constructorimpl(ULong.m5595constructorimpl(j10) & 4294967295L) << 32));
    }

    @Stable
    public static final long Color(int i10, int i11, int i12, int i13) {
        return Color(((i10 & 255) << 16) | ((i13 & 255) << 24) | ((i11 & 255) << 8) | (i12 & 255));
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m2555isSpecified8_81llA$annotations(long j10) {
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m2557isUnspecified8_81llA$annotations(long j10) {
    }
}
