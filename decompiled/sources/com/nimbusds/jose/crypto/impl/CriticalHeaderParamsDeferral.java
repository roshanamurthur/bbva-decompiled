package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.Header;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEHeader;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class CriticalHeaderParamsDeferral {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set<String> f62604a = Collections.emptySet();

    public void ensureHeaderPasses(JWEHeader jWEHeader) throws JOSEException {
        if (!headerPasses(jWEHeader)) {
            throw new JOSEException("Unsupported critical header parameter(s)");
        }
    }

    public Set<String> getDeferredCriticalHeaderParams() {
        return Collections.unmodifiableSet(this.f62604a);
    }

    public Set<String> getProcessedCriticalHeaderParams() {
        return Collections.singleton("b64");
    }

    public boolean headerPasses(Header header) {
        if (header.getCriticalParams() == null) {
            return true;
        }
        for (String str : header.getCriticalParams()) {
            if (!getProcessedCriticalHeaderParams().contains(str) && !getDeferredCriticalHeaderParams().contains(str)) {
                return false;
            }
        }
        return true;
    }

    public void setDeferredCriticalHeaderParams(Set<String> set) {
        if (set == null) {
            this.f62604a = Collections.emptySet();
        } else {
            this.f62604a = set;
        }
    }
}
