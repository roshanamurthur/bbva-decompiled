package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f55286d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f55287e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final l f55288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f55289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final b f55290c;

    public e(@NotNull l lVar, @NotNull String str) {
        Intrinsics.checkNotNullParameter(lVar, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.f55288a = lVar;
        this.f55289b = str;
        this.f55290c = b.setCompoundDrawableTintBlendMode;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = (((~(i10 | (~i12))) | i14) * 168) + (((~(i11 | i10)) | (~(i10 | i12))) * (-168)) + (((~(i13 | i14)) | (~(i14 | i12))) * 336) + (i11 * (-167)) + (i10 * (-167));
        if (i15 == 1) {
            e eVar = (e) objArr[0];
            int i16 = ((-1) << 1) - ((f55287e + 118) ^ (-1));
            f55286d = i16 % 128;
            int i17 = i16 % 2;
            l lVar = eVar.f55288a;
            l.setX(new Object[]{lVar}, 1961577412, -1961577406, System.identityHashCode(lVar));
            eVar.f55289b = "";
            int i18 = f55286d;
            int i19 = (i18 ^ 53) + ((i18 & 53) << 1);
            f55287e = i19 % 128;
            int i20 = i19 % 2;
            return null;
        }
        if (i15 == 2) {
            e eVar2 = (e) objArr[0];
            int i21 = f55287e;
            int i22 = ((i21 & 16) + (i21 | 16)) - 1;
            f55286d = i22 % 128;
            int i23 = i22 % 2;
            String str = eVar2.f55289b;
            if (i23 != 0) {
                int i24 = 82 / 0;
            }
            return str;
        }
        if (i15 == 3) {
            e eVar3 = (e) objArr[0];
            int i25 = f55287e;
            int i26 = i25 & 21;
            int i27 = (((i25 ^ 21) | i26) << 1) - ((i25 | 21) & (~i26));
            f55286d = i27 % 128;
            if (i27 % 2 == 0) {
                return eVar3.f55290c;
            }
            b bVar = eVar3.f55290c;
            throw null;
        }
        e eVar4 = (e) objArr[0];
        int iIdentityHashCode = System.identityHashCode(eVar4);
        int i28 = ~iIdentityHashCode;
        int i29 = i28 & (-2007089112);
        int i30 = ((-2007089112) | i28) & (~i29);
        int i31 = (-65931136) - (~(((i30 & i29) | (i30 ^ i29)) * (-192)));
        int i32 = (i31 ^ (-1)) + (i31 << 1);
        int i33 = (i28 | iIdentityHashCode) & i28;
        int i34 = (-369147861) & i33;
        int i35 = (i33 | (-369147861)) & (~i34);
        int i36 = (i35 & i34) | (i35 ^ i34);
        int i37 = ~i36;
        int i38 = i37 & (i37 | i36);
        int i39 = 369137796 & i38;
        int i40 = (i38 | 369137796) & (~i39);
        int i41 = (i32 - (~(-(-(((i40 & i39) | (i40 ^ i39)) * (-384)))))) - 1;
        int i42 = (369137796 & iIdentityHashCode) | ((-369137797) & i28);
        int i43 = (-369137797) & iIdentityHashCode;
        int i44 = ~((i43 & i42) | (i42 ^ i43));
        int i45 = ~(i36 | (-1637951316));
        int i46 = i44 & i45;
        int i47 = ((i45 | i44) & (~i46)) | i46;
        int i48 = ~((iIdentityHashCode & (-1637941252)) | (i28 & (-1637941252)) | (1637941251 & iIdentityHashCode));
        int i49 = ((i48 & i47) | (i47 ^ i48)) * 192;
        int i50 = i41 & i49;
        int i51 = (((i49 | i41) & (~i50)) - (~(-(-(i50 << 1))))) - 1;
        int i52 = ~System.identityHashCode(eVar4);
        int i53 = ((~i52) & (-1382321999)) | (1382321998 & i52);
        int i54 = (-1382321999) & i52;
        int i55 = (i53 & i54) | (i53 ^ i54);
        int i56 = i55 & 1808916262;
        int i57 = (i55 | 1808916262) & (~i56);
        int i58 = -(~((~((i57 & i56) | (i57 ^ i56))) * (-783)));
        int i59 = (((-1077362411) ^ i58) + ((i58 & (-1077362411)) << 1)) - 1;
        int i60 = ~((i52 & 1808916262) | (i52 ^ 1808916262));
        int i61 = (-1382321999) & i60;
        int i62 = (i60 | (-1382321999)) & (~i61);
        if (i51 <= (((i62 & i61) | (i62 ^ i61)) * 783) + i59) {
            return eVar4.f55288a;
        }
        l lVar2 = eVar4.f55288a;
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.c
    @NotNull
    public final b UiMessageCallbackKtWhenMappings() {
        return (b) setY(new Object[]{this}, -139860218, 139860221, System.identityHashCode(this));
    }

    @NotNull
    public final String setCompoundDrawableTintBlendMode() {
        return (String) setY(new Object[]{this}, 1286004096, -1286004094, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.getRrn
    public final void setLayoutAnimation() {
        setY(new Object[]{this}, -790313612, 790313613, System.identityHashCode(this));
    }

    @NotNull
    public final l setX() {
        return (l) setY(new Object[]{this}, -1134844701, 1134844701, System.identityHashCode(this));
    }
}
