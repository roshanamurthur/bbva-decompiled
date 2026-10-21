package com.bbva.ethermobilesdk.cipher.jwe;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CipherAlgorithm.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\t\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/jwe/CipherAlgorithm;", "a", "Lcom/bbva/ethermobilesdk/cipher/jwe/CipherAlgorithm;", "getRSA_OAEP256", "()Lcom/bbva/ethermobilesdk/cipher/jwe/CipherAlgorithm;", "RSA_OAEP256", "b", "getA256KW", "A256KW", "jwe-cipher_release"}, k = 2, mv = {1, 8, 0})
public final class CipherAlgorithmKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final CipherAlgorithm f29311a = new CipherAlgorithm("RSA-OAEP", "A256GCM");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final CipherAlgorithm f29312b = new CipherAlgorithm("A256KW", "A256GCM");

    @NotNull
    public static final CipherAlgorithm getA256KW() {
        return f29312b;
    }

    @NotNull
    public static final CipherAlgorithm getRSA_OAEP256() {
        return f29311a;
    }
}
