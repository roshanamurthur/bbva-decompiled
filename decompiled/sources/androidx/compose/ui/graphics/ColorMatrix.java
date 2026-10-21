package androidx.compose.ui.graphics;

import androidx.core.text.util.LocalePreferences;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.plugin.localstorage.command.SetCommand;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ColorMatrix.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\"\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u0014\u0012\b\b\u0002\u0010>\u001a\u000209ø\u0001\u0001¢\u0006\u0004\b?\u0010@J \u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0086\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\r\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0013J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010!\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010$\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b#\u0010\u0019J\u0015\u0010&\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b%\u0010\u0019J\u0015\u0010(\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b'\u0010\u0019J\r\u0010*\u001a\u00020\n¢\u0006\u0004\b)\u0010\u000fJ\r\u0010,\u001a\u00020\n¢\u0006\u0004\b+\u0010\u000fJ\u0010\u00100\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00108\u001a\u0002052\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107R\u0017\u0010>\u001a\u0002098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\u0088\u0001>\u0092\u0001\u000209ø\u0001\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006A"}, d2 = {"Landroidx/compose/ui/graphics/ColorMatrix;", "", "", "row", "column", "", "get-impl", "([FII)F", "get", SharedPrefsStorage.VERSION_KEY, "", "set-impl", "([FIIF)V", SetCommand.ID, "reset-impl", "([F)V", "reset", "src", "set-jHG-Opc", "([F[F)V", "colorMatrix", "timesAssign-jHG-Opc", "timesAssign", LocalePreferences.FirstDayOfWeek.SATURDAY, "setToSaturation-impl", "([FF)V", "setToSaturation", "redScale", "greenScale", "blueScale", "alphaScale", "setToScale-impl", "([FFFFF)V", "setToScale", "degrees", "setToRotateRed-impl", "setToRotateRed", "setToRotateGreen-impl", "setToRotateGreen", "setToRotateBlue-impl", "setToRotateBlue", "convertRgbToYuv-impl", "convertRgbToYuv", "convertYuvToRgb-impl", "convertYuvToRgb", "", "toString-impl", "([F)Ljava/lang/String;", "toString", "hashCode-impl", "([F)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "([FLjava/lang/Object;)Z", "equals", "", "a", "[F", "getValues", "()[F", "values", "constructor-impl", "([F)[F", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
@SourceDebugExtension({"SMAP\nColorMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorMatrix.kt\nandroidx/compose/ui/graphics/ColorMatrix\n*L\n1#1,328:1\n97#1,2:329\n97#1,2:331\n97#1,2:333\n97#1,2:335\n84#1:337\n84#1:338\n84#1:339\n84#1:340\n84#1:341\n84#1:342\n84#1:343\n84#1:344\n84#1:345\n84#1:346\n84#1:347\n84#1:348\n84#1:349\n84#1:350\n84#1:351\n84#1:352\n84#1:353\n84#1:354\n84#1:355\n84#1:356\n97#1,2:357\n97#1,2:359\n97#1,2:361\n97#1,2:363\n97#1,2:365\n97#1,2:367\n97#1,2:369\n97#1,2:371\n97#1,2:373\n97#1,2:375\n97#1,2:377\n97#1,2:379\n97#1,2:381\n97#1,2:383\n97#1,2:385\n97#1,2:387\n97#1,2:389\n97#1,2:391\n97#1,2:393\n97#1,2:395\n84#1:397\n84#1:398\n84#1:399\n84#1:400\n97#1,2:401\n97#1,2:403\n97#1,2:405\n97#1,2:407\n97#1,2:409\n97#1,2:411\n97#1,2:413\n97#1,2:415\n97#1,2:417\n97#1,2:419\n97#1,2:421\n97#1,2:423\n97#1,2:425\n133#1,5:427\n97#1,2:432\n97#1,2:434\n97#1,2:436\n97#1,2:438\n138#1:440\n133#1,5:441\n97#1,2:446\n97#1,2:448\n97#1,2:450\n97#1,2:452\n138#1:454\n133#1,5:455\n97#1,2:460\n97#1,2:462\n97#1,2:464\n97#1,2:466\n138#1:468\n97#1,2:469\n97#1,2:471\n97#1,2:473\n97#1,2:475\n97#1,2:477\n97#1,2:479\n97#1,2:481\n97#1,2:483\n97#1,2:485\n97#1,2:487\n97#1,2:489\n97#1,2:491\n97#1,2:493\n97#1,2:495\n97#1,2:497\n97#1,2:499\n*S KotlinDebug\n*F\n+ 1 ColorMatrix.kt\nandroidx/compose/ui/graphics/ColorMatrix\n*L\n111#1:329,2\n112#1:331,2\n113#1:333,2\n114#1:335,2\n148#1:337\n149#1:338\n150#1:339\n151#1:340\n152#1:341\n158#1:342\n159#1:343\n160#1:344\n161#1:345\n162#1:346\n168#1:347\n169#1:348\n170#1:349\n171#1:350\n172#1:351\n178#1:352\n179#1:353\n180#1:354\n181#1:355\n182#1:356\n184#1:357,2\n185#1:359,2\n186#1:361,2\n187#1:363,2\n188#1:365,2\n189#1:367,2\n190#1:369,2\n191#1:371,2\n192#1:373,2\n193#1:375,2\n194#1:377,2\n195#1:379,2\n196#1:381,2\n197#1:383,2\n198#1:385,2\n199#1:387,2\n200#1:389,2\n201#1:391,2\n202#1:393,2\n203#1:395,2\n211#1:397\n212#1:398\n213#1:399\n214#1:400\n228#1:401,2\n229#1:403,2\n230#1:405,2\n231#1:407,2\n232#1:409,2\n233#1:411,2\n234#1:413,2\n235#1:415,2\n236#1:417,2\n255#1:419,2\n256#1:421,2\n257#1:423,2\n258#1:425,2\n265#1:427,5\n266#1:432,2\n267#1:434,2\n268#1:436,2\n269#1:438,2\n265#1:440\n277#1:441,5\n278#1:446,2\n279#1:448,2\n280#1:450,2\n281#1:452,2\n277#1:454\n289#1:455,5\n290#1:460,2\n291#1:462,2\n292#1:464,2\n293#1:466,2\n289#1:468\n303#1:469,2\n304#1:471,2\n305#1:473,2\n306#1:475,2\n307#1:477,2\n308#1:479,2\n309#1:481,2\n310#1:483,2\n311#1:485,2\n320#1:487,2\n321#1:489,2\n322#1:491,2\n323#1:493,2\n324#1:495,2\n325#1:497,2\n326#1:499,2\n*E\n"})
public final class ColorMatrix {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final float[] values;

    public /* synthetic */ ColorMatrix(float[] fArr) {
        this.values = fArr;
    }

    public static final float a(float[] fArr, int i10, int i11, float[] fArr2) {
        int i12 = i10 * 5;
        return (fArr[i12 + 3] * fArr2[15 + i11]) + (fArr[i12 + 2] * fArr2[10 + i11]) + (fArr[i12 + 1] * fArr2[5 + i11]) + (fArr[i12] * fArr2[i11]);
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ColorMatrix m2562boximpl(float[] fArr) {
        return new ColorMatrix(fArr);
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static float[] m2563constructorimpl(@NotNull float[] values) {
        Intrinsics.checkNotNullParameter(values, "values");
        return values;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m2564constructorimpl$default(float[] fArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        }
        return m2563constructorimpl(fArr);
    }

    /* JADX INFO: renamed from: convertRgbToYuv-impl, reason: not valid java name */
    public static final void m2565convertRgbToYuvimpl(float[] fArr) {
        m2571resetimpl(fArr);
        fArr[0] = 0.299f;
        fArr[1] = 0.587f;
        fArr[2] = 0.114f;
        fArr[5] = -0.16874f;
        fArr[6] = -0.33126f;
        fArr[7] = 0.5f;
        fArr[10] = 0.5f;
        fArr[11] = -0.41869f;
        fArr[12] = -0.08131f;
    }

    /* JADX INFO: renamed from: convertYuvToRgb-impl, reason: not valid java name */
    public static final void m2566convertYuvToRgbimpl(float[] fArr) {
        m2571resetimpl(fArr);
        fArr[2] = 1.402f;
        fArr[5] = 1.0f;
        fArr[6] = -0.34414f;
        fArr[7] = -0.71414f;
        fArr[10] = 1.0f;
        fArr[11] = 1.772f;
        fArr[12] = 0.0f;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2567equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof ColorMatrix) && Intrinsics.areEqual(fArr, ((ColorMatrix) obj).m2581unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2568equalsimpl0(float[] fArr, float[] fArr2) {
        return Intrinsics.areEqual(fArr, fArr2);
    }

    /* JADX INFO: renamed from: get-impl, reason: not valid java name */
    public static final float m2569getimpl(float[] fArr, int i10, int i11) {
        return fArr[(i10 * 5) + i11];
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2570hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* JADX INFO: renamed from: reset-impl, reason: not valid java name */
    public static final void m2571resetimpl(float[] fArr) {
        ArraysKt___ArraysJvmKt.fill$default(fArr, 0.0f, 0, 0, 6, (Object) null);
        fArr[0] = 1.0f;
        fArr[12] = 1.0f;
        fArr[6] = 1.0f;
        fArr[18] = 1.0f;
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final void m2572setimpl(float[] fArr, int i10, int i11, float f6) {
        fArr[(i10 * 5) + i11] = f6;
    }

    /* JADX INFO: renamed from: set-jHG-Opc, reason: not valid java name */
    public static final void m2573setjHGOpc(float[] fArr, @NotNull float[] src) {
        Intrinsics.checkNotNullParameter(src, "src");
        ArraysKt___ArraysJvmKt.copyInto$default(src, fArr, 0, 0, 0, 14, (Object) null);
    }

    /* JADX INFO: renamed from: setToRotateBlue-impl, reason: not valid java name */
    public static final void m2574setToRotateBlueimpl(float[] fArr, float f6) {
        m2571resetimpl(fArr);
        double d2 = (((double) f6) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d2);
        float fSin = (float) Math.sin(d2);
        fArr[6] = fCos;
        fArr[0] = fCos;
        fArr[1] = fSin;
        fArr[5] = -fSin;
    }

    /* JADX INFO: renamed from: setToRotateGreen-impl, reason: not valid java name */
    public static final void m2575setToRotateGreenimpl(float[] fArr, float f6) {
        m2571resetimpl(fArr);
        double d2 = (((double) f6) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d2);
        float fSin = (float) Math.sin(d2);
        fArr[12] = fCos;
        fArr[0] = fCos;
        fArr[2] = -fSin;
        fArr[10] = fSin;
    }

    /* JADX INFO: renamed from: setToRotateRed-impl, reason: not valid java name */
    public static final void m2576setToRotateRedimpl(float[] fArr, float f6) {
        m2571resetimpl(fArr);
        double d2 = (((double) f6) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d2);
        float fSin = (float) Math.sin(d2);
        fArr[12] = fCos;
        fArr[6] = fCos;
        fArr[7] = fSin;
        fArr[11] = -fSin;
    }

    /* JADX INFO: renamed from: setToSaturation-impl, reason: not valid java name */
    public static final void m2577setToSaturationimpl(float[] fArr, float f6) {
        m2571resetimpl(fArr);
        float f10 = 1 - f6;
        float f11 = 0.213f * f10;
        float f12 = 0.715f * f10;
        float f13 = f10 * 0.072f;
        fArr[0] = f11 + f6;
        fArr[1] = f12;
        fArr[2] = f13;
        fArr[5] = f11;
        fArr[6] = f12 + f6;
        fArr[7] = f13;
        fArr[10] = f11;
        fArr[11] = f12;
        fArr[12] = f13 + f6;
    }

    /* JADX INFO: renamed from: setToScale-impl, reason: not valid java name */
    public static final void m2578setToScaleimpl(float[] fArr, float f6, float f10, float f11, float f12) {
        m2571resetimpl(fArr);
        fArr[0] = f6;
        fArr[6] = f10;
        fArr[12] = f11;
        fArr[18] = f12;
    }

    /* JADX INFO: renamed from: timesAssign-jHG-Opc, reason: not valid java name */
    public static final void m2579timesAssignjHGOpc(float[] fArr, @NotNull float[] colorMatrix) {
        Intrinsics.checkNotNullParameter(colorMatrix, "colorMatrix");
        float fA = a(fArr, 0, 0, colorMatrix);
        float fA2 = a(fArr, 0, 1, colorMatrix);
        float fA3 = a(fArr, 0, 2, colorMatrix);
        float fA4 = a(fArr, 0, 3, colorMatrix);
        float f6 = (fArr[3] * colorMatrix[19]) + (fArr[2] * colorMatrix[14]) + (fArr[1] * colorMatrix[9]) + (fArr[0] * colorMatrix[4]) + fArr[4];
        float fA5 = a(fArr, 1, 0, colorMatrix);
        float fA6 = a(fArr, 1, 1, colorMatrix);
        float fA7 = a(fArr, 1, 2, colorMatrix);
        float fA8 = a(fArr, 1, 3, colorMatrix);
        float f10 = (fArr[8] * colorMatrix[19]) + (fArr[7] * colorMatrix[14]) + (fArr[6] * colorMatrix[9]) + (fArr[5] * colorMatrix[4]) + fArr[9];
        float fA9 = a(fArr, 2, 0, colorMatrix);
        float fA10 = a(fArr, 2, 1, colorMatrix);
        float fA11 = a(fArr, 2, 2, colorMatrix);
        float fA12 = a(fArr, 2, 3, colorMatrix);
        float f11 = (fArr[13] * colorMatrix[19]) + (fArr[12] * colorMatrix[14]) + (fArr[11] * colorMatrix[9]) + (fArr[10] * colorMatrix[4]) + fArr[14];
        float fA13 = a(fArr, 3, 0, colorMatrix);
        float fA14 = a(fArr, 3, 1, colorMatrix);
        float fA15 = a(fArr, 3, 2, colorMatrix);
        float fA16 = a(fArr, 3, 3, colorMatrix);
        float f12 = (fArr[18] * colorMatrix[19]) + (fArr[17] * colorMatrix[14]) + (fArr[16] * colorMatrix[9]) + (fArr[15] * colorMatrix[4]) + fArr[19];
        fArr[0] = fA;
        fArr[1] = fA2;
        fArr[2] = fA3;
        fArr[3] = fA4;
        fArr[4] = f6;
        fArr[5] = fA5;
        fArr[6] = fA6;
        fArr[7] = fA7;
        fArr[8] = fA8;
        fArr[9] = f10;
        fArr[10] = fA9;
        fArr[11] = fA10;
        fArr[12] = fA11;
        fArr[13] = fA12;
        fArr[14] = f11;
        fArr[15] = fA13;
        fArr[16] = fA14;
        fArr[17] = fA15;
        fArr[18] = fA16;
        fArr[19] = f12;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2580toStringimpl(float[] fArr) {
        return "ColorMatrix(values=" + Arrays.toString(fArr) + RootService.CLOSE_BRACKET;
    }

    public boolean equals(Object obj) {
        return m2567equalsimpl(this.values, obj);
    }

    @NotNull
    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return m2570hashCodeimpl(this.values);
    }

    public String toString() {
        return m2580toStringimpl(this.values);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float[] m2581unboximpl() {
        return this.values;
    }
}
