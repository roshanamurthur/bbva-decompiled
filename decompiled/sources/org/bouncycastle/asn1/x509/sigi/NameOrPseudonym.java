package org.bouncycastle.asn1.x509.sigi;

import androidx.databinding.c;
import androidx.emoji2.text.flatbuffer.a;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.DirectoryString;

/* JADX INFO: loaded from: classes12.dex */
public class NameOrPseudonym extends ASN1Object implements ASN1Choice {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final DirectoryString f87799p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public DirectoryString f87800q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1Sequence f87801r0;

    public NameOrPseudonym(String str) {
        this(new DirectoryString(str));
    }

    public static NameOrPseudonym getInstance(Object obj) {
        if (obj == null || (obj instanceof NameOrPseudonym)) {
            return (NameOrPseudonym) obj;
        }
        if (obj instanceof ASN1String) {
            return new NameOrPseudonym(DirectoryString.getInstance(obj));
        }
        if (!(obj instanceof ASN1Sequence)) {
            throw new IllegalArgumentException(a.c(obj, "illegal object in getInstance: "));
        }
        ASN1Sequence aSN1Sequence = (ASN1Sequence) obj;
        NameOrPseudonym nameOrPseudonym = new NameOrPseudonym();
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1String) {
            nameOrPseudonym.f87800q0 = DirectoryString.getInstance(aSN1Sequence.getObjectAt(0));
            nameOrPseudonym.f87801r0 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
            return nameOrPseudonym;
        }
        throw new IllegalArgumentException("Bad object encountered: " + aSN1Sequence.getObjectAt(0).getClass());
    }

    public DirectoryString[] getGivenName() {
        ASN1Sequence aSN1Sequence = this.f87801r0;
        DirectoryString[] directoryStringArr = new DirectoryString[aSN1Sequence.size()];
        Enumeration objects = aSN1Sequence.getObjects();
        int i10 = 0;
        while (objects.hasMoreElements()) {
            directoryStringArr[i10] = DirectoryString.getInstance(objects.nextElement());
            i10++;
        }
        return directoryStringArr;
    }

    public DirectoryString getPseudonym() {
        return this.f87799p0;
    }

    public DirectoryString getSurname() {
        return this.f87800q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        DirectoryString directoryString = this.f87799p0;
        if (directoryString != null) {
            return directoryString.toASN1Primitive();
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87800q0);
        aSN1EncodableVector.add(this.f87801r0);
        return new DERSequence(aSN1EncodableVector);
    }

    public NameOrPseudonym(DirectoryString directoryString) {
        this.f87799p0 = directoryString;
    }

    public NameOrPseudonym(DirectoryString directoryString, ASN1Sequence aSN1Sequence) {
        this.f87800q0 = directoryString;
        this.f87801r0 = aSN1Sequence;
    }
}
