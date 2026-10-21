package a3;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.g0;
import androidx.profileinstaller.ProfileVersion;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import mx.openpay.library.data.util.CommandConstants;

/* JADX INFO: compiled from: ProfileTranscoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f193a = {Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 114, Constants.FCI_TEMPLATE, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f194b = {Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 114, 109, 0};

    @NonNull
    public static byte[] a(@NonNull c[] cVarArr, @NonNull byte[] bArr) throws IOException {
        int i10 = 0;
        int length = 0;
        for (c cVar : cVarArr) {
            length += ((((cVar.f184g * 2) + 7) & (-8)) / 8) + (cVar.f182e * 2) + b(cVar.f178a, cVar.f179b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + cVar.f183f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, ProfileVersion.f22524c)) {
            int length2 = cVarArr.length;
            while (i10 < length2) {
                c cVar2 = cVarArr[i10];
                m(byteArrayOutputStream, cVar2, b(cVar2.f178a, cVar2.f179b, bArr));
                l(byteArrayOutputStream, cVar2);
                i10++;
            }
        } else {
            for (c cVar3 : cVarArr) {
                m(byteArrayOutputStream, cVar3, b(cVar3.f178a, cVar3.f179b, bArr));
            }
            int length3 = cVarArr.length;
            while (i10 < length3) {
                l(byteArrayOutputStream, cVarArr[i10]);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    @NonNull
    public static String b(@NonNull String str, @NonNull String str2, @NonNull byte[] bArr) {
        byte[] bArr2 = ProfileVersion.f22526e;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = ProfileVersion.f22525d;
        String str3 = CommandConstants.Z11_EXCLAMATION_MARK;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER : CommandConstants.Z11_EXCLAMATION_MARK;
        if (str.length() <= 0) {
            if (CommandConstants.Z11_EXCLAMATION_MARK.equals(obj)) {
                return str2.replace(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER, CommandConstants.Z11_EXCLAMATION_MARK);
            }
            return DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER.equals(obj) ? str2.replace(CommandConstants.Z11_EXCLAMATION_MARK, DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER) : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains(CommandConstants.Z11_EXCLAMATION_MARK) || str2.contains(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER)) {
            if (CommandConstants.Z11_EXCLAMATION_MARK.equals(obj)) {
                return str2.replace(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER, CommandConstants.Z11_EXCLAMATION_MARK);
            }
            return DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER.equals(obj) ? str2.replace(CommandConstants.Z11_EXCLAMATION_MARK, DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER) : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        StringBuilder sbD = androidx.camera.core.impl.utils.c.d(str);
        if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
            str3 = DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER;
        }
        return ad.d.f(sbD, str3, str2);
    }

    public static int c(int i10, int i11, int i12) {
        if (i10 == 1) {
            throw new IllegalStateException("HOT methods are not stored in the bitmap");
        }
        if (i10 == 2) {
            return i11;
        }
        if (i10 == 4) {
            return i11 + i12;
        }
        throw new IllegalStateException(g0.c("Unexpected flag: ", i10));
    }

    public static int[] d(int i10, @NonNull ByteArrayInputStream byteArrayInputStream) throws IOException {
        int[] iArr = new int[i10];
        int iD = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iD += (int) d.d(2, byteArrayInputStream);
            iArr[i11] = iD;
        }
        return iArr;
    }

    @NonNull
    public static c[] e(@NonNull FileInputStream fileInputStream, @NonNull byte[] bArr, @NonNull byte[] bArr2, c[] cVarArr) throws IOException {
        byte[] bArr3 = ProfileVersion.f22527f;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, ProfileVersion.f22528g)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iD = (int) d.d(2, fileInputStream);
            byte[] bArrC = d.c(fileInputStream, (int) d.d(4, fileInputStream), (int) d.d(4, fileInputStream));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrC);
            try {
                c[] cVarArrG = g(byteArrayInputStream, bArr2, iD, cVarArr);
                byteArrayInputStream.close();
                return cVarArrG;
            } catch (Throwable th2) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (Arrays.equals(ProfileVersion.f22522a, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iD2 = (int) d.d(1, fileInputStream);
        byte[] bArrC2 = d.c(fileInputStream, (int) d.d(4, fileInputStream), (int) d.d(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrC2);
        try {
            c[] cVarArrF = f(byteArrayInputStream2, iD2, cVarArr);
            byteArrayInputStream2.close();
            return cVarArrF;
        } catch (Throwable th4) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    @NonNull
    public static c[] f(@NonNull ByteArrayInputStream byteArrayInputStream, int i10, c[] cVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i10 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i10];
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iD = (int) d.d(2, byteArrayInputStream);
            iArr[i11] = (int) d.d(2, byteArrayInputStream);
            strArr[i11] = new String(d.b(iD, byteArrayInputStream), StandardCharsets.UTF_8);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            c cVar = cVarArr[i12];
            if (!cVar.f179b.equals(strArr[i12])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i13 = iArr[i12];
            cVar.f182e = i13;
            cVar.f185h = d(i13, byteArrayInputStream);
        }
        return cVarArr;
    }

    @NonNull
    public static c[] g(@NonNull ByteArrayInputStream byteArrayInputStream, @NonNull byte[] bArr, int i10, c[] cVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i10 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            d.d(2, byteArrayInputStream);
            String str = new String(d.b((int) d.d(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
            long jD = d.d(4, byteArrayInputStream);
            int iD = (int) d.d(2, byteArrayInputStream);
            c cVar = null;
            if (cVarArr.length > 0) {
                int iIndexOf = str.indexOf(CommandConstants.Z11_EXCLAMATION_MARK);
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i12 = 0; i12 < cVarArr.length; i12++) {
                    if (cVarArr[i12].f179b.equals(strSubstring)) {
                        cVar = cVarArr[i12];
                        break;
                    }
                }
            }
            if (cVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            cVar.f181d = jD;
            int[] iArrD = d(iD, byteArrayInputStream);
            if (Arrays.equals(bArr, ProfileVersion.f22526e)) {
                cVar.f182e = iD;
                cVar.f185h = iArrD;
            }
        }
        return cVarArr;
    }

    @NonNull
    public static c[] h(@NonNull FileInputStream fileInputStream, @NonNull byte[] bArr, @NonNull String str) throws IOException {
        if (!Arrays.equals(bArr, ProfileVersion.f22523b)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iD = (int) d.d(1, fileInputStream);
        byte[] bArrC = d.c(fileInputStream, (int) d.d(4, fileInputStream), (int) d.d(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrC);
        try {
            c[] cVarArrI = i(byteArrayInputStream, str, iD);
            byteArrayInputStream.close();
            return cVarArrI;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @NonNull
    public static c[] i(@NonNull ByteArrayInputStream byteArrayInputStream, @NonNull String str, int i10) throws IOException {
        TreeMap<Integer, Integer> treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iD = (int) d.d(2, byteArrayInputStream);
            int iD2 = (int) d.d(2, byteArrayInputStream);
            cVarArr[i11] = new c(str, new String(d.b(iD, byteArrayInputStream), StandardCharsets.UTF_8), d.d(4, byteArrayInputStream), iD2, (int) d.d(4, byteArrayInputStream), (int) d.d(4, byteArrayInputStream), new int[iD2], new TreeMap());
        }
        for (int i12 = 0; i12 < i10; i12++) {
            c cVar = cVarArr[i12];
            int iAvailable = byteArrayInputStream.available() - cVar.f183f;
            int iD3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = cVar.f186i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iD3 += (int) d.d(2, byteArrayInputStream);
                treeMap.put(Integer.valueOf(iD3), 1);
                for (int iD4 = (int) d.d(2, byteArrayInputStream); iD4 > 0; iD4--) {
                    d.d(2, byteArrayInputStream);
                    int iD5 = (int) d.d(1, byteArrayInputStream);
                    if (iD5 != 6 && iD5 != 7) {
                        while (iD5 > 0) {
                            d.d(1, byteArrayInputStream);
                            for (int iD6 = (int) d.d(1, byteArrayInputStream); iD6 > 0; iD6--) {
                                d.d(2, byteArrayInputStream);
                            }
                            iD5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            cVar.f185h = d(cVar.f182e, byteArrayInputStream);
            int i13 = cVar.f184g;
            BitSet bitSetValueOf = BitSet.valueOf(d.b((((i13 * 2) + 7) & (-8)) / 8, byteArrayInputStream));
            for (int i14 = 0; i14 < i13; i14++) {
                int i15 = bitSetValueOf.get(c(2, i14, i13)) ? 2 : 0;
                if (bitSetValueOf.get(c(4, i14, i13))) {
                    i15 |= 4;
                }
                if (i15 != 0) {
                    Integer num = treeMap.get(Integer.valueOf(i14));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i14), Integer.valueOf(i15 | num.intValue()));
                }
            }
        }
        return cVarArr;
    }

    public static boolean j(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull byte[] bArr, @NonNull c[] cVarArr) throws IOException {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = ProfileVersion.f22522a;
        int i10 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = ProfileVersion.f22523b;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrA = a(cVarArr, bArr3);
                d.e(byteArrayOutputStream, cVarArr.length, 1);
                d.e(byteArrayOutputStream, bArrA.length, 4);
                byte[] bArrA2 = d.a(bArrA);
                d.e(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr4 = ProfileVersion.f22525d;
            if (Arrays.equals(bArr, bArr4)) {
                d.e(byteArrayOutputStream, cVarArr.length, 1);
                for (c cVar : cVarArr) {
                    int size = cVar.f186i.size() * 4;
                    String strB = b(cVar.f178a, cVar.f179b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    d.f(byteArrayOutputStream, strB.getBytes(charset).length);
                    d.f(byteArrayOutputStream, cVar.f185h.length);
                    d.e(byteArrayOutputStream, size, 4);
                    d.e(byteArrayOutputStream, cVar.f180c, 4);
                    byteArrayOutputStream.write(strB.getBytes(charset));
                    Iterator<Integer> it = cVar.f186i.keySet().iterator();
                    while (it.hasNext()) {
                        d.f(byteArrayOutputStream, it.next().intValue());
                        d.f(byteArrayOutputStream, 0);
                    }
                    for (int i11 : cVar.f185h) {
                        d.f(byteArrayOutputStream, i11);
                    }
                }
                return true;
            }
            byte[] bArr5 = ProfileVersion.f22524c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrA3 = a(cVarArr, bArr5);
                d.e(byteArrayOutputStream, cVarArr.length, 1);
                d.e(byteArrayOutputStream, bArrA3.length, 4);
                byte[] bArrA4 = d.a(bArrA3);
                d.e(byteArrayOutputStream, bArrA4.length, 4);
                byteArrayOutputStream.write(bArrA4);
                return true;
            }
            byte[] bArr6 = ProfileVersion.f22526e;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            d.f(byteArrayOutputStream, cVarArr.length);
            for (c cVar2 : cVarArr) {
                String strB2 = b(cVar2.f178a, cVar2.f179b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                d.f(byteArrayOutputStream, strB2.getBytes(charset2).length);
                TreeMap<Integer, Integer> treeMap = cVar2.f186i;
                d.f(byteArrayOutputStream, treeMap.size());
                d.f(byteArrayOutputStream, cVar2.f185h.length);
                d.e(byteArrayOutputStream, cVar2.f180c, 4);
                byteArrayOutputStream.write(strB2.getBytes(charset2));
                Iterator<Integer> it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    d.f(byteArrayOutputStream, it2.next().intValue());
                }
                for (int i12 : cVar2.f185h) {
                    d.f(byteArrayOutputStream, i12);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            d.f(byteArrayOutputStream2, cVarArr.length);
            int i13 = 2;
            int i14 = 2;
            for (c cVar3 : cVarArr) {
                d.e(byteArrayOutputStream2, cVar3.f180c, 4);
                d.e(byteArrayOutputStream2, cVar3.f181d, 4);
                d.e(byteArrayOutputStream2, cVar3.f184g, 4);
                String strB3 = b(cVar3.f178a, cVar3.f179b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strB3.getBytes(charset3).length;
                d.f(byteArrayOutputStream2, length2);
                i14 = i14 + 14 + length2;
                byteArrayOutputStream2.write(strB3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i14 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray.length);
            }
            j jVar = new j(e.DEX_FILES, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(jVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i15 = 0;
            for (int i16 = 0; i16 < cVarArr.length; i16++) {
                try {
                    c cVar4 = cVarArr[i16];
                    d.f(byteArrayOutputStream3, i16);
                    d.f(byteArrayOutputStream3, cVar4.f182e);
                    i15 = i15 + 4 + (cVar4.f182e * 2);
                    k(byteArrayOutputStream3, cVar4);
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i15 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i15 + ", does not match actual size " + byteArray2.length);
            }
            j jVar2 = new j(e.CLASSES, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(jVar2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i17 = 0;
            int i18 = 0;
            while (i17 < cVarArr.length) {
                try {
                    c cVar5 = cVarArr[i17];
                    Iterator<Map.Entry<Integer, Integer>> it3 = cVar5.f186i.entrySet().iterator();
                    int iIntValue = i10;
                    while (it3.hasNext()) {
                        iIntValue |= it3.next().getValue().intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        n(byteArrayOutputStream5, iIntValue, cVar5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            o(byteArrayOutputStream6, cVar5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            d.f(byteArrayOutputStream4, i17);
                            int length3 = byteArray3.length + i13 + byteArray4.length;
                            int i19 = i18 + 6;
                            ArrayList arrayList4 = arrayList3;
                            d.e(byteArrayOutputStream4, length3, 4);
                            d.f(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i18 = i19 + length3;
                            i17++;
                            arrayList3 = arrayList4;
                            i10 = 0;
                            i13 = 2;
                        } catch (Throwable th4) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                    } catch (Throwable th6) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th6;
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                            throw th6;
                        }
                    }
                } catch (Throwable th8) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th8;
                    } catch (Throwable th9) {
                        th8.addSuppressed(th9);
                        throw th8;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i18 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i18 + ", does not match actual size " + byteArray5.length);
            }
            j jVar3 = new j(e.METHODS, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList2.add(jVar3);
            long j10 = 4;
            long size2 = j10 + j10 + 4 + ((long) (arrayList2.size() * 16));
            d.e(byteArrayOutputStream, arrayList2.size(), 4);
            int i20 = 0;
            while (i20 < arrayList2.size()) {
                j jVar4 = (j) arrayList2.get(i20);
                d.e(byteArrayOutputStream, jVar4.f195a.a(), 4);
                d.e(byteArrayOutputStream, size2, 4);
                boolean z10 = jVar4.f197c;
                byte[] bArr7 = jVar4.f196b;
                if (z10) {
                    long length4 = bArr7.length;
                    byte[] bArrA5 = d.a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA5);
                    d.e(byteArrayOutputStream, bArrA5.length, 4);
                    d.e(byteArrayOutputStream, length4, 4);
                    length = bArrA5.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    d.e(byteArrayOutputStream, bArr7.length, 4);
                    d.e(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i20++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i21));
            }
            return true;
        } catch (Throwable th10) {
            try {
                byteArrayOutputStream2.close();
                throw th10;
            } catch (Throwable th11) {
                th10.addSuppressed(th11);
                throw th10;
            }
        }
    }

    public static void k(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull c cVar) throws IOException {
        int iIntValue = 0;
        for (int i10 : cVar.f185h) {
            Integer numValueOf = Integer.valueOf(i10);
            d.f(byteArrayOutputStream, numValueOf.intValue() - iIntValue);
            iIntValue = numValueOf.intValue();
        }
    }

    public static void l(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull c cVar) throws IOException {
        o(byteArrayOutputStream, cVar);
        k(byteArrayOutputStream, cVar);
        int i10 = cVar.f184g;
        byte[] bArr = new byte[(((i10 * 2) + 7) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : cVar.f186i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            if ((iIntValue2 & 2) != 0) {
                int iC = c(2, iIntValue, i10);
                int i11 = iC / 8;
                bArr[i11] = (byte) ((1 << (iC % 8)) | bArr[i11]);
            }
            if ((iIntValue2 & 4) != 0) {
                int iC2 = c(4, iIntValue, i10);
                int i12 = iC2 / 8;
                bArr[i12] = (byte) ((1 << (iC2 % 8)) | bArr[i12]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void m(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull c cVar, @NonNull String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        d.f(byteArrayOutputStream, str.getBytes(charset).length);
        d.f(byteArrayOutputStream, cVar.f182e);
        d.e(byteArrayOutputStream, cVar.f183f, 4);
        d.e(byteArrayOutputStream, cVar.f180c, 4);
        d.e(byteArrayOutputStream, cVar.f184g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void n(@NonNull ByteArrayOutputStream byteArrayOutputStream, int i10, @NonNull c cVar) throws IOException {
        int iBitCount = Integer.bitCount(i10 & (-2));
        int i11 = cVar.f184g;
        byte[] bArr = new byte[(((iBitCount * i11) + 7) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : cVar.f186i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int i12 = 0;
            for (int i13 = 1; i13 <= 4; i13 <<= 1) {
                if (i13 != 1 && (i13 & i10) != 0) {
                    if ((i13 & iIntValue2) == i13) {
                        int i14 = (i12 * i11) + iIntValue;
                        int i15 = i14 / 8;
                        bArr[i15] = (byte) ((1 << (i14 % 8)) | bArr[i15]);
                    }
                    i12++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void o(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull c cVar) throws IOException {
        int i10 = 0;
        for (Map.Entry<Integer, Integer> entry : cVar.f186i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                d.f(byteArrayOutputStream, iIntValue - i10);
                d.f(byteArrayOutputStream, 0);
                i10 = iIntValue;
            }
        }
    }
}
