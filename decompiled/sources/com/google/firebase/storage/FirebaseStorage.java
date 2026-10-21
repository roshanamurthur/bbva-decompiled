package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bbva.cellscore.helper.WebHelperKt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.appcheck.interop.AppCheckTokenListener;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.emulators.EmulatedServiceSettings;
import com.google.firebase.inject.Provider;
import com.google.firebase.storage.internal.Util;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes10.dex */
public class FirebaseStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final FirebaseApp f48985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Provider<InternalAuthProvider> f48986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Provider<InteropAppCheckTokenProvider> f48987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f48988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f48989e = 600000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f48990f = 60000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f48991g = 600000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f48992h = 120000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public EmulatedServiceSettings f48993i;

    public FirebaseStorage(@Nullable String str, @NonNull FirebaseApp firebaseApp, @Nullable Provider<InternalAuthProvider> provider, @Nullable Provider<InteropAppCheckTokenProvider> provider2) {
        this.f48988d = str;
        this.f48985a = firebaseApp;
        this.f48986b = provider;
        this.f48987c = provider2;
        if (provider2 == null || provider2.get() == null) {
            return;
        }
        provider2.get().addAppCheckTokenListener(new a());
    }

    public static FirebaseStorage c(@NonNull FirebaseApp firebaseApp, @Nullable Uri uri) {
        FirebaseStorage firebaseStorage;
        String host = uri != null ? uri.getHost() : null;
        if (uri != null && !TextUtils.isEmpty(uri.getPath())) {
            throw new IllegalArgumentException("The storage Uri cannot contain a path element.");
        }
        Preconditions.checkNotNull(firebaseApp, "Provided FirebaseApp must not be null.");
        c cVar = (c) firebaseApp.get(c.class);
        Preconditions.checkNotNull(cVar, "Firebase Storage component is not present.");
        synchronized (cVar) {
            firebaseStorage = (FirebaseStorage) cVar.f49099a.get(host);
            if (firebaseStorage == null) {
                firebaseStorage = new FirebaseStorage(host, cVar.f49100b, cVar.f49101c, cVar.f49102d);
                cVar.f49099a.put(host, firebaseStorage);
            }
        }
        return firebaseStorage;
    }

    @NonNull
    public static FirebaseStorage getInstance() {
        FirebaseApp firebaseApp = FirebaseApp.getInstance();
        Preconditions.checkArgument(firebaseApp != null, "You must call FirebaseApp.initialize() first.");
        return getInstance(firebaseApp);
    }

    @Nullable
    public final InteropAppCheckTokenProvider a() {
        Provider<InteropAppCheckTokenProvider> provider = this.f48987c;
        if (provider != null) {
            return provider.get();
        }
        return null;
    }

    @Nullable
    public final InternalAuthProvider b() {
        Provider<InternalAuthProvider> provider = this.f48986b;
        if (provider != null) {
            return provider.get();
        }
        return null;
    }

    @NonNull
    public final StorageReference d(@NonNull Uri uri) {
        Preconditions.checkNotNull(uri, "uri must not be null");
        String str = this.f48988d;
        Preconditions.checkArgument(TextUtils.isEmpty(str) || uri.getAuthority().equalsIgnoreCase(str), "The supplied bucketname does not match the storage bucket of the current instance.");
        return new StorageReference(uri, this);
    }

    @NonNull
    public FirebaseApp getApp() {
        return this.f48985a;
    }

    public long getMaxChunkUploadRetry() {
        return this.f48990f;
    }

    public long getMaxDownloadRetryTimeMillis() {
        return this.f48991g;
    }

    public long getMaxOperationRetryTimeMillis() {
        return this.f48992h;
    }

    public long getMaxUploadRetryTimeMillis() {
        return this.f48989e;
    }

    @NonNull
    public StorageReference getReference() {
        String str = this.f48988d;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalStateException("FirebaseApp was not initialized with a bucket name.");
        }
        return d(new Uri.Builder().scheme("gs").authority(str).path("/").build());
    }

    @NonNull
    public StorageReference getReferenceFromUrl(@NonNull String str) {
        Preconditions.checkArgument(!TextUtils.isEmpty(str), "location must not be null or empty");
        String lowerCase = str.toLowerCase();
        if (!lowerCase.startsWith("gs://") && !lowerCase.startsWith(WebHelperKt.HTTPS_PROTOCOL) && !lowerCase.startsWith("http://")) {
            throw new IllegalArgumentException("The storage Uri could not be parsed.");
        }
        try {
            Uri uriNormalize = Util.normalize(this.f48985a, str);
            if (uriNormalize != null) {
                return d(uriNormalize);
            }
            throw new IllegalArgumentException("The storage Uri could not be parsed.");
        } catch (UnsupportedEncodingException unused) {
            throw new IllegalArgumentException("The storage Uri could not be parsed.");
        }
    }

    public void setMaxChunkUploadRetry(long j10) {
        this.f48990f = j10;
    }

    public void setMaxDownloadRetryTimeMillis(long j10) {
        this.f48991g = j10;
    }

    public void setMaxOperationRetryTimeMillis(long j10) {
        this.f48992h = j10;
    }

    public void setMaxUploadRetryTimeMillis(long j10) {
        this.f48989e = j10;
    }

    public void useEmulator(@NonNull String str, int i10) {
        this.f48993i = new EmulatedServiceSettings(str, i10);
    }

    @NonNull
    public static FirebaseStorage getInstance(@NonNull String str) {
        FirebaseApp firebaseApp = FirebaseApp.getInstance();
        Preconditions.checkArgument(firebaseApp != null, "You must call FirebaseApp.initialize() first.");
        return getInstance(firebaseApp, str);
    }

    @NonNull
    public StorageReference getReference(@NonNull String str) {
        Preconditions.checkArgument(!TextUtils.isEmpty(str), "location must not be null or empty");
        String lowerCase = str.toLowerCase();
        if (!lowerCase.startsWith("gs://") && !lowerCase.startsWith(WebHelperKt.HTTPS_PROTOCOL) && !lowerCase.startsWith("http://")) {
            return getReference().child(str);
        }
        throw new IllegalArgumentException("location should not be a full URL.");
    }

    @NonNull
    public static FirebaseStorage getInstance(@NonNull FirebaseApp firebaseApp) {
        Preconditions.checkArgument(firebaseApp != null, "Null is not a valid value for the FirebaseApp.");
        if (firebaseApp.getOptions().getStorageBucket() == null) {
            return c(firebaseApp, null);
        }
        try {
            return c(firebaseApp, Util.normalize(firebaseApp, "gs://" + firebaseApp.getOptions().getStorageBucket()));
        } catch (UnsupportedEncodingException unused) {
            throw new IllegalArgumentException("The storage Uri could not be parsed.");
        }
    }

    @NonNull
    public static FirebaseStorage getInstance(@NonNull FirebaseApp firebaseApp, @NonNull String str) {
        Preconditions.checkArgument(firebaseApp != null, "Null is not a valid value for the FirebaseApp.");
        Preconditions.checkArgument(str != null, "Null is not a valid value for the Firebase Storage URL.");
        if (str.toLowerCase().startsWith("gs://")) {
            try {
                return c(firebaseApp, Util.normalize(firebaseApp, str));
            } catch (UnsupportedEncodingException unused) {
                throw new IllegalArgumentException("The storage Uri could not be parsed.");
            }
        }
        throw new IllegalArgumentException("Please use a gs:// URL for your Firebase Storage bucket.");
    }

    public class a implements AppCheckTokenListener {
        @Override // com.google.firebase.appcheck.interop.AppCheckTokenListener
        public final void onAppCheckTokenChanged(@NonNull AppCheckTokenResult appCheckTokenResult) {
        }
    }
}
