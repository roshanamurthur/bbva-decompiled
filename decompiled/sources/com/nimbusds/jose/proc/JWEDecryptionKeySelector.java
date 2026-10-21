package com.nimbusds.jose.proc;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.KeySourceException;
import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.jwk.JWKMatcher;
import com.nimbusds.jose.jwk.JWKSelector;
import com.nimbusds.jose.jwk.KeyConverter;
import com.nimbusds.jose.jwk.source.JWKSource;
import com.nimbusds.jose.proc.SecurityContext;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javax.crypto.SecretKey;
import ji.a;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class JWEDecryptionKeySelector<C extends SecurityContext> extends a<C> implements JWEKeySelector<C> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JWEAlgorithm f62740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EncryptionMethod f62741c;

    public JWEDecryptionKeySelector(JWEAlgorithm jWEAlgorithm, EncryptionMethod encryptionMethod, JWKSource<C> jWKSource) {
        super(jWKSource);
        if (jWEAlgorithm == null) {
            throw new IllegalArgumentException("The JWE algorithm must not be null");
        }
        this.f62740b = jWEAlgorithm;
        if (encryptionMethod == null) {
            throw new IllegalArgumentException("The JWE encryption method must not be null");
        }
        this.f62741c = encryptionMethod;
    }

    public JWKMatcher createJWKMatcher(JWEHeader jWEHeader) {
        if (getExpectedJWEAlgorithm().equals(jWEHeader.getAlgorithm()) && getExpectedJWEEncryptionMethod().equals(jWEHeader.getEncryptionMethod())) {
            return JWKMatcher.forJWEHeader(jWEHeader);
        }
        return null;
    }

    public JWEAlgorithm getExpectedJWEAlgorithm() {
        return this.f62740b;
    }

    public EncryptionMethod getExpectedJWEEncryptionMethod() {
        return this.f62741c;
    }

    @Override // ji.a
    public /* bridge */ /* synthetic */ JWKSource getJWKSource() {
        return super.getJWKSource();
    }

    @Override // com.nimbusds.jose.proc.JWEKeySelector
    public List<Key> selectJWEKeys(JWEHeader jWEHeader, C c10) throws KeySourceException {
        if (!this.f62740b.equals(jWEHeader.getAlgorithm()) || !this.f62741c.equals(jWEHeader.getEncryptionMethod())) {
            return Collections.emptyList();
        }
        List<JWK> list = getJWKSource().get(new JWKSelector(createJWKMatcher(jWEHeader)), c10);
        LinkedList linkedList = new LinkedList();
        for (Key key : KeyConverter.toJavaKeys(list)) {
            if ((key instanceof PrivateKey) || (key instanceof SecretKey)) {
                linkedList.add(key);
            }
        }
        return linkedList;
    }
}
