package com.google.android.play.core.splitinstall.internal;

import java.io.File;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzbw {
    public static String zza(File file) {
        if (!file.getName().endsWith(".apk")) {
            throw new IllegalArgumentException("Non-apk found in splits directory.");
        }
        String strReplaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", "");
        if (strReplaceFirst.equals("base-master") || strReplaceFirst.equals("base-main")) {
            return "";
        }
        return strReplaceFirst.startsWith("base-") ? strReplaceFirst.replace("base-", "config.") : strReplaceFirst.replace(Constant.DASH_STRING, ".config.").replace(".config.master", "").replace(".config.main", "");
    }
}
