package com.bumptech.glide.load.engine.cache;

import android.util.Log;
import com.bumptech.glide.disklrucache.DiskLruCache;
import com.bumptech.glide.load.Key;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import vc.a;

/* JADX INFO: loaded from: classes9.dex */
public class DiskLruCacheWrapper implements DiskCache {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static DiskLruCacheWrapper f38287f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f38289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f38290c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DiskLruCache f38292e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f38291d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SafeKeyGenerator f38288a = new SafeKeyGenerator();

    @Deprecated
    public DiskLruCacheWrapper(File file, long j10) {
        this.f38289b = file;
        this.f38290c = j10;
    }

    public static DiskCache create(File file, long j10) {
        return new DiskLruCacheWrapper(file, j10);
    }

    @Deprecated
    public static synchronized DiskCache get(File file, long j10) {
        try {
            if (f38287f == null) {
                f38287f = new DiskLruCacheWrapper(file, j10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f38287f;
    }

    public final synchronized DiskLruCache a() throws IOException {
        try {
            if (this.f38292e == null) {
                this.f38292e = DiskLruCache.open(this.f38289b, 1, 1, this.f38290c);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f38292e;
    }

    public final synchronized void b() {
        this.f38292e = null;
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public synchronized void clear() {
        try {
            try {
                a().delete();
            } catch (IOException e5) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", e5);
                }
            }
            b();
        } catch (Throwable th2) {
            b();
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public void delete(Key key) {
        try {
            a().remove(this.f38288a.getSafeKey(key));
        } catch (IOException e5) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to delete from disk cache", e5);
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public void put(Key key, DiskCache.Writer writer) {
        a.C0502a c0502aA;
        String safeKey = this.f38288a.getSafeKey(key);
        a aVar = this.f38291d;
        synchronized (aVar) {
            try {
                c0502aA = (a.C0502a) aVar.f94022a.get(safeKey);
                if (c0502aA == null) {
                    c0502aA = aVar.f94023b.a();
                    aVar.f94022a.put(safeKey, c0502aA);
                }
                c0502aA.f94025b++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c0502aA.f94024a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(key);
            }
            try {
                DiskLruCache diskLruCacheA = a();
                if (diskLruCacheA.get(safeKey) != null) {
                    this.f38291d.a(safeKey);
                    return;
                }
                DiskLruCache.Editor editorEdit = diskLruCacheA.edit(safeKey);
                if (editorEdit == null) {
                    throw new IllegalStateException("Had two simultaneous puts for: " + safeKey);
                }
                try {
                    if (writer.write(editorEdit.getFile(0))) {
                        editorEdit.commit();
                    }
                    editorEdit.abortUnlessCommitted();
                    this.f38291d.a(safeKey);
                } catch (Throwable th3) {
                    editorEdit.abortUnlessCommitted();
                    throw th3;
                }
            } catch (IOException e5) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e5);
                }
            }
        } catch (Throwable th4) {
            this.f38291d.a(safeKey);
            throw th4;
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public File get(Key key) {
        String safeKey = this.f38288a.getSafeKey(key);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(key);
        }
        try {
            DiskLruCache.Value value = a().get(safeKey);
            if (value != null) {
                return value.getFile(0);
            }
            return null;
        } catch (IOException e5) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e5);
            return null;
        }
    }
}
