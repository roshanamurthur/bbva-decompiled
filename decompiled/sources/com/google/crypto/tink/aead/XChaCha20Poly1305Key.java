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
public final class XChaCha20Poly1305Key extends AeadKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XChaCha20Poly1305Parameters f46527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SecretBytes f46528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bytes f46529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Integer f46530d;

    public XChaCha20Poly1305Key(XChaCha20Poly1305Parameters xChaCha20Poly1305Parameters, SecretBytes secretBytes, Bytes bytes, @Nullable Integer num) {
        this.f46527a = xChaCha20Poly1305Parameters;
        this.f46528b = secretBytes;
        this.f46529c = bytes;
        this.f46530d = num;
    }

    @AccessesPartialKey
    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public static XChaCha20Poly1305Key create(SecretBytes secretBytes) throws GeneralSecurityException {
        return create(XChaCha20Poly1305Parameters.Variant.NO_PREFIX, secretBytes, null);
    }

    @Override // com.google.crypto.tink.Key
    public boolean equalsKey(Key key) {
        if (!(key instanceof XChaCha20Poly1305Key)) {
            return false;
        }
        XChaCha20Poly1305Key xChaCha20Poly1305Key = (XChaCha20Poly1305Key) key;
        return xChaCha20Poly1305Key.f46527a.equals(this.f46527a) && xChaCha20Poly1305Key.f46528b.equalsSecretBytes(this.f46528b) && Objects.equals(xChaCha20Poly1305Key.f46530d, this.f46530d);
    }

    @Override // com.google.crypto.tink.Key
    @Nullable
    public Integer getIdRequirementOrNull() {
        return this.f46530d;
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public SecretBytes getKeyBytes() {
        return this.f46528b;
    }

    @Override // com.google.crypto.tink.aead.AeadKey
    public Bytes getOutputPrefix() {
        return this.f46529c;
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public static XChaCha20Poly1305Key create(XChaCha20Poly1305Parameters.Variant variant, SecretBytes secretBytes, @Nullable Integer num) throws GeneralSecurityException {
        Bytes bytesCopyFrom;
        XChaCha20Poly1305Parameters.Variant variant2 = XChaCha20Poly1305Parameters.Variant.NO_PREFIX;
        if (variant != variant2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + variant + " the value of idRequirement must be non-null");
        }
        if (variant == variant2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (secretBytes.size() != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + secretBytes.size());
        }
        XChaCha20Poly1305Parameters xChaCha20Poly1305ParametersCreate = XChaCha20Poly1305Parameters.create(variant);
        if (xChaCha20Poly1305ParametersCreate.getVariant() == variant2) {
            bytesCopyFrom = Bytes.copyFrom(new byte[0]);
        } else if (xChaCha20Poly1305ParametersCreate.getVariant() == XChaCha20Poly1305Parameters.Variant.CRUNCHY) {
            bytesCopyFrom = Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (xChaCha20Poly1305ParametersCreate.getVariant() != XChaCha20Poly1305Parameters.Variant.TINK) {
                throw new IllegalStateException("Unknown Variant: " + xChaCha20Poly1305ParametersCreate.getVariant());
            }
            bytesCopyFrom = Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new XChaCha20Poly1305Key(xChaCha20Poly1305ParametersCreate, secretBytes, bytesCopyFrom, num);
    }

    @Override // com.google.crypto.tink.aead.AeadKey, com.google.crypto.tink.Key
    public XChaCha20Poly1305Parameters getParameters() {
        return this.f46527a;
    }
}
