package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.datastore.preferences.protobuf.q;
import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.plugin.localstorage.command.SetCommand;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Matrix.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\t\b\u0087@\u0018\u0000 I2\u00020\u0001:\u0001IB\u0014\u0012\b\b\u0002\u0010F\u001a\u00020Aø\u0001\u0001¢\u0006\u0004\bG\u0010HJ \u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0086\n¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0017¢\u0006\u0004\b\u0015\u0010\u0018J\u001e\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010 \u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010#\u001a\u00020\n¢\u0006\u0004\b!\u0010\"J\r\u0010%\u001a\u00020\n¢\u0006\u0004\b$\u0010\"J\u001b\u0010(\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010\u001bJ\u0015\u0010,\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u0005¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u0005¢\u0006\u0004\b-\u0010+J\u0015\u00100\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u0005¢\u0006\u0004\b/\u0010+J+\u00106\u001a\u00020\n2\b\b\u0002\u00101\u001a\u00020\u00052\b\b\u0002\u00102\u001a\u00020\u00052\b\b\u0002\u00103\u001a\u00020\u0005¢\u0006\u0004\b4\u00105J+\u00108\u001a\u00020\n2\b\b\u0002\u00101\u001a\u00020\u00052\b\b\u0002\u00102\u001a\u00020\u00052\b\b\u0002\u00103\u001a\u00020\u0005¢\u0006\u0004\b7\u00105J\u0010\u0010;\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010@\u001a\u00020=2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b>\u0010?R\u0017\u0010F\u001a\u00020A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\u0088\u0001F\u0092\u0001\u00020Aø\u0001\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006J"}, d2 = {"Landroidx/compose/ui/graphics/Matrix;", "", "", "row", "column", "", "get-impl", "([FII)F", "get", SharedPrefsStorage.VERSION_KEY, "", "set-impl", "([FIIF)V", SetCommand.ID, "Landroidx/compose/ui/geometry/Offset;", "point", "map-MK-Hz9U", "([FJ)J", "map", "Landroidx/compose/ui/geometry/Rect;", "rect", "map-impl", "([FLandroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/MutableRect;", "([FLandroidx/compose/ui/geometry/MutableRect;)V", "m", "timesAssign-58bKbWc", "([F[F)V", "timesAssign", "", "toString-impl", "([F)Ljava/lang/String;", "toString", "invert-impl", "([F)V", "invert", "reset-impl", "reset", "matrix", "setFrom-58bKbWc", "setFrom", "degrees", "rotateX-impl", "([FF)V", "rotateX", "rotateY-impl", "rotateY", "rotateZ-impl", "rotateZ", "x", "y", "z", "scale-impl", "([FFFF)V", ImageScaleTypeHandler.ID, "translate-impl", "translate", "hashCode-impl", "([F)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "([FLjava/lang/Object;)Z", "equals", "", "a", "[F", "getValues", "()[F", "values", "constructor-impl", "([F)[F", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
@SourceDebugExtension({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,440:1\n39#1:441\n39#1:442\n39#1:443\n42#1,2:444\n42#1,2:446\n42#1,2:448\n42#1,2:450\n42#1,2:452\n42#1,2:454\n42#1,2:456\n42#1,2:458\n42#1,2:460\n42#1,2:462\n42#1,2:464\n42#1,2:466\n42#1,2:468\n42#1,2:470\n42#1,2:472\n42#1,2:474\n39#1:476\n39#1:477\n39#1:478\n39#1:479\n39#1:480\n39#1:481\n39#1:482\n39#1:483\n39#1:484\n39#1:485\n39#1:486\n39#1:487\n39#1:488\n39#1:489\n39#1:490\n39#1:491\n39#1:492\n39#1:493\n39#1:494\n39#1:495\n42#1,2:496\n42#1,2:498\n42#1,2:500\n42#1,2:502\n42#1,2:504\n42#1,2:506\n42#1,2:508\n42#1,2:510\n42#1,2:512\n42#1,2:514\n42#1,2:516\n42#1,2:518\n42#1,2:520\n42#1,2:522\n42#1,2:524\n42#1,2:526\n42#1,2:528\n39#1:530\n39#1:531\n39#1:532\n39#1:533\n39#1:534\n39#1:535\n39#1:536\n39#1:537\n42#1,2:538\n42#1,2:540\n42#1,2:542\n42#1,2:544\n42#1,2:546\n42#1,2:548\n42#1,2:550\n42#1,2:552\n39#1:554\n39#1:555\n39#1:556\n39#1:557\n39#1:558\n39#1:559\n39#1:560\n39#1:561\n42#1,2:562\n42#1,2:564\n42#1,2:566\n42#1,2:568\n42#1,2:570\n42#1,2:572\n42#1,2:574\n42#1,2:576\n39#1:578\n39#1:579\n39#1:580\n39#1:581\n39#1:582\n39#1:583\n39#1:584\n39#1:585\n42#1,2:586\n42#1,2:588\n42#1,2:590\n42#1,2:592\n42#1,2:594\n42#1,2:596\n42#1,2:598\n42#1,2:600\n39#1,5:602\n39#1,5:607\n39#1,5:612\n39#1,5:617\n39#1,5:622\n39#1,5:627\n39#1,5:632\n39#1,5:637\n39#1,5:642\n39#1,5:647\n39#1,5:652\n39#1,5:657\n39#1:662\n39#1:663\n39#1:664\n39#1:665\n39#1:666\n39#1:667\n39#1:668\n39#1:669\n39#1:670\n39#1:671\n39#1:672\n39#1:673\n39#1:674\n39#1:675\n39#1:676\n39#1:677\n42#1,2:678\n42#1,2:680\n42#1,2:682\n42#1,2:684\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n51#1:441\n56#1:442\n57#1:443\n112#1:444,2\n113#1:446,2\n114#1:448,2\n115#1:450,2\n116#1:452,2\n117#1:454,2\n118#1:456,2\n119#1:458,2\n120#1:460,2\n121#1:462,2\n122#1:464,2\n123#1:466,2\n124#1:468,2\n125#1:470,2\n126#1:472,2\n127#1:474,2\n132#1:476\n133#1:477\n134#1:478\n135#1:479\n143#1:480\n144#1:481\n145#1:482\n146#1:483\n147#1:484\n148#1:485\n149#1:486\n150#1:487\n151#1:488\n152#1:489\n153#1:490\n154#1:491\n155#1:492\n156#1:493\n157#1:494\n158#1:495\n177#1:496,2\n178#1:498,2\n179#1:500,2\n180#1:502,2\n181#1:504,2\n182#1:506,2\n183#1:508,2\n184#1:510,2\n185#1:512,2\n186#1:514,2\n187#1:516,2\n188#1:518,2\n189#1:520,2\n190#1:522,2\n191#1:524,2\n192#1:526,2\n201#1:528,2\n220#1:530\n221#1:531\n225#1:532\n226#1:533\n230#1:534\n231#1:535\n235#1:536\n236#1:537\n240#1:538,2\n241#1:540,2\n242#1:542,2\n243#1:544,2\n244#1:546,2\n245#1:548,2\n246#1:550,2\n247#1:552,2\n257#1:554\n258#1:555\n262#1:556\n263#1:557\n267#1:558\n268#1:559\n272#1:560\n273#1:561\n277#1:562,2\n278#1:564,2\n279#1:566,2\n280#1:568,2\n281#1:570,2\n282#1:572,2\n283#1:574,2\n284#1:576,2\n294#1:578\n295#1:579\n299#1:580\n300#1:581\n304#1:582\n305#1:583\n309#1:584\n310#1:585\n314#1:586,2\n315#1:588,2\n316#1:590,2\n317#1:592,2\n318#1:594,2\n319#1:596,2\n320#1:598,2\n321#1:600,2\n326#1:602,5\n327#1:607,5\n328#1:612,5\n329#1:617,5\n330#1:622,5\n331#1:627,5\n332#1:632,5\n333#1:637,5\n334#1:642,5\n335#1:647,5\n336#1:652,5\n337#1:657,5\n342#1:662\n343#1:663\n344#1:664\n345#1:665\n346#1:666\n347#1:667\n348#1:668\n349#1:669\n350#1:670\n351#1:671\n352#1:672\n353#1:673\n354#1:674\n355#1:675\n356#1:676\n357#1:677\n358#1:678,2\n359#1:680,2\n360#1:682,2\n361#1:684,2\n*E\n"})
public final class Matrix {
    public static final int Perspective0 = 3;
    public static final int Perspective1 = 7;
    public static final int Perspective2 = 15;
    public static final int ScaleX = 0;
    public static final int ScaleY = 5;
    public static final int ScaleZ = 10;
    public static final int SkewX = 4;
    public static final int SkewY = 1;
    public static final int TranslateX = 12;
    public static final int TranslateY = 13;
    public static final int TranslateZ = 14;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final float[] values;

    public /* synthetic */ Matrix(float[] fArr) {
        this.values = fArr;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Matrix m2698boximpl(float[] fArr) {
        return new Matrix(fArr);
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static float[] m2699constructorimpl(@NotNull float[] values) {
        Intrinsics.checkNotNullParameter(values, "values");
        return values;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m2700constructorimpl$default(float[] fArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return m2699constructorimpl(fArr);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2701equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof Matrix) && Intrinsics.areEqual(fArr, ((Matrix) obj).m2721unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2702equalsimpl0(float[] fArr, float[] fArr2) {
        return Intrinsics.areEqual(fArr, fArr2);
    }

    /* JADX INFO: renamed from: get-impl, reason: not valid java name */
    public static final float m2703getimpl(float[] fArr, int i10, int i11) {
        return fArr[(i10 * 4) + i11];
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2704hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* JADX INFO: renamed from: invert-impl, reason: not valid java name */
    public static final void m2705invertimpl(float[] fArr) {
        float f6 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        float f18 = fArr[9];
        float f19 = fArr[10];
        float f20 = fArr[11];
        float f21 = fArr[12];
        float f22 = fArr[13];
        float f23 = fArr[14];
        float f24 = fArr[15];
        float f25 = (f6 * f14) - (f10 * f13);
        float f26 = (f6 * f15) - (f11 * f13);
        float f27 = (f6 * f16) - (f12 * f13);
        float f28 = (f10 * f15) - (f11 * f14);
        float f29 = (f10 * f16) - (f12 * f14);
        float f30 = (f11 * f16) - (f12 * f15);
        float f31 = (f17 * f22) - (f18 * f21);
        float f32 = (f17 * f23) - (f19 * f21);
        float f33 = (f17 * f24) - (f20 * f21);
        float f34 = (f18 * f23) - (f19 * f22);
        float f35 = (f18 * f24) - (f20 * f22);
        float f36 = (f19 * f24) - (f20 * f23);
        float f37 = (f30 * f31) + (((f28 * f33) + ((f27 * f34) + ((f25 * f36) - (f26 * f35)))) - (f29 * f32));
        if (f37 == 0.0f) {
            return;
        }
        float f38 = 1.0f / f37;
        fArr[0] = q.a(f16, f34, (f14 * f36) - (f15 * f35), f38);
        fArr[1] = androidx.core.graphics.b.a(f12, f34, (f11 * f35) + ((-f10) * f36), f38);
        fArr[2] = q.a(f24, f28, (f22 * f30) - (f23 * f29), f38);
        fArr[3] = androidx.core.graphics.b.a(f20, f28, (f19 * f29) + ((-f18) * f30), f38);
        float f39 = -f13;
        fArr[4] = androidx.core.graphics.b.a(f16, f32, (f15 * f33) + (f39 * f36), f38);
        fArr[5] = q.a(f12, f32, (f6 * f36) - (f11 * f33), f38);
        float f40 = -f21;
        fArr[6] = androidx.core.graphics.b.a(f24, f26, (f23 * f27) + (f40 * f30), f38);
        fArr[7] = q.a(f20, f26, (f17 * f30) - (f19 * f27), f38);
        fArr[8] = q.a(f16, f31, (f13 * f35) - (f14 * f33), f38);
        fArr[9] = androidx.core.graphics.b.a(f12, f31, (f10 * f33) + ((-f6) * f35), f38);
        fArr[10] = q.a(f24, f25, (f21 * f29) - (f22 * f27), f38);
        fArr[11] = androidx.core.graphics.b.a(f20, f25, (f27 * f18) + ((-f17) * f29), f38);
        fArr[12] = androidx.core.graphics.b.a(f15, f31, (f14 * f32) + (f39 * f34), f38);
        fArr[13] = q.a(f11, f31, (f6 * f34) - (f10 * f32), f38);
        fArr[14] = androidx.core.graphics.b.a(f23, f25, (f22 * f26) + (f40 * f28), f38);
        fArr[15] = q.a(f19, f25, (f17 * f28) - (f18 * f26), f38);
    }

    /* JADX INFO: renamed from: map-MK-Hz9U, reason: not valid java name */
    public static final long m2706mapMKHz9U(float[] fArr, long j10) {
        float fM2275getXimpl = Offset.m2275getXimpl(j10);
        float fM2276getYimpl = Offset.m2276getYimpl(j10);
        float f6 = 1 / (((fArr[7] * fM2276getYimpl) + (fArr[3] * fM2275getXimpl)) + fArr[15]);
        if (Float.isInfinite(f6) || Float.isNaN(f6)) {
            f6 = 0.0f;
        }
        return OffsetKt.Offset(((fArr[4] * fM2276getYimpl) + (fArr[0] * fM2275getXimpl) + fArr[12]) * f6, ((fArr[5] * fM2276getYimpl) + (fArr[1] * fM2275getXimpl) + fArr[13]) * f6);
    }

    @NotNull
    /* JADX INFO: renamed from: map-impl, reason: not valid java name */
    public static final Rect m2707mapimpl(float[] fArr, @NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        long jM2706mapMKHz9U = m2706mapMKHz9U(fArr, OffsetKt.Offset(rect.getLeft(), rect.getTop()));
        long jM2706mapMKHz9U2 = m2706mapMKHz9U(fArr, OffsetKt.Offset(rect.getLeft(), rect.getBottom()));
        long jM2706mapMKHz9U3 = m2706mapMKHz9U(fArr, OffsetKt.Offset(rect.getRight(), rect.getTop()));
        long jM2706mapMKHz9U4 = m2706mapMKHz9U(fArr, OffsetKt.Offset(rect.getRight(), rect.getBottom()));
        return new Rect(Math.min(Math.min(Offset.m2275getXimpl(jM2706mapMKHz9U), Offset.m2275getXimpl(jM2706mapMKHz9U2)), Math.min(Offset.m2275getXimpl(jM2706mapMKHz9U3), Offset.m2275getXimpl(jM2706mapMKHz9U4))), Math.min(Math.min(Offset.m2276getYimpl(jM2706mapMKHz9U), Offset.m2276getYimpl(jM2706mapMKHz9U2)), Math.min(Offset.m2276getYimpl(jM2706mapMKHz9U3), Offset.m2276getYimpl(jM2706mapMKHz9U4))), Math.max(Math.max(Offset.m2275getXimpl(jM2706mapMKHz9U), Offset.m2275getXimpl(jM2706mapMKHz9U2)), Math.max(Offset.m2275getXimpl(jM2706mapMKHz9U3), Offset.m2275getXimpl(jM2706mapMKHz9U4))), Math.max(Math.max(Offset.m2276getYimpl(jM2706mapMKHz9U), Offset.m2276getYimpl(jM2706mapMKHz9U2)), Math.max(Offset.m2276getYimpl(jM2706mapMKHz9U3), Offset.m2276getYimpl(jM2706mapMKHz9U4))));
    }

    /* JADX INFO: renamed from: reset-impl, reason: not valid java name */
    public static final void m2709resetimpl(float[] fArr) {
        int i10 = 0;
        while (i10 < 4) {
            int i11 = 0;
            while (i11 < 4) {
                fArr[(i11 * 4) + i10] = i10 == i11 ? 1.0f : 0.0f;
                i11++;
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: rotateX-impl, reason: not valid java name */
    public static final void m2710rotateXimpl(float[] fArr, float f6) {
        double d2 = (((double) f6) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d2);
        float fSin = (float) Math.sin(d2);
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = (f10 * fCos) - (f11 * fSin);
        float f13 = fArr[5];
        float f14 = fArr[6];
        float f15 = (f13 * fCos) - (f14 * fSin);
        float f16 = fArr[9];
        float f17 = fArr[10];
        float f18 = (f16 * fCos) - (f17 * fSin);
        float f19 = fArr[13];
        float f20 = fArr[14];
        float f21 = (f19 * fCos) - (f20 * fSin);
        fArr[1] = f12;
        fArr[2] = (f11 * fCos) + (f10 * fSin);
        fArr[5] = f15;
        fArr[6] = (f14 * fCos) + (f13 * fSin);
        fArr[9] = f18;
        fArr[10] = (f17 * fCos) + (f16 * fSin);
        fArr[13] = f21;
        fArr[14] = (f20 * fCos) + (f19 * fSin);
    }

    /* JADX INFO: renamed from: rotateY-impl, reason: not valid java name */
    public static final void m2711rotateYimpl(float[] fArr, float f6) {
        double d2 = (((double) f6) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d2);
        float fSin = (float) Math.sin(d2);
        float f10 = fArr[0];
        float f11 = fArr[2];
        float f12 = (f11 * fSin) + (f10 * fCos);
        float f13 = fArr[4];
        float f14 = fArr[6];
        float f15 = (f14 * fSin) + (f13 * fCos);
        float f16 = fArr[8];
        float f17 = fArr[10];
        float f18 = (f17 * fSin) + (f16 * fCos);
        float f19 = fArr[12];
        float f20 = fArr[14];
        float f21 = (f20 * fSin) + (f19 * fCos);
        fArr[0] = f12;
        fArr[2] = (f11 * fCos) + ((-f10) * fSin);
        fArr[4] = f15;
        fArr[6] = (f14 * fCos) + ((-f13) * fSin);
        fArr[8] = f18;
        fArr[10] = (f17 * fCos) + ((-f16) * fSin);
        fArr[12] = f21;
        fArr[14] = (f20 * fCos) + ((-f19) * fSin);
    }

    /* JADX INFO: renamed from: rotateZ-impl, reason: not valid java name */
    public static final void m2712rotateZimpl(float[] fArr, float f6) {
        double d2 = (((double) f6) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d2);
        float fSin = (float) Math.sin(d2);
        float f10 = fArr[0];
        float f11 = fArr[4];
        float f12 = (fSin * f11) + (fCos * f10);
        float f13 = -fSin;
        float f14 = (f11 * fCos) + (f10 * f13);
        float f15 = fArr[1];
        float f16 = fArr[5];
        float f17 = (fSin * f16) + (fCos * f15);
        float f18 = (f16 * fCos) + (f15 * f13);
        float f19 = fArr[2];
        float f20 = fArr[6];
        float f21 = (fSin * f20) + (fCos * f19);
        float f22 = (f20 * fCos) + (f19 * f13);
        float f23 = fArr[3];
        float f24 = fArr[7];
        float f25 = (fSin * f24) + (fCos * f23);
        fArr[0] = f12;
        fArr[1] = f17;
        fArr[2] = f21;
        fArr[3] = f25;
        fArr[4] = f14;
        fArr[5] = f18;
        fArr[6] = f22;
        fArr[7] = (fCos * f24) + (f13 * f23);
    }

    /* JADX INFO: renamed from: scale-impl, reason: not valid java name */
    public static final void m2713scaleimpl(float[] fArr, float f6, float f10, float f11) {
        fArr[0] = fArr[0] * f6;
        fArr[1] = fArr[1] * f6;
        fArr[2] = fArr[2] * f6;
        fArr[3] = fArr[3] * f6;
        fArr[4] = fArr[4] * f10;
        fArr[5] = fArr[5] * f10;
        fArr[6] = fArr[6] * f10;
        fArr[7] = fArr[7] * f10;
        fArr[8] = fArr[8] * f11;
        fArr[9] = fArr[9] * f11;
        fArr[10] = fArr[10] * f11;
        fArr[11] = fArr[11] * f11;
    }

    /* JADX INFO: renamed from: scale-impl$default, reason: not valid java name */
    public static /* synthetic */ void m2714scaleimpl$default(float[] fArr, float f6, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 4) != 0) {
            f11 = 1.0f;
        }
        m2713scaleimpl(fArr, f6, f10, f11);
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final void m2715setimpl(float[] fArr, int i10, int i11, float f6) {
        fArr[(i10 * 4) + i11] = f6;
    }

    /* JADX INFO: renamed from: setFrom-58bKbWc, reason: not valid java name */
    public static final void m2716setFrom58bKbWc(float[] fArr, @NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        for (int i10 = 0; i10 < 16; i10++) {
            fArr[i10] = matrix[i10];
        }
    }

    /* JADX INFO: renamed from: timesAssign-58bKbWc, reason: not valid java name */
    public static final void m2717timesAssign58bKbWc(float[] fArr, @NotNull float[] m) {
        Intrinsics.checkNotNullParameter(m, "m");
        float fM2722access$dotp89u6pk = MatrixKt.m2722access$dotp89u6pk(fArr, 0, m, 0);
        float fM2722access$dotp89u6pk2 = MatrixKt.m2722access$dotp89u6pk(fArr, 0, m, 1);
        float fM2722access$dotp89u6pk3 = MatrixKt.m2722access$dotp89u6pk(fArr, 0, m, 2);
        float fM2722access$dotp89u6pk4 = MatrixKt.m2722access$dotp89u6pk(fArr, 0, m, 3);
        float fM2722access$dotp89u6pk5 = MatrixKt.m2722access$dotp89u6pk(fArr, 1, m, 0);
        float fM2722access$dotp89u6pk6 = MatrixKt.m2722access$dotp89u6pk(fArr, 1, m, 1);
        float fM2722access$dotp89u6pk7 = MatrixKt.m2722access$dotp89u6pk(fArr, 1, m, 2);
        float fM2722access$dotp89u6pk8 = MatrixKt.m2722access$dotp89u6pk(fArr, 1, m, 3);
        float fM2722access$dotp89u6pk9 = MatrixKt.m2722access$dotp89u6pk(fArr, 2, m, 0);
        float fM2722access$dotp89u6pk10 = MatrixKt.m2722access$dotp89u6pk(fArr, 2, m, 1);
        float fM2722access$dotp89u6pk11 = MatrixKt.m2722access$dotp89u6pk(fArr, 2, m, 2);
        float fM2722access$dotp89u6pk12 = MatrixKt.m2722access$dotp89u6pk(fArr, 2, m, 3);
        float fM2722access$dotp89u6pk13 = MatrixKt.m2722access$dotp89u6pk(fArr, 3, m, 0);
        float fM2722access$dotp89u6pk14 = MatrixKt.m2722access$dotp89u6pk(fArr, 3, m, 1);
        float fM2722access$dotp89u6pk15 = MatrixKt.m2722access$dotp89u6pk(fArr, 3, m, 2);
        float fM2722access$dotp89u6pk16 = MatrixKt.m2722access$dotp89u6pk(fArr, 3, m, 3);
        fArr[0] = fM2722access$dotp89u6pk;
        fArr[1] = fM2722access$dotp89u6pk2;
        fArr[2] = fM2722access$dotp89u6pk3;
        fArr[3] = fM2722access$dotp89u6pk4;
        fArr[4] = fM2722access$dotp89u6pk5;
        fArr[5] = fM2722access$dotp89u6pk6;
        fArr[6] = fM2722access$dotp89u6pk7;
        fArr[7] = fM2722access$dotp89u6pk8;
        fArr[8] = fM2722access$dotp89u6pk9;
        fArr[9] = fM2722access$dotp89u6pk10;
        fArr[10] = fM2722access$dotp89u6pk11;
        fArr[11] = fM2722access$dotp89u6pk12;
        fArr[12] = fM2722access$dotp89u6pk13;
        fArr[13] = fM2722access$dotp89u6pk14;
        fArr[14] = fM2722access$dotp89u6pk15;
        fArr[15] = fM2722access$dotp89u6pk16;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2718toStringimpl(float[] fArr) {
        return e.trimIndent("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    /* JADX INFO: renamed from: translate-impl, reason: not valid java name */
    public static final void m2719translateimpl(float[] fArr, float f6, float f10, float f11) {
        float f12 = (fArr[8] * f11) + (fArr[4] * f10) + (fArr[0] * f6) + fArr[12];
        float f13 = (fArr[9] * f11) + (fArr[5] * f10) + (fArr[1] * f6) + fArr[13];
        float f14 = (fArr[10] * f11) + (fArr[6] * f10) + (fArr[2] * f6) + fArr[14];
        float f15 = (fArr[11] * f11) + (fArr[7] * f10) + (fArr[3] * f6) + fArr[15];
        fArr[12] = f12;
        fArr[13] = f13;
        fArr[14] = f14;
        fArr[15] = f15;
    }

    /* JADX INFO: renamed from: translate-impl$default, reason: not valid java name */
    public static /* synthetic */ void m2720translateimpl$default(float[] fArr, float f6, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        m2719translateimpl(fArr, f6, f10, f11);
    }

    public boolean equals(Object obj) {
        return m2701equalsimpl(this.values, obj);
    }

    @NotNull
    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return m2704hashCodeimpl(this.values);
    }

    @NotNull
    public String toString() {
        return m2718toStringimpl(this.values);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float[] m2721unboximpl() {
        return this.values;
    }

    /* JADX INFO: renamed from: map-impl, reason: not valid java name */
    public static final void m2708mapimpl(float[] fArr, @NotNull MutableRect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        long jM2706mapMKHz9U = m2706mapMKHz9U(fArr, OffsetKt.Offset(rect.getLeft(), rect.getTop()));
        long jM2706mapMKHz9U2 = m2706mapMKHz9U(fArr, OffsetKt.Offset(rect.getLeft(), rect.getBottom()));
        long jM2706mapMKHz9U3 = m2706mapMKHz9U(fArr, OffsetKt.Offset(rect.getRight(), rect.getTop()));
        long jM2706mapMKHz9U4 = m2706mapMKHz9U(fArr, OffsetKt.Offset(rect.getRight(), rect.getBottom()));
        rect.setLeft(Math.min(Math.min(Offset.m2275getXimpl(jM2706mapMKHz9U), Offset.m2275getXimpl(jM2706mapMKHz9U2)), Math.min(Offset.m2275getXimpl(jM2706mapMKHz9U3), Offset.m2275getXimpl(jM2706mapMKHz9U4))));
        rect.setTop(Math.min(Math.min(Offset.m2276getYimpl(jM2706mapMKHz9U), Offset.m2276getYimpl(jM2706mapMKHz9U2)), Math.min(Offset.m2276getYimpl(jM2706mapMKHz9U3), Offset.m2276getYimpl(jM2706mapMKHz9U4))));
        rect.setRight(Math.max(Math.max(Offset.m2275getXimpl(jM2706mapMKHz9U), Offset.m2275getXimpl(jM2706mapMKHz9U2)), Math.max(Offset.m2275getXimpl(jM2706mapMKHz9U3), Offset.m2275getXimpl(jM2706mapMKHz9U4))));
        rect.setBottom(Math.max(Math.max(Offset.m2276getYimpl(jM2706mapMKHz9U), Offset.m2276getYimpl(jM2706mapMKHz9U2)), Math.max(Offset.m2276getYimpl(jM2706mapMKHz9U3), Offset.m2276getYimpl(jM2706mapMKHz9U4))));
    }
}
