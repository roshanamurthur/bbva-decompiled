package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.Locale;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public class CommonUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final GmsLogger f49408a = new GmsLogger("CommonUtils", "");

    @NonNull
    @KeepForSdk
    public static String getAppVersion(@NonNull Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e5) {
            f49408a.e("CommonUtils", "Exception thrown when trying to get app version ".concat(e5.toString()));
            return "";
        }
    }

    @NonNull
    @KeepForSdk
    public static String languageTagFromLocale(@NonNull Locale locale) {
        if (PlatformVersion.isAtLeastLollipop()) {
            return locale.toLanguageTag();
        }
        StringBuilder sb2 = new StringBuilder(locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb2.append(Constant.DASH_STRING);
            sb2.append(locale.getCountry());
        }
        if (!TextUtils.isEmpty(locale.getVariant())) {
            sb2.append(Constant.DASH_STRING);
            sb2.append(locale.getVariant());
        }
        return sb2.toString();
    }
}
