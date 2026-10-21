package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
final class DoubleVariant extends Variant {
    private final double value;

    private DoubleVariant(double d2) {
        this.value = d2;
    }

    public static Variant from(double d2) {
        return new DoubleVariant(d2);
    }

    @Override // com.adobe.marketing.mobile.Variant
    public double convertToDouble() {
        return this.value;
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
        long j10 = getLong();
        if (j10 > 2147483647L || j10 < -2147483648L) {
            throw new VariantRangeException("double value is not expressible as an int");
        }
        return (int) j10;
    }

    @Override // com.adobe.marketing.mobile.Variant
    public VariantKind getKind() {
        return VariantKind.DOUBLE;
    }

    @Override // com.adobe.marketing.mobile.Variant
    public long getLong() throws VariantException {
        double d2 = this.value;
        if (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d || Double.isNaN(d2) || Double.isInfinite(this.value)) {
            throw new VariantRangeException("double value is not expressible as a long");
        }
        double dRint = Math.rint(this.value);
        if (dRint > 9.223372036854776E18d || dRint < -9.223372036854776E18d || Double.isNaN(dRint) || Double.isInfinite(dRint)) {
            throw new VariantRangeException("double value is not expressible as a long");
        }
        return Math.round(dRint);
    }

    public String toString() {
        return convertToString();
    }

    private DoubleVariant(DoubleVariant doubleVariant) {
        if (doubleVariant != null) {
            this.value = doubleVariant.value;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.adobe.marketing.mobile.Variant
    /* JADX INFO: renamed from: clone */
    public DoubleVariant mo4852clone() {
        return new DoubleVariant(this);
    }
}
