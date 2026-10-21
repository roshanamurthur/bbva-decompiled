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
public abstract class ASN1Sequence extends ASN1Primitive implements Iterable<ASN1Encodable> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Encodable[] f86524p0;

    public class a implements Enumeration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f86525a = 0;

        public a() {
        }

        @Override // java.util.Enumeration
        public final boolean hasMoreElements() {
            return this.f86525a < ASN1Sequence.this.f86524p0.length;
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            int i10 = this.f86525a;
            ASN1Encodable[] aSN1EncodableArr = ASN1Sequence.this.f86524p0;
            if (i10 >= aSN1EncodableArr.length) {
                throw new NoSuchElementException("ASN1Sequence Enumeration");
            }
            this.f86525a = i10 + 1;
            return aSN1EncodableArr[i10];
        }
    }

    public class b implements ASN1SequenceParser {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f86527p0 = 0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f86528q0;

        public b(int i10) {
            this.f86528q0 = i10;
        }

        @Override // org.bouncycastle.asn1.InMemoryRepresentable
        public final ASN1Primitive getLoadedObject() {
            return ASN1Sequence.this;
        }

        @Override // org.bouncycastle.asn1.ASN1SequenceParser
        public final ASN1Encodable readObject() throws IOException {
            int i10 = this.f86527p0;
            if (this.f86528q0 == i10) {
                return null;
            }
            ASN1Encodable[] aSN1EncodableArr = ASN1Sequence.this.f86524p0;
            this.f86527p0 = i10 + 1;
            ASN1Encodable aSN1Encodable = aSN1EncodableArr[i10];
            if (aSN1Encodable instanceof ASN1Sequence) {
                return ((ASN1Sequence) aSN1Encodable).parser();
            }
            return aSN1Encodable instanceof ASN1Set ? ((ASN1Set) aSN1Encodable).parser() : aSN1Encodable;
        }

        @Override // org.bouncycastle.asn1.ASN1Encodable
        public final ASN1Primitive toASN1Primitive() {
            return ASN1Sequence.this;
        }
    }

    public ASN1Sequence() {
        this.f86524p0 = ASN1EncodableVector.f86503d;
    }

    public static ASN1Sequence getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1Sequence)) {
            return (ASN1Sequence) obj;
        }
        if (obj instanceof ASN1SequenceParser) {
            return getInstance(((ASN1SequenceParser) obj).toASN1Primitive());
        }
        if (obj instanceof byte[]) {
            try {
                return getInstance(ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (IOException e5) {
                throw new IllegalArgumentException(androidx.camera.core.impl.a.d(e5, new StringBuilder("failed to construct sequence from byte[]: ")));
            }
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1Sequence) {
                return (ASN1Sequence) aSN1Primitive;
            }
        }
        throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "unknown object in getInstance: "));
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1Sequence)) {
            return false;
        }
        ASN1Sequence aSN1Sequence = (ASN1Sequence) aSN1Primitive;
        int size = size();
        if (aSN1Sequence.size() != size) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            ASN1Primitive aSN1Primitive2 = this.f86524p0[i10].toASN1Primitive();
            ASN1Primitive aSN1Primitive3 = aSN1Sequence.f86524p0[i10].toASN1Primitive();
            if (aSN1Primitive2 != aSN1Primitive3 && !aSN1Primitive2.asn1Equals(aSN1Primitive3)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive c() {
        DERSequence dERSequence = new DERSequence(this.f86524p0, 0);
        dERSequence.f86574q0 = -1;
        return dERSequence;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive d() {
        DLSequence dLSequence = new DLSequence(this.f86524p0, 0);
        dLSequence.f86586q0 = -1;
        return dLSequence;
    }

    public ASN1Encodable[] e() {
        return this.f86524p0;
    }

    public ASN1Encodable getObjectAt(int i10) {
        return this.f86524p0[i10];
    }

    public Enumeration getObjects() {
        return new a();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        int length = this.f86524p0.length;
        int iHashCode = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return iHashCode;
            }
            iHashCode = (iHashCode * 257) ^ this.f86524p0[length].toASN1Primitive().hashCode();
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean isConstructed() {
        return true;
    }

    @Override // org.bouncycastle.util.Iterable, java.lang.Iterable
    public Iterator<ASN1Encodable> iterator() {
        return new Arrays.Iterator(this.f86524p0);
    }

    public ASN1SequenceParser parser() {
        return new b(size());
    }

    public int size() {
        return this.f86524p0.length;
    }

    public ASN1Encodable[] toArray() {
        return ASN1EncodableVector.a(this.f86524p0);
    }

    public String toString() {
        int size = size();
        if (size == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuffer stringBuffer = new StringBuffer(Constant.BRACKET_OPEN);
        int i10 = 0;
        while (true) {
            stringBuffer.append(this.f86524p0[i10]);
            i10++;
            if (i10 >= size) {
                stringBuffer.append(AbstractJsonLexerKt.END_LIST);
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    public ASN1Sequence(ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        this.f86524p0 = new ASN1Encodable[]{aSN1Encodable};
    }

    public ASN1Sequence(ASN1EncodableVector aSN1EncodableVector) {
        if (aSN1EncodableVector == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        this.f86524p0 = aSN1EncodableVector.b();
    }

    public ASN1Sequence(ASN1Encodable[] aSN1EncodableArr) {
        if (Arrays.isNullOrContainsNull(aSN1EncodableArr)) {
            throw new NullPointerException("'elements' cannot be null, or contain null");
        }
        this.f86524p0 = ASN1EncodableVector.a(aSN1EncodableArr);
    }

    public ASN1Sequence(ASN1Encodable[] aSN1EncodableArr, int i10) {
        this.f86524p0 = aSN1EncodableArr;
    }

    public static ASN1Sequence getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        if (z10) {
            if (aSN1TaggedObject.isExplicit()) {
                return getInstance(aSN1TaggedObject.getObject());
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        ASN1Primitive object = aSN1TaggedObject.getObject();
        if (aSN1TaggedObject.isExplicit()) {
            return aSN1TaggedObject instanceof BERTaggedObject ? new BERSequence(object) : new DLSequence(object);
        }
        if (!(object instanceof ASN1Sequence)) {
            throw new IllegalArgumentException("unknown object in getInstance: ".concat(aSN1TaggedObject.getClass().getName()));
        }
        ASN1Sequence aSN1Sequence = (ASN1Sequence) object;
        return aSN1TaggedObject instanceof BERTaggedObject ? aSN1Sequence : (ASN1Sequence) aSN1Sequence.d();
    }
}
