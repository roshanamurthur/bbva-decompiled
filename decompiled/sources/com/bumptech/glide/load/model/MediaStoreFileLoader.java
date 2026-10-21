package com.bumptech.glide.load.model;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.bumptech.glide.signature.ObjectKey;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes9.dex */
public final class MediaStoreFileLoader implements ModelLoader<Uri, File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38446a;

    public MediaStoreFileLoader(Context context) {
        this.f38446a = context;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public ModelLoader.LoadData<File> buildLoadData(@NonNull Uri uri, int i10, int i11, @NonNull Options options) {
        return new ModelLoader.LoadData<>(new ObjectKey(uri), new a(this.f38446a, uri));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull Uri uri) {
        return MediaStoreUtil.isMediaStoreUri(uri);
    }

    public static final class Factory implements ModelLoaderFactory<Uri, File> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f38447a;

        public Factory(Context context) {
            this.f38447a = context;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader<Uri, File> build(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new MediaStoreFileLoader(this.f38447a);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public static class a implements DataFetcher<File> {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static final String[] f38448r0 = {"_data"};

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Context f38449p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Uri f38450q0;

        public a(Context context, Uri uri) {
            this.f38449p0 = context;
            this.f38450q0 = uri;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @NonNull
        public final Class<File> getDataClass() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @NonNull
        public final DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void loadData(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super File> dataCallback) {
            Cursor cursorQuery = this.f38449p0.getContentResolver().query(this.f38450q0, f38448r0, null, null, null);
            String string = null;
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th2) {
                    cursorQuery.close();
                    throw th2;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                dataCallback.onDataReady(new File(string));
                return;
            }
            dataCallback.onLoadFailed(new FileNotFoundException("Failed to find file path for: " + this.f38450q0));
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void cleanup() {
        }
    }
}
