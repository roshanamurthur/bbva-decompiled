package org.bouncycastle.asn1.x509;

import androidx.appcompat.widget.g0;
import androidx.camera.core.impl.utils.c;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.style.IETFUtils;
import org.bouncycastle.asn1.x500.style.RFC4519Style;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes12.dex */
public class PKIXNameConstraintValidator implements NameConstraintValidator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set f87661a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set f87662b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f87663c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f87664d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Set f87665e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashSet f87666f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public HashSet f87667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HashSet f87668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashSet f87669i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public HashSet f87670j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public HashSet f87671k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public HashSet f87672l;

    public static void a(String str, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(Strings.lineSeparator());
    }

    public static boolean b(Set set, Set set2) {
        if (set == set2) {
            return true;
        }
        if (set == null || set2 == null || set.size() != set2.size()) {
            return false;
        }
        for (Object obj : set) {
            for (Object obj2 : set2) {
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if (((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.areEqual((byte[]) obj, (byte[]) obj2) : obj.equals(obj2)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean c(String str, String str2) {
        String strSubstring = str.substring(str.indexOf(64) + 1);
        if (str2.indexOf(64) != -1) {
            if (str.equalsIgnoreCase(str2) || strSubstring.equalsIgnoreCase(str2.substring(1))) {
                return true;
            }
        } else if (str2.charAt(0) != '.') {
            if (strSubstring.equalsIgnoreCase(str2)) {
                return true;
            }
        } else if (j(strSubstring, str2)) {
            return true;
        }
        return false;
    }

    public static int d(Set set) {
        int iHashCode = 0;
        if (set == null) {
            return 0;
        }
        for (Object obj : set) {
            iHashCode = (obj instanceof byte[] ? Arrays.hashCode((byte[]) obj) : obj.hashCode()) + iHashCode;
        }
        return iHashCode;
    }

    public static boolean e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length != bArr2.length / 2) {
            return false;
        }
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, length, bArr3, 0, length);
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr4[i10] = (byte) (bArr2[i10] & bArr3[i10]);
            bArr5[i10] = (byte) (bArr[i10] & bArr3[i10]);
        }
        return Arrays.areEqual(bArr4, bArr5);
    }

    public static boolean f(String str, String str2) {
        String strSubstring = str.substring(str.indexOf(58) + 1);
        if (strSubstring.indexOf("//") != -1) {
            strSubstring = strSubstring.substring(strSubstring.indexOf("//") + 2);
        }
        if (strSubstring.lastIndexOf(58) != -1) {
            strSubstring = strSubstring.substring(0, strSubstring.lastIndexOf(58));
        }
        String strSubstring2 = strSubstring.substring(strSubstring.indexOf(58) + 1);
        String strSubstring3 = strSubstring2.substring(strSubstring2.indexOf(64) + 1);
        if (strSubstring3.indexOf(47) != -1) {
            strSubstring3 = strSubstring3.substring(0, strSubstring3.indexOf(47));
        }
        if (str2.startsWith(Constant.DOT_STRING)) {
            if (j(strSubstring3, str2)) {
                return true;
            }
        } else if (strSubstring3.equalsIgnoreCase(str2)) {
            return true;
        }
        return false;
    }

    public static String g(Set set) {
        StringBuilder sbD = c.d(Constant.BRACKET_OPEN);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            boolean z10 = true;
            if (sbD.length() > 1) {
                sbD.append(",");
            }
            byte[] bArr = (byte[]) it.next();
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < bArr.length / 2; i10++) {
                if (sb2.length() > 0) {
                    sb2.append(Constant.DOT_STRING);
                }
                sb2.append(Integer.toString(bArr[i10] & 255));
            }
            sb2.append("/");
            for (int length = bArr.length / 2; length < bArr.length; length++) {
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append(Constant.DOT_STRING);
                }
                sb2.append(Integer.toString(bArr[length] & 255));
            }
            sbD.append(sb2.toString());
        }
        sbD.append(Constant.BRACKET_CLOSE);
        return sbD.toString();
    }

    public static String h(Set set) {
        StringBuilder sbD = c.d(Constant.BRACKET_OPEN);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (sbD.length() > 1) {
                sbD.append(",");
            }
            OtherName otherName = OtherName.getInstance(it.next());
            sbD.append(otherName.getTypeID().getId());
            sbD.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
            try {
                sbD.append(Hex.toHexString(otherName.getValue().toASN1Primitive().getEncoded()));
            } catch (IOException e5) {
                sbD.append(e5.toString());
            }
        }
        sbD.append(Constant.BRACKET_CLOSE);
        return sbD.toString();
    }

    public static boolean i(ASN1Sequence aSN1Sequence, ASN1Sequence aSN1Sequence2) {
        if (aSN1Sequence2.size() < 1 || aSN1Sequence2.size() > aSN1Sequence.size()) {
            return false;
        }
        RDN rdn = RDN.getInstance(aSN1Sequence2.getObjectAt(0));
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= aSN1Sequence.size()) {
                i10 = i11;
                break;
            }
            if (IETFUtils.rDNAreEqual(rdn, RDN.getInstance(aSN1Sequence.getObjectAt(i10)))) {
                break;
            }
            i11 = i10;
            i10++;
        }
        if (aSN1Sequence2.size() > aSN1Sequence.size() - i10) {
            return false;
        }
        for (int i12 = 0; i12 < aSN1Sequence2.size(); i12++) {
            RDN rdn2 = RDN.getInstance(aSN1Sequence2.getObjectAt(i12));
            RDN rdn3 = RDN.getInstance(aSN1Sequence.getObjectAt(i10 + i12));
            if (rdn2.size() != rdn3.size() || !rdn2.getFirst().getType().equals((ASN1Primitive) rdn3.getFirst().getType())) {
                return false;
            }
            if (rdn2.size() == 1 && rdn2.getFirst().getType().equals((ASN1Primitive) RFC4519Style.serialNumber)) {
                if (!rdn3.getFirst().getValue().toString().startsWith(rdn2.getFirst().getValue().toString())) {
                    return false;
                }
            } else if (!IETFUtils.rDNAreEqual(rdn2, rdn3)) {
                return false;
            }
        }
        return true;
    }

    public static boolean j(String str, String str2) {
        if (str2.startsWith(Constant.DOT_STRING)) {
            str2 = str2.substring(1);
        }
        String[] strArrSplit = Strings.split(str2, '.');
        String[] strArrSplit2 = Strings.split(str, '.');
        if (strArrSplit2.length <= strArrSplit.length) {
            return false;
        }
        int length = strArrSplit2.length - strArrSplit.length;
        for (int i10 = -1; i10 < strArrSplit.length; i10++) {
            if (i10 == -1) {
                if (strArrSplit2[i10 + length].equals("")) {
                    return false;
                }
            } else if (!strArrSplit[i10].equalsIgnoreCase(strArrSplit2[i10 + length])) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.asn1.x509.NameConstraintValidator
    public void addExcludedSubtree(GeneralSubtree generalSubtree) {
        GeneralName base = generalSubtree.getBase();
        int tagNo = base.getTagNo();
        if (tagNo == 0) {
            HashSet hashSet = this.f87666f;
            OtherName otherName = OtherName.getInstance(base.getName());
            HashSet hashSet2 = hashSet != null ? new HashSet(hashSet) : new HashSet();
            hashSet2.add(otherName);
            this.f87666f = hashSet2;
            return;
        }
        if (tagNo == 1) {
            Set<String> set = this.f87663c;
            String string = DERIA5String.getInstance(base.getName()).getString();
            if (!set.isEmpty()) {
                HashSet hashSet3 = new HashSet();
                for (String str : set) {
                    if (str.indexOf(64) != -1) {
                        String strSubstring = str.substring(str.indexOf(64) + 1);
                        if (string.indexOf(64) == -1) {
                            if (!string.startsWith(Constant.DOT_STRING) ? !strSubstring.equalsIgnoreCase(string) : !j(strSubstring, string)) {
                            }
                            hashSet3.add(string);
                        } else if (str.equalsIgnoreCase(string)) {
                            hashSet3.add(str);
                        }
                        hashSet3.add(str);
                        hashSet3.add(string);
                    } else if (str.startsWith(Constant.DOT_STRING)) {
                        if (string.indexOf(64) != -1) {
                            if (j(string.substring(str.indexOf(64) + 1), str)) {
                                hashSet3.add(str);
                            } else {
                                hashSet3.add(str);
                                hashSet3.add(string);
                            }
                        } else if (string.startsWith(Constant.DOT_STRING)) {
                            if (!j(str, string) && !str.equalsIgnoreCase(string)) {
                                if (j(string, str)) {
                                    hashSet3.add(str);
                                } else {
                                    hashSet3.add(str);
                                }
                            }
                            hashSet3.add(string);
                        } else if (j(string, str)) {
                            hashSet3.add(str);
                        } else {
                            hashSet3.add(str);
                            hashSet3.add(string);
                        }
                    } else if (string.indexOf(64) == -1) {
                        if (string.startsWith(Constant.DOT_STRING)) {
                            if (!j(str, string)) {
                            }
                            hashSet3.add(string);
                        } else if (str.equalsIgnoreCase(string)) {
                            hashSet3.add(str);
                        }
                        hashSet3.add(str);
                        hashSet3.add(string);
                    } else if (string.substring(str.indexOf(64) + 1).equalsIgnoreCase(str)) {
                        hashSet3.add(str);
                    } else {
                        hashSet3.add(str);
                        hashSet3.add(string);
                    }
                }
                set = hashSet3;
            } else if (string != null) {
                set.add(string);
            }
            this.f87663c = set;
            return;
        }
        if (tagNo == 2) {
            Set<String> set2 = this.f87662b;
            String string2 = DERIA5String.getInstance(base.getName()).getString();
            if (!set2.isEmpty()) {
                HashSet hashSet4 = new HashSet();
                for (String str2 : set2) {
                    if (!j(str2, string2)) {
                        boolean zJ = j(string2, str2);
                        hashSet4.add(str2);
                        if (zJ) {
                        }
                    }
                    hashSet4.add(string2);
                }
                set2 = hashSet4;
            } else if (string2 != null) {
                set2.add(string2);
            }
            this.f87662b = set2;
            return;
        }
        if (tagNo == 4) {
            Set set3 = this.f87661a;
            ASN1Sequence aSN1Sequence = (ASN1Sequence) base.getName().toASN1Primitive();
            if (!set3.isEmpty()) {
                HashSet hashSet5 = new HashSet();
                Iterator it = set3.iterator();
                while (it.hasNext()) {
                    ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(it.next());
                    if (i(aSN1Sequence, aSN1Sequence2)) {
                        hashSet5.add(aSN1Sequence2);
                    } else {
                        if (!i(aSN1Sequence2, aSN1Sequence)) {
                            hashSet5.add(aSN1Sequence2);
                        }
                        hashSet5.add(aSN1Sequence);
                    }
                }
                set3 = hashSet5;
            } else if (aSN1Sequence != null) {
                set3.add(aSN1Sequence);
            }
            this.f87661a = set3;
            return;
        }
        if (tagNo != 6) {
            if (tagNo != 7) {
                throw new IllegalStateException("Unknown tag encountered: " + base.getTagNo());
            }
            Set<byte[]> set4 = this.f87665e;
            byte[] octets = ASN1OctetString.getInstance(base.getName()).getOctets();
            if (!set4.isEmpty()) {
                HashSet hashSet6 = new HashSet();
                for (byte[] bArr : set4) {
                    HashSet hashSet7 = new HashSet();
                    boolean zAreEqual = Arrays.areEqual(bArr, octets);
                    hashSet7.add(bArr);
                    if (!zAreEqual) {
                        hashSet7.add(octets);
                    }
                    hashSet6.addAll(hashSet7);
                }
                set4 = hashSet6;
            } else if (octets != null) {
                set4.add(octets);
            }
            this.f87665e = set4;
            return;
        }
        Set<String> set5 = this.f87664d;
        String string3 = DERIA5String.getInstance(base.getName()).getString();
        if (!set5.isEmpty()) {
            HashSet hashSet8 = new HashSet();
            for (String str3 : set5) {
                if (str3.indexOf(64) != -1) {
                    String strSubstring2 = str3.substring(str3.indexOf(64) + 1);
                    if (string3.indexOf(64) == -1) {
                        if (!string3.startsWith(Constant.DOT_STRING) ? !strSubstring2.equalsIgnoreCase(string3) : !j(strSubstring2, string3)) {
                        }
                        hashSet8.add(string3);
                    } else if (str3.equalsIgnoreCase(string3)) {
                        hashSet8.add(str3);
                    }
                    hashSet8.add(str3);
                    hashSet8.add(string3);
                } else if (str3.startsWith(Constant.DOT_STRING)) {
                    if (string3.indexOf(64) != -1) {
                        if (j(string3.substring(str3.indexOf(64) + 1), str3)) {
                            hashSet8.add(str3);
                        } else {
                            hashSet8.add(str3);
                            hashSet8.add(string3);
                        }
                    } else if (string3.startsWith(Constant.DOT_STRING)) {
                        if (!j(str3, string3) && !str3.equalsIgnoreCase(string3)) {
                            if (j(string3, str3)) {
                                hashSet8.add(str3);
                            } else {
                                hashSet8.add(str3);
                            }
                        }
                        hashSet8.add(string3);
                    } else if (j(string3, str3)) {
                        hashSet8.add(str3);
                    } else {
                        hashSet8.add(str3);
                        hashSet8.add(string3);
                    }
                } else if (string3.indexOf(64) == -1) {
                    if (string3.startsWith(Constant.DOT_STRING)) {
                        if (!j(str3, string3)) {
                        }
                        hashSet8.add(string3);
                    } else if (str3.equalsIgnoreCase(string3)) {
                        hashSet8.add(str3);
                    }
                    hashSet8.add(str3);
                    hashSet8.add(string3);
                } else if (string3.substring(str3.indexOf(64) + 1).equalsIgnoreCase(str3)) {
                    hashSet8.add(str3);
                } else {
                    hashSet8.add(str3);
                    hashSet8.add(string3);
                }
            }
            set5 = hashSet8;
        } else if (string3 != null) {
            set5.add(string3);
        }
        this.f87664d = set5;
    }

    @Override // org.bouncycastle.asn1.x509.NameConstraintValidator
    public void checkExcluded(GeneralName generalName) throws NameConstraintValidatorException {
        int tagNo = generalName.getTagNo();
        if (tagNo == 0) {
            HashSet hashSet = this.f87666f;
            OtherName otherName = OtherName.getInstance(generalName.getName());
            if (hashSet.isEmpty()) {
                return;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                if (OtherName.getInstance(it.next()).equals(otherName)) {
                    throw new NameConstraintValidatorException("OtherName is from an excluded subtree.");
                }
            }
            return;
        }
        if (tagNo == 1) {
            Set set = this.f87663c;
            String string = DERIA5String.getInstance(generalName.getName()).getString();
            if (set.isEmpty()) {
                return;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                if (c(string, (String) it2.next())) {
                    throw new NameConstraintValidatorException("Email address is from an excluded subtree.");
                }
            }
            return;
        }
        if (tagNo == 2) {
            Set<String> set2 = this.f87662b;
            String string2 = DERIA5String.getInstance(generalName.getName()).getString();
            if (set2.isEmpty()) {
                return;
            }
            for (String str : set2) {
                if (j(string2, str) || string2.equalsIgnoreCase(str)) {
                    throw new NameConstraintValidatorException("DNS is from an excluded subtree.");
                }
            }
            return;
        }
        if (tagNo == 4) {
            checkExcludedDN(X500Name.getInstance(generalName.getName()));
            return;
        }
        if (tagNo == 6) {
            Set set3 = this.f87664d;
            String string3 = DERIA5String.getInstance(generalName.getName()).getString();
            if (set3.isEmpty()) {
                return;
            }
            Iterator it3 = set3.iterator();
            while (it3.hasNext()) {
                if (f(string3, (String) it3.next())) {
                    throw new NameConstraintValidatorException("URI is from an excluded subtree.");
                }
            }
            return;
        }
        if (tagNo != 7) {
            return;
        }
        byte[] octets = ASN1OctetString.getInstance(generalName.getName()).getOctets();
        Set set4 = this.f87665e;
        if (set4.isEmpty()) {
            return;
        }
        Iterator it4 = set4.iterator();
        while (it4.hasNext()) {
            if (e(octets, (byte[]) it4.next())) {
                throw new NameConstraintValidatorException("IP is from an excluded subtree.");
            }
        }
    }

    public void checkExcludedDN(X500Name x500Name) throws NameConstraintValidatorException {
        Set set = this.f87661a;
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(x500Name);
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (i(aSN1Sequence, (ASN1Sequence) it.next())) {
                throw new NameConstraintValidatorException("Subject distinguished name is from an excluded subtree");
            }
        }
    }

    @Override // org.bouncycastle.asn1.x509.NameConstraintValidator
    public void checkPermitted(GeneralName generalName) throws NameConstraintValidatorException {
        int tagNo = generalName.getTagNo();
        if (tagNo == 0) {
            HashSet hashSet = this.f87672l;
            OtherName otherName = OtherName.getInstance(generalName.getName());
            if (hashSet == null) {
                return;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                if (OtherName.getInstance(it.next()).equals(otherName)) {
                    return;
                }
            }
            throw new NameConstraintValidatorException("Subject OtherName is not from a permitted subtree.");
        }
        if (tagNo == 1) {
            HashSet hashSet2 = this.f87669i;
            String string = DERIA5String.getInstance(generalName.getName()).getString();
            if (hashSet2 == null) {
                return;
            }
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                if (c(string, (String) it2.next())) {
                    return;
                }
            }
            if (string.length() != 0 || hashSet2.size() != 0) {
                throw new NameConstraintValidatorException("Subject email address is not from a permitted subtree.");
            }
            return;
        }
        if (tagNo == 2) {
            HashSet<String> hashSet3 = this.f87668h;
            String string2 = DERIA5String.getInstance(generalName.getName()).getString();
            if (hashSet3 == null) {
                return;
            }
            for (String str : hashSet3) {
                if (j(string2, str) || string2.equalsIgnoreCase(str)) {
                    return;
                }
            }
            if (string2.length() != 0 || hashSet3.size() != 0) {
                throw new NameConstraintValidatorException("DNS is not from a permitted subtree.");
            }
            return;
        }
        if (tagNo == 4) {
            checkPermittedDN(X500Name.getInstance(generalName.getName()));
            return;
        }
        if (tagNo == 6) {
            HashSet hashSet4 = this.f87670j;
            String string3 = DERIA5String.getInstance(generalName.getName()).getString();
            if (hashSet4 == null) {
                return;
            }
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                if (f(string3, (String) it3.next())) {
                    return;
                }
            }
            if (string3.length() != 0 || hashSet4.size() != 0) {
                throw new NameConstraintValidatorException("URI is not from a permitted subtree.");
            }
            return;
        }
        if (tagNo != 7) {
            return;
        }
        byte[] octets = ASN1OctetString.getInstance(generalName.getName()).getOctets();
        HashSet hashSet5 = this.f87671k;
        if (hashSet5 == null) {
            return;
        }
        Iterator it4 = hashSet5.iterator();
        while (it4.hasNext()) {
            if (e(octets, (byte[]) it4.next())) {
                return;
            }
        }
        if (octets.length != 0 || hashSet5.size() != 0) {
            throw new NameConstraintValidatorException("IP is not from a permitted subtree.");
        }
    }

    public void checkPermittedDN(X500Name x500Name) throws NameConstraintValidatorException {
        HashSet hashSet = this.f87667g;
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(x500Name.toASN1Primitive());
        if (hashSet == null) {
            return;
        }
        if (hashSet.isEmpty() && aSN1Sequence.size() == 0) {
            return;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (i(aSN1Sequence, (ASN1Sequence) it.next())) {
                return;
            }
        }
        throw new NameConstraintValidatorException("Subject distinguished name is not from a permitted subtree");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PKIXNameConstraintValidator)) {
            return false;
        }
        PKIXNameConstraintValidator pKIXNameConstraintValidator = (PKIXNameConstraintValidator) obj;
        if (!b(pKIXNameConstraintValidator.f87661a, this.f87661a)) {
            return false;
        }
        if (!b(pKIXNameConstraintValidator.f87662b, this.f87662b)) {
            return false;
        }
        if (!b(pKIXNameConstraintValidator.f87663c, this.f87663c)) {
            return false;
        }
        if (b(pKIXNameConstraintValidator.f87665e, this.f87665e)) {
            return b(pKIXNameConstraintValidator.f87664d, this.f87664d) && b(pKIXNameConstraintValidator.f87666f, this.f87666f) && b(pKIXNameConstraintValidator.f87667g, this.f87667g) && b(pKIXNameConstraintValidator.f87668h, this.f87668h) && b(pKIXNameConstraintValidator.f87669i, this.f87669i) && b(pKIXNameConstraintValidator.f87671k, this.f87671k) && b(pKIXNameConstraintValidator.f87670j, this.f87670j) && b(pKIXNameConstraintValidator.f87672l, this.f87672l);
        }
        return false;
    }

    public int hashCode() {
        return d(this.f87672l) + d(this.f87670j) + d(this.f87671k) + d(this.f87669i) + d(this.f87668h) + d(this.f87667g) + d(this.f87666f) + d(this.f87664d) + d(this.f87665e) + d(this.f87663c) + d(this.f87662b) + d(this.f87661a);
    }

    @Override // org.bouncycastle.asn1.x509.NameConstraintValidator
    public void intersectEmptyPermittedSubtree(int i10) {
        if (i10 == 0) {
            this.f87672l = new HashSet();
            return;
        }
        if (i10 == 1) {
            this.f87669i = new HashSet();
            return;
        }
        if (i10 == 2) {
            this.f87668h = new HashSet();
            return;
        }
        if (i10 == 4) {
            this.f87667g = new HashSet();
        } else if (i10 == 6) {
            this.f87670j = new HashSet();
        } else {
            if (i10 != 7) {
                throw new IllegalStateException(g0.c("Unknown tag encountered: ", i10));
            }
            this.f87671k = new HashSet();
        }
    }

    @Override // org.bouncycastle.asn1.x509.NameConstraintValidator
    public void intersectPermittedSubtree(GeneralSubtree generalSubtree) {
        intersectPermittedSubtree(new GeneralSubtree[]{generalSubtree});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        a("permitted:", sb2);
        if (this.f87667g != null) {
            a("DN:", sb2);
            a(this.f87667g.toString(), sb2);
        }
        if (this.f87668h != null) {
            a("DNS:", sb2);
            a(this.f87668h.toString(), sb2);
        }
        if (this.f87669i != null) {
            a("Email:", sb2);
            a(this.f87669i.toString(), sb2);
        }
        if (this.f87670j != null) {
            a("URI:", sb2);
            a(this.f87670j.toString(), sb2);
        }
        if (this.f87671k != null) {
            a("IP:", sb2);
            a(g(this.f87671k), sb2);
        }
        if (this.f87672l != null) {
            a("OtherName:", sb2);
            a(h(this.f87672l), sb2);
        }
        a("excluded:", sb2);
        if (!this.f87661a.isEmpty()) {
            a("DN:", sb2);
            a(this.f87661a.toString(), sb2);
        }
        if (!this.f87662b.isEmpty()) {
            a("DNS:", sb2);
            a(this.f87662b.toString(), sb2);
        }
        if (!this.f87663c.isEmpty()) {
            a("Email:", sb2);
            a(this.f87663c.toString(), sb2);
        }
        if (!this.f87664d.isEmpty()) {
            a("URI:", sb2);
            a(this.f87664d.toString(), sb2);
        }
        if (!this.f87665e.isEmpty()) {
            a("IP:", sb2);
            a(g(this.f87665e), sb2);
        }
        if (!this.f87666f.isEmpty()) {
            a("OtherName:", sb2);
            a(h(this.f87666f), sb2);
        }
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:219:0x0442  */
    /* JADX WARN: Code duplicated, block: B:220:0x0446  */
    /* JADX WARN: Code duplicated, block: B:59:0x0161  */
    /* JADX WARN: Code duplicated, block: B:73:0x018b A[LOOP:7: B:71:0x0188->B:73:0x018b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x019b A[LOOP:8: B:75:0x0199->B:76:0x019b, LOOP_END] */
    @Override // org.bouncycastle.asn1.x509.NameConstraintValidator
    public void intersectPermittedSubtree(GeneralSubtree[] generalSubtreeArr) {
        Iterator it;
        int i10;
        Iterator it2;
        Iterator it3;
        HashSet hashSet;
        char c10;
        Set setSingleton;
        int i11;
        int i12;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        int i13;
        byte[] bArr4;
        int i14;
        HashMap map = new HashMap();
        int i15 = 0;
        for (int i16 = 0; i16 != generalSubtreeArr.length; i16++) {
            GeneralSubtree generalSubtree = generalSubtreeArr[i16];
            Integer numValueOf = Integers.valueOf(generalSubtree.getBase().getTagNo());
            if (map.get(numValueOf) == null) {
                map.put(numValueOf, new HashSet());
            }
            ((Set) map.get(numValueOf)).add(generalSubtree);
        }
        Iterator it4 = map.entrySet().iterator();
        while (it4.hasNext()) {
            Map.Entry entry = (Map.Entry) it4.next();
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if (iIntValue == 0) {
                it = it4;
                i10 = i15;
                HashSet hashSet2 = this.f87672l;
                Set set = (Set) entry.getValue();
                HashSet hashSet3 = new HashSet();
                Iterator it5 = set.iterator();
                while (it5.hasNext()) {
                    OtherName otherName = OtherName.getInstance(((GeneralSubtree) it5.next()).getBase().getName());
                    if (hashSet2 != null) {
                        Iterator it6 = hashSet2.iterator();
                        while (it6.hasNext()) {
                            if (otherName.equals((String) it6.next())) {
                                hashSet3.add(otherName);
                            }
                        }
                    } else if (otherName != null) {
                        hashSet3.add(otherName);
                    }
                }
                this.f87672l = hashSet3;
            } else if (iIntValue != 1) {
                int i17 = 2;
                if (iIntValue != 2) {
                    char c11 = 4;
                    if (iIntValue == 4) {
                        it = it4;
                        i10 = i15;
                        HashSet<ASN1Sequence> hashSet4 = this.f87667g;
                        Set set2 = (Set) entry.getValue();
                        HashSet hashSet5 = new HashSet();
                        Iterator it7 = set2.iterator();
                        while (it7.hasNext()) {
                            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(((GeneralSubtree) it7.next()).getBase().getName().toASN1Primitive());
                            if (hashSet4 != null) {
                                for (ASN1Sequence aSN1Sequence2 : hashSet4) {
                                    if (i(aSN1Sequence, aSN1Sequence2)) {
                                        hashSet5.add(aSN1Sequence);
                                    } else if (i(aSN1Sequence2, aSN1Sequence)) {
                                        hashSet5.add(aSN1Sequence2);
                                    }
                                }
                            } else if (aSN1Sequence != null) {
                                hashSet5.add(aSN1Sequence);
                            }
                        }
                        this.f87667g = hashSet5;
                    } else if (iIntValue == 6) {
                        it = it4;
                        i10 = i15;
                        HashSet<String> hashSet6 = this.f87670j;
                        Set set3 = (Set) entry.getValue();
                        HashSet hashSet7 = new HashSet();
                        Iterator it8 = set3.iterator();
                        while (it8.hasNext()) {
                            String string = DERIA5String.getInstance(((GeneralSubtree) it8.next()).getBase().getName()).getString();
                            if (hashSet6 != null) {
                                for (String str : hashSet6) {
                                    if (str.indexOf(64) != -1) {
                                        String strSubstring = str.substring(str.indexOf(64) + 1);
                                        if (string.indexOf(64) != -1) {
                                            if (str.equalsIgnoreCase(string)) {
                                                hashSet7.add(str);
                                            }
                                        } else if (string.startsWith(Constant.DOT_STRING)) {
                                            if (j(strSubstring, string)) {
                                                hashSet7.add(str);
                                            }
                                        } else if (strSubstring.equalsIgnoreCase(string)) {
                                            hashSet7.add(str);
                                        }
                                    } else if (str.startsWith(Constant.DOT_STRING)) {
                                        if (string.indexOf(64) != -1) {
                                            if (j(string.substring(str.indexOf(64) + 1), str)) {
                                                hashSet7.add(string);
                                            }
                                        } else if (string.startsWith(Constant.DOT_STRING)) {
                                            if (j(str, string) || str.equalsIgnoreCase(string)) {
                                                hashSet7.add(str);
                                            } else if (j(string, str)) {
                                                hashSet7.add(string);
                                            }
                                        } else if (j(string, str)) {
                                            hashSet7.add(string);
                                        }
                                    } else if (string.indexOf(64) != -1) {
                                        if (string.substring(string.indexOf(64) + 1).equalsIgnoreCase(str)) {
                                            hashSet7.add(string);
                                        }
                                    } else if (string.startsWith(Constant.DOT_STRING)) {
                                        if (j(str, string)) {
                                            hashSet7.add(str);
                                        }
                                    } else if (str.equalsIgnoreCase(string)) {
                                        hashSet7.add(str);
                                    }
                                }
                            } else if (string != null) {
                                hashSet7.add(string);
                            }
                        }
                        this.f87670j = hashSet7;
                    } else {
                        if (iIntValue != 7) {
                            throw new IllegalStateException(g0.c("Unknown tag encountered: ", iIntValue));
                        }
                        HashSet<byte[]> hashSet8 = this.f87671k;
                        Set set4 = (Set) entry.getValue();
                        HashSet hashSet9 = new HashSet();
                        Iterator it9 = set4.iterator();
                        while (it9.hasNext()) {
                            byte[] octets = ASN1OctetString.getInstance(((GeneralSubtree) it9.next()).getBase().getName()).getOctets();
                            if (hashSet8 != null) {
                                for (byte[] bArr5 : hashSet8) {
                                    if (bArr5.length != octets.length) {
                                        setSingleton = Collections.EMPTY_SET;
                                        it2 = it4;
                                        it3 = it9;
                                        hashSet = hashSet8;
                                        c10 = c11;
                                        i12 = i15;
                                        i11 = i17;
                                    } else {
                                        int length = bArr5.length / i17;
                                        byte[] bArr6 = new byte[length];
                                        byte[] bArr7 = new byte[length];
                                        System.arraycopy(bArr5, i15, bArr6, i15, length);
                                        System.arraycopy(bArr5, length, bArr7, i15, length);
                                        byte[] bArr8 = new byte[length];
                                        byte[] bArr9 = new byte[length];
                                        System.arraycopy(octets, i15, bArr8, i15, length);
                                        System.arraycopy(octets, length, bArr9, i15, length);
                                        byte[] bArr10 = new byte[length];
                                        byte[] bArr11 = new byte[length];
                                        byte[] bArr12 = new byte[length];
                                        byte[] bArr13 = new byte[length];
                                        it2 = it4;
                                        int i18 = 0;
                                        while (i18 < length) {
                                            Iterator it10 = it9;
                                            bArr10[i18] = (byte) (bArr6[i18] & bArr7[i18]);
                                            byte b10 = bArr6[i18];
                                            HashSet hashSet10 = hashSet8;
                                            byte b11 = bArr7[i18];
                                            bArr11[i18] = (byte) ((b10 & b11) | (~b11));
                                            bArr12[i18] = (byte) (bArr8[i18] & bArr9[i18]);
                                            byte b12 = bArr8[i18];
                                            byte b13 = bArr9[i18];
                                            bArr13[i18] = (byte) ((b12 & b13) | (~b13));
                                            i18++;
                                            hashSet8 = hashSet10;
                                            it9 = it10;
                                        }
                                        it3 = it9;
                                        hashSet = hashSet8;
                                        c10 = 4;
                                        byte[][] bArr14 = {bArr10, bArr11, bArr12, bArr13};
                                        int i19 = 0;
                                        while (true) {
                                            if (i19 >= length) {
                                                bArr11 = bArr13;
                                                break;
                                            } else if ((bArr11[i19] & 65535) < (bArr13[i19] & 65535)) {
                                                break;
                                            } else {
                                                i19++;
                                            }
                                        }
                                        byte[] bArr15 = bArr14[0];
                                        byte[] bArr16 = bArr14[2];
                                        int i20 = 0;
                                        while (true) {
                                            if (i20 >= bArr15.length) {
                                                bArr15 = bArr16;
                                                break;
                                            } else if ((bArr15[i20] & 65535) > (bArr16[i20] & 65535)) {
                                                break;
                                            } else {
                                                i20++;
                                            }
                                        }
                                        if (Arrays.areEqual(bArr15, bArr11)) {
                                            bArr = bArr14[0];
                                            i11 = 2;
                                            bArr2 = bArr14[2];
                                            int length2 = bArr.length;
                                            bArr3 = new byte[length2];
                                            for (i13 = 0; i13 < bArr.length; i13++) {
                                                bArr3[i13] = (byte) (bArr[i13] | bArr2[i13]);
                                            }
                                            bArr4 = new byte[length];
                                            for (i14 = 0; i14 < length; i14++) {
                                                bArr4[i14] = (byte) (bArr7[i14] | bArr9[i14]);
                                            }
                                            byte[] bArr17 = new byte[length2 * 2];
                                            i12 = 0;
                                            System.arraycopy(bArr3, 0, bArr17, 0, length2);
                                            System.arraycopy(bArr4, 0, bArr17, length2, length2);
                                            setSingleton = Collections.singleton(bArr17);
                                        } else {
                                            for (int i21 = 0; i21 < bArr15.length; i21++) {
                                                if ((bArr15[i21] & 65535) > (bArr11[i21] & 65535)) {
                                                    bArr11 = bArr15;
                                                    break;
                                                }
                                            }
                                            if (Arrays.areEqual(bArr11, bArr15)) {
                                                setSingleton = Collections.EMPTY_SET;
                                                i11 = 2;
                                                i12 = 0;
                                            } else {
                                                bArr = bArr14[0];
                                                i11 = 2;
                                                bArr2 = bArr14[2];
                                                int length3 = bArr.length;
                                                bArr3 = new byte[length3];
                                                while (i13 < bArr.length) {
                                                    bArr3[i13] = (byte) (bArr[i13] | bArr2[i13]);
                                                }
                                                bArr4 = new byte[length];
                                                while (i14 < length) {
                                                    bArr4[i14] = (byte) (bArr7[i14] | bArr9[i14]);
                                                }
                                                byte[] bArr18 = new byte[length3 * 2];
                                                i12 = 0;
                                                System.arraycopy(bArr3, 0, bArr18, 0, length3);
                                                System.arraycopy(bArr4, 0, bArr18, length3, length3);
                                                setSingleton = Collections.singleton(bArr18);
                                            }
                                        }
                                    }
                                    hashSet9.addAll(setSingleton);
                                    i17 = i11;
                                    i15 = i12;
                                    hashSet8 = hashSet;
                                    it9 = it3;
                                    c11 = c10;
                                    it4 = it2;
                                }
                            } else if (octets != null) {
                                hashSet9.add(octets);
                            }
                            i17 = i17;
                            i15 = i15;
                            hashSet8 = hashSet8;
                            it9 = it9;
                            c11 = c11;
                            it4 = it4;
                        }
                        it = it4;
                        i10 = i15;
                        this.f87671k = hashSet9;
                    }
                } else {
                    it = it4;
                    i10 = i15;
                    HashSet<String> hashSet11 = this.f87668h;
                    Set set5 = (Set) entry.getValue();
                    HashSet hashSet12 = new HashSet();
                    Iterator it11 = set5.iterator();
                    while (it11.hasNext()) {
                        String string2 = DERIA5String.getInstance(((GeneralSubtree) it11.next()).getBase().getName()).getString();
                        if (hashSet11 != null) {
                            for (String str2 : hashSet11) {
                                if (j(str2, string2)) {
                                    hashSet12.add(str2);
                                } else if (j(string2, str2)) {
                                    hashSet12.add(string2);
                                }
                            }
                        } else if (string2 != null) {
                            hashSet12.add(string2);
                        }
                    }
                    this.f87668h = hashSet12;
                }
            } else {
                it = it4;
                i10 = i15;
                HashSet<String> hashSet13 = this.f87669i;
                Set set6 = (Set) entry.getValue();
                HashSet hashSet14 = new HashSet();
                Iterator it12 = set6.iterator();
                while (it12.hasNext()) {
                    String string3 = DERIA5String.getInstance(((GeneralSubtree) it12.next()).getBase().getName()).getString();
                    if (hashSet13 != null) {
                        for (String str3 : hashSet13) {
                            if (string3.indexOf(64) != -1) {
                                String strSubstring2 = string3.substring(string3.indexOf(64) + 1);
                                if (str3.indexOf(64) == -1 ? !(!str3.startsWith(Constant.DOT_STRING) ? !strSubstring2.equalsIgnoreCase(str3) : !j(strSubstring2, str3)) : string3.equalsIgnoreCase(str3)) {
                                    hashSet14.add(string3);
                                }
                            } else if (string3.startsWith(Constant.DOT_STRING)) {
                                if (str3.indexOf(64) != -1) {
                                    if (j(str3.substring(string3.indexOf(64) + 1), string3)) {
                                        hashSet14.add(str3);
                                    }
                                } else if (str3.startsWith(Constant.DOT_STRING)) {
                                    if (j(string3, str3) || string3.equalsIgnoreCase(str3)) {
                                        hashSet14.add(string3);
                                    } else if (j(str3, string3)) {
                                        hashSet14.add(str3);
                                    }
                                } else if (j(str3, string3)) {
                                    hashSet14.add(str3);
                                }
                            } else if (str3.indexOf(64) != -1) {
                                if (str3.substring(str3.indexOf(64) + 1).equalsIgnoreCase(string3)) {
                                    hashSet14.add(str3);
                                }
                            } else if (str3.startsWith(Constant.DOT_STRING)) {
                                if (j(string3, str3)) {
                                    hashSet14.add(string3);
                                }
                            } else if (string3.equalsIgnoreCase(str3)) {
                                hashSet14.add(string3);
                            }
                        }
                    } else if (string3 != null) {
                        hashSet14.add(string3);
                    }
                }
                this.f87669i = hashSet14;
            }
            i15 = i10;
            it4 = it;
        }
    }
}
