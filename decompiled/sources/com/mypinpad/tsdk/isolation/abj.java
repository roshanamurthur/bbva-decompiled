package com.mypinpad.tsdk.isolation;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0011"}, d2 = {"Lcom/mypinpad/tsdk/i/abj;", "Lcom/mypinpad/tsdk/i/abg;", "Ljavax/net/ssl/SSLSocket;", "p0", "", "p1", "", "Lcom/mypinpad/tsdk/i/yi;", "p2", "", "setY", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "setX", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "", "setOnFocusChangeListener", "()Z", "(Ljavax/net/ssl/SSLSocket;)Z", "<init>", "()V", "setDividerPadding"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class abj implements abg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f52302b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f52303c = 1;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final setOnFocusChangeListener f52301a = new setOnFocusChangeListener();

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.abj$setDividerPadding, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/abj$setDividerPadding;", "", "Lcom/mypinpad/tsdk/i/abi$setY;", "setCompoundDrawableTintBlendMode", "Lcom/mypinpad/tsdk/i/abi$setY;", "setOnFocusChangeListener", "()Lcom/mypinpad/tsdk/i/abi$setY;", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f52304a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f52305b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmName(name = "setOnFocusChangeListener")
        @NotNull
        public static abi.setY setOnFocusChangeListener() {
            return (abi.setY) setY(new Object[0], -962127528, 962127528, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            int i13 = f52305b;
            int i14 = i13 | 43;
            int i15 = i14 << 1;
            int i16 = -((~(i13 & 43)) & i14);
            int i17 = (i15 & i16) + (i16 | i15);
            f52304a = i17 % 128;
            int i18 = i17 % 2;
            abi.setY sety = (abi.setY) abj.setCompoundDrawableTintBlendMode(new Object[0], 1737889480, -1737889476, (int) System.currentTimeMillis());
            int i19 = f52304a + 101;
            f52305b = i19 % 128;
            if (i19 % 2 != 0) {
                return sety;
            }
            throw null;
        }
    }

    static {
        int i10 = f52302b;
        int i11 = i10 & 95;
        int i12 = -(-((i10 ^ 95) | i11));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f52303c = i13 % 128;
        int i14 = i13 % 2;
    }

    public static /* synthetic */ Boolean a(Object[] objArr) {
        SSLSocket sSLSocket = (SSLSocket) objArr[1];
        int i10 = f52303c + 43;
        f52302b = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(sSLSocket, "");
        boolean zIsConscrypt = Conscrypt.isConscrypt(sSLSocket);
        int i12 = f52303c;
        int i13 = (((i12 | 70) << 1) - (i12 ^ 70)) - 1;
        f52302b = i13 % 128;
        if (i13 % 2 == 0) {
            return Boolean.valueOf(zIsConscrypt);
        }
        throw null;
    }

    public static /* synthetic */ String b(Object[] objArr) {
        String applicationProtocol;
        abj abjVar = (abj) objArr[0];
        SSLSocket sSLSocket = (SSLSocket) objArr[1];
        int i10 = f52303c;
        int i11 = (i10 & 13) + (i10 | 13);
        f52302b = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(sSLSocket, "");
        if (!((Boolean) setCompoundDrawableTintBlendMode(new Object[]{abjVar, sSLSocket}, -1940506611, 1940506612, System.identityHashCode(abjVar))).booleanValue()) {
            int i13 = f52302b + 87;
            f52303c = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 8 / 0;
            }
            return null;
        }
        int i15 = f52303c;
        int i16 = (i15 & (-48)) | ((~i15) & 47);
        int i17 = -(-((i15 & 47) << 1));
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        f52302b = i18 % 128;
        if (i18 % 2 != 0) {
            applicationProtocol = Conscrypt.getApplicationProtocol(sSLSocket);
            int i19 = 5 / 0;
        } else {
            applicationProtocol = Conscrypt.getApplicationProtocol(sSLSocket);
        }
        int i20 = f52302b;
        int i21 = (((i20 & (-98)) | ((~i20) & 97)) - (~((i20 & 97) << 1))) - 1;
        f52303c = i21 % 128;
        if (i21 % 2 == 0) {
            int i22 = 33 / 0;
        }
        return applicationProtocol;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 971) + (i10 * (-1939));
        int i14 = ~i11;
        int i15 = ~(i14 | i10);
        int i16 = ~((~i12) | i11);
        int i17 = ~i10;
        int i18 = (((~(i17 | i14)) | i16) * 970) + ((~(i11 | i17)) * 1940) + ((i15 | i16) * (-970)) + i13;
        if (i18 == 1) {
            return a(objArr);
        }
        if (i18 != 2) {
            if (i18 != 3) {
                if (i18 != 4) {
                    return b(objArr);
                }
                int i19 = f52302b + 73;
                f52303c = i19 % 128;
                if (i19 % 2 != 0) {
                    return f52301a;
                }
                throw null;
            }
            int i20 = f52303c;
            int i21 = i20 & 83;
            int i22 = i21 + ((i20 ^ 83) | i21);
            f52302b = i22 % 128;
            int i23 = i22 % 2;
            aau.Companion companion = aau.INSTANCE;
            boolean zBooleanValue = ((Boolean) aau.Companion.setCompoundDrawableTintBlendMode(new Object[0], -119956110, 119956111, (int) System.currentTimeMillis())).booleanValue();
            int i24 = f52303c;
            int i25 = i24 & 21;
            int i26 = (i25 - (~((i24 ^ 21) | i25))) - 1;
            f52302b = i26 % 128;
            int i27 = i26 % 2;
            return Boolean.valueOf(zBooleanValue);
        }
        abj abjVar = (abj) objArr[0];
        SSLSocket sSLSocket = (SSLSocket) objArr[1];
        List list = (List) objArr[3];
        int i28 = f52303c;
        int i29 = i28 & 103;
        int i30 = i28 | 103;
        int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
        f52302b = i31 % 128;
        int i32 = i31 % 2;
        Intrinsics.checkNotNullParameter(sSLSocket, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (((Boolean) setCompoundDrawableTintBlendMode(new Object[]{abjVar, sSLSocket}, -1940506611, 1940506612, System.identityHashCode(abjVar))).booleanValue()) {
            int i33 = f52303c;
            int i34 = i33 & 69;
            int i35 = (((i33 | 69) & (~i34)) - (~(i34 << 1))) - 1;
            f52302b = i35 % 128;
            int i36 = i35 % 2;
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            aaw.setOnFocusChangeListener setonfocuschangelistener = aaw.setCompoundDrawableTintBlendMode;
            Object[] array = ((List) aaw.setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{list}, 530048483, -530048479, (int) System.currentTimeMillis())).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
            int i37 = f52303c;
            int i38 = (((i37 | 104) << 1) - (i37 ^ 104)) - 1;
            f52302b = i38 % 128;
            int i39 = i38 % 2;
        }
        int i40 = f52302b;
        int i41 = i40 & 31;
        int i42 = (i41 - (~(-(-((i40 ^ 31) | i41))))) - 1;
        f52303c = i42 % 128;
        int i43 = i42 % 2;
        return null;
    }

    @Override // com.mypinpad.tsdk.isolation.abg
    public final boolean setOnFocusChangeListener() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, -185864718, 185864721, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.abg
    @Nullable
    public final String setX(@NotNull SSLSocket p4) {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this, p4}, 406757719, -406757719, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.abg
    public final void setY(@NotNull SSLSocket p4, @Nullable String p10, @NotNull List<? extends yi> p11) {
        setCompoundDrawableTintBlendMode(new Object[]{this, p4, p10, p11}, -1577983512, 1577983514, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.abg
    public final boolean setOnFocusChangeListener(@NotNull SSLSocket p4) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, p4}, -1940506611, 1940506612, System.identityHashCode(this))).booleanValue();
    }

    public static final class setOnFocusChangeListener implements abi.setY {
        /* JADX WARN: Code restructure failed: missing block: B:11:0x00fe, code lost:
        
            return java.lang.Boolean.TRUE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x00f7, code lost:
        
            if (r13 != false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x00fa, code lost:
        
            if (r13 != false) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ java.lang.Boolean a(java.lang.Object[] r13) {
            /*
                Method dump skipped, instruction units count: 258
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.abj.setOnFocusChangeListener.a(java.lang.Object[]):java.lang.Boolean");
        }

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * 971) + (i10 * (-1939));
            int i14 = ~i11;
            int i15 = ~(i14 | i10);
            int i16 = ~((~i12) | i11);
            int i17 = ~i10;
            int i18 = (~(i11 | i17)) * 1940;
            if ((((~(i17 | i14)) | i16) * 970) + i18 + ((i15 | i16) * (-970)) + i13 != 1) {
                return a(objArr);
            }
            Intrinsics.checkNotNullParameter((SSLSocket) objArr[1], "");
            return new abj();
        }

        @Override // com.mypinpad.tsdk.i.abi.setY
        public final boolean setOnFocusChangeListener(@NotNull SSLSocket sSLSocket) {
            return ((Boolean) setY(new Object[]{this, sSLSocket}, -1650383224, 1650383224, System.identityHashCode(this))).booleanValue();
        }

        @Override // com.mypinpad.tsdk.i.abi.setY
        @NotNull
        public final abg setY(@NotNull SSLSocket sSLSocket) {
            return (abg) setY(new Object[]{this, sSLSocket}, -309959356, 309959357, System.identityHashCode(this));
        }
    }

    public static final /* synthetic */ abi.setY setCompoundDrawableTintBlendMode() {
        return (abi.setY) setCompoundDrawableTintBlendMode(new Object[0], 1737889480, -1737889476, (int) System.currentTimeMillis());
    }
}
