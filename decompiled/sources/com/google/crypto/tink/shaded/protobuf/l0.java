package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: Protobuf.java */
/* JADX INFO: loaded from: classes10.dex */
public final class l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l0 f47234c = new l0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f47236b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f47235a = new w();

    public final <T> q0<T> a(Class<T> cls) {
        q0<T> q0VarD;
        e0 e0Var;
        Class<?> cls2;
        Charset charset = Internal.f47106a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f47236b;
        q0<T> q0Var = (q0) concurrentHashMap.get(cls);
        if (q0Var != null) {
            return q0Var;
        }
        w wVar = this.f47235a;
        wVar.getClass();
        Class<?> cls3 = r0.f47264a;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = r0.f47264a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        a0 a0VarA = wVar.f47304a.a(cls);
        if (a0VarA.a()) {
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                e0Var = new e0(r0.f47267d, k.f47229a, a0VarA.b());
            } else {
                v0<?, ?> v0Var = r0.f47265b;
                i<?> iVar = k.f47230b;
                if (iVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                e0Var = new e0(v0Var, iVar, a0VarA.b());
            }
            q0VarD = e0Var;
        } else if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            q0VarD = a0VarA.getSyntax() == ProtoSyntax.PROTO2 ? d0.D(a0VarA, h0.f47225b, u.f47298b, r0.f47267d, k.f47229a, z.f47317b) : d0.D(a0VarA, h0.f47225b, u.f47298b, r0.f47267d, null, z.f47317b);
        } else if (a0VarA.getSyntax() == ProtoSyntax.PROTO2) {
            f0 f0Var = h0.f47224a;
            u.a aVar = u.f47297a;
            v0<?, ?> v0Var2 = r0.f47265b;
            i<?> iVar2 = k.f47230b;
            if (iVar2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            q0VarD = d0.D(a0VarA, f0Var, aVar, v0Var2, iVar2, z.f47316a);
        } else {
            q0VarD = d0.D(a0VarA, h0.f47224a, u.f47297a, r0.f47266c, null, z.f47316a);
        }
        q0<T> q0Var2 = (q0) concurrentHashMap.putIfAbsent(cls, q0VarD);
        return q0Var2 != null ? q0Var2 : q0VarD;
    }

    public final <T> q0<T> b(T t10) {
        return a(t10.getClass());
    }
}
