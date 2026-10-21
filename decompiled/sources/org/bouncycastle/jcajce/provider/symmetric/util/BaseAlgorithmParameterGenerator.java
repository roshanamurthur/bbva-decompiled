package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.AlgorithmParameterGeneratorSpi;
import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;

/* JADX INFO: loaded from: classes8.dex */
public abstract class BaseAlgorithmParameterGenerator extends AlgorithmParameterGeneratorSpi {
    protected SecureRandom random;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BCJcaJceHelper f90214a = new BCJcaJceHelper();
    protected int strength = 1024;

    public final AlgorithmParameters createParametersInstance(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return this.f90214a.createAlgorithmParameters(str);
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public void engineInit(int i10, SecureRandom secureRandom) {
        this.strength = i10;
        this.random = secureRandom;
    }
}
