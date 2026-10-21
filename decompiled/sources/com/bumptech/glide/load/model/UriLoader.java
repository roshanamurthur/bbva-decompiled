package com.bumptech.glide.load.model;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.AssetFileDescriptorLocalUriFetcher;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.FileDescriptorLocalUriFetcher;
import com.bumptech.glide.load.data.StreamLocalUriFetcher;
import com.bumptech.glide.signature.ObjectKey;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class UriLoader<Data> implements ModelLoader<Uri, Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<String> f38484b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalUriFetcherFactory<Data> f38485a;

    public static final class AssetFileDescriptorFactory implements ModelLoaderFactory<Uri, AssetFileDescriptor>, LocalUriFetcherFactory<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f38486a;

        public AssetFileDescriptorFactory(ContentResolver contentResolver) {
            this.f38486a = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public ModelLoader<Uri, AssetFileDescriptor> build(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new UriLoader(this);
        }

        @Override // com.bumptech.glide.load.model.UriLoader.LocalUriFetcherFactory
        public DataFetcher<AssetFileDescriptor> build(Uri uri) {
            return new AssetFileDescriptorLocalUriFetcher(this.f38486a, uri);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public static class FileDescriptorFactory implements ModelLoaderFactory<Uri, ParcelFileDescriptor>, LocalUriFetcherFactory<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f38487a;

        public FileDescriptorFactory(ContentResolver contentResolver) {
            this.f38487a = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.UriLoader.LocalUriFetcherFactory
        public DataFetcher<ParcelFileDescriptor> build(Uri uri) {
            return new FileDescriptorLocalUriFetcher(this.f38487a, uri);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader<Uri, ParcelFileDescriptor> build(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new UriLoader(this);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public interface LocalUriFetcherFactory<Data> {
        DataFetcher<Data> build(Uri uri);
    }

    public static class StreamFactory implements ModelLoaderFactory<Uri, InputStream>, LocalUriFetcherFactory<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f38488a;

        public StreamFactory(ContentResolver contentResolver) {
            this.f38488a = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.UriLoader.LocalUriFetcherFactory
        public DataFetcher<InputStream> build(Uri uri) {
            return new StreamLocalUriFetcher(this.f38488a, uri);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader<Uri, InputStream> build(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new UriLoader(this);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public UriLoader(LocalUriFetcherFactory<Data> localUriFetcherFactory) {
        this.f38485a = localUriFetcherFactory;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public ModelLoader.LoadData<Data> buildLoadData(@NonNull Uri uri, int i10, int i11, @NonNull Options options) {
        return new ModelLoader.LoadData<>(new ObjectKey(uri), this.f38485a.build(uri));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull Uri uri) {
        return f38484b.contains(uri.getScheme());
    }
}
