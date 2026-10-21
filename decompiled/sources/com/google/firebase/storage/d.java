package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.internal.ExponentialBackoffSender;
import com.google.firebase.storage.network.GetMetadataNetworkRequest;
import com.mastercard.sonic.androidsvg.SVGParser;

/* JADX INFO: compiled from: GetDownloadUrlTask.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public StorageReference f49103p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public TaskCompletionSource<Uri> f49104q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ExponentialBackoffSender f49105r0;

    @Override // java.lang.Runnable
    public final void run() {
        StorageReference storageReference = this.f49103p0;
        GetMetadataNetworkRequest getMetadataNetworkRequest = new GetMetadataNetworkRequest(storageReference.b(), storageReference.a());
        this.f49105r0.sendWithExponentialBackoff(getMetadataNetworkRequest);
        Uri uriBuild = null;
        if (getMetadataNetworkRequest.isResultSuccess()) {
            String strOptString = getMetadataNetworkRequest.getResultBody().optString("downloadTokens");
            if (!TextUtils.isEmpty(strOptString)) {
                String str = strOptString.split(",", -1)[0];
                Uri.Builder builderBuildUpon = storageReference.b().getHttpUri().buildUpon();
                builderBuildUpon.appendQueryParameter("alt", SVGParser.XML_STYLESHEET_ATTR_MEDIA);
                builderBuildUpon.appendQueryParameter("token", str);
                uriBuild = builderBuildUpon.build();
            }
        }
        TaskCompletionSource<Uri> taskCompletionSource = this.f49104q0;
        if (taskCompletionSource != null) {
            getMetadataNetworkRequest.completeTask(taskCompletionSource, uriBuild);
        }
    }
}
