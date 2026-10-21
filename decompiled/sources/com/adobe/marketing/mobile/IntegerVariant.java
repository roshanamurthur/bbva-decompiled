package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
final class IntegerVariant extends Variant {
    private final int value;

    private IntegerVariant(int i10) {
        this.value = i10;
    }

    public static Variant from(int i10) {
        return new IntegerVariant(i10);
    }

    @Override // com.adobe.marketing.mobile.Variant
    public double convertToDouble() {
        return getDouble();
    }

    @Override // com.adobe.marketing.mobile.Variant
    public String convertToString() {
        return String.valueOf(this.value);
    }

    @Override // com.adobe.marketing.mobile.Variant
    public double getDouble() {
        return this.value;
    }

    @Override // com.adobe.marketing.mobile.Variant
    public int getInteger() {
        return this.value;
    }

    @Override // com.adobe.marketing.mobile.Variant
    public VariantKind getKind() {
        return VariantKind.INTEGER;
    }

    @Override // com.adobe.marketing.mobile.Variant
    public long getLong() {
        return this.value;
    }

    public String toString() {
        return convertToString();
    }

    private IntegerVariant(IntegerVariant integerVariant) {
        if (integerVariant != null) {
            this.value = integerVariant.value;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.adobe.marketing.mobile.Variant
    /* JADX INFO: renamed from: clone */
    public IntegerVariant mo4852clone() {
        return new IntegerVariant(this);
    }
}
