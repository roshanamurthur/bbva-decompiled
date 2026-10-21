package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Xyz.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010#\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J'\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0011\u0010\u0012J@\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u001f\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006&"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Xyz;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "component", "", "getMinValue", "getMaxValue", "", SharedPrefsStorage.VERSION_KEY, "toXyz", "v0", ConfigConstantsKt.CUSTOMERS_API_VERSION, "v2", "", "toXy$ui_graphics_release", "(FFF)J", "toXy", "toZ$ui_graphics_release", "(FFF)F", "toZ", "x", "y", "z", "a", "colorSpace", "Landroidx/compose/ui/graphics/Color;", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "xyzaToColor", "fromXyz", "", "isWideGamut", "()Z", "", "name", "id", "<init>", "(Ljava/lang/String;I)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nXyz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Xyz.kt\nandroidx/compose/ui/graphics/colorspace/Xyz\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,79:1\n25#2,3:80\n*S KotlinDebug\n*F\n+ 1 Xyz.kt\nandroidx/compose/ui/graphics/colorspace/Xyz\n*L\n52#1:80,3\n*E\n"})
public final class Xyz extends ColorSpace {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xyz(@NotNull String name, int i10) {
        super(name, ColorModel.INSTANCE.m2869getXyzxdoWZVw(), i10, null);
        Intrinsics.checkNotNullParameter(name, "name");
    }

    public static float a(float f6) {
        return c.coerceIn(f6, -2.0f, 2.0f);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] fromXyz(@NotNull float[] v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        v3[0] = a(v3[0]);
        v3[1] = a(v3[1]);
        v3[2] = a(v3[2]);
        return v3;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int component) {
        return 2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int component) {
        return -2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: isWideGamut */
    public boolean getIsWideGamut() {
        return true;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float v0, float v3, float v6) {
        float fA = a(v0);
        return (((long) Float.floatToIntBits(a(v3))) & 4294967295L) | (Float.floatToIntBits(fA) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] toXyz(@NotNull float[] v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        v3[0] = a(v3[0]);
        v3[1] = a(v3[1]);
        v3[2] = a(v3[2]);
        return v3;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float v0, float v3, float v6) {
        return a(v6);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo2871xyzaToColorJlNiLsg$ui_graphics_release(float x4, float y7, float z10, float a10, @NotNull ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        return ColorKt.Color(a(x4), a(y7), a(z10), a10, colorSpace);
    }
}
