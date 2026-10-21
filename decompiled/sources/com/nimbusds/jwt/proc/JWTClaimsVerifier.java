package com.nimbusds.jwt.proc;

import com.nimbusds.jwt.JWTClaimsSet;

/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public interface JWTClaimsVerifier {
    @Deprecated
    void verify(JWTClaimsSet jWTClaimsSet) throws BadJWTException;
}
