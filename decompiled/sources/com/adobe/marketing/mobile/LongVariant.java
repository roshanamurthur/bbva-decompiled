package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
final class LongVariant extends Variant {
    private final long value;

    private LongVariant(long j10) {
        if (j10 > 9007199254740991L || j10 < Variant.MIN_SAFE_INTEGER) {
            throw new IllegalArgumentException("Integer cannot be stored accurately in a Variant");
        }
        this.value = j10;
    }

    public static Variant from(long j10) {
        return new LongVariant(j10);
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
    public int getInteger() throws VariantException {
        long j10 = this.value;
        if (j10 > 2147483647L || j10 < -2147483648L) {
            throw new VariantRangeException("long value is not expressible as an int");
        }
        return (int) j10;
    }

    @Override // com.adobe.marketing.mobile.Variant
    public VariantKind getKind() {
        return VariantKind.LONG;
    }

    @Override // com.adobe.marketing.mobile.Variant
    public long getLong() {
        return this.value;
    }

    public String toString() {
        return convertToString();
    }

    @Override // com.adobe.marketing.mobile.Variant
    /* JADX INFO: renamed from: clone */
    public LongVariant mo4852clone() {
        return new LongVariant(this);
    }

    private LongVariant(LongVariant longVariant) {
        if (longVariant != null) {
            this.value = longVariant.value;
            return;
        }
        throw new IllegalArgumentException();
    }
}
