package com.bbva.ethermobilesdk.token.extension;

import com.bbva.ethermobilesdk.cipher.softcipher.SoftCipher;
import com.bbva.ethermobilesdk.cipher.token.generator.RSAKeyGenerator;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.ethermobilesdk.token.model.EtherTokenError;
import com.bbva.ethermobilesdk.token.model.EtherTokenErrorType;
import com.bbva.ethermobilesdk.token.model.Token;
import java.security.interfaces.RSAPrivateKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Token.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"seed", "", "Lcom/bbva/ethermobilesdk/token/model/Token;", "cipher", "Lcom/bbva/ethermobilesdk/cipher/softcipher/SoftCipher;", "ethertoken_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TokenKt {
    @NotNull
    public static final byte[] seed(@NotNull Token token, @NotNull SoftCipher cipher) throws EtherTokenError {
        Intrinsics.checkNotNullParameter(token, "<this>");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        if (token.getActivation() == null) {
            throw new EtherTokenError(EtherTokenErrorType.TOKEN_IS_NOT_ACTIVE, null, 2, null);
        }
        return (byte[]) CipherKt.valueOrThrow(cipher.decrypt(EncodingUtilsKt.base64ToByteArray(token.getActivation().getSeed()), (RSAPrivateKey) CipherKt.valueOrThrow(RSAKeyGenerator.INSTANCE.loadPrivateKey("RSA", EncodingUtilsKt.hexStringToByteArray$default(token.getRsa().getPrivateKey(), null, 1, null))), "RSA/ECB/PKCS1Padding"));
    }
}
