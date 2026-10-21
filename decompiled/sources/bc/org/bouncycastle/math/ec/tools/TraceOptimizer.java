package bc.org.bouncycastle.math.ec.tools;

import bc.org.bouncycastle.asn1.x9.X9ECParameters;
import bc.org.bouncycastle.math.ec.ECAlgorithms;
import bc.org.bouncycastle.math.ec.ECCurve;
import bc.org.bouncycastle.math.ec.ECFieldElement;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.i3;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.n2;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.s0;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public class TraceOptimizer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BigInteger f25188a = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SecureRandom f25189b = new SecureRandom();

    public static int a(ECFieldElement eCFieldElement) {
        int fieldSize = eCFieldElement.getFieldSize();
        ECFieldElement eCFieldElementSquare = eCFieldElement;
        for (int i10 = 1; i10 < fieldSize; i10++) {
            eCFieldElementSquare = eCFieldElementSquare.square();
            eCFieldElement = eCFieldElement.add(eCFieldElementSquare);
        }
        BigInteger bigInteger = eCFieldElement.toBigInteger();
        if (bigInteger.bitLength() <= 1) {
            return bigInteger.intValue();
        }
        throw new IllegalStateException();
    }

    public static void implPrintNonZeroTraceBits(X9ECParameters x9ECParameters) {
        ECCurve curve = x9ECParameters.getCurve();
        int fieldSize = curve.getFieldSize();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < fieldSize; i10++) {
            if (a(curve.fromBigInteger(f25188a.shiftLeft(i10))) != 0) {
                arrayList.add(i3.a(i10));
            }
        }
        for (int i11 = 0; i11 < 1000; i11++) {
            BigInteger bigInteger = new BigInteger(fieldSize, f25189b);
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
                implPrintNonZeroTraceBits(x9ECParametersA);
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
