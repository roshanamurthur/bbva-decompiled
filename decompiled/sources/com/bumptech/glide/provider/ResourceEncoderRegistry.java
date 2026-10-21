package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.ResourceEncoder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class ResourceEncoderRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f38753a = new ArrayList();

    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<T> f38754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ResourceEncoder<T> f38755b;

        public a(@NonNull Class<T> cls, @NonNull ResourceEncoder<T> resourceEncoder) {
            this.f38754a = cls;
            this.f38755b = resourceEncoder;
        }
    }

    public synchronized <Z> void append(@NonNull Class<Z> cls, @NonNull ResourceEncoder<Z> resourceEncoder) {
        this.f38753a.add(new a(cls, resourceEncoder));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Nullable
    public synchronized <Z> ResourceEncoder<Z> get(@NonNull Class<Z> cls) {
        int size = this.f38753a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) this.f38753a.get(i10);
            if (aVar.f38754a.isAssignableFrom((Class<?>) cls)) {
                return aVar.f38755b;
            }
        }
        return null;
    }

    public synchronized <Z> void prepend(@NonNull Class<Z> cls, @NonNull ResourceEncoder<Z> resourceEncoder) {
        this.f38753a.add(0, new a(cls, resourceEncoder));
    }
}
