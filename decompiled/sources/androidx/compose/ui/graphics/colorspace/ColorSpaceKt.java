package androidx.compose.ui.graphics.colorspace;

import androidx.camera.camera2.internal.h0;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ColorSpace.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a8\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0000\u001a\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u0010H\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011H\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\nH\u0000\u001a\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0000\u001a\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0000\u001a\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0000\u001a\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0000\u001a(\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0000\u001a(\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0000\u001a(\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0000\u001a8\u0010 \u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001aH\u0010 \u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a8\u0010#\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001aH\u0010#\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a\u001e\u0010$\u001a\u00020%*\u00020%2\u0006\u0010&\u001a\u00020\u00112\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a+\u0010)\u001a\u00020**\u00020%2\b\b\u0002\u0010+\u001a\u00020%2\b\b\u0002\u0010,\u001a\u00020-ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, d2 = {"absRcpResponse", "", "x", "a", "b", "c", "d", "g", "absResponse", "chromaticAdaptation", "", "matrix", "srcWhitePoint", "dstWhitePoint", "compare", "", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "inverse3x3", "m", "mul3x3", "lhs", "rhs", "mul3x3Diag", "mul3x3Float3", "mul3x3Float3_0", "", "r0", "r1", "r2", "mul3x3Float3_1", "mul3x3Float3_2", "rcpResponse", "e", "f", DigipassManagerConstants.KEY_RESPONSE, "adapt", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "whitePoint", "adaptation", "Landroidx/compose/ui/graphics/colorspace/Adaptation;", "connect", "Landroidx/compose/ui/graphics/colorspace/Connector;", "destination", "intent", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "connect-YBCOT_4", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I)Landroidx/compose/ui/graphics/colorspace/Connector;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ColorSpaceKt {
    public static final double absRcpResponse(double d2, double d3, double d7, double d10, double d11, double d12) {
        return Math.copySign(rcpResponse(d2 < 0.0d ? -d2 : d2, d3, d7, d10, d11, d12), d2);
    }

    public static final double absResponse(double d2, double d3, double d7, double d10, double d11, double d12) {
        return Math.copySign(response(d2 < 0.0d ? -d2 : d2, d3, d7, d10, d11, d12), d2);
    }

    @JvmOverloads
    @NotNull
    public static final ColorSpace adapt(@NotNull ColorSpace colorSpace, @NotNull WhitePoint whitePoint) {
        Intrinsics.checkNotNullParameter(colorSpace, "<this>");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        return adapt$default(colorSpace, whitePoint, null, 2, null);
    }

    public static /* synthetic */ ColorSpace adapt$default(ColorSpace colorSpace, WhitePoint whitePoint, Adaptation adaptation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            adaptation = Adaptation.INSTANCE.getBradford();
        }
        return adapt(colorSpace, whitePoint, adaptation);
    }

    @NotNull
    public static final float[] chromaticAdaptation(@NotNull float[] matrix, @NotNull float[] srcWhitePoint, @NotNull float[] dstWhitePoint) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(srcWhitePoint, "srcWhitePoint");
        Intrinsics.checkNotNullParameter(dstWhitePoint, "dstWhitePoint");
        float[] fArrMul3x3Float3 = mul3x3Float3(matrix, srcWhitePoint);
        float[] fArrMul3x3Float4 = mul3x3Float3(matrix, dstWhitePoint);
        return mul3x3(inverse3x3(matrix), mul3x3Diag(new float[]{fArrMul3x3Float4[0] / fArrMul3x3Float3[0], fArrMul3x3Float4[1] / fArrMul3x3Float3[1], fArrMul3x3Float4[2] / fArrMul3x3Float3[2]}, matrix));
    }

    public static final boolean compare(@NotNull TransferParameters a10, @Nullable TransferParameters transferParameters) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return transferParameters != null && Math.abs(a10.getA() - transferParameters.getA()) < 0.001d && Math.abs(a10.getB() - transferParameters.getB()) < 0.001d && Math.abs(a10.getC() - transferParameters.getC()) < 0.001d && Math.abs(a10.getD() - transferParameters.getD()) < 0.002d && Math.abs(a10.getE() - transferParameters.getE()) < 0.001d && Math.abs(a10.getF() - transferParameters.getF()) < 0.001d && Math.abs(a10.getGamma() - transferParameters.getGamma()) < 0.001d;
    }

    @NotNull
    /* JADX INFO: renamed from: connect-YBCOT_4, reason: not valid java name */
    public static final Connector m2872connectYBCOT_4(@NotNull ColorSpace connect, @NotNull ColorSpace destination, int i10) {
        Intrinsics.checkNotNullParameter(connect, "$this$connect");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        if (connect == colorSpaces.getSrgb()) {
            if (destination == colorSpaces.getSrgb()) {
                return Connector.Companion.getSrgbIdentity$ui_graphics_release();
            }
            if (destination == colorSpaces.getOklab() && RenderIntent.m2880equalsimpl0(i10, RenderIntent.INSTANCE.m2885getPerceptualuksYyKA())) {
                return Connector.Companion.getSrgbToOklabPerceptual$ui_graphics_release();
            }
        } else if (connect == colorSpaces.getOklab() && destination == colorSpaces.getSrgb() && RenderIntent.m2880equalsimpl0(i10, RenderIntent.INSTANCE.m2885getPerceptualuksYyKA())) {
            return Connector.Companion.getOklabToSrgbPerceptual$ui_graphics_release();
        }
        if (connect == destination) {
            return Connector.Companion.identity$ui_graphics_release(connect);
        }
        long model = connect.getModel();
        ColorModel.Companion companion = ColorModel.INSTANCE;
        return (ColorModel.m2861equalsimpl0(model, companion.m2868getRgbxdoWZVw()) && ColorModel.m2861equalsimpl0(destination.getModel(), companion.m2868getRgbxdoWZVw())) ? new Connector.RgbConnector((Rgb) connect, (Rgb) destination, i10, null) : new Connector(connect, destination, i10, null);
    }

    /* JADX INFO: renamed from: connect-YBCOT_4$default, reason: not valid java name */
    public static /* synthetic */ Connector m2873connectYBCOT_4$default(ColorSpace colorSpace, ColorSpace colorSpace2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            colorSpace2 = ColorSpaces.INSTANCE.getSrgb();
        }
        if ((i11 & 2) != 0) {
            i10 = RenderIntent.INSTANCE.m2885getPerceptualuksYyKA();
        }
        return m2872connectYBCOT_4(colorSpace, colorSpace2, i10);
    }

    @NotNull
    public static final float[] inverse3x3(@NotNull float[] m) {
        Intrinsics.checkNotNullParameter(m, "m");
        float f6 = m[0];
        float f10 = m[3];
        float f11 = m[6];
        float f12 = m[1];
        float f13 = m[4];
        float f14 = m[7];
        float f15 = m[2];
        float f16 = m[5];
        float f17 = m[8];
        float f18 = (f13 * f17) - (f14 * f16);
        float f19 = (f14 * f15) - (f12 * f17);
        float f20 = (f12 * f16) - (f13 * f15);
        float f21 = (f11 * f20) + (f10 * f19) + (f6 * f18);
        float[] fArr = new float[m.length];
        fArr[0] = f18 / f21;
        fArr[1] = f19 / f21;
        fArr[2] = f20 / f21;
        fArr[3] = h0.a(f10, f17, f11 * f16, f21);
        fArr[4] = h0.a(f11, f15, f17 * f6, f21);
        fArr[5] = h0.a(f6, f16, f15 * f10, f21);
        fArr[6] = h0.a(f11, f13, f10 * f14, f21);
        fArr[7] = h0.a(f6, f14, f11 * f12, f21);
        fArr[8] = h0.a(f10, f12, f6 * f13, f21);
        return fArr;
    }

    @NotNull
    public static final float[] mul3x3(@NotNull float[] lhs, @NotNull float[] rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        float f6 = lhs[0] * rhs[0];
        float f10 = lhs[3];
        float f11 = rhs[1];
        float f12 = lhs[6];
        float f13 = rhs[2];
        float f14 = f12 * f13;
        float f15 = lhs[1];
        float f16 = rhs[0];
        float f17 = lhs[4];
        float f18 = f11 * f17;
        float f19 = lhs[7];
        float f20 = f19 * f13;
        float f21 = lhs[2] * f16;
        float f22 = lhs[5];
        float f23 = (rhs[1] * f22) + f21;
        float f24 = lhs[8];
        float f25 = lhs[0];
        float f26 = rhs[3] * f25;
        float f27 = rhs[4];
        float f28 = (f10 * f27) + f26;
        float f29 = rhs[5];
        float f30 = lhs[1];
        float f31 = rhs[3];
        float f32 = f17 * f27;
        float f33 = lhs[2];
        float f34 = f22 * rhs[4];
        float f35 = f25 * rhs[6];
        float f36 = lhs[3];
        float f37 = rhs[7];
        float f38 = (f36 * f37) + f35;
        float f39 = rhs[8];
        float f40 = rhs[6];
        return new float[]{f14 + (f10 * f11) + f6, f20 + f18 + (f15 * f16), (f13 * f24) + f23, (f12 * f29) + f28, (f19 * f29) + f32 + (f30 * f31), (f29 * f24) + f34 + (f31 * f33), (f12 * f39) + f38, (f19 * f39) + (lhs[4] * f37) + (f30 * f40), (f24 * f39) + (lhs[5] * rhs[7]) + (f33 * f40)};
    }

    @NotNull
    public static final float[] mul3x3Diag(@NotNull float[] lhs, @NotNull float[] rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        float f6 = lhs[0];
        float f10 = lhs[1];
        float f11 = lhs[2];
        return new float[]{lhs[0] * rhs[0], lhs[1] * rhs[1], lhs[2] * rhs[2], rhs[3] * f6, rhs[4] * f10, rhs[5] * f11, f6 * rhs[6], f10 * rhs[7], f11 * rhs[8]};
    }

    @NotNull
    public static final float[] mul3x3Float3(@NotNull float[] lhs, @NotNull float[] rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        float f6 = rhs[0];
        float f10 = rhs[1];
        float f11 = rhs[2];
        rhs[0] = (lhs[6] * f11) + (lhs[3] * f10) + (lhs[0] * f6);
        rhs[1] = (lhs[7] * f11) + (lhs[4] * f10) + (lhs[1] * f6);
        rhs[2] = (lhs[8] * f11) + (lhs[5] * f10) + (lhs[2] * f6);
        return rhs;
    }

    public static final float mul3x3Float3_0(@NotNull float[] lhs, float f6, float f10, float f11) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        return (lhs[6] * f11) + (lhs[3] * f10) + (lhs[0] * f6);
    }

    public static final float mul3x3Float3_1(@NotNull float[] lhs, float f6, float f10, float f11) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        return (lhs[7] * f11) + (lhs[4] * f10) + (lhs[1] * f6);
    }

    public static final float mul3x3Float3_2(@NotNull float[] lhs, float f6, float f10, float f11) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        return (lhs[8] * f11) + (lhs[5] * f10) + (lhs[2] * f6);
    }

    public static final double rcpResponse(double d2, double d3, double d7, double d10, double d11, double d12) {
        return d2 >= d11 * d10 ? (Math.pow(d2, 1.0d / d12) - d7) / d3 : d2 / d10;
    }

    public static final double response(double d2, double d3, double d7, double d10, double d11, double d12) {
        return d2 >= d11 ? Math.pow((d3 * d2) + d7, d12) : d2 * d10;
    }

    @JvmOverloads
    @NotNull
    public static final ColorSpace adapt(@NotNull ColorSpace colorSpace, @NotNull WhitePoint whitePoint, @NotNull Adaptation adaptation) {
        Intrinsics.checkNotNullParameter(colorSpace, "<this>");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(adaptation, "adaptation");
        if (!ColorModel.m2861equalsimpl0(colorSpace.getModel(), ColorModel.INSTANCE.m2868getRgbxdoWZVw())) {
            return colorSpace;
        }
        Rgb rgb = (Rgb) colorSpace;
        if (compare(rgb.getWhitePoint(), whitePoint)) {
            return colorSpace;
        }
        return new Rgb(rgb, mul3x3(chromaticAdaptation(adaptation.getTransform(), rgb.getWhitePoint().toXyz$ui_graphics_release(), whitePoint.toXyz$ui_graphics_release()), rgb.getTransform()), whitePoint);
    }

    public static final double rcpResponse(double d2, double d3, double d7, double d10, double d11, double d12, double d13, double d14) {
        return d2 >= d11 * d10 ? (Math.pow(d2 - d12, 1.0d / d14) - d7) / d3 : (d2 - d13) / d10;
    }

    public static final double response(double d2, double d3, double d7, double d10, double d11, double d12, double d13, double d14) {
        return d2 >= d11 ? Math.pow((d3 * d2) + d7, d14) + d12 : (d10 * d2) + d13;
    }

    public static final boolean compare(@NotNull WhitePoint a10, @NotNull WhitePoint b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        if (a10 == b10) {
            return true;
        }
        return Math.abs(a10.getX() - b10.getX()) < 0.001f && Math.abs(a10.getY() - b10.getY()) < 0.001f;
    }

    public static final boolean compare(@NotNull float[] a10, @NotNull float[] b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        if (a10 == b10) {
            return true;
        }
        int length = a10.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (Float.compare(a10[i10], b10[i10]) != 0 && Math.abs(a10[i10] - b10[i10]) > 0.001f) {
                return false;
            }
        }
        return true;
    }
}
