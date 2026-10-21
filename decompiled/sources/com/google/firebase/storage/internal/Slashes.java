package com.google.firebase.storage.internal;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes10.dex */
public class Slashes {
    @NonNull
    public static String normalizeSlashes(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!str.startsWith("/") && !str.endsWith("/") && !str.contains("//")) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : str.split("/", -1)) {
            if (!TextUtils.isEmpty(str2)) {
                if (sb2.length() > 0) {
                    sb2.append("/");
                    sb2.append(str2);
                } else {
                    sb2.append(str2);
                }
            }
        }
        return sb2.toString();
    }

    @NonNull
    public static String preserveSlashEncode(@Nullable String str) {
        return TextUtils.isEmpty(str) ? "" : slashize(Uri.encode(str));
    }

    @NonNull
    public static String slashize(@NonNull String str) {
        Preconditions.checkNotNull(str);
        return str.replace("%2F", "/");
    }
}
