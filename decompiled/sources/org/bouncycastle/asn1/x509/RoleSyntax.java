package org.bouncycastle.asn1.x509;

import androidx.databinding.c;
import com.bbva.glomoconfig.constants.CountryRouteConstants;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class RoleSyntax extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public GeneralNames f87684p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public GeneralName f87685q0;

    public RoleSyntax(String str) {
        this(new GeneralName(6, str == null ? "" : str));
    }

    public static RoleSyntax getInstance(Object obj) {
        if (obj instanceof RoleSyntax) {
            return (RoleSyntax) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        RoleSyntax roleSyntax = new RoleSyntax();
        if (aSN1Sequence.size() < 1 || aSN1Sequence.size() > 2) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        for (int i10 = 0; i10 != aSN1Sequence.size(); i10++) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(i10));
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                roleSyntax.f87684p0 = GeneralNames.getInstance(aSN1TaggedObject, false);
            } else {
                if (tagNo != 1) {
                    throw new IllegalArgumentException("Unknown tag in RoleSyntax");
                }
                roleSyntax.f87685q0 = GeneralName.getInstance(aSN1TaggedObject, true);
            }
        }
        return roleSyntax;
    }

    public GeneralNames getRoleAuthority() {
        return this.f87684p0;
    }

    public String[] getRoleAuthorityAsString() {
        GeneralNames generalNames = this.f87684p0;
        if (generalNames == null) {
            return new String[0];
        }
        GeneralName[] names = generalNames.getNames();
        String[] strArr = new String[names.length];
        for (int i10 = 0; i10 < names.length; i10++) {
            ASN1Encodable name = names[i10].getName();
            if (name instanceof ASN1String) {
                strArr[i10] = ((ASN1String) name).getString();
            } else {
                strArr[i10] = name.toString();
            }
        }
        return strArr;
    }

    public GeneralName getRoleName() {
        return this.f87685q0;
    }

    public String getRoleNameAsString() {
        return ((ASN1String) this.f87685q0.getName()).getString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        GeneralNames generalNames = this.f87684p0;
        if (generalNames != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, generalNames));
        }
        aSN1EncodableVector.add(new DERTaggedObject(true, 1, this.f87685q0));
        return new DERSequence(aSN1EncodableVector);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Name: " + getRoleNameAsString() + " - Auth: ");
        GeneralNames generalNames = this.f87684p0;
        if (generalNames == null || generalNames.getNames().length == 0) {
            stringBuffer.append(CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN);
        } else {
            String[] roleAuthorityAsString = getRoleAuthorityAsString();
            stringBuffer.append(AbstractJsonLexerKt.BEGIN_LIST);
            stringBuffer.append(roleAuthorityAsString[0]);
            for (int i10 = 1; i10 < roleAuthorityAsString.length; i10++) {
                stringBuffer.append(", ");
                stringBuffer.append(roleAuthorityAsString[i10]);
            }
            stringBuffer.append(AbstractJsonLexerKt.END_LIST);
        }
        return stringBuffer.toString();
    }

    public RoleSyntax(GeneralName generalName) {
        this(null, generalName);
    }

    public RoleSyntax(GeneralNames generalNames, GeneralName generalName) {
        if (generalName == null || generalName.getTagNo() != 6 || ((ASN1String) generalName.getName()).getString().equals("")) {
            throw new IllegalArgumentException("the role name MUST be non empty and MUST use the URI option of GeneralName");
        }
        this.f87684p0 = generalNames;
        this.f87685q0 = generalName;
    }
}
