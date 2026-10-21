package com.google.firebase.dynamiclinks.internal;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes10.dex */
public class DynamicLinksApi extends GoogleApi<Api.ApiOptions.NoOptions> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Api<Api.ApiOptions.NoOptions> f48342a = new Api<>("DynamicLinks.API", new a(), new Api.ClientKey());

    public class a extends Api.AbstractClientBuilder<DynamicLinksClient, Api.ApiOptions.NoOptions> {
        @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
        public final Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Api.ApiOptions.NoOptions noOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            return new DynamicLinksClient(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener);
        }
    }

    @VisibleForTesting
    public DynamicLinksApi(@NonNull Context context) {
        super(context, f48342a, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
