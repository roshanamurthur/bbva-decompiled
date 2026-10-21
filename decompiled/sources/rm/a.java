package rm;

import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.cms.GCMParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f93108a = ClassUtil.loadClass(a.class, "javax.crypto.spec.GCMParameterSpec");

    public static GCMParameters a(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        try {
            Class cls = f93108a;
            return new GCMParameters((byte[]) cls.getDeclaredMethod("getIV", new Class[0]).invoke(algorithmParameterSpec, new Object[0]), ((Integer) cls.getDeclaredMethod("getTLen", new Class[0]).invoke(algorithmParameterSpec, new Object[0])).intValue() / 8);
        } catch (Exception unused) {
            throw new InvalidParameterSpecException("Cannot process GCMParameterSpec");
        }
    }

    public static AlgorithmParameterSpec b(ASN1Primitive aSN1Primitive) throws InvalidParameterSpecException {
        try {
            GCMParameters gCMParameters = GCMParameters.getInstance(aSN1Primitive);
            return (AlgorithmParameterSpec) f93108a.getConstructor(Integer.TYPE, byte[].class).newInstance(Integers.valueOf(gCMParameters.getIcvLen() * 8), gCMParameters.getNonce());
        } catch (NoSuchMethodException unused) {
            throw new InvalidParameterSpecException("No constructor found!");
        } catch (Exception e5) {
            throw new InvalidParameterSpecException(ci.a.b(e5, new StringBuilder("Construction failed: ")));
        }
    }

    public static boolean c(AlgorithmParameterSpec algorithmParameterSpec) {
        Class cls = f93108a;
        return cls != null && cls.isInstance(algorithmParameterSpec);
    }
}
