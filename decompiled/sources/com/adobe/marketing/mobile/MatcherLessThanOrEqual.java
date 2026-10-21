package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
final class MatcherLessThanOrEqual extends Matcher {
    @Override // com.adobe.marketing.mobile.Matcher
    public boolean matches(Object obj) {
        Double dTryParseDouble;
        if (obj == null || (dTryParseDouble = tryParseDouble(obj)) == null) {
            return false;
        }
        for (Object obj2 : this.values) {
            if ((obj2 instanceof Number) && dTryParseDouble.doubleValue() <= ((Number) obj2).doubleValue()) {
                return true;
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
            sb2.append(" LESS THAN OR EQUALS ");
            sb2.append(obj.toString());
        }
        sb2.insert(0, "(");
        sb2.append(")");
        return sb2.toString();
    }
}
