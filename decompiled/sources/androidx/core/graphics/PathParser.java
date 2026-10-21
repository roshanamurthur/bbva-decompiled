package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.h0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class PathParser {

    public static class PathDataNode {
        public float[] mParams;
        public char mType;

        public static void a(Path path, float f6, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, boolean z11) {
            double d2;
            double d3;
            double radians = Math.toRadians(f15);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d7 = f6;
            double d10 = f10;
            double d11 = (d10 * dSin) + (d7 * dCos);
            double d12 = d7;
            double d13 = f13;
            double d14 = d11 / d13;
            double d15 = f14;
            double d16 = ((d10 * dCos) + (((double) (-f6)) * dSin)) / d15;
            double d17 = d10;
            double d18 = f12;
            double d19 = ((d18 * dSin) + (((double) f11) * dCos)) / d13;
            double d20 = ((d18 * dCos) + (((double) (-f11)) * dSin)) / d15;
            double d21 = d14 - d19;
            double d22 = d16 - d20;
            double d23 = (d14 + d19) / 2.0d;
            double d24 = (d16 + d20) / 2.0d;
            double d25 = (d22 * d22) + (d21 * d21);
            if (d25 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d26 = (1.0d / d25) - 0.25d;
            if (d26 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d25);
                float fSqrt = (float) (Math.sqrt(d25) / 1.99999d);
                a(path, f6, f10, f11, f12, f13 * fSqrt, f14 * fSqrt, f15, z10, z11);
                return;
            }
            double dSqrt = Math.sqrt(d26);
            double d27 = d21 * dSqrt;
            double d28 = dSqrt * d22;
            if (z10 == z11) {
                d2 = d23 - d28;
                d3 = d24 + d27;
            } else {
                d2 = d23 + d28;
                d3 = d24 - d27;
            }
            double dAtan2 = Math.atan2(d16 - d3, d14 - d2);
            double dAtan3 = Math.atan2(d20 - d3, d19 - d2) - dAtan2;
            if (z11 != (dAtan3 >= 0.0d)) {
                dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
            }
            double d29 = d2 * d13;
            double d30 = d3 * d15;
            double d31 = (d29 * dCos) - (d30 * dSin);
            double d32 = (d30 * dCos) + (d29 * dSin);
            int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
            double dCos2 = Math.cos(radians);
            double dSin2 = Math.sin(radians);
            double dCos3 = Math.cos(dAtan2);
            double dSin3 = Math.sin(dAtan2);
            double d33 = -d13;
            double d34 = d33 * dCos2;
            double d35 = d15 * dSin2;
            double d36 = (d34 * dSin3) - (d35 * dCos3);
            double d37 = d33 * dSin2;
            double d38 = d15 * dCos2;
            double d39 = (dCos3 * d38) + (dSin3 * d37);
            double d40 = d38;
            double d41 = dAtan3 / ((double) iCeil);
            int i10 = 0;
            while (i10 < iCeil) {
                double d42 = dAtan2 + d41;
                double dSin4 = Math.sin(d42);
                double dCos4 = Math.cos(d42);
                double d43 = d41;
                double d44 = (((d13 * dCos2) * dCos4) + d31) - (d35 * dSin4);
                double d45 = d40;
                double d46 = d31;
                double d47 = (d45 * dSin4) + (d13 * dSin2 * dCos4) + d32;
                double d48 = (d34 * dSin4) - (d35 * dCos4);
                double d49 = (dCos4 * d45) + (dSin4 * d37);
                double d50 = d42 - dAtan2;
                double dTan = Math.tan(d50 / 2.0d);
                double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d50)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d36 * dSqrt2) + d12), (float) ((d39 * dSqrt2) + d17), (float) (d44 - (dSqrt2 * d48)), (float) (d47 - (dSqrt2 * d49)), (float) d44, (float) d47);
                i10++;
                dAtan2 = d42;
                d37 = d37;
                dCos2 = dCos2;
                iCeil = iCeil;
                d39 = d49;
                d13 = d13;
                d36 = d48;
                d12 = d44;
                d17 = d47;
                d31 = d46;
                d41 = d43;
                d40 = d45;
            }
        }

        public static void nodesToPath(PathDataNode[] pathDataNodeArr, Path path) {
            int i10;
            int i11;
            float[] fArr;
            float f6;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f20;
            float f21;
            float f22;
            int i12 = 6;
            float[] fArr2 = new float[6];
            char c10 = 'm';
            int i13 = 0;
            char c11 = 'm';
            int i14 = 0;
            while (i14 < pathDataNodeArr.length) {
                PathDataNode pathDataNode = pathDataNodeArr[i14];
                char c12 = pathDataNode.mType;
                float[] fArr3 = pathDataNode.mParams;
                float f23 = fArr2[i13];
                float f24 = fArr2[1];
                float f25 = fArr2[2];
                float f26 = fArr2[3];
                float f27 = fArr2[4];
                float f28 = fArr2[5];
                switch (c12) {
                    case 'A':
                    case 'a':
                        i10 = 7;
                        break;
                    case 'C':
                    case 'c':
                        i10 = i12;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i10 = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i10 = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path.moveTo(f27, f28);
                        f23 = f27;
                        f25 = f23;
                        f24 = f28;
                        f26 = f24;
                    default:
                        i10 = 2;
                        break;
                }
                float f29 = f27;
                float f30 = f28;
                float f31 = f23;
                float f32 = f24;
                int i15 = i13;
                while (i15 < fArr3.length) {
                    if (c12 != 'A') {
                        if (c12 != 'C') {
                            if (c12 == 'H') {
                                i11 = i15;
                                fArr = fArr3;
                                c12 = c12;
                                i14 = i14;
                                path.lineTo(fArr[i11], f32);
                                f31 = fArr[i11];
                            } else if (c12 == 'Q') {
                                i11 = i15;
                                fArr = fArr3;
                                int i16 = i11 + 1;
                                int i17 = i11 + 2;
                                int i18 = i11 + 3;
                                path.quadTo(fArr[i11], fArr[i16], fArr[i17], fArr[i18]);
                                f6 = fArr[i11];
                                f10 = fArr[i16];
                                f31 = fArr[i17];
                                f32 = fArr[i18];
                            } else if (c12 == 'V') {
                                i11 = i15;
                                fArr = fArr3;
                                c12 = c12;
                                i14 = i14;
                                path.lineTo(f31, fArr[i11]);
                                f32 = fArr[i11];
                            } else if (c12 != 'a') {
                                if (c12 != 'c') {
                                    if (c12 == 'h') {
                                        i11 = i15;
                                        path.rLineTo(fArr3[i11], 0.0f);
                                        f31 += fArr3[i11];
                                    } else if (c12 == 'q') {
                                        i11 = i15;
                                        float f33 = f32;
                                        float f34 = f31;
                                        int i19 = i11 + 1;
                                        int i20 = i11 + 2;
                                        int i21 = i11 + 3;
                                        path.rQuadTo(fArr3[i11], fArr3[i19], fArr3[i20], fArr3[i21]);
                                        float f35 = f34 + fArr3[i11];
                                        float f36 = fArr3[i19] + f33;
                                        float f37 = f34 + fArr3[i20];
                                        f32 = f33 + fArr3[i21];
                                        f26 = f36;
                                        f25 = f35;
                                        fArr = fArr3;
                                        c12 = c12;
                                        i14 = i14;
                                        f31 = f37;
                                    } else if (c12 == 'v') {
                                        i11 = i15;
                                        path.rLineTo(0.0f, fArr3[i11]);
                                        f32 += fArr3[i11];
                                    } else if (c12 == 'L') {
                                        i11 = i15;
                                        int i22 = i11 + 1;
                                        path.lineTo(fArr3[i11], fArr3[i22]);
                                        f31 = fArr3[i11];
                                        f32 = fArr3[i22];
                                    } else if (c12 == 'M') {
                                        i11 = i15;
                                        f31 = fArr3[i11];
                                        f32 = fArr3[i11 + 1];
                                        if (i11 > 0) {
                                            path.lineTo(f31, f32);
                                        } else {
                                            path.moveTo(f31, f32);
                                            f30 = f32;
                                            f29 = f31;
                                        }
                                    } else if (c12 == 'S') {
                                        i11 = i15;
                                        float f38 = f32;
                                        float f39 = f31;
                                        if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                            f17 = (f38 * 2.0f) - f26;
                                            f18 = (f39 * 2.0f) - f25;
                                        } else {
                                            f18 = f39;
                                            f17 = f38;
                                        }
                                        int i23 = i11 + 1;
                                        int i24 = i11 + 2;
                                        int i25 = i11 + 3;
                                        path.cubicTo(f18, f17, fArr3[i11], fArr3[i23], fArr3[i24], fArr3[i25]);
                                        float f40 = fArr3[i11];
                                        float f41 = fArr3[i23];
                                        f31 = fArr3[i24];
                                        f32 = fArr3[i25];
                                        f26 = f41;
                                        f25 = f40;
                                    } else if (c12 == 'T') {
                                        i11 = i15;
                                        float f42 = f32;
                                        float f43 = f31;
                                        if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                            f12 = (f43 * 2.0f) - f25;
                                            f13 = (f42 * 2.0f) - f26;
                                        } else {
                                            f12 = f43;
                                            f13 = f42;
                                        }
                                        int i26 = i11 + 1;
                                        path.quadTo(f12, f13, fArr3[i11], fArr3[i26]);
                                        f14 = fArr3[i11];
                                        f16 = fArr3[i26];
                                        f26 = f13;
                                        f25 = f12;
                                        fArr = fArr3;
                                        c12 = c12;
                                        i14 = i14;
                                        f31 = f14;
                                        f32 = f16;
                                    } else if (c12 == 'l') {
                                        i11 = i15;
                                        int i27 = i11 + 1;
                                        path.rLineTo(fArr3[i11], fArr3[i27]);
                                        f31 += fArr3[i11];
                                        f32 += fArr3[i27];
                                    } else if (c12 == c10) {
                                        i11 = i15;
                                        float f44 = fArr3[i11];
                                        f31 += f44;
                                        float f45 = fArr3[i11 + 1];
                                        f32 += f45;
                                        if (i11 > 0) {
                                            path.rLineTo(f44, f45);
                                        } else {
                                            path.rMoveTo(f44, f45);
                                            f30 = f32;
                                            f29 = f31;
                                        }
                                    } else if (c12 == 's') {
                                        if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                            f19 = f32 - f26;
                                            f20 = f31 - f25;
                                        } else {
                                            f20 = 0.0f;
                                            f19 = 0.0f;
                                        }
                                        int i28 = i15 + 1;
                                        int i29 = i15 + 2;
                                        int i30 = i15 + 3;
                                        i11 = i15;
                                        f11 = f32;
                                        float f46 = f31;
                                        path.rCubicTo(f20, f19, fArr3[i15], fArr3[i28], fArr3[i29], fArr3[i30]);
                                        f12 = f46 + fArr3[i11];
                                        f13 = f11 + fArr3[i28];
                                        f14 = f46 + fArr3[i29];
                                        f15 = fArr3[i30];
                                    } else if (c12 != 't') {
                                        i11 = i15;
                                    } else {
                                        if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                            f21 = f31 - f25;
                                            f22 = f32 - f26;
                                        } else {
                                            f22 = 0.0f;
                                            f21 = 0.0f;
                                        }
                                        int i31 = i15 + 1;
                                        path.rQuadTo(f21, f22, fArr3[i15], fArr3[i31]);
                                        float f47 = f21 + f31;
                                        float f48 = f22 + f32;
                                        f31 += fArr3[i15];
                                        f32 += fArr3[i31];
                                        f26 = f48;
                                        i11 = i15;
                                        fArr = fArr3;
                                        c12 = c12;
                                        i14 = i14;
                                        f25 = f47;
                                    }
                                    fArr = fArr3;
                                    c12 = c12;
                                    i14 = i14;
                                } else {
                                    i11 = i15;
                                    f11 = f32;
                                    float f49 = f31;
                                    int i32 = i11 + 2;
                                    int i33 = i11 + 3;
                                    int i34 = i11 + 4;
                                    int i35 = i11 + 5;
                                    path.rCubicTo(fArr3[i11], fArr3[i11 + 1], fArr3[i32], fArr3[i33], fArr3[i34], fArr3[i35]);
                                    f12 = f49 + fArr3[i32];
                                    f13 = f11 + fArr3[i33];
                                    f14 = f49 + fArr3[i34];
                                    f15 = fArr3[i35];
                                }
                                f16 = f15 + f11;
                                f26 = f13;
                                f25 = f12;
                                fArr = fArr3;
                                c12 = c12;
                                i14 = i14;
                                f31 = f14;
                                f32 = f16;
                            } else {
                                i11 = i15;
                                float f50 = f32;
                                float f51 = f31;
                                int i36 = i11 + 5;
                                int i37 = i11 + 6;
                                fArr = fArr3;
                                a(path, f51, f50, fArr3[i36] + f51, fArr3[i37] + f50, fArr3[i11], fArr3[i11 + 1], fArr3[i11 + 2], fArr3[i11 + 3] != 0.0f, fArr3[i11 + 4] != 0.0f);
                                f31 = f51 + fArr[i36];
                                f32 = f50 + fArr[i37];
                            }
                            i15 = i11 + i10;
                            c11 = c12;
                            c12 = c11;
                            fArr3 = fArr;
                            i14 = i14;
                            c10 = 'm';
                            i13 = 0;
                        } else {
                            i11 = i15;
                            fArr = fArr3;
                            int i38 = i11 + 2;
                            int i39 = i11 + 3;
                            int i40 = i11 + 4;
                            int i41 = i11 + 5;
                            path.cubicTo(fArr[i11], fArr[i11 + 1], fArr[i38], fArr[i39], fArr[i40], fArr[i41]);
                            f31 = fArr[i40];
                            f32 = fArr[i41];
                            f6 = fArr[i38];
                            f10 = fArr[i39];
                        }
                        f25 = f6;
                        f26 = f10;
                        i15 = i11 + i10;
                        c11 = c12;
                        c12 = c11;
                        fArr3 = fArr;
                        i14 = i14;
                        c10 = 'm';
                        i13 = 0;
                    } else {
                        i11 = i15;
                        fArr = fArr3;
                        int i42 = i11 + 5;
                        int i43 = i11 + 6;
                        a(path, f31, f32, fArr[i42], fArr[i43], fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3] != 0.0f, fArr[i11 + 4] != 0.0f);
                        f31 = fArr[i42];
                        f32 = fArr[i43];
                    }
                    f26 = f32;
                    f25 = f31;
                    i15 = i11 + i10;
                    c11 = c12;
                    c12 = c11;
                    fArr3 = fArr;
                    i14 = i14;
                    c10 = 'm';
                    i13 = 0;
                }
                int i44 = i14;
                int i45 = i13;
                fArr2[i45] = f31;
                fArr2[1] = f32;
                fArr2[2] = f25;
                fArr2[3] = f26;
                fArr2[4] = f29;
                fArr2[5] = f30;
                i14 = i44 + 1;
                i12 = 6;
                c10 = 'm';
                i13 = i45;
                c11 = pathDataNodeArr[i44].mType;
            }
        }

        public void interpolatePathDataNode(PathDataNode pathDataNode, PathDataNode pathDataNode2, float f6) {
            this.mType = pathDataNode.mType;
            int i10 = 0;
            while (true) {
                float[] fArr = pathDataNode.mParams;
                if (i10 >= fArr.length) {
                    return;
                }
                this.mParams[i10] = (pathDataNode2.mParams[i10] * f6) + ((1.0f - f6) * fArr[i10]);
                i10++;
            }
        }
    }

    public static float[] a(float[] fArr, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i10, length);
        float[] fArr2 = new float[i10];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static boolean canMorph(@Nullable PathDataNode[] pathDataNodeArr, @Nullable PathDataNode[] pathDataNodeArr2) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr.length != pathDataNodeArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < pathDataNodeArr.length; i10++) {
            PathDataNode pathDataNode = pathDataNodeArr[i10];
            char c10 = pathDataNode.mType;
            PathDataNode pathDataNode2 = pathDataNodeArr2[i10];
            if (c10 != pathDataNode2.mType || pathDataNode.mParams.length != pathDataNode2.mParams.length) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a1 A[Catch: NumberFormatException -> 0x00af, TryCatch #0 {NumberFormatException -> 0x00af, blocks: (B:26:0x0059, B:29:0x006d, B:31:0x0073, B:35:0x007f, B:48:0x009b, B:50:0x00a1, B:56:0x00b6, B:57:0x00b9), top: B:71:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b6 A[Catch: NumberFormatException -> 0x00af, TryCatch #0 {NumberFormatException -> 0x00af, blocks: (B:26:0x0059, B:29:0x006d, B:31:0x0073, B:35:0x007f, B:48:0x009b, B:50:0x00a1, B:56:0x00b6, B:57:0x00b9), top: B:71:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x00e0 A[SYNTHETIC] */
    public static PathDataNode[] createNodesFromPathData(String str) {
        String strTrim;
        int i10;
        float[] fArrA;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (i13 < str.length()) {
            while (i13 < str.length()) {
                char cCharAt = str.charAt(i13);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i12, i13).trim();
                        if (strTrim.length() <= 0) {
                            if (strTrim.charAt(i11) != 'z' || strTrim.charAt(i11) == 'Z') {
                                i10 = i11;
                                fArrA = new float[i10];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i14 = i11;
                                    int i15 = 1;
                                    while (i15 < length) {
                                        int i16 = i11;
                                        int i17 = i16;
                                        int i18 = i17;
                                        int i19 = i18;
                                        for (int i20 = i15; i20 < strTrim.length(); i20++) {
                                            char cCharAt2 = strTrim.charAt(i20);
                                            if (cCharAt2 == ' ') {
                                                i16 = 0;
                                                i18 = 1;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        i16 = 0;
                                                        i18 = 1;
                                                        break;
                                                    case '-':
                                                        if (i20 == i15 || i16 != 0) {
                                                            i16 = 0;
                                                        } else {
                                                            i16 = 0;
                                                            i18 = 1;
                                                            i19 = 1;
                                                        }
                                                        break;
                                                    case '.':
                                                        if (i17 == 0) {
                                                            i16 = 0;
                                                            i17 = 1;
                                                        } else {
                                                            i16 = 0;
                                                            i18 = 1;
                                                            i19 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        i16 = 0;
                                                        break;
                                                }
                                            } else {
                                                i16 = 1;
                                            }
                                            if (i18 != 0) {
                                                if (i15 < i20) {
                                                    fArr[i14] = Float.parseFloat(strTrim.substring(i15, i20));
                                                    i14++;
                                                }
                                                if (i19 != 0) {
                                                    i15 = i20;
                                                } else {
                                                    i15 = i20 + 1;
                                                }
                                                i11 = 0;
                                            }
                                        }
                                        if (i15 < i20) {
                                            fArr[i14] = Float.parseFloat(strTrim.substring(i15, i20));
                                            i14++;
                                        }
                                        if (i19 != 0) {
                                            i15 = i20;
                                        } else {
                                            i15 = i20 + 1;
                                        }
                                        i11 = 0;
                                    }
                                    fArrA = a(fArr, i14);
                                    i10 = 0;
                                } catch (NumberFormatException e5) {
                                    throw new RuntimeException(h0.b("error in parsing \"", strTrim, "\""), e5);
                                }
                            }
                            char cCharAt3 = strTrim.charAt(i10);
                            PathDataNode pathDataNode = new PathDataNode();
                            pathDataNode.mType = cCharAt3;
                            pathDataNode.mParams = fArrA;
                            arrayList.add(pathDataNode);
                        }
                        i12 = i13;
                        i11 = 0;
                        i13++;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i13++;
            }
            strTrim = str.substring(i12, i13).trim();
            if (strTrim.length() <= 0) {
                if (strTrim.charAt(i11) != 'z') {
                    i10 = i11;
                    fArrA = new float[i10];
                } else {
                    i10 = i11;
                    fArrA = new float[i10];
                }
                char cCharAt4 = strTrim.charAt(i10);
                PathDataNode pathDataNode2 = new PathDataNode();
                pathDataNode2.mType = cCharAt4;
                pathDataNode2.mParams = fArrA;
                arrayList.add(pathDataNode2);
            }
            i12 = i13;
            i11 = 0;
            i13++;
        }
        if (i13 - i12 == 1 && i12 < str.length()) {
            char cCharAt5 = str.charAt(i12);
            PathDataNode pathDataNode3 = new PathDataNode();
            pathDataNode3.mType = cCharAt5;
            pathDataNode3.mParams = new float[0];
            arrayList.add(pathDataNode3);
        }
        return (PathDataNode[]) arrayList.toArray(new PathDataNode[arrayList.size()]);
    }

    public static Path createPathFromPathData(String str) {
        Path path = new Path();
        PathDataNode[] pathDataNodeArrCreateNodesFromPathData = createNodesFromPathData(str);
        if (pathDataNodeArrCreateNodesFromPathData == null) {
            return null;
        }
        try {
            PathDataNode.nodesToPath(pathDataNodeArrCreateNodesFromPathData, path);
            return path;
        } catch (RuntimeException e5) {
            throw new RuntimeException(androidx.camera.core.processing.f.d("Error in parsing ", str), e5);
        }
    }

    public static PathDataNode[] deepCopyNodes(PathDataNode[] pathDataNodeArr) {
        if (pathDataNodeArr == null) {
            return null;
        }
        PathDataNode[] pathDataNodeArr2 = new PathDataNode[pathDataNodeArr.length];
        for (int i10 = 0; i10 < pathDataNodeArr.length; i10++) {
            PathDataNode pathDataNode = pathDataNodeArr[i10];
            PathDataNode pathDataNode2 = new PathDataNode();
            pathDataNode2.mType = pathDataNode.mType;
            float[] fArr = pathDataNode.mParams;
            pathDataNode2.mParams = a(fArr, fArr.length);
            pathDataNodeArr2[i10] = pathDataNode2;
        }
        return pathDataNodeArr2;
    }

    public static boolean interpolatePathDataNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2, PathDataNode[] pathDataNodeArr3, float f6) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr3 == null) {
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes cannot be null");
        }
        if (pathDataNodeArr.length != pathDataNodeArr2.length || pathDataNodeArr2.length != pathDataNodeArr3.length) {
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
        }
        if (!canMorph(pathDataNodeArr2, pathDataNodeArr3)) {
            return false;
        }
        for (int i10 = 0; i10 < pathDataNodeArr.length; i10++) {
            pathDataNodeArr[i10].interpolatePathDataNode(pathDataNodeArr2[i10], pathDataNodeArr3[i10], f6);
        }
        return true;
    }

    public static void updateNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        for (int i10 = 0; i10 < pathDataNodeArr2.length; i10++) {
            pathDataNodeArr[i10].mType = pathDataNodeArr2[i10].mType;
            int i11 = 0;
            while (true) {
                float[] fArr = pathDataNodeArr2[i10].mParams;
                if (i11 < fArr.length) {
                    pathDataNodeArr[i10].mParams[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }
}
