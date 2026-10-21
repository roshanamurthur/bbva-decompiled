package com.google.firebase.storage.network;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adobe.marketing.mobile.EventDataKeys;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.internal.StorageReferenceUri;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class ResumableUploadStartRequest extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final JSONObject f49180k;

    public ResumableUploadStartRequest(@NonNull StorageReferenceUri storageReferenceUri, @NonNull FirebaseApp firebaseApp, @Nullable JSONObject jSONObject, @NonNull String str) {
        super(storageReferenceUri, firebaseApp);
        this.f49180k = jSONObject;
        if (TextUtils.isEmpty(str)) {
            this.mException = new IllegalArgumentException("mContentType is null or empty");
        }
        super.setCustomHeader("X-Goog-Upload-Protocol", "resumable");
        super.setCustomHeader("X-Goog-Upload-Command", EventDataKeys.Lifecycle.LIFECYCLE_START);
        super.setCustomHeader("X-Goog-Upload-Header-Content-Type", str);
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    @NonNull
    public String getAction() {
        return "POST";
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    @Nullable
    public JSONObject getOutputJSON() {
        return this.f49180k;
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    @NonNull
    public Map<String, String> getQueryParameters() {
        HashMap map = new HashMap();
        String path = this.f49167a.getGsUri().getPath();
        if (path == null) {
            path = "";
        } else if (path.startsWith("/")) {
            path = path.substring(1);
        }
        map.put("name", path);
        map.put("uploadType", "resumable");
        return map;
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    @NonNull
    public Uri getURL() {
        String authority = getStorageReferenceUri().getGsUri().getAuthority();
        Uri.Builder builderBuildUpon = getStorageReferenceUri().getHttpBaseUri().buildUpon();
        builderBuildUpon.appendPath("b");
        builderBuildUpon.appendPath(authority);
        builderBuildUpon.appendPath("o");
        return builderBuildUpon.build();
    }
}
