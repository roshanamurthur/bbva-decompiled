package com.nimbusds.jwt.proc;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEDecrypter;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSVerifier;
import com.nimbusds.jose.crypto.factories.DefaultJWEDecrypterFactory;
import com.nimbusds.jose.crypto.factories.DefaultJWSVerifierFactory;
import com.nimbusds.jose.proc.BadJOSEException;
import com.nimbusds.jose.proc.BadJWEException;
import com.nimbusds.jose.proc.BadJWSException;
import com.nimbusds.jose.proc.DefaultJOSEObjectTypeVerifier;
import com.nimbusds.jose.proc.JOSEObjectTypeVerifier;
import com.nimbusds.jose.proc.JWEDecrypterFactory;
import com.nimbusds.jose.proc.JWEKeySelector;
import com.nimbusds.jose.proc.JWSKeySelector;
import com.nimbusds.jose.proc.JWSVerifierFactory;
import com.nimbusds.jose.proc.SecurityContext;
import com.nimbusds.jwt.EncryptedJWT;
import com.nimbusds.jwt.JWT;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.JWTParser;
import com.nimbusds.jwt.PlainJWT;
import com.nimbusds.jwt.SignedJWT;
import java.security.Key;
import java.text.ParseException;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes10.dex */
public class DefaultJWTProcessor<C extends SecurityContext> implements ConfigurableJWTProcessor<C> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JOSEObjectTypeVerifier<C> f62843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JOSEObjectTypeVerifier<C> f62844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JWSKeySelector<C> f62845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JWTClaimsSetAwareJWSKeySelector<C> f62846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public JWEKeySelector<C> f62847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public JWSVerifierFactory f62848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public JWEDecrypterFactory f62849g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public JWTClaimsSetVerifier<C> f62850h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public JWTClaimsVerifier f62851i;

    public DefaultJWTProcessor() {
        DefaultJOSEObjectTypeVerifier defaultJOSEObjectTypeVerifier = DefaultJOSEObjectTypeVerifier.JWT;
        this.f62843a = defaultJOSEObjectTypeVerifier;
        this.f62844b = defaultJOSEObjectTypeVerifier;
        this.f62848f = new DefaultJWSVerifierFactory();
        this.f62849g = new DefaultJWEDecrypterFactory();
        this.f62850h = new DefaultJWTClaimsVerifier();
        this.f62851i = null;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public JWEDecrypterFactory getJWEDecrypterFactory() {
        return this.f62849g;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public JWEKeySelector<C> getJWEKeySelector() {
        return this.f62847e;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public JOSEObjectTypeVerifier<C> getJWETypeVerifier() {
        return this.f62844b;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public JWSKeySelector<C> getJWSKeySelector() {
        return this.f62845c;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public JOSEObjectTypeVerifier<C> getJWSTypeVerifier() {
        return this.f62843a;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public JWSVerifierFactory getJWSVerifierFactory() {
        return this.f62848f;
    }

    @Override // com.nimbusds.jwt.proc.JWTProcessorConfiguration
    public JWTClaimsSetAwareJWSKeySelector<C> getJWTClaimsSetAwareJWSKeySelector() {
        return this.f62846d;
    }

    @Override // com.nimbusds.jwt.proc.JWTProcessorConfiguration
    public JWTClaimsSetVerifier<C> getJWTClaimsSetVerifier() {
        return this.f62850h;
    }

    @Override // com.nimbusds.jwt.proc.JWTProcessorConfiguration
    @Deprecated
    public JWTClaimsVerifier getJWTClaimsVerifier() {
        return this.f62851i;
    }

    @Override // com.nimbusds.jwt.proc.JWTProcessor
    public JWTClaimsSet process(String str, C c10) throws BadJOSEException, JOSEException, ParseException {
        return process(JWTParser.parse(str), c10);
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public void setJWEDecrypterFactory(JWEDecrypterFactory jWEDecrypterFactory) {
        this.f62849g = jWEDecrypterFactory;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public void setJWEKeySelector(JWEKeySelector<C> jWEKeySelector) {
        this.f62847e = jWEKeySelector;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public void setJWETypeVerifier(JOSEObjectTypeVerifier<C> jOSEObjectTypeVerifier) {
        this.f62844b = jOSEObjectTypeVerifier;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public void setJWSKeySelector(JWSKeySelector<C> jWSKeySelector) {
        this.f62845c = jWSKeySelector;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public void setJWSTypeVerifier(JOSEObjectTypeVerifier<C> jOSEObjectTypeVerifier) {
        this.f62843a = jOSEObjectTypeVerifier;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public void setJWSVerifierFactory(JWSVerifierFactory jWSVerifierFactory) {
        this.f62848f = jWSVerifierFactory;
    }

    @Override // com.nimbusds.jwt.proc.JWTProcessorConfiguration
    public void setJWTClaimsSetAwareJWSKeySelector(JWTClaimsSetAwareJWSKeySelector<C> jWTClaimsSetAwareJWSKeySelector) {
        this.f62846d = jWTClaimsSetAwareJWSKeySelector;
    }

    @Override // com.nimbusds.jwt.proc.JWTProcessorConfiguration
    public void setJWTClaimsSetVerifier(JWTClaimsSetVerifier<C> jWTClaimsSetVerifier) {
        this.f62850h = jWTClaimsSetVerifier;
        this.f62851i = null;
    }

    @Override // com.nimbusds.jwt.proc.JWTProcessorConfiguration
    @Deprecated
    public void setJWTClaimsVerifier(JWTClaimsVerifier jWTClaimsVerifier) {
        this.f62850h = null;
        this.f62851i = jWTClaimsVerifier;
    }

    @Override // com.nimbusds.jwt.proc.JWTProcessor
    public JWTClaimsSet process(JWT jwt, C c10) throws BadJOSEException, JOSEException {
        if (jwt instanceof SignedJWT) {
            return process((SignedJWT) jwt, (SecurityContext) c10);
        }
        if (jwt instanceof EncryptedJWT) {
            return process((EncryptedJWT) jwt, (SecurityContext) c10);
        }
        if (jwt instanceof PlainJWT) {
            return process((PlainJWT) jwt, (SecurityContext) c10);
        }
        throw new JOSEException("Unexpected JWT object type: " + jwt.getClass());
    }

    @Override // com.nimbusds.jwt.proc.JWTProcessor
    public JWTClaimsSet process(PlainJWT plainJWT, C c10) throws BadJOSEException, JOSEException {
        JOSEObjectTypeVerifier<C> jOSEObjectTypeVerifier = this.f62843a;
        if (jOSEObjectTypeVerifier == null) {
            throw new BadJOSEException("Plain JWT rejected: No JWS header \"typ\" (type) verifier is configured");
        }
        jOSEObjectTypeVerifier.verify(plainJWT.getHeader().getType(), c10);
        throw new BadJOSEException("Unsecured (plain) JWTs are rejected, extend class to handle");
    }

    @Override // com.nimbusds.jwt.proc.JWTProcessor
    public JWTClaimsSet process(SignedJWT signedJWT, C c10) throws BadJOSEException, JOSEException {
        List<? extends Key> listSelectJWSKeys;
        JOSEObjectTypeVerifier<C> jOSEObjectTypeVerifier = this.f62843a;
        if (jOSEObjectTypeVerifier != null) {
            jOSEObjectTypeVerifier.verify(signedJWT.getHeader().getType(), c10);
            if (getJWSKeySelector() == null && getJWTClaimsSetAwareJWSKeySelector() == null) {
                throw new BadJOSEException("Signed JWT rejected: No JWS key selector is configured");
            }
            if (getJWSVerifierFactory() != null) {
                try {
                    JWTClaimsSet jWTClaimsSet = signedJWT.getJWTClaimsSet();
                    JWSHeader header = signedJWT.getHeader();
                    if (getJWTClaimsSetAwareJWSKeySelector() != null) {
                        listSelectJWSKeys = getJWTClaimsSetAwareJWSKeySelector().selectKeys(header, jWTClaimsSet, c10);
                    } else if (getJWSKeySelector() != null) {
                        listSelectJWSKeys = getJWSKeySelector().selectJWSKeys(header, c10);
                    } else {
                        throw new BadJOSEException("Signed JWT rejected: No JWS key selector is configured");
                    }
                    if (listSelectJWSKeys != null && !listSelectJWSKeys.isEmpty()) {
                        ListIterator<? extends Key> listIterator = listSelectJWSKeys.listIterator();
                        while (listIterator.hasNext()) {
                            JWSVerifier jWSVerifierCreateJWSVerifier = getJWSVerifierFactory().createJWSVerifier(signedJWT.getHeader(), listIterator.next());
                            if (jWSVerifierCreateJWSVerifier != null) {
                                if (signedJWT.verify(jWSVerifierCreateJWSVerifier)) {
                                    if (getJWTClaimsSetVerifier() != null) {
                                        getJWTClaimsSetVerifier().verify(jWTClaimsSet, c10);
                                    } else if (getJWTClaimsVerifier() != null) {
                                        getJWTClaimsVerifier().verify(jWTClaimsSet);
                                    }
                                    return jWTClaimsSet;
                                }
                                if (!listIterator.hasNext()) {
                                    throw new BadJWSException("Signed JWT rejected: Invalid signature");
                                }
                            }
                        }
                        throw new BadJOSEException("JWS object rejected: No matching verifier(s) found");
                    }
                    throw new BadJOSEException("Signed JWT rejected: Another algorithm expected, or no matching key(s) found");
                } catch (ParseException e5) {
                    throw new BadJWTException(e5.getMessage(), e5);
                }
            }
            throw new JOSEException("No JWS verifier is configured");
        }
        throw new BadJOSEException("Signed JWT rejected: No JWS header \"typ\" (type) verifier is configured");
    }

    @Override // com.nimbusds.jwt.proc.JWTProcessor
    public JWTClaimsSet process(EncryptedJWT encryptedJWT, C c10) throws BadJOSEException, JOSEException {
        JOSEObjectTypeVerifier<C> jOSEObjectTypeVerifier = this.f62844b;
        if (jOSEObjectTypeVerifier != null) {
            jOSEObjectTypeVerifier.verify(encryptedJWT.getHeader().getType(), c10);
            if (getJWEKeySelector() != null) {
                if (getJWEDecrypterFactory() != null) {
                    List<? extends Key> listSelectJWEKeys = getJWEKeySelector().selectJWEKeys(encryptedJWT.getHeader(), c10);
                    if (listSelectJWEKeys != null && !listSelectJWEKeys.isEmpty()) {
                        ListIterator<? extends Key> listIterator = listSelectJWEKeys.listIterator();
                        while (listIterator.hasNext()) {
                            JWEDecrypter jWEDecrypterCreateJWEDecrypter = getJWEDecrypterFactory().createJWEDecrypter(encryptedJWT.getHeader(), listIterator.next());
                            if (jWEDecrypterCreateJWEDecrypter != null) {
                                try {
                                    encryptedJWT.decrypt(jWEDecrypterCreateJWEDecrypter);
                                    if ("JWT".equalsIgnoreCase(encryptedJWT.getHeader().getContentType())) {
                                        SignedJWT signedJWT = encryptedJWT.getPayload().toSignedJWT();
                                        if (signedJWT != null) {
                                            return process(signedJWT, (SecurityContext) c10);
                                        }
                                        throw new BadJWTException("The payload is not a nested signed JWT");
                                    }
                                    try {
                                        JWTClaimsSet jWTClaimsSet = encryptedJWT.getJWTClaimsSet();
                                        if (getJWTClaimsSetVerifier() != null) {
                                            getJWTClaimsSetVerifier().verify(jWTClaimsSet, c10);
                                        } else if (getJWTClaimsVerifier() != null) {
                                            getJWTClaimsVerifier().verify(jWTClaimsSet);
                                        }
                                        return jWTClaimsSet;
                                    } catch (ParseException e5) {
                                        throw new BadJWTException(e5.getMessage(), e5);
                                    }
                                } catch (JOSEException e7) {
                                    if (!listIterator.hasNext()) {
                                        throw new BadJWEException("Encrypted JWT rejected: " + e7.getMessage(), e7);
                                    }
                                }
                            }
                        }
                        throw new BadJOSEException("Encrypted JWT rejected: No matching decrypter(s) found");
                    }
                    throw new BadJOSEException("Encrypted JWT rejected: Another algorithm expected, or no matching key(s) found");
                }
                throw new JOSEException("No JWE decrypter is configured");
            }
            throw new BadJOSEException("Encrypted JWT rejected: No JWE key selector is configured");
        }
        throw new BadJOSEException("Encrypted JWT rejected: No JWE header \"typ\" (type) verifier is configured");
    }
}
