package com.bbva.ethermobilesdk.cipher.token.generator;

import com.bbva.ethermobilesdk.cipher.model.CipherResult;
import com.bbva.ethermobilesdk.cipher.token.generator.impl.SecretKeyGeneratorImpl;
import com.bbva.ethermobilesdk.cipher.token.model.SecretKeyBundle;
import com.bbva.ethermobilesdk.cipher.token.model.SecretKeyGeneratorAttributes;
import com.salesforce.marketingcloud.storage.db.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SecretKeyGenerator.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/token/generator/SecretKeyGenerator;", "", "()V", "generateSalt", "Lcom/bbva/ethermobilesdk/cipher/model/CipherResult;", "", "saltLength", "", "seed", "generateSecretKey", "Lcom/bbva/ethermobilesdk/cipher/token/model/SecretKeyBundle;", "password", "", k.a.f65041h, "Lcom/bbva/ethermobilesdk/cipher/token/model/SecretKeyGeneratorAttributes;", "cipher_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SecretKeyGenerator {

    @NotNull
    public static final SecretKeyGenerator INSTANCE = new SecretKeyGenerator();

    public static /* synthetic */ CipherResult generateSalt$default(SecretKeyGenerator secretKeyGenerator, int i10, byte[] bArr, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bArr = null;
        }
        return secretKeyGenerator.generateSalt(i10, bArr);
    }

    @NotNull
    public final CipherResult<byte[]> generateSalt(int saltLength, @Nullable byte[] seed) {
        try {
            return new CipherResult.Success(new SecretKeyGeneratorImpl().generateSalt(saltLength, seed));
        } catch (Exception e5) {
            return new CipherResult.Error(e5);
        }
    }

    @NotNull
    public final CipherResult<SecretKeyBundle> generateSecretKey(@NotNull String password, @NotNull SecretKeyGeneratorAttributes attributes) {
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        try {
            return new CipherResult.Success(new SecretKeyGeneratorImpl().generateSecretKey(password, attributes));
        } catch (Exception e5) {
            return new CipherResult.Error(e5);
        }
    }
}
