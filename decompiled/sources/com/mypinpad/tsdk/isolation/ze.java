package com.mypinpad.tsdk.isolation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class ze {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f62321g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f62322h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final zd f62323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f62324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f62325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public zb f62326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ArrayList f62327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f62328f;

    public ze(@NotNull zd zdVar, @NotNull String str) {
        Intrinsics.checkNotNullParameter(zdVar, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.f62323a = zdVar;
        this.f62324b = str;
        this.f62327e = new ArrayList();
    }

    public static /* synthetic */ void a(Object[] objArr) {
        ze zeVar = (ze) objArr[0];
        zb zbVar = (zb) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        Intrinsics.checkNotNullParameter(zbVar, "");
        synchronized (zeVar.f62323a) {
            if (!((Boolean) setY(new Object[]{zeVar}, 573729319, -573729315, System.identityHashCode(zeVar))).booleanValue()) {
                if (((Boolean) setY(new Object[]{zeVar, zbVar, Long.valueOf(jLongValue), Boolean.FALSE}, -1963752086, 1963752100, System.identityHashCode(zeVar))).booleanValue()) {
                    zd zdVar = (zd) setY(new Object[]{zeVar}, -193710573, 193710580, System.identityHashCode(zeVar));
                    zd.setOnFocusChangeListener(new Object[]{zdVar, zeVar}, -386859593, 386859597, System.identityHashCode(zdVar));
                }
                Unit unit = Unit.INSTANCE;
                return;
            }
            if (((Boolean) zb.setCompoundDrawableTintBlendMode(new Object[]{zbVar}, 246357736, -246357732, System.identityHashCode(zbVar))).booleanValue()) {
                zd.Companion companion = zd.INSTANCE;
                if (((Logger) zd.Companion.setY(new Object[0], -1915652863, 1915652863, (int) System.currentTimeMillis())).isLoggable(Level.FINE)) {
                    za.setX(new Object[]{zbVar, zeVar, "schedule canceled (queue is shutdown)"}, 1062514040, -1062514038, (int) System.currentTimeMillis());
                }
            } else {
                zd.Companion companion2 = zd.INSTANCE;
                if (((Logger) zd.Companion.setY(new Object[0], -1915652863, 1915652863, (int) System.currentTimeMillis())).isLoggable(Level.FINE)) {
                    za.setX(new Object[]{zbVar, zeVar, "schedule failed (queue is shutdown)"}, 1062514040, -1062514038, (int) System.currentTimeMillis());
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public static /* synthetic */ void b(Object[] objArr) {
        ze zeVar = (ze) objArr[0];
        if (yt.setOnFocusChangeListener && Thread.holdsLock(zeVar)) {
            StringBuilder sb2 = new StringBuilder("Thread ");
            sb2.append((Object) Thread.currentThread().getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(zeVar);
            throw new AssertionError(sb2.toString());
        }
        synchronized (zeVar.f62323a) {
            try {
                if (((Boolean) setY(new Object[]{zeVar}, 1716465180, -1716465170, System.identityHashCode(zeVar))).booleanValue()) {
                    zd zdVar = (zd) setY(new Object[]{zeVar}, -193710573, 193710580, System.identityHashCode(zeVar));
                    zd.setOnFocusChangeListener(new Object[]{zdVar, zeVar}, -386859593, 386859597, System.identityHashCode(zdVar));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x04c7 A[PHI: r5
      0x04c7: PHI (r5v5 char) = (r5v4 char), (r5v11 char) binds: [B:107:0x04c5, B:104:0x04bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:110:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:112:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:113:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:19:0x010a A[PHI: r1 r3 r14
      0x010a: PHI (r1v62 long) = (r1v61 long), (r1v121 long) binds: [B:18:0x0108, B:15:0x00d9] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r3v42 int) = (r3v41 int), (r3v94 int) binds: [B:18:0x0108, B:15:0x00d9] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r14v7 long) = (r14v6 long), (r14v15 long) binds: [B:18:0x0108, B:15:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0125  */
    /* JADX WARN: Code duplicated, block: B:23:0x013b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0158  */
    /* JADX WARN: Code duplicated, block: B:31:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:33:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:35:0x01be  */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        char c10;
        zb zbVar;
        Object[] objArr2;
        int i13;
        boolean z10;
        char c11;
        zb zbVar2;
        int i14;
        long compoundDrawableTintBlendMode;
        long j10;
        int iIndexOf;
        int i15;
        int i16;
        String strStringPlus;
        int i17 = ~((~i10) | (~i11));
        int i18 = ~i12;
        int i19 = i10 | i11;
        switch (((~i19) * 828) + ((i19 | i18) * (-828)) + ((i17 | (~(i18 | i10 | i11))) * (-828)) + (i11 * 829) + (i10 * 829)) {
            case 1:
                ze zeVar = (ze) objArr[0];
                int i20 = f62322h;
                int i21 = (i20 & 33) + (i20 | 33);
                f62321g = i21 % 128;
                int i22 = i21 % 2;
                ArrayList arrayList = zeVar.f62327e;
                int i23 = i20 & 1;
                int i24 = ((i20 ^ 1) | i23) << 1;
                int i25 = -((i20 | 1) & (~i23));
                int i26 = (i24 & i25) + (i24 | i25);
                f62321g = i26 % 128;
                int i27 = i26 % 2;
                return arrayList;
            case 2:
                ze zeVar2 = (ze) objArr[0];
                int i28 = f62321g;
                int i29 = ((i28 | 83) << 1) - (i28 ^ 83);
                f62322h = i29 % 128;
                int i30 = i29 % 2;
                obj = zeVar2.f62324b;
                if (i30 == 0) {
                    int i31 = 46 / 0;
                }
                return obj;
            case 3:
                ze zeVar3 = (ze) objArr[0];
                int i32 = f62322h;
                int i33 = i32 & 1;
                int i34 = (((i32 | 1) & (~i33)) - (~(i33 << 1))) - 1;
                int i35 = i34 % 128;
                f62321g = i35;
                if (i34 % 2 != 0) {
                    zb zbVar3 = zeVar3.f62326d;
                    throw null;
                }
                zb zbVar4 = zeVar3.f62326d;
                int i36 = ((i35 ^ 114) + ((i35 & 114) << 1)) - 1;
                f62322h = i36 % 128;
                int i37 = i36 % 2;
                return zbVar4;
            case 4:
                ze zeVar4 = (ze) objArr[0];
                int i38 = f62321g;
                int i39 = i38 ^ 73;
                int i40 = -(-((i38 & 73) << 1));
                int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                f62322h = i41 % 128;
                int i42 = i41 % 2;
                boolean z11 = zeVar4.f62325c;
                if (i42 != 0) {
                    return Boolean.valueOf(z11);
                }
                throw null;
            case 5:
                ze zeVar5 = (ze) objArr[0];
                zb zbVar5 = (zb) objArr[1];
                int i43 = f62322h;
                int i44 = i43 & 23;
                int i45 = (i44 - (~(-(-((i43 ^ 23) | i44))))) - 1;
                f62321g = i45 % 128;
                int i46 = i45 % 2;
                setY(new Object[]{zeVar5, zbVar5, 0L}, 1565144845, -1565144837, System.identityHashCode(zeVar5));
                int i47 = f62321g + 104;
                int i48 = (i47 ^ (-1)) + (i47 << 1);
                f62322h = i48 % 128;
                if (i48 % 2 == 0) {
                    int i49 = 37 / 0;
                }
                return null;
            case 6:
                ze zeVar6 = (ze) objArr[0];
                zb zbVar6 = (zb) objArr[1];
                int i50 = f62321g;
                int i51 = ((i50 & 80) + (i50 | 80)) - 1;
                f62322h = i51 % 128;
                int i52 = i51 % 2;
                zeVar6.f62326d = zbVar6;
                if (i52 == 0) {
                    throw null;
                }
                return null;
            case 7:
                ze zeVar7 = (ze) objArr[0];
                int i53 = f62321g;
                int i54 = i53 & 65;
                int i55 = i54 + ((i53 ^ 65) | i54);
                f62322h = i55 % 128;
                if (i55 % 2 != 0) {
                    return zeVar7.f62323a;
                }
                zd zdVar = zeVar7.f62323a;
                throw null;
            case 8:
                a(objArr);
                return null;
            case 9:
                b(objArr);
                return null;
            case 10:
                ze zeVar8 = (ze) objArr[0];
                int i56 = f62321g + 65;
                f62322h = i56 % 128;
                if (i56 % 2 == 0) {
                    c10 = 0;
                    int i57 = 92 / 0;
                    if (zeVar8.f62326d != null) {
                        zbVar = zeVar8.f62326d;
                        Intrinsics.checkNotNull(zbVar);
                        objArr2 = new Object[1];
                        objArr2[c10] = zbVar;
                        if (!(!((Boolean) zb.setCompoundDrawableTintBlendMode(objArr2, 246357736, -246357732, System.identityHashCode(zbVar))).booleanValue())) {
                            int i58 = f62322h;
                            i13 = ((i58 & 91) - (~(-(-(i58 | 91))))) - 1;
                            f62321g = i13 % 128;
                            if (i13 % 2 != 0) {
                                zeVar8.f62328f = false;
                            } else {
                                zeVar8.f62328f = true;
                            }
                        }
                    }
                } else {
                    c10 = 0;
                    if (zeVar8.f62326d != null) {
                        zbVar = zeVar8.f62326d;
                        Intrinsics.checkNotNull(zbVar);
                        objArr2 = new Object[1];
                        objArr2[c10] = zbVar;
                        if (!(!((Boolean) zb.setCompoundDrawableTintBlendMode(objArr2, 246357736, -246357732, System.identityHashCode(zbVar))).booleanValue())) {
                            int i59 = f62322h;
                            i13 = ((i59 & 91) - (~(-(-(i59 | 91))))) - 1;
                            f62321g = i13 % 128;
                            if (i13 % 2 != 0) {
                                zeVar8.f62328f = false;
                            } else {
                                zeVar8.f62328f = true;
                            }
                        }
                    }
                }
                int size = zeVar8.f62327e.size() - 1;
                if (size >= 0) {
                    boolean z12 = false;
                    while (true) {
                        int i60 = ((size | (-107)) << 1) - (size ^ (-107));
                        int i61 = (i60 | 106) + (i60 & 106);
                        ArrayList arrayList2 = zeVar8.f62327e;
                        zb zbVar7 = (zb) arrayList2.get(size);
                        if (((Boolean) zb.setCompoundDrawableTintBlendMode(new Object[]{zbVar7}, 246357736, -246357732, System.identityHashCode(zbVar7))).booleanValue()) {
                            int i62 = f62322h;
                            int i63 = i62 & 21;
                            int i64 = (i62 | 21) & (~i63);
                            int i65 = -(-(i63 << 1));
                            int i66 = ((i64 | i65) << 1) - (i64 ^ i65);
                            f62321g = i66 % 128;
                            if (i66 % 2 != 0) {
                                zbVar2 = (zb) arrayList2.get(size);
                                zd.Companion companion = zd.INSTANCE;
                                c11 = 0;
                                int i67 = 72 / 0;
                                if (((Logger) zd.Companion.setY(new Object[0], -1915652863, 1915652863, (int) System.currentTimeMillis())).isLoggable(Level.FINE)) {
                                    i14 = 3;
                                    Object[] objArr3 = new Object[i14];
                                    objArr3[c11] = zbVar2;
                                    objArr3[1] = zeVar8;
                                    objArr3[2] = "canceled";
                                    za.setX(objArr3, 1062514040, -1062514038, (int) System.currentTimeMillis());
                                    int i68 = f62322h;
                                    int i69 = (i68 ^ 41) + ((i68 & 41) << 1);
                                    f62321g = i69 % 128;
                                    int i70 = i69 % 2;
                                }
                            } else {
                                c11 = 0;
                                zbVar2 = (zb) arrayList2.get(size);
                                zd.Companion companion2 = zd.INSTANCE;
                                if (((Logger) zd.Companion.setY(new Object[0], -1915652863, 1915652863, (int) System.currentTimeMillis())).isLoggable(Level.FINE)) {
                                    i14 = 3;
                                    Object[] objArr4 = new Object[i14];
                                    objArr4[c11] = zbVar2;
                                    objArr4[1] = zeVar8;
                                    objArr4[2] = "canceled";
                                    za.setX(objArr4, 1062514040, -1062514038, (int) System.currentTimeMillis());
                                    int i610 = f62322h;
                                    int i611 = (i610 ^ 41) + ((i610 & 41) << 1);
                                    f62321g = i611 % 128;
                                    int i71 = i611 % 2;
                                }
                            }
                            arrayList2.remove(size);
                            int i72 = f62321g;
                            int i73 = i72 & 25;
                            int i74 = (i72 ^ 25) | i73;
                            int i75 = ((i73 | i74) << 1) - (i74 ^ i73);
                            f62322h = i75 % 128;
                            int i76 = i75 % 2;
                            z12 = true;
                        }
                        if (i61 < 0) {
                            z10 = z12;
                        } else {
                            size = i61;
                        }
                    }
                } else {
                    z10 = false;
                }
                int i77 = f62322h + 23;
                f62321g = i77 % 128;
                int i78 = i77 % 2;
                return Boolean.valueOf(z10);
            case 11:
                ze zeVar9 = (ze) objArr[0];
                int i79 = f62322h;
                int i80 = ((i79 ^ 55) | (i79 & 55)) << 1;
                int i81 = ~i79;
                int i82 = -((i79 & (-56)) | (i81 & 55));
                int i83 = ((i80 | i82) << 1) - (i80 ^ i82);
                f62321g = i83 % 128;
                int i84 = i83 % 2;
                zeVar9.f62325c = true;
                int i85 = ((i79 ^ 125) | (i79 & 125)) << 1;
                int i86 = -((i79 & (-126)) | (125 & i81));
                int i87 = (i85 & i86) + (i85 | i86);
                f62321g = i87 % 128;
                if (i87 % 2 != 0) {
                    throw null;
                }
                return null;
            case 12:
                ze zeVar10 = (ze) objArr[0];
                if (yt.setOnFocusChangeListener && Thread.holdsLock(zeVar10)) {
                    StringBuilder sb2 = new StringBuilder("Thread ");
                    sb2.append((Object) Thread.currentThread().getName());
                    sb2.append(" MUST NOT hold lock on ");
                    sb2.append(zeVar10);
                    throw new AssertionError(sb2.toString());
                }
                synchronized (zeVar10.f62323a) {
                    try {
                        setY(new Object[]{zeVar10}, -2073828567, 2073828578, System.identityHashCode(zeVar10));
                        if (((Boolean) setY(new Object[]{zeVar10}, 1716465180, -1716465170, System.identityHashCode(zeVar10))).booleanValue()) {
                            zd zdVar2 = (zd) setY(new Object[]{zeVar10}, -193710573, 193710580, System.identityHashCode(zeVar10));
                            zd.setOnFocusChangeListener(new Object[]{zdVar2, zeVar10}, -386859593, 386859597, System.identityHashCode(zdVar2));
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return null;
            case 13:
                ze zeVar11 = (ze) objArr[0];
                int i88 = f62322h;
                int i89 = i88 & 97;
                int i90 = -(-((i88 ^ 97) | i89));
                int i91 = ((i89 | i90) << 1) - (i89 ^ i90);
                f62321g = i91 % 128;
                int i92 = i91 % 2;
                zeVar11.f62328f = false;
                int i93 = i88 & 13;
                int i94 = ((i88 ^ 13) | i93) << 1;
                int i95 = -((i88 | 13) & (~i93));
                int i96 = (i94 ^ i95) + ((i95 & i94) << 1);
                f62321g = i96 % 128;
                if (i96 % 2 != 0) {
                    throw null;
                }
                return null;
            case 14:
                ze zeVar12 = (ze) objArr[0];
                zb zbVar8 = (zb) objArr[1];
                long jLongValue = ((Number) objArr[2]).longValue();
                boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
                int i97 = f62321g;
                int i98 = (i97 ^ 71) + ((i97 & 71) << 1);
                f62322h = i98 % 128;
                if (i98 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(zbVar8, "");
                    zb.setCompoundDrawableTintBlendMode(new Object[]{zbVar8, zeVar12}, 1072267580, -1072267580, System.identityHashCode(zbVar8));
                    zd zdVar3 = zeVar12.f62323a;
                    compoundDrawableTintBlendMode = ((zd.setY) zd.setOnFocusChangeListener(new Object[]{zdVar3}, 564604112, -564604104, System.identityHashCode(zdVar3))).setCompoundDrawableTintBlendMode();
                    j10 = compoundDrawableTintBlendMode & jLongValue;
                    iIndexOf = zeVar12.f62327e.indexOf(zbVar8);
                    if (iIndexOf != -1) {
                        if (((Long) zb.setCompoundDrawableTintBlendMode(new Object[]{zbVar8}, -137883736, 137883738, System.identityHashCode(zbVar8))).longValue() <= j10) {
                            int i99 = f62321g;
                            int i100 = i99 & 113;
                            i15 = ((((i99 ^ 113) | i100) << 1) - (~(-((i99 | 113) & (~i100))))) - 1;
                            f62322h = i15 % 128;
                            if (i15 % 2 != 0) {
                                ((Logger) zd.Companion.setY(new Object[0], -1915652863, 1915652863, (int) System.currentTimeMillis())).isLoggable(Level.FINE);
                                throw null;
                            }
                            if (((Logger) zd.Companion.setY(new Object[0], -1915652863, 1915652863, (int) System.currentTimeMillis())).isLoggable(Level.FINE)) {
                                int i101 = f62322h + 81;
                                f62321g = i101 % 128;
                                int i102 = i101 % 2;
                                za.setX(new Object[]{zbVar8, zeVar12, "already scheduled"}, 1062514040, -1062514038, (int) System.currentTimeMillis());
                                int i103 = f62321g;
                                int i104 = ((i103 | 65) << 1) - (i103 ^ 65);
                                f62322h = i104 % 128;
                                int i105 = i104 % 2;
                            }
                            int i106 = f62321g;
                            int i107 = i106 ^ 93;
                            int i108 = ((i106 & 93) | i107) << 1;
                            int i109 = -i107;
                            i16 = (i108 & i109) + (i108 | i109);
                            f62322h = i16 % 128;
                            if (i16 % 2 == 0) {
                                throw null;
                            }
                        } else {
                            zeVar12.f62327e.remove(iIndexOf);
                            int i110 = f62321g;
                            int i111 = ((i110 | 113) << 1) - (((~i110) & 113) | (i110 & (-114)));
                            f62322h = i111 % 128;
                            int i112 = i111 % 2;
                        }
                        obj = Boolean.FALSE;
                    }
                    return obj;
                }
                Intrinsics.checkNotNullParameter(zbVar8, "");
                zb.setCompoundDrawableTintBlendMode(new Object[]{zbVar8, zeVar12}, 1072267580, -1072267580, System.identityHashCode(zbVar8));
                zd zdVar4 = zeVar12.f62323a;
                compoundDrawableTintBlendMode = ((zd.setY) zd.setOnFocusChangeListener(new Object[]{zdVar4}, 564604112, -564604104, System.identityHashCode(zdVar4))).setCompoundDrawableTintBlendMode();
                j10 = compoundDrawableTintBlendMode + jLongValue;
                iIndexOf = zeVar12.f62327e.indexOf(zbVar8);
                if (iIndexOf != -1) {
                    if (((Long) zb.setCompoundDrawableTintBlendMode(new Object[]{zbVar8}, -137883736, 137883738, System.identityHashCode(zbVar8))).longValue() <= j10) {
                        int i910 = f62321g;
                        int i1010 = i910 & 113;
                        i15 = ((((i910 ^ 113) | i1010) << 1) - (~(-((i910 | 113) & (~i1010))))) - 1;
                        f62322h = i15 % 128;
                        if (i15 % 2 != 0) {
                            ((Logger) zd.Companion.setY(new Object[0], -1915652863, 1915652863, (int) System.currentTimeMillis())).isLoggable(Level.FINE);
                            throw null;
                        }
                        if (((Logger) zd.Companion.setY(new Object[0], -1915652863, 1915652863, (int) System.currentTimeMillis())).isLoggable(Level.FINE)) {
                            int i1011 = f62322h + 81;
                            f62321g = i1011 % 128;
                            int i1012 = i1011 % 2;
                            za.setX(new Object[]{zbVar8, zeVar12, "already scheduled"}, 1062514040, -1062514038, (int) System.currentTimeMillis());
                            int i1013 = f62321g;
                            int i1014 = ((i1013 | 65) << 1) - (i1013 ^ 65);
                            f62322h = i1014 % 128;
                            int i1015 = i1014 % 2;
                        }
                        int i1016 = f62321g;
                        int i1017 = i1016 ^ 93;
                        int i1018 = ((i1016 & 93) | i1017) << 1;
                        int i1019 = -i1017;
                        i16 = (i1018 & i1019) + (i1018 | i1019);
                        f62322h = i16 % 128;
                        if (i16 % 2 == 0) {
                            throw null;
                        }
                    } else {
                        zeVar12.f62327e.remove(iIndexOf);
                        int i113 = f62321g;
                        int i114 = ((i113 | 113) << 1) - (((~i113) & 113) | (i113 & (-114)));
                        f62322h = i114 % 128;
                        int i115 = i114 % 2;
                    }
                    obj = Boolean.FALSE;
                }
                return obj;
                zb.setCompoundDrawableTintBlendMode(new Object[]{zbVar8, Long.valueOf(j10)}, -737772585, 737772586, System.identityHashCode(zbVar8));
                if (!(!((Logger) zd.Companion.setY(new Object[0], -1915652863, 1915652863, (int) System.currentTimeMillis())).isLoggable(Level.FINE))) {
                    int i116 = f62322h;
                    int i117 = ((i116 | 101) << 1) - (i116 ^ 101);
                    int i118 = i117 % 128;
                    f62321g = i118;
                    int i119 = i117 % 2;
                    if (zBooleanValue) {
                        int i120 = i118 + 47;
                        f62322h = i120 % 128;
                        int i121 = i120 % 2;
                        strStringPlus = Intrinsics.stringPlus("run again after ", (String) za.setX(new Object[]{Long.valueOf(j10 - compoundDrawableTintBlendMode)}, 2036943663, -2036943663, (int) System.currentTimeMillis()));
                        int i122 = f62322h;
                        int i123 = (i122 & (-96)) | ((~i122) & 95);
                        int i124 = (i122 & 95) << 1;
                        int i125 = (i123 & i124) + (i124 | i123);
                        f62321g = i125 % 128;
                        int i126 = i125 % 2;
                    } else {
                        strStringPlus = Intrinsics.stringPlus("scheduled after ", (String) za.setX(new Object[]{Long.valueOf(j10 - compoundDrawableTintBlendMode)}, 2036943663, -2036943663, (int) System.currentTimeMillis()));
                        int i127 = f62322h;
                        int i128 = i127 & 101;
                        int i129 = (((i127 ^ 101) | i128) << 1) - ((i127 | 101) & (~i128));
                        f62321g = i129 % 128;
                        int i130 = i129 % 2;
                    }
                    za.setX(new Object[]{zbVar8, zeVar12, strStringPlus}, 1062514040, -1062514038, (int) System.currentTimeMillis());
                    int i131 = f62321g;
                    int i132 = ((i131 ^ 4) + ((i131 & 4) << 1)) - 1;
                    f62322h = i132 % 128;
                    int i133 = i132 % 2;
                }
                Iterator it = zeVar12.f62327e.iterator();
                int i134 = f62322h + 17;
                f62321g = i134 % 128;
                int i135 = i134 % 2;
                int size2 = 0;
                while (true) {
                    if (it.hasNext()) {
                        System.identityHashCode(zeVar12);
                        System.identityHashCode(zeVar12);
                        zb zbVar9 = (zb) it.next();
                        if (((Long) zb.setCompoundDrawableTintBlendMode(new Object[]{zbVar9}, -137883736, 137883738, System.identityHashCode(zbVar9))).longValue() - compoundDrawableTintBlendMode > jLongValue) {
                            int i136 = f62322h;
                            int i137 = i136 & 91;
                            int i138 = (((i136 ^ 91) | i137) << 1) - ((i136 | 91) & (~i137));
                            int i139 = i138 % 128;
                            f62321g = i139;
                            int i140 = i138 % 2;
                            int i141 = i139 & 83;
                            int i142 = ((((i139 ^ 83) | i141) << 1) - (~(-((i139 | 83) & (~i141))))) - 1;
                            int i143 = i142 % 128;
                            f62322h = i143;
                            if (i142 % 2 == 0) {
                                throw null;
                            }
                            int i144 = (i143 & 59) + (i143 | 59);
                            f62321g = i144 % 128;
                            int i145 = i144 % 2;
                        } else {
                            int i146 = f62321g;
                            int i147 = i146 + 67;
                            f62322h = i147 % 128;
                            int i148 = i147 % 2;
                            size2++;
                            int i149 = (i146 ^ 37) + ((i146 & 37) << 1);
                            f62322h = i149 % 128;
                            int i150 = i149 % 2;
                        }
                    } else {
                        int i151 = f62321g;
                        int i152 = i151 & 51;
                        int i153 = -(-((i151 ^ 51) | i152));
                        int i154 = (i152 & i153) + (i153 | i152);
                        f62322h = i154 % 128;
                        int i155 = i154 % 2;
                        size2 = -1;
                    }
                }
                ArrayList arrayList3 = zeVar12.f62327e;
                if (size2 == -1) {
                    int i156 = f62322h + 109;
                    f62321g = i156 % 128;
                    if (i156 % 2 != 0) {
                        arrayList3.size();
                        throw null;
                    }
                    size2 = arrayList3.size();
                }
                arrayList3.add(size2, zbVar8);
                if (size2 == 0) {
                    int i157 = f62322h;
                    int i158 = i157 & 13;
                    int i159 = (i157 ^ 13) | i158;
                    int i160 = ((i158 | i159) << 1) - (i158 ^ i159);
                    f62321g = i160 % 128;
                    int i161 = i160 % 2;
                    int i162 = i157 & 89;
                    int i163 = (i157 | 89) & (~i162);
                    int i164 = i162 << 1;
                    int i165 = (i163 ^ i164) + ((i163 & i164) << 1);
                    f62321g = i165 % 128;
                    int i166 = i165 % 2;
                    obj = Boolean.TRUE;
                } else {
                    int i167 = f62322h + 33;
                    f62321g = i167 % 128;
                    if (i167 % 2 != 0) {
                        throw null;
                    }
                    obj = Boolean.FALSE;
                }
                return obj;
            case 15:
                ze zeVar13 = (ze) objArr[0];
                int i168 = f62321g;
                int i169 = i168 & 19;
                int i170 = (i168 ^ 19) | i169;
                int i171 = (i169 ^ i170) + ((i170 & i169) << 1);
                int i172 = i171 % 128;
                f62322h = i172;
                int i173 = i171 % 2;
                String str = zeVar13.f62324b;
                if (i173 == 0) {
                    int i174 = 62 / 0;
                }
                int i175 = i172 + 125;
                f62321g = i175 % 128;
                int i176 = i175 % 2;
                return str;
            default:
                ze zeVar14 = (ze) objArr[0];
                int i177 = f62321g;
                int i178 = i177 + 9;
                f62322h = i178 % 128;
                int i179 = i178 % 2;
                boolean z13 = zeVar14.f62328f;
                if (i179 == 0) {
                    throw null;
                }
                int i180 = (i177 ^ 89) + ((i177 & 89) << 1);
                f62322h = i180 % 128;
                int i181 = i180 % 2;
                return Boolean.valueOf(z13);
        }
    }

    public final void getNavBarTitleString() {
        setY(new Object[]{this}, 669869495, -669869482, System.identityHashCode(this));
    }

    public final void setCompoundDrawableTintBlendMode(@Nullable zb zbVar) {
        setY(new Object[]{this, zbVar}, -1158651089, 1158651095, System.identityHashCode(this));
    }

    @Nullable
    public final zb setDividerPadding() {
        return (zb) setY(new Object[]{this}, -605751423, 605751426, System.identityHashCode(this));
    }

    public final boolean setLayoutAnimation() {
        return ((Boolean) setY(new Object[]{this}, 1530575414, -1530575414, System.identityHashCode(this))).booleanValue();
    }

    public final void setNavigationOnClickListener() {
        setY(new Object[]{this}, -569925527, 569925536, System.identityHashCode(this));
    }

    public final boolean setOnDragListener() {
        return ((Boolean) setY(new Object[]{this}, 1716465180, -1716465170, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setOnFocusChangeListener(@NotNull zb zbVar, long j10, boolean z10) {
        return ((Boolean) setY(new Object[]{this, zbVar, Long.valueOf(j10), Boolean.valueOf(z10)}, -1963752086, 1963752100, System.identityHashCode(this))).booleanValue();
    }

    public final void setOnLongClickListener() {
        setY(new Object[]{this}, -596759090, 596759102, System.identityHashCode(this));
    }

    @NotNull
    public final zd setX() {
        return (zd) setY(new Object[]{this}, -193710573, 193710580, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setY(new Object[]{this}, -1449717782, 1449717797, System.identityHashCode(this));
    }

    public final boolean setCompoundDrawableTintBlendMode() {
        return ((Boolean) setY(new Object[]{this}, 573729319, -573729315, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final List<zb> setOnFocusChangeListener() {
        return (List) setY(new Object[]{this}, 78938910, -78938909, System.identityHashCode(this));
    }

    public static final class setOnFocusChangeListener extends zb {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static int f62329h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static int f62330i = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f62331g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setOnFocusChangeListener(String str, Function0<Unit> function0) {
            super(str, true);
            this.f62331g = function0;
        }

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            setOnFocusChangeListener setonfocuschangelistener = (setOnFocusChangeListener) objArr[0];
            int i13 = f62330i;
            int i14 = (i13 ^ 99) + ((i13 & 99) << 1);
            f62329h = i14 % 128;
            int i15 = i14 % 2;
            setonfocuschangelistener.f62331g.invoke();
            int i16 = f62329h + 45;
            f62330i = i16 % 128;
            int i17 = i16 % 2;
            return -1L;
        }

        @Override // com.mypinpad.tsdk.isolation.zb
        public final long setY() {
            return ((Long) setY(new Object[]{this}, -573571791, 573571791, System.identityHashCode(this))).longValue();
        }
    }

    public final void setY(@NotNull zb zbVar, long j10) {
        setY(new Object[]{this, zbVar, Long.valueOf(j10)}, 1565144845, -1565144837, System.identityHashCode(this));
    }

    @NotNull
    public final String setY() {
        return (String) setY(new Object[]{this}, 1886544987, -1886544985, System.identityHashCode(this));
    }
}
