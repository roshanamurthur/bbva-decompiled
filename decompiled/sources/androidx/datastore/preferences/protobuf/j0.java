package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: Protobuf.java */
/* JADX INFO: loaded from: classes2.dex */
public final class j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j0 f21070c = new j0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f21072b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f21071a = new u();

    public final <T> o0<T> a(Class<T> cls) {
        o0<T> o0VarZ;
        c0 c0Var;
        Class<?> cls2;
        Charset charset = Internal.f20943a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f21072b;
        o0<T> o0Var = (o0) concurrentHashMap.get(cls);
        if (o0Var != null) {
            return o0Var;
        }
        u uVar = this.f21071a;
        uVar.getClass();
        Class<?> cls3 = p0.f21106a;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = p0.f21106a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        y yVarA = uVar.f21146a.a(cls);
        if (yVarA.a()) {
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                c0Var = new c0(p0.f21109d, m.f21081a, yVarA.b());
            } else {
                t0<?, ?> t0Var = p0.f21107b;
                k<?> kVar = m.f21082b;
                if (kVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                c0Var = new c0(t0Var, kVar, yVarA.b());
            }
            o0VarZ = c0Var;
        } else if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            o0VarZ = yVarA.getSyntax() == ProtoSyntax.PROTO2 ? b0.z(yVarA, f0.f21056b, s.f21140b, p0.f21109d, m.f21081a, x.f21160b) : b0.z(yVarA, f0.f21056b, s.f21140b, p0.f21109d, null, x.f21160b);
        } else if (yVarA.getSyntax() == ProtoSyntax.PROTO2) {
            d0 d0Var = f0.f21055a;
            s.a aVar = s.f21139a;
            t0<?, ?> t0Var2 = p0.f21107b;
            k<?> kVar2 = m.f21082b;
            if (kVar2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            o0VarZ = b0.z(yVarA, d0Var, aVar, t0Var2, kVar2, x.f21159a);
        } else {
            o0VarZ = b0.z(yVarA, f0.f21055a, s.f21139a, p0.f21108c, null, x.f21159a);
        }
        o0<T> o0Var2 = (o0) concurrentHashMap.putIfAbsent(cls, o0VarZ);
        return o0Var2 != null ? o0Var2 : o0VarZ;
    }
}
