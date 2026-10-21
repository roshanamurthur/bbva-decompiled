package af;

import com.google.android.play.core.splitinstall.internal.zzax;
import com.google.android.play.core.splitinstall.internal.zzbk;
import java.io.File;
import java.util.List;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters;
import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;
import org.bouncycastle.pqc.math.linearalgebra.GF2Vector;
import org.bouncycastle.pqc.math.linearalgebra.GF2mField;
import org.bouncycastle.pqc.math.linearalgebra.GoppaCode;
import org.bouncycastle.pqc.math.linearalgebra.Permutation;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements zzax {
    public static GF2Vector[] a(McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters, GF2Vector gF2Vector) {
        int k10 = mcElieceCCA2PrivateKeyParameters.getK();
        Permutation p4 = mcElieceCCA2PrivateKeyParameters.getP();
        GF2mField field = mcElieceCCA2PrivateKeyParameters.getField();
        PolynomialGF2mSmallM goppaPoly = mcElieceCCA2PrivateKeyParameters.getGoppaPoly();
        GF2Matrix h4 = mcElieceCCA2PrivateKeyParameters.getH();
        PolynomialGF2mSmallM[] qInv = mcElieceCCA2PrivateKeyParameters.getQInv();
        GF2Vector gF2Vector2 = (GF2Vector) gF2Vector.multiply(p4.computeInverse());
        GF2Vector gF2VectorSyndromeDecode = GoppaCode.syndromeDecode((GF2Vector) h4.rightMultiply(gF2Vector2), field, goppaPoly, qInv);
        GF2Vector gF2Vector3 = (GF2Vector) ((GF2Vector) gF2Vector2.add(gF2VectorSyndromeDecode)).multiply(p4);
        return new GF2Vector[]{gF2Vector3.extractRightVector(k10), (GF2Vector) gF2VectorSyndromeDecode.multiply(p4)};
    }

    public static byte[] b(Digest digest) {
        int digestSize = digest instanceof Xof ? digest.getDigestSize() * 2 : digest.getDigestSize();
        byte[] bArr = new byte[digestSize];
        if (digest instanceof Xof) {
            ((Xof) digest).doFinal(bArr, 0, digestSize);
        } else {
            digest.doFinal(bArr, 0);
        }
        return bArr;
    }

    public static BodyPartID[] c(ASN1Sequence aSN1Sequence) {
        BodyPartID[] bodyPartIDArr = new BodyPartID[aSN1Sequence.size()];
        for (int i10 = 0; i10 != aSN1Sequence.size(); i10++) {
            bodyPartIDArr[i10] = BodyPartID.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return bodyPartIDArr;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzax
    public Object[] zza(Object obj, List list, File file, List list2) {
        return (Object[]) zzbk.zze(obj, "makePathElements", Object[].class, List.class, list, File.class, null, List.class, list2);
    }
}
