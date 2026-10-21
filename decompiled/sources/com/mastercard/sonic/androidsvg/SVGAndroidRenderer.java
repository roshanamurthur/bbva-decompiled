package com.mastercard.sonic.androidsvg;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Log;
import androidx.camera.camera2.internal.compat.u;
import androidx.core.view.ViewCompat;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.esotericsoftware.asm.Opcodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SVGAndroidRenderer.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u000b\u001a\u001b\t\u001c\u001d\u001e\u001f !\"#B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0011\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006$"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVGAndroidRenderer;", "", "Lcom/mastercard/sonic/androidsvg/SVG;", "document", "Lcom/mastercard/sonic/androidsvg/RenderOptions;", "renderOptions", "", "renderDocument", "", "b", "F", "getDpi", "()F", "dpi", "getCurrentFontSize", "currentFontSize", "getCurrentFontXHeight", "currentFontXHeight", "Lcom/mastercard/sonic/androidsvg/SVG$Box;", "getCurrentViewPortInUserUnits", "()Lcom/mastercard/sonic/androidsvg/SVG$Box;", "currentViewPortInUserUnits", "Landroid/graphics/Canvas;", "canvas", "<init>", "(Landroid/graphics/Canvas;F)V", "Companion", "a", "PathConverter", "c", "d", "e", "f", "g", "h", "i", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final class SVGAndroidRenderer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final float LUMINANCE_TO_ALPHA_BLUE = 0.0722f;
    public static final float LUMINANCE_TO_ALPHA_GREEN = 0.7151f;
    public static final float LUMINANCE_TO_ALPHA_RED = 0.2127f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static HashSet<String> f51331i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Canvas f51332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float dpi;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public SVG f51334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public f f51335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Stack<f> f51336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Stack<SVG.SvgContainer> f51337f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Stack<Matrix> f51338g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public CSSParser.RuleMatchContext f51339h;

    /* JADX INFO: compiled from: SVGAndroidRenderer.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R \u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVGAndroidRenderer$Companion;", "", "", "BEZIER_ARC_FACTOR", "F", "", "DEFAULT_FONT_FAMILY", "Ljava/lang/String;", "LUMINANCE_TO_ALPHA_BLUE", "LUMINANCE_TO_ALPHA_GREEN", "LUMINANCE_TO_ALPHA_RED", "TAG", "Ljava/util/HashSet;", "supportedFeatures", "Ljava/util/HashSet;", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final void access$arcTo(Companion companion, float f6, float f10, float f11, float f12, float f13, boolean z10, boolean z11, float f14, float f15, SVG.PathInterface pathInterface) {
            companion.getClass();
            if (f6 == f14 && f10 == f15) {
                return;
            }
            if (f11 == 0.0f || f12 == 0.0f) {
                pathInterface.lineTo(f14, f15);
                return;
            }
            float fAbs = Math.abs(f11);
            float fAbs2 = Math.abs(f12);
            double radians = Math.toRadians(((double) f13) % 360.0d);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d2 = ((double) (f6 - f14)) / 2.0d;
            double d3 = ((double) (f10 - f15)) / 2.0d;
            double d7 = (dSin * d3) + (dCos * d2);
            double d10 = (d3 * dCos) + ((-dSin) * d2);
            double d11 = fAbs;
            double d12 = d11 * d11;
            double d13 = fAbs2;
            double d14 = d13 * d13;
            double d15 = d7 * d7;
            double d16 = d10 * d10;
            double d17 = (d16 / d14) + (d15 / d12);
            if (d17 > 0.99999d) {
                double dSqrt = Math.sqrt(d17) * 1.00001d;
                float f16 = (float) (d11 * dSqrt);
                fAbs2 = (float) (dSqrt * d13);
                double d18 = f16;
                d12 = d18 * d18;
                double d19 = fAbs2;
                d14 = d19 * d19;
                fAbs = f16;
            }
            double d20 = d12 * d14;
            double d21 = d12 * d16;
            double d22 = d14 * d15;
            double d23 = ((d20 - d21) - d22) / (d21 + d22);
            double dSqrt2 = Math.sqrt(((Double) (d23 < 0.0d ? 0 : Double.valueOf(d23))).doubleValue()) * ((Double) (z10 == z11 ? -1 : Double.valueOf(1.0d))).doubleValue();
            double d24 = fAbs;
            double d25 = fAbs2;
            double d26 = ((d24 * d10) / d25) * dSqrt2;
            float f17 = fAbs;
            float f18 = fAbs2;
            double d27 = dSqrt2 * (-((d25 * d7) / d24));
            double d28 = ((dCos * d26) - (dSin * d27)) + (((double) (f6 + f14)) / 2.0d);
            double d29 = (dCos * d27) + (dSin * d26) + (((double) (f10 + f15)) / 2.0d);
            double d30 = (d7 - d26) / d24;
            double d31 = (d10 - d27) / d25;
            double d32 = ((-d7) - d26) / d24;
            double d33 = ((-d10) - d27) / d25;
            double d34 = (d31 * d31) + (d30 * d30);
            double dAcos = Math.acos(d30 / Math.sqrt(d34)) * (d31 < 0.0d ? -1.0d : 1.0d);
            double dSqrt3 = Math.sqrt(((d33 * d33) + (d32 * d32)) * d34);
            double d35 = (d31 * d33) + (d30 * d32);
            double d36 = d35 / dSqrt3;
            double dDoubleValue = ((Double) (d36 < -1.0d ? Double.valueOf(3.141592653589793d) : d36 > 1.0d ? 0 : Double.valueOf(Math.acos(d36)))).doubleValue() * ((d30 * d33) - (d31 * d32) < 0.0d ? -1.0d : 1.0d);
            if (dDoubleValue == 0.0d) {
                pathInterface.lineTo(f14, f15);
                return;
            }
            if (!z11 && dDoubleValue > 0.0d) {
                dDoubleValue -= 6.283185307179586d;
            } else if (z11 && dDoubleValue < 0.0d) {
                dDoubleValue += 6.283185307179586d;
            }
            double d37 = dDoubleValue % 6.283185307179586d;
            double d38 = dAcos % 6.283185307179586d;
            int iCeil = (int) Math.ceil((Math.abs(d37) * 2.0d) / 3.141592653589793d);
            double d39 = d37 / ((double) iCeil);
            double d40 = d39 / 2.0d;
            double dSin2 = (Math.sin(d40) * 1.3333333333333333d) / (Math.cos(d40) + 1.0d);
            int i10 = iCeil * 6;
            float[] fArr = new float[i10];
            int i11 = 0;
            int i12 = 0;
            while (i11 < iCeil) {
                double d41 = (((double) i11) * d39) + d38;
                double dCos2 = Math.cos(d41);
                double dSin3 = Math.sin(d41);
                fArr[i12] = (float) (dCos2 - (dSin2 * dSin3));
                int i13 = iCeil;
                fArr[i12 + 1] = (float) ((dCos2 * dSin2) + dSin3);
                double d42 = d41 + d39;
                double dCos3 = Math.cos(d42);
                double dSin4 = Math.sin(d42);
                double d43 = d39;
                fArr[i12 + 2] = (float) ((dSin2 * dSin4) + dCos3);
                fArr[i12 + 3] = (float) (dSin4 - (dSin2 * dCos3));
                int i14 = i12 + 5;
                fArr[i12 + 4] = (float) dCos3;
                i12 += 6;
                fArr[i14] = (float) dSin4;
                i11++;
                d39 = d43;
                i10 = i10;
                iCeil = i13;
                d38 = d38;
            }
            int i15 = i10;
            Matrix matrix = new Matrix();
            matrix.postScale(f17, f18);
            matrix.postRotate(f13);
            matrix.postTranslate((float) d28, (float) d29);
            matrix.mapPoints(fArr);
            fArr[i15 - 2] = f14;
            fArr[i15 - 1] = f15;
            for (int i16 = 0; i16 < i15; i16 += 6) {
                pathInterface.cubicTo(fArr[i16], fArr[i16 + 1], fArr[i16 + 2], fArr[i16 + 3], fArr[i16 + 4], fArr[i16 + 5]);
            }
        }

        public static final int access$clamp255(Companion companion, float f6) {
            companion.getClass();
            int i10 = (int) (f6 * 256.0f);
            if (i10 < 0) {
                return 0;
            }
            if (i10 > 255) {
                return 255;
            }
            return i10;
        }

        public static final int access$colourWithOpacity(Companion companion, int i10, float f6) {
            companion.getClass();
            int i11 = 255;
            int iRound = Math.round(((i10 >> 24) & 255) * f6);
            if (iRound < 0) {
                i11 = 0;
            } else if (iRound <= 255) {
                i11 = iRound;
            }
            return (i11 << 24) | (i10 & ViewCompat.MEASURED_SIZE_MASK);
        }

        public static final void access$error(Companion companion, String str, Object... objArr) {
            companion.getClass();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)), "format(format, *args)");
        }

        public static final void access$initialiseSupportedFeaturesMap(Companion companion) {
            synchronized (companion) {
                SVGAndroidRenderer.f51331i = new HashSet();
                HashSet hashSet = SVGAndroidRenderer.f51331i;
                Intrinsics.checkNotNull(hashSet);
                hashSet.add("Structure");
                HashSet hashSet2 = SVGAndroidRenderer.f51331i;
                Intrinsics.checkNotNull(hashSet2);
                hashSet2.add("BasicStructure");
                HashSet hashSet3 = SVGAndroidRenderer.f51331i;
                Intrinsics.checkNotNull(hashSet3);
                hashSet3.add("ConditionalProcessing");
                HashSet hashSet4 = SVGAndroidRenderer.f51331i;
                Intrinsics.checkNotNull(hashSet4);
                hashSet4.add("Image");
                HashSet hashSet5 = SVGAndroidRenderer.f51331i;
                Intrinsics.checkNotNull(hashSet5);
                hashSet5.add("Style");
                HashSet hashSet6 = SVGAndroidRenderer.f51331i;
                Intrinsics.checkNotNull(hashSet6);
                hashSet6.add("ViewportAttribute");
                HashSet hashSet7 = SVGAndroidRenderer.f51331i;
                Intrinsics.checkNotNull(hashSet7);
                hashSet7.add("Shape");
                HashSet hashSet8 = SVGAndroidRenderer.f51331i;
                Intrinsics.checkNotNull(hashSet8);
                hashSet8.add("BasicText");
                HashSet hashSet9 = SVGAndroidRenderer.f51331i;
                Intrinsics.checkNotNull(hashSet9);
                hashSet9.add("PaintAttribute");
                HashSet hashSet10 = SVGAndroidRenderer.f51331i;
                Intrinsics.checkNotNull(hashSet10);
                hashSet10.add("BasicPaintAttribute");
                HashSet hashSet11 = SVGAndroidRenderer.f51331i;
                Intrinsics.checkNotNull(hashSet11);
                hashSet11.add("OpacityAttribute");
                HashSet hashSet12 = SVGAndroidRenderer.f51331i;
                Intrinsics.checkNotNull(hashSet12);
                hashSet12.add("BasicGraphicsAttribute");
                HashSet hashSet13 = SVGAndroidRenderer.f51331i;
                Intrinsics.checkNotNull(hashSet13);
                hashSet13.add("Marker");
                HashSet hashSet14 = SVGAndroidRenderer.f51331i;
                Intrinsics.checkNotNull(hashSet14);
                hashSet14.add("Gradient");
                HashSet hashSet15 = SVGAndroidRenderer.f51331i;
                Intrinsics.checkNotNull(hashSet15);
                hashSet15.add("Pattern");
                HashSet hashSet16 = SVGAndroidRenderer.f51331i;
                Intrinsics.checkNotNull(hashSet16);
                hashSet16.add("Clip");
                HashSet hashSet17 = SVGAndroidRenderer.f51331i;
                Intrinsics.checkNotNull(hashSet17);
                hashSet17.add("BasicClip");
                HashSet hashSet18 = SVGAndroidRenderer.f51331i;
                Intrinsics.checkNotNull(hashSet18);
                hashSet18.add("Mask");
                HashSet hashSet19 = SVGAndroidRenderer.f51331i;
                Intrinsics.checkNotNull(hashSet19);
                hashSet19.add("View");
            }
        }

        public static final void access$warn(Companion companion, String str, Object... objArr) {
            companion.getClass();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            String str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
            Log.w("SVGAndroidRenderer", str2);
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J8\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016J(\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J@\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010*\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%¨\u0006/"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVGAndroidRenderer$PathConverter;", "Lcom/mastercard/sonic/androidsvg/SVG$PathInterface;", "", "x", "y", "", "moveTo", "lineTo", "x1", "y1", "x2", "y2", "x3", "y3", "cubicTo", "quadTo", "rx", "ry", "xAxisRotation", "", "largeArcFlag", "sweepFlag", "arcTo", HearingDisabilitiesConstants.CLOSE_MODAL, "Landroid/graphics/Path;", "a", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "setPath", "(Landroid/graphics/Path;)V", "path", "b", "F", "getLastX", "()F", "setLastX", "(F)V", "lastX", "c", "getLastY", "setLastY", "lastY", "Lcom/mastercard/sonic/androidsvg/SVG$PathDefinition;", "pathDef", "<init>", "(Lcom/mastercard/sonic/androidsvg/SVG$PathDefinition;)V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class PathConverter implements SVG.PathInterface {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public Path path = new Path();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public float lastX;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public float lastY;

        public PathConverter(@Nullable SVG.PathDefinition pathDefinition) {
            if (pathDefinition != null) {
                pathDefinition.enumeratePath(this);
            }
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.PathInterface
        public void arcTo(float rx, float ry, float xAxisRotation, boolean largeArcFlag, boolean sweepFlag, float x4, float y7) {
            Companion.access$arcTo(SVGAndroidRenderer.INSTANCE, this.lastX, this.lastY, rx, ry, xAxisRotation, largeArcFlag, sweepFlag, x4, y7, this);
            this.lastX = x4;
            this.lastY = y7;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.PathInterface
        public void close() {
            this.path.close();
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.PathInterface
        public void cubicTo(float x4, float y7, float x6, float y10, float x7, float y11) {
            this.path.cubicTo(x4, y7, x6, y10, x7, y11);
            this.lastX = x7;
            this.lastY = y11;
        }

        public final float getLastX() {
            return this.lastX;
        }

        public final float getLastY() {
            return this.lastY;
        }

        @NotNull
        public final Path getPath() {
            return this.path;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.PathInterface
        public void lineTo(float x4, float y7) {
            this.path.lineTo(x4, y7);
            this.lastX = x4;
            this.lastY = y7;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.PathInterface
        public void moveTo(float x4, float y7) {
            this.path.moveTo(x4, y7);
            this.lastX = x4;
            this.lastY = y7;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.PathInterface
        public void quadTo(float x4, float y7, float x6, float y10) {
            this.path.quadTo(x4, y7, x6, y10);
            this.lastX = x6;
            this.lastY = y10;
        }

        public final void setLastX(float f6) {
            this.lastX = f6;
        }

        public final void setLastY(float f6) {
            this.lastY = f6;
        }

        public final void setPath(@NotNull Path path) {
            Intrinsics.checkNotNullParameter(path, "<set-?>");
            this.path = path;
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[PreserveAspectRatio.Alignment.values().length];
            try {
                iArr[PreserveAspectRatio.Alignment.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PreserveAspectRatio.Alignment.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PreserveAspectRatio.Alignment.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PreserveAspectRatio.Alignment.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PreserveAspectRatio.Alignment.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PreserveAspectRatio.Alignment.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PreserveAspectRatio.Alignment.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PreserveAspectRatio.Alignment.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SVG.Style.LineCap.values().length];
            try {
                iArr2[SVG.Style.LineCap.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[SVG.Style.LineCap.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[SVG.Style.LineCap.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[SVG.Style.LineJoin.values().length];
            try {
                iArr3[SVG.Style.LineJoin.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[SVG.Style.LineJoin.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[SVG.Style.LineJoin.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.kt */
    public final class a implements SVG.PathInterface {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ArrayList f51343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f51344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f51345c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public b f51346d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f51347e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f51348f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f51349g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f51350h;

        public a(@Nullable SVGAndroidRenderer sVGAndroidRenderer, SVG.PathDefinition pathDefinition) {
            ArrayList arrayList = new ArrayList();
            this.f51343a = arrayList;
            this.f51348f = true;
            this.f51349g = -1;
            if (pathDefinition != null) {
                pathDefinition.enumeratePath(this);
                if (this.f51350h) {
                    b bVar = this.f51346d;
                    Intrinsics.checkNotNull(bVar);
                    bVar.b((b) arrayList.get(this.f51349g));
                    arrayList.set(this.f51349g, this.f51346d);
                    this.f51350h = false;
                }
                b bVar2 = this.f51346d;
                if (bVar2 != null) {
                    arrayList.add(bVar2);
                }
            }
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.PathInterface
        public final void arcTo(float f6, float f10, float f11, boolean z10, boolean z11, float f12, float f13) {
            this.f51347e = true;
            this.f51348f = false;
            Companion companion = SVGAndroidRenderer.INSTANCE;
            b bVar = this.f51346d;
            Intrinsics.checkNotNull(bVar);
            float f14 = bVar.f51351a;
            b bVar2 = this.f51346d;
            Intrinsics.checkNotNull(bVar2);
            Companion.access$arcTo(companion, f14, bVar2.f51352b, f6, f10, f11, z10, z11, f12, f13, this);
            this.f51348f = true;
            this.f51350h = false;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.PathInterface
        public final void close() {
            this.f51343a.add(this.f51346d);
            lineTo(this.f51344b, this.f51345c);
            this.f51350h = true;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.PathInterface
        public final void cubicTo(float f6, float f10, float f11, float f12, float f13, float f14) {
            if (this.f51348f || this.f51347e) {
                b bVar = this.f51346d;
                Intrinsics.checkNotNull(bVar);
                bVar.a(f6, f10);
                this.f51343a.add(this.f51346d);
                this.f51347e = false;
            }
            this.f51346d = new b(f13, f14, f13 - f11, f14 - f12);
            this.f51350h = false;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.PathInterface
        public final void lineTo(float f6, float f10) {
            b bVar = this.f51346d;
            Intrinsics.checkNotNull(bVar);
            bVar.a(f6, f10);
            this.f51343a.add(this.f51346d);
            b bVar2 = this.f51346d;
            Intrinsics.checkNotNull(bVar2);
            float f11 = f6 - bVar2.f51351a;
            b bVar3 = this.f51346d;
            Intrinsics.checkNotNull(bVar3);
            this.f51346d = new b(f6, f10, f11, f10 - bVar3.f51352b);
            this.f51350h = false;
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.PathInterface
        public final void moveTo(float f6, float f10) {
            boolean z10 = this.f51350h;
            ArrayList arrayList = this.f51343a;
            if (z10) {
                b bVar = this.f51346d;
                Intrinsics.checkNotNull(bVar);
                bVar.b((b) arrayList.get(this.f51349g));
                arrayList.set(this.f51349g, this.f51346d);
                this.f51350h = false;
            }
            b bVar2 = this.f51346d;
            if (bVar2 != null) {
                arrayList.add(bVar2);
            }
            this.f51344b = f6;
            this.f51345c = f10;
            this.f51346d = new b(f6, f10, 0.0f, 0.0f);
            this.f51349g = arrayList.size();
        }

        @Override // com.mastercard.sonic.androidsvg.SVG.PathInterface
        public final void quadTo(float f6, float f10, float f11, float f12) {
            b bVar = this.f51346d;
            Intrinsics.checkNotNull(bVar);
            bVar.a(f6, f10);
            this.f51343a.add(this.f51346d);
            this.f51346d = new b(f11, f12, f11 - f6, f12 - f10);
            this.f51350h = false;
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.kt */
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f51351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f51352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f51353c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f51354d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f51355e;

        public b(float f6, float f10, float f11, float f12) {
            this.f51351a = f6;
            this.f51352b = f10;
            double d2 = f12;
            double dSqrt = Math.sqrt((d2 * d2) + ((double) (f11 * f11)));
            if (dSqrt == 0.0d) {
                return;
            }
            this.f51353c = (float) (((double) f11) / dSqrt);
            this.f51354d = (float) (d2 / dSqrt);
        }

        public final void a(float f6, float f10) {
            float f11 = f6 - this.f51351a;
            float f12 = f10 - this.f51352b;
            double d2 = f12;
            double dSqrt = Math.sqrt((d2 * d2) + ((double) (f11 * f11)));
            if (dSqrt != 0.0d) {
                f11 = (float) (((double) f11) / dSqrt);
                f12 = (float) (d2 / dSqrt);
            }
            float f13 = this.f51353c;
            if (f11 != (-f13) || f12 != (-this.f51354d)) {
                this.f51353c = f13 + f11;
                this.f51354d += f12;
            } else {
                this.f51355e = true;
                this.f51353c = -f12;
                this.f51354d = f11;
            }
        }

        public final void b(@Nullable b bVar) {
            Intrinsics.checkNotNull(bVar);
            float f6 = bVar.f51353c;
            float f10 = this.f51353c;
            if (f6 == (-f10)) {
                float f11 = bVar.f51354d;
                if (f11 == (-this.f51354d)) {
                    this.f51355e = true;
                    this.f51353c = -f11;
                    this.f51354d = bVar.f51353c;
                    return;
                }
            }
            this.f51353c = f10 + f6;
            this.f51354d += bVar.f51354d;
        }

        @NotNull
        public final String toString() {
            return "(" + this.f51351a + "," + this.f51352b + " " + this.f51353c + "," + this.f51354d + ")";
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.kt */
    public final class c extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Path f51356d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ SVGAndroidRenderer f51357e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f6, Path path, SVGAndroidRenderer sVGAndroidRenderer) {
            super(f6, 0.0f);
            Intrinsics.checkNotNullParameter(path, "path");
            this.f51357e = sVGAndroidRenderer;
            this.f51356d = path;
        }

        @Override // com.mastercard.sonic.androidsvg.SVGAndroidRenderer.d, com.mastercard.sonic.androidsvg.SVGAndroidRenderer.h
        public final void b(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            SVGAndroidRenderer sVGAndroidRenderer = this.f51357e;
            if (sVGAndroidRenderer.V()) {
                f fVar = sVGAndroidRenderer.f51335d;
                Intrinsics.checkNotNull(fVar);
                if (fVar.f51366b) {
                    Canvas canvas = sVGAndroidRenderer.f51332a;
                    Path path = this.f51356d;
                    float f6 = this.f51358a;
                    float f10 = this.f51359b;
                    f fVar2 = sVGAndroidRenderer.f51335d;
                    Intrinsics.checkNotNull(fVar2);
                    canvas.drawTextOnPath(text, path, f6, f10, fVar2.f51368d);
                }
                f fVar3 = sVGAndroidRenderer.f51335d;
                Intrinsics.checkNotNull(fVar3);
                if (fVar3.f51367c) {
                    Canvas canvas2 = sVGAndroidRenderer.f51332a;
                    Path path2 = this.f51356d;
                    float f11 = this.f51358a;
                    float f12 = this.f51359b;
                    f fVar4 = sVGAndroidRenderer.f51335d;
                    Intrinsics.checkNotNull(fVar4);
                    canvas2.drawTextOnPath(text, path2, f11, f12, fVar4.f51369e);
                }
            }
            float f13 = this.f51358a;
            f fVar5 = sVGAndroidRenderer.f51335d;
            Intrinsics.checkNotNull(fVar5);
            this.f51358a = fVar5.f51368d.measureText(text) + f13;
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.kt */
    public class d extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f51358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f51359b;

        public d(float f6, float f10) {
            this.f51358a = f6;
            this.f51359b = f10;
        }

        @Override // com.mastercard.sonic.androidsvg.SVGAndroidRenderer.h
        public void b(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            Object[] objArr = new Object[0];
            SVGAndroidRenderer.INSTANCE.getClass();
            SVGAndroidRenderer sVGAndroidRenderer = SVGAndroidRenderer.this;
            if (sVGAndroidRenderer.V()) {
                f fVar = sVGAndroidRenderer.f51335d;
                Intrinsics.checkNotNull(fVar);
                if (fVar.f51366b) {
                    Canvas canvas = sVGAndroidRenderer.f51332a;
                    float f6 = this.f51358a;
                    float f10 = this.f51359b;
                    f fVar2 = sVGAndroidRenderer.f51335d;
                    Intrinsics.checkNotNull(fVar2);
                    canvas.drawText(text, f6, f10, fVar2.f51368d);
                }
                f fVar3 = sVGAndroidRenderer.f51335d;
                Intrinsics.checkNotNull(fVar3);
                if (fVar3.f51367c) {
                    Canvas canvas2 = sVGAndroidRenderer.f51332a;
                    float f11 = this.f51358a;
                    float f12 = this.f51359b;
                    f fVar4 = sVGAndroidRenderer.f51335d;
                    Intrinsics.checkNotNull(fVar4);
                    canvas2.drawText(text, f11, f12, fVar4.f51369e);
                }
            }
            float f13 = this.f51358a;
            f fVar5 = sVGAndroidRenderer.f51335d;
            Intrinsics.checkNotNull(fVar5);
            this.f51358a = fVar5.f51368d.measureText(text) + f13;
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.kt */
    public final class e extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f51361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f51362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Path f51363c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SVGAndroidRenderer f51364d;

        public e(float f6, float f10, Path textAsPath, SVGAndroidRenderer sVGAndroidRenderer) {
            Intrinsics.checkNotNullParameter(textAsPath, "textAsPath");
            this.f51364d = sVGAndroidRenderer;
            this.f51361a = f6;
            this.f51362b = f10;
            this.f51363c = textAsPath;
        }

        @Override // com.mastercard.sonic.androidsvg.SVGAndroidRenderer.h
        public final boolean a(@Nullable SVG.TextContainer textContainer) {
            if (!(textContainer instanceof SVG.TextPath)) {
                return true;
            }
            Companion.access$warn(SVGAndroidRenderer.INSTANCE, "Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        @Override // com.mastercard.sonic.androidsvg.SVGAndroidRenderer.h
        public final void b(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            SVGAndroidRenderer sVGAndroidRenderer = this.f51364d;
            if (sVGAndroidRenderer.V()) {
                Path path = new Path();
                f fVar = sVGAndroidRenderer.f51335d;
                Intrinsics.checkNotNull(fVar);
                fVar.f51368d.getTextPath(text, 0, text.length(), this.f51361a, this.f51362b, path);
                this.f51363c.addPath(path);
            }
            float f6 = this.f51361a;
            f fVar2 = sVGAndroidRenderer.f51335d;
            Intrinsics.checkNotNull(fVar2);
            this.f51361a = fVar2.f51368d.measureText(text) + f6;
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.kt */
    public final class g extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f51373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f51374b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final RectF f51375c = new RectF();

        public g(float f6, float f10) {
            this.f51373a = f6;
            this.f51374b = f10;
        }

        @Override // com.mastercard.sonic.androidsvg.SVGAndroidRenderer.h
        public final boolean a(@Nullable SVG.TextContainer textContainer) {
            if (!(textContainer instanceof SVG.TextPath)) {
                return true;
            }
            SVG.TextPath textPath = (SVG.TextPath) textContainer;
            SVG document = textPath.getDocument();
            Intrinsics.checkNotNull(document);
            SVG.SvgObject svgObjectResolveIRI = document.resolveIRI(textPath.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String());
            if (svgObjectResolveIRI == null) {
                Companion companion = SVGAndroidRenderer.INSTANCE;
                String href = textPath.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String();
                Intrinsics.checkNotNull(href);
                Companion.access$error(companion, "TextPath path reference '%s' not found", href);
                return false;
            }
            SVG.Path path = (SVG.Path) svgObjectResolveIRI;
            Path path2 = new PathConverter(path.getD()).getPath();
            if (path.getTransform() != null) {
                Matrix transform = path.getTransform();
                Intrinsics.checkNotNull(transform);
                path2.transform(transform);
            }
            RectF rectF = new RectF();
            path2.computeBounds(rectF, true);
            this.f51375c.union(rectF);
            return false;
        }

        @Override // com.mastercard.sonic.androidsvg.SVGAndroidRenderer.h
        public final void b(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            SVGAndroidRenderer sVGAndroidRenderer = SVGAndroidRenderer.this;
            if (sVGAndroidRenderer.V()) {
                Rect rect = new Rect();
                f fVar = sVGAndroidRenderer.f51335d;
                Intrinsics.checkNotNull(fVar);
                fVar.f51368d.getTextBounds(text, 0, text.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f51373a, this.f51374b);
                this.f51375c.union(rectF);
            }
            float f6 = this.f51373a;
            f fVar2 = sVGAndroidRenderer.f51335d;
            Intrinsics.checkNotNull(fVar2);
            this.f51373a = fVar2.f51368d.measureText(text) + f6;
        }
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.kt */
    public abstract class h {
        public boolean a(@Nullable SVG.TextContainer textContainer) {
            return true;
        }

        public abstract void b(@NotNull String str);
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.kt */
    public final class i extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f51377a;

        public i() {
        }

        @Override // com.mastercard.sonic.androidsvg.SVGAndroidRenderer.h
        public final void b(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            float f6 = this.f51377a;
            f fVar = SVGAndroidRenderer.this.f51335d;
            Intrinsics.checkNotNull(fVar);
            this.f51377a = fVar.f51368d.measureText(text) + f6;
        }
    }

    public SVGAndroidRenderer(@NotNull Canvas canvas, float f6) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f51332a = canvas;
        this.dpi = f6;
    }

    public static /* synthetic */ void E(SVGAndroidRenderer sVGAndroidRenderer, SVG.SvgElement svgElement) {
        sVGAndroidRenderer.D(svgElement.getBoundingBox());
    }

    public static void N(f fVar, boolean z10, SVG.SvgPaint svgPaint) {
        Float strokeOpacity;
        int colour;
        Intrinsics.checkNotNull(fVar);
        if (z10) {
            SVG.Style style = fVar.f51365a;
            Intrinsics.checkNotNull(style);
            strokeOpacity = style.getFillOpacity();
        } else {
            SVG.Style style2 = fVar.f51365a;
            Intrinsics.checkNotNull(style2);
            strokeOpacity = style2.getStrokeOpacity();
        }
        Intrinsics.checkNotNull(strokeOpacity);
        float fFloatValue = strokeOpacity.floatValue();
        if (svgPaint instanceof SVG.Colour) {
            colour = ((SVG.Colour) svgPaint).getColour();
        } else {
            if (!(svgPaint instanceof SVG.CurrentColor)) {
                return;
            }
            SVG.Style style3 = fVar.f51365a;
            Intrinsics.checkNotNull(style3);
            SVG.Colour color = style3.getColor();
            Intrinsics.checkNotNull(color);
            colour = color.getColour();
        }
        (z10 ? fVar.f51368d : fVar.f51369e).setColor(Companion.access$colourWithOpacity(INSTANCE, colour, fFloatValue));
    }

    public static SVG.Box b(Path path) {
        RectF rectF = new RectF();
        Intrinsics.checkNotNull(path);
        path.computeBounds(rectF, true);
        return new SVG.Box(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0096  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b8  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ae, code lost:
    
        if (r7 != 8) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Matrix d(com.mastercard.sonic.androidsvg.SVG.Box r9, com.mastercard.sonic.androidsvg.SVG.Box r10, com.mastercard.sonic.androidsvg.PreserveAspectRatio r11) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mastercard.sonic.androidsvg.SVGAndroidRenderer.d(com.mastercard.sonic.androidsvg.SVG$Box, com.mastercard.sonic.androidsvg.SVG$Box, com.mastercard.sonic.androidsvg.PreserveAspectRatio):android.graphics.Matrix");
    }

    public static void e(SVGAndroidRenderer sVGAndroidRenderer, SVG.SvgElement svgElement) {
        Path pathA;
        SVG.Box boundingBox = svgElement.getBoundingBox();
        f fVar = sVGAndroidRenderer.f51335d;
        Intrinsics.checkNotNull(fVar);
        SVG.Style style = fVar.f51365a;
        Intrinsics.checkNotNull(style);
        if (style.getClipPath() == null || (pathA = sVGAndroidRenderer.a(svgElement, boundingBox)) == null) {
            return;
        }
        sVGAndroidRenderer.f51332a.clipPath(pathA);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Typeface g(String str, Integer num, SVG.Style.FontStyle fontStyle) {
        int i10 = 0;
        boolean z10 = fontStyle == SVG.Style.FontStyle.Italic;
        Intrinsics.checkNotNull(num);
        if (num.intValue() > 500) {
            i10 = z10 ? 3 : 1;
        } else if (z10) {
            i10 = 2;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1536685117:
                    if (str.equals("sans-serif")) {
                        return Typeface.create(Typeface.SANS_SERIF, i10);
                    }
                    break;
                case -1431958525:
                    if (str.equals("monospace")) {
                        return Typeface.create(Typeface.MONOSPACE, i10);
                    }
                    break;
                case -1081737434:
                    if (str.equals("fantasy")) {
                        return Typeface.create(Typeface.SANS_SERIF, i10);
                    }
                    break;
                case 109326717:
                    if (str.equals("serif")) {
                        return Typeface.create(Typeface.SERIF, i10);
                    }
                    break;
                case 1126973893:
                    if (str.equals("cursive")) {
                        return Typeface.create(Typeface.SANS_SERIF, i10);
                    }
                    break;
            }
        }
        return null;
    }

    public static void o(SVG.GradientElement gradientElement, String str) {
        SVG document = gradientElement.getDocument();
        Intrinsics.checkNotNull(document);
        SVG.SvgObject svgObjectResolveIRI = document.resolveIRI(str);
        if (svgObjectResolveIRI == null) {
            Companion companion = INSTANCE;
            Intrinsics.checkNotNull(str);
            Companion.access$warn(companion, "Gradient reference '%s' not found", str);
            return;
        }
        if (!(svgObjectResolveIRI instanceof SVG.GradientElement)) {
            Companion.access$error(INSTANCE, "Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (svgObjectResolveIRI == gradientElement) {
            Companion companion2 = INSTANCE;
            Intrinsics.checkNotNull(str);
            Companion.access$error(companion2, "Circular reference in gradient href attribute '%s'", str);
            return;
        }
        if (gradientElement.getGradientUnitsAreUser() == null) {
            gradientElement.setGradientUnitsAreUser(((SVG.GradientElement) svgObjectResolveIRI).getGradientUnitsAreUser());
        }
        if (gradientElement.getGradientTransform() == null) {
            gradientElement.setGradientTransform(((SVG.GradientElement) svgObjectResolveIRI).getGradientTransform());
        }
        if (gradientElement.getSpreadMethod() == null) {
            gradientElement.setSpreadMethod(((SVG.GradientElement) svgObjectResolveIRI).getSpreadMethod());
        }
        if (gradientElement.getChildren().isEmpty()) {
            gradientElement.setChildren(((SVG.GradientElement) svgObjectResolveIRI).getChildren());
        }
        try {
            if (gradientElement instanceof SVG.SvgLinearGradient) {
                SVG.SvgLinearGradient svgLinearGradient = (SVG.SvgLinearGradient) gradientElement;
                SVG.SvgLinearGradient svgLinearGradient2 = (SVG.SvgLinearGradient) svgObjectResolveIRI;
                if (svgLinearGradient.getX1() == null) {
                    svgLinearGradient.setX1(svgLinearGradient2.getX1());
                }
                if (svgLinearGradient.getY1() == null) {
                    svgLinearGradient.setY1(svgLinearGradient2.getY1());
                }
                if (svgLinearGradient.getX2() == null) {
                    svgLinearGradient.setX2(svgLinearGradient2.getX2());
                }
                if (svgLinearGradient.getY2() == null) {
                    svgLinearGradient.setY2(svgLinearGradient2.getY2());
                }
            } else {
                Intrinsics.checkNotNull(gradientElement, "null cannot be cast to non-null type com.mastercard.sonic.androidsvg.SVG.SvgRadialGradient");
                p((SVG.SvgRadialGradient) gradientElement, (SVG.SvgRadialGradient) svgObjectResolveIRI);
            }
        } catch (ClassCastException unused) {
        }
        SVG.GradientElement gradientElement2 = (SVG.GradientElement) svgObjectResolveIRI;
        if (gradientElement2.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String() != null) {
            o(gradientElement, gradientElement2.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String());
        }
    }

    public static void p(SVG.SvgRadialGradient svgRadialGradient, SVG.SvgRadialGradient svgRadialGradient2) {
        if (svgRadialGradient.getCx() == null) {
            svgRadialGradient.setCx(svgRadialGradient2.getCx());
        }
        if (svgRadialGradient.getCy() == null) {
            svgRadialGradient.setCy(svgRadialGradient2.getCy());
        }
        if (svgRadialGradient.getR() == null) {
            svgRadialGradient.setR(svgRadialGradient2.getR());
        }
        if (svgRadialGradient.getFx() == null) {
            svgRadialGradient.setFx(svgRadialGradient2.getFx());
        }
        if (svgRadialGradient.getFy() == null) {
            svgRadialGradient.setFy(svgRadialGradient2.getFy());
        }
    }

    public static void q(SVG.Pattern pattern, String str) {
        SVG document = pattern.getDocument();
        Intrinsics.checkNotNull(document);
        SVG.SvgObject svgObjectResolveIRI = document.resolveIRI(str);
        if (svgObjectResolveIRI == null) {
            Companion companion = INSTANCE;
            Intrinsics.checkNotNull(str);
            Companion.access$warn(companion, "Pattern reference '%s' not found", str);
            return;
        }
        if (!(svgObjectResolveIRI instanceof SVG.Pattern)) {
            Companion.access$error(INSTANCE, "Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (svgObjectResolveIRI == pattern) {
            Companion companion2 = INSTANCE;
            Intrinsics.checkNotNull(str);
            Companion.access$error(companion2, "Circular reference in pattern href attribute '%s'", str);
            return;
        }
        if (pattern.getPatternUnitsAreUser() == null) {
            pattern.setPatternUnitsAreUser(((SVG.Pattern) svgObjectResolveIRI).getPatternUnitsAreUser());
        }
        if (pattern.getPatternContentUnitsAreUser() == null) {
            pattern.setPatternContentUnitsAreUser(((SVG.Pattern) svgObjectResolveIRI).getPatternContentUnitsAreUser());
        }
        if (pattern.getPatternTransform() == null) {
            pattern.setPatternTransform(((SVG.Pattern) svgObjectResolveIRI).getPatternTransform());
        }
        if (pattern.getX() == null) {
            pattern.setX(((SVG.Pattern) svgObjectResolveIRI).getX());
        }
        if (pattern.getY() == null) {
            pattern.setY(((SVG.Pattern) svgObjectResolveIRI).getY());
        }
        if (pattern.getWidth() == null) {
            pattern.setWidth(((SVG.Pattern) svgObjectResolveIRI).getWidth());
        }
        if (pattern.getHeight() == null) {
            pattern.setHeight(((SVG.Pattern) svgObjectResolveIRI).getHeight());
        }
        if (pattern.getChildren().isEmpty()) {
            pattern.setChildren(((SVG.Pattern) svgObjectResolveIRI).getChildren());
        }
        if (pattern.getViewBox() == null) {
            pattern.setViewBox(((SVG.Pattern) svgObjectResolveIRI).getViewBox());
        }
        if (pattern.getPreserveAspectRatio() == null) {
            pattern.setPreserveAspectRatio(((SVG.Pattern) svgObjectResolveIRI).getPreserveAspectRatio());
        }
        SVG.Pattern pattern2 = (SVG.Pattern) svgObjectResolveIRI;
        if (pattern2.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String() != null) {
            q(pattern, pattern2.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String());
        }
    }

    public static boolean w(SVG.Style style, long j10) {
        Intrinsics.checkNotNull(style);
        return (style.getSpecifiedFlags() & j10) != 0;
    }

    public static Path z(SVG.PolyLine polyLine) {
        Path path = new Path();
        float[] points = polyLine.getPoints();
        Intrinsics.checkNotNull(points);
        float f6 = points[0];
        float[] points2 = polyLine.getPoints();
        Intrinsics.checkNotNull(points2);
        path.moveTo(f6, points2[1]);
        int i10 = 2;
        while (true) {
            float[] points3 = polyLine.getPoints();
            Intrinsics.checkNotNull(points3);
            if (i10 >= points3.length) {
                break;
            }
            float[] points4 = polyLine.getPoints();
            Intrinsics.checkNotNull(points4);
            float f10 = points4[i10];
            float[] points5 = polyLine.getPoints();
            Intrinsics.checkNotNull(points5);
            path.lineTo(f10, points5[i10 + 1]);
            i10 += 2;
        }
        if (polyLine instanceof SVG.Polygon) {
            path.close();
        }
        if (polyLine.getBoundingBox() == null) {
            polyLine.setBoundingBox(b(path));
        }
        return path;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0074  */
    /* JADX WARN: Code duplicated, block: B:18:0x0080  */
    /* JADX WARN: Code duplicated, block: B:21:0x0087  */
    /* JADX WARN: Code duplicated, block: B:22:0x0094  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cd  */
    public final Path A(SVG.Rect rect) {
        float fFloatValueX;
        float fFloatValueY;
        float fMin;
        float fMin2;
        float fFloatValueX2;
        float fFloatValueY2;
        float fFloatValueX3;
        float fFloatValueY3;
        float f6;
        float f10;
        Path path;
        Path path2;
        if (rect.getRx() == null && rect.getRy() == null) {
            fFloatValueX = 0.0f;
        } else {
            if (rect.getRx() != null) {
                if (rect.getRy() == null) {
                    SVG.Length rx = rect.getRx();
                    Intrinsics.checkNotNull(rx);
                    fFloatValueX = rx.floatValueX(this);
                } else {
                    SVG.Length rx2 = rect.getRx();
                    Intrinsics.checkNotNull(rx2);
                    fFloatValueX = rx2.floatValueX(this);
                    SVG.Length ry = rect.getRy();
                    Intrinsics.checkNotNull(ry);
                    fFloatValueY = ry.floatValueY(this);
                }
                SVG.Length width = rect.getWidth();
                Intrinsics.checkNotNull(width);
                fMin = Math.min(fFloatValueX, width.floatValueX(this) / 2.0f);
                SVG.Length height = rect.getHeight();
                Intrinsics.checkNotNull(height);
                fMin2 = Math.min(fFloatValueY, height.floatValueY(this) / 2.0f);
                if (rect.getX() != null) {
                    SVG.Length x4 = rect.getX();
                    Intrinsics.checkNotNull(x4);
                    fFloatValueX2 = x4.floatValueX(this);
                } else {
                    fFloatValueX2 = 0.0f;
                }
                if (rect.getY() != null) {
                    SVG.Length y7 = rect.getY();
                    Intrinsics.checkNotNull(y7);
                    fFloatValueY2 = y7.floatValueY(this);
                } else {
                    fFloatValueY2 = 0.0f;
                }
                SVG.Length width2 = rect.getWidth();
                Intrinsics.checkNotNull(width2);
                fFloatValueX3 = width2.floatValueX(this);
                SVG.Length height2 = rect.getHeight();
                Intrinsics.checkNotNull(height2);
                fFloatValueY3 = height2.floatValueY(this);
                if (rect.getBoundingBox() == null) {
                    rect.setBoundingBox(new SVG.Box(fFloatValueX2, fFloatValueY2, fFloatValueX3, fFloatValueY3));
                }
                f6 = fFloatValueX2 + fFloatValueX3;
                f10 = fFloatValueY2 + fFloatValueY3;
                path = new Path();
                if (fMin == 0.0f && fMin2 != 0.0f) {
                    float f11 = fMin * 0.5522848f;
                    float f12 = 0.5522848f * fMin2;
                    float f13 = fFloatValueY2 + fMin2;
                    path.moveTo(fFloatValueX2, f13);
                    float f14 = f13 - f12;
                    float f15 = fFloatValueX2 + fMin;
                    float f16 = f15 - f11;
                    path.cubicTo(fFloatValueX2, f14, f16, fFloatValueY2, f15, fFloatValueY2);
                    float f17 = f6 - fMin;
                    path.lineTo(f17, fFloatValueY2);
                    float f18 = f17 + f11;
                    path.cubicTo(f18, fFloatValueY2, f6, f14, f6, f13);
                    float f19 = f10 - fMin2;
                    path.lineTo(f6, f19);
                    float f20 = f19 + f12;
                    path2 = path;
                    path.cubicTo(f6, f20, f18, f10, f17, f10);
                    path2.lineTo(f15, f10);
                    path2.cubicTo(f16, f10, fFloatValueX2, f20, fFloatValueX2, f19);
                    path2.lineTo(fFloatValueX2, f13);
                } else {
                    path.moveTo(fFloatValueX2, fFloatValueY2);
                    path.lineTo(f6, fFloatValueY2);
                    path.lineTo(f6, f10);
                    path.lineTo(fFloatValueX2, f10);
                    path.lineTo(fFloatValueX2, fFloatValueY2);
                    path2 = path;
                }
                path2.close();
                return path2;
            }
            SVG.Length ry2 = rect.getRy();
            Intrinsics.checkNotNull(ry2);
            fFloatValueX = ry2.floatValueY(this);
        }
        fFloatValueY = fFloatValueX;
        SVG.Length width3 = rect.getWidth();
        Intrinsics.checkNotNull(width3);
        fMin = Math.min(fFloatValueX, width3.floatValueX(this) / 2.0f);
        SVG.Length height3 = rect.getHeight();
        Intrinsics.checkNotNull(height3);
        fMin2 = Math.min(fFloatValueY, height3.floatValueY(this) / 2.0f);
        if (rect.getX() != null) {
            SVG.Length x6 = rect.getX();
            Intrinsics.checkNotNull(x6);
            fFloatValueX2 = x6.floatValueX(this);
        } else {
            fFloatValueX2 = 0.0f;
        }
        if (rect.getY() != null) {
            SVG.Length y10 = rect.getY();
            Intrinsics.checkNotNull(y10);
            fFloatValueY2 = y10.floatValueY(this);
        } else {
            fFloatValueY2 = 0.0f;
        }
        SVG.Length width4 = rect.getWidth();
        Intrinsics.checkNotNull(width4);
        fFloatValueX3 = width4.floatValueX(this);
        SVG.Length height4 = rect.getHeight();
        Intrinsics.checkNotNull(height4);
        fFloatValueY3 = height4.floatValueY(this);
        if (rect.getBoundingBox() == null) {
            rect.setBoundingBox(new SVG.Box(fFloatValueX2, fFloatValueY2, fFloatValueX3, fFloatValueY3));
        }
        f6 = fFloatValueX2 + fFloatValueX3;
        f10 = fFloatValueY2 + fFloatValueY3;
        path = new Path();
        if (fMin == 0.0f) {
            path.moveTo(fFloatValueX2, fFloatValueY2);
            path.lineTo(f6, fFloatValueY2);
            path.lineTo(f6, f10);
            path.lineTo(fFloatValueX2, f10);
            path.lineTo(fFloatValueX2, fFloatValueY2);
            path2 = path;
        } else {
            float f110 = fMin * 0.5522848f;
            float f111 = 0.5522848f * fMin2;
            float f112 = fFloatValueY2 + fMin2;
            path.moveTo(fFloatValueX2, f112);
            float f113 = f112 - f111;
            float f114 = fFloatValueX2 + fMin;
            float f115 = f114 - f110;
            path.cubicTo(fFloatValueX2, f113, f115, fFloatValueY2, f114, fFloatValueY2);
            float f116 = f6 - fMin;
            path.lineTo(f116, fFloatValueY2);
            float f117 = f116 + f110;
            path.cubicTo(f117, fFloatValueY2, f6, f113, f6, f112);
            float f118 = f10 - fMin2;
            path.lineTo(f6, f118);
            float f21 = f118 + f111;
            path2 = path;
            path.cubicTo(f6, f21, f117, f10, f116, f10);
            path2.lineTo(f114, f10);
            path2.cubicTo(f115, f10, fFloatValueX2, f21, fFloatValueX2, f118);
            path2.lineTo(fFloatValueX2, f112);
        }
        path2.close();
        return path2;
    }

    public final SVG.Box B(SVG.Length length, SVG.Length length2, SVG.Length length3, SVG.Length length4) {
        float width;
        float height;
        float fFloatValueX = length != null ? length.floatValueX(this) : 0.0f;
        float fFloatValueY = length2 != null ? length2.floatValueY(this) : 0.0f;
        SVG.Box currentViewPortInUserUnits = getCurrentViewPortInUserUnits();
        if (length3 != null) {
            width = length3.floatValueX(this);
        } else {
            Intrinsics.checkNotNull(currentViewPortInUserUnits);
            width = currentViewPortInUserUnits.getWidth();
        }
        if (length4 != null) {
            height = length4.floatValueY(this);
        } else {
            Intrinsics.checkNotNull(currentViewPortInUserUnits);
            height = currentViewPortInUserUnits.getHeight();
        }
        return new SVG.Box(fFloatValueX, fFloatValueY, width, height);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0158  */
    /* JADX WARN: Code duplicated, block: B:72:0x017f  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a6  */
    @TargetApi(19)
    public final Path C(SVG.SvgElement svgElement, boolean z10) {
        float fFloatValueX;
        float fFloatValueY;
        float fFloatValueX2;
        Path pathZ;
        Path pathA;
        Stack<f> stack = this.f51336e;
        Intrinsics.checkNotNull(stack);
        stack.push(this.f51335d);
        f fVar = this.f51335d;
        Intrinsics.checkNotNull(fVar);
        f fVar2 = new f(fVar);
        this.f51335d = fVar2;
        T(fVar2, svgElement);
        if (!j() || !V()) {
            Stack<f> stack2 = this.f51336e;
            Intrinsics.checkNotNull(stack2);
            this.f51335d = stack2.pop();
            return null;
        }
        if (svgElement instanceof SVG.Use) {
            if (!z10) {
                Companion.access$error(INSTANCE, "<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            SVG document = svgElement.getDocument();
            Intrinsics.checkNotNull(document);
            SVG.Use use = (SVG.Use) svgElement;
            SVG.SvgObject svgObjectResolveIRI = document.resolveIRI(use.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String());
            if (svgObjectResolveIRI == null) {
                Companion companion = INSTANCE;
                String href = use.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String();
                Intrinsics.checkNotNull(href);
                Companion.access$error(companion, "Use reference '%s' not found", href);
                Stack<f> stack3 = this.f51336e;
                Intrinsics.checkNotNull(stack3);
                this.f51335d = stack3.pop();
                return null;
            }
            if (!(svgObjectResolveIRI instanceof SVG.SvgElement)) {
                Stack<f> stack4 = this.f51336e;
                Intrinsics.checkNotNull(stack4);
                this.f51335d = stack4.pop();
                return null;
            }
            pathZ = C((SVG.SvgElement) svgObjectResolveIRI, false);
            if (pathZ == null) {
                return null;
            }
            if (svgElement.getBoundingBox() == null) {
                svgElement.setBoundingBox(b(pathZ));
            }
            if (use.getTransform() != null) {
                Matrix transform = use.getTransform();
                Intrinsics.checkNotNull(transform);
                pathZ.transform(transform);
            }
        } else if (svgElement instanceof SVG.GraphicsElement) {
            if (svgElement instanceof SVG.Path) {
                pathZ = new PathConverter(((SVG.Path) svgElement).getD()).getPath();
                if (svgElement.getBoundingBox() == null) {
                    svgElement.setBoundingBox(b(pathZ));
                }
            } else if (svgElement instanceof SVG.Rect) {
                pathZ = A((SVG.Rect) svgElement);
            } else if (svgElement instanceof SVG.Circle) {
                pathZ = x((SVG.Circle) svgElement);
            } else if (svgElement instanceof SVG.Ellipse) {
                pathZ = y((SVG.Ellipse) svgElement);
            } else {
                pathZ = svgElement instanceof SVG.PolyLine ? z((SVG.PolyLine) svgElement) : null;
            }
            if (pathZ == null) {
                return null;
            }
            if (svgElement.getBoundingBox() == null) {
                svgElement.setBoundingBox(b(pathZ));
            }
            SVG.GraphicsElement graphicsElement = (SVG.GraphicsElement) svgElement;
            if (graphicsElement.getTransform() != null) {
                Matrix transform2 = graphicsElement.getTransform();
                Intrinsics.checkNotNull(transform2);
                pathZ.transform(transform2);
            }
            pathZ.setFillType(u());
        } else {
            if (!(svgElement instanceof SVG.Text)) {
                Companion.access$error(INSTANCE, "Invalid %s element found in clipPath definition", svgElement.getNodeName());
                return null;
            }
            SVG.Text text = (SVG.Text) svgElement;
            float fFloatValueY2 = 0.0f;
            if (text.getX() != null) {
                List<SVG.Length> x4 = text.getX();
                Intrinsics.checkNotNull(x4);
                if (x4.isEmpty()) {
                    fFloatValueX = 0.0f;
                } else {
                    List<SVG.Length> x6 = text.getX();
                    Intrinsics.checkNotNull(x6);
                    fFloatValueX = x6.get(0).floatValueX(this);
                }
            } else {
                fFloatValueX = 0.0f;
            }
            if (text.getY() != null) {
                List<SVG.Length> y7 = text.getY();
                Intrinsics.checkNotNull(y7);
                if (y7.isEmpty()) {
                    fFloatValueY = 0.0f;
                } else {
                    List<SVG.Length> y10 = text.getY();
                    Intrinsics.checkNotNull(y10);
                    fFloatValueY = y10.get(0).floatValueY(this);
                }
            } else {
                fFloatValueY = 0.0f;
            }
            if (text.getDx() != null) {
                List<SVG.Length> dx = text.getDx();
                Intrinsics.checkNotNull(dx);
                if (dx.isEmpty()) {
                    fFloatValueX2 = 0.0f;
                } else {
                    List<SVG.Length> dx2 = text.getDx();
                    Intrinsics.checkNotNull(dx2);
                    fFloatValueX2 = dx2.get(0).floatValueX(this);
                }
            } else {
                fFloatValueX2 = 0.0f;
            }
            if (text.getDy() != null) {
                List<SVG.Length> dy = text.getDy();
                Intrinsics.checkNotNull(dy);
                if (!dy.isEmpty()) {
                    List<SVG.Length> dy2 = text.getDy();
                    Intrinsics.checkNotNull(dy2);
                    fFloatValueY2 = dy2.get(0).floatValueY(this);
                }
            }
            f fVar3 = this.f51335d;
            Intrinsics.checkNotNull(fVar3);
            SVG.Style style = fVar3.f51365a;
            Intrinsics.checkNotNull(style);
            if (style.getTextAnchor() != SVG.Style.TextAnchor.Start) {
                float fC = c(text);
                f fVar4 = this.f51335d;
                Intrinsics.checkNotNull(fVar4);
                SVG.Style style2 = fVar4.f51365a;
                Intrinsics.checkNotNull(style2);
                if (style2.getTextAnchor() == SVG.Style.TextAnchor.Middle) {
                    fC /= 2;
                }
                fFloatValueX -= fC;
            }
            if (text.getBoundingBox() == null) {
                g gVar = new g(fFloatValueX, fFloatValueY);
                m(text, gVar);
                RectF rectF = gVar.f51375c;
                text.setBoundingBox(new SVG.Box(rectF.left, rectF.top, rectF.width(), rectF.height()));
            }
            Path path = new Path();
            m(text, new e(fFloatValueX + fFloatValueX2, fFloatValueY + fFloatValueY2, path, this));
            if (text.getTransform() != null) {
                Matrix transform3 = text.getTransform();
                Intrinsics.checkNotNull(transform3);
                path.transform(transform3);
            }
            path.setFillType(u());
            pathZ = path;
        }
        f fVar5 = this.f51335d;
        Intrinsics.checkNotNull(fVar5);
        SVG.Style style3 = fVar5.f51365a;
        Intrinsics.checkNotNull(style3);
        if (style3.getClipPath() != null && (pathA = a(svgElement, svgElement.getBoundingBox())) != null) {
            pathZ.op(pathA, Path.Op.INTERSECT);
        }
        Stack<f> stack5 = this.f51336e;
        Intrinsics.checkNotNull(stack5);
        this.f51335d = stack5.pop();
        return pathZ;
    }

    public final void D(SVG.Box box) {
        f fVar = this.f51335d;
        Intrinsics.checkNotNull(fVar);
        SVG.Style style = fVar.f51365a;
        Intrinsics.checkNotNull(style);
        if (style.getMask() != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            Canvas canvas = this.f51332a;
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paint2, 31);
            SVG svg = this.f51334c;
            Intrinsics.checkNotNull(svg);
            f fVar2 = this.f51335d;
            Intrinsics.checkNotNull(fVar2);
            SVG.Style style2 = fVar2.f51365a;
            Intrinsics.checkNotNull(style2);
            SVG.SvgObject svgObjectResolveIRI = svg.resolveIRI(style2.getMask());
            Intrinsics.checkNotNull(svgObjectResolveIRI, "null cannot be cast to non-null type com.mastercard.sonic.androidsvg.SVG.Mask");
            SVG.Mask mask = (SVG.Mask) svgObjectResolveIRI;
            L(mask, box);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            L(mask, box);
            canvas.restore();
            canvas.restore();
        }
        O();
    }

    public final boolean F() {
        f fVar = this.f51335d;
        Intrinsics.checkNotNull(fVar);
        SVG.Style style = fVar.f51365a;
        Intrinsics.checkNotNull(style);
        Float opacity = style.getOpacity();
        Intrinsics.checkNotNull(opacity);
        if (opacity.floatValue() >= 1.0f) {
            f fVar2 = this.f51335d;
            Intrinsics.checkNotNull(fVar2);
            SVG.Style style2 = fVar2.f51365a;
            Intrinsics.checkNotNull(style2);
            if (style2.getMask() == null) {
                return false;
            }
        }
        Companion companion = INSTANCE;
        f fVar3 = this.f51335d;
        Intrinsics.checkNotNull(fVar3);
        SVG.Style style3 = fVar3.f51365a;
        Intrinsics.checkNotNull(style3);
        Float opacity2 = style3.getOpacity();
        Intrinsics.checkNotNull(opacity2);
        this.f51332a.saveLayerAlpha(null, Companion.access$clamp255(companion, opacity2.floatValue()), 31);
        Stack<f> stack = this.f51336e;
        Intrinsics.checkNotNull(stack);
        stack.push(this.f51335d);
        f fVar4 = this.f51335d;
        Intrinsics.checkNotNull(fVar4);
        f fVar5 = new f(fVar4);
        this.f51335d = fVar5;
        Intrinsics.checkNotNull(fVar5);
        SVG.Style style4 = fVar5.f51365a;
        Intrinsics.checkNotNull(style4);
        if (style4.getMask() != null) {
            SVG svg = this.f51334c;
            Intrinsics.checkNotNull(svg);
            f fVar6 = this.f51335d;
            Intrinsics.checkNotNull(fVar6);
            SVG.Style style5 = fVar6.f51365a;
            Intrinsics.checkNotNull(style5);
            SVG.SvgObject svgObjectResolveIRI = svg.resolveIRI(style5.getMask());
            if (svgObjectResolveIRI == null || !(svgObjectResolveIRI instanceof SVG.Mask)) {
                f fVar7 = this.f51335d;
                Intrinsics.checkNotNull(fVar7);
                SVG.Style style6 = fVar7.f51365a;
                Intrinsics.checkNotNull(style6);
                String mask = style6.getMask();
                Intrinsics.checkNotNull(mask);
                Companion.access$error(companion, "Mask reference '%s' not found", mask);
                f fVar8 = this.f51335d;
                Intrinsics.checkNotNull(fVar8);
                SVG.Style style7 = fVar8.f51365a;
                Intrinsics.checkNotNull(style7);
                style7.setMask(null);
            }
        }
        return true;
    }

    public final void G(SVG.Svg svg, SVG.Box box, SVG.Box box2, PreserveAspectRatio preserveAspectRatio) {
        Path pathA;
        Object[] objArr = new Object[0];
        INSTANCE.getClass();
        if (box.getWidth() == 0.0f || box.getHeight() == 0.0f) {
            return;
        }
        if (preserveAspectRatio == null) {
            preserveAspectRatio = svg.getPreserveAspectRatio() != null ? svg.getPreserveAspectRatio() : PreserveAspectRatio.INSTANCE.getLETTERBOX();
        }
        T(this.f51335d, svg);
        if (j()) {
            f fVar = this.f51335d;
            Intrinsics.checkNotNull(fVar);
            fVar.f51370f = box;
            f fVar2 = this.f51335d;
            Intrinsics.checkNotNull(fVar2);
            SVG.Style style = fVar2.f51365a;
            Intrinsics.checkNotNull(style);
            Boolean overflow = style.getOverflow();
            Intrinsics.checkNotNull(overflow);
            if (!overflow.booleanValue()) {
                f fVar3 = this.f51335d;
                Intrinsics.checkNotNull(fVar3);
                SVG.Box box3 = fVar3.f51370f;
                Intrinsics.checkNotNull(box3);
                float minX = box3.getMinX();
                f fVar4 = this.f51335d;
                Intrinsics.checkNotNull(fVar4);
                SVG.Box box4 = fVar4.f51370f;
                Intrinsics.checkNotNull(box4);
                float minY = box4.getMinY();
                f fVar5 = this.f51335d;
                Intrinsics.checkNotNull(fVar5);
                SVG.Box box5 = fVar5.f51370f;
                Intrinsics.checkNotNull(box5);
                float width = box5.getWidth();
                f fVar6 = this.f51335d;
                Intrinsics.checkNotNull(fVar6);
                SVG.Box box6 = fVar6.f51370f;
                Intrinsics.checkNotNull(box6);
                M(minX, minY, width, box6.getHeight());
            }
            f fVar7 = this.f51335d;
            Intrinsics.checkNotNull(fVar7);
            SVG.Box box7 = fVar7.f51370f;
            f fVar8 = this.f51335d;
            Intrinsics.checkNotNull(fVar8);
            SVG.Style style2 = fVar8.f51365a;
            Intrinsics.checkNotNull(style2);
            String clipPath = style2.getClipPath();
            Canvas canvas = this.f51332a;
            if (clipPath != null && (pathA = a(svg, box7)) != null) {
                canvas.clipPath(pathA);
            }
            if (box2 != null) {
                f fVar9 = this.f51335d;
                Intrinsics.checkNotNull(fVar9);
                canvas.concat(d(fVar9.f51370f, box2, preserveAspectRatio));
                f fVar10 = this.f51335d;
                Intrinsics.checkNotNull(fVar10);
                fVar10.f51371g = svg.getViewBox();
            } else {
                f fVar11 = this.f51335d;
                Intrinsics.checkNotNull(fVar11);
                SVG.Box box8 = fVar11.f51370f;
                Intrinsics.checkNotNull(box8);
                float minX2 = box8.getMinX();
                f fVar12 = this.f51335d;
                Intrinsics.checkNotNull(fVar12);
                SVG.Box box9 = fVar12.f51370f;
                Intrinsics.checkNotNull(box9);
                canvas.translate(minX2, box9.getMinY());
            }
            boolean zF = F();
            U();
            I(svg, true);
            if (zF) {
                E(this, svg);
            }
            R(svg);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0060  */
    /* JADX WARN: Code duplicated, block: B:188:0x045b  */
    /* JADX WARN: Code duplicated, block: B:189:0x046f  */
    /* JADX WARN: Code duplicated, block: B:197:0x0499  */
    /* JADX WARN: Code duplicated, block: B:19:0x006f  */
    /* JADX WARN: Code duplicated, block: B:200:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:201:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:204:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:205:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:208:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:212:0x0577  */
    /* JADX WARN: Code duplicated, block: B:215:0x0583  */
    /* JADX WARN: Code duplicated, block: B:22:0x007c  */
    /* JADX WARN: Code duplicated, block: B:232:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:234:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:237:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:240:0x0605  */
    /* JADX WARN: Code duplicated, block: B:243:0x0618  */
    /* JADX WARN: Code duplicated, block: B:246:0x0620  */
    /* JADX WARN: Code duplicated, block: B:24:0x008d  */
    /* JADX WARN: Code duplicated, block: B:25:0x009f  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00be  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:376:0x08b3  */
    /* JADX WARN: Code duplicated, block: B:378:0x08b9  */
    /* JADX WARN: Code duplicated, block: B:382:0x08cc  */
    /* JADX WARN: Code duplicated, block: B:384:0x08e6  */
    /* JADX WARN: Code duplicated, block: B:387:0x08f2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:390:0x08fa  */
    /* JADX WARN: Code duplicated, block: B:39:0x0115  */
    /* JADX WARN: Code duplicated, block: B:404:0x0937  */
    /* JADX WARN: Code duplicated, block: B:406:0x093d  */
    /* JADX WARN: Code duplicated, block: B:410:0x0950  */
    /* JADX WARN: Code duplicated, block: B:412:0x0971  */
    /* JADX WARN: Code duplicated, block: B:415:0x097d  */
    /* JADX WARN: Code duplicated, block: B:418:0x0985  */
    /* JADX WARN: Code duplicated, block: B:41:0x0119  */
    /* JADX WARN: Code duplicated, block: B:433:0x09d9  */
    /* JADX WARN: Code duplicated, block: B:43:0x0121  */
    /* JADX WARN: Code duplicated, block: B:440:0x0a00  */
    /* JADX WARN: Code duplicated, block: B:447:0x0a27  */
    /* JADX WARN: Code duplicated, block: B:44:0x0126  */
    /* JADX WARN: Code duplicated, block: B:47:0x0133  */
    /* JADX WARN: Code duplicated, block: B:48:0x0138  */
    /* JADX WARN: Code duplicated, block: B:52:0x015a  */
    /* JADX WARN: Code duplicated, block: B:57:0x016a  */
    /* JADX WARN: Code duplicated, block: B:58:0x016f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0198  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:68:0x021f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0229  */
    /* JADX WARN: Code duplicated, block: B:74:0x023e  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void H(SVG.SvgObject svgObject) {
        float fFloatValueX;
        float fFloatValueY;
        float fFloatValueX2;
        float[] points;
        Path pathZ;
        boolean zF;
        f fVar;
        f fVar2;
        float[] points2;
        Path pathZ2;
        boolean zF2;
        f fVar3;
        f fVar4;
        float fFloatValueX3;
        float fFloatValueY2;
        float fFloatValueX4;
        Path path;
        boolean zF3;
        f fVar5;
        f fVar6;
        SVG.Box box;
        float fFloatValueX5;
        float fFloatValueY3;
        Boolean overflow;
        boolean zF4;
        int iIndexOf$default;
        Set<String> systemLanguage;
        SVG.SvgObject svgObjectResolveIRI;
        float fFloatValueX6;
        float fFloatValueY4;
        boolean zF5;
        SVG.Length length;
        SVG.Length length2;
        SVG.Box boxB;
        SVG.Symbol symbol;
        PreserveAspectRatio letterbox;
        Boolean overflow2;
        boolean zF6;
        SVG.Length height;
        if (svgObject instanceof SVG.NotDirectlyRendered) {
            return;
        }
        P();
        h(svgObject);
        if (svgObject instanceof SVG.Svg) {
            SVG.Svg svg = (SVG.Svg) svgObject;
            G(svg, B(svg.getX(), svg.getY(), svg.getWidth(), svg.getHeight()), svg.getViewBox(), svg.getPreserveAspectRatio());
        } else {
            boolean z10 = svgObject instanceof SVG.Use;
            Canvas canvas = this.f51332a;
            float fFloatValueY5 = 0.0f;
            Bitmap bitmapResolveImage = null;
            if (z10) {
                SVG.Use use = (SVG.Use) svgObject;
                Companion companion = INSTANCE;
                Object[] objArr = new Object[0];
                companion.getClass();
                if (use.getWidth() != null) {
                    SVG.Length width = use.getWidth();
                    Intrinsics.checkNotNull(width);
                    if (!width.isZero()) {
                        if (use.getHeight() != null) {
                            height = use.getHeight();
                            Intrinsics.checkNotNull(height);
                            if (!height.isZero()) {
                                T(this.f51335d, use);
                                if (j()) {
                                    SVG document = use.getDocument();
                                    Intrinsics.checkNotNull(document);
                                    svgObjectResolveIRI = document.resolveIRI(use.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String());
                                    if (svgObjectResolveIRI == null) {
                                        String href = use.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String();
                                        Intrinsics.checkNotNull(href);
                                        Companion.access$error(companion, "Use reference '%s' not found", href);
                                    } else {
                                        if (use.getTransform() != null) {
                                            canvas.concat(use.getTransform());
                                        }
                                        if (use.getX() != null) {
                                            SVG.Length x4 = use.getX();
                                            Intrinsics.checkNotNull(x4);
                                            fFloatValueX6 = x4.floatValueX(this);
                                        } else {
                                            fFloatValueX6 = 0.0f;
                                        }
                                        if (use.getY() != null) {
                                            SVG.Length y7 = use.getY();
                                            Intrinsics.checkNotNull(y7);
                                            fFloatValueY4 = y7.floatValueY(this);
                                        } else {
                                            fFloatValueY4 = 0.0f;
                                        }
                                        canvas.translate(fFloatValueX6, fFloatValueY4);
                                        e(this, use);
                                        zF5 = F();
                                        Stack<SVG.SvgContainer> stack = this.f51337f;
                                        Intrinsics.checkNotNull(stack);
                                        stack.push(use);
                                        Stack<Matrix> stack2 = this.f51338g;
                                        Intrinsics.checkNotNull(stack2);
                                        stack2.push(canvas.getMatrix());
                                        if (svgObjectResolveIRI instanceof SVG.Svg) {
                                            SVG.Box boxB2 = B(null, null, use.getWidth(), use.getHeight());
                                            P();
                                            SVG.Svg svg2 = (SVG.Svg) svgObjectResolveIRI;
                                            G(svg2, boxB2, svg2.getViewBox(), svg2.getPreserveAspectRatio());
                                            O();
                                        } else if (svgObjectResolveIRI instanceof SVG.Symbol) {
                                            if (use.getWidth() != null) {
                                                length = use.getWidth();
                                            } else {
                                                length = new SVG.Length(100.0f, SVG.Unit.percent);
                                            }
                                            if (use.getHeight() != null) {
                                                length2 = use.getHeight();
                                            } else {
                                                length2 = new SVG.Length(100.0f, SVG.Unit.percent);
                                            }
                                            boxB = B(null, null, length, length2);
                                            P();
                                            symbol = (SVG.Symbol) svgObjectResolveIRI;
                                            Object[] objArr2 = new Object[0];
                                            companion.getClass();
                                            if (boxB.getWidth() != 0.0f && boxB.getHeight() != 0.0f) {
                                                if (symbol.getPreserveAspectRatio() != null) {
                                                    letterbox = symbol.getPreserveAspectRatio();
                                                } else {
                                                    letterbox = PreserveAspectRatio.INSTANCE.getLETTERBOX();
                                                }
                                                T(this.f51335d, symbol);
                                                f fVar7 = this.f51335d;
                                                Intrinsics.checkNotNull(fVar7);
                                                fVar7.f51370f = boxB;
                                                f fVar8 = this.f51335d;
                                                Intrinsics.checkNotNull(fVar8);
                                                SVG.Style style = fVar8.f51365a;
                                                Intrinsics.checkNotNull(style);
                                                overflow2 = style.getOverflow();
                                                Intrinsics.checkNotNull(overflow2);
                                                if (!overflow2.booleanValue()) {
                                                    f fVar9 = this.f51335d;
                                                    Intrinsics.checkNotNull(fVar9);
                                                    SVG.Box box2 = fVar9.f51370f;
                                                    Intrinsics.checkNotNull(box2);
                                                    float minX = box2.getMinX();
                                                    f fVar10 = this.f51335d;
                                                    Intrinsics.checkNotNull(fVar10);
                                                    SVG.Box box3 = fVar10.f51370f;
                                                    Intrinsics.checkNotNull(box3);
                                                    float minY = box3.getMinY();
                                                    f fVar11 = this.f51335d;
                                                    Intrinsics.checkNotNull(fVar11);
                                                    SVG.Box box4 = fVar11.f51370f;
                                                    Intrinsics.checkNotNull(box4);
                                                    float width2 = box4.getWidth();
                                                    f fVar12 = this.f51335d;
                                                    Intrinsics.checkNotNull(fVar12);
                                                    SVG.Box box5 = fVar12.f51370f;
                                                    Intrinsics.checkNotNull(box5);
                                                    M(minX, minY, width2, box5.getHeight());
                                                }
                                                if (symbol.getViewBox() != null) {
                                                    f fVar13 = this.f51335d;
                                                    Intrinsics.checkNotNull(fVar13);
                                                    canvas.concat(d(fVar13.f51370f, symbol.getViewBox(), letterbox));
                                                    f fVar14 = this.f51335d;
                                                    Intrinsics.checkNotNull(fVar14);
                                                    fVar14.f51371g = symbol.getViewBox();
                                                } else {
                                                    f fVar15 = this.f51335d;
                                                    Intrinsics.checkNotNull(fVar15);
                                                    SVG.Box box6 = fVar15.f51370f;
                                                    Intrinsics.checkNotNull(box6);
                                                    float minX2 = box6.getMinX();
                                                    f fVar16 = this.f51335d;
                                                    Intrinsics.checkNotNull(fVar16);
                                                    SVG.Box box7 = fVar16.f51370f;
                                                    Intrinsics.checkNotNull(box7);
                                                    canvas.translate(minX2, box7.getMinY());
                                                }
                                                zF6 = F();
                                                I(symbol, true);
                                                if (zF6) {
                                                    E(this, symbol);
                                                }
                                                R(symbol);
                                            }
                                            O();
                                        } else {
                                            H(svgObjectResolveIRI);
                                        }
                                        Stack<SVG.SvgContainer> stack3 = this.f51337f;
                                        Intrinsics.checkNotNull(stack3);
                                        stack3.pop();
                                        Stack<Matrix> stack4 = this.f51338g;
                                        Intrinsics.checkNotNull(stack4);
                                        stack4.pop();
                                        if (zF5) {
                                            E(this, use);
                                        }
                                        R(use);
                                    }
                                }
                            }
                        } else {
                            T(this.f51335d, use);
                            if (j()) {
                                SVG document2 = use.getDocument();
                                Intrinsics.checkNotNull(document2);
                                svgObjectResolveIRI = document2.resolveIRI(use.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String());
                                if (svgObjectResolveIRI == null) {
                                    String href2 = use.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String();
                                    Intrinsics.checkNotNull(href2);
                                    Companion.access$error(companion, "Use reference '%s' not found", href2);
                                } else {
                                    if (use.getTransform() != null) {
                                        canvas.concat(use.getTransform());
                                    }
                                    if (use.getX() != null) {
                                        SVG.Length x6 = use.getX();
                                        Intrinsics.checkNotNull(x6);
                                        fFloatValueX6 = x6.floatValueX(this);
                                    } else {
                                        fFloatValueX6 = 0.0f;
                                    }
                                    if (use.getY() != null) {
                                        SVG.Length y10 = use.getY();
                                        Intrinsics.checkNotNull(y10);
                                        fFloatValueY4 = y10.floatValueY(this);
                                    } else {
                                        fFloatValueY4 = 0.0f;
                                    }
                                    canvas.translate(fFloatValueX6, fFloatValueY4);
                                    e(this, use);
                                    zF5 = F();
                                    Stack<SVG.SvgContainer> stack5 = this.f51337f;
                                    Intrinsics.checkNotNull(stack5);
                                    stack5.push(use);
                                    Stack<Matrix> stack6 = this.f51338g;
                                    Intrinsics.checkNotNull(stack6);
                                    stack6.push(canvas.getMatrix());
                                    if (svgObjectResolveIRI instanceof SVG.Svg) {
                                        SVG.Box boxB3 = B(null, null, use.getWidth(), use.getHeight());
                                        P();
                                        SVG.Svg svg3 = (SVG.Svg) svgObjectResolveIRI;
                                        G(svg3, boxB3, svg3.getViewBox(), svg3.getPreserveAspectRatio());
                                        O();
                                    } else if (svgObjectResolveIRI instanceof SVG.Symbol) {
                                        if (use.getWidth() != null) {
                                            length = use.getWidth();
                                        } else {
                                            length = new SVG.Length(100.0f, SVG.Unit.percent);
                                        }
                                        if (use.getHeight() != null) {
                                            length2 = use.getHeight();
                                        } else {
                                            length2 = new SVG.Length(100.0f, SVG.Unit.percent);
                                        }
                                        boxB = B(null, null, length, length2);
                                        P();
                                        symbol = (SVG.Symbol) svgObjectResolveIRI;
                                        Object[] objArr3 = new Object[0];
                                        companion.getClass();
                                        if (boxB.getWidth() != 0.0f) {
                                            if (symbol.getPreserveAspectRatio() != null) {
                                                letterbox = symbol.getPreserveAspectRatio();
                                            } else {
                                                letterbox = PreserveAspectRatio.INSTANCE.getLETTERBOX();
                                            }
                                            T(this.f51335d, symbol);
                                            f fVar17 = this.f51335d;
                                            Intrinsics.checkNotNull(fVar17);
                                            fVar17.f51370f = boxB;
                                            f fVar18 = this.f51335d;
                                            Intrinsics.checkNotNull(fVar18);
                                            SVG.Style style2 = fVar18.f51365a;
                                            Intrinsics.checkNotNull(style2);
                                            overflow2 = style2.getOverflow();
                                            Intrinsics.checkNotNull(overflow2);
                                            if (!overflow2.booleanValue()) {
                                                f fVar19 = this.f51335d;
                                                Intrinsics.checkNotNull(fVar19);
                                                SVG.Box box8 = fVar19.f51370f;
                                                Intrinsics.checkNotNull(box8);
                                                float minX3 = box8.getMinX();
                                                f fVar110 = this.f51335d;
                                                Intrinsics.checkNotNull(fVar110);
                                                SVG.Box box9 = fVar110.f51370f;
                                                Intrinsics.checkNotNull(box9);
                                                float minY2 = box9.getMinY();
                                                f fVar111 = this.f51335d;
                                                Intrinsics.checkNotNull(fVar111);
                                                SVG.Box box10 = fVar111.f51370f;
                                                Intrinsics.checkNotNull(box10);
                                                float width3 = box10.getWidth();
                                                f fVar112 = this.f51335d;
                                                Intrinsics.checkNotNull(fVar112);
                                                SVG.Box box11 = fVar112.f51370f;
                                                Intrinsics.checkNotNull(box11);
                                                M(minX3, minY2, width3, box11.getHeight());
                                            }
                                            if (symbol.getViewBox() != null) {
                                                f fVar113 = this.f51335d;
                                                Intrinsics.checkNotNull(fVar113);
                                                canvas.concat(d(fVar113.f51370f, symbol.getViewBox(), letterbox));
                                                f fVar114 = this.f51335d;
                                                Intrinsics.checkNotNull(fVar114);
                                                fVar114.f51371g = symbol.getViewBox();
                                            } else {
                                                f fVar115 = this.f51335d;
                                                Intrinsics.checkNotNull(fVar115);
                                                SVG.Box box12 = fVar115.f51370f;
                                                Intrinsics.checkNotNull(box12);
                                                float minX4 = box12.getMinX();
                                                f fVar116 = this.f51335d;
                                                Intrinsics.checkNotNull(fVar116);
                                                SVG.Box box13 = fVar116.f51370f;
                                                Intrinsics.checkNotNull(box13);
                                                canvas.translate(minX4, box13.getMinY());
                                            }
                                            zF6 = F();
                                            I(symbol, true);
                                            if (zF6) {
                                                E(this, symbol);
                                            }
                                            R(symbol);
                                        }
                                        O();
                                    } else {
                                        H(svgObjectResolveIRI);
                                    }
                                    Stack<SVG.SvgContainer> stack7 = this.f51337f;
                                    Intrinsics.checkNotNull(stack7);
                                    stack7.pop();
                                    Stack<Matrix> stack8 = this.f51338g;
                                    Intrinsics.checkNotNull(stack8);
                                    stack8.pop();
                                    if (zF5) {
                                        E(this, use);
                                    }
                                    R(use);
                                }
                            }
                        }
                    }
                } else if (use.getHeight() != null) {
                    height = use.getHeight();
                    Intrinsics.checkNotNull(height);
                    if (!height.isZero()) {
                        T(this.f51335d, use);
                        if (j()) {
                            SVG document3 = use.getDocument();
                            Intrinsics.checkNotNull(document3);
                            svgObjectResolveIRI = document3.resolveIRI(use.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String());
                            if (svgObjectResolveIRI == null) {
                                String href3 = use.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String();
                                Intrinsics.checkNotNull(href3);
                                Companion.access$error(companion, "Use reference '%s' not found", href3);
                            } else {
                                if (use.getTransform() != null) {
                                    canvas.concat(use.getTransform());
                                }
                                if (use.getX() != null) {
                                    SVG.Length x7 = use.getX();
                                    Intrinsics.checkNotNull(x7);
                                    fFloatValueX6 = x7.floatValueX(this);
                                } else {
                                    fFloatValueX6 = 0.0f;
                                }
                                if (use.getY() != null) {
                                    SVG.Length y11 = use.getY();
                                    Intrinsics.checkNotNull(y11);
                                    fFloatValueY4 = y11.floatValueY(this);
                                } else {
                                    fFloatValueY4 = 0.0f;
                                }
                                canvas.translate(fFloatValueX6, fFloatValueY4);
                                e(this, use);
                                zF5 = F();
                                Stack<SVG.SvgContainer> stack9 = this.f51337f;
                                Intrinsics.checkNotNull(stack9);
                                stack9.push(use);
                                Stack<Matrix> stack10 = this.f51338g;
                                Intrinsics.checkNotNull(stack10);
                                stack10.push(canvas.getMatrix());
                                if (svgObjectResolveIRI instanceof SVG.Svg) {
                                    SVG.Box boxB4 = B(null, null, use.getWidth(), use.getHeight());
                                    P();
                                    SVG.Svg svg4 = (SVG.Svg) svgObjectResolveIRI;
                                    G(svg4, boxB4, svg4.getViewBox(), svg4.getPreserveAspectRatio());
                                    O();
                                } else if (svgObjectResolveIRI instanceof SVG.Symbol) {
                                    if (use.getWidth() != null) {
                                        length = use.getWidth();
                                    } else {
                                        length = new SVG.Length(100.0f, SVG.Unit.percent);
                                    }
                                    if (use.getHeight() != null) {
                                        length2 = use.getHeight();
                                    } else {
                                        length2 = new SVG.Length(100.0f, SVG.Unit.percent);
                                    }
                                    boxB = B(null, null, length, length2);
                                    P();
                                    symbol = (SVG.Symbol) svgObjectResolveIRI;
                                    Object[] objArr4 = new Object[0];
                                    companion.getClass();
                                    if (boxB.getWidth() != 0.0f) {
                                        if (symbol.getPreserveAspectRatio() != null) {
                                            letterbox = symbol.getPreserveAspectRatio();
                                        } else {
                                            letterbox = PreserveAspectRatio.INSTANCE.getLETTERBOX();
                                        }
                                        T(this.f51335d, symbol);
                                        f fVar117 = this.f51335d;
                                        Intrinsics.checkNotNull(fVar117);
                                        fVar117.f51370f = boxB;
                                        f fVar118 = this.f51335d;
                                        Intrinsics.checkNotNull(fVar118);
                                        SVG.Style style3 = fVar118.f51365a;
                                        Intrinsics.checkNotNull(style3);
                                        overflow2 = style3.getOverflow();
                                        Intrinsics.checkNotNull(overflow2);
                                        if (!overflow2.booleanValue()) {
                                            f fVar119 = this.f51335d;
                                            Intrinsics.checkNotNull(fVar119);
                                            SVG.Box box14 = fVar119.f51370f;
                                            Intrinsics.checkNotNull(box14);
                                            float minX5 = box14.getMinX();
                                            f fVar1110 = this.f51335d;
                                            Intrinsics.checkNotNull(fVar1110);
                                            SVG.Box box15 = fVar1110.f51370f;
                                            Intrinsics.checkNotNull(box15);
                                            float minY3 = box15.getMinY();
                                            f fVar1111 = this.f51335d;
                                            Intrinsics.checkNotNull(fVar1111);
                                            SVG.Box box16 = fVar1111.f51370f;
                                            Intrinsics.checkNotNull(box16);
                                            float width4 = box16.getWidth();
                                            f fVar1112 = this.f51335d;
                                            Intrinsics.checkNotNull(fVar1112);
                                            SVG.Box box17 = fVar1112.f51370f;
                                            Intrinsics.checkNotNull(box17);
                                            M(minX5, minY3, width4, box17.getHeight());
                                        }
                                        if (symbol.getViewBox() != null) {
                                            f fVar1113 = this.f51335d;
                                            Intrinsics.checkNotNull(fVar1113);
                                            canvas.concat(d(fVar1113.f51370f, symbol.getViewBox(), letterbox));
                                            f fVar1114 = this.f51335d;
                                            Intrinsics.checkNotNull(fVar1114);
                                            fVar1114.f51371g = symbol.getViewBox();
                                        } else {
                                            f fVar1115 = this.f51335d;
                                            Intrinsics.checkNotNull(fVar1115);
                                            SVG.Box box18 = fVar1115.f51370f;
                                            Intrinsics.checkNotNull(box18);
                                            float minX6 = box18.getMinX();
                                            f fVar1116 = this.f51335d;
                                            Intrinsics.checkNotNull(fVar1116);
                                            SVG.Box box19 = fVar1116.f51370f;
                                            Intrinsics.checkNotNull(box19);
                                            canvas.translate(minX6, box19.getMinY());
                                        }
                                        zF6 = F();
                                        I(symbol, true);
                                        if (zF6) {
                                            E(this, symbol);
                                        }
                                        R(symbol);
                                    }
                                    O();
                                } else {
                                    H(svgObjectResolveIRI);
                                }
                                Stack<SVG.SvgContainer> stack11 = this.f51337f;
                                Intrinsics.checkNotNull(stack11);
                                stack11.pop();
                                Stack<Matrix> stack12 = this.f51338g;
                                Intrinsics.checkNotNull(stack12);
                                stack12.pop();
                                if (zF5) {
                                    E(this, use);
                                }
                                R(use);
                            }
                        }
                    }
                } else {
                    T(this.f51335d, use);
                    if (j()) {
                        SVG document4 = use.getDocument();
                        Intrinsics.checkNotNull(document4);
                        svgObjectResolveIRI = document4.resolveIRI(use.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String());
                        if (svgObjectResolveIRI == null) {
                            String href4 = use.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String();
                            Intrinsics.checkNotNull(href4);
                            Companion.access$error(companion, "Use reference '%s' not found", href4);
                        } else {
                            if (use.getTransform() != null) {
                                canvas.concat(use.getTransform());
                            }
                            if (use.getX() != null) {
                                SVG.Length x10 = use.getX();
                                Intrinsics.checkNotNull(x10);
                                fFloatValueX6 = x10.floatValueX(this);
                            } else {
                                fFloatValueX6 = 0.0f;
                            }
                            if (use.getY() != null) {
                                SVG.Length y12 = use.getY();
                                Intrinsics.checkNotNull(y12);
                                fFloatValueY4 = y12.floatValueY(this);
                            } else {
                                fFloatValueY4 = 0.0f;
                            }
                            canvas.translate(fFloatValueX6, fFloatValueY4);
                            e(this, use);
                            zF5 = F();
                            Stack<SVG.SvgContainer> stack13 = this.f51337f;
                            Intrinsics.checkNotNull(stack13);
                            stack13.push(use);
                            Stack<Matrix> stack14 = this.f51338g;
                            Intrinsics.checkNotNull(stack14);
                            stack14.push(canvas.getMatrix());
                            if (svgObjectResolveIRI instanceof SVG.Svg) {
                                SVG.Box boxB5 = B(null, null, use.getWidth(), use.getHeight());
                                P();
                                SVG.Svg svg5 = (SVG.Svg) svgObjectResolveIRI;
                                G(svg5, boxB5, svg5.getViewBox(), svg5.getPreserveAspectRatio());
                                O();
                            } else if (svgObjectResolveIRI instanceof SVG.Symbol) {
                                if (use.getWidth() != null) {
                                    length = use.getWidth();
                                } else {
                                    length = new SVG.Length(100.0f, SVG.Unit.percent);
                                }
                                if (use.getHeight() != null) {
                                    length2 = use.getHeight();
                                } else {
                                    length2 = new SVG.Length(100.0f, SVG.Unit.percent);
                                }
                                boxB = B(null, null, length, length2);
                                P();
                                symbol = (SVG.Symbol) svgObjectResolveIRI;
                                Object[] objArr5 = new Object[0];
                                companion.getClass();
                                if (boxB.getWidth() != 0.0f) {
                                    if (symbol.getPreserveAspectRatio() != null) {
                                        letterbox = symbol.getPreserveAspectRatio();
                                    } else {
                                        letterbox = PreserveAspectRatio.INSTANCE.getLETTERBOX();
                                    }
                                    T(this.f51335d, symbol);
                                    f fVar1117 = this.f51335d;
                                    Intrinsics.checkNotNull(fVar1117);
                                    fVar1117.f51370f = boxB;
                                    f fVar1118 = this.f51335d;
                                    Intrinsics.checkNotNull(fVar1118);
                                    SVG.Style style4 = fVar1118.f51365a;
                                    Intrinsics.checkNotNull(style4);
                                    overflow2 = style4.getOverflow();
                                    Intrinsics.checkNotNull(overflow2);
                                    if (!overflow2.booleanValue()) {
                                        f fVar1119 = this.f51335d;
                                        Intrinsics.checkNotNull(fVar1119);
                                        SVG.Box box110 = fVar1119.f51370f;
                                        Intrinsics.checkNotNull(box110);
                                        float minX7 = box110.getMinX();
                                        f fVar11110 = this.f51335d;
                                        Intrinsics.checkNotNull(fVar11110);
                                        SVG.Box box111 = fVar11110.f51370f;
                                        Intrinsics.checkNotNull(box111);
                                        float minY4 = box111.getMinY();
                                        f fVar11111 = this.f51335d;
                                        Intrinsics.checkNotNull(fVar11111);
                                        SVG.Box box112 = fVar11111.f51370f;
                                        Intrinsics.checkNotNull(box112);
                                        float width5 = box112.getWidth();
                                        f fVar11112 = this.f51335d;
                                        Intrinsics.checkNotNull(fVar11112);
                                        SVG.Box box113 = fVar11112.f51370f;
                                        Intrinsics.checkNotNull(box113);
                                        M(minX7, minY4, width5, box113.getHeight());
                                    }
                                    if (symbol.getViewBox() != null) {
                                        f fVar11113 = this.f51335d;
                                        Intrinsics.checkNotNull(fVar11113);
                                        canvas.concat(d(fVar11113.f51370f, symbol.getViewBox(), letterbox));
                                        f fVar11114 = this.f51335d;
                                        Intrinsics.checkNotNull(fVar11114);
                                        fVar11114.f51371g = symbol.getViewBox();
                                    } else {
                                        f fVar11115 = this.f51335d;
                                        Intrinsics.checkNotNull(fVar11115);
                                        SVG.Box box114 = fVar11115.f51370f;
                                        Intrinsics.checkNotNull(box114);
                                        float minX8 = box114.getMinX();
                                        f fVar11116 = this.f51335d;
                                        Intrinsics.checkNotNull(fVar11116);
                                        SVG.Box box115 = fVar11116.f51370f;
                                        Intrinsics.checkNotNull(box115);
                                        canvas.translate(minX8, box115.getMinY());
                                    }
                                    zF6 = F();
                                    I(symbol, true);
                                    if (zF6) {
                                        E(this, symbol);
                                    }
                                    R(symbol);
                                }
                                O();
                            } else {
                                H(svgObjectResolveIRI);
                            }
                            Stack<SVG.SvgContainer> stack15 = this.f51337f;
                            Intrinsics.checkNotNull(stack15);
                            stack15.pop();
                            Stack<Matrix> stack16 = this.f51338g;
                            Intrinsics.checkNotNull(stack16);
                            stack16.pop();
                            if (zF5) {
                                E(this, use);
                            }
                            R(use);
                        }
                    }
                }
            } else if (svgObject instanceof SVG.Switch) {
                SVG.Switch r15 = (SVG.Switch) svgObject;
                Object[] objArr6 = new Object[0];
                INSTANCE.getClass();
                T(this.f51335d, r15);
                if (j()) {
                    if (r15.getTransform() != null) {
                        canvas.concat(r15.getTransform());
                    }
                    e(this, r15);
                    boolean zF7 = F();
                    String language = Locale.getDefault().getLanguage();
                    SVGExternalFileResolver externalFileResolver = SVG.INSTANCE.getExternalFileResolver();
                    loop0: for (SVG.SvgObject svgObject2 : r15.getChildren()) {
                        if (svgObject2 instanceof SVG.SvgConditional) {
                            SVG.SvgConditional svgConditional = (SVG.SvgConditional) svgObject2;
                            if (svgConditional.getRequiredExtensions() == null && ((systemLanguage = svgConditional.getSystemLanguage()) == null || (!systemLanguage.isEmpty() && systemLanguage.contains(language)))) {
                                Set<String> requiredFeatures = svgConditional.getRequiredFeatures();
                                if (requiredFeatures != null) {
                                    if (f51331i == null) {
                                        Companion.access$initialiseSupportedFeaturesMap(INSTANCE);
                                    }
                                    if (requiredFeatures.isEmpty()) {
                                        continue;
                                    } else {
                                        HashSet<String> hashSet = f51331i;
                                        Intrinsics.checkNotNull(hashSet);
                                        if (!hashSet.containsAll(requiredFeatures)) {
                                            continue;
                                        }
                                    }
                                }
                                Set<String> requiredFormats = svgConditional.getRequiredFormats();
                                if (requiredFormats != null) {
                                    if (!requiredFormats.isEmpty() && externalFileResolver != null) {
                                        Iterator<String> it = requiredFormats.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                if (!externalFileResolver.isFormatSupported(it.next())) {
                                                }
                                            }
                                        }
                                    }
                                }
                                Set<String> requiredFonts = svgConditional.getRequiredFonts();
                                if (requiredFonts != null) {
                                    if (!requiredFonts.isEmpty() && externalFileResolver != null) {
                                        Iterator<String> it2 = requiredFonts.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                String next = it2.next();
                                                f fVar20 = this.f51335d;
                                                Intrinsics.checkNotNull(fVar20);
                                                SVG.Style style5 = fVar20.f51365a;
                                                Intrinsics.checkNotNull(style5);
                                                Integer fontWeight = style5.getFontWeight();
                                                Intrinsics.checkNotNull(fontWeight);
                                                int iIntValue = fontWeight.intValue();
                                                f fVar21 = this.f51335d;
                                                Intrinsics.checkNotNull(fVar21);
                                                SVG.Style style6 = fVar21.f51365a;
                                                Intrinsics.checkNotNull(style6);
                                                if (externalFileResolver.resolveFont(next, iIntValue, String.valueOf(style6.getFontStyle())) == null) {
                                                }
                                            }
                                        }
                                    }
                                }
                                H(svgObject2);
                                break loop0;
                            }
                        }
                    }
                    if (zF7) {
                        E(this, r15);
                    }
                    R(r15);
                }
            } else if (svgObject instanceof SVG.Group) {
                SVG.Group group = (SVG.Group) svgObject;
                Companion companion2 = INSTANCE;
                u.f(group.getNodeName(), " render");
                Object[] objArr7 = new Object[0];
                companion2.getClass();
                T(this.f51335d, group);
                if (j()) {
                    if (group.getTransform() != null) {
                        canvas.concat(group.getTransform());
                    }
                    e(this, group);
                    boolean zF8 = F();
                    I(group, true);
                    if (zF8) {
                        E(this, group);
                    }
                    R(group);
                }
            } else if (svgObject instanceof SVG.Image) {
                SVG.Image image = (SVG.Image) svgObject;
                Object[] objArr8 = new Object[0];
                INSTANCE.getClass();
                if (image.getWidth() != null) {
                    SVG.Length width6 = image.getWidth();
                    Intrinsics.checkNotNull(width6);
                    if (!width6.isZero() && image.getHeight() != null) {
                        SVG.Length height2 = image.getHeight();
                        Intrinsics.checkNotNull(height2);
                        if (!height2.isZero() && image.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String() != null) {
                            PreserveAspectRatio preserveAspectRatio = image.getPreserveAspectRatio() != null ? image.getPreserveAspectRatio() : PreserveAspectRatio.INSTANCE.getLETTERBOX();
                            String href5 = image.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String();
                            Intrinsics.checkNotNull(href5);
                            if (l.startsWith$default(href5, "data:", false, 2, null) && href5.length() >= 14 && (iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) href5, AbstractJsonLexerKt.COMMA, 0, false, 6, (Object) null)) >= 12) {
                                String strSubstring = href5.substring(iIndexOf$default - 7, iIndexOf$default);
                                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                                if (Intrinsics.areEqual(";base64", strSubstring)) {
                                    try {
                                        String strSubstring2 = href5.substring(iIndexOf$default + 1);
                                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                                        byte[] bArrDecode = Base64.decode(strSubstring2, 0);
                                        bitmapResolveImage = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            if (bitmapResolveImage == null) {
                                SVGExternalFileResolver externalFileResolver2 = SVG.INSTANCE.getExternalFileResolver();
                                if (externalFileResolver2 != null) {
                                    bitmapResolveImage = externalFileResolver2.resolveImage(image.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String());
                                    if (bitmapResolveImage == null) {
                                        Companion companion3 = INSTANCE;
                                        String href6 = image.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String();
                                        Intrinsics.checkNotNull(href6);
                                        Companion.access$error(companion3, "Could not locate image '%s'", href6);
                                    } else {
                                        box = new SVG.Box(0.0f, 0.0f, bitmapResolveImage.getWidth(), bitmapResolveImage.getHeight());
                                        T(this.f51335d, image);
                                        if (j()) {
                                            if (image.getTransform() != null) {
                                                canvas.concat(image.getTransform());
                                            }
                                            if (image.getX() != null) {
                                                SVG.Length x11 = image.getX();
                                                Intrinsics.checkNotNull(x11);
                                                fFloatValueX5 = x11.floatValueX(this);
                                            } else {
                                                fFloatValueX5 = 0.0f;
                                            }
                                            if (image.getY() != null) {
                                                SVG.Length y13 = image.getY();
                                                Intrinsics.checkNotNull(y13);
                                                fFloatValueY3 = y13.floatValueY(this);
                                            } else {
                                                fFloatValueY3 = 0.0f;
                                            }
                                            SVG.Length width7 = image.getWidth();
                                            Intrinsics.checkNotNull(width7);
                                            float fFloatValueX7 = width7.floatValueX(this);
                                            SVG.Length height3 = image.getHeight();
                                            Intrinsics.checkNotNull(height3);
                                            float fFloatValueX8 = height3.floatValueX(this);
                                            f fVar22 = this.f51335d;
                                            Intrinsics.checkNotNull(fVar22);
                                            fVar22.f51370f = new SVG.Box(fFloatValueX5, fFloatValueY3, fFloatValueX7, fFloatValueX8);
                                            f fVar23 = this.f51335d;
                                            Intrinsics.checkNotNull(fVar23);
                                            SVG.Style style7 = fVar23.f51365a;
                                            Intrinsics.checkNotNull(style7);
                                            overflow = style7.getOverflow();
                                            Intrinsics.checkNotNull(overflow);
                                            if (!overflow.booleanValue()) {
                                                f fVar24 = this.f51335d;
                                                Intrinsics.checkNotNull(fVar24);
                                                SVG.Box box20 = fVar24.f51370f;
                                                Intrinsics.checkNotNull(box20);
                                                float minX9 = box20.getMinX();
                                                f fVar25 = this.f51335d;
                                                Intrinsics.checkNotNull(fVar25);
                                                SVG.Box box21 = fVar25.f51370f;
                                                Intrinsics.checkNotNull(box21);
                                                float minY5 = box21.getMinY();
                                                f fVar26 = this.f51335d;
                                                Intrinsics.checkNotNull(fVar26);
                                                SVG.Box box22 = fVar26.f51370f;
                                                Intrinsics.checkNotNull(box22);
                                                float width8 = box22.getWidth();
                                                f fVar27 = this.f51335d;
                                                Intrinsics.checkNotNull(fVar27);
                                                SVG.Box box23 = fVar27.f51370f;
                                                Intrinsics.checkNotNull(box23);
                                                M(minX9, minY5, width8, box23.getHeight());
                                            }
                                            f fVar28 = this.f51335d;
                                            Intrinsics.checkNotNull(fVar28);
                                            image.setBoundingBox(fVar28.f51370f);
                                            R(image);
                                            e(this, image);
                                            zF4 = F();
                                            U();
                                            canvas.save();
                                            f fVar29 = this.f51335d;
                                            Intrinsics.checkNotNull(fVar29);
                                            canvas.concat(d(fVar29.f51370f, box, preserveAspectRatio));
                                            f fVar30 = this.f51335d;
                                            Intrinsics.checkNotNull(fVar30);
                                            SVG.Style style8 = fVar30.f51365a;
                                            Intrinsics.checkNotNull(style8);
                                            canvas.drawBitmap(bitmapResolveImage, 0.0f, 0.0f, new Paint(style8.getImageRendering() != SVG.Style.RenderQuality.optimizeSpeed ? 2 : 0));
                                            canvas.restore();
                                            if (zF4) {
                                                E(this, image);
                                            }
                                        }
                                    }
                                }
                            } else if (bitmapResolveImage == null) {
                                Companion companion4 = INSTANCE;
                                String href7 = image.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String();
                                Intrinsics.checkNotNull(href7);
                                Companion.access$error(companion4, "Could not locate image '%s'", href7);
                            } else {
                                box = new SVG.Box(0.0f, 0.0f, bitmapResolveImage.getWidth(), bitmapResolveImage.getHeight());
                                T(this.f51335d, image);
                                if (j() && V()) {
                                    if (image.getTransform() != null) {
                                        canvas.concat(image.getTransform());
                                    }
                                    if (image.getX() != null) {
                                        SVG.Length x12 = image.getX();
                                        Intrinsics.checkNotNull(x12);
                                        fFloatValueX5 = x12.floatValueX(this);
                                    } else {
                                        fFloatValueX5 = 0.0f;
                                    }
                                    if (image.getY() != null) {
                                        SVG.Length y14 = image.getY();
                                        Intrinsics.checkNotNull(y14);
                                        fFloatValueY3 = y14.floatValueY(this);
                                    } else {
                                        fFloatValueY3 = 0.0f;
                                    }
                                    SVG.Length width9 = image.getWidth();
                                    Intrinsics.checkNotNull(width9);
                                    float fFloatValueX9 = width9.floatValueX(this);
                                    SVG.Length height4 = image.getHeight();
                                    Intrinsics.checkNotNull(height4);
                                    float fFloatValueX10 = height4.floatValueX(this);
                                    f fVar210 = this.f51335d;
                                    Intrinsics.checkNotNull(fVar210);
                                    fVar210.f51370f = new SVG.Box(fFloatValueX5, fFloatValueY3, fFloatValueX9, fFloatValueX10);
                                    f fVar211 = this.f51335d;
                                    Intrinsics.checkNotNull(fVar211);
                                    SVG.Style style9 = fVar211.f51365a;
                                    Intrinsics.checkNotNull(style9);
                                    overflow = style9.getOverflow();
                                    Intrinsics.checkNotNull(overflow);
                                    if (!overflow.booleanValue()) {
                                        f fVar212 = this.f51335d;
                                        Intrinsics.checkNotNull(fVar212);
                                        SVG.Box box24 = fVar212.f51370f;
                                        Intrinsics.checkNotNull(box24);
                                        float minX10 = box24.getMinX();
                                        f fVar213 = this.f51335d;
                                        Intrinsics.checkNotNull(fVar213);
                                        SVG.Box box25 = fVar213.f51370f;
                                        Intrinsics.checkNotNull(box25);
                                        float minY6 = box25.getMinY();
                                        f fVar214 = this.f51335d;
                                        Intrinsics.checkNotNull(fVar214);
                                        SVG.Box box26 = fVar214.f51370f;
                                        Intrinsics.checkNotNull(box26);
                                        float width10 = box26.getWidth();
                                        f fVar215 = this.f51335d;
                                        Intrinsics.checkNotNull(fVar215);
                                        SVG.Box box27 = fVar215.f51370f;
                                        Intrinsics.checkNotNull(box27);
                                        M(minX10, minY6, width10, box27.getHeight());
                                    }
                                    f fVar216 = this.f51335d;
                                    Intrinsics.checkNotNull(fVar216);
                                    image.setBoundingBox(fVar216.f51370f);
                                    R(image);
                                    e(this, image);
                                    zF4 = F();
                                    U();
                                    canvas.save();
                                    f fVar217 = this.f51335d;
                                    Intrinsics.checkNotNull(fVar217);
                                    canvas.concat(d(fVar217.f51370f, box, preserveAspectRatio));
                                    f fVar31 = this.f51335d;
                                    Intrinsics.checkNotNull(fVar31);
                                    SVG.Style style10 = fVar31.f51365a;
                                    Intrinsics.checkNotNull(style10);
                                    canvas.drawBitmap(bitmapResolveImage, 0.0f, 0.0f, new Paint(style10.getImageRendering() != SVG.Style.RenderQuality.optimizeSpeed ? 2 : 0));
                                    canvas.restore();
                                    if (zF4) {
                                        E(this, image);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (svgObject instanceof SVG.Path) {
                SVG.Path path2 = (SVG.Path) svgObject;
                Object[] objArr9 = new Object[0];
                INSTANCE.getClass();
                if (path2.getD() != null) {
                    T(this.f51335d, path2);
                    if (j() && V()) {
                        f fVar32 = this.f51335d;
                        Intrinsics.checkNotNull(fVar32);
                        if (fVar32.f51367c) {
                            if (path2.getTransform() != null) {
                                canvas.concat(path2.getTransform());
                            }
                            path = new PathConverter(path2.getD()).getPath();
                            if (path2.getBoundingBox() == null) {
                                path2.setBoundingBox(b(path));
                            }
                            R(path2);
                            f(path2);
                            e(this, path2);
                            zF3 = F();
                            fVar5 = this.f51335d;
                            Intrinsics.checkNotNull(fVar5);
                            if (fVar5.f51366b) {
                                path.setFillType(v());
                                k(path2, path);
                            }
                            fVar6 = this.f51335d;
                            Intrinsics.checkNotNull(fVar6);
                            if (fVar6.f51367c) {
                                l(path);
                            }
                            K(path2);
                            if (zF3) {
                                E(this, path2);
                            }
                        } else {
                            f fVar33 = this.f51335d;
                            Intrinsics.checkNotNull(fVar33);
                            if (fVar33.f51366b) {
                                if (path2.getTransform() != null) {
                                    canvas.concat(path2.getTransform());
                                }
                                path = new PathConverter(path2.getD()).getPath();
                                if (path2.getBoundingBox() == null) {
                                    path2.setBoundingBox(b(path));
                                }
                                R(path2);
                                f(path2);
                                e(this, path2);
                                zF3 = F();
                                fVar5 = this.f51335d;
                                Intrinsics.checkNotNull(fVar5);
                                if (fVar5.f51366b) {
                                    path.setFillType(v());
                                    k(path2, path);
                                }
                                fVar6 = this.f51335d;
                                Intrinsics.checkNotNull(fVar6);
                                if (fVar6.f51367c) {
                                    l(path);
                                }
                                K(path2);
                                if (zF3) {
                                    E(this, path2);
                                }
                            }
                        }
                    }
                }
            } else if (svgObject instanceof SVG.Rect) {
                SVG.Rect rect = (SVG.Rect) svgObject;
                Object[] objArr10 = new Object[0];
                INSTANCE.getClass();
                if (rect.getWidth() != null && rect.getHeight() != null) {
                    SVG.Length width11 = rect.getWidth();
                    Intrinsics.checkNotNull(width11);
                    if (!width11.isZero()) {
                        SVG.Length height5 = rect.getHeight();
                        Intrinsics.checkNotNull(height5);
                        if (!height5.isZero()) {
                            T(this.f51335d, rect);
                            if (j() && V()) {
                                if (rect.getTransform() != null) {
                                    canvas.concat(rect.getTransform());
                                }
                                Path pathA = A(rect);
                                R(rect);
                                f(rect);
                                e(this, rect);
                                boolean zF9 = F();
                                f fVar34 = this.f51335d;
                                Intrinsics.checkNotNull(fVar34);
                                if (fVar34.f51366b) {
                                    k(rect, pathA);
                                }
                                f fVar35 = this.f51335d;
                                Intrinsics.checkNotNull(fVar35);
                                if (fVar35.f51367c) {
                                    l(pathA);
                                }
                                if (zF9) {
                                    E(this, rect);
                                }
                            }
                        }
                    }
                }
            } else if (svgObject instanceof SVG.Circle) {
                SVG.Circle circle = (SVG.Circle) svgObject;
                Object[] objArr11 = new Object[0];
                INSTANCE.getClass();
                if (circle.getR() != null) {
                    SVG.Length r3 = circle.getR();
                    Intrinsics.checkNotNull(r3);
                    if (!r3.isZero()) {
                        T(this.f51335d, circle);
                        if (j() && V()) {
                            if (circle.getTransform() != null) {
                                canvas.concat(circle.getTransform());
                            }
                            Path pathX = x(circle);
                            R(circle);
                            f(circle);
                            e(this, circle);
                            boolean zF10 = F();
                            f fVar36 = this.f51335d;
                            Intrinsics.checkNotNull(fVar36);
                            if (fVar36.f51366b) {
                                k(circle, pathX);
                            }
                            f fVar37 = this.f51335d;
                            Intrinsics.checkNotNull(fVar37);
                            if (fVar37.f51367c) {
                                l(pathX);
                            }
                            if (zF10) {
                                E(this, circle);
                            }
                        }
                    }
                }
            } else if (svgObject instanceof SVG.Ellipse) {
                SVG.Ellipse ellipse = (SVG.Ellipse) svgObject;
                Object[] objArr12 = new Object[0];
                INSTANCE.getClass();
                if (ellipse.getRx() != null && ellipse.getRy() != null) {
                    SVG.Length rx = ellipse.getRx();
                    Intrinsics.checkNotNull(rx);
                    if (!rx.isZero()) {
                        SVG.Length ry = ellipse.getRy();
                        Intrinsics.checkNotNull(ry);
                        if (!ry.isZero()) {
                            T(this.f51335d, ellipse);
                            if (j() && V()) {
                                if (ellipse.getTransform() != null) {
                                    canvas.concat(ellipse.getTransform());
                                }
                                Path pathY = y(ellipse);
                                R(ellipse);
                                f(ellipse);
                                e(this, ellipse);
                                boolean zF11 = F();
                                f fVar38 = this.f51335d;
                                Intrinsics.checkNotNull(fVar38);
                                if (fVar38.f51366b) {
                                    k(ellipse, pathY);
                                }
                                f fVar39 = this.f51335d;
                                Intrinsics.checkNotNull(fVar39);
                                if (fVar39.f51367c) {
                                    l(pathY);
                                }
                                if (zF11) {
                                    E(this, ellipse);
                                }
                            }
                        }
                    }
                }
            } else if (svgObject instanceof SVG.Line) {
                SVG.Line line = (SVG.Line) svgObject;
                Object[] objArr13 = new Object[0];
                INSTANCE.getClass();
                T(this.f51335d, line);
                if (j() && V()) {
                    f fVar40 = this.f51335d;
                    Intrinsics.checkNotNull(fVar40);
                    if (fVar40.f51367c) {
                        if (line.getTransform() != null) {
                            canvas.concat(line.getTransform());
                        }
                        if (line.getX1() == null) {
                            fFloatValueX3 = 0.0f;
                        } else {
                            SVG.Length x13 = line.getX1();
                            Intrinsics.checkNotNull(x13);
                            fFloatValueX3 = x13.floatValueX(this);
                        }
                        if (line.getY1() == null) {
                            fFloatValueY2 = 0.0f;
                        } else {
                            SVG.Length y15 = line.getY1();
                            Intrinsics.checkNotNull(y15);
                            fFloatValueY2 = y15.floatValueY(this);
                        }
                        if (line.getX2() == null) {
                            fFloatValueX4 = 0.0f;
                        } else {
                            SVG.Length x14 = line.getX2();
                            Intrinsics.checkNotNull(x14);
                            fFloatValueX4 = x14.floatValueX(this);
                        }
                        if (line.getY2() != null) {
                            SVG.Length y16 = line.getY2();
                            Intrinsics.checkNotNull(y16);
                            fFloatValueY5 = y16.floatValueY(this);
                        }
                        if (line.getBoundingBox() == null) {
                            line.setBoundingBox(new SVG.Box(Math.min(fFloatValueX3, fFloatValueX4), Math.min(fFloatValueY2, fFloatValueY5), Math.abs(fFloatValueX4 - fFloatValueX3), Math.abs(fFloatValueY5 - fFloatValueY2)));
                        }
                        Path path3 = new Path();
                        path3.moveTo(fFloatValueX3, fFloatValueY2);
                        path3.lineTo(fFloatValueX4, fFloatValueY5);
                        R(line);
                        f(line);
                        e(this, line);
                        boolean zF12 = F();
                        l(path3);
                        K(line);
                        if (zF12) {
                            E(this, line);
                        }
                    }
                }
            } else if (svgObject instanceof SVG.Polygon) {
                SVG.Polygon polygon = (SVG.Polygon) svgObject;
                Object[] objArr14 = new Object[0];
                INSTANCE.getClass();
                T(this.f51335d, polygon);
                if (j() && V()) {
                    f fVar41 = this.f51335d;
                    Intrinsics.checkNotNull(fVar41);
                    if (fVar41.f51367c) {
                        if (polygon.getTransform() != null) {
                            canvas.concat(polygon.getTransform());
                        }
                        points2 = polygon.getPoints();
                        Intrinsics.checkNotNull(points2);
                        if (points2.length >= 2) {
                            pathZ2 = z(polygon);
                            R(polygon);
                            f(polygon);
                            e(this, polygon);
                            zF2 = F();
                            fVar3 = this.f51335d;
                            Intrinsics.checkNotNull(fVar3);
                            if (fVar3.f51366b) {
                                k(polygon, pathZ2);
                            }
                            fVar4 = this.f51335d;
                            Intrinsics.checkNotNull(fVar4);
                            if (fVar4.f51367c) {
                                l(pathZ2);
                            }
                            K(polygon);
                            if (zF2) {
                                E(this, polygon);
                            }
                        }
                    } else {
                        f fVar42 = this.f51335d;
                        Intrinsics.checkNotNull(fVar42);
                        if (fVar42.f51366b) {
                            if (polygon.getTransform() != null) {
                                canvas.concat(polygon.getTransform());
                            }
                            points2 = polygon.getPoints();
                            Intrinsics.checkNotNull(points2);
                            if (points2.length >= 2) {
                                pathZ2 = z(polygon);
                                R(polygon);
                                f(polygon);
                                e(this, polygon);
                                zF2 = F();
                                fVar3 = this.f51335d;
                                Intrinsics.checkNotNull(fVar3);
                                if (fVar3.f51366b) {
                                    k(polygon, pathZ2);
                                }
                                fVar4 = this.f51335d;
                                Intrinsics.checkNotNull(fVar4);
                                if (fVar4.f51367c) {
                                    l(pathZ2);
                                }
                                K(polygon);
                                if (zF2) {
                                    E(this, polygon);
                                }
                            }
                        }
                    }
                }
            } else if (svgObject instanceof SVG.PolyLine) {
                SVG.PolyLine polyLine = (SVG.PolyLine) svgObject;
                Object[] objArr15 = new Object[0];
                INSTANCE.getClass();
                T(this.f51335d, polyLine);
                if (j() && V()) {
                    f fVar43 = this.f51335d;
                    Intrinsics.checkNotNull(fVar43);
                    if (fVar43.f51367c) {
                        if (polyLine.getTransform() != null) {
                            canvas.concat(polyLine.getTransform());
                        }
                        points = polyLine.getPoints();
                        Intrinsics.checkNotNull(points);
                        if (points.length >= 2) {
                            pathZ = z(polyLine);
                            R(polyLine);
                            pathZ.setFillType(v());
                            f(polyLine);
                            e(this, polyLine);
                            zF = F();
                            fVar = this.f51335d;
                            Intrinsics.checkNotNull(fVar);
                            if (fVar.f51366b) {
                                k(polyLine, pathZ);
                            }
                            fVar2 = this.f51335d;
                            Intrinsics.checkNotNull(fVar2);
                            if (fVar2.f51367c) {
                                l(pathZ);
                            }
                            K(polyLine);
                            if (zF) {
                                E(this, polyLine);
                            }
                        }
                    } else {
                        f fVar44 = this.f51335d;
                        Intrinsics.checkNotNull(fVar44);
                        if (fVar44.f51366b) {
                            if (polyLine.getTransform() != null) {
                                canvas.concat(polyLine.getTransform());
                            }
                            points = polyLine.getPoints();
                            Intrinsics.checkNotNull(points);
                            if (points.length >= 2) {
                                pathZ = z(polyLine);
                                R(polyLine);
                                pathZ.setFillType(v());
                                f(polyLine);
                                e(this, polyLine);
                                zF = F();
                                fVar = this.f51335d;
                                Intrinsics.checkNotNull(fVar);
                                if (fVar.f51366b) {
                                    k(polyLine, pathZ);
                                }
                                fVar2 = this.f51335d;
                                Intrinsics.checkNotNull(fVar2);
                                if (fVar2.f51367c) {
                                    l(pathZ);
                                }
                                K(polyLine);
                                if (zF) {
                                    E(this, polyLine);
                                }
                            }
                        }
                    }
                }
            } else if (svgObject instanceof SVG.Text) {
                SVG.Text text = (SVG.Text) svgObject;
                Object[] objArr16 = new Object[0];
                INSTANCE.getClass();
                T(this.f51335d, text);
                if (j()) {
                    if (text.getTransform() != null) {
                        canvas.concat(text.getTransform());
                    }
                    if (text.getX() != null) {
                        List<SVG.Length> x15 = text.getX();
                        Intrinsics.checkNotNull(x15);
                        if (x15.size() == 0) {
                            fFloatValueX = 0.0f;
                        } else {
                            List<SVG.Length> x16 = text.getX();
                            Intrinsics.checkNotNull(x16);
                            fFloatValueX = x16.get(0).floatValueX(this);
                        }
                    } else {
                        fFloatValueX = 0.0f;
                    }
                    if (text.getY() != null) {
                        List<SVG.Length> y17 = text.getY();
                        Intrinsics.checkNotNull(y17);
                        if (y17.size() == 0) {
                            fFloatValueY = 0.0f;
                        } else {
                            List<SVG.Length> y18 = text.getY();
                            Intrinsics.checkNotNull(y18);
                            fFloatValueY = y18.get(0).floatValueY(this);
                        }
                    } else {
                        fFloatValueY = 0.0f;
                    }
                    if (text.getDx() != null) {
                        List<SVG.Length> dx = text.getDx();
                        Intrinsics.checkNotNull(dx);
                        if (dx.size() == 0) {
                            fFloatValueX2 = 0.0f;
                        } else {
                            List<SVG.Length> dx2 = text.getDx();
                            Intrinsics.checkNotNull(dx2);
                            fFloatValueX2 = dx2.get(0).floatValueX(this);
                        }
                    } else {
                        fFloatValueX2 = 0.0f;
                    }
                    if (text.getDy() != null) {
                        List<SVG.Length> dy = text.getDy();
                        Intrinsics.checkNotNull(dy);
                        if (dy.size() != 0) {
                            List<SVG.Length> dy2 = text.getDy();
                            Intrinsics.checkNotNull(dy2);
                            fFloatValueY5 = dy2.get(0).floatValueY(this);
                        }
                    }
                    SVG.Style.TextAnchor textAnchorT = t();
                    if (textAnchorT != SVG.Style.TextAnchor.Start) {
                        float fC = c(text);
                        if (textAnchorT == SVG.Style.TextAnchor.Middle) {
                            fC /= 2;
                        }
                        fFloatValueX -= fC;
                    }
                    if (text.getBoundingBox() == null) {
                        g gVar = new g(fFloatValueX, fFloatValueY);
                        m(text, gVar);
                        RectF rectF = gVar.f51375c;
                        text.setBoundingBox(new SVG.Box(rectF.left, rectF.top, rectF.width(), rectF.height()));
                    }
                    R(text);
                    f(text);
                    e(this, text);
                    boolean zF13 = F();
                    m(text, new d(fFloatValueX + fFloatValueX2, fFloatValueY + fFloatValueY5));
                    if (zF13) {
                        E(this, text);
                    }
                }
            }
        }
        O();
    }

    public final void I(SVG.SvgContainer svgContainer, boolean z10) {
        if (z10) {
            Stack<SVG.SvgContainer> stack = this.f51337f;
            Intrinsics.checkNotNull(stack);
            stack.push(svgContainer);
            Stack<Matrix> stack2 = this.f51338g;
            Intrinsics.checkNotNull(stack2);
            stack2.push(this.f51332a.getMatrix());
        }
        Intrinsics.checkNotNull(svgContainer);
        Iterator<SVG.SvgObject> it = svgContainer.getChildren().iterator();
        while (it.hasNext()) {
            H(it.next());
        }
        if (z10) {
            Stack<SVG.SvgContainer> stack3 = this.f51337f;
            Intrinsics.checkNotNull(stack3);
            stack3.pop();
            Stack<Matrix> stack4 = this.f51338g;
            Intrinsics.checkNotNull(stack4);
            stack4.pop();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017d, code lost:
    
        if (r10 != 8) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(com.mastercard.sonic.androidsvg.SVG.Marker r13, com.mastercard.sonic.androidsvg.SVGAndroidRenderer.b r14) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mastercard.sonic.androidsvg.SVGAndroidRenderer.J(com.mastercard.sonic.androidsvg.SVG$Marker, com.mastercard.sonic.androidsvg.SVGAndroidRenderer$b):void");
    }

    public final void K(SVG.GraphicsElement graphicsElement) {
        SVG.Marker marker;
        SVG.Marker marker2;
        SVG.Marker marker3;
        float f6;
        float f10;
        ArrayList arrayList;
        float fFloatValueX;
        float fFloatValueY;
        float fFloatValueX2;
        float fFloatValueY2;
        int size;
        f fVar = this.f51335d;
        Intrinsics.checkNotNull(fVar);
        SVG.Style style = fVar.f51365a;
        Intrinsics.checkNotNull(style);
        if (style.getMarkerStart() == null) {
            f fVar2 = this.f51335d;
            Intrinsics.checkNotNull(fVar2);
            SVG.Style style2 = fVar2.f51365a;
            Intrinsics.checkNotNull(style2);
            if (style2.getMarkerMid() == null) {
                f fVar3 = this.f51335d;
                Intrinsics.checkNotNull(fVar3);
                SVG.Style style3 = fVar3.f51365a;
                Intrinsics.checkNotNull(style3);
                if (style3.getMarkerEnd() == null) {
                    return;
                }
            }
        }
        f fVar4 = this.f51335d;
        Intrinsics.checkNotNull(fVar4);
        SVG.Style style4 = fVar4.f51365a;
        Intrinsics.checkNotNull(style4);
        if (style4.getMarkerStart() != null) {
            SVG document = graphicsElement.getDocument();
            Intrinsics.checkNotNull(document);
            f fVar5 = this.f51335d;
            Intrinsics.checkNotNull(fVar5);
            SVG.Style style5 = fVar5.f51365a;
            Intrinsics.checkNotNull(style5);
            SVG.SvgObject svgObjectResolveIRI = document.resolveIRI(style5.getMarkerStart());
            if (svgObjectResolveIRI != null) {
                marker = (SVG.Marker) svgObjectResolveIRI;
            } else {
                Companion companion = INSTANCE;
                f fVar6 = this.f51335d;
                Intrinsics.checkNotNull(fVar6);
                SVG.Style style6 = fVar6.f51365a;
                Intrinsics.checkNotNull(style6);
                String markerStart = style6.getMarkerStart();
                Intrinsics.checkNotNull(markerStart);
                Companion.access$error(companion, "Marker reference '%s' not found", markerStart);
                marker = null;
            }
        } else {
            marker = null;
        }
        f fVar7 = this.f51335d;
        Intrinsics.checkNotNull(fVar7);
        SVG.Style style7 = fVar7.f51365a;
        Intrinsics.checkNotNull(style7);
        if (style7.getMarkerMid() != null) {
            SVG document2 = graphicsElement.getDocument();
            Intrinsics.checkNotNull(document2);
            f fVar8 = this.f51335d;
            Intrinsics.checkNotNull(fVar8);
            SVG.Style style8 = fVar8.f51365a;
            Intrinsics.checkNotNull(style8);
            SVG.SvgObject svgObjectResolveIRI2 = document2.resolveIRI(style8.getMarkerMid());
            if (svgObjectResolveIRI2 != null) {
                marker2 = (SVG.Marker) svgObjectResolveIRI2;
            } else {
                Companion companion2 = INSTANCE;
                f fVar9 = this.f51335d;
                Intrinsics.checkNotNull(fVar9);
                SVG.Style style9 = fVar9.f51365a;
                Intrinsics.checkNotNull(style9);
                String markerMid = style9.getMarkerMid();
                Intrinsics.checkNotNull(markerMid);
                Companion.access$error(companion2, "Marker reference '%s' not found", markerMid);
                marker2 = null;
            }
        } else {
            marker2 = null;
        }
        f fVar10 = this.f51335d;
        Intrinsics.checkNotNull(fVar10);
        SVG.Style style10 = fVar10.f51365a;
        Intrinsics.checkNotNull(style10);
        if (style10.getMarkerEnd() != null) {
            SVG document3 = graphicsElement.getDocument();
            Intrinsics.checkNotNull(document3);
            f fVar11 = this.f51335d;
            Intrinsics.checkNotNull(fVar11);
            SVG.Style style11 = fVar11.f51365a;
            Intrinsics.checkNotNull(style11);
            SVG.SvgObject svgObjectResolveIRI3 = document3.resolveIRI(style11.getMarkerEnd());
            if (svgObjectResolveIRI3 != null) {
                marker3 = (SVG.Marker) svgObjectResolveIRI3;
            } else {
                Companion companion3 = INSTANCE;
                f fVar12 = this.f51335d;
                Intrinsics.checkNotNull(fVar12);
                SVG.Style style12 = fVar12.f51365a;
                Intrinsics.checkNotNull(style12);
                String markerEnd = style12.getMarkerEnd();
                Intrinsics.checkNotNull(markerEnd);
                Companion.access$error(companion3, "Marker reference '%s' not found", markerEnd);
                marker3 = null;
            }
        } else {
            marker3 = null;
        }
        if (graphicsElement instanceof SVG.Path) {
            arrayList = new a(this, ((SVG.Path) graphicsElement).getD()).f51343a;
        } else if (graphicsElement instanceof SVG.Line) {
            SVG.Line line = (SVG.Line) graphicsElement;
            if (line.getX1() != null) {
                SVG.Length x4 = line.getX1();
                Intrinsics.checkNotNull(x4);
                fFloatValueX = x4.floatValueX(this);
            } else {
                fFloatValueX = 0.0f;
            }
            if (line.getY1() != null) {
                SVG.Length y7 = line.getY1();
                Intrinsics.checkNotNull(y7);
                fFloatValueY = y7.floatValueY(this);
            } else {
                fFloatValueY = 0.0f;
            }
            if (line.getX2() != null) {
                SVG.Length x6 = line.getX2();
                Intrinsics.checkNotNull(x6);
                fFloatValueX2 = x6.floatValueX(this);
            } else {
                fFloatValueX2 = 0.0f;
            }
            if (line.getY2() != null) {
                SVG.Length y10 = line.getY2();
                Intrinsics.checkNotNull(y10);
                fFloatValueY2 = y10.floatValueY(this);
            } else {
                fFloatValueY2 = 0.0f;
            }
            ArrayList arrayList2 = new ArrayList(2);
            float f11 = fFloatValueX2 - fFloatValueX;
            float f12 = fFloatValueY2 - fFloatValueY;
            arrayList2.add(new b(fFloatValueX, fFloatValueY, f11, f12));
            arrayList2.add(new b(fFloatValueX2, fFloatValueY2, f11, f12));
            arrayList = arrayList2;
        } else {
            Intrinsics.checkNotNull(graphicsElement, "null cannot be cast to non-null type com.mastercard.sonic.androidsvg.SVG.PolyLine");
            SVG.PolyLine polyLine = (SVG.PolyLine) graphicsElement;
            float[] points = polyLine.getPoints();
            Intrinsics.checkNotNull(points);
            int length = points.length;
            if (length < 2) {
                arrayList = null;
            } else {
                ArrayList arrayList3 = new ArrayList();
                float[] points2 = polyLine.getPoints();
                Intrinsics.checkNotNull(points2);
                float f13 = points2[0];
                float[] points3 = polyLine.getPoints();
                Intrinsics.checkNotNull(points3);
                b bVar = new b(f13, points3[1], 0.0f, 0.0f);
                int i10 = 2;
                float f14 = 0.0f;
                float f15 = 0.0f;
                while (true) {
                    f6 = bVar.f51352b;
                    f10 = bVar.f51351a;
                    if (i10 >= length) {
                        break;
                    }
                    float[] points4 = polyLine.getPoints();
                    Intrinsics.checkNotNull(points4);
                    f14 = points4[i10];
                    float[] points5 = polyLine.getPoints();
                    Intrinsics.checkNotNull(points5);
                    f15 = points5[i10 + 1];
                    bVar.a(f14, f15);
                    arrayList3.add(bVar);
                    bVar = new b(f14, f15, f14 - f10, f15 - f6);
                    i10 += 2;
                }
                if (polyLine instanceof SVG.Polygon) {
                    float[] points6 = polyLine.getPoints();
                    Intrinsics.checkNotNull(points6);
                    if (f14 != points6[0]) {
                        float[] points7 = polyLine.getPoints();
                        Intrinsics.checkNotNull(points7);
                        if (f15 != points7[1]) {
                            float[] points8 = polyLine.getPoints();
                            Intrinsics.checkNotNull(points8);
                            float f16 = points8[0];
                            float[] points9 = polyLine.getPoints();
                            Intrinsics.checkNotNull(points9);
                            float f17 = points9[1];
                            bVar.a(f16, f17);
                            arrayList3.add(bVar);
                            b bVar2 = new b(f16, f17, f16 - f10, f17 - f6);
                            bVar2.b((b) arrayList3.get(0));
                            arrayList3.add(bVar2);
                            arrayList3.set(0, bVar2);
                        }
                    }
                } else {
                    arrayList3.add(bVar);
                }
                arrayList = arrayList3;
            }
        }
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        f fVar13 = this.f51335d;
        Intrinsics.checkNotNull(fVar13);
        SVG.Style style13 = fVar13.f51365a;
        Intrinsics.checkNotNull(style13);
        style13.setMarkerEnd(null);
        f fVar14 = this.f51335d;
        Intrinsics.checkNotNull(fVar14);
        SVG.Style style14 = fVar14.f51365a;
        Intrinsics.checkNotNull(style14);
        f fVar15 = this.f51335d;
        Intrinsics.checkNotNull(fVar15);
        SVG.Style style15 = fVar15.f51365a;
        Intrinsics.checkNotNull(style15);
        style14.setMarkerMid(style15.getMarkerEnd());
        f fVar16 = this.f51335d;
        Intrinsics.checkNotNull(fVar16);
        SVG.Style style16 = fVar16.f51365a;
        Intrinsics.checkNotNull(style16);
        f fVar17 = this.f51335d;
        Intrinsics.checkNotNull(fVar17);
        SVG.Style style17 = fVar17.f51365a;
        Intrinsics.checkNotNull(style17);
        style16.setMarkerStart(style17.getMarkerMid());
        if (marker != null) {
            Object obj = arrayList.get(0);
            Intrinsics.checkNotNull(obj);
            J(marker, (b) obj);
        }
        if (marker2 != null && arrayList.size() > 2) {
            int i11 = size - 1;
            int i12 = 1;
            b bVar3 = (b) arrayList.get(0);
            b bVar4 = (b) arrayList.get(1);
            while (i12 < i11) {
                i12++;
                b bVar5 = (b) arrayList.get(i12);
                Intrinsics.checkNotNull(bVar4);
                if (bVar4.f51355e) {
                    Intrinsics.checkNotNull(bVar3);
                    Intrinsics.checkNotNull(bVar5);
                    float f18 = bVar4.f51353c;
                    float f19 = bVar4.f51354d;
                    float f20 = bVar3.f51351a;
                    float f21 = bVar4.f51351a;
                    float f22 = bVar3.f51352b;
                    float f23 = bVar4.f51352b;
                    float f24 = ((f23 - f22) * f19) + ((f21 - f20) * f18);
                    if (f24 == 0.0f) {
                        f24 = ((bVar5.f51351a - f21) * f18) + ((bVar5.f51352b - f23) * f19);
                    }
                    if (f24 <= 0.0f && (f24 != 0.0f || (f18 <= 0.0f && f19 < 0.0f))) {
                        bVar4.f51353c = -f18;
                        bVar4.f51354d = -f19;
                    }
                }
                J(marker2, bVar4);
                bVar3 = bVar4;
                bVar4 = bVar5;
            }
        }
        if (marker3 != null) {
            Object obj2 = arrayList.get(size - 1);
            Intrinsics.checkNotNull(obj2);
            J(marker3, (b) obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    public final void L(SVG.Mask mask, SVG.Box box) {
        boolean z10;
        float fFloatValue;
        float width;
        float height;
        Object[] objArr = new Object[0];
        INSTANCE.getClass();
        Intrinsics.checkNotNull(mask);
        if (mask.getMaskUnitsAreUser() != null) {
            Boolean maskUnitsAreUser = mask.getMaskUnitsAreUser();
            Intrinsics.checkNotNull(maskUnitsAreUser);
            if (maskUnitsAreUser.booleanValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (z10) {
            if (mask.getWidth() != null) {
                SVG.Length width2 = mask.getWidth();
                Intrinsics.checkNotNull(width2);
                width = width2.floatValueX(this);
            } else {
                Intrinsics.checkNotNull(box);
                width = box.getWidth();
            }
            if (mask.getHeight() != null) {
                SVG.Length height2 = mask.getHeight();
                Intrinsics.checkNotNull(height2);
                height = height2.floatValueY(this);
            } else {
                Intrinsics.checkNotNull(box);
                height = box.getHeight();
            }
        } else {
            float fFloatValue2 = 1.2f;
            if (mask.getWidth() != null) {
                SVG.Length width3 = mask.getWidth();
                Intrinsics.checkNotNull(width3);
                fFloatValue = width3.floatValue(this, 1.0f);
            } else {
                fFloatValue = 1.2f;
            }
            if (mask.getHeight() != null) {
                SVG.Length height3 = mask.getHeight();
                Intrinsics.checkNotNull(height3);
                fFloatValue2 = height3.floatValue(this, 1.0f);
            }
            Intrinsics.checkNotNull(box);
            width = fFloatValue * box.getWidth();
            height = fFloatValue2 * box.getHeight();
        }
        if (width == 0.0f || height == 0.0f) {
            return;
        }
        P();
        f fVarR = r(mask);
        this.f51335d = fVarR;
        Intrinsics.checkNotNull(fVarR);
        SVG.Style style = fVarR.f51365a;
        Intrinsics.checkNotNull(style);
        style.setOpacity(Float.valueOf(1.0f));
        boolean zF = F();
        Canvas canvas = this.f51332a;
        canvas.save();
        if (mask.getMaskContentUnitsAreUser() != null) {
            Boolean maskContentUnitsAreUser = mask.getMaskContentUnitsAreUser();
            Intrinsics.checkNotNull(maskContentUnitsAreUser);
            if (!maskContentUnitsAreUser.booleanValue()) {
                Intrinsics.checkNotNull(box);
                canvas.translate(box.getMinX(), box.getMinY());
                canvas.scale(box.getWidth(), box.getHeight());
            }
        }
        I(mask, false);
        canvas.restore();
        if (zF) {
            D(box);
        }
        O();
    }

    public final void M(float f6, float f10, float f11, float f12) {
        float fFloatValueX = f11 + f6;
        float fFloatValueY = f12 + f10;
        f fVar = this.f51335d;
        Intrinsics.checkNotNull(fVar);
        SVG.Style style = fVar.f51365a;
        Intrinsics.checkNotNull(style);
        if (style.getClip() != null) {
            f fVar2 = this.f51335d;
            Intrinsics.checkNotNull(fVar2);
            SVG.Style style2 = fVar2.f51365a;
            Intrinsics.checkNotNull(style2);
            SVG.CSSClipRect clip = style2.getClip();
            Intrinsics.checkNotNull(clip);
            SVG.Length left = clip.getCom.dasnano.vdphotoselfiecapture.api.model.Parameters.DIRECTION.LEFT java.lang.String();
            Intrinsics.checkNotNull(left);
            f6 += left.floatValueX(this);
            f fVar3 = this.f51335d;
            Intrinsics.checkNotNull(fVar3);
            SVG.Style style3 = fVar3.f51365a;
            Intrinsics.checkNotNull(style3);
            SVG.CSSClipRect clip2 = style3.getClip();
            Intrinsics.checkNotNull(clip2);
            SVG.Length top = clip2.getTop();
            Intrinsics.checkNotNull(top);
            f10 += top.floatValueY(this);
            f fVar4 = this.f51335d;
            Intrinsics.checkNotNull(fVar4);
            SVG.Style style4 = fVar4.f51365a;
            Intrinsics.checkNotNull(style4);
            SVG.CSSClipRect clip3 = style4.getClip();
            Intrinsics.checkNotNull(clip3);
            SVG.Length right = clip3.getCom.dasnano.vdphotoselfiecapture.api.model.Parameters.DIRECTION.RIGHT java.lang.String();
            Intrinsics.checkNotNull(right);
            fFloatValueX -= right.floatValueX(this);
            f fVar5 = this.f51335d;
            Intrinsics.checkNotNull(fVar5);
            SVG.Style style5 = fVar5.f51365a;
            Intrinsics.checkNotNull(style5);
            SVG.CSSClipRect clip4 = style5.getClip();
            Intrinsics.checkNotNull(clip4);
            SVG.Length bottom = clip4.getBottom();
            Intrinsics.checkNotNull(bottom);
            fFloatValueY -= bottom.floatValueY(this);
        }
        this.f51332a.clipRect(f6, f10, fFloatValueX, fFloatValueY);
    }

    public final void O() {
        this.f51332a.restore();
        Stack<f> stack = this.f51336e;
        Intrinsics.checkNotNull(stack);
        this.f51335d = stack.pop();
    }

    public final void P() {
        this.f51332a.save();
        Stack<f> stack = this.f51336e;
        Intrinsics.checkNotNull(stack);
        stack.push(this.f51335d);
        f fVar = this.f51335d;
        Intrinsics.checkNotNull(fVar);
        this.f51335d = new f(fVar);
    }

    public final String Q(String str, boolean z10, boolean z11) {
        f fVar = this.f51335d;
        Intrinsics.checkNotNull(fVar);
        if (fVar.f51372h) {
            Intrinsics.checkNotNull(str);
            return new Regex("[\\n\\t]").replace(str, " ");
        }
        Intrinsics.checkNotNull(str);
        String strReplace = new Regex("\\t").replace(new Regex("\\n").replace(str, ""), " ");
        if (z10) {
            strReplace = new Regex("^\\s+").replace(strReplace, "");
        }
        if (z11) {
            strReplace = new Regex("\\s+$").replace(strReplace, "");
        }
        return new Regex("\\s{2,}").replace(strReplace, " ");
    }

    public final void R(SVG.SvgElement svgElement) {
        if (svgElement.getParent() == null || svgElement.getBoundingBox() == null) {
            return;
        }
        Matrix matrix = new Matrix();
        Stack<Matrix> stack = this.f51338g;
        Intrinsics.checkNotNull(stack);
        if (stack.peek().invert(matrix)) {
            SVG.Box boundingBox = svgElement.getBoundingBox();
            Intrinsics.checkNotNull(boundingBox);
            SVG.Box boundingBox2 = svgElement.getBoundingBox();
            Intrinsics.checkNotNull(boundingBox2);
            SVG.Box boundingBox3 = svgElement.getBoundingBox();
            Intrinsics.checkNotNull(boundingBox3);
            SVG.Box boundingBox4 = svgElement.getBoundingBox();
            Intrinsics.checkNotNull(boundingBox4);
            SVG.Box boundingBox5 = svgElement.getBoundingBox();
            Intrinsics.checkNotNull(boundingBox5);
            SVG.Box boundingBox6 = svgElement.getBoundingBox();
            Intrinsics.checkNotNull(boundingBox6);
            SVG.Box boundingBox7 = svgElement.getBoundingBox();
            Intrinsics.checkNotNull(boundingBox7);
            SVG.Box boundingBox8 = svgElement.getBoundingBox();
            Intrinsics.checkNotNull(boundingBox8);
            float[] fArr = {boundingBox.getMinX(), boundingBox2.getMinY(), boundingBox3.maxX(), boundingBox4.getMinY(), boundingBox5.maxX(), boundingBox6.maxY(), boundingBox7.getMinX(), boundingBox8.maxY()};
            matrix.preConcat(this.f51332a.getMatrix());
            matrix.mapPoints(fArr);
            float f6 = fArr[0];
            float f10 = fArr[1];
            RectF rectF = new RectF(f6, f10, f6, f10);
            for (int i10 = 2; i10 <= 6; i10 += 2) {
                float f11 = fArr[i10];
                if (f11 < rectF.left) {
                    rectF.left = f11;
                }
                if (f11 > rectF.right) {
                    rectF.right = f11;
                }
                float f12 = fArr[i10 + 1];
                if (f12 < rectF.top) {
                    rectF.top = f12;
                }
                if (f12 > rectF.bottom) {
                    rectF.bottom = f12;
                }
            }
            Stack<SVG.SvgContainer> stack2 = this.f51337f;
            Intrinsics.checkNotNull(stack2);
            SVG.SvgElement svgElement2 = (SVG.SvgElement) stack2.peek();
            Intrinsics.checkNotNull(svgElement2);
            if (svgElement2.getBoundingBox() == null) {
                svgElement2.setBoundingBox(SVG.Box.INSTANCE.fromLimits(rectF.left, rectF.top, rectF.right, rectF.bottom));
                return;
            }
            SVG.Box boundingBox9 = svgElement2.getBoundingBox();
            Intrinsics.checkNotNull(boundingBox9);
            boundingBox9.union(SVG.Box.INSTANCE.fromLimits(rectF.left, rectF.top, rectF.right, rectF.bottom));
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x036b  */
    /* JADX WARN: Code duplicated, block: B:126:0x038f  */
    /* JADX WARN: Code duplicated, block: B:127:0x03ab  */
    public final void S(f fVar, SVG.Style style) {
        Integer fontWeight;
        Integer fontWeight2;
        if (w(style, SvgConstantsKt.SPECIFIED_COLOR)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style2 = fVar.f51365a;
            Intrinsics.checkNotNull(style2);
            Intrinsics.checkNotNull(style);
            style2.setColor(style.getColor());
        }
        if (w(style, SvgConstantsKt.SPECIFIED_OPACITY)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style3 = fVar.f51365a;
            Intrinsics.checkNotNull(style3);
            Intrinsics.checkNotNull(style);
            style3.setOpacity(style.getOpacity());
        }
        if (w(style, 1L)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style4 = fVar.f51365a;
            Intrinsics.checkNotNull(style4);
            Intrinsics.checkNotNull(style);
            style4.setFill(style.getFill());
            fVar.f51366b = (style.getFill() == null || style.getFill() == SVG.Colour.INSTANCE.getTRANSPARENT()) ? false : true;
        }
        if (w(style, 4L)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style5 = fVar.f51365a;
            Intrinsics.checkNotNull(style5);
            Intrinsics.checkNotNull(style);
            style5.setFillOpacity(style.getFillOpacity());
        }
        if (w(style, 6149L)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style6 = fVar.f51365a;
            Intrinsics.checkNotNull(style6);
            N(fVar, true, style6.getFill());
        }
        if (w(style, 2L)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style7 = fVar.f51365a;
            Intrinsics.checkNotNull(style7);
            Intrinsics.checkNotNull(style);
            style7.setFillRule(style.getFillRule());
        }
        if (w(style, 8L)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style8 = fVar.f51365a;
            Intrinsics.checkNotNull(style8);
            Intrinsics.checkNotNull(style);
            style8.setStroke(style.getStroke());
            fVar.f51367c = (style.getStroke() == null || style.getStroke() == SVG.Colour.INSTANCE.getTRANSPARENT()) ? false : true;
        }
        if (w(style, 16L)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style9 = fVar.f51365a;
            Intrinsics.checkNotNull(style9);
            Intrinsics.checkNotNull(style);
            style9.setStrokeOpacity(style.getStrokeOpacity());
        }
        if (w(style, 6168L)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style10 = fVar.f51365a;
            Intrinsics.checkNotNull(style10);
            N(fVar, false, style10.getStroke());
        }
        if (w(style, SvgConstantsKt.SPECIFIED_VECTOR_EFFECT)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style11 = fVar.f51365a;
            Intrinsics.checkNotNull(style11);
            Intrinsics.checkNotNull(style);
            style11.setVectorEffect(style.getVectorEffect());
        }
        if (w(style, 32L)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style12 = fVar.f51365a;
            Intrinsics.checkNotNull(style12);
            Intrinsics.checkNotNull(style);
            style12.setStrokeWidth(style.getStrokeWidth());
            Paint paint = fVar.f51369e;
            SVG.Style style13 = fVar.f51365a;
            Intrinsics.checkNotNull(style13);
            SVG.Length strokeWidth = style13.getStrokeWidth();
            Intrinsics.checkNotNull(strokeWidth);
            paint.setStrokeWidth(strokeWidth.floatValue(this));
        }
        if (w(style, 64L)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style14 = fVar.f51365a;
            Intrinsics.checkNotNull(style14);
            Intrinsics.checkNotNull(style);
            style14.setStrokeLineCap(style.getStrokeLineCap());
            SVG.Style.LineCap strokeLineCap = style.getStrokeLineCap();
            int i10 = strokeLineCap == null ? -1 : WhenMappings.$EnumSwitchMapping$1[strokeLineCap.ordinal()];
            Paint paint2 = fVar.f51369e;
            if (i10 == 1) {
                paint2.setStrokeCap(Paint.Cap.BUTT);
            } else if (i10 == 2) {
                paint2.setStrokeCap(Paint.Cap.ROUND);
            } else if (i10 == 3) {
                paint2.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (w(style, 128L)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style15 = fVar.f51365a;
            Intrinsics.checkNotNull(style15);
            Intrinsics.checkNotNull(style);
            style15.setStrokeLineJoin(style.getStrokeLineJoin());
            SVG.Style.LineJoin strokeLineJoin = style.getStrokeLineJoin();
            int i11 = strokeLineJoin == null ? -1 : WhenMappings.$EnumSwitchMapping$2[strokeLineJoin.ordinal()];
            Paint paint3 = fVar.f51369e;
            if (i11 == 1) {
                paint3.setStrokeJoin(Paint.Join.MITER);
            } else if (i11 == 2) {
                paint3.setStrokeJoin(Paint.Join.ROUND);
            } else if (i11 == 3) {
                paint3.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (w(style, 256L)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style16 = fVar.f51365a;
            Intrinsics.checkNotNull(style16);
            Intrinsics.checkNotNull(style);
            style16.setStrokeMiterLimit(style.getStrokeMiterLimit());
            Paint paint4 = fVar.f51369e;
            Float strokeMiterLimit = style.getStrokeMiterLimit();
            Intrinsics.checkNotNull(strokeMiterLimit);
            paint4.setStrokeMiter(strokeMiterLimit.floatValue());
        }
        if (w(style, 512L)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style17 = fVar.f51365a;
            Intrinsics.checkNotNull(style17);
            Intrinsics.checkNotNull(style);
            style17.setStrokeDashArray(style.getStrokeDashArray());
        }
        if (w(style, 1024L)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style18 = fVar.f51365a;
            Intrinsics.checkNotNull(style18);
            Intrinsics.checkNotNull(style);
            style18.setStrokeDashOffset(style.getStrokeDashOffset());
        }
        Typeface typefaceG = null;
        if (w(style, 1536L)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style19 = fVar.f51365a;
            Intrinsics.checkNotNull(style19);
            SVG.Length[] strokeDashArray = style19.getStrokeDashArray();
            Paint paint5 = fVar.f51369e;
            if (strokeDashArray == null) {
                paint5.setPathEffect(null);
            } else {
                SVG.Style style20 = fVar.f51365a;
                Intrinsics.checkNotNull(style20);
                SVG.Length[] strokeDashArray2 = style20.getStrokeDashArray();
                Intrinsics.checkNotNull(strokeDashArray2);
                int length = strokeDashArray2.length;
                int i12 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i12];
                float f6 = 0.0f;
                for (int i13 = 0; i13 < i12; i13++) {
                    Intrinsics.checkNotNull(style20);
                    SVG.Length[] strokeDashArray3 = style20.getStrokeDashArray();
                    Intrinsics.checkNotNull(strokeDashArray3);
                    SVG.Length length2 = strokeDashArray3[i13 % length];
                    Intrinsics.checkNotNull(length2);
                    float fFloatValue = length2.floatValue(this);
                    fArr[i13] = fFloatValue;
                    f6 += fFloatValue;
                }
                if (f6 == 0.0f) {
                    paint5.setPathEffect(null);
                } else {
                    Intrinsics.checkNotNull(style20);
                    SVG.Length strokeDashOffset = style20.getStrokeDashOffset();
                    Intrinsics.checkNotNull(strokeDashOffset);
                    float fFloatValue2 = strokeDashOffset.floatValue(this);
                    if (fFloatValue2 < 0.0f) {
                        fFloatValue2 = (fFloatValue2 % f6) + f6;
                    }
                    paint5.setPathEffect(new DashPathEffect(fArr, fFloatValue2));
                }
            }
        }
        if (w(style, 16384L)) {
            float currentFontSize = getCurrentFontSize();
            Intrinsics.checkNotNull(fVar);
            SVG.Style style21 = fVar.f51365a;
            Intrinsics.checkNotNull(style21);
            Intrinsics.checkNotNull(style);
            style21.setFontSize(style.getFontSize());
            Paint paint6 = fVar.f51368d;
            SVG.Length fontSize = style.getFontSize();
            Intrinsics.checkNotNull(fontSize);
            paint6.setTextSize(fontSize.floatValue(this, currentFontSize));
            Paint paint7 = fVar.f51369e;
            SVG.Length fontSize2 = style.getFontSize();
            Intrinsics.checkNotNull(fontSize2);
            paint7.setTextSize(fontSize2.floatValue(this, currentFontSize));
        }
        if (w(style, SvgConstantsKt.SPECIFIED_FONT_FAMILY)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style22 = fVar.f51365a;
            Intrinsics.checkNotNull(style22);
            Intrinsics.checkNotNull(style);
            style22.setFontFamily(style.getFontFamily());
        }
        if (w(style, SvgConstantsKt.SPECIFIED_FONT_WEIGHT)) {
            Intrinsics.checkNotNull(style);
            Integer fontWeight3 = style.getFontWeight();
            if (fontWeight3 != null && fontWeight3.intValue() == -1) {
                Intrinsics.checkNotNull(fVar);
                SVG.Style style23 = fVar.f51365a;
                Intrinsics.checkNotNull(style23);
                Integer fontWeight4 = style23.getFontWeight();
                Intrinsics.checkNotNull(fontWeight4);
                if (fontWeight4.intValue() > 100) {
                    SVG.Style style24 = fVar.f51365a;
                    Intrinsics.checkNotNull(style24);
                    Intrinsics.checkNotNull(style24);
                    Integer fontWeight5 = style24.getFontWeight();
                    Intrinsics.checkNotNull(fontWeight5);
                    style24.setFontWeight(Integer.valueOf(fontWeight5.intValue() - 100));
                } else {
                    fontWeight = style.getFontWeight();
                    if (fontWeight == null && fontWeight.intValue() == 1) {
                        Intrinsics.checkNotNull(fVar);
                        SVG.Style style25 = fVar.f51365a;
                        Intrinsics.checkNotNull(style25);
                        fontWeight2 = style25.getFontWeight();
                        Intrinsics.checkNotNull(fontWeight2);
                        if (fontWeight2.intValue() < 900) {
                            SVG.Style style26 = fVar.f51365a;
                            Intrinsics.checkNotNull(style26);
                            Intrinsics.checkNotNull(style26);
                            Integer fontWeight6 = style26.getFontWeight();
                            Intrinsics.checkNotNull(fontWeight6);
                            style26.setFontWeight(Integer.valueOf(fontWeight6.intValue() + 100));
                        } else {
                            Intrinsics.checkNotNull(fVar);
                            SVG.Style style27 = fVar.f51365a;
                            Intrinsics.checkNotNull(style27);
                            style27.setFontWeight(style.getFontWeight());
                        }
                    } else {
                        Intrinsics.checkNotNull(fVar);
                        SVG.Style style28 = fVar.f51365a;
                        Intrinsics.checkNotNull(style28);
                        style28.setFontWeight(style.getFontWeight());
                    }
                }
            } else {
                fontWeight = style.getFontWeight();
                if (fontWeight == null) {
                    Intrinsics.checkNotNull(fVar);
                    SVG.Style style29 = fVar.f51365a;
                    Intrinsics.checkNotNull(style29);
                    style29.setFontWeight(style.getFontWeight());
                } else {
                    Intrinsics.checkNotNull(fVar);
                    SVG.Style style210 = fVar.f51365a;
                    Intrinsics.checkNotNull(style210);
                    fontWeight2 = style210.getFontWeight();
                    Intrinsics.checkNotNull(fontWeight2);
                    if (fontWeight2.intValue() < 900) {
                        SVG.Style style211 = fVar.f51365a;
                        Intrinsics.checkNotNull(style211);
                        Intrinsics.checkNotNull(style211);
                        Integer fontWeight7 = style211.getFontWeight();
                        Intrinsics.checkNotNull(fontWeight7);
                        style211.setFontWeight(Integer.valueOf(fontWeight7.intValue() + 100));
                    } else {
                        Intrinsics.checkNotNull(fVar);
                        SVG.Style style212 = fVar.f51365a;
                        Intrinsics.checkNotNull(style212);
                        style212.setFontWeight(style.getFontWeight());
                    }
                }
            }
        }
        if (w(style, SvgConstantsKt.SPECIFIED_FONT_STYLE)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style30 = fVar.f51365a;
            Intrinsics.checkNotNull(style30);
            Intrinsics.checkNotNull(style);
            style30.setFontStyle(style.getFontStyle());
        }
        if (w(style, 106496L)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style31 = fVar.f51365a;
            Intrinsics.checkNotNull(style31);
            List<String> fontFamily = style31.getFontFamily();
            SVG.Style style32 = fVar.f51365a;
            if (fontFamily != null && this.f51334c != null) {
                SVGExternalFileResolver externalFileResolver = SVG.INSTANCE.getExternalFileResolver();
                Intrinsics.checkNotNull(style32);
                List<String> fontFamily2 = style32.getFontFamily();
                Intrinsics.checkNotNull(fontFamily2);
                for (String str : fontFamily2) {
                    Intrinsics.checkNotNull(style32);
                    Integer fontWeight8 = style32.getFontWeight();
                    Intrinsics.checkNotNull(style32);
                    Typeface typefaceG2 = g(str, fontWeight8, style32.getFontStyle());
                    if (typefaceG2 != null || externalFileResolver == null) {
                        typefaceG = typefaceG2;
                    } else {
                        Intrinsics.checkNotNull(style32);
                        Integer fontWeight9 = style32.getFontWeight();
                        Intrinsics.checkNotNull(fontWeight9);
                        int iIntValue = fontWeight9.intValue();
                        Intrinsics.checkNotNull(style32);
                        typefaceG = externalFileResolver.resolveFont(str, iIntValue, String.valueOf(style32.getFontStyle()));
                    }
                    if (typefaceG != null) {
                        break;
                    }
                }
            }
            if (typefaceG == null) {
                Intrinsics.checkNotNull(style32);
                Integer fontWeight10 = style32.getFontWeight();
                Intrinsics.checkNotNull(style32);
                typefaceG = g("serif", fontWeight10, style32.getFontStyle());
            }
            fVar.f51368d.setTypeface(typefaceG);
            fVar.f51369e.setTypeface(typefaceG);
        }
        if (w(style, SvgConstantsKt.SPECIFIED_TEXT_DECORATION)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style33 = fVar.f51365a;
            Intrinsics.checkNotNull(style33);
            Intrinsics.checkNotNull(style);
            style33.setTextDecoration(style.getTextDecoration());
            Paint paint8 = fVar.f51368d;
            SVG.Style.TextDecoration textDecoration = style.getTextDecoration();
            SVG.Style.TextDecoration textDecoration2 = SVG.Style.TextDecoration.LineThrough;
            paint8.setStrikeThruText(textDecoration == textDecoration2);
            SVG.Style.TextDecoration textDecoration3 = style.getTextDecoration();
            SVG.Style.TextDecoration textDecoration4 = SVG.Style.TextDecoration.Underline;
            paint8.setUnderlineText(textDecoration3 == textDecoration4);
            Paint paint9 = fVar.f51369e;
            paint9.setStrikeThruText(style.getTextDecoration() == textDecoration2);
            paint9.setUnderlineText(style.getTextDecoration() == textDecoration4);
        }
        if (w(style, SvgConstantsKt.SPECIFIED_DIRECTION)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style34 = fVar.f51365a;
            Intrinsics.checkNotNull(style34);
            Intrinsics.checkNotNull(style);
            style34.setDirection(style.getDirection());
        }
        if (w(style, SvgConstantsKt.SPECIFIED_TEXT_ANCHOR)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style35 = fVar.f51365a;
            Intrinsics.checkNotNull(style35);
            Intrinsics.checkNotNull(style);
            style35.setTextAnchor(style.getTextAnchor());
        }
        if (w(style, SvgConstantsKt.SPECIFIED_OVERFLOW)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style36 = fVar.f51365a;
            Intrinsics.checkNotNull(style36);
            Intrinsics.checkNotNull(style);
            style36.setOverflow(style.getOverflow());
        }
        if (w(style, SvgConstantsKt.SPECIFIED_MARKER_START)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style37 = fVar.f51365a;
            Intrinsics.checkNotNull(style37);
            Intrinsics.checkNotNull(style);
            style37.setMarkerStart(style.getMarkerStart());
        }
        if (w(style, SvgConstantsKt.SPECIFIED_MARKER_MID)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style38 = fVar.f51365a;
            Intrinsics.checkNotNull(style38);
            Intrinsics.checkNotNull(style);
            style38.setMarkerMid(style.getMarkerMid());
        }
        if (w(style, SvgConstantsKt.SPECIFIED_MARKER_END)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style39 = fVar.f51365a;
            Intrinsics.checkNotNull(style39);
            Intrinsics.checkNotNull(style);
            style39.setMarkerEnd(style.getMarkerEnd());
        }
        if (w(style, SvgConstantsKt.SPECIFIED_DISPLAY)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style40 = fVar.f51365a;
            Intrinsics.checkNotNull(style40);
            Intrinsics.checkNotNull(style);
            style40.setDisplay(style.getDisplay());
        }
        if (w(style, SvgConstantsKt.SPECIFIED_VISIBILITY)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style41 = fVar.f51365a;
            Intrinsics.checkNotNull(style41);
            Intrinsics.checkNotNull(style);
            style41.setVisibility(style.getVisibility());
        }
        if (w(style, 1048576L)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style42 = fVar.f51365a;
            Intrinsics.checkNotNull(style42);
            Intrinsics.checkNotNull(style);
            style42.setClip(style.getClip());
        }
        if (w(style, SvgConstantsKt.SPECIFIED_CLIP_PATH)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style43 = fVar.f51365a;
            Intrinsics.checkNotNull(style43);
            Intrinsics.checkNotNull(style);
            style43.setClipPath(style.getClipPath());
        }
        if (w(style, SvgConstantsKt.SPECIFIED_CLIP_RULE)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style44 = fVar.f51365a;
            Intrinsics.checkNotNull(style44);
            Intrinsics.checkNotNull(style);
            style44.setClipRule(style.getClipRule());
        }
        if (w(style, SvgConstantsKt.SPECIFIED_MASK)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style45 = fVar.f51365a;
            Intrinsics.checkNotNull(style45);
            Intrinsics.checkNotNull(style);
            style45.setMask(style.getMask());
        }
        if (w(style, SvgConstantsKt.SPECIFIED_STOP_COLOR)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style46 = fVar.f51365a;
            Intrinsics.checkNotNull(style46);
            Intrinsics.checkNotNull(style);
            style46.setStopColor(style.getStopColor());
        }
        if (w(style, SvgConstantsKt.SPECIFIED_STOP_OPACITY)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style47 = fVar.f51365a;
            Intrinsics.checkNotNull(style47);
            Intrinsics.checkNotNull(style);
            style47.setStopOpacity(style.getStopOpacity());
        }
        if (w(style, SvgConstantsKt.SPECIFIED_VIEWPORT_FILL)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style48 = fVar.f51365a;
            Intrinsics.checkNotNull(style48);
            Intrinsics.checkNotNull(style);
            style48.setViewportFill(style.getViewportFill());
        }
        if (w(style, SvgConstantsKt.SPECIFIED_VIEWPORT_FILL_OPACITY)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style49 = fVar.f51365a;
            Intrinsics.checkNotNull(style49);
            Intrinsics.checkNotNull(style);
            style49.setViewportFillOpacity(style.getViewportFillOpacity());
        }
        if (w(style, SvgConstantsKt.SPECIFIED_IMAGE_RENDERING)) {
            Intrinsics.checkNotNull(fVar);
            SVG.Style style50 = fVar.f51365a;
            Intrinsics.checkNotNull(style50);
            Intrinsics.checkNotNull(style);
            style50.setImageRendering(style.getImageRendering());
        }
    }

    public final void T(f fVar, SVG.SvgElementBase svgElementBase) {
        Intrinsics.checkNotNull(svgElementBase);
        boolean z10 = svgElementBase.getParent() == null;
        Intrinsics.checkNotNull(fVar);
        SVG.Style style = fVar.f51365a;
        Intrinsics.checkNotNull(style);
        style.resetNonInheritingProperties(z10);
        if (svgElementBase.getBaseStyle() != null) {
            S(fVar, svgElementBase.getBaseStyle());
        }
        SVG svg = this.f51334c;
        Intrinsics.checkNotNull(svg);
        if (svg.hasCSSRules()) {
            SVG svg2 = this.f51334c;
            Intrinsics.checkNotNull(svg2);
            List<CSSParser.Rule> cSSRules = svg2.getCSSRules();
            Intrinsics.checkNotNull(cSSRules);
            for (CSSParser.Rule rule : cSSRules) {
                CSSParser.Companion companion = CSSParser.INSTANCE;
                CSSParser.RuleMatchContext ruleMatchContext = this.f51339h;
                Intrinsics.checkNotNull(rule);
                if (companion.ruleMatch(ruleMatchContext, rule.getSelector(), svgElementBase)) {
                    S(fVar, rule.getStyle());
                }
            }
        }
        if (svgElementBase.getStyle() != null) {
            S(fVar, svgElementBase.getStyle());
        }
    }

    public final void U() {
        int colour;
        f fVar = this.f51335d;
        Intrinsics.checkNotNull(fVar);
        SVG.Style style = fVar.f51365a;
        Intrinsics.checkNotNull(style);
        if (style.getViewportFill() instanceof SVG.Colour) {
            f fVar2 = this.f51335d;
            Intrinsics.checkNotNull(fVar2);
            SVG.Style style2 = fVar2.f51365a;
            Intrinsics.checkNotNull(style2);
            SVG.SvgPaint viewportFill = style2.getViewportFill();
            Intrinsics.checkNotNull(viewportFill, "null cannot be cast to non-null type com.mastercard.sonic.androidsvg.SVG.Colour");
            colour = ((SVG.Colour) viewportFill).getColour();
        } else {
            f fVar3 = this.f51335d;
            Intrinsics.checkNotNull(fVar3);
            SVG.Style style3 = fVar3.f51365a;
            Intrinsics.checkNotNull(style3);
            if (!(style3.getViewportFill() instanceof SVG.CurrentColor)) {
                return;
            }
            f fVar4 = this.f51335d;
            Intrinsics.checkNotNull(fVar4);
            SVG.Style style4 = fVar4.f51365a;
            Intrinsics.checkNotNull(style4);
            SVG.Colour color = style4.getColor();
            Intrinsics.checkNotNull(color);
            colour = color.getColour();
        }
        f fVar5 = this.f51335d;
        Intrinsics.checkNotNull(fVar5);
        SVG.Style style5 = fVar5.f51365a;
        Intrinsics.checkNotNull(style5);
        if (style5.getViewportFillOpacity() != null) {
            Companion companion = INSTANCE;
            f fVar6 = this.f51335d;
            Intrinsics.checkNotNull(fVar6);
            SVG.Style style6 = fVar6.f51365a;
            Intrinsics.checkNotNull(style6);
            Float viewportFillOpacity = style6.getViewportFillOpacity();
            Intrinsics.checkNotNull(viewportFillOpacity);
            colour = Companion.access$colourWithOpacity(companion, colour, viewportFillOpacity.floatValue());
        }
        this.f51332a.drawColor(colour);
    }

    public final boolean V() {
        f fVar = this.f51335d;
        Intrinsics.checkNotNull(fVar);
        SVG.Style style = fVar.f51365a;
        Intrinsics.checkNotNull(style);
        if (style.getVisibility() == null) {
            return true;
        }
        f fVar2 = this.f51335d;
        Intrinsics.checkNotNull(fVar2);
        SVG.Style style2 = fVar2.f51365a;
        Intrinsics.checkNotNull(style2);
        Boolean visibility = style2.getVisibility();
        Intrinsics.checkNotNull(visibility);
        return visibility.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0060  */
    @TargetApi(19)
    public final Path a(SVG.SvgElement svgElement, SVG.Box box) {
        boolean z10;
        Path pathC;
        SVG document = svgElement.getDocument();
        Intrinsics.checkNotNull(document);
        f fVar = this.f51335d;
        Intrinsics.checkNotNull(fVar);
        SVG.Style style = fVar.f51365a;
        Intrinsics.checkNotNull(style);
        SVG.SvgObject svgObjectResolveIRI = document.resolveIRI(style.getClipPath());
        if (svgObjectResolveIRI == null) {
            Companion companion = INSTANCE;
            f fVar2 = this.f51335d;
            Intrinsics.checkNotNull(fVar2);
            SVG.Style style2 = fVar2.f51365a;
            Intrinsics.checkNotNull(style2);
            String clipPath = style2.getClipPath();
            Intrinsics.checkNotNull(clipPath);
            Companion.access$error(companion, "ClipPath reference '%s' not found", clipPath);
            return null;
        }
        SVG.ClipPath clipPath2 = (SVG.ClipPath) svgObjectResolveIRI;
        Stack<f> stack = this.f51336e;
        Intrinsics.checkNotNull(stack);
        stack.push(this.f51335d);
        this.f51335d = r(clipPath2);
        if (clipPath2.getClipPathUnitsAreUser() != null) {
            Boolean clipPathUnitsAreUser = clipPath2.getClipPathUnitsAreUser();
            Intrinsics.checkNotNull(clipPathUnitsAreUser);
            z10 = clipPathUnitsAreUser.booleanValue();
        }
        Matrix matrix = new Matrix();
        if (!z10) {
            Intrinsics.checkNotNull(box);
            matrix.preTranslate(box.getMinX(), box.getMinY());
            matrix.preScale(box.getWidth(), box.getHeight());
        }
        if (clipPath2.getTransform() != null) {
            matrix.preConcat(clipPath2.getTransform());
        }
        Path path = new Path();
        for (SVG.SvgObject svgObject : clipPath2.getChildren()) {
            if ((svgObject instanceof SVG.SvgElement) && (pathC = C((SVG.SvgElement) svgObject, true)) != null) {
                path.op(pathC, Path.Op.UNION);
            }
        }
        f fVar3 = this.f51335d;
        Intrinsics.checkNotNull(fVar3);
        SVG.Style style3 = fVar3.f51365a;
        Intrinsics.checkNotNull(style3);
        if (style3.getClipPath() != null) {
            if (clipPath2.getBoundingBox() == null) {
                clipPath2.setBoundingBox(b(path));
            }
            Path pathA = a(clipPath2, clipPath2.getBoundingBox());
            if (pathA != null) {
                path.op(pathA, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        Stack<f> stack2 = this.f51336e;
        Intrinsics.checkNotNull(stack2);
        this.f51335d = stack2.pop();
        return path;
    }

    public final float c(SVG.TextContainer textContainer) {
        i iVar = new i();
        m(textContainer, iVar);
        return iVar.f51377a;
    }

    public final void f(SVG.SvgElement svgElement) {
        f fVar = this.f51335d;
        Intrinsics.checkNotNull(fVar);
        SVG.Style style = fVar.f51365a;
        Intrinsics.checkNotNull(style);
        if (style.getFill() instanceof SVG.PaintReference) {
            Intrinsics.checkNotNull(svgElement);
            SVG.Box boundingBox = svgElement.getBoundingBox();
            f fVar2 = this.f51335d;
            Intrinsics.checkNotNull(fVar2);
            SVG.Style style2 = fVar2.f51365a;
            Intrinsics.checkNotNull(style2);
            SVG.SvgPaint fill = style2.getFill();
            Intrinsics.checkNotNull(fill, "null cannot be cast to non-null type com.mastercard.sonic.androidsvg.SVG.PaintReference");
            i(true, boundingBox, (SVG.PaintReference) fill);
        }
        f fVar3 = this.f51335d;
        Intrinsics.checkNotNull(fVar3);
        SVG.Style style3 = fVar3.f51365a;
        Intrinsics.checkNotNull(style3);
        if (style3.getStroke() instanceof SVG.PaintReference) {
            Intrinsics.checkNotNull(svgElement);
            SVG.Box boundingBox2 = svgElement.getBoundingBox();
            f fVar4 = this.f51335d;
            Intrinsics.checkNotNull(fVar4);
            SVG.Style style4 = fVar4.f51365a;
            Intrinsics.checkNotNull(style4);
            SVG.SvgPaint stroke = style4.getStroke();
            Intrinsics.checkNotNull(stroke, "null cannot be cast to non-null type com.mastercard.sonic.androidsvg.SVG.PaintReference");
            i(false, boundingBox2, (SVG.PaintReference) stroke);
        }
    }

    public final float getCurrentFontSize() {
        f fVar = this.f51335d;
        Intrinsics.checkNotNull(fVar);
        return fVar.f51368d.getTextSize();
    }

    public final float getCurrentFontXHeight() {
        f fVar = this.f51335d;
        Intrinsics.checkNotNull(fVar);
        return fVar.f51368d.getTextSize() / 2.0f;
    }

    @Nullable
    public final SVG.Box getCurrentViewPortInUserUnits() {
        f fVar = this.f51335d;
        Intrinsics.checkNotNull(fVar);
        if (fVar.f51371g != null) {
            f fVar2 = this.f51335d;
            Intrinsics.checkNotNull(fVar2);
            return fVar2.f51371g;
        }
        f fVar3 = this.f51335d;
        Intrinsics.checkNotNull(fVar3);
        return fVar3.f51370f;
    }

    public final float getDpi() {
        return this.dpi;
    }

    public final void h(SVG.SvgObject svgObject) {
        if (svgObject instanceof SVG.SvgElementBase) {
            SVG.SvgElementBase svgElementBase = (SVG.SvgElementBase) svgObject;
            if (svgElementBase.getSpacePreserve() != null) {
                f fVar = this.f51335d;
                Intrinsics.checkNotNull(fVar);
                Boolean spacePreserve = svgElementBase.getSpacePreserve();
                Intrinsics.checkNotNull(spacePreserve);
                fVar.f51372h = spacePreserve.booleanValue();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0251  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:191:0x0455  */
    /* JADX WARN: Code duplicated, block: B:25:0x0083  */
    public final void i(boolean z10, SVG.Box box, SVG.PaintReference paintReference) {
        boolean z11;
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float fFloatValue4;
        float f6;
        float f10;
        int i10;
        Shader.TileMode tileMode;
        Shader.TileMode tileMode2;
        float fFloatValue5;
        float fFloatValueX;
        float fFloatValueY;
        boolean z12;
        float fFloatValue6;
        float fFloatValue7;
        float fFloatValue8;
        float fFloatValue9;
        float f11;
        float f12;
        float f13;
        float f14;
        Shader.TileMode tileMode3;
        Shader.TileMode tileMode4;
        float fFloatValue10;
        float fFloatValueX2;
        float fFloatValueY2;
        float width;
        float fFloatValueY3;
        SVG svg = this.f51334c;
        Intrinsics.checkNotNull(svg);
        Intrinsics.checkNotNull(paintReference);
        SVG.SvgObject svgObjectResolveIRI = svg.resolveIRI(paintReference.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String());
        int i11 = 0;
        if (svgObjectResolveIRI == null) {
            Companion companion = INSTANCE;
            Object[] objArr = new Object[2];
            objArr[0] = z10 ? "Fill" : "Stroke";
            objArr[1] = paintReference.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String();
            Companion.access$error(companion, "%s reference '%s' not found", objArr);
            if (paintReference.getFallback() != null) {
                N(this.f51335d, z10, paintReference.getFallback());
                return;
            }
            if (z10) {
                f fVar = this.f51335d;
                Intrinsics.checkNotNull(fVar);
                fVar.f51366b = false;
                return;
            } else {
                f fVar2 = this.f51335d;
                Intrinsics.checkNotNull(fVar2);
                fVar2.f51367c = false;
                return;
            }
        }
        float f15 = -1.0f;
        if (svgObjectResolveIRI instanceof SVG.SvgLinearGradient) {
            SVG.SvgLinearGradient svgLinearGradient = (SVG.SvgLinearGradient) svgObjectResolveIRI;
            if (svgLinearGradient.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String() != null) {
                o(svgLinearGradient, svgLinearGradient.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String());
            }
            if (svgLinearGradient.getGradientUnitsAreUser() != null) {
                Boolean gradientUnitsAreUser = svgLinearGradient.getGradientUnitsAreUser();
                Intrinsics.checkNotNull(gradientUnitsAreUser);
                if (gradientUnitsAreUser.booleanValue()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            } else {
                z12 = false;
            }
            f fVar3 = this.f51335d;
            Intrinsics.checkNotNull(fVar3);
            Paint paint = z10 ? fVar3.f51368d : fVar3.f51369e;
            if (z12) {
                SVG.Box currentViewPortInUserUnits = getCurrentViewPortInUserUnits();
                if (svgLinearGradient.getX1() != null) {
                    SVG.Length x4 = svgLinearGradient.getX1();
                    Intrinsics.checkNotNull(x4);
                    fFloatValueX2 = x4.floatValueX(this);
                } else {
                    fFloatValueX2 = 0.0f;
                }
                if (svgLinearGradient.getY1() != null) {
                    SVG.Length y7 = svgLinearGradient.getY1();
                    Intrinsics.checkNotNull(y7);
                    fFloatValueY2 = y7.floatValueY(this);
                } else {
                    fFloatValueY2 = 0.0f;
                }
                if (svgLinearGradient.getX2() != null) {
                    SVG.Length x6 = svgLinearGradient.getX2();
                    Intrinsics.checkNotNull(x6);
                    width = x6.floatValueX(this);
                } else {
                    Intrinsics.checkNotNull(currentViewPortInUserUnits);
                    width = currentViewPortInUserUnits.getWidth();
                }
                if (svgLinearGradient.getY2() != null) {
                    SVG.Length y10 = svgLinearGradient.getY2();
                    Intrinsics.checkNotNull(y10);
                    fFloatValueY3 = y10.floatValueY(this);
                } else {
                    fFloatValueY3 = 0.0f;
                }
                f14 = width;
                f12 = fFloatValueX2;
                f13 = fFloatValueY2;
                f11 = fFloatValueY3;
            } else {
                if (svgLinearGradient.getX1() != null) {
                    SVG.Length x7 = svgLinearGradient.getX1();
                    Intrinsics.checkNotNull(x7);
                    fFloatValue6 = x7.floatValue(this, 1.0f);
                } else {
                    fFloatValue6 = 0.0f;
                }
                if (svgLinearGradient.getY1() != null) {
                    SVG.Length y11 = svgLinearGradient.getY1();
                    Intrinsics.checkNotNull(y11);
                    fFloatValue7 = y11.floatValue(this, 1.0f);
                } else {
                    fFloatValue7 = 0.0f;
                }
                if (svgLinearGradient.getX2() != null) {
                    SVG.Length x10 = svgLinearGradient.getX2();
                    Intrinsics.checkNotNull(x10);
                    fFloatValue8 = x10.floatValue(this, 1.0f);
                } else {
                    fFloatValue8 = 1.0f;
                }
                if (svgLinearGradient.getY2() != null) {
                    SVG.Length y12 = svgLinearGradient.getY2();
                    Intrinsics.checkNotNull(y12);
                    fFloatValue9 = y12.floatValue(this, 1.0f);
                } else {
                    fFloatValue9 = 0.0f;
                }
                f11 = fFloatValue9;
                f12 = fFloatValue6;
                f13 = fFloatValue7;
                f14 = fFloatValue8;
            }
            P();
            this.f51335d = r(svgLinearGradient);
            Matrix matrix = new Matrix();
            if (!z12) {
                Intrinsics.checkNotNull(box);
                matrix.preTranslate(box.getMinX(), box.getMinY());
                matrix.preScale(box.getWidth(), box.getHeight());
            }
            if (svgLinearGradient.getGradientTransform() != null) {
                matrix.preConcat(svgLinearGradient.getGradientTransform());
            }
            int size = svgLinearGradient.getChildren().size();
            if (size == 0) {
                O();
                if (z10) {
                    f fVar4 = this.f51335d;
                    Intrinsics.checkNotNull(fVar4);
                    fVar4.f51366b = false;
                    return;
                } else {
                    f fVar5 = this.f51335d;
                    Intrinsics.checkNotNull(fVar5);
                    fVar5.f51367c = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            for (SVG.SvgObject svgObject : svgLinearGradient.getChildren()) {
                Intrinsics.checkNotNull(svgObject, "null cannot be cast to non-null type com.mastercard.sonic.androidsvg.SVG.Stop");
                SVG.Stop stop = (SVG.Stop) svgObject;
                if (stop.getAndroidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String() != null) {
                    Float offset = stop.getAndroidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String();
                    Intrinsics.checkNotNull(offset);
                    fFloatValue10 = offset.floatValue();
                } else {
                    fFloatValue10 = 0.0f;
                }
                if (i11 == 0 || fFloatValue10 >= f15) {
                    fArr[i11] = fFloatValue10;
                    f15 = fFloatValue10;
                } else {
                    fArr[i11] = f15;
                }
                P();
                T(this.f51335d, stop);
                f fVar6 = this.f51335d;
                Intrinsics.checkNotNull(fVar6);
                SVG.Style style = fVar6.f51365a;
                Intrinsics.checkNotNull(style);
                SVG.SvgPaint stopColor = style.getStopColor();
                Intrinsics.checkNotNull(stopColor, "null cannot be cast to non-null type com.mastercard.sonic.androidsvg.SVG.Colour");
                Companion companion2 = INSTANCE;
                int colour = ((SVG.Colour) stopColor).getColour();
                f fVar7 = this.f51335d;
                Intrinsics.checkNotNull(fVar7);
                SVG.Style style2 = fVar7.f51365a;
                Intrinsics.checkNotNull(style2);
                Float stopOpacity = style2.getStopOpacity();
                Intrinsics.checkNotNull(stopOpacity);
                iArr[i11] = Companion.access$colourWithOpacity(companion2, colour, stopOpacity.floatValue());
                i11++;
                O();
            }
            if ((f12 == f14 && f13 == f11) || size == 1) {
                O();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode5 = Shader.TileMode.CLAMP;
            if (svgLinearGradient.getSpreadMethod() == null) {
                tileMode3 = tileMode5;
            } else {
                if (svgLinearGradient.getSpreadMethod() == SVG.GradientSpread.reflect) {
                    tileMode4 = Shader.TileMode.MIRROR;
                } else if (svgLinearGradient.getSpreadMethod() == SVG.GradientSpread.repeat) {
                    tileMode4 = Shader.TileMode.REPEAT;
                } else {
                    tileMode3 = tileMode5;
                }
                tileMode3 = tileMode4;
            }
            O();
            LinearGradient linearGradient = new LinearGradient(f12, f13, f14, f11, iArr, fArr, tileMode3);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            Companion companion3 = INSTANCE;
            f fVar8 = this.f51335d;
            Intrinsics.checkNotNull(fVar8);
            SVG.Style style3 = fVar8.f51365a;
            Intrinsics.checkNotNull(style3);
            Float fillOpacity = style3.getFillOpacity();
            Intrinsics.checkNotNull(fillOpacity);
            paint.setAlpha(Companion.access$clamp255(companion3, fillOpacity.floatValue()));
            return;
        }
        if (!(svgObjectResolveIRI instanceof SVG.SvgRadialGradient)) {
            if (svgObjectResolveIRI instanceof SVG.SolidColor) {
                SVG.SolidColor solidColor = (SVG.SolidColor) svgObjectResolveIRI;
                if (z10) {
                    if (w(solidColor.getBaseStyle(), SvgConstantsKt.SPECIFIED_SOLID_COLOR)) {
                        f fVar9 = this.f51335d;
                        Intrinsics.checkNotNull(fVar9);
                        SVG.Style style4 = fVar9.f51365a;
                        Intrinsics.checkNotNull(style4);
                        SVG.Style baseStyle = solidColor.getBaseStyle();
                        Intrinsics.checkNotNull(baseStyle);
                        style4.setFill(baseStyle.getSolidColor());
                        f fVar10 = this.f51335d;
                        Intrinsics.checkNotNull(fVar10);
                        SVG.Style baseStyle2 = solidColor.getBaseStyle();
                        Intrinsics.checkNotNull(baseStyle2);
                        fVar10.f51366b = baseStyle2.getSolidColor() != null;
                    }
                    if (w(solidColor.getBaseStyle(), SvgConstantsKt.SPECIFIED_SOLID_OPACITY)) {
                        f fVar11 = this.f51335d;
                        Intrinsics.checkNotNull(fVar11);
                        SVG.Style style5 = fVar11.f51365a;
                        Intrinsics.checkNotNull(style5);
                        SVG.Style baseStyle3 = solidColor.getBaseStyle();
                        Intrinsics.checkNotNull(baseStyle3);
                        style5.setFillOpacity(baseStyle3.getSolidOpacity());
                    }
                    if (w(solidColor.getBaseStyle(), 6442450944L)) {
                        f fVar12 = this.f51335d;
                        Intrinsics.checkNotNull(fVar12);
                        SVG.Style style6 = fVar12.f51365a;
                        Intrinsics.checkNotNull(style6);
                        N(fVar12, z10, style6.getFill());
                        return;
                    }
                    return;
                }
                if (w(solidColor.getBaseStyle(), SvgConstantsKt.SPECIFIED_SOLID_COLOR)) {
                    f fVar13 = this.f51335d;
                    Intrinsics.checkNotNull(fVar13);
                    SVG.Style style7 = fVar13.f51365a;
                    Intrinsics.checkNotNull(style7);
                    SVG.Style baseStyle4 = solidColor.getBaseStyle();
                    Intrinsics.checkNotNull(baseStyle4);
                    style7.setStroke(baseStyle4.getSolidColor());
                    f fVar14 = this.f51335d;
                    Intrinsics.checkNotNull(fVar14);
                    SVG.Style baseStyle5 = solidColor.getBaseStyle();
                    Intrinsics.checkNotNull(baseStyle5);
                    fVar14.f51367c = baseStyle5.getSolidColor() != null;
                }
                if (w(solidColor.getBaseStyle(), SvgConstantsKt.SPECIFIED_SOLID_OPACITY)) {
                    f fVar15 = this.f51335d;
                    Intrinsics.checkNotNull(fVar15);
                    SVG.Style style8 = fVar15.f51365a;
                    Intrinsics.checkNotNull(style8);
                    SVG.Style baseStyle6 = solidColor.getBaseStyle();
                    Intrinsics.checkNotNull(baseStyle6);
                    style8.setStrokeOpacity(baseStyle6.getSolidOpacity());
                }
                if (w(solidColor.getBaseStyle(), 6442450944L)) {
                    f fVar16 = this.f51335d;
                    Intrinsics.checkNotNull(fVar16);
                    SVG.Style style9 = fVar16.f51365a;
                    Intrinsics.checkNotNull(style9);
                    N(fVar16, z10, style9.getStroke());
                    return;
                }
                return;
            }
            return;
        }
        SVG.SvgRadialGradient svgRadialGradient = (SVG.SvgRadialGradient) svgObjectResolveIRI;
        if (svgRadialGradient.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String() != null) {
            o(svgRadialGradient, svgRadialGradient.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String());
        }
        if (svgRadialGradient.getGradientUnitsAreUser() != null) {
            Boolean gradientUnitsAreUser2 = svgRadialGradient.getGradientUnitsAreUser();
            Intrinsics.checkNotNull(gradientUnitsAreUser2);
            if (gradientUnitsAreUser2.booleanValue()) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        f fVar17 = this.f51335d;
        Intrinsics.checkNotNull(fVar17);
        Paint paint2 = z10 ? fVar17.f51368d : fVar17.f51369e;
        if (z11) {
            SVG.Length length = new SVG.Length(50.0f, SVG.Unit.percent);
            if (svgRadialGradient.getCx() != null) {
                SVG.Length cx = svgRadialGradient.getCx();
                Intrinsics.checkNotNull(cx);
                fFloatValueX = cx.floatValueX(this);
            } else {
                fFloatValueX = length.floatValueX(this);
            }
            if (svgRadialGradient.getCy() != null) {
                SVG.Length cy = svgRadialGradient.getCy();
                Intrinsics.checkNotNull(cy);
                fFloatValueY = cy.floatValueY(this);
            } else {
                fFloatValueY = length.floatValueY(this);
            }
            if (svgRadialGradient.getR() != null) {
                length = svgRadialGradient.getR();
                Intrinsics.checkNotNull(length);
            }
            fFloatValue4 = length.floatValue(this);
            f6 = fFloatValueX;
            f10 = fFloatValueY;
        } else {
            if (svgRadialGradient.getCx() != null) {
                SVG.Length cx2 = svgRadialGradient.getCx();
                Intrinsics.checkNotNull(cx2);
                fFloatValue = cx2.floatValue(this, 1.0f);
            } else {
                fFloatValue = 0.5f;
            }
            if (svgRadialGradient.getCy() != null) {
                SVG.Length cy2 = svgRadialGradient.getCy();
                Intrinsics.checkNotNull(cy2);
                fFloatValue2 = cy2.floatValue(this, 1.0f);
            } else {
                fFloatValue2 = 0.5f;
            }
            if (svgRadialGradient.getR() != null) {
                SVG.Length r3 = svgRadialGradient.getR();
                Intrinsics.checkNotNull(r3);
                fFloatValue3 = r3.floatValue(this, 1.0f);
            } else {
                fFloatValue3 = 0.5f;
            }
            fFloatValue4 = fFloatValue3;
            f6 = fFloatValue;
            f10 = fFloatValue2;
        }
        P();
        this.f51335d = r(svgRadialGradient);
        Matrix matrix2 = new Matrix();
        if (!z11) {
            Intrinsics.checkNotNull(box);
            matrix2.preTranslate(box.getMinX(), box.getMinY());
            matrix2.preScale(box.getWidth(), box.getHeight());
        }
        if (svgRadialGradient.getGradientTransform() != null) {
            matrix2.preConcat(svgRadialGradient.getGradientTransform());
        }
        int size2 = svgRadialGradient.getChildren().size();
        if (size2 == 0) {
            O();
            if (z10) {
                f fVar18 = this.f51335d;
                Intrinsics.checkNotNull(fVar18);
                fVar18.f51366b = false;
                return;
            } else {
                f fVar19 = this.f51335d;
                Intrinsics.checkNotNull(fVar19);
                fVar19.f51367c = false;
                return;
            }
        }
        int[] iArr2 = new int[size2];
        float[] fArr2 = new float[size2];
        for (SVG.SvgObject svgObject2 : svgRadialGradient.getChildren()) {
            Intrinsics.checkNotNull(svgObject2, "null cannot be cast to non-null type com.mastercard.sonic.androidsvg.SVG.Stop");
            SVG.Stop stop2 = (SVG.Stop) svgObject2;
            if (stop2.getAndroidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String() != null) {
                Float offset2 = stop2.getAndroidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String();
                Intrinsics.checkNotNull(offset2);
                fFloatValue5 = offset2.floatValue();
            } else {
                fFloatValue5 = 0.0f;
            }
            if (i11 == 0 || fFloatValue5 >= f15) {
                fArr2[i11] = fFloatValue5;
                f15 = fFloatValue5;
            } else {
                fArr2[i11] = f15;
            }
            P();
            T(this.f51335d, stop2);
            f fVar20 = this.f51335d;
            Intrinsics.checkNotNull(fVar20);
            SVG.Style style10 = fVar20.f51365a;
            Intrinsics.checkNotNull(style10);
            SVG.SvgPaint stopColor2 = style10.getStopColor();
            Intrinsics.checkNotNull(stopColor2, "null cannot be cast to non-null type com.mastercard.sonic.androidsvg.SVG.Colour");
            Companion companion4 = INSTANCE;
            int colour2 = ((SVG.Colour) stopColor2).getColour();
            f fVar21 = this.f51335d;
            Intrinsics.checkNotNull(fVar21);
            SVG.Style style11 = fVar21.f51365a;
            Intrinsics.checkNotNull(style11);
            Float stopOpacity2 = style11.getStopOpacity();
            Intrinsics.checkNotNull(stopOpacity2);
            iArr2[i11] = Companion.access$colourWithOpacity(companion4, colour2, stopOpacity2.floatValue());
            i11++;
            O();
        }
        if (fFloatValue4 == 0.0f) {
            i10 = 1;
        } else {
            i10 = 1;
            if (size2 != 1) {
                Shader.TileMode tileMode6 = Shader.TileMode.CLAMP;
                if (svgRadialGradient.getSpreadMethod() == null) {
                    tileMode = tileMode6;
                } else {
                    if (svgRadialGradient.getSpreadMethod() == SVG.GradientSpread.reflect) {
                        tileMode2 = Shader.TileMode.MIRROR;
                    } else if (svgRadialGradient.getSpreadMethod() == SVG.GradientSpread.repeat) {
                        tileMode2 = Shader.TileMode.REPEAT;
                    } else {
                        tileMode = tileMode6;
                    }
                    tileMode = tileMode2;
                }
                O();
                RadialGradient radialGradient = new RadialGradient(f6, f10, fFloatValue4, iArr2, fArr2, tileMode);
                radialGradient.setLocalMatrix(matrix2);
                paint2.setShader(radialGradient);
                Companion companion5 = INSTANCE;
                f fVar22 = this.f51335d;
                Intrinsics.checkNotNull(fVar22);
                SVG.Style style12 = fVar22.f51365a;
                Intrinsics.checkNotNull(style12);
                Float fillOpacity2 = style12.getFillOpacity();
                Intrinsics.checkNotNull(fillOpacity2);
                paint2.setAlpha(Companion.access$clamp255(companion5, fillOpacity2.floatValue()));
                return;
            }
        }
        O();
        paint2.setColor(iArr2[size2 - i10]);
    }

    public final boolean j() {
        f fVar = this.f51335d;
        Intrinsics.checkNotNull(fVar);
        SVG.Style style = fVar.f51365a;
        Intrinsics.checkNotNull(style);
        if (style.getDisplay() == null) {
            return true;
        }
        f fVar2 = this.f51335d;
        Intrinsics.checkNotNull(fVar2);
        SVG.Style style2 = fVar2.f51365a;
        Intrinsics.checkNotNull(style2);
        Boolean display = style2.getDisplay();
        Intrinsics.checkNotNull(display);
        return display.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0057  */
    /* JADX WARN: Code duplicated, block: B:99:0x030c  */
    public final void k(SVG.SvgElement svgElement, Path path) {
        boolean z10;
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float fFloatValue4;
        float width;
        float height;
        float fFloatValueY;
        float fFloatValueX;
        boolean z11;
        f fVar = this.f51335d;
        Intrinsics.checkNotNull(fVar);
        SVG.Style style = fVar.f51365a;
        Intrinsics.checkNotNull(style);
        boolean z12 = style.getFill() instanceof SVG.PaintReference;
        Canvas canvas = this.f51332a;
        if (z12) {
            SVG svg = this.f51334c;
            Intrinsics.checkNotNull(svg);
            f fVar2 = this.f51335d;
            Intrinsics.checkNotNull(fVar2);
            SVG.Style style2 = fVar2.f51365a;
            Intrinsics.checkNotNull(style2);
            SVG.SvgPaint fill = style2.getFill();
            Intrinsics.checkNotNull(fill, "null cannot be cast to non-null type com.mastercard.sonic.androidsvg.SVG.PaintReference");
            SVG.SvgObject svgObjectResolveIRI = svg.resolveIRI(((SVG.PaintReference) fill).getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String());
            if (svgObjectResolveIRI instanceof SVG.Pattern) {
                SVG.Pattern pattern = (SVG.Pattern) svgObjectResolveIRI;
                if (pattern.getPatternUnitsAreUser() != null) {
                    Boolean patternUnitsAreUser = pattern.getPatternUnitsAreUser();
                    Intrinsics.checkNotNull(patternUnitsAreUser);
                    if (patternUnitsAreUser.booleanValue()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                if (pattern.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String() != null) {
                    q(pattern, pattern.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String());
                }
                if (z10) {
                    if (pattern.getX() != null) {
                        SVG.Length x4 = pattern.getX();
                        Intrinsics.checkNotNull(x4);
                        width = x4.floatValueX(this);
                    } else {
                        width = 0.0f;
                    }
                    if (pattern.getY() != null) {
                        SVG.Length y7 = pattern.getY();
                        Intrinsics.checkNotNull(y7);
                        fFloatValueY = y7.floatValueY(this);
                    } else {
                        fFloatValueY = 0.0f;
                    }
                    if (pattern.getWidth() != null) {
                        SVG.Length width2 = pattern.getWidth();
                        Intrinsics.checkNotNull(width2);
                        fFloatValueX = width2.floatValueX(this);
                    } else {
                        fFloatValueX = 0.0f;
                    }
                    if (pattern.getHeight() != null) {
                        SVG.Length height2 = pattern.getHeight();
                        Intrinsics.checkNotNull(height2);
                        height = height2.floatValueY(this);
                    } else {
                        height = 0.0f;
                    }
                } else {
                    if (pattern.getX() != null) {
                        SVG.Length x6 = pattern.getX();
                        Intrinsics.checkNotNull(x6);
                        fFloatValue = x6.floatValue(this, 1.0f);
                    } else {
                        fFloatValue = 0.0f;
                    }
                    if (pattern.getY() != null) {
                        SVG.Length y10 = pattern.getY();
                        Intrinsics.checkNotNull(y10);
                        fFloatValue2 = y10.floatValue(this, 1.0f);
                    } else {
                        fFloatValue2 = 0.0f;
                    }
                    if (pattern.getWidth() != null) {
                        SVG.Length width3 = pattern.getWidth();
                        Intrinsics.checkNotNull(width3);
                        fFloatValue3 = width3.floatValue(this, 1.0f);
                    } else {
                        fFloatValue3 = 0.0f;
                    }
                    if (pattern.getHeight() != null) {
                        SVG.Length height3 = pattern.getHeight();
                        Intrinsics.checkNotNull(height3);
                        fFloatValue4 = height3.floatValue(this, 1.0f);
                    } else {
                        fFloatValue4 = 0.0f;
                    }
                    SVG.Box boundingBox = svgElement.getBoundingBox();
                    Intrinsics.checkNotNull(boundingBox);
                    float minX = boundingBox.getMinX();
                    SVG.Box boundingBox2 = svgElement.getBoundingBox();
                    Intrinsics.checkNotNull(boundingBox2);
                    width = (boundingBox2.getWidth() * fFloatValue) + minX;
                    SVG.Box boundingBox3 = svgElement.getBoundingBox();
                    Intrinsics.checkNotNull(boundingBox3);
                    float minY = boundingBox3.getMinY();
                    SVG.Box boundingBox4 = svgElement.getBoundingBox();
                    Intrinsics.checkNotNull(boundingBox4);
                    float height4 = (boundingBox4.getHeight() * fFloatValue2) + minY;
                    SVG.Box boundingBox5 = svgElement.getBoundingBox();
                    Intrinsics.checkNotNull(boundingBox5);
                    float width4 = fFloatValue3 * boundingBox5.getWidth();
                    SVG.Box boundingBox6 = svgElement.getBoundingBox();
                    Intrinsics.checkNotNull(boundingBox6);
                    height = fFloatValue4 * boundingBox6.getHeight();
                    fFloatValueY = height4;
                    fFloatValueX = width4;
                }
                if (fFloatValueX == 0.0f || height == 0.0f) {
                    return;
                }
                PreserveAspectRatio preserveAspectRatio = pattern.getPreserveAspectRatio() != null ? pattern.getPreserveAspectRatio() : PreserveAspectRatio.INSTANCE.getLETTERBOX();
                P();
                canvas.clipPath(path);
                f fVar3 = new f();
                S(fVar3, SVG.Style.INSTANCE.getDefaultStyle());
                SVG.Style style3 = fVar3.f51365a;
                Intrinsics.checkNotNull(style3);
                style3.setOverflow(Boolean.FALSE);
                s(pattern, fVar3);
                this.f51335d = fVar3;
                SVG.Box boundingBox7 = svgElement.getBoundingBox();
                if (pattern.getPatternTransform() != null) {
                    canvas.concat(pattern.getPatternTransform());
                    Matrix matrix = new Matrix();
                    Matrix patternTransform = pattern.getPatternTransform();
                    Intrinsics.checkNotNull(patternTransform);
                    if (patternTransform.invert(matrix)) {
                        SVG.Box boundingBox8 = svgElement.getBoundingBox();
                        Intrinsics.checkNotNull(boundingBox8);
                        SVG.Box boundingBox9 = svgElement.getBoundingBox();
                        Intrinsics.checkNotNull(boundingBox9);
                        SVG.Box boundingBox10 = svgElement.getBoundingBox();
                        Intrinsics.checkNotNull(boundingBox10);
                        SVG.Box boundingBox11 = svgElement.getBoundingBox();
                        Intrinsics.checkNotNull(boundingBox11);
                        SVG.Box boundingBox12 = svgElement.getBoundingBox();
                        Intrinsics.checkNotNull(boundingBox12);
                        SVG.Box boundingBox13 = svgElement.getBoundingBox();
                        Intrinsics.checkNotNull(boundingBox13);
                        SVG.Box boundingBox14 = svgElement.getBoundingBox();
                        Intrinsics.checkNotNull(boundingBox14);
                        SVG.Box boundingBox15 = svgElement.getBoundingBox();
                        Intrinsics.checkNotNull(boundingBox15);
                        float[] fArr = {boundingBox8.getMinX(), boundingBox9.getMinY(), boundingBox10.maxX(), boundingBox11.getMinY(), boundingBox12.maxX(), boundingBox13.maxY(), boundingBox14.getMinX(), boundingBox15.maxY()};
                        matrix.mapPoints(fArr);
                        float f6 = fArr[0];
                        float f10 = fArr[1];
                        RectF rectF = new RectF(f6, f10, f6, f10);
                        for (int i10 = 2; i10 <= 6; i10 += 2) {
                            float f11 = fArr[i10];
                            if (f11 < rectF.left) {
                                rectF.left = f11;
                            }
                            if (f11 > rectF.right) {
                                rectF.right = f11;
                            }
                            float f12 = fArr[i10 + 1];
                            if (f12 < rectF.top) {
                                rectF.top = f12;
                            }
                            if (f12 > rectF.bottom) {
                                rectF.bottom = f12;
                            }
                        }
                        float f13 = rectF.left;
                        float f14 = rectF.top;
                        boundingBox7 = new SVG.Box(f13, f14, rectF.right - f13, rectF.bottom - f14);
                    }
                }
                Intrinsics.checkNotNull(boundingBox7);
                float fFloor = (((float) Math.floor(((double) (boundingBox7.getMinX() - width)) / ((double) fFloatValueX))) * fFloatValueX) + width;
                float fMaxX = boundingBox7.maxX();
                float fMaxY = boundingBox7.maxY();
                SVG.Box box = new SVG.Box(0.0f, 0.0f, fFloatValueX, height);
                boolean zF = F();
                for (float fFloor2 = (((float) Math.floor(((double) (boundingBox7.getMinY() - fFloatValueY)) / ((double) height))) * height) + fFloatValueY; fFloor2 < fMaxY; fFloor2 += height) {
                    float f15 = fFloor;
                    while (f15 < fMaxX) {
                        box.setMinX(f15);
                        box.setMinY(fFloor2);
                        P();
                        f fVar4 = this.f51335d;
                        Intrinsics.checkNotNull(fVar4);
                        SVG.Style style4 = fVar4.f51365a;
                        Intrinsics.checkNotNull(style4);
                        Boolean overflow = style4.getOverflow();
                        Intrinsics.checkNotNull(overflow);
                        if (!overflow.booleanValue()) {
                            M(box.getMinX(), box.getMinY(), box.getWidth(), box.getHeight());
                        }
                        if (pattern.getViewBox() != null) {
                            canvas.concat(d(box, pattern.getViewBox(), preserveAspectRatio));
                        } else {
                            if (pattern.getPatternContentUnitsAreUser() != null) {
                                Boolean patternContentUnitsAreUser = pattern.getPatternContentUnitsAreUser();
                                Intrinsics.checkNotNull(patternContentUnitsAreUser);
                                if (patternContentUnitsAreUser.booleanValue()) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                            } else {
                                z11 = true;
                            }
                            canvas.translate(f15, fFloor2);
                            if (!z11) {
                                SVG.Box boundingBox16 = svgElement.getBoundingBox();
                                Intrinsics.checkNotNull(boundingBox16);
                                float width5 = boundingBox16.getWidth();
                                SVG.Box boundingBox17 = svgElement.getBoundingBox();
                                Intrinsics.checkNotNull(boundingBox17);
                                canvas.scale(width5, boundingBox17.getHeight());
                            }
                        }
                        Iterator<SVG.SvgObject> it = pattern.getChildren().iterator();
                        while (it.hasNext()) {
                            H(it.next());
                        }
                        O();
                        f15 += fFloatValueX;
                        fMaxY = fMaxY;
                    }
                }
                if (zF) {
                    E(this, pattern);
                }
                O();
                return;
            }
        }
        f fVar5 = this.f51335d;
        Intrinsics.checkNotNull(fVar5);
        canvas.drawPath(path, fVar5.f51368d);
    }

    public final void l(Path path) {
        f fVar = this.f51335d;
        Intrinsics.checkNotNull(fVar);
        SVG.Style style = fVar.f51365a;
        Intrinsics.checkNotNull(style);
        SVG.Style.VectorEffect vectorEffect = style.getVectorEffect();
        SVG.Style.VectorEffect vectorEffect2 = SVG.Style.VectorEffect.NonScalingStroke;
        Canvas canvas = this.f51332a;
        if (vectorEffect != vectorEffect2) {
            f fVar2 = this.f51335d;
            Intrinsics.checkNotNull(fVar2);
            canvas.drawPath(path, fVar2.f51369e);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Intrinsics.checkNotNullExpressionValue(matrix, "canvas.matrix");
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        f fVar3 = this.f51335d;
        Intrinsics.checkNotNull(fVar3);
        Shader shader = fVar3.f51369e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        f fVar4 = this.f51335d;
        Intrinsics.checkNotNull(fVar4);
        canvas.drawPath(path2, fVar4.f51369e);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x013a  */
    /* JADX WARN: Code duplicated, block: B:63:0x017e  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a9  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void m(SVG.TextContainer textContainer, h hVar) {
        int i10;
        int i11;
        float f6;
        float fFloatValueY;
        float fFloatValueX;
        SVG.Style.TextAnchor textAnchorT;
        float fFloatValueX2;
        if (j()) {
            Iterator<SVG.SvgObject> it = textContainer.getChildren().iterator();
            int i12 = 1;
            boolean z10 = true;
            while (it.hasNext()) {
                SVG.SvgObject next = it.next();
                boolean z11 = false;
                if (next instanceof SVG.TextSequence) {
                    hVar.b(Q(((SVG.TextSequence) next).getText(), z10, (it.hasNext() ? 1 : 0) ^ i12));
                } else {
                    SVG.TextContainer textContainer2 = (SVG.TextContainer) next;
                    if (hVar.a(textContainer2)) {
                        float fFloatValueY2 = 0.0f;
                        if (next instanceof SVG.TextPath) {
                            P();
                            SVG.TextPath textPath = (SVG.TextPath) next;
                            Companion companion = INSTANCE;
                            Object[] objArr = new Object[0];
                            companion.getClass();
                            T(this.f51335d, textPath);
                            if (j() && V()) {
                                SVG document = textPath.getDocument();
                                Intrinsics.checkNotNull(document);
                                SVG.SvgObject svgObjectResolveIRI = document.resolveIRI(textPath.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String());
                                if (svgObjectResolveIRI == null) {
                                    Object[] objArr2 = new Object[i12];
                                    String href = textPath.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String();
                                    Intrinsics.checkNotNull(href);
                                    objArr2[0] = href;
                                    Companion.access$error(companion, "TextPath reference '%s' not found", objArr2);
                                } else {
                                    SVG.Path path = (SVG.Path) svgObjectResolveIRI;
                                    Path path2 = new PathConverter(path.getD()).getPath();
                                    if (path.getTransform() != null) {
                                        Matrix transform = path.getTransform();
                                        Intrinsics.checkNotNull(transform);
                                        path2.transform(transform);
                                    }
                                    PathMeasure pathMeasure = new PathMeasure(path2, false);
                                    if (textPath.getStartOffset() != null) {
                                        SVG.Length startOffset = textPath.getStartOffset();
                                        Intrinsics.checkNotNull(startOffset);
                                        fFloatValueY2 = startOffset.floatValue(this, pathMeasure.getLength());
                                    }
                                    SVG.Style.TextAnchor textAnchorT2 = t();
                                    if (textAnchorT2 != SVG.Style.TextAnchor.Start) {
                                        float fC = c(textPath);
                                        if (textAnchorT2 == SVG.Style.TextAnchor.Middle) {
                                            fC /= 2;
                                        }
                                        fFloatValueY2 -= fC;
                                    }
                                    SVG.TextRoot textRoot = textPath.getTextRoot();
                                    Intrinsics.checkNotNull(textRoot, "null cannot be cast to non-null type com.mastercard.sonic.androidsvg.SVG.SvgElement");
                                    f((SVG.SvgElement) textRoot);
                                    boolean zF = F();
                                    m(textPath, new c(fFloatValueY2, path2, this));
                                    if (zF) {
                                        D(textPath.getBoundingBox());
                                    }
                                }
                            }
                            O();
                        } else {
                            if (next instanceof SVG.TSpan) {
                                Object[] objArr3 = new Object[0];
                                INSTANCE.getClass();
                                P();
                                T(this.f51335d, (SVG.SvgElementBase) next);
                                if (j()) {
                                    SVG.TSpan tSpan = (SVG.TSpan) next;
                                    if (tSpan.getX() != null) {
                                        List<SVG.Length> x4 = tSpan.getX();
                                        Intrinsics.checkNotNull(x4);
                                        if (x4.size() > 0) {
                                            i11 = i12;
                                        } else {
                                            i11 = 0;
                                        }
                                    } else {
                                        i11 = 0;
                                    }
                                    boolean z12 = hVar instanceof d;
                                    if (z12) {
                                        if (i11 == 0) {
                                            fFloatValueX2 = ((d) hVar).f51358a;
                                        } else {
                                            List<SVG.Length> x6 = tSpan.getX();
                                            Intrinsics.checkNotNull(x6);
                                            fFloatValueX2 = x6.get(0).floatValueX(this);
                                        }
                                        if (tSpan.getY() != null) {
                                            List<SVG.Length> y7 = tSpan.getY();
                                            Intrinsics.checkNotNull(y7);
                                            if (y7.size() == 0) {
                                                fFloatValueY = ((d) hVar).f51359b;
                                            } else {
                                                List<SVG.Length> y10 = tSpan.getY();
                                                Intrinsics.checkNotNull(y10);
                                                fFloatValueY = y10.get(0).floatValueY(this);
                                            }
                                        } else {
                                            fFloatValueY = ((d) hVar).f51359b;
                                        }
                                        if (tSpan.getDx() != null) {
                                            List<SVG.Length> dx = tSpan.getDx();
                                            Intrinsics.checkNotNull(dx);
                                            if (dx.size() == 0) {
                                                fFloatValueX = 0.0f;
                                            } else {
                                                List<SVG.Length> dx2 = tSpan.getDx();
                                                Intrinsics.checkNotNull(dx2);
                                                fFloatValueX = dx2.get(0).floatValueX(this);
                                            }
                                        } else {
                                            fFloatValueX = 0.0f;
                                        }
                                        if (tSpan.getDy() != null) {
                                            List<SVG.Length> dy = tSpan.getDy();
                                            Intrinsics.checkNotNull(dy);
                                            if (dy.size() != 0) {
                                                List<SVG.Length> dy2 = tSpan.getDy();
                                                Intrinsics.checkNotNull(dy2);
                                                fFloatValueY2 = dy2.get(0).floatValueY(this);
                                            }
                                        }
                                        float f10 = fFloatValueX2;
                                        f6 = fFloatValueY2;
                                        fFloatValueY2 = f10;
                                    } else {
                                        f6 = 0.0f;
                                        fFloatValueY = 0.0f;
                                        fFloatValueX = 0.0f;
                                    }
                                    if (i11 != 0 && (textAnchorT = t()) != SVG.Style.TextAnchor.Start) {
                                        float fC2 = c(textContainer2);
                                        if (textAnchorT == SVG.Style.TextAnchor.Middle) {
                                            fC2 /= 2;
                                        }
                                        fFloatValueY2 -= fC2;
                                    }
                                    SVG.TextRoot textRoot2 = tSpan.getTextRoot();
                                    Intrinsics.checkNotNull(textRoot2, "null cannot be cast to non-null type com.mastercard.sonic.androidsvg.SVG.SvgElement");
                                    f((SVG.SvgElement) textRoot2);
                                    if (z12) {
                                        d dVar = (d) hVar;
                                        dVar.f51358a = fFloatValueY2 + fFloatValueX;
                                        dVar.f51359b = fFloatValueY + f6;
                                    }
                                    boolean zF2 = F();
                                    m(textContainer2, hVar);
                                    if (zF2) {
                                        E(this, (SVG.SvgElement) next);
                                    }
                                }
                                O();
                            } else if (next instanceof SVG.TRef) {
                                P();
                                T(this.f51335d, (SVG.SvgElementBase) next);
                                if (j()) {
                                    SVG.TRef tRef = (SVG.TRef) next;
                                    SVG.TextRoot textRoot3 = tRef.getTextRoot();
                                    Intrinsics.checkNotNull(textRoot3, "null cannot be cast to non-null type com.mastercard.sonic.androidsvg.SVG.SvgElement");
                                    f((SVG.SvgElement) textRoot3);
                                    SVG document2 = textContainer2.getDocument();
                                    Intrinsics.checkNotNull(document2);
                                    SVG.SvgObject svgObjectResolveIRI2 = document2.resolveIRI(tRef.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String());
                                    if (svgObjectResolveIRI2 == null || !(svgObjectResolveIRI2 instanceof SVG.TextContainer)) {
                                        Companion companion2 = INSTANCE;
                                        i10 = 1;
                                        String href2 = tRef.getCom.mastercard.sonic.androidsvg.SVGParser.XML_STYLESHEET_ATTR_HREF java.lang.String();
                                        Intrinsics.checkNotNull(href2);
                                        z11 = false;
                                        Companion.access$error(companion2, "Tref reference '%s' not found", href2);
                                    } else {
                                        StringBuilder sb2 = new StringBuilder();
                                        n((SVG.TextContainer) svgObjectResolveIRI2, sb2);
                                        if (sb2.length() > 0) {
                                            String string = sb2.toString();
                                            Intrinsics.checkNotNullExpressionValue(string, "str.toString()");
                                            hVar.b(string);
                                        }
                                        i10 = 1;
                                        z11 = false;
                                    }
                                } else {
                                    i10 = 1;
                                    z11 = false;
                                }
                                O();
                            }
                            i10 = 1;
                            z11 = false;
                        }
                    }
                    i12 = i10;
                    z10 = z11;
                }
                i10 = i12;
                i12 = i10;
                z10 = z11;
            }
        }
    }

    public final void n(SVG.TextContainer textContainer, StringBuilder sb2) {
        Iterator<SVG.SvgObject> it = textContainer.getChildren().iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            SVG.SvgObject next = it.next();
            if (next instanceof SVG.TextContainer) {
                n((SVG.TextContainer) next, sb2);
            } else if (next instanceof SVG.TextSequence) {
                sb2.append(Q(((SVG.TextSequence) next).getText(), z10, !it.hasNext()));
            }
            z10 = false;
        }
    }

    public final f r(SVG.SvgObject svgObject) {
        f fVar = new f();
        S(fVar, SVG.Style.INSTANCE.getDefaultStyle());
        s(svgObject, fVar);
        return fVar;
    }

    public final void renderDocument(@NotNull SVG document, @Nullable RenderOptions renderOptions) {
        SVG.Box viewBox;
        PreserveAspectRatio preserveAspectRatio;
        Intrinsics.checkNotNullParameter(document, "document");
        if (renderOptions == null) {
            throw new NullPointerException("renderOptions shouldn't be null");
        }
        this.f51334c = document;
        SVG.Svg rootElement = document.getRootElement();
        if (rootElement == null) {
            Companion.access$warn(INSTANCE, "Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        if (renderOptions.hasView()) {
            SVG svg = this.f51334c;
            Intrinsics.checkNotNull(svg);
            SVG.SvgElementBase elementById = svg.getElementById(renderOptions.getViewId());
            if (elementById == null || !(elementById instanceof SVG.View)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("View element with id \"%s\" not found.", Arrays.copyOf(new Object[]{renderOptions.getViewId()}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                Log.w("SVGAndroidRenderer", str);
                return;
            }
            SVG.View view = (SVG.View) elementById;
            if (view.getViewBox() == null) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String str2 = String.format("View element with id \"%s\" is missing a viewBox attribute.", Arrays.copyOf(new Object[]{renderOptions.getViewId()}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
                Log.w("SVGAndroidRenderer", str2);
                return;
            }
            viewBox = view.getViewBox();
            preserveAspectRatio = view.getPreserveAspectRatio();
        } else {
            viewBox = renderOptions.hasViewBox() ? renderOptions.getViewBox() : rootElement.getViewBox();
            preserveAspectRatio = renderOptions.hasPreserveAspectRatio() ? renderOptions.getPreserveAspectRatio() : rootElement.getPreserveAspectRatio();
        }
        if (renderOptions.hasCss()) {
            document.addCSSRules(renderOptions.getCss());
        }
        if (renderOptions.hasTarget()) {
            CSSParser.RuleMatchContext ruleMatchContext = new CSSParser.RuleMatchContext();
            this.f51339h = ruleMatchContext;
            Intrinsics.checkNotNull(ruleMatchContext);
            ruleMatchContext.setTargetElement(document.getElementById(renderOptions.getTargetId()));
        }
        this.f51335d = new f();
        this.f51336e = new Stack<>();
        S(this.f51335d, SVG.Style.INSTANCE.getDefaultStyle());
        f fVar = this.f51335d;
        Intrinsics.checkNotNull(fVar);
        fVar.f51370f = null;
        f fVar2 = this.f51335d;
        Intrinsics.checkNotNull(fVar2);
        fVar2.f51372h = false;
        Stack<f> stack = this.f51336e;
        Intrinsics.checkNotNull(stack);
        f fVar3 = this.f51335d;
        Intrinsics.checkNotNull(fVar3);
        stack.push(new f(fVar3));
        this.f51338g = new Stack<>();
        this.f51337f = new Stack<>();
        h(rootElement);
        P();
        SVG.Box box = new SVG.Box(renderOptions.getViewPort());
        if (rootElement.getWidth() != null) {
            SVG.Length width = rootElement.getWidth();
            Intrinsics.checkNotNull(width);
            box.setWidth(width.floatValue(this, box.getWidth()));
        }
        if (rootElement.getHeight() != null) {
            SVG.Length height = rootElement.getHeight();
            Intrinsics.checkNotNull(height);
            box.setHeight(height.floatValue(this, box.getHeight()));
        }
        G(rootElement, box, viewBox, preserveAspectRatio);
        O();
        if (renderOptions.hasCss()) {
            document.clearRenderCSSRules();
        }
    }

    public final void s(SVG.SvgObject svgObject, f fVar) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (svgObject instanceof SVG.SvgElementBase) {
                arrayList.add(0, svgObject);
            }
            Intrinsics.checkNotNull(svgObject);
            if (svgObject.getParent() == null) {
                break;
            }
            Object parent = svgObject.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type com.mastercard.sonic.androidsvg.SVG.SvgObject");
            svgObject = (SVG.SvgObject) parent;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            T(fVar, (SVG.SvgElementBase) it.next());
        }
        f fVar2 = this.f51335d;
        Intrinsics.checkNotNull(fVar2);
        fVar.f51371g = fVar2.f51371g;
        f fVar3 = this.f51335d;
        Intrinsics.checkNotNull(fVar3);
        fVar.f51370f = fVar3.f51370f;
    }

    public final SVG.Style.TextAnchor t() {
        f fVar = this.f51335d;
        Intrinsics.checkNotNull(fVar);
        SVG.Style style = fVar.f51365a;
        Intrinsics.checkNotNull(style);
        if (style.getDirection() != SVG.Style.TextDirection.LTR) {
            f fVar2 = this.f51335d;
            Intrinsics.checkNotNull(fVar2);
            SVG.Style style2 = fVar2.f51365a;
            Intrinsics.checkNotNull(style2);
            if (style2.getTextAnchor() != SVG.Style.TextAnchor.Middle) {
                f fVar3 = this.f51335d;
                Intrinsics.checkNotNull(fVar3);
                SVG.Style style3 = fVar3.f51365a;
                Intrinsics.checkNotNull(style3);
                SVG.Style.TextAnchor textAnchor = style3.getTextAnchor();
                SVG.Style.TextAnchor textAnchor2 = SVG.Style.TextAnchor.Start;
                return textAnchor == textAnchor2 ? SVG.Style.TextAnchor.End : textAnchor2;
            }
        }
        f fVar4 = this.f51335d;
        Intrinsics.checkNotNull(fVar4);
        SVG.Style style4 = fVar4.f51365a;
        Intrinsics.checkNotNull(style4);
        return style4.getTextAnchor();
    }

    public final Path.FillType u() {
        f fVar = this.f51335d;
        Intrinsics.checkNotNull(fVar);
        SVG.Style style = fVar.f51365a;
        Intrinsics.checkNotNull(style);
        if (style.getClipRule() != null) {
            f fVar2 = this.f51335d;
            Intrinsics.checkNotNull(fVar2);
            SVG.Style style2 = fVar2.f51365a;
            Intrinsics.checkNotNull(style2);
            if (style2.getClipRule() == SVG.Style.FillRule.EvenOdd) {
                return Path.FillType.EVEN_ODD;
            }
        }
        return Path.FillType.WINDING;
    }

    public final Path.FillType v() {
        f fVar = this.f51335d;
        Intrinsics.checkNotNull(fVar);
        SVG.Style style = fVar.f51365a;
        Intrinsics.checkNotNull(style);
        if (style.getFillRule() != null) {
            f fVar2 = this.f51335d;
            Intrinsics.checkNotNull(fVar2);
            SVG.Style style2 = fVar2.f51365a;
            Intrinsics.checkNotNull(style2);
            if (style2.getFillRule() == SVG.Style.FillRule.EvenOdd) {
                return Path.FillType.EVEN_ODD;
            }
        }
        return Path.FillType.WINDING;
    }

    public final Path x(SVG.Circle circle) {
        float fFloatValueX;
        float fFloatValueY = 0.0f;
        if (circle.getCx() != null) {
            SVG.Length cx = circle.getCx();
            Intrinsics.checkNotNull(cx);
            fFloatValueX = cx.floatValueX(this);
        } else {
            fFloatValueX = 0.0f;
        }
        if (circle.getCy() != null) {
            SVG.Length cy = circle.getCy();
            Intrinsics.checkNotNull(cy);
            fFloatValueY = cy.floatValueY(this);
        }
        SVG.Length r3 = circle.getR();
        Intrinsics.checkNotNull(r3);
        float fFloatValue = r3.floatValue(this);
        float f6 = fFloatValueX - fFloatValue;
        float f10 = fFloatValueY - fFloatValue;
        float f11 = fFloatValueX + fFloatValue;
        float f12 = fFloatValueY + fFloatValue;
        if (circle.getBoundingBox() == null) {
            float f13 = 2 * fFloatValue;
            circle.setBoundingBox(new SVG.Box(f6, f10, f13, f13));
        }
        float f14 = fFloatValue * 0.5522848f;
        Path path = new Path();
        path.moveTo(fFloatValueX, f10);
        float f15 = fFloatValueX + f14;
        float f16 = fFloatValueY - f14;
        path.cubicTo(f15, f10, f11, f16, f11, fFloatValueY);
        float f17 = fFloatValueY + f14;
        path.cubicTo(f11, f17, f15, f12, fFloatValueX, f12);
        float f18 = fFloatValueX - f14;
        path.cubicTo(f18, f12, f6, f17, f6, fFloatValueY);
        path.cubicTo(f6, f16, f18, f10, fFloatValueX, f10);
        path.close();
        return path;
    }

    public final Path y(SVG.Ellipse ellipse) {
        float fFloatValueX;
        float fFloatValueY = 0.0f;
        if (ellipse.getCx() != null) {
            SVG.Length cx = ellipse.getCx();
            Intrinsics.checkNotNull(cx);
            fFloatValueX = cx.floatValueX(this);
        } else {
            fFloatValueX = 0.0f;
        }
        if (ellipse.getCy() != null) {
            SVG.Length cy = ellipse.getCy();
            Intrinsics.checkNotNull(cy);
            fFloatValueY = cy.floatValueY(this);
        }
        SVG.Length rx = ellipse.getRx();
        Intrinsics.checkNotNull(rx);
        float fFloatValueX2 = rx.floatValueX(this);
        SVG.Length ry = ellipse.getRy();
        Intrinsics.checkNotNull(ry);
        float fFloatValueY2 = ry.floatValueY(this);
        float f6 = fFloatValueX - fFloatValueX2;
        float f10 = fFloatValueY - fFloatValueY2;
        float f11 = fFloatValueX + fFloatValueX2;
        float f12 = fFloatValueY + fFloatValueY2;
        if (ellipse.getBoundingBox() == null) {
            float f13 = 2;
            ellipse.setBoundingBox(new SVG.Box(f6, f10, fFloatValueX2 * f13, f13 * fFloatValueY2));
        }
        float f14 = fFloatValueX2 * 0.5522848f;
        float f15 = fFloatValueY2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(fFloatValueX, f10);
        float f16 = fFloatValueX + f14;
        float f17 = fFloatValueY - f15;
        path.cubicTo(f16, f10, f11, f17, f11, fFloatValueY);
        float f18 = f15 + fFloatValueY;
        path.cubicTo(f11, f18, f16, f12, fFloatValueX, f12);
        float f19 = fFloatValueX - f14;
        path.cubicTo(f19, f12, f6, f18, f6, fFloatValueY);
        path.cubicTo(f6, f17, f19, f10, fFloatValueX, f10);
        path.close();
        return path;
    }

    /* JADX INFO: compiled from: SVGAndroidRenderer.kt */
    public final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final SVG.Style f51365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f51366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f51367c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Paint f51368d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final Paint f51369e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public SVG.Box f51370f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public SVG.Box f51371g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f51372h;

        public f() {
            Paint paint = new Paint();
            this.f51368d = paint;
            paint.setFlags(Opcodes.INSTANCEOF);
            paint.setHinting(0);
            paint.setStyle(Paint.Style.FILL);
            Typeface typeface = Typeface.DEFAULT;
            paint.setTypeface(typeface);
            Paint paint2 = new Paint();
            this.f51369e = paint2;
            paint2.setFlags(Opcodes.INSTANCEOF);
            paint2.setHinting(0);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setTypeface(typeface);
            this.f51365a = SVG.Style.INSTANCE.getDefaultStyle();
        }

        public f(@NotNull f copy) {
            SVG.Style defaultStyle;
            Intrinsics.checkNotNullParameter(copy, "copy");
            this.f51366b = copy.f51366b;
            this.f51367c = copy.f51367c;
            this.f51368d = new Paint(copy.f51368d);
            this.f51369e = new Paint(copy.f51369e);
            if (copy.f51370f != null) {
                this.f51370f = new SVG.Box(copy.f51370f);
            }
            if (copy.f51371g != null) {
                this.f51371g = new SVG.Box(copy.f51371g);
            }
            this.f51372h = copy.f51372h;
            try {
                SVG.Style style = copy.f51365a;
                Intrinsics.checkNotNull(style);
                Object objClone = style.clone();
                Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type com.mastercard.sonic.androidsvg.SVG.Style");
                defaultStyle = (SVG.Style) objClone;
            } catch (CloneNotSupportedException unused) {
                defaultStyle = SVG.Style.INSTANCE.getDefaultStyle();
            }
            this.f51365a = defaultStyle;
        }
    }
}
