package com.bbva.ethermobilesdk.cipher.jwe.jwk;

import com.bbva.ethermobilesdk.cipher.model.CipherResult;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.jwk.KeyType;
import com.nimbusds.jose.jwk.OctetSequenceKey;
import com.nimbusds.jose.jwk.RSAKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Jwk.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \t2\u00020\u0001:\u0003\t\n\u000bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u00020\u0004X \u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/jwe/jwk/Jwk;", "", "()V", "key", "Lcom/nimbusds/jose/jwk/JWK;", "getKey$jwe_cipher_release", "()Lcom/nimbusds/jose/jwk/JWK;", "toJSONString", "", "Companion", "JwkOctet", "JwkRsa", "Lcom/bbva/ethermobilesdk/cipher/jwe/jwk/Jwk$JwkOctet;", "Lcom/bbva/ethermobilesdk/cipher/jwe/jwk/Jwk$JwkRsa;", "jwe-cipher_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Jwk {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: Jwk.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/jwe/jwk/Jwk$Companion;", "", "()V", "parse", "Lcom/bbva/ethermobilesdk/cipher/model/CipherResult;", "Lcom/bbva/ethermobilesdk/cipher/jwe/jwk/Jwk;", "raw", "", "jwe-cipher_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CipherResult<Jwk> parse(@NotNull String raw) {
            Intrinsics.checkNotNullParameter(raw, "raw");
            try {
                JWK jwk = JWK.parse(raw);
                KeyType keyType = jwk.getKeyType();
                if (Intrinsics.areEqual(keyType, KeyType.RSA)) {
                    Intrinsics.checkNotNull(jwk, "null cannot be cast to non-null type com.nimbusds.jose.jwk.RSAKey");
                    return new CipherResult.Success(new JwkRsa((RSAKey) jwk));
                }
                if (Intrinsics.areEqual(keyType, KeyType.OCT)) {
                    Intrinsics.checkNotNull(jwk, "null cannot be cast to non-null type com.nimbusds.jose.jwk.OctetSequenceKey");
                    return new CipherResult.Success(new JwkOctet((OctetSequenceKey) jwk));
                }
                return new CipherResult.Error(new Exception("Json web key " + jwk.getKeyType() + " unsupported"));
            } catch (Throwable th2) {
                return new CipherResult.Error(th2);
            }
        }
    }

    /* JADX INFO: compiled from: Jwk.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u001a\u0010\u0006\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u0015"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/jwe/jwk/Jwk$JwkOctet;", "Lcom/bbva/ethermobilesdk/cipher/jwe/jwk/Jwk;", "Lcom/nimbusds/jose/jwk/OctetSequenceKey;", "component1$jwe_cipher_release", "()Lcom/nimbusds/jose/jwk/OctetSequenceKey;", "component1", "key", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/nimbusds/jose/jwk/OctetSequenceKey;", "getKey$jwe_cipher_release", "<init>", "(Lcom/nimbusds/jose/jwk/OctetSequenceKey;)V", "jwe-cipher_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class JwkOctet extends Jwk {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final OctetSequenceKey key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JwkOctet(@NotNull OctetSequenceKey key) {
            super(null);
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
        }

        public static /* synthetic */ JwkOctet copy$default(JwkOctet jwkOctet, OctetSequenceKey octetSequenceKey, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                octetSequenceKey = jwkOctet.getKey();
            }
            return jwkOctet.copy(octetSequenceKey);
        }

        @NotNull
        public final OctetSequenceKey component1$jwe_cipher_release() {
            return getKey();
        }

        @NotNull
        public final JwkOctet copy(@NotNull OctetSequenceKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new JwkOctet(key);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof JwkOctet) && Intrinsics.areEqual(getKey(), ((JwkOctet) other).getKey());
        }

        public int hashCode() {
            return getKey().hashCode();
        }

        @NotNull
        public String toString() {
            return "JwkOctet(key=" + getKey() + RootService.CLOSE_BRACKET;
        }

        @Override // com.bbva.ethermobilesdk.cipher.jwe.jwk.Jwk
        @NotNull
        /* JADX INFO: renamed from: getKey$jwe_cipher_release, reason: from getter */
        public OctetSequenceKey getKey() {
            return this.key;
        }
    }

    /* JADX INFO: compiled from: Jwk.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u001a\u0010\u0006\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u0015"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/jwe/jwk/Jwk$JwkRsa;", "Lcom/bbva/ethermobilesdk/cipher/jwe/jwk/Jwk;", "Lcom/nimbusds/jose/jwk/RSAKey;", "component1$jwe_cipher_release", "()Lcom/nimbusds/jose/jwk/RSAKey;", "component1", "key", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/nimbusds/jose/jwk/RSAKey;", "getKey$jwe_cipher_release", "<init>", "(Lcom/nimbusds/jose/jwk/RSAKey;)V", "jwe-cipher_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class JwkRsa extends Jwk {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final RSAKey key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JwkRsa(@NotNull RSAKey key) {
            super(null);
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
        }

        public static /* synthetic */ JwkRsa copy$default(JwkRsa jwkRsa, RSAKey rSAKey, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                rSAKey = jwkRsa.getKey();
            }
            return jwkRsa.copy(rSAKey);
        }

        @NotNull
        public final RSAKey component1$jwe_cipher_release() {
            return getKey();
        }

        @NotNull
        public final JwkRsa copy(@NotNull RSAKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new JwkRsa(key);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof JwkRsa) && Intrinsics.areEqual(getKey(), ((JwkRsa) other).getKey());
        }

        public int hashCode() {
            return getKey().hashCode();
        }

        @NotNull
        public String toString() {
            return "JwkRsa(key=" + getKey() + RootService.CLOSE_BRACKET;
        }

        @Override // com.bbva.ethermobilesdk.cipher.jwe.jwk.Jwk
        @NotNull
        /* JADX INFO: renamed from: getKey$jwe_cipher_release, reason: from getter */
        public RSAKey getKey() {
            return this.key;
        }
    }

    public Jwk() {
    }

    public /* synthetic */ Jwk(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    /* JADX INFO: renamed from: getKey$jwe_cipher_release */
    public abstract JWK getKey();

    @NotNull
    public final String toJSONString() {
        String jSONString = getKey().toJSONString();
        Intrinsics.checkNotNullExpressionValue(jSONString, "key.toJSONString()");
        return jSONString;
    }
}
