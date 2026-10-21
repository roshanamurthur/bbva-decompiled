package com.bbva.ethermobilesdk.cipher.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Algorithm.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/model/HmacAlgorithm;", "", "", "algorithm", "Ljava/lang/String;", "getAlgorithm", "()Ljava/lang/String;", "SHA224", "SHA256", "SHA384", "SHA512", "cipher_release"}, k = 1, mv = {1, 8, 0})
public enum HmacAlgorithm {
    SHA224("HmacSHA224"),
    SHA256("HmacSHA256"),
    SHA384("HmacSHA384"),
    SHA512("HmacSHA512");


    @NotNull
    private final String algorithm;

    HmacAlgorithm(String str) {
        this.algorithm = str;
    }

    @NotNull
    public final String getAlgorithm() {
        return this.algorithm;
    }
}
