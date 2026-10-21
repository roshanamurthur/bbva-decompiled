package net.lingala.zip4j.crypto.PBKDF2;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes12.dex */
public class MacBasedPRF implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mac f84915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f84916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84917c;

    public MacBasedPRF(String str) {
        this.f84917c = str;
        try {
            Mac mac = Mac.getInstance(str);
            this.f84915a = mac;
            this.f84916b = mac.getMacLength();
        } catch (NoSuchAlgorithmException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // net.lingala.zip4j.crypto.PBKDF2.a
    public byte[] doFinal(byte[] bArr) {
        return this.f84915a.doFinal(bArr);
    }

    @Override // net.lingala.zip4j.crypto.PBKDF2.a
    public int getHLen() {
        return this.f84916b;
    }

    @Override // net.lingala.zip4j.crypto.PBKDF2.a
    public void init(byte[] bArr) {
        try {
            this.f84915a.init(new SecretKeySpec(bArr, this.f84917c));
        } catch (InvalidKeyException e5) {
            throw new RuntimeException(e5);
        }
    }

    public void update(byte[] bArr) {
        try {
            this.f84915a.update(bArr);
        } catch (IllegalStateException e5) {
            throw new RuntimeException(e5);
        }
    }

    public byte[] doFinal() {
        return this.f84915a.doFinal();
    }

    public void update(byte[] bArr, int i10, int i11) {
        try {
            this.f84915a.update(bArr, i10, i11);
        } catch (IllegalStateException e5) {
            throw new RuntimeException(e5);
        }
    }
}
