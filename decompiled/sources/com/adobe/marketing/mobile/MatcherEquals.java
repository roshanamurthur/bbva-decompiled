package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class MatcherEquals extends Matcher {
    private static final String FALSE_STRING = "false";
    private static final String ONE_STRING = "1";
    private static final String TRUE_STRING = "true";
    private static final String ZERO_STRING = "0";

    public boolean compareObjectWithBoolean(Object obj, boolean z10) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() == z10;
        }
        if ((obj instanceof Integer) || (obj instanceof Long)) {
            long jLongValue = ((Number) obj).longValue();
            if (jLongValue == 1 && z10) {
                return true;
            }
            return jLongValue == 0 && !z10;
        }
        if (!(obj instanceof String)) {
            return false;
        }
        String str = (String) obj;
        if (z10) {
            if ("1".equals(str) || TRUE_STRING.equalsIgnoreCase(str)) {
                return true;
            }
        } else if ("0".equals(str) || FALSE_STRING.equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    @Override // com.adobe.marketing.mobile.Matcher
    public boolean matches(Object obj) {
        for (Object obj2 : this.values) {
            boolean z10 = obj2 instanceof String;
            if ((z10 && (obj instanceof String)) || (z10 && (obj instanceof Number))) {
                if (obj2.toString().compareToIgnoreCase(obj.toString()) == 0) {
                    return true;
                }
            } else {
                boolean z11 = obj2 instanceof Number;
                if (z11 && (obj instanceof Number)) {
                    if (Double.compare(((Number) obj2).doubleValue(), ((Number) obj).doubleValue()) == 0) {
                        return true;
                    }
                } else if (z11 && (obj instanceof String)) {
                    Double dTryParseDouble = tryParseDouble(obj);
                    if (dTryParseDouble != null && Double.compare(((Number) obj2).doubleValue(), dTryParseDouble.doubleValue()) == 0) {
                        return true;
                    }
                } else if (obj2 instanceof Boolean) {
                    return compareObjectWithBoolean(obj, ((Boolean) obj2).booleanValue());
                }
            }
        }
        return false;
    }

    @Override // com.adobe.marketing.mobile.Matcher
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (Object obj : this.values) {
            if (sb2.length() > 0) {
                sb2.append(" OR ");
            }
            sb2.append(this.key);
            sb2.append(" EQUALS ");
            sb2.append(obj.toString());
        }
        sb2.insert(0, "(");
        sb2.append(")");
        return sb2.toString();
    }
}
