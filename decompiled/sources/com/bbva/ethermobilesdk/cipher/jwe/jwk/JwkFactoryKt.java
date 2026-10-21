package com.bbva.ethermobilesdk.cipher.jwe.jwk;

import com.bbva.zoomauth.facialauth.FacialAuthFragment;
import com.nimbusds.jose.jwk.OctetSequenceKey;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.util.Base64URL;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.UUID;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JwkFactory.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u001a\u001a\u0010\u0007\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u001a\u001a\u0010\u0007\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\f"}, d2 = {"Ljava/security/interfaces/RSAPublicKey;", FacialAuthFragment.PUBLIC_KEY, "Ljava/security/interfaces/RSAPrivateKey;", "privateKey", "", "keyId", "Lcom/bbva/ethermobilesdk/cipher/jwe/jwk/Jwk;", "jwkOf", "Ljavax/crypto/SecretKey;", "secretKey", "Lcom/bbva/ethermobilesdk/cipher/jwe/jwk/Jwk$JwkOctet;", "keyBase64", "jwe-cipher_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nJwkFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JwkFactory.kt\ncom/bbva/ethermobilesdk/cipher/jwe/jwk/JwkFactoryKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
public final class JwkFactoryKt {
    @NotNull
    public static final Jwk jwkOf(@NotNull RSAPublicKey publicKey, @Nullable RSAPrivateKey rSAPrivateKey, @Nullable String str) {
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        RSAKey.Builder builder = new RSAKey.Builder(publicKey);
        if (str == null) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        RSAKey.Builder builderKeyID = builder.keyID(str);
        if (rSAPrivateKey != null) {
            builderKeyID.privateKey(rSAPrivateKey);
        }
        RSAKey key = builderKeyID.build();
        Intrinsics.checkNotNullExpressionValue(key, "key");
        return new Jwk.JwkRsa(key);
    }

    public static /* synthetic */ Jwk jwkOf$default(RSAPublicKey rSAPublicKey, RSAPrivateKey rSAPrivateKey, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            rSAPrivateKey = null;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        return jwkOf(rSAPublicKey, rSAPrivateKey, str);
    }

    public static /* synthetic */ Jwk.JwkOctet jwkOf$default(SecretKey secretKey, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return jwkOf(secretKey, str);
    }

    public static /* synthetic */ Jwk.JwkOctet jwkOf$default(String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return jwkOf(str, str2);
    }

    @NotNull
    public static final Jwk.JwkOctet jwkOf(@NotNull SecretKey secretKey, @Nullable String str) {
        Intrinsics.checkNotNullParameter(secretKey, "secretKey");
        OctetSequenceKey.Builder builder = new OctetSequenceKey.Builder(Base64URL.encode(secretKey.getEncoded()));
        if (str == null) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        OctetSequenceKey key = builder.keyID(str).build();
        Intrinsics.checkNotNullExpressionValue(key, "key");
        return new Jwk.JwkOctet(key);
    }

    @NotNull
    public static final Jwk.JwkOctet jwkOf(@NotNull String keyBase64, @Nullable String str) {
        Intrinsics.checkNotNullParameter(keyBase64, "keyBase64");
        OctetSequenceKey.Builder builder = new OctetSequenceKey.Builder(new Base64URL(keyBase64));
        if (str == null) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        OctetSequenceKey key = builder.keyID(str).build();
        Intrinsics.checkNotNullExpressionValue(key, "key");
        return new Jwk.JwkOctet(key);
    }
}
