package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
final class StringVariant extends Variant {
    private final String value;

    private StringVariant(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        this.value = str;
    }

    public static Variant from(String str) {
        return new StringVariant(str);
    }

    @Override // com.adobe.marketing.mobile.Variant
    public double convertToDouble() throws VariantException {
        try {
            return Double.parseDouble(this.value);
        } catch (NumberFormatException e5) {
            throw new VariantException(e5);
        }
    }

    @Override // com.adobe.marketing.mobile.Variant
    public String convertToString() {
        return this.value;
    }

    @Override // com.adobe.marketing.mobile.Variant
    public VariantKind getKind() {
        return VariantKind.STRING;
    }

    @Override // com.adobe.marketing.mobile.Variant
    public String getString() {
        return this.value;
    }

    public String toString() {
        return "\"" + this.value.replaceAll("\"", "\\\"") + "\"";
    }

    @Override // com.adobe.marketing.mobile.Variant
    /* JADX INFO: renamed from: clone */
    public final StringVariant mo4852clone() {
        return new StringVariant(this);
    }

    private StringVariant(StringVariant stringVariant) {
        if (stringVariant != null) {
            this.value = stringVariant.value;
            return;
        }
        throw new IllegalArgumentException();
    }
}
