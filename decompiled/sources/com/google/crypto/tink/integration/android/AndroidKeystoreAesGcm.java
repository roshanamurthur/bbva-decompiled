package com.google.crypto.tink.integration.android;

import android.util.Log;
import androidx.camera.core.processing.f;
import com.bbva.ethermobilesdk.cipher.keystore.provider.KeyStoreProvider;
import com.google.crypto.tink.Aead;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: loaded from: classes10.dex */
public final class AndroidKeystoreAesGcm implements Aead {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKey f46612a;

    public AndroidKeystoreAesGcm(String str) throws GeneralSecurityException, IOException {
        KeyStore keyStore = KeyStore.getInstance(KeyStoreProvider.ANDROID_KEYSTORE);
        keyStore.load(null);
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.f46612a = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException(f.d("Keystore cannot load the key with ID: ", str));
        }
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, this.f46612a, gCMParameterSpec);
        cipher.updateAAD(bArr2);
        return cipher.doFinal(bArr, 12, bArr.length - 12);
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, this.f46612a);
        cipher.updateAAD(bArr2);
        cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
        System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
        return bArr3;
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        try {
            return a(bArr, bArr2);
        } catch (ProviderException e5) {
            e = e5;
            Log.w("AndroidKeystoreAesGcm", "encountered a potentially transient KeyStore error, will wait and retry", e);
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused) {
            }
            return a(bArr, bArr2);
        } catch (AEADBadTagException e7) {
            throw e7;
        } catch (GeneralSecurityException e10) {
            e = e10;
            Log.w("AndroidKeystoreAesGcm", "encountered a potentially transient KeyStore error, will wait and retry", e);
            Thread.sleep((int) (Math.random() * 100.0d));
            return a(bArr, bArr2);
        }
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            return b(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e5) {
            Log.w("AndroidKeystoreAesGcm", "encountered a potentially transient KeyStore error, will wait and retry", e5);
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused) {
            }
            return b(bArr, bArr2);
        }
    }

    public AndroidKeystoreAesGcm(KeyStore keyStore, String str) throws GeneralSecurityException {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.f46612a = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException(f.d("Keystore cannot load the key with ID: ", str));
        }
    }
}
