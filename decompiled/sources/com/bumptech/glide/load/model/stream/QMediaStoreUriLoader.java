package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.bumptech.glide.signature.ObjectKey;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
@RequiresApi(29)
public final class QMediaStoreUriLoader<DataT> implements ModelLoader<Uri, DataT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ModelLoader<File, DataT> f38508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ModelLoader<Uri, DataT> f38509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class<DataT> f38510d;

    @RequiresApi(29)
    public static final class FileDescriptorFactory extends a<ParcelFileDescriptor> {
        public FileDescriptorFactory(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    @RequiresApi(29)
    public static final class InputStreamFactory extends a<InputStream> {
        public InputStreamFactory(Context context) {
            super(context, InputStream.class);
        }
    }

    public static final class b<DataT> implements DataFetcher<DataT> {
        public static final String[] E0 = {"_data"};

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Context f38513p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ModelLoader<File, DataT> f38514q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final ModelLoader<Uri, DataT> f38515r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Uri f38516s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final int f38517t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final int f38518u0;
        public final Options v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final Class<DataT> f38519w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f38520x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        @Nullable
        public volatile DataFetcher<DataT> f38521y0;

        public b(Context context, ModelLoader<File, DataT> modelLoader, ModelLoader<Uri, DataT> modelLoader2, Uri uri, int i10, int i11, Options options, Class<DataT> cls) {
            this.f38513p0 = context.getApplicationContext();
            this.f38514q0 = modelLoader;
            this.f38515r0 = modelLoader2;
            this.f38516s0 = uri;
            this.f38517t0 = i10;
            this.f38518u0 = i11;
            this.v0 = options;
            this.f38519w0 = cls;
        }

        @Nullable
        public final DataFetcher<DataT> a() throws Throwable {
            ModelLoader.LoadData<DataT> loadDataBuildLoadData;
            boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
            Cursor cursor = null;
            Context context = this.f38513p0;
            Options options = this.v0;
            int i10 = this.f38518u0;
            int i11 = this.f38517t0;
            if (zIsExternalStorageLegacy) {
                Uri uri = this.f38516s0;
                try {
                    Cursor cursorQuery = context.getContentResolver().query(uri, E0, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                                }
                                File file = new File(string);
                                cursorQuery.close();
                                loadDataBuildLoadData = this.f38514q0.buildLoadData(file, i11, i10, options);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                Uri requireOriginal = this.f38516s0;
                boolean zIsAndroidPickerUri = MediaStoreUtil.isAndroidPickerUri(requireOriginal);
                ModelLoader<Uri, DataT> modelLoader = this.f38515r0;
                if (zIsAndroidPickerUri) {
                    loadDataBuildLoadData = modelLoader.buildLoadData(requireOriginal, i11, i10, options);
                } else {
                    if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                        requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                    }
                    loadDataBuildLoadData = modelLoader.buildLoadData(requireOriginal, i11, i10, options);
                }
            }
            if (loadDataBuildLoadData != null) {
                return loadDataBuildLoadData.fetcher;
            }
            return null;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void cancel() {
            this.f38520x0 = true;
            DataFetcher<DataT> dataFetcher = this.f38521y0;
            if (dataFetcher != null) {
                dataFetcher.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void cleanup() {
            DataFetcher<DataT> dataFetcher = this.f38521y0;
            if (dataFetcher != null) {
                dataFetcher.cleanup();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @NonNull
        public final Class<DataT> getDataClass() {
            return this.f38519w0;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @NonNull
        public final DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void loadData(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super DataT> dataCallback) throws Throwable {
            try {
                DataFetcher<DataT> dataFetcherA = a();
                if (dataFetcherA == null) {
                    dataCallback.onLoadFailed(new IllegalArgumentException("Failed to build fetcher for: " + this.f38516s0));
                } else {
                    this.f38521y0 = dataFetcherA;
                    if (this.f38520x0) {
                        cancel();
                    } else {
                        dataFetcherA.loadData(priority, dataCallback);
                    }
                }
            } catch (FileNotFoundException e5) {
                dataCallback.onLoadFailed(e5);
            }
        }
    }

    public QMediaStoreUriLoader(Context context, ModelLoader<File, DataT> modelLoader, ModelLoader<Uri, DataT> modelLoader2, Class<DataT> cls) {
        this.f38507a = context.getApplicationContext();
        this.f38508b = modelLoader;
        this.f38509c = modelLoader2;
        this.f38510d = cls;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public ModelLoader.LoadData<DataT> buildLoadData(@NonNull Uri uri, int i10, int i11, @NonNull Options options) {
        return new ModelLoader.LoadData<>(new ObjectKey(uri), new b(this.f38507a, this.f38508b, this.f38509c, uri, i10, i11, options, this.f38510d));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && MediaStoreUtil.isMediaStoreUri(uri);
    }

    public static abstract class a<DataT> implements ModelLoaderFactory<Uri, DataT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f38511a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<DataT> f38512b;

        public a(Context context, Class<DataT> cls) {
            this.f38511a = context;
            this.f38512b = cls;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public final ModelLoader<Uri, DataT> build(@NonNull MultiModelLoaderFactory multiModelLoaderFactory) {
            Class<DataT> cls = this.f38512b;
            return new QMediaStoreUriLoader(this.f38511a, multiModelLoaderFactory.build(File.class, cls), multiModelLoaderFactory.build(Uri.class, cls), cls);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final void teardown() {
        }
    }
}
