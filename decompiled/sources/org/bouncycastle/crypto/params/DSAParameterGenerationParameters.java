package org.bouncycastle.crypto.params;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public class DSAParameterGenerationParameters {
    public static final int DIGITAL_SIGNATURE_USAGE = 1;
    public static final int KEY_ESTABLISHMENT_USAGE = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f89247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f89248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f89249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f89250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SecureRandom f89251e;

    public DSAParameterGenerationParameters(int i10, int i11, int i12, SecureRandom secureRandom) {
        this(i10, i11, i12, secureRandom, -1);
    }

    public int getCertainty() {
        return this.f89250d;
    }

    public int getL() {
        return this.f89247a;
    }

    public int getN() {
        return this.f89248b;
    }

    public SecureRandom getRandom() {
        return this.f89251e;
    }

    public int getUsageIndex() {
        return this.f89249c;
    }

    public DSAParameterGenerationParameters(int i10, int i11, int i12, SecureRandom secureRandom, int i13) {
        this.f89247a = i10;
        this.f89248b = i11;
        this.f89250d = i12;
        this.f89249c = i13;
        this.f89251e = secureRandom;
    }
}
