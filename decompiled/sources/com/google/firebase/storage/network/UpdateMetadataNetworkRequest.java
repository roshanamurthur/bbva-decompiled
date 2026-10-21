package com.google.firebase.storage.network;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.internal.StorageReferenceUri;
import com.salesforce.marketingcloud.sfmcsdk.components.http.Request;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class UpdateMetadataNetworkRequest extends NetworkRequest {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final JSONObject f49181k;

    public UpdateMetadataNetworkRequest(@NonNull StorageReferenceUri storageReferenceUri, @NonNull FirebaseApp firebaseApp, @Nullable JSONObject jSONObject) {
        super(storageReferenceUri, firebaseApp);
        this.f49181k = jSONObject;
        setCustomHeader("X-HTTP-Method-Override", "PATCH");
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    @NonNull
    public String getAction() {
        return Request.PUT;
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    @Nullable
    public JSONObject getOutputJSON() {
        return this.f49181k;
    }
}
