package androidx.compose.ui.graphics;

import androidx.camera.camera2.internal.l0;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.UnsignedKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Color.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087@\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0012\u0012\u0006\u0010-\u001a\u00020(ø\u0001\u0002¢\u0006\u0004\b9\u0010:J\u001e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b\r\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b\u000f\u0010\tJ\u0010\u0010\u0013\u001a\u00020\u0002H\u0087\u0002¢\u0006\u0004\b\u0011\u0010\u0012J@\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010'\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010-\u001a\u00020(8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010\tR\u001a\u0010\u0016\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b4\u00100\u001a\u0004\b3\u0010\tR\u001a\u0010\u0017\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b6\u00100\u001a\u0004\b5\u0010\tR\u001a\u0010\u0014\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b8\u00100\u001a\u0004\b7\u0010\t\u0088\u0001-\u0092\u0001\u00020(ø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006<"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "convert-vNxB06k", "(JLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "convert", "", "component1-impl", "(J)F", "component1", "component2-impl", "component2", "component3-impl", "component3", "component4-impl", "component4", "component5-impl", "(J)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "component5", "alpha", "red", "green", "blue", "copy-wmQWz5c", "(JFFFF)J", "copy", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "Lkotlin/ULong;", "a", "J", "getValue-s-VKNKU", "()J", "value", "getColorSpace-impl", "getColorSpace$annotations", "()V", "getRed-impl", "getRed$annotations", "getGreen-impl", "getGreen$annotations", "getBlue-impl", "getBlue$annotations", "getAlpha-impl", "getAlpha$annotations", "constructor-impl", "(J)J", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color\n+ 2 ColorSpaces.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaces\n*L\n1#1,672:1\n320#2:673\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color\n*L\n123#1:673\n*E\n"})
public final class Color {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f15610b = ColorKt.Color(4278190080L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f15611c = ColorKt.Color(4282664004L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f15612d = ColorKt.Color(4287137928L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f15613e = ColorKt.Color(4291611852L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f15614f = ColorKt.Color(4294967295L);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f15615g = ColorKt.Color(4294901760L);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f15616h = ColorKt.Color(4278255360L);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f15617i = ColorKt.Color(4278190335L);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f15618j = ColorKt.Color(4294967040L);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f15619k = ColorKt.Color(4278255615L);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f15620l = ColorKt.Color(4294902015L);
    public static final long m = ColorKt.Color(0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f15621n = ColorKt.Color(0.0f, 0.0f, 0.0f, 0.0f, ColorSpaces.INSTANCE.getUnspecified$ui_graphics_release());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long value;

    public /* synthetic */ Color(long j10) {
        this.value = j10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Color m2498boximpl(long j10) {
        return new Color(j10);
    }

    @Stable
    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m2499component1impl(long j10) {
        return m2514getRedimpl(j10);
    }

    @Stable
    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m2500component2impl(long j10) {
        return m2513getGreenimpl(j10);
    }

    @Stable
    /* JADX INFO: renamed from: component3-impl, reason: not valid java name */
    public static final float m2501component3impl(long j10) {
        return m2511getBlueimpl(j10);
    }

    @Stable
    /* JADX INFO: renamed from: component4-impl, reason: not valid java name */
    public static final float m2502component4impl(long j10) {
        return m2510getAlphaimpl(j10);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: component5-impl, reason: not valid java name */
    public static final ColorSpace m2503component5impl(long j10) {
        return m2512getColorSpaceimpl(j10);
    }

    /* JADX INFO: renamed from: convert-vNxB06k, reason: not valid java name */
    public static final long m2505convertvNxB06k(long j10, @NotNull ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        ColorSpace colorSpaceM2512getColorSpaceimpl = m2512getColorSpaceimpl(j10);
        return Intrinsics.areEqual(colorSpace, colorSpaceM2512getColorSpaceimpl) ? j10 : ColorSpaceKt.m2873connectYBCOT_4$default(colorSpaceM2512getColorSpaceimpl, colorSpace, 0, 2, null).mo2875transformToColorwmQWz5c$ui_graphics_release(m2514getRedimpl(j10), m2513getGreenimpl(j10), m2511getBlueimpl(j10), m2510getAlphaimpl(j10));
    }

    @Stable
    /* JADX INFO: renamed from: copy-wmQWz5c, reason: not valid java name */
    public static final long m2506copywmQWz5c(long j10, float f6, float f10, float f11, float f12) {
        return ColorKt.Color(f10, f11, f12, f6, m2512getColorSpaceimpl(j10));
    }

    /* JADX INFO: renamed from: copy-wmQWz5c$default, reason: not valid java name */
    public static /* synthetic */ long m2507copywmQWz5c$default(long j10, float f6, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = m2510getAlphaimpl(j10);
        }
        float f13 = f6;
        if ((i10 & 2) != 0) {
            f10 = m2514getRedimpl(j10);
        }
        float f14 = f10;
        if ((i10 & 4) != 0) {
            f11 = m2513getGreenimpl(j10);
        }
        float f15 = f11;
        if ((i10 & 8) != 0) {
            f12 = m2511getBlueimpl(j10);
        }
        return m2506copywmQWz5c(j10, f13, f14, f15, f12);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2508equalsimpl(long j10, Object obj) {
        return (obj instanceof Color) && j10 == ((Color) obj).m2518unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2509equalsimpl0(long j10, long j11) {
        return ULong.m5597equalsimpl0(j10, j11);
    }

    /* JADX INFO: renamed from: getAlpha-impl, reason: not valid java name */
    public static final float m2510getAlphaimpl(long j10) {
        float fUlongToDouble;
        float f6;
        if (ULong.m5595constructorimpl(63 & j10) == 0) {
            fUlongToDouble = (float) UnsignedKt.ulongToDouble(ULong.m5595constructorimpl(ULong.m5595constructorimpl(j10 >>> 56) & 255));
            f6 = 255.0f;
        } else {
            fUlongToDouble = (float) UnsignedKt.ulongToDouble(ULong.m5595constructorimpl(ULong.m5595constructorimpl(j10 >>> 6) & 1023));
            f6 = 1023.0f;
        }
        return fUlongToDouble / f6;
    }

    /* JADX INFO: renamed from: getBlue-impl, reason: not valid java name */
    public static final float m2511getBlueimpl(long j10) {
        return ULong.m5595constructorimpl(63 & j10) == 0 ? ((float) UnsignedKt.ulongToDouble(ULong.m5595constructorimpl(ULong.m5595constructorimpl(j10 >>> 32) & 255))) / 255.0f : Float16.m2625toFloatimpl(Float16.m2609constructorimpl((short) ULong.m5595constructorimpl(ULong.m5595constructorimpl(j10 >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    @NotNull
    /* JADX INFO: renamed from: getColorSpace-impl, reason: not valid java name */
    public static final ColorSpace m2512getColorSpaceimpl(long j10) {
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        return colorSpaces.getColorSpacesArray$ui_graphics_release()[(int) ULong.m5595constructorimpl(j10 & 63)];
    }

    /* JADX INFO: renamed from: getGreen-impl, reason: not valid java name */
    public static final float m2513getGreenimpl(long j10) {
        return ULong.m5595constructorimpl(63 & j10) == 0 ? ((float) UnsignedKt.ulongToDouble(ULong.m5595constructorimpl(ULong.m5595constructorimpl(j10 >>> 40) & 255))) / 255.0f : Float16.m2625toFloatimpl(Float16.m2609constructorimpl((short) ULong.m5595constructorimpl(ULong.m5595constructorimpl(j10 >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    /* JADX INFO: renamed from: getRed-impl, reason: not valid java name */
    public static final float m2514getRedimpl(long j10) {
        return ULong.m5595constructorimpl(63 & j10) == 0 ? ((float) UnsignedKt.ulongToDouble(ULong.m5595constructorimpl(ULong.m5595constructorimpl(j10 >>> 48) & 255))) / 255.0f : Float16.m2625toFloatimpl(Float16.m2609constructorimpl((short) ULong.m5595constructorimpl(ULong.m5595constructorimpl(j10 >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2515hashCodeimpl(long j10) {
        return ULong.m5598hashCodeimpl(j10);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2516toStringimpl(long j10) {
        return "Color(" + m2514getRedimpl(j10) + ", " + m2513getGreenimpl(j10) + ", " + m2511getBlueimpl(j10) + ", " + m2510getAlphaimpl(j10) + ", " + m2512getColorSpaceimpl(j10).getName() + RootService.CLOSE_BRACKET;
    }

    public boolean equals(Object obj) {
        return m2508equalsimpl(this.value, obj);
    }

    /* JADX INFO: renamed from: getValue-s-VKNKU, reason: not valid java name and from getter */
    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return m2515hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m2516toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m2518unboximpl() {
        return this.value;
    }

    /* JADX INFO: compiled from: Color.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b:\u0010\u0015JB\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJB\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000bR)\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R)\u0010\u0016\u001a\u00020\t8\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\u0013R)\u0010\u0019\u001a\u00020\t8\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u0012\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001a\u0010\u0013R)\u0010\u001c\u001a\u00020\t8\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u001c\u0010\u0011\u0012\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001d\u0010\u0013R)\u0010\u001f\u001a\u00020\t8\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u001f\u0010\u0011\u0012\u0004\b!\u0010\u0015\u001a\u0004\b \u0010\u0013R)\u0010\"\u001a\u00020\t8\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\"\u0010\u0011\u0012\u0004\b$\u0010\u0015\u001a\u0004\b#\u0010\u0013R)\u0010%\u001a\u00020\t8\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b%\u0010\u0011\u0012\u0004\b'\u0010\u0015\u001a\u0004\b&\u0010\u0013R)\u0010(\u001a\u00020\t8\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b(\u0010\u0011\u0012\u0004\b*\u0010\u0015\u001a\u0004\b)\u0010\u0013R)\u0010+\u001a\u00020\t8\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b+\u0010\u0011\u0012\u0004\b-\u0010\u0015\u001a\u0004\b,\u0010\u0013R)\u0010.\u001a\u00020\t8\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b.\u0010\u0011\u0012\u0004\b0\u0010\u0015\u001a\u0004\b/\u0010\u0013R)\u00101\u001a\u00020\t8\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b1\u0010\u0011\u0012\u0004\b3\u0010\u0015\u001a\u0004\b2\u0010\u0013R)\u00104\u001a\u00020\t8\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b4\u0010\u0011\u0012\u0004\b6\u0010\u0015\u001a\u0004\b5\u0010\u0013R)\u00107\u001a\u00020\t8\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b7\u0010\u0011\u0012\u0004\b9\u0010\u0015\u001a\u0004\b8\u0010\u0013\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006;"}, d2 = {"Landroidx/compose/ui/graphics/Color$Companion;", "", "", "hue", "saturation", "value", "alpha", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "colorSpace", "Landroidx/compose/ui/graphics/Color;", "hsv-JlNiLsg", "(FFFFLandroidx/compose/ui/graphics/colorspace/Rgb;)J", "hsv", "lightness", "hsl-JlNiLsg", "hsl", "Black", "J", "getBlack-0d7_KjU", "()J", "getBlack-0d7_KjU$annotations", "()V", "DarkGray", "getDarkGray-0d7_KjU", "getDarkGray-0d7_KjU$annotations", "Gray", "getGray-0d7_KjU", "getGray-0d7_KjU$annotations", "LightGray", "getLightGray-0d7_KjU", "getLightGray-0d7_KjU$annotations", "White", "getWhite-0d7_KjU", "getWhite-0d7_KjU$annotations", "Red", "getRed-0d7_KjU", "getRed-0d7_KjU$annotations", "Green", "getGreen-0d7_KjU", "getGreen-0d7_KjU$annotations", "Blue", "getBlue-0d7_KjU", "getBlue-0d7_KjU$annotations", "Yellow", "getYellow-0d7_KjU", "getYellow-0d7_KjU$annotations", "Cyan", "getCyan-0d7_KjU", "getCyan-0d7_KjU$annotations", "Magenta", "getMagenta-0d7_KjU", "getMagenta-0d7_KjU$annotations", "Transparent", "getTransparent-0d7_KjU", "getTransparent-0d7_KjU$annotations", "Unspecified", "getUnspecified-0d7_KjU", "getUnspecified-0d7_KjU$annotations", "<init>", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static float a(float f6, float f10, float f11, int i10) {
            float f12 = ((f6 / 30.0f) + i10) % 12.0f;
            return f11 - (Math.max(-1.0f, Math.min(f12 - 3, Math.min(9 - f12, 1.0f))) * (Math.min(f11, 1.0f - f11) * f10));
        }

        public static float b(float f6, float f10, float f11, int i10) {
            float f12 = ((f6 / 60.0f) + i10) % 6.0f;
            return f11 - (Math.max(0.0f, Math.min(f12, Math.min(4 - f12, 1.0f))) * (f10 * f11));
        }

        /* JADX INFO: renamed from: hsl-JlNiLsg$default, reason: not valid java name */
        public static /* synthetic */ long m2532hslJlNiLsg$default(Companion companion, float f6, float f10, float f11, float f12, Rgb rgb, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                f12 = 1.0f;
            }
            float f13 = f12;
            if ((i10 & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m2547hslJlNiLsg(f6, f10, f11, f13, rgb);
        }

        /* JADX INFO: renamed from: hsv-JlNiLsg$default, reason: not valid java name */
        public static /* synthetic */ long m2533hsvJlNiLsg$default(Companion companion, float f6, float f10, float f11, float f12, Rgb rgb, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                f12 = 1.0f;
            }
            float f13 = f12;
            if ((i10 & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m2548hsvJlNiLsg(f6, f10, f11, f13, rgb);
        }

        /* JADX INFO: renamed from: getBlack-0d7_KjU, reason: not valid java name */
        public final long m2534getBlack0d7_KjU() {
            return Color.f15610b;
        }

        /* JADX INFO: renamed from: getBlue-0d7_KjU, reason: not valid java name */
        public final long m2535getBlue0d7_KjU() {
            return Color.f15617i;
        }

        /* JADX INFO: renamed from: getCyan-0d7_KjU, reason: not valid java name */
        public final long m2536getCyan0d7_KjU() {
            return Color.f15619k;
        }

        /* JADX INFO: renamed from: getDarkGray-0d7_KjU, reason: not valid java name */
        public final long m2537getDarkGray0d7_KjU() {
            return Color.f15611c;
        }

        /* JADX INFO: renamed from: getGray-0d7_KjU, reason: not valid java name */
        public final long m2538getGray0d7_KjU() {
            return Color.f15612d;
        }

        /* JADX INFO: renamed from: getGreen-0d7_KjU, reason: not valid java name */
        public final long m2539getGreen0d7_KjU() {
            return Color.f15616h;
        }

        /* JADX INFO: renamed from: getLightGray-0d7_KjU, reason: not valid java name */
        public final long m2540getLightGray0d7_KjU() {
            return Color.f15613e;
        }

        /* JADX INFO: renamed from: getMagenta-0d7_KjU, reason: not valid java name */
        public final long m2541getMagenta0d7_KjU() {
            return Color.f15620l;
        }

        /* JADX INFO: renamed from: getRed-0d7_KjU, reason: not valid java name */
        public final long m2542getRed0d7_KjU() {
            return Color.f15615g;
        }

        /* JADX INFO: renamed from: getTransparent-0d7_KjU, reason: not valid java name */
        public final long m2543getTransparent0d7_KjU() {
            return Color.m;
        }

        /* JADX INFO: renamed from: getUnspecified-0d7_KjU, reason: not valid java name */
        public final long m2544getUnspecified0d7_KjU() {
            return Color.f15621n;
        }

        /* JADX INFO: renamed from: getWhite-0d7_KjU, reason: not valid java name */
        public final long m2545getWhite0d7_KjU() {
            return Color.f15614f;
        }

        /* JADX INFO: renamed from: getYellow-0d7_KjU, reason: not valid java name */
        public final long m2546getYellow0d7_KjU() {
            return Color.f15618j;
        }

        /* JADX INFO: renamed from: hsl-JlNiLsg, reason: not valid java name */
        public final long m2547hslJlNiLsg(float hue, float saturation, float lightness, float alpha, @NotNull Rgb colorSpace) {
            Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
            if (0.0f <= hue && hue <= 360.0f && 0.0f <= saturation && saturation <= 1.0f && 0.0f <= lightness && lightness <= 1.0f) {
                return ColorKt.Color(a(hue, saturation, lightness, 0), a(hue, saturation, lightness, 8), a(hue, saturation, lightness, 4), alpha, colorSpace);
            }
            StringBuilder sb2 = new StringBuilder("HSL (");
            sb2.append(hue);
            sb2.append(", ");
            sb2.append(saturation);
            sb2.append(", ");
            throw new IllegalArgumentException(l0.a(sb2, lightness, ") must be in range (0..360, 0..1, 0..1)").toString());
        }

        /* JADX INFO: renamed from: hsv-JlNiLsg, reason: not valid java name */
        public final long m2548hsvJlNiLsg(float hue, float saturation, float value, float alpha, @NotNull Rgb colorSpace) {
            Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
            if (0.0f <= hue && hue <= 360.0f && 0.0f <= saturation && saturation <= 1.0f && 0.0f <= value && value <= 1.0f) {
                return ColorKt.Color(b(hue, saturation, value, 5), b(hue, saturation, value, 3), b(hue, saturation, value, 1), alpha, colorSpace);
            }
            StringBuilder sb2 = new StringBuilder("HSV (");
            sb2.append(hue);
            sb2.append(", ");
            sb2.append(saturation);
            sb2.append(", ");
            throw new IllegalArgumentException(l0.a(sb2, value, ") must be in range (0..360, 0..1, 0..1)").toString());
        }

        @Stable
        /* JADX INFO: renamed from: getBlack-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2519getBlack0d7_KjU$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getBlue-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2520getBlue0d7_KjU$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getCyan-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2521getCyan0d7_KjU$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getDarkGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2522getDarkGray0d7_KjU$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2523getGray0d7_KjU$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getGreen-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2524getGreen0d7_KjU$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getLightGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2525getLightGray0d7_KjU$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getMagenta-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2526getMagenta0d7_KjU$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getRed-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2527getRed0d7_KjU$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getTransparent-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2528getTransparent0d7_KjU$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getUnspecified-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2529getUnspecified0d7_KjU$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getWhite-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2530getWhite0d7_KjU$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: getYellow-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2531getYellow0d7_KjU$annotations() {
        }
    }

    @Stable
    public static /* synthetic */ void getAlpha$annotations() {
    }

    @Stable
    public static /* synthetic */ void getBlue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getColorSpace$annotations() {
    }

    @Stable
    public static /* synthetic */ void getGreen$annotations() {
    }

    @Stable
    public static /* synthetic */ void getRed$annotations() {
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m2504constructorimpl(long j10) {
        return j10;
    }
}
