package com.google.firebase.storage.network;

import androidx.annotation.NonNull;
import androidx.datastore.preferences.protobuf.e;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.internal.StorageReferenceUri;
import com.mastercard.sonic.androidsvg.SVGParser;
import java.util.Collections;
import java.util.Map;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes10.dex */
public class GetNetworkRequest extends NetworkRequest {
    public GetNetworkRequest(@NonNull StorageReferenceUri storageReferenceUri, @NonNull FirebaseApp firebaseApp, long j10) {
        super(storageReferenceUri, firebaseApp);
        if (j10 != 0) {
            super.setCustomHeader("Range", e.f("bytes=", j10, Constant.DASH_STRING));
        }
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    @NonNull
    public String getAction() {
        return "GET";
    }

    @Override // com.google.firebase.storage.network.NetworkRequest
    @NonNull
    public Map<String, String> getQueryParameters() {
        return Collections.singletonMap("alt", SVGParser.XML_STYLESHEET_ATTR_MEDIA);
    }
}
