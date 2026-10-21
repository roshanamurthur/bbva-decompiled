package com.nimbusds.jose.jwk.source;

import androidx.camera.core.impl.a;
import com.nimbusds.jose.RemoteKeySourceException;
import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.jwk.JWKMatcher;
import com.nimbusds.jose.jwk.JWKSelector;
import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.proc.SecurityContext;
import com.nimbusds.jose.util.DefaultResourceRetriever;
import com.nimbusds.jose.util.ResourceRetriever;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class RemoteJWKSet<C extends SecurityContext> implements JWKSource<C> {
    public static final int DEFAULT_HTTP_CONNECT_TIMEOUT = 500;
    public static final int DEFAULT_HTTP_READ_TIMEOUT = 500;
    public static final int DEFAULT_HTTP_SIZE_LIMIT = 51200;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final URL f62720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JWKSetCache f62721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceRetriever f62722c;

    public RemoteJWKSet(URL url) {
        this(url, null);
    }

    public static String getFirstSpecifiedKeyID(JWKMatcher jWKMatcher) {
        Set<String> keyIDs = jWKMatcher.getKeyIDs();
        if (keyIDs != null && !keyIDs.isEmpty()) {
            for (String str : keyIDs) {
                if (str != null) {
                    return str;
                }
            }
        }
        return null;
    }

    public final JWKSet a() throws RemoteKeySourceException {
        try {
            try {
                JWKSet jWKSet = JWKSet.parse(this.f62722c.retrieveResource(this.f62720a).getContent());
                this.f62721b.put(jWKSet);
                return jWKSet;
            } catch (ParseException e5) {
                throw new RemoteKeySourceException("Couldn't parse remote JWK set: " + e5.getMessage(), e5);
            }
        } catch (IOException e7) {
            throw new RemoteKeySourceException(a.d(e7, new StringBuilder("Couldn't retrieve remote JWK set: ")), e7);
        }
    }

    @Override // com.nimbusds.jose.jwk.source.JWKSource
    public List<JWK> get(JWKSelector jWKSelector, C c10) throws Exception {
        JWKSetCache jWKSetCache = this.f62721b;
        JWKSet jWKSetA = jWKSetCache.get();
        if (jWKSetCache.requiresRefresh() || jWKSetA == null) {
            try {
                jWKSetA = a();
            } catch (Exception e5) {
                if (jWKSetA == null) {
                    throw e5;
                }
            }
        }
        List<JWK> listSelect = jWKSelector.select(jWKSetA);
        if (!listSelect.isEmpty()) {
            return listSelect;
        }
        String firstSpecifiedKeyID = getFirstSpecifiedKeyID(jWKSelector.getMatcher());
        if (firstSpecifiedKeyID == null) {
            return Collections.emptyList();
        }
        if (jWKSetA.getKeyByKeyId(firstSpecifiedKeyID) != null) {
            return Collections.emptyList();
        }
        JWKSet jWKSetA2 = a();
        return jWKSetA2 == null ? Collections.emptyList() : jWKSelector.select(jWKSetA2);
    }

    public JWKSet getCachedJWKSet() {
        return this.f62721b.get();
    }

    public JWKSetCache getJWKSetCache() {
        return this.f62721b;
    }

    public URL getJWKSetURL() {
        return this.f62720a;
    }

    public ResourceRetriever getResourceRetriever() {
        return this.f62722c;
    }

    public RemoteJWKSet(URL url, ResourceRetriever resourceRetriever) {
        this(url, resourceRetriever, null);
    }

    public RemoteJWKSet(URL url, ResourceRetriever resourceRetriever, JWKSetCache jWKSetCache) {
        if (url != null) {
            this.f62720a = url;
            if (resourceRetriever != null) {
                this.f62722c = resourceRetriever;
            } else {
                this.f62722c = new DefaultResourceRetriever(500, 500, DEFAULT_HTTP_SIZE_LIMIT);
            }
            if (jWKSetCache != null) {
                this.f62721b = jWKSetCache;
                return;
            } else {
                this.f62721b = new DefaultJWKSetCache();
                return;
            }
        }
        throw new IllegalArgumentException("The JWK set URL must not be null");
    }
}
