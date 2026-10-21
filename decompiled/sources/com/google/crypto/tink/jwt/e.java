package com.google.crypto.tink.jwt;

import com.google.crypto.tink.subtle.RsaSsaPkcs1SignJce;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Optional;

/* JADX INFO: compiled from: JwtRsaSsaPkcs1SignKeyManager.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e implements JwtPublicKeySignInternal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Optional f46748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f46749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RsaSsaPkcs1SignJce f46750c;

    public e(Optional optional, String str, RsaSsaPkcs1SignJce rsaSsaPkcs1SignJce) {
        this.f46748a = optional;
        this.f46749b = str;
        this.f46750c = rsaSsaPkcs1SignJce;
    }

    @Override // com.google.crypto.tink.jwt.JwtPublicKeySignInternal
    public final String signAndEncodeWithKid(RawJwt rawJwt, Optional<String> optional) throws GeneralSecurityException {
        Optional<String> optional2 = this.f46748a;
        if (optional2.isPresent()) {
            if (optional.isPresent()) {
                throw new JwtInvalidException("custom_kid can only be set for RAW keys.");
            }
            optional = optional2;
        }
        String strB = d.b(this.f46749b, optional, rawJwt);
        return d.a(strB, this.f46750c.sign(strB.getBytes(StandardCharsets.US_ASCII)));
    }
}
