package com.bumptech.glide.load.engine.cache;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes9.dex */
public class SafeKeyGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LruCache<Key, String> f38314a = new LruCache<>(1000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pools.Pool<b> f38315b = FactoryPools.threadSafe(10, new a());

    public class a implements FactoryPools.Factory<b> {
        @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
        public final b create() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e5) {
                throw new RuntimeException(e5);
            }
        }
    }

    public static final class b implements FactoryPools.Poolable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MessageDigest f38316p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final StateVerifier f38317q0 = StateVerifier.newInstance();

        public b(MessageDigest messageDigest) {
            this.f38316p0 = messageDigest;
        }

        @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
        @NonNull
        public final StateVerifier getVerifier() {
            return this.f38317q0;
        }
    }

    public String getSafeKey(Key key) {
        String str;
        synchronized (this.f38314a) {
            str = this.f38314a.get(key);
        }
        if (str == null) {
            Pools.Pool<b> pool = this.f38315b;
            b bVar = (b) Preconditions.checkNotNull(pool.acquire());
            try {
                key.updateDiskCacheKey(bVar.f38316p0);
                String strSha256BytesToHex = Util.sha256BytesToHex(bVar.f38316p0.digest());
                pool.release(bVar);
                str = strSha256BytesToHex;
            } catch (Throwable th2) {
                pool.release(bVar);
                throw th2;
            }
        }
        synchronized (this.f38314a) {
            this.f38314a.put(key, str);
        }
        return str;
    }
}
