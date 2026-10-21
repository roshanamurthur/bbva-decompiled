package org.bouncycastle.crypto.agreement.jpake;

import java.math.BigInteger;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class JPAKERound1Payload {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigInteger f87924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigInteger f87925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BigInteger[] f87926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BigInteger[] f87927e;

    public JPAKERound1Payload(String str, BigInteger bigInteger, BigInteger bigInteger2, BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2) {
        JPAKEUtil.validateNotNull(str, "participantId");
        JPAKEUtil.validateNotNull(bigInteger, "gx1");
        JPAKEUtil.validateNotNull(bigInteger2, "gx2");
        JPAKEUtil.validateNotNull(bigIntegerArr, "knowledgeProofForX1");
        JPAKEUtil.validateNotNull(bigIntegerArr2, "knowledgeProofForX2");
        this.f87923a = str;
        this.f87924b = bigInteger;
        this.f87925c = bigInteger2;
        this.f87926d = Arrays.copyOf(bigIntegerArr, bigIntegerArr.length);
        this.f87927e = Arrays.copyOf(bigIntegerArr2, bigIntegerArr2.length);
    }

    public BigInteger getGx1() {
        return this.f87924b;
    }

    public BigInteger getGx2() {
        return this.f87925c;
    }

    public BigInteger[] getKnowledgeProofForX1() {
        BigInteger[] bigIntegerArr = this.f87926d;
        return Arrays.copyOf(bigIntegerArr, bigIntegerArr.length);
    }

    public BigInteger[] getKnowledgeProofForX2() {
        BigInteger[] bigIntegerArr = this.f87927e;
        return Arrays.copyOf(bigIntegerArr, bigIntegerArr.length);
    }

    public String getParticipantId() {
        return this.f87923a;
    }
}
