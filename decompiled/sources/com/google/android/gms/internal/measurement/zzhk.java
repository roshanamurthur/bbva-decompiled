package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhk {

    @GuardedBy("PhenotypeConstants.class")
    private static final ArrayMap zza = new ArrayMap();

    public static synchronized Uri zza(String str) {
        Uri uri;
        try {
            ArrayMap arrayMap = zza;
            uri = (Uri) arrayMap.get("com.google.android.gms.measurement");
            if (uri == null) {
                String strValueOf = String.valueOf(Uri.encode("com.google.android.gms.measurement"));
                uri = Uri.parse(strValueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(strValueOf) : new String("content://com.google.android.gms.phenotype/"));
                arrayMap.put("com.google.android.gms.measurement", uri);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return uri;
    }
}
