package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes9.dex */
public class k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SecureRandom f66168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f66169b;

    public k3(SecureRandom secureRandom, int i10) {
        this.f66168a = secureRandom;
        this.f66169b = i10;
    }

    public SecureRandom getRandom() {
        return this.f66168a;
    }

    public int getStrength() {
        return this.f66169b;
    }
}
