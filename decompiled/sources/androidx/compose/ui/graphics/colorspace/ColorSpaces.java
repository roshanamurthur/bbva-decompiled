package androidx.compose.ui.graphics.colorspace;

import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z0.a;
import z0.b;

/* JADX INFO: compiled from: ColorSpaces.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0010\u0011\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b[\u0010\\J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0080\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0019\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\"\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0017\u0010%\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u0017\u0010(\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u001eR\u0017\u0010+\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010\u001eR\u0017\u0010.\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b,\u0010\u001c\u001a\u0004\b-\u0010\u001eR\u0017\u00101\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b/\u0010\u001c\u001a\u0004\b0\u0010\u001eR\u0017\u00104\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b2\u0010\u001c\u001a\u0004\b3\u0010\u001eR\u0017\u00107\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b5\u0010\u001c\u001a\u0004\b6\u0010\u001eR\u0017\u0010:\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b8\u0010\u001c\u001a\u0004\b9\u0010\u001eR\u0017\u0010=\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b;\u0010\u001c\u001a\u0004\b<\u0010\u001eR\u0017\u0010@\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b>\u0010\u001c\u001a\u0004\b?\u0010\u001eR\u0017\u0010C\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bA\u0010\u001c\u001a\u0004\bB\u0010\u001eR\u0017\u0010F\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bD\u0010\u001c\u001a\u0004\bE\u0010\u001eR\u0017\u0010K\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010N\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bL\u0010H\u001a\u0004\bM\u0010JR\u001a\u0010Q\u001a\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bO\u0010\u001c\u001a\u0004\bP\u0010\u001eR\u0017\u0010T\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bR\u0010H\u001a\u0004\bS\u0010JR \u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00060U8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y¨\u0006]"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpaces;", "", "", "toXYZD50", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "function", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "match", "", "id", "getColorSpace$ui_graphics_release", "(I)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getColorSpace", "a", "[F", "getSrgbPrimaries$ui_graphics_release", "()[F", "SrgbPrimaries", "b", "getNtsc1953Primaries$ui_graphics_release", "Ntsc1953Primaries", "c", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "getSrgbTransferParameters$ui_graphics_release", "()Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "SrgbTransferParameters", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "d", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "getSrgb", "()Landroidx/compose/ui/graphics/colorspace/Rgb;", "Srgb", "e", "getLinearSrgb", "LinearSrgb", "f", "getExtendedSrgb", "ExtendedSrgb", "g", "getLinearExtendedSrgb", "LinearExtendedSrgb", "h", "getBt709", "Bt709", "i", "getBt2020", "Bt2020", "j", "getDciP3", "DciP3", "k", "getDisplayP3", "DisplayP3", "l", "getNtsc1953", "Ntsc1953", "m", "getSmpteC", "SmpteC", "n", "getAdobeRgb", "AdobeRgb", "o", "getProPhotoRgb", "ProPhotoRgb", "p", "getAces", "Aces", "q", "getAcescg", "Acescg", "r", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getCieXyz", "()Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "CieXyz", "s", "getCieLab", "CieLab", "t", "getUnspecified$ui_graphics_release", "Unspecified", "u", "getOklab", "Oklab", "", SharedPrefsStorage.VERSION_KEY, "[Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getColorSpacesArray$ui_graphics_release", "()[Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "ColorSpacesArray", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
public final class ColorSpaces {

    @NotNull
    public static final ColorSpaces INSTANCE = new ColorSpaces();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final float[] SrgbPrimaries;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final float[] Ntsc1953Primaries;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final TransferParameters SrgbTransferParameters;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Rgb Srgb;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Rgb LinearSrgb;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Rgb ExtendedSrgb;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Rgb LinearExtendedSrgb;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Rgb Bt709;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Rgb Bt2020;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Rgb DciP3;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Rgb DisplayP3;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Rgb Ntsc1953;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final Rgb SmpteC;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Rgb AdobeRgb;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Rgb ProPhotoRgb;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Rgb Aces;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Rgb Acescg;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final Xyz f15787r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final Lab f15788s;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Rgb Unspecified;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public static final Oklab f15790u;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSpace[] ColorSpacesArray;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        SrgbPrimaries = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        Ntsc1953Primaries = fArr2;
        TransferParameters transferParameters = new TransferParameters(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        SrgbTransferParameters = transferParameters;
        double d2 = 0.0d;
        double d3 = 0.0d;
        int i10 = 96;
        DefaultConstructorMarker defaultConstructorMarker = null;
        TransferParameters transferParameters2 = new TransferParameters(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, d2, d3, i10, defaultConstructorMarker);
        Illuminant illuminant = Illuminant.INSTANCE;
        Rgb rgb = new Rgb("sRGB IEC61966-2.1", fArr, illuminant.getD65(), transferParameters, 0);
        Srgb = rgb;
        Rgb rgb2 = new Rgb("sRGB IEC61966-2.1 (Linear)", fArr, illuminant.getD65(), 1.0d, 0.0f, 1.0f, 1);
        LinearSrgb = rgb2;
        int i11 = 0;
        Rgb rgb3 = new Rgb("scRGB-nl IEC 61966-2-2:2003", fArr, illuminant.getD65(), null, new a(i11), new b(i11), -0.799f, 2.399f, transferParameters, 2);
        ExtendedSrgb = rgb3;
        Rgb rgb4 = new Rgb("scRGB IEC 61966-2-2:2003", fArr, illuminant.getD65(), 1.0d, -0.5f, 7.499f, 3);
        LinearExtendedSrgb = rgb4;
        Rgb rgb5 = new Rgb("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, illuminant.getD65(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, d2, d3, i10, defaultConstructorMarker), 4);
        Bt709 = rgb5;
        Rgb rgb6 = new Rgb("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, illuminant.getD65(), new TransferParameters(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        Bt2020 = rgb6;
        Rgb rgb7 = new Rgb("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new WhitePoint(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        DciP3 = rgb7;
        Rgb rgb8 = new Rgb("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, illuminant.getD65(), transferParameters, 7);
        DisplayP3 = rgb8;
        Rgb rgb9 = new Rgb("NTSC (1953)", fArr2, illuminant.getC(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        Ntsc1953 = rgb9;
        Rgb rgb10 = new Rgb("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, illuminant.getD65(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        SmpteC = rgb10;
        Rgb rgb11 = new Rgb("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, illuminant.getD65(), 2.2d, 0.0f, 1.0f, 10);
        AdobeRgb = rgb11;
        Rgb rgb12 = new Rgb("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, illuminant.getD50(), new TransferParameters(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        ProPhotoRgb = rgb12;
        Rgb rgb13 = new Rgb("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, illuminant.getD60(), 1.0d, -65504.0f, 65504.0f, 12);
        Aces = rgb13;
        Rgb rgb14 = new Rgb("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, illuminant.getD60(), 1.0d, -65504.0f, 65504.0f, 13);
        Acescg = rgb14;
        Xyz xyz = new Xyz("Generic XYZ", 14);
        f15787r = xyz;
        Lab lab = new Lab("Generic L*a*b*", 15);
        f15788s = lab;
        Rgb rgb15 = new Rgb("None", fArr, illuminant.getD65(), transferParameters2, 16);
        Unspecified = rgb15;
        Oklab oklab = new Oklab("Oklab", 17);
        f15790u = oklab;
        ColorSpacesArray = new ColorSpace[]{rgb, rgb2, rgb3, rgb4, rgb5, rgb6, rgb7, rgb8, rgb9, rgb10, rgb11, rgb12, rgb13, rgb14, xyz, lab, rgb15, oklab};
    }

    @NotNull
    public final Rgb getAces() {
        return Aces;
    }

    @NotNull
    public final Rgb getAcescg() {
        return Acescg;
    }

    @NotNull
    public final Rgb getAdobeRgb() {
        return AdobeRgb;
    }

    @NotNull
    public final Rgb getBt2020() {
        return Bt2020;
    }

    @NotNull
    public final Rgb getBt709() {
        return Bt709;
    }

    @NotNull
    public final ColorSpace getCieLab() {
        return f15788s;
    }

    @NotNull
    public final ColorSpace getCieXyz() {
        return f15787r;
    }

    @NotNull
    public final ColorSpace getColorSpace$ui_graphics_release(int id) {
        return getColorSpacesArray$ui_graphics_release()[id];
    }

    @NotNull
    public final ColorSpace[] getColorSpacesArray$ui_graphics_release() {
        return ColorSpacesArray;
    }

    @NotNull
    public final Rgb getDciP3() {
        return DciP3;
    }

    @NotNull
    public final Rgb getDisplayP3() {
        return DisplayP3;
    }

    @NotNull
    public final Rgb getExtendedSrgb() {
        return ExtendedSrgb;
    }

    @NotNull
    public final Rgb getLinearExtendedSrgb() {
        return LinearExtendedSrgb;
    }

    @NotNull
    public final Rgb getLinearSrgb() {
        return LinearSrgb;
    }

    @NotNull
    public final Rgb getNtsc1953() {
        return Ntsc1953;
    }

    @NotNull
    public final float[] getNtsc1953Primaries$ui_graphics_release() {
        return Ntsc1953Primaries;
    }

    @NotNull
    public final ColorSpace getOklab() {
        return f15790u;
    }

    @NotNull
    public final Rgb getProPhotoRgb() {
        return ProPhotoRgb;
    }

    @NotNull
    public final Rgb getSmpteC() {
        return SmpteC;
    }

    @NotNull
    public final Rgb getSrgb() {
        return Srgb;
    }

    @NotNull
    public final float[] getSrgbPrimaries$ui_graphics_release() {
        return SrgbPrimaries;
    }

    @NotNull
    public final TransferParameters getSrgbTransferParameters$ui_graphics_release() {
        return SrgbTransferParameters;
    }

    @NotNull
    public final Rgb getUnspecified$ui_graphics_release() {
        return Unspecified;
    }

    @Nullable
    public final ColorSpace match(@NotNull float[] toXYZD50, @NotNull TransferParameters function) {
        Intrinsics.checkNotNullParameter(toXYZD50, "toXYZD50");
        Intrinsics.checkNotNullParameter(function, "function");
        for (ColorSpace colorSpace : ColorSpacesArray) {
            if (ColorModel.m2861equalsimpl0(colorSpace.getModel(), ColorModel.INSTANCE.m2868getRgbxdoWZVw())) {
                ColorSpace colorSpaceAdapt$default = ColorSpaceKt.adapt$default(colorSpace, Illuminant.INSTANCE.getD50(), null, 2, null);
                Intrinsics.checkNotNull(colorSpaceAdapt$default, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
                Rgb rgb = (Rgb) colorSpaceAdapt$default;
                if (ColorSpaceKt.compare(toXYZD50, rgb.getTransform()) && ColorSpaceKt.compare(function, rgb.getTransferParameters())) {
                    return colorSpace;
                }
            }
        }
        return null;
    }
}
