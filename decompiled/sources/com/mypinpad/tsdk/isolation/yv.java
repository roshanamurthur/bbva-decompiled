package com.mypinpad.tsdk.isolation;

import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0001¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Lcom/mypinpad/tsdk/i/yv;", "Lcom/mypinpad/tsdk/i/yl;", "Lcom/mypinpad/tsdk/i/yl$setCompoundDrawableTintBlendMode;", "p0", "Lcom/mypinpad/tsdk/i/yr;", "setX", "(Lcom/mypinpad/tsdk/i/yl$setCompoundDrawableTintBlendMode;)Lcom/mypinpad/tsdk/i/yr;", "Lcom/mypinpad/tsdk/i/xr;", "setY", "Lcom/mypinpad/tsdk/i/xr;", "<init>", "(Lcom/mypinpad/tsdk/i/xr;)V", "setOnFocusChangeListener"}, k = 1, mv = {1, 6, 0})
public final class yv implements yl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f62209a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f62210b = 1;

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    public xr setY;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.yv$setOnFocusChangeListener, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/yv$setOnFocusChangeListener;", "", "<init>", "()V"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f62211a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f62212b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:142:0x014d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:145:0x0182 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:18:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:20:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:22:0x0127  */
        /* JADX WARN: Code duplicated, block: B:23:0x0129  */
        /* JADX WARN: Code duplicated, block: B:25:0x013a  */
        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            yr yrVar;
            yn ynVar;
            int i13;
            int i14;
            String str;
            int i15;
            int i16 = ~i10;
            int i17 = ~i11;
            int i18 = (~(i16 | i17)) | (~(i17 | i12));
            int i19 = ~(i11 | (~i12) | i10);
            int i20 = (((~(i10 | i17 | i12)) | i19) * 470) + ((i18 | i19) * (-470)) + ((i10 | i11) * (-470)) + (i11 * 471) + (i10 * 471);
            if (i20 == 1) {
                String str2 = (String) objArr[0];
                int i21 = f62212b;
                int i22 = i21 & 23;
                int i23 = (i21 ^ 23) | i22;
                int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                f62211a = i24 % 128;
                int i25 = i24 % 2;
                if (!l.equals("Connection", str2, true)) {
                    int i26 = f62212b;
                    int i27 = (((i26 & (-86)) | ((~i26) & 85)) - (~(-(-((i26 & 85) << 1))))) - 1;
                    f62211a = i27 % 128;
                    if (i27 % 2 == 0 ? !l.equals("Keep-Alive", str2, true) : (!l.equals("Keep-Alive", str2, true))) {
                        if (!l.equals("Proxy-Authenticate", str2, true)) {
                            int i28 = f62212b;
                            int i29 = i28 & 113;
                            int i30 = ((i28 | 113) & (~i29)) + (i29 << 1);
                            f62211a = i30 % 128;
                            if (i30 % 2 == 0 ? !l.equals("Proxy-Authorization", str2, true) : !l.equals("Proxy-Authorization", str2, true)) {
                                if (!l.equals("TE", str2, true)) {
                                    int i31 = f62211a;
                                    int i32 = i31 & 63;
                                    int i33 = i32 + ((i31 ^ 63) | i32);
                                    f62212b = i33 % 128;
                                    if (i33 % 2 != 0 ? !l.equals("Trailers", str2, true) : (!l.equals("Trailers", str2, false))) {
                                        if (!l.equals("Transfer-Encoding", str2, true)) {
                                            int i34 = f62211a;
                                            int i35 = ((i34 & 60) + (i34 | 60)) - 1;
                                            f62212b = i35 % 128;
                                            if (i35 % 2 != 0 ? (!l.equals("Upgrade", str2, true)) : !l.equals("Upgrade", str2, true)) {
                                                int i36 = f62212b;
                                                int i37 = ((i36 ^ 42) + ((i36 & 42) << 1)) - 1;
                                                f62211a = i37 % 128;
                                                if (i37 % 2 == 0) {
                                                    return Boolean.TRUE;
                                                }
                                                throw null;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int i38 = f62212b + 51;
                f62211a = i38 % 128;
                if (i38 % 2 == 0) {
                    return Boolean.FALSE;
                }
                throw null;
            }
            if (i20 == 2) {
                yr yrVar2 = (yr) objArr[0];
                int i39 = f62211a;
                int i40 = i39 & 119;
                int i41 = ((i39 ^ 119) | i40) << 1;
                int i42 = -((i39 | 119) & (~i40));
                int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                f62212b = i43 % 128;
                Object[] objArr2 = new Object[1];
                if (i43 % 2 == 0) {
                    objArr2[0] = yrVar2;
                    yrVar = (yr) setDividerPadding(objArr2, -386912859, 386912863, (int) System.currentTimeMillis());
                    int i44 = 31 / 0;
                } else {
                    objArr2[0] = yrVar2;
                    yrVar = (yr) setDividerPadding(objArr2, -386912859, 386912863, (int) System.currentTimeMillis());
                }
                int i45 = f62211a + 17;
                f62212b = i45 % 128;
                int i46 = i45 % 2;
                return yrVar;
            }
            if (i20 == 3) {
                String str3 = (String) objArr[0];
                int i47 = f62211a;
                int i48 = (i47 & 120) + (i47 | 120);
                int i49 = (i48 ^ (-1)) + (i48 << 1);
                f62212b = i49 % 128;
                int i50 = i49 % 2;
                if (!l.equals("Content-Length", str3, true)) {
                    int i51 = f62211a;
                    int i52 = ((i51 ^ 77) | (i51 & 77)) << 1;
                    int i53 = -(((~i51) & 77) | (i51 & (-78)));
                    int i54 = (i52 & i53) + (i53 | i52);
                    f62212b = i54 % 128;
                    int i55 = i54 % 2;
                    if (!l.equals("Content-Encoding", str3, true)) {
                        int i56 = f62211a;
                        int i57 = i56 & 19;
                        int i58 = i56 | 19;
                        int i59 = (i57 ^ i58) + ((i58 & i57) << 1);
                        f62212b = i59 % 128;
                        int i60 = i59 % 2;
                        if (!l.equals(DigipassManagerConstants.KEY_CONTENT_TYPE, str3, true)) {
                            int i61 = f62212b;
                            int i62 = i61 & 45;
                            int i63 = (i62 - (~(-(-((i61 ^ 45) | i62))))) - 1;
                            f62211a = i63 % 128;
                            if (i63 % 2 == 0) {
                                return Boolean.FALSE;
                            }
                            throw null;
                        }
                    }
                }
                int i64 = f62211a;
                int i65 = ((i64 | 97) << 1) - (i64 ^ 97);
                f62212b = i65 % 128;
                if (i65 % 2 == 0) {
                    int i66 = 1 / 0;
                }
                return Boolean.TRUE;
            }
            if (i20 == 4) {
                yr yrVar3 = (yr) objArr[0];
                int i67 = f62212b;
                int i68 = ((i67 & 110) + (i67 | 110)) - 1;
                int i69 = i68 % 128;
                f62211a = i69;
                if (i68 % 2 != 0) {
                    throw null;
                }
                if (yrVar3 == null) {
                    int i70 = i69 & 89;
                    int i71 = -(-((i69 ^ 89) | i70));
                    int i72 = ((i70 | i71) << 1) - (i71 ^ i70);
                    f62212b = i72 % 128;
                    int i73 = i72 % 2;
                    ynVar = null;
                } else {
                    ynVar = (yn) yr.setX(new Object[]{yrVar3}, -428621868, 428621887, System.identityHashCode(yrVar3));
                    int i74 = f62211a;
                    int i75 = i74 & 53;
                    int i76 = (i74 | 53) & (~i75);
                    int i77 = -(-(i75 << 1));
                    int i78 = (i76 ^ i77) + ((i76 & i77) << 1);
                    f62212b = i78 % 128;
                    int i79 = i78 % 2;
                }
                if (ynVar != null) {
                    int i80 = f62211a;
                    int i81 = i80 ^ 99;
                    int i82 = -(-((i80 & 99) << 1));
                    int i83 = (i81 & i82) + (i82 | i81);
                    f62212b = i83 % 128;
                    int i84 = i83 % 2;
                    yr.setDividerPadding setdividerpadding = (yr.setDividerPadding) yr.setX(new Object[]{yrVar3}, 142679588, -142679576, System.identityHashCode(yrVar3));
                    yr.setDividerPadding setdividerpadding2 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding, null}, 637562883, -637562870, System.identityHashCode(setdividerpadding));
                    yrVar3 = (yr) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding2}, -92684172, 92684189, System.identityHashCode(setdividerpadding2));
                    int i85 = f62212b;
                    int i86 = i85 ^ 95;
                    int i87 = ((i85 & 95) | i86) << 1;
                    int i88 = -i86;
                    i13 = ((i87 | i88) << 1) - (i87 ^ i88);
                    f62211a = i13 % 128;
                } else {
                    int i89 = f62211a;
                    int i90 = (i89 & (-96)) | ((~i89) & 95);
                    int i91 = (i89 & 95) << 1;
                    i13 = (i90 & i91) + (i91 | i90);
                    f62212b = i13 % 128;
                }
                int i92 = i13 % 2;
                return yrVar3;
            }
            if (i20 == 5) {
                ye yeVar = (ye) objArr[1];
                ye yeVar2 = (ye) objArr[2];
                int i93 = f62212b;
                int i94 = i93 & 59;
                int i95 = ((i93 ^ 59) | i94) << 1;
                int i96 = -((i93 | 59) & (~i94));
                int i97 = ((i95 | i96) << 1) - (i96 ^ i95);
                f62211a = i97 % 128;
                int i98 = i97 % 2;
                ye yeVar3 = (ye) setDividerPadding(new Object[]{yeVar, yeVar2}, -1462383781, 1462383781, (int) System.currentTimeMillis());
                int i99 = f62211a;
                int i100 = ((i99 & (-4)) | ((~i99) & 3)) + ((i99 & 3) << 1);
                f62212b = i100 % 128;
                if (i100 % 2 != 0) {
                    return yeVar3;
                }
                int i101 = 49 / 0;
                return yeVar3;
            }
            ye yeVar4 = (ye) objArr[0];
            ye yeVar5 = (ye) objArr[1];
            ye.setOnFocusChangeListener setonfocuschangelistener = new ye.setOnFocusChangeListener();
            int iIntValue = ((Integer) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar4}, -1558209065, 1558209065, System.identityHashCode(yeVar4))).intValue();
            int i102 = f62211a;
            int i103 = i102 & 67;
            int i104 = i103 + ((i102 ^ 67) | i103);
            f62212b = i104 % 128;
            int i105 = i104 % 2;
            int i106 = 0;
            while (true) {
                int i107 = -611642844;
                int i108 = 611642845;
                if (i106 >= iIntValue) {
                    int iIntValue2 = ((Integer) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar5}, -1558209065, 1558209065, System.identityHashCode(yeVar5))).intValue();
                    int i109 = f62212b + 61;
                    f62211a = i109 % 128;
                    int i110 = i109 % 2;
                    int i111 = 0;
                    while (i111 < iIntValue2) {
                        int i112 = f62211a;
                        int i113 = i112 & 41;
                        int i114 = -(-((i112 ^ 41) | i113));
                        int i115 = (i113 ^ i114) + ((i114 & i113) << 1);
                        f62212b = i115 % 128;
                        if (i115 % 2 == 0) {
                            i14 = (((i111 ^ 101) | (i111 & 101)) << 1) - ((i111 & (-102)) | ((~i111) & 101));
                            str = (String) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar5, Integer.valueOf(i111)}, i108, i107, i111);
                            if (((Boolean) setDividerPadding(new Object[]{str}, -1360922602, 1360922605, (int) System.currentTimeMillis())).booleanValue()) {
                                i111 = i14;
                            }
                        } else {
                            int i116 = i111 & 1;
                            i14 = (i116 - (~(-(-((i111 ^ 1) | i116))))) - 1;
                            str = (String) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar5, Integer.valueOf(i111)}, i108, i107, i111);
                            if (!(!((Boolean) setDividerPadding(new Object[]{str}, -1360922602, 1360922605, (int) System.currentTimeMillis())).booleanValue())) {
                                i111 = i14;
                            }
                            i108 = 611642845;
                        }
                        if (((Boolean) setDividerPadding(new Object[]{str}, -1437625687, 1437625688, (int) System.currentTimeMillis())).booleanValue()) {
                            int i117 = f62211a + 35;
                            f62212b = i117 % 128;
                            if (i117 % 2 == 0) {
                                int i118 = 94 / 0;
                            }
                        }
                        i111 = i14;
                        i107 = -611642844;
                        i108 = 611642845;
                    }
                    ye yeVar6 = (ye) ye.setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, -1008790874, 1008790879, System.identityHashCode(setonfocuschangelistener));
                    int i119 = f62211a;
                    int i120 = i119 & 85;
                    int i121 = (i120 - (~((i119 ^ 85) | i120))) - 1;
                    f62212b = i121 % 128;
                    int i122 = i121 % 2;
                    return yeVar6;
                }
                int i123 = f62211a;
                int i124 = i123 & 103;
                int i125 = (i123 ^ 103) | i124;
                int i126 = (i124 ^ i125) + ((i124 & i125) << 1);
                f62212b = i126 % 128;
                int i127 = i126 % 2;
                int i128 = i106 & 1;
                int i129 = (~i128) & (i106 | 1);
                int i130 = i128 << 1;
                int i131 = (i129 ^ i130) + ((i130 & i129) << 1);
                String str4 = (String) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar4, Integer.valueOf(i106)}, 611642845, -611642844, i106);
                String str5 = (String) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar4, Integer.valueOf(i106)}, -1668064352, 1668064356, i106);
                if (l.equals("Warning", str4, true)) {
                    int i132 = f62211a;
                    int i133 = i132 & 37;
                    int i134 = -(-((i132 ^ 37) | i133));
                    int i135 = ((i133 | i134) << 1) - (i134 ^ i133);
                    f62212b = i135 % 128;
                    int i136 = i135 % 2;
                    if (l.startsWith$default(str5, "1", false, 2, null)) {
                        continue;
                    } else if (((Boolean) setDividerPadding(new Object[]{str4}, -1360922602, 1360922605, (int) System.currentTimeMillis())).booleanValue()) {
                        int i137 = f62211a;
                        int i138 = (i137 & 37) + (i137 | 37);
                        f62212b = i138 % 128;
                        int i139 = i138 % 2;
                    } else {
                        int i140 = f62211a;
                        int i141 = (-2) - (((i140 ^ 74) + ((i140 & 74) << 1)) ^ (-1));
                        f62212b = i141 % 128;
                        int i142 = i141 % 2;
                        if (!((Boolean) setDividerPadding(new Object[]{str4}, -1437625687, 1437625688, (int) System.currentTimeMillis())).booleanValue()) {
                            int i1310 = f62211a;
                            int i1311 = (i1310 & 37) + (i1310 | 37);
                            f62212b = i1311 % 128;
                            int i1312 = i1311 % 2;
                        } else {
                            i15 = f62212b + 99;
                            f62211a = i15 % 128;
                            if (i15 % 2 == 0) {
                                throw null;
                            }
                            if (((String) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar5, str4}, 914142416, -914142409, System.identityHashCode(yeVar5))) == null) {
                                int i1313 = f62211a;
                                int i1314 = (i1313 & 37) + (i1313 | 37);
                                f62212b = i1314 % 128;
                                int i1315 = i1314 % 2;
                            }
                        }
                    }
                } else if (((Boolean) setDividerPadding(new Object[]{str4}, -1360922602, 1360922605, (int) System.currentTimeMillis())).booleanValue()) {
                    int i143 = f62211a;
                    int i144 = (-2) - (((i143 ^ 74) + ((i143 & 74) << 1)) ^ (-1));
                    f62212b = i144 % 128;
                    int i145 = i144 % 2;
                    if (!((Boolean) setDividerPadding(new Object[]{str4}, -1437625687, 1437625688, (int) System.currentTimeMillis())).booleanValue()) {
                        int i1316 = f62211a;
                        int i1317 = (i1316 & 37) + (i1316 | 37);
                        f62212b = i1317 % 128;
                        int i1318 = i1317 % 2;
                    } else {
                        i15 = f62212b + 99;
                        f62211a = i15 % 128;
                        if (i15 % 2 == 0) {
                            throw null;
                        }
                        if (((String) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar5, str4}, 914142416, -914142409, System.identityHashCode(yeVar5))) == null) {
                            int i1319 = f62211a;
                            int i13110 = (i1319 & 37) + (i1319 | 37);
                            f62212b = i13110 % 128;
                            int i13111 = i13110 % 2;
                        }
                    }
                } else {
                    int i13112 = f62211a;
                    int i13113 = (i13112 & 37) + (i13112 | 37);
                    f62212b = i13113 % 128;
                    int i13114 = i13113 % 2;
                }
                i106 = i131;
            }
        }

        public static final /* synthetic */ ye setOnFocusChangeListener(Companion companion, ye yeVar, ye yeVar2) {
            return (ye) setDividerPadding(new Object[]{companion, yeVar, yeVar2}, 683521390, -683521385, (int) System.currentTimeMillis());
        }

        public static final /* synthetic */ yr setX(yr yrVar) {
            return (yr) setDividerPadding(new Object[]{yrVar}, -918635236, 918635238, (int) System.currentTimeMillis());
        }
    }

    public final class setY implements acp {

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f62213t0 = 0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static int f62214u0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public boolean f62215p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ aby f62216q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ yy f62217r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ abv f62218s0;

        /* JADX WARN: Code duplicated, block: B:17:0x0077  */
        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException, IOException {
            long jValueOf;
            int i13 = ~i10;
            int i14 = ((i10 | i11) * 624) + ((i13 | i11) * 624) + (i13 * (-624)) + (i11 * (-623)) + (i10 * (-623));
            if (i14 == 1) {
                setY sety = (setY) objArr[0];
                int i15 = f62213t0;
                int i16 = i15 & 53;
                int i17 = i16 + ((i15 ^ 53) | i16);
                f62214u0 = i17 % 128;
                int i18 = i17 % 2;
                aby abyVar = sety.f62216q0;
                if (i18 == 0) {
                    abyVar.setY();
                    throw null;
                }
                acq y7 = abyVar.setY();
                int i19 = f62214u0 + 35;
                f62213t0 = i19 % 128;
                if (i19 % 2 == 0) {
                    return y7;
                }
                int i20 = 11 / 0;
                return y7;
            }
            if (i14 == 2) {
                setY sety2 = (setY) objArr[0];
                int i21 = f62214u0;
                int i22 = ((i21 & (-120)) | ((~i21) & 119)) + ((i21 & 119) << 1);
                f62213t0 = i22 % 128;
                if (i22 % 2 != 0) {
                    boolean z10 = sety2.f62215p0;
                    throw null;
                }
                if (!sety2.f62215p0 && !yt.setY(sety2, TimeUnit.MILLISECONDS)) {
                    int i23 = f62214u0;
                    int i24 = i23 & 101;
                    int i25 = ((i23 | 101) & (~i24)) + (i24 << 1);
                    f62213t0 = i25 % 128;
                    int i26 = i25 % 2;
                    yy yyVar = sety2.f62217r0;
                    if (i26 != 0) {
                        sety2.f62215p0 = false;
                    } else {
                        sety2.f62215p0 = true;
                    }
                    yyVar.setDividerPadding();
                }
                sety2.f62216q0.close();
                int i27 = f62214u0;
                int i28 = (((i27 & (-36)) | ((~i27) & 35)) - (~((i27 & 35) << 1))) - 1;
                f62213t0 = i28 % 128;
                int i29 = i28 % 2;
                return null;
            }
            setY sety3 = (setY) objArr[0];
            abx abxVar = (abx) objArr[1];
            long jLongValue = ((Number) objArr[2]).longValue();
            int i30 = f62213t0;
            int i31 = i30 & 65;
            int i32 = ((((i30 ^ 65) | i31) << 1) - (~(-((i30 | 65) & (~i31))))) - 1;
            f62214u0 = i32 % 128;
            int i33 = i32 % 2;
            Intrinsics.checkNotNullParameter(abxVar, "");
            try {
                long y10 = sety3.f62216q0.setY(abxVar, jLongValue);
                int i34 = f62213t0 + 37;
                int i35 = i34 % 128;
                f62214u0 = i35;
                int i36 = i34 % 2;
                abv abvVar = sety3.f62218s0;
                if (y10 == -1) {
                    int i37 = (((i35 | 12) << 1) - (i35 ^ 12)) - 1;
                    f62213t0 = i37 % 128;
                    if (i37 % 2 != 0) {
                        int i38 = 59 / 0;
                        if (!sety3.f62215p0) {
                            sety3.f62215p0 = true;
                            abvVar.close();
                            int i39 = f62214u0 + 123;
                            f62213t0 = i39 % 128;
                            int i40 = i39 % 2;
                        }
                    } else if (!sety3.f62215p0) {
                        sety3.f62215p0 = true;
                        abvVar.close();
                        int i310 = f62214u0 + 123;
                        f62213t0 = i310 % 128;
                        int i41 = i310 % 2;
                    }
                    int i42 = f62214u0;
                    int i43 = i42 & 85;
                    int i44 = (i42 | 85) & (~i43);
                    int i45 = i43 << 1;
                    int i46 = (i44 ^ i45) + ((i44 & i45) << 1);
                    f62213t0 = i46 % 128;
                    int i47 = i46 % 2;
                    jValueOf = -1L;
                } else {
                    abxVar.setOnFocusChangeListener(abvVar.setOnFocusChangeListener(), ((Long) abx.setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue() - y10, y10);
                    abvVar.getAmountFieldTextColor();
                    int i48 = f62213t0;
                    int i49 = i48 & 79;
                    int i50 = -(-((i48 ^ 79) | i49));
                    int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
                    f62214u0 = i51 % 128;
                    if (i51 % 2 == 0) {
                        int i52 = 68 / 0;
                        jValueOf = Long.valueOf(y10);
                    } else {
                        jValueOf = Long.valueOf(y10);
                    }
                }
                return jValueOf;
            } catch (IOException e5) {
                if (!sety3.f62215p0) {
                    sety3.f62215p0 = true;
                    sety3.f62217r0.setDividerPadding();
                    int i53 = f62214u0;
                    int i54 = (i53 & (-120)) | ((~i53) & 119);
                    int i55 = (i53 & 119) << 1;
                    int i56 = (i54 & i55) + (i55 | i54);
                    f62213t0 = i56 % 128;
                    int i57 = i56 % 2;
                }
                throw e5;
            }
        }

        @Override // com.mypinpad.tsdk.isolation.acp, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws NoSuchAlgorithmException, IOException {
            setX(new Object[]{this}, 238859399, -238859397, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.acp
        @NotNull
        public final acq setY() {
            return (acq) setX(new Object[]{this}, 614287377, -614287376, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.acp
        public final long setY(@NotNull abx abxVar, long j10) throws IOException {
            return ((Long) setX(new Object[]{this, abxVar, Long.valueOf(j10)}, 1342074788, -1342074788, System.identityHashCode(this))).longValue();
        }
    }

    static {
        int i10 = f62210b;
        int i11 = ((((i10 ^ 43) | (i10 & 43)) << 1) - (~(-(((~i10) & 43) | (i10 & (-44)))))) - 1;
        f62209a = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 63 / 0;
        }
    }

    public yv(@Nullable xr xrVar) {
        this.setY = xrVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x09cb  */
    /* JADX WARN: Code duplicated, block: B:44:0x0466  */
    /* JADX WARN: Code duplicated, block: B:46:0x0474  */
    /* JADX WARN: Code duplicated, block: B:48:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:50:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:52:0x0505  */
    /* JADX WARN: Code duplicated, block: B:53:0x053a  */
    /* JADX WARN: Code duplicated, block: B:55:0x053e  */
    /* JADX WARN: Code duplicated, block: B:57:0x054e  */
    /* JADX WARN: Code duplicated, block: B:58:0x055f  */
    /* JADX WARN: Code duplicated, block: B:62:0x059a  */
    /* JADX WARN: Code duplicated, block: B:64:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x05b5 A[PHI: r13
      0x05b5: PHI (r13v49 char) = (r13v42 char), (r13v62 char) binds: [B:68:0x05b1, B:65:0x05ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:76:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:79:0x0858  */
    /* JADX WARN: Code duplicated, block: B:81:0x0883  */
    /* JADX WARN: Code duplicated, block: B:83:0x08ac  */
    /* JADX WARN: Code duplicated, block: B:85:0x08bc  */
    /* JADX WARN: Code duplicated, block: B:87:0x08ee  */
    /* JADX WARN: Code duplicated, block: B:89:0x0922  */
    /* JADX WARN: Code duplicated, block: B:93:0x0986  */
    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
        zj zjVar;
        yd ydVar;
        int i13;
        yr dividerPadding;
        int i14;
        yr yrVar;
        int i15;
        int i16;
        yr yrVar2;
        int i17;
        char c10;
        yn ynVar;
        Object[] objArr2;
        int i18;
        int i19 = (i11 * 517) + (i10 * (-515));
        int i20 = ~i11;
        int i21 = ~(i20 | i12);
        int i22 = ~i12;
        int i23 = i21 | (~(i22 | i10));
        int i24 = ~(i22 | i11);
        int i25 = ~i10;
        if ((((~(i25 | i11)) | i24) * LibMCryptConstants.IND_HEX_SEGMENTO2) + (((~(i12 | i20 | i25)) | (~(i25 | i22 | i11))) * LibMCryptConstants.IND_HEX_SEGMENTO2) + ((i23 | i24) * (-516)) + i19 != 1) {
            yy yyVar = (yy) objArr[0];
            yr yrVar3 = (yr) objArr[1];
            int i26 = f62210b;
            int i27 = i26 ^ 89;
            int i28 = (((i27 | (i26 & 89)) << 1) - (~(-i27))) - 1;
            f62209a = i28 % 128;
            if (i28 % 2 != 0) {
                throw null;
            }
            if (yyVar == null) {
                int i29 = i26 & 37;
                int i30 = -(-((i26 ^ 37) | i29));
                int i31 = (i29 & i30) + (i29 | i30);
                f62209a = i31 % 128;
                if (i31 % 2 == 0) {
                    return yrVar3;
                }
                throw null;
            }
            aco onFocusChangeListener = yyVar.setOnFocusChangeListener();
            yn ynVar2 = (yn) yr.setX(new Object[]{yrVar3}, -428621868, 428621887, System.identityHashCode(yrVar3));
            Intrinsics.checkNotNull(ynVar2);
            aby y7 = ynVar2.setY();
            abv abvVar = (abv) ach.setOnFocusChangeListener(new Object[]{onFocusChangeListener}, -678282231, 678282232, (int) System.currentTimeMillis());
            setY sety = new setY();
            sety.f62216q0 = y7;
            sety.f62217r0 = yyVar;
            sety.f62218s0 = abvVar;
            String str = (String) yr.setX(new Object[]{yrVar3, DigipassManagerConstants.KEY_CONTENT_TYPE}, 401167373, -401167369, (int) System.currentTimeMillis());
            long onFocusChangeListener2 = ((yn) yr.setX(new Object[]{yrVar3}, -428621868, 428621887, System.identityHashCode(yrVar3))).setOnFocusChangeListener();
            yr.setDividerPadding setdividerpadding = (yr.setDividerPadding) yr.setX(new Object[]{yrVar3}, 142679588, -142679576, System.identityHashCode(yrVar3));
            yr.setDividerPadding setdividerpadding2 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding, new zr(str, onFocusChangeListener2, (aby) ach.setOnFocusChangeListener(new Object[]{sety}, -878740537, 878740541, (int) System.currentTimeMillis()))}, 637562883, -637562870, System.identityHashCode(setdividerpadding));
            yr yrVar4 = (yr) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding2}, -92684172, 92684189, System.identityHashCode(setdividerpadding2));
            int i32 = f62210b + 61;
            f62209a = i32 % 128;
            if (i32 % 2 == 0) {
                return yrVar4;
            }
            throw null;
        }
        yv yvVar = (yv) objArr[0];
        yl.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = (yl.setCompoundDrawableTintBlendMode) objArr[1];
        int i33 = f62210b;
        int i34 = i33 & 123;
        int i35 = ((i33 ^ 123) | i34) << 1;
        int i36 = -((i33 | 123) & (~i34));
        int i37 = (i35 & i36) + (i36 | i35);
        f62209a = i37 % 128;
        if (i37 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setcompounddrawabletintblendmode, "");
            setcompounddrawabletintblendmode.setOnFocusChangeListener();
            xr xrVar = yvVar.setY;
            throw null;
        }
        Intrinsics.checkNotNullParameter(setcompounddrawabletintblendmode, "");
        xp onFocusChangeListener3 = setcompounddrawabletintblendmode.setOnFocusChangeListener();
        xr xrVar2 = yvVar.setY;
        if (xrVar2 == null) {
            int i38 = f62210b;
            int i39 = (i38 & 33) + (i38 | 33);
            f62209a = i39 % 128;
            int i40 = i39 % 2;
        } else {
            System.identityHashCode(yvVar);
            System.identityHashCode(yvVar);
        }
        yx.setDividerPadding setdividerpadding3 = new yx.setDividerPadding(System.currentTimeMillis(), setcompounddrawabletintblendmode.setCompoundDrawableTintBlendMode(), null);
        yx yxVar = (yx) yx.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding3}, 1300170220, -1300170219, System.identityHashCode(setdividerpadding3));
        yk ykVar = (yk) yx.setOnFocusChangeListener(new Object[]{yxVar}, 381874110, -381874110, System.identityHashCode(yxVar));
        yr yrVar5 = (yr) yx.setOnFocusChangeListener(new Object[]{yxVar}, 981102324, -981102323, System.identityHashCode(yxVar));
        xr xrVar3 = yvVar.setY;
        if (xrVar3 == null) {
            int i41 = f62210b;
            int i42 = i41 & 67;
            int i43 = (i41 ^ 67) | i42;
            int i44 = (i42 ^ i43) + ((i42 & i43) << 1);
            f62209a = i44 % 128;
            int i45 = i44 % 2;
            int i46 = (i41 & 27) + (i41 | 27);
            f62209a = i46 % 128;
            int i47 = i46 % 2;
        } else {
            xrVar3.setDividerPadding(yxVar);
            int i48 = f62209a;
            int i49 = (-2) - (((i48 ^ 86) + ((i48 & 86) << 1)) ^ (-1));
            f62210b = i49 % 128;
            int i50 = i49 % 2;
        }
        if (onFocusChangeListener3 instanceof zj) {
            int i51 = f62209a + 95;
            f62210b = i51 % 128;
            int i52 = i51 % 2;
            zjVar = (zj) onFocusChangeListener3;
            System.identityHashCode(yvVar);
            System.identityHashCode(yvVar);
        } else {
            zjVar = null;
        }
        if (zjVar == null) {
            int iIdentityHashCode = System.identityHashCode(yvVar);
            int i53 = ~iIdentityHashCode;
            int i54 = ~i53;
            int i55 = (-1180718119) & i53;
            int i56 = ~(((-1180718119) & i54) | (i53 & 1180718118) | i55);
            int i57 = 1947756386 & iIdentityHashCode;
            int i58 = (~i57) & (1947756386 | iIdentityHashCode);
            int i59 = ~((i58 ^ i57) | (i58 & i57));
            int i60 = ((~i59) & i56) | ((~i56) & i59);
            int i61 = i59 & i56;
            int i62 = (i61 & i60) | (i60 ^ i61);
            int i63 = i53 & 1947756386;
            int i64 = ((-1947756387) & i54) | i63;
            int i65 = i53 & (-1947756387);
            int i66 = ~((i64 ^ i65) | (i64 & i65));
            int i67 = ((i62 & i66) | ((~i66) & i62) | ((~i62) & i66)) * 959;
            int i68 = 383254086 ^ i67;
            int i69 = (((i67 & 383254086) | i68) << 1) - i68;
            int i70 = (((i69 | (-711724224)) << 1) - (~(-(i69 ^ (-711724224))))) - 1;
            int i71 = (1947756386 & i54) | i65;
            int i72 = ~((i71 & i63) | (i71 ^ i63));
            int i73 = i55 | (iIdentityHashCode & 1180718118);
            int i74 = (-1180718119) & iIdentityHashCode;
            int i75 = ~((i73 & i74) | (i73 ^ i74));
            int i76 = i72 & i75;
            int i77 = ((i72 | i75) & (~i76)) | i76;
            int i78 = (-1947756387) ^ iIdentityHashCode;
            int i79 = iIdentityHashCode & (-1947756387);
            int i80 = (i79 & i78) | (i78 ^ i79);
            int i81 = ~i80;
            int i82 = (i80 | i81) & i81;
            int i83 = ((~i82) & i77) | ((~i77) & i82);
            int i84 = i82 & i77;
            int i85 = -(-(((i84 & i83) | (i83 ^ i84)) * 959));
            int i86 = ((i70 ^ i85) - (~((i85 & i70) << 1))) - 1;
            int iIdentityHashCode2 = System.identityHashCode(yvVar);
            int i87 = ~iIdentityHashCode2;
            int i88 = 181120130 & i87;
            int i89 = (i87 | 181120130) & (~i88);
            int i90 = ~((i89 ^ i88) | (i89 & i88));
            int i91 = i90 & 33655936;
            int i92 = (i90 | 33655936) & (~i91);
            int i93 = (i92 & i91) | (i92 ^ i91);
            int i94 = ((-181120131) & iIdentityHashCode2) | ((-181120131) ^ iIdentityHashCode2);
            int i95 = ~i94;
            int i96 = (i94 | i95) & i95;
            int i97 = ((~i96) & i93) | ((~i93) & i96);
            int i98 = i93 & i96;
            int i99 = (-2) - (((-1889744454) - (~(-(-(((i98 & i97) | (i97 ^ i98)) * (-338)))))) ^ (-1));
            int i100 = (i99 ^ (-2114676608)) + ((i99 & (-2114676608)) << 1);
            int i101 = ~(i89 | i88);
            int i102 = (-147464195) ^ iIdentityHashCode2;
            int i103 = iIdentityHashCode2 & (-147464195);
            int i104 = (i103 & i102) | (i102 ^ i103);
            int i105 = ~i104;
            int i106 = (i104 | i105) & i105;
            int i107 = -(~(-(-(((i106 & i101) | (i101 ^ i106)) * 338))));
            if (i86 > ((i100 ^ i107) + ((i107 & i100) << 1)) - 1) {
                throw null;
            }
            int i108 = f62209a;
            int i109 = (i108 ^ 119) + ((i108 & 119) << 1);
            f62210b = i109 % 128;
            int i110 = i109 % 2;
            ydVar = null;
        } else {
            ydVar = (yd) zj.setDividerPadding(new Object[]{zjVar}, -2021984744, 2021984764, System.identityHashCode(zjVar));
        }
        if (ydVar == null) {
            int i111 = f62210b;
            int i112 = (((i111 | 90) << 1) - (i111 ^ 90)) - 1;
            f62209a = i112 % 128;
            int i113 = i112 % 2;
            yd.Companion companion = yd.INSTANCE;
        }
        if (ykVar != null) {
            if (ykVar == null) {
                int i114 = f62209a;
                int i115 = ((i114 | 49) << 1) - (i114 ^ 49);
                f62210b = i115 % 128;
                int i116 = i115 % 2;
                Intrinsics.checkNotNull(yrVar5);
                yr.setDividerPadding setdividerpadding4 = (yr.setDividerPadding) yr.setX(new Object[]{yrVar5}, 142679588, -142679576, System.identityHashCode(yrVar5));
                yr.setDividerPadding setdividerpadding5 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding4, (yr) Companion.setDividerPadding(new Object[]{yrVar5}, -918635236, 918635238, (int) System.currentTimeMillis())}, 1518624621, -1518624621, System.identityHashCode(setdividerpadding4));
                yrVar2 = (yr) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding5}, -92684172, 92684189, System.identityHashCode(setdividerpadding5));
                yd.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener3, yrVar2}, 555885383, -555885372, (int) System.currentTimeMillis());
                int i117 = f62210b;
                int i118 = i117 ^ 23;
                int i119 = (i117 & 23) << 1;
                i18 = ((i118 | i119) << 1) - (i119 ^ i118);
                f62209a = i18 % 128;
                if (i18 % 2 != 0) {
                    int i120 = 89 / 0;
                }
            } else {
                if (yrVar5 != null) {
                    int i121 = f62209a;
                    int i122 = ((i121 & 53) - (~(i121 | 53))) - 1;
                    f62210b = i122 % 128;
                    int i123 = i122 % 2;
                    yd.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener3, yrVar5}, -1784443573, 1784443591, (int) System.currentTimeMillis());
                    int i124 = f62210b;
                    int i125 = (((i124 | 48) << 1) - (i124 ^ 48)) - 1;
                    f62209a = i125 % 128;
                    int i126 = i125 % 2;
                } else if (yvVar.setY != null) {
                    int i127 = f62209a;
                    i13 = ((i127 | 117) << 1) - (i127 ^ 117);
                    f62210b = i13 % 128;
                    if (i13 % 2 == 0) {
                        yd.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener3}, -47610669, 47610689, (int) System.currentTimeMillis());
                        int i128 = 70 / 0;
                    } else {
                        yd.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener3}, -47610669, 47610689, (int) System.currentTimeMillis());
                    }
                    int i129 = f62209a + 17;
                    f62210b = i129 % 128;
                    int i130 = i129 % 2;
                }
                dividerPadding = setcompounddrawabletintblendmode.setDividerPadding(ykVar);
                int i131 = f62210b;
                int i132 = (((i131 & (-114)) | ((~i131) & 113)) - (~((i131 & 113) << 1))) - 1;
                i14 = i132 % 128;
                f62209a = i14;
                int i133 = i132 % 2;
                int i134 = (i14 & 55) + (i14 | 55);
                f62210b = i134 % 128;
                int i135 = i134 % 2;
                if (yrVar5 != null) {
                    int i136 = i14 & 73;
                    i17 = i136 + ((i14 ^ 73) | i136);
                    f62210b = i17 % 128;
                    if (i17 % 2 == 0) {
                        c10 = 0;
                        int i137 = 63 / 0;
                        if (dividerPadding != null) {
                            objArr2 = new Object[1];
                            objArr2[c10] = dividerPadding;
                            if (((Integer) yr.setX(objArr2, 151122101, -151122100, System.identityHashCode(dividerPadding))).intValue() == 304) {
                                int i138 = f62209a;
                                int i139 = i138 & 125;
                                int i140 = ((i138 ^ 125) | i139) << 1;
                                int i141 = -((~i139) & (i138 | 125));
                                int i142 = (i140 & i141) + (i140 | i141);
                                f62210b = i142 % 128;
                                int i143 = i142 % 2;
                                int i144 = i138 & 99;
                                int i145 = (i144 - (~((i138 ^ 99) | i144))) - 1;
                                f62210b = i145 % 128;
                                int i146 = i145 % 2;
                                int i147 = i138 ^ 119;
                                int i148 = -(-((i138 & 119) << 1));
                                int i149 = ((i147 | i148) << 1) - (i148 ^ i147);
                                f62210b = i149 % 128;
                                int i150 = i149 % 2;
                                yr.setDividerPadding setdividerpadding6 = (yr.setDividerPadding) yr.setX(new Object[]{yrVar5}, 142679588, -142679576, System.identityHashCode(yrVar5));
                                yr.setDividerPadding setdividerpadding7 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding6, (ye) Companion.setDividerPadding(new Object[]{INSTANCE, (ye) yr.setX(new Object[]{yrVar5}, 1547100838, -1547100838, System.identityHashCode(yrVar5)), (ye) yr.setX(new Object[]{dividerPadding}, 1547100838, -1547100838, System.identityHashCode(dividerPadding))}, 683521390, -683521385, (int) System.currentTimeMillis())}, 1273569601, -1273569577, System.identityHashCode(setdividerpadding6));
                                yr.setDividerPadding setdividerpadding8 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding7, Long.valueOf(((Long) yr.setX(new Object[]{dividerPadding}, -1353479930, 1353479935, System.identityHashCode(dividerPadding))).longValue())}, -790912778, 790912800, System.identityHashCode(setdividerpadding7));
                                yr.setDividerPadding setdividerpadding9 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding8, Long.valueOf(((Long) yr.setX(new Object[]{dividerPadding}, -144747726, 144747740, System.identityHashCode(dividerPadding))).longValue())}, 485790072, -485790071, System.identityHashCode(setdividerpadding8));
                                yr.setDividerPadding setdividerpadding10 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding9, (yr) Companion.setDividerPadding(new Object[]{yrVar5}, -918635236, 918635238, (int) System.currentTimeMillis())}, 1518624621, -1518624621, System.identityHashCode(setdividerpadding9));
                                yr.setDividerPadding setdividerpadding11 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding10, (yr) Companion.setDividerPadding(new Object[]{dividerPadding}, -918635236, 918635238, (int) System.currentTimeMillis())}, 874392842, -874392817, System.identityHashCode(setdividerpadding10));
                                yr yrVar6 = (yr) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding11}, -92684172, 92684189, System.identityHashCode(setdividerpadding11));
                                yn ynVar3 = (yn) yr.setX(new Object[]{dividerPadding}, -428621868, 428621887, System.identityHashCode(dividerPadding));
                                Intrinsics.checkNotNull(ynVar3);
                                ynVar3.close();
                                xr xrVar4 = yvVar.setY;
                                Intrinsics.checkNotNull(xrVar4);
                                xrVar4.setDividerPadding();
                                xr.setDividerPadding(new Object[]{yrVar5, yrVar6}, 1005315681, -1005315679, (int) System.currentTimeMillis());
                                yd.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener3, yrVar6}, 555885383, -555885372, (int) System.currentTimeMillis());
                                int i151 = f62209a;
                                int i152 = i151 & 77;
                                int i153 = i152 + ((i151 ^ 77) | i152);
                                f62210b = i153 % 128;
                                int i154 = i153 % 2;
                                return yrVar6;
                            }
                        }
                    } else {
                        c10 = 0;
                        if (dividerPadding != null) {
                            objArr2 = new Object[1];
                            objArr2[c10] = dividerPadding;
                            if (((Integer) yr.setX(objArr2, 151122101, -151122100, System.identityHashCode(dividerPadding))).intValue() == 304) {
                                int i1310 = f62209a;
                                int i1311 = i1310 & 125;
                                int i1410 = ((i1310 ^ 125) | i1311) << 1;
                                int i1411 = -((~i1311) & (i1310 | 125));
                                int i1412 = (i1410 & i1411) + (i1410 | i1411);
                                f62210b = i1412 % 128;
                                int i1413 = i1412 % 2;
                                int i1414 = i1310 & 99;
                                int i1415 = (i1414 - (~((i1310 ^ 99) | i1414))) - 1;
                                f62210b = i1415 % 128;
                                int i1416 = i1415 % 2;
                                int i1417 = i1310 ^ 119;
                                int i1418 = -(-((i1310 & 119) << 1));
                                int i1419 = ((i1417 | i1418) << 1) - (i1418 ^ i1417);
                                f62210b = i1419 % 128;
                                int i155 = i1419 % 2;
                                yr.setDividerPadding setdividerpadding12 = (yr.setDividerPadding) yr.setX(new Object[]{yrVar5}, 142679588, -142679576, System.identityHashCode(yrVar5));
                                yr.setDividerPadding setdividerpadding13 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding12, (ye) Companion.setDividerPadding(new Object[]{INSTANCE, (ye) yr.setX(new Object[]{yrVar5}, 1547100838, -1547100838, System.identityHashCode(yrVar5)), (ye) yr.setX(new Object[]{dividerPadding}, 1547100838, -1547100838, System.identityHashCode(dividerPadding))}, 683521390, -683521385, (int) System.currentTimeMillis())}, 1273569601, -1273569577, System.identityHashCode(setdividerpadding12));
                                yr.setDividerPadding setdividerpadding14 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding13, Long.valueOf(((Long) yr.setX(new Object[]{dividerPadding}, -1353479930, 1353479935, System.identityHashCode(dividerPadding))).longValue())}, -790912778, 790912800, System.identityHashCode(setdividerpadding13));
                                yr.setDividerPadding setdividerpadding15 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding14, Long.valueOf(((Long) yr.setX(new Object[]{dividerPadding}, -144747726, 144747740, System.identityHashCode(dividerPadding))).longValue())}, 485790072, -485790071, System.identityHashCode(setdividerpadding14));
                                yr.setDividerPadding setdividerpadding16 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding15, (yr) Companion.setDividerPadding(new Object[]{yrVar5}, -918635236, 918635238, (int) System.currentTimeMillis())}, 1518624621, -1518624621, System.identityHashCode(setdividerpadding15));
                                yr.setDividerPadding setdividerpadding17 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding16, (yr) Companion.setDividerPadding(new Object[]{dividerPadding}, -918635236, 918635238, (int) System.currentTimeMillis())}, 874392842, -874392817, System.identityHashCode(setdividerpadding16));
                                yr yrVar7 = (yr) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding17}, -92684172, 92684189, System.identityHashCode(setdividerpadding17));
                                yn ynVar4 = (yn) yr.setX(new Object[]{dividerPadding}, -428621868, 428621887, System.identityHashCode(dividerPadding));
                                Intrinsics.checkNotNull(ynVar4);
                                ynVar4.close();
                                xr xrVar5 = yvVar.setY;
                                Intrinsics.checkNotNull(xrVar5);
                                xrVar5.setDividerPadding();
                                xr.setDividerPadding(new Object[]{yrVar5, yrVar7}, 1005315681, -1005315679, (int) System.currentTimeMillis());
                                yd.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener3, yrVar7}, 555885383, -555885372, (int) System.currentTimeMillis());
                                int i156 = f62209a;
                                int i157 = i156 & 77;
                                int i158 = i157 + ((i156 ^ 77) | i157);
                                f62210b = i158 % 128;
                                int i159 = i158 % 2;
                                return yrVar7;
                            }
                        }
                    }
                    ynVar = (yn) yr.setX(new Object[]{yrVar5}, -428621868, 428621887, System.identityHashCode(yrVar5));
                    if (ynVar == null) {
                        int i160 = f62209a;
                        int i161 = (i160 & 63) + (i160 | 63);
                        f62210b = i161 % 128;
                        int i162 = i161 % 2;
                        int i163 = ((((i160 ^ 109) | (i160 & 109)) << 1) - (~(-(((~i160) & 109) | (i160 & (-110)))))) - 1;
                        f62210b = i163 % 128;
                        int i164 = i163 % 2;
                    } else {
                        yt.setDividerPadding(ynVar);
                        int i165 = f62210b;
                        int i166 = ((i165 ^ 102) + ((i165 & 102) << 1)) - 1;
                        f62209a = i166 % 128;
                        int i167 = i166 % 2;
                    }
                }
                Intrinsics.checkNotNull(dividerPadding);
                yr.setDividerPadding setdividerpadding18 = (yr.setDividerPadding) yr.setX(new Object[]{dividerPadding}, 142679588, -142679576, System.identityHashCode(dividerPadding));
                yr.setDividerPadding setdividerpadding19 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding18, (yr) Companion.setDividerPadding(new Object[]{yrVar5}, -918635236, 918635238, (int) System.currentTimeMillis())}, 1518624621, -1518624621, System.identityHashCode(setdividerpadding18));
                yr.setDividerPadding setdividerpadding20 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding19, (yr) Companion.setDividerPadding(new Object[]{dividerPadding}, -918635236, 918635238, (int) System.currentTimeMillis())}, 874392842, -874392817, System.identityHashCode(setdividerpadding19));
                yrVar = (yr) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding20}, -92684172, 92684189, System.identityHashCode(setdividerpadding20));
                if (yvVar.setY != null) {
                    int i168 = f62209a;
                    int i169 = (i168 ^ 85) + ((i168 & 85) << 1);
                    f62210b = i169 % 128;
                    int i170 = i169 % 2;
                    if (!(!((Boolean) zt.setX(new Object[]{yrVar}, -1746594724, 1746594725, (int) System.currentTimeMillis())).booleanValue())) {
                        int i171 = f62210b + 45;
                        f62209a = i171 % 128;
                        int i172 = i171 % 2;
                        if (!(!((Boolean) yx.Companion.setCompoundDrawableTintBlendMode(new Object[]{yrVar, ykVar}, -977183789, 977183789, (int) System.currentTimeMillis())).booleanValue())) {
                            int i173 = f62210b;
                            i16 = ((i173 | 95) << 1) - (i173 ^ 95);
                            f62209a = i16 % 128;
                            if (i16 % 2 == 0) {
                                xr xrVar6 = yvVar.setY;
                                throw null;
                            }
                            xr xrVar7 = yvVar.setY;
                            yrVar2 = (yr) setDividerPadding(new Object[]{(yy) xr.setDividerPadding(new Object[]{xrVar7, yrVar}, 1356247701, -1356247692, System.identityHashCode(xrVar7)), yrVar}, -1272680260, 1272680260, (int) System.currentTimeMillis());
                            if (yrVar5 != null) {
                                yd.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener3}, -47610669, 47610689, (int) System.currentTimeMillis());
                                int i174 = f62210b;
                                int i175 = (i174 & (-122)) | ((~i174) & 121);
                                int i176 = -(-((i174 & 121) << 1));
                                int i177 = (i175 & i176) + (i176 | i175);
                                f62209a = i177 % 128;
                                int i178 = i177 % 2;
                            }
                            int i179 = f62210b;
                            int i180 = ((i179 & 16) + (i179 | 16)) - 1;
                            f62209a = i180 % 128;
                            int i181 = i180 % 2;
                        }
                    }
                    zv zvVar = zv.INSTANCE;
                    if (((Boolean) zv.setOnFocusChangeListener(new Object[]{(String) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -441618648, 441618657, System.identityHashCode(ykVar))}, -970697315, 970697317, (int) System.currentTimeMillis())).booleanValue()) {
                        int i182 = f62210b;
                        int i183 = ((i182 | 35) << 1) - (((~i182) & 35) | (i182 & (-36)));
                        f62209a = i183 % 128;
                        int i184 = i183 % 2;
                        xr xrVar8 = yvVar.setY;
                        xr.setDividerPadding(new Object[]{xrVar8, ykVar}, -543807551, 543807554, System.identityHashCode(xrVar8));
                        int i185 = f62209a + 79;
                        f62210b = i185 % 128;
                        int i186 = i185 % 2;
                    }
                }
                int i187 = f62210b;
                i15 = ((i187 | 17) << 1) - (i187 ^ 17);
                f62209a = i15 % 128;
                if (i15 % 2 != 0) {
                    throw null;
                }
            }
            return yrVar2;
        }
        int i188 = f62210b;
        int i189 = i188 & 19;
        int i190 = (i189 - (~(-(-((i188 ^ 19) | i189))))) - 1;
        f62209a = i190 % 128;
        int i191 = i190 % 2;
        if (yrVar5 != null) {
            if (ykVar == null) {
                int i1110 = f62209a;
                int i1111 = ((i1110 | 49) << 1) - (i1110 ^ 49);
                f62210b = i1111 % 128;
                int i1112 = i1111 % 2;
                Intrinsics.checkNotNull(yrVar5);
                yr.setDividerPadding setdividerpadding21 = (yr.setDividerPadding) yr.setX(new Object[]{yrVar5}, 142679588, -142679576, System.identityHashCode(yrVar5));
                yr.setDividerPadding setdividerpadding22 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding21, (yr) Companion.setDividerPadding(new Object[]{yrVar5}, -918635236, 918635238, (int) System.currentTimeMillis())}, 1518624621, -1518624621, System.identityHashCode(setdividerpadding21));
                yrVar2 = (yr) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding22}, -92684172, 92684189, System.identityHashCode(setdividerpadding22));
                yd.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener3, yrVar2}, 555885383, -555885372, (int) System.currentTimeMillis());
                int i1113 = f62210b;
                int i1114 = i1113 ^ 23;
                int i1115 = (i1113 & 23) << 1;
                i18 = ((i1114 | i1115) << 1) - (i1115 ^ i1114);
                f62209a = i18 % 128;
                if (i18 % 2 != 0) {
                    int i1210 = 89 / 0;
                }
            } else {
                if (yrVar5 != null) {
                    int i1211 = f62209a;
                    int i1212 = ((i1211 & 53) - (~(i1211 | 53))) - 1;
                    f62210b = i1212 % 128;
                    int i1213 = i1212 % 2;
                    yd.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener3, yrVar5}, -1784443573, 1784443591, (int) System.currentTimeMillis());
                    int i1214 = f62210b;
                    int i1215 = (((i1214 | 48) << 1) - (i1214 ^ 48)) - 1;
                    f62209a = i1215 % 128;
                    int i1216 = i1215 % 2;
                } else if (yvVar.setY != null) {
                    int i1217 = f62209a;
                    i13 = ((i1217 | 117) << 1) - (i1217 ^ 117);
                    f62210b = i13 % 128;
                    if (i13 % 2 == 0) {
                        yd.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener3}, -47610669, 47610689, (int) System.currentTimeMillis());
                        int i1218 = 70 / 0;
                    } else {
                        yd.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener3}, -47610669, 47610689, (int) System.currentTimeMillis());
                    }
                    int i1219 = f62209a + 17;
                    f62210b = i1219 % 128;
                    int i1312 = i1219 % 2;
                }
                dividerPadding = setcompounddrawabletintblendmode.setDividerPadding(ykVar);
                int i1313 = f62210b;
                int i1314 = (((i1313 & (-114)) | ((~i1313) & 113)) - (~((i1313 & 113) << 1))) - 1;
                i14 = i1314 % 128;
                f62209a = i14;
                int i1315 = i1314 % 2;
                int i1316 = (i14 & 55) + (i14 | 55);
                f62210b = i1316 % 128;
                int i1317 = i1316 % 2;
                if (yrVar5 != null) {
                    int i1318 = i14 & 73;
                    i17 = i1318 + ((i14 ^ 73) | i1318);
                    f62210b = i17 % 128;
                    if (i17 % 2 == 0) {
                        c10 = 0;
                        int i1319 = 63 / 0;
                        if (dividerPadding != null) {
                            objArr2 = new Object[1];
                            objArr2[c10] = dividerPadding;
                            if (((Integer) yr.setX(objArr2, 151122101, -151122100, System.identityHashCode(dividerPadding))).intValue() == 304) {
                                int i13110 = f62209a;
                                int i13111 = i13110 & 125;
                                int i14110 = ((i13110 ^ 125) | i13111) << 1;
                                int i14111 = -((~i13111) & (i13110 | 125));
                                int i14112 = (i14110 & i14111) + (i14110 | i14111);
                                f62210b = i14112 % 128;
                                int i14113 = i14112 % 2;
                                int i14114 = i13110 & 99;
                                int i14115 = (i14114 - (~((i13110 ^ 99) | i14114))) - 1;
                                f62210b = i14115 % 128;
                                int i14116 = i14115 % 2;
                                int i14117 = i13110 ^ 119;
                                int i14118 = -(-((i13110 & 119) << 1));
                                int i14119 = ((i14117 | i14118) << 1) - (i14118 ^ i14117);
                                f62210b = i14119 % 128;
                                int i1510 = i14119 % 2;
                                yr.setDividerPadding setdividerpadding110 = (yr.setDividerPadding) yr.setX(new Object[]{yrVar5}, 142679588, -142679576, System.identityHashCode(yrVar5));
                                yr.setDividerPadding setdividerpadding111 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding110, (ye) Companion.setDividerPadding(new Object[]{INSTANCE, (ye) yr.setX(new Object[]{yrVar5}, 1547100838, -1547100838, System.identityHashCode(yrVar5)), (ye) yr.setX(new Object[]{dividerPadding}, 1547100838, -1547100838, System.identityHashCode(dividerPadding))}, 683521390, -683521385, (int) System.currentTimeMillis())}, 1273569601, -1273569577, System.identityHashCode(setdividerpadding110));
                                yr.setDividerPadding setdividerpadding112 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding111, Long.valueOf(((Long) yr.setX(new Object[]{dividerPadding}, -1353479930, 1353479935, System.identityHashCode(dividerPadding))).longValue())}, -790912778, 790912800, System.identityHashCode(setdividerpadding111));
                                yr.setDividerPadding setdividerpadding113 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding112, Long.valueOf(((Long) yr.setX(new Object[]{dividerPadding}, -144747726, 144747740, System.identityHashCode(dividerPadding))).longValue())}, 485790072, -485790071, System.identityHashCode(setdividerpadding112));
                                yr.setDividerPadding setdividerpadding114 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding113, (yr) Companion.setDividerPadding(new Object[]{yrVar5}, -918635236, 918635238, (int) System.currentTimeMillis())}, 1518624621, -1518624621, System.identityHashCode(setdividerpadding113));
                                yr.setDividerPadding setdividerpadding115 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding114, (yr) Companion.setDividerPadding(new Object[]{dividerPadding}, -918635236, 918635238, (int) System.currentTimeMillis())}, 874392842, -874392817, System.identityHashCode(setdividerpadding114));
                                yr yrVar8 = (yr) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding115}, -92684172, 92684189, System.identityHashCode(setdividerpadding115));
                                yn ynVar5 = (yn) yr.setX(new Object[]{dividerPadding}, -428621868, 428621887, System.identityHashCode(dividerPadding));
                                Intrinsics.checkNotNull(ynVar5);
                                ynVar5.close();
                                xr xrVar9 = yvVar.setY;
                                Intrinsics.checkNotNull(xrVar9);
                                xrVar9.setDividerPadding();
                                xr.setDividerPadding(new Object[]{yrVar5, yrVar8}, 1005315681, -1005315679, (int) System.currentTimeMillis());
                                yd.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener3, yrVar8}, 555885383, -555885372, (int) System.currentTimeMillis());
                                int i1511 = f62209a;
                                int i1512 = i1511 & 77;
                                int i1513 = i1512 + ((i1511 ^ 77) | i1512);
                                f62210b = i1513 % 128;
                                int i1514 = i1513 % 2;
                                return yrVar8;
                            }
                        }
                    } else {
                        c10 = 0;
                        if (dividerPadding != null) {
                            objArr2 = new Object[1];
                            objArr2[c10] = dividerPadding;
                            if (((Integer) yr.setX(objArr2, 151122101, -151122100, System.identityHashCode(dividerPadding))).intValue() == 304) {
                                int i13112 = f62209a;
                                int i13113 = i13112 & 125;
                                int i141110 = ((i13112 ^ 125) | i13113) << 1;
                                int i141111 = -((~i13113) & (i13112 | 125));
                                int i141112 = (i141110 & i141111) + (i141110 | i141111);
                                f62210b = i141112 % 128;
                                int i141113 = i141112 % 2;
                                int i141114 = i13112 & 99;
                                int i141115 = (i141114 - (~((i13112 ^ 99) | i141114))) - 1;
                                f62210b = i141115 % 128;
                                int i141116 = i141115 % 2;
                                int i141117 = i13112 ^ 119;
                                int i141118 = -(-((i13112 & 119) << 1));
                                int i141119 = ((i141117 | i141118) << 1) - (i141118 ^ i141117);
                                f62210b = i141119 % 128;
                                int i1515 = i141119 % 2;
                                yr.setDividerPadding setdividerpadding116 = (yr.setDividerPadding) yr.setX(new Object[]{yrVar5}, 142679588, -142679576, System.identityHashCode(yrVar5));
                                yr.setDividerPadding setdividerpadding117 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding116, (ye) Companion.setDividerPadding(new Object[]{INSTANCE, (ye) yr.setX(new Object[]{yrVar5}, 1547100838, -1547100838, System.identityHashCode(yrVar5)), (ye) yr.setX(new Object[]{dividerPadding}, 1547100838, -1547100838, System.identityHashCode(dividerPadding))}, 683521390, -683521385, (int) System.currentTimeMillis())}, 1273569601, -1273569577, System.identityHashCode(setdividerpadding116));
                                yr.setDividerPadding setdividerpadding118 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding117, Long.valueOf(((Long) yr.setX(new Object[]{dividerPadding}, -1353479930, 1353479935, System.identityHashCode(dividerPadding))).longValue())}, -790912778, 790912800, System.identityHashCode(setdividerpadding117));
                                yr.setDividerPadding setdividerpadding119 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding118, Long.valueOf(((Long) yr.setX(new Object[]{dividerPadding}, -144747726, 144747740, System.identityHashCode(dividerPadding))).longValue())}, 485790072, -485790071, System.identityHashCode(setdividerpadding118));
                                yr.setDividerPadding setdividerpadding1110 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding119, (yr) Companion.setDividerPadding(new Object[]{yrVar5}, -918635236, 918635238, (int) System.currentTimeMillis())}, 1518624621, -1518624621, System.identityHashCode(setdividerpadding119));
                                yr.setDividerPadding setdividerpadding1111 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding1110, (yr) Companion.setDividerPadding(new Object[]{dividerPadding}, -918635236, 918635238, (int) System.currentTimeMillis())}, 874392842, -874392817, System.identityHashCode(setdividerpadding1110));
                                yr yrVar9 = (yr) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding1111}, -92684172, 92684189, System.identityHashCode(setdividerpadding1111));
                                yn ynVar6 = (yn) yr.setX(new Object[]{dividerPadding}, -428621868, 428621887, System.identityHashCode(dividerPadding));
                                Intrinsics.checkNotNull(ynVar6);
                                ynVar6.close();
                                xr xrVar10 = yvVar.setY;
                                Intrinsics.checkNotNull(xrVar10);
                                xrVar10.setDividerPadding();
                                xr.setDividerPadding(new Object[]{yrVar5, yrVar9}, 1005315681, -1005315679, (int) System.currentTimeMillis());
                                yd.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener3, yrVar9}, 555885383, -555885372, (int) System.currentTimeMillis());
                                int i1516 = f62209a;
                                int i1517 = i1516 & 77;
                                int i1518 = i1517 + ((i1516 ^ 77) | i1517);
                                f62210b = i1518 % 128;
                                int i1519 = i1518 % 2;
                                return yrVar9;
                            }
                        }
                    }
                    ynVar = (yn) yr.setX(new Object[]{yrVar5}, -428621868, 428621887, System.identityHashCode(yrVar5));
                    if (ynVar == null) {
                        int i1610 = f62209a;
                        int i1611 = (i1610 & 63) + (i1610 | 63);
                        f62210b = i1611 % 128;
                        int i1612 = i1611 % 2;
                        int i1613 = ((((i1610 ^ 109) | (i1610 & 109)) << 1) - (~(-(((~i1610) & 109) | (i1610 & (-110)))))) - 1;
                        f62210b = i1613 % 128;
                        int i1614 = i1613 % 2;
                    } else {
                        yt.setDividerPadding(ynVar);
                        int i1615 = f62210b;
                        int i1616 = ((i1615 ^ 102) + ((i1615 & 102) << 1)) - 1;
                        f62209a = i1616 % 128;
                        int i1617 = i1616 % 2;
                    }
                }
                Intrinsics.checkNotNull(dividerPadding);
                yr.setDividerPadding setdividerpadding120 = (yr.setDividerPadding) yr.setX(new Object[]{dividerPadding}, 142679588, -142679576, System.identityHashCode(dividerPadding));
                yr.setDividerPadding setdividerpadding121 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding120, (yr) Companion.setDividerPadding(new Object[]{yrVar5}, -918635236, 918635238, (int) System.currentTimeMillis())}, 1518624621, -1518624621, System.identityHashCode(setdividerpadding120));
                yr.setDividerPadding setdividerpadding23 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding121, (yr) Companion.setDividerPadding(new Object[]{dividerPadding}, -918635236, 918635238, (int) System.currentTimeMillis())}, 874392842, -874392817, System.identityHashCode(setdividerpadding121));
                yrVar = (yr) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding23}, -92684172, 92684189, System.identityHashCode(setdividerpadding23));
                if (yvVar.setY != null) {
                    int i1618 = f62209a;
                    int i1619 = (i1618 ^ 85) + ((i1618 & 85) << 1);
                    f62210b = i1619 % 128;
                    int i1710 = i1619 % 2;
                    if (!(!((Boolean) zt.setX(new Object[]{yrVar}, -1746594724, 1746594725, (int) System.currentTimeMillis())).booleanValue())) {
                        int i1711 = f62210b + 45;
                        f62209a = i1711 % 128;
                        int i1712 = i1711 % 2;
                        if (!(!((Boolean) yx.Companion.setCompoundDrawableTintBlendMode(new Object[]{yrVar, ykVar}, -977183789, 977183789, (int) System.currentTimeMillis())).booleanValue())) {
                            int i1713 = f62210b;
                            i16 = ((i1713 | 95) << 1) - (i1713 ^ 95);
                            f62209a = i16 % 128;
                            if (i16 % 2 == 0) {
                                xr xrVar11 = yvVar.setY;
                                throw null;
                            }
                            xr xrVar12 = yvVar.setY;
                            yrVar2 = (yr) setDividerPadding(new Object[]{(yy) xr.setDividerPadding(new Object[]{xrVar12, yrVar}, 1356247701, -1356247692, System.identityHashCode(xrVar12)), yrVar}, -1272680260, 1272680260, (int) System.currentTimeMillis());
                            if (yrVar5 != null) {
                                yd.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener3}, -47610669, 47610689, (int) System.currentTimeMillis());
                                int i1714 = f62210b;
                                int i1715 = (i1714 & (-122)) | ((~i1714) & 121);
                                int i1716 = -(-((i1714 & 121) << 1));
                                int i1717 = (i1715 & i1716) + (i1716 | i1715);
                                f62209a = i1717 % 128;
                                int i1718 = i1717 % 2;
                            }
                            int i1719 = f62210b;
                            int i1810 = ((i1719 & 16) + (i1719 | 16)) - 1;
                            f62209a = i1810 % 128;
                            int i1811 = i1810 % 2;
                        }
                    }
                    zv zvVar2 = zv.INSTANCE;
                    if (((Boolean) zv.setOnFocusChangeListener(new Object[]{(String) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -441618648, 441618657, System.identityHashCode(ykVar))}, -970697315, 970697317, (int) System.currentTimeMillis())).booleanValue()) {
                        int i1812 = f62210b;
                        int i1813 = ((i1812 | 35) << 1) - (((~i1812) & 35) | (i1812 & (-36)));
                        f62209a = i1813 % 128;
                        int i1814 = i1813 % 2;
                        try {
                            xr xrVar13 = yvVar.setY;
                            xr.setDividerPadding(new Object[]{xrVar13, ykVar}, -543807551, 543807554, System.identityHashCode(xrVar13));
                            int i1815 = f62209a + 79;
                            f62210b = i1815 % 128;
                            int i1816 = i1815 % 2;
                        } catch (IOException unused) {
                        }
                    }
                }
                int i1817 = f62210b;
                i15 = ((i1817 | 17) << 1) - (i1817 ^ 17);
                f62209a = i15 % 128;
                if (i15 % 2 != 0) {
                    throw null;
                }
            }
            return yrVar2;
        }
        yr.setDividerPadding setdividerpadding24 = new yr.setDividerPadding();
        yr.setDividerPadding setdividerpadding25 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding24, setcompounddrawabletintblendmode.setCompoundDrawableTintBlendMode()}, 1035005502, -1035005479, System.identityHashCode(setdividerpadding24));
        yr.setDividerPadding setdividerpadding26 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{(yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding25, yi.setOnFocusChangeListener}, 1826457204, -1826457177, System.identityHashCode(setdividerpadding25)), 504}, 784510625, -784510596, 504);
        yr.setDividerPadding setdividerpadding27 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding26, "Unsatisfiable Request (only-if-cached)"}, 176587316, -176587297, System.identityHashCode(setdividerpadding26));
        yr.setDividerPadding setdividerpadding28 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding27, yt.setDividerPadding}, 637562883, -637562870, System.identityHashCode(setdividerpadding27));
        yr.setDividerPadding setdividerpadding29 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding28, -1L}, -790912778, 790912800, System.identityHashCode(setdividerpadding28));
        yr.setDividerPadding setdividerpadding30 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding29, Long.valueOf(System.currentTimeMillis())}, 485790072, -485790071, System.identityHashCode(setdividerpadding29));
        yrVar = (yr) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding30}, -92684172, 92684189, System.identityHashCode(setdividerpadding30));
        yd.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener3, yrVar}, 330169765, -330169741, (int) System.currentTimeMillis());
        System.identityHashCode(yvVar);
        System.identityHashCode(yvVar);
        return yrVar;
    }

    @Override // com.mypinpad.tsdk.isolation.yl
    @NotNull
    public final yr setX(@NotNull yl.setCompoundDrawableTintBlendMode p4) throws IOException {
        return (yr) setDividerPadding(new Object[]{this, p4}, -1463495368, 1463495369, System.identityHashCode(this));
    }
}
