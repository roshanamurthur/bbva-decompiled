package com.mypinpad.tsdk.isolation;

import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Set;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes10.dex */
public abstract class bdg extends KeyFactorySpi implements aox {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54553b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f54554c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<adu> f54555a;

    public bdg(Set<adu> set) {
        this.f54555a = set;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws InvalidKeySpecException {
        bdg bdgVar = (bdg) objArr[0];
        adu aduVar = (adu) objArr[1];
        int i13 = f54553b + 37;
        f54554c = i13 % 128;
        int i14 = i13 % 2;
        bdgVar.getClass();
        if (!bdgVar.f54555a.contains(aduVar)) {
            throw new InvalidKeySpecException("incorrect algorithm OID for key: ".concat(String.valueOf(aduVar)));
        }
        int i15 = f54553b;
        int i16 = (i15 ^ 103) + ((i15 & 103) << 1);
        f54554c = i16 % 128;
        if (i16 % 2 != 0) {
            return null;
        }
        int i17 = 82 / 0;
        return null;
    }

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        int i10 = f54554c;
        int i11 = (((i10 ^ 117) | (i10 & 117)) << 1) - (((~i10) & 117) | (i10 & (-118)));
        f54553b = i11 % 128;
        if (i11 % 2 != 0) {
            boolean z10 = keySpec instanceof PKCS8EncodedKeySpec;
            throw null;
        }
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            StringBuilder sb2 = new StringBuilder("Unsupported key specification: ");
            sb2.append(keySpec.getClass());
            sb2.append(Constant.DOT_STRING);
            throw new InvalidKeySpecException(sb2.toString());
        }
        try {
            ahw ahwVar = (ahw) ahw.setX(new Object[]{((PKCS8EncodedKeySpec) keySpec).getEncoded()}, -1552871480, 1552871484, (int) System.currentTimeMillis());
            aiw aiwVar = (aiw) ahw.setX(new Object[]{ahwVar}, 1453337808, -1453337802, System.identityHashCode(ahwVar));
            setOnFocusChangeListener(new Object[]{this, (adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar}, -661220858, 661220861, System.identityHashCode(aiwVar))}, 550476887, -550476887, System.identityHashCode(this));
            PrivateKey y7 = setY(ahwVar);
            int i12 = f54553b;
            int i13 = i12 ^ 93;
            int i14 = -(-((i12 & 93) << 1));
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            f54554c = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 78 / 0;
            }
            return y7;
        } catch (Exception e5) {
            throw new InvalidKeySpecException(e5.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        int i10 = f54553b;
        int i11 = ((((i10 ^ 23) | (i10 & 23)) << 1) - (~(-((i10 & (-24)) | ((~i10) & 23))))) - 1;
        f54554c = i11 % 128;
        if (i11 % 2 == 0) {
            boolean z10 = keySpec instanceof X509EncodedKeySpec;
            throw null;
        }
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            StringBuilder sb2 = new StringBuilder("Unknown key specification: ");
            sb2.append(keySpec);
            sb2.append(Constant.DOT_STRING);
            throw new InvalidKeySpecException(sb2.toString());
        }
        int i12 = ((i10 ^ 88) + ((i10 & 88) << 1)) - 1;
        f54554c = i12 % 128;
        int i13 = i12 % 2;
        byte[] encoded = ((X509EncodedKeySpec) keySpec).getEncoded();
        try {
            if (i13 != 0) {
                ajj ajjVar = (ajj) ajj.setCompoundDrawableTintBlendMode(new Object[]{encoded}, 909154525, -909154522, (int) System.currentTimeMillis());
                aiw aiwVar = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar}, 912478577, -912478575, System.identityHashCode(ajjVar));
                setOnFocusChangeListener(new Object[]{this, (adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar}, -661220858, 661220861, System.identityHashCode(aiwVar))}, 550476887, -550476887, System.identityHashCode(this));
                return setX(ajjVar);
            }
            ajj ajjVar2 = (ajj) ajj.setCompoundDrawableTintBlendMode(new Object[]{encoded}, 909154525, -909154522, (int) System.currentTimeMillis());
            aiw aiwVar2 = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 912478577, -912478575, System.identityHashCode(ajjVar2));
            setOnFocusChangeListener(new Object[]{this, (adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar2}, -661220858, 661220861, System.identityHashCode(aiwVar2))}, 550476887, -550476887, System.identityHashCode(this));
            setX(ajjVar2);
            throw null;
        } catch (Exception e5) {
            throw new InvalidKeySpecException(e5.toString());
        }
    }
}
