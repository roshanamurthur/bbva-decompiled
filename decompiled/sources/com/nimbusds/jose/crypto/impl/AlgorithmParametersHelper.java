package com.nimbusds.jose.crypto.impl;

import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;

/* JADX INFO: loaded from: classes10.dex */
public class AlgorithmParametersHelper {
    public static AlgorithmParameters getInstance(String str, Provider provider) throws NoSuchAlgorithmException {
        return provider == null ? AlgorithmParameters.getInstance(str) : AlgorithmParameters.getInstance(str, provider);
    }
}
