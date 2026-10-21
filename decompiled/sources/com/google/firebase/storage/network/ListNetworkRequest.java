package com.google.firebase.storage.network;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.internal.StorageReferenceUri;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class ListNetworkRequest extends NetworkRequest {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final Integer f49164k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final String f49165l;

    public ListNetworkRequest(@NonNull StorageReferenceUri storageReferenceUri, @NonNull FirebaseApp firebaseApp, @Nullable Integer num, @Nullable String str) {
        super(storageReferenceUri, firebaseApp);
        this.f49164k = num;
        this.f49165l = str;
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    @NonNull
    public String getAction() {
        return "GET";
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
        if (!path.isEmpty()) {
            map.put("prefix", path.concat("/"));
        }
        map.put("delimiter", "/");
        Integer num = this.f49164k;
        if (num != null) {
            map.put("maxResults", Integer.toString(num.intValue()));
        }
        String str = this.f49165l;
        if (!TextUtils.isEmpty(str)) {
            map.put("pageToken", str);
        }
        return map;
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    @NonNull
    public Uri getURL() {
        return Uri.parse(getStorageReferenceUri().getHttpBaseUri() + "/b/" + getStorageReferenceUri().getGsUri().getAuthority() + "/o");
    }
}
