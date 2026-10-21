package com.mypinpad.tsdk.isolation;

import android.os.Build;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0002\t\u0010B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ4\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\f2\u0011\u0010\u0007\u001a\r\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0010\u0010\u0012J\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0010\u0010\u0014J!\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\t\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\t\u0010\u0018J\u0017\u0010\u0015\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u0015\u0010\u001bJ\u0017\u0010\t\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\t\u0010\u001d"}, d2 = {"Lcom/mypinpad/tsdk/i/aas;", "Lcom/mypinpad/tsdk/i/aaw;", "Ljava/net/Socket;", "p0", "Ljava/net/InetSocketAddress;", "p1", "", "p2", "", "setY", "(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V", "Ljavax/net/ssl/SSLSocket;", "", "", "Lcom/mypinpad/tsdk/i/yi;", "Lkotlin/jvm/JvmSuppressWildcards;", "setX", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "", "(Ljava/lang/String;)Ljava/lang/Object;", "setDividerPadding", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "(Ljava/lang/String;)Z", "Ljavax/net/ssl/X509TrustManager;", "Lcom/mypinpad/tsdk/i/abo;", "(Ljavax/net/ssl/X509TrustManager;)Lcom/mypinpad/tsdk/i/abo;", "Lcom/mypinpad/tsdk/i/abt;", "(Ljavax/net/ssl/X509TrustManager;)Lcom/mypinpad/tsdk/i/abt;", "<init>", "()V"}, k = 1, mv = {1, 6, 0})
public final class aas extends aaw {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f52206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f52207h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f52208i = 1;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ArrayList f52209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final abf f52210f;

    /* JADX WARN: Code duplicated, block: B:12:0x017b  */
    /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
    static {
        boolean z10;
        int i10;
        int i11;
        int i12;
        if (((Boolean) aaw.setOnFocusChangeListener.setOnFocusChangeListener(new Object[0], -662658218, 662658220, (int) System.currentTimeMillis())).booleanValue()) {
            if (Build.VERSION.SDK_INT >= 30) {
                int i13 = f52208i;
                int i14 = ((i13 & (-70)) | ((~i13) & 69)) + ((i13 & 69) << 1);
                int i15 = i14 % 128;
                f52207h = i15;
                int i16 = i14 % 2;
                int i17 = (i15 & (-72)) | ((~i15) & 71);
                int i18 = (i15 & 71) << 1;
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                f52208i = i19 % 128;
                int i20 = i19 % 2;
            } else {
                int i21 = f52208i;
                int i22 = i21 & 75;
                int i23 = (i21 ^ 75) | i22;
                int i24 = (i22 & i23) + (i22 | i23);
                f52207h = i24 % 128;
                int i25 = i24 % 2;
                int i26 = (((i21 | 65) << 1) - (~(-((i21 & (-66)) | ((~i21) & 65))))) - 1;
                f52207h = i26 % 128;
                int i27 = i26 % 2;
                int i28 = (i21 & (-6)) | ((~i21) & 5);
                int i29 = (i21 & 5) << 1;
                int i30 = (i28 & i29) + (i29 | i28);
                f52207h = i30 % 128;
                int i31 = i30 % 2;
                z10 = true;
            }
            f52206g = z10;
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i32 = ~iCurrentTimeMillis;
            int i33 = (~iCurrentTimeMillis) | iCurrentTimeMillis;
            int i34 = i32 & i33;
            int i35 = (-1635135588) & i34;
            int i36 = ~(((i34 | (-1635135588)) & (~i35)) | i35);
            int i37 = (-592523465) & iCurrentTimeMillis;
            int i38 = (~i37) & ((-592523465) | iCurrentTimeMillis);
            int i39 = ~((i37 & i38) | (i38 ^ i37));
            int i40 = ((i36 & i39) | (i36 ^ i39)) * 333;
            int i41 = (((-2033476949) ^ i40) | ((-2033476949) & i40)) << 1;
            int i42 = -((i40 & 2033476948) | ((-2033476949) & (~i40)));
            int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
            int i44 = ~(iCurrentTimeMillis | (-1635135588));
            int i45 = i32 & i33;
            int i46 = i45 & (-592523465);
            int i47 = ~(((i45 | (-592523465)) & (~i46)) | i46);
            int i48 = ((~i47) & i44) | ((~i44) & i47);
            int i49 = i44 & i47;
            int i50 = ((i49 & i48) | (i48 ^ i49)) * 333;
            i10 = (((~i50) & i43) | ((~i43) & i50)) + ((i50 & i43) << 1);
            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
            int i51 = iCurrentTimeMillis2 ^ 67504131;
            int i52 = iCurrentTimeMillis2 & 67504131;
            int i53 = -(~(-(-(((i51 & i52) | (i51 ^ i52)) * 988))));
            int i54 = ((1070690791 ^ i53) + ((i53 & 1070690791) << 1)) - 1;
            int i55 = ~iCurrentTimeMillis2;
            int i56 = ((-1141296260) & i55) | ((~i55) & 1141296259);
            int i57 = i55 & 1141296259;
            int i58 = (i57 & i56) | (i56 ^ i57);
            int i59 = (i58 | (~i58)) & (~i58);
            int i60 = (-1308023940) & i59;
            int i61 = (((i59 | (-1308023940)) & (~i60)) | i60) * (-1976);
            int i62 = i54 & i61;
            i11 = (i62 - (~(-(-((i61 ^ i54) | i62))))) - 1;
            int i63 = 234231811 & iCurrentTimeMillis2;
            int i64 = ((234231811 | iCurrentTimeMillis2) & (~i63)) | i63;
            int i65 = (i64 | (~i64)) & (~i64);
            int i66 = 67504131 & i65;
            int i67 = (67504131 | i65) & (~i66);
            int i68 = (i67 & i66) | (i67 ^ i66);
            int i69 = ~iCurrentTimeMillis2;
            int i70 = ~((i69 & (-234231812)) | (i69 ^ (-234231812)));
            int i71 = i68 ^ i70;
            int i72 = i70 & i68;
            i12 = ((i72 & i71) | (i71 ^ i72)) * 988;
            if (i10 <= ((i11 | i12) << 1) - (i12 ^ i11)) {
                int i73 = 60 / 0;
            }
        }
        int i74 = f52207h + 97;
        int i75 = i74 % 128;
        f52208i = i75;
        int i76 = i74 % 2;
        int i77 = i75 & 83;
        int i78 = (((i75 ^ 83) | i77) << 1) - ((i75 | 83) & (~i77));
        f52207h = i78 % 128;
        int i79 = i78 % 2;
        z10 = false;
        f52206g = z10;
        int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
        int i310 = ~iCurrentTimeMillis3;
        int i311 = (~iCurrentTimeMillis3) | iCurrentTimeMillis3;
        int i312 = i310 & i311;
        int i313 = (-1635135588) & i312;
        int i314 = ~(((i312 | (-1635135588)) & (~i313)) | i313);
        int i315 = (-592523465) & iCurrentTimeMillis3;
        int i316 = (~i315) & ((-592523465) | iCurrentTimeMillis3);
        int i317 = ~((i315 & i316) | (i316 ^ i315));
        int i410 = ((i314 & i317) | (i314 ^ i317)) * 333;
        int i411 = (((-2033476949) ^ i410) | ((-2033476949) & i410)) << 1;
        int i412 = -((i410 & 2033476948) | ((-2033476949) & (~i410)));
        int i413 = ((i411 | i412) << 1) - (i412 ^ i411);
        int i414 = ~(iCurrentTimeMillis3 | (-1635135588));
        int i415 = i310 & i311;
        int i416 = i415 & (-592523465);
        int i417 = ~(((i415 | (-592523465)) & (~i416)) | i416);
        int i418 = ((~i417) & i414) | ((~i414) & i417);
        int i419 = i414 & i417;
        int i510 = ((i419 & i418) | (i418 ^ i419)) * 333;
        i10 = (((~i510) & i413) | ((~i413) & i510)) + ((i510 & i413) << 1);
        int iCurrentTimeMillis4 = (int) System.currentTimeMillis();
        int i511 = iCurrentTimeMillis4 ^ 67504131;
        int i512 = iCurrentTimeMillis4 & 67504131;
        int i513 = -(~(-(-(((i511 & i512) | (i511 ^ i512)) * 988))));
        int i514 = ((1070690791 ^ i513) + ((i513 & 1070690791) << 1)) - 1;
        int i515 = ~iCurrentTimeMillis4;
        int i516 = ((-1141296260) & i515) | ((~i515) & 1141296259);
        int i517 = i515 & 1141296259;
        int i518 = (i517 & i516) | (i516 ^ i517);
        int i519 = (i518 | (~i518)) & (~i518);
        int i610 = (-1308023940) & i519;
        int i611 = (((i519 | (-1308023940)) & (~i610)) | i610) * (-1976);
        int i612 = i514 & i611;
        i11 = (i612 - (~(-(-((i611 ^ i514) | i612))))) - 1;
        int i613 = 234231811 & iCurrentTimeMillis4;
        int i614 = ((234231811 | iCurrentTimeMillis4) & (~i613)) | i613;
        int i615 = (i614 | (~i614)) & (~i614);
        int i616 = 67504131 & i615;
        int i617 = (67504131 | i615) & (~i616);
        int i618 = (i617 & i616) | (i617 ^ i616);
        int i619 = ~iCurrentTimeMillis4;
        int i710 = ~((i619 & (-234231812)) | (i619 ^ (-234231812)));
        int i711 = i618 ^ i710;
        int i712 = i710 & i618;
        i12 = ((i712 & i711) | (i711 ^ i712)) * 988;
        if (i10 <= ((i11 | i12) << 1) - (i12 ^ i11)) {
            int i713 = 60 / 0;
        }
    }

    public aas() {
        abh.Companion companion = abh.INSTANCE;
        abe.Companion sety = abe.INSTANCE;
        abj.Companion companion2 = abj.INSTANCE;
        abd.Companion companion3 = abd.INSTANCE;
        List listListOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new abg[]{(abg) abh.Companion.setOnFocusChangeListener(new Object[0], -1619128344, 1619128345, (int) System.currentTimeMillis()), new abi((abi.setY) abe.Companion.setY(new Object[0], -197381198, 197381198, (int) System.currentTimeMillis())), new abi((abi.setY) abj.Companion.setY(new Object[0], -962127528, 962127528, (int) System.currentTimeMillis())), new abi((abi.setY) abd.Companion.setOnFocusChangeListener(new Object[0], 335602431, -335602431, (int) System.currentTimeMillis()))});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOfNotNull) {
            if (((abg) obj).setOnFocusChangeListener()) {
                arrayList.add(obj);
            }
        }
        this.f52209e = arrayList;
        abf.Companion companion4 = abf.INSTANCE;
        this.f52210f = (abf) abf.Companion.setDividerPadding(new Object[0], -1832712743, 1832712743, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0238  */
    /* JADX WARN: Code restructure failed: missing block: B:127:?, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0369, code lost:
    
        if (r13 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0380, code lost:
    
        if (r13 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0382, code lost:
    
        r13 = com.mypinpad.tsdk.isolation.aas.f52208i;
        r14 = r13 & 23;
        r13 = ((r13 | 23) & (~r14)) + (r14 << 1);
        com.mypinpad.tsdk.isolation.aas.f52207h = r13 % 128;
        r13 = r13 % 2;
        r11 = super.setDividerPadding(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0395, code lost:
    
        if (r13 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0397, code lost:
    
        r12 = 58 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x039c, code lost:
    
        r11 = com.mypinpad.tsdk.isolation.aas.f52208i + 79;
        com.mypinpad.tsdk.isolation.aas.f52207h = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x03a5, code lost:
    
        if ((r11 % 2) != 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x03aa, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setY(java.lang.Object[] r11, int r12, int r13, int r14) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1126
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aas.setY(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // com.mypinpad.tsdk.isolation.aaw
    @Nullable
    public final Object setX(@NotNull String p4) {
        return setY(new Object[]{this, p4}, 304987177, -304987174, System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.aas$setY, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/mypinpad/tsdk/i/aas$setY;", "", "Lcom/mypinpad/tsdk/i/aaw;", "setCompoundDrawableTintBlendMode", "()Lcom/mypinpad/tsdk/i/aaw;", "", "setDividerPadding", "Z", "setX", "()Z", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f52215a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f52216b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i12;
            int i14 = (((~(i13 | i11)) | (~((~i10) | i11))) * 560) + ((~(i12 | (~i11) | i10)) * (-560)) + ((~(i13 | i10)) * (-560)) + (i11 * 561) + (i10 * (-559));
            aas aasVar = null;
            if (i14 != 1) {
                int i15 = f52215a;
                int i16 = (i15 & (-50)) | ((~i15) & 49);
                int i17 = (i15 & 49) << 1;
                int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                f52216b = i18 % 128;
                int i19 = i18 % 2;
                boolean zBooleanValue = ((Boolean) aas.setY(new Object[0], -2030333580, 2030333585, (int) System.currentTimeMillis())).booleanValue();
                int i20 = f52216b;
                int i21 = (i20 & 117) + (i20 | 117);
                f52215a = i21 % 128;
                if (i21 % 2 == 0) {
                    return Boolean.valueOf(zBooleanValue);
                }
                throw null;
            }
            int i22 = f52215a;
            int i23 = i22 & 13;
            int i24 = ((i22 | 13) & (~i23)) + (i23 << 1);
            f52216b = i24 % 128;
            if (i24 % 2 == 0) {
                ((Boolean) setCompoundDrawableTintBlendMode(new Object[0], -363481289, 363481289, (int) System.currentTimeMillis())).booleanValue();
                throw null;
            }
            if (((Boolean) setCompoundDrawableTintBlendMode(new Object[0], -363481289, 363481289, (int) System.currentTimeMillis())).booleanValue()) {
                aasVar = new aas();
                int i25 = f52216b;
                int i26 = i25 | 73;
                int i27 = ((i26 << 1) - (~(-((~(i25 & 73)) & i26)))) - 1;
                f52215a = i27 % 128;
                int i28 = i27 % 2;
            } else {
                int i29 = f52215a;
                int i30 = (i29 & 81) + (i29 | 81);
                f52216b = i30 % 128;
                if (i30 % 2 == 0) {
                    throw null;
                }
            }
            return aasVar;
        }

        @JvmName(name = "setX")
        public static boolean setX() {
            return ((Boolean) setCompoundDrawableTintBlendMode(new Object[0], -363481289, 363481289, (int) System.currentTimeMillis())).booleanValue();
        }

        @Nullable
        public static aaw setCompoundDrawableTintBlendMode() {
            return (aaw) setCompoundDrawableTintBlendMode(new Object[0], -315912774, 315912775, (int) System.currentTimeMillis());
        }
    }

    @Override // com.mypinpad.tsdk.isolation.aaw
    @NotNull
    public final abo setDividerPadding(@NotNull X509TrustManager p4) {
        return (abo) setY(new Object[]{this, p4}, -802927796, 802927798, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aaw
    @Nullable
    public final String setX(@NotNull SSLSocket p4) {
        return (String) setY(new Object[]{this, p4}, 869970965, -869970964, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aaw
    public final void setDividerPadding(@NotNull String p4, @Nullable Object p10) throws IOException {
        setY(new Object[]{this, p4, p10}, -543217206, 543217212, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aaw
    public final void setX(@NotNull SSLSocket p4, @Nullable String p10, @NotNull List<yi> p11) throws IOException {
        setY(new Object[]{this, p4, p10, p11}, 1601097611, -1601097604, System.identityHashCode(this));
    }

    public static final class setX implements abt {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f52211c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f52212d = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final X509TrustManager f52213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Method f52214b;

        public setX(@NotNull X509TrustManager x509TrustManager, @NotNull Method method) {
            Intrinsics.checkNotNullParameter(x509TrustManager, "");
            Intrinsics.checkNotNullParameter(method, "");
            this.f52213a = x509TrustManager;
            this.f52214b = method;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
        
            if (r10 == r9) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
        
            if (r10 == r9) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        
            r2 = r2 + 59;
            com.mypinpad.tsdk.i.aas.setX.f52211c = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
        
            if ((r2 % 2) == 0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
        
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
        
            if ((r9 instanceof com.mypinpad.tsdk.i.aas.setX) != false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
        
            r9 = (r2 ^ 53) + ((r2 & 53) << 1);
            r10 = r9 % 128;
            com.mypinpad.tsdk.i.aas.setX.f52211c = r10;
            r9 = r9 % 2;
            r10 = r10 + 5;
            com.mypinpad.tsdk.i.aas.setX.f52212d = r10 % 128;
            r10 = r10 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
        
            r9 = (com.mypinpad.tsdk.i.aas.setX) r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r10.f52213a, r9.f52213a) == true) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
        
            r9 = com.mypinpad.tsdk.i.aas.setX.f52211c;
            r10 = r9 & 65;
            r11 = -(-((r9 ^ 65) | r10));
            r1 = ((r10 | r11) << 1) - (r10 ^ r11);
            com.mypinpad.tsdk.i.aas.setX.f52212d = r1 % 128;
            r1 = r1 % 2;
            r11 = r9 & 99;
            r10 = ((r9 ^ 99) | r11) << 1;
            r9 = -((r9 | 99) & (~r11));
            r11 = (r10 ^ r9) + ((r9 & r10) << 1);
            com.mypinpad.tsdk.i.aas.setX.f52212d = r11 % 128;
            r11 = r11 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00b2, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r10.f52214b, r9.f52214b) == true) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
        
            r9 = com.mypinpad.tsdk.i.aas.setX.f52211c;
            r10 = (r9 & 81) + (r9 | 81);
            com.mypinpad.tsdk.i.aas.setX.f52212d = r10 % 128;
            r10 = r10 % 2;
            r9 = r9 + 123;
            com.mypinpad.tsdk.i.aas.setX.f52212d = r9 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00c7, code lost:
        
            if ((r9 % 2) == 0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00ca, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00cb, code lost:
        
            r9 = com.mypinpad.tsdk.i.aas.setX.f52211c;
            r10 = r9 & 123;
            r9 = -(-((r9 ^ 123) | r10));
            r11 = ((r10 | r9) << 1) - (r9 ^ r10);
            com.mypinpad.tsdk.i.aas.setX.f52212d = r11 % 128;
            r11 = r11 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
        
            return java.lang.Boolean.valueOf(r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
        
            return java.lang.Boolean.FALSE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
        
            return java.lang.Boolean.TRUE;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ java.lang.Object setCompoundDrawableTintBlendMode(java.lang.Object[] r9, int r10, int r11, int r12) {
            /*
                Method dump skipped, instruction units count: 576
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.aas.setX.setCompoundDrawableTintBlendMode(java.lang.Object[], int, int, int):java.lang.Object");
        }

        public final boolean equals(@Nullable Object obj) {
            return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, obj}, 1602142356, -1602142356, System.identityHashCode(this))).booleanValue();
        }

        public final int hashCode() {
            return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 1265171494, -1265171493, System.identityHashCode(this))).intValue();
        }

        @NotNull
        public final String toString() {
            return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -859539931, 859539933, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.abt
        @Nullable
        public final X509Certificate setCompoundDrawableTintBlendMode(@NotNull X509Certificate x509Certificate) {
            return (X509Certificate) setCompoundDrawableTintBlendMode(new Object[]{this, x509Certificate}, -6414075, 6414078, System.identityHashCode(this));
        }
    }

    @Override // com.mypinpad.tsdk.isolation.aaw
    @NotNull
    public final abt setY(@NotNull X509TrustManager p4) {
        return (abt) setY(new Object[]{this, p4}, -1294534633, 1294534637, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aaw
    public final boolean setY(@NotNull String p4) {
        return ((Boolean) setY(new Object[]{this, p4}, 1985190193, -1985190193, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aaw
    public final void setY(@NotNull Socket p4, @NotNull InetSocketAddress p10, int p11) throws IOException {
        setY(new Object[]{this, p4, p10, Integer.valueOf(p11)}, -410908426, 410908434, p11);
    }
}
