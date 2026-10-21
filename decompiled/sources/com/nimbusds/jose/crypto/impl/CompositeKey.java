package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.KeyLengthException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class CompositeKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKey f62598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SecretKeySpec f62599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f62600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f62601d;

    public CompositeKey(SecretKey secretKey) throws KeyLengthException {
        this.f62598a = secretKey;
        byte[] encoded = secretKey.getEncoded();
        if (encoded.length == 32) {
            this.f62599b = new SecretKeySpec(encoded, 0, 16, "HMACSHA256");
            this.f62600c = new SecretKeySpec(encoded, 16, 16, "AES");
            this.f62601d = 16;
        } else if (encoded.length == 48) {
            this.f62599b = new SecretKeySpec(encoded, 0, 24, "HMACSHA384");
            this.f62600c = new SecretKeySpec(encoded, 24, 24, "AES");
            this.f62601d = 24;
        } else {
            if (encoded.length != 64) {
                throw new KeyLengthException("Unsupported AES/CBC/PKCS5Padding/HMAC-SHA2 key length, must be 256, 384 or 512 bits");
            }
            this.f62599b = new SecretKeySpec(encoded, 0, 32, "HMACSHA512");
            this.f62600c = new SecretKeySpec(encoded, 32, 32, "AES");
            this.f62601d = 32;
        }
    }

    public SecretKey getAESKey() {
        return this.f62600c;
    }

    public SecretKey getInputKey() {
        return this.f62598a;
    }

    public SecretKey getMACKey() {
        return this.f62599b;
    }

    public int getTruncatedMACByteLength() {
        return this.f62601d;
    }
}
