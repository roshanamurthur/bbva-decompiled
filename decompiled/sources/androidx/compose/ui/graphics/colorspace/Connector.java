package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Connector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000 !2\u00020\u0001:\u0002!\"B>\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u001b\u001a\u00020\u000e\u0012\u0006\u0010\u001c\u001a\u00020\u000e\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006ø\u0001\u0002¢\u0006\u0004\b\u001d\u0010\u001eB$\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u001f\u001a\u00020\u0015ø\u0001\u0002¢\u0006\u0004\b\u001d\u0010 J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J8\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R \u0010\u001a\u001a\u00020\u00158\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006#"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector;", "", "", "r", "g", "b", "", "transform", SharedPrefsStorage.VERSION_KEY, "a", "Landroidx/compose/ui/graphics/Color;", "transformToColor-wmQWz5c$ui_graphics_release", "(FFFF)J", "transformToColor", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getSource", "()Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "source", "getDestination", "destination", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "e", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getRenderIntent-uksYyKA", "()I", "renderIntent", "transformSource", "transformDestination", "<init>", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I[FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "intent", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "RgbConnector", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,339:1\n34#2:340\n41#2:341\n*S KotlinDebug\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector\n*L\n162#1:340\n163#1:341\n*E\n"})
public class Connector {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Connector f15792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Connector f15793h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Connector f15794i;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ColorSpace source;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ColorSpace destination;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ColorSpace f15797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ColorSpace f15798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int renderIntent;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final float[] f15800f;

    /* JADX INFO: compiled from: Connector.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector$Companion;", "", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "source", "Landroidx/compose/ui/graphics/colorspace/Connector;", "identity$ui_graphics_release", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroidx/compose/ui/graphics/colorspace/Connector;", "identity", "SrgbIdentity", "Landroidx/compose/ui/graphics/colorspace/Connector;", "getSrgbIdentity$ui_graphics_release", "()Landroidx/compose/ui/graphics/colorspace/Connector;", "SrgbToOklabPerceptual", "getSrgbToOklabPerceptual$ui_graphics_release", "OklabToSrgbPerceptual", "getOklabToSrgbPerceptual$ui_graphics_release", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: access$computeTransform-YBCOT_4, reason: not valid java name */
        public static final float[] m2876access$computeTransformYBCOT_4(Companion companion, ColorSpace colorSpace, ColorSpace colorSpace2, int i10) {
            companion.getClass();
            if (!RenderIntent.m2880equalsimpl0(i10, RenderIntent.INSTANCE.m2884getAbsoluteuksYyKA())) {
                return null;
            }
            long model = colorSpace.getModel();
            ColorModel.Companion companion2 = ColorModel.INSTANCE;
            boolean zM2861equalsimpl0 = ColorModel.m2861equalsimpl0(model, companion2.m2868getRgbxdoWZVw());
            boolean zM2861equalsimpl1 = ColorModel.m2861equalsimpl0(colorSpace2.getModel(), companion2.m2868getRgbxdoWZVw());
            if (zM2861equalsimpl0 && zM2861equalsimpl1) {
                return null;
            }
            if (!zM2861equalsimpl0 && !zM2861equalsimpl1) {
                return null;
            }
            if (!zM2861equalsimpl0) {
                colorSpace = colorSpace2;
            }
            Intrinsics.checkNotNull(colorSpace, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            Rgb rgb = (Rgb) colorSpace;
            float[] xyz$ui_graphics_release = zM2861equalsimpl0 ? rgb.getWhitePoint().toXyz$ui_graphics_release() : Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
            float[] xyz$ui_graphics_release2 = zM2861equalsimpl1 ? rgb.getWhitePoint().toXyz$ui_graphics_release() : Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
            return new float[]{xyz$ui_graphics_release[0] / xyz$ui_graphics_release2[0], xyz$ui_graphics_release[1] / xyz$ui_graphics_release2[1], xyz$ui_graphics_release[2] / xyz$ui_graphics_release2[2]};
        }

        @NotNull
        public final Connector getOklabToSrgbPerceptual$ui_graphics_release() {
            return Connector.f15794i;
        }

        @NotNull
        public final Connector getSrgbIdentity$ui_graphics_release() {
            return Connector.f15792g;
        }

        @NotNull
        public final Connector getSrgbToOklabPerceptual$ui_graphics_release() {
            return Connector.f15793h;
        }

        @NotNull
        public final Connector identity$ui_graphics_release(@NotNull ColorSpace source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new Connector$Companion$identity$1(source, source, RenderIntent.INSTANCE.m2886getRelativeuksYyKA(), null);
        }
    }

    /* JADX INFO: compiled from: Connector.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B$\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J8\u0010\r\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector$RgbConnector;", "Landroidx/compose/ui/graphics/colorspace/Connector;", "", SharedPrefsStorage.VERSION_KEY, "transform", "", "r", "g", "b", "a", "Landroidx/compose/ui/graphics/Color;", "transformToColor-wmQWz5c$ui_graphics_release", "(FFFF)J", "transformToColor", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "mSource", "mDestination", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "intent", "<init>", "(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    public static final class RgbConnector extends Connector {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public final Rgb f15801j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public final Rgb f15802k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        public final float[] f15803l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RgbConnector(Rgb mSource, Rgb mDestination, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            float[] fArrMul3x3;
            super(mSource, mDestination, mSource, mDestination, i10, null, null);
            Intrinsics.checkNotNullParameter(mSource, "mSource");
            Intrinsics.checkNotNullParameter(mDestination, "mDestination");
            this.f15801j = mSource;
            this.f15802k = mDestination;
            if (ColorSpaceKt.compare(mSource.getWhitePoint(), mDestination.getWhitePoint())) {
                fArrMul3x3 = ColorSpaceKt.mul3x3(mDestination.getInverseTransform(), mSource.getTransform());
            } else {
                float[] transform = mSource.getTransform();
                float[] inverseTransform = mDestination.getInverseTransform();
                float[] xyz$ui_graphics_release = mSource.getWhitePoint().toXyz$ui_graphics_release();
                float[] xyz$ui_graphics_release2 = mDestination.getWhitePoint().toXyz$ui_graphics_release();
                WhitePoint whitePoint = mSource.getWhitePoint();
                Illuminant illuminant = Illuminant.INSTANCE;
                if (!ColorSpaceKt.compare(whitePoint, illuminant.getD50())) {
                    float[] transform2 = Adaptation.INSTANCE.getBradford().getTransform();
                    float[] d50Xyz$ui_graphics_release = illuminant.getD50Xyz$ui_graphics_release();
                    float[] fArrCopyOf = Arrays.copyOf(d50Xyz$ui_graphics_release, d50Xyz$ui_graphics_release.length);
                    Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, size)");
                    transform = ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(transform2, xyz$ui_graphics_release, fArrCopyOf), mSource.getTransform());
                }
                if (!ColorSpaceKt.compare(mDestination.getWhitePoint(), illuminant.getD50())) {
                    float[] transform3 = Adaptation.INSTANCE.getBradford().getTransform();
                    float[] d50Xyz$ui_graphics_release2 = illuminant.getD50Xyz$ui_graphics_release();
                    float[] fArrCopyOf2 = Arrays.copyOf(d50Xyz$ui_graphics_release2, d50Xyz$ui_graphics_release2.length);
                    Intrinsics.checkNotNullExpressionValue(fArrCopyOf2, "copyOf(this, size)");
                    inverseTransform = ColorSpaceKt.inverse3x3(ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(transform3, xyz$ui_graphics_release2, fArrCopyOf2), mDestination.getTransform()));
                }
                fArrMul3x3 = ColorSpaceKt.mul3x3(inverseTransform, RenderIntent.m2880equalsimpl0(i10, RenderIntent.INSTANCE.m2884getAbsoluteuksYyKA()) ? ColorSpaceKt.mul3x3Diag(new float[]{xyz$ui_graphics_release[0] / xyz$ui_graphics_release2[0], xyz$ui_graphics_release[1] / xyz$ui_graphics_release2[1], xyz$ui_graphics_release[2] / xyz$ui_graphics_release2[2]}, transform) : transform);
            }
            this.f15803l = fArrMul3x3;
        }

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        @NotNull
        public float[] transform(@NotNull float[] v3) {
            Intrinsics.checkNotNullParameter(v3, "v");
            Rgb rgb = this.f15801j;
            v3[0] = (float) rgb.getEotfFunc$ui_graphics_release().invoke(v3[0]);
            v3[1] = (float) rgb.getEotfFunc$ui_graphics_release().invoke(v3[1]);
            v3[2] = (float) rgb.getEotfFunc$ui_graphics_release().invoke(v3[2]);
            ColorSpaceKt.mul3x3Float3(this.f15803l, v3);
            Rgb rgb2 = this.f15802k;
            v3[0] = (float) rgb2.getOetfFunc$ui_graphics_release().invoke(v3[0]);
            v3[1] = (float) rgb2.getOetfFunc$ui_graphics_release().invoke(v3[1]);
            v3[2] = (float) rgb2.getOetfFunc$ui_graphics_release().invoke(v3[2]);
            return v3;
        }

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        /* JADX INFO: renamed from: transformToColor-wmQWz5c$ui_graphics_release */
        public long mo2875transformToColorwmQWz5c$ui_graphics_release(float r3, float g6, float b10, float a10) {
            Rgb rgb = this.f15801j;
            float fInvoke = (float) rgb.getEotfFunc$ui_graphics_release().invoke(r3);
            float fInvoke2 = (float) rgb.getEotfFunc$ui_graphics_release().invoke(g6);
            float fInvoke3 = (float) rgb.getEotfFunc$ui_graphics_release().invoke(b10);
            float[] fArr = this.f15803l;
            float fMul3x3Float3_0 = ColorSpaceKt.mul3x3Float3_0(fArr, fInvoke, fInvoke2, fInvoke3);
            float fMul3x3Float3_1 = ColorSpaceKt.mul3x3Float3_1(fArr, fInvoke, fInvoke2, fInvoke3);
            float fMul3x3Float3_2 = ColorSpaceKt.mul3x3Float3_2(fArr, fInvoke, fInvoke2, fInvoke3);
            Rgb rgb2 = this.f15802k;
            return ColorKt.Color((float) rgb2.getOetfFunc$ui_graphics_release().invoke(fMul3x3Float3_0), (float) rgb2.getOetfFunc$ui_graphics_release().invoke(fMul3x3Float3_1), (float) rgb2.getOetfFunc$ui_graphics_release().invoke(fMul3x3Float3_2), a10, rgb2);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        f15792g = companion.identity$ui_graphics_release(colorSpaces.getSrgb());
        Rgb srgb = colorSpaces.getSrgb();
        ColorSpace oklab = colorSpaces.getOklab();
        RenderIntent.Companion companion2 = RenderIntent.INSTANCE;
        f15793h = new Connector(srgb, oklab, companion2.m2885getPerceptualuksYyKA(), null);
        f15794i = new Connector(colorSpaces.getOklab(), colorSpaces.getSrgb(), companion2.m2885getPerceptualuksYyKA(), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Connector(ColorSpace source, ColorSpace destination, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        long model = source.getModel();
        ColorModel.Companion companion = ColorModel.INSTANCE;
        this(source, destination, ColorModel.m2861equalsimpl0(model, companion.m2868getRgbxdoWZVw()) ? ColorSpaceKt.adapt$default(source, Illuminant.INSTANCE.getD50(), null, 2, null) : source, ColorModel.m2861equalsimpl0(destination.getModel(), companion.m2868getRgbxdoWZVw()) ? ColorSpaceKt.adapt$default(destination, Illuminant.INSTANCE.getD50(), null, 2, null) : destination, i10, Companion.m2876access$computeTransformYBCOT_4(INSTANCE, source, destination, i10), null);
    }

    @NotNull
    public final ColorSpace getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: getRenderIntent-uksYyKA, reason: not valid java name and from getter */
    public final int getRenderIntent() {
        return this.renderIntent;
    }

    @NotNull
    public final ColorSpace getSource() {
        return this.source;
    }

    @NotNull
    public final float[] transform(float r3, float g6, float b10) {
        return transform(new float[]{r3, g6, b10});
    }

    /* JADX INFO: renamed from: transformToColor-wmQWz5c$ui_graphics_release, reason: not valid java name */
    public long mo2875transformToColorwmQWz5c$ui_graphics_release(float r3, float g6, float b10, float a10) {
        ColorSpace colorSpace = this.f15797c;
        long xy$ui_graphics_release = colorSpace.toXy$ui_graphics_release(r3, g6, b10);
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (xy$ui_graphics_release >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (xy$ui_graphics_release & 4294967295L));
        float z$ui_graphics_release = colorSpace.toZ$ui_graphics_release(r3, g6, b10);
        float[] fArr = this.f15800f;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            z$ui_graphics_release *= fArr[2];
        }
        float f6 = fIntBitsToFloat2;
        float f10 = fIntBitsToFloat;
        return this.f15798d.mo2871xyzaToColorJlNiLsg$ui_graphics_release(f10, f6, z$ui_graphics_release, a10, this.destination);
    }

    @NotNull
    public float[] transform(@NotNull float[] v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        float[] xyz = this.f15797c.toXyz(v3);
        float[] fArr = this.f15800f;
        if (fArr != null) {
            xyz[0] = xyz[0] * fArr[0];
            xyz[1] = xyz[1] * fArr[1];
            xyz[2] = xyz[2] * fArr[2];
        }
        return this.f15798d.fromXyz(xyz);
    }

    public Connector(ColorSpace source, ColorSpace destination, ColorSpace transformSource, ColorSpace transformDestination, int i10, float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transformSource, "transformSource");
        Intrinsics.checkNotNullParameter(transformDestination, "transformDestination");
        this.source = source;
        this.destination = destination;
        this.f15797c = transformSource;
        this.f15798d = transformDestination;
        this.renderIntent = i10;
        this.f15800f = fArr;
    }
}
