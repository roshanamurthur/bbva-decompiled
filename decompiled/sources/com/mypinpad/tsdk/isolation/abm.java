package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/mypinpad/tsdk/i/abm;", "Lcom/mypinpad/tsdk/i/abo;", "", "Ljava/security/cert/Certificate;", "p0", "", "p1", "setDividerPadding", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "", GenerateActivationFormCommand.HASH_CODE, "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/mypinpad/tsdk/i/abt;", "<init>", "(Lcom/mypinpad/tsdk/i/abt;)V", "setOnFocusChangeListener"}, k = 1, mv = {1, 6, 0})
public final class abm extends abo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f52320b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f52321c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final abt f52322a;

    static {
        int i10 = f52321c;
        int i11 = i10 ^ 57;
        int i12 = (i10 & 57) << 1;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f52320b = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    public abm(@NotNull abt abtVar) {
        Intrinsics.checkNotNullParameter(abtVar, "");
        this.f52322a = abtVar;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0219  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws SSLPeerUnverifiedException {
        X509Certificate x509Certificate;
        int i13 = ~i10;
        int i14 = (((~(i10 | i12)) | i11) * 272) + (((~(i13 | i12)) | (~(i13 | i11))) * (-272)) + (((~((~i11) | i13 | (~i12))) | (~(i10 | i11 | i12))) * (-272)) + (i11 * (-271)) + (i10 * 273);
        boolean z10 = false;
        if (i14 != 1) {
            if (i14 == 2) {
                X509Certificate x509Certificate2 = (X509Certificate) objArr[0];
                X509Certificate x509Certificate3 = (X509Certificate) objArr[1];
                int i15 = f52321c;
                int i16 = (i15 & (-20)) | ((~i15) & 19);
                int i17 = (i15 & 19) << 1;
                int i18 = (i16 & i17) + (i17 | i16);
                f52320b = i18 % 128;
                int i19 = i18 % 2;
                if (!(!Intrinsics.areEqual(x509Certificate2.getIssuerDN(), x509Certificate3.getSubjectDN()))) {
                    try {
                        x509Certificate2.verify(x509Certificate3.getPublicKey());
                        int i20 = f52320b + 19;
                        f52321c = i20 % 128;
                        int i21 = i20 % 2;
                        z10 = true;
                    } catch (GeneralSecurityException unused) {
                    }
                    System.currentTimeMillis();
                    System.currentTimeMillis();
                } else {
                    int i22 = f52321c + 57;
                    f52320b = i22 % 128;
                    if (i22 % 2 != 0) {
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
            }
            if (i14 == 3) {
                abm abmVar = (abm) objArr[0];
                int i23 = f52321c;
                int i24 = (i23 & 101) + (i23 | 101);
                f52320b = i24 % 128;
                int i25 = i24 % 2;
                abt abtVar = abmVar.f52322a;
                if (i25 == 0) {
                    return Integer.valueOf(abtVar.hashCode());
                }
                abtVar.hashCode();
                throw null;
            }
            abm abmVar2 = (abm) objArr[0];
            Object obj = objArr[1];
            int i26 = f52320b;
            int i27 = i26 & 55;
            int i28 = (((i26 ^ 55) | i27) << 1) - ((~i27) & (i26 | 55));
            int i29 = i28 % 128;
            f52321c = i29;
            if (i28 % 2 == 0) {
                throw null;
            }
            if (obj == abmVar2) {
                int i30 = i29 + 83;
                f52320b = i30 % 128;
                if (i30 % 2 == 0) {
                    return Boolean.TRUE;
                }
                throw null;
            }
            if (obj instanceof abm) {
                int i31 = ((i26 ^ 34) + ((i26 & 34) << 1)) - 1;
                f52321c = i31 % 128;
                int i32 = i31 % 2;
                if (Intrinsics.areEqual(((abm) obj).f52322a, abmVar2.f52322a)) {
                    int i33 = f52321c;
                    int i34 = (((i33 | 2) << 1) - (i33 ^ 2)) - 1;
                    f52320b = i34 % 128;
                    return Boolean.valueOf(!(i34 % 2 != 0));
                }
            }
            int i35 = f52320b;
            int i36 = (((i35 ^ 89) | (i35 & 89)) << 1) - (((~i35) & 89) | (i35 & (-90)));
            f52321c = i36 % 128;
            if (i36 % 2 == 0) {
                int i37 = 34 / 0;
            }
            return Boolean.FALSE;
        }
        abm abmVar3 = (abm) objArr[0];
        List list = (List) objArr[1];
        String str = (String) objArr[2];
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        Intrinsics.checkNotNullExpressionValue(objRemoveFirst, "");
        arrayList.add(objRemoveFirst);
        int i38 = f52321c;
        int i39 = i38 & 11;
        int i40 = (i38 | 11) & (~i39);
        int i41 = -(-(i39 << 1));
        int i42 = (i40 & i41) + (i40 | i41);
        f52320b = i42 % 128;
        int i43 = i42 % 2;
        int i44 = 0;
        boolean z11 = false;
        while (i44 < 9) {
            int i45 = f52321c;
            int i46 = i45 & 55;
            int i47 = (i45 | 55) & (~i46);
            int i48 = -(-(i46 << 1));
            int i49 = (i47 ^ i48) + ((i47 & i48) << 1);
            f52320b = i49 % 128;
            int i50 = i49 % 2;
            i44++;
            int size = arrayList.size();
            int iIdentityHashCode = System.identityHashCode(abmVar3);
            int i51 = size * (-500);
            int i52 = 500 | i51;
            int i53 = (i52 << 1) - ((~(i51 & 500)) & i52);
            int i54 = ~size;
            int i55 = ~((i54 ^ (-1)) | i54);
            int i56 = size & iIdentityHashCode;
            int i57 = (~i56) & (size | iIdentityHashCode);
            int i58 = ~iIdentityHashCode;
            int i59 = ~((i57 ^ i56) | (i57 & i56));
            int i60 = i55 ^ i59;
            int i61 = i59 & i55;
            int i62 = ((i61 & i60) | (i60 ^ i61)) * 501;
            int i63 = i53 & i62;
            int i64 = i62 | i53;
            int i65 = (i63 & i64) + (i64 | i63);
            int i66 = -(-((~i54) * 1002));
            int i67 = i65 & i66;
            int i68 = i67 + ((i66 ^ i65) | i67);
            int i69 = (i58 | iIdentityHashCode) & i58;
            int i70 = i69 & size;
            int i71 = (i69 | size) & (~i70);
            int i72 = (i71 & i70) | (i71 ^ i70);
            int i73 = ~i72;
            int i74 = ((i72 | i73) & i73) * 501;
            int i75 = i68 & i74;
            int i76 = -(-((i74 ^ i68) | i75));
            X509Certificate x509Certificate4 = (X509Certificate) arrayList.get((i75 ^ i76) + ((i76 & i75) << 1));
            X509Certificate compoundDrawableTintBlendMode = abmVar3.f52322a.setCompoundDrawableTintBlendMode(x509Certificate4);
            if (compoundDrawableTintBlendMode != null) {
                int i77 = f52321c;
                int i78 = i77 & 81;
                int i79 = (i77 ^ 81) | i78;
                int i80 = (i78 & i79) + (i79 | i78);
                f52320b = i80 % 128;
                if (i80 % 2 == 0 ? arrayList.size() > 1 : arrayList.size() > 1) {
                    arrayList.add(compoundDrawableTintBlendMode);
                    int i81 = f52320b;
                    int i82 = ((i81 | 27) << 1) - (i81 ^ 27);
                    f52321c = i82 % 128;
                    int i83 = i82 % 2;
                } else if (!Intrinsics.areEqual(x509Certificate4, compoundDrawableTintBlendMode)) {
                    arrayList.add(compoundDrawableTintBlendMode);
                    int i84 = f52320b;
                    int i85 = ((i84 | 27) << 1) - (i84 ^ 27);
                    f52321c = i85 % 128;
                    int i86 = i85 % 2;
                }
                if (((Boolean) setX(new Object[]{compoundDrawableTintBlendMode, compoundDrawableTintBlendMode}, -1763530030, 1763530032, (int) System.currentTimeMillis())).booleanValue()) {
                    int i87 = f52321c;
                    int i88 = ((i87 ^ 112) + ((i87 & 112) << 1)) - 1;
                    f52320b = i88 % 128;
                    if (i88 % 2 != 0) {
                        throw null;
                    }
                    return arrayList;
                }
                int i89 = f52321c;
                int i90 = ((i89 | 51) << 1) - (i89 ^ 51);
                f52320b = i90 % 128;
                int i91 = i90 % 2;
                z11 = true;
            } else {
                Iterator it = arrayDeque.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "");
                int i92 = f52320b + 117;
                f52321c = i92 % 128;
                int i93 = i92 % 2;
                do {
                    if (!it.hasNext()) {
                        if (!z11) {
                            throw new SSLPeerUnverifiedException(Intrinsics.stringPlus("Failed to find a trusted cert that signed ", x509Certificate4));
                        }
                        int i94 = f52321c;
                        int i95 = (i94 ^ 59) + ((i94 & 59) << 1);
                        int i96 = i95 % 128;
                        f52320b = i96;
                        if (i95 % 2 != 0) {
                            throw null;
                        }
                        int i97 = i96 & 117;
                        int i98 = ((((i96 ^ 117) | i97) << 1) - (~(-((i96 | 117) & (~i97))))) - 1;
                        f52321c = i98 % 128;
                        if (i98 % 2 == 0) {
                            throw null;
                        }
                        return arrayList;
                    }
                    int i99 = f52321c;
                    int i100 = (i99 & (-96)) | ((~i99) & 95);
                    int i101 = (i99 & 95) << 1;
                    int i102 = ((i100 | i101) << 1) - (i101 ^ i100);
                    f52320b = i102 % 128;
                    int i103 = i102 % 2;
                    Object next = it.next();
                    if (next == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                    x509Certificate = (X509Certificate) next;
                } while (!((Boolean) setX(new Object[]{x509Certificate4, x509Certificate}, -1763530030, 1763530032, (int) System.currentTimeMillis())).booleanValue());
                int i104 = f52320b;
                int i105 = i104 & 65;
                int i106 = (((i104 ^ 65) | i105) << 1) - ((i104 | 65) & (~i105));
                f52321c = i106 % 128;
                int i107 = i106 % 2;
                it.remove();
                arrayList.add(x509Certificate);
                int i108 = f52320b;
                int i109 = (i108 & 29) + (i108 | 29);
                f52321c = i109 % 128;
                int i110 = i109 % 2;
            }
        }
        throw new SSLPeerUnverifiedException(Intrinsics.stringPlus("Certificate chain too long: ", arrayList));
    }

    public final boolean equals(@Nullable Object p4) {
        return ((Boolean) setX(new Object[]{this, p4}, -985024286, 985024286, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setX(new Object[]{this}, -2090843071, 2090843074, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.abo
    @NotNull
    public final List<Certificate> setDividerPadding(@NotNull List<? extends Certificate> p4, @NotNull String p10) throws SSLPeerUnverifiedException {
        return (List) setX(new Object[]{this, p4, p10}, 1264432160, -1264432159, System.identityHashCode(this));
    }
}
