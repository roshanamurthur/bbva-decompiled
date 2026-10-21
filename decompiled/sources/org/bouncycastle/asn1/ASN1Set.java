package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;
import okhttp3.HttpUrl;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Iterable;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ASN1Set extends ASN1Primitive implements Iterable<ASN1Encodable> {
    protected final ASN1Encodable[] elements;
    protected final boolean isSorted;

    public class a implements Enumeration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f86530a = 0;

        public a() {
        }

        @Override // java.util.Enumeration
        public final boolean hasMoreElements() {
            return this.f86530a < ASN1Set.this.elements.length;
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            int i10 = this.f86530a;
            ASN1Encodable[] aSN1EncodableArr = ASN1Set.this.elements;
            if (i10 >= aSN1EncodableArr.length) {
                throw new NoSuchElementException("ASN1Set Enumeration");
            }
            this.f86530a = i10 + 1;
            return aSN1EncodableArr[i10];
        }
    }

    public class b implements ASN1SetParser {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f86532p0 = 0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f86533q0;

        public b(int i10) {
            this.f86533q0 = i10;
        }

        @Override // org.bouncycastle.asn1.InMemoryRepresentable
        public final ASN1Primitive getLoadedObject() {
            return ASN1Set.this;
        }

        @Override // org.bouncycastle.asn1.ASN1SetParser
        public final ASN1Encodable readObject() throws IOException {
            int i10 = this.f86532p0;
            if (this.f86533q0 == i10) {
                return null;
            }
            ASN1Encodable[] aSN1EncodableArr = ASN1Set.this.elements;
            this.f86532p0 = i10 + 1;
            ASN1Encodable aSN1Encodable = aSN1EncodableArr[i10];
            if (aSN1Encodable instanceof ASN1Sequence) {
                return ((ASN1Sequence) aSN1Encodable).parser();
            }
            return aSN1Encodable instanceof ASN1Set ? ((ASN1Set) aSN1Encodable).parser() : aSN1Encodable;
        }

        @Override // org.bouncycastle.asn1.ASN1Encodable
        public final ASN1Primitive toASN1Primitive() {
            return ASN1Set.this;
        }
    }

    public ASN1Set() {
        this.elements = ASN1EncodableVector.f86503d;
        this.isSorted = true;
    }

    public static byte[] e(ASN1Encodable aSN1Encodable) {
        try {
            return aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER);
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    public static boolean f(byte[] bArr, byte[] bArr2) {
        int i10 = bArr[0] & (-33);
        int i11 = bArr2[0] & (-33);
        if (i10 != i11) {
            return i10 < i11;
        }
        int iMin = Math.min(bArr.length, bArr2.length) - 1;
        for (int i12 = 1; i12 < iMin; i12++) {
            byte b10 = bArr[i12];
            byte b11 = bArr2[i12];
            if (b10 != b11) {
                return (b10 & 255) < (b11 & 255);
            }
        }
        return (bArr[iMin] & 255) <= (bArr2[iMin] & 255);
    }

    public static void g(ASN1Encodable[] aSN1EncodableArr) {
        int i10;
        int length = aSN1EncodableArr.length;
        if (length < 2) {
            return;
        }
        ASN1Encodable aSN1Encodable = aSN1EncodableArr[0];
        ASN1Encodable aSN1Encodable2 = aSN1EncodableArr[1];
        byte[] bArrE = e(aSN1Encodable);
        byte[] bArrE2 = e(aSN1Encodable2);
        if (f(bArrE2, bArrE)) {
            aSN1Encodable2 = aSN1Encodable;
            aSN1Encodable = aSN1Encodable2;
            bArrE2 = bArrE;
            bArrE = bArrE2;
        }
        for (int i11 = 2; i11 < length; i11++) {
            ASN1Encodable aSN1Encodable3 = aSN1EncodableArr[i11];
            byte[] bArrE3 = e(aSN1Encodable3);
            if (f(bArrE2, bArrE3)) {
                aSN1EncodableArr[i11 - 2] = aSN1Encodable;
                aSN1Encodable = aSN1Encodable2;
                bArrE = bArrE2;
                aSN1Encodable2 = aSN1Encodable3;
                bArrE2 = bArrE3;
            } else if (f(bArrE, bArrE3)) {
                aSN1EncodableArr[i11 - 2] = aSN1Encodable;
                aSN1Encodable = aSN1Encodable3;
                bArrE = bArrE3;
            } else {
                int i12 = i11 - 1;
                while (true) {
                    i10 = i12 - 1;
                    if (i10 <= 0) {
                        break;
                    }
                    ASN1Encodable aSN1Encodable4 = aSN1EncodableArr[i12 - 2];
                    if (f(e(aSN1Encodable4), bArrE3)) {
                        break;
                    }
                    aSN1EncodableArr[i10] = aSN1Encodable4;
                    i12 = i10;
                }
                aSN1EncodableArr[i10] = aSN1Encodable3;
            }
        }
        aSN1EncodableArr[length - 2] = aSN1Encodable;
        aSN1EncodableArr[length - 1] = aSN1Encodable2;
    }

    public static ASN1Set getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1Set)) {
            return (ASN1Set) obj;
        }
        if (obj instanceof ASN1SetParser) {
            return getInstance(((ASN1SetParser) obj).toASN1Primitive());
        }
        if (obj instanceof byte[]) {
            try {
                return getInstance(ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (IOException e5) {
                throw new IllegalArgumentException(androidx.camera.core.impl.a.d(e5, new StringBuilder("failed to construct set from byte[]: ")));
            }
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1Set) {
                return (ASN1Set) aSN1Primitive;
            }
        }
        throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "unknown object in getInstance: "));
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1Set)) {
            return false;
        }
        ASN1Set aSN1Set = (ASN1Set) aSN1Primitive;
        int size = size();
        if (aSN1Set.size() != size) {
            return false;
        }
        DERSet dERSet = (DERSet) c();
        DERSet dERSet2 = (DERSet) aSN1Set.c();
        for (int i10 = 0; i10 < size; i10++) {
            ASN1Primitive aSN1Primitive2 = dERSet.elements[i10].toASN1Primitive();
            ASN1Primitive aSN1Primitive3 = dERSet2.elements[i10].toASN1Primitive();
            if (aSN1Primitive2 != aSN1Primitive3 && !aSN1Primitive2.asn1Equals(aSN1Primitive3)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive c() {
        ASN1Encodable[] aSN1EncodableArr;
        if (this.isSorted) {
            aSN1EncodableArr = this.elements;
        } else {
            aSN1EncodableArr = (ASN1Encodable[]) this.elements.clone();
            g(aSN1EncodableArr);
        }
        DERSet dERSet = new DERSet(true, aSN1EncodableArr);
        dERSet.f86577p0 = -1;
        return dERSet;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive d() {
        return new DLSet(this.isSorted, this.elements);
    }

    public ASN1Encodable getObjectAt(int i10) {
        return this.elements[i10];
    }

    public Enumeration getObjects() {
        return new a();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        int length = this.elements.length;
        int iHashCode = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return iHashCode;
            }
            iHashCode += this.elements[length].toASN1Primitive().hashCode();
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean isConstructed() {
        return true;
    }

    @Override // org.bouncycastle.util.Iterable, java.lang.Iterable
    public Iterator<ASN1Encodable> iterator() {
        return new Arrays.Iterator(toArray());
    }

    public ASN1SetParser parser() {
        return new b(size());
    }

    public int size() {
        return this.elements.length;
    }

    public ASN1Encodable[] toArray() {
        return ASN1EncodableVector.a(this.elements);
    }

    public String toString() {
        int size = size();
        if (size == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuffer stringBuffer = new StringBuffer(Constant.BRACKET_OPEN);
        int i10 = 0;
        while (true) {
            stringBuffer.append(this.elements[i10]);
            i10++;
            if (i10 >= size) {
                stringBuffer.append(AbstractJsonLexerKt.END_LIST);
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    public ASN1Set(ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        this.elements = new ASN1Encodable[]{aSN1Encodable};
        this.isSorted = true;
    }

    public ASN1Set(ASN1EncodableVector aSN1EncodableVector, boolean z10) {
        ASN1Encodable[] aSN1EncodableArrB;
        if (aSN1EncodableVector == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        if (!z10 || aSN1EncodableVector.size() < 2) {
            aSN1EncodableArrB = aSN1EncodableVector.b();
        } else {
            int i10 = aSN1EncodableVector.f86505b;
            if (i10 == 0) {
                aSN1EncodableArrB = ASN1EncodableVector.f86503d;
            } else {
                ASN1Encodable[] aSN1EncodableArr = new ASN1Encodable[i10];
                System.arraycopy(aSN1EncodableVector.f86504a, 0, aSN1EncodableArr, 0, i10);
                aSN1EncodableArrB = aSN1EncodableArr;
            }
            g(aSN1EncodableArrB);
        }
        this.elements = aSN1EncodableArrB;
        this.isSorted = z10 || aSN1EncodableArrB.length < 2;
    }

    public ASN1Set(boolean z10, ASN1Encodable[] aSN1EncodableArr) {
        this.elements = aSN1EncodableArr;
        this.isSorted = z10 || aSN1EncodableArr.length < 2;
    }

    public ASN1Set(ASN1Encodable[] aSN1EncodableArr, boolean z10) {
        if (Arrays.isNullOrContainsNull(aSN1EncodableArr)) {
            throw new NullPointerException("'elements' cannot be null, or contain null");
        }
        ASN1Encodable[] aSN1EncodableArrA = ASN1EncodableVector.a(aSN1EncodableArr);
        if (z10 && aSN1EncodableArrA.length >= 2) {
            g(aSN1EncodableArrA);
        }
        this.elements = aSN1EncodableArrA;
        this.isSorted = z10 || aSN1EncodableArrA.length < 2;
    }

    public static ASN1Set getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        if (z10) {
            if (aSN1TaggedObject.isExplicit()) {
                return getInstance(aSN1TaggedObject.getObject());
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        ASN1Primitive object = aSN1TaggedObject.getObject();
        if (aSN1TaggedObject.isExplicit()) {
            return aSN1TaggedObject instanceof BERTaggedObject ? new BERSet(object) : new DLSet(object);
        }
        if (object instanceof ASN1Set) {
            ASN1Set aSN1Set = (ASN1Set) object;
            return aSN1TaggedObject instanceof BERTaggedObject ? aSN1Set : (ASN1Set) aSN1Set.d();
        }
        if (!(object instanceof ASN1Sequence)) {
            throw new IllegalArgumentException("unknown object in getInstance: ".concat(aSN1TaggedObject.getClass().getName()));
        }
        ASN1Encodable[] aSN1EncodableArrE = ((ASN1Sequence) object).e();
        if (aSN1TaggedObject instanceof BERTaggedObject) {
            return new BERSet(false, aSN1EncodableArrE);
        }
        return new DLSet(false, aSN1EncodableArrE);
    }
}
