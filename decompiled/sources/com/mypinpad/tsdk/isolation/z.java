package com.mypinpad.tsdk.isolation;

import androidx.camera.core.impl.utils.c;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class z extends t {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f62243q = {c.e(z.class, "status_B1", "getStatus_B1()Lcom/mypinpad/softpos/emv/terminal/kernel/common/stateengine/model/KernelOutcomeStatus;", 0), c.e(z.class, "start_B2", "getStart_B2()Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/error/KernelOutcomeStart;", 0), c.e(z.class, "onlineResponseData_B3", "getOnlineResponseData_B3()Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/response/outcome/KernelOutcomeOnlineResponseData;", 0), c.e(z.class, "cvm_B4", "getCvm_B4()Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelCvm;", 0), c.e(z.class, "uiRequestOnOutcomePresent_B5b8", "getUiRequestOnOutcomePresent_B5b8()Z", 0), c.e(z.class, "uiRequestOnRestartPresent_B5b7", "getUiRequestOnRestartPresent_B5b7()Z", 0), c.e(z.class, "dataRecordPresent_B5b6", "getDataRecordPresent_B5b6()Z", 0), c.e(z.class, "discretionaryDataPresent_B5b5", "getDiscretionaryDataPresent_B5b5()Z", 0), c.e(z.class, "receipt_B5b4", "getReceipt_B5b4()Z", 0), c.e(z.class, "alternateInterfacePreference_B6", "getAlternateInterfacePreference_B6()Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/response/outcome/KernelAlternativeInterfacePreference;", 0), c.e(z.class, "fieldOffRequest_B7", "getFieldOffRequest_B7()B", 0), c.e(z.class, "removalTimeout_B8", "getRemovalTimeout_B8()B", 0)};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f62244r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f62245s = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final n f62246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final n f62247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final n f62248h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final n f62249i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final h f62250j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final h f62251k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final h f62252l;

    @NotNull
    public final h m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final h f62253n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final n f62254o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final p f62255p;

    static {
        int i10 = f62245s;
        int i11 = i10 ^ 51;
        int i12 = -(-((i10 & 51) << 1));
        int i13 = (i11 & i12) + (i12 | i11);
        f62244r = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 43 / 0;
        }
    }

    public z() {
        super(setAnimation.getTransactionPortrait().setDividerPadding());
        fd.Companion companion = fd.INSTANCE;
        this.f62246f = new n(0, 7, 0, (openContextMenu) fd.Companion.setX(new Object[0], -1681136479, 1681136479, (int) System.currentTimeMillis()));
        getY.Companion companion2 = getY.INSTANCE;
        this.f62247g = new n(1, 7, 0, getY.Companion.setX());
        i.Companion companion3 = i.INSTANCE;
        this.f62248h = new n(2, 7, 0, (openContextMenu) i.Companion.setCompoundDrawableTintBlendMode(new Object[0], -264606879, 264606879, (int) System.currentTimeMillis()));
        setTransitionVisibility.Companion companion4 = setTransitionVisibility.INSTANCE;
        this.f62249i = new n(3, 7, 0, (openContextMenu) setTransitionVisibility.Companion.setCompoundDrawableTintBlendMode(new Object[0], -1720268721, 1720268721, (int) System.currentTimeMillis()));
        this.f62250j = new h(4, 7);
        this.f62251k = new h(4, 6);
        this.f62252l = new h(4, 5);
        this.m = new h(4, 4);
        this.f62253n = new h(4, 3);
        g.Companion companion5 = g.INSTANCE;
        this.f62254o = new n(5, 7, 0, (openContextMenu) g.Companion.setOnFocusChangeListener(new Object[0], 611118803, -611118803, (int) System.currentTimeMillis()));
        this.f62255p = new p(6);
        new p(7);
        setY(new Object[]{this, fd.N_A}, -1362792018, 1362792029, System.identityHashCode(this));
        setY(new Object[]{this, getY.setNavigationOnClickListener}, 1653459763, -1653459744, System.identityHashCode(this));
        setY(new Object[]{this, i.N_A}, 2047527357, -2047527355, System.identityHashCode(this));
        setY(new Object[]{this, setTransitionVisibility.setOnDragListener}, 1357340711, -1357340703, System.identityHashCode(this));
        setY(new Object[]{this, g.N_A}, 399783940, -399783926, System.identityHashCode(this));
        setY(new Object[]{this, (byte) -1}, -48425587, 48425602, System.identityHashCode(this));
    }

    public static Object setY(Object[] objArr, int i10, int i11, int i12) {
        Object compoundDrawableTintBlendMode;
        Object x4;
        Object objValueOf;
        Object onFocusChangeListener;
        int i13 = ((~(i10 | i11)) * (-495)) + (i11 * (-494)) + (i10 * (-494));
        int i14 = (~i12) | i10;
        int i15 = (((~((~i10) | (~i11))) | (~i14)) * 495) + (i14 * 495) + i13;
        KProperty<Object>[] kPropertyArr = f62243q;
        switch (i15) {
            case 1:
                z zVar = (z) objArr[0];
                int i16 = f62245s;
                int i17 = i16 ^ 7;
                int i18 = ((((i16 & 7) | i17) << 1) - (~(-i17))) - 1;
                f62244r = i18 % 128;
                if (i18 % 2 != 0) {
                    n nVar = zVar.f62249i;
                    compoundDrawableTintBlendMode = n.setCompoundDrawableTintBlendMode(new Object[]{nVar, zVar, kPropertyArr[2]}, 2052976211, -2052976210, System.identityHashCode(nVar));
                } else {
                    n nVar2 = zVar.f62249i;
                    compoundDrawableTintBlendMode = n.setCompoundDrawableTintBlendMode(new Object[]{nVar2, zVar, kPropertyArr[3]}, 2052976211, -2052976210, System.identityHashCode(nVar2));
                }
                setTransitionVisibility settransitionvisibility = (setTransitionVisibility) ((Enum) compoundDrawableTintBlendMode);
                int i19 = f62244r;
                int i20 = ((i19 & 46) + (i19 | 46)) - 1;
                f62245s = i20 % 128;
                int i21 = i20 % 2;
                return settransitionvisibility;
            case 2:
                z zVar2 = (z) objArr[0];
                i iVar = (i) objArr[1];
                int i22 = f62245s;
                int i23 = i22 & 101;
                int i24 = (i22 ^ 101) | i23;
                int i25 = (i23 & i24) + (i24 | i23);
                f62244r = i25 % 128;
                if (i25 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(iVar, "");
                    n nVar3 = zVar2.f62248h;
                    n.setCompoundDrawableTintBlendMode(new Object[]{nVar3, zVar2, kPropertyArr[2], iVar}, 697712004, -697712004, System.identityHashCode(nVar3));
                } else {
                    Intrinsics.checkNotNullParameter(iVar, "");
                    n nVar4 = zVar2.f62248h;
                    n.setCompoundDrawableTintBlendMode(new Object[]{nVar4, zVar2, kPropertyArr[2], iVar}, 697712004, -697712004, System.identityHashCode(nVar4));
                }
                return null;
            case 3:
                z zVar3 = (z) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                int i26 = f62245s;
                int i27 = i26 ^ 83;
                int i28 = ((i26 & 83) | i27) << 1;
                int i29 = -i27;
                int i30 = (i28 & i29) + (i28 | i29);
                f62244r = i30 % 128;
                int i31 = i30 % 2;
                h hVar = zVar3.f62250j;
                h.setOnFocusChangeListener(new Object[]{hVar, zVar3, kPropertyArr[4], Boolean.valueOf(zBooleanValue)}, 951550455, -951550455, System.identityHashCode(hVar));
                int i32 = f62244r + 73;
                f62245s = i32 % 128;
                int i33 = i32 % 2;
                return null;
            case 4:
                z zVar4 = (z) objArr[0];
                int i34 = f62245s;
                int i35 = i34 & 115;
                int i36 = (((i34 | 115) & (~i35)) - (~(i35 << 1))) - 1;
                f62244r = i36 % 128;
                if (i36 % 2 != 0) {
                    p pVar = zVar4.f62255p;
                    x4 = p.setX(new Object[]{pVar, zVar4, kPropertyArr[109]}, -681277519, 681277519, System.identityHashCode(pVar));
                } else {
                    p pVar2 = zVar4.f62255p;
                    x4 = p.setX(new Object[]{pVar2, zVar4, kPropertyArr[10]}, -681277519, 681277519, System.identityHashCode(pVar2));
                }
                byte bByteValue = ((Byte) x4).byteValue();
                int i37 = f62244r + 107;
                f62245s = i37 % 128;
                int i38 = i37 % 2;
                return Byte.valueOf(bByteValue);
            case 5:
                z zVar5 = (z) objArr[0];
                boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
                int i39 = f62245s;
                int i40 = (-2) - ((-1) ^ (((i39 | 106) << 1) - (i39 ^ 106)));
                f62244r = i40 % 128;
                int i41 = i40 % 2;
                h hVar2 = zVar5.f62253n;
                h.setOnFocusChangeListener(new Object[]{hVar2, zVar5, kPropertyArr[8], Boolean.valueOf(zBooleanValue2)}, 951550455, -951550455, System.identityHashCode(hVar2));
                int i42 = f62245s + 11;
                f62244r = i42 % 128;
                if (i42 % 2 != 0) {
                    throw null;
                }
                return null;
            case 6:
                z zVar6 = (z) objArr[0];
                boolean zBooleanValue3 = ((Boolean) objArr[1]).booleanValue();
                int i43 = f62245s;
                int i44 = (i43 ^ 123) + ((i43 & 123) << 1);
                f62244r = i44 % 128;
                int i45 = i44 % 2;
                h hVar3 = zVar6.f62252l;
                h.setOnFocusChangeListener(new Object[]{hVar3, zVar6, kPropertyArr[6], Boolean.valueOf(zBooleanValue3)}, 951550455, -951550455, System.identityHashCode(hVar3));
                int i46 = f62244r;
                int i47 = i46 | 75;
                int i48 = i47 << 1;
                int i49 = -((~(i46 & 75)) & i47);
                int i50 = ((i48 | i49) << 1) - (i49 ^ i48);
                f62245s = i50 % 128;
                if (i50 % 2 == 0) {
                    throw null;
                }
                return null;
            case 7:
                z zVar7 = (z) objArr[0];
                int i51 = f62244r;
                int i52 = i51 & 89;
                int i53 = -(-((i51 ^ 89) | i52));
                int i54 = ((i52 | i53) << 1) - (i53 ^ i52);
                f62245s = i54 % 128;
                int i55 = i54 % 2;
                h hVar4 = zVar7.f62250j;
                return Boolean.valueOf(((Boolean) (i55 == 0 ? h.setOnFocusChangeListener(new Object[]{hVar4, zVar7, kPropertyArr[3]}, -709183664, 709183665, System.identityHashCode(hVar4)) : h.setOnFocusChangeListener(new Object[]{hVar4, zVar7, kPropertyArr[4]}, -709183664, 709183665, System.identityHashCode(hVar4)))).booleanValue());
            case 8:
                z zVar8 = (z) objArr[0];
                setTransitionVisibility settransitionvisibility2 = (setTransitionVisibility) objArr[1];
                int i56 = f62244r + 35;
                f62245s = i56 % 128;
                int i57 = i56 % 2;
                Intrinsics.checkNotNullParameter(settransitionvisibility2, "");
                n nVar5 = zVar8.f62249i;
                n.setCompoundDrawableTintBlendMode(new Object[]{nVar5, zVar8, kPropertyArr[3], settransitionvisibility2}, 697712004, -697712004, System.identityHashCode(nVar5));
                int i58 = ((-1) << 1) - ((f62244r + 56) ^ (-1));
                f62245s = i58 % 128;
                int i59 = i58 % 2;
                return null;
            case 9:
                z zVar9 = (z) objArr[0];
                boolean zBooleanValue4 = ((Boolean) objArr[1]).booleanValue();
                int i60 = f62245s + 89;
                f62244r = i60 % 128;
                int i61 = i60 % 2;
                h hVar5 = zVar9.f62251k;
                h.setOnFocusChangeListener(new Object[]{hVar5, zVar9, kPropertyArr[5], Boolean.valueOf(zBooleanValue4)}, 951550455, -951550455, System.identityHashCode(hVar5));
                int i62 = f62245s;
                int i63 = (-2) - ((-1) ^ (((i62 | 32) << 1) - (i62 ^ 32)));
                f62244r = i63 % 128;
                if (i63 % 2 != 0) {
                    throw null;
                }
                return null;
            case 10:
                z zVar10 = (z) objArr[0];
                int i64 = f62244r;
                int i65 = ((i64 ^ 61) | (i64 & 61)) << 1;
                int i66 = -(((~i64) & 61) | (i64 & (-62)));
                int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
                f62245s = i67 % 128;
                int i68 = i67 % 2;
                n nVar6 = zVar10.f62246f;
                objValueOf = (fd) ((Enum) (i68 == 0 ? n.setCompoundDrawableTintBlendMode(new Object[]{nVar6, zVar10, kPropertyArr[0]}, 2052976211, -2052976210, System.identityHashCode(nVar6)) : n.setCompoundDrawableTintBlendMode(new Object[]{nVar6, zVar10, kPropertyArr[0]}, 2052976211, -2052976210, System.identityHashCode(nVar6))));
                return objValueOf;
            case 11:
                z zVar11 = (z) objArr[0];
                fd fdVar = (fd) objArr[1];
                int i69 = f62244r;
                int i70 = i69 & 15;
                int i71 = i70 + ((i69 ^ 15) | i70);
                f62245s = i71 % 128;
                int i72 = i71 % 2;
                Intrinsics.checkNotNullParameter(fdVar, "");
                n nVar7 = zVar11.f62246f;
                n.setCompoundDrawableTintBlendMode(new Object[]{nVar7, zVar11, kPropertyArr[0], fdVar}, 697712004, -697712004, System.identityHashCode(nVar7));
                int i73 = f62244r;
                int i74 = ((i73 | 89) << 1) - (i73 ^ 89);
                f62245s = i74 % 128;
                int i75 = i74 % 2;
                return null;
            case 12:
                z zVar12 = (z) objArr[0];
                j jVar = new j(zVar12.setNavigationOnClickListener(), zVar12.getNavBarTitleString(), zVar12.setIncludeFontPadding(), ((Boolean) setY(new Object[]{zVar12}, 1076207409, -1076207393, System.identityHashCode(zVar12))).booleanValue(), zVar12.setZ(), zVar12.setAlwaysDrawnWithCacheEnabled(), zVar12.setLayoutAnimation(), null, null, BluetoothState.REQUEST_CONNECT_DEVICE, null);
                int i76 = f62245s;
                int i77 = i76 & 69;
                int i78 = -(-((i76 ^ 69) | i77));
                int i79 = ((i77 | i78) << 1) - (i78 ^ i77);
                f62244r = i79 % 128;
                if (i79 % 2 == 0) {
                    return jVar;
                }
                throw null;
            case 13:
                z zVar13 = (z) objArr[0];
                int i80 = f62244r;
                int i81 = (i80 & 99) + (i80 | 99);
                f62245s = i81 % 128;
                int i82 = i81 % 2;
                n nVar8 = zVar13.f62247g;
                getY gety = (getY) ((Enum) (i82 == 0 ? n.setCompoundDrawableTintBlendMode(new Object[]{nVar8, zVar13, kPropertyArr[1]}, 2052976211, -2052976210, System.identityHashCode(nVar8)) : n.setCompoundDrawableTintBlendMode(new Object[]{nVar8, zVar13, kPropertyArr[1]}, 2052976211, -2052976210, System.identityHashCode(nVar8))));
                int i83 = f62245s;
                int i84 = ((i83 ^ 45) | (i83 & 45)) << 1;
                int i85 = -(((~i83) & 45) | (i83 & (-46)));
                int i86 = (i84 & i85) + (i85 | i84);
                f62244r = i86 % 128;
                if (i86 % 2 == 0) {
                    return gety;
                }
                int i87 = 74 / 0;
                return gety;
            case 14:
                z zVar14 = (z) objArr[0];
                g gVar = (g) objArr[1];
                int i88 = f62245s;
                int i89 = i88 ^ 121;
                int i90 = -(-((i88 & 121) << 1));
                int i91 = ((i89 | i90) << 1) - (i90 ^ i89);
                f62244r = i91 % 128;
                if (i91 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(gVar, "");
                    n nVar9 = zVar14.f62254o;
                    n.setCompoundDrawableTintBlendMode(new Object[]{nVar9, zVar14, kPropertyArr[61], gVar}, 697712004, -697712004, System.identityHashCode(nVar9));
                } else {
                    Intrinsics.checkNotNullParameter(gVar, "");
                    n nVar10 = zVar14.f62254o;
                    n.setCompoundDrawableTintBlendMode(new Object[]{nVar10, zVar14, kPropertyArr[9], gVar}, 697712004, -697712004, System.identityHashCode(nVar10));
                }
                return null;
            case 15:
                z zVar15 = (z) objArr[0];
                byte bByteValue2 = ((Byte) objArr[1]).byteValue();
                int i92 = f62244r;
                int i93 = i92 & 69;
                int i94 = -(-((i92 ^ 69) | i93));
                int i95 = (i93 & i94) + (i94 | i93);
                f62245s = i95 % 128;
                int i96 = i95 % 2;
                p pVar3 = zVar15.f62255p;
                p.setX(new Object[]{pVar3, zVar15, kPropertyArr[10], Byte.valueOf(bByteValue2)}, 1628090707, -1628090706, System.identityHashCode(pVar3));
                int i97 = f62244r + 60;
                int i98 = (i97 ^ (-1)) + (i97 << 1);
                f62245s = i98 % 128;
                int i99 = i98 % 2;
                return null;
            case 16:
                z zVar16 = (z) objArr[0];
                int i100 = f62244r;
                int i101 = ((i100 & 85) - (~(-(-(i100 | 85))))) - 1;
                f62245s = i101 % 128;
                if (i101 % 2 == 0) {
                    h hVar6 = zVar16.f62251k;
                    onFocusChangeListener = h.setOnFocusChangeListener(new Object[]{hVar6, zVar16, kPropertyArr[2]}, -709183664, 709183665, System.identityHashCode(hVar6));
                } else {
                    h hVar7 = zVar16.f62251k;
                    onFocusChangeListener = h.setOnFocusChangeListener(new Object[]{hVar7, zVar16, kPropertyArr[5]}, -709183664, 709183665, System.identityHashCode(hVar7));
                }
                boolean zBooleanValue5 = ((Boolean) onFocusChangeListener).booleanValue();
                int i102 = f62244r;
                int i103 = i102 & 31;
                int i104 = ((i102 ^ 31) | i103) << 1;
                int i105 = -((i102 | 31) & (~i103));
                int i106 = (i104 & i105) + (i105 | i104);
                f62245s = i106 % 128;
                if (i106 % 2 == 0) {
                    int i107 = 35 / 0;
                }
                objValueOf = Boolean.valueOf(zBooleanValue5);
                return objValueOf;
            case 17:
                z zVar17 = (z) objArr[0];
                boolean zBooleanValue6 = ((Boolean) objArr[1]).booleanValue();
                int i108 = f62245s;
                int i109 = (i108 & 37) + (i108 | 37);
                f62244r = i109 % 128;
                int i110 = i109 % 2;
                h hVar8 = zVar17.m;
                h.setOnFocusChangeListener(new Object[]{hVar8, zVar17, kPropertyArr[7], Boolean.valueOf(zBooleanValue6)}, 951550455, -951550455, System.identityHashCode(hVar8));
                int i111 = f62245s;
                int i112 = i111 & 73;
                int i113 = (i111 | 73) & (~i112);
                int i114 = i112 << 1;
                int i115 = (i113 & i114) + (i113 | i114);
                f62244r = i115 % 128;
                if (i115 % 2 != 0) {
                    throw null;
                }
                return null;
            case 18:
                int i116 = f62245s;
                int i117 = (i116 & 37) + (i116 | 37);
                f62244r = i117 % 128;
                if (i117 % 2 == 0) {
                    setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
                    return "";
                }
                setRenderEffect setrendereffect2 = setRenderEffect.INSTANCE;
                throw null;
            case 19:
                z zVar18 = (z) objArr[0];
                getY gety2 = (getY) objArr[1];
                int i118 = f62244r;
                int i119 = ((i118 | 5) << 1) - (i118 ^ 5);
                f62245s = i119 % 128;
                int i120 = i119 % 2;
                Intrinsics.checkNotNullParameter(gety2, "");
                n nVar11 = zVar18.f62247g;
                n.setCompoundDrawableTintBlendMode(new Object[]{nVar11, zVar18, kPropertyArr[1], gety2}, 697712004, -697712004, System.identityHashCode(nVar11));
                int i121 = f62245s;
                int i122 = i121 & 111;
                int i123 = ((i121 | 111) & (~i122)) + (i122 << 1);
                f62244r = i123 % 128;
                if (i123 % 2 != 0) {
                    throw null;
                }
                return null;
            default:
                z zVar19 = (z) objArr[0];
                int i124 = f62245s;
                int i125 = i124 ^ 9;
                int i126 = -(-((i124 & 9) << 1));
                int i127 = (i125 ^ i126) + ((i126 & i125) << 1);
                f62244r = i127 % 128;
                int i128 = i127 % 2;
                h hVar9 = zVar19.f62253n;
                boolean zBooleanValue7 = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar9, zVar19, kPropertyArr[8]}, -709183664, 709183665, System.identityHashCode(hVar9))).booleanValue();
                int i129 = f62245s + 23;
                f62244r = i129 % 128;
                int i130 = i129 % 2;
                return Boolean.valueOf(zBooleanValue7);
        }
    }

    @NotNull
    public final getY getNavBarTitleString() {
        return (getY) setY(new Object[]{this}, -1590722919, 1590722932, System.identityHashCode(this));
    }

    public final byte setAlwaysDrawnWithCacheEnabled() {
        return ((Byte) setY(new Object[]{this}, -746235387, 746235391, System.identityHashCode(this))).byteValue();
    }

    public final void setCompoundDrawableTintBlendMode(byte b10) {
        setY(new Object[]{this, Byte.valueOf(b10)}, -48425587, 48425602, System.identityHashCode(this));
    }

    public final void setDividerPadding(boolean z10) {
        setY(new Object[]{this, Boolean.valueOf(z10)}, 1618972104, -1618972098, System.identityHashCode(this));
    }

    public final boolean setIncludeFontPadding() {
        return ((Boolean) setY(new Object[]{this}, -837836248, 837836255, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final setTransitionVisibility setLayoutAnimation() {
        return (setTransitionVisibility) setY(new Object[]{this}, -1655190133, 1655190134, System.identityHashCode(this));
    }

    @NotNull
    public final fd setNavigationOnClickListener() {
        return (fd) setY(new Object[]{this}, -963084998, 963085008, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(@NotNull g gVar) {
        setY(new Object[]{this, gVar}, 399783940, -399783926, System.identityHashCode(this));
    }

    @NotNull
    public final j setTextAlignment() {
        return (j) setY(new Object[]{this}, 1928645157, -1928645145, System.identityHashCode(this));
    }

    public final void setX(boolean z10) {
        setY(new Object[]{this, Boolean.valueOf(z10)}, 1456680272, -1456680263, System.identityHashCode(this));
    }

    public final boolean setZ() {
        return ((Boolean) setY(new Object[]{this}, -581596710, 581596710, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.setImageTintList
    @NotNull
    public final String toString() {
        return (String) setY(new Object[]{this}, -969702573, 969702591, System.identityHashCode(this));
    }

    public final void setCompoundDrawableTintBlendMode(boolean z10) {
        setY(new Object[]{this, Boolean.valueOf(z10)}, 2127853437, -2127853420, System.identityHashCode(this));
    }

    public final void setDividerPadding(@NotNull fd fdVar) {
        setY(new Object[]{this, fdVar}, -1362792018, 1362792029, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(boolean z10) {
        setY(new Object[]{this, Boolean.valueOf(z10)}, -699002700, 699002705, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(@NotNull setTransitionVisibility settransitionvisibility) {
        setY(new Object[]{this, settransitionvisibility}, 1357340711, -1357340703, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(@NotNull i iVar) {
        setY(new Object[]{this, iVar}, 2047527357, -2047527355, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(@NotNull getY gety) {
        setY(new Object[]{this, gety}, 1653459763, -1653459744, System.identityHashCode(this));
    }

    public final void setY(boolean z10) {
        setY(new Object[]{this, Boolean.valueOf(z10)}, 1802544043, -1802544040, System.identityHashCode(this));
    }
}
