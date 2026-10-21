package com.bumptech.glide.load;

import ad.d;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes9.dex */
public final class Option<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f38132e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f38133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CacheKeyUpdater<T> f38134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile byte[] f38136d;

    public interface CacheKeyUpdater<T> {
        void update(@NonNull byte[] bArr, @NonNull T t10, @NonNull MessageDigest messageDigest);
    }

    public Option(@NonNull String str, @Nullable T t10, @NonNull CacheKeyUpdater<T> cacheKeyUpdater) {
        this.f38135c = Preconditions.checkNotEmpty(str);
        this.f38133a = t10;
        this.f38134b = (CacheKeyUpdater) Preconditions.checkNotNull(cacheKeyUpdater);
    }

    @NonNull
    public static <T> Option<T> disk(@NonNull String str, @NonNull CacheKeyUpdater<T> cacheKeyUpdater) {
        return new Option<>(str, null, cacheKeyUpdater);
    }

    @NonNull
    public static <T> Option<T> memory(@NonNull String str) {
        return new Option<>(str, null, f38132e);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Option) {
            return this.f38135c.equals(((Option) obj).f38135c);
        }
        return false;
    }

    @Nullable
    public T getDefaultValue() {
        return this.f38133a;
    }

    public int hashCode() {
        return this.f38135c.hashCode();
    }

    public String toString() {
        return d.f(new StringBuilder("Option{key='"), this.f38135c, "'}");
    }

    public void update(@NonNull T t10, @NonNull MessageDigest messageDigest) {
        CacheKeyUpdater<T> cacheKeyUpdater = this.f38134b;
        if (this.f38136d == null) {
            this.f38136d = this.f38135c.getBytes(Key.CHARSET);
        }
        cacheKeyUpdater.update(this.f38136d, t10, messageDigest);
    }

    @NonNull
    public static <T> Option<T> disk(@NonNull String str, @Nullable T t10, @NonNull CacheKeyUpdater<T> cacheKeyUpdater) {
        return new Option<>(str, t10, cacheKeyUpdater);
    }

    @NonNull
    public static <T> Option<T> memory(@NonNull String str, @NonNull T t10) {
        return new Option<>(str, t10, f38132e);
    }

    public class a implements CacheKeyUpdater<Object> {
        @Override // com.bumptech.glide.load.Option.CacheKeyUpdater
        public final void update(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        }
    }
}
