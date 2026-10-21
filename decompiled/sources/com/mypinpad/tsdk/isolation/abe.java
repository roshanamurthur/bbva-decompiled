package com.mypinpad.tsdk.isolation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.l;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0003\u0010\u0007J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/mypinpad/tsdk/i/abe;", "Lcom/mypinpad/tsdk/i/abg;", "", "setOnFocusChangeListener", "()Z", "Ljavax/net/ssl/SSLSocket;", "p0", "(Ljavax/net/ssl/SSLSocket;)Z", "", "p1", "", "Lcom/mypinpad/tsdk/i/yi;", "p2", "", "setY", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "setX", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Ljava/lang/Class;", "<init>", "(Ljava/lang/Class;)V"}, k = 1, mv = {1, 6, 0})
public class abe implements abg {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f52278g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f52279h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Class<? super SSLSocket> f52280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Method f52281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f52282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f52283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f52284e;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final abi.setY f52277f = (abi.setY) Companion.setY(new Object[]{"com.google.android.gms.org.conscrypt"}, 2054365269, -2054365268, (int) System.currentTimeMillis());

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.abe$setY, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/mypinpad/tsdk/i/abe$setY;", "", "", "p0", "Lcom/mypinpad/tsdk/i/abi$setY;", "setCompoundDrawableTintBlendMode", "(Ljava/lang/String;)Lcom/mypinpad/tsdk/i/abi$setY;", "setNavigationOnClickListener", "Lcom/mypinpad/tsdk/i/abi$setY;", "setX", "()Lcom/mypinpad/tsdk/i/abi$setY;", "setOnFocusChangeListener", "<init>", "()V"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f52285a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f52286b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final /* synthetic */ abe setCompoundDrawableTintBlendMode(Class cls) {
            return (abe) setY(new Object[]{cls}, -1816300929, 1816300932, (int) System.currentTimeMillis());
        }

        @JvmName(name = "setX")
        @NotNull
        public static abi.setY setX() {
            return (abi.setY) setY(new Object[0], -197381198, 197381198, (int) System.currentTimeMillis());
        }

        public static Object setY(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * (-475)) + (i10 * 477);
            int i14 = ~((~i10) | i11);
            int i15 = ~i11;
            int i16 = ~(i15 | i10 | i12);
            int i17 = ((~(i10 | i15 | (~i12))) * 476) + (i16 * 952) + ((i14 | i16) * (-476)) + i13;
            if (i17 == 1) {
                String str = (String) objArr[0];
                Intrinsics.checkNotNullParameter(str, "");
                C0233setY c0233setY = new C0233setY();
                c0233setY.f52289a = str;
                int i18 = f52286b;
                int i19 = (i18 ^ 122) + ((i18 & 122) << 1);
                int i20 = (i19 ^ (-1)) + (i19 << 1);
                f52285a = i20 % 128;
                if (i20 % 2 == 0) {
                    return c0233setY;
                }
                throw null;
            }
            if (i17 != 2) {
                if (i17 == 3) {
                    Class cls = (Class) objArr[0];
                    int i21 = f52285a;
                    int i22 = (i21 & 90) + (i21 | 90);
                    int i23 = (i22 ^ (-1)) + (i22 << 1);
                    f52286b = i23 % 128;
                    if (i23 % 2 != 0) {
                        return (abe) setY(new Object[]{cls}, -1818746331, 1818746333, (int) System.currentTimeMillis());
                    }
                    throw null;
                }
                int i24 = f52285a;
                int i25 = ((i24 ^ 43) | (i24 & 43)) << 1;
                int i26 = -(((~i24) & 43) | (i24 & (-44)));
                int i27 = (i25 & i26) + (i26 | i25);
                f52286b = i27 % 128;
                int i28 = i27 % 2;
                abi.setY sety = (abi.setY) abe.setCompoundDrawableTintBlendMode(new Object[0], 270266845, -270266845, (int) System.currentTimeMillis());
                int i29 = f52286b;
                int i30 = i29 & 71;
                int i31 = i30 + ((i29 ^ 71) | i30);
                f52285a = i31 % 128;
                if (i31 % 2 == 0) {
                    return sety;
                }
                throw null;
            }
            Class cls2 = (Class) objArr[0];
            int i32 = f52286b;
            int i33 = (i32 | 25) << 1;
            int i34 = -((i32 & (-26)) | ((~i32) & 25));
            int i35 = (i33 & i34) + (i33 | i34);
            f52285a = i35 % 128;
            int i36 = i35 % 2;
            int i37 = i32 + 123;
            f52285a = i37 % 128;
            int i38 = i37 % 2;
            Class superclass = cls2;
            while (superclass != null) {
                int i39 = f52285a;
                int i40 = (i39 ^ 73) + ((i39 & 73) << 1);
                f52286b = i40 % 128;
                if (i40 % 2 == 0) {
                    Intrinsics.areEqual(superclass.getSimpleName(), "OpenSSLSocketImpl");
                    throw null;
                }
                if (Intrinsics.areEqual(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                    break;
                }
                int i41 = f52286b;
                int i42 = (((i41 | 84) << 1) - (i41 ^ 84)) - 1;
                f52285a = i42 % 128;
                if (i42 % 2 != 0) {
                    superclass.getSuperclass();
                    throw null;
                }
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError(Intrinsics.stringPlus("No OpenSSLSocketImpl superclass of socket of type ", cls2));
                }
            }
            Intrinsics.checkNotNull(superclass);
            abe abeVar = new abe(superclass);
            int i43 = f52285a;
            int i44 = (i43 ^ 79) + ((i43 & 79) << 1);
            f52286b = i44 % 128;
            if (i44 % 2 != 0) {
                return abeVar;
            }
            int i45 = 36 / 0;
            return abeVar;
        }

        @NotNull
        public static abi.setY setCompoundDrawableTintBlendMode(@NotNull String p4) {
            return (abi.setY) setY(new Object[]{p4}, 2054365269, -2054365268, (int) System.currentTimeMillis());
        }

        /* JADX INFO: renamed from: com.mypinpad.tsdk.i.abe$setY$setY, reason: collision with other inner class name */
        public static final class C0233setY implements abi.setY {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static int f52287b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static int f52288c = 1;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ String f52289a;

            public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
                boolean zStartsWith$default;
                int i13 = (i11 * (-864)) + (i10 * 866);
                int i14 = ~i11;
                int i15 = ~i10;
                int i16 = ~i12;
                if ((((~(i10 | i16)) | (~(i14 | i16))) * 865) + ((~(i12 | i10)) * 865) + (((~(i15 | i16)) | i14) * (-865)) + i13 != 1) {
                    SSLSocket sSLSocket = (SSLSocket) objArr[1];
                    int i17 = f52288c + 93;
                    f52287b = i17 % 128;
                    int i18 = i17 % 2;
                    Intrinsics.checkNotNullParameter(sSLSocket, "");
                    Companion companion = abe.INSTANCE;
                    abe abeVar = (abe) Companion.setY(new Object[]{sSLSocket.getClass()}, -1816300929, 1816300932, (int) System.currentTimeMillis());
                    int i19 = f52287b;
                    int i20 = (i19 ^ 77) + ((i19 & 77) << 1);
                    f52288c = i20 % 128;
                    int i21 = i20 % 2;
                    return abeVar;
                }
                C0233setY c0233setY = (C0233setY) objArr[0];
                SSLSocket sSLSocket2 = (SSLSocket) objArr[1];
                int i22 = f52287b + 93;
                f52288c = i22 % 128;
                if (i22 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(sSLSocket2, "");
                    String name = sSLSocket2.getClass().getName();
                    Intrinsics.checkNotNullExpressionValue(name, "");
                    zStartsWith$default = l.startsWith$default(name, Intrinsics.stringPlus(c0233setY.f52289a, Constant.DOT_STRING), true, 2, null);
                } else {
                    Intrinsics.checkNotNullParameter(sSLSocket2, "");
                    String name2 = sSLSocket2.getClass().getName();
                    Intrinsics.checkNotNullExpressionValue(name2, "");
                    zStartsWith$default = l.startsWith$default(name2, Intrinsics.stringPlus(c0233setY.f52289a, Constant.DOT_STRING), false, 2, null);
                }
                return Boolean.valueOf(zStartsWith$default);
            }

            @Override // com.mypinpad.tsdk.i.abi.setY
            public final boolean setOnFocusChangeListener(@NotNull SSLSocket sSLSocket) {
                return ((Boolean) setY(new Object[]{this, sSLSocket}, -390313719, 390313720, System.identityHashCode(this))).booleanValue();
            }

            @Override // com.mypinpad.tsdk.i.abi.setY
            @NotNull
            public final abg setY(@NotNull SSLSocket sSLSocket) {
                return (abg) setY(new Object[]{this, sSLSocket}, 1511079595, -1511079595, System.identityHashCode(this));
            }
        }
    }

    static {
        int i10 = f52279h;
        int i11 = (((i10 | 4) << 1) - (i10 ^ 4)) - 1;
        f52278g = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 86 / 0;
        }
    }

    public abe(@NotNull Class<? super SSLSocket> cls) throws NoSuchMethodException {
        Intrinsics.checkNotNullParameter(cls, "");
        this.f52280a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "");
        this.f52281b = declaredMethod;
        this.f52282c = cls.getMethod("setHostname", String.class);
        this.f52283d = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f52284e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        boolean zIsInstance;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~(i13 | i14);
        int i16 = (i15 * 446) + (((~(i10 | i14 | i12)) | (~(i11 | i13))) * 446) + (((~((~i12) | i14)) | i15) * 446) + (i11 * (-445)) + (i10 * (-445));
        if (i16 == 1) {
            abe abeVar = (abe) objArr[0];
            SSLSocket sSLSocket = (SSLSocket) objArr[1];
            int i17 = f52279h;
            int i18 = i17 ^ 87;
            int i19 = ((i17 & 87) | i18) << 1;
            int i20 = -i18;
            int i21 = (i19 & i20) + (i19 | i20);
            f52278g = i21 % 128;
            if (i21 % 2 != 0) {
                Intrinsics.checkNotNullParameter(sSLSocket, "");
                zIsInstance = abeVar.f52280a.isInstance(sSLSocket);
                int i22 = 75 / 0;
            } else {
                Intrinsics.checkNotNullParameter(sSLSocket, "");
                zIsInstance = abeVar.f52280a.isInstance(sSLSocket);
            }
            return Boolean.valueOf(zIsInstance);
        }
        String str = null;
        if (i16 == 2) {
            abe abeVar2 = (abe) objArr[0];
            SSLSocket sSLSocket2 = (SSLSocket) objArr[1];
            int i23 = f52278g;
            int i24 = i23 & 41;
            int i25 = i24 + ((i23 ^ 41) | i24);
            f52279h = i25 % 128;
            int i26 = i25 % 2;
            Intrinsics.checkNotNullParameter(sSLSocket2, "");
            if (!((Boolean) setCompoundDrawableTintBlendMode(new Object[]{abeVar2, sSLSocket2}, 546101956, -546101955, System.identityHashCode(abeVar2))).booleanValue()) {
                int i27 = f52278g;
                int i28 = i27 & 91;
                int i29 = (i27 ^ 91) | i28;
                int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                f52279h = i30 % 128;
                if (i30 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            try {
                byte[] bArr = (byte[]) abeVar2.f52283d.invoke(sSLSocket2, new Object[0]);
                if (bArr == null) {
                    int i31 = f52279h;
                    int i32 = i31 ^ 93;
                    int i33 = (i31 & 93) << 1;
                    int i34 = (i32 ^ i33) + ((i32 & i33) << 1);
                    f52278g = i34 % 128;
                    if (i34 % 2 != 0) {
                        throw null;
                    }
                    int i35 = i31 + 67;
                    f52278g = i35 % 128;
                    int i36 = i35 % 2;
                } else {
                    String str2 = new String(bArr, Charsets.UTF_8);
                    int i37 = f52278g + 41;
                    f52279h = i37 % 128;
                    int i38 = i37 % 2;
                    str = str2;
                }
                int i39 = f52279h;
                int i40 = (i39 | 77) << 1;
                int i41 = -(i39 ^ 77);
                int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
                f52278g = i42 % 128;
                int i43 = i42 % 2;
            } catch (IllegalAccessException e5) {
                throw new AssertionError(e5);
            } catch (InvocationTargetException e7) {
                Throwable cause = e7.getCause();
                if (!(cause instanceof NullPointerException) || !Intrinsics.areEqual(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e7);
                }
                int i44 = f52278g;
                int i45 = (i44 & 27) + (i44 | 27);
                f52279h = i45 % 128;
                int i46 = i45 % 2;
            }
            int i47 = f52279h;
            int i48 = i47 ^ 17;
            int i49 = -(-((i47 & 17) << 1));
            int i50 = ((i48 | i49) << 1) - (i49 ^ i48);
            f52278g = i50 % 128;
            if (i50 % 2 == 0) {
                return str;
            }
            int i51 = 89 / 0;
            return str;
        }
        if (i16 == 3) {
            int i52 = f52278g;
            int i53 = i52 ^ 111;
            int i54 = ((i52 & 111) | i53) << 1;
            int i55 = -i53;
            int i56 = (i54 ^ i55) + ((i54 & i55) << 1);
            f52279h = i56 % 128;
            if (i56 % 2 == 0) {
                aas.Companion companion = aas.INSTANCE;
                ((Boolean) aas.Companion.setCompoundDrawableTintBlendMode(new Object[0], -363481289, 363481289, (int) System.currentTimeMillis())).booleanValue();
                throw null;
            }
            aas.Companion companion2 = aas.INSTANCE;
            boolean zBooleanValue = ((Boolean) aas.Companion.setCompoundDrawableTintBlendMode(new Object[0], -363481289, 363481289, (int) System.currentTimeMillis())).booleanValue();
            int i57 = f52279h;
            int i58 = (i57 & (-60)) | ((~i57) & 59);
            int i59 = (i57 & 59) << 1;
            int i60 = (i58 ^ i59) + ((i59 & i58) << 1);
            f52278g = i60 % 128;
            if (i60 % 2 == 0) {
                return Boolean.valueOf(zBooleanValue);
            }
            throw null;
        }
        if (i16 != 4) {
            int i61 = f52278g;
            int i62 = i61 & 71;
            int i63 = -(-((i61 ^ 71) | i62));
            int i64 = (i62 & i63) + (i62 | i63);
            f52279h = i64 % 128;
            if (i64 % 2 == 0) {
                throw null;
            }
            int i65 = (i61 ^ 25) + ((i61 & 25) << 1);
            f52279h = i65 % 128;
            int i66 = i65 % 2;
            return f52277f;
        }
        abe abeVar3 = (abe) objArr[0];
        SSLSocket sSLSocket3 = (SSLSocket) objArr[1];
        String str3 = (String) objArr[2];
        List list = (List) objArr[3];
        int i67 = f52278g;
        int i68 = (i67 ^ 119) + ((i67 & 119) << 1);
        f52279h = i68 % 128;
        int i69 = i68 % 2;
        Intrinsics.checkNotNullParameter(sSLSocket3, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (!((Boolean) setCompoundDrawableTintBlendMode(new Object[]{abeVar3, sSLSocket3}, 546101956, -546101955, System.identityHashCode(abeVar3))).booleanValue()) {
            int i70 = f52279h;
            int i71 = i70 ^ 113;
            int i72 = ((i70 & 113) | i71) << 1;
            int i73 = -i71;
            int i74 = ((i72 | i73) << 1) - (i72 ^ i73);
            f52278g = i74 % 128;
            if (i74 % 2 == 0) {
                return null;
            }
            throw null;
        }
        int i75 = f52278g;
        int i76 = i75 & 49;
        int i77 = i75 | 49;
        int i78 = (i76 & i77) + (i77 | i76);
        f52279h = i78 % 128;
        int i79 = i78 % 2;
        try {
            abeVar3.f52281b.invoke(sSLSocket3, Boolean.TRUE);
            if (str3 != null) {
                int i80 = f52278g;
                int i81 = i80 & 67;
                int i82 = i80 | 67;
                int i83 = (i81 ^ i82) + ((i82 & i81) << 1);
                f52279h = i83 % 128;
                int i84 = i83 % 2;
                Method method = abeVar3.f52282c;
                if (i84 == 0) {
                    Object[] objArr2 = new Object[0];
                    objArr2[1] = str3;
                    method.invoke(sSLSocket3, objArr2);
                } else {
                    method.invoke(sSLSocket3, str3);
                }
                int i85 = f52279h;
                int i86 = i85 & 121;
                int i87 = ((i85 ^ 121) | i86) << 1;
                int i88 = -((i85 | 121) & (~i86));
                int i89 = ((i87 | i88) << 1) - (i88 ^ i87);
                f52278g = i89 % 128;
                int i90 = i89 % 2;
            }
            Method method2 = abeVar3.f52284e;
            aaw.setOnFocusChangeListener setonfocuschangelistener = aaw.setCompoundDrawableTintBlendMode;
            method2.invoke(sSLSocket3, (byte[]) aaw.setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{list}, -1475766957, 1475766964, (int) System.currentTimeMillis()));
            int i91 = f52278g;
            int i92 = (i91 & (-104)) | ((~i91) & 103);
            int i93 = -(-((i91 & 103) << 1));
            int i94 = (i92 ^ i93) + ((i93 & i92) << 1);
            f52279h = i94 % 128;
            int i95 = i94 % 2;
            return null;
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError(e11);
        }
    }

    public static final /* synthetic */ abi.setY setDividerPadding() {
        return (abi.setY) setCompoundDrawableTintBlendMode(new Object[0], 270266845, -270266845, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.abg
    public final boolean setOnFocusChangeListener(@NotNull SSLSocket p4) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, p4}, 546101956, -546101955, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.abg
    @Nullable
    public final String setX(@NotNull SSLSocket p4) {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this, p4}, 644876488, -644876486, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.abg
    public final void setY(@NotNull SSLSocket p4, @Nullable String p10, @NotNull List<? extends yi> p11) {
        setCompoundDrawableTintBlendMode(new Object[]{this, p4, p10, p11}, -520835807, 520835811, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.abg
    public final boolean setOnFocusChangeListener() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, 743157246, -743157243, System.identityHashCode(this))).booleanValue();
    }
}
