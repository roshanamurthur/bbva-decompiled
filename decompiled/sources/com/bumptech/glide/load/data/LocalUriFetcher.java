package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public abstract class LocalUriFetcher<T> implements DataFetcher<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Uri f38160p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ContentResolver f38161q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public T f38162r0;

    public LocalUriFetcher(ContentResolver contentResolver, Uri uri) {
        this.f38161q0 = contentResolver;
        this.f38160p0 = uri;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cleanup() {
        T t10 = this.f38162r0;
        if (t10 != null) {
            try {
                close(t10);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void close(T t10) throws IOException;

    @Override // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    public DataSource getDataSource() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void loadData(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super T> dataCallback) {
        try {
            T tLoadResource = loadResource(this.f38160p0, this.f38161q0);
            this.f38162r0 = tLoadResource;
            dataCallback.onDataReady(tLoadResource);
        } catch (FileNotFoundException e5) {
            dataCallback.onLoadFailed(e5);
        }
    }

    public abstract T loadResource(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cancel() {
    }
}
