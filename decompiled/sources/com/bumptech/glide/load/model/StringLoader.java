package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public class StringLoader<Data> implements ModelLoader<String, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModelLoader<Uri, Data> f38480a;

    public StringLoader(ModelLoader<Uri, Data> modelLoader) {
        this.f38480a = modelLoader;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull String str) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public ModelLoader.LoadData<Data> buildLoadData(@NonNull String str, int i10, int i11, @NonNull Options options) {
        Uri uriFromFile;
        if (TextUtils.isEmpty(str)) {
            uriFromFile = null;
        } else if (str.charAt(0) == '/') {
            uriFromFile = Uri.fromFile(new File(str));
        } else {
            Uri uri = Uri.parse(str);
            uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str)) : uri;
        }
        if (uriFromFile != null) {
            ModelLoader<Uri, Data> modelLoader = this.f38480a;
            if (modelLoader.handles(uriFromFile)) {
                return modelLoader.buildLoadData(uriFromFile, i10, i11, options);
            }
        }
        return null;
    }

    public static final class AssetFileDescriptorFactory implements ModelLoaderFactory<String, AssetFileDescriptor> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public ModelLoader<String, AssetFileDescriptor> build(@NonNull MultiModelLoaderFactory multiModelLoaderFactory) {
            return new StringLoader(multiModelLoaderFactory.build(Uri.class, AssetFileDescriptor.class));
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public static class FileDescriptorFactory implements ModelLoaderFactory<String, ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader<String, ParcelFileDescriptor> build(@NonNull MultiModelLoaderFactory multiModelLoaderFactory) {
            return new StringLoader(multiModelLoaderFactory.build(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public static class StreamFactory implements ModelLoaderFactory<String, InputStream> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader<String, InputStream> build(@NonNull MultiModelLoaderFactory multiModelLoaderFactory) {
            return new StringLoader(multiModelLoaderFactory.build(Uri.class, InputStream.class));
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }
}
