package com.adobe.marketing.mobile;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
final class NullVariant extends Variant {
    static NullVariant DefaultInstance = new NullVariant();

    private NullVariant() {
    }

    public static NullVariant from() {
        return DefaultInstance;
    }

    @Override // com.adobe.marketing.mobile.Variant
    public VariantKind getKind() {
        return VariantKind.NULL;
    }

    public String toString() {
        return AbstractJsonLexerKt.NULL;
    }

    private NullVariant(NullVariant nullVariant) {
        if (nullVariant == null) {
            throw new IllegalArgumentException();
        }
    }

    @Override // com.adobe.marketing.mobile.Variant
    /* JADX INFO: renamed from: clone */
    public final NullVariant mo4852clone() {
        return new NullVariant(this);
    }
}
