package com.google.firebase.storage.network;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.internal.StorageReferenceUri;

/* JADX INFO: loaded from: classes10.dex */
public class ResumableUploadQueryRequest extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f49179k;

    public ResumableUploadQueryRequest(@NonNull StorageReferenceUri storageReferenceUri, @NonNull FirebaseApp firebaseApp, @NonNull Uri uri) {
        super(storageReferenceUri, firebaseApp);
        this.f49179k = uri;
        super.setCustomHeader("X-Goog-Upload-Protocol", "resumable");
        super.setCustomHeader("X-Goog-Upload-Command", SearchIntents.EXTRA_QUERY);
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    @NonNull
    public String getAction() {
        return "POST";
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    @NonNull
    public Uri getURL() {
        return this.f49179k;
    }
}
