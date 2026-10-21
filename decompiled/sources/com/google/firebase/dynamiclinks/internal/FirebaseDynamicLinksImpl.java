package com.google.firebase.dynamiclinks.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.firebase.dynamiclinks.FirebaseDynamicLinks;
import com.google.firebase.dynamiclinks.PendingDynamicLinkData;
import com.google.firebase.dynamiclinks.ShortDynamicLink;
import com.google.firebase.inject.Provider;

/* JADX INFO: loaded from: classes10.dex */
public class FirebaseDynamicLinksImpl extends FirebaseDynamicLinks {
    public static final String EXTRA_DYNAMIC_LINK_DATA = "com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA";
    public static final String KEY_SCION_DATA = "scionData";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GoogleApi<Api.ApiOptions.NoOptions> f48343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<AnalyticsConnector> f48344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FirebaseApp f48345c;

    public static class a extends IDynamicLinksCallbacks.Stub {
        @Override // com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks
        public void onCreateShortDynamicLink(Status status, @Nullable ShortDynamicLinkImpl shortDynamicLinkImpl) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks
        public void onGetDynamicLink(Status status, @Nullable DynamicLinkData dynamicLinkData) {
            throw new UnsupportedOperationException();
        }
    }

    public static class b extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TaskCompletionSource<ShortDynamicLink> f48346e;

        public b(TaskCompletionSource<ShortDynamicLink> taskCompletionSource) {
            this.f48346e = taskCompletionSource;
        }

        @Override // com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinksImpl.a, com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks
        public final void onCreateShortDynamicLink(Status status, @Nullable ShortDynamicLinkImpl shortDynamicLinkImpl) {
            TaskUtil.setResultOrApiException(status, shortDynamicLinkImpl, this.f48346e);
        }
    }

    public static final class c extends TaskApiCall<DynamicLinksClient, ShortDynamicLink> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f48347a;

        public c(Bundle bundle) {
            super(null, false, 13202);
            this.f48347a = bundle;
        }

        @Override // com.google.android.gms.common.api.internal.TaskApiCall
        public final void doExecute(Api.AnyClient anyClient, TaskCompletionSource<ShortDynamicLink> taskCompletionSource) throws RemoteException {
            DynamicLinksClient dynamicLinksClient = (DynamicLinksClient) anyClient;
            b bVar = new b(taskCompletionSource);
            Bundle bundle = this.f48347a;
            dynamicLinksClient.getClass();
            try {
                ((IDynamicLinksService) dynamicLinksClient.getService()).createShortDynamicLink(bVar, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    public static class d extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TaskCompletionSource<PendingDynamicLinkData> f48348e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Provider<AnalyticsConnector> f48349f;

        public d(Provider<AnalyticsConnector> provider, TaskCompletionSource<PendingDynamicLinkData> taskCompletionSource) {
            this.f48349f = provider;
            this.f48348e = taskCompletionSource;
        }

        @Override // com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinksImpl.a, com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks
        public final void onGetDynamicLink(Status status, @Nullable DynamicLinkData dynamicLinkData) {
            Bundle bundle;
            AnalyticsConnector analyticsConnector;
            TaskUtil.setResultOrApiException(status, dynamicLinkData == null ? null : new PendingDynamicLinkData(dynamicLinkData), this.f48348e);
            if (dynamicLinkData == null || (bundle = dynamicLinkData.getExtensionBundle().getBundle("scionData")) == null || bundle.keySet() == null || (analyticsConnector = this.f48349f.get()) == null) {
                return;
            }
            for (String str : bundle.keySet()) {
                analyticsConnector.logEvent("fdl", str, bundle.getBundle(str));
            }
        }
    }

    public static final class e extends TaskApiCall<DynamicLinksClient, PendingDynamicLinkData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final String f48350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Provider<AnalyticsConnector> f48351b;

        public e(Provider<AnalyticsConnector> provider, @Nullable String str) {
            super(null, false, 13201);
            this.f48350a = str;
            this.f48351b = provider;
        }

        @Override // com.google.android.gms.common.api.internal.TaskApiCall
        public final void doExecute(Api.AnyClient anyClient, TaskCompletionSource<PendingDynamicLinkData> taskCompletionSource) throws RemoteException {
            DynamicLinksClient dynamicLinksClient = (DynamicLinksClient) anyClient;
            d dVar = new d(this.f48351b, taskCompletionSource);
            String str = this.f48350a;
            dynamicLinksClient.getClass();
            try {
                ((IDynamicLinksService) dynamicLinksClient.getService()).getDynamicLink(dVar, str);
            } catch (RemoteException unused) {
            }
        }
    }

    public FirebaseDynamicLinksImpl(FirebaseApp firebaseApp, Provider<AnalyticsConnector> provider) {
        this(new DynamicLinksApi(firebaseApp.getApplicationContext()), firebaseApp, provider);
    }

    public static void verifyDomainUriPrefix(Bundle bundle) {
        Uri uri = (Uri) bundle.getParcelable(DynamicLink.Builder.KEY_DYNAMIC_LINK);
        if (TextUtils.isEmpty(bundle.getString(DynamicLink.Builder.KEY_DOMAIN_URI_PREFIX)) && uri == null) {
            throw new IllegalArgumentException("FDL domain is missing. Set with setDomainUriPrefix() or setDynamicLinkDomain().");
        }
    }

    @Override // com.google.firebase.dynamiclinks.FirebaseDynamicLinks
    public DynamicLink.Builder createDynamicLink() {
        return new DynamicLink.Builder(this);
    }

    public Task<ShortDynamicLink> createShortDynamicLink(Bundle bundle) {
        verifyDomainUriPrefix(bundle);
        return this.f48343a.doWrite(new c(bundle));
    }

    @Override // com.google.firebase.dynamiclinks.FirebaseDynamicLinks
    public Task<PendingDynamicLinkData> getDynamicLink(@Nullable Intent intent) {
        PendingDynamicLinkData pendingDynamicLinkData;
        Task taskDoWrite = this.f48343a.doWrite(new e(this.f48344b, intent != null ? intent.getDataString() : null));
        return (intent == null || (pendingDynamicLinkData = getPendingDynamicLinkData(intent)) == null) ? taskDoWrite : Tasks.forResult(pendingDynamicLinkData);
    }

    public FirebaseApp getFirebaseApp() {
        return this.f48345c;
    }

    @Nullable
    public PendingDynamicLinkData getPendingDynamicLinkData(@NonNull Intent intent) {
        DynamicLinkData dynamicLinkData = (DynamicLinkData) SafeParcelableSerializer.deserializeFromIntentExtra(intent, EXTRA_DYNAMIC_LINK_DATA, DynamicLinkData.CREATOR);
        if (dynamicLinkData != null) {
            return new PendingDynamicLinkData(dynamicLinkData);
        }
        return null;
    }

    @VisibleForTesting
    public FirebaseDynamicLinksImpl(GoogleApi<Api.ApiOptions.NoOptions> googleApi, FirebaseApp firebaseApp, Provider<AnalyticsConnector> provider) {
        this.f48343a = googleApi;
        this.f48345c = (FirebaseApp) Preconditions.checkNotNull(firebaseApp);
        this.f48344b = provider;
        if (provider.get() == null) {
            Log.w("FDL", "FDL logging failed. Add a dependency for Firebase Analytics to your app to enable logging of Dynamic Link events.");
        }
    }

    public static Uri createDynamicLink(Bundle bundle) {
        verifyDomainUriPrefix(bundle);
        Uri uri = (Uri) bundle.getParcelable(DynamicLink.Builder.KEY_DYNAMIC_LINK);
        if (uri != null) {
            return uri;
        }
        Uri.Builder builder = new Uri.Builder();
        Uri uri2 = Uri.parse((String) Preconditions.checkNotNull(bundle.getString(DynamicLink.Builder.KEY_DOMAIN_URI_PREFIX)));
        builder.scheme(uri2.getScheme());
        builder.authority(uri2.getAuthority());
        builder.path(uri2.getPath());
        Bundle bundle2 = bundle.getBundle("parameters");
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                Object obj = bundle2.get(str);
                if (obj != null) {
                    builder.appendQueryParameter(str, obj.toString());
                }
            }
        }
        return builder.build();
    }

    @Override // com.google.firebase.dynamiclinks.FirebaseDynamicLinks
    public Task<PendingDynamicLinkData> getDynamicLink(@NonNull Uri uri) {
        return this.f48343a.doWrite(new e(this.f48344b, uri.toString()));
    }
}
