package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AssetPathFetcher<T> implements DataFetcher<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f38138p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AssetManager f38139q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public T f38140r0;

    public AssetPathFetcher(AssetManager assetManager, String str) {
        this.f38139q0 = assetManager;
        this.f38138p0 = str;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cleanup() {
        T t10 = this.f38140r0;
        if (t10 == null) {
            return;
        }
        try {
            close(t10);
        } catch (IOException unused) {
        }
    }

    public abstract void close(T t10) throws IOException;

    @Override // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    public DataSource getDataSource() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void loadData(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super T> dataCallback) {
        try {
            T tLoadResource = loadResource(this.f38139q0, this.f38138p0);
            this.f38140r0 = tLoadResource;
            dataCallback.onDataReady(tLoadResource);
        } catch (IOException e5) {
            dataCallback.onLoadFailed(e5);
        }
    }

    public abstract T loadResource(AssetManager assetManager, String str) throws IOException;

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cancel() {
    }
}
