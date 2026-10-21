package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Oklab.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J%\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J%\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0019J@\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Oklab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "name", "", "id", "", "(Ljava/lang/String;I)V", "isWideGamut", "", "()Z", "fromXyz", "", SharedPrefsStorage.VERSION_KEY, "getMaxValue", "", "component", "getMinValue", "toXy", "", "v0", ConfigConstantsKt.CUSTOMERS_API_VERSION, "v2", "toXy$ui_graphics_release", "toXyz", "toZ", "toZ$ui_graphics_release", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "x", "y", "z", "a", "colorSpace", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOklab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Oklab.kt\nandroidx/compose/ui/graphics/colorspace/Oklab\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,172:1\n25#2,3:173\n*S KotlinDebug\n*F\n+ 1 Oklab.kt\nandroidx/compose/ui/graphics/colorspace/Oklab\n*L\n78#1:173,3\n*E\n"})
public final class Oklab extends ColorSpace {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final float[] f15814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final float[] f15815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final float[] f15816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final float[] f15817g;

    static {
        float[] transform = Adaptation.INSTANCE.getBradford().getTransform();
        Illuminant illuminant = Illuminant.INSTANCE;
        float[] fArrMul3x3 = ColorSpaceKt.mul3x3(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, ColorSpaceKt.chromaticAdaptation(transform, illuminant.getD50().toXyz$ui_graphics_release(), illuminant.getD65().toXyz$ui_graphics_release()));
        f15814d = fArrMul3x3;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f15815e = fArr;
        f15816f = ColorSpaceKt.inverse3x3(fArrMul3x3);
        f15817g = ColorSpaceKt.inverse3x3(fArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oklab(@NotNull String name, int i10) {
        super(name, ColorModel.INSTANCE.m2867getLabxdoWZVw(), i10, null);
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] fromXyz(@NotNull float[] v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        ColorSpaceKt.mul3x3Float3(f15814d, v3);
        double d2 = 0.33333334f;
        v3[0] = Math.signum(v3[0]) * ((float) Math.pow(Math.abs(v3[0]), d2));
        v3[1] = Math.signum(v3[1]) * ((float) Math.pow(Math.abs(v3[1]), d2));
        v3[2] = Math.signum(v3[2]) * ((float) Math.pow(Math.abs(v3[2]), d2));
        ColorSpaceKt.mul3x3Float3(f15815e, v3);
        return v3;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int component) {
        return component == 0 ? 1.0f : 0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int component) {
        return component == 0 ? 0.0f : -0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: isWideGamut */
    public boolean getIsWideGamut() {
        return true;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float v0, float v3, float v6) {
        float fCoerceIn = c.coerceIn(v0, 0.0f, 1.0f);
        float fCoerceIn2 = c.coerceIn(v3, -0.5f, 0.5f);
        float fCoerceIn3 = c.coerceIn(v6, -0.5f, 0.5f);
        float[] fArr = f15817g;
        float fMul3x3Float3_0 = ColorSpaceKt.mul3x3Float3_0(fArr, fCoerceIn, fCoerceIn2, fCoerceIn3);
        float fMul3x3Float3_1 = ColorSpaceKt.mul3x3Float3_1(fArr, fCoerceIn, fCoerceIn2, fCoerceIn3);
        float fMul3x3Float3_2 = ColorSpaceKt.mul3x3Float3_2(fArr, fCoerceIn, fCoerceIn2, fCoerceIn3);
        float f6 = fMul3x3Float3_0 * fMul3x3Float3_0 * fMul3x3Float3_0;
        float f10 = fMul3x3Float3_1 * fMul3x3Float3_1 * fMul3x3Float3_1;
        float f11 = fMul3x3Float3_2 * fMul3x3Float3_2 * fMul3x3Float3_2;
        float[] fArr2 = f15816f;
        float fMul3x3Float3_3 = ColorSpaceKt.mul3x3Float3_0(fArr2, f6, f10, f11);
        float fMul3x3Float3_4 = ColorSpaceKt.mul3x3Float3_1(fArr2, f6, f10, f11);
        return (((long) Float.floatToIntBits(fMul3x3Float3_3)) << 32) | (((long) Float.floatToIntBits(fMul3x3Float3_4)) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] toXyz(@NotNull float[] v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        v3[0] = c.coerceIn(v3[0], 0.0f, 1.0f);
        v3[1] = c.coerceIn(v3[1], -0.5f, 0.5f);
        v3[2] = c.coerceIn(v3[2], -0.5f, 0.5f);
        ColorSpaceKt.mul3x3Float3(f15817g, v3);
        float f6 = v3[0];
        v3[0] = f6 * f6 * f6;
        float f10 = v3[1];
        v3[1] = f10 * f10 * f10;
        float f11 = v3[2];
        v3[2] = f11 * f11 * f11;
        ColorSpaceKt.mul3x3Float3(f15816f, v3);
        return v3;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float v0, float v3, float v6) {
        float fCoerceIn = c.coerceIn(v0, 0.0f, 1.0f);
        float fCoerceIn2 = c.coerceIn(v3, -0.5f, 0.5f);
        float fCoerceIn3 = c.coerceIn(v6, -0.5f, 0.5f);
        float[] fArr = f15817g;
        float fMul3x3Float3_0 = ColorSpaceKt.mul3x3Float3_0(fArr, fCoerceIn, fCoerceIn2, fCoerceIn3);
        float fMul3x3Float3_1 = ColorSpaceKt.mul3x3Float3_1(fArr, fCoerceIn, fCoerceIn2, fCoerceIn3);
        float fMul3x3Float3_2 = ColorSpaceKt.mul3x3Float3_2(fArr, fCoerceIn, fCoerceIn2, fCoerceIn3);
        float f6 = fMul3x3Float3_2 * fMul3x3Float3_2 * fMul3x3Float3_2;
        return ColorSpaceKt.mul3x3Float3_2(f15816f, fMul3x3Float3_0 * fMul3x3Float3_0 * fMul3x3Float3_0, fMul3x3Float3_1 * fMul3x3Float3_1 * fMul3x3Float3_1, f6);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo2871xyzaToColorJlNiLsg$ui_graphics_release(float x4, float y7, float z10, float a10, @NotNull ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        float[] fArr = f15814d;
        float fMul3x3Float3_0 = ColorSpaceKt.mul3x3Float3_0(fArr, x4, y7, z10);
        float fMul3x3Float3_1 = ColorSpaceKt.mul3x3Float3_1(fArr, x4, y7, z10);
        float fMul3x3Float3_2 = ColorSpaceKt.mul3x3Float3_2(fArr, x4, y7, z10);
        double d2 = 0.33333334f;
        float fSignum = Math.signum(fMul3x3Float3_0) * ((float) Math.pow(Math.abs(fMul3x3Float3_0), d2));
        float fSignum2 = Math.signum(fMul3x3Float3_1) * ((float) Math.pow(Math.abs(fMul3x3Float3_1), d2));
        float fSignum3 = Math.signum(fMul3x3Float3_2) * ((float) Math.pow(Math.abs(fMul3x3Float3_2), d2));
        float[] fArr2 = f15815e;
        return ColorKt.Color(ColorSpaceKt.mul3x3Float3_0(fArr2, fSignum, fSignum2, fSignum3), ColorSpaceKt.mul3x3Float3_1(fArr2, fSignum, fSignum2, fSignum3), ColorSpaceKt.mul3x3Float3_2(fArr2, fSignum, fSignum2, fSignum3), a10, colorSpace);
    }
}
