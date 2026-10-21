package com.bbva.ethermobilesdk.cipher.token.utils;

import com.bbva.ethermobilesdk.plugin.command.hmac.HmacCommand;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HMACUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated(level = DeprecationLevel.WARNING, message = "Use the factory hmacOf() to compute a Hash-based message authentication code (HMAC)")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/token/utils/HMACUtils;", "", "()V", "Companion", "Hmac", "cipher_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HMACUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: HMACUtils.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0007¨\u0006\r"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/token/utils/HMACUtils$Companion;", "", "()V", HmacCommand.ID, "", "algorithm", "Lcom/bbva/ethermobilesdk/cipher/token/utils/HMACUtils$Hmac;", "keyBytes", "data", "keySpec", "Ljavax/crypto/spec/SecretKeySpec;", "hmacSha256", "text", "cipher_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ byte[] hmac$default(Companion companion, Hmac hmac, byte[] bArr, byte[] bArr2, SecretKeySpec secretKeySpec, int i10, Object obj) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
            if ((i10 & 8) != 0) {
                secretKeySpec = new SecretKeySpec(bArr, HMACUtilsKt.DEFAULT_SECRET_KEYSPEC_ALGORITHM);
            }
            return companion.hmac(hmac, bArr, bArr2, secretKeySpec);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Use the factory hmacOf() to compute a Hash-based message authentication code (HMAC)")
        @NotNull
        public final byte[] hmac(@NotNull Hmac algorithm, @NotNull byte[] keyBytes, @NotNull byte[] data, @NotNull SecretKeySpec keySpec) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
            Mac mac;
            Intrinsics.checkNotNullParameter(algorithm, "algorithm");
            Intrinsics.checkNotNullParameter(keyBytes, "keyBytes");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(keySpec, "keySpec");
            try {
                mac = Mac.getInstance(algorithm.getValue());
                Intrinsics.checkNotNullExpressionValue(mac, "{\n                Mac.ge…ithm.value)\n            }");
            } catch (NoSuchAlgorithmException unused) {
                mac = Mac.getInstance(algorithm.getAlt());
                Intrinsics.checkNotNullExpressionValue(mac, "{\n                Mac.ge…orithm.alt)\n            }");
            }
            mac.init(keySpec);
            byte[] bArrDoFinal = mac.doFinal(data);
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "hmac.doFinal(data)");
            return bArrDoFinal;
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Use the factory hmacOf() to compute a Hash-based message authentication code (HMAC)")
        @NotNull
        public final byte[] hmacSha256(@NotNull byte[] keyBytes, @NotNull byte[] text) throws NoSuchAlgorithmException, InvalidKeyException {
            Mac mac;
            Intrinsics.checkNotNullParameter(keyBytes, "keyBytes");
            Intrinsics.checkNotNullParameter(text, "text");
            try {
                mac = Mac.getInstance("HmacSHA256");
                Intrinsics.checkNotNullExpressionValue(mac, "{\n                Mac.ge…macSHA256\")\n            }");
            } catch (NoSuchAlgorithmException unused) {
                mac = Mac.getInstance("HMAC-SHA-256");
                Intrinsics.checkNotNullExpressionValue(mac, "{\n                Mac.ge…C-SHA-256\")\n            }");
            }
            mac.init(new SecretKeySpec(keyBytes, HMACUtilsKt.DEFAULT_SECRET_KEYSPEC_ALGORITHM));
            byte[] bArrDoFinal = mac.doFinal(text);
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "hmacSha256.doFinal(text)");
            return bArrDoFinal;
        }
    }

    /* JADX INFO: compiled from: HMACUtils.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/token/utils/HMACUtils$Hmac;", "", "", "toString", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "alt", "getAlt", "SHA256", "SHA384", "SHA512", "cipher_release"}, k = 1, mv = {1, 8, 0})
    @Deprecated(level = DeprecationLevel.WARNING, message = "Use the factory hmacOf() to compute a Hash-based message authentication code (HMAC)")
    public enum Hmac {
        SHA256("HmacSHA256", "HMAC-SHA-256"),
        SHA384("HmacSHA384", "HMAC-SHA-384"),
        SHA512("HmacSHA512", "HMAC-SHA-512");


        @NotNull
        private final String alt;

        @NotNull
        private final String value;

        Hmac(String str, String str2) {
            this.value = str;
            this.alt = str2;
        }

        @NotNull
        public final String getAlt() {
            return this.alt;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.value;
        }
    }
}
