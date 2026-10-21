package com.bbva.ethermobilesdk.cipher.jwe;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CipherAlgorithm.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/jwe/CipherAlgorithm;", "", "", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "b", "getEncryptionMethod", "encryptionMethod", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "jwe-cipher_release"}, k = 1, mv = {1, 8, 0})
public final class CipherAlgorithm {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String encryptionMethod;

    public CipherAlgorithm(@NotNull String name, @NotNull String encryptionMethod) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(encryptionMethod, "encryptionMethod");
        this.name = name;
        this.encryptionMethod = encryptionMethod;
    }

    @NotNull
    public final String getEncryptionMethod() {
        return this.encryptionMethod;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }
}
