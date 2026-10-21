package androidx.compose.ui.graphics.colorspace;

import androidx.camera.camera2.internal.h0;
import androidx.camera.camera2.interop.f;
import androidx.camera.core.impl.k;
import androidx.camera.core.impl.y;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.Rgb;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z0.d;
import z0.e;

/* JADX INFO: compiled from: Rgb.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u0000 r2\u00020\u0001:\u0001rB]\b\u0000\u0012\u0006\u0010`\u001a\u00020_\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u00103\u001a\u00020.\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010M\u001a\u00020A\u0012\u0006\u0010V\u001a\u00020A\u0012\u0006\u0010a\u001a\u00020\u000b\u0012\u0006\u0010b\u001a\u00020\u000b\u0012\b\u00108\u001a\u0004\u0018\u000104\u0012\u0006\u0010c\u001a\u00020\t¢\u0006\u0004\bd\u0010eBA\b\u0016\u0012\u0006\u0010`\u001a\u00020_\u0012\u0006\u0010f\u001a\u00020\u0002\u0012\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020H0G\u0012\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020H0G¢\u0006\u0004\bd\u0010gBY\b\u0016\u0012\u0006\u0010`\u001a\u00020_\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u00103\u001a\u00020.\u0012\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020H0G\u0012\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020H0G\u0012\u0006\u0010a\u001a\u00020\u000b\u0012\u0006\u0010b\u001a\u00020\u000b¢\u0006\u0004\bd\u0010hB!\b\u0016\u0012\u0006\u0010`\u001a\u00020_\u0012\u0006\u0010f\u001a\u00020\u0002\u0012\u0006\u0010i\u001a\u000204¢\u0006\u0004\bd\u0010jB)\b\u0016\u0012\u0006\u0010`\u001a\u00020_\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u00103\u001a\u00020.\u0012\u0006\u0010i\u001a\u000204¢\u0006\u0004\bd\u0010kB1\b\u0010\u0012\u0006\u0010`\u001a\u00020_\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u00103\u001a\u00020.\u0012\u0006\u0010i\u001a\u000204\u0012\u0006\u0010c\u001a\u00020\t¢\u0006\u0004\bd\u0010lB!\b\u0016\u0012\u0006\u0010`\u001a\u00020_\u0012\u0006\u0010f\u001a\u00020\u0002\u0012\u0006\u0010m\u001a\u00020H¢\u0006\u0004\bd\u0010nB)\b\u0016\u0012\u0006\u0010`\u001a\u00020_\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u00103\u001a\u00020.\u0012\u0006\u0010m\u001a\u00020H¢\u0006\u0004\bd\u0010oBA\b\u0010\u0012\u0006\u0010`\u001a\u00020_\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u00103\u001a\u00020.\u0012\u0006\u0010m\u001a\u00020H\u0012\u0006\u0010a\u001a\u00020\u000b\u0012\u0006\u0010b\u001a\u00020\u000b\u0012\u0006\u0010c\u001a\u00020\t¢\u0006\u0004\bd\u0010pB!\b\u0010\u0012\u0006\u0010#\u001a\u00020\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u00103\u001a\u00020.¢\u0006\u0004\bd\u0010qJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u001e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002J\u001e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bJ\u000e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ@\u0010'\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0013\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)H\u0096\u0002J\b\u0010-\u001a\u00020\tH\u0016R\u0017\u00103\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u00108\u001a\u0004\u0018\u0001048\u0006¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b6\u00107R\u001a\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010:\u001a\u0004\b>\u0010<R\u001a\u0010\b\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010:\u001a\u0004\b@\u0010<R\u001a\u0010F\u001a\u00020A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER#\u0010M\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020H0G8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010P\u001a\u00020A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010C\u001a\u0004\bO\u0010ER\u001a\u0010S\u001a\u00020A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bQ\u0010C\u001a\u0004\bR\u0010ER#\u0010V\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020H0G8\u0006¢\u0006\f\n\u0004\bT\u0010J\u001a\u0004\bU\u0010LR\u001a\u0010Y\u001a\u00020A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bW\u0010C\u001a\u0004\bX\u0010ER\u001a\u0010\\\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001a\u0010^\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010[\u001a\u0004\b^\u0010]\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006s"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "getPrimaries", "getTransform", "getInverseTransform", "primaries", "transform", "inverseTransform", "", "component", "", "getMinValue", "getMaxValue", "r", "g", "b", "toLinear", SharedPrefsStorage.VERSION_KEY, "fromLinear", "toXyz", "v0", ConfigConstantsKt.CUSTOMERS_API_VERSION, "v2", "", "toXy$ui_graphics_release", "(FFF)J", "toXy", "toZ$ui_graphics_release", "(FFF)F", "toZ", "x", "y", "z", "a", "colorSpace", "Landroidx/compose/ui/graphics/Color;", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "xyzaToColor", "fromXyz", "", "other", "", "equals", GenerateActivationFormCommand.HASH_CODE, "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "d", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "getWhitePoint", "()Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "whitePoint", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "getTransferParameters", "()Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "transferParameters", "h", "[F", "getPrimaries$ui_graphics_release", "()[F", "i", "getTransform$ui_graphics_release", "j", "getInverseTransform$ui_graphics_release", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "k", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "getOetfOrig$ui_graphics_release", "()Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "oetfOrig", "Lkotlin/Function1;", "", "l", "Lkotlin/jvm/functions/Function1;", "getOetf", "()Lkotlin/jvm/functions/Function1;", "oetf", "m", "getOetfFunc$ui_graphics_release", "oetfFunc", "n", "getEotfOrig$ui_graphics_release", "eotfOrig", "o", "getEotf", "eotf", "p", "getEotfFunc$ui_graphics_release", "eotfFunc", "q", "Z", "isWideGamut", "()Z", "isSrgb", "", "name", "min", VDVideoSelfieConfiguration.MAX, "id", "<init>", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;[FLandroidx/compose/ui/graphics/colorspace/DoubleFunction;Landroidx/compose/ui/graphics/colorspace/DoubleFunction;FFLandroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "toXYZ", "(Ljava/lang/String;[FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FF)V", "function", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "gamma", "(Ljava/lang/String;[FD)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;D)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;DFFI)V", "(Landroidx/compose/ui/graphics/colorspace/Rgb;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;)V", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRgb.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1396:1\n25#2,3:1397\n*S KotlinDebug\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n*L\n915#1:1397,3\n*E\n"})
public final class Rgb extends ColorSpace {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final androidx.camera.core.impl.utils.b f15823s = new androidx.camera.core.impl.utils.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WhitePoint whitePoint;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f15825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f15826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final TransferParameters transferParameters;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final float[] primaries;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final float[] transform;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final float[] inverseTransform;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DoubleFunction oetfOrig;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final b f15832l;

    @NotNull
    public final d m;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DoubleFunction eotfOrig;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final a f15834o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final f f15835p;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final boolean isWideGamut;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final boolean isSrgb;

    /* JADX INFO: compiled from: Rgb.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb$Companion;", "", "", "toXYZ", "computePrimaries$ui_graphics_release", "([F)[F", "computePrimaries", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "DoubleIdentity", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static float a(float[] fArr) {
            float f6 = fArr[0];
            float f10 = fArr[1];
            float f11 = fArr[2];
            float f12 = fArr[3];
            float f13 = fArr[4];
            float f14 = fArr[5];
            float fA = androidx.core.graphics.b.a(f6, f14, (((f11 * f14) + ((f10 * f13) + (f6 * f12))) - (f12 * f13)) - (f10 * f11), 0.5f);
            return fA < 0.0f ? -fA : fA;
        }

        public static final WhitePoint access$computeWhitePoint(Companion companion, float[] fArr) {
            companion.getClass();
            float[] fArrMul3x3Float3 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{1.0f, 1.0f, 1.0f});
            float f6 = fArrMul3x3Float3[0];
            float f10 = fArrMul3x3Float3[1];
            float f11 = f6 + f10 + fArrMul3x3Float3[2];
            return new WhitePoint(f6 / f11, f10 / f11);
        }

        public static final float[] access$computeXYZMatrix(Companion companion, float[] fArr, WhitePoint whitePoint) {
            companion.getClass();
            float f6 = fArr[0];
            float f10 = fArr[1];
            float f11 = fArr[2];
            float f12 = fArr[3];
            float f13 = fArr[4];
            float f14 = fArr[5];
            float x4 = whitePoint.getX();
            float y7 = whitePoint.getY();
            float f15 = 1;
            float f16 = (f15 - f6) / f10;
            float f17 = (f15 - f11) / f12;
            float f18 = (f15 - f13) / f14;
            float f19 = (f15 - x4) / y7;
            float f20 = f6 / f10;
            float f21 = x4 / y7;
            float f22 = (f11 / f12) - f20;
            float f23 = f21 - f20;
            float f24 = f17 - f16;
            float f25 = ((f19 - f16) * f22) - (f23 * f24);
            float f26 = (f18 - f16) * f22;
            float f27 = (f13 / f14) - f20;
            float f28 = f25 / (f26 - (f24 * f27));
            float fA = h0.a(f28, f27, f23, f22);
            float f29 = (1.0f - fA) - f28;
            float f30 = f29 / f10;
            float f31 = fA / f12;
            float f32 = f28 / f14;
            return new float[]{f30 * f6, f29, ((1.0f - f6) - f10) * f30, f31 * f11, fA, ((1.0f - f11) - f12) * f31, f32 * f13, f28, ((1.0f - f13) - f14) * f32};
        }

        public static final boolean access$isSrgb(Companion companion, float[] fArr, WhitePoint whitePoint, DoubleFunction doubleFunction, DoubleFunction doubleFunction2, float f6, float f10, int i10) {
            companion.getClass();
            if (i10 == 0) {
                return true;
            }
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if (ColorSpaceKt.compare(fArr, colorSpaces.getSrgbPrimaries$ui_graphics_release()) && ColorSpaceKt.compare(whitePoint, Illuminant.INSTANCE.getD65()) && f6 == 0.0f && f10 == 1.0f) {
                Rgb srgb = colorSpaces.getSrgb();
                for (double d2 = 0.0d; d2 <= 1.0d; d2 += 0.00392156862745098d) {
                    if (Math.abs(doubleFunction.invoke(d2) - srgb.getOetfOrig().invoke(d2)) <= 0.001d) {
                        if (Math.abs(doubleFunction2.invoke(d2) - srgb.getEotfOrig().invoke(d2)) <= 0.001d) {
                        }
                    }
                }
                return true;
            }
            return false;
        }

        public static final boolean access$isWideGamut(Companion companion, float[] fArr, float f6, float f10) {
            companion.getClass();
            float fA = a(fArr);
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if (fA / a(colorSpaces.getNtsc1953Primaries$ui_graphics_release()) > 0.9f) {
                float[] srgbPrimaries$ui_graphics_release = colorSpaces.getSrgbPrimaries$ui_graphics_release();
                float f11 = fArr[0] - srgbPrimaries$ui_graphics_release[0];
                float f12 = fArr[1] - srgbPrimaries$ui_graphics_release[1];
                float[] fArr2 = {f11, f12, fArr[2] - srgbPrimaries$ui_graphics_release[2], fArr[3] - srgbPrimaries$ui_graphics_release[3], fArr[4] - srgbPrimaries$ui_graphics_release[4], fArr[5] - srgbPrimaries$ui_graphics_release[5]};
                if (b(f11, f12, srgbPrimaries$ui_graphics_release[0] - srgbPrimaries$ui_graphics_release[4], srgbPrimaries$ui_graphics_release[1] - srgbPrimaries$ui_graphics_release[5]) >= 0.0f && b(srgbPrimaries$ui_graphics_release[0] - srgbPrimaries$ui_graphics_release[2], srgbPrimaries$ui_graphics_release[1] - srgbPrimaries$ui_graphics_release[3], fArr2[0], fArr2[1]) >= 0.0f && b(fArr2[2], fArr2[3], srgbPrimaries$ui_graphics_release[2] - srgbPrimaries$ui_graphics_release[0], srgbPrimaries$ui_graphics_release[3] - srgbPrimaries$ui_graphics_release[1]) >= 0.0f && b(srgbPrimaries$ui_graphics_release[2] - srgbPrimaries$ui_graphics_release[4], srgbPrimaries$ui_graphics_release[3] - srgbPrimaries$ui_graphics_release[5], fArr2[2], fArr2[3]) >= 0.0f && b(fArr2[4], fArr2[5], srgbPrimaries$ui_graphics_release[4] - srgbPrimaries$ui_graphics_release[2], srgbPrimaries$ui_graphics_release[5] - srgbPrimaries$ui_graphics_release[3]) >= 0.0f && b(srgbPrimaries$ui_graphics_release[4] - srgbPrimaries$ui_graphics_release[0], srgbPrimaries$ui_graphics_release[5] - srgbPrimaries$ui_graphics_release[1], fArr2[4], fArr2[5]) >= 0.0f) {
                    return true;
                }
            }
            return f6 < 0.0f && f10 > 1.0f;
        }

        public static final float[] access$xyPrimaries(Companion companion, float[] fArr) {
            companion.getClass();
            float[] fArr2 = new float[6];
            if (fArr.length == 9) {
                float f6 = fArr[0];
                float f10 = fArr[1];
                float f11 = f6 + f10 + fArr[2];
                fArr2[0] = f6 / f11;
                fArr2[1] = f10 / f11;
                float f12 = fArr[3];
                float f13 = fArr[4];
                float f14 = f12 + f13 + fArr[5];
                fArr2[2] = f12 / f14;
                fArr2[3] = f13 / f14;
                float f15 = fArr[6];
                float f16 = fArr[7];
                float f17 = f15 + f16 + fArr[8];
                fArr2[4] = f15 / f17;
                fArr2[5] = f16 / f17;
            } else {
                ArraysKt___ArraysJvmKt.copyInto$default(fArr, fArr2, 0, 0, 6, 6, (Object) null);
            }
            return fArr2;
        }

        public static float b(float f6, float f10, float f11, float f12) {
            return (f6 * f12) - (f10 * f11);
        }

        @NotNull
        public final float[] computePrimaries$ui_graphics_release(@NotNull float[] toXYZ) {
            Intrinsics.checkNotNullParameter(toXYZ, "toXYZ");
            float[] fArrMul3x3Float3 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{1.0f, 0.0f, 0.0f});
            float[] fArrMul3x3Float4 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{0.0f, 1.0f, 0.0f});
            float[] fArrMul3x3Float5 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{0.0f, 0.0f, 1.0f});
            float f6 = fArrMul3x3Float3[0];
            float f10 = fArrMul3x3Float3[1];
            float f11 = f6 + f10 + fArrMul3x3Float3[2];
            float f12 = fArrMul3x3Float4[0] + fArrMul3x3Float4[1] + fArrMul3x3Float4[2];
            float f13 = fArrMul3x3Float5[0] + fArrMul3x3Float5[1] + fArrMul3x3Float5[2];
            return new float[]{f6 / f11, f10 / f11, fArrMul3x3Float4[0] / f12, fArrMul3x3Float4[1] / f12, fArrMul3x3Float5[0] / f13, fArrMul3x3Float5[1] / f13};
        }
    }

    /* JADX INFO: compiled from: Rgb.kt */
    public static final class a extends Lambda implements Function1<Double, Double> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Double invoke(Double d2) {
            double dDoubleValue = d2.doubleValue();
            Rgb rgb = Rgb.this;
            return Double.valueOf(rgb.getEotfOrig().invoke(c.coerceIn(dDoubleValue, rgb.f15825e, rgb.f15826f)));
        }
    }

    /* JADX INFO: compiled from: Rgb.kt */
    public static final class b extends Lambda implements Function1<Double, Double> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Double invoke(Double d2) {
            double dDoubleValue = d2.doubleValue();
            Rgb rgb = Rgb.this;
            return Double.valueOf(c.coerceIn(rgb.getOetfOrig().invoke(dDoubleValue), rgb.f15825e, rgb.f15826f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rgb(@NotNull String name, @NotNull float[] primaries, @NotNull WhitePoint whitePoint, @Nullable float[] fArr, @NotNull DoubleFunction oetf, @NotNull DoubleFunction eotf, float f6, float f10, @Nullable TransferParameters transferParameters, int i10) {
        super(name, ColorModel.INSTANCE.m2868getRgbxdoWZVw(), i10, null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(oetf, "oetf");
        Intrinsics.checkNotNullParameter(eotf, "eotf");
        this.whitePoint = whitePoint;
        this.f15825e = f6;
        this.f15826f = f10;
        this.transferParameters = transferParameters;
        this.oetfOrig = oetf;
        this.f15832l = new b();
        this.m = new d(this);
        this.eotfOrig = eotf;
        this.f15834o = new a();
        this.f15835p = new f(this);
        if (primaries.length != 6 && primaries.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f6 >= f10) {
            throw new IllegalArgumentException("Invalid range: min=" + f6 + ", max=" + f10 + "; min must be strictly < max");
        }
        Companion companion = INSTANCE;
        float[] fArrAccess$xyPrimaries = Companion.access$xyPrimaries(companion, primaries);
        this.primaries = fArrAccess$xyPrimaries;
        if (fArr == null) {
            this.transform = Companion.access$computeXYZMatrix(companion, fArrAccess$xyPrimaries, whitePoint);
        } else {
            if (fArr.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr.length);
            }
            this.transform = fArr;
        }
        this.inverseTransform = ColorSpaceKt.inverse3x3(this.transform);
        this.isWideGamut = Companion.access$isWideGamut(companion, fArrAccess$xyPrimaries, f6, f10);
        this.isSrgb = Companion.access$isSrgb(companion, fArrAccess$xyPrimaries, whitePoint, oetf, eotf, f6, f10, i10);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || Rgb.class != other.getClass() || !super.equals(other)) {
            return false;
        }
        Rgb rgb = (Rgb) other;
        if (Float.compare(rgb.f15825e, this.f15825e) != 0 || Float.compare(rgb.f15826f, this.f15826f) != 0 || !Intrinsics.areEqual(this.whitePoint, rgb.whitePoint) || !Arrays.equals(this.primaries, rgb.primaries)) {
            return false;
        }
        TransferParameters transferParameters = rgb.transferParameters;
        TransferParameters transferParameters2 = this.transferParameters;
        if (transferParameters2 != null) {
            return Intrinsics.areEqual(transferParameters2, transferParameters);
        }
        if (transferParameters == null) {
            return true;
        }
        if (Intrinsics.areEqual(this.oetfOrig, rgb.oetfOrig)) {
            return Intrinsics.areEqual(this.eotfOrig, rgb.eotfOrig);
        }
        return false;
    }

    @NotNull
    public final float[] fromLinear(float r3, float g6, float b10) {
        return fromLinear(new float[]{r3, g6, b10});
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] fromXyz(@NotNull float[] v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        ColorSpaceKt.mul3x3Float3(this.inverseTransform, v3);
        double d2 = v3[0];
        d dVar = this.m;
        v3[0] = (float) dVar.invoke(d2);
        v3[1] = (float) dVar.invoke(v3[1]);
        v3[2] = (float) dVar.invoke(v3[2]);
        return v3;
    }

    @NotNull
    public final Function1<Double, Double> getEotf() {
        return this.f15834o;
    }

    @NotNull
    public final DoubleFunction getEotfFunc$ui_graphics_release() {
        return this.f15835p;
    }

    @NotNull
    /* JADX INFO: renamed from: getEotfOrig$ui_graphics_release, reason: from getter */
    public final DoubleFunction getEotfOrig() {
        return this.eotfOrig;
    }

    @NotNull
    public final float[] getInverseTransform() {
        float[] fArr = this.inverseTransform;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    @NotNull
    /* JADX INFO: renamed from: getInverseTransform$ui_graphics_release, reason: from getter */
    public final float[] getInverseTransform() {
        return this.inverseTransform;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int component) {
        return this.f15826f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int component) {
        return this.f15825e;
    }

    @NotNull
    public final Function1<Double, Double> getOetf() {
        return this.f15832l;
    }

    @NotNull
    public final DoubleFunction getOetfFunc$ui_graphics_release() {
        return this.m;
    }

    @NotNull
    /* JADX INFO: renamed from: getOetfOrig$ui_graphics_release, reason: from getter */
    public final DoubleFunction getOetfOrig() {
        return this.oetfOrig;
    }

    @NotNull
    public final float[] getPrimaries() {
        float[] fArr = this.primaries;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    @NotNull
    /* JADX INFO: renamed from: getPrimaries$ui_graphics_release, reason: from getter */
    public final float[] getPrimaries() {
        return this.primaries;
    }

    @Nullable
    public final TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    @NotNull
    public final float[] getTransform() {
        float[] fArr = this.transform;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    @NotNull
    /* JADX INFO: renamed from: getTransform$ui_graphics_release, reason: from getter */
    public final float[] getTransform() {
        return this.transform;
    }

    @NotNull
    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public int hashCode() {
        int iHashCode = (Arrays.hashCode(this.primaries) + ((this.whitePoint.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f6 = this.f15825e;
        int iFloatToIntBits = (iHashCode + (f6 == 0.0f ? 0 : Float.floatToIntBits(f6))) * 31;
        float f10 = this.f15826f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f10 == 0.0f ? 0 : Float.floatToIntBits(f10))) * 31;
        TransferParameters transferParameters = this.transferParameters;
        int iHashCode2 = iFloatToIntBits2 + (transferParameters != null ? transferParameters.hashCode() : 0);
        if (transferParameters == null) {
            return this.eotfOrig.hashCode() + ((this.oetfOrig.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: isSrgb, reason: from getter */
    public boolean getIsSrgb() {
        return this.isSrgb;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: isWideGamut, reason: from getter */
    public boolean getIsWideGamut() {
        return this.isWideGamut;
    }

    @NotNull
    public final float[] toLinear(float r3, float g6, float b10) {
        return toLinear(new float[]{r3, g6, b10});
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float v0, float v3, float v6) {
        double d2 = v0;
        f fVar = this.f15835p;
        float fInvoke = (float) fVar.invoke(d2);
        float fInvoke2 = (float) fVar.invoke(v3);
        float fInvoke3 = (float) fVar.invoke(v6);
        float[] fArr = this.transform;
        return (((long) Float.floatToIntBits(ColorSpaceKt.mul3x3Float3_0(fArr, fInvoke, fInvoke2, fInvoke3))) << 32) | (((long) Float.floatToIntBits(ColorSpaceKt.mul3x3Float3_1(fArr, fInvoke, fInvoke2, fInvoke3))) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] toXyz(@NotNull float[] v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        double d2 = v3[0];
        f fVar = this.f15835p;
        v3[0] = (float) fVar.invoke(d2);
        v3[1] = (float) fVar.invoke(v3[1]);
        v3[2] = (float) fVar.invoke(v3[2]);
        return ColorSpaceKt.mul3x3Float3(this.transform, v3);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float v0, float v3, float v6) {
        double d2 = v0;
        f fVar = this.f15835p;
        return ColorSpaceKt.mul3x3Float3_2(this.transform, (float) fVar.invoke(d2), (float) fVar.invoke(v3), (float) fVar.invoke(v6));
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo2871xyzaToColorJlNiLsg$ui_graphics_release(float x4, float y7, float z10, float a10, @NotNull ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        float[] fArr = this.inverseTransform;
        float fMul3x3Float3_0 = ColorSpaceKt.mul3x3Float3_0(fArr, x4, y7, z10);
        float fMul3x3Float3_1 = ColorSpaceKt.mul3x3Float3_1(fArr, x4, y7, z10);
        float fMul3x3Float3_2 = ColorSpaceKt.mul3x3Float3_2(fArr, x4, y7, z10);
        d dVar = this.m;
        return ColorKt.Color((float) dVar.invoke(fMul3x3Float3_0), (float) dVar.invoke(fMul3x3Float3_1), (float) dVar.invoke(fMul3x3Float3_2), a10, colorSpace);
    }

    @NotNull
    public final float[] fromLinear(@NotNull float[] v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        double d2 = v3[0];
        d dVar = this.m;
        v3[0] = (float) dVar.invoke(d2);
        v3[1] = (float) dVar.invoke(v3[1]);
        v3[2] = (float) dVar.invoke(v3[2]);
        return v3;
    }

    @NotNull
    public final float[] getInverseTransform(@NotNull float[] inverseTransform) {
        Intrinsics.checkNotNullParameter(inverseTransform, "inverseTransform");
        return ArraysKt___ArraysJvmKt.copyInto$default(this.inverseTransform, inverseTransform, 0, 0, 0, 14, (Object) null);
    }

    @NotNull
    public final float[] getPrimaries(@NotNull float[] primaries) {
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        return ArraysKt___ArraysJvmKt.copyInto$default(this.primaries, primaries, 0, 0, 0, 14, (Object) null);
    }

    @NotNull
    public final float[] getTransform(@NotNull float[] transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        return ArraysKt___ArraysJvmKt.copyInto$default(this.transform, transform, 0, 0, 0, 14, (Object) null);
    }

    @NotNull
    public final float[] toLinear(@NotNull float[] v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        double d2 = v3[0];
        f fVar = this.f15835p;
        v3[0] = (float) fVar.invoke(d2);
        v3[1] = (float) fVar.invoke(v3[1]);
        v3[2] = (float) fVar.invoke(v3[2]);
        return v3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(@NotNull String name, @NotNull float[] toXYZ, @NotNull Function1<? super Double, Double> oetf, @NotNull Function1<? super Double, Double> eotf) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(toXYZ, "toXYZ");
        Intrinsics.checkNotNullParameter(oetf, "oetf");
        Intrinsics.checkNotNullParameter(eotf, "eotf");
        Companion companion = INSTANCE;
        this(name, companion.computePrimaries$ui_graphics_release(toXYZ), Companion.access$computeWhitePoint(companion, toXYZ), null, new androidx.camera.camera2.interop.c(oetf), new androidx.camera.camera2.interop.d(eotf), 0.0f, 1.0f, null, -1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@NotNull String name, @NotNull float[] primaries, @NotNull WhitePoint whitePoint, @NotNull Function1<? super Double, Double> oetf, @NotNull Function1<? super Double, Double> eotf, float f6, float f10) {
        this(name, primaries, whitePoint, null, new z0.c(oetf), new y(eotf), f6, f10, null, -1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(oetf, "oetf");
        Intrinsics.checkNotNullParameter(eotf, "eotf");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(@NotNull String name, @NotNull float[] toXYZ, @NotNull TransferParameters function) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(toXYZ, "toXYZ");
        Intrinsics.checkNotNullParameter(function, "function");
        Companion companion = INSTANCE;
        this(name, companion.computePrimaries$ui_graphics_release(toXYZ), Companion.access$computeWhitePoint(companion, toXYZ), function, -1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@NotNull String name, @NotNull float[] primaries, @NotNull WhitePoint whitePoint, @NotNull TransferParameters function) {
        this(name, primaries, whitePoint, function, -1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(function, "function");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@NotNull String name, @NotNull float[] primaries, @NotNull WhitePoint whitePoint, @NotNull TransferParameters function, int i10) {
        this(name, primaries, whitePoint, null, (function.getE() == 0.0d && function.getF() == 0.0d) ? new j.a(function) : new k(function), (function.getE() == 0.0d && function.getF() == 0.0d) ? new k.a(function) : new e(function), 0.0f, 1.0f, function, i10);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(function, "function");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(@NotNull String name, @NotNull float[] toXYZ, double d2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(toXYZ, "toXYZ");
        Companion companion = INSTANCE;
        this(name, companion.computePrimaries$ui_graphics_release(toXYZ), Companion.access$computeWhitePoint(companion, toXYZ), d2, 0.0f, 1.0f, -1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@NotNull String name, @NotNull float[] primaries, @NotNull WhitePoint whitePoint, double d2) {
        this(name, primaries, whitePoint, d2, 0.0f, 1.0f, -1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(@NotNull String name, @NotNull float[] primaries, @NotNull WhitePoint whitePoint, final double d2, float f6, float f10, int i10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        androidx.camera.core.impl.utils.b bVar = f15823s;
        this(name, primaries, whitePoint, null, d2 == 1.0d ? bVar : new DoubleFunction() { // from class: z0.f
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d3) {
                Rgb.Companion companion = Rgb.INSTANCE;
                if (d3 < 0.0d) {
                    d3 = 0.0d;
                }
                return Math.pow(d3, 1.0d / d2);
            }
        }, d2 == 1.0d ? bVar : new DoubleFunction() { // from class: z0.g
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d3) {
                Rgb.Companion companion = Rgb.INSTANCE;
                if (d3 < 0.0d) {
                    d3 = 0.0d;
                }
                return Math.pow(d3, d2);
            }
        }, f6, f10, new TransferParameters(d2, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@NotNull Rgb colorSpace, @NotNull float[] transform, @NotNull WhitePoint whitePoint) {
        this(colorSpace.getName(), colorSpace.primaries, whitePoint, transform, colorSpace.oetfOrig, colorSpace.eotfOrig, colorSpace.f15825e, colorSpace.f15826f, colorSpace.transferParameters, -1);
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
    }
}
