package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class DLApplicationSpecific extends ASN1ApplicationSpecific {
    public DLApplicationSpecific(int i10, ASN1Encodable aSN1Encodable) throws IOException {
        this(true, i10, aSN1Encodable);
    }

    @Override // org.bouncycastle.asn1.ASN1ApplicationSpecific, org.bouncycastle.asn1.ASN1Primitive
    public final void a(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        aSN1OutputStream.g(this.octets, this.isConstructed ? 96 : 64, this.tag, z10);
    }

    public DLApplicationSpecific(int i10, ASN1EncodableVector aSN1EncodableVector) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i11 = 0; i11 != aSN1EncodableVector.size(); i11++) {
            try {
                byteArrayOutputStream.write(((ASN1Object) aSN1EncodableVector.get(i11)).getEncoded(ASN1Encoding.DL));
            } catch (IOException e5) {
                throw new ASN1ParsingException(ad.e.d("malformed object: ", e5), e5);
            }
        }
        super(true, i10, byteArrayOutputStream.toByteArray());
    }

    public DLApplicationSpecific(int i10, byte[] bArr) {
        super(false, i10, bArr);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DLApplicationSpecific(boolean z10, int i10, ASN1Encodable aSN1Encodable) throws IOException {
        boolean z11 = z10 || aSN1Encodable.toASN1Primitive().isConstructed();
        byte[] encoded = aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DL);
        if (!z10) {
            int lengthOfHeader = ASN1ApplicationSpecific.getLengthOfHeader(encoded);
            int length = encoded.length - lengthOfHeader;
            byte[] bArr = new byte[length];
            System.arraycopy(encoded, lengthOfHeader, bArr, 0, length);
            encoded = bArr;
        }
        super(z11, i10, encoded);
    }
}
