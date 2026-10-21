package com.adobe.marketing.mobile;

import ad.d;

/* JADX INFO: loaded from: classes2.dex */
class MatcherExists extends Matcher {
    @Override // com.adobe.marketing.mobile.Matcher
    public boolean matches(Object obj) {
        return obj != null;
    }

    @Override // com.adobe.marketing.mobile.Matcher
    public String toString() {
        return d.f(new StringBuilder("("), this.key, " EXISTS)");
    }
}
