package com.sun.mail.auth;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.sun.mail.util.BASE64DecoderStream;
import com.sun.mail.util.BASE64EncoderStream;
import com.sun.mail.util.MailLogger;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKConstants;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.logging.Level;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

/* JADX INFO: loaded from: classes9.dex */
public class Ntlm {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final char[] f65227k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f65228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f65229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SecretKeyFactory f65230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cipher f65231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MD4 f65232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f65233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f65234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f65235h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f65236i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final MailLogger f65237j;

    public Ntlm(String str, String str2, String str3, String str4, MailLogger mailLogger) {
        int iIndexOf = str2.indexOf(46);
        str2 = iIndexOf != -1 ? str2.substring(0, iIndexOf) : str2;
        int iIndexOf2 = str3.indexOf(92);
        if (iIndexOf2 != -1) {
            str = str3.substring(0, iIndexOf2).toUpperCase(Locale.ENGLISH);
            str3 = str3.substring(iIndexOf2 + 1);
        } else if (str == null) {
            str = "";
        }
        this.f65234g = str;
        this.f65233f = str2;
        this.f65235h = str3;
        this.f65236i = str4;
        this.f65237j = mailLogger.getLogger(getClass(), "DEBUG NTLM");
        byte[] bArr = new byte[256];
        this.f65228a = bArr;
        this.f65229b = new byte[256];
        System.arraycopy(new byte[]{78, 84, 76, 77, 83, 83, Constants.CVR_B1b85_0101_MOBILE_APP, 0, 1}, 0, bArr, 0, 9);
        byte[] bArr2 = this.f65228a;
        bArr2[12] = 3;
        bArr2[13] = UtilitiesSDKConstants.SRP_LABEL_MAC;
        bArr2[28] = 32;
        System.arraycopy(new byte[]{78, 84, 76, 77, 83, 83, Constants.CVR_B1b85_0101_MOBILE_APP, 0, 3}, 0, this.f65229b, 0, 9);
        byte[] bArr3 = this.f65229b;
        bArr3[12] = 24;
        bArr3[14] = 24;
        bArr3[20] = 24;
        bArr3[22] = 24;
        bArr3[32] = 64;
        bArr3[60] = 1;
        bArr3[61] = -126;
        try {
            this.f65230c = SecretKeyFactory.getInstance("DES");
            this.f65231d = Cipher.getInstance("DES/ECB/NoPadding");
            this.f65232e = new MD4();
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
    }

    public static void c(int i10, String str, String str2, byte[] bArr) {
        try {
            byte[] bytes = str.getBytes(str2);
            System.arraycopy(bytes, 0, bArr, i10, bytes.length);
        } catch (UnsupportedEncodingException unused) {
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 1201. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static byte[] d(int r11, byte[] r12) {
        /*
            int r0 = r12.length
            int[] r1 = new int[r0]
            r2 = 0
            r3 = r2
        L5:
            if (r3 >= r0) goto L12
            r4 = r12[r3]
            if (r4 >= 0) goto Ld
            int r4 = r4 + 256
        Ld:
            r1[r3] = r4
            int r3 = r3 + 1
            goto L5
        L12:
            r12 = 8
            byte[] r12 = new byte[r12]
            r0 = r1[r11]
            byte r3 = (byte) r0
            r12[r2] = r3
            r2 = 7
            int r0 = r0 << r2
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r11 + 1
            r3 = r1[r3]
            int r4 = r3 >> 1
            r0 = r0 | r4
            byte r0 = (byte) r0
            r4 = 1
            r12[r4] = r0
            r0 = 6
            int r3 = r3 << r0
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r5 = r11 + 2
            r5 = r1[r5]
            int r6 = r5 >> 2
            r3 = r3 | r6
            byte r3 = (byte) r3
            r6 = 2
            r12[r6] = r3
            r3 = 5
            int r5 = r5 << r3
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r7 = r11 + 3
            r7 = r1[r7]
            int r8 = r7 >> 3
            r5 = r5 | r8
            byte r5 = (byte) r5
            r8 = 3
            r12[r8] = r5
            r5 = 4
            int r7 = r7 << r5
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r9 = r11 + 4
            r9 = r1[r9]
            int r10 = r9 >> 4
            r7 = r7 | r10
            byte r7 = (byte) r7
            r12[r5] = r7
            int r5 = r9 << 3
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r7 = r11 + 5
            r7 = r1[r7]
            int r8 = r7 >> 5
            r5 = r5 | r8
            byte r5 = (byte) r5
            r12[r3] = r5
            int r3 = r7 << 2
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r11 = r11 + r0
            r11 = r1[r11]
            int r1 = r11 >> 6
            r1 = r1 | r3
            byte r1 = (byte) r1
            r12[r0] = r1
            int r11 = r11 << r4
            r11 = r11 & 255(0xff, float:3.57E-43)
            byte r11 = (byte) r11
            r12[r2] = r11
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.auth.Ntlm.d(int, byte[]):byte[]");
    }

    public static String e(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 3);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            char[] cArr = f65227k;
            sb2.append(cArr[(bArr[i10] >> 4) & 15]);
            sb2.append(cArr[bArr[i10] & 15]);
            sb2.append(' ');
        }
        return sb2.toString();
    }

    public final byte[] a() throws GeneralSecurityException {
        byte[] bytes;
        String str = this.f65236i;
        byte[] bArr = {75, 71, 83, 33, 64, 35, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 37};
        try {
            bytes = str.toUpperCase(Locale.ENGLISH).getBytes("iso-8859-1");
        } catch (UnsupportedEncodingException unused) {
            bytes = null;
        }
        byte[] bArr2 = new byte[14];
        int length = str.length();
        System.arraycopy(bytes, 0, bArr2, 0, length <= 14 ? length : 14);
        DESKeySpec dESKeySpec = new DESKeySpec(d(0, bArr2));
        DESKeySpec dESKeySpec2 = new DESKeySpec(d(7, bArr2));
        SecretKey secretKeyGenerateSecret = this.f65230c.generateSecret(dESKeySpec);
        SecretKey secretKeyGenerateSecret2 = this.f65230c.generateSecret(dESKeySpec2);
        this.f65231d.init(1, secretKeyGenerateSecret);
        byte[] bArrDoFinal = this.f65231d.doFinal(bArr, 0, 8);
        this.f65231d.init(1, secretKeyGenerateSecret2);
        byte[] bArrDoFinal2 = this.f65231d.doFinal(bArr, 0, 8);
        byte[] bArr3 = new byte[21];
        System.arraycopy(bArrDoFinal, 0, bArr3, 0, 8);
        System.arraycopy(bArrDoFinal2, 0, bArr3, 8, 8);
        return bArr3;
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        DESKeySpec dESKeySpec = new DESKeySpec(d(0, bArr));
        DESKeySpec dESKeySpec2 = new DESKeySpec(d(7, bArr));
        DESKeySpec dESKeySpec3 = new DESKeySpec(d(14, bArr));
        SecretKey secretKeyGenerateSecret = this.f65230c.generateSecret(dESKeySpec);
        SecretKey secretKeyGenerateSecret2 = this.f65230c.generateSecret(dESKeySpec2);
        SecretKey secretKeyGenerateSecret3 = this.f65230c.generateSecret(dESKeySpec3);
        this.f65231d.init(1, secretKeyGenerateSecret);
        byte[] bArrDoFinal = this.f65231d.doFinal(bArr2, 0, 8);
        this.f65231d.init(1, secretKeyGenerateSecret2);
        byte[] bArrDoFinal2 = this.f65231d.doFinal(bArr2, 0, 8);
        this.f65231d.init(1, secretKeyGenerateSecret3);
        byte[] bArrDoFinal3 = this.f65231d.doFinal(bArr2, 0, 8);
        byte[] bArr3 = new byte[24];
        System.arraycopy(bArrDoFinal, 0, bArr3, 0, 8);
        System.arraycopy(bArrDoFinal2, 0, bArr3, 8, 8);
        System.arraycopy(bArrDoFinal3, 0, bArr3, 16, 8);
        return bArr3;
    }

    public String generateType1Msg(int i10) {
        String str = this.f65234g;
        int length = str.length();
        byte[] bArr = this.f65228a;
        byte b10 = (byte) (length % 256);
        bArr[16] = b10;
        byte b11 = (byte) (length / 256);
        bArr[17] = b11;
        bArr[18] = b10;
        bArr[19] = b11;
        if (length == 0) {
            bArr[13] = (byte) (bArr[13] & ByteSourceJsonBootstrapper.UTF8_BOM_1);
        }
        String str2 = this.f65233f;
        int length2 = str2.length();
        byte[] bArr2 = this.f65228a;
        byte b12 = (byte) (length2 % 256);
        bArr2[24] = b12;
        byte b13 = (byte) (length2 / 256);
        bArr2[25] = b13;
        bArr2[26] = b12;
        bArr2[27] = b13;
        c(32, str2, "iso-8859-1", bArr2);
        int i11 = length2 + 32;
        c(i11, str, "iso-8859-1", this.f65228a);
        byte[] bArr3 = this.f65228a;
        bArr3[20] = (byte) (i11 % 256);
        bArr3[21] = (byte) (i11 / 256);
        int i12 = i11 + length;
        byte[] bArr4 = new byte[i12];
        System.arraycopy(bArr3, 0, bArr4, 0, i12);
        Level level = Level.FINE;
        MailLogger mailLogger = this.f65237j;
        if (mailLogger.isLoggable(level)) {
            mailLogger.fine("type 1 message: " + e(bArr4));
        }
        try {
            return new String(BASE64EncoderStream.encode(bArr4), "iso-8859-1");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public String generateType3Msg(String str) {
        byte[] bArrDecode;
        byte[] bytes;
        String str2 = this.f65233f;
        String str3 = this.f65234g;
        String str4 = this.f65235h;
        MailLogger mailLogger = this.f65237j;
        try {
            try {
                bArrDecode = BASE64DecoderStream.decode(str.getBytes("us-ascii"));
            } catch (GeneralSecurityException e5) {
                mailLogger.log(Level.FINE, "GeneralSecurityException", (Throwable) e5);
                return "";
            }
        } catch (UnsupportedEncodingException unused) {
            bArrDecode = null;
        }
        byte[] bArr = new byte[8];
        System.arraycopy(bArrDecode, 24, bArr, 0, 8);
        int length = str4.length() * 2;
        byte[] bArr2 = this.f65229b;
        byte b10 = (byte) (length % 256);
        bArr2[38] = b10;
        bArr2[36] = b10;
        byte b11 = (byte) (length / 256);
        bArr2[39] = b11;
        bArr2[37] = b11;
        int length2 = str3.length() * 2;
        byte[] bArr3 = this.f65229b;
        byte b12 = (byte) (length2 % 256);
        bArr3[30] = b12;
        bArr3[28] = b12;
        byte b13 = (byte) (length2 / 256);
        bArr3[31] = b13;
        bArr3[29] = b13;
        int length3 = str2.length() * 2;
        byte[] bArr4 = this.f65229b;
        byte b14 = (byte) (length3 % 256);
        bArr4[46] = b14;
        bArr4[44] = b14;
        byte b15 = (byte) (length3 / 256);
        bArr4[47] = b15;
        bArr4[45] = b15;
        c(64, str3, "UnicodeLittleUnmarked", bArr4);
        byte[] bArr5 = this.f65229b;
        bArr5[32] = (byte) 64;
        bArr5[33] = (byte) 0;
        int i10 = length2 + 64;
        c(i10, str4, "UnicodeLittleUnmarked", bArr5);
        byte[] bArr6 = this.f65229b;
        bArr6[40] = (byte) (i10 % 256);
        bArr6[41] = (byte) (i10 / 256);
        int i11 = i10 + length;
        c(i11, str2, "UnicodeLittleUnmarked", bArr6);
        byte[] bArr7 = this.f65229b;
        bArr7[48] = (byte) (i11 % 256);
        bArr7[49] = (byte) (i11 / 256);
        int i12 = i11 + length3;
        byte[] bArrB = b(a(), bArr);
        try {
            bytes = this.f65236i.getBytes("UnicodeLittleUnmarked");
        } catch (UnsupportedEncodingException unused2) {
            bytes = null;
        }
        byte[] bArr8 = new byte[21];
        System.arraycopy(this.f65232e.digest(bytes), 0, bArr8, 0, 16);
        byte[] bArrB2 = b(bArr8, bArr);
        System.arraycopy(bArrB, 0, this.f65229b, i12, 24);
        byte[] bArr9 = this.f65229b;
        bArr9[16] = (byte) (i12 % 256);
        bArr9[17] = (byte) (i12 / 256);
        int i13 = i12 + 24;
        System.arraycopy(bArrB2, 0, bArr9, i13, 24);
        byte[] bArr10 = this.f65229b;
        bArr10[24] = (byte) (i13 % 256);
        bArr10[25] = (byte) (i13 / 256);
        int i14 = i12 + 48;
        bArr10[56] = (byte) (i14 % 256);
        bArr10[57] = (byte) (i14 / 256);
        byte[] bArr11 = new byte[i14];
        System.arraycopy(bArr10, 0, bArr11, 0, i14);
        if (mailLogger.isLoggable(Level.FINE)) {
            mailLogger.fine("type 3 message: " + e(bArr11));
        }
        try {
            return new String(BASE64EncoderStream.encode(bArr11), "iso-8859-1");
        } catch (UnsupportedEncodingException unused3) {
            return null;
        }
    }
}
