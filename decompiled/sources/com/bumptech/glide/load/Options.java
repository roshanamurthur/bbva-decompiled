package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public final class Options implements Key {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CachedHashCodeArrayMap f38137a = new CachedHashCodeArrayMap();

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof Options) {
            return this.f38137a.equals(((Options) obj).f38137a);
        }
        return false;
    }

    @Nullable
    public <T> T get(@NonNull Option<T> option) {
        CachedHashCodeArrayMap cachedHashCodeArrayMap = this.f38137a;
        return cachedHashCodeArrayMap.containsKey(option) ? (T) cachedHashCodeArrayMap.get(option) : option.getDefaultValue();
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return this.f38137a.hashCode();
    }

    public void putAll(@NonNull Options options) {
        this.f38137a.putAll((SimpleArrayMap) options.f38137a);
    }

    public Options remove(@NonNull Option<?> option) {
        this.f38137a.remove(option);
        return this;
    }

    @NonNull
    public <T> Options set(@NonNull Option<T> option, @NonNull T t10) {
        this.f38137a.put(option, t10);
        return this;
    }

    public String toString() {
        return "Options{values=" + this.f38137a + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        int i10 = 0;
        while (true) {
            CachedHashCodeArrayMap cachedHashCodeArrayMap = this.f38137a;
            if (i10 >= cachedHashCodeArrayMap.getSize()) {
                return;
            }
            ((Option) cachedHashCodeArrayMap.keyAt(i10)).update(cachedHashCodeArrayMap.valueAt(i10), messageDigest);
            i10++;
        }
    }
}
