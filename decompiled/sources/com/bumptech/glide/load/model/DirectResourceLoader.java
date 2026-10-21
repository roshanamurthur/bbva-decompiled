package com.bumptech.glide.load.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.resource.drawable.DrawableDecoderCompat;
import com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder;
import com.bumptech.glide.signature.ObjectKey;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public final class DirectResourceLoader<DataT> implements ModelLoader<Integer, DataT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e<DataT> f38418b;

    public interface e<DataT> {
        Object a(Resources resources, int i10, @Nullable Resources.Theme theme);

        void close(DataT datat) throws IOException;

        Class<DataT> getDataClass();
    }

    public DirectResourceLoader(Context context, e<DataT> eVar) {
        this.f38417a = context.getApplicationContext();
        this.f38418b = eVar;
    }

    public static ModelLoaderFactory<Integer, AssetFileDescriptor> assetFileDescriptorFactory(Context context) {
        return new a(context);
    }

    public static ModelLoaderFactory<Integer, Drawable> drawableFactory(Context context) {
        return new b(context);
    }

    public static ModelLoaderFactory<Integer, InputStream> inputStreamFactory(Context context) {
        return new c(context);
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull Integer num) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public ModelLoader.LoadData<DataT> buildLoadData(@NonNull Integer num, int i10, int i11, @NonNull Options options) {
        Resources.Theme theme = (Resources.Theme) options.get(ResourceDrawableDecoder.THEME);
        return new ModelLoader.LoadData<>(new ObjectKey(num), new d(theme, theme != null ? theme.getResources() : this.f38417a.getResources(), this.f38418b, num.intValue()));
    }

    public static final class a implements ModelLoaderFactory<Integer, AssetFileDescriptor>, e<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f38419a;

        public a(Context context) {
            this.f38419a = context;
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.e
        public final Object a(Resources resources, int i10, @Nullable Resources.Theme theme) {
            return resources.openRawResourceFd(i10);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public final ModelLoader<Integer, AssetFileDescriptor> build(@NonNull MultiModelLoaderFactory multiModelLoaderFactory) {
            return new DirectResourceLoader(this.f38419a, this);
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.e
        public final void close(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.e
        public final Class<AssetFileDescriptor> getDataClass() {
            return AssetFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final void teardown() {
        }
    }

    public static final class b implements ModelLoaderFactory<Integer, Drawable>, e<Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f38420a;

        public b(Context context) {
            this.f38420a = context;
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.e
        public final Object a(Resources resources, int i10, @Nullable Resources.Theme theme) {
            return DrawableDecoderCompat.getDrawable(this.f38420a, i10, theme);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public final ModelLoader<Integer, Drawable> build(@NonNull MultiModelLoaderFactory multiModelLoaderFactory) {
            return new DirectResourceLoader(this.f38420a, this);
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.e
        public final /* bridge */ /* synthetic */ void close(Drawable drawable) throws IOException {
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.e
        public final Class<Drawable> getDataClass() {
            return Drawable.class;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final void teardown() {
        }
    }

    public static final class c implements ModelLoaderFactory<Integer, InputStream>, e<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f38421a;

        public c(Context context) {
            this.f38421a = context;
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.e
        public final Object a(Resources resources, int i10, @Nullable Resources.Theme theme) {
            return resources.openRawResource(i10);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public final ModelLoader<Integer, InputStream> build(@NonNull MultiModelLoaderFactory multiModelLoaderFactory) {
            return new DirectResourceLoader(this.f38421a, this);
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.e
        public final void close(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.e
        public final Class<InputStream> getDataClass() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final void teardown() {
        }
    }

    public static final class d<DataT> implements DataFetcher<DataT> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @Nullable
        public final Resources.Theme f38422p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Resources f38423q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final e<DataT> f38424r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f38425s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        @Nullable
        public DataT f38426t0;

        public d(@Nullable Resources.Theme theme, Resources resources, e<DataT> eVar, int i10) {
            this.f38422p0 = theme;
            this.f38423q0 = resources;
            this.f38424r0 = eVar;
            this.f38425s0 = i10;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void cleanup() {
            DataT datat = this.f38426t0;
            if (datat != null) {
                try {
                    this.f38424r0.close(datat);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @NonNull
        public final Class<DataT> getDataClass() {
            return this.f38424r0.getDataClass();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @NonNull
        public final DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [DataT, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void loadData(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super DataT> dataCallback) {
            try {
                ?? r4 = (DataT) this.f38424r0.a(this.f38423q0, this.f38425s0, this.f38422p0);
                this.f38426t0 = r4;
                dataCallback.onDataReady(r4);
            } catch (Resources.NotFoundException e5) {
                dataCallback.onLoadFailed(e5);
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void cancel() {
        }
    }
}
