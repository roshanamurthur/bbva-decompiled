package org.bouncycastle.asn1;

import androidx.appcompat.widget.g0;
import java.io.IOException;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ASN1ApplicationSpecific extends ASN1Primitive {
    protected final boolean isConstructed;
    protected final byte[] octets;
    protected final int tag;

    public ASN1ApplicationSpecific(boolean z10, int i10, byte[] bArr) {
        this.isConstructed = z10;
        this.tag = i10;
        this.octets = Arrays.clone(bArr);
    }

    public static ASN1ApplicationSpecific getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1ApplicationSpecific)) {
            return (ASN1ApplicationSpecific) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "unknown object in getInstance: "));
        }
        try {
            return getInstance(ASN1Primitive.fromByteArray((byte[]) obj));
        } catch (IOException e5) {
            throw new IllegalArgumentException(androidx.camera.core.impl.a.d(e5, new StringBuilder("Failed to construct object from byte[]: ")));
        }
    }

    public static int getLengthOfHeader(byte[] bArr) {
        byte b10 = bArr[1];
        int i10 = b10 & 255;
        if (i10 == 128 || i10 <= 127) {
            return 2;
        }
        int i11 = b10 & 127;
        if (i11 <= 4) {
            return i11 + 2;
        }
        throw new IllegalStateException(g0.c("DER length more than 4 bytes: ", i11));
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void a(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        aSN1OutputStream.g(this.octets, this.isConstructed ? 96 : 64, this.tag, z10);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1ApplicationSpecific)) {
            return false;
        }
        ASN1ApplicationSpecific aSN1ApplicationSpecific = (ASN1ApplicationSpecific) aSN1Primitive;
        return this.isConstructed == aSN1ApplicationSpecific.isConstructed && this.tag == aSN1ApplicationSpecific.tag && Arrays.areEqual(this.octets, aSN1ApplicationSpecific.octets);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int b() throws IOException {
        return j.a(this.octets.length) + j.b(this.tag) + this.octets.length;
    }

    public int getApplicationTag() {
        return this.tag;
    }

    public byte[] getContents() {
        return Arrays.clone(this.octets);
    }

    public ASN1Primitive getObject() throws IOException {
        return ASN1Primitive.fromByteArray(getContents());
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        boolean z10 = this.isConstructed;
        return ((z10 ? 1 : 0) ^ this.tag) ^ Arrays.hashCode(this.octets);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        return this.isConstructed;
    }

    public String toString() {
        String hexString;
        StringBuffer stringBuffer = new StringBuffer(Constant.BRACKET_OPEN);
        if (isConstructed()) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("APPLICATION ");
        stringBuffer.append(Integer.toString(getApplicationTag()));
        stringBuffer.append(Constant.BRACKET_CLOSE);
        if (this.octets != null) {
            stringBuffer.append(" #");
            hexString = Hex.toHexString(this.octets);
        } else {
            hexString = " #null";
        }
        stringBuffer.append(hexString);
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }

    public ASN1Primitive getObject(int i10) throws IOException {
        int i11;
        if (i10 >= 31) {
            throw new IOException("unsupported tag number");
        }
        byte[] encoded = getEncoded();
        if ((encoded[0] & 31) == 31) {
            byte b10 = encoded[1];
            int i12 = b10 & 255;
            if ((b10 & 127) == 0) {
                throw new IOException("corrupted stream - invalid high tag number found");
            }
            i11 = 2;
            while ((i12 & 128) != 0) {
                i12 = encoded[i11] & 255;
                i11++;
            }
        } else {
            i11 = 1;
        }
        int length = encoded.length - i11;
        byte[] bArr = new byte[length + 1];
        System.arraycopy(encoded, i11, bArr, 1, length);
        byte b11 = (byte) i10;
        bArr[0] = b11;
        if ((encoded[0] & 32) != 0) {
            bArr[0] = (byte) (b11 | 32);
        }
        return ASN1Primitive.fromByteArray(bArr);
    }
}
