package tc;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: EngineKey.java */
/* JADX INFO: loaded from: classes9.dex */
public final class f implements Key {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f93508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f93509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f93510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class<?> f93511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Class<?> f93512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Key f93513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<Class<?>, Transformation<?>> f93514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Options f93515h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f93516i;

    public f(Object obj, Key key, int i10, int i11, Map<Class<?>, Transformation<?>> map, Class<?> cls, Class<?> cls2, Options options) {
        this.f93508a = Preconditions.checkNotNull(obj);
        this.f93513f = (Key) Preconditions.checkNotNull(key, "Signature must not be null");
        this.f93509b = i10;
        this.f93510c = i11;
        this.f93514g = (Map) Preconditions.checkNotNull(map);
        this.f93511d = (Class) Preconditions.checkNotNull(cls, "Resource class must not be null");
        this.f93512e = (Class) Preconditions.checkNotNull(cls2, "Transcode class must not be null");
        this.f93515h = (Options) Preconditions.checkNotNull(options);
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f93508a.equals(fVar.f93508a) && this.f93513f.equals(fVar.f93513f) && this.f93510c == fVar.f93510c && this.f93509b == fVar.f93509b && this.f93514g.equals(fVar.f93514g) && this.f93511d.equals(fVar.f93511d) && this.f93512e.equals(fVar.f93512e) && this.f93515h.equals(fVar.f93515h);
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        if (this.f93516i == 0) {
            int iHashCode = this.f93508a.hashCode();
            this.f93516i = iHashCode;
            int iHashCode2 = ((((this.f93513f.hashCode() + (iHashCode * 31)) * 31) + this.f93509b) * 31) + this.f93510c;
            this.f93516i = iHashCode2;
            int iHashCode3 = this.f93514g.hashCode() + (iHashCode2 * 31);
            this.f93516i = iHashCode3;
            int iHashCode4 = this.f93511d.hashCode() + (iHashCode3 * 31);
            this.f93516i = iHashCode4;
            int iHashCode5 = this.f93512e.hashCode() + (iHashCode4 * 31);
            this.f93516i = iHashCode5;
            this.f93516i = this.f93515h.hashCode() + (iHashCode5 * 31);
        }
        return this.f93516i;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f93508a + ", width=" + this.f93509b + ", height=" + this.f93510c + ", resourceClass=" + this.f93511d + ", transcodeClass=" + this.f93512e + ", signature=" + this.f93513f + ", hashCode=" + this.f93516i + ", transformations=" + this.f93514g + ", options=" + this.f93515h + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
