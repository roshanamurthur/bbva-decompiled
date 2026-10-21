package com.bbva.ethermobilesdk.cipher.token.generator;

import com.bbva.ethermobilesdk.cipher.model.CipherResult;
import com.bbva.ethermobilesdk.cipher.token.generator.impl.HashGeneratorImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HashGenerator.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¨\u0006\t"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/token/generator/HashGenerator;", "", "()V", "generateHash", "Lcom/bbva/ethermobilesdk/cipher/model/CipherResult;", "", "text", "", "algorithm", "cipher_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HashGenerator {

    @NotNull
    public static final HashGenerator INSTANCE = new HashGenerator();

    @NotNull
    public final CipherResult<byte[]> generateHash(@NotNull String text, @NotNull String algorithm) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        try {
            return new CipherResult.Success(new HashGeneratorImpl().generateHash(text, algorithm));
        } catch (Exception e5) {
            return new CipherResult.Error(e5);
        }
    }
}
