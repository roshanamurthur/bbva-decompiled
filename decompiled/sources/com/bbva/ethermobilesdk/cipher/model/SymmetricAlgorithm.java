package com.bbva.ethermobilesdk.cipher.model;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Algorithm.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/model/SymmetricAlgorithm;", "", "", "algorithm", "Ljava/lang/String;", "getAlgorithm", "()Ljava/lang/String;", "keySpecAlg", "getKeySpecAlg", "", "keyLength", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getKeyLength", "()I", "AES_128", "AES_192", "AES_256", "cipher_release"}, k = 1, mv = {1, 8, 0})
public enum SymmetricAlgorithm {
    AES_128("AES_128", "AES-128"),
    AES_192("AES_192", "AES-192"),
    AES_256("AES_256", "AES-256");


    @NotNull
    private final String algorithm;
    private final int keyLength;

    @NotNull
    private final String keySpecAlg = "AES";

    SymmetricAlgorithm(String str, String str2) {
        this.algorithm = str2;
        this.keyLength = i;
    }

    @NotNull
    public final String getAlgorithm() {
        return this.algorithm;
    }

    public final int getKeyLength() {
        return this.keyLength;
    }

    @NotNull
    public final String getKeySpecAlg() {
        return this.keySpecAlg;
    }
}
