package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.proto.KeyTemplate;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
public final class KmsEnvelopeAead implements Aead {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f46523c = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyTemplate f46524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Aead f46525b;

    public KmsEnvelopeAead(KeyTemplate keyTemplate, Aead aead) {
        this.f46524a = keyTemplate;
        this.f46525b = aead;
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i10 = byteBufferWrap.getInt();
            if (i10 <= 0 || i10 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i10];
            byteBufferWrap.get(bArr3, 0, i10);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((Aead) Registry.getPrimitive(this.f46524a.getTypeUrl(), this.f46525b.decrypt(bArr3, f46523c), Aead.class)).decrypt(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e5) {
            e = e5;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e7) {
            e = e7;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e10) {
            e = e10;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        KeyTemplate keyTemplate = this.f46524a;
        byte[] byteArray = Registry.newKey(keyTemplate).toByteArray();
        byte[] bArrEncrypt = this.f46525b.encrypt(byteArray, f46523c);
        byte[] bArrEncrypt2 = ((Aead) Registry.getPrimitive(keyTemplate.getTypeUrl(), byteArray, Aead.class)).encrypt(bArr, bArr2);
        return ByteBuffer.allocate(bArrEncrypt.length + 4 + bArrEncrypt2.length).putInt(bArrEncrypt.length).put(bArrEncrypt).put(bArrEncrypt2).array();
    }
}
