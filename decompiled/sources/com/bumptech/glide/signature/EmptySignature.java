package com.bumptech.glide.signature;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes9.dex */
public final class EmptySignature implements Key {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EmptySignature f38887a = new EmptySignature();

    @NonNull
    public static EmptySignature obtain() {
        return f38887a;
    }

    public String toString() {
        return "EmptySignature";
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
    }
}
