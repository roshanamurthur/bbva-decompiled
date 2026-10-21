package com.mypinpad.tsdk.isolation;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class bfg extends BufferedWriter {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f54694q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f54695r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final char[] f54696p0;

    public bfg(Writer writer) {
        super(writer);
        this.f54696p0 = new char[64];
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws IOException {
        byte[] bArr;
        int i13;
        char[] cArr;
        int i14 = ~i11;
        int i15 = ~(i14 | i10);
        int i16 = ~i12;
        int i17 = (((~(i10 | i11 | i12)) | (~((~i10) | i14)) | (~(i14 | i16))) * 676) + ((i15 | (~(i16 | i10))) * 676) + ((i10 | i12 | i14) * (-676)) + (i11 * (-675)) + (i10 * 677);
        if (i17 == 1) {
            bfg bfgVar = (bfg) objArr[0];
            bfi bfiVar = (bfi) objArr[1];
            int i18 = f54694q0;
            int i19 = i18 & 31;
            int i20 = (i19 - (~((i18 ^ 31) | i19))) - 1;
            f54695r0 = i20 % 128;
            int i21 = i20 % 2;
            bfj x4 = bfiVar.setX();
            if (i21 == 0) {
                setDividerPadding(new Object[]{bfgVar, (String) bfj.setCompoundDrawableTintBlendMode(new Object[]{x4}, 928663106, -928663106, System.identityHashCode(x4))}, -1572667745, 1572667745, System.identityHashCode(bfgVar));
                ((List) bfj.setCompoundDrawableTintBlendMode(new Object[]{x4}, 1025053102, -1025053100, System.identityHashCode(x4))).isEmpty();
                throw null;
            }
            setDividerPadding(new Object[]{bfgVar, (String) bfj.setCompoundDrawableTintBlendMode(new Object[]{x4}, 928663106, -928663106, System.identityHashCode(x4))}, -1572667745, 1572667745, System.identityHashCode(bfgVar));
            if (!((List) bfj.setCompoundDrawableTintBlendMode(new Object[]{x4}, 1025053102, -1025053100, System.identityHashCode(x4))).isEmpty()) {
                Iterator it = ((List) bfj.setCompoundDrawableTintBlendMode(new Object[]{x4}, 1025053102, -1025053100, System.identityHashCode(x4))).iterator();
                int i22 = f54694q0;
                int i23 = i22 ^ 83;
                int i24 = ((((i22 & 83) | i23) << 1) - (~(-i23))) - 1;
                f54695r0 = i24 % 128;
                int i25 = i24 % 2;
                while (it.hasNext()) {
                    int i26 = f54694q0;
                    int i27 = i26 ^ 125;
                    int i28 = ((((i26 & 125) | i27) << 1) - (~(-i27))) - 1;
                    f54695r0 = i28 % 128;
                    if (i28 % 2 == 0) {
                        bfh bfhVar = (bfh) it.next();
                        bfgVar.write((String) bfh.setX(new Object[]{bfhVar}, 1190698516, -1190698513, System.identityHashCode(bfhVar)));
                        bfgVar.write(": ");
                        bfgVar.write((String) bfh.setX(new Object[]{bfhVar}, 167897119, -167897118, System.identityHashCode(bfhVar)));
                        bfgVar.newLine();
                        throw null;
                    }
                    bfh bfhVar2 = (bfh) it.next();
                    bfgVar.write((String) bfh.setX(new Object[]{bfhVar2}, 1190698516, -1190698513, System.identityHashCode(bfhVar2)));
                    bfgVar.write(": ");
                    bfgVar.write((String) bfh.setX(new Object[]{bfhVar2}, 167897119, -167897118, System.identityHashCode(bfhVar2)));
                    bfgVar.newLine();
                }
                bfgVar.newLine();
                int i29 = f54695r0;
                int i30 = i29 | 111;
                int i31 = (i30 << 1) - ((~(i29 & 111)) & i30);
                f54694q0 = i31 % 128;
                int i32 = i31 % 2;
            }
            setDividerPadding(new Object[]{bfgVar, (byte[]) bfj.setCompoundDrawableTintBlendMode(new Object[]{x4}, -2129009069, 2129009072, System.identityHashCode(x4))}, -652743547, 652743550, System.identityHashCode(bfgVar));
            setDividerPadding(new Object[]{bfgVar, (String) bfj.setCompoundDrawableTintBlendMode(new Object[]{x4}, 928663106, -928663106, System.identityHashCode(x4))}, -525611509, 525611511, System.identityHashCode(bfgVar));
            int i33 = f54695r0;
            int i34 = i33 & 1;
            int i35 = (i34 - (~(-(-((i33 ^ 1) | i34))))) - 1;
            f54694q0 = i35 % 128;
            if (i35 % 2 != 0) {
                throw null;
            }
        } else if (i17 == 2) {
            bfg bfgVar2 = (bfg) objArr[0];
            String str = (String) objArr[1];
            StringBuilder sb2 = new StringBuilder("-----END ");
            sb2.append(str);
            sb2.append("-----");
            bfgVar2.write(sb2.toString());
            bfgVar2.newLine();
            int i36 = f54694q0;
            int i37 = (i36 & 109) + (i36 | 109);
            f54695r0 = i37 % 128;
            if (i37 % 2 == 0) {
                throw null;
            }
        } else if (i17 != 3) {
            bfg bfgVar3 = (bfg) objArr[0];
            String str2 = (String) objArr[1];
            StringBuilder sb3 = new StringBuilder("-----BEGIN ");
            sb3.append(str2);
            sb3.append("-----");
            bfgVar3.write(sb3.toString());
            bfgVar3.newLine();
            int i38 = f54695r0;
            int i39 = (i38 | 45) << 1;
            int i40 = -(((~i38) & 45) | (i38 & (-46)));
            int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
            f54694q0 = i41 % 128;
            int i42 = i41 % 2;
        } else {
            bfg bfgVar4 = (bfg) objArr[0];
            byte[] bArr2 = (byte[]) objArr[1];
            int i43 = f54695r0 + 55;
            f54694q0 = i43 % 128;
            if (i43 % 2 != 0) {
                bArr = (byte[]) bfa.setCompoundDrawableTintBlendMode(new Object[]{bArr2}, -1057021271, 1057021273, (int) System.currentTimeMillis());
                i13 = 1;
            } else {
                bArr = (byte[]) bfa.setCompoundDrawableTintBlendMode(new Object[]{bArr2}, -1057021271, 1057021273, (int) System.currentTimeMillis());
                i13 = 0;
            }
            int i44 = f54695r0;
            int i45 = ((-1) << 1) - ((((i44 | 38) << 1) - (i44 ^ 38)) ^ (-1));
            f54694q0 = i45 % 128;
            int i46 = i45 % 2;
            while (i13 < bArr.length) {
                int i47 = f54695r0;
                int i48 = ((i47 ^ 112) + ((i47 & 112) << 1)) - 1;
                f54694q0 = i48 % 128;
                int i49 = i48 % 2;
                int i50 = 0;
                while (true) {
                    cArr = bfgVar4.f54696p0;
                    if (i50 == cArr.length) {
                        break;
                    }
                    int i51 = f54694q0;
                    int i52 = i51 ^ 111;
                    int i53 = ((((i51 & 111) | i52) << 1) - (~(-i52))) - 1;
                    f54695r0 = i53 % 128;
                    int i54 = i53 % 2;
                    int i55 = -(~i50);
                    if ((((i13 | i55) << 1) - (i55 ^ i13)) - 1 >= bArr.length) {
                        break;
                    }
                    int i56 = ((i51 ^ 105) | (i51 & 105)) << 1;
                    int i57 = -(((~i51) & 105) | (i51 & (-106)));
                    int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
                    f54695r0 = i58 % 128;
                    if (i58 % 2 == 0) {
                        int i59 = -(~(-i50));
                        cArr[i50] = (char) bArr[((i13 ^ i59) + ((i59 & i13) << 1)) - 1];
                        int i60 = i50 ^ 32;
                        i50 = ((((i50 & 32) | i60) << 1) - (~(-i60))) - 1;
                    } else {
                        cArr[i50] = (char) bArr[((i13 | i50) << 1) - (i13 ^ i50)];
                        i50++;
                    }
                }
                bfgVar4.write(cArr, 0, i50);
                bfgVar4.newLine();
                int i61 = -(-bfgVar4.f54696p0.length);
                int i62 = i13 & i61;
                i13 = ((i13 ^ i61) | i62) + i62;
                System.identityHashCode(bfgVar4);
                System.identityHashCode(bfgVar4);
            }
            int i63 = f54695r0;
            int i64 = (i63 & (-48)) | ((~i63) & 47);
            int i65 = -(-((i63 & 47) << 1));
            int i66 = ((i64 | i65) << 1) - (i65 ^ i64);
            f54694q0 = i66 % 128;
            int i67 = i66 % 2;
        }
        return null;
    }

    public final void setY(bfi bfiVar) throws IOException {
        setDividerPadding(new Object[]{this, bfiVar}, 1704319995, -1704319994, System.identityHashCode(this));
    }
}
