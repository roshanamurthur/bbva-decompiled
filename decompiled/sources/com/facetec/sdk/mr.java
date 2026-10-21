package com.facetec.sdk;

import com.bbva.networkplugin.command.impl.PutCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes9.dex */
final class mr extends mu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Method f42620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Method f42621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class<?> f42622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Method f42623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Class<?> f42624e;

    public static class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f42625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<String> f42626b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f42627e;

        public a(List<String> list) {
            this.f42626b = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = kz.f42206a;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f42627e = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f42626b;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f42626b.contains(list.get(i10))) {
                            String str = (String) list.get(i10);
                            this.f42625a = str;
                            return str;
                        }
                    }
                    String str2 = this.f42626b.get(0);
                    this.f42625a = str2;
                    return str2;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.f42625a = (String) objArr[0];
            return null;
        }
    }

    private mr(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f42620a = method;
        this.f42623d = method2;
        this.f42621b = method3;
        this.f42624e = cls;
        this.f42622c = cls2;
    }

    @Override // com.facetec.sdk.mu
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f42621b.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e5) {
            throw kz.b("unable to remove alpn", e5);
        }
    }

    @Override // com.facetec.sdk.mu
    public final void b(SSLSocket sSLSocket, String str, List<ko> list) {
        try {
            this.f42620a.invoke(null, sSLSocket, Proxy.newProxyInstance(mu.class.getClassLoader(), new Class[]{this.f42624e, this.f42622c}, new a(mu.b(list))));
        } catch (IllegalAccessException | InvocationTargetException e5) {
            throw kz.b("unable to set alpn", e5);
        }
    }

    @Override // com.facetec.sdk.mu
    @Nullable
    public final String d(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f42623d.invoke(null, sSLSocket));
            boolean z10 = aVar.f42627e;
            if (!z10 && aVar.f42625a == null) {
                mu.i().a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            }
            if (z10) {
                return null;
            }
            return aVar.f42625a;
        } catch (IllegalAccessException e5) {
            e = e5;
            throw kz.b("unable to get selected protocol", e);
        } catch (InvocationTargetException e7) {
            e = e7;
            throw kz.b("unable to get selected protocol", e);
        }
    }

    public static mu a() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
            return new mr(cls.getMethod(PutCommand.ID, SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod(RemoveCommand.ID, SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }
}
