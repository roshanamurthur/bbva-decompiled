package org.bouncycastle.crypto.agreement.jpake;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class JPAKEParticipant {
    public static final int STATE_INITIALIZED = 0;
    public static final int STATE_KEY_CALCULATED = 50;
    public static final int STATE_ROUND_1_CREATED = 10;
    public static final int STATE_ROUND_1_VALIDATED = 20;
    public static final int STATE_ROUND_2_CREATED = 30;
    public static final int STATE_ROUND_2_VALIDATED = 40;
    public static final int STATE_ROUND_3_CREATED = 60;
    public static final int STATE_ROUND_3_VALIDATED = 70;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public char[] f87906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Digest f87907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SecureRandom f87908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BigInteger f87909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final BigInteger f87910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BigInteger f87911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f87912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BigInteger f87913i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BigInteger f87914j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public BigInteger f87915k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public BigInteger f87916l;
    public BigInteger m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public BigInteger f87917n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public BigInteger f87918o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f87919p;

    public JPAKEParticipant(String str, char[] cArr) {
        this(str, cArr, JPAKEPrimeOrderGroups.NIST_3072);
    }

    public BigInteger calculateKeyingMaterial() {
        int i10 = this.f87919p;
        String str = this.f87905a;
        if (i10 >= 50) {
            throw new IllegalStateException("Key already calculated for " + str);
        }
        if (i10 < 40) {
            throw new IllegalStateException("Round2 payload must be validated prior to creating key for " + str);
        }
        BigInteger bigIntegerCalculateS = JPAKEUtil.calculateS(this.f87906b);
        Arrays.fill(this.f87906b, (char) 0);
        this.f87906b = null;
        BigInteger bigIntegerCalculateKeyingMaterial = JPAKEUtil.calculateKeyingMaterial(this.f87909e, this.f87910f, this.f87917n, this.f87914j, bigIntegerCalculateS, this.f87918o);
        this.f87913i = null;
        this.f87914j = null;
        this.f87918o = null;
        this.f87919p = 50;
        return bigIntegerCalculateKeyingMaterial;
    }

    public JPAKERound1Payload createRound1PayloadToSend() {
        if (this.f87919p >= 10) {
            throw new IllegalStateException("Round1 payload already created for " + this.f87905a);
        }
        BigInteger bigInteger = this.f87910f;
        SecureRandom secureRandom = this.f87908d;
        this.f87913i = JPAKEUtil.generateX1(bigInteger, secureRandom);
        this.f87914j = JPAKEUtil.generateX2(bigInteger, secureRandom);
        BigInteger bigInteger2 = this.f87913i;
        BigInteger bigInteger3 = this.f87909e;
        BigInteger bigInteger4 = this.f87911g;
        this.f87915k = JPAKEUtil.calculateGx(bigInteger3, bigInteger4, bigInteger2);
        this.f87916l = JPAKEUtil.calculateGx(bigInteger3, bigInteger4, this.f87914j);
        BigInteger[] bigIntegerArrCalculateZeroKnowledgeProof = JPAKEUtil.calculateZeroKnowledgeProof(this.f87909e, this.f87910f, this.f87911g, this.f87915k, this.f87913i, this.f87905a, this.f87907c, this.f87908d);
        BigInteger[] bigIntegerArrCalculateZeroKnowledgeProof2 = JPAKEUtil.calculateZeroKnowledgeProof(this.f87909e, this.f87910f, this.f87911g, this.f87916l, this.f87914j, this.f87905a, this.f87907c, this.f87908d);
        this.f87919p = 10;
        return new JPAKERound1Payload(this.f87905a, this.f87915k, this.f87916l, bigIntegerArrCalculateZeroKnowledgeProof, bigIntegerArrCalculateZeroKnowledgeProof2);
    }

    public JPAKERound2Payload createRound2PayloadToSend() {
        int i10 = this.f87919p;
        String str = this.f87905a;
        if (i10 >= 30) {
            throw new IllegalStateException("Round2 payload already created for " + str);
        }
        if (i10 < 20) {
            throw new IllegalStateException("Round1 payload must be validated prior to creating Round2 payload for " + str);
        }
        BigInteger bigInteger = this.f87915k;
        BigInteger bigInteger2 = this.m;
        BigInteger bigInteger3 = this.f87917n;
        BigInteger bigInteger4 = this.f87909e;
        BigInteger bigIntegerCalculateGA = JPAKEUtil.calculateGA(bigInteger4, bigInteger, bigInteger2, bigInteger3);
        BigInteger bigIntegerCalculateS = JPAKEUtil.calculateS(this.f87906b);
        BigInteger bigInteger5 = this.f87914j;
        BigInteger bigInteger6 = this.f87910f;
        BigInteger bigIntegerCalculateX2s = JPAKEUtil.calculateX2s(bigInteger6, bigInteger5, bigIntegerCalculateS);
        BigInteger bigIntegerCalculateA = JPAKEUtil.calculateA(bigInteger4, bigInteger6, bigIntegerCalculateGA, bigIntegerCalculateX2s);
        BigInteger[] bigIntegerArrCalculateZeroKnowledgeProof = JPAKEUtil.calculateZeroKnowledgeProof(this.f87909e, this.f87910f, bigIntegerCalculateGA, bigIntegerCalculateA, bigIntegerCalculateX2s, this.f87905a, this.f87907c, this.f87908d);
        this.f87919p = 30;
        return new JPAKERound2Payload(str, bigIntegerCalculateA, bigIntegerArrCalculateZeroKnowledgeProof);
    }

    public JPAKERound3Payload createRound3PayloadToSend(BigInteger bigInteger) {
        int i10 = this.f87919p;
        String str = this.f87905a;
        if (i10 >= 60) {
            throw new IllegalStateException("Round3 payload already created for " + str);
        }
        if (i10 >= 50) {
            BigInteger bigIntegerCalculateMacTag = JPAKEUtil.calculateMacTag(this.f87905a, this.f87912h, this.f87915k, this.f87916l, this.m, this.f87917n, bigInteger, this.f87907c);
            this.f87919p = 60;
            return new JPAKERound3Payload(str, bigIntegerCalculateMacTag);
        }
        throw new IllegalStateException("Keying material must be calculated prior to creating Round3 payload for " + str);
    }

    public int getState() {
        return this.f87919p;
    }

    public void validateRound1PayloadReceived(JPAKERound1Payload jPAKERound1Payload) throws CryptoException {
        int i10 = this.f87919p;
        String str = this.f87905a;
        if (i10 >= 20) {
            throw new IllegalStateException("Validation already attempted for round1 payload for" + str);
        }
        this.f87912h = jPAKERound1Payload.getParticipantId();
        this.m = jPAKERound1Payload.getGx1();
        this.f87917n = jPAKERound1Payload.getGx2();
        BigInteger[] knowledgeProofForX1 = jPAKERound1Payload.getKnowledgeProofForX1();
        BigInteger[] knowledgeProofForX2 = jPAKERound1Payload.getKnowledgeProofForX2();
        JPAKEUtil.validateParticipantIdsDiffer(str, jPAKERound1Payload.getParticipantId());
        JPAKEUtil.validateGx4(this.f87917n);
        JPAKEUtil.validateZeroKnowledgeProof(this.f87909e, this.f87910f, this.f87911g, this.m, knowledgeProofForX1, jPAKERound1Payload.getParticipantId(), this.f87907c);
        JPAKEUtil.validateZeroKnowledgeProof(this.f87909e, this.f87910f, this.f87911g, this.f87917n, knowledgeProofForX2, jPAKERound1Payload.getParticipantId(), this.f87907c);
        this.f87919p = 20;
    }

    public void validateRound2PayloadReceived(JPAKERound2Payload jPAKERound2Payload) throws CryptoException {
        int i10 = this.f87919p;
        String str = this.f87905a;
        if (i10 >= 40) {
            throw new IllegalStateException("Validation already attempted for round2 payload for" + str);
        }
        if (i10 < 20) {
            throw new IllegalStateException("Round1 payload must be validated prior to validating Round2 payload for " + str);
        }
        BigInteger bigIntegerCalculateGA = JPAKEUtil.calculateGA(this.f87909e, this.m, this.f87915k, this.f87916l);
        this.f87918o = jPAKERound2Payload.getA();
        BigInteger[] knowledgeProofForX2s = jPAKERound2Payload.getKnowledgeProofForX2s();
        JPAKEUtil.validateParticipantIdsDiffer(str, jPAKERound2Payload.getParticipantId());
        JPAKEUtil.validateParticipantIdsEqual(this.f87912h, jPAKERound2Payload.getParticipantId());
        JPAKEUtil.validateGa(bigIntegerCalculateGA);
        JPAKEUtil.validateZeroKnowledgeProof(this.f87909e, this.f87910f, bigIntegerCalculateGA, this.f87918o, knowledgeProofForX2s, jPAKERound2Payload.getParticipantId(), this.f87907c);
        this.f87919p = 40;
    }

    public void validateRound3PayloadReceived(JPAKERound3Payload jPAKERound3Payload, BigInteger bigInteger) throws CryptoException {
        int i10 = this.f87919p;
        String str = this.f87905a;
        if (i10 >= 70) {
            throw new IllegalStateException("Validation already attempted for round3 payload for" + str);
        }
        if (i10 < 50) {
            throw new IllegalStateException("Keying material must be calculated validated prior to validating Round3 payload for " + str);
        }
        JPAKEUtil.validateParticipantIdsDiffer(str, jPAKERound3Payload.getParticipantId());
        JPAKEUtil.validateParticipantIdsEqual(this.f87912h, jPAKERound3Payload.getParticipantId());
        JPAKEUtil.validateMacTag(this.f87905a, this.f87912h, this.f87915k, this.f87916l, this.m, this.f87917n, bigInteger, this.f87907c, jPAKERound3Payload.getMacTag());
        this.f87915k = null;
        this.f87916l = null;
        this.m = null;
        this.f87917n = null;
        this.f87919p = 70;
    }

    public JPAKEParticipant(String str, char[] cArr, JPAKEPrimeOrderGroup jPAKEPrimeOrderGroup) {
        this(str, cArr, jPAKEPrimeOrderGroup, new SHA256Digest(), CryptoServicesRegistrar.getSecureRandom());
    }

    public JPAKEParticipant(String str, char[] cArr, JPAKEPrimeOrderGroup jPAKEPrimeOrderGroup, Digest digest, SecureRandom secureRandom) {
        JPAKEUtil.validateNotNull(str, "participantId");
        JPAKEUtil.validateNotNull(cArr, "password");
        JPAKEUtil.validateNotNull(jPAKEPrimeOrderGroup, "p");
        JPAKEUtil.validateNotNull(digest, "digest");
        JPAKEUtil.validateNotNull(secureRandom, "random");
        if (cArr.length == 0) {
            throw new IllegalArgumentException("Password must not be empty.");
        }
        this.f87905a = str;
        this.f87906b = Arrays.copyOf(cArr, cArr.length);
        this.f87909e = jPAKEPrimeOrderGroup.getP();
        this.f87910f = jPAKEPrimeOrderGroup.getQ();
        this.f87911g = jPAKEPrimeOrderGroup.getG();
        this.f87907c = digest;
        this.f87908d = secureRandom;
        this.f87919p = 0;
    }
}
