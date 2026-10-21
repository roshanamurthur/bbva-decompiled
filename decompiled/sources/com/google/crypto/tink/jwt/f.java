package com.google.crypto.tink.jwt;

import com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Optional;

/* JADX INFO: compiled from: JwtRsaSsaPkcs1VerifyKeyManager.java */
/* JADX INFO: loaded from: classes10.dex */
public final class f implements JwtPublicKeyVerifyInternal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RsaSsaPkcs1VerifyJce f46751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f46752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Optional f46753c;

    public f(RsaSsaPkcs1VerifyJce rsaSsaPkcs1VerifyJce, String str, Optional optional) {
        this.f46751a = rsaSsaPkcs1VerifyJce;
        this.f46752b = str;
        this.f46753c = optional;
    }

    @Override // com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal
    public final VerifiedJwt verifyAndDecodeWithKid(String str, JwtValidator jwtValidator, Optional<String> optional) throws GeneralSecurityException {
        d.a aVarF = d.f(str);
        this.f46751a.verify(aVarF.f46745b, aVarF.f46744a.getBytes(StandardCharsets.US_ASCII));
        JsonObject jsonObjectA = hf.a.a(aVarF.f46746c);
        d.i(this.f46752b, optional, this.f46753c, jsonObjectA);
        return jwtValidator.a(new RawJwt(d.e(jsonObjectA), aVarF.f46747d));
    }
}
