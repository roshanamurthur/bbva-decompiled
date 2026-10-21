package com.facetec.sdk;

import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes9.dex */
public final class fb extends Number {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f41542d;

    public fb(String str) {
        this.f41542d = str;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new BigDecimal(this.f41542d);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f41542d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb)) {
            return false;
        }
        String str = this.f41542d;
        String str2 = ((fb) obj).f41542d;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f41542d);
    }

    public final int hashCode() {
        return this.f41542d.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.f41542d);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f41542d);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f41542d).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.f41542d);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f41542d).longValue();
        }
    }

    public final String toString() {
        return this.f41542d;
    }
}
