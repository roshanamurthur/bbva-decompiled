package com.google.android.gms.internal.tapandpay;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzai extends zzah {
    private final WeakReference zza;
    private final int zzb;

    public zzai(Activity activity, int i10) {
        this.zza = new WeakReference(activity);
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzah, com.google.android.gms.internal.tapandpay.zzf
    public final void zzu(Status status, Bundle bundle) {
        Activity activity = (Activity) this.zza.get();
        if (activity == null) {
            return;
        }
        if (status.hasResolution()) {
            try {
                status.startResolutionForResult(activity, this.zzb);
                return;
            } catch (IntentSender.SendIntentException e5) {
                Log.w("TapAndPayClientImpl", "Exception starting pending intent", e5);
            }
        }
        PendingIntent pendingIntentCreatePendingResult = activity.createPendingResult(this.zzb, new Intent(), 1073741824);
        if (pendingIntentCreatePendingResult == null) {
            Log.w("TapAndPayClientImpl", "Null pending result returned for onHandleStatusPendingIntent");
            return;
        }
        try {
            pendingIntentCreatePendingResult.send(status.isSuccess() ? -1 : status.getStatusCode());
        } catch (PendingIntent.CanceledException e7) {
            Log.w("TapAndPayClientImpl", "Exception setting pending result", e7);
        }
    }
}
