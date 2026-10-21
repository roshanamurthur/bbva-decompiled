package org.bouncycastle.crypto.agreement.jpake;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class JPAKERound3Payload {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigInteger f87932b;

    public JPAKERound3Payload(String str, BigInteger bigInteger) {
        this.f87931a = str;
        this.f87932b = bigInteger;
    }

    public BigInteger getMacTag() {
        return this.f87932b;
    }

    public String getParticipantId() {
        return this.f87931a;
    }
}
