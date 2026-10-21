package bc.org.bouncycastle.crypto.util;

import bc.org.bouncycastle.asn1.x9.X9ECParameters;
import bc.org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import bc.org.bouncycastle.crypto.params.ECDomainParameters;
import bc.org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.b0;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.f2;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.g;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.g2;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.g4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.h2;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.j4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.l;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.m;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.n2;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.o2;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.p;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.p2;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.p4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.r2;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.r5;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.s0;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.s2;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.t1;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.t2;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.u;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.u1;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.u4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.v1;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.v4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.y5;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class PrivateKeyFactory {
    public static AsymmetricKeyParameter createKey(byte[] bArr) throws IOException {
        return createKey(p4.a(u.a(bArr)));
    }

    public static AsymmetricKeyParameter createKey(InputStream inputStream) throws IOException {
        return createKey(p4.a(new l(inputStream).d()));
    }

    public static AsymmetricKeyParameter createKey(p4 p4Var) throws IOException {
        ECDomainParameters eCDomainParameters;
        b0 b0VarC = p4Var.c();
        if (b0VarC.c().equals(j4.f66092b)) {
            v4 v4VarA = v4.a(p4Var.d());
            return new u4(v4VarA.f(), v4VarA.j(), v4VarA.i(), v4VarA.g(), v4VarA.h(), v4VarA.d(), v4VarA.e(), v4VarA.c());
        }
        g2 g2Var = null;
        if (b0VarC.c().equals(j4.f66139s)) {
            t1 t1VarA = t1.a(b0VarC.d());
            m mVar = (m) p4Var.d();
            BigInteger bigIntegerD = t1VarA.d();
            return new v1(mVar.h(), new u1(t1VarA.e(), t1VarA.c(), null, bigIntegerD == null ? 0 : bigIntegerD.intValue()));
        }
        if (b0VarC.c().equals(g4.f66058l)) {
            r2 r2VarA = r2.a(b0VarC.d());
            return new t2(((m) p4Var.d()).h(), new s2(r2VarA.d(), r2VarA.c()));
        }
        if (b0VarC.c().equals(y5.U)) {
            m mVar2 = (m) p4Var.d();
            g gVarD = b0VarC.d();
            if (gVarD != null) {
                f2 f2VarA = f2.a(gVarD.toASN1Primitive());
                g2Var = new g2(f2VarA.d(), f2VarA.e(), f2VarA.c());
            }
            return new h2(mVar2.h(), g2Var);
        }
        if (b0VarC.c().equals(y5.f66480k)) {
            r5 r5Var = new r5((u) b0VarC.d());
            if (r5Var.d()) {
                p pVar = (p) r5Var.c();
                X9ECParameters x9ECParametersA = s0.a(pVar);
                if (x9ECParametersA == null) {
                    x9ECParametersA = n2.a(pVar);
                }
                eCDomainParameters = new o2(pVar, x9ECParametersA.getCurve(), x9ECParametersA.getG(), x9ECParametersA.getN(), x9ECParametersA.getH(), x9ECParametersA.getSeed());
            } else {
                X9ECParameters x9ECParameters = X9ECParameters.getInstance(r5Var.c());
                eCDomainParameters = new ECDomainParameters(x9ECParameters.getCurve(), x9ECParameters.getG(), x9ECParameters.getN(), x9ECParameters.getH(), x9ECParameters.getSeed());
            }
            return new ECPrivateKeyParameters(p2.a(p4Var.d()).c(), eCDomainParameters);
        }
        throw new RuntimeException("algorithm identifier in key not recognised");
    }
}
