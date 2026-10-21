package com.google.crypto.tink.jwt;

import com.google.crypto.tink.subtle.RsaSsaPssVerifyJce;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Optional;

/* JADX INFO: compiled from: JwtRsaSsaPssVerifyKeyManager.java */
/* JADX INFO: loaded from: classes10.dex */
public final class i implements JwtPublicKeyVerifyInternal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RsaSsaPssVerifyJce f46758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f46759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Optional f46760c;

    public i(RsaSsaPssVerifyJce rsaSsaPssVerifyJce, String str, Optional optional) {
        this.f46758a = rsaSsaPssVerifyJce;
        this.f46759b = str;
        this.f46760c = optional;
    }

    @Override // com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal
    public final VerifiedJwt verifyAndDecodeWithKid(String str, JwtValidator jwtValidator, Optional<String> optional) throws GeneralSecurityException {
        d.a aVarF = d.f(str);
        this.f46758a.verify(aVarF.f46745b, aVarF.f46744a.getBytes(StandardCharsets.US_ASCII));
        JsonObject jsonObjectA = hf.a.a(aVarF.f46746c);
        d.i(this.f46759b, optional, this.f46760c, jsonObjectA);
        return jwtValidator.a(new RawJwt(d.e(jsonObjectA), aVarF.f46747d));
    }
}
