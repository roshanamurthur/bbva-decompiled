package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes12.dex */
public class ASN1StreamParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f86535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f86536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[][] f86537c;

    public ASN1StreamParser(InputStream inputStream) {
        this(inputStream, j.c(inputStream));
    }

    public final ASN1Encodable a(int i10) throws IOException {
        if (i10 == 4) {
            return new BEROctetStringParser(this);
        }
        if (i10 == 8) {
            return new DERExternalParser(this);
        }
        if (i10 == 16) {
            return new BERSequenceParser(this);
        }
        if (i10 == 17) {
            return new BERSetParser(this);
        }
        throw new ASN1Exception("unknown BER object encountered: 0x" + Integer.toHexString(i10));
    }

    public final ASN1TaggedObject b(int i10, boolean z10) throws IOException {
        InputStream inputStream = this.f86535a;
        if (!z10) {
            return new DLTaggedObject(false, i10, new DEROctetString(((e) inputStream).e()));
        }
        ASN1EncodableVector aSN1EncodableVectorC = c();
        if (inputStream instanceof f) {
            if (aSN1EncodableVectorC.size() == 1) {
                return new BERTaggedObject(true, i10, aSN1EncodableVectorC.get(0));
            }
            BERSequence bERSequence = a.f86590a;
            return new BERTaggedObject(false, i10, aSN1EncodableVectorC.size() < 1 ? a.f86590a : new BERSequence(aSN1EncodableVectorC));
        }
        if (aSN1EncodableVectorC.size() == 1) {
            return new DLTaggedObject(true, i10, aSN1EncodableVectorC.get(0));
        }
        DLSequence dLSequence = c.f86633a;
        return new DLTaggedObject(false, i10, aSN1EncodableVectorC.size() < 1 ? c.f86633a : new DLSequence(aSN1EncodableVectorC));
    }

    public final ASN1EncodableVector c() throws IOException {
        ASN1Encodable object = readObject();
        if (object == null) {
            return new ASN1EncodableVector(0);
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        do {
            aSN1EncodableVector.add(object instanceof InMemoryRepresentable ? ((InMemoryRepresentable) object).getLoadedObject() : object.toASN1Primitive());
            object = readObject();
        } while (object != null);
        return aSN1EncodableVector;
    }

    public ASN1Encodable readObject() throws IOException {
        InputStream inputStream = this.f86535a;
        int i10 = inputStream.read();
        if (i10 == -1) {
            return null;
        }
        if (inputStream instanceof f) {
            f fVar = (f) inputStream;
            fVar.f87263u0 = false;
            fVar.e();
        }
        int iD = ASN1InputStream.d(i10, inputStream);
        boolean z10 = (i10 & 32) != 0;
        boolean z11 = iD == 4 || iD == 16 || iD == 17 || iD == 8;
        int i11 = this.f86536b;
        int iC = ASN1InputStream.c(inputStream, i11, z11);
        if (iC < 0) {
            if (!z10) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            ASN1StreamParser aSN1StreamParser = new ASN1StreamParser(new f(inputStream, i11), i11);
            if ((i10 & 64) != 0) {
                return new BERApplicationSpecificParser(iD, aSN1StreamParser);
            }
            return (i10 & 128) != 0 ? new BERTaggedObjectParser(true, iD, aSN1StreamParser) : aSN1StreamParser.a(iD);
        }
        e eVar = new e(inputStream, iC, i11);
        if ((i10 & 64) != 0) {
            return new DLApplicationSpecific(z10, iD, eVar.e());
        }
        if ((i10 & 128) != 0) {
            return new BERTaggedObjectParser(z10, iD, new ASN1StreamParser(eVar));
        }
        if (!z10) {
            if (iD == 4) {
                return new DEROctetStringParser(eVar);
            }
            try {
                return ASN1InputStream.a(iD, eVar, this.f86537c);
            } catch (IllegalArgumentException e5) {
                throw new ASN1Exception("corrupted stream detected", e5);
            }
        }
        if (iD == 4) {
            return new BEROctetStringParser(new ASN1StreamParser(eVar));
        }
        if (iD == 8) {
            return new DERExternalParser(new ASN1StreamParser(eVar));
        }
        if (iD == 16) {
            return new DLSequenceParser(new ASN1StreamParser(eVar));
        }
        if (iD == 17) {
            return new DLSetParser(new ASN1StreamParser(eVar));
        }
        throw new IOException(androidx.camera.core.impl.utils.b.a("unknown tag ", iD, " encountered"));
    }

    public ASN1StreamParser(InputStream inputStream, int i10) {
        this.f86535a = inputStream;
        this.f86536b = i10;
        this.f86537c = new byte[11][];
    }

    public ASN1StreamParser(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }
}
