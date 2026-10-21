package com.google.firebase.storage.network;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.internal.StorageReferenceUri;

/* JADX INFO: loaded from: classes10.dex */
public class ResumableUploadByteRequest extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f49176k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final byte[] f49177l;
    public final int m;

    public ResumableUploadByteRequest(@NonNull StorageReferenceUri storageReferenceUri, @NonNull FirebaseApp firebaseApp, @NonNull Uri uri, @Nullable byte[] bArr, long j10, int i10, boolean z10) {
        super(storageReferenceUri, firebaseApp);
        if (bArr == null && i10 != -1) {
            this.mException = new IllegalArgumentException("contentType is null or empty");
        }
        if (j10 < 0) {
            this.mException = new IllegalArgumentException("offset cannot be negative");
        }
        this.m = i10;
        this.f49176k = uri;
        this.f49177l = i10 <= 0 ? null : bArr;
        super.setCustomHeader("X-Goog-Upload-Protocol", "resumable");
        if (z10 && i10 > 0) {
            super.setCustomHeader("X-Goog-Upload-Command", "upload, finalize");
        } else if (z10) {
            super.setCustomHeader("X-Goog-Upload-Command", "finalize");
        } else {
            super.setCustomHeader("X-Goog-Upload-Command", "upload");
        }
        super.setCustomHeader("X-Goog-Upload-Offset", Long.toString(j10));
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    @NonNull
    public String getAction() {
        return "POST";
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    @Nullable
    public byte[] getOutputRaw() {
        return this.f49177l;
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    public int getOutputRawSize() {
        int i10 = this.m;
        if (i10 > 0) {
            return i10;
        }
        return 0;
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    @NonNull
    public Uri getURL() {
        return this.f49176k;
    }
}
