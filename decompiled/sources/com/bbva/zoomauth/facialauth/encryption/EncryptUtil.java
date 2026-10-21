package com.bbva.zoomauth.facialauth.encryption;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EncryptUtil.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0007"}, d2 = {"Lcom/bbva/zoomauth/facialauth/encryption/EncryptUtil;", "", "", "encrypted", "decrypt", "<init>", "()V", "zoomauth_release"}, k = 1, mv = {1, 5, 1})
public final class EncryptUtil {

    @NotNull
    public static final EncryptUtil INSTANCE = new EncryptUtil();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final byte[] f37791a;

    static {
        byte b10 = (byte) 99;
        byte b11 = (byte) 111;
        byte b12 = (byte) 105;
        byte b13 = (byte) 97;
        byte b14 = (byte) 102;
        f37791a = new byte[]{b10, b11, (byte) 100, b12, (byte) 110, (byte) 103, b13, b14, b14, b13, b12, (byte) 114, (byte) 115, b10, b11, (byte) 109};
    }

    @NotNull
    public final String decrypt(@NotNull String encrypted) throws Exception {
        Intrinsics.checkNotNullParameter(encrypted, "encrypted");
        int length = encrypted.length() / 2;
        byte[] bArr = new byte[length];
        if (length > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                int i12 = i10 * 2;
                String strSubstring = encrypted.substring(i12, i12 + 2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                bArr[i10] = (byte) Integer.valueOf(strSubstring, 16).intValue();
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(f37791a, "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(2, secretKeySpec);
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "cipher.doFinal(encrypted)");
        return new String(bArrDoFinal, Charsets.UTF_8);
    }
}
