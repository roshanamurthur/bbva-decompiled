package com.nimbusds.jwt;

/* JADX INFO: loaded from: classes10.dex */
public interface JWTClaimsSetTransformer<T> {
    T transform(JWTClaimsSet jWTClaimsSet);
}
