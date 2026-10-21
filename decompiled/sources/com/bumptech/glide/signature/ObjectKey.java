package com.bumptech.glide.signature;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.v;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public final class ObjectKey implements Key {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f38891a;

    public ObjectKey(@NonNull Object obj) {
        this.f38891a = Preconditions.checkNotNull(obj);
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof ObjectKey) {
            return this.f38891a.equals(((ObjectKey) obj).f38891a);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return this.f38891a.hashCode();
    }

    public String toString() {
        return v.d(new StringBuilder("ObjectKey{object="), this.f38891a, AbstractJsonLexerKt.END_OBJ);
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.f38891a.toString().getBytes(Key.CHARSET));
    }
}
