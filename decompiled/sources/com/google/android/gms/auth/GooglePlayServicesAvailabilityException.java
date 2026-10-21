package com.google.android.gms.auth;

import android.content.Intent;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* JADX INFO: loaded from: classes9.dex */
public class GooglePlayServicesAvailabilityException extends UserRecoverableAuthException {
    private final int zza;

    public GooglePlayServicesAvailabilityException(int i10, @Nullable String str, @Nullable Intent intent) {
        super(str, intent);
        this.zza = i10;
    }

    public int getConnectionStatusCode() {
        return this.zza;
    }
}
