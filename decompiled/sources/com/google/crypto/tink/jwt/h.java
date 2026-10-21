package com.google.crypto.tink.jwt;

import com.google.crypto.tink.subtle.RsaSsaPssSignJce;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Optional;

/* JADX INFO: compiled from: JwtRsaSsaPssSignKeyManager.java */
/* JADX INFO: loaded from: classes10.dex */
public final class h implements JwtPublicKeySignInternal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Optional f46755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f46756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RsaSsaPssSignJce f46757c;

    public h(Optional optional, String str, RsaSsaPssSignJce rsaSsaPssSignJce) {
        this.f46755a = optional;
        this.f46756b = str;
        this.f46757c = rsaSsaPssSignJce;
    }

    @Override // com.google.crypto.tink.jwt.JwtPublicKeySignInternal
    public final String signAndEncodeWithKid(RawJwt rawJwt, Optional<String> optional) throws GeneralSecurityException {
        Optional<String> optional2 = this.f46755a;
        if (optional2.isPresent()) {
            if (optional.isPresent()) {
                throw new JwtInvalidException("custom_kid can only be set for RAW keys.");
            }
            optional = optional2;
        }
        String strB = d.b(this.f46756b, optional, rawJwt);
        return d.a(strB, this.f46757c.sign(strB.getBytes(StandardCharsets.US_ASCII)));
    }
}
