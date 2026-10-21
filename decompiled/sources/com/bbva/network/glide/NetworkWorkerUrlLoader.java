package com.bbva.network.glide;

import com.bbva.network.NetworkWorker;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NetworkWorkerUrlLoader.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eJ0\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, d2 = {"Lcom/bbva/network/glide/NetworkWorkerUrlLoader;", "Lcom/bumptech/glide/load/model/ModelLoader;", "Lcom/bumptech/glide/load/model/GlideUrl;", "Ljava/io/InputStream;", "model", "", "width", "height", "Lcom/bumptech/glide/load/Options;", "options", "Lcom/bumptech/glide/load/model/ModelLoader$LoadData;", "buildLoadData", "", "handles", "Factory", "network-image_release"}, k = 1, mv = {1, 8, 0})
public final class NetworkWorkerUrlLoader implements ModelLoader<GlideUrl, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f35090a;

    public NetworkWorkerUrlLoader(NetworkWorker networkWorker, DefaultConstructorMarker defaultConstructorMarker) {
        this.f35090a = networkWorker;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NotNull GlideUrl model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return true;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    @Nullable
    public ModelLoader.LoadData<InputStream> buildLoadData(@NotNull GlideUrl model, int width, int height, @NotNull Options options) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(options, "options");
        return new ModelLoader.LoadData<>(model, new NetworkWorkerStreamFetcher(this.f35090a, model));
    }

    /* JADX INFO: compiled from: NetworkWorkerUrlLoader.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"Lcom/bbva/network/glide/NetworkWorkerUrlLoader$Factory;", "Lcom/bumptech/glide/load/model/ModelLoaderFactory;", "Lcom/bumptech/glide/load/model/GlideUrl;", "Ljava/io/InputStream;", "Lcom/bumptech/glide/load/model/MultiModelLoaderFactory;", "multiFactory", "Lcom/bumptech/glide/load/model/ModelLoader;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", "teardown", "Lcom/bbva/network/NetworkWorker;", "client", "<init>", "(Lcom/bbva/network/NetworkWorker;)V", "network-image_release"}, k = 1, mv = {1, 8, 0})
    public static final class Factory implements ModelLoaderFactory<GlideUrl, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final NetworkWorker f35091a;

        public Factory(@NotNull NetworkWorker client) {
            Intrinsics.checkNotNullParameter(client, "client");
            this.f35091a = client;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NotNull
        public ModelLoader<GlideUrl, InputStream> build(@NotNull MultiModelLoaderFactory multiFactory) {
            Intrinsics.checkNotNullParameter(multiFactory, "multiFactory");
            return new NetworkWorkerUrlLoader(this.f35091a, null);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }
}
