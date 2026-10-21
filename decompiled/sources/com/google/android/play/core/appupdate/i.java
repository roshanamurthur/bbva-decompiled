package com.google.android.play.core.appupdate;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46048a;

    public i(Context context) {
        this.f46048a = context;
    }

    public static long a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        long jA = 0;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                jA += a(file2);
            }
        }
        return jA;
    }
}
