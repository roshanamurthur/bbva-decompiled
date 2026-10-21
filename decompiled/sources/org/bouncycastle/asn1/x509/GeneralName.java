package org.bouncycastle.asn1.x509;

import androidx.appcompat.widget.g0;
import androidx.emoji2.text.flatbuffer.a;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.io.IOException;
import java.util.StringTokenizer;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.util.IPAddress;

/* JADX INFO: loaded from: classes12.dex */
public class GeneralName extends ASN1Object implements ASN1Choice {
    public static final int dNSName = 2;
    public static final int directoryName = 4;
    public static final int ediPartyName = 5;
    public static final int iPAddress = 7;
    public static final int otherName = 0;
    public static final int registeredID = 8;
    public static final int rfc822Name = 1;
    public static final int uniformResourceIdentifier = 6;
    public static final int x400Address = 3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Encodable f87625p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f87626q0;

    public GeneralName(int i10, String str) {
        int[] iArrC;
        byte[] bArr;
        ASN1Encodable x500Name;
        this.f87626q0 = i10;
        if (i10 == 1 || i10 == 2 || i10 == 6) {
            this.f87625p0 = new DERIA5String(str);
            return;
        }
        if (i10 == 8) {
            x500Name = new ASN1ObjectIdentifier(str);
        } else {
            if (i10 != 4) {
                if (i10 != 7) {
                    throw new IllegalArgumentException(g0.c("can't process String for tag: ", i10));
                }
                int i11 = 0;
                if (IPAddress.isValidIPv6WithNetmask(str) || IPAddress.isValidIPv6(str)) {
                    int iIndexOf = str.indexOf(47);
                    if (iIndexOf < 0) {
                        bArr = new byte[16];
                        a(bArr, 0, c(str));
                    } else {
                        byte[] bArr2 = new byte[32];
                        a(bArr2, 0, c(str.substring(0, iIndexOf)));
                        String strSubstring = str.substring(iIndexOf + 1);
                        if (strSubstring.indexOf(58) > 0) {
                            iArrC = c(strSubstring);
                        } else {
                            int[] iArr = new int[8];
                            int i12 = Integer.parseInt(strSubstring);
                            while (i11 != i12) {
                                int i13 = i11 / 16;
                                iArr[i13] = iArr[i13] | (1 << (15 - (i11 % 16)));
                                i11++;
                            }
                            iArrC = iArr;
                        }
                        a(bArr2, 16, iArrC);
                        bArr = bArr2;
                    }
                } else if (IPAddress.isValidIPv4WithNetmask(str) || IPAddress.isValidIPv4(str)) {
                    int iIndexOf2 = str.indexOf(47);
                    if (iIndexOf2 < 0) {
                        bArr = new byte[4];
                        b(0, str, bArr);
                    } else {
                        byte[] bArr3 = new byte[8];
                        b(0, str.substring(0, iIndexOf2), bArr3);
                        String strSubstring2 = str.substring(iIndexOf2 + 1);
                        if (strSubstring2.indexOf(46) > 0) {
                            b(4, strSubstring2, bArr3);
                        } else {
                            int i14 = Integer.parseInt(strSubstring2);
                            while (i11 != i14) {
                                int i15 = (i11 / 8) + 4;
                                bArr3[i15] = (byte) (bArr3[i15] | (1 << (7 - (i11 % 8))));
                                i11++;
                            }
                        }
                        bArr = bArr3;
                    }
                } else {
                    bArr = null;
                }
                if (bArr == null) {
                    throw new IllegalArgumentException("IP Address is invalid");
                }
                this.f87625p0 = new DEROctetString(bArr);
                return;
            }
            x500Name = new X500Name(str);
        }
        this.f87625p0 = x500Name;
    }

    public static void a(byte[] bArr, int i10, int[] iArr) {
        for (int i11 = 0; i11 != iArr.length; i11++) {
            int i12 = i11 * 2;
            int i13 = iArr[i11];
            bArr[i12 + i10] = (byte) (i13 >> 8);
            bArr[i12 + 1 + i10] = (byte) i13;
        }
    }

    public static void b(int i10, String str, byte[] bArr) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, "./");
        int i11 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            bArr[i11 + i10] = (byte) Integer.parseInt(stringTokenizer.nextToken());
            i11++;
        }
    }

    public static int[] c(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER, true);
        int[] iArr = new int[8];
        if (str.charAt(0) == ':' && str.charAt(1) == ':') {
            stringTokenizer.nextToken();
        }
        int i10 = -1;
        int i11 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (strNextToken.equals(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER)) {
                iArr[i11] = 0;
                int i12 = i11;
                i11++;
                i10 = i12;
            } else if (strNextToken.indexOf(46) < 0) {
                int i13 = i11 + 1;
                iArr[i11] = Integer.parseInt(strNextToken, 16);
                if (stringTokenizer.hasMoreTokens()) {
                    stringTokenizer.nextToken();
                }
                i11 = i13;
            } else {
                StringTokenizer stringTokenizer2 = new StringTokenizer(strNextToken, Constant.DOT_STRING);
                int i14 = i11 + 1;
                iArr[i11] = (Integer.parseInt(stringTokenizer2.nextToken()) << 8) | Integer.parseInt(stringTokenizer2.nextToken());
                i11 += 2;
                iArr[i14] = Integer.parseInt(stringTokenizer2.nextToken()) | (Integer.parseInt(stringTokenizer2.nextToken()) << 8);
            }
        }
        if (i11 != 8) {
            int i15 = i11 - i10;
            int i16 = 8 - i15;
            System.arraycopy(iArr, i10, iArr, i16, i15);
            while (i10 != i16) {
                iArr[i10] = 0;
                i10++;
            }
        }
        return iArr;
    }

    public static GeneralName getInstance(Object obj) {
        if (obj == null || (obj instanceof GeneralName)) {
            return (GeneralName) obj;
        }
        if (!(obj instanceof ASN1TaggedObject)) {
            if (!(obj instanceof byte[])) {
                throw new IllegalArgumentException(a.c(obj, "unknown object in getInstance: "));
            }
            try {
                return getInstance(ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (IOException unused) {
                throw new IllegalArgumentException("unable to parse encoded general name");
            }
        }
        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) obj;
        int tagNo = aSN1TaggedObject.getTagNo();
        switch (tagNo) {
            case 0:
            case 3:
            case 5:
                return new GeneralName(tagNo, ASN1Sequence.getInstance(aSN1TaggedObject, false));
            case 1:
            case 2:
            case 6:
                return new GeneralName(tagNo, DERIA5String.getInstance(aSN1TaggedObject, false));
            case 4:
                return new GeneralName(tagNo, X500Name.getInstance(aSN1TaggedObject, true));
            case 7:
                return new GeneralName(tagNo, ASN1OctetString.getInstance(aSN1TaggedObject, false));
            case 8:
                return new GeneralName(tagNo, ASN1ObjectIdentifier.getInstance(aSN1TaggedObject, false));
            default:
                throw new IllegalArgumentException(g0.c("unknown tag: ", tagNo));
        }
    }

    public ASN1Encodable getName() {
        return this.f87625p0;
    }

    public int getTagNo() {
        return this.f87626q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        int i10 = this.f87626q0;
        return new DERTaggedObject(i10 == 4, i10, this.f87625p0);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    public String toString() {
        String string;
        StringBuffer stringBuffer = new StringBuffer();
        int i10 = this.f87626q0;
        stringBuffer.append(i10);
        stringBuffer.append(": ");
        ASN1Encodable aSN1Encodable = this.f87625p0;
        if (i10 == 1 || i10 == 2) {
            string = DERIA5String.getInstance(aSN1Encodable).getString();
        } else if (i10 == 4) {
            string = X500Name.getInstance(aSN1Encodable).toString();
        } else if (i10 != 6) {
            string = aSN1Encodable.toString();
        } else {
            string = DERIA5String.getInstance(aSN1Encodable).getString();
        }
        stringBuffer.append(string);
        return stringBuffer.toString();
    }

    public GeneralName(int i10, ASN1Encodable aSN1Encodable) {
        this.f87625p0 = aSN1Encodable;
        this.f87626q0 = i10;
    }

    public GeneralName(X500Name x500Name) {
        this.f87625p0 = x500Name;
        this.f87626q0 = 4;
    }

    public GeneralName(X509Name x509Name) {
        this.f87625p0 = X500Name.getInstance(x509Name);
        this.f87626q0 = 4;
    }

    public static GeneralName getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1TaggedObject.getInstance(aSN1TaggedObject, true));
    }
}
