package com.nimbusds.jose.proc;

import com.nimbusds.jose.JOSEObjectType;
import com.nimbusds.jose.proc.SecurityContext;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public class DefaultJOSEObjectTypeVerifier<C extends SecurityContext> implements JOSEObjectTypeVerifier<C> {
    public static final DefaultJOSEObjectTypeVerifier JOSE = new DefaultJOSEObjectTypeVerifier(JOSEObjectType.JOSE, null);
    public static final DefaultJOSEObjectTypeVerifier JWT = new DefaultJOSEObjectTypeVerifier(JOSEObjectType.JWT, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<JOSEObjectType> f62723a;

    public DefaultJOSEObjectTypeVerifier() {
        this.f62723a = Collections.singleton(null);
    }

    public Set<JOSEObjectType> getAllowedTypes() {
        return this.f62723a;
    }

    @Override // com.nimbusds.jose.proc.JOSEObjectTypeVerifier
    public void verify(JOSEObjectType jOSEObjectType, C c10) throws BadJOSEException {
        Set<JOSEObjectType> set = this.f62723a;
        if (jOSEObjectType == null && !set.contains(null)) {
            throw new BadJOSEException("Required JOSE header \"typ\" (type) parameter is missing");
        }
        if (set.contains(jOSEObjectType)) {
            return;
        }
        throw new BadJOSEException("JOSE header \"typ\" (type) \"" + jOSEObjectType + "\" not allowed");
    }

    public DefaultJOSEObjectTypeVerifier(Set<JOSEObjectType> set) {
        if (set != null && !set.isEmpty()) {
            this.f62723a = set;
            return;
        }
        throw new IllegalArgumentException("The allowed types must not be null or empty");
    }

    public DefaultJOSEObjectTypeVerifier(JOSEObjectType... jOSEObjectTypeArr) {
        if (jOSEObjectTypeArr != null && jOSEObjectTypeArr.length != 0) {
            this.f62723a = new HashSet(Arrays.asList(jOSEObjectTypeArr));
            return;
        }
        throw new IllegalArgumentException("The allowed types must not be null or empty");
    }
}
