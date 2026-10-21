package tc;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: ResourceCacheKey.java */
/* JADX INFO: loaded from: classes9.dex */
public final class j implements Key {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final LruCache<Class<?>, byte[]> f93524i = new LruCache<>(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayPool f93525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Key f93526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Key f93527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f93528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f93529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class<?> f93530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Options f93531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Transformation<?> f93532h;

    public j(ArrayPool arrayPool, Key key, Key key2, int i10, int i11, Transformation<?> transformation, Class<?> cls, Options options) {
        this.f93525a = arrayPool;
        this.f93526b = key;
        this.f93527c = key2;
        this.f93528d = i10;
        this.f93529e = i11;
        this.f93532h = transformation;
        this.f93530f = cls;
        this.f93531g = options;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f93529e == jVar.f93529e && this.f93528d == jVar.f93528d && Util.bothNullOrEqual(this.f93532h, jVar.f93532h) && this.f93530f.equals(jVar.f93530f) && this.f93526b.equals(jVar.f93526b) && this.f93527c.equals(jVar.f93527c) && this.f93531g.equals(jVar.f93531g);
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        int iHashCode = ((((this.f93527c.hashCode() + (this.f93526b.hashCode() * 31)) * 31) + this.f93528d) * 31) + this.f93529e;
        Transformation<?> transformation = this.f93532h;
        if (transformation != null) {
            iHashCode = (iHashCode * 31) + transformation.hashCode();
        }
        return this.f93531g.hashCode() + ((this.f93530f.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f93526b + ", signature=" + this.f93527c + ", width=" + this.f93528d + ", height=" + this.f93529e + ", decodedResourceClass=" + this.f93530f + ", transformation='" + this.f93532h + "', options=" + this.f93531g + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        ArrayPool arrayPool = this.f93525a;
        byte[] bArr = (byte[]) arrayPool.getExact(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f93528d).putInt(this.f93529e).array();
        this.f93527c.updateDiskCacheKey(messageDigest);
        this.f93526b.updateDiskCacheKey(messageDigest);
        messageDigest.update(bArr);
        Transformation<?> transformation = this.f93532h;
        if (transformation != null) {
            transformation.updateDiskCacheKey(messageDigest);
        }
        this.f93531g.updateDiskCacheKey(messageDigest);
        LruCache<Class<?>, byte[]> lruCache = f93524i;
        Class<?> cls = this.f93530f;
        byte[] bytes = lruCache.get(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(Key.CHARSET);
            lruCache.put(cls, bytes);
        }
        messageDigest.update(bytes);
        arrayPool.put(bArr);
    }
}
