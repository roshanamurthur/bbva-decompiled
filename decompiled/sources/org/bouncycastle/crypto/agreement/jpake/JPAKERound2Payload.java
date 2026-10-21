package org.bouncycastle.crypto.agreement.jpake;

import java.math.BigInteger;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class JPAKERound2Payload {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigInteger f87929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigInteger[] f87930c;

    public JPAKERound2Payload(String str, BigInteger bigInteger, BigInteger[] bigIntegerArr) {
        JPAKEUtil.validateNotNull(str, "participantId");
        JPAKEUtil.validateNotNull(bigInteger, "a");
        JPAKEUtil.validateNotNull(bigIntegerArr, "knowledgeProofForX2s");
        this.f87928a = str;
        this.f87929b = bigInteger;
        this.f87930c = Arrays.copyOf(bigIntegerArr, bigIntegerArr.length);
    }

    public BigInteger getA() {
        return this.f87929b;
    }

    public BigInteger[] getKnowledgeProofForX2s() {
        BigInteger[] bigIntegerArr = this.f87930c;
        return Arrays.copyOf(bigIntegerArr, bigIntegerArr.length);
    }

    public String getParticipantId() {
        return this.f87928a;
    }
}
