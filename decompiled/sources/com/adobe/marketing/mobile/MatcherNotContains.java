package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
final class MatcherNotContains extends MatcherContains {
    @Override // com.adobe.marketing.mobile.MatcherContains, com.adobe.marketing.mobile.Matcher
    public boolean matches(Object obj) {
        return (obj == null || super.matches(obj)) ? false : true;
    }

    @Override // com.adobe.marketing.mobile.MatcherContains, com.adobe.marketing.mobile.Matcher
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (Object obj : this.values) {
            if (sb2.length() > 0) {
                sb2.append(" OR ");
            }
            sb2.append(this.key);
            sb2.append(" NOT CONTAINS ");
            sb2.append(obj.toString());
        }
        sb2.insert(0, "(");
        sb2.append(")");
        return sb2.toString();
    }
}
