package org.bouncycastle.asn1;

import androidx.appcompat.widget.g0;
import androidx.camera.camera2.internal.n1;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes12.dex */
public class ASN1InputStream extends FilterInputStream implements BERTags {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f86511p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f86512q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[][] f86513r0;

    public ASN1InputStream(InputStream inputStream) {
        this(inputStream, j.c(inputStream));
    }

    public static ASN1Primitive a(int i10, e eVar, byte[][] bArr) throws IOException {
        if (i10 == 10) {
            return ASN1Enumerated.e(b(eVar, bArr));
        }
        if (i10 == 12) {
            return new DERUTF8String(eVar.e());
        }
        int i11 = 0;
        if (i10 == 30) {
            int i12 = eVar.f87157s0;
            if ((i12 & 1) != 0) {
                throw new IOException("malformed BMPString encoding encountered");
            }
            int i13 = i12 / 2;
            char[] cArr = new char[i13];
            byte[] bArr2 = new byte[8];
            int i14 = 0;
            while (i12 >= 8) {
                if (Streams.readFully(eVar, bArr2, 0, 8) != 8) {
                    throw new EOFException("EOF encountered in middle of BMPString");
                }
                cArr[i14] = (char) ((bArr2[0] << 8) | (bArr2[1] & 255));
                cArr[i14 + 1] = (char) ((bArr2[2] << 8) | (bArr2[3] & 255));
                cArr[i14 + 2] = (char) ((bArr2[4] << 8) | (bArr2[5] & 255));
                cArr[i14 + 3] = (char) ((bArr2[6] << 8) | (bArr2[7] & 255));
                i14 += 4;
                i12 -= 8;
            }
            if (i12 > 0) {
                if (Streams.readFully(eVar, bArr2, 0, i12) != i12) {
                    throw new EOFException("EOF encountered in middle of BMPString");
                }
                do {
                    int i15 = i11 + 1;
                    int i16 = bArr2[i11] << 8;
                    i11 += 2;
                    cArr[i14] = (char) ((bArr2[i15] & 255) | i16);
                    i14++;
                } while (i11 < i12);
            }
            if (eVar.f87157s0 == 0 && i13 == i14) {
                return new DERBMPString(cArr);
            }
            throw new IllegalStateException();
        }
        switch (i10) {
            case 1:
                return ASN1Boolean.e(b(eVar, bArr));
            case 2:
                return new ASN1Integer(eVar.e(), false);
            case 3:
                int i17 = eVar.f87157s0;
                if (i17 < 1) {
                    throw new IllegalArgumentException("truncated BIT STRING detected");
                }
                int i18 = eVar.read();
                int i19 = i17 - 1;
                byte[] bArr3 = new byte[i19];
                if (i19 != 0) {
                    if (Streams.readFully(eVar, bArr3) != i19) {
                        throw new EOFException("EOF encountered in middle of BIT STRING");
                    }
                    if (i18 > 0 && i18 < 8) {
                        byte b10 = bArr3[i17 - 2];
                        if (b10 != ((byte) ((255 << i18) & b10))) {
                            return new DLBitString(bArr3, i18);
                        }
                    }
                }
                return new DERBitString(bArr3, i18);
            case 4:
                return new DEROctetString(eVar.e());
            case 5:
                return DERNull.INSTANCE;
            case 6:
                byte[] bArrB = b(eVar, bArr);
                ConcurrentHashMap concurrentHashMap = ASN1ObjectIdentifier.f86516r0;
                ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) ASN1ObjectIdentifier.f86516r0.get(new ASN1ObjectIdentifier.a(bArrB));
                return aSN1ObjectIdentifier == null ? new ASN1ObjectIdentifier(bArrB) : aSN1ObjectIdentifier;
            default:
                switch (i10) {
                    case 18:
                        return new DERNumericString(eVar.e());
                    case 19:
                        return new DERPrintableString(eVar.e());
                    case 20:
                        return new DERT61String(eVar.e());
                    case 21:
                        return new DERVideotexString(eVar.e());
                    case 22:
                        return new DERIA5String(eVar.e());
                    case 23:
                        return new ASN1UTCTime(eVar.e());
                    case 24:
                        return new ASN1GeneralizedTime(eVar.e());
                    case 25:
                        return new DERGraphicString(eVar.e());
                    case 26:
                        return new DERVisibleString(eVar.e());
                    case 27:
                        return new DERGeneralString(eVar.e());
                    case 28:
                        return new DERUniversalString(eVar.e());
                    default:
                        throw new IOException(androidx.camera.core.impl.utils.b.a("unknown tag ", i10, " encountered"));
                }
        }
    }

    public static byte[] b(e eVar, byte[][] bArr) throws IOException {
        int i10 = eVar.f87157s0;
        if (i10 >= bArr.length) {
            return eVar.e();
        }
        byte[] bArr2 = bArr[i10];
        if (bArr2 == null) {
            bArr2 = new byte[i10];
            bArr[i10] = bArr2;
        }
        if (i10 != bArr2.length) {
            throw new IllegalArgumentException("buffer length not right for data");
        }
        if (i10 != 0) {
            int i11 = eVar.f87271q0;
            if (i10 >= i11) {
                throw new IOException("corrupted stream - out of bounds length found: " + eVar.f87157s0 + " >= " + i11);
            }
            int fully = i10 - Streams.readFully(eVar.f87270p0, bArr2);
            eVar.f87157s0 = fully;
            if (fully != 0) {
                throw new EOFException("DEF length " + eVar.f87156r0 + " object truncated by " + eVar.f87157s0);
            }
            eVar.b();
        }
        return bArr2;
    }

    public static int c(InputStream inputStream, int i10, boolean z10) throws IOException {
        int i11 = inputStream.read();
        if (i11 < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (i11 == 128) {
            return -1;
        }
        if (i11 <= 127) {
            return i11;
        }
        int i12 = i11 & 127;
        if (i12 > 4) {
            throw new IOException(g0.c("DER length more than 4 bytes: ", i12));
        }
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = inputStream.read();
            if (i15 < 0) {
                throw new EOFException("EOF found reading length");
            }
            i13 = (i13 << 8) + i15;
        }
        if (i13 < 0) {
            throw new IOException("corrupted stream - negative length found");
        }
        if (i13 < i10 || z10) {
            return i13;
        }
        throw new IOException(n1.e("corrupted stream - out of bounds length found: ", i13, " >= ", i10));
    }

    public static int d(int i10, InputStream inputStream) throws IOException {
        int i11 = i10 & 31;
        if (i11 != 31) {
            return i11;
        }
        int i12 = inputStream.read();
        if ((i12 & 127) == 0) {
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        int i13 = 0;
        while (i12 >= 0 && (i12 & 128) != 0) {
            i13 = ((i12 & 127) | i13) << 7;
            i12 = inputStream.read();
        }
        if (i12 >= 0) {
            return (i12 & 127) | i13;
        }
        throw new EOFException("EOF found inside tag value.");
    }

    public static ASN1EncodableVector e(e eVar) throws IOException {
        if (eVar.f87157s0 < 1) {
            return new ASN1EncodableVector(0);
        }
        ASN1InputStream aSN1InputStream = new ASN1InputStream(eVar);
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        while (true) {
            ASN1Primitive object = aSN1InputStream.readObject();
            if (object == null) {
                return aSN1EncodableVector;
            }
            aSN1EncodableVector.add(object);
        }
    }

    public ASN1Primitive buildObject(int i10, int i11, int i12) throws IOException {
        boolean z10 = (i10 & 32) != 0;
        e eVar = new e(this, i12, this.f86511p0);
        if ((i10 & 64) != 0) {
            return new DLApplicationSpecific(z10, i11, eVar.e());
        }
        if ((i10 & 128) != 0) {
            return new ASN1StreamParser(eVar).b(i11, z10);
        }
        if (!z10) {
            return a(i11, eVar, this.f86513r0);
        }
        if (i11 == 4) {
            ASN1EncodableVector aSN1EncodableVectorE = e(eVar);
            int size = aSN1EncodableVectorE.size();
            ASN1OctetString[] aSN1OctetStringArr = new ASN1OctetString[size];
            for (int i13 = 0; i13 != size; i13++) {
                ASN1Encodable aSN1Encodable = aSN1EncodableVectorE.get(i13);
                if (!(aSN1Encodable instanceof ASN1OctetString)) {
                    throw new ASN1Exception("unknown object encountered in constructed OCTET STRING: " + aSN1Encodable.getClass());
                }
                aSN1OctetStringArr[i13] = (ASN1OctetString) aSN1Encodable;
            }
            return new BEROctetString(aSN1OctetStringArr);
        }
        if (i11 == 8) {
            return new DLExternal(e(eVar));
        }
        if (i11 != 16) {
            if (i11 != 17) {
                throw new IOException(androidx.camera.core.impl.utils.b.a("unknown tag ", i11, " encountered"));
            }
            ASN1EncodableVector aSN1EncodableVectorE2 = e(eVar);
            DLSequence dLSequence = c.f86633a;
            return aSN1EncodableVectorE2.size() < 1 ? c.f86634b : new DLSet(aSN1EncodableVectorE2);
        }
        if (!this.f86512q0) {
            ASN1EncodableVector aSN1EncodableVectorE3 = e(eVar);
            DLSequence dLSequence2 = c.f86633a;
            return aSN1EncodableVectorE3.size() < 1 ? c.f86633a : new DLSequence(aSN1EncodableVectorE3);
        }
        byte[] bArrE = eVar.e();
        h hVar = new h();
        hVar.f87269q0 = bArrE;
        return hVar;
    }

    public void readFully(byte[] bArr) throws IOException {
        if (Streams.readFully(this, bArr) != bArr.length) {
            throw new EOFException("EOF encountered in middle of object");
        }
    }

    public int readLength() throws IOException {
        return c(this, this.f86511p0, false);
    }

    public ASN1Primitive readObject() throws IOException {
        int i10 = read();
        if (i10 <= 0) {
            if (i10 != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int iD = d(i10, this);
        boolean z10 = (i10 & 32) != 0;
        int length = readLength();
        if (length >= 0) {
            try {
                return buildObject(i10, iD, length);
            } catch (IllegalArgumentException e5) {
                throw new ASN1Exception("corrupted stream detected", e5);
            }
        }
        if (!z10) {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        int i11 = this.f86511p0;
        ASN1StreamParser aSN1StreamParser = new ASN1StreamParser(new f(this, i11), i11);
        if ((i10 & 64) != 0) {
            return new BERApplicationSpecificParser(iD, aSN1StreamParser).getLoadedObject();
        }
        if ((i10 & 128) != 0) {
            return new BERTaggedObjectParser(true, iD, aSN1StreamParser).getLoadedObject();
        }
        if (iD == 4) {
            return new BEROctetStringParser(aSN1StreamParser).getLoadedObject();
        }
        if (iD == 8) {
            return new DERExternalParser(aSN1StreamParser).getLoadedObject();
        }
        if (iD == 16) {
            return new BERSequenceParser(aSN1StreamParser).getLoadedObject();
        }
        if (iD == 17) {
            return new BERSetParser(aSN1StreamParser).getLoadedObject();
        }
        throw new IOException("unknown BER object encountered");
    }

    public ASN1InputStream(InputStream inputStream, int i10) {
        this(inputStream, i10, false);
    }

    public ASN1InputStream(InputStream inputStream, int i10, boolean z10) {
        super(inputStream);
        this.f86511p0 = i10;
        this.f86512q0 = z10;
        this.f86513r0 = new byte[11][];
    }

    public ASN1InputStream(InputStream inputStream, boolean z10) {
        this(inputStream, j.c(inputStream), z10);
    }

    public ASN1InputStream(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public ASN1InputStream(byte[] bArr, boolean z10) {
        this(new ByteArrayInputStream(bArr), bArr.length, z10);
    }
}
