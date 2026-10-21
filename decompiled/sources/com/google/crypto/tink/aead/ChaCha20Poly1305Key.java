package com.google.crypto.tink.aead;

import com.google.crypto.tink.AccessesPartialKey;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.util.Bytes;
import com.google.crypto.tink.util.SecretBytes;
import com.google.errorprone.annotations.Immutable;
import com.google.errorprone.annotations.RestrictedApi;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
@Alpha
public final class ChaCha20Poly1305Key extends AeadKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaCha20Poly1305Parameters f46515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SecretBytes f46516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bytes f46517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Integer f46518d;

    public ChaCha20Poly1305Key(ChaCha20Poly1305Parameters chaCha20Poly1305Parameters, SecretBytes secretBytes, Bytes bytes, @Nullable Integer num) {
        this.f46515a = chaCha20Poly1305Parameters;
        this.f46516b = secretBytes;
        this.f46517c = bytes;
        this.f46518d = num;
    }

    @AccessesPartialKey
    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public static ChaCha20Poly1305Key create(SecretBytes secretBytes) throws GeneralSecurityException {
        return create(ChaCha20Poly1305Parameters.Variant.NO_PREFIX, secretBytes, null);
    }

    @Override // com.google.crypto.tink.Key
    public boolean equalsKey(Key key) {
        if (!(key instanceof ChaCha20Poly1305Key)) {
            return false;
        }
        ChaCha20Poly1305Key chaCha20Poly1305Key = (ChaCha20Poly1305Key) key;
        return chaCha20Poly1305Key.f46515a.equals(this.f46515a) && chaCha20Poly1305Key.f46516b.equalsSecretBytes(this.f46516b) && Objects.equals(chaCha20Poly1305Key.f46518d, this.f46518d);
    }

    @Override // com.google.crypto.tink.Key
    @Nullable
    public Integer getIdRequirementOrNull() {
        return this.f46518d;
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public SecretBytes getKeyBytes() {
        return this.f46516b;
    }

    @Override // com.google.crypto.tink.aead.AeadKey
    public Bytes getOutputPrefix() {
        return this.f46517c;
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public static ChaCha20Poly1305Key create(ChaCha20Poly1305Parameters.Variant variant, SecretBytes secretBytes, @Nullable Integer num) throws GeneralSecurityException {
        Bytes bytesCopyFrom;
        ChaCha20Poly1305Parameters.Variant variant2 = ChaCha20Poly1305Parameters.Variant.NO_PREFIX;
        if (variant != variant2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + variant + " the value of idRequirement must be non-null");
        }
        if (variant == variant2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (secretBytes.size() != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + secretBytes.size());
        }
        ChaCha20Poly1305Parameters chaCha20Poly1305ParametersCreate = ChaCha20Poly1305Parameters.create(variant);
        if (chaCha20Poly1305ParametersCreate.getVariant() == variant2) {
            bytesCopyFrom = Bytes.copyFrom(new byte[0]);
        } else if (chaCha20Poly1305ParametersCreate.getVariant() == ChaCha20Poly1305Parameters.Variant.CRUNCHY) {
            bytesCopyFrom = Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (chaCha20Poly1305ParametersCreate.getVariant() != ChaCha20Poly1305Parameters.Variant.TINK) {
                throw new IllegalStateException("Unknown Variant: " + chaCha20Poly1305ParametersCreate.getVariant());
            }
            bytesCopyFrom = Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new ChaCha20Poly1305Key(chaCha20Poly1305ParametersCreate, secretBytes, bytesCopyFrom, num);
    }

    @Override // com.google.crypto.tink.aead.AeadKey, com.google.crypto.tink.Key
    public ChaCha20Poly1305Parameters getParameters() {
        return this.f46515a;
    }
}
