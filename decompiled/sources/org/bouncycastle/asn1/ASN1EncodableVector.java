package org.bouncycastle.asn1;

/* JADX INFO: loaded from: classes12.dex */
public class ASN1EncodableVector {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ASN1Encodable[] f86503d = new ASN1Encodable[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ASN1Encodable[] f86504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f86506c;

    public ASN1EncodableVector() {
        this(10);
    }

    public static ASN1Encodable[] a(ASN1Encodable[] aSN1EncodableArr) {
        return aSN1EncodableArr.length < 1 ? f86503d : (ASN1Encodable[]) aSN1EncodableArr.clone();
    }

    public void add(ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        ASN1Encodable[] aSN1EncodableArr = this.f86504a;
        int length = aSN1EncodableArr.length;
        int i10 = this.f86505b + 1;
        if (this.f86506c | (i10 > length)) {
            ASN1Encodable[] aSN1EncodableArr2 = new ASN1Encodable[Math.max(aSN1EncodableArr.length, (i10 >> 1) + i10)];
            System.arraycopy(this.f86504a, 0, aSN1EncodableArr2, 0, this.f86505b);
            this.f86504a = aSN1EncodableArr2;
            this.f86506c = false;
        }
        this.f86504a[this.f86505b] = aSN1Encodable;
        this.f86505b = i10;
    }

    public void addAll(ASN1EncodableVector aSN1EncodableVector) {
        if (aSN1EncodableVector == null) {
            throw new NullPointerException("'other' cannot be null");
        }
        int size = aSN1EncodableVector.size();
        if (size < 1) {
            return;
        }
        ASN1Encodable[] aSN1EncodableArr = this.f86504a;
        int length = aSN1EncodableArr.length;
        int i10 = this.f86505b + size;
        int i11 = 0;
        if ((i10 > length) | this.f86506c) {
            ASN1Encodable[] aSN1EncodableArr2 = new ASN1Encodable[Math.max(aSN1EncodableArr.length, (i10 >> 1) + i10)];
            System.arraycopy(this.f86504a, 0, aSN1EncodableArr2, 0, this.f86505b);
            this.f86504a = aSN1EncodableArr2;
            this.f86506c = false;
        }
        do {
            ASN1Encodable aSN1Encodable = aSN1EncodableVector.get(i11);
            if (aSN1Encodable == null) {
                throw new NullPointerException("'other' elements cannot be null");
            }
            this.f86504a[this.f86505b + i11] = aSN1Encodable;
            i11++;
        } while (i11 < size);
        this.f86505b = i10;
    }

    public final ASN1Encodable[] b() {
        int i10 = this.f86505b;
        if (i10 == 0) {
            return f86503d;
        }
        ASN1Encodable[] aSN1EncodableArr = this.f86504a;
        if (aSN1EncodableArr.length == i10) {
            this.f86506c = true;
            return aSN1EncodableArr;
        }
        ASN1Encodable[] aSN1EncodableArr2 = new ASN1Encodable[i10];
        System.arraycopy(aSN1EncodableArr, 0, aSN1EncodableArr2, 0, i10);
        return aSN1EncodableArr2;
    }

    public ASN1Encodable get(int i10) {
        if (i10 < this.f86505b) {
            return this.f86504a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10 + " >= " + this.f86505b);
    }

    public int size() {
        return this.f86505b;
    }

    public ASN1EncodableVector(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("'initialCapacity' must not be negative");
        }
        this.f86504a = i10 == 0 ? f86503d : new ASN1Encodable[i10];
        this.f86505b = 0;
        this.f86506c = false;
    }
}
