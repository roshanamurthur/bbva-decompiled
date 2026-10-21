package com.google.android.gms.auth.api.phone;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* JADX INFO: loaded from: classes9.dex */
public interface SmsCodeBrowserClient extends HasApiKey<Api.ApiOptions.NoOptions> {
    @NonNull
    Task<Void> startSmsCodeRetriever();
}
