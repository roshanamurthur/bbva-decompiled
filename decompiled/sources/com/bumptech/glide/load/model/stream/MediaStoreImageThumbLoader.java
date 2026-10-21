package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.bumptech.glide.load.data.mediastore.ThumbFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.bumptech.glide.signature.ObjectKey;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public class MediaStoreImageThumbLoader implements ModelLoader<Uri, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38503a;

    public MediaStoreImageThumbLoader(Context context) {
        this.f38503a = context.getApplicationContext();
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public ModelLoader.LoadData<InputStream> buildLoadData(@NonNull Uri uri, int i10, int i11, @NonNull Options options) {
        if (MediaStoreUtil.isThumbnailSize(i10, i11)) {
            return new ModelLoader.LoadData<>(new ObjectKey(uri), ThumbFetcher.buildImageFetcher(this.f38503a, uri));
        }
        return null;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull Uri uri) {
        return MediaStoreUtil.isMediaStoreImageUri(uri);
    }

    public static class Factory implements ModelLoaderFactory<Uri, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f38504a;

        public Factory(Context context) {
            this.f38504a = context;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader<Uri, InputStream> build(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new MediaStoreImageThumbLoader(this.f38504a);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }
}
