package bc.org.bouncycastle.asn1.x9;

import bc.org.bouncycastle.math.ec.ECAlgorithms;
import bc.org.bouncycastle.math.ec.ECCurve;
import bc.org.bouncycastle.math.ec.ECPoint;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.g;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.h;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.i1;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.m;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.n4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.o;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.q;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.s5;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.u;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.u5;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.v;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.w5;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.y5;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class X9ECParameters extends o implements y5 {
    public static final BigInteger K0 = BigInteger.valueOf(1);
    public final w5 E0;
    public ECCurve F0;
    public u5 G0;
    public BigInteger H0;
    public BigInteger I0;
    public byte[] J0;

    public X9ECParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger) {
        this(eCCurve, eCPoint, bigInteger, (BigInteger) null, (byte[]) null);
    }

    public static X9ECParameters getInstance(Object obj) {
        if (obj instanceof X9ECParameters) {
            return (X9ECParameters) obj;
        }
        if (obj == null) {
            return null;
        }
        v vVarA = v.a(obj);
        X9ECParameters x9ECParameters = new X9ECParameters();
        if (!(vVarA.a(0) instanceof m) || !((m) vVarA.a(0)).h().equals(K0)) {
            throw new IllegalArgumentException("bad version in X9ECParameters");
        }
        s5 s5Var = new s5(w5.a(vVarA.a(1)), v.a(vVarA.a(2)));
        ECCurve curve = s5Var.getCurve();
        x9ECParameters.F0 = curve;
        g gVarA = vVarA.a(3);
        if (gVarA instanceof u5) {
            x9ECParameters.G0 = (u5) gVarA;
        } else {
            x9ECParameters.G0 = new u5(curve, (q) gVarA);
        }
        x9ECParameters.H0 = ((m) vVarA.a(4)).h();
        x9ECParameters.J0 = s5Var.getSeed();
        if (vVarA.h() == 6) {
            x9ECParameters.I0 = ((m) vVarA.a(5)).h();
        }
        return x9ECParameters;
    }

    public u5 getBaseEntry() {
        return this.G0;
    }

    public ECCurve getCurve() {
        return this.F0;
    }

    public s5 getCurveEntry() {
        return new s5(this.F0, this.J0);
    }

    public w5 getFieldIDEntry() {
        return this.E0;
    }

    public ECPoint getG() {
        return this.G0.c();
    }

    public BigInteger getH() {
        return this.I0;
    }

    public BigInteger getN() {
        return this.H0;
    }

    public byte[] getSeed() {
        return this.J0;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.o, com.vasco.digipass.sdk.utils.utilities.obfuscated.g
    public u toASN1Primitive() {
        h hVar = new h();
        hVar.a(new m(K0));
        hVar.a(this.E0);
        hVar.a(new s5(this.F0, this.J0));
        hVar.a(this.G0);
        hVar.a(new m(this.H0));
        BigInteger bigInteger = this.I0;
        if (bigInteger != null) {
            hVar.a(new m(bigInteger));
        }
        return new i1(hVar);
    }

    public X9ECParameters(ECCurve eCCurve, u5 u5Var, BigInteger bigInteger, BigInteger bigInteger2) {
        this(eCCurve, u5Var, bigInteger, bigInteger2, (byte[]) null);
    }

    public X9ECParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        this(eCCurve, eCPoint, bigInteger, bigInteger2, (byte[]) null);
    }

    public X9ECParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this(eCCurve, new u5(eCPoint), bigInteger, bigInteger2, bArr);
    }

    public X9ECParameters(ECCurve eCCurve, u5 u5Var, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.F0 = eCCurve;
        this.G0 = u5Var;
        this.H0 = bigInteger;
        this.I0 = bigInteger2;
        this.J0 = bArr;
        if (ECAlgorithms.isFpCurve(eCCurve)) {
            this.E0 = new w5(eCCurve.getField().c());
            return;
        }
        if (ECAlgorithms.isF2mCurve(eCCurve)) {
            int[] iArrB = ((n4) eCCurve.getField()).a().b();
            if (iArrB.length == 3) {
                this.E0 = new w5(iArrB[2], iArrB[1]);
                return;
            } else {
                if (iArrB.length == 5) {
                    this.E0 = new w5(iArrB[4], iArrB[1], iArrB[2], iArrB[3]);
                    return;
                }
                throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
            }
        }
        throw new IllegalArgumentException("'curve' is of an unsupported type");
    }
}
