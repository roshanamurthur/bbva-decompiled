package bc.org.bouncycastle.math.ec.tools;

import bc.org.bouncycastle.asn1.x9.X9ECParameters;
import bc.org.bouncycastle.math.ec.ECAlgorithms;
import bc.org.bouncycastle.math.ec.ECFieldElement;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.n2;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.s0;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public class F2mSqrtOptimizer {
    public static void a(X9ECParameters x9ECParameters) {
        ECFieldElement eCFieldElementFromBigInteger = x9ECParameters.getCurve().fromBigInteger(BigInteger.valueOf(2L));
        if (!eCFieldElementFromBigInteger.sqrt().square().equals(eCFieldElementFromBigInteger)) {
            throw new IllegalStateException("Optimized-sqrt sanity check failed");
        }
    }

    public static void main(String[] strArr) {
        Enumeration enumerationA = n2.a();
        ArrayList arrayList = new ArrayList();
        while (enumerationA.hasMoreElements()) {
            arrayList.add(enumerationA.nextElement());
        }
        TreeSet<String> treeSet = new TreeSet(arrayList);
        Enumeration enumerationA2 = s0.a();
        ArrayList arrayList2 = new ArrayList();
        while (enumerationA2.hasMoreElements()) {
            arrayList2.add(enumerationA2.nextElement());
        }
        treeSet.addAll(arrayList2);
        for (String str : treeSet) {
            X9ECParameters x9ECParametersA = s0.a(str);
            if (x9ECParametersA == null) {
                x9ECParametersA = n2.a(str);
            }
            if (x9ECParametersA != null && ECAlgorithms.isF2mCurve(x9ECParametersA.getCurve())) {
                a(x9ECParametersA);
            }
        }
    }

    public static void printRootZ(X9ECParameters x9ECParameters) {
        if (!ECAlgorithms.isF2mCurve(x9ECParameters.getCurve())) {
            throw new IllegalArgumentException("Sqrt optimization only defined over characteristic-2 fields");
        }
        a(x9ECParameters);
    }
}
