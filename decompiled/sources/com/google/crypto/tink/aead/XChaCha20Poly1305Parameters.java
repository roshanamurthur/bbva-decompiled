package com.google.crypto.tink.aead;

import com.google.errorprone.annotations.Immutable;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public final class XChaCha20Poly1305Parameters extends AeadParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Variant f46532a;

    @Immutable
    public static final class Variant {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46533a;
        public static final Variant TINK = new Variant("TINK");
        public static final Variant CRUNCHY = new Variant("CRUNCHY");
        public static final Variant NO_PREFIX = new Variant("NO_PREFIX");

        public Variant(String str) {
            this.f46533a = str;
        }

        public String toString() {
            return this.f46533a;
        }
    }

    public XChaCha20Poly1305Parameters(Variant variant) {
        this.f46532a = variant;
    }

    public static XChaCha20Poly1305Parameters create() {
        return new XChaCha20Poly1305Parameters(Variant.NO_PREFIX);
    }

    public boolean equals(Object obj) {
        return (obj instanceof XChaCha20Poly1305Parameters) && ((XChaCha20Poly1305Parameters) obj).getVariant() == getVariant();
    }

    public Variant getVariant() {
        return this.f46532a;
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
        return this.f46532a != Variant.NO_PREFIX;
    }

    public int hashCode() {
        return Objects.hashCode(this.f46532a);
    }

    public String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f46532a + ")";
    }

    public static XChaCha20Poly1305Parameters create(Variant variant) {
        return new XChaCha20Poly1305Parameters(variant);
    }
}
