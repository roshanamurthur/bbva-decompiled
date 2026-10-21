package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.signature.ObjectKey;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public class ByteArrayLoader<Data> implements ModelLoader<byte[], Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Converter<Data> f38408a;

    public interface Converter<Data> {
        Data convert(byte[] bArr);

        Class<Data> getDataClass();
    }

    public ByteArrayLoader(Converter<Data> converter) {
        this.f38408a = converter;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull byte[] bArr) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public ModelLoader.LoadData<Data> buildLoadData(@NonNull byte[] bArr, int i10, int i11, @NonNull Options options) {
        return new ModelLoader.LoadData<>(new ObjectKey(bArr), new a(bArr, this.f38408a));
    }

    public static class ByteBufferFactory implements ModelLoaderFactory<byte[], ByteBuffer> {

        public class a implements Converter<ByteBuffer> {
            @Override // com.bumptech.glide.load.model.ByteArrayLoader.Converter
            public final ByteBuffer convert(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }

            @Override // com.bumptech.glide.load.model.ByteArrayLoader.Converter
            public final Class<ByteBuffer> getDataClass() {
                return ByteBuffer.class;
            }
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader<byte[], ByteBuffer> build(@NonNull MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ByteArrayLoader(new a());
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public static class StreamFactory implements ModelLoaderFactory<byte[], InputStream> {

        public class a implements Converter<InputStream> {
            @Override // com.bumptech.glide.load.model.ByteArrayLoader.Converter
            public final InputStream convert(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }

            @Override // com.bumptech.glide.load.model.ByteArrayLoader.Converter
            public final Class<InputStream> getDataClass() {
                return InputStream.class;
            }
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader<byte[], InputStream> build(@NonNull MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ByteArrayLoader(new a());
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public static class a<Data> implements DataFetcher<Data> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final byte[] f38409p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Converter<Data> f38410q0;

        public a(byte[] bArr, Converter<Data> converter) {
            this.f38409p0 = bArr;
            this.f38410q0 = converter;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @NonNull
        public final Class<Data> getDataClass() {
            return this.f38410q0.getDataClass();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @NonNull
        public final DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void loadData(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super Data> dataCallback) {
            dataCallback.onDataReady(this.f38410q0.convert(this.f38409p0));
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void cleanup() {
        }
    }
}
