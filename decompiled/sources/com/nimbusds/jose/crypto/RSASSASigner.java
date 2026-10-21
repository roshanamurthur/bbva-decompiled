package com.nimbusds.jose.crypto;

import com.nimbusds.jose.ActionRequiredForJWSCompletionException;
import com.nimbusds.jose.CompletableJWSObjectSigning;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jose.JWSSignerOption;
import com.nimbusds.jose.crypto.impl.RSAKeyUtils;
import com.nimbusds.jose.crypto.impl.RSASSA;
import com.nimbusds.jose.crypto.impl.RSASSAProvider;
import com.nimbusds.jose.crypto.opts.AllowWeakRSAKey;
import com.nimbusds.jose.crypto.opts.OptionUtils;
import com.nimbusds.jose.crypto.opts.UserAuthenticationRequired;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.util.Base64URL;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Collections;
import java.util.Set;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class RSASSASigner extends RSASSAProvider implements JWSSigner {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f62579e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PrivateKey f62580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<JWSSignerOption> f62581d;

    public class a implements CompletableJWSObjectSigning {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f62582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Signature f62583b;

        public a(byte[] bArr, Signature signature) {
            this.f62582a = bArr;
            this.f62583b = signature;
        }

        @Override // com.nimbusds.jose.CompletableJWSObjectSigning
        public final Base64URL complete() throws JOSEException {
            int i10 = RSASSASigner.f62579e;
            RSASSASigner.this.getClass();
            return RSASSASigner.a(this.f62582a, this.f62583b);
        }
    }

    public RSASSASigner(PrivateKey privateKey) {
        this(privateKey, false);
    }

    public static Base64URL a(byte[] bArr, Signature signature) throws JOSEException {
        try {
            signature.update(bArr);
            return Base64URL.encode(signature.sign());
        } catch (SignatureException e5) {
            throw new JOSEException("RSA signature exception: " + e5.getMessage(), e5);
        }
    }

    public PrivateKey getPrivateKey() {
        return this.f62580c;
    }

    @Override // com.nimbusds.jose.JWSSigner
    public Base64URL sign(JWSHeader jWSHeader, byte[] bArr) throws JOSEException {
        Signature signerAndVerifier = RSASSA.getSignerAndVerifier(jWSHeader.getAlgorithm(), getJCAContext().getProvider());
        try {
            signerAndVerifier.initSign(this.f62580c);
            if (OptionUtils.optionIsPresent(this.f62581d, UserAuthenticationRequired.class)) {
                throw new ActionRequiredForJWSCompletionException("Authenticate user to complete signing", UserAuthenticationRequired.getInstance(), new a(bArr, signerAndVerifier));
            }
            return a(bArr, signerAndVerifier);
        } catch (InvalidKeyException e5) {
            throw new JOSEException("Invalid private RSA key: " + e5.getMessage(), e5);
        }
    }

    @Deprecated
    public RSASSASigner(PrivateKey privateKey, boolean z10) {
        this(privateKey, (Set<JWSSignerOption>) (z10 ? Collections.singleton(AllowWeakRSAKey.getInstance()) : Collections.emptySet()));
    }

    public RSASSASigner(PrivateKey privateKey, Set<JWSSignerOption> set) {
        int iKeyBitLength;
        if ("RSA".equalsIgnoreCase(privateKey.getAlgorithm())) {
            this.f62580c = privateKey;
            set = set == null ? Collections.emptySet() : set;
            this.f62581d = set;
            if (!OptionUtils.optionIsPresent(set, AllowWeakRSAKey.class) && (iKeyBitLength = RSAKeyUtils.keyBitLength(privateKey)) > 0 && iKeyBitLength < 2048) {
                throw new IllegalArgumentException("The RSA key size must be at least 2048 bits");
            }
            return;
        }
        throw new IllegalArgumentException("The private key algorithm must be RSA");
    }

    public RSASSASigner(RSAKey rSAKey) throws JOSEException {
        this(rSAKey.toRSAPrivateKey());
    }

    @Deprecated
    public RSASSASigner(RSAKey rSAKey, boolean z10) throws JOSEException {
        this(RSAKeyUtils.toRSAPrivateKey(rSAKey), z10);
    }
}
