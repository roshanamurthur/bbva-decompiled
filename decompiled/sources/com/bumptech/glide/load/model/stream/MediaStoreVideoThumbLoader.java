package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.bumptech.glide.load.data.mediastore.ThumbFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.signature.ObjectKey;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public class MediaStoreVideoThumbLoader implements ModelLoader<Uri, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38505a;

    public MediaStoreVideoThumbLoader(Context context) {
        this.f38505a = context.getApplicationContext();
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    @Nullable
    public ModelLoader.LoadData<InputStream> buildLoadData(@NonNull Uri uri, int i10, int i11, @NonNull Options options) {
        Long l6;
        if (MediaStoreUtil.isThumbnailSize(i10, i11) && (l6 = (Long) options.get(VideoDecoder.TARGET_FRAME)) != null && l6.longValue() == -1) {
            return new ModelLoader.LoadData<>(new ObjectKey(uri), ThumbFetcher.buildVideoFetcher(this.f38505a, uri));
        }
        return null;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull Uri uri) {
        return MediaStoreUtil.isMediaStoreVideoUri(uri);
    }

    public static class Factory implements ModelLoaderFactory<Uri, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f38506a;

        public Factory(Context context) {
            this.f38506a = context;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader<Uri, InputStream> build(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new MediaStoreVideoThumbLoader(this.f38506a);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }
}
