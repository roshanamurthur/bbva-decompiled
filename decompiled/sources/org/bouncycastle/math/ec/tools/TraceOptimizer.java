package org.bouncycastle.math.ec.tools;

import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.TreeSet;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes13.dex */
public class TraceOptimizer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BigInteger f90887a = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SecureRandom f90888b = new SecureRandom();

    public static int a(ECFieldElement eCFieldElement) {
        int fieldSize = eCFieldElement.getFieldSize();
        int iNumberOfLeadingZeros = 31 - Integers.numberOfLeadingZeros(fieldSize);
        ECFieldElement eCFieldElementAdd = eCFieldElement;
        int i10 = 1;
        while (iNumberOfLeadingZeros > 0) {
            eCFieldElementAdd = eCFieldElementAdd.squarePow(i10).add(eCFieldElementAdd);
            iNumberOfLeadingZeros--;
            i10 = fieldSize >>> iNumberOfLeadingZeros;
            if ((i10 & 1) != 0) {
                eCFieldElementAdd = eCFieldElementAdd.square().add(eCFieldElement);
            }
        }
        if (eCFieldElementAdd.isZero()) {
            return 0;
        }
        if (eCFieldElementAdd.isOne()) {
            return 1;
        }
        throw new IllegalStateException("Internal error in trace calculation");
    }

    public static void implPrintNonZeroTraceBits(X9ECParameters x9ECParameters) {
        PrintStream printStream;
        StringBuilder sb2;
        ECCurve curve = x9ECParameters.getCurve();
        int fieldSize = curve.getFieldSize();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < fieldSize; i10++) {
            if ((i10 & 1) != 0 || i10 == 0) {
                if (a(curve.fromBigInteger(f90887a.shiftLeft(i10))) != 0) {
                    arrayList.add(Integers.valueOf(i10));
                    printStream = System.out;
                    sb2 = new StringBuilder(" ");
                    sb2.append(i10);
                    printStream.print(sb2.toString());
                }
            } else if (arrayList.contains(Integers.valueOf(i10 >>> 1))) {
                arrayList.add(Integers.valueOf(i10));
                printStream = System.out;
                sb2 = new StringBuilder(" ");
                sb2.append(i10);
                printStream.print(sb2.toString());
            }
        }
        System.out.println();
        for (int i11 = 0; i11 < 1000; i11++) {
            BigInteger bigInteger = new BigInteger(fieldSize, f90888b);
            int iA = a(curve.fromBigInteger(bigInteger));
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                if (bigInteger.testBit(((Integer) arrayList.get(i13)).intValue())) {
                    i12 ^= 1;
                }
            }
            if (iA != i12) {
                throw new IllegalStateException("Optimized-trace sanity check failed");
            }
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
                implPrintNonZeroTraceBits(byName);
            }
        }
    }

    public static void printNonZeroTraceBits(X9ECParameters x9ECParameters) {
        if (!ECAlgorithms.isF2mCurve(x9ECParameters.getCurve())) {
            throw new IllegalArgumentException("Trace only defined over characteristic-2 fields");
        }
        implPrintNonZeroTraceBits(x9ECParameters);
    }
}
