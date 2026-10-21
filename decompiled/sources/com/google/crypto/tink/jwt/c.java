package com.google.crypto.tink.jwt;

import com.google.crypto.tink.subtle.EcdsaVerifyJce;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Optional;

/* JADX INFO: compiled from: JwtEcdsaVerifyKeyManager.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c implements JwtPublicKeyVerifyInternal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EcdsaVerifyJce f46741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f46742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Optional f46743c;

    public c(EcdsaVerifyJce ecdsaVerifyJce, String str, Optional optional) {
        this.f46741a = ecdsaVerifyJce;
        this.f46742b = str;
        this.f46743c = optional;
    }

    @Override // com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal
    public final VerifiedJwt verifyAndDecodeWithKid(String str, JwtValidator jwtValidator, Optional<String> optional) throws GeneralSecurityException {
        d.a aVarF = d.f(str);
        this.f46741a.verify(aVarF.f46745b, aVarF.f46744a.getBytes(StandardCharsets.US_ASCII));
        JsonObject jsonObjectA = hf.a.a(aVarF.f46746c);
        d.i(this.f46742b, optional, this.f46743c, jsonObjectA);
        return jwtValidator.a(new RawJwt(d.e(jsonObjectA), aVarF.f46747d));
    }
}
