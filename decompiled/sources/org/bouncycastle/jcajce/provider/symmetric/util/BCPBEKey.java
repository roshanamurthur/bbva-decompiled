package org.bouncycastle.jcajce.provider.symmetric.util;

import com.bbva.ethermobilesdk.cipher.token.utils.HMACUtilsKt;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;
import javax.security.auth.Destroyable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public class BCPBEKey implements PBEKey, Destroyable {
    public final CipherParameters E0;
    public boolean F0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicBoolean f90205p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f90206q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ASN1ObjectIdentifier f90207r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f90208s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f90209t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f90210u0;
    public final int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final char[] f90211w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final byte[] f90212x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final int f90213y0;

    public BCPBEKey(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, int i10, int i11, int i12, int i13, PBEKeySpec pBEKeySpec, CipherParameters cipherParameters) {
        this.f90205p0 = new AtomicBoolean(false);
        this.F0 = false;
        this.f90206q0 = str;
        this.f90207r0 = aSN1ObjectIdentifier;
        this.f90208s0 = i10;
        this.f90209t0 = i11;
        this.f90210u0 = i12;
        this.v0 = i13;
        this.f90211w0 = pBEKeySpec.getPassword();
        this.f90213y0 = pBEKeySpec.getIterationCount();
        this.f90212x0 = pBEKeySpec.getSalt();
        this.E0 = cipherParameters;
    }

    public static void a(Destroyable destroyable) {
        if (destroyable.isDestroyed()) {
            throw new IllegalStateException("key has been destroyed");
        }
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        if (this.f90205p0.getAndSet(true)) {
            return;
        }
        char[] cArr = this.f90211w0;
        if (cArr != null) {
            Arrays.fill(cArr, (char) 0);
        }
        byte[] bArr = this.f90212x0;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        a(this);
        return this.f90206q0;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        a(this);
        CipherParameters parameters = this.E0;
        if (parameters != null) {
            if (parameters instanceof ParametersWithIV) {
                parameters = ((ParametersWithIV) parameters).getParameters();
            }
            return ((KeyParameter) parameters).getKey();
        }
        char[] cArr = this.f90211w0;
        int i10 = this.f90208s0;
        if (i10 == 2) {
            return PBEParametersGenerator.PKCS12PasswordToBytes(cArr);
        }
        return i10 == 5 ? PBEParametersGenerator.PKCS5PasswordToUTF8Bytes(cArr) : PBEParametersGenerator.PKCS5PasswordToBytes(cArr);
    }

    @Override // java.security.Key
    public String getFormat() {
        return HMACUtilsKt.DEFAULT_SECRET_KEYSPEC_ALGORITHM;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        a(this);
        return this.f90213y0;
    }

    public int getIvSize() {
        a(this);
        return this.v0;
    }

    public ASN1ObjectIdentifier getOID() {
        a(this);
        return this.f90207r0;
    }

    public CipherParameters getParam() {
        a(this);
        return this.E0;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public char[] getPassword() {
        a(this);
        char[] cArr = this.f90211w0;
        if (cArr != null) {
            return Arrays.clone(cArr);
        }
        throw new IllegalStateException("no password available");
    }

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        a(this);
        return Arrays.clone(this.f90212x0);
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return this.f90205p0.get();
    }

    public void setTryWrongPKCS12Zero(boolean z10) {
        this.F0 = z10;
    }

    public BCPBEKey(String str, CipherParameters cipherParameters) {
        this.f90205p0 = new AtomicBoolean(false);
        this.F0 = false;
        this.f90206q0 = str;
        this.E0 = cipherParameters;
        this.f90211w0 = null;
        this.f90213y0 = -1;
        this.f90212x0 = null;
    }
}
