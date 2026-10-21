package com.bumptech.glide;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bbva.glomohybrid.GlideRequests;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.manager.RequestManagerTreeNode;

/* JADX INFO: compiled from: GeneratedRequestManagerFactory.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a implements RequestManagerRetriever.RequestManagerFactory {
    @Override // com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory
    @NonNull
    public final RequestManager build(@NonNull Glide glide, @NonNull Lifecycle lifecycle, @NonNull RequestManagerTreeNode requestManagerTreeNode, @NonNull Context context) {
        return new GlideRequests(glide, lifecycle, requestManagerTreeNode, context);
    }
}
