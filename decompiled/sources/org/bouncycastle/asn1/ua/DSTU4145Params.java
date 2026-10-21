package org.bouncycastle.asn1.ua;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class DSTU4145Params extends ASN1Object {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final byte[] f87529s0 = {-87, -42, -21, 69, -15, 60, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, -126, -128, -60, -106, 123, 35, 31, 94, -83, -10, 88, -21, -92, Constants.CVR_B2b87_11_RFU, 55, 41, 29, 56, -39, 107, Constants.CVR_B2b8765_1111_APP_DISABLED, 37, -54, 78, 23, -8, -23, 114, 13, -58, MessageUtils.MESSAGE_21_NAK, -76, 58, 40, -105, Constants.STATE_ERROR, 11, -63, -34, -93, 100, 56, -75, 100, -22, 44, 23, -97, -48, MessageUtils.MESSAGE_18_DC2, 62, 109, -72, -6, -59, 121, 4};

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1ObjectIdentifier f87530p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final DSTU4145ECBinary f87531q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public byte[] f87532r0;

    public DSTU4145Params(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f87532r0 = f87529s0;
        this.f87530p0 = aSN1ObjectIdentifier;
    }

    public static byte[] getDefaultDKE() {
        return Arrays.clone(f87529s0);
    }

    public static DSTU4145Params getInstance(Object obj) {
        if (obj instanceof DSTU4145Params) {
            return (DSTU4145Params) obj;
        }
        if (obj == null) {
            throw new IllegalArgumentException("object parse error");
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        DSTU4145Params dSTU4145Params = aSN1Sequence.getObjectAt(0) instanceof ASN1ObjectIdentifier ? new DSTU4145Params(ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0))) : new DSTU4145Params(DSTU4145ECBinary.getInstance(aSN1Sequence.getObjectAt(0)));
        if (aSN1Sequence.size() == 2) {
            byte[] octets = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets();
            dSTU4145Params.f87532r0 = octets;
            if (octets.length != 64) {
                throw new IllegalArgumentException("object parse error");
            }
        }
        return dSTU4145Params;
    }

    public byte[] getDKE() {
        return Arrays.clone(this.f87532r0);
    }

    public DSTU4145ECBinary getECBinary() {
        return this.f87531q0;
    }

    public ASN1ObjectIdentifier getNamedCurve() {
        return this.f87530p0;
    }

    public boolean isNamedCurve() {
        return this.f87530p0 != null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        ASN1Encodable aSN1Encodable = this.f87530p0;
        if (aSN1Encodable == null) {
            aSN1Encodable = this.f87531q0;
        }
        aSN1EncodableVector.add(aSN1Encodable);
        if (!Arrays.areEqual(this.f87532r0, f87529s0)) {
            aSN1EncodableVector.add(new DEROctetString(this.f87532r0));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public DSTU4145Params(ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr) {
        this.f87532r0 = f87529s0;
        this.f87530p0 = aSN1ObjectIdentifier;
        this.f87532r0 = Arrays.clone(bArr);
    }

    public DSTU4145Params(DSTU4145ECBinary dSTU4145ECBinary) {
        this.f87532r0 = f87529s0;
        this.f87531q0 = dSTU4145ECBinary;
    }
}
