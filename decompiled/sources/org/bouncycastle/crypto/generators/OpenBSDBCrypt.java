package org.bouncycastle.crypto.generators;

import androidx.appcompat.widget.a;
import androidx.appcompat.widget.g0;
import androidx.camera.camera2.internal.h0;
import androidx.camera.core.impl.utils.b;
import androidx.camera.core.processing.f;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import kotlin.text.Typography;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes4.dex */
public class OpenBSDBCrypt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f88775a = {46, 47, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, Constants.CVR_B1b85_0101_MOBILE_APP, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, Constants.DIRECTORY_ENTRY, 98, 99, 100, 101, 102, 103, 104, 105, GenerateAcResponseApdu.DDA_HEADER, 107, 108, 109, 110, Constants.FCI_TEMPLATE, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 113, 114, 115, 116, 117, 118, Constants.RESP_MSG_TEMPLATE_FORMAT_2, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f88776b = new byte[128];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f88777c;

    static {
        HashSet hashSet = new HashSet();
        f88777c = hashSet;
        hashSet.add("2a");
        hashSet.add("2y");
        hashSet.add("2b");
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr = f88776b;
            if (i11 >= 128) {
                break;
            }
            bArr[i11] = -1;
            i11++;
        }
        while (true) {
            byte[] bArr2 = f88775a;
            if (i10 >= 64) {
                return;
            }
            f88776b[bArr2[i10]] = (byte) i10;
            i10++;
        }
    }

    public static boolean a(String str, byte[] bArr) {
        if (str == null) {
            throw new IllegalArgumentException("Missing bcryptString.");
        }
        int length = str.length();
        if (length != 60) {
            throw new DataLengthException(b.a("Bcrypt String length: ", length, ", 60 required."));
        }
        if (str.charAt(0) != '$' || str.charAt(3) != '$' || str.charAt(6) != '$') {
            throw new IllegalArgumentException("Invalid Bcrypt String format.");
        }
        String strSubstring = str.substring(1, 3);
        if (!f88777c.contains(strSubstring)) {
            throw new IllegalArgumentException(h0.b("Bcrypt version '", strSubstring, "' is not supported by this implementation"));
        }
        String strSubstring2 = str.substring(4, 6);
        try {
            int i10 = Integer.parseInt(strSubstring2);
            if (i10 < 4 || i10 > 31) {
                throw new IllegalArgumentException(b.a("Invalid cost factor: ", i10, ", 4 < cost < 31 expected."));
            }
            char[] charArray = str.substring(str.lastIndexOf(36) + 1, length - 31).toCharArray();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16);
            if (charArray.length != 22) {
                throw new DataLengthException(a.c(new StringBuilder("Invalid base64 salt length: "), charArray.length, " , 22 required."));
            }
            for (char c10 : charArray) {
                if (c10 > 'z' || c10 < '.' || (c10 > '9' && c10 < 'A')) {
                    throw new IllegalArgumentException(g0.c("Salt string contains invalid character: ", c10));
                }
            }
            char[] cArr = new char[24];
            System.arraycopy(charArray, 0, cArr, 0, charArray.length);
            for (int i11 = 0; i11 < 24; i11 += 4) {
                byte[] bArr2 = f88776b;
                byte b10 = bArr2[cArr[i11]];
                byte b11 = bArr2[cArr[i11 + 1]];
                byte b12 = bArr2[cArr[i11 + 2]];
                byte b13 = bArr2[cArr[i11 + 3]];
                byteArrayOutputStream.write((b10 << 2) | (b11 >> 4));
                byteArrayOutputStream.write((b11 << 4) | (b12 >> 2));
                byteArrayOutputStream.write(b13 | (b12 << 6));
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byte[] bArr3 = new byte[16];
            System.arraycopy(byteArray, 0, bArr3, 0, 16);
            String strB = b(strSubstring, bArr, bArr3, i10);
            boolean z10 = length == strB.length();
            for (int i12 = 0; i12 != length; i12++) {
                z10 &= str.indexOf(i12) == strB.indexOf(i12);
            }
            return z10;
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(f.d("Invalid cost factor: ", strSubstring2));
        }
    }

    public static String b(String str, byte[] bArr, byte[] bArr2, int i10) {
        HashSet hashSet = f88777c;
        if (!hashSet.contains(str)) {
            throw new IllegalArgumentException(h0.b("Version ", str, " is not accepted by this implementation."));
        }
        if (bArr2 == null) {
            throw new IllegalArgumentException("Salt required.");
        }
        if (bArr2.length != 16) {
            throw new DataLengthException("16 byte salt required: " + bArr2.length);
        }
        if (i10 < 4 || i10 > 31) {
            throw new IllegalArgumentException("Invalid cost factor.");
        }
        int length = bArr.length < 72 ? bArr.length + 1 : 72;
        byte[] bArr3 = new byte[length];
        if (length > bArr.length) {
            length = bArr.length;
        }
        System.arraycopy(bArr, 0, bArr3, 0, length);
        Arrays.fill(bArr, (byte) 0);
        if (!hashSet.contains(str)) {
            throw new IllegalArgumentException(h0.b("Version ", str, " is not accepted by this implementation."));
        }
        StringBuilder sb2 = new StringBuilder(60);
        sb2.append(Typography.dollar);
        sb2.append(str);
        sb2.append(Typography.dollar);
        sb2.append(i10 < 10 ? g0.c("0", i10) : Integer.toString(i10));
        sb2.append(Typography.dollar);
        c(sb2, bArr2);
        c(sb2, BCrypt.generate(bArr3, bArr2, i10));
        String string = sb2.toString();
        Arrays.fill(bArr3, (byte) 0);
        return string;
    }

    public static void c(StringBuilder sb2, byte[] bArr) {
        boolean z10;
        if (bArr.length != 24 && bArr.length != 16) {
            throw new DataLengthException(a.c(new StringBuilder("Invalid length: "), bArr.length, ", 24 for key or 16 for salt expected"));
        }
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[18];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            bArr = bArr2;
            z10 = true;
        } else {
            bArr[bArr.length - 1] = 0;
            z10 = false;
        }
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int i11 = bArr[i10] & 255;
            int i12 = bArr[i10 + 1] & 255;
            byte b10 = bArr[i10 + 2];
            byte[] bArr3 = f88775a;
            sb2.append((char) bArr3[(i11 >>> 2) & 63]);
            sb2.append((char) bArr3[((i11 << 4) | (i12 >>> 4)) & 63]);
            sb2.append((char) bArr3[((i12 << 2) | ((b10 & 255) >>> 6)) & 63]);
            sb2.append((char) bArr3[b10 & 63]);
        }
        int length2 = sb2.length();
        sb2.setLength(z10 ? length2 - 2 : length2 - 1);
    }

    public static boolean checkPassword(String str, byte[] bArr) {
        if (bArr != null) {
            return a(str, Arrays.clone(bArr));
        }
        throw new IllegalArgumentException("Missing password.");
    }

    public static String generate(String str, byte[] bArr, byte[] bArr2, int i10) {
        if (bArr != null) {
            return b(str, Arrays.clone(bArr), bArr2, i10);
        }
        throw new IllegalArgumentException("Password required.");
    }

    public static boolean checkPassword(String str, char[] cArr) {
        if (cArr != null) {
            return a(str, Strings.toUTF8ByteArray(cArr));
        }
        throw new IllegalArgumentException("Missing password.");
    }

    public static String generate(String str, char[] cArr, byte[] bArr, int i10) {
        if (cArr != null) {
            return b(str, Strings.toUTF8ByteArray(cArr), bArr, i10);
        }
        throw new IllegalArgumentException("Password required.");
    }

    public static String generate(byte[] bArr, byte[] bArr2, int i10) {
        return generate("2y", bArr, bArr2, i10);
    }

    public static String generate(char[] cArr, byte[] bArr, int i10) {
        return generate("2y", cArr, bArr, i10);
    }
}
