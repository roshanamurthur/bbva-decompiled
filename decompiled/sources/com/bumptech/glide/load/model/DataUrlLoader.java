package com.bumptech.glide.load.model;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.signature.ObjectKey;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public final class DataUrlLoader<Model, Data> implements ModelLoader<Model, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataDecoder<Data> f38412a;

    public interface DataDecoder<Data> {
        void close(Data data) throws IOException;

        Data decode(String str) throws IllegalArgumentException;

        Class<Data> getDataClass();
    }

    public DataUrlLoader(DataDecoder<Data> dataDecoder) {
        this.f38412a = dataDecoder;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public ModelLoader.LoadData<Data> buildLoadData(@NonNull Model model, int i10, int i11, @NonNull Options options) {
        return new ModelLoader.LoadData<>(new ObjectKey(model), new a(model.toString(), this.f38412a));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull Model model) {
        return model.toString().startsWith("data:image");
    }

    public static final class StreamFactory<Model> implements ModelLoaderFactory<Model, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f38413a = new a();

        public class a implements DataDecoder<InputStream> {
            @Override // com.bumptech.glide.load.model.DataUrlLoader.DataDecoder
            public final void close(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // com.bumptech.glide.load.model.DataUrlLoader.DataDecoder
            public final InputStream decode(String str) throws IllegalArgumentException {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }

            @Override // com.bumptech.glide.load.model.DataUrlLoader.DataDecoder
            public final Class<InputStream> getDataClass() {
                return InputStream.class;
            }
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader<Model, InputStream> build(@NonNull MultiModelLoaderFactory multiModelLoaderFactory) {
            return new DataUrlLoader(this.f38413a);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public static final class a<Data> implements DataFetcher<Data> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final String f38414p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final DataDecoder<Data> f38415q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Data f38416r0;

        public a(String str, DataDecoder<Data> dataDecoder) {
            this.f38414p0 = str;
            this.f38415q0 = dataDecoder;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void cleanup() {
            try {
                this.f38415q0.close(this.f38416r0);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @NonNull
        public final Class<Data> getDataClass() {
            return this.f38415q0.getDataClass();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @NonNull
        public final DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void loadData(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super Data> dataCallback) {
            try {
                Data dataDecode = this.f38415q0.decode(this.f38414p0);
                this.f38416r0 = dataDecode;
                dataCallback.onDataReady(dataDecode);
            } catch (IllegalArgumentException e5) {
                dataCallback.onLoadFailed(e5);
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void cancel() {
        }
    }
}
