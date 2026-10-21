package y0;

import android.graphics.ColorSpace;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.TransferParameters;
import androidx.compose.ui.graphics.colorspace.WhitePoint;
import androidx.compose.ui.platform.c0;
import androidx.compose.ui.platform.d0;
import androidx.core.content.pm.u0;
import com.esotericsoftware.kryo.serializers.w;
import com.esotericsoftware.kryo.serializers.x;
import com.esotericsoftware.kryo.serializers.y;
import java.util.function.DoubleUnaryOperator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidColorSpace.android.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
public final class i {
    /* JADX WARN: Type inference failed for: r6v0, types: [y0.e] */
    /* JADX WARN: Type inference failed for: r7v0, types: [y0.f] */
    @JvmStatic
    @NotNull
    @DoNotInline
    @RequiresApi(26)
    public static final ColorSpace a(@NotNull androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        ColorSpace colorSpaceC;
        ColorSpace.Rgb.TransferParameters transferParametersA;
        ColorSpace.Rgb rgbC;
        Intrinsics.checkNotNullParameter(colorSpace, "<this>");
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getSrgb())) {
            ColorSpace colorSpace2 = ColorSpace.get(ColorSpace.Named.SRGB);
            Intrinsics.checkNotNullExpressionValue(colorSpace2, "get(android.graphics.ColorSpace.Named.SRGB)");
            return colorSpace2;
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getAces())) {
            ColorSpace colorSpace3 = ColorSpace.get(ColorSpace.Named.ACES);
            Intrinsics.checkNotNullExpressionValue(colorSpace3, "get(android.graphics.ColorSpace.Named.ACES)");
            return colorSpace3;
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getAcescg())) {
            ColorSpace colorSpace4 = ColorSpace.get(ColorSpace.Named.ACESCG);
            Intrinsics.checkNotNullExpressionValue(colorSpace4, "get(android.graphics.ColorSpace.Named.ACESCG)");
            return colorSpace4;
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getAdobeRgb())) {
            ColorSpace colorSpace5 = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
            Intrinsics.checkNotNullExpressionValue(colorSpace5, "get(android.graphics.ColorSpace.Named.ADOBE_RGB)");
            return colorSpace5;
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getBt2020())) {
            ColorSpace colorSpace6 = ColorSpace.get(ColorSpace.Named.BT2020);
            Intrinsics.checkNotNullExpressionValue(colorSpace6, "get(android.graphics.ColorSpace.Named.BT2020)");
            return colorSpace6;
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getBt709())) {
            ColorSpace colorSpace7 = ColorSpace.get(ColorSpace.Named.BT709);
            Intrinsics.checkNotNullExpressionValue(colorSpace7, "get(android.graphics.ColorSpace.Named.BT709)");
            return colorSpace7;
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getCieLab())) {
            ColorSpace colorSpace8 = ColorSpace.get(ColorSpace.Named.CIE_LAB);
            Intrinsics.checkNotNullExpressionValue(colorSpace8, "get(android.graphics.ColorSpace.Named.CIE_LAB)");
            return colorSpace8;
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getCieXyz())) {
            ColorSpace colorSpace9 = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
            Intrinsics.checkNotNullExpressionValue(colorSpace9, "get(android.graphics.ColorSpace.Named.CIE_XYZ)");
            return colorSpace9;
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getDciP3())) {
            ColorSpace colorSpace10 = ColorSpace.get(ColorSpace.Named.DCI_P3);
            Intrinsics.checkNotNullExpressionValue(colorSpace10, "get(android.graphics.ColorSpace.Named.DCI_P3)");
            return colorSpace10;
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getDisplayP3())) {
            ColorSpace colorSpace11 = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
            Intrinsics.checkNotNullExpressionValue(colorSpace11, "get(android.graphics.ColorSpace.Named.DISPLAY_P3)");
            return colorSpace11;
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getExtendedSrgb())) {
            ColorSpace colorSpace12 = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
            Intrinsics.checkNotNullExpressionValue(colorSpace12, "get(android.graphics.Col…pace.Named.EXTENDED_SRGB)");
            return colorSpace12;
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getLinearExtendedSrgb())) {
            ColorSpace colorSpace13 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            Intrinsics.checkNotNullExpressionValue(colorSpace13, "get(android.graphics.Col…med.LINEAR_EXTENDED_SRGB)");
            return colorSpace13;
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getLinearSrgb())) {
            ColorSpace colorSpace14 = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
            Intrinsics.checkNotNullExpressionValue(colorSpace14, "get(android.graphics.ColorSpace.Named.LINEAR_SRGB)");
            return colorSpace14;
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getNtsc1953())) {
            ColorSpace colorSpace15 = ColorSpace.get(ColorSpace.Named.NTSC_1953);
            Intrinsics.checkNotNullExpressionValue(colorSpace15, "get(android.graphics.ColorSpace.Named.NTSC_1953)");
            return colorSpace15;
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getProPhotoRgb())) {
            ColorSpace colorSpace16 = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
            Intrinsics.checkNotNullExpressionValue(colorSpace16, "get(android.graphics.Col…pace.Named.PRO_PHOTO_RGB)");
            return colorSpace16;
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getSmpteC())) {
            ColorSpace colorSpace17 = ColorSpace.get(ColorSpace.Named.SMPTE_C);
            Intrinsics.checkNotNullExpressionValue(colorSpace17, "get(android.graphics.ColorSpace.Named.SMPTE_C)");
            return colorSpace17;
        }
        if (colorSpace instanceof Rgb) {
            Rgb rgb = (Rgb) colorSpace;
            float[] xyz$ui_graphics_release = rgb.getWhitePoint().toXyz$ui_graphics_release();
            TransferParameters transferParameters = rgb.getTransferParameters();
            if (transferParameters != null) {
                androidx.compose.ui.platform.b.f();
                transferParametersA = w.a(transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
            } else {
                transferParametersA = null;
            }
            if (transferParametersA != null) {
                y.g();
                rgbC = x.c(colorSpace.getName(), ((Rgb) colorSpace).getPrimaries(), xyz$ui_graphics_release, transferParametersA);
            } else {
                y.g();
                String name = colorSpace.getName();
                Rgb rgb2 = (Rgb) colorSpace;
                float[] primaries = rgb2.getPrimaries();
                final Function1<Double, Double> oetf = rgb2.getOetf();
                ?? r10 = new DoubleUnaryOperator() { // from class: y0.e
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d2) {
                        Function1 tmp0 = oetf;
                        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                        return ((Number) tmp0.invoke(Double.valueOf(d2))).doubleValue();
                    }
                };
                final Function1<Double, Double> eotf = rgb2.getEotf();
                rgbC = u0.c(name, primaries, xyz$ui_graphics_release, r10, new DoubleUnaryOperator() { // from class: y0.f
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d2) {
                        Function1 tmp0 = eotf;
                        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                        return ((Number) tmp0.invoke(Double.valueOf(d2))).doubleValue();
                    }
                }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0));
            }
            colorSpaceC = androidx.core.graphics.e.c(rgbC);
        } else {
            colorSpaceC = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        Intrinsics.checkNotNullExpressionValue(colorSpaceC, "{\n                if (th…          }\n            }");
        return colorSpaceC;
    }

    @JvmStatic
    @NotNull
    @DoNotInline
    @RequiresApi(26)
    public static final androidx.compose.ui.graphics.colorspace.ColorSpace b(@NotNull ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "<this>");
        int id = colorSpace.getId();
        if (id == ColorSpace.Named.SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getSrgb();
        }
        if (id == ColorSpace.Named.ACES.ordinal()) {
            return ColorSpaces.INSTANCE.getAces();
        }
        if (id == ColorSpace.Named.ACESCG.ordinal()) {
            return ColorSpaces.INSTANCE.getAcescg();
        }
        if (id == ColorSpace.Named.ADOBE_RGB.ordinal()) {
            return ColorSpaces.INSTANCE.getAdobeRgb();
        }
        if (id == ColorSpace.Named.BT2020.ordinal()) {
            return ColorSpaces.INSTANCE.getBt2020();
        }
        if (id == ColorSpace.Named.BT709.ordinal()) {
            return ColorSpaces.INSTANCE.getBt709();
        }
        if (id == ColorSpace.Named.CIE_LAB.ordinal()) {
            return ColorSpaces.INSTANCE.getCieLab();
        }
        if (id == ColorSpace.Named.CIE_XYZ.ordinal()) {
            return ColorSpaces.INSTANCE.getCieXyz();
        }
        if (id == ColorSpace.Named.DCI_P3.ordinal()) {
            return ColorSpaces.INSTANCE.getDciP3();
        }
        if (id == ColorSpace.Named.DISPLAY_P3.ordinal()) {
            return ColorSpaces.INSTANCE.getDisplayP3();
        }
        if (id == ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getExtendedSrgb();
        }
        if (id == ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getLinearExtendedSrgb();
        }
        if (id == ColorSpace.Named.LINEAR_SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getLinearSrgb();
        }
        if (id == ColorSpace.Named.NTSC_1953.ordinal()) {
            return ColorSpaces.INSTANCE.getNtsc1953();
        }
        if (id == ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
            return ColorSpaces.INSTANCE.getProPhotoRgb();
        }
        if (id == ColorSpace.Named.SMPTE_C.ordinal()) {
            return ColorSpaces.INSTANCE.getSmpteC();
        }
        if (!c0.e(colorSpace)) {
            return ColorSpaces.INSTANCE.getSrgb();
        }
        ColorSpace.Rgb.TransferParameters transferParameters = d0.d(colorSpace).getTransferParameters();
        WhitePoint whitePoint = d0.d(colorSpace).getWhitePoint().length == 3 ? new WhitePoint(d0.d(colorSpace).getWhitePoint()[0], d0.d(colorSpace).getWhitePoint()[1], d0.d(colorSpace).getWhitePoint()[2]) : new WhitePoint(d0.d(colorSpace).getWhitePoint()[0], d0.d(colorSpace).getWhitePoint()[1]);
        TransferParameters transferParameters2 = transferParameters != null ? new TransferParameters(transferParameters.g, transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f) : null;
        String name = d0.d(colorSpace).getName();
        Intrinsics.checkNotNullExpressionValue(name, "this.name");
        float[] primaries = d0.d(colorSpace).getPrimaries();
        Intrinsics.checkNotNullExpressionValue(primaries, "this.primaries");
        return new Rgb(name, primaries, whitePoint, d0.d(colorSpace).getTransform(), new g(colorSpace), new h(colorSpace), colorSpace.getMinValue(0), colorSpace.getMaxValue(0), transferParameters2, d0.d(colorSpace).getId());
    }
}
