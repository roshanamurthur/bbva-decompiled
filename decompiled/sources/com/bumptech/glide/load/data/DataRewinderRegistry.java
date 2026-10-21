package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.util.Preconditions;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class DataRewinderRegistry {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f38145b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f38146a = new HashMap();

    public class a implements DataRewinder.Factory<Object> {
        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        @NonNull
        public final DataRewinder<Object> build(@NonNull Object obj) {
            return new b(obj);
        }

        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        @NonNull
        public final Class<Object> getDataClass() {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    @NonNull
    public synchronized <T> DataRewinder<T> build(@NonNull T t10) {
        DataRewinder.Factory factory;
        try {
            Preconditions.checkNotNull(t10);
            factory = (DataRewinder.Factory) this.f38146a.get(t10.getClass());
            if (factory == null) {
                for (DataRewinder.Factory factory2 : this.f38146a.values()) {
                    if (factory2.getDataClass().isAssignableFrom(t10.getClass())) {
                        factory = factory2;
                        break;
                    }
                }
            }
            if (factory == null) {
                factory = f38145b;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return factory.build(t10);
    }

    public synchronized void register(@NonNull DataRewinder.Factory<?> factory) {
        this.f38146a.put(factory.getDataClass(), factory);
    }

    public static final class b implements DataRewinder<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f38147a;

        public b(@NonNull Object obj) {
            this.f38147a = obj;
        }

        @Override // com.bumptech.glide.load.data.DataRewinder
        @NonNull
        public final Object rewindAndGet() {
            return this.f38147a;
        }

        @Override // com.bumptech.glide.load.data.DataRewinder
        public final void cleanup() {
        }
    }
}
