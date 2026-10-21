package com.mypinpad.tsdk.isolation;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\r"}, d2 = {"Lcom/mypinpad/tsdk/i/aaz;", "Lcom/mypinpad/tsdk/i/aaw;", "Ljavax/net/ssl/SSLSocket;", "p0", "", "p1", "", "Lcom/mypinpad/tsdk/i/yi;", "Lkotlin/jvm/JvmSuppressWildcards;", "p2", "", "setX", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "<init>", "()V", "setDividerPadding"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class aaz extends aaw {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f52259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f52260f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f52261g = 1;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.aaz$setDividerPadding, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/aaz$setDividerPadding;", "", "Lcom/mypinpad/tsdk/i/aaz;", "setCompoundDrawableTintBlendMode", "()Lcom/mypinpad/tsdk/i/aaz;", "<init>", "()V"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f52262a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f52263b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public static aaz setCompoundDrawableTintBlendMode() {
            return (aaz) setY(new Object[0], -715893696, 715893696, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            boolean zBooleanValue;
            int i13 = (i11 * (-475)) + (i10 * 477);
            int i14 = ~((~i10) | i11);
            int i15 = ~i11;
            int i16 = ~(i15 | i10 | i12);
            if (((~((~i12) | i15 | i10)) * 476) + (i16 * 952) + ((i14 | i16) * (-476)) + i13 == 1) {
                int i17 = f52262a;
                int i18 = i17 & 67;
                int i19 = (((i17 ^ 67) | i18) << 1) - ((i17 | 67) & (~i18));
                f52263b = i19 % 128;
                if (i19 % 2 == 0) {
                    zBooleanValue = ((Boolean) aaz.setY(new Object[0], 1378141257, -1378141257, (int) System.currentTimeMillis())).booleanValue();
                    int i20 = 19 / 0;
                } else {
                    zBooleanValue = ((Boolean) aaz.setY(new Object[0], 1378141257, -1378141257, (int) System.currentTimeMillis())).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            }
            int i21 = f52262a;
            int i22 = i21 & 45;
            int i23 = -(-((i21 ^ 45) | i22));
            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
            f52263b = i24 % 128;
            int i25 = i24 % 2;
            Object[] objArr2 = new Object[0];
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (i25 == 0) {
                ((Boolean) setY(objArr2, -2034082594, 2034082595, (int) jCurrentTimeMillis)).booleanValue();
                throw null;
            }
            if (!((Boolean) setY(objArr2, -2034082594, 2034082595, (int) jCurrentTimeMillis)).booleanValue()) {
                int i26 = f52262a + 15;
                f52263b = i26 % 128;
                if (i26 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            aaz aazVar = new aaz();
            int i27 = f52263b;
            int i28 = i27 & 85;
            int i29 = -(-(i27 | 85));
            int i30 = (i28 & i29) + (i29 | i28);
            f52262a = i30 % 128;
            if (i30 % 2 == 0) {
                return aazVar;
            }
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Integer intOrNull = null;
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            int i10 = f52260f;
            int i11 = (i10 & (-82)) | ((~i10) & 81);
            int i12 = (i10 & 81) << 1;
            int i13 = (i11 & i12) + (i12 | i11);
            f52261g = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
        } else {
            intOrNull = k.toIntOrNull(property);
            int i14 = f52261g;
            int i15 = (((i14 & (-18)) | ((~i14) & 17)) - (~(-(-((i14 & 17) << 1))))) - 1;
            f52260f = i15 % 128;
            int i16 = i15 % 2;
        }
        boolean z10 = false;
        if (intOrNull != null) {
            int i17 = f52260f;
            int i18 = ((i17 | 23) << 1) - (i17 ^ 23);
            f52261g = i18 % 128;
            int i19 = i18 % 2;
            if (intOrNull.intValue() >= 9) {
                int i20 = f52260f;
                int i21 = ((i20 ^ 99) | (i20 & 99)) << 1;
                int i22 = -(((~i20) & 99) | (i20 & (-100)));
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                int i24 = i23 % 128;
                f52261g = i24;
                int i25 = i23 % 2;
                int i26 = i24 | 49;
                int i27 = (i26 << 1) - ((~(i24 & 49)) & i26);
                f52260f = i27 % 128;
                int i28 = i27 % 2;
                z10 = true;
            } else {
                int i29 = f52260f;
                int i30 = i29 ^ 49;
                int i31 = (((i29 & 49) | i30) << 1) - i30;
                f52261g = i31 % 128;
                int i32 = i31 % 2;
            }
        } else {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
                int i33 = f52261g;
                int i34 = (i33 & (-6)) | ((~i33) & 5);
                int i35 = (i33 & 5) << 1;
                int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                f52260f = i36 % 128;
                int i37 = i36 % 2;
                z10 = true;
            } catch (NoSuchMethodException unused) {
            }
            int i38 = f52261g;
            int i39 = i38 & 27;
            int i40 = i39 + ((i38 ^ 27) | i39);
            f52260f = i40 % 128;
            int i41 = i40 % 2;
        }
        f52259e = z10;
        int i42 = f52261g;
        int i43 = i42 & 89;
        int i44 = (i42 ^ 89) | i43;
        int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
        f52260f = i45 % 128;
        int i46 = i45 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0141, code lost:
    
        if (r8 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0165, code lost:
    
        if (r8 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0167, code lost:
    
        r11.setApplicationProtocols((java.lang.String[]) r8);
        r10.setSSLParameters(r11);
        r8 = com.mypinpad.tsdk.isolation.aaz.f52261g;
        r10 = (r8 & 49) + (r8 | 49);
        com.mypinpad.tsdk.isolation.aaz.f52260f = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x017b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0183, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setY(java.lang.Object[] r8, int r9, int r10, int r11) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aaz.setY(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // com.mypinpad.tsdk.isolation.aaw
    @Nullable
    public final String setX(@NotNull SSLSocket p4) {
        return (String) setY(new Object[]{this, p4}, 1180687175, -1180687173, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aaw
    public final void setX(@NotNull SSLSocket p4, @Nullable String p10, @NotNull List<yi> p11) {
        setY(new Object[]{this, p4, p10, p11}, 14663189, -14663188, System.identityHashCode(this));
    }
}
