package com.mypinpad.tsdk.isolation;

import c2.b;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.android.gms.wearable.WearableStatusCodes;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b%\u0010&J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0014\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019R&\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\tX\u0087\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\""}, d2 = {"Lcom/mypinpad/tsdk/i/create;", "", "Lcom/mypinpad/tsdk/i/Terminal;", "p0", "Lcom/mypinpad/tsdk/i/setMaxWidth;", "p1", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/Terminal;Lcom/mypinpad/tsdk/i/setMaxWidth;)Z", "", "toString", "()Ljava/lang/String;", "", GenerateActivationFormCommand.HASH_CODE, "()I", "equals", "(Ljava/lang/Object;)Z", "Lcom/mypinpad/tsdk/i/setBackgroundTintList;", "a", "Lcom/mypinpad/tsdk/i/setBackgroundTintList;", "setX", "()Lcom/mypinpad/tsdk/i/setBackgroundTintList;", "setOnFocusChangeListener", "b", "Lcom/mypinpad/tsdk/i/setMaxWidth;", "()Lcom/mypinpad/tsdk/i/setMaxWidth;", "", "Lcom/mypinpad/tsdk/i/md;", "Lcom/mypinpad/tsdk/i/setMax;", "c", "Ljava/util/Map;", "setDividerPadding", "()Ljava/util/Map;", "setY", "Ljava/lang/String;", "p2", "p3", "<init>", "(Lcom/mypinpad/tsdk/i/setBackgroundTintList;Lcom/mypinpad/tsdk/i/setMaxWidth;Ljava/util/Map;Ljava/lang/String;)V"}, k = 1, mv = {1, 5, 1})
public final /* data */ class create {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f55033d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f55034e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final setBackgroundTintList setOnFocusChangeListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final setMaxWidth setX;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<md, setMax> setY;

    @Nullable
    public String setCompoundDrawableTintBlendMode;

    public create(@NotNull setBackgroundTintList setbackgroundtintlist, @NotNull setMaxWidth setmaxwidth, @NotNull Map<md, setMax> map, @Nullable String str) {
        Intrinsics.checkNotNullParameter(setbackgroundtintlist, "");
        Intrinsics.checkNotNullParameter(setmaxwidth, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.setOnFocusChangeListener = setbackgroundtintlist;
        this.setX = setmaxwidth;
        this.setY = map;
        this.setCompoundDrawableTintBlendMode = str;
    }

    /* JADX WARN: Code duplicated, block: B:86:0x045e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[LOOP:0: B:66:0x0383->B:88:?, LOOP_END, SYNTHETIC] */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Exception {
        boolean z10;
        int i13 = (~i10) | (~i12);
        int i14 = ((i10 | (~(i11 | i12))) * 519) + (((~(i13 | i11)) | (~(i10 | i11 | i12))) * (-519)) + (((~i13) | i11) * 519) + (i11 * (-518)) + (i10 * (-518));
        int iHashCode = 0;
        switch (i14) {
            case 1:
                create createVar = (create) objArr[0];
                Terminal terminal = (Terminal) objArr[1];
                setMaxWidth setmaxwidth = (setMaxWidth) objArr[2];
                Intrinsics.checkNotNullParameter(terminal, "");
                Intrinsics.checkNotNullParameter(setmaxwidth, "");
                setMaxWidth setmaxwidth2 = new setMaxWidth();
                setMaxWidth.setX(new Object[]{setmaxwidth2, setmaxwidth}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth2));
                setMaxWidth.setX(new Object[]{setmaxwidth2, (setMaxWidth) setDividerPadding(new Object[]{createVar}, 719526861, -719526857, System.identityHashCode(createVar))}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth2));
                Map<md, setMax> map = createVar.setY;
                if (!map.isEmpty()) {
                    int i15 = f55033d;
                    int i16 = ((i15 & 24) + (i15 | 24)) - 1;
                    f55034e = i16 % 128;
                    int i17 = i16 % 2;
                    int i18 = f55034e;
                    int i19 = (i18 & 3) + (i18 | 3);
                    f55033d = i19 % 128;
                    int i20 = i19 % 2;
                    for (Map.Entry<md, setMax> entry : map.entrySet()) {
                        int i21 = f55033d;
                        int i22 = i21 & 117;
                        int i23 = ((((i21 ^ 117) | i22) << 1) - (~(-((i21 | 117) & (~i22))))) - 1;
                        f55034e = i23 % 128;
                        int i24 = i23 % 2;
                        setMax value = entry.getValue();
                        if (Intrinsics.areEqual((setBackgroundTintList) setMax.setX(new Object[]{value}, 1901627190, -1901627173, System.identityHashCode(value)), (setBackgroundTintList) setDividerPadding(new Object[]{createVar}, 1355723687, -1355723682, System.identityHashCode(createVar)))) {
                            int i25 = f55033d + 13;
                            f55034e = i25 % 128;
                            if (i25 % 2 == 0) {
                                setMax value2 = entry.getValue();
                                ((Boolean) setMax.setX(new Object[]{value2, terminal, setmaxwidth2}, -1456822105, 1456822117, System.identityHashCode(value2))).booleanValue();
                            } else {
                                setMax value3 = entry.getValue();
                                ((Boolean) setMax.setX(new Object[]{value3, terminal, setmaxwidth2}, -1456822105, 1456822117, System.identityHashCode(value3))).booleanValue();
                                z10 = true;
                            }
                            if (!(!z10)) {
                                int i26 = f55034e;
                                int i27 = i26 ^ 119;
                                int i28 = (((i26 & 119) | i27) << 1) - i27;
                                f55033d = i28 % 128;
                                int i29 = i28 % 2;
                                int i30 = ((i26 ^ 20) + ((i26 & 20) << 1)) - 1;
                                f55033d = i30 % 128;
                                int i31 = i30 % 2;
                                SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                                setBackgroundTintList setbackgroundtintlist = (setBackgroundTintList) setDividerPadding(new Object[]{createVar}, 1355723687, -1355723682, System.identityHashCode(createVar));
                                SouthPacificEndpoint.setX(new Object[]{Intrinsics.stringPlus("Invalid application configuration, AID: ", (String) setInputExtras.setDividerPadding(new Object[]{(byte[]) setBackgroundTintList.setX(new Object[]{setbackgroundtintlist}, -1453308222, 1453308224, System.identityHashCode(setbackgroundtintlist))}, 1609250238, -1609250236, (int) System.currentTimeMillis()))}, 818541572, -818541572, (int) System.currentTimeMillis());
                                throw new setIndeterminateDrawable(WearableStatusCodes.UNKNOWN_LISTENER, setInputExtras.setOnFocusChangeListener(createVar.setX().setY()), null, 4, null);
                            }
                        } else {
                            int i32 = f55034e;
                            int i33 = ((i32 | 69) << 1) - (i32 ^ 69);
                            f55033d = i33 % 128;
                            int i34 = i33 % 2;
                        }
                        z10 = false;
                        if (!(!z10)) {
                            int i210 = f55034e;
                            int i211 = i210 ^ 119;
                            int i212 = (((i210 & 119) | i211) << 1) - i211;
                            f55033d = i212 % 128;
                            int i213 = i212 % 2;
                            int i35 = ((i210 ^ 20) + ((i210 & 20) << 1)) - 1;
                            f55033d = i35 % 128;
                            int i36 = i35 % 2;
                            SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
                            setBackgroundTintList setbackgroundtintlist2 = (setBackgroundTintList) setDividerPadding(new Object[]{createVar}, 1355723687, -1355723682, System.identityHashCode(createVar));
                            SouthPacificEndpoint.setX(new Object[]{Intrinsics.stringPlus("Invalid application configuration, AID: ", (String) setInputExtras.setDividerPadding(new Object[]{(byte[]) setBackgroundTintList.setX(new Object[]{setbackgroundtintlist2}, -1453308222, 1453308224, System.identityHashCode(setbackgroundtintlist2))}, 1609250238, -1609250236, (int) System.currentTimeMillis()))}, 818541572, -818541572, (int) System.currentTimeMillis());
                            throw new setIndeterminateDrawable(WearableStatusCodes.UNKNOWN_LISTENER, setInputExtras.setOnFocusChangeListener(createVar.setX().setY()), null, 4, null);
                        }
                    }
                }
                int i37 = f55034e;
                int i38 = i37 & 89;
                int i39 = ((i37 ^ 89) | i38) << 1;
                int i40 = -((i37 | 89) & (~i38));
                int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                int i42 = i41 % 128;
                f55033d = i42;
                int i43 = i41 % 2;
                int i44 = (((i42 | 70) << 1) - (i42 ^ 70)) - 1;
                f55034e = i44 % 128;
                if (i44 % 2 == 0) {
                    int i45 = 21 / 0;
                }
                return Boolean.TRUE;
            case 2:
                create createVar2 = (create) objArr[0];
                int i46 = f55034e;
                int i47 = i46 & 99;
                int i48 = ((((i46 ^ 99) | i47) << 1) - (~(-((i46 | 99) & (~i47))))) - 1;
                f55033d = i48 % 128;
                int i49 = i48 % 2;
                int iHashCode2 = createVar2.setOnFocusChangeListener.hashCode();
                int i50 = iHashCode2 * 31;
                int iHashCode3 = createVar2.setX.hashCode();
                System.identityHashCode(createVar2);
                int i51 = iHashCode3 * (-1831);
                int i52 = iHashCode2 * 28427;
                int i53 = i51 & i52;
                int i54 = ((((i51 ^ i52) | i53) << 1) - (~(-((i52 | i51) & (~i53))))) - 1;
                int i55 = ~iHashCode3;
                int i56 = (i55 | iHashCode3) & i55;
                int i57 = i56 ^ i50;
                int i58 = i56 & i50;
                int i59 = (~((i58 & i57) | (i57 ^ i58))) * 2748;
                int i60 = i54 & i59;
                int i61 = i60 + ((i59 ^ i54) | i60);
                int i62 = ~i50;
                int i63 = i55 ^ i62;
                int i64 = i55 & i62;
                int i65 = (i63 | i64) * (-916);
                int i66 = ((((~i65) & i61) | ((~i61) & i65)) - (~(-(-((i65 & i61) << 1))))) - 1;
                int i67 = ~((i64 & i63) | (i63 ^ i64));
                int i68 = (i50 & iHashCode3) | (iHashCode3 ^ i50);
                int i69 = ~i68;
                int i70 = (i68 | i69) & i69;
                int i71 = ((~i70) & i67) | ((~i67) & i70);
                int i72 = i67 & i70;
                int i73 = ((i72 & i71) | (i71 ^ i72)) * 916;
                int i74 = i66 ^ i73;
                int i75 = (i73 & i66) << 1;
                int i76 = (i74 & i75) + (i75 | i74);
                int i77 = i76 * 31;
                int iHashCode4 = createVar2.setY.hashCode();
                int iIdentityHashCode = System.identityHashCode(createVar2);
                int i78 = (i76 * (-1519)) + (iHashCode4 * 51);
                int i79 = iHashCode4 & iIdentityHashCode;
                int i80 = (i79 | ((~i79) & (iHashCode4 | iIdentityHashCode))) * (-50);
                int i81 = (i78 & i80) + (i78 | i80);
                int i82 = ~iHashCode4;
                int i83 = ~i77;
                int i84 = i82 & i83;
                int i85 = i84 | ((~i84) & (i82 | i83));
                int i86 = (i85 & iIdentityHashCode) | (i85 ^ iIdentityHashCode);
                int i87 = ~i86;
                int i88 = (i86 | i87) & i87;
                int i89 = ~iIdentityHashCode;
                int i90 = (iIdentityHashCode | i89) & i89;
                int i91 = (i90 & i83) | (i83 ^ i90);
                int i92 = (i82 & i91) | ((~i91) & iHashCode4);
                int i93 = i91 & iHashCode4;
                int i94 = ~((i92 & i93) | (i92 ^ i93));
                int i95 = i88 & i94;
                int i96 = (i81 - (~((((i94 | i88) & (~i95)) | i95) * 50))) - 1;
                int i97 = ~(((~i89) & i83) | ((~i83) & i89) | (i83 & i89));
                int i98 = ~(i83 | iHashCode4);
                int i99 = ((~i98) & i97) | ((~i97) & i98);
                int i100 = i98 & i97;
                int i101 = (i100 & i99) | (i99 ^ i100);
                int i102 = ~((iHashCode4 & i89) | (i89 ^ iHashCode4));
                int i103 = i101 & i102;
                int i104 = (i101 | i102) & (~i103);
                int iE = b.e(i96, ~(-(-(((i104 & i103) | (i104 ^ i103)) * 50))), 1, 31);
                String str = createVar2.setCompoundDrawableTintBlendMode;
                if (str == null) {
                    int i105 = f55034e;
                    int i106 = i105 + 41;
                    f55033d = i106 % 128;
                    int i107 = i106 % 2;
                    int i108 = (-2) - (((i105 & 88) + (i105 | 88)) ^ (-1));
                    f55033d = i108 % 128;
                    int i109 = i108 % 2;
                } else {
                    iHashCode = str.hashCode();
                    int i110 = f55033d;
                    int i111 = i110 & 37;
                    int i112 = -(-((i110 ^ 37) | i111));
                    int i113 = ((i111 | i112) << 1) - (i112 ^ i111);
                    f55034e = i113 % 128;
                    int i114 = i113 % 2;
                }
                int i115 = (iE - (~(-(-iHashCode)))) - 1;
                int i116 = f55033d;
                int i117 = ((i116 ^ 79) - (~((i116 & 79) << 1))) - 1;
                f55034e = i117 % 128;
                if (i117 % 2 != 0) {
                    return Integer.valueOf(i115);
                }
                throw null;
            case 3:
                Boolean bool = Boolean.FALSE;
                create createVar3 = (create) objArr[0];
                Object obj = objArr[1];
                int i118 = f55034e;
                int i119 = (i118 & 73) + (i118 | 73);
                int i120 = i119 % 128;
                f55033d = i120;
                int i121 = i119 % 2;
                if (createVar3 != obj) {
                    if (obj instanceof create) {
                        create createVar4 = (create) obj;
                        if (!Intrinsics.areEqual(createVar3.setOnFocusChangeListener, createVar4.setOnFocusChangeListener)) {
                            int i122 = f55033d;
                            int i123 = i122 ^ 89;
                            int i124 = -(-((i122 & 89) << 1));
                            int i125 = (i123 & i124) + (i124 | i123);
                            int i126 = i125 % 128;
                            f55034e = i126;
                            int i127 = i125 % 2;
                            int i128 = i126 & 85;
                            int i129 = -(-((i126 ^ 85) | i128));
                            int i130 = (i128 & i129) + (i129 | i128);
                            f55033d = i130 % 128;
                            if (i130 % 2 != 0) {
                                throw null;
                            }
                        } else if (!Intrinsics.areEqual(createVar3.setX, createVar4.setX)) {
                            int i131 = f55034e;
                            int i132 = i131 + 81;
                            f55033d = i132 % 128;
                            int i133 = i132 % 2;
                            int i134 = i131 + 31;
                            f55033d = i134 % 128;
                            if (i134 % 2 != 0) {
                                throw null;
                            }
                        } else if (!Intrinsics.areEqual(createVar3.setY, createVar4.setY)) {
                            int i135 = f55033d;
                            int i136 = ((i135 | 71) << 1) - (i135 ^ 71);
                            f55034e = i136 % 128;
                            int i137 = i136 % 2;
                            int i138 = i135 & 1;
                            int i139 = i138 + ((i135 ^ 1) | i138);
                            f55034e = i139 % 128;
                            if (i139 % 2 == 0) {
                                throw null;
                            }
                        } else if (Intrinsics.areEqual(createVar3.setCompoundDrawableTintBlendMode, createVar4.setCompoundDrawableTintBlendMode)) {
                            int i140 = f55033d + 1;
                            f55034e = i140 % 128;
                            if (i140 % 2 == 0) {
                                int i141 = 38 / 0;
                            }
                        } else {
                            int i142 = f55034e;
                            int i143 = i142 & 103;
                            int i144 = ((((i142 ^ 103) | i143) << 1) - (~(-((~i143) & (i142 | 103))))) - 1;
                            f55033d = i144 % 128;
                            int i145 = i144 % 2;
                            int i146 = i142 + 18;
                            int i147 = (i146 ^ (-1)) + (i146 << 1);
                            f55033d = i147 % 128;
                            if (i147 % 2 != 0) {
                                int i148 = 0 / 0;
                            }
                        }
                    } else {
                        int i149 = i118 + 52;
                        int i150 = (i149 ^ (-1)) + (i149 << 1);
                        f55033d = i150 % 128;
                        int i151 = i150 % 2;
                    }
                    return bool;
                }
                int i152 = (i120 ^ 123) + ((i120 & 123) << 1);
                int i153 = i152 % 128;
                f55034e = i153;
                int i154 = i152 % 2;
                int i155 = (i153 ^ 19) + ((i153 & 19) << 1);
                f55033d = i155 % 128;
                int i156 = i155 % 2;
                return Boolean.TRUE;
            case 4:
                create createVar5 = (create) objArr[0];
                int i157 = f55033d;
                int i158 = ((i157 ^ 21) | (i157 & 21)) << 1;
                int i159 = -(((~i157) & 21) | (i157 & (-22)));
                int i160 = (i158 & i159) + (i159 | i158);
                int i161 = i160 % 128;
                f55034e = i161;
                int i162 = i160 % 2;
                setMaxWidth setmaxwidth3 = createVar5.setX;
                if (i162 == 0) {
                    throw null;
                }
                int i163 = i161 & 89;
                int i164 = i163 + ((i161 ^ 89) | i163);
                f55033d = i164 % 128;
                int i165 = i164 % 2;
                return setmaxwidth3;
            case 5:
                create createVar6 = (create) objArr[0];
                int i166 = (-2) - ((f55034e + 104) ^ (-1));
                int i167 = i166 % 128;
                f55033d = i167;
                int i168 = i166 % 2;
                setBackgroundTintList setbackgroundtintlist3 = createVar6.setOnFocusChangeListener;
                int i169 = i167 & 63;
                int i170 = (((i167 | 63) & (~i169)) - (~(i169 << 1))) - 1;
                f55034e = i170 % 128;
                if (i170 % 2 != 0) {
                    return setbackgroundtintlist3;
                }
                throw null;
            case 6:
                create createVar7 = (create) objArr[0];
                int i171 = f55033d;
                int i172 = ((i171 & (-16)) | ((~i171) & 15)) + ((i171 & 15) << 1);
                f55034e = i172 % 128;
                int i173 = i172 % 2;
                Map<md, setMax> map2 = createVar7.setY;
                int i174 = i171 ^ 89;
                int i175 = (((i171 & 89) | i174) << 1) - i174;
                f55034e = i175 % 128;
                int i176 = i175 % 2;
                return map2;
            default:
                int i177 = f55033d + 51;
                int i178 = i177 % 128;
                f55034e = i178;
                if (i177 % 2 == 0) {
                    int i179 = 41 / 0;
                }
                int i180 = (i178 | 63) << 1;
                int i181 = -(i178 ^ 63);
                int i182 = (i180 ^ i181) + ((i180 & i181) << 1);
                f55033d = i182 % 128;
                if (i182 % 2 != 0) {
                    int i183 = 66 / 0;
                }
                return "AC";
        }
    }

    public final boolean equals(@Nullable Object p4) {
        return ((Boolean) setDividerPadding(new Object[]{this, p4}, 927349923, -927349920, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, 1838749909, -1838749907, System.identityHashCode(this))).intValue();
    }

    public final boolean setCompoundDrawableTintBlendMode(@NotNull Terminal p4, @NotNull setMaxWidth p10) {
        return ((Boolean) setDividerPadding(new Object[]{this, p4, p10}, 1343966852, -1343966851, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    public final setMaxWidth setOnFocusChangeListener() {
        return (setMaxWidth) setDividerPadding(new Object[]{this}, 719526861, -719526857, System.identityHashCode(this));
    }

    @JvmName(name = "setX")
    @NotNull
    public final setBackgroundTintList setX() {
        return (setBackgroundTintList) setDividerPadding(new Object[]{this}, 1355723687, -1355723682, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setDividerPadding(new Object[]{this}, 1558638278, -1558638278, System.identityHashCode(this));
    }

    @JvmName(name = "setDividerPadding")
    @NotNull
    public final Map<md, setMax> setDividerPadding() {
        return (Map) setDividerPadding(new Object[]{this}, 127736117, -127736111, System.identityHashCode(this));
    }
}
