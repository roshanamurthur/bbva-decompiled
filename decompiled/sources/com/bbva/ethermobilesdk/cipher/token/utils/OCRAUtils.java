package com.bbva.ethermobilesdk.cipher.token.utils;

import androidx.appcompat.widget.c;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.bbva.ethermobile.help.kit.result.ResultKt;
import com.bbva.ethermobilesdk.cipher.factory.HashFactoryKt;
import com.bbva.ethermobilesdk.cipher.model.HmacAlgorithm;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.ethermobilesdk.cipher.utils.HexadecimalCharacters;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes5.dex */
public class OCRAUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f29387a = {1, 10, 100, 1000, 10000, AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength, DurationKt.NANOS_IN_MILLIS, 10000000, 100000000};

    public OCRAUtils() {
        throw new IllegalArgumentException("Cannot be constructed");
    }

    public static String generateOCRA(String str, String str2, String str3, String str4, String str5, String str6, String str7) throws NoSuchAlgorithmException, InvalidKeyException {
        String string;
        int i10;
        String string2;
        int i11;
        String string3;
        int i12;
        String string4;
        int i13;
        int i14;
        String string5;
        int i15;
        int length = str.getBytes().length;
        String[] strArrSplit = str.split(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
        String str8 = strArrSplit[1];
        String str9 = strArrSplit[2];
        int iIntValue = Integer.decode(str8.substring(str8.lastIndexOf(45) + 1)).intValue();
        if (str9.toLowerCase().startsWith("c")) {
            StringBuilder sb2 = new StringBuilder(str3);
            while (sb2.length() < 16) {
                sb2.insert(0, "0");
            }
            string = sb2.toString();
            i10 = 8;
        } else {
            string = str3;
            i10 = 0;
        }
        if (str9.toLowerCase().startsWith("q") || str9.toLowerCase().contains("-q")) {
            StringBuilder sb3 = new StringBuilder(str4);
            while (sb3.length() < 256) {
                sb3.append("0");
            }
            string2 = sb3.toString();
            i11 = 128;
        } else {
            string2 = str4;
            i11 = 0;
        }
        if (str9.toLowerCase().indexOf("psha1", 1) > -1) {
            StringBuilder sb4 = new StringBuilder(str5);
            while (sb4.length() < 40) {
                sb4.insert(0, "0");
            }
            string3 = sb4.toString();
            i12 = 20;
        } else {
            string3 = str5;
            i12 = 0;
        }
        if (str9.toLowerCase().indexOf("psha256", 1) > -1) {
            StringBuilder sb5 = new StringBuilder(string3);
            while (sb5.length() < 64) {
                sb5.insert(0, "0");
            }
            string3 = sb5.toString();
            i12 = 32;
        }
        if (str9.toLowerCase().indexOf("psha512", 1) > -1) {
            StringBuilder sb6 = new StringBuilder(string3);
            while (sb6.length() < 128) {
                sb6.insert(0, "0");
            }
            string3 = sb6.toString();
            i12 = 64;
        }
        if (str9.toLowerCase().indexOf("s064", 1) > -1) {
            StringBuilder sb7 = new StringBuilder(str6);
            while (sb7.length() < 128) {
                sb7.insert(0, "0");
            }
            string4 = sb7.toString();
            i13 = 64;
        } else {
            string4 = str6;
            i13 = 0;
        }
        if (str9.toLowerCase().indexOf("s128", 1) > -1) {
            StringBuilder sb8 = new StringBuilder(string4);
            while (sb8.length() < 256) {
                sb8.insert(0, "0");
            }
            string4 = sb8.toString();
            i13 = 128;
        }
        if (str9.toLowerCase().indexOf("s256", 1) > -1) {
            StringBuilder sb9 = new StringBuilder(string4);
            while (sb9.length() < 512) {
                sb9.insert(0, "0");
            }
            string4 = sb9.toString();
            i13 = 256;
        }
        if (str9.toLowerCase().indexOf("s512", 1) > -1) {
            StringBuilder sb10 = new StringBuilder(string4);
            while (sb10.length() < 1024) {
                sb10.insert(0, "0");
            }
            string4 = sb10.toString();
            i14 = 512;
        } else {
            i14 = i13;
        }
        if (str9.toLowerCase().startsWith("t") || str9.toLowerCase().indexOf("-t", 1) > -1) {
            StringBuilder sb11 = new StringBuilder(str7);
            while (sb11.length() < 16) {
                sb11.insert(0, "0");
            }
            string5 = sb11.toString();
            i15 = 8;
        } else {
            string5 = str7;
            i15 = 0;
        }
        byte[] bArr = new byte[length + i10 + i11 + i12 + i14 + i15 + 1];
        byte[] bytes = str.getBytes();
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        bArr[bytes.length] = 0;
        if (i10 > 0) {
            byte[] bArrHexStringToByteArray = EncodingUtilsKt.hexStringToByteArray(string, HexadecimalCharacters.LOWERCASE);
            System.arraycopy(bArrHexStringToByteArray, 0, bArr, length + 1, bArrHexStringToByteArray.length);
        }
        if (i11 > 0) {
            byte[] bArrHexStringToByteArray2 = EncodingUtilsKt.hexStringToByteArray(string2, HexadecimalCharacters.LOWERCASE);
            System.arraycopy(bArrHexStringToByteArray2, 0, bArr, length + 1 + i10, bArrHexStringToByteArray2.length);
        }
        if (i12 > 0) {
            byte[] bArrHexStringToByteArray3 = EncodingUtilsKt.hexStringToByteArray(string3, HexadecimalCharacters.LOWERCASE);
            System.arraycopy(bArrHexStringToByteArray3, 0, bArr, c.a(length, 1, i10, i11), bArrHexStringToByteArray3.length);
        }
        if (i14 > 0) {
            byte[] bArrHexStringToByteArray4 = EncodingUtilsKt.hexStringToByteArray(string4, HexadecimalCharacters.LOWERCASE);
            System.arraycopy(bArrHexStringToByteArray4, 0, bArr, length + 1 + i10 + i11 + i12, bArrHexStringToByteArray4.length);
        }
        if (i15 > 0) {
            byte[] bArrHexStringToByteArray5 = EncodingUtilsKt.hexStringToByteArray(string5, HexadecimalCharacters.LOWERCASE);
            System.arraycopy(bArrHexStringToByteArray5, 0, bArr, length + 1 + i10 + i11 + i12 + i14, bArrHexStringToByteArray5.length);
        }
        byte[] bArr2 = (byte[]) ResultKt.getOrThrow(HashFactoryKt.hmacOf(HmacAlgorithm.SHA256, EncodingUtilsKt.hexStringToByteArray(str2, HexadecimalCharacters.LOWERCASE), bArr));
        int i16 = bArr2[bArr2.length - 1] & 15;
        StringBuilder sb12 = new StringBuilder(Integer.toString(((bArr2[i16 + 3] & 255) | ((((bArr2[i16] & 127) << 24) | ((bArr2[i16 + 1] & 255) << 16)) | ((bArr2[i16 + 2] & 255) << 8))) % f29387a[iIntValue]));
        while (sb12.length() < iIntValue) {
            sb12.insert(0, "0");
        }
        return sb12.toString();
    }
}
