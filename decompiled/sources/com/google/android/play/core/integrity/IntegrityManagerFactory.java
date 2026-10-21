package com.google.android.play.core.integrity;

import android.content.Context;
import androidx.annotation.NonNull;
import te.c;
import te.d;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public class IntegrityManagerFactory {
    @NonNull
    public static IntegrityManager create(Context context) {
        c cVar;
        synchronized (d.class) {
            try {
                if (d.f93546a == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    d.f93546a = new c(context);
                }
                cVar = d.f93546a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (IntegrityManager) cVar.f93545d.a();
    }
}
