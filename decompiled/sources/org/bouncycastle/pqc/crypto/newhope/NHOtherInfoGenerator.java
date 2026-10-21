package org.bouncycastle.pqc.crypto.newhope;

import java.io.IOException;
import java.security.SecureRandom;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.util.DEROtherInfo;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.crypto.ExchangePair;

/* JADX INFO: loaded from: classes13.dex */
public class NHOtherInfoGenerator {
    protected final DEROtherInfo.Builder otherInfoBuilder;
    protected final SecureRandom random;
    protected boolean used = false;

    public static class PartyU extends NHOtherInfoGenerator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AsymmetricCipherKeyPair f91196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final NHAgreement f91197b;

        public PartyU(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
            super(algorithmIdentifier, bArr, bArr2, secureRandom);
            NHAgreement nHAgreement = new NHAgreement();
            this.f91197b = nHAgreement;
            NHKeyPairGenerator nHKeyPairGenerator = new NHKeyPairGenerator();
            nHKeyPairGenerator.init(new KeyGenerationParameters(secureRandom, 2048));
            AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = nHKeyPairGenerator.generateKeyPair();
            this.f91196a = asymmetricCipherKeyPairGenerateKeyPair;
            nHAgreement.init(asymmetricCipherKeyPairGenerateKeyPair.getPrivate());
        }

        public DEROtherInfo generate(byte[] bArr) {
            if (this.used) {
                throw new IllegalStateException("builder already used");
            }
            this.used = true;
            this.otherInfoBuilder.withSuppPrivInfo(this.f91197b.calculateAgreement(new NHPublicKeyParameters(SubjectPublicKeyInfo.getInstance(bArr).getPublicKeyData().getOctets())));
            return this.otherInfoBuilder.build();
        }

        public byte[] getSuppPrivInfoPartA() {
            return NHOtherInfoGenerator.a((NHPublicKeyParameters) this.f91196a.getPublic());
        }

        public NHOtherInfoGenerator withSuppPubInfo(byte[] bArr) {
            this.otherInfoBuilder.withSuppPubInfo(bArr);
            return this;
        }
    }

    public static class PartyV extends NHOtherInfoGenerator {
        public PartyV(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
            super(algorithmIdentifier, bArr, bArr2, secureRandom);
        }

        public DEROtherInfo generate() {
            if (this.used) {
                throw new IllegalStateException("builder already used");
            }
            this.used = true;
            return this.otherInfoBuilder.build();
        }

        public byte[] getSuppPrivInfoPartB(byte[] bArr) {
            ExchangePair exchangePairGenerateExchange = new NHExchangePairGenerator(this.random).generateExchange(new NHPublicKeyParameters(SubjectPublicKeyInfo.getInstance(bArr).getPublicKeyData().getOctets()));
            this.otherInfoBuilder.withSuppPrivInfo(exchangePairGenerateExchange.getSharedValue());
            return NHOtherInfoGenerator.a((NHPublicKeyParameters) exchangePairGenerateExchange.getPublicKey());
        }

        public NHOtherInfoGenerator withSuppPubInfo(byte[] bArr) {
            this.otherInfoBuilder.withSuppPubInfo(bArr);
            return this;
        }
    }

    public NHOtherInfoGenerator(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        this.otherInfoBuilder = new DEROtherInfo.Builder(algorithmIdentifier, bArr, bArr2);
        this.random = secureRandom;
    }

    public static byte[] a(NHPublicKeyParameters nHPublicKeyParameters) {
        try {
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.newHope), nHPublicKeyParameters.getPubData()).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }
}
