package com.nimbusds.jose.proc;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JOSEObject;
import com.nimbusds.jose.JWEDecrypter;
import com.nimbusds.jose.JWEObject;
import com.nimbusds.jose.JWSObject;
import com.nimbusds.jose.JWSVerifier;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.PlainObject;
import com.nimbusds.jose.crypto.factories.DefaultJWEDecrypterFactory;
import com.nimbusds.jose.crypto.factories.DefaultJWSVerifierFactory;
import com.nimbusds.jose.proc.SecurityContext;
import java.security.Key;
import java.text.ParseException;
import java.util.List;
import java.util.ListIterator;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class DefaultJOSEProcessor<C extends SecurityContext> implements ConfigurableJOSEProcessor<C> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JOSEObjectTypeVerifier<C> f62724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JOSEObjectTypeVerifier<C> f62725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JWSKeySelector<C> f62726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JWEKeySelector<C> f62727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public JWSVerifierFactory f62728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public JWEDecrypterFactory f62729f;

    public DefaultJOSEProcessor() {
        DefaultJOSEObjectTypeVerifier defaultJOSEObjectTypeVerifier = DefaultJOSEObjectTypeVerifier.JOSE;
        this.f62724a = defaultJOSEObjectTypeVerifier;
        this.f62725b = defaultJOSEObjectTypeVerifier;
        this.f62728e = new DefaultJWSVerifierFactory();
        this.f62729f = new DefaultJWEDecrypterFactory();
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public JWEDecrypterFactory getJWEDecrypterFactory() {
        return this.f62729f;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public JWEKeySelector<C> getJWEKeySelector() {
        return this.f62727d;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public JOSEObjectTypeVerifier<C> getJWETypeVerifier() {
        return this.f62725b;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public JWSKeySelector<C> getJWSKeySelector() {
        return this.f62726c;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public JOSEObjectTypeVerifier<C> getJWSTypeVerifier() {
        return this.f62724a;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public JWSVerifierFactory getJWSVerifierFactory() {
        return this.f62728e;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessor
    public Payload process(String str, C c10) throws BadJOSEException, JOSEException, ParseException {
        return process(JOSEObject.parse(str), c10);
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public void setJWEDecrypterFactory(JWEDecrypterFactory jWEDecrypterFactory) {
        this.f62729f = jWEDecrypterFactory;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public void setJWEKeySelector(JWEKeySelector<C> jWEKeySelector) {
        this.f62727d = jWEKeySelector;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public void setJWETypeVerifier(JOSEObjectTypeVerifier<C> jOSEObjectTypeVerifier) {
        this.f62725b = jOSEObjectTypeVerifier;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public void setJWSKeySelector(JWSKeySelector<C> jWSKeySelector) {
        this.f62726c = jWSKeySelector;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public void setJWSTypeVerifier(JOSEObjectTypeVerifier<C> jOSEObjectTypeVerifier) {
        this.f62724a = jOSEObjectTypeVerifier;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public void setJWSVerifierFactory(JWSVerifierFactory jWSVerifierFactory) {
        this.f62728e = jWSVerifierFactory;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessor
    public Payload process(JOSEObject jOSEObject, C c10) throws BadJOSEException, JOSEException {
        if (jOSEObject instanceof JWSObject) {
            return process((JWSObject) jOSEObject, (SecurityContext) c10);
        }
        if (jOSEObject instanceof JWEObject) {
            return process((JWEObject) jOSEObject, (SecurityContext) c10);
        }
        if (jOSEObject instanceof PlainObject) {
            return process((PlainObject) jOSEObject, (SecurityContext) c10);
        }
        throw new JOSEException("Unexpected JOSE object type: " + jOSEObject.getClass());
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessor
    public Payload process(PlainObject plainObject, C c10) throws BadJOSEException {
        JOSEObjectTypeVerifier<C> jOSEObjectTypeVerifier = this.f62724a;
        if (jOSEObjectTypeVerifier == null) {
            throw new BadJOSEException("Unsecured (plain) JOSE object rejected: No JWS header \"typ\" (type) verifier is configured");
        }
        jOSEObjectTypeVerifier.verify(plainObject.getHeader().getType(), c10);
        throw new BadJOSEException("Unsecured (plain) JOSE objects are rejected, extend class to handle");
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessor
    public Payload process(JWSObject jWSObject, C c10) throws BadJOSEException, JOSEException {
        JOSEObjectTypeVerifier<C> jOSEObjectTypeVerifier = this.f62724a;
        if (jOSEObjectTypeVerifier != null) {
            jOSEObjectTypeVerifier.verify(jWSObject.getHeader().getType(), c10);
            if (getJWSKeySelector() != null) {
                if (getJWSVerifierFactory() != null) {
                    List<? extends Key> listSelectJWSKeys = getJWSKeySelector().selectJWSKeys(jWSObject.getHeader(), c10);
                    if (listSelectJWSKeys != null && !listSelectJWSKeys.isEmpty()) {
                        ListIterator<? extends Key> listIterator = listSelectJWSKeys.listIterator();
                        while (listIterator.hasNext()) {
                            JWSVerifier jWSVerifierCreateJWSVerifier = getJWSVerifierFactory().createJWSVerifier(jWSObject.getHeader(), listIterator.next());
                            if (jWSVerifierCreateJWSVerifier != null) {
                                if (jWSObject.verify(jWSVerifierCreateJWSVerifier)) {
                                    return jWSObject.getPayload();
                                }
                                if (!listIterator.hasNext()) {
                                    throw new BadJWSException("JWS object rejected: Invalid signature");
                                }
                            }
                        }
                        throw new BadJOSEException("JWS object rejected: No matching verifier(s) found");
                    }
                    throw new BadJOSEException("JWS object rejected: Another algorithm expected, or no matching key(s) found");
                }
                throw new JOSEException("No JWS verifier is configured");
            }
            throw new BadJOSEException("JWS object rejected: No JWS key selector is configured");
        }
        throw new BadJOSEException("JWS object rejected: No JWS header \"typ\" (type) verifier is configured");
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessor
    public Payload process(JWEObject jWEObject, C c10) throws BadJOSEException, JOSEException {
        JOSEObjectTypeVerifier<C> jOSEObjectTypeVerifier = this.f62725b;
        if (jOSEObjectTypeVerifier != null) {
            jOSEObjectTypeVerifier.verify(jWEObject.getHeader().getType(), c10);
            if (getJWEKeySelector() != null) {
                if (getJWEDecrypterFactory() != null) {
                    List<? extends Key> listSelectJWEKeys = getJWEKeySelector().selectJWEKeys(jWEObject.getHeader(), c10);
                    if (listSelectJWEKeys != null && !listSelectJWEKeys.isEmpty()) {
                        ListIterator<? extends Key> listIterator = listSelectJWEKeys.listIterator();
                        while (listIterator.hasNext()) {
                            JWEDecrypter jWEDecrypterCreateJWEDecrypter = getJWEDecrypterFactory().createJWEDecrypter(jWEObject.getHeader(), listIterator.next());
                            if (jWEDecrypterCreateJWEDecrypter != null) {
                                try {
                                    jWEObject.decrypt(jWEDecrypterCreateJWEDecrypter);
                                    if ("JWT".equalsIgnoreCase(jWEObject.getHeader().getContentType())) {
                                        JWSObject jWSObject = jWEObject.getPayload().toJWSObject();
                                        if (jWSObject == null) {
                                            return jWEObject.getPayload();
                                        }
                                        return process(jWSObject, (SecurityContext) c10);
                                    }
                                    return jWEObject.getPayload();
                                } catch (JOSEException e5) {
                                    if (!listIterator.hasNext()) {
                                        throw new BadJWEException("JWE object rejected: " + e5.getMessage(), e5);
                                    }
                                }
                            }
                        }
                        throw new BadJOSEException("JWE object rejected: No matching decrypter(s) found");
                    }
                    throw new BadJOSEException("JWE object rejected: Another algorithm expected, or no matching key(s) found");
                }
                throw new JOSEException("No JWE decrypter is configured");
            }
            throw new BadJOSEException("JWE object rejected: No JWE key selector is configured");
        }
        throw new BadJOSEException("JWE object rejected: No JWE header \"typ\" (type) verifier is configured");
    }
}
