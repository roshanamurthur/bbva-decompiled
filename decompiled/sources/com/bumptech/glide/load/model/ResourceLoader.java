package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.fasterxml.jackson.core.JsonPointer;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public class ResourceLoader<Data> implements ModelLoader<Integer, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModelLoader<Uri, Data> f38469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f38470b;

    public ResourceLoader(Resources resources, ModelLoader<Uri, Data> modelLoader) {
        this.f38470b = resources;
        this.f38469a = modelLoader;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull Integer num) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public ModelLoader.LoadData<Data> buildLoadData(@NonNull Integer num, int i10, int i11, @NonNull Options options) {
        Uri uri;
        Resources resources = this.f38470b;
        try {
            uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num.intValue()) + JsonPointer.SEPARATOR + resources.getResourceTypeName(num.intValue()) + JsonPointer.SEPARATOR + resources.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e5) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num, e5);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f38469a.buildLoadData(uri, i10, i11, options);
    }

    public static final class AssetFileDescriptorFactory implements ModelLoaderFactory<Integer, AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f38471a;

        public AssetFileDescriptorFactory(Resources resources) {
            this.f38471a = resources;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public ModelLoader<Integer, AssetFileDescriptor> build(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ResourceLoader(this.f38471a, multiModelLoaderFactory.build(Uri.class, AssetFileDescriptor.class));
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    @Deprecated
    public static class FileDescriptorFactory implements ModelLoaderFactory<Integer, ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f38472a;

        public FileDescriptorFactory(Resources resources) {
            this.f38472a = resources;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader<Integer, ParcelFileDescriptor> build(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ResourceLoader(this.f38472a, multiModelLoaderFactory.build(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public static class StreamFactory implements ModelLoaderFactory<Integer, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f38473a;

        public StreamFactory(Resources resources) {
            this.f38473a = resources;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader<Integer, InputStream> build(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ResourceLoader(this.f38473a, multiModelLoaderFactory.build(Uri.class, InputStream.class));
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public static class UriFactory implements ModelLoaderFactory<Integer, Uri> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f38474a;

        public UriFactory(Resources resources) {
            this.f38474a = resources;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader<Integer, Uri> build(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ResourceLoader(this.f38474a, UnitModelLoader.getInstance());
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }
}
