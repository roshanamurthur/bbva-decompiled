package org.bouncycastle.asn1.x509;

import androidx.camera.core.processing.f;
import com.google.firebase.ktx.BuildConfig;
import java.math.BigInteger;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes12.dex */
public class CRLReason extends ASN1Object {
    public static final int AA_COMPROMISE = 10;
    public static final int AFFILIATION_CHANGED = 3;
    public static final int CA_COMPROMISE = 2;
    public static final int CERTIFICATE_HOLD = 6;
    public static final int CESSATION_OF_OPERATION = 5;
    public static final int KEY_COMPROMISE = 1;
    public static final int PRIVILEGE_WITHDRAWN = 9;
    public static final int REMOVE_FROM_CRL = 8;
    public static final int SUPERSEDED = 4;
    public static final int UNSPECIFIED = 0;
    public static final int aACompromise = 10;
    public static final int affiliationChanged = 3;
    public static final int cACompromise = 2;
    public static final int certificateHold = 6;
    public static final int cessationOfOperation = 5;
    public static final int keyCompromise = 1;
    public static final int privilegeWithdrawn = 9;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final String[] f87589q0 = {BuildConfig.VERSION_NAME, "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final Hashtable f87590r0 = new Hashtable();
    public static final int removeFromCRL = 8;
    public static final int superseded = 4;
    public static final int unspecified = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Enumerated f87591p0;

    public static CRLReason getInstance(Object obj) {
        if (obj instanceof CRLReason) {
            return (CRLReason) obj;
        }
        if (obj != null) {
            return lookup(ASN1Enumerated.getInstance(obj).intValueExact());
        }
        return null;
    }

    public static CRLReason lookup(int i10) {
        Integer numValueOf = Integers.valueOf(i10);
        Hashtable hashtable = f87590r0;
        if (!hashtable.containsKey(numValueOf)) {
            CRLReason cRLReason = new CRLReason();
            cRLReason.f87591p0 = new ASN1Enumerated(i10);
            hashtable.put(numValueOf, cRLReason);
        }
        return (CRLReason) hashtable.get(numValueOf);
    }

    public BigInteger getValue() {
        return this.f87591p0.getValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87591p0;
    }

    public String toString() {
        int iIntValue = getValue().intValue();
        return f.d("CRLReason: ", (iIntValue < 0 || iIntValue > 10) ? "invalid" : f87589q0[iIntValue]);
    }
}
