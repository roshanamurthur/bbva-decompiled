package com.vasco.digipass.sdk.obfuscated;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import com.vasco.digipass.sdk.DigipassSDKReturnCodes;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.io.ByteArrayOutputStream;
import java.util.Vector;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements DigipassSDKConstants {

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte f65803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f65804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f65805c;

        private b() {
        }
    }

    public static e a(String str) throws h {
        int iA = j.a(str);
        if (iA == 0) {
            return b(j.b(str));
        }
        throw new h(iA);
    }

    public static e b(byte[] bArr, byte[] bArr2) throws h {
        a(bArr, bArr2);
        return c(bArr, bArr2);
    }

    private static e c(byte[] bArr, byte[] bArr2) throws h {
        e eVar = new e();
        if (bArr[1] <= 7) {
            a(bArr, bArr2, eVar);
        } else {
            b(bArr, bArr2, eVar);
        }
        return eVar;
    }

    public static e b(byte[] bArr, byte[] bArr2, byte[] bArr3) throws h {
        a(bArr, bArr2, bArr3);
        return c(bArr, bArr2);
    }

    public static void a(byte[] bArr) throws h {
        if (bArr != null) {
            if (bArr.length > 1) {
                if (bArr[1] <= 7) {
                    if (bArr.length == 56) {
                        int iB = j.b(bArr);
                        if (iB != 0) {
                            throw new h(iB);
                        }
                        return;
                    }
                    throw new h(DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_LENGTH);
                }
                if (bArr.length < 91 || bArr.length > 958) {
                    throw new h(DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_LENGTH);
                }
                return;
            }
            throw new h(DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_LENGTH);
        }
        throw new h(DigipassSDKReturnCodes.STATIC_VECTOR_NULL);
    }

    public static e b(byte[] bArr) throws h {
        a(bArr);
        if (bArr[1] <= 7) {
            return c(bArr, new byte[56]);
        }
        e eVar = new e();
        b(bArr, eVar);
        return eVar;
    }

    public static com.vasco.digipass.sdk.obfuscated.b c(byte[] bArr) {
        com.vasco.digipass.sdk.obfuscated.b bVar = new com.vasco.digipass.sdk.obfuscated.b();
        System.arraycopy(bArr, 0, bVar.f65675a, 0, 4);
        long jB = c.b(bArr);
        bVar.f65683i = q.a(jB, -2147483648L);
        bVar.f65688o = q.a(jB, SvgConstantsKt.SPECIFIED_MASK);
        bVar.f65694u = q.a(jB, SvgConstantsKt.SPECIFIED_CLIP_RULE);
        bVar.A = q.a(jB, SvgConstantsKt.SPECIFIED_CLIP_PATH);
        bVar.m = q.a(jB, SvgConstantsKt.SPECIFIED_STOP_OPACITY);
        bVar.f65690q = q.a(jB, SvgConstantsKt.SPECIFIED_STOP_COLOR);
        bVar.f65695v = q.a(jB, SvgConstantsKt.SPECIFIED_VISIBILITY);
        bVar.f65689p = q.a(jB, SvgConstantsKt.SPECIFIED_MARKER_END);
        bVar.f65692s = q.a(jB, 256L);
        bVar.f65696w = q.a(jB, SvgConstantsKt.SPECIFIED_DISPLAY);
        bVar.f65697x = q.a(jB, SvgConstantsKt.SPECIFIED_MARKER_MID);
        bVar.f65698y = (3145728 & jB) >> 20;
        bVar.f65676b = (786432 & jB) >> 18;
        bVar.f65680f = q.a(jB, SvgConstantsKt.SPECIFIED_TEXT_DECORATION);
        bVar.f65681g = q.a(jB, SvgConstantsKt.SPECIFIED_FONT_STYLE);
        bVar.f65678d = (983040 & jB) >> 16;
        bVar.f65686l = q.a(jB, SvgConstantsKt.SPECIFIED_FONT_WEIGHT);
        bVar.f65693t = q.a(jB, SvgConstantsKt.SPECIFIED_FONT_WEIGHT);
        bVar.f65685k = q.a(jB, 16384L);
        bVar.f65687n = q.a(jB, SvgConstantsKt.SPECIFIED_FONT_FAMILY);
        bVar.f65684j = q.a(jB, SvgConstantsKt.SPECIFIED_COLOR);
        bVar.f65682h = q.a(jB, SvgConstantsKt.SPECIFIED_OPACITY);
        bVar.f65699z = q.a(jB, 1024L);
        boolean zA = q.a(jB, 512L);
        bVar.f65691r = zA;
        bVar.f65677c = (240 & jB) >> 4;
        bVar.f65679e = jB & 15;
        bVar.B = bVar.f65697x && bVar.f65690q && !zA;
        bVar.C = bVar.f65696w && bVar.f65699z;
        if (bVar.f65690q && zA) {
            bVar.f65690q = false;
            bVar.f65691r = false;
            bVar.D = true;
        }
        if (bVar.f65695v && bVar.f65689p) {
            bVar.f65695v = false;
            bVar.f65689p = false;
            bVar.E = true;
            bVar.F = !bVar.f65692s;
        }
        return bVar;
    }

    private static void b(byte[] bArr, byte[] bArr2, e eVar) throws h {
        b(bArr, eVar);
        a(bArr2, eVar);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0068. Please report as an issue. */
    private static void b(byte[] bArr, e eVar) throws h {
        char c10;
        char c11;
        char c12;
        byte[] bArr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, Constants.CVR_B1b41_1110_ONLINE_PIN, 15, 16, 17};
        byte[] bArr3 = {13};
        byte[] bArr4 = {12};
        byte[] bArr5 = {Base64.padSymbol};
        i iVar = eVar.f65717c;
        byte b10 = bArr[1];
        iVar.f65748a = b10;
        int i10 = 8;
        if (b10 <= 8) {
            if (((bArr[2] & 255) << 8) + (bArr[3] & 255) == bArr.length - 4) {
                Vector vectorA = a(bArr, 4, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                i iVar2 = eVar.f65717c;
                iVar2.m = (byte) 0;
                int i11 = 32;
                iVar2.f65767u = (byte) 32;
                iVar2.f65768v = (byte) 0;
                iVar2.f65769w = false;
                int i12 = 0;
                boolean zB = false;
                while (i12 < vectorA.size()) {
                    b bVar = (b) vectorA.elementAt(i12);
                    byte b11 = bVar.f65803a;
                    if (b11 != 56) {
                        if (b11 == 70) {
                            c10 = 2;
                            eVar.f65717c.f65768v = a(bVar, 3, 10, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                        } else if (b11 != 71) {
                            switch (b11) {
                                case 1:
                                    c10 = 2;
                                    eVar.f65717c.f65749b = c(bVar, 3, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                                    break;
                                case 2:
                                    c10 = 2;
                                    eVar.f65717c.f65750c = a(bVar, 16, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                                    break;
                                case 3:
                                    c10 = 2;
                                    eVar.f65717c.f65751d = a(bVar, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                                    break;
                                case 4:
                                    c10 = 2;
                                    eVar.f65717c.f65752e = c(bVar, 1, 255, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                                    break;
                                case 5:
                                    c10 = 2;
                                    c12 = 255;
                                    eVar.f65717c.f65753f = c(bVar, 1, 255, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                                    c11 = c12;
                                    break;
                                case 6:
                                    c10 = 2;
                                    eVar.f65717c.f65760n = a(bVar, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                                    break;
                                case 7:
                                    c10 = 2;
                                    eVar.f65717c.f65754g = a(bVar, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                                    break;
                                case 8:
                                    c10 = 2;
                                    eVar.f65717c.f65756i = a(bVar, 1, 255, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                                    break;
                                case 9:
                                    c10 = 2;
                                    c12 = 255;
                                    eVar.f65717c.f65759l = c(bVar, 0, 255, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                                    c11 = c12;
                                    break;
                                case 10:
                                    c10 = 2;
                                    eVar.f65717c.f65758k = a(bVar, 0, 1, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                                    break;
                                case 11:
                                    c10 = 2;
                                    eVar.f65717c.f65755h = a(bVar, 0, 2, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                                    break;
                                case 12:
                                    eVar.f65717c.f65761o = a(bVar, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                                    c11 = 255;
                                    c10 = 2;
                                    break;
                                case 13:
                                    eVar.f65717c.f65762p = a(bVar, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                                    c11 = 255;
                                    c10 = 2;
                                    break;
                                case 14:
                                    eVar.f65717c.f65763q = a(bVar, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                                    c11 = 255;
                                    c10 = 2;
                                    break;
                                case 15:
                                    eVar.f65717c.f65764r = a(bVar, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                                    c11 = 255;
                                    c10 = 2;
                                    break;
                                case 16:
                                    eVar.f65717c.f65765s = a(bVar, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                                    c11 = 255;
                                    c10 = 2;
                                    break;
                                case 17:
                                    zB = b(bVar.f65805c, eVar, false);
                                    c11 = 255;
                                    c10 = 2;
                                    break;
                                default:
                                    switch (b11) {
                                        case 60:
                                            eVar.f65717c.f65766t = a(bVar, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                                            break;
                                        case 61:
                                            b(bVar.f65805c, eVar, true);
                                            break;
                                        case 62:
                                            eVar.f65717c.f65767u = a(bVar, i10, i11, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                                            break;
                                    }
                                    c11 = 255;
                                    c10 = 2;
                                    break;
                            }
                        } else {
                            c10 = 2;
                            eVar.f65717c.f65769w = a(bVar, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                        }
                        c11 = 255;
                    } else {
                        c10 = 2;
                        c11 = 255;
                        eVar.f65717c.m = a(bVar, 0, 255, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                    }
                    i12++;
                    i10 = 8;
                    i11 = 32;
                }
                i iVar3 = eVar.f65717c;
                iVar3.f65757j = (byte) 0;
                byte[] bArr6 = new byte[15 + (zB ? 1 : 0) + ((!zB || eVar.f65715a > 1) ? 1 : 0) + (iVar3.f65766t ? 1 : 0)];
                int i13 = 15;
                System.arraycopy(bArr2, 0, bArr6, 0, 15);
                if (zB) {
                    System.arraycopy(bArr3, 0, bArr6, 15, 1);
                    i13 = 16;
                }
                if (!zB || eVar.f65715a > 1) {
                    System.arraycopy(bArr4, 0, bArr6, i13, 1);
                    i13++;
                }
                if (eVar.f65717c.f65766t) {
                    System.arraycopy(bArr5, 0, bArr6, i13, 1);
                }
                a(vectorA, bArr6, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                return;
            }
            throw new h(DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_LENGTH);
        }
        throw new h(DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
    }

    private static void a(byte[] bArr, byte[] bArr2) throws h {
        a(bArr);
        if (bArr2 != null) {
            if (bArr[1] <= 7) {
                if (bArr2.length != 56) {
                    throw new h(DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_LENGTH);
                }
                return;
            } else {
                if (bArr2.length < 80 || bArr2.length > 306) {
                    throw new h(DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_LENGTH);
                }
                return;
            }
        }
        throw new h(DigipassSDKReturnCodes.DYNAMIC_VECTOR_NULL);
    }

    private static void a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws h {
        a(bArr, bArr2);
        int iA = j.a(bArr3);
        if (iA != 0) {
            throw new h(iA);
        }
    }

    private static void a(byte[] bArr, byte[] bArr2, e eVar) {
        eVar.f65717c.f65748a = bArr[1];
        eVar.f65717c.f65749b = new String(bArr, 2, 3).concat(new String(bArr2, 2, 7));
        System.arraycopy(bArr, 5, eVar.f65717c.f65750c, 0, 16);
        i iVar = eVar.f65717c;
        byte b10 = bArr[23];
        iVar.f65751d = b10 != 15;
        iVar.f65752e = bArr[24];
        iVar.f65753f = 255;
        iVar.f65754g = bArr[25] == 2;
        iVar.f65755h = b10;
        iVar.f65756i = bArr[26];
        iVar.f65757j = (byte) (bArr[50] & 15);
        iVar.f65758k = bArr[30];
        iVar.f65759l = (byte) (15 & bArr[29]);
        iVar.m = (byte) 0;
        iVar.f65760n = false;
        iVar.f65761o = q.a(bArr[22], 32L);
        i iVar2 = eVar.f65717c;
        iVar2.f65762p = false;
        iVar2.f65763q = !q.a(bArr[22], 2L);
        i iVar3 = eVar.f65717c;
        iVar3.f65764r = false;
        iVar3.f65765s = false;
        iVar3.f65766t = false;
        iVar3.f65767u = (byte) 32;
        g gVar = eVar.f65718d;
        byte b11 = bArr2[0];
        gVar.f65726a = b11;
        gVar.f65727b = b11;
        gVar.f65728c = bArr2[1];
        System.arraycopy(bArr2, 50, gVar.f65729d, 0, 4);
        g gVar2 = eVar.f65718d;
        gVar2.f65730e = bArr2[54];
        gVar2.f65731f = bArr2[9];
        gVar2.f65732g = new byte[16];
        System.arraycopy(bArr2, 10, gVar2.f65733h, 0, 16);
        g gVar3 = eVar.f65718d;
        gVar3.f65734i = new byte[16];
        gVar3.f65735j = new byte[16];
        gVar3.f65736k = eVar.f65717c.f65751d;
        gVar3.f65737l = (byte) 0;
        gVar3.m = false;
        gVar3.f65738n = false;
        gVar3.f65739o = (byte) 0;
        gVar3.f65740p = new byte[16];
        gVar3.f65741q = new byte[16];
        gVar3.f65742r = (byte) 0;
        gVar3.f65743s = new byte[16];
        gVar3.f65744t = new byte[16];
        gVar3.f65745u = (byte) 0;
        gVar3.f65746v = false;
        eVar.f65715a = 2;
        eVar.a()[0] = a(bArr, bArr2, 1, eVar);
        eVar.a()[1] = a(bArr, bArr2, 2, eVar);
    }

    private static String c(b bVar, int i10, int i11) {
        return new String(a(bVar, i10, i11));
    }

    private static int c(b bVar, int i10, int i11, int i12) throws h {
        int iB = b(bVar, i12) & 255;
        if (iB < i10 || iB > i11) {
            throw new h(i12);
        }
        return iB;
    }

    private static byte[] c(e eVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(byteArrayOutputStream, (byte) 45, 7);
        a(byteArrayOutputStream, (byte) 46, eVar.f65718d.f65728c);
        a(byteArrayOutputStream, (byte) 73, eVar.f65717c.f65749b.getBytes());
        a(byteArrayOutputStream, (byte) 48, eVar.f65718d.f65729d);
        a(byteArrayOutputStream, (byte) 49, eVar.f65718d.f65730e);
        a(byteArrayOutputStream, (byte) 50, eVar.f65718d.f65733h);
        a(byteArrayOutputStream, (byte) 51, eVar.f65718d.f65735j);
        a(byteArrayOutputStream, (byte) 55, eVar.f65718d.f65736k ? 1 : 0);
        a(byteArrayOutputStream, (byte) 57, eVar.f65718d.f65737l);
        a(byteArrayOutputStream, (byte) 58, eVar.f65718d.m ? 1 : 0);
        a(byteArrayOutputStream, (byte) 59, eVar.f65718d.f65738n ? 1 : 0);
        for (int i10 = 0; i10 < eVar.f65715a; i10++) {
            a(byteArrayOutputStream, (byte) 17, eVar.a()[i10]);
        }
        if (!eVar.f65717c.f65766t) {
            g gVar = eVar.f65718d;
            gVar.f65739o = (byte) 1;
            gVar.f65741q = new byte[16];
            gVar.f65742r = (byte) 0;
            gVar.f65744t = new byte[16];
            gVar.f65745u = (byte) 0;
        }
        a(byteArrayOutputStream, (byte) 63, eVar.f65718d.f65739o);
        a(byteArrayOutputStream, (byte) 64, eVar.f65718d.f65741q);
        a(byteArrayOutputStream, (byte) 65, eVar.f65718d.f65742r);
        a(byteArrayOutputStream, (byte) 66, eVar.f65718d.f65744t);
        a(byteArrayOutputStream, (byte) 67, eVar.f65718d.f65745u);
        a(byteArrayOutputStream, (byte) 69, eVar.f65718d.f65746v ? 1 : 0);
        a(byteArrayOutputStream, Base64.padSymbol, eVar.f65719e);
        a(byteArrayOutputStream, (byte) 74, eVar.f65718d.f65727b);
        return byteArrayOutputStream.toByteArray();
    }

    private static d a(byte[] bArr, byte[] bArr2, int i10, e eVar) {
        d dVar = new d();
        int i11 = i10 == 1 ? 0 : 9;
        int i12 = i10 == 1 ? 0 : 8;
        byte b10 = bArr[i11 + 38];
        if (i10 != 1 && eVar.f65717c.f65748a >= 7) {
            dVar.f65700a = q.a(b10, 1L);
        } else {
            dVar.f65700a = b10 != 0;
        }
        dVar.f65701b = false;
        dVar.f65702c = (byte) i10;
        dVar.f65703d = "";
        byte[] bArr3 = new byte[4];
        System.arraycopy(bArr, i11 + 31, bArr3, 0, 4);
        com.vasco.digipass.sdk.obfuscated.b bVarC = c(bArr3);
        dVar.f65704e = bVarC;
        if (i10 == 1) {
            dVar.f65706g = (byte) ((bVarC.f65680f || bVarC.f65681g) ? 1 : 0);
        } else {
            dVar.f65706g = bArr[48];
        }
        dVar.f65707h = new byte[8];
        dVar.f65708i = new byte[8];
        for (int i13 = 0; i13 < 8; i13++) {
            dVar.f65707h[i13] = 0;
            dVar.f65708i[i13] = 16;
        }
        dVar.f65705f = bArr[i11 + 35] != 0;
        byte b11 = bArr[i11 + 36];
        byte b12 = (byte) (b11 & 15);
        dVar.f65709j = b12;
        if (b12 == 0) {
            dVar.f65709j = 16;
        }
        dVar.f65710k = (b11 & Constants.CVR_B2b8765_1111_APP_DISABLED) >> 4;
        dVar.f65711l = bArr[i11 + 37] != 0;
        dVar.m = bArr[i10 == 1 ? '\'' : '1'];
        byte[] bArr4 = new byte[4];
        System.arraycopy(bArr2, i12 + 34, bArr4, 0, 4);
        dVar.f65712n = c.b(bArr4);
        dVar.f65713o = 0L;
        dVar.f65714p = j.c(dVar);
        return dVar;
    }

    private static boolean b(byte[] bArr, e eVar, boolean z10) throws h {
        byte[] bArr2 = {19, MessageUtils.MESSAGE_18_DC2, 20, MessageUtils.MESSAGE_21_NAK, 24, 23, 22, 41, 42, 43, 44};
        d dVar = new d();
        if (z10) {
            eVar.f65719e = dVar;
        } else {
            d[] dVarArrA = eVar.a();
            int i10 = eVar.f65715a;
            eVar.f65715a = i10 + 1;
            dVarArrA[i10] = dVar;
        }
        for (int i11 = 0; i11 < 8; i11++) {
            dVar.f65707h[i11] = 0;
            dVar.f65708i[i11] = 16;
        }
        Vector vectorA = a(bArr, 0, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
        boolean z11 = false;
        for (int i12 = 0; i12 < vectorA.size(); i12++) {
            b bVar = (b) vectorA.elementAt(i12);
            switch (bVar.f65803a) {
                case 18:
                    boolean zA = a(bVar, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                    dVar.f65701b = zA;
                    if (zA) {
                        z11 = true;
                        continue;
                    }
                    break;
                case 19:
                    dVar.f65700a = a(bVar, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                    continue;
                    break;
                case 20:
                    if (z10) {
                        dVar.f65702c = (byte) 100;
                    } else {
                        dVar.f65702c = a(bVar, 1, 8, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                    }
                    break;
                case 21:
                    dVar.f65703d = c(bVar, 12, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                    break;
                case 22:
                    dVar.f65705f = a(bVar, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                    break;
                case 23:
                    dVar.f65704e = c(a(bVar, 4, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT));
                    break;
                case 24:
                    dVar.f65706g = a(bVar, 0, 8, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                    break;
                case 25:
                    dVar.f65707h[0] = a(bVar, 0, 16, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                    break;
                case 26:
                    dVar.f65707h[1] = a(bVar, 0, 16, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                    break;
                case 27:
                    dVar.f65707h[2] = a(bVar, 0, 16, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                    break;
                case 28:
                    dVar.f65707h[3] = a(bVar, 0, 16, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                    break;
                case 29:
                    dVar.f65707h[4] = a(bVar, 0, 16, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                    break;
                case 30:
                    dVar.f65707h[5] = a(bVar, 0, 16, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                    break;
                case 31:
                    dVar.f65707h[6] = a(bVar, 0, 16, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                    break;
                case 32:
                    dVar.f65707h[7] = a(bVar, 0, 16, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                    break;
                case 33:
                    dVar.f65708i[0] = a(bVar, 0, 16, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                    break;
                case 34:
                    dVar.f65708i[1] = a(bVar, 0, 16, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                    break;
                case 35:
                    dVar.f65708i[2] = a(bVar, 0, 16, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                    break;
                case 36:
                    dVar.f65708i[3] = a(bVar, 0, 16, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                    break;
                case 37:
                    dVar.f65708i[4] = a(bVar, 0, 16, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                    break;
                case 38:
                    dVar.f65708i[5] = a(bVar, 0, 16, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                    break;
                case 39:
                    dVar.f65708i[6] = a(bVar, 0, 16, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                    break;
                case 40:
                    dVar.f65708i[7] = a(bVar, 0, 16, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                    break;
                case 41:
                    dVar.f65709j = c(bVar, 3, 16, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                    break;
                case 42:
                    dVar.f65710k = c(bVar, 0, 10, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                    break;
                case 43:
                    dVar.f65711l = a(bVar, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                    break;
                case 44:
                    dVar.m = a(bVar, 0, 2, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
                    break;
            }
        }
        a(vectorA, bArr2, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
        dVar.f65714p = j.c(dVar);
        return z11;
    }

    private static void a(byte[] bArr, e eVar) throws h {
        byte[] bArr2 = {45, 46, 48, 49, 50, 51, 17};
        eVar.f65718d.f65738n = true;
        Vector vectorA = a(bArr, 0, DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_FORMAT);
        StringBuilder sb2 = new StringBuilder(eVar.f65717c.f65749b);
        for (int i10 = 0; i10 < vectorA.size(); i10++) {
            b bVar = (b) vectorA.elementAt(i10);
            byte b10 = bVar.f65803a;
            if (b10 == 17) {
                a(bVar.f65805c, eVar, false);
            } else if (b10 == 55) {
                eVar.f65718d.f65736k = a(bVar, DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_FORMAT);
            } else if (b10 == 61) {
                a(bVar.f65805c, eVar, true);
            } else if (b10 == 69) {
                eVar.f65718d.f65746v = a(bVar, DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_FORMAT);
            } else if (b10 == 73) {
                eVar.f65717c.f65749b = c(bVar, 10, DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_FORMAT);
            } else if (b10 != 74) {
                switch (b10) {
                    case 45:
                        eVar.f65718d.f65726a = a(bVar, 1, 7, DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_FORMAT);
                        break;
                    case 46:
                        eVar.f65718d.f65728c = a(bVar, 0, 4, DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_FORMAT);
                        break;
                    case 47:
                        sb2.append(c(bVar, 7, DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_FORMAT));
                        eVar.f65717c.f65749b = sb2.toString();
                        break;
                    case 48:
                        eVar.f65718d.f65729d = a(bVar, 4, DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_FORMAT);
                        break;
                    case 49:
                        eVar.f65718d.f65730e = a(bVar, 0, 255, DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_FORMAT);
                        break;
                    case 50:
                        eVar.f65718d.f65733h = a(bVar, 16, DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_FORMAT);
                        break;
                    case 51:
                        eVar.f65718d.f65735j = a(bVar, 16, DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_FORMAT);
                        break;
                    default:
                        switch (b10) {
                            case 57:
                                eVar.f65718d.f65737l = a(bVar, 1, 7, DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_FORMAT);
                                break;
                            case 58:
                                eVar.f65718d.m = a(bVar, DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_FORMAT);
                                break;
                            case 59:
                                eVar.f65718d.f65738n = a(bVar, DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_FORMAT);
                                break;
                            default:
                                switch (b10) {
                                    case 63:
                                        eVar.f65718d.f65739o = a(bVar, 1, 31, DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_FORMAT);
                                        break;
                                    case 64:
                                        eVar.f65718d.f65741q = a(bVar, 16, DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_FORMAT);
                                        break;
                                    case 65:
                                        eVar.f65718d.f65742r = a(bVar, 0, 99, DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_FORMAT);
                                        break;
                                    case 66:
                                        eVar.f65718d.f65744t = b(bVar, 16, 16, DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_FORMAT);
                                        break;
                                    case 67:
                                        eVar.f65718d.f65745u = a(bVar, 0, 0, DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_FORMAT);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                eVar.f65718d.f65727b = a(bVar, 1, 7, DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_FORMAT);
            }
        }
        g gVar = eVar.f65718d;
        gVar.f65731f = (byte) 0;
        gVar.f65732g = new byte[16];
        gVar.f65734i = new byte[16];
        gVar.f65740p = new byte[16];
        gVar.f65743s = new byte[16];
        a(vectorA, bArr2, DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_FORMAT);
        g gVar2 = eVar.f65718d;
        byte b11 = gVar2.f65726a;
        if (b11 < 2) {
            gVar2.f65736k = eVar.f65717c.f65751d;
        }
        if (b11 < 3) {
            gVar2.f65737l = (byte) 2;
            gVar2.m = true;
            gVar2.f65738n = false;
        }
        if (b11 < 7) {
            gVar2.f65727b = b11;
        }
    }

    private static byte[] b(b bVar, int i10, int i11, int i12) throws h {
        int i13 = bVar.f65804b;
        if (i13 >= i10 && i13 <= i11) {
            return bVar.f65805c;
        }
        throw new h(i12);
    }

    private static byte b(b bVar, int i10) throws h {
        if (bVar.f65804b == 1) {
            return bVar.f65805c[0];
        }
        throw new h(i10);
    }

    private static long b(b bVar, int i10, int i11) {
        return c.b(a(bVar, i10, i11));
    }

    private static byte[] b(e eVar) {
        byte[] bArr = new byte[56];
        g gVar = eVar.f65718d;
        bArr[0] = gVar.f65726a;
        bArr[1] = gVar.f65728c;
        System.arraycopy(eVar.f65717c.f65749b.getBytes(), 3, bArr, 2, 7);
        g gVar2 = eVar.f65718d;
        bArr[9] = gVar2.f65731f;
        System.arraycopy(gVar2.f65733h, 0, bArr, 10, 16);
        a(bArr, 1, 0, eVar);
        a(bArr, 2, 8, eVar);
        System.arraycopy(eVar.f65718d.f65729d, 0, bArr, 50, 4);
        bArr[54] = eVar.f65718d.f65730e;
        return bArr;
    }

    private static void a(byte[] bArr, e eVar, boolean z10) throws h {
        byte[] bArr2 = {20, 52, 54, 53};
        Vector vectorA = a(bArr, 0, DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_FORMAT);
        long jB = 0;
        long jB2 = 0;
        byte bA = 0;
        boolean zA = false;
        for (int i10 = 0; i10 < vectorA.size(); i10++) {
            b bVar = (b) vectorA.elementAt(i10);
            byte b10 = bVar.f65803a;
            if (b10 != 20) {
                switch (b10) {
                    case 52:
                        zA = a(bVar, DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_FORMAT);
                        break;
                    case 53:
                        jB2 = b(bVar, 4, DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_FORMAT);
                        break;
                    case 54:
                        jB = b(bVar, 4, DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_FORMAT);
                        break;
                }
            } else {
                bA = z10 ? (byte) 100 : a(bVar, 1, 8, DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_FORMAT);
            }
        }
        a(vectorA, bArr2, DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_FORMAT);
        d dVarA = eVar.a(bA);
        if (dVarA != null) {
            dVarA.f65700a = zA;
            dVarA.f65712n = jB;
            dVarA.f65713o = jB2;
            return;
        }
        throw new h(DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_FORMAT);
    }

    private static Vector a(byte[] bArr, int i10, int i11) throws h {
        Vector vector = new Vector();
        if (!q.f(bArr)) {
            while (i10 < bArr.length) {
                b bVar = new b();
                int i12 = i10 + 1;
                bVar.f65803a = bArr[i10];
                if (i12 < bArr.length) {
                    int i13 = i10 + 2;
                    int i14 = bArr[i12] & 255;
                    bVar.f65804b = i14;
                    if (i13 < bArr.length) {
                        if (i13 + i14 <= bArr.length) {
                            byte[] bArr2 = new byte[i14];
                            bVar.f65805c = bArr2;
                            System.arraycopy(bArr, i13, bArr2, 0, i14);
                            i10 = i13 + bVar.f65804b;
                            vector.addElement(bVar);
                        } else {
                            throw new h(i11);
                        }
                    } else {
                        throw new h(i11);
                    }
                } else {
                    throw new h(i11);
                }
            }
        }
        return vector;
    }

    private static byte[] a(b bVar, int i10, int i11) throws h {
        if (bVar.f65804b == i10) {
            return bVar.f65805c;
        }
        throw new h(i11);
    }

    private static boolean a(b bVar, int i10) {
        return a(bVar, 0, 1, i10) != 0;
    }

    private static byte a(b bVar, int i10, int i11, int i12) throws h {
        int iB = b(bVar, i12) & 255;
        if (iB < i10 || iB > i11) {
            throw new h(i12);
        }
        return (byte) iB;
    }

    private static void a(Vector vector, byte[] bArr, int i10) throws h {
        for (byte b10 : bArr) {
            int i11 = 0;
            while (true) {
                if (i11 < vector.size()) {
                    if (b10 == ((b) vector.elementAt(i11)).f65803a) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    throw new h(i10);
                }
            }
        }
    }

    public static byte[] a(e eVar) {
        if (eVar.f65717c.f65748a <= 7) {
            return b(eVar);
        }
        return c(eVar);
    }

    private static void a(byte[] bArr, int i10, int i11, e eVar) {
        System.arraycopy(c.a(eVar.a(i10).f65712n), 0, bArr, i11 + 34, 4);
    }

    private static void a(ByteArrayOutputStream byteArrayOutputStream, byte b10, int i10) {
        byteArrayOutputStream.write(b10);
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(i10);
    }

    private static void a(ByteArrayOutputStream byteArrayOutputStream, byte b10, byte[] bArr) {
        a(byteArrayOutputStream, b10, bArr, 0, bArr.length);
    }

    private static void a(ByteArrayOutputStream byteArrayOutputStream, byte b10, byte[] bArr, int i10, int i11) {
        byteArrayOutputStream.write(b10);
        byteArrayOutputStream.write(i11);
        byteArrayOutputStream.write(bArr, i10, i11);
    }

    private static void a(ByteArrayOutputStream byteArrayOutputStream, byte b10, d dVar) {
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        a(byteArrayOutputStream2, (byte) 20, dVar.f65702c);
        a(byteArrayOutputStream2, (byte) 52, dVar.f65700a ? 1 : 0);
        a(byteArrayOutputStream2, (byte) 54, c.a(dVar.f65712n));
        a(byteArrayOutputStream2, (byte) 53, c.a(dVar.f65713o));
        byteArrayOutputStream.write(b10);
        byteArrayOutputStream.write(byteArrayOutputStream2.size());
        byteArrayOutputStream.write(byteArrayOutputStream2.toByteArray(), 0, byteArrayOutputStream2.size());
    }
}
