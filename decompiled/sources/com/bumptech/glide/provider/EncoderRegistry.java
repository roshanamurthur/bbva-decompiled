package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Encoder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class EncoderRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f38739a = new ArrayList();

    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<T> f38740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Encoder<T> f38741b;

        public a(@NonNull Class<T> cls, @NonNull Encoder<T> encoder) {
            this.f38740a = cls;
            this.f38741b = encoder;
        }
    }

    public synchronized <T> void append(@NonNull Class<T> cls, @NonNull Encoder<T> encoder) {
        this.f38739a.add(new a(cls, encoder));
    }

    @Nullable
    public synchronized <T> Encoder<T> getEncoder(@NonNull Class<T> cls) {
        for (a aVar : this.f38739a) {
            if (aVar.f38740a.isAssignableFrom(cls)) {
                return aVar.f38741b;
            }
        }
        return null;
    }

    public synchronized <T> void prepend(@NonNull Class<T> cls, @NonNull Encoder<T> encoder) {
        this.f38739a.add(0, new a(cls, encoder));
    }
}
