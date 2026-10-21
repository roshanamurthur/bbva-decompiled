package org.bouncycastle.jcajce.provider.keystore.bc;

import androidx.appcompat.view.menu.b;
import androidx.camera.camera2.internal.h0;
import androidx.camera.core.processing.f;
import com.bbva.ethermobilesdk.cipher.token.utils.HMACUtilsKt;
import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.security.Key;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.generators.PKCS12ParametersGenerator;
import org.bouncycastle.crypto.io.DigestInputStream;
import org.bouncycastle.crypto.io.DigestOutputStream;
import org.bouncycastle.crypto.io.MacInputStream;
import org.bouncycastle.crypto.io.MacOutputStream;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.io.CipherInputStream;
import org.bouncycastle.jcajce.io.CipherOutputStream;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jce.interfaces.BCKeyStore;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;
import org.bouncycastle.util.io.TeeOutputStream;

/* JADX INFO: loaded from: classes8.dex */
public class BcKeyStoreSpi extends KeyStoreSpi implements BCKeyStore {
    protected int version;
    protected Hashtable table = new Hashtable();
    protected SecureRandom random = CryptoServicesRegistrar.getSecureRandom();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BCJcaJceHelper f90092p0 = new BCJcaJceHelper();

    public static class BouncyCastleStore extends BcKeyStoreSpi {
        public BouncyCastleStore() {
            super(1);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi, java.security.KeyStoreSpi
        public void engineLoad(InputStream inputStream, char[] cArr) throws IOException {
            this.table.clear();
            if (inputStream == null) {
                return;
            }
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            int i10 = dataInputStream.readInt();
            if (i10 != 2 && i10 != 0 && i10 != 1) {
                throw new IOException("Wrong version of key store.");
            }
            int i11 = dataInputStream.readInt();
            byte[] bArr = new byte[i11];
            if (i11 != 20) {
                throw new IOException("Key store corrupted.");
            }
            dataInputStream.readFully(bArr);
            int i12 = dataInputStream.readInt();
            if (i12 < 0 || i12 > 65536) {
                throw new IOException("Key store corrupted.");
            }
            CipherInputStream cipherInputStream = new CipherInputStream(dataInputStream, makePBECipher(i10 == 0 ? "OldPBEWithSHAAndTwofish-CBC" : "PBEWithSHAAndTwofish-CBC", 2, cArr, bArr, i12));
            SHA1Digest sHA1Digest = new SHA1Digest();
            loadStore(new DigestInputStream(cipherInputStream, sHA1Digest));
            byte[] bArr2 = new byte[sHA1Digest.getDigestSize()];
            sHA1Digest.doFinal(bArr2, 0);
            byte[] bArr3 = new byte[sHA1Digest.getDigestSize()];
            Streams.readFully(cipherInputStream, bArr3);
            if (Arrays.constantTimeAreEqual(bArr2, bArr3)) {
                return;
            }
            this.table.clear();
            throw new IOException("KeyStore integrity check failed.");
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi, java.security.KeyStoreSpi
        public void engineStore(OutputStream outputStream, char[] cArr) throws IOException {
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            byte[] bArr = new byte[20];
            int iNextInt = (this.random.nextInt() & 1023) + 1024;
            this.random.nextBytes(bArr);
            dataOutputStream.writeInt(this.version);
            dataOutputStream.writeInt(20);
            dataOutputStream.write(bArr);
            dataOutputStream.writeInt(iNextInt);
            CipherOutputStream cipherOutputStream = new CipherOutputStream(dataOutputStream, makePBECipher("PBEWithSHAAndTwofish-CBC", 1, cArr, bArr, iNextInt));
            DigestOutputStream digestOutputStream = new DigestOutputStream(new SHA1Digest());
            saveStore(new TeeOutputStream(cipherOutputStream, digestOutputStream));
            cipherOutputStream.write(digestOutputStream.getDigest());
            cipherOutputStream.close();
        }
    }

    public static class Std extends BcKeyStoreSpi {
        public Std() {
            super(2);
        }
    }

    public static class Version1 extends BcKeyStoreSpi {
        public Version1() {
            super(1);
        }
    }

    public BcKeyStoreSpi(int i10) {
        this.version = i10;
    }

    public static void c(Certificate certificate, DataOutputStream dataOutputStream) throws IOException {
        try {
            byte[] encoded = certificate.getEncoded();
            dataOutputStream.writeUTF(certificate.getType());
            dataOutputStream.writeInt(encoded.length);
            dataOutputStream.write(encoded);
        } catch (CertificateEncodingException e5) {
            throw new IOException(e5.toString());
        }
    }

    public static void d(Key key, DataOutputStream dataOutputStream) throws IOException {
        int i10;
        byte[] encoded = key.getEncoded();
        if (key instanceof PrivateKey) {
            i10 = 0;
        } else {
            i10 = key instanceof PublicKey ? 1 : 2;
        }
        dataOutputStream.write(i10);
        dataOutputStream.writeUTF(key.getFormat());
        dataOutputStream.writeUTF(key.getAlgorithm());
        dataOutputStream.writeInt(encoded.length);
        dataOutputStream.write(encoded);
    }

    public final Certificate a(DataInputStream dataInputStream) throws IOException {
        String utf = dataInputStream.readUTF();
        byte[] bArr = new byte[dataInputStream.readInt()];
        dataInputStream.readFully(bArr);
        try {
            return this.f90092p0.createCertificateFactory(utf).generateCertificate(new ByteArrayInputStream(bArr));
        } catch (NoSuchProviderException e5) {
            throw new IOException(e5.toString());
        } catch (CertificateException e7) {
            throw new IOException(e7.toString());
        }
    }

    public final Key b(DataInputStream dataInputStream) throws IOException {
        KeySpec pKCS8EncodedKeySpec;
        int i10 = dataInputStream.read();
        String utf = dataInputStream.readUTF();
        String utf2 = dataInputStream.readUTF();
        byte[] bArr = new byte[dataInputStream.readInt()];
        dataInputStream.readFully(bArr);
        if (utf.equals("PKCS#8") || utf.equals("PKCS8")) {
            pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(bArr);
        } else {
            if (!utf.equals(ConstantKt.CERTIFICATE_TYPE_X509) && !utf.equals("X509")) {
                if (utf.equals(HMACUtilsKt.DEFAULT_SECRET_KEYSPEC_ALGORITHM)) {
                    return new SecretKeySpec(bArr, utf2);
                }
                throw new IOException(h0.b("Key format ", utf, " not recognised!"));
            }
            pKCS8EncodedKeySpec = new X509EncodedKeySpec(bArr);
        }
        try {
            if (i10 == 0) {
                return BouncyCastleProvider.getPrivateKey(PrivateKeyInfo.getInstance(bArr));
            }
            if (i10 == 1) {
                return BouncyCastleProvider.getPublicKey(SubjectPublicKeyInfo.getInstance(bArr));
            }
            if (i10 == 2) {
                return this.f90092p0.createSecretKeyFactory(utf2).generateSecret(pKCS8EncodedKeySpec);
            }
            throw new IOException("Key type " + i10 + " not recognised!");
        } catch (Exception e5) {
            throw new IOException(b.c(e5, new StringBuilder("Exception creating key: ")));
        }
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration engineAliases() {
        return this.table.keys();
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        return this.table.get(str) != null;
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) throws KeyStoreException {
        if (this.table.get(str) == null) {
            return;
        }
        this.table.remove(str);
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        a aVar = (a) this.table.get(str);
        if (aVar == null) {
            return null;
        }
        if (aVar.f90093a == 1) {
            return (Certificate) aVar.f90095c;
        }
        Certificate[] certificateArr = aVar.f90096d;
        if (certificateArr != null) {
            return certificateArr[0];
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        Enumeration enumerationElements = this.table.elements();
        while (enumerationElements.hasMoreElements()) {
            a aVar = (a) enumerationElements.nextElement();
            Object obj = aVar.f90095c;
            boolean z10 = obj instanceof Certificate;
            String str = aVar.f90094b;
            if (!z10) {
                Certificate[] certificateArr = aVar.f90096d;
                if (certificateArr != null && certificateArr[0].equals(certificate)) {
                    return str;
                }
            } else if (((Certificate) obj).equals(certificate)) {
                return str;
            }
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) {
        a aVar = (a) this.table.get(str);
        if (aVar != null) {
            return aVar.f90096d;
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        a aVar = (a) this.table.get(str);
        if (aVar != null) {
            return aVar.f90097e;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:16:0x0025  */
    /* JADX WARN: Code duplicated, block: B:32:0x0110  */
    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) throws UnrecoverableKeyException, NoSuchAlgorithmException {
        int i10;
        Object objB;
        Key keyB;
        a aVar = (a) this.table.get(str);
        if (aVar == null || (i10 = aVar.f90093a) == 1) {
            return null;
        }
        BcKeyStoreSpi bcKeyStoreSpi = BcKeyStoreSpi.this;
        if (cArr == null || cArr.length == 0) {
            Object obj = aVar.f90095c;
            boolean z10 = obj instanceof Key;
            objB = obj;
            if (!z10) {
                if (i10 == 4) {
                    throw new RuntimeException("forget something!");
                }
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) aVar.f90095c));
                try {
                    byte[] bArr = new byte[dataInputStream.readInt()];
                    dataInputStream.readFully(bArr);
                    try {
                        objB = bcKeyStoreSpi.b(new DataInputStream(new CipherInputStream(dataInputStream, BcKeyStoreSpi.this.makePBECipher("PBEWithSHAAnd3-KeyTripleDES-CBC", 2, cArr, bArr, dataInputStream.readInt()))));
                    } catch (Exception unused) {
                        DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[]) aVar.f90095c));
                        byte[] bArr2 = new byte[dataInputStream2.readInt()];
                        dataInputStream2.readFully(bArr2);
                        int i11 = dataInputStream2.readInt();
                        try {
                            keyB = bcKeyStoreSpi.b(new DataInputStream(new CipherInputStream(dataInputStream2, BcKeyStoreSpi.this.makePBECipher("BrokenPBEWithSHAAnd3-KeyTripleDES-CBC", 2, cArr, bArr2, i11))));
                        } catch (Exception unused2) {
                            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) aVar.f90095c));
                            bArr2 = new byte[dataInputStream3.readInt()];
                            dataInputStream3.readFully(bArr2);
                            i11 = dataInputStream3.readInt();
                            keyB = bcKeyStoreSpi.b(new DataInputStream(new CipherInputStream(dataInputStream3, BcKeyStoreSpi.this.makePBECipher("OldPBEWithSHAAnd3-KeyTripleDES-CBC", 2, cArr, bArr2, i11))));
                        }
                        byte[] bArr3 = bArr2;
                        int i12 = i11;
                        if (keyB == null) {
                            throw new UnrecoverableKeyException("no match");
                        }
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                        dataOutputStream.writeInt(bArr3.length);
                        dataOutputStream.write(bArr3);
                        dataOutputStream.writeInt(i12);
                        DataOutputStream dataOutputStream2 = new DataOutputStream(new CipherOutputStream(dataOutputStream, BcKeyStoreSpi.this.makePBECipher("PBEWithSHAAnd3-KeyTripleDES-CBC", 1, cArr, bArr3, i12)));
                        bcKeyStoreSpi.getClass();
                        d(keyB, dataOutputStream2);
                        dataOutputStream2.close();
                        aVar.f90095c = byteArrayOutputStream.toByteArray();
                        objB = keyB;
                    }
                } catch (Exception unused3) {
                    throw new UnrecoverableKeyException("no match");
                }
            }
        } else {
            if (i10 == 4) {
                throw new RuntimeException("forget something!");
            }
            DataInputStream dataInputStream4 = new DataInputStream(new ByteArrayInputStream((byte[]) aVar.f90095c));
            byte[] bArr4 = new byte[dataInputStream4.readInt()];
            dataInputStream4.readFully(bArr4);
            objB = bcKeyStoreSpi.b(new DataInputStream(new CipherInputStream(dataInputStream4, BcKeyStoreSpi.this.makePBECipher("PBEWithSHAAnd3-KeyTripleDES-CBC", 2, cArr, bArr4, dataInputStream4.readInt()))));
        }
        return (Key) objB;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        a aVar = (a) this.table.get(str);
        return aVar != null && aVar.f90093a == 1;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        a aVar = (a) this.table.get(str);
        return (aVar == null || aVar.f90093a == 1) ? false : true;
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(InputStream inputStream, char[] cArr) throws IOException {
        this.table.clear();
        if (inputStream == null) {
            return;
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        int i10 = dataInputStream.readInt();
        if (i10 != 2 && i10 != 0 && i10 != 1) {
            throw new IOException("Wrong version of key store.");
        }
        int i11 = dataInputStream.readInt();
        if (i11 <= 0) {
            throw new IOException("Invalid salt detected");
        }
        byte[] bArr = new byte[i11];
        dataInputStream.readFully(bArr);
        int i12 = dataInputStream.readInt();
        HMac hMac = new HMac(new SHA1Digest());
        if (cArr == null || cArr.length == 0) {
            loadStore(dataInputStream);
            dataInputStream.readFully(new byte[hMac.getMacSize()]);
            return;
        }
        byte[] bArrPKCS12PasswordToBytes = PBEParametersGenerator.PKCS12PasswordToBytes(cArr);
        PKCS12ParametersGenerator pKCS12ParametersGenerator = new PKCS12ParametersGenerator(new SHA1Digest());
        pKCS12ParametersGenerator.init(bArrPKCS12PasswordToBytes, bArr, i12);
        CipherParameters cipherParametersGenerateDerivedMacParameters = pKCS12ParametersGenerator.generateDerivedMacParameters(i10 != 2 ? hMac.getMacSize() : hMac.getMacSize() * 8);
        Arrays.fill(bArrPKCS12PasswordToBytes, (byte) 0);
        hMac.init(cipherParametersGenerateDerivedMacParameters);
        loadStore(new MacInputStream(dataInputStream, hMac));
        byte[] bArr2 = new byte[hMac.getMacSize()];
        hMac.doFinal(bArr2, 0);
        byte[] bArr3 = new byte[hMac.getMacSize()];
        dataInputStream.readFully(bArr3);
        if (Arrays.constantTimeAreEqual(bArr2, bArr3)) {
            return;
        }
        this.table.clear();
        throw new IOException("KeyStore integrity check failed.");
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
        a aVar = (a) this.table.get(str);
        if (aVar != null && aVar.f90093a != 1) {
            throw new KeyStoreException(f.d("key store already has a key entry with alias ", str));
        }
        this.table.put(str, new a(str, certificate));
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
        if ((key instanceof PrivateKey) && certificateArr == null) {
            throw new KeyStoreException("no certificate chain for private key");
        }
        try {
            this.table.put(str, new a(str, key, cArr, certificateArr));
        } catch (Exception e5) {
            throw new KeyStoreException(e5.toString());
        }
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        return this.table.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        byte[] bArr = new byte[20];
        int iNextInt = (this.random.nextInt() & 1023) + 1024;
        this.random.nextBytes(bArr);
        dataOutputStream.writeInt(this.version);
        dataOutputStream.writeInt(20);
        dataOutputStream.write(bArr);
        dataOutputStream.writeInt(iNextInt);
        HMac hMac = new HMac(new SHA1Digest());
        MacOutputStream macOutputStream = new MacOutputStream(hMac);
        PKCS12ParametersGenerator pKCS12ParametersGenerator = new PKCS12ParametersGenerator(new SHA1Digest());
        byte[] bArrPKCS12PasswordToBytes = PBEParametersGenerator.PKCS12PasswordToBytes(cArr);
        pKCS12ParametersGenerator.init(bArrPKCS12PasswordToBytes, bArr, iNextInt);
        hMac.init(pKCS12ParametersGenerator.generateDerivedMacParameters(this.version < 2 ? hMac.getMacSize() : hMac.getMacSize() * 8));
        for (int i10 = 0; i10 != bArrPKCS12PasswordToBytes.length; i10++) {
            bArrPKCS12PasswordToBytes[i10] = 0;
        }
        saveStore(new TeeOutputStream(dataOutputStream, macOutputStream));
        byte[] bArr2 = new byte[hMac.getMacSize()];
        hMac.doFinal(bArr2, 0);
        dataOutputStream.write(bArr2);
        dataOutputStream.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [byte[], java.io.Serializable] */
    public void loadStore(InputStream inputStream) throws IOException {
        Certificate[] certificateArr;
        Hashtable hashtable;
        a aVar;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        for (int i10 = dataInputStream.read(); i10 > 0; i10 = dataInputStream.read()) {
            String utf = dataInputStream.readUTF();
            Date date = new Date(dataInputStream.readLong());
            int i11 = dataInputStream.readInt();
            if (i11 != 0) {
                Certificate[] certificateArr2 = new Certificate[i11];
                for (int i12 = 0; i12 != i11; i12++) {
                    certificateArr2[i12] = a(dataInputStream);
                }
                certificateArr = certificateArr2;
            } else {
                certificateArr = null;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    Key keyB = b(dataInputStream);
                    hashtable = this.table;
                    aVar = new a(utf, date, 2, keyB, certificateArr);
                } else {
                    if (i10 != 3 && i10 != 4) {
                        throw new IOException("Unknown object type in store.");
                    }
                    ?? r10 = new byte[dataInputStream.readInt()];
                    dataInputStream.readFully(r10);
                    this.table.put(utf, new a(utf, date, i10, r10, certificateArr));
                }
            } else {
                Certificate certificateA = a(dataInputStream);
                hashtable = this.table;
                aVar = new a(utf, date, certificateA);
            }
            hashtable.put(utf, aVar);
        }
    }

    public Cipher makePBECipher(String str, int i10, char[] cArr, byte[] bArr, int i11) throws IOException {
        try {
            PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr);
            BCJcaJceHelper bCJcaJceHelper = this.f90092p0;
            SecretKeyFactory secretKeyFactoryCreateSecretKeyFactory = bCJcaJceHelper.createSecretKeyFactory(str);
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(bArr, i11);
            Cipher cipherCreateCipher = bCJcaJceHelper.createCipher(str);
            cipherCreateCipher.init(i10, secretKeyFactoryCreateSecretKeyFactory.generateSecret(pBEKeySpec), pBEParameterSpec);
            return cipherCreateCipher;
        } catch (Exception e5) {
            throw new IOException(c2.b.d("Error initialising store of key store: ", e5));
        }
    }

    public void saveStore(OutputStream outputStream) throws IOException {
        Enumeration enumerationElements = this.table.elements();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        while (true) {
            if (!enumerationElements.hasMoreElements()) {
                dataOutputStream.write(0);
                return;
            }
            a aVar = (a) enumerationElements.nextElement();
            dataOutputStream.write(aVar.f90093a);
            dataOutputStream.writeUTF(aVar.f90094b);
            dataOutputStream.writeLong(aVar.f90097e.getTime());
            Certificate[] certificateArr = aVar.f90096d;
            if (certificateArr == null) {
                dataOutputStream.writeInt(0);
            } else {
                dataOutputStream.writeInt(certificateArr.length);
                for (int i10 = 0; i10 != certificateArr.length; i10++) {
                    c(certificateArr[i10], dataOutputStream);
                }
            }
            int i11 = aVar.f90093a;
            if (i11 == 1) {
                c((Certificate) aVar.f90095c, dataOutputStream);
            } else if (i11 == 2) {
                d((Key) aVar.f90095c, dataOutputStream);
            } else {
                if (i11 != 3 && i11 != 4) {
                    throw new IOException("Unknown object type in store.");
                }
                byte[] bArr = (byte[]) aVar.f90095c;
                dataOutputStream.writeInt(bArr.length);
                dataOutputStream.write(bArr);
            }
        }
    }

    @Override // org.bouncycastle.jce.interfaces.BCKeyStore
    public void setRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
    }

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f90093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f90094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f90095c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Certificate[] f90096d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Date f90097e;

        public a(String str, Key key, char[] cArr, Certificate[] certificateArr) throws Exception {
            this.f90097e = new Date();
            this.f90093a = 4;
            this.f90094b = str;
            this.f90096d = certificateArr;
            byte[] bArr = new byte[20];
            BcKeyStoreSpi.this.random.setSeed(System.currentTimeMillis());
            BcKeyStoreSpi.this.random.nextBytes(bArr);
            int iNextInt = (BcKeyStoreSpi.this.random.nextInt() & 1023) + 1024;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeInt(20);
            dataOutputStream.write(bArr);
            dataOutputStream.writeInt(iNextInt);
            DataOutputStream dataOutputStream2 = new DataOutputStream(new CipherOutputStream(dataOutputStream, BcKeyStoreSpi.this.makePBECipher("PBEWithSHAAnd3-KeyTripleDES-CBC", 1, cArr, bArr, iNextInt)));
            BcKeyStoreSpi.d(key, dataOutputStream2);
            dataOutputStream2.close();
            this.f90095c = byteArrayOutputStream.toByteArray();
        }

        public a(String str, Certificate certificate) {
            this.f90097e = new Date();
            this.f90093a = 1;
            this.f90094b = str;
            this.f90095c = certificate;
            this.f90096d = null;
        }

        public a(String str, Date date, int i10, Serializable serializable, Certificate[] certificateArr) {
            new Date();
            this.f90094b = str;
            this.f90097e = date;
            this.f90093a = i10;
            this.f90095c = serializable;
            this.f90096d = certificateArr;
        }

        public a(String str, Date date, Certificate certificate) {
            new Date();
            this.f90094b = str;
            this.f90097e = date;
            this.f90093a = 1;
            this.f90095c = certificate;
        }

        public a(String str, byte[] bArr, Certificate[] certificateArr) {
            this.f90097e = new Date();
            this.f90093a = 3;
            this.f90094b = str;
            this.f90095c = bArr;
            this.f90096d = certificateArr;
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
        this.table.put(str, new a(str, bArr, certificateArr));
    }
}
