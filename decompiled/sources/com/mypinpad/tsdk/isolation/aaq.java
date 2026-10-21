package com.mypinpad.tsdk.isolation;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/mypinpad/tsdk/i/aaq;", "Lcom/mypinpad/tsdk/i/aaw;", "Ljavax/net/ssl/SSLSocket;", "p0", "", "p1", "", "Lcom/mypinpad/tsdk/i/yi;", "p2", "", "setX", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "", "setY", "(Ljava/lang/String;)Z", "Ljavax/net/ssl/X509TrustManager;", "Lcom/mypinpad/tsdk/i/abo;", "setDividerPadding", "(Ljavax/net/ssl/X509TrustManager;)Lcom/mypinpad/tsdk/i/abo;", "<init>", "()V"}, k = 1, mv = {1, 6, 0})
public final class aaq extends aaw {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f52194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f52195g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f52196h = 1;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ArrayList f52197e;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.aaq$setDividerPadding, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/aaq$setDividerPadding;", "", "Lcom/mypinpad/tsdk/i/aaw;", "setX", "()Lcom/mypinpad/tsdk/i/aaw;", "<init>", "()V"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f52198a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f52199b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i11;
            int i14 = ~(i13 | i10);
            int i15 = ~i12;
            int i16 = ~(i15 | i10);
            int i17 = ((i14 | i16) * (-712)) + (i11 * 713) + (i10 * (-711));
            int i18 = ~(i13 | i15 | i10);
            if (((i13 | i16) * 712) + (((~(i10 | i11 | i12)) | i18) * (-712)) + i17 != 1) {
                int i19 = f52198a;
                int i20 = (i19 & (-64)) | ((~i19) & 63);
                int i21 = (i19 & 63) << 1;
                int i22 = (i20 & i21) + (i21 | i20);
                f52199b = i22 % 128;
                int i23 = i22 % 2;
                boolean zBooleanValue = ((Boolean) aaq.setOnFocusChangeListener(new Object[0], 1238217930, -1238217926, (int) System.currentTimeMillis())).booleanValue();
                int i24 = f52199b;
                int i25 = (((i24 & (-60)) | ((~i24) & 59)) - (~(-(-((i24 & 59) << 1))))) - 1;
                f52198a = i25 % 128;
                if (i25 % 2 != 0) {
                    int i26 = 32 / 0;
                }
                return Boolean.valueOf(zBooleanValue);
            }
            int i27 = f52199b + 11;
            f52198a = i27 % 128;
            int i28 = i27 % 2;
            if (!((Boolean) setDividerPadding(new Object[0], 1304194027, -1304194027, (int) System.currentTimeMillis())).booleanValue()) {
                int i29 = f52198a;
                int i30 = (i29 ^ 105) + ((i29 & 105) << 1);
                f52199b = i30 % 128;
                int i31 = i30 % 2;
                return null;
            }
            aaq aaqVar = new aaq();
            int i32 = f52198a;
            int i33 = i32 & 79;
            int i34 = i32 | 79;
            int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
            f52199b = i35 % 128;
            int i36 = i35 % 2;
            return aaqVar;
        }

        @Nullable
        public static aaw setX() {
            return (aaw) setDividerPadding(new Object[0], 484673849, -484673848, (int) System.currentTimeMillis());
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0048  */
    static {
        boolean z10 = false;
        if (!((Boolean) aaw.setOnFocusChangeListener.setOnFocusChangeListener(new Object[0], -662658218, 662658220, (int) System.currentTimeMillis())).booleanValue()) {
            int i10 = f52196h;
            int i11 = (((i10 | 28) << 1) - (i10 ^ 28)) - 1;
            f52195g = i11 % 128;
            int i12 = i11 % 2;
        } else {
            int i13 = f52195g;
            int i14 = i13 & 15;
            int i15 = -(-(i13 | 15));
            int i16 = (i14 & i15) + (i15 | i14);
            f52196h = i16 % 128;
            int i17 = i16 % 2;
            if (Build.VERSION.SDK_INT >= 29) {
                int i18 = f52196h + 77;
                f52195g = i18 % 128;
                int i19 = i18 % 2;
                z10 = true;
            } else {
                int i110 = f52196h;
                int i111 = (((i110 | 28) << 1) - (i110 ^ 28)) - 1;
                f52195g = i111 % 128;
                int i112 = i111 % 2;
            }
        }
        f52194f = z10;
        int i20 = f52195g;
        int i21 = (i20 & 13) + (i20 | 13);
        f52196h = i21 % 128;
        int i22 = i21 % 2;
    }

    public aaq() {
        aay.Companion companion = aay.INSTANCE;
        abe.Companion sety = abe.INSTANCE;
        abj.Companion companion2 = abj.INSTANCE;
        abd.Companion companion3 = abd.INSTANCE;
        List listListOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new abg[]{(abg) aay.Companion.setCompoundDrawableTintBlendMode(new Object[0], 124736756, -124736756, (int) System.currentTimeMillis()), new abi((abi.setY) abe.Companion.setY(new Object[0], -197381198, 197381198, (int) System.currentTimeMillis())), new abi((abi.setY) abj.Companion.setY(new Object[0], -962127528, 962127528, (int) System.currentTimeMillis())), new abi((abi.setY) abd.Companion.setOnFocusChangeListener(new Object[0], 335602431, -335602431, (int) System.currentTimeMillis()))});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOfNotNull) {
            if (((abg) obj).setOnFocusChangeListener()) {
                arrayList.add(obj);
            }
        }
        this.f52197e = arrayList;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        Object next;
        Object next2;
        int i13 = ~i10;
        int i14 = ~i12;
        int i15 = i13 | i14;
        int i16 = ~(i15 | i11);
        int i17 = ~i11;
        int i18 = i14 | i17;
        int i19 = ((i10 | i11) * 184) + (((~i18) | (~(i13 | i17)) | (~i15)) * 184) + ((i16 | (~(i18 | i10))) * (-184)) + (i11 * (-183)) + (i10 * (-183));
        if (i19 == 1) {
            aaq aaqVar = (aaq) objArr[0];
            SSLSocket sSLSocket = (SSLSocket) objArr[1];
            String str = (String) objArr[2];
            List<? extends yi> list = (List) objArr[3];
            int i20 = f52196h;
            int i21 = (i20 | 37) << 1;
            int i22 = -(i20 ^ 37);
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            f52195g = i23 % 128;
            if (i23 % 2 != 0) {
                Intrinsics.checkNotNullParameter(sSLSocket, "");
                Intrinsics.checkNotNullParameter(list, "");
                aaqVar.f52197e.iterator();
                throw null;
            }
            Intrinsics.checkNotNullParameter(sSLSocket, "");
            Intrinsics.checkNotNullParameter(list, "");
            Iterator it = aaqVar.f52197e.iterator();
            int i24 = f52195g;
            int i25 = (((i24 & (-52)) | ((~i24) & 51)) - (~((i24 & 51) << 1))) - 1;
            f52196h = i25 % 128;
            int i26 = i25 % 2;
            while (true) {
                if (!it.hasNext()) {
                    int i27 = f52195g;
                    int i28 = i27 | 81;
                    int i29 = i28 << 1;
                    int i30 = -((~(i27 & 81)) & i28);
                    int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
                    f52196h = i31 % 128;
                    int i32 = i31 % 2;
                    next = null;
                    break;
                }
                int i33 = f52196h;
                int i34 = (((i33 ^ 103) | (i33 & 103)) << 1) - (((~i33) & 103) | (i33 & (-104)));
                f52195g = i34 % 128;
                if (i34 % 2 != 0) {
                    next = it.next();
                    int i35 = 98 / 0;
                    if (((abg) next).setOnFocusChangeListener(sSLSocket)) {
                        int i36 = f52195g;
                        int i37 = (((i36 | 80) << 1) - (i36 ^ 80)) - 1;
                        f52196h = i37 % 128;
                        int i38 = i37 % 2;
                        int i39 = i36 & 51;
                        int i40 = ((i36 | 51) & (~i39)) + (i39 << 1);
                        f52196h = i40 % 128;
                        int i41 = i40 % 2;
                        break;
                    }
                } else {
                    next = it.next();
                    if (!(!((abg) next).setOnFocusChangeListener(sSLSocket))) {
                        int i310 = f52195g;
                        int i311 = (((i310 | 80) << 1) - (i310 ^ 80)) - 1;
                        f52196h = i311 % 128;
                        int i312 = i311 % 2;
                        int i313 = i310 & 51;
                        int i42 = ((i310 | 51) & (~i313)) + (i313 << 1);
                        f52196h = i42 % 128;
                        int i43 = i42 % 2;
                        break;
                    }
                }
            }
            abg abgVar = (abg) next;
            if (abgVar != null) {
                int i44 = f52195g;
                int i45 = (((i44 | 18) << 1) - (i44 ^ 18)) - 1;
                f52196h = i45 % 128;
                int i46 = i45 % 2;
                abgVar.setY(sSLSocket, str, list);
                int i47 = f52196h;
                int i48 = i47 & 35;
                int i49 = (i47 | 35) & (~i48);
                int i50 = i48 << 1;
                int i51 = (i49 & i50) + (i49 | i50);
                f52195g = i51 % 128;
                int i52 = i51 % 2;
            }
            int i53 = f52195g;
            int i54 = i53 & 117;
            int i55 = (((i53 | 117) & (~i54)) - (~(-(-(i54 << 1))))) - 1;
            f52196h = i55 % 128;
            if (i55 % 2 != 0) {
                return null;
            }
            throw null;
        }
        if (i19 == 2) {
            aaq aaqVar2 = (aaq) objArr[0];
            X509TrustManager x509TrustManager = (X509TrustManager) objArr[1];
            System.identityHashCode(aaqVar2);
            System.identityHashCode(aaqVar2);
            Intrinsics.checkNotNullParameter(x509TrustManager, "");
            aav.Companion companion = aav.INSTANCE;
            aav aavVar = (aav) aav.Companion.setX(new Object[]{x509TrustManager}, -1928241639, 1928241639, (int) System.currentTimeMillis());
            if (aavVar != null) {
                int i56 = f52195g;
                int i57 = i56 ^ 83;
                int i58 = ((i56 & 83) | i57) << 1;
                int i59 = -i57;
                int i60 = (i58 ^ i59) + ((i58 & i59) << 1);
                f52196h = i60 % 128;
                int i61 = i60 % 2;
                return aavVar;
            }
            int i62 = f52196h;
            int i63 = ((((i62 ^ 123) | (i62 & 123)) << 1) - (~(-(((~i62) & 123) | (i62 & (-124)))))) - 1;
            f52195g = i63 % 128;
            int i64 = i63 % 2;
            abo dividerPadding = super.setDividerPadding(x509TrustManager);
            int i65 = f52195g + 43;
            f52196h = i65 % 128;
            if (i65 % 2 != 0) {
                return dividerPadding;
            }
            throw null;
        }
        if (i19 != 3) {
            if (i19 == 4) {
                int i66 = f52196h;
                int i67 = (i66 & 44) + (i66 | 44);
                int i68 = (i67 ^ (-1)) + (i67 << 1);
                f52195g = i68 % 128;
                if (i68 % 2 == 0) {
                    return Boolean.valueOf(f52194f);
                }
                throw null;
            }
            String str2 = (String) objArr[1];
            int i69 = f52195g;
            int i70 = i69 & 93;
            int i71 = (i69 | 93) & (~i70);
            int i72 = -(-(i70 << 1));
            int i73 = (i71 ^ i72) + ((i71 & i72) << 1);
            f52196h = i73 % 128;
            if (i73 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str2, "");
                return Boolean.valueOf(NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str2));
            }
            Intrinsics.checkNotNullParameter(str2, "");
            NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str2);
            throw null;
        }
        aaq aaqVar3 = (aaq) objArr[0];
        SSLSocket sSLSocket2 = (SSLSocket) objArr[1];
        int i74 = f52196h;
        int i75 = i74 ^ 111;
        int i76 = (((i74 & 111) | i75) << 1) - i75;
        f52195g = i76 % 128;
        if (i76 % 2 != 0) {
            Intrinsics.checkNotNullParameter(sSLSocket2, "");
            aaqVar3.f52197e.iterator();
            throw null;
        }
        Intrinsics.checkNotNullParameter(sSLSocket2, "");
        Iterator it2 = aaqVar3.f52197e.iterator();
        int i77 = f52195g;
        int i78 = i77 ^ 85;
        int i79 = ((i77 & 85) | i78) << 1;
        int i80 = -i78;
        int i81 = ((i79 | i80) << 1) - (i79 ^ i80);
        f52196h = i81 % 128;
        int i82 = i81 % 2;
        while (true) {
            if (!it2.hasNext()) {
                int i83 = f52195g;
                int i84 = i83 | 3;
                int i85 = i84 << 1;
                int i86 = -((~(i83 & 3)) & i84);
                int i87 = ((i85 | i86) << 1) - (i86 ^ i85);
                f52196h = i87 % 128;
                int i88 = i87 % 2;
                next2 = null;
                break;
            }
            int i89 = f52196h + 27;
            f52195g = i89 % 128;
            if (i89 % 2 != 0) {
                ((abg) it2.next()).setOnFocusChangeListener(sSLSocket2);
                throw null;
            }
            next2 = it2.next();
            if (!(!((abg) next2).setOnFocusChangeListener(sSLSocket2))) {
                int i90 = f52196h;
                int i91 = (i90 & 89) + (i90 | 89);
                f52195g = i91 % 128;
                int i92 = i91 % 2;
                break;
            }
        }
        abg abgVar2 = (abg) next2;
        if (abgVar2 != null) {
            String x4 = abgVar2.setX(sSLSocket2);
            int i93 = f52195g;
            int i94 = (((i93 ^ 39) | (i93 & 39)) << 1) - (((~i93) & 39) | (i93 & (-40)));
            f52196h = i94 % 128;
            int i95 = i94 % 2;
            return x4;
        }
        int i96 = f52195g;
        int i97 = (-2) - (((i96 ^ 2) + ((i96 & 2) << 1)) ^ (-1));
        int i98 = i97 % 128;
        f52196h = i98;
        int i99 = i97 % 2;
        int i100 = ((((i98 ^ 59) | (i98 & 59)) << 1) - (~(-(((~i98) & 59) | (i98 & (-60)))))) - 1;
        f52195g = i100 % 128;
        int i101 = i100 % 2;
        return null;
    }

    @Override // com.mypinpad.tsdk.isolation.aaw
    @NotNull
    public final abo setDividerPadding(@NotNull X509TrustManager p4) {
        return (abo) setOnFocusChangeListener(new Object[]{this, p4}, 992695220, -992695218, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aaw
    @Nullable
    public final String setX(@NotNull SSLSocket p4) {
        return (String) setOnFocusChangeListener(new Object[]{this, p4}, -946435132, 946435135, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aaw
    public final void setX(@NotNull SSLSocket p4, @Nullable String p10, @NotNull List<? extends yi> p11) {
        setOnFocusChangeListener(new Object[]{this, p4, p10, p11}, -1397219335, 1397219336, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aaw
    @SuppressLint({"NewApi"})
    public final boolean setY(@NotNull String p4) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, p4}, 1146091292, -1146091292, System.identityHashCode(this))).booleanValue();
    }
}
