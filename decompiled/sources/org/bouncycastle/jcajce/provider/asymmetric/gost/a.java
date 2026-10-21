package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.math.BigInteger;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.crypto.params.GOST3410Parameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Fingerprint;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static String a(BigInteger bigInteger, GOST3410Parameters gOST3410Parameters) {
        StringBuffer stringBuffer = new StringBuffer("GOST3410 Private Key [");
        String strLineSeparator = Strings.lineSeparator();
        BigInteger bigIntegerModPow = gOST3410Parameters.getA().modPow(bigInteger, gOST3410Parameters.getP());
        stringBuffer.append(new Fingerprint(Arrays.concatenate(bigIntegerModPow.toByteArray(), gOST3410Parameters.getP().toByteArray(), gOST3410Parameters.getA().toByteArray())).toString());
        stringBuffer.append(Constant.BRACKET_CLOSE);
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("                  Y: ");
        stringBuffer.append(bigIntegerModPow.toString(16));
        stringBuffer.append(strLineSeparator);
        return stringBuffer.toString();
    }

    public static String b(BigInteger bigInteger, GOST3410Parameters gOST3410Parameters) {
        StringBuffer stringBuffer = new StringBuffer("GOST3410 Public Key [");
        String strLineSeparator = Strings.lineSeparator();
        stringBuffer.append(new Fingerprint(Arrays.concatenate(bigInteger.toByteArray(), gOST3410Parameters.getP().toByteArray(), gOST3410Parameters.getA().toByteArray())).toString());
        stringBuffer.append(Constant.BRACKET_CLOSE);
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("                 Y: ");
        stringBuffer.append(bigInteger.toString(16));
        stringBuffer.append(strLineSeparator);
        return stringBuffer.toString();
    }
}
