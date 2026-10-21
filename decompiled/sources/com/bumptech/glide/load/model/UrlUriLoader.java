package com.bumptech.glide.load.model;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.webkit.ProxyConfig;
import com.bumptech.glide.load.Options;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class UrlUriLoader<Data> implements ModelLoader<Uri, Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<String> f38489b = Collections.unmodifiableSet(new HashSet(Arrays.asList(ProxyConfig.MATCH_HTTP, ProxyConfig.MATCH_HTTPS)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModelLoader<GlideUrl, Data> f38490a;

    public UrlUriLoader(ModelLoader<GlideUrl, Data> modelLoader) {
        this.f38490a = modelLoader;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public ModelLoader.LoadData<Data> buildLoadData(@NonNull Uri uri, int i10, int i11, @NonNull Options options) {
        return this.f38490a.buildLoadData(new GlideUrl(uri.toString()), i10, i11, options);
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull Uri uri) {
        return f38489b.contains(uri.getScheme());
    }

    public static class StreamFactory implements ModelLoaderFactory<Uri, InputStream> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader<Uri, InputStream> build(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new UrlUriLoader(multiModelLoaderFactory.build(GlideUrl.class, InputStream.class));
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }
}
