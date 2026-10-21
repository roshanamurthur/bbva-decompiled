package org.bouncycastle.math.ec.tools;

import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.TreeSet;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECFieldElement;

/* JADX INFO: loaded from: classes13.dex */
public class F2mSqrtOptimizer {
    public static void a(X9ECParameters x9ECParameters) {
        ECFieldElement eCFieldElementFromBigInteger = x9ECParameters.getCurve().fromBigInteger(BigInteger.valueOf(2L));
        ECFieldElement eCFieldElementSqrt = eCFieldElementFromBigInteger.sqrt();
        System.out.println(eCFieldElementSqrt.toBigInteger().toString(16).toUpperCase());
        if (!eCFieldElementSqrt.square().equals(eCFieldElementFromBigInteger)) {
            throw new IllegalStateException("Optimized-sqrt sanity check failed");
        }
    }

    public static void main(String[] strArr) {
        Enumeration names = ECNamedCurveTable.getNames();
        ArrayList arrayList = new ArrayList();
        while (names.hasMoreElements()) {
            arrayList.add(names.nextElement());
        }
        TreeSet<String> treeSet = new TreeSet(arrayList);
        Enumeration names2 = CustomNamedCurves.getNames();
        ArrayList arrayList2 = new ArrayList();
        while (names2.hasMoreElements()) {
            arrayList2.add(names2.nextElement());
        }
        treeSet.addAll(arrayList2);
        for (String str : treeSet) {
            X9ECParameters byName = CustomNamedCurves.getByName(str);
            if (byName == null) {
                byName = ECNamedCurveTable.getByName(str);
            }
            if (byName != null && ECAlgorithms.isF2mCurve(byName.getCurve())) {
                System.out.print(str + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
                a(byName);
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
