package com.bbva.glomohybrid.network;

import android.content.Context;
import android.graphics.Bitmap;
import com.bbva.glomoutils.network.ImageFetcher;
import com.bbva.network.glide.NetworkImageFetcher;
import com.bbva.plugin.filefetcher.command.FetchCommand;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NetworkImageWorker.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/network/NetworkImageWorker;", "Lcom/bbva/glomoutils/network/ImageFetcher;", "", "url", "Landroid/graphics/Bitmap;", FetchCommand.ID, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class NetworkImageWorker implements ImageFetcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f33811a;

    public NetworkImageWorker(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f33811a = context;
    }

    @Override // com.bbva.glomoutils.network.ImageFetcher
    @Nullable
    public Object fetch(@NotNull String str, @NotNull Continuation<? super Bitmap> continuation) {
        return NetworkImageFetcher.fetch$default(NetworkImageFetcher.INSTANCE, this.f33811a, str, null, continuation, 4, null);
    }
}
