package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.crypto.CipherParameters;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes9.dex */
public class l4 implements CipherParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SecureRandom f66180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CipherParameters f66181b;

    public CipherParameters a() {
        return this.f66181b;
    }

    public SecureRandom b() {
        return this.f66180a;
    }
}
