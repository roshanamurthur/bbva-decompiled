package org.bouncycastle.jcajce.provider.keystore.bcfks;

import androidx.camera.camera2.internal.h0;
import androidx.camera.core.processing.f;
import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import com.nimbusds.jose.jwk.source.RemoteJWKSet;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAKey;
import java.security.interfaces.RSAKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.text.ParseException;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.bc.EncryptedObjectStoreData;
import org.bouncycastle.asn1.bc.EncryptedPrivateKeyData;
import org.bouncycastle.asn1.bc.EncryptedSecretKeyData;
import org.bouncycastle.asn1.bc.ObjectData;
import org.bouncycastle.asn1.bc.ObjectDataSequence;
import org.bouncycastle.asn1.bc.ObjectStore;
import org.bouncycastle.asn1.bc.ObjectStoreData;
import org.bouncycastle.asn1.bc.ObjectStoreIntegrityCheck;
import org.bouncycastle.asn1.bc.PbkdMacIntegrityCheck;
import org.bouncycastle.asn1.bc.SecretKeyData;
import org.bouncycastle.asn1.bc.SignatureCheck;
import org.bouncycastle.asn1.cms.CCMParameters;
import org.bouncycastle.asn1.kisa.KISAObjectIdentifiers;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.misc.ScryptParams;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers;
import org.bouncycastle.asn1.ntt.NTTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.EncryptionScheme;
import org.bouncycastle.asn1.pkcs.KeyDerivationFunc;
import org.bouncycastle.asn1.pkcs.PBES2Parameters;
import org.bouncycastle.asn1.pkcs.PBKDF2Params;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.bouncycastle.crypto.generators.SCrypt;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.util.PBKDF2Config;
import org.bouncycastle.crypto.util.PBKDFConfig;
import org.bouncycastle.crypto.util.ScryptConfig;
import org.bouncycastle.jcajce.BCFKSLoadStoreParameter;
import org.bouncycastle.jcajce.BCFKSStoreParameter;
import org.bouncycastle.jcajce.BCLoadStoreParameter;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.interfaces.ECKey;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes8.dex */
public class BcFKSKeyStoreSpi extends KeyStoreSpi {
    public static final HashMap F0;
    public static final HashMap G0;
    public static final BigInteger H0;
    public static final BigInteger I0;
    public static final BigInteger J0;
    public static final BigInteger K0;
    public static final BigInteger L0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public PublicKey f90099p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public BCFKSLoadStoreParameter.CertChainValidator f90100q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final JcaJceHelper f90101r0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public AlgorithmIdentifier f90104u0;
    public KeyDerivationFunc v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public AlgorithmIdentifier f90105w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Date f90106x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public Date f90107y0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final HashMap f90102s0 = new HashMap();

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final HashMap f90103t0 = new HashMap();
    public ASN1ObjectIdentifier E0 = NISTObjectIdentifiers.id_aes256_CCM;

    public static class Def extends BcFKSKeyStoreSpi {
        public Def() {
            super(new DefaultJcaJceHelper());
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) throws KeyStoreException {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) throws NoSuchAlgorithmException, IOException, CertificateException {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) throws NoSuchAlgorithmException, IOException, CertificateException {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws NoSuchAlgorithmException, IOException, CertificateException {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws NoSuchAlgorithmException, IOException, CertificateException {
            super.engineStore(loadStoreParameter);
        }
    }

    public static class DefShared extends c {
        public DefShared() {
            super(new DefaultJcaJceHelper());
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.c, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) throws KeyStoreException {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.c, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) throws NoSuchAlgorithmException, IOException, CertificateException {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.c, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.c, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) throws NoSuchAlgorithmException, IOException, CertificateException {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws NoSuchAlgorithmException, IOException, CertificateException {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.c, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws NoSuchAlgorithmException, IOException, CertificateException {
            super.engineStore(loadStoreParameter);
        }
    }

    public static class Std extends BcFKSKeyStoreSpi {
        public Std() {
            super(new BCJcaJceHelper());
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) throws KeyStoreException {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) throws NoSuchAlgorithmException, IOException, CertificateException {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) throws NoSuchAlgorithmException, IOException, CertificateException {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws NoSuchAlgorithmException, IOException, CertificateException {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws NoSuchAlgorithmException, IOException, CertificateException {
            super.engineStore(loadStoreParameter);
        }
    }

    public static class StdShared extends c {
        public StdShared() {
            super(new BCJcaJceHelper());
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.c, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) throws KeyStoreException {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.c, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) throws NoSuchAlgorithmException, IOException, CertificateException {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.c, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.c, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) throws NoSuchAlgorithmException, IOException, CertificateException {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws NoSuchAlgorithmException, IOException, CertificateException {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.c, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws NoSuchAlgorithmException, IOException, CertificateException {
            super.engineStore(loadStoreParameter);
        }
    }

    public class a implements Enumeration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f90108a;

        public a(Iterator it) {
            this.f90108a = it;
        }

        @Override // java.util.Enumeration
        public final boolean hasMoreElements() {
            return this.f90108a.hasNext();
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            return this.f90108a.next();
        }
    }

    public static class b extends KeyStoreException {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Throwable f90109p0;

        public b(String str, Exception exc) {
            super(str);
            this.f90109p0 = exc;
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.f90109p0;
        }
    }

    public static class c extends BcFKSKeyStoreSpi implements PKCSObjectIdentifiers, X509ObjectIdentifiers {
        public final HashMap M0;
        public final byte[] N0;

        public c(JcaJceHelper jcaJceHelper) {
            super(jcaJceHelper);
            try {
                byte[] bArr = new byte[32];
                this.N0 = bArr;
                jcaJceHelper.createSecureRandom("DEFAULT").nextBytes(bArr);
                this.M0 = new HashMap();
            } catch (GeneralSecurityException e5) {
                throw new IllegalArgumentException("can't create random - " + e5.toString());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineDeleteEntry(String str) throws KeyStoreException {
            throw new KeyStoreException("delete operation not supported in shared mode");
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public Key engineGetKey(String str, char[] cArr) throws UnrecoverableKeyException, NoSuchAlgorithmException {
            try {
                byte[] bArrGenerate = SCrypt.generate(cArr != null ? Arrays.concatenate(Strings.toUTF8ByteArray(cArr), Strings.toUTF8ByteArray(str)) : Arrays.concatenate(this.N0, Strings.toUTF8ByteArray(str)), this.N0, 16384, 8, 1, 32);
                HashMap map = this.M0;
                if (map.containsKey(str) && !Arrays.constantTimeAreEqual((byte[]) map.get(str), bArrGenerate)) {
                    throw new UnrecoverableKeyException(h0.b("unable to recover key (", str, ")"));
                }
                Key keyEngineGetKey = super.engineGetKey(str, cArr);
                if (keyEngineGetKey != null && !map.containsKey(str)) {
                    map.put(str, bArrGenerate);
                }
                return keyEngineGetKey;
            } catch (InvalidKeyException e5) {
                StringBuilder sbD = ci.a.d("unable to recover key (", str, "): ");
                sbD.append(e5.getMessage());
                throw new UnrecoverableKeyException(sbD.toString());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            throw new KeyStoreException("set operation not supported in shared mode");
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            throw new KeyStoreException("set operation not supported in shared mode");
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            throw new KeyStoreException("set operation not supported in shared mode");
        }
    }

    static {
        HashMap map = new HashMap();
        F0 = map;
        HashMap map2 = new HashMap();
        G0 = map2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = OIWObjectIdentifiers.desEDE;
        map.put("DESEDE", aSN1ObjectIdentifier);
        map.put("TRIPLEDES", aSN1ObjectIdentifier);
        map.put("TDEA", aSN1ObjectIdentifier);
        map.put("HMACSHA1", PKCSObjectIdentifiers.id_hmacWithSHA1);
        map.put("HMACSHA224", PKCSObjectIdentifiers.id_hmacWithSHA224);
        map.put("HMACSHA256", PKCSObjectIdentifiers.id_hmacWithSHA256);
        map.put("HMACSHA384", PKCSObjectIdentifiers.id_hmacWithSHA384);
        map.put("HMACSHA512", PKCSObjectIdentifiers.id_hmacWithSHA512);
        map.put("SEED", KISAObjectIdentifiers.id_seedCBC);
        map.put("CAMELLIA.128", NTTObjectIdentifiers.id_camellia128_cbc);
        map.put("CAMELLIA.192", NTTObjectIdentifiers.id_camellia192_cbc);
        map.put("CAMELLIA.256", NTTObjectIdentifiers.id_camellia256_cbc);
        map.put("ARIA.128", NSRIObjectIdentifiers.id_aria128_cbc);
        map.put("ARIA.192", NSRIObjectIdentifiers.id_aria192_cbc);
        map.put("ARIA.256", NSRIObjectIdentifiers.id_aria256_cbc);
        map2.put(PKCSObjectIdentifiers.rsaEncryption, "RSA");
        map2.put(X9ObjectIdentifiers.id_ecPublicKey, LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC);
        map2.put(OIWObjectIdentifiers.elGamalAlgorithm, "DH");
        map2.put(PKCSObjectIdentifiers.dhKeyAgreement, "DH");
        map2.put(X9ObjectIdentifiers.id_dsa, "DSA");
        H0 = BigInteger.valueOf(0L);
        I0 = BigInteger.valueOf(1L);
        J0 = BigInteger.valueOf(2L);
        K0 = BigInteger.valueOf(3L);
        L0 = BigInteger.valueOf(4L);
    }

    public BcFKSKeyStoreSpi(JcaJceHelper jcaJceHelper) {
        this.f90101r0 = jcaJceHelper;
    }

    public static char[] e(KeyStore.LoadStoreParameter loadStoreParameter) throws IOException {
        KeyStore.ProtectionParameter protectionParameter = loadStoreParameter.getProtectionParameter();
        if (protectionParameter == null) {
            return null;
        }
        if (protectionParameter instanceof KeyStore.PasswordProtection) {
            return ((KeyStore.PasswordProtection) protectionParameter).getPassword();
        }
        if (!(protectionParameter instanceof KeyStore.CallbackHandlerProtection)) {
            throw new IllegalArgumentException("no support for protection parameter of type ".concat(protectionParameter.getClass().getName()));
        }
        CallbackHandler callbackHandler = ((KeyStore.CallbackHandlerProtection) protectionParameter).getCallbackHandler();
        PasswordCallback passwordCallback = new PasswordCallback("password: ", false);
        try {
            callbackHandler.handle(new Callback[]{passwordCallback});
            return passwordCallback.getPassword();
        } catch (UnsupportedCallbackException e5) {
            throw new IllegalArgumentException("PasswordCallback not recognised: " + e5.getMessage(), e5);
        }
    }

    public static byte[] f(KeyDerivationFunc keyDerivationFunc, String str, char[] cArr, int i10) throws IOException {
        byte[] bArrPKCS12PasswordToBytes = PBEParametersGenerator.PKCS12PasswordToBytes(cArr);
        byte[] bArrPKCS12PasswordToBytes2 = PBEParametersGenerator.PKCS12PasswordToBytes(str.toCharArray());
        if (MiscObjectIdentifiers.id_scrypt.equals((ASN1Primitive) keyDerivationFunc.getAlgorithm())) {
            ScryptParams scryptParams = ScryptParams.getInstance(keyDerivationFunc.getParameters());
            if (scryptParams.getKeyLength() != null) {
                i10 = scryptParams.getKeyLength().intValue();
            } else if (i10 == -1) {
                throw new IOException("no keyLength found in ScryptParams");
            }
            return SCrypt.generate(Arrays.concatenate(bArrPKCS12PasswordToBytes, bArrPKCS12PasswordToBytes2), scryptParams.getSalt(), scryptParams.getCostParameter().intValue(), scryptParams.getBlockSize().intValue(), scryptParams.getBlockSize().intValue(), i10);
        }
        if (!keyDerivationFunc.getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_PBKDF2)) {
            throw new IOException("BCFKS KeyStore: unrecognized MAC PBKD.");
        }
        PBKDF2Params pBKDF2Params = PBKDF2Params.getInstance(keyDerivationFunc.getParameters());
        if (pBKDF2Params.getKeyLength() != null) {
            i10 = pBKDF2Params.getKeyLength().intValue();
        } else if (i10 == -1) {
            throw new IOException("no keyLength found in PBKDF2Params");
        }
        if (pBKDF2Params.getPrf().getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_hmacWithSHA512)) {
            PKCS5S2ParametersGenerator pKCS5S2ParametersGenerator = new PKCS5S2ParametersGenerator(new SHA512Digest());
            pKCS5S2ParametersGenerator.init(Arrays.concatenate(bArrPKCS12PasswordToBytes, bArrPKCS12PasswordToBytes2), pBKDF2Params.getSalt(), pBKDF2Params.getIterationCount().intValue());
            return ((KeyParameter) pKCS5S2ParametersGenerator.generateDerivedParameters(i10 * 8)).getKey();
        }
        if (pBKDF2Params.getPrf().getAlgorithm().equals((ASN1Primitive) NISTObjectIdentifiers.id_hmacWithSHA3_512)) {
            PKCS5S2ParametersGenerator pKCS5S2ParametersGenerator2 = new PKCS5S2ParametersGenerator(new SHA3Digest(512));
            pKCS5S2ParametersGenerator2.init(Arrays.concatenate(bArrPKCS12PasswordToBytes, bArrPKCS12PasswordToBytes2), pBKDF2Params.getSalt(), pBKDF2Params.getIterationCount().intValue());
            return ((KeyParameter) pKCS5S2ParametersGenerator2.generateDerivedParameters(i10 * 8)).getKey();
        }
        throw new IOException("BCFKS KeyStore: unrecognized MAC PBKD PRF: " + pBKDF2Params.getPrf().getAlgorithm());
    }

    public static KeyDerivationFunc g(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i10) {
        byte[] bArr = new byte[64];
        CryptoServicesRegistrar.getSecureRandom().nextBytes(bArr);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PKCSObjectIdentifiers.id_PBKDF2;
        if (aSN1ObjectIdentifier2.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
            return new KeyDerivationFunc(aSN1ObjectIdentifier2, new PBKDF2Params(bArr, RemoteJWKSet.DEFAULT_HTTP_SIZE_LIMIT, i10, new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA512, DERNull.INSTANCE)));
        }
        throw new IllegalStateException("unknown derivation algorithm: " + aSN1ObjectIdentifier);
    }

    public static KeyDerivationFunc h(KeyDerivationFunc keyDerivationFunc, int i10) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = MiscObjectIdentifiers.id_scrypt;
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) keyDerivationFunc.getAlgorithm())) {
            ScryptParams scryptParams = ScryptParams.getInstance(keyDerivationFunc.getParameters());
            byte[] bArr = new byte[scryptParams.getSalt().length];
            CryptoServicesRegistrar.getSecureRandom().nextBytes(bArr);
            return new KeyDerivationFunc(aSN1ObjectIdentifier, new ScryptParams(bArr, scryptParams.getCostParameter(), scryptParams.getBlockSize(), scryptParams.getParallelizationParameter(), BigInteger.valueOf(i10)));
        }
        PBKDF2Params pBKDF2Params = PBKDF2Params.getInstance(keyDerivationFunc.getParameters());
        byte[] bArr2 = new byte[pBKDF2Params.getSalt().length];
        CryptoServicesRegistrar.getSecureRandom().nextBytes(bArr2);
        return new KeyDerivationFunc(PKCSObjectIdentifiers.id_PBKDF2, new PBKDF2Params(bArr2, pBKDF2Params.getIterationCount().intValue(), i10, pBKDF2Params.getPrf()));
    }

    public static KeyDerivationFunc i(PBKDFConfig pBKDFConfig) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = MiscObjectIdentifiers.id_scrypt;
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) pBKDFConfig.getAlgorithm())) {
            ScryptConfig scryptConfig = (ScryptConfig) pBKDFConfig;
            byte[] bArr = new byte[scryptConfig.getSaltLength()];
            CryptoServicesRegistrar.getSecureRandom().nextBytes(bArr);
            return new KeyDerivationFunc(aSN1ObjectIdentifier, new ScryptParams(bArr, scryptConfig.getCostParameter(), scryptConfig.getBlockSize(), scryptConfig.getParallelizationParameter(), 64));
        }
        PBKDF2Config pBKDF2Config = (PBKDF2Config) pBKDFConfig;
        byte[] bArr2 = new byte[pBKDF2Config.getSaltLength()];
        CryptoServicesRegistrar.getSecureRandom().nextBytes(bArr2);
        return new KeyDerivationFunc(PKCSObjectIdentifiers.id_PBKDF2, new PBKDF2Params(bArr2, pBKDF2Config.getIterationCount(), 64, pBKDF2Config.getPRF()));
    }

    public static AlgorithmIdentifier j(Key key, BCFKSLoadStoreParameter.SignatureAlgorithm signatureAlgorithm) throws IOException {
        if (key == null) {
            return null;
        }
        if (key instanceof ECKey) {
            if (signatureAlgorithm == BCFKSLoadStoreParameter.SignatureAlgorithm.SHA512withECDSA) {
                return new AlgorithmIdentifier(X9ObjectIdentifiers.ecdsa_with_SHA512);
            }
            if (signatureAlgorithm == BCFKSLoadStoreParameter.SignatureAlgorithm.SHA3_512withECDSA) {
                return new AlgorithmIdentifier(NISTObjectIdentifiers.id_ecdsa_with_sha3_512);
            }
        }
        if (key instanceof DSAKey) {
            if (signatureAlgorithm == BCFKSLoadStoreParameter.SignatureAlgorithm.SHA512withDSA) {
                return new AlgorithmIdentifier(NISTObjectIdentifiers.dsa_with_sha512);
            }
            if (signatureAlgorithm == BCFKSLoadStoreParameter.SignatureAlgorithm.SHA3_512withDSA) {
                return new AlgorithmIdentifier(NISTObjectIdentifiers.id_dsa_with_sha3_512);
            }
        }
        if (key instanceof RSAKey) {
            if (signatureAlgorithm == BCFKSLoadStoreParameter.SignatureAlgorithm.SHA512withRSA) {
                return new AlgorithmIdentifier(PKCSObjectIdentifiers.sha512WithRSAEncryption, DERNull.INSTANCE);
            }
            if (signatureAlgorithm == BCFKSLoadStoreParameter.SignatureAlgorithm.SHA3_512withRSA) {
                return new AlgorithmIdentifier(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_512, DERNull.INSTANCE);
            }
        }
        throw new IOException("unknown signature algorithm");
    }

    public final byte[] a(byte[] bArr, AlgorithmIdentifier algorithmIdentifier, KeyDerivationFunc keyDerivationFunc, char[] cArr) throws NoSuchAlgorithmException, IOException, NoSuchProviderException {
        String id = algorithmIdentifier.getAlgorithm().getId();
        Mac macCreateMac = this.f90101r0.createMac(id);
        try {
            if (cArr == null) {
                cArr = new char[0];
            }
            macCreateMac.init(new SecretKeySpec(f(keyDerivationFunc, "INTEGRITY_CHECK", cArr, -1), id));
            return macCreateMac.doFinal(bArr);
        } catch (InvalidKeyException e5) {
            throw new IOException("Cannot set up MAC calculation: " + e5.getMessage());
        }
    }

    public final Cipher b(String str, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException {
        Cipher cipherCreateCipher = this.f90101r0.createCipher(str);
        cipherCreateCipher.init(1, new SecretKeySpec(bArr, "AES"));
        return cipherCreateCipher;
    }

    public final Certificate c(Object obj) {
        JcaJceHelper jcaJceHelper = this.f90101r0;
        if (jcaJceHelper != null) {
            try {
                return jcaJceHelper.createCertificateFactory(ConstantKt.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(org.bouncycastle.asn1.x509.Certificate.getInstance(obj).getEncoded()));
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            return CertificateFactory.getInstance(ConstantKt.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(org.bouncycastle.asn1.x509.Certificate.getInstance(obj).getEncoded()));
        } catch (Exception unused2) {
            return null;
        }
    }

    public final byte[] d(String str, AlgorithmIdentifier algorithmIdentifier, char[] cArr, byte[] bArr) throws IOException {
        Cipher cipherCreateCipher;
        AlgorithmParameters algorithmParametersCreateAlgorithmParameters;
        if (!algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_PBES2)) {
            throw new IOException("BCFKS KeyStore cannot recognize protection algorithm.");
        }
        PBES2Parameters pBES2Parameters = PBES2Parameters.getInstance(algorithmIdentifier.getParameters());
        EncryptionScheme encryptionScheme = pBES2Parameters.getEncryptionScheme();
        try {
            boolean zEquals = encryptionScheme.getAlgorithm().equals((ASN1Primitive) NISTObjectIdentifiers.id_aes256_CCM);
            JcaJceHelper jcaJceHelper = this.f90101r0;
            if (zEquals) {
                cipherCreateCipher = jcaJceHelper.createCipher("AES/CCM/NoPadding");
                algorithmParametersCreateAlgorithmParameters = jcaJceHelper.createAlgorithmParameters("CCM");
                algorithmParametersCreateAlgorithmParameters.init(CCMParameters.getInstance(encryptionScheme.getParameters()).getEncoded());
            } else {
                if (!encryptionScheme.getAlgorithm().equals((ASN1Primitive) NISTObjectIdentifiers.id_aes256_wrap_pad)) {
                    throw new IOException("BCFKS KeyStore cannot recognize protection encryption algorithm.");
                }
                cipherCreateCipher = jcaJceHelper.createCipher("AESKWP");
                algorithmParametersCreateAlgorithmParameters = null;
            }
            KeyDerivationFunc keyDerivationFunc = pBES2Parameters.getKeyDerivationFunc();
            if (cArr == null) {
                cArr = new char[0];
            }
            cipherCreateCipher.init(2, new SecretKeySpec(f(keyDerivationFunc, str, cArr, 32), "AES"), algorithmParametersCreateAlgorithmParameters);
            return cipherCreateCipher.doFinal(bArr);
        } catch (IOException e5) {
            throw e5;
        } catch (Exception e7) {
            throw new IOException(e7.toString());
        }
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration<String> engineAliases() {
        return new a(new HashSet(this.f90102s0.keySet()).iterator());
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        if (str != null) {
            return this.f90102s0.containsKey(str);
        }
        throw new NullPointerException("alias value is null");
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) throws KeyStoreException {
        HashMap map = this.f90102s0;
        if (((ObjectData) map.get(str)) == null) {
            return;
        }
        this.f90103t0.remove(str);
        map.remove(str);
        this.f90107y0 = new Date();
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        ObjectData objectData = (ObjectData) this.f90102s0.get(str);
        if (objectData == null) {
            return null;
        }
        if (objectData.getType().equals(I0) || objectData.getType().equals(K0)) {
            return c(EncryptedPrivateKeyData.getInstance(objectData.getData()).getCertificateChain()[0]);
        }
        if (objectData.getType().equals(H0)) {
            return c(objectData.getData());
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        if (certificate == null) {
            return null;
        }
        try {
            byte[] encoded = certificate.getEncoded();
            HashMap map = this.f90102s0;
            for (String str : map.keySet()) {
                ObjectData objectData = (ObjectData) map.get(str);
                if (objectData.getType().equals(H0)) {
                    if (Arrays.areEqual(objectData.getData(), encoded)) {
                        return str;
                    }
                } else if (objectData.getType().equals(I0) || objectData.getType().equals(K0)) {
                    try {
                        if (Arrays.areEqual(EncryptedPrivateKeyData.getInstance(objectData.getData()).getCertificateChain()[0].toASN1Primitive().getEncoded(), encoded)) {
                            return str;
                        }
                    } catch (IOException unused) {
                        continue;
                    }
                }
            }
        } catch (CertificateEncodingException unused2) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) {
        ObjectData objectData = (ObjectData) this.f90102s0.get(str);
        if (objectData == null) {
            return null;
        }
        if (!objectData.getType().equals(I0) && !objectData.getType().equals(K0)) {
            return null;
        }
        org.bouncycastle.asn1.x509.Certificate[] certificateChain = EncryptedPrivateKeyData.getInstance(objectData.getData()).getCertificateChain();
        int length = certificateChain.length;
        X509Certificate[] x509CertificateArr = new X509Certificate[length];
        for (int i10 = 0; i10 != length; i10++) {
            x509CertificateArr[i10] = c(certificateChain[i10]);
        }
        return x509CertificateArr;
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        ObjectData objectData = (ObjectData) this.f90102s0.get(str);
        if (objectData == null) {
            return null;
        }
        try {
            return objectData.getLastModifiedDate().getDate();
        } catch (ParseException unused) {
            return new Date();
        }
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) throws UnrecoverableKeyException, NoSuchAlgorithmException {
        ObjectData objectData = (ObjectData) this.f90102s0.get(str);
        if (objectData == null) {
            return null;
        }
        boolean zEquals = objectData.getType().equals(I0);
        JcaJceHelper jcaJceHelper = this.f90101r0;
        if (!zEquals && !objectData.getType().equals(K0)) {
            if (!objectData.getType().equals(J0) && !objectData.getType().equals(L0)) {
                throw new UnrecoverableKeyException(h0.b("BCFKS KeyStore unable to recover secret key (", str, "): type not recognized"));
            }
            EncryptedSecretKeyData encryptedSecretKeyData = EncryptedSecretKeyData.getInstance(objectData.getData());
            try {
                SecretKeyData secretKeyData = SecretKeyData.getInstance(d("SECRET_KEY_ENCRYPTION", encryptedSecretKeyData.getKeyEncryptionAlgorithm(), cArr, encryptedSecretKeyData.getEncryptedKeyData()));
                return jcaJceHelper.createSecretKeyFactory(secretKeyData.getKeyAlgorithm().getId()).generateSecret(new SecretKeySpec(secretKeyData.getKeyBytes(), secretKeyData.getKeyAlgorithm().getId()));
            } catch (Exception e5) {
                throw new UnrecoverableKeyException(ci.a.b(e5, ci.a.d("BCFKS KeyStore unable to recover secret key (", str, "): ")));
            }
        }
        HashMap map = this.f90103t0;
        PrivateKey privateKey = (PrivateKey) map.get(str);
        if (privateKey != null) {
            return privateKey;
        }
        EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = EncryptedPrivateKeyInfo.getInstance(EncryptedPrivateKeyData.getInstance(objectData.getData()).getEncryptedPrivateKeyInfo());
        try {
            PrivateKeyInfo privateKeyInfo = PrivateKeyInfo.getInstance(d("PRIVATE_KEY_ENCRYPTION", encryptedPrivateKeyInfo.getEncryptionAlgorithm(), cArr, encryptedPrivateKeyInfo.getEncryptedData()));
            ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
            String id = (String) G0.get(algorithm);
            if (id == null) {
                id = algorithm.getId();
            }
            PrivateKey privateKeyGeneratePrivate = jcaJceHelper.createKeyFactory(id).generatePrivate(new PKCS8EncodedKeySpec(privateKeyInfo.getEncoded()));
            map.put(str, privateKeyGeneratePrivate);
            return privateKeyGeneratePrivate;
        } catch (Exception e7) {
            throw new UnrecoverableKeyException(ci.a.b(e7, ci.a.d("BCFKS KeyStore unable to recover private key (", str, "): ")));
        }
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        ObjectData objectData = (ObjectData) this.f90102s0.get(str);
        if (objectData != null) {
            return objectData.getType().equals(H0);
        }
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        ObjectData objectData = (ObjectData) this.f90102s0.get(str);
        if (objectData == null) {
            return false;
        }
        BigInteger type = objectData.getType();
        return type.equals(I0) || type.equals(J0) || type.equals(K0) || type.equals(L0);
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(InputStream inputStream, char[] cArr) throws NoSuchAlgorithmException, IOException, CertificateException {
        AlgorithmIdentifier signatureAlgorithm;
        ASN1Encodable storeData;
        PublicKey publicKey;
        ObjectStoreData objectStoreData;
        HashMap map = this.f90102s0;
        map.clear();
        this.f90103t0.clear();
        this.f90106x0 = null;
        this.f90107y0 = null;
        this.f90104u0 = null;
        if (inputStream == null) {
            Date date = new Date();
            this.f90106x0 = date;
            this.f90107y0 = date;
            this.f90099p0 = null;
            this.f90100q0 = null;
            this.f90104u0 = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA512, DERNull.INSTANCE);
            this.v0 = g(PKCSObjectIdentifiers.id_PBKDF2, 64);
            return;
        }
        try {
            ObjectStore objectStore = ObjectStore.getInstance(new ASN1InputStream(inputStream).readObject());
            ObjectStoreIntegrityCheck integrityCheck = objectStore.getIntegrityCheck();
            if (integrityCheck.getType() == 0) {
                PbkdMacIntegrityCheck pbkdMacIntegrityCheck = PbkdMacIntegrityCheck.getInstance(integrityCheck.getIntegrityCheck());
                this.f90104u0 = pbkdMacIntegrityCheck.getMacAlgorithm();
                this.v0 = pbkdMacIntegrityCheck.getPbkdAlgorithm();
                signatureAlgorithm = this.f90104u0;
                try {
                    if (!Arrays.constantTimeAreEqual(a(objectStore.getStoreData().toASN1Primitive().getEncoded(), pbkdMacIntegrityCheck.getMacAlgorithm(), pbkdMacIntegrityCheck.getPbkdAlgorithm(), cArr), pbkdMacIntegrityCheck.getMac())) {
                        throw new IOException("BCFKS KeyStore corrupted: MAC calculation failed");
                    }
                } catch (NoSuchProviderException e5) {
                    throw new IOException(e5.getMessage());
                }
            } else {
                if (integrityCheck.getType() != 1) {
                    throw new IOException("BCFKS KeyStore unable to recognize integrity check.");
                }
                SignatureCheck signatureCheck = SignatureCheck.getInstance(integrityCheck.getIntegrityCheck());
                signatureAlgorithm = signatureCheck.getSignatureAlgorithm();
                try {
                    org.bouncycastle.asn1.x509.Certificate[] certificates = signatureCheck.getCertificates();
                    if (this.f90100q0 == null) {
                        storeData = objectStore.getStoreData();
                        publicKey = this.f90099p0;
                    } else {
                        if (certificates == null) {
                            throw new IOException("validator specified but no certifcates in store");
                        }
                        CertificateFactory certificateFactoryCreateCertificateFactory = this.f90101r0.createCertificateFactory(ConstantKt.CERTIFICATE_TYPE_X509);
                        int length = certificates.length;
                        X509Certificate[] x509CertificateArr = new X509Certificate[length];
                        for (int i10 = 0; i10 != length; i10++) {
                            x509CertificateArr[i10] = (X509Certificate) certificateFactoryCreateCertificateFactory.generateCertificate(new ByteArrayInputStream(certificates[i10].getEncoded()));
                        }
                        if (!this.f90100q0.isValid(x509CertificateArr)) {
                            throw new IOException("certificate chain in key store signature not valid");
                        }
                        storeData = objectStore.getStoreData();
                        publicKey = x509CertificateArr[0].getPublicKey();
                    }
                    l(storeData, signatureCheck, publicKey);
                } catch (GeneralSecurityException e7) {
                    throw new IOException(androidx.emoji2.text.flatbuffer.a.d(e7, new StringBuilder("error verifying signature: ")), e7);
                }
            }
            ASN1Encodable storeData2 = objectStore.getStoreData();
            if (storeData2 instanceof EncryptedObjectStoreData) {
                EncryptedObjectStoreData encryptedObjectStoreData = (EncryptedObjectStoreData) storeData2;
                objectStoreData = ObjectStoreData.getInstance(d("STORE_ENCRYPTION", encryptedObjectStoreData.getEncryptionAlgorithm(), cArr, encryptedObjectStoreData.getEncryptedContent().getOctets()));
            } else {
                objectStoreData = ObjectStoreData.getInstance(storeData2);
            }
            try {
                this.f90106x0 = objectStoreData.getCreationDate().getDate();
                this.f90107y0 = objectStoreData.getLastModifiedDate().getDate();
                if (!objectStoreData.getIntegrityAlgorithm().equals(signatureAlgorithm)) {
                    throw new IOException("BCFKS KeyStore storeData integrity algorithm does not match store integrity algorithm.");
                }
                Iterator<ASN1Encodable> it = objectStoreData.getObjectDataSequence().iterator();
                while (it.hasNext()) {
                    ObjectData objectData = ObjectData.getInstance(it.next());
                    map.put(objectData.getIdentifier(), objectData);
                }
            } catch (ParseException unused) {
                throw new IOException("BCFKS KeyStore unable to parse store data information.");
            }
        } catch (Exception e10) {
            throw new IOException(e10.getMessage());
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
        Date date;
        Date date2;
        HashMap map = this.f90102s0;
        ObjectData objectData = (ObjectData) map.get(str);
        Date date3 = new Date();
        if (objectData == null) {
            date = date3;
        } else {
            if (!objectData.getType().equals(H0)) {
                throw new KeyStoreException(f.d("BCFKS KeyStore already has a key entry with alias ", str));
            }
            try {
                date2 = objectData.getCreationDate().getDate();
            } catch (ParseException unused) {
                date2 = date3;
            }
            date = date2;
        }
        try {
            map.put(str, new ObjectData(H0, str, date, date3, certificate.getEncoded(), null));
            this.f90107y0 = date3;
        } catch (CertificateEncodingException e5) {
            throw new b("BCFKS KeyStore unable to handle certificate: " + e5.getMessage(), e5);
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
        Date date;
        Date date2;
        SecretKeyData secretKeyData;
        EncryptedSecretKeyData encryptedSecretKeyData;
        EncryptedPrivateKeyInfo encryptedPrivateKeyInfo;
        Date date3 = new Date();
        HashMap map = this.f90102s0;
        ObjectData objectData = (ObjectData) map.get(str);
        if (objectData != null) {
            try {
                date = objectData.getCreationDate().getDate();
            } catch (ParseException unused) {
                date = date3;
            }
            date2 = date;
        } else {
            date2 = date3;
        }
        this.f90103t0.remove(str);
        if (key instanceof PrivateKey) {
            if (certificateArr == null) {
                throw new KeyStoreException("BCFKS KeyStore requires a certificate chain for private key storage.");
            }
            try {
                byte[] encoded = key.getEncoded();
                KeyDerivationFunc keyDerivationFuncG = g(PKCSObjectIdentifiers.id_PBKDF2, 32);
                if (cArr == null) {
                    cArr = new char[0];
                }
                byte[] bArrF = f(keyDerivationFuncG, "PRIVATE_KEY_ENCRYPTION", cArr, 32);
                ASN1ObjectIdentifier aSN1ObjectIdentifier = this.E0;
                ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes256_CCM;
                if (aSN1ObjectIdentifier.equals((ASN1Primitive) aSN1ObjectIdentifier2)) {
                    Cipher cipherB = b("AES/CCM/NoPadding", bArrF);
                    encryptedPrivateKeyInfo = new EncryptedPrivateKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBES2, new PBES2Parameters(keyDerivationFuncG, new EncryptionScheme(aSN1ObjectIdentifier2, CCMParameters.getInstance(cipherB.getParameters().getEncoded())))), cipherB.doFinal(encoded));
                } else {
                    encryptedPrivateKeyInfo = new EncryptedPrivateKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBES2, new PBES2Parameters(keyDerivationFuncG, new EncryptionScheme(NISTObjectIdentifiers.id_aes256_wrap_pad))), b("AESKWP", bArrF).doFinal(encoded));
                }
                org.bouncycastle.asn1.x509.Certificate[] certificateArr2 = new org.bouncycastle.asn1.x509.Certificate[certificateArr.length];
                for (int i10 = 0; i10 != certificateArr.length; i10++) {
                    certificateArr2[i10] = org.bouncycastle.asn1.x509.Certificate.getInstance(certificateArr[i10].getEncoded());
                }
                map.put(str, new ObjectData(I0, str, date2, date3, new EncryptedPrivateKeyData(encryptedPrivateKeyInfo, certificateArr2).getEncoded(), null));
            } catch (Exception e5) {
                throw new b(androidx.appcompat.view.menu.b.c(e5, new StringBuilder("BCFKS KeyStore exception storing private key: ")), e5);
            }
        } else {
            if (!(key instanceof SecretKey)) {
                throw new KeyStoreException("BCFKS KeyStore unable to recognize key.");
            }
            if (certificateArr != null) {
                throw new KeyStoreException("BCFKS KeyStore cannot store certificate chain with secret key.");
            }
            try {
                byte[] encoded2 = key.getEncoded();
                KeyDerivationFunc keyDerivationFuncG2 = g(PKCSObjectIdentifiers.id_PBKDF2, 32);
                if (cArr == null) {
                    cArr = new char[0];
                }
                byte[] bArrF2 = f(keyDerivationFuncG2, "SECRET_KEY_ENCRYPTION", cArr, 32);
                String upperCase = Strings.toUpperCase(key.getAlgorithm());
                if (upperCase.indexOf("AES") > -1) {
                    secretKeyData = new SecretKeyData(NISTObjectIdentifiers.aes, encoded2);
                } else {
                    HashMap map2 = F0;
                    ASN1ObjectIdentifier aSN1ObjectIdentifier3 = (ASN1ObjectIdentifier) map2.get(upperCase);
                    if (aSN1ObjectIdentifier3 != null) {
                        secretKeyData = new SecretKeyData(aSN1ObjectIdentifier3, encoded2);
                    } else {
                        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = (ASN1ObjectIdentifier) map2.get(upperCase + Constant.DOT_STRING + (encoded2.length * 8));
                        if (aSN1ObjectIdentifier4 == null) {
                            throw new KeyStoreException("BCFKS KeyStore cannot recognize secret key (" + upperCase + ") for storage.");
                        }
                        secretKeyData = new SecretKeyData(aSN1ObjectIdentifier4, encoded2);
                    }
                }
                ASN1ObjectIdentifier aSN1ObjectIdentifier5 = this.E0;
                ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NISTObjectIdentifiers.id_aes256_CCM;
                if (aSN1ObjectIdentifier5.equals((ASN1Primitive) aSN1ObjectIdentifier6)) {
                    Cipher cipherB2 = b("AES/CCM/NoPadding", bArrF2);
                    encryptedSecretKeyData = new EncryptedSecretKeyData(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBES2, new PBES2Parameters(keyDerivationFuncG2, new EncryptionScheme(aSN1ObjectIdentifier6, CCMParameters.getInstance(cipherB2.getParameters().getEncoded())))), cipherB2.doFinal(secretKeyData.getEncoded()));
                } else {
                    encryptedSecretKeyData = new EncryptedSecretKeyData(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBES2, new PBES2Parameters(keyDerivationFuncG2, new EncryptionScheme(NISTObjectIdentifiers.id_aes256_wrap_pad))), b("AESKWP", bArrF2).doFinal(secretKeyData.getEncoded()));
                }
                map.put(str, new ObjectData(J0, str, date2, date3, encryptedSecretKeyData.getEncoded(), null));
            } catch (Exception e7) {
                throw new b(androidx.appcompat.view.menu.b.c(e7, new StringBuilder("BCFKS KeyStore exception storing private key: ")), e7);
            }
        }
        this.f90107y0 = date3;
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        return this.f90102s0.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) throws NoSuchAlgorithmException, IOException, CertificateException {
        KeyDerivationFunc keyDerivationFunc;
        BigInteger keyLength;
        if (this.f90106x0 == null) {
            throw new IOException("KeyStore not initialized");
        }
        EncryptedObjectStoreData encryptedObjectStoreDataK = k(this.f90104u0, cArr);
        if (MiscObjectIdentifiers.id_scrypt.equals((ASN1Primitive) this.v0.getAlgorithm())) {
            ScryptParams scryptParams = ScryptParams.getInstance(this.v0.getParameters());
            keyDerivationFunc = this.v0;
            keyLength = scryptParams.getKeyLength();
        } else {
            PBKDF2Params pBKDF2Params = PBKDF2Params.getInstance(this.v0.getParameters());
            keyDerivationFunc = this.v0;
            keyLength = pBKDF2Params.getKeyLength();
        }
        this.v0 = h(keyDerivationFunc, keyLength.intValue());
        try {
            outputStream.write(new ObjectStore(encryptedObjectStoreDataK, new ObjectStoreIntegrityCheck(new PbkdMacIntegrityCheck(this.f90104u0, this.v0, a(encryptedObjectStoreDataK.getEncoded(), this.f90104u0, this.v0, cArr)))).getEncoded());
            outputStream.flush();
        } catch (NoSuchProviderException e5) {
            throw new IOException("cannot calculate mac: " + e5.getMessage());
        }
    }

    public final EncryptedObjectStoreData k(AlgorithmIdentifier algorithmIdentifier, char[] cArr) throws NoSuchAlgorithmException, IOException {
        HashMap map = this.f90102s0;
        ObjectData[] objectDataArr = (ObjectData[]) map.values().toArray(new ObjectData[map.size()]);
        KeyDerivationFunc keyDerivationFuncH = h(this.v0, 32);
        if (cArr == null) {
            cArr = new char[0];
        }
        byte[] bArrF = f(keyDerivationFuncH, "STORE_ENCRYPTION", cArr, 32);
        ObjectStoreData objectStoreData = new ObjectStoreData(algorithmIdentifier, this.f90106x0, this.f90107y0, new ObjectDataSequence(objectDataArr), null);
        try {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = this.E0;
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes256_CCM;
            if (!aSN1ObjectIdentifier.equals((ASN1Primitive) aSN1ObjectIdentifier2)) {
                return new EncryptedObjectStoreData(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBES2, new PBES2Parameters(keyDerivationFuncH, new EncryptionScheme(NISTObjectIdentifiers.id_aes256_wrap_pad))), b("AESKWP", bArrF).doFinal(objectStoreData.getEncoded()));
            }
            Cipher cipherB = b("AES/CCM/NoPadding", bArrF);
            return new EncryptedObjectStoreData(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBES2, new PBES2Parameters(keyDerivationFuncH, new EncryptionScheme(aSN1ObjectIdentifier2, CCMParameters.getInstance(cipherB.getParameters().getEncoded())))), cipherB.doFinal(objectStoreData.getEncoded()));
        } catch (InvalidKeyException e5) {
            throw new IOException(e5.toString());
        } catch (NoSuchProviderException e7) {
            throw new IOException(e7.toString());
        } catch (BadPaddingException e10) {
            throw new IOException(e10.toString());
        } catch (IllegalBlockSizeException e11) {
            throw new IOException(e11.toString());
        } catch (NoSuchPaddingException e12) {
            throw new NoSuchAlgorithmException(e12.toString());
        }
    }

    public final void l(ASN1Encodable aSN1Encodable, SignatureCheck signatureCheck, PublicKey publicKey) throws GeneralSecurityException, IOException {
        Signature signatureCreateSignature = this.f90101r0.createSignature(signatureCheck.getSignatureAlgorithm().getAlgorithm().getId());
        signatureCreateSignature.initVerify(publicKey);
        signatureCreateSignature.update(aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER));
        if (!signatureCreateSignature.verify(signatureCheck.getSignature().getOctets())) {
            throw new IOException("BCFKS KeyStore corrupted: signature calculation failed");
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws NoSuchAlgorithmException, IOException, CertificateException {
        SignatureCheck signatureCheck;
        if (loadStoreParameter == null) {
            throw new IllegalArgumentException("'parameter' arg cannot be null");
        }
        if (loadStoreParameter instanceof BCFKSStoreParameter) {
            BCFKSStoreParameter bCFKSStoreParameter = (BCFKSStoreParameter) loadStoreParameter;
            char[] cArrE = e(loadStoreParameter);
            this.v0 = i(bCFKSStoreParameter.getStorePBKDFConfig());
            engineStore(bCFKSStoreParameter.getOutputStream(), cArrE);
            return;
        }
        if (!(loadStoreParameter instanceof BCFKSLoadStoreParameter)) {
            if (!(loadStoreParameter instanceof BCLoadStoreParameter)) {
                throw new IllegalArgumentException("no support for 'parameter' of type ".concat(loadStoreParameter.getClass().getName()));
            }
            engineStore(((BCLoadStoreParameter) loadStoreParameter).getOutputStream(), e(loadStoreParameter));
            return;
        }
        BCFKSLoadStoreParameter bCFKSLoadStoreParameter = (BCFKSLoadStoreParameter) loadStoreParameter;
        if (bCFKSLoadStoreParameter.getStoreSignatureKey() == null) {
            char[] cArrE2 = e(bCFKSLoadStoreParameter);
            this.v0 = i(bCFKSLoadStoreParameter.getStorePBKDFConfig());
            this.E0 = bCFKSLoadStoreParameter.getStoreEncryptionAlgorithm() == BCFKSLoadStoreParameter.EncryptionAlgorithm.AES256_CCM ? NISTObjectIdentifiers.id_aes256_CCM : NISTObjectIdentifiers.id_aes256_wrap_pad;
            this.f90104u0 = bCFKSLoadStoreParameter.getStoreMacAlgorithm() == BCFKSLoadStoreParameter.MacAlgorithm.HmacSHA512 ? new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA512, DERNull.INSTANCE) : new AlgorithmIdentifier(NISTObjectIdentifiers.id_hmacWithSHA3_512, DERNull.INSTANCE);
            engineStore(bCFKSLoadStoreParameter.getOutputStream(), cArrE2);
            return;
        }
        this.f90105w0 = j(bCFKSLoadStoreParameter.getStoreSignatureKey(), bCFKSLoadStoreParameter.getStoreSignatureAlgorithm());
        this.v0 = i(bCFKSLoadStoreParameter.getStorePBKDFConfig());
        this.E0 = bCFKSLoadStoreParameter.getStoreEncryptionAlgorithm() == BCFKSLoadStoreParameter.EncryptionAlgorithm.AES256_CCM ? NISTObjectIdentifiers.id_aes256_CCM : NISTObjectIdentifiers.id_aes256_wrap_pad;
        this.f90104u0 = bCFKSLoadStoreParameter.getStoreMacAlgorithm() == BCFKSLoadStoreParameter.MacAlgorithm.HmacSHA512 ? new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA512, DERNull.INSTANCE) : new AlgorithmIdentifier(NISTObjectIdentifiers.id_hmacWithSHA3_512, DERNull.INSTANCE);
        EncryptedObjectStoreData encryptedObjectStoreDataK = k(this.f90105w0, e(bCFKSLoadStoreParameter));
        try {
            Signature signatureCreateSignature = this.f90101r0.createSignature(this.f90105w0.getAlgorithm().getId());
            signatureCreateSignature.initSign((PrivateKey) bCFKSLoadStoreParameter.getStoreSignatureKey());
            signatureCreateSignature.update(encryptedObjectStoreDataK.getEncoded());
            X509Certificate[] storeCertificates = bCFKSLoadStoreParameter.getStoreCertificates();
            if (storeCertificates != null) {
                int length = storeCertificates.length;
                org.bouncycastle.asn1.x509.Certificate[] certificateArr = new org.bouncycastle.asn1.x509.Certificate[length];
                for (int i10 = 0; i10 != length; i10++) {
                    certificateArr[i10] = org.bouncycastle.asn1.x509.Certificate.getInstance(storeCertificates[i10].getEncoded());
                }
                signatureCheck = new SignatureCheck(this.f90105w0, certificateArr, signatureCreateSignature.sign());
            } else {
                signatureCheck = new SignatureCheck(this.f90105w0, signatureCreateSignature.sign());
            }
            bCFKSLoadStoreParameter.getOutputStream().write(new ObjectStore(encryptedObjectStoreDataK, new ObjectStoreIntegrityCheck(signatureCheck)).getEncoded());
            bCFKSLoadStoreParameter.getOutputStream().flush();
        } catch (GeneralSecurityException e5) {
            throw new IOException(androidx.emoji2.text.flatbuffer.a.d(e5, new StringBuilder("error creating signature: ")), e5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    @Override // java.security.KeyStoreSpi
    public void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws NoSuchAlgorithmException, IOException, CertificateException {
        if (loadStoreParameter == null) {
            throw new IllegalArgumentException("'parameter' arg cannot be null");
        }
        if (!(loadStoreParameter instanceof BCFKSLoadStoreParameter)) {
            if (!(loadStoreParameter instanceof BCLoadStoreParameter)) {
                throw new IllegalArgumentException("no support for 'parameter' of type ".concat(loadStoreParameter.getClass().getName()));
            }
            engineLoad(((BCLoadStoreParameter) loadStoreParameter).getInputStream(), e(loadStoreParameter));
            return;
        }
        BCFKSLoadStoreParameter bCFKSLoadStoreParameter = (BCFKSLoadStoreParameter) loadStoreParameter;
        char[] cArrE = e(bCFKSLoadStoreParameter);
        this.v0 = i(bCFKSLoadStoreParameter.getStorePBKDFConfig());
        this.E0 = bCFKSLoadStoreParameter.getStoreEncryptionAlgorithm() == BCFKSLoadStoreParameter.EncryptionAlgorithm.AES256_CCM ? NISTObjectIdentifiers.id_aes256_CCM : NISTObjectIdentifiers.id_aes256_wrap_pad;
        this.f90104u0 = bCFKSLoadStoreParameter.getStoreMacAlgorithm() == BCFKSLoadStoreParameter.MacAlgorithm.HmacSHA512 ? new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA512, DERNull.INSTANCE) : new AlgorithmIdentifier(NISTObjectIdentifiers.id_hmacWithSHA3_512, DERNull.INSTANCE);
        this.f90099p0 = (PublicKey) bCFKSLoadStoreParameter.getStoreSignatureKey();
        this.f90100q0 = bCFKSLoadStoreParameter.getCertChainValidator();
        this.f90105w0 = j(this.f90099p0, bCFKSLoadStoreParameter.getStoreSignatureAlgorithm());
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.E0;
        InputStream inputStream = bCFKSLoadStoreParameter.getInputStream();
        engineLoad(inputStream, cArrE);
        if (inputStream != null) {
            PBKDFConfig storePBKDFConfig = bCFKSLoadStoreParameter.getStorePBKDFConfig();
            KeyDerivationFunc keyDerivationFunc = this.v0;
            if (storePBKDFConfig.getAlgorithm().equals((ASN1Primitive) keyDerivationFunc.getAlgorithm())) {
                if (MiscObjectIdentifiers.id_scrypt.equals((ASN1Primitive) keyDerivationFunc.getAlgorithm())) {
                    if (storePBKDFConfig instanceof ScryptConfig) {
                        ScryptConfig scryptConfig = (ScryptConfig) storePBKDFConfig;
                        ScryptParams scryptParams = ScryptParams.getInstance(keyDerivationFunc.getParameters());
                        if (scryptConfig.getSaltLength() == scryptParams.getSalt().length && scryptConfig.getBlockSize() == scryptParams.getBlockSize().intValue() && scryptConfig.getCostParameter() == scryptParams.getCostParameter().intValue() && scryptConfig.getParallelizationParameter() == scryptParams.getParallelizationParameter().intValue()) {
                            if (aSN1ObjectIdentifier.equals((ASN1Primitive) this.E0)) {
                                return;
                            }
                        }
                    }
                } else if (storePBKDFConfig instanceof PBKDF2Config) {
                    PBKDF2Config pBKDF2Config = (PBKDF2Config) storePBKDFConfig;
                    PBKDF2Params pBKDF2Params = PBKDF2Params.getInstance(keyDerivationFunc.getParameters());
                    if (pBKDF2Config.getSaltLength() == pBKDF2Params.getSalt().length && pBKDF2Config.getIterationCount() == pBKDF2Params.getIterationCount().intValue()) {
                        if (aSN1ObjectIdentifier.equals((ASN1Primitive) this.E0)) {
                            return;
                        }
                    }
                }
            }
            throw new IOException("configuration parameters do not match existing store");
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
        Date date;
        Date date2;
        Date date3 = new Date();
        HashMap map = this.f90102s0;
        ObjectData objectData = (ObjectData) map.get(str);
        if (objectData != null) {
            try {
                date = objectData.getCreationDate().getDate();
            } catch (ParseException unused) {
                date = date3;
            }
            date2 = date;
        } else {
            date2 = date3;
        }
        if (certificateArr != null) {
            try {
                EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = EncryptedPrivateKeyInfo.getInstance(bArr);
                try {
                    this.f90103t0.remove(str);
                    BigInteger bigInteger = K0;
                    org.bouncycastle.asn1.x509.Certificate[] certificateArr2 = new org.bouncycastle.asn1.x509.Certificate[certificateArr.length];
                    for (int i10 = 0; i10 != certificateArr.length; i10++) {
                        certificateArr2[i10] = org.bouncycastle.asn1.x509.Certificate.getInstance(certificateArr[i10].getEncoded());
                    }
                    map.put(str, new ObjectData(bigInteger, str, date2, date3, new EncryptedPrivateKeyData(encryptedPrivateKeyInfo, certificateArr2).getEncoded(), null));
                } catch (Exception e5) {
                    throw new b(androidx.appcompat.view.menu.b.c(e5, new StringBuilder("BCFKS KeyStore exception storing protected private key: ")), e5);
                }
            } catch (Exception e7) {
                throw new b("BCFKS KeyStore private key encoding must be an EncryptedPrivateKeyInfo.", e7);
            }
        } else {
            try {
                map.put(str, new ObjectData(L0, str, date2, date3, bArr, null));
            } catch (Exception e10) {
                throw new b(androidx.appcompat.view.menu.b.c(e10, new StringBuilder("BCFKS KeyStore exception storing protected private key: ")), e10);
            }
        }
        this.f90107y0 = date3;
    }
}
