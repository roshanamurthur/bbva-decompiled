package com.nimbusds.jose.crypto;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWECryptoParts;
import com.nimbusds.jose.JWEEncrypter;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.crypto.impl.AESKW;
import com.nimbusds.jose.crypto.impl.ContentCryptoProvider;
import com.nimbusds.jose.crypto.impl.PBKDF2;
import com.nimbusds.jose.crypto.impl.PRFParams;
import com.nimbusds.jose.crypto.impl.PasswordBasedCryptoProvider;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.StandardCharset;
import javax.crypto.SecretKey;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class PasswordBasedEncrypter extends PasswordBasedCryptoProvider implements JWEEncrypter {
    public static final int MIN_RECOMMENDED_ITERATION_COUNT = 1000;
    public static final int MIN_SALT_LENGTH = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f62577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f62578c;

    public PasswordBasedEncrypter(byte[] bArr, int i10, int i11) {
        super(bArr);
        if (i10 < 8) {
            throw new IllegalArgumentException("The minimum salt length (p2s) is 8 bytes");
        }
        this.f62577b = i10;
        if (i11 < 1000) {
            throw new IllegalArgumentException("The minimum recommended iteration count (p2c) is 1000");
        }
        this.f62578c = i11;
    }

    @Override // com.nimbusds.jose.JWEEncrypter
    public JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr) throws JOSEException {
        JWEAlgorithm algorithm = jWEHeader.getAlgorithm();
        EncryptionMethod encryptionMethod = jWEHeader.getEncryptionMethod();
        byte[] bArr2 = new byte[this.f62577b];
        getJCAContext().getSecureRandom().nextBytes(bArr2);
        byte[] salt = PBKDF2.formatSalt(algorithm, bArr2);
        PRFParams pRFParamsResolve = PRFParams.resolve(algorithm, getJCAContext().getMACProvider());
        byte[] password = getPassword();
        int i10 = this.f62578c;
        SecretKey secretKeyDeriveKey = PBKDF2.deriveKey(password, salt, i10, pRFParamsResolve);
        JWEHeader jWEHeaderBuild = new JWEHeader.Builder(jWEHeader).pbes2Salt(Base64URL.encode(bArr2)).pbes2Count(i10).build();
        SecretKey secretKeyGenerateCEK = ContentCryptoProvider.generateCEK(encryptionMethod, getJCAContext().getSecureRandom());
        return ContentCryptoProvider.encrypt(jWEHeaderBuild, bArr, secretKeyGenerateCEK, Base64URL.encode(AESKW.wrapCEK(secretKeyGenerateCEK, secretKeyDeriveKey, getJCAContext().getKeyEncryptionProvider())), getJCAContext());
    }

    public int getIterationCount() {
        return this.f62578c;
    }

    public int getSaltLength() {
        return this.f62577b;
    }

    public PasswordBasedEncrypter(String str, int i10, int i11) {
        this(str.getBytes(StandardCharset.UTF_8), i10, i11);
    }
}
