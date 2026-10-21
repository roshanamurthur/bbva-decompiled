package com.google.android.gms.auth;

import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* JADX INFO: loaded from: classes9.dex */
@KeepName
public class UserRecoverableAuthException extends GoogleAuthException {

    @Nullable
    private final Intent zza;

    @Nullable
    private final PendingIntent zzb;
    private final zzn zzc;

    public UserRecoverableAuthException(@Nullable String str, @Nullable Intent intent) {
        this(str, intent, null, zzn.LEGACY);
    }

    @NonNull
    public static UserRecoverableAuthException zza(@Nullable String str, @NonNull Intent intent, @NonNull PendingIntent pendingIntent) {
        Preconditions.checkNotNull(intent);
        Preconditions.checkNotNull(pendingIntent);
        return new UserRecoverableAuthException(str, intent, pendingIntent, zzn.AUTH_INSTANTIATION);
    }

    @Nullable
    public Intent getIntent() {
        Intent intent = this.zza;
        if (intent != null) {
            return new Intent(intent);
        }
        if (this.zzc.ordinal() != 0) {
            return null;
        }
        Log.w("Auth", "Make sure that an intent was provided to class instantiation.");
        return null;
    }

    private UserRecoverableAuthException(@Nullable String str, @Nullable Intent intent, @Nullable PendingIntent pendingIntent, zzn zznVar) {
        super(str);
        this.zzb = pendingIntent;
        this.zza = intent;
        this.zzc = (zzn) Preconditions.checkNotNull(zznVar);
    }
}
