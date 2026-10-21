package com.nimbusds.jwt.proc;

import com.nimbusds.jose.proc.JOSEProcessorConfiguration;
import com.nimbusds.jose.proc.SecurityContext;

/* JADX INFO: loaded from: classes10.dex */
public interface JWTProcessorConfiguration<C extends SecurityContext> extends JOSEProcessorConfiguration<C> {
    JWTClaimsSetAwareJWSKeySelector<C> getJWTClaimsSetAwareJWSKeySelector();

    JWTClaimsSetVerifier<C> getJWTClaimsSetVerifier();

    @Deprecated
    JWTClaimsVerifier getJWTClaimsVerifier();

    void setJWTClaimsSetAwareJWSKeySelector(JWTClaimsSetAwareJWSKeySelector<C> jWTClaimsSetAwareJWSKeySelector);

    void setJWTClaimsSetVerifier(JWTClaimsSetVerifier<C> jWTClaimsSetVerifier);

    @Deprecated
    void setJWTClaimsVerifier(JWTClaimsVerifier jWTClaimsVerifier);
}
