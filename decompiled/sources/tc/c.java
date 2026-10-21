package tc;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: DataCacheKey.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c implements Key {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Key f93503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Key f93504b;

    public c(Key key, Key key2) {
        this.f93503a = key;
        this.f93504b = key2;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f93503a.equals(cVar.f93503a) && this.f93504b.equals(cVar.f93504b);
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return this.f93504b.hashCode() + (this.f93503a.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f93503a + ", signature=" + this.f93504b + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        this.f93503a.updateDiskCacheKey(messageDigest);
        this.f93504b.updateDiskCacheKey(messageDigest);
    }
}
