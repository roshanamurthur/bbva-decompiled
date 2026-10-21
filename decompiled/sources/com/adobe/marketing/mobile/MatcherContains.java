package com.adobe.marketing.mobile;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
class MatcherContains extends Matcher {
    @Override // com.adobe.marketing.mobile.Matcher
    public boolean matches(Object obj) {
        boolean z10 = obj instanceof Number;
        if (!(obj instanceof String) && !z10) {
            return false;
        }
        String string = obj.toString();
        for (Object obj2 : this.values) {
            if ((obj2 instanceof String) && Pattern.compile(Pattern.quote(obj2.toString()), 2).matcher(string).find()) {
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
            sb2.append(" CONTAINS ");
            sb2.append(obj.toString());
        }
        sb2.insert(0, "(");
        sb2.append(")");
        return sb2.toString();
    }
}
