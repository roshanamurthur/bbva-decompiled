package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class apr implements apu {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53527f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53528g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f53529a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public apl[] f53530b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public apl[] f53531c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public apl f53532d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f53533e = -1;

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~(i13 | i11);
        int i15 = ~i11;
        int i16 = ((i12 | i14 | (~(i15 | i10))) * 614) + (i11 * (-613)) + (i10 * 615);
        int i17 = ~i12;
        switch ((((~(i10 | i17 | i11)) | (~(i13 | i15 | i17))) * 614) + (((~(i13 | i17)) | i14 | (~(i17 | i11))) * (-1228)) + i16) {
            case 1:
                apr aprVar = (apr) objArr[0];
                apl aplVar = (apl) objArr[1];
                int i18 = f53528g;
                int i19 = ((i18 ^ 123) - (~((i18 & 123) << 1))) - 1;
                f53527f = i19 % 128;
                int i20 = i19 % 2;
                aprVar.f53532d = aplVar;
                if (i20 != 0) {
                    throw null;
                }
                int i21 = i18 + 31;
                f53527f = i21 % 128;
                if (i21 % 2 == 0) {
                    return null;
                }
                int i22 = 27 / 0;
                return null;
            case 2:
                apr aprVar2 = (apr) objArr[0];
                int i23 = f53527f + 71;
                int i24 = i23 % 128;
                f53528g = i24;
                int i25 = i23 % 2;
                apl[] aplVarArr = aprVar2.f53530b;
                int i26 = i24 ^ 51;
                int i27 = ((i24 & 51) | i26) << 1;
                int i28 = -i26;
                int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                f53527f = i29 % 128;
                if (i29 % 2 != 0) {
                    int i30 = 17 / 0;
                }
                return aplVarArr;
            case 3:
                apr aprVar3 = (apr) objArr[0];
                apl[] aplVarArr2 = (apl[]) objArr[1];
                int i31 = f53527f;
                int i32 = i31 & 39;
                int i33 = (((~i32) & (i31 | 39)) - (~(-(-(i32 << 1))))) - 1;
                f53528g = i33 % 128;
                int i34 = i33 % 2;
                aprVar3.f53531c = aplVarArr2;
                int i35 = i31 + 123;
                f53528g = i35 % 128;
                int i36 = i35 % 2;
                return null;
            case 4:
                apr aprVar4 = (apr) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i37 = f53527f;
                int i38 = ((i37 | 23) << 1) - (i37 ^ 23);
                int i39 = i38 % 128;
                f53528g = i39;
                int i40 = i38 % 2;
                aprVar4.f53529a = iIntValue;
                int i41 = ((i39 | 55) << 1) - (i39 ^ 55);
                f53527f = i41 % 128;
                if (i41 % 2 == 0) {
                    return null;
                }
                throw null;
            case 5:
                apr aprVar5 = (apr) objArr[0];
                int i42 = f53527f;
                int i43 = i42 & 37;
                int i44 = i43 + ((i42 ^ 37) | i43);
                f53528g = i44 % 128;
                if (i44 % 2 != 0) {
                    return aprVar5.f53531c;
                }
                apl[] aplVarArr3 = aprVar5.f53531c;
                throw null;
            case 6:
                apr aprVar6 = (apr) objArr[0];
                apl[] aplVarArr4 = (apl[]) objArr[1];
                int i45 = f53528g;
                int i46 = (i45 & 47) + (i45 | 47);
                f53527f = i46 % 128;
                int i47 = i46 % 2;
                aprVar6.f53530b = aplVarArr4;
                if (i47 == 0) {
                    return null;
                }
                int i48 = 57 / 0;
                return null;
            case 7:
                apr aprVar7 = (apr) objArr[0];
                int i49 = f53528g;
                int i50 = i49 ^ 111;
                int i51 = ((i49 & 111) | i50) << 1;
                int i52 = -i50;
                int i53 = (i51 & i52) + (i51 | i52);
                int i54 = i53 % 128;
                f53527f = i54;
                int i55 = i53 % 2;
                int i56 = aprVar7.f53533e;
                int i57 = i54 & 97;
                int i58 = i57 + ((i54 ^ 97) | i57);
                f53528g = i58 % 128;
                if (i58 % 2 != 0) {
                    return Integer.valueOf(i56);
                }
                throw null;
            case 8:
                apr aprVar8 = (apr) objArr[0];
                int iIntValue2 = ((Number) objArr[1]).intValue();
                int i59 = f53527f + 95;
                int i60 = i59 % 128;
                f53528g = i60;
                int i61 = i59 % 2;
                aprVar8.f53533e = iIntValue2;
                int i62 = i60 + 99;
                f53527f = i62 % 128;
                int i63 = i62 % 2;
                return null;
            case 9:
                apr aprVar9 = (apr) objArr[0];
                int i64 = f53528g + 55;
                f53527f = i64 % 128;
                int i65 = i64 % 2;
                aprVar9.getClass();
                int i66 = f53527f + 105;
                f53528g = i66 % 128;
                if (i66 % 2 != 0) {
                    return null;
                }
                throw null;
            case 10:
                apr aprVar10 = (apr) objArr[0];
                int i67 = f53527f;
                int i68 = i67 & 39;
                int i69 = (i67 ^ 39) | i68;
                int i70 = (i68 & i69) + (i68 | i69);
                f53528g = i70 % 128;
                int i71 = i70 % 2;
                apl aplVar2 = aprVar10.f53532d;
                int i72 = i67 + 51;
                f53528g = i72 % 128;
                int i73 = i72 % 2;
                return aplVar2;
            default:
                apr aprVar11 = (apr) objArr[0];
                int i74 = f53528g;
                int i75 = ((i74 | 112) << 1) - (i74 ^ 112);
                int i76 = (i75 ^ (-1)) + (i75 << 1);
                f53527f = i76 % 128;
                int i77 = i76 % 2;
                int i78 = aprVar11.f53529a;
                if (i77 != 0) {
                    throw null;
                }
                int i79 = (i74 & 63) + (i74 | 63);
                f53527f = i79 % 128;
                int i80 = i79 % 2;
                return Integer.valueOf(i78);
        }
    }

    public final void setCompoundDrawableTintBlendMode(int i10) {
        setY(new Object[]{this, Integer.valueOf(i10)}, -575984875, 575984883, i10);
    }

    public final void setDividerPadding(apl[] aplVarArr) {
        setY(new Object[]{this, aplVarArr}, -1350627136, 1350627142, System.identityHashCode(this));
    }

    public final int setOnFocusChangeListener() {
        return ((Integer) setY(new Object[]{this}, 1173899602, -1173899602, System.identityHashCode(this))).intValue();
    }

    public final int setOnLongClickListener() {
        return ((Integer) setY(new Object[]{this}, -1413925836, 1413925843, System.identityHashCode(this))).intValue();
    }

    public final apl setX() {
        return (apl) setY(new Object[]{this}, -1061273151, 1061273161, System.identityHashCode(this));
    }

    public final apl[] setDividerPadding() {
        return (apl[]) setY(new Object[]{this}, 1952897732, -1952897730, System.identityHashCode(this));
    }

    public final void setDividerPadding(int i10) {
        setY(new Object[]{this, Integer.valueOf(i10)}, -698342477, 698342481, i10);
    }

    public final void setY(apl aplVar) {
        setY(new Object[]{this, aplVar}, 907935971, -907935970, System.identityHashCode(this));
    }

    public final void setY(apl[] aplVarArr) {
        setY(new Object[]{this, aplVarArr}, 1301587705, -1301587702, System.identityHashCode(this));
    }

    public final apl[] setY() {
        return (apl[]) setY(new Object[]{this}, 703536017, -703536012, System.identityHashCode(this));
    }
}
