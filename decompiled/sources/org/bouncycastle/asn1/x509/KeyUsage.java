package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERBitString;

/* JADX INFO: loaded from: classes12.dex */
public class KeyUsage extends ASN1Object {
    public static final int cRLSign = 2;
    public static final int dataEncipherment = 16;
    public static final int decipherOnly = 32768;
    public static final int digitalSignature = 128;
    public static final int encipherOnly = 1;
    public static final int keyAgreement = 8;
    public static final int keyCertSign = 4;
    public static final int keyEncipherment = 32;
    public static final int nonRepudiation = 64;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public DERBitString f87650p0;

    public KeyUsage(int i10) {
        this.f87650p0 = new DERBitString(i10);
    }

    public static KeyUsage fromExtensions(Extensions extensions) {
        return getInstance(Extensions.getExtensionParsedValue(extensions, Extension.keyUsage));
    }

    public static KeyUsage getInstance(Object obj) {
        if (obj instanceof KeyUsage) {
            return (KeyUsage) obj;
        }
        if (obj == null) {
            return null;
        }
        DERBitString dERBitString = DERBitString.getInstance(obj);
        KeyUsage keyUsage = new KeyUsage();
        keyUsage.f87650p0 = dERBitString;
        return keyUsage;
    }

    public byte[] getBytes() {
        return this.f87650p0.getBytes();
    }

    public int getPadBits() {
        return this.f87650p0.getPadBits();
    }

    public boolean hasUsages(int i10) {
        return (this.f87650p0.intValue() & i10) == i10;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87650p0;
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        byte[] bytes = this.f87650p0.getBytes();
        if (bytes.length == 1) {
            sb2 = new StringBuilder("KeyUsage: 0x");
            i10 = bytes[0] & 255;
        } else {
            sb2 = new StringBuilder("KeyUsage: 0x");
            i10 = (bytes[0] & 255) | ((bytes[1] & 255) << 8);
        }
        sb2.append(Integer.toHexString(i10));
        return sb2.toString();
    }
}
