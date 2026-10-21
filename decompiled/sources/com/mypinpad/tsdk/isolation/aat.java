package com.mypinpad.tsdk.isolation;

import com.bbva.networkplugin.command.impl.PutCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0002\u0015\nB7\u0012\u0006\u0010\u0003\u001a\u00020\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u000f\u0012\u0006\u0010\b\u001a\u00020\u000f\u0012\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010\u0012\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0010¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000e"}, d2 = {"Lcom/mypinpad/tsdk/i/aat;", "Lcom/mypinpad/tsdk/i/aaw;", "Ljavax/net/ssl/SSLSocket;", "p0", "", "p1", "", "Lcom/mypinpad/tsdk/i/yi;", "p2", "", "setX", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "setCompoundDrawableTintBlendMode", "(Ljavax/net/ssl/SSLSocket;)V", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Ljava/lang/reflect/Method;", "Ljava/lang/Class;", "p3", "p4", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V", "a"}, k = 1, mv = {1, 6, 0})
public final class aat extends aaw {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f52217j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f52218k = 1;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Method f52219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Method f52220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Method f52221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Class<?> f52222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Class<?> f52223i;

    public static final class a implements InvocationHandler {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f52224d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f52225e = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<String> f52226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f52227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String f52228c;

        public a(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.f52226a = list;
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0262  */
        /* JADX WARN: Code duplicated, block: B:104:0x0271  */
        /* JADX WARN: Code duplicated, block: B:105:0x0272  */
        /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:49:0x0167  */
        /* JADX WARN: Code duplicated, block: B:51:0x0170  */
        /* JADX WARN: Code duplicated, block: B:53:0x0186  */
        /* JADX WARN: Code duplicated, block: B:62:0x01b1  */
        /* JADX WARN: Code duplicated, block: B:65:0x01b6  */
        /* JADX WARN: Code duplicated, block: B:97:0x024f  */
        /* JADX WARN: Code duplicated, block: B:99:0x0252  */
        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) throws IllegalAccessException, InvocationTargetException {
            int i13;
            int i14;
            int i15;
            int i16;
            Object obj;
            int i17;
            Object obj2;
            int i18;
            int i19 = (i11 * 334) + (i10 * (-665));
            int i20 = ~i10;
            int i21 = (i20 * (-333)) + i19;
            int i22 = ~i12;
            int i23 = (((~(i20 | i12)) | (~(i11 | i22))) * 333) + (((~(i20 | i22)) | (~(i11 | i12))) * 333) + i21;
            if (i23 == 1) {
                a aVar = (a) objArr[0];
                int i24 = f52225e;
                int i25 = i24 + 65;
                f52224d = i25 % 128;
                int i26 = i25 % 2;
                String str = aVar.f52228c;
                int i27 = ((i24 ^ 71) | (i24 & 71)) << 1;
                int i28 = -(((~i24) & 71) | (i24 & (-72)));
                int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
                f52224d = i29 % 128;
                int i30 = i29 % 2;
                return str;
            }
            if (i23 == 2) {
                a aVar2 = (a) objArr[0];
                int i31 = f52225e;
                int i32 = (i31 & (-78)) | ((~i31) & 77);
                int i33 = -(-((i31 & 77) << 1));
                int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
                int i35 = i34 % 128;
                f52224d = i35;
                int i36 = i34 % 2;
                boolean z10 = aVar2.f52227b;
                if (i36 != 0) {
                    throw null;
                }
                int i37 = ((i35 ^ 77) | (i35 & 77)) << 1;
                int i38 = -(((~i35) & 77) | (i35 & (-78)));
                int i39 = (i37 & i38) + (i38 | i37);
                f52225e = i39 % 128;
                int i40 = i39 % 2;
                return Boolean.valueOf(z10);
            }
            a aVar3 = (a) objArr[0];
            Object obj3 = objArr[1];
            Method method = (Method) objArr[2];
            Object[] objArr2 = (Object[]) objArr[3];
            int i41 = f52225e;
            int i42 = i41 ^ 33;
            int i43 = ((i41 & 33) | i42) << 1;
            int i44 = -i42;
            int i45 = (i43 ^ i44) + ((i43 & i44) << 1);
            f52224d = i45 % 128;
            if (i45 % 2 != 0) {
                Intrinsics.checkNotNullParameter(obj3, "");
                Intrinsics.checkNotNullParameter(method, "");
                throw null;
            }
            Intrinsics.checkNotNullParameter(obj3, "");
            Intrinsics.checkNotNullParameter(method, "");
            if (objArr2 == null) {
                objArr2 = new Object[0];
                int i46 = f52224d;
                int i47 = (((i46 | 44) << 1) - (i46 ^ 44)) - 1;
                f52225e = i47 % 128;
                int i48 = i47 % 2;
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (!(!Intrinsics.areEqual(name, "supports"))) {
                int i49 = f52225e;
                int i50 = i49 | 15;
                int i51 = i50 << 1;
                int i52 = -((~(i49 & 15)) & i50);
                int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
                f52224d = i53 % 128;
                if (i53 % 2 != 0) {
                    Intrinsics.areEqual(Boolean.TYPE, returnType);
                    throw null;
                }
                if (Intrinsics.areEqual(Boolean.TYPE, returnType)) {
                    int i54 = (-2) - ((f52225e + 78) ^ (-1));
                    f52224d = i54 % 128;
                    if (i54 % 2 == 0) {
                        return Boolean.TRUE;
                    }
                    throw null;
                }
            }
            if (Intrinsics.areEqual(name, "unsupported")) {
                int i55 = f52225e;
                int i56 = (i55 & 113) + (i55 | 113);
                f52224d = i56 % 128;
                int i57 = i56 % 2;
                if (Intrinsics.areEqual(Void.TYPE, returnType)) {
                    int i58 = f52225e;
                    int i59 = (((i58 | 32) << 1) - (i58 ^ 32)) - 1;
                    int i60 = i59 % 128;
                    f52224d = i60;
                    if (i59 % 2 != 0) {
                        aVar3.f52227b = false;
                    } else {
                        aVar3.f52227b = true;
                    }
                    int i61 = i60 + 41;
                    f52225e = i61 % 128;
                    int i62 = i61 % 2;
                    return null;
                }
            }
            if (Intrinsics.areEqual(name, "protocols")) {
                int i63 = f52225e;
                int i64 = i63 + 117;
                int i65 = i64 % 128;
                f52224d = i65;
                if (i64 % 2 != 0) {
                    throw null;
                }
                if (objArr2.length == 0) {
                    int i66 = i63 & 89;
                    int i67 = ((i63 ^ 89) | i66) << 1;
                    int i68 = -((~i66) & (i63 | 89));
                    int i69 = ((i67 | i68) << 1) - (i67 ^ i68);
                    int i70 = i69 % 128;
                    f52224d = i70;
                    int i71 = i69 % 2;
                    int i72 = ((i70 & 73) - (~(-(-(i70 | 73))))) - 1;
                    f52225e = i72 % 128;
                    int i73 = i72 % 2;
                    List<String> list = aVar3.f52226a;
                    int i74 = (((i70 & (-102)) | ((~i70) & 101)) - (~((i70 & 101) << 1))) - 1;
                    f52225e = i74 % 128;
                    int i75 = i74 % 2;
                    return list;
                }
                int i76 = (i65 ^ 35) + ((i65 & 35) << 1);
                f52225e = i76 % 128;
                int i77 = i76 % 2;
            }
            if (!Intrinsics.areEqual(name, "selectProtocol")) {
                int i78 = f52225e;
                int i79 = i78 & 67;
                int i80 = -(-((i78 ^ 67) | i79));
                int i81 = (i79 & i80) + (i80 | i79);
                f52224d = i81 % 128;
                if (i81 % 2 != 0) {
                    Intrinsics.areEqual(name, "select");
                    throw null;
                }
                if (Intrinsics.areEqual(name, "select")) {
                    if (!(!Intrinsics.areEqual(String.class, returnType))) {
                        int i82 = f52224d;
                        int i83 = i82 & 35;
                        int i84 = (i82 | 35) & (~i83);
                        int i85 = i83 << 1;
                        int i86 = (i84 ^ i85) + ((i84 & i85) << 1);
                        i13 = i86 % 128;
                        f52225e = i13;
                        int i87 = i86 % 2;
                        if (objArr2.length == 1) {
                            i14 = (-2) - ((i13 + 4) ^ (-1));
                            i15 = i14 % 128;
                            f52224d = i15;
                            if (i14 % 2 != 0 ? (objArr2[0] instanceof List) : (objArr2[0] instanceof List)) {
                                i16 = ((i15 | 27) << 1) - ((i15 & (-28)) | ((~i15) & 27));
                                f52225e = i16 % 128;
                                if (i16 % 2 == 0 ? (obj = objArr2[0]) == null : (obj = objArr2[1]) == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                                }
                                List list2 = (List) obj;
                                int size = list2.size();
                                if (size >= 0) {
                                    int i88 = 0;
                                    while (true) {
                                        int i89 = (i88 & (-2)) | ((~i88) & 1);
                                        int i90 = -(-((i88 & 1) << 1));
                                        int i91 = ((i89 | i90) << 1) - (i89 ^ i90);
                                        Object obj4 = list2.get(i88);
                                        if (obj4 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                        }
                                        String str2 = (String) obj4;
                                        if (!(!aVar3.f52226a.contains(str2))) {
                                            int i92 = f52224d;
                                            int i93 = i92 ^ 33;
                                            int i94 = ((i92 & 33) | i93) << 1;
                                            int i95 = -i93;
                                            int i96 = (i94 ^ i95) + ((i94 & i95) << 1);
                                            f52225e = i96 % 128;
                                            if (i96 % 2 != 0) {
                                                aVar3.f52228c = str2;
                                                return str2;
                                            }
                                            aVar3.f52228c = str2;
                                            throw null;
                                        }
                                        if (i88 != size) {
                                            i88 = i91;
                                        }
                                    }
                                }
                                String str3 = aVar3.f52226a.get(0);
                                aVar3.f52228c = str3;
                                System.identityHashCode(aVar3);
                                System.identityHashCode(aVar3);
                                return str3;
                            }
                        }
                    }
                }
            } else if (!(!Intrinsics.areEqual(String.class, returnType))) {
                int i810 = f52224d;
                int i811 = i810 & 35;
                int i812 = (i810 | 35) & (~i811);
                int i813 = i811 << 1;
                int i814 = (i812 ^ i813) + ((i812 & i813) << 1);
                i13 = i814 % 128;
                f52225e = i13;
                int i815 = i814 % 2;
                if (objArr2.length == 1) {
                    i14 = (-2) - ((i13 + 4) ^ (-1));
                    i15 = i14 % 128;
                    f52224d = i15;
                    if (i14 % 2 != 0) {
                        i16 = ((i15 | 27) << 1) - ((i15 & (-28)) | ((~i15) & 27));
                        f52225e = i16 % 128;
                        if (i16 % 2 == 0) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                    }
                    i16 = ((i15 | 27) << 1) - ((i15 & (-28)) | ((~i15) & 27));
                    f52225e = i16 % 128;
                    if (i16 % 2 == 0) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                }
            }
            if (!Intrinsics.areEqual(name, "protocolSelected")) {
                int i97 = f52224d;
                int i98 = (i97 & 85) + (i97 | 85);
                f52225e = i98 % 128;
                if (i98 % 2 == 0) {
                    int i99 = 26 / 0;
                    if (Intrinsics.areEqual(name, "selected")) {
                        if (objArr2.length == 1) {
                            int i100 = f52225e;
                            int i101 = (i100 & 47) + (i100 | 47);
                            i17 = i101 % 128;
                            f52224d = i17;
                            int i102 = i101 % 2;
                            obj2 = objArr2[0];
                            if (obj2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            aVar3.f52228c = (String) obj2;
                            i18 = i17 + 17;
                            f52225e = i18 % 128;
                            if (i18 % 2 != 0) {
                                return null;
                            }
                            throw null;
                        }
                    }
                } else if (Intrinsics.areEqual(name, "selected")) {
                    if (objArr2.length == 1) {
                        int i103 = f52225e;
                        int i104 = (i103 & 47) + (i103 | 47);
                        i17 = i104 % 128;
                        f52224d = i17;
                        int i105 = i104 % 2;
                        obj2 = objArr2[0];
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        aVar3.f52228c = (String) obj2;
                        i18 = i17 + 17;
                        f52225e = i18 % 128;
                        if (i18 % 2 != 0) {
                            return null;
                        }
                        throw null;
                    }
                }
            } else if (objArr2.length == 1) {
                int i106 = f52225e;
                int i107 = (i106 & 47) + (i106 | 47);
                i17 = i107 % 128;
                f52224d = i17;
                int i108 = i107 % 2;
                obj2 = objArr2[0];
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                aVar3.f52228c = (String) obj2;
                i18 = i17 + 17;
                f52225e = i18 % 128;
                if (i18 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            Object objInvoke = method.invoke(aVar3, Arrays.copyOf(objArr2, objArr2.length));
            int i109 = f52224d;
            int i110 = i109 & 47;
            int i111 = -(-((i109 ^ 47) | i110));
            int i112 = (i110 ^ i111) + ((i111 & i110) << 1);
            f52225e = i112 % 128;
            if (i112 % 2 != 0) {
                return objInvoke;
            }
            int i113 = 8 / 0;
            return objInvoke;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public final Object invoke(@NotNull Object obj, @NotNull Method method, @Nullable Object[] objArr) throws Throwable {
            return a(new Object[]{this, obj, method, objArr}, 1781105665, -1781105665, System.identityHashCode(this));
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.aat$setX, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/aat$setX;", "", "Lcom/mypinpad/tsdk/i/aaw;", "setOnFocusChangeListener", "()Lcom/mypinpad/tsdk/i/aaw;", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f52229a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f52230b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            int i13 = f52229a;
            int i14 = (-2) - ((((i13 | 26) << 1) - (i13 ^ 26)) ^ (-1));
            f52230b = i14 % 128;
            int i15 = i14 % 2;
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                Intrinsics.checkNotNullExpressionValue(property, "");
                if (Integer.parseInt(property) >= 9) {
                    int i16 = f52230b + 75;
                    int i17 = i16 % 128;
                    f52229a = i17;
                    if (i16 % 2 != 0) {
                        int i18 = 13 / 0;
                    }
                    int i19 = ((i17 ^ 81) - (~((i17 & 81) << 1))) - 1;
                    f52230b = i19 % 128;
                    int i20 = i19 % 2;
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, null);
                Class<?> cls3 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, null);
                Class<?> cls4 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, null);
                Method method = cls.getMethod(PutCommand.ID, SSLSocket.class, cls2);
                Method method2 = cls.getMethod("get", SSLSocket.class);
                Method method3 = cls.getMethod(RemoveCommand.ID, SSLSocket.class);
                Intrinsics.checkNotNullExpressionValue(method, "");
                Intrinsics.checkNotNullExpressionValue(method2, "");
                Intrinsics.checkNotNullExpressionValue(method3, "");
                Intrinsics.checkNotNullExpressionValue(cls3, "");
                Intrinsics.checkNotNullExpressionValue(cls4, "");
                aat aatVar = new aat(method, method2, method3, cls3, cls4);
                int i21 = f52229a;
                int i22 = (i21 & 49) + (i21 | 49);
                f52230b = i22 % 128;
                if (i22 % 2 != 0) {
                    return aatVar;
                }
                throw null;
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                int i23 = f52230b;
                int i24 = i23 & 81;
                int i25 = i24 + ((i23 ^ 81) | i24);
                f52229a = i25 % 128;
                int i26 = i25 % 2;
                return null;
            }
        }

        @Nullable
        public static aaw setOnFocusChangeListener() {
            return (aaw) setDividerPadding(new Object[0], -1845125075, 1845125075, (int) System.currentTimeMillis());
        }
    }

    static {
        int i10 = f52217j;
        int i11 = (i10 ^ 23) + ((i10 & 23) << 1);
        f52218k = i11 % 128;
        int i12 = i11 % 2;
    }

    public aat(@NotNull Method method, @NotNull Method method2, @NotNull Method method3, @NotNull Class<?> cls, @NotNull Class<?> cls2) {
        Intrinsics.checkNotNullParameter(method, "");
        Intrinsics.checkNotNullParameter(method2, "");
        Intrinsics.checkNotNullParameter(method3, "");
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(cls2, "");
        this.f52219e = method;
        this.f52220f = method2;
        this.f52221g = method3;
        this.f52222h = cls;
        this.f52223i = cls2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00da A[Catch: IllegalAccessException -> 0x00d6, InvocationTargetException -> 0x00d8, TRY_ENTER, TRY_LEAVE, TryCatch #5 {IllegalAccessException -> 0x00d6, InvocationTargetException -> 0x00d8, blocks: (B:7:0x004b, B:9:0x005b, B:15:0x0095, B:17:0x00a5, B:33:0x012f, B:24:0x00da, B:31:0x010e, B:35:0x013e, B:36:0x0145), top: B:71:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:30:0x010d  */
    /* JADX WARN: Code duplicated, block: B:31:0x010e A[Catch: IllegalAccessException -> 0x00d6, InvocationTargetException -> 0x00d8, TRY_ENTER, TRY_LEAVE, TryCatch #5 {IllegalAccessException -> 0x00d6, InvocationTargetException -> 0x00d8, blocks: (B:7:0x004b, B:9:0x005b, B:15:0x0095, B:17:0x00a5, B:33:0x012f, B:24:0x00da, B:31:0x010e, B:35:0x013e, B:36:0x0145), top: B:71:0x004b }] */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15 = ~i10;
        int i16 = (((~(i10 | (~i11))) | (~(i11 | i15 | i12))) * 235) + (((~(i15 | i12)) | i11) * (-470)) + (((~((~i12) | i15)) | i11) * (-235)) + (i11 * 471) + (i10 * 236);
        String str = null;
        if (i16 == 1) {
            aat aatVar = (aat) objArr[0];
            SSLSocket sSLSocket = (SSLSocket) objArr[1];
            int i17 = f52218k;
            int i18 = i17 & 63;
            int i19 = ((i17 | 63) & (~i18)) + (i18 << 1);
            f52217j = i19 % 128;
            try {
                if (i19 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(sSLSocket, "");
                    Method method = aatVar.f52221g;
                    Object[] objArr2 = new Object[1];
                    objArr2[1] = sSLSocket;
                    method.invoke(null, objArr2);
                } else {
                    Intrinsics.checkNotNullParameter(sSLSocket, "");
                    aatVar.f52221g.invoke(null, sSLSocket);
                }
                int i20 = f52217j;
                int i21 = i20 & 101;
                int i22 = (i20 | 101) & (~i21);
                int i23 = -(-(i21 << 1));
                int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
                f52218k = i24 % 128;
                int i25 = i24 % 2;
            } catch (IllegalAccessException e5) {
                throw new AssertionError("failed to remove ALPN", e5);
            } catch (InvocationTargetException e7) {
                throw new AssertionError("failed to remove ALPN", e7);
            }
        } else if (i16 != 2) {
            aat aatVar2 = (aat) objArr[0];
            SSLSocket sSLSocket2 = (SSLSocket) objArr[1];
            int i26 = f52217j;
            int i27 = i26 & 45;
            int i28 = (i26 | 45) & (~i27);
            int i29 = -(-(i27 << 1));
            int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
            f52218k = i30 % 128;
            int i31 = i30 % 2;
            Intrinsics.checkNotNullParameter(sSLSocket2, "");
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(aatVar2.f52220f.invoke(null, sSLSocket2));
                if (invocationHandler == null) {
                    throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
                }
                a aVar = (a) invocationHandler;
                if (!((Boolean) a.a(new Object[]{aVar}, -1891211026, 1891211028, System.identityHashCode(aVar))).booleanValue()) {
                    int i32 = f52217j;
                    int i33 = (i32 & (-78)) | ((~i32) & 77);
                    int i34 = (i32 & 77) << 1;
                    int i35 = (i33 & i34) + (i34 | i33);
                    f52218k = i35 % 128;
                    if (i35 % 2 == 0) {
                        throw null;
                    }
                    if (((String) a.a(new Object[]{aVar}, 1275000628, -1275000627, System.identityHashCode(aVar))) == null) {
                        aaw.setCompoundDrawableTintBlendMode(new Object[]{"ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, 6}, -2146983271, 2146983272, 0);
                        int i36 = f52217j;
                        int i37 = i36 | 113;
                        i13 = ((i37 << 1) - (~(-((~(i36 & 113)) & i37)))) - 1;
                        f52218k = i13 % 128;
                    } else if (!(!((Boolean) a.a(new Object[]{aVar}, -1891211026, 1891211028, System.identityHashCode(aVar))).booleanValue())) {
                        int i38 = f52218k;
                        int i39 = ((i38 ^ 117) | (i38 & 117)) << 1;
                        int i40 = -(((~i38) & 117) | (i38 & (-118)));
                        i14 = (i39 ^ i40) + ((i40 & i39) << 1);
                        f52217j = i14 % 128;
                        if (i14 % 2 != 0) {
                            throw null;
                        }
                    } else {
                        str = (String) a.a(new Object[]{aVar}, 1275000628, -1275000627, System.identityHashCode(aVar));
                        int i41 = f52218k;
                        int i42 = i41 & 21;
                        int i43 = -(-((i41 ^ 21) | i42));
                        i13 = (i42 & i43) + (i43 | i42);
                        f52217j = i13 % 128;
                    }
                    int i44 = i13 % 2;
                } else if (!(!((Boolean) a.a(new Object[]{aVar}, -1891211026, 1891211028, System.identityHashCode(aVar))).booleanValue())) {
                    int i310 = f52218k;
                    int i311 = ((i310 ^ 117) | (i310 & 117)) << 1;
                    int i45 = -(((~i310) & 117) | (i310 & (-118)));
                    i14 = (i311 ^ i45) + ((i45 & i311) << 1);
                    f52217j = i14 % 128;
                    if (i14 % 2 != 0) {
                        throw null;
                    }
                } else {
                    str = (String) a.a(new Object[]{aVar}, 1275000628, -1275000627, System.identityHashCode(aVar));
                    int i46 = f52218k;
                    int i47 = i46 & 21;
                    int i48 = -(-((i46 ^ 21) | i47));
                    i13 = (i47 & i48) + (i48 | i47);
                    f52217j = i13 % 128;
                    int i49 = i13 % 2;
                }
            } catch (IllegalAccessException e10) {
                throw new AssertionError("failed to get ALPN selected protocol", e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError("failed to get ALPN selected protocol", e11);
            }
        } else {
            aat aatVar3 = (aat) objArr[0];
            SSLSocket sSLSocket3 = (SSLSocket) objArr[1];
            List list = (List) objArr[3];
            Intrinsics.checkNotNullParameter(sSLSocket3, "");
            Intrinsics.checkNotNullParameter(list, "");
            try {
                aatVar3.f52219e.invoke(null, sSLSocket3, Proxy.newProxyInstance(aaw.class.getClassLoader(), new Class[]{aatVar3.f52222h, aatVar3.f52223i}, new a((List) aaw.setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{list}, 530048483, -530048479, (int) System.currentTimeMillis()))));
                int i50 = f52217j;
                int i51 = (i50 ^ 69) + ((i50 & 69) << 1);
                f52218k = i51 % 128;
                int i52 = i51 % 2;
            } catch (IllegalAccessException e12) {
                throw new AssertionError("failed to set ALPN", e12);
            } catch (InvocationTargetException e13) {
                throw new AssertionError("failed to set ALPN", e13);
            }
        }
        return str;
    }

    @Override // com.mypinpad.tsdk.isolation.aaw
    public final void setCompoundDrawableTintBlendMode(@NotNull SSLSocket p4) {
        setDividerPadding(new Object[]{this, p4}, -2065181869, 2065181870, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aaw
    @Nullable
    public final String setX(@NotNull SSLSocket p4) {
        return (String) setDividerPadding(new Object[]{this, p4}, 644524374, -644524374, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aaw
    public final void setX(@NotNull SSLSocket p4, @Nullable String p10, @NotNull List<? extends yi> p11) {
        setDividerPadding(new Object[]{this, p4, p10, p11}, 1237316314, -1237316312, System.identityHashCode(this));
    }
}
