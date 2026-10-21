package org.bouncycastle.asn1.bc;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class ObjectStore extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Encodable f86615p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ObjectStoreIntegrityCheck f86616q0;

    public ObjectStore(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException("malformed sequence");
        }
        ASN1Encodable objectAt = aSN1Sequence.getObjectAt(0);
        if (!(objectAt instanceof EncryptedObjectStoreData) && !(objectAt instanceof ObjectStoreData)) {
            ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(objectAt);
            objectAt = aSN1Sequence2.size() == 2 ? EncryptedObjectStoreData.getInstance(aSN1Sequence2) : ObjectStoreData.getInstance(aSN1Sequence2);
        }
        this.f86615p0 = objectAt;
        this.f86616q0 = ObjectStoreIntegrityCheck.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static ObjectStore getInstance(Object obj) {
        if (obj instanceof ObjectStore) {
            return (ObjectStore) obj;
        }
        if (obj != null) {
            return new ObjectStore(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ObjectStoreIntegrityCheck getIntegrityCheck() {
        return this.f86616q0;
    }

    public ASN1Encodable getStoreData() {
        return this.f86615p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f86615p0);
        aSN1EncodableVector.add(this.f86616q0);
        return new DERSequence(aSN1EncodableVector);
    }

    public ObjectStore(EncryptedObjectStoreData encryptedObjectStoreData, ObjectStoreIntegrityCheck objectStoreIntegrityCheck) {
        this.f86615p0 = encryptedObjectStoreData;
        this.f86616q0 = objectStoreIntegrityCheck;
    }

    public ObjectStore(ObjectStoreData objectStoreData, ObjectStoreIntegrityCheck objectStoreIntegrityCheck) {
        this.f86615p0 = objectStoreData;
        this.f86616q0 = objectStoreIntegrityCheck;
    }
}
