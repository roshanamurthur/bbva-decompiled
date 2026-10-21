package com.bbva.ethermobilesdk.token.extension;

import com.bbva.ethermobilesdk.cipher.model.CipherResultKt;
import com.bbva.ethermobilesdk.cipher.softcipher.SoftCipher;
import com.bbva.ethermobilesdk.cipher.token.generator.RSAKeyGenerator;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.ethermobilesdk.token.model.TokenActivation;
import java.security.PrivateKey;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TokenActivation.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\"\u0014\u0010\b\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/bbva/ethermobilesdk/token/model/TokenActivation;", "", "isPlainPayload", "", "extractTokenIdFromPlainPayload", "", "privateKey", "extractTokenIdFromEncryptedPayload", "SEPARATOR_PLAIN_PAYLOAD", "Ljava/lang/String;", "ethertoken_release"}, k = 2, mv = {1, 8, 0})
public final class TokenActivationKt {

    @NotNull
    public static final String SEPARATOR_PLAIN_PAYLOAD = "#";

    @NotNull
    public static final String extractTokenIdFromEncryptedPayload(@NotNull TokenActivation tokenActivation, @NotNull byte[] privateKey) {
        Intrinsics.checkNotNullParameter(tokenActivation, "<this>");
        Intrinsics.checkNotNullParameter(privateKey, "privateKey");
        SoftCipher softCipher = new SoftCipher();
        String upperCase = tokenActivation.getData().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return StringKt.splitAndLast$default(EncodingUtilsKt.toSimpleString((byte[]) CipherResultKt.getOrThrow(softCipher.decrypt(EncodingUtilsKt.hexStringToByteArray$default(upperCase, null, 1, null), (PrivateKey) CipherResultKt.getOrThrow(RSAKeyGenerator.INSTANCE.loadPrivateKey("RSA", privateKey)), "RSA/ECB/PKCS1Padding"))), null, 1, null);
    }

    @NotNull
    public static final String extractTokenIdFromPlainPayload(@NotNull TokenActivation tokenActivation) {
        Intrinsics.checkNotNullParameter(tokenActivation, "<this>");
        return StringKt.splitAndLast$default(tokenActivation.getData(), null, 1, null);
    }

    public static final boolean isPlainPayload(@NotNull TokenActivation tokenActivation) {
        Intrinsics.checkNotNullParameter(tokenActivation, "<this>");
        return StringsKt__StringsKt.contains$default((CharSequence) tokenActivation.getData(), (CharSequence) "#", false, 2, (Object) null);
    }
}
