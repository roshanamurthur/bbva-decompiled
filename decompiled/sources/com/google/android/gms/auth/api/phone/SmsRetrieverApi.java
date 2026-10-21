package com.google.android.gms.auth.api.phone;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* JADX INFO: loaded from: classes9.dex */
public interface SmsRetrieverApi {
    @NonNull
    Task<Void> startSmsRetriever();

    @NonNull
    Task<Void> startSmsUserConsent(@Nullable String str);
}
