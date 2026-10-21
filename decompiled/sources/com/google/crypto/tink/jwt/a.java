package com.google.crypto.tink.jwt;

import com.google.crypto.tink.subtle.EcdsaSignJce;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Optional;

/* JADX INFO: compiled from: JwtEcdsaSignKeyManager.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements JwtPublicKeySignInternal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Optional f46737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f46738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EcdsaSignJce f46739c;

    public a(Optional optional, String str, EcdsaSignJce ecdsaSignJce) {
        this.f46737a = optional;
        this.f46738b = str;
        this.f46739c = ecdsaSignJce;
    }

    @Override // com.google.crypto.tink.jwt.JwtPublicKeySignInternal
    public final String signAndEncodeWithKid(RawJwt rawJwt, Optional<String> optional) throws GeneralSecurityException {
        Optional<String> optional2 = this.f46737a;
        if (optional2.isPresent()) {
            if (optional.isPresent()) {
                throw new JwtInvalidException("custom_kid can only be set for RAW keys.");
            }
            optional = optional2;
        }
        String strB = d.b(this.f46738b, optional, rawJwt);
        return d.a(strB, this.f46739c.sign(strB.getBytes(StandardCharsets.US_ASCII)));
    }
}
