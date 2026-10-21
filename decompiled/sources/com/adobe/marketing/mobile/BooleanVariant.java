package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
final class BooleanVariant extends Variant {
    private final boolean value;
    private static final BooleanVariant TRUE = new BooleanVariant(true);
    private static final BooleanVariant FALSE = new BooleanVariant(false);

    private BooleanVariant(boolean z10) {
        this.value = z10;
    }

    public static Variant from(boolean z10) {
        return z10 ? TRUE : FALSE;
    }

    @Override // com.adobe.marketing.mobile.Variant
    public double convertToDouble() {
        return this.value ? 1.0d : 0.0d;
    }

    @Override // com.adobe.marketing.mobile.Variant
    public String convertToString() {
        return this.value ? "true" : "false";
    }

    @Override // com.adobe.marketing.mobile.Variant
    public boolean getBoolean() {
        return this.value;
    }

    @Override // com.adobe.marketing.mobile.Variant
    public VariantKind getKind() {
        return VariantKind.BOOLEAN;
    }

    public String toString() {
        return convertToString();
    }

    private BooleanVariant(BooleanVariant booleanVariant) {
        if (booleanVariant != null) {
            this.value = booleanVariant.value;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.adobe.marketing.mobile.Variant
    /* JADX INFO: renamed from: clone */
    public final BooleanVariant mo4852clone() {
        return new BooleanVariant(this);
    }
}
