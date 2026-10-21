package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ASN1BitString extends ASN1Primitive implements ASN1String {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final char[] f86501p0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    protected final byte[] data;
    protected final int padBits;

    public ASN1BitString(byte b10, int i10) {
        if (i10 > 7 || i10 < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.data = new byte[]{b10};
        this.padBits = i10;
    }

    public static byte[] derForm(byte[] bArr, int i10) {
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArrClone = Arrays.clone(bArr);
        int length = bArr.length - 1;
        bArrClone[length] = (byte) ((255 << i10) & bArrClone[length]);
        return bArrClone;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1BitString)) {
            return false;
        }
        ASN1BitString aSN1BitString = (ASN1BitString) aSN1Primitive;
        if (this.padBits != aSN1BitString.padBits) {
            return false;
        }
        byte[] bArr = this.data;
        byte[] bArr2 = aSN1BitString.data;
        int length = bArr.length;
        if (length != bArr2.length) {
            return false;
        }
        int i10 = length - 1;
        if (i10 < 0) {
            return true;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (bArr[i11] != bArr2[i11]) {
                return false;
            }
        }
        byte b10 = bArr[i10];
        int i12 = this.padBits;
        return ((byte) (b10 & (255 << i12))) == ((byte) (bArr2[i10] & (255 << i12)));
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive c() {
        return new DERBitString(this.data, this.padBits);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive d() {
        return new DLBitString(this.data, this.padBits);
    }

    public byte[] getBytes() {
        return derForm(this.data, this.padBits);
    }

    public ASN1Primitive getLoadedObject() {
        return toASN1Primitive();
    }

    public byte[] getOctets() {
        if (this.padBits == 0) {
            return Arrays.clone(this.data);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    public int getPadBits() {
        return this.padBits;
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public String getString() {
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] encoded = getEncoded();
            for (int i10 = 0; i10 != encoded.length; i10++) {
                char[] cArr = f86501p0;
                stringBuffer.append(cArr[(encoded[i10] >>> 4) & 15]);
                stringBuffer.append(cArr[encoded[i10] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e5) {
            throw new ASN1ParsingException(androidx.camera.core.impl.a.d(e5, new StringBuilder("Internal error encoding BitString: ")), e5);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        byte[] bArr = this.data;
        int length = bArr.length - 1;
        if (length < 0) {
            return 1;
        }
        return ((Arrays.hashCode(bArr, 0, length) * 257) ^ ((byte) (bArr[length] & (255 << this.padBits)))) ^ this.padBits;
    }

    public int intValue() {
        int iMin = Math.min(4, this.data.length - 1);
        int i10 = 0;
        for (int i11 = 0; i11 < iMin; i11++) {
            i10 |= (255 & this.data[i11]) << (i11 * 8);
        }
        return (iMin < 0 || iMin >= 4) ? i10 : i10 | ((((byte) (this.data[iMin] & (255 << this.padBits))) & 255) << (iMin * 8));
    }

    public String toString() {
        return getString();
    }

    public ASN1BitString(byte[] bArr, int i10) {
        if (bArr == null) {
            throw new NullPointerException("'data' cannot be null");
        }
        if (bArr.length == 0 && i10 != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i10 > 7 || i10 < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.data = Arrays.clone(bArr);
        this.padBits = i10;
    }

    public static byte[] getBytes(int i10) {
        if (i10 == 0) {
            return new byte[0];
        }
        int i11 = 4;
        for (int i12 = 3; i12 >= 1 && ((255 << (i12 * 8)) & i10) == 0; i12--) {
            i11--;
        }
        byte[] bArr = new byte[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            bArr[i13] = (byte) ((i10 >> (i13 * 8)) & 255);
        }
        return bArr;
    }

    public static int getPadBits(int i10) {
        int i11;
        int i12 = 3;
        while (true) {
            if (i12 < 0) {
                i11 = 0;
                break;
            }
            if (i12 != 0) {
                int i13 = i10 >> (i12 * 8);
                if (i13 != 0) {
                    i11 = i13 & 255;
                    break;
                }
                i12--;
            } else {
                if (i10 != 0) {
                    i11 = i10 & 255;
                    break;
                }
                i12--;
            }
        }
        if (i11 == 0) {
            return 0;
        }
        int i14 = 1;
        while (true) {
            i11 <<= 1;
            if ((i11 & 255) == 0) {
                return 8 - i14;
            }
            i14++;
        }
    }
}
