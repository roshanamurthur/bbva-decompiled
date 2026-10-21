package com.salesforce.marketingcloud.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.tozny.AesCbcWithIntegrity;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class a extends AesCbcWithIntegrity implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f65127b = "F6389234-1024-481F-9173-37D9D7F5051F";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f65128c = "com.salesforce.marketingcloud.storagePrefs";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f65129d = "install_date_enc";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f65130e = 500;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AesCbcWithIntegrity.SecretKeys f65131a;

    public a(@NonNull Context context, @NonNull String str, @NonNull String str2, @NonNull String str3) throws GeneralSecurityException, UnsupportedEncodingException {
        this(context, str, str2, str3, 500);
    }

    public String a(@NonNull Context context, @NonNull String str) throws GeneralSecurityException {
        SharedPreferences sharedPreferences = context.getSharedPreferences(f65128c, 0);
        String string = sharedPreferences.getString(f65129d, null);
        if (string != null) {
            return string;
        }
        String strSaltString = AesCbcWithIntegrity.saltString(AesCbcWithIntegrity.generateSalt());
        sharedPreferences.edit().putString(f65129d, strSaltString).apply();
        return strSaltString;
    }

    @Override // com.salesforce.marketingcloud.util.c
    public String b(String str) throws GeneralSecurityException, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return AesCbcWithIntegrity.decryptString(new AesCbcWithIntegrity.CipherTextIvMac(str), this.f65131a);
    }

    public a(Context context, String str, String str2, String str3, int i10) throws GeneralSecurityException, UnsupportedEncodingException {
        this.f65131a = AesCbcWithIntegrity.generateKeyFromPassword(a(str, str2, str3), a(context, str), i10);
        a();
    }

    @Override // com.salesforce.marketingcloud.util.c
    public String a(String str) throws GeneralSecurityException, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return AesCbcWithIntegrity.encrypt(str, this.f65131a).toString();
    }

    private String a(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        StringBuilder sbE = androidx.camera.core.processing.f.e(str, "--");
        sbE.append(l.e(str2));
        sbE.append("__");
        sbE.append(l.e(str3));
        return Base64.encodeToString(l.e(sbE.toString()).getBytes(l.f65196b), 2);
    }

    private void a() throws GeneralSecurityException, UnsupportedEncodingException {
        if (!f65127b.equals(b(a(f65127b)))) {
            throw new GeneralSecurityException("Encryption/decryption test failed");
        }
    }
}
