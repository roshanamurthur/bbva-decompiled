package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.signature.ObjectKey;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public class ByteBufferFileLoader implements ModelLoader<File, ByteBuffer> {
    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull File file) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public ModelLoader.LoadData<ByteBuffer> buildLoadData(@NonNull File file, int i10, int i11, @NonNull Options options) {
        return new ModelLoader.LoadData<>(new ObjectKey(file), new a(file));
    }

    public static class Factory implements ModelLoaderFactory<File, ByteBuffer> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader<File, ByteBuffer> build(@NonNull MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ByteBufferFileLoader();
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public static final class a implements DataFetcher<ByteBuffer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final File f38411p0;

        public a(File file) {
            this.f38411p0 = file;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @NonNull
        public final Class<ByteBuffer> getDataClass() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @NonNull
        public final DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void loadData(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super ByteBuffer> dataCallback) {
            try {
                dataCallback.onDataReady(ByteBufferUtil.fromFile(this.f38411p0));
            } catch (IOException e5) {
                dataCallback.onLoadFailed(e5);
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void cleanup() {
        }
    }
}
