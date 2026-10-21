package com.google.android.gms.fido.u2f;

import android.app.Activity;
import android.content.IntentSender;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public interface U2fPendingIntent {
    boolean hasPendingIntent();

    void launchPendingIntent(@NonNull Activity activity, int i10) throws IntentSender.SendIntentException;
}
