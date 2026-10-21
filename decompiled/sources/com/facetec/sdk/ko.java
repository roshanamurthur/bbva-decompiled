package com.facetec.sdk;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public enum ko {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f42121j;

    ko(String str) {
        this.f42121j = str;
    }

    public static ko e(String str) throws IOException {
        ko koVar = HTTP_1_0;
        if (str.equals(koVar.f42121j)) {
            return koVar;
        }
        ko koVar2 = HTTP_1_1;
        if (str.equals(koVar2.f42121j)) {
            return koVar2;
        }
        ko koVar3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(koVar3.f42121j)) {
            return koVar3;
        }
        ko koVar4 = HTTP_2;
        if (str.equals(koVar4.f42121j)) {
            return koVar4;
        }
        if (str.equals(SPDY_3.f42121j)) {
            return SPDY_3;
        }
        if (str.equals(QUIC.f42121j)) {
            return QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f42121j;
    }
}
