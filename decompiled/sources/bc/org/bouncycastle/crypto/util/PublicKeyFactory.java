package bc.org.bouncycastle.crypto.util;

import bc.org.bouncycastle.asn1.x9.X9ECParameters;
import bc.org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import bc.org.bouncycastle.crypto.params.ECDomainParameters;
import bc.org.bouncycastle.crypto.params.ECPublicKeyParameters;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.b0;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e1;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.f2;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.g;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.g2;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.g4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.i2;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.j4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.l;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.l5;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.m;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.m2;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.n2;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.o2;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.p;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.p5;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.q5;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.r2;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.r5;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.s0;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.s2;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.t1;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.t4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.u;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.u1;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.u2;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.u5;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.w1;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.w4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.x1;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.y1;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.y5;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class PublicKeyFactory {
    public static AsymmetricKeyParameter createKey(byte[] bArr) throws IOException {
        return createKey(l5.a(u.a(bArr)));
    }

    public static AsymmetricKeyParameter createKey(InputStream inputStream) throws IOException {
        return createKey(l5.a(new l(inputStream).d()));
    }

    public static AsymmetricKeyParameter createKey(l5 l5Var) throws IOException {
        X9ECParameters x9ECParameters;
        ECDomainParameters eCDomainParameters;
        b0 b0VarC = l5Var.c();
        if (!b0VarC.c().equals(j4.f66092b) && !b0VarC.c().equals(q5.m)) {
            g2 g2Var = null;
            if (b0VarC.c().equals(y5.f66464b0)) {
                BigInteger bigIntegerC = w1.a(l5Var.e()).c();
                m2 m2VarA = m2.a(b0VarC.d());
                BigInteger bigIntegerE = m2VarA.e();
                BigInteger bigIntegerC2 = m2VarA.c();
                BigInteger bigIntegerF = m2VarA.f();
                BigInteger bigIntegerD = m2VarA.d() != null ? m2VarA.d() : null;
                p5 p5VarG = m2VarA.g();
                return new x1(bigIntegerC, new u1(bigIntegerE, bigIntegerC2, bigIntegerF, bigIntegerD, p5VarG != null ? new y1(p5VarG.getSeed(), p5VarG.c().intValue()) : null));
            }
            if (b0VarC.c().equals(j4.f66139s)) {
                t1 t1VarA = t1.a(b0VarC.d());
                m mVar = (m) l5Var.e();
                BigInteger bigIntegerD2 = t1VarA.d();
                return new x1(mVar.h(), new u1(t1VarA.e(), t1VarA.c(), null, bigIntegerD2 != null ? bigIntegerD2.intValue() : 0));
            }
            if (b0VarC.c().equals(g4.f66058l)) {
                r2 r2VarA = r2.a(b0VarC.d());
                return new u2(((m) l5Var.e()).h(), new s2(r2VarA.d(), r2VarA.c()));
            }
            if (!b0VarC.c().equals(y5.U) && !b0VarC.c().equals(g4.f66056j)) {
                if (b0VarC.c().equals(y5.f66480k)) {
                    r5 r5VarA = r5.a(b0VarC.d());
                    if (r5VarA.d()) {
                        p pVar = (p) r5VarA.c();
                        x9ECParameters = s0.a(pVar);
                        if (x9ECParameters == null) {
                            x9ECParameters = n2.a(pVar);
                        }
                        eCDomainParameters = new o2(pVar, x9ECParameters.getCurve(), x9ECParameters.getG(), x9ECParameters.getN(), x9ECParameters.getH(), x9ECParameters.getSeed());
                    } else {
                        x9ECParameters = X9ECParameters.getInstance(r5VarA.c());
                        eCDomainParameters = new ECDomainParameters(x9ECParameters.getCurve(), x9ECParameters.getG(), x9ECParameters.getN(), x9ECParameters.getH(), x9ECParameters.getSeed());
                    }
                    return new ECPublicKeyParameters(new u5(x9ECParameters.getCurve(), new e1(l5Var.d().g())).c(), eCDomainParameters);
                }
                throw new RuntimeException("algorithm identifier in key not recognised");
            }
            m mVar2 = (m) l5Var.e();
            g gVarD = b0VarC.d();
            if (gVarD != null) {
                f2 f2VarA = f2.a(gVarD.toASN1Primitive());
                g2Var = new g2(f2VarA.d(), f2VarA.e(), f2VarA.c());
            }
            return new i2(mVar2.h(), g2Var);
        }
        w4 w4VarA = w4.a(l5Var.e());
        return new t4(false, w4VarA.c(), w4VarA.d());
    }
}
