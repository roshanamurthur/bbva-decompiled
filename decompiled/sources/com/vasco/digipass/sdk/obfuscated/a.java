package com.vasco.digipass.sdk.obfuscated;

import androidx.camera.camera2.internal.compat.u;
import bc.org.bouncycastle.crypto.params.DESParameters;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import com.vasco.digipass.sdk.DigipassSDKReturnCodes;
import com.vasco.digipass.sdk.responses.ActivationResponse;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDK;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements DigipassSDKConstants {

    /* JADX INFO: renamed from: com.vasco.digipass.sdk.obfuscated.a$a, reason: collision with other inner class name */
    public static class C0271a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f65662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f65663b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f65664c;

        public C0271a(int i10) {
            this(i10, null, null);
        }

        public C0271a(int i10, String str, String str2) {
            this.f65662a = i10;
            this.f65663b = str;
            this.f65664c = str2;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f65665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f65666b;

        public b(int i10) {
            this(i10, null);
        }

        public b(int i10, String str) {
            this.f65665a = i10;
            this.f65666b = str;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f65667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f65668b;

        public c(String str, String str2) {
            this.f65667a = str;
            this.f65668b = str2;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f65669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final byte[] f65670b;

        public d(int i10) {
            this(i10, null);
        }

        public d(int i10, byte[] bArr) {
            this.f65669a = i10;
            this.f65670b = bArr;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f65671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final byte[] f65672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f65673c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final String f65674d;

        public e(int i10) {
            this(i10, null, null, null);
        }

        public e(int i10, byte[] bArr, String str, String str2) {
            this.f65671a = i10;
            this.f65672b = bArr;
            this.f65673c = str;
            this.f65674d = str2;
        }
    }

    public static ActivationResponse a(String str, String str2, String str3, String str4, CharSequence charSequence, byte[] bArr, int i10, byte[] bArr2, boolean z10, boolean z11, String str5, byte[] bArr3) {
        String upperCase = str2 == null ? null : str2.toUpperCase();
        try {
            l.a(bArr, i10);
            d dVarB = b(str, upperCase, str3, charSequence, bArr3);
            int i11 = dVarB.f65669a;
            return i11 != 0 ? a(i11) : a(upperCase, str3, str4, charSequence, null, bArr, i10, bArr2, z10, z11, str5, dVarB.f65670b, bArr3);
        } catch (h e5) {
            return a(e5.a());
        } catch (Exception e7) {
            return a(DigipassSDKReturnCodes.UNKNOWN_ERROR, e7);
        }
    }

    private static d b(String str, String str2, String str3, CharSequence charSequence, byte[] bArr) {
        int iA = a(str, str2, str3, charSequence, bArr);
        return iA != 0 ? new d(iA) : new d(0, q.a(str));
    }

    private static e b(String str, CharSequence charSequence, String str2, byte[] bArr) {
        int iA = a(str, charSequence, str2, bArr);
        if (iA != 0) {
            return new e(iA);
        }
        try {
            byte[] bArrB = j.b(str);
            return new e(iA, bArrB, b(str, bArrB), a(str, bArrB));
        } catch (h e5) {
            return new e(e5.a());
        }
    }

    private static int a(String str, String str2, String str3, CharSequence charSequence, byte[] bArr) {
        if (str == null) {
            return DigipassSDKReturnCodes.STATIC_VECTOR_NULL;
        }
        if (str.length() <= 4) {
            return DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_LENGTH;
        }
        if (((byte) (str.charAt(3) - '0')) <= 7) {
            if (str.length() != 112) {
                return DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_LENGTH;
            }
            if (bArr != null && bArr.length != 56) {
                return DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_LENGTH;
            }
        } else {
            if (str.length() < 182 || str.length() > 1916) {
                return DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_LENGTH;
            }
            if (bArr != null && (bArr.length < 80 || bArr.length > 306)) {
                return DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_LENGTH;
            }
        }
        if (!q.c(str)) {
            return DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT;
        }
        if (str2 == null) {
            return -4009;
        }
        if (str2.length() != 10 && str2.length() != 7) {
            return -4010;
        }
        if (str3 == null) {
            return DigipassSDKReturnCodes.ACTIVATION_CODE_NULL;
        }
        if (charSequence == null || charSequence.toString().isEmpty() || charSequence.length() <= 512) {
            return 0;
        }
        return DigipassSDKReturnCodes.SHARED_SECRET_TOO_LONG;
    }

    private static String b(String str, byte[] bArr) throws h {
        byte b10 = bArr[1];
        int i10 = b10 <= 7 ? 2 : 1;
        int i11 = b10 > 7 ? 0 : 1;
        int length = bArr.length * 2;
        int i12 = i10 * 7;
        int i13 = length + i12;
        if (str.length() >= i13) {
            String strSubstring = str.substring(length, i13);
            StringBuilder sb2 = new StringBuilder();
            for (int i14 = 0; i14 < i12; i14 += i10) {
                sb2.append(strSubstring.charAt(i14 + i11));
            }
            return sb2.toString();
        }
        throw new h(DigipassSDKReturnCodes.XFAD_INCORRECT_LENGTH);
    }

    private static ActivationResponse a(String str, String str2, String str3, CharSequence charSequence, String str4, byte[] bArr, int i10, byte[] bArr2, boolean z10, boolean z11, String str5, byte[] bArr3, byte[] bArr4) throws h {
        com.vasco.digipass.sdk.obfuscated.e eVarA = a(bArr3, bArr4, str);
        if (eVarA.f65717c.f65766t) {
            eVarA.f();
            return a(DigipassSDKReturnCodes.MULTI_DEVICE_ACTIVATION_ENABLED);
        }
        l.a aVarA = a(eVarA, bArr, i10, bArr2, z10, str5);
        if (aVarA.getReturnCode() != 0) {
            eVarA.f();
            return a(aVarA.getReturnCode());
        }
        byte[] bArr5 = aVarA.f65780c;
        boolean z12 = ((charSequence == null || charSequence.toString().isEmpty()) && q.d(str4)) ? false : true;
        int iA = a(eVarA, str, str2, str3, z12, z11);
        if (iA != 0) {
            eVarA.f();
            q.g(bArr5);
            return a(iA);
        }
        c cVarA = a(eVarA, str2, str3);
        C0271a c0271aA = a(eVarA, cVarA, charSequence, str4, z11);
        if (c0271aA.f65662a != 0) {
            eVarA.f();
            q.g(bArr5);
            cVarA.f65667a = null;
            cVarA.f65668b = null;
            return a(c0271aA.f65662a);
        }
        ActivationResponse activationResponseA = a(eVarA, bArr5, c0271aA, z12, z11, !q.f(bArr));
        if (activationResponseA.getReturnCode() == 0) {
            activationResponseA.setStaticVector(bArr3);
        }
        eVarA.f();
        q.g(bArr5);
        cVarA.f65667a = null;
        cVarA.f65668b = null;
        c0271aA.f65663b = null;
        c0271aA.f65664c = null;
        return activationResponseA;
    }

    public static com.vasco.digipass.sdk.obfuscated.e a(byte[] bArr, byte[] bArr2, String str) throws h {
        com.vasco.digipass.sdk.obfuscated.e eVarB;
        if (bArr2 == null) {
            eVarB = p.b(bArr);
            g gVar = eVarB.f65718d;
            gVar.f65726a = (byte) 7;
            if (eVarB.f65717c.f65748a <= 7) {
                gVar.f65737l = (byte) 0;
            } else {
                gVar.f65737l = (byte) 7;
            }
            gVar.f65727b = (byte) 7;
        } else {
            eVarB = p.b(bArr, bArr2);
        }
        if (str.length() == 10) {
            eVarB.f65717c.f65749b = str;
        } else {
            eVarB.f65717c.f65749b = eVarB.f65717c.f65749b.substring(0, 3) + str;
        }
        return eVarB;
    }

    public static l.a a(com.vasco.digipass.sdk.obfuscated.e eVar, byte[] bArr, int i10, byte[] bArr2, boolean z10, String str) {
        byte[] bArr3;
        if (z10) {
            int iA = j.a(bArr2);
            if (iA != 0) {
                return new l.a(iA, null);
            }
            bArr3 = new byte[16];
            System.arraycopy(bArr2, 0, bArr3, 0, 16);
            l.a(eVar, (byte[]) null, 0, (byte[]) null, 0, bArr2, (String) null);
        } else {
            l.a aVarA = l.a(bArr, i10, eVar, str);
            if (aVarA.getReturnCode() != 0) {
                return aVarA;
            }
            bArr3 = aVarA.f65780c;
        }
        return new l.a(0, bArr3);
    }

    private static int a(com.vasco.digipass.sdk.obfuscated.e eVar, String str, String str2, String str3, boolean z10, boolean z11) {
        boolean zB;
        boolean zB2;
        i iVar = eVar.f65717c;
        boolean z12 = true;
        if (str2.length() != ((iVar.f65763q ? 16 : 20) * ((!z11 ? iVar.f65761o : iVar.f65762p) ? 1 : 2)) + (iVar.f65765s ? 1 : 0)) {
            return DigipassSDKReturnCodes.ACTIVATION_CODE_INCORRECT_LENGTH;
        }
        if (eVar.f65717c.f65763q) {
            zB = q.c(str2);
        } else {
            zB = q.b(str2);
        }
        if (!zB) {
            return DigipassSDKReturnCodes.ACTIVATION_CODE_INCORRECT_FORMAT;
        }
        if (eVar.f65717c.f65765s) {
            if (str.length() == 10) {
                str = str.substring(3);
            }
            if (!a(u.f(str, str2), eVar.f65717c.f65763q)) {
                return DigipassSDKReturnCodes.ACTIVATION_CODE_INVALID;
            }
        }
        if (q.d(str3)) {
            return 0;
        }
        if (eVar.f65717c.f65763q) {
            zB2 = q.c(str3);
        } else {
            zB2 = q.b(str3);
        }
        if (!zB2) {
            return z10 ? DigipassSDKReturnCodes.XERC_INCORRECT_FORMAT : DigipassSDKReturnCodes.ERC_INCORRECT_FORMAT;
        }
        i iVar2 = eVar.f65717c;
        byte b10 = iVar2.f65748a;
        if (b10 < 8 && z10) {
            return 0;
        }
        boolean z13 = iVar2.f65763q;
        if (b10 > 7 || z13) {
            z12 = z13;
        } else {
            str3 = com.vasco.digipass.sdk.obfuscated.c.a(str3);
        }
        if (a(str3, z12)) {
            return 0;
        }
        return DigipassSDKReturnCodes.ERC_INVALID;
    }

    private static boolean a(String str, boolean z10) {
        char cCharAt = str.charAt(str.length() - 1);
        String strC = androidx.databinding.e.c(str, 1, 0);
        return cCharAt == ((char) j.a(strC.getBytes(), strC.length(), z10 ^ true));
    }

    private static c a(com.vasco.digipass.sdk.obfuscated.e eVar, String str, String str2) {
        if (eVar.f65717c.f65765s) {
            str = androidx.databinding.e.c(str, 1, 0);
        }
        if (!q.d(str2) && eVar.f65717c.f65748a >= 8) {
            str2 = androidx.databinding.e.c(str2, 1, 0);
        }
        if (!eVar.f65717c.f65763q) {
            str = com.vasco.digipass.sdk.obfuscated.c.a(str);
            if (!q.d(str2)) {
                str2 = com.vasco.digipass.sdk.obfuscated.c.a(str2);
            }
        }
        if (!q.d(str2) && eVar.f65717c.f65748a <= 7) {
            str2 = androidx.databinding.e.c(str2, 1, 0);
        }
        return new c(str, str2);
    }

    private static C0271a a(com.vasco.digipass.sdk.obfuscated.e eVar, c cVar, CharSequence charSequence, String str, boolean z10) {
        String strA;
        String str2 = cVar.f65667a;
        String str3 = cVar.f65668b;
        if (((charSequence == null || charSequence.toString().isEmpty()) ? 0 : charSequence.length()) + (q.d(str) ? 0 : str.length()) != 0) {
            if (q.d(str)) {
                str = "";
            }
            StringBuilder sbD = androidx.camera.core.impl.utils.c.d(str);
            if (charSequence == null || charSequence.toString().isEmpty()) {
                charSequence = "";
            }
            sbD.append((Object) charSequence);
            byte[] outputData = UtilitiesSDK.hash((byte) 2, sbD.toString().getBytes()).getOutputData();
            byte[] bArr = new byte[16];
            System.arraycopy(outputData, 0, bArr, 0, 16);
            q.g(outputData);
            i iVar = eVar.f65717c;
            if (iVar.f65748a <= 7) {
                byte[] outputData2 = UtilitiesSDK.decrypt((byte) 2, (byte) 1, bArr, null, iVar.f65750c).getOutputData();
                System.arraycopy(outputData2, 0, eVar.f65717c.f65750c, 0, outputData2.length);
                q.g(outputData2);
                strA = a(str2, bArr, (byte) 1, 0, 16);
                if (eVar.f65717c.f65761o) {
                    StringBuilder sbD2 = androidx.camera.core.impl.utils.c.d(strA);
                    sbD2.append(a(str2, bArr, (byte) 1, 16, 16));
                    strA = sbD2.toString();
                }
            } else {
                strA = a(str2, bArr, (byte) 2, 0, str2.length());
            }
            str2 = strA;
            b bVarA = a(eVar, str3, bArr, z10);
            q.g(bArr);
            if (bVarA.f65665a != 0) {
                q.g(bArr);
                return new C0271a(bVarA.f65665a);
            }
            str3 = bVarA.f65666b;
            q.g(bArr);
            bVarA.f65666b = null;
        }
        return new C0271a(0, str2, str3);
    }

    private static String a(String str, byte[] bArr, byte b10, int i10, int i11) {
        byte[] bArrA = q.a(str.substring(i10, i11 + i10));
        byte[] outputData = UtilitiesSDK.decrypt((byte) 2, b10, bArr, null, bArrA).getOutputData();
        String strA = q.a(outputData);
        q.g(bArrA);
        q.g(outputData);
        return strA;
    }

    private static b a(com.vasco.digipass.sdk.obfuscated.e eVar, String str, byte[] bArr, boolean z10) {
        byte b10;
        String string = null;
        if (!q.d(str)) {
            if (z10) {
                b10 = 1;
            } else {
                com.vasco.digipass.sdk.obfuscated.d[] dVarArrA = eVar.a();
                b10 = 0;
                for (int i10 = 0; i10 < eVar.f65715a; i10++) {
                    com.vasco.digipass.sdk.obfuscated.d dVar = dVarArrA[i10];
                    if (dVar.f65700a && !dVar.f65701b && dVar.f65704e.f65687n) {
                        b10 = (byte) (b10 + 1);
                    }
                }
            }
            if (str.length() < b10) {
                return new b(DigipassSDKReturnCodes.XERC_INCORRECT_LENGTH);
            }
            String strSubstring = str.substring(0, b10);
            String strSubstring2 = str.substring(b10);
            boolean z11 = strSubstring2.length() % 2 != 0;
            if (z11) {
                strSubstring2 = strSubstring2.concat("0");
            }
            byte[] bArrA = q.a(strSubstring2);
            byte b11 = eVar.f65717c.f65748a;
            if (b11 <= 7 && bArrA.length != 32) {
                q.g(bArrA);
                return new b(DigipassSDKReturnCodes.XERC_INCORRECT_LENGTH);
            }
            byte[] outputData = UtilitiesSDK.decrypt((byte) 2, b11 <= 7 ? (byte) 2 : (byte) 3, bArr, null, bArrA).getOutputData();
            String strA = q.a(outputData);
            if (z11) {
                strA = androidx.databinding.e.c(strA, 1, 0);
            }
            StringBuilder sb2 = new StringBuilder(strSubstring);
            int i11 = 0;
            int i12 = 0;
            while (i11 < b10) {
                int i13 = Integer.parseInt("" + strSubstring.charAt(i11), 16) + i12;
                if (i13 > strA.length()) {
                    q.g(bArrA);
                    q.g(outputData);
                    if (eVar.f65717c.f65748a <= 7) {
                        return new b(0, str);
                    }
                    return new b(DigipassSDKReturnCodes.XERC_INCORRECT_LENGTH);
                }
                sb2.append(strA.substring(i12, i13));
                i11++;
                i12 = i13;
            }
            string = sb2.toString();
            q.g(bArrA);
            q.g(outputData);
        }
        return new b(0, string);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        r7 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.vasco.digipass.sdk.responses.ActivationResponse a(com.vasco.digipass.sdk.obfuscated.e r10, byte[] r11, com.vasco.digipass.sdk.obfuscated.a.C0271a r12, boolean r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vasco.digipass.sdk.obfuscated.a.a(com.vasco.digipass.sdk.obfuscated.e, byte[], com.vasco.digipass.sdk.obfuscated.a$a, boolean, boolean, boolean):com.vasco.digipass.sdk.responses.ActivationResponse");
    }

    private static byte[] a(com.vasco.digipass.sdk.obfuscated.e eVar, byte[] bArr, boolean z10) {
        byte[] bytes = eVar.f65717c.f65749b.getBytes();
        byte b10 = bytes[7];
        byte b11 = bytes[8];
        byte[] bArr2 = {bytes[0], bytes[1], bytes[2], (byte) (bytes[3] + bytes[4]), (byte) (bytes[5] + bytes[6]), (byte) (b10 + b11), b11, bytes[9]};
        if (z10) {
            byte[] outputData = UtilitiesSDK.encrypt((byte) 2, (byte) 2, eVar.f65717c.f65750c, bArr2, bArr).getOutputData();
            if (eVar.f65717c.f65748a > 7) {
                return outputData;
            }
            DESParameters.setOddParity(outputData);
            return outputData;
        }
        return UtilitiesSDK.decrypt((byte) 2, (byte) 2, eVar.f65717c.f65750c, bArr2, bArr).getOutputData();
    }

    private static ActivationResponse a(byte[] bArr, com.vasco.digipass.sdk.obfuscated.e eVar) {
        if (eVar.f65717c.f65748a < 8 && !a(bArr)) {
            if (eVar.d()) {
                return a(DigipassSDKReturnCodes.ACTIVATION_CODE_INVALID);
            }
            i iVar = eVar.f65717c;
            if (iVar.f65757j == 0) {
                return a(DigipassSDKReturnCodes.ACTIVATION_CODE_INVALID);
            }
            g gVar = eVar.f65718d;
            byte b10 = gVar.f65731f;
            if (b10 > 0) {
                byte b11 = (byte) (b10 - 1);
                gVar.f65731f = b11;
                return a(DigipassSDKReturnCodes.ACTIVATION_CODE_INVALID, eVar, b11);
            }
            if (iVar.f65758k == 0) {
                eVar.f();
                eVar.f65718d.f65728c = (byte) 2;
                return a(DigipassSDKReturnCodes.REACTIVATION_LOCK, eVar);
            }
            gVar.f65728c = (byte) 3;
            return null;
        }
        eVar.f65718d.f65728c = (byte) 1;
        return null;
    }

    private static boolean a(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        DESParameters.setOddParity(bArr2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                q.g(bArr2);
                return false;
            }
        }
        q.g(bArr2);
        return true;
    }

    private static int a(String str, com.vasco.digipass.sdk.obfuscated.e eVar, boolean z10, boolean z11) {
        if (!q.d(str)) {
            byte[] bArr = new byte[8];
            com.vasco.digipass.sdk.obfuscated.d[] dVarArrA = eVar.a();
            byte b10 = 0;
            for (int i10 = 0; i10 < eVar.f65715a; i10++) {
                com.vasco.digipass.sdk.obfuscated.d dVar = dVarArrA[i10];
                if (dVar.f65700a && dVar.f65704e.f65687n && ((z11 && dVar.f65701b) || (!z11 && !dVar.f65701b))) {
                    bArr[b10] = dVar.f65702c;
                    b10 = (byte) (b10 + 1);
                }
            }
            if (str.length() < b10) {
                return DigipassSDKReturnCodes.ERC_INCORRECT_LENGTH;
            }
            String strSubstring = str.substring(0, b10);
            String strSubstring2 = str.substring(b10);
            int i11 = 0;
            int i12 = 0;
            while (i11 < b10) {
                int i13 = Integer.parseInt("" + strSubstring.charAt(i11), 16) + i12;
                if (i13 > strSubstring2.length()) {
                    if (eVar.f65717c.f65748a > 7 || !z10) {
                        return DigipassSDKReturnCodes.ERC_INCORRECT_LENGTH;
                    }
                    return 0;
                }
                String strSubstring3 = strSubstring2.substring(i12, i13);
                byte b11 = bArr[i11];
                long j10 = Long.parseLong(strSubstring3, 16);
                if (j10 > eVar.a(b11).f65712n) {
                    eVar.a(b11).f65712n = j10;
                }
                i11++;
                i12 = i13;
            }
        }
        return 0;
    }

    public static ActivationResponse a(String str, String str2, CharSequence charSequence, String str3, byte[] bArr, int i10, byte[] bArr2, boolean z10, boolean z11, String str4, byte[] bArr3) {
        try {
            l.a(bArr, i10);
            e eVarB = b(str, charSequence, str3, bArr3);
            int i11 = eVarB.f65671a;
            if (i11 != 0) {
                return a(i11);
            }
            return a(eVarB.f65673c, eVarB.f65674d, str2, charSequence, str3, bArr, i10, bArr2, z10, z11, str4, eVarB.f65672b, bArr3);
        } catch (h e5) {
            return a(e5.a());
        } catch (Exception e7) {
            return a(DigipassSDKReturnCodes.UNKNOWN_ERROR, e7);
        }
    }

    private static int a(String str, CharSequence charSequence, String str2, byte[] bArr) {
        int iA = j.a(str);
        if (iA != 0) {
            return iA;
        }
        if (((byte) (str.charAt(3) - '0')) <= 7) {
            if (bArr != null && bArr.length != 56) {
                return DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_LENGTH;
            }
        } else if (bArr != null && (bArr.length < 80 || bArr.length > 306)) {
            return DigipassSDKReturnCodes.DYNAMIC_VECTOR_INCORRECT_LENGTH;
        }
        if (((charSequence == null || charSequence.toString().isEmpty()) ? 0 : charSequence.length()) + (q.d(str2) ? 0 : str2.length()) > 512) {
            return DigipassSDKReturnCodes.SHARED_SECRET_TOO_LONG;
        }
        return 0;
    }

    private static String a(String str, byte[] bArr) throws h {
        int length = (bArr.length * 2) + ((bArr[1] <= 7 ? 2 : 1) * 7);
        if (str.length() >= length) {
            return str.substring(length);
        }
        throw new h(DigipassSDKReturnCodes.XFAD_INCORRECT_LENGTH);
    }

    private static ActivationResponse a(int i10) {
        return new ActivationResponse(i10);
    }

    private static ActivationResponse a(int i10, Throwable th2) {
        return new ActivationResponse(i10, th2);
    }

    private static ActivationResponse a(int i10, com.vasco.digipass.sdk.obfuscated.e eVar) {
        return a(i10, eVar, 0);
    }

    private static ActivationResponse a(int i10, com.vasco.digipass.sdk.obfuscated.e eVar, int i11) {
        return new ActivationResponse(i10, eVar.f65718d.f65728c, p.a(eVar), i11);
    }
}
