package com.salesforce.marketingcloud.util;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.text.NumberFormat;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"UnknownNullness"})
public class i extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f65186f = "ETPush";

    public i(@NonNull Context context, @NonNull String str, @NonNull String str2, @NonNull String str3) throws GeneralSecurityException, UnsupportedEncodingException {
        super(context, str, str2, str3, 10000);
    }

    @Override // com.salesforce.marketingcloud.util.a
    public final String a(@NonNull Context context, @NonNull String str) throws GeneralSecurityException {
        int iIntValue;
        String string = context.getSharedPreferences(f65186f, 0).getString("install_date_enc", null);
        if (string == null) {
            throw new GeneralSecurityException("Unable to get old salt.");
        }
        try {
            iIntValue = NumberFormat.getInstance().parse(l.e(str + "29200FA5-DF79-4C3F-BC0F-E2FF3CE6199A")).intValue();
        } catch (Exception unused) {
            iIntValue = 200;
        }
        return l.e(string.substring(Integer.valueOf(String.valueOf(iIntValue).substring(0, 1)).intValue()));
    }
}
