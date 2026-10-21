package com.google.crypto.tink.aead;

import com.google.errorprone.annotations.Immutable;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public final class ChaCha20Poly1305Parameters extends AeadParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Variant f46520a;

    @Immutable
    public static final class Variant {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46521a;
        public static final Variant TINK = new Variant("TINK");
        public static final Variant CRUNCHY = new Variant("CRUNCHY");
        public static final Variant NO_PREFIX = new Variant("NO_PREFIX");

        public Variant(String str) {
            this.f46521a = str;
        }

        public String toString() {
            return this.f46521a;
        }
    }

    public ChaCha20Poly1305Parameters(Variant variant) {
        this.f46520a = variant;
    }

    public static ChaCha20Poly1305Parameters create() {
        return new ChaCha20Poly1305Parameters(Variant.NO_PREFIX);
    }

    public boolean equals(Object obj) {
        return (obj instanceof ChaCha20Poly1305Parameters) && ((ChaCha20Poly1305Parameters) obj).getVariant() == getVariant();
    }

    public Variant getVariant() {
        return this.f46520a;
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
        return this.f46520a != Variant.NO_PREFIX;
    }

    public int hashCode() {
        return Objects.hashCode(this.f46520a);
    }

    public String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f46520a + ")";
    }

    public static ChaCha20Poly1305Parameters create(Variant variant) {
        return new ChaCha20Poly1305Parameters(variant);
    }
}
