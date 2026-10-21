package com.bumptech.glide.load.model;

import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.signature.ObjectKey;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public class FileLoader<Data> implements ModelLoader<File, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileOpener<Data> f38427a;

    public static class FileDescriptorFactory extends Factory<ParcelFileDescriptor> {

        public class a implements FileOpener<ParcelFileDescriptor> {
            @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
            public final void close(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
            public final Class<ParcelFileDescriptor> getDataClass() {
                return ParcelFileDescriptor.class;
            }

            @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
            public final ParcelFileDescriptor open(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public FileDescriptorFactory() {
            super(new a());
        }
    }

    public interface FileOpener<Data> {
        void close(Data data) throws IOException;

        Class<Data> getDataClass();

        Data open(File file) throws FileNotFoundException;
    }

    public static class StreamFactory extends Factory<InputStream> {

        public class a implements FileOpener<InputStream> {
            @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
            public final void close(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
            public final Class<InputStream> getDataClass() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
            public final InputStream open(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public StreamFactory() {
            super(new a());
        }
    }

    public FileLoader(FileOpener<Data> fileOpener) {
        this.f38427a = fileOpener;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull File file) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public ModelLoader.LoadData<Data> buildLoadData(@NonNull File file, int i10, int i11, @NonNull Options options) {
        return new ModelLoader.LoadData<>(new ObjectKey(file), new a(file, this.f38427a));
    }

    public static class Factory<Data> implements ModelLoaderFactory<File, Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FileOpener<Data> f38428a;

        public Factory(FileOpener<Data> fileOpener) {
            this.f38428a = fileOpener;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public final ModelLoader<File, Data> build(@NonNull MultiModelLoaderFactory multiModelLoaderFactory) {
            return new FileLoader(this.f38428a);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final void teardown() {
        }
    }

    public static final class a<Data> implements DataFetcher<Data> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final File f38429p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final FileOpener<Data> f38430q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Data f38431r0;

        public a(File file, FileOpener<Data> fileOpener) {
            this.f38429p0 = file;
            this.f38430q0 = fileOpener;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void cleanup() {
            Data data = this.f38431r0;
            if (data != null) {
                try {
                    this.f38430q0.close(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @NonNull
        public final Class<Data> getDataClass() {
            return this.f38430q0.getDataClass();
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
                Data dataOpen = this.f38430q0.open(this.f38429p0);
                this.f38431r0 = dataOpen;
                dataCallback.onDataReady(dataOpen);
            } catch (FileNotFoundException e5) {
                dataCallback.onLoadFailed(e5);
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void cancel() {
        }
    }
}
