package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Lab.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J%\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J%\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0019J@\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "name", "", "id", "", "(Ljava/lang/String;I)V", "isWideGamut", "", "()Z", "fromXyz", "", SharedPrefsStorage.VERSION_KEY, "getMaxValue", "", "component", "getMinValue", "toXy", "", "v0", ConfigConstantsKt.CUSTOMERS_API_VERSION, "v2", "toXy$ui_graphics_release", "toXyz", "toZ", "toZ$ui_graphics_release", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "x", "y", "z", "a", "colorSpace", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,140:1\n25#2,3:141\n*S KotlinDebug\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n*L\n74#1:141,3\n*E\n"})
public final class Lab extends ColorSpace {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lab(@NotNull String name, int i10) {
        super(name, ColorModel.INSTANCE.m2867getLabxdoWZVw(), i10, null);
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] fromXyz(@NotNull float[] v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        float f6 = v3[0];
        Illuminant illuminant = Illuminant.INSTANCE;
        float f10 = f6 / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f11 = v3[1] / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f12 = v3[2] / illuminant.getD50Xyz$ui_graphics_release()[2];
        float fPow = f10 > 0.008856452f ? (float) Math.pow(f10, 0.33333334f) : (f10 * 7.787037f) + 0.13793103f;
        float fPow2 = f11 > 0.008856452f ? (float) Math.pow(f11, 0.33333334f) : (f11 * 7.787037f) + 0.13793103f;
        float fPow3 = f12 > 0.008856452f ? (float) Math.pow(f12, 0.33333334f) : (f12 * 7.787037f) + 0.13793103f;
        v3[0] = c.coerceIn((116.0f * fPow2) - 16.0f, 0.0f, 100.0f);
        v3[1] = c.coerceIn((fPow - fPow2) * 500.0f, -128.0f, 128.0f);
        v3[2] = c.coerceIn((fPow2 - fPow3) * 200.0f, -128.0f, 128.0f);
        return v3;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int component) {
        return component == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int component) {
        return component == 0 ? 0.0f : -128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: isWideGamut */
    public boolean getIsWideGamut() {
        return true;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float v0, float v3, float v6) {
        float fCoerceIn = (c.coerceIn(v0, 0.0f, 100.0f) + 16.0f) / 116.0f;
        float fCoerceIn2 = (c.coerceIn(v0, -128.0f, 128.0f) * 0.002f) + fCoerceIn;
        float f6 = fCoerceIn2 > 0.20689656f ? fCoerceIn2 * fCoerceIn2 * fCoerceIn2 : (fCoerceIn2 - 0.13793103f) * 0.12841855f;
        float f10 = fCoerceIn > 0.20689656f ? fCoerceIn * fCoerceIn * fCoerceIn : (fCoerceIn - 0.13793103f) * 0.12841855f;
        Illuminant illuminant = Illuminant.INSTANCE;
        return (((long) Float.floatToIntBits(f6 * illuminant.getD50Xyz$ui_graphics_release()[0])) << 32) | (((long) Float.floatToIntBits(f10 * illuminant.getD50Xyz$ui_graphics_release()[1])) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] toXyz(@NotNull float[] v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        v3[0] = c.coerceIn(v3[0], 0.0f, 100.0f);
        v3[1] = c.coerceIn(v3[1], -128.0f, 128.0f);
        float fCoerceIn = c.coerceIn(v3[2], -128.0f, 128.0f);
        v3[2] = fCoerceIn;
        float f6 = (v3[0] + 16.0f) / 116.0f;
        float f10 = (v3[1] * 0.002f) + f6;
        float f11 = f6 - (fCoerceIn * 0.005f);
        float f12 = f10 > 0.20689656f ? f10 * f10 * f10 : (f10 - 0.13793103f) * 0.12841855f;
        float f13 = f6 > 0.20689656f ? f6 * f6 * f6 : (f6 - 0.13793103f) * 0.12841855f;
        float f14 = f11 > 0.20689656f ? f11 * f11 * f11 : (f11 - 0.13793103f) * 0.12841855f;
        Illuminant illuminant = Illuminant.INSTANCE;
        v3[0] = f12 * illuminant.getD50Xyz$ui_graphics_release()[0];
        v3[1] = f13 * illuminant.getD50Xyz$ui_graphics_release()[1];
        v3[2] = f14 * illuminant.getD50Xyz$ui_graphics_release()[2];
        return v3;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float v0, float v3, float v6) {
        float fCoerceIn = ((c.coerceIn(v0, 0.0f, 100.0f) + 16.0f) / 116.0f) - (c.coerceIn(v6, -128.0f, 128.0f) * 0.005f);
        return (fCoerceIn > 0.20689656f ? fCoerceIn * fCoerceIn * fCoerceIn : 0.12841855f * (fCoerceIn - 0.13793103f)) * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo2871xyzaToColorJlNiLsg$ui_graphics_release(float x4, float y7, float z10, float a10, @NotNull ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        Illuminant illuminant = Illuminant.INSTANCE;
        float f6 = x4 / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f10 = y7 / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f11 = z10 / illuminant.getD50Xyz$ui_graphics_release()[2];
        float fPow = f6 > 0.008856452f ? (float) Math.pow(f6, 0.33333334f) : (f6 * 7.787037f) + 0.13793103f;
        float fPow2 = f10 > 0.008856452f ? (float) Math.pow(f10, 0.33333334f) : (f10 * 7.787037f) + 0.13793103f;
        return ColorKt.Color(c.coerceIn((116.0f * fPow2) - 16.0f, 0.0f, 100.0f), c.coerceIn((fPow - fPow2) * 500.0f, -128.0f, 128.0f), c.coerceIn((fPow2 - (f11 > 0.008856452f ? (float) Math.pow(f11, 0.33333334f) : (f11 * 7.787037f) + 0.13793103f)) * 200.0f, -128.0f, 128.0f), a10, colorSpace);
    }
}
