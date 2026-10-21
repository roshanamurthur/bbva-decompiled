package com.nimbusds.jwt.proc;

import com.nimbusds.jose.proc.SecurityContext;
import com.nimbusds.jwt.JWTClaimsSet;

/* JADX INFO: loaded from: classes10.dex */
public interface JWTClaimsSetVerifier<C extends SecurityContext> {
    void verify(JWTClaimsSet jWTClaimsSet, C c10) throws BadJWTException;
}
