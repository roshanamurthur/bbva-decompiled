package com.adobe.marketing.mobile;

import ad.d;

/* JADX INFO: loaded from: classes2.dex */
final class MatcherNotExists extends MatcherExists {
    @Override // com.adobe.marketing.mobile.MatcherExists, com.adobe.marketing.mobile.Matcher
    public boolean matches(Object obj) {
        return !super.matches(obj);
    }

    @Override // com.adobe.marketing.mobile.MatcherExists, com.adobe.marketing.mobile.Matcher
    public String toString() {
        return d.f(new StringBuilder("("), this.key, " NOT EXISTS)");
    }
}
