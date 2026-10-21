package flexjson;

import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes7.dex */
public class JsonNumber extends Number {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f68496p0;

    public JsonNumber(String str) {
        this.f68496p0 = str;
    }

    public final boolean a() {
        String str = this.f68496p0;
        return str.length() > 1 && str.charAt(0) == '0' && Character.isDigit(str.charAt(1));
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return toDouble().doubleValue();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return toFloat().floatValue();
    }

    @Override // java.lang.Number
    public int intValue() {
        return toInteger().intValue();
    }

    public boolean isDecimal() {
        return this.f68496p0.matches("[\\x00-\\x20]*[+-]?(NaN|Infinity|((((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)([eE][+-]?(\\p{Digit}+))?)|(\\.((\\p{Digit}+))([eE][+-]?(\\p{Digit}+))?)|(((0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+)))[pP][+-]?(\\p{Digit}+)))[fFdD]?))[\\x00-\\x20]*");
    }

    public boolean isLong() {
        return this.f68496p0.matches("\\-?\\d+");
    }

    @Override // java.lang.Number
    public long longValue() {
        return toLong().longValue();
    }

    public BigDecimal toBigDecimal() {
        return new BigDecimal(this.f68496p0);
    }

    public BigInteger toBigInteger() {
        boolean zStartsWith = this.f68496p0.startsWith("0x");
        String str = this.f68496p0;
        if (zStartsWith) {
            return new BigInteger(str.substring(2), 16);
        }
        return a() ? new BigInteger(str.substring(1), 8) : new BigInteger(str);
    }

    public Byte toByte() {
        boolean zStartsWith = this.f68496p0.startsWith("0x");
        String str = this.f68496p0;
        if (zStartsWith) {
            return Byte.valueOf(Byte.parseByte(str.substring(2), 16));
        }
        return a() ? Byte.valueOf(Byte.parseByte(str.substring(1), 8)) : Byte.valueOf(Byte.parseByte(str));
    }

    public Double toDouble() {
        return Double.valueOf(Double.parseDouble(this.f68496p0));
    }

    public Float toFloat() {
        return Float.valueOf(Float.parseFloat(this.f68496p0));
    }

    public Integer toInteger() {
        boolean zStartsWith = this.f68496p0.startsWith("0x");
        String str = this.f68496p0;
        if (zStartsWith) {
            return Integer.valueOf(Integer.parseInt(str.substring(2), 16));
        }
        return a() ? Integer.valueOf(Integer.parseInt(str.substring(1), 8)) : Integer.valueOf(Integer.parseInt(str));
    }

    public Long toLong() {
        boolean zStartsWith = this.f68496p0.startsWith("0x");
        String str = this.f68496p0;
        if (zStartsWith) {
            return Long.valueOf(Long.parseLong(str.substring(2), 16));
        }
        return a() ? Long.valueOf(Long.parseLong(str.substring(1), 8)) : Long.valueOf(Long.parseLong(str));
    }

    public Short toShort() {
        boolean zStartsWith = this.f68496p0.startsWith("0x");
        String str = this.f68496p0;
        if (zStartsWith) {
            return Short.valueOf(Short.parseShort(str.substring(2), 16));
        }
        return a() ? Short.valueOf(Short.parseShort(str.substring(1), 8)) : Short.valueOf(Short.parseShort(str));
    }
}
