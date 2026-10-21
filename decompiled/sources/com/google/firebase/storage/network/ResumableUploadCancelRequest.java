package com.google.firebase.storage.network;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.adobe.marketing.mobile.EventDataKeys;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.internal.StorageReferenceUri;

/* JADX INFO: loaded from: classes10.dex */
public class ResumableUploadCancelRequest extends a {

    @VisibleForTesting
    public static boolean cancelCalled = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f49178k;

    public ResumableUploadCancelRequest(@NonNull StorageReferenceUri storageReferenceUri, @NonNull FirebaseApp firebaseApp, @NonNull Uri uri) {
        super(storageReferenceUri, firebaseApp);
        cancelCalled = true;
        this.f49178k = uri;
        super.setCustomHeader("X-Goog-Upload-Protocol", "resumable");
        super.setCustomHeader("X-Goog-Upload-Command", EventDataKeys.DEEPLINK_SCHEME_PATH_CANCEL);
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    @NonNull
    public String getAction() {
        return "POST";
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    @NonNull
    public Uri getURL() {
        return this.f49178k;
    }
}
