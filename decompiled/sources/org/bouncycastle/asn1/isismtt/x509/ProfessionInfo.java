package org.bouncycastle.asn1.isismtt.x509;

import androidx.camera.core.impl.utils.b;
import androidx.databinding.c;
import androidx.emoji2.text.flatbuffer.a;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.DirectoryString;

/* JADX INFO: loaded from: classes12.dex */
public class ProfessionInfo extends ASN1Object {
    public static final ASN1ObjectIdentifier Notar;
    public static final ASN1ObjectIdentifier Notariatsverwalter;
    public static final ASN1ObjectIdentifier Notariatsverwalterin;
    public static final ASN1ObjectIdentifier Notarin;
    public static final ASN1ObjectIdentifier Notarvertreter;
    public static final ASN1ObjectIdentifier Notarvertreterin;
    public static final ASN1ObjectIdentifier Patentanwalt;
    public static final ASN1ObjectIdentifier Patentanwltin;
    public static final ASN1ObjectIdentifier Rechtsanwalt;
    public static final ASN1ObjectIdentifier Rechtsanwltin;
    public static final ASN1ObjectIdentifier Rechtsbeistand;
    public static final ASN1ObjectIdentifier Steuerberater;
    public static final ASN1ObjectIdentifier Steuerberaterin;
    public static final ASN1ObjectIdentifier Steuerbevollmchtigte;
    public static final ASN1ObjectIdentifier Steuerbevollmchtigter;
    public static final ASN1ObjectIdentifier VereidigteBuchprferin;
    public static final ASN1ObjectIdentifier VereidigterBuchprfer;
    public static final ASN1ObjectIdentifier Wirtschaftsprfer;
    public static final ASN1ObjectIdentifier Wirtschaftsprferin;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public NamingAuthority f87304p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Sequence f87305q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1Sequence f87306r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public String f87307s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ASN1OctetString f87308t0;

    static {
        StringBuilder sb2 = new StringBuilder();
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NamingAuthority.id_isismtt_at_namingAuthorities_RechtWirtschaftSteuern;
        sb2.append(aSN1ObjectIdentifier);
        sb2.append(".1");
        Rechtsanwltin = new ASN1ObjectIdentifier(sb2.toString());
        Rechtsanwalt = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + ".2");
        Rechtsbeistand = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + ".3");
        Steuerberaterin = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + ".4");
        Steuerberater = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + ".5");
        Steuerbevollmchtigte = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + ".6");
        Steuerbevollmchtigter = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + ".7");
        Notarin = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + ".8");
        Notar = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + ".9");
        Notarvertreterin = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + ".10");
        Notarvertreter = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + ".11");
        Notariatsverwalterin = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + ".12");
        Notariatsverwalter = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + ".13");
        Wirtschaftsprferin = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + ".14");
        Wirtschaftsprfer = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + ".15");
        VereidigteBuchprferin = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + ".16");
        VereidigterBuchprfer = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + ".17");
        Patentanwltin = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + ".18");
        Patentanwalt = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + ".19");
    }

    public ProfessionInfo(NamingAuthority namingAuthority, DirectoryString[] directoryStringArr, ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr, String str, ASN1OctetString aSN1OctetString) {
        this.f87304p0 = namingAuthority;
        this.f87305q0 = new DERSequence(directoryStringArr);
        if (aSN1ObjectIdentifierArr != null) {
            this.f87306r0 = new DERSequence(aSN1ObjectIdentifierArr);
        }
        this.f87307s0 = str;
        this.f87308t0 = aSN1OctetString;
    }

    public static ProfessionInfo getInstance(Object obj) {
        if (obj == null || (obj instanceof ProfessionInfo)) {
            return (ProfessionInfo) obj;
        }
        if (!(obj instanceof ASN1Sequence)) {
            throw new IllegalArgumentException(a.c(obj, "illegal object in getInstance: "));
        }
        ASN1Sequence aSN1Sequence = (ASN1Sequence) obj;
        ProfessionInfo professionInfo = new ProfessionInfo();
        if (aSN1Sequence.size() > 5) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        Enumeration objects = aSN1Sequence.getObjects();
        ASN1Encodable aSN1Encodable = (ASN1Encodable) objects.nextElement();
        if (aSN1Encodable instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Encodable;
            if (aSN1TaggedObject.getTagNo() != 0) {
                throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("Bad tag number: ")));
            }
            professionInfo.f87304p0 = NamingAuthority.getInstance(aSN1TaggedObject, true);
            aSN1Encodable = (ASN1Encodable) objects.nextElement();
        }
        professionInfo.f87305q0 = ASN1Sequence.getInstance(aSN1Encodable);
        if (objects.hasMoreElements()) {
            ASN1Encodable aSN1Encodable2 = (ASN1Encodable) objects.nextElement();
            if (aSN1Encodable2 instanceof ASN1Sequence) {
                professionInfo.f87306r0 = ASN1Sequence.getInstance(aSN1Encodable2);
            } else if (aSN1Encodable2 instanceof DERPrintableString) {
                professionInfo.f87307s0 = DERPrintableString.getInstance(aSN1Encodable2).getString();
            } else {
                if (!(aSN1Encodable2 instanceof ASN1OctetString)) {
                    throw new IllegalArgumentException("Bad object encountered: " + aSN1Encodable2.getClass());
                }
                professionInfo.f87308t0 = ASN1OctetString.getInstance(aSN1Encodable2);
            }
        }
        if (objects.hasMoreElements()) {
            ASN1Encodable aSN1Encodable3 = (ASN1Encodable) objects.nextElement();
            if (aSN1Encodable3 instanceof DERPrintableString) {
                professionInfo.f87307s0 = DERPrintableString.getInstance(aSN1Encodable3).getString();
            } else {
                if (!(aSN1Encodable3 instanceof DEROctetString)) {
                    throw new IllegalArgumentException("Bad object encountered: " + aSN1Encodable3.getClass());
                }
                professionInfo.f87308t0 = (DEROctetString) aSN1Encodable3;
            }
        }
        if (objects.hasMoreElements()) {
            ASN1Encodable aSN1Encodable4 = (ASN1Encodable) objects.nextElement();
            if (!(aSN1Encodable4 instanceof DEROctetString)) {
                throw new IllegalArgumentException("Bad object encountered: " + aSN1Encodable4.getClass());
            }
            professionInfo.f87308t0 = (DEROctetString) aSN1Encodable4;
        }
        return professionInfo;
    }

    public ASN1OctetString getAddProfessionInfo() {
        return this.f87308t0;
    }

    public NamingAuthority getNamingAuthority() {
        return this.f87304p0;
    }

    public DirectoryString[] getProfessionItems() {
        ASN1Sequence aSN1Sequence = this.f87305q0;
        DirectoryString[] directoryStringArr = new DirectoryString[aSN1Sequence.size()];
        Enumeration objects = aSN1Sequence.getObjects();
        int i10 = 0;
        while (objects.hasMoreElements()) {
            directoryStringArr[i10] = DirectoryString.getInstance(objects.nextElement());
            i10++;
        }
        return directoryStringArr;
    }

    public ASN1ObjectIdentifier[] getProfessionOIDs() {
        int i10 = 0;
        ASN1Sequence aSN1Sequence = this.f87306r0;
        if (aSN1Sequence == null) {
            return new ASN1ObjectIdentifier[0];
        }
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new ASN1ObjectIdentifier[aSN1Sequence.size()];
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            aSN1ObjectIdentifierArr[i10] = ASN1ObjectIdentifier.getInstance(objects.nextElement());
            i10++;
        }
        return aSN1ObjectIdentifierArr;
    }

    public String getRegistrationNumber() {
        return this.f87307s0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(5);
        NamingAuthority namingAuthority = this.f87304p0;
        if (namingAuthority != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, namingAuthority));
        }
        aSN1EncodableVector.add(this.f87305q0);
        ASN1Sequence aSN1Sequence = this.f87306r0;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        String str = this.f87307s0;
        if (str != null) {
            aSN1EncodableVector.add(new DERPrintableString(str, true));
        }
        ASN1OctetString aSN1OctetString = this.f87308t0;
        if (aSN1OctetString != null) {
            aSN1EncodableVector.add(aSN1OctetString);
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
