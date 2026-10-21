package com.bumptech.glide.util;

/* JADX INFO: loaded from: classes9.dex */
public final class GlideSuppliers {

    public interface GlideSupplier<T> {
        T get();
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> implements GlideSupplier<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile T f38910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ GlideSupplier f38911b;

        public a(GlideSupplier glideSupplier) {
            this.f38911b = glideSupplier;
        }

        @Override // com.bumptech.glide.util.GlideSuppliers.GlideSupplier
        public final T get() {
            if (this.f38910a == null) {
                synchronized (this) {
                    try {
                        if (this.f38910a == null) {
                            this.f38910a = (T) Preconditions.checkNotNull(this.f38911b.get());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return this.f38910a;
        }
    }

    public static <T> GlideSupplier<T> memorize(GlideSupplier<T> glideSupplier) {
        return new a(glideSupplier);
    }
}
