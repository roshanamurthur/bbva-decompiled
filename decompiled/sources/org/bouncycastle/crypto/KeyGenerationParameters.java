package org.bouncycastle.crypto;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public class KeyGenerationParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecureRandom f87867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f87868b;

    public KeyGenerationParameters(SecureRandom secureRandom, int i10) {
        this.f87867a = secureRandom;
        this.f87868b = i10;
    }

    public SecureRandom getRandom() {
        return this.f87867a;
    }

    public int getStrength() {
        return this.f87868b;
    }
}
