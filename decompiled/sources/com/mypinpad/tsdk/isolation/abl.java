package com.mypinpad.tsdk.isolation;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class abl implements abt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f52317b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f52318c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f52319a;

    public abl(@NotNull X509Certificate... x509CertificateArr) {
        Intrinsics.checkNotNullParameter(x509CertificateArr, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = x509CertificateArr.length;
        int i10 = 0;
        while (i10 < length) {
            X509Certificate x509Certificate = x509CertificateArr[i10];
            i10 = ((i10 | 1) << 1) - (i10 ^ 1);
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Intrinsics.checkNotNullExpressionValue(subjectX500Principal, "");
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.f52319a = linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:54:0x01d8  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        Boolean bool;
        boolean z10;
        int i14 = ~i11;
        int i15 = i14 | i10;
        int i16 = (((~(i10 | i12)) | (~(i14 | i12)) | (~i15)) * 623) + (((~(i11 | (~i10))) | (~i12)) * (-623)) + ((~(i15 | i12)) * 623) + (i11 * (-622)) + (i10 * 624);
        Object obj = null;
        if (i16 == 1) {
            abl ablVar = (abl) objArr[0];
            Object obj2 = objArr[1];
            int i17 = f52317b;
            int i18 = i17 + 51;
            f52318c = i18 % 128;
            int i19 = i18 % 2;
            if (obj2 != ablVar) {
                int i20 = (i17 & (-24)) | ((~i17) & 23);
                int i21 = -(-((i17 & 23) << 1));
                int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
                f52318c = i22 % 128;
                if (i22 % 2 == 0) {
                    boolean z11 = obj2 instanceof abl;
                    throw null;
                }
                if (obj2 instanceof abl) {
                    int i23 = i17 ^ 83;
                    int i24 = ((i17 & 83) | i23) << 1;
                    int i25 = -i23;
                    int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
                    f52318c = i26 % 128;
                    if (i26 % 2 == 0) {
                        boolean zAreEqual = Intrinsics.areEqual(((abl) obj2).f52319a, ablVar.f52319a);
                        int i27 = 52 / 0;
                        if (!(!zAreEqual)) {
                            int i28 = f52317b + 122;
                            i13 = (i28 ^ (-1)) + (i28 << 1);
                            f52318c = i13 % 128;
                            if (i13 % 2 == 0) {
                                throw null;
                            }
                            bool = Boolean.TRUE;
                        }
                    } else if (Intrinsics.areEqual(((abl) obj2).f52319a, ablVar.f52319a)) {
                        int i29 = f52317b + 122;
                        i13 = (i29 ^ (-1)) + (i29 << 1);
                        f52318c = i13 % 128;
                        if (i13 % 2 == 0) {
                            throw null;
                        }
                        bool = Boolean.TRUE;
                    }
                }
                int i30 = f52318c;
                int i31 = i30 & 13;
                int i32 = (i30 | 13) & (~i31);
                int i33 = -(-(i31 << 1));
                int i34 = (i32 & i33) + (i32 | i33);
                f52317b = i34 % 128;
                if (i34 % 2 != 0) {
                    throw null;
                }
                bool = Boolean.FALSE;
            } else {
                int i210 = f52317b + 122;
                i13 = (i210 ^ (-1)) + (i210 << 1);
                f52318c = i13 % 128;
                if (i13 % 2 == 0) {
                    throw null;
                }
                bool = Boolean.TRUE;
            }
            return bool;
        }
        if (i16 == 2) {
            abl ablVar2 = (abl) objArr[0];
            int i35 = f52318c;
            int i36 = i35 & 33;
            int i37 = i36 + ((i35 ^ 33) | i36);
            f52317b = i37 % 128;
            int i38 = i37 % 2;
            int iHashCode = ablVar2.f52319a.hashCode();
            int i39 = f52318c;
            int i40 = i39 & 77;
            int i41 = ((i39 ^ 77) | i40) << 1;
            int i42 = -((i39 | 77) & (~i40));
            int i43 = (i41 & i42) + (i42 | i41);
            f52317b = i43 % 128;
            int i44 = i43 % 2;
            return Integer.valueOf(iHashCode);
        }
        abl ablVar3 = (abl) objArr[0];
        X509Certificate x509Certificate = (X509Certificate) objArr[1];
        int i45 = f52318c;
        int i46 = (((i45 ^ 107) | (i45 & 107)) << 1) - (((~i45) & 107) | (i45 & (-108)));
        f52317b = i46 % 128;
        if (i46 % 2 != 0) {
            Intrinsics.checkNotNullParameter(x509Certificate, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(x509Certificate, "");
        Set set = (Set) ablVar3.f52319a.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            int i47 = f52317b + 7;
            f52318c = i47 % 128;
            int i48 = i47 % 2;
            return null;
        }
        int i49 = f52317b;
        int i50 = i49 & 39;
        int i51 = (i49 ^ 39) | i50;
        int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
        f52318c = i52 % 128;
        int i53 = i52 % 2;
        for (Object obj3 : set) {
            int i54 = f52318c;
            int i55 = i54 & 107;
            int i56 = (i54 | 107) & (~i55);
            int i57 = i55 << 1;
            int i58 = (i56 ^ i57) + ((i56 & i57) << 1);
            f52317b = i58 % 128;
            int i59 = i58 % 2;
            try {
                x509Certificate.verify(((X509Certificate) obj3).getPublicKey());
                int i60 = f52317b;
                int i61 = (i60 & (-92)) | ((~i60) & 91);
                int i62 = (i60 & 91) << 1;
                int i63 = ((i61 | i62) << 1) - (i62 ^ i61);
                f52318c = i63 % 128;
                int i64 = i63 % 2;
                z10 = true;
            } catch (Exception unused) {
                z10 = false;
            }
            if (!(!z10)) {
                int i65 = f52318c;
                int i66 = (i65 & (-50)) | ((~i65) & 49);
                int i67 = (i65 & 49) << 1;
                int i68 = (i66 ^ i67) + ((i66 & i67) << 1);
                f52317b = i68 % 128;
                if (i68 % 2 != 0) {
                    throw null;
                }
                int i69 = (((i65 | 16) << 1) - (i65 ^ 16)) - 1;
                f52317b = i69 % 128;
                int i70 = i69 % 2;
                obj = obj3;
                X509Certificate x509Certificate2 = (X509Certificate) obj;
                int i71 = f52318c;
                int i72 = (i71 & 83) + (i71 | 83);
                f52317b = i72 % 128;
                int i73 = i72 % 2;
                return x509Certificate2;
            }
        }
        int i74 = f52318c;
        int i75 = (i74 ^ 12) + ((i74 & 12) << 1);
        int i76 = (i75 ^ (-1)) + (i75 << 1);
        f52317b = i76 % 128;
        int i77 = i76 % 2;
        X509Certificate x509Certificate3 = (X509Certificate) obj;
        int i78 = f52318c;
        int i79 = (i78 & 83) + (i78 | 83);
        f52317b = i79 % 128;
        int i710 = i79 % 2;
        return x509Certificate3;
    }

    public final boolean equals(@Nullable Object obj) {
        return ((Boolean) setDividerPadding(new Object[]{this, obj}, 1457634638, -1457634637, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, 1433355199, -1433355197, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.abt
    @Nullable
    public final X509Certificate setCompoundDrawableTintBlendMode(@NotNull X509Certificate x509Certificate) {
        return (X509Certificate) setDividerPadding(new Object[]{this, x509Certificate}, -763357347, 763357347, System.identityHashCode(this));
    }
}
