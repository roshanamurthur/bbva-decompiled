package com.bumptech.glide.load.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Options;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class ResourceUriLoader<DataT> implements ModelLoader<Uri, DataT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ModelLoader<Integer, DataT> f38476b;

    public ResourceUriLoader(Context context, ModelLoader<Integer, DataT> modelLoader) {
        this.f38475a = context.getApplicationContext();
        this.f38476b = modelLoader;
    }

    public static ModelLoaderFactory<Uri, AssetFileDescriptor> newAssetFileDescriptorFactory(Context context) {
        return new a(context);
    }

    public static ModelLoaderFactory<Uri, InputStream> newStreamFactory(Context context) {
        return new b(context);
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    @Nullable
    public ModelLoader.LoadData<DataT> buildLoadData(@NonNull Uri uri, int i10, int i11, @NonNull Options options) {
        List<String> pathSegments = uri.getPathSegments();
        int size = pathSegments.size();
        ModelLoader<Integer, DataT> modelLoader = this.f38476b;
        ModelLoader.LoadData<DataT> loadDataBuildLoadData = null;
        if (size == 1) {
            try {
                int i12 = Integer.parseInt(uri.getPathSegments().get(0));
                if (i12 != 0) {
                    loadDataBuildLoadData = modelLoader.buildLoadData(Integer.valueOf(i12), i10, i11, options);
                } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
                }
            } catch (NumberFormatException e5) {
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e5);
                }
            }
            return loadDataBuildLoadData;
        }
        if (pathSegments.size() != 2) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
            }
            return null;
        }
        List<String> pathSegments2 = uri.getPathSegments();
        String str = pathSegments2.get(0);
        String str2 = pathSegments2.get(1);
        Context context = this.f38475a;
        int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
        if (identifier != 0) {
            return modelLoader.buildLoadData(Integer.valueOf(identifier), i10, i11, options);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
        return null;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.f38475a.getPackageName().equals(uri.getAuthority());
    }

    public static final class a implements ModelLoaderFactory<Uri, AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f38477a;

        public a(Context context) {
            this.f38477a = context;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public final ModelLoader<Uri, AssetFileDescriptor> build(@NonNull MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ResourceUriLoader(this.f38477a, multiModelLoaderFactory.build(Integer.class, AssetFileDescriptor.class));
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final void teardown() {
        }
    }

    public static final class b implements ModelLoaderFactory<Uri, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f38478a;

        public b(Context context) {
            this.f38478a = context;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public final ModelLoader<Uri, InputStream> build(@NonNull MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ResourceUriLoader(this.f38478a, multiModelLoaderFactory.build(Integer.class, InputStream.class));
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final void teardown() {
        }
    }
}
