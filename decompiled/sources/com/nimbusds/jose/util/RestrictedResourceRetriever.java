package com.nimbusds.jose.util;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public interface RestrictedResourceRetriever extends ResourceRetriever {
    int getConnectTimeout();

    Map<String, List<String>> getHeaders();

    int getReadTimeout();

    int getSizeLimit();

    void setConnectTimeout(int i10);

    void setHeaders(Map<String, List<String>> map);

    void setReadTimeout(int i10);

    void setSizeLimit(int i10);
}
