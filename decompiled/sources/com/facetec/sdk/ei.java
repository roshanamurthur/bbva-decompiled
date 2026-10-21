package com.facetec.sdk;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public final class ei extends ec {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f41467e;

    public ei(Boolean bool) {
        this.f41467e = er.b(bool);
    }

    @Override // com.facetec.sdk.ec
    public final double a() {
        return m() ? b().doubleValue() : Double.parseDouble(d());
    }

    @Override // com.facetec.sdk.ec
    public final Number b() {
        Object obj = this.f41467e;
        return obj instanceof String ? new fb((String) obj) : (Number) obj;
    }

    @Override // com.facetec.sdk.ec
    public final long c() {
        return m() ? b().longValue() : Long.parseLong(d());
    }

    @Override // com.facetec.sdk.ec
    public final String d() {
        if (m()) {
            return b().toString();
        }
        return k() ? ((Boolean) this.f41467e).toString() : (String) this.f41467e;
    }

    @Override // com.facetec.sdk.ec
    public final int e() {
        return m() ? b().intValue() : Integer.parseInt(d());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ei.class != obj.getClass()) {
            return false;
        }
        ei eiVar = (ei) obj;
        if (this.f41467e == null) {
            return eiVar.f41467e == null;
        }
        if (c(this) && c(eiVar)) {
            return b().longValue() == eiVar.b().longValue();
        }
        Object obj2 = this.f41467e;
        if (!(obj2 instanceof Number) || !(eiVar.f41467e instanceof Number)) {
            return obj2.equals(eiVar.f41467e);
        }
        double dDoubleValue = b().doubleValue();
        double dDoubleValue2 = eiVar.b().doubleValue();
        return dDoubleValue == dDoubleValue2 || (Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2));
    }

    @Override // com.facetec.sdk.ec
    public final boolean f() {
        return k() ? ((Boolean) this.f41467e).booleanValue() : Boolean.parseBoolean(d());
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        if (this.f41467e == null) {
            return 31;
        }
        if (c(this)) {
            jDoubleToLongBits = b().longValue();
        } else {
            Object obj = this.f41467e;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(b().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public final boolean k() {
        return this.f41467e instanceof Boolean;
    }

    public final boolean l() {
        return this.f41467e instanceof String;
    }

    public final boolean m() {
        return this.f41467e instanceof Number;
    }

    private static boolean c(ei eiVar) {
        Object obj = eiVar.f41467e;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public ei(Number number) {
        this.f41467e = er.b(number);
    }

    public ei(String str) {
        this.f41467e = er.b(str);
    }
}
