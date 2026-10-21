package com.google.crypto.tink.subtle;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class Random {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f47480a = new a();

    public class a extends ThreadLocal<SecureRandom> {
        @Override // java.lang.ThreadLocal
        public final SecureRandom initialValue() {
            a aVar = Random.f47480a;
            SecureRandom secureRandom = new SecureRandom();
            secureRandom.nextLong();
            return secureRandom;
        }
    }

    public static byte[] randBytes(int i10) {
        byte[] bArr = new byte[i10];
        f47480a.get().nextBytes(bArr);
        return bArr;
    }

    public static final int randInt(int i10) {
        return f47480a.get().nextInt(i10);
    }

    public static final int randInt() {
        return f47480a.get().nextInt();
    }
}
