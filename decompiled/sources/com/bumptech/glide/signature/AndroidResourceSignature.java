package com.bumptech.glide.signature;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes9.dex */
public final class AndroidResourceSignature implements Key {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Key f38885b;

    public AndroidResourceSignature(int i10, Key key) {
        this.f38884a = i10;
        this.f38885b = key;
    }

    @NonNull
    public static Key obtain(@NonNull Context context) {
        return new AndroidResourceSignature(context.getResources().getConfiguration().uiMode & 48, ApplicationVersionSignature.obtain(context));
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (!(obj instanceof AndroidResourceSignature)) {
            return false;
        }
        AndroidResourceSignature androidResourceSignature = (AndroidResourceSignature) obj;
        return this.f38884a == androidResourceSignature.f38884a && this.f38885b.equals(androidResourceSignature.f38885b);
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return Util.hashCode(this.f38885b, this.f38884a);
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        this.f38885b.updateDiskCacheKey(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f38884a).array());
    }
}
