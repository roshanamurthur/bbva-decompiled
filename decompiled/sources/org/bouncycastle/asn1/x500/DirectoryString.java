package org.bouncycastle.asn1.x500;

import androidx.emoji2.text.flatbuffer.a;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBMPString;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.DERT61String;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.DERUniversalString;

/* JADX INFO: loaded from: classes12.dex */
public class DirectoryString extends ASN1Object implements ASN1Choice, ASN1String {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Primitive f87536p0;

    public DirectoryString(String str) {
        this.f87536p0 = new DERUTF8String(str);
    }

    public static DirectoryString getInstance(Object obj) {
        if (obj == null || (obj instanceof DirectoryString)) {
            return (DirectoryString) obj;
        }
        if (obj instanceof DERT61String) {
            DirectoryString directoryString = new DirectoryString();
            directoryString.f87536p0 = (DERT61String) obj;
            return directoryString;
        }
        if (obj instanceof DERPrintableString) {
            DirectoryString directoryString2 = new DirectoryString();
            directoryString2.f87536p0 = (DERPrintableString) obj;
            return directoryString2;
        }
        if (obj instanceof DERUniversalString) {
            DirectoryString directoryString3 = new DirectoryString();
            directoryString3.f87536p0 = (DERUniversalString) obj;
            return directoryString3;
        }
        if (obj instanceof DERUTF8String) {
            DirectoryString directoryString4 = new DirectoryString();
            directoryString4.f87536p0 = (DERUTF8String) obj;
            return directoryString4;
        }
        if (!(obj instanceof DERBMPString)) {
            throw new IllegalArgumentException(a.c(obj, "illegal object in getInstance: "));
        }
        DirectoryString directoryString5 = new DirectoryString();
        directoryString5.f87536p0 = (DERBMPString) obj;
        return directoryString5;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1String] */
    @Override // org.bouncycastle.asn1.ASN1String
    public String getString() {
        return this.f87536p0.getString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87536p0.toASN1Primitive();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1String] */
    public String toString() {
        return this.f87536p0.getString();
    }

    public static DirectoryString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        if (z10) {
            return getInstance(aSN1TaggedObject.getObject());
        }
        throw new IllegalArgumentException("choice item must be explicitly tagged");
    }
}
