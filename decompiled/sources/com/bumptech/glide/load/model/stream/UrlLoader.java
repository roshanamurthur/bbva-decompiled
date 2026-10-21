package com.bumptech.glide.load.model.stream;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes9.dex */
public class UrlLoader implements ModelLoader<URL, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModelLoader<GlideUrl, InputStream> f38522a;

    public UrlLoader(ModelLoader<GlideUrl, InputStream> modelLoader) {
        this.f38522a = modelLoader;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull URL url) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public ModelLoader.LoadData<InputStream> buildLoadData(@NonNull URL url, int i10, int i11, @NonNull Options options) {
        return this.f38522a.buildLoadData(new GlideUrl(url), i10, i11, options);
    }

    public static class StreamFactory implements ModelLoaderFactory<URL, InputStream> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader<URL, InputStream> build(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new UrlLoader(multiModelLoaderFactory.build(GlideUrl.class, InputStream.class));
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }
}
