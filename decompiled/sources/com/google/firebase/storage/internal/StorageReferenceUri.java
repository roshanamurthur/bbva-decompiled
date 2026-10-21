package com.google.firebase.storage.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.google.firebase.emulators.EmulatedServiceSettings;
import com.google.firebase.storage.network.NetworkRequest;

/* JADX INFO: loaded from: classes10.dex */
public class StorageReferenceUri {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f49140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f49141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f49142c;

    public StorageReferenceUri(@NonNull Uri uri) {
        this(uri, null);
    }

    @NonNull
    public Uri getGsUri() {
        return this.f49142c;
    }

    @NonNull
    public Uri getHttpBaseUri() {
        return this.f49140a;
    }

    @NonNull
    public Uri getHttpUri() {
        return this.f49141b;
    }

    public StorageReferenceUri(@NonNull Uri uri, @Nullable EmulatedServiceSettings emulatedServiceSettings) {
        Uri uri2;
        this.f49142c = uri;
        if (emulatedServiceSettings == null) {
            uri2 = NetworkRequest.PROD_BASE_URL;
        } else {
            uri2 = Uri.parse("http://" + emulatedServiceSettings.getHost() + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + emulatedServiceSettings.getPort() + "/v0");
        }
        this.f49140a = uri2;
        Uri.Builder builderAppendEncodedPath = uri2.buildUpon().appendPath("b").appendEncodedPath(uri.getAuthority());
        String strNormalizeSlashes = Slashes.normalizeSlashes(uri.getPath());
        if (strNormalizeSlashes.length() > 0 && !"/".equals(strNormalizeSlashes)) {
            builderAppendEncodedPath = builderAppendEncodedPath.appendPath("o").appendPath(strNormalizeSlashes);
        }
        this.f49141b = builderAppendEncodedPath.build();
    }
}
