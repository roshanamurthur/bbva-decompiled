package com.bumptech.glide.signature;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Key;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes9.dex */
public class MediaStoreSignature implements Key {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final String f38888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f38889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38890c;

    public MediaStoreSignature(@Nullable String str, long j10, int i10) {
        this.f38888a = str == null ? "" : str;
        this.f38889b = j10;
        this.f38890c = i10;
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MediaStoreSignature mediaStoreSignature = (MediaStoreSignature) obj;
        return this.f38889b == mediaStoreSignature.f38889b && this.f38890c == mediaStoreSignature.f38890c && this.f38888a.equals(mediaStoreSignature.f38888a);
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        int iHashCode = this.f38888a.hashCode() * 31;
        long j10 = this.f38889b;
        return ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f38890c;
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.f38889b).putInt(this.f38890c).array());
        messageDigest.update(this.f38888a.getBytes(Key.CHARSET));
    }
}
