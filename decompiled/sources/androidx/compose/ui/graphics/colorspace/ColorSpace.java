package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ColorSpace.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\b&\u0018\u0000 =2\u00020\u0001:\u0001=B$\b\u0000\u0012\u0006\u0010*\u001a\u00020!\u0012\u0006\u0010/\u001a\u00020+\u0012\u0006\u00104\u001a\u00020\u0002ø\u0001\u0002¢\u0006\u0004\b:\u0010;B\u001c\b\u0016\u0012\u0006\u0010*\u001a\u00020!\u0012\u0006\u0010/\u001a\u00020+ø\u0001\u0002¢\u0006\u0004\b:\u0010<J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&J'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J@\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0000H\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010 \u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004J\u0010\u0010 \u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&J\b\u0010\"\u001a\u00020!H\u0016J\u0013\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010&\u001a\u00020\u0002H\u0016R\u0017\u0010*\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\u001a\u0010'\u001a\u0004\b(\u0010)R \u0010/\u001a\u00020+8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010.R\u001a\u00104\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0011\u00106\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b5\u00103R\u0014\u00107\u001a\u00020$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u00109\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u00108\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006>"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "", "component", "", "getMinValue", "getMaxValue", "r", "g", "b", "", "toXyz", SharedPrefsStorage.VERSION_KEY, "v0", ConfigConstantsKt.CUSTOMERS_API_VERSION, "v2", "", "toXy$ui_graphics_release", "(FFF)J", "toXy", "toZ$ui_graphics_release", "(FFF)F", "toZ", "x", "y", "z", "a", "colorSpace", "Landroidx/compose/ui/graphics/Color;", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "xyzaToColor", "fromXyz", "", "toString", "other", "", "equals", GenerateActivationFormCommand.HASH_CODE, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "Landroidx/compose/ui/graphics/colorspace/ColorModel;", "J", "getModel-xdoWZVw", "()J", "model", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getId$ui_graphics_release", "()I", "id", "getComponentCount", "componentCount", "isWideGamut", "()Z", "isSrgb", "<init>", "(Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nColorSpace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,796:1\n25#2,3:797\n*S KotlinDebug\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n*L\n288#1:797,3\n*E\n"})
public abstract class ColorSpace {
    public static final int MaxId = 63;
    public static final int MinId = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long model;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int id;

    public ColorSpace(String name, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.model = j10;
        this.id = i10;
        if (name.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        ColorSpace colorSpace = (ColorSpace) other;
        if (this.id == colorSpace.id && Intrinsics.areEqual(this.name, colorSpace.name)) {
            return ColorModel.m2861equalsimpl0(this.model, colorSpace.model);
        }
        return false;
    }

    @NotNull
    public final float[] fromXyz(float x4, float y7, float z10) {
        float[] fArr = new float[ColorModel.m2862getComponentCountimpl(this.model)];
        fArr[0] = x4;
        fArr[1] = y7;
        fArr[2] = z10;
        return fromXyz(fArr);
    }

    @NotNull
    public abstract float[] fromXyz(@NotNull float[] v3);

    public final int getComponentCount() {
        return ColorModel.m2862getComponentCountimpl(this.model);
    }

    /* JADX INFO: renamed from: getId$ui_graphics_release, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public abstract float getMaxValue(int component);

    public abstract float getMinValue(int component);

    /* JADX INFO: renamed from: getModel-xdoWZVw, reason: not valid java name and from getter */
    public final long getModel() {
        return this.model;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return ((ColorModel.m2863hashCodeimpl(this.model) + (this.name.hashCode() * 31)) * 31) + this.id;
    }

    /* JADX INFO: renamed from: isSrgb */
    public boolean getIsSrgb() {
        return false;
    }

    /* JADX INFO: renamed from: isWideGamut */
    public abstract boolean getIsWideGamut();

    @NotNull
    public String toString() {
        return this.name + " (id=" + this.id + ", model=" + ((Object) ColorModel.m2864toStringimpl(this.model)) + RootService.CLOSE_BRACKET;
    }

    public long toXy$ui_graphics_release(float v0, float v3, float v6) {
        float[] xyz = toXyz(v0, v3, v6);
        float f6 = xyz[0];
        float f10 = xyz[1];
        return (((long) Float.floatToIntBits(f6)) << 32) | (((long) Float.floatToIntBits(f10)) & 4294967295L);
    }

    @NotNull
    public final float[] toXyz(float r3, float g6, float b10) {
        return toXyz(new float[]{r3, g6, b10});
    }

    @NotNull
    public abstract float[] toXyz(@NotNull float[] v3);

    public float toZ$ui_graphics_release(float v0, float v3, float v6) {
        return toXyz(v0, v3, v6)[2];
    }

    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics_release, reason: not valid java name */
    public long mo2871xyzaToColorJlNiLsg$ui_graphics_release(float x4, float y7, float z10, float a10, @NotNull ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        float[] fArrFromXyz = fromXyz(x4, y7, z10);
        return ColorKt.Color(fArrFromXyz[0], fArrFromXyz[1], fArrFromXyz[2], a10, colorSpace);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ColorSpace(String name, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(name, j10, -1, null);
        Intrinsics.checkNotNullParameter(name, "name");
    }
}
