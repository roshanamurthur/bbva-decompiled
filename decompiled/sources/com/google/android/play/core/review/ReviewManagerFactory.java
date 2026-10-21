package com.google.android.play.core.review;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes10.dex */
public class ReviewManagerFactory {
    @NonNull
    public static ReviewManager create(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new zzd(new zzi(context));
    }
}
