package com.mypinpad.tsdk.isolation;

import bk.q;
import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class yk {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f62106g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f62107h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final yg f62108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f62109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ye f62110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final yo f62111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Map<Class<?>, Object> f62112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public xq f62113f;

    public static class setDividerPadding {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f62114f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f62115g = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public yg f62116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public String f62117b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public ye.setOnFocusChangeListener f62118c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public yo f62119d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final Map<Class<?>, Object> f62120e;

        public setDividerPadding() {
            this.f62120e = new LinkedHashMap();
            this.f62117b = "GET";
            this.f62118c = new ye.setOnFocusChangeListener();
        }

        /* JADX WARN: Code duplicated, block: B:61:0x03f7  */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x041d, code lost:
        
            if (r12.length() > 0) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0427, code lost:
        
            if (r12.length() > 0) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x0429, code lost:
        
            r13 = com.mypinpad.tsdk.i.yk.setDividerPadding.f62115g;
            r0 = r13 & 77;
            r1 = r13 | 77;
            r2 = ((r0 | r1) << 1) - (r0 ^ r1);
            com.mypinpad.tsdk.i.yk.setDividerPadding.f62114f = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x043b, code lost:
        
            if (r10 != null) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x043d, code lost:
        
            r13 = r13 + 31;
            com.mypinpad.tsdk.i.yk.setDividerPadding.f62114f = r13 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x044a, code lost:
        
            if ((r13 % 2) != 0) goto L78;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x045f, code lost:
        
            if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.zv.setOnFocusChangeListener(new java.lang.Object[]{r12}, -1105951935, 1105951938, (int) java.lang.System.currentTimeMillis())).booleanValue() != false) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0461, code lost:
        
            r13 = com.mypinpad.tsdk.i.yk.setDividerPadding.f62115g;
            r1 = r13 & 73;
            r0 = (((r13 ^ 73) | r1) << 1) - ((r13 | 73) & (~r1));
            com.mypinpad.tsdk.i.yk.setDividerPadding.f62114f = r0 % 128;
            r0 = r0 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x0474, code lost:
        
            r10 = com.mypinpad.tsdk.i.yk.setDividerPadding.f62115g;
            r11 = ((r10 | 21) << 1) - (((~r10) & 21) | (r10 & (-22)));
            com.mypinpad.tsdk.i.yk.setDividerPadding.f62114f = r11 % 128;
            r11 = r11 % 2;
            r10 = new java.lang.StringBuilder("method ");
            r10.append(r12);
            r10.append(" must have a request body.");
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x049f, code lost:
        
            throw new java.lang.IllegalArgumentException(r10.toString().toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x04a0, code lost:
        
            ((java.lang.Boolean) com.mypinpad.tsdk.isolation.zv.setOnFocusChangeListener(new java.lang.Object[]{r12}, -1105951935, 1105951938, (int) java.lang.System.currentTimeMillis())).booleanValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x04b2, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x04cc, code lost:
        
            if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.zv.setOnFocusChangeListener(new java.lang.Object[]{r12}, -106229379, 106229383, (int) java.lang.System.currentTimeMillis())).booleanValue() == false) goto L84;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x04ce, code lost:
        
            setOnFocusChangeListener(new java.lang.Object[]{r11, r12}, -1793341183, 1793341193, java.lang.System.identityHashCode(r11));
            setOnFocusChangeListener(new java.lang.Object[]{r11, r10}, -25944457, 25944458, java.lang.System.identityHashCode(r11));
            r10 = com.mypinpad.tsdk.i.yk.setDividerPadding.f62115g;
            r12 = ((r10 & (-92)) | ((~r10) & 91)) + ((r10 & 91) << 1);
            com.mypinpad.tsdk.i.yk.setDividerPadding.f62114f = r12 % 128;
            r12 = r12 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x0508, code lost:
        
            r10 = new java.lang.StringBuilder("method ");
            r10.append(r12);
            r10.append(" must not have a request body.");
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x0522, code lost:
        
            throw new java.lang.IllegalArgumentException(r10.toString().toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x0523, code lost:
        
            r10 = com.mypinpad.tsdk.i.yk.setDividerPadding.f62115g;
            r11 = ((r10 ^ 14) + ((r10 & 14) << 1)) - 1;
            com.mypinpad.tsdk.i.yk.setDividerPadding.f62114f = r11 % 128;
            r11 = r11 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x053c, code lost:
        
            throw new java.lang.IllegalArgumentException("method.isEmpty() == true".toString());
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ java.lang.Object setOnFocusChangeListener(java.lang.Object[] r10, int r11, int r12, int r13) {
            /*
                Method dump skipped, instruction units count: 1754
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.yk.setDividerPadding.setOnFocusChangeListener(java.lang.Object[], int, int, int):java.lang.Object");
        }

        @NotNull
        public final setDividerPadding setCompoundDrawableTintBlendMode() {
            return (setDividerPadding) setOnFocusChangeListener(new Object[]{this}, -1623928373, 1623928375, System.identityHashCode(this));
        }

        @NotNull
        public final yk setDividerPadding() {
            return (yk) setOnFocusChangeListener(new Object[]{this}, 721744858, -721744846, System.identityHashCode(this));
        }

        @NotNull
        public final setDividerPadding setX(@NotNull yo yoVar) {
            return (setDividerPadding) setOnFocusChangeListener(new Object[]{this, yoVar}, -880434053, 880434053, System.identityHashCode(this));
        }

        @NotNull
        public final setDividerPadding setY(@NotNull yo yoVar) {
            return (setDividerPadding) setOnFocusChangeListener(new Object[]{this, yoVar}, 938022256, -938022251, System.identityHashCode(this));
        }

        @NotNull
        public final setDividerPadding setCompoundDrawableTintBlendMode(@NotNull String str) {
            return (setDividerPadding) setOnFocusChangeListener(new Object[]{this, str}, -1600859902, 1600859911, System.identityHashCode(this));
        }

        @NotNull
        public final setDividerPadding setDividerPadding(@NotNull String str, @Nullable yo yoVar) {
            return (setDividerPadding) setOnFocusChangeListener(new Object[]{this, str, yoVar}, -426525578, 426525584, System.identityHashCode(this));
        }

        @NotNull
        public final setDividerPadding setY(@NotNull ye yeVar) {
            return (setDividerPadding) setOnFocusChangeListener(new Object[]{this, yeVar}, 344210543, -344210527, System.identityHashCode(this));
        }

        @NotNull
        public final setDividerPadding setCompoundDrawableTintBlendMode(@NotNull String str, @NotNull String str2) {
            return (setDividerPadding) setOnFocusChangeListener(new Object[]{this, str, str2}, 1984524309, -1984524305, System.identityHashCode(this));
        }

        @NotNull
        public final setDividerPadding setDividerPadding(@NotNull yo yoVar) {
            return (setDividerPadding) setOnFocusChangeListener(new Object[]{this, yoVar}, -722632008, 722632019, System.identityHashCode(this));
        }

        @NotNull
        public final setDividerPadding setY(@NotNull String str, @NotNull String str2) {
            return (setDividerPadding) setOnFocusChangeListener(new Object[]{this, str, str2}, 730186305, -730186291, System.identityHashCode(this));
        }

        @NotNull
        public final setDividerPadding setDividerPadding(@NotNull String str) {
            return (setDividerPadding) setOnFocusChangeListener(new Object[]{this, str}, -86147461, 86147468, System.identityHashCode(this));
        }

        public setDividerPadding(@NotNull yk ykVar) {
            Map<Class<?>, Object> mutableMap;
            Intrinsics.checkNotNullParameter(ykVar, "");
            this.f62120e = new LinkedHashMap();
            this.f62116a = (yg) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -534472234, 534472239, System.identityHashCode(ykVar));
            this.f62117b = (String) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -441618648, 441618657, System.identityHashCode(ykVar));
            this.f62119d = (yo) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -2084954302, 2084954305, System.identityHashCode(ykVar));
            if (((Map) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -1060837012, 1060837012, System.identityHashCode(ykVar))).isEmpty()) {
                mutableMap = new LinkedHashMap<>();
            } else {
                mutableMap = q.toMutableMap((Map) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -1060837012, 1060837012, System.identityHashCode(ykVar)));
            }
            this.f62120e = mutableMap;
            ye yeVar = (ye) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -1466291161, 1466291162, System.identityHashCode(ykVar));
            this.f62118c = (ye.setOnFocusChangeListener) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar}, -1528950893, 1528950899, System.identityHashCode(yeVar));
        }

        @NotNull
        public final setDividerPadding setDividerPadding(@NotNull yg ygVar) {
            return (setDividerPadding) setOnFocusChangeListener(new Object[]{this, ygVar}, -735097510, 735097513, System.identityHashCode(this));
        }
    }

    public yk(@NotNull yg ygVar, @NotNull String str, @NotNull ye yeVar, @Nullable yo yoVar, @NotNull Map<Class<?>, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(ygVar, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(yeVar, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.f62108a = ygVar;
        this.f62109b = str;
        this.f62110c = yeVar;
        this.f62111d = yoVar;
        this.f62112e = map;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        boolean z10;
        xq xqVar;
        int i13 = (i11 * 517) + (i10 * (-515));
        int i14 = ~i11;
        int i15 = ~(i14 | i12);
        int i16 = ~i12;
        int i17 = i15 | (~(i16 | i10));
        int i18 = ~(i16 | i11);
        int i19 = ~i10;
        switch ((((~(i19 | i11)) | i18) * LibMCryptConstants.IND_HEX_SEGMENTO2) + (((~(i12 | i14 | i19)) | (~(i19 | i16 | i11))) * LibMCryptConstants.IND_HEX_SEGMENTO2) + ((i17 | i18) * (-516)) + i13) {
            case 1:
                yk ykVar = (yk) objArr[0];
                int i20 = f62107h;
                int i21 = i20 & 125;
                int i22 = -(-((i20 ^ 125) | i21));
                int i23 = (i21 & i22) + (i22 | i21);
                f62106g = i23 % 128;
                int i24 = i23 % 2;
                ye yeVar = ykVar.f62110c;
                if (i24 == 0) {
                    return yeVar;
                }
                throw null;
            case 2:
                setDividerPadding setdividerpadding = new setDividerPadding((yk) objArr[0]);
                int i25 = f62106g;
                int i26 = (((i25 ^ 89) | (i25 & 89)) << 1) - (((~i25) & 89) | (i25 & (-90)));
                f62107h = i26 % 128;
                if (i26 % 2 == 0) {
                    int i27 = 38 / 0;
                }
                return setdividerpadding;
            case 3:
                yk ykVar2 = (yk) objArr[0];
                int i28 = f62107h + 69;
                int i29 = i28 % 128;
                f62106g = i29;
                int i30 = i28 % 2;
                yo yoVar = ykVar2.f62111d;
                int i31 = ((i29 | 123) << 1) - (i29 ^ 123);
                f62107h = i31 % 128;
                int i32 = i31 % 2;
                return yoVar;
            case 4:
                yk ykVar3 = (yk) objArr[0];
                StringBuilder sb2 = new StringBuilder("Request{method=");
                sb2.append((String) setCompoundDrawableTintBlendMode(new Object[]{ykVar3}, -441618648, 441618657, System.identityHashCode(ykVar3)));
                sb2.append(", url=");
                sb2.append((yg) setCompoundDrawableTintBlendMode(new Object[]{ykVar3}, -534472234, 534472239, System.identityHashCode(ykVar3)));
                ye yeVar2 = (ye) setCompoundDrawableTintBlendMode(new Object[]{ykVar3}, -1466291161, 1466291162, System.identityHashCode(ykVar3));
                if (((Integer) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar2}, -1558209065, 1558209065, System.identityHashCode(yeVar2))).intValue() != 0) {
                    int i33 = f62107h;
                    int i34 = ((i33 ^ 12) + ((i33 & 12) << 1)) - 1;
                    f62106g = i34 % 128;
                    int i35 = i34 % 2;
                    sb2.append(", headers=[");
                    Iterator<Pair<? extends String, ? extends String>> it = ((ye) setCompoundDrawableTintBlendMode(new Object[]{ykVar3}, -1466291161, 1466291162, System.identityHashCode(ykVar3))).iterator();
                    int i36 = f62106g;
                    int i37 = i36 & 11;
                    int i38 = ((i36 | 11) & (~i37)) + (i37 << 1);
                    f62107h = i38 % 128;
                    int i39 = i38 % 2;
                    int i40 = 0;
                    while (!(!it.hasNext())) {
                        int i41 = f62106g;
                        int i42 = i41 & 31;
                        int i43 = (i41 | 31) & (~i42);
                        int i44 = i42 << 1;
                        int i45 = ((i43 | i44) << 1) - (i43 ^ i44);
                        f62107h = i45 % 128;
                        int i46 = i45 % 2;
                        Pair<? extends String, ? extends String> next = it.next();
                        int i47 = i40 + 1;
                        if (i40 < 0) {
                            int i48 = f62107h;
                            int i49 = (-2) - ((((i48 | 94) << 1) - (i48 ^ 94)) ^ (-1));
                            f62106g = i49 % 128;
                            if (i49 % 2 != 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                int i50 = 34 / 0;
                            } else {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                            }
                        }
                        Pair<? extends String, ? extends String> pair = next;
                        String strComponent1 = pair.component1();
                        String strComponent2 = pair.component2();
                        if (i40 > 0) {
                            int i51 = f62107h;
                            int i52 = i51 & 15;
                            int i53 = (i51 | 15) & (~i52);
                            int i54 = -(-(i52 << 1));
                            int i55 = ((i53 | i54) << 1) - (i53 ^ i54);
                            f62106g = i55 % 128;
                            int i56 = i55 % 2;
                            sb2.append(", ");
                            int i57 = f62107h + 91;
                            f62106g = i57 % 128;
                            int i58 = i57 % 2;
                        }
                        sb2.append(strComponent1);
                        sb2.append(AbstractJsonLexerKt.COLON);
                        sb2.append(strComponent2);
                        int i59 = f62107h + 113;
                        f62106g = i59 % 128;
                        int i60 = i59 % 2;
                        i40 = i47;
                    }
                    sb2.append(AbstractJsonLexerKt.END_LIST);
                    int i61 = f62107h;
                    int i62 = (i61 ^ 57) + ((i61 & 57) << 1);
                    f62106g = i62 % 128;
                    int i63 = i62 % 2;
                }
                if (((Map) setCompoundDrawableTintBlendMode(new Object[]{ykVar3}, -1060837012, 1060837012, System.identityHashCode(ykVar3))).isEmpty()) {
                    int i64 = f62106g;
                    int i65 = ((i64 & 24) + (i64 | 24)) - 1;
                    f62107h = i65 % 128;
                    int i66 = i65 % 2;
                    z10 = false;
                } else {
                    int i67 = f62106g;
                    int i68 = ((i67 & 56) + (i67 | 56)) - 1;
                    f62107h = i68 % 128;
                    z10 = i68 % 2 != 0;
                    int i69 = i67 ^ 85;
                    int i70 = (i67 & 85) << 1;
                    int i71 = ((i69 | i70) << 1) - (i70 ^ i69);
                    f62107h = i71 % 128;
                    int i72 = i71 % 2;
                }
                if (!(!z10)) {
                    int i73 = f62106g;
                    int i74 = ((i73 & (-58)) | ((~i73) & 57)) + ((i73 & 57) << 1);
                    f62107h = i74 % 128;
                    int i75 = i74 % 2;
                    sb2.append(", tags=");
                    sb2.append((Map) setCompoundDrawableTintBlendMode(new Object[]{ykVar3}, -1060837012, 1060837012, System.identityHashCode(ykVar3)));
                    int i76 = f62106g + 3;
                    f62107h = i76 % 128;
                    int i77 = i76 % 2;
                }
                sb2.append(AbstractJsonLexerKt.END_OBJ);
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                int i78 = f62107h;
                int i79 = i78 & 25;
                int i80 = (i78 ^ 25) | i79;
                int i81 = (i79 ^ i80) + ((i80 & i79) << 1);
                f62106g = i81 % 128;
                if (i81 % 2 == 0) {
                    return string;
                }
                int i82 = 77 / 0;
                return string;
            case 5:
                yk ykVar4 = (yk) objArr[0];
                int i83 = f62107h;
                int i84 = i83 & 37;
                int i85 = (~i84) & (i83 | 37);
                int i86 = i84 << 1;
                int i87 = ((i85 | i86) << 1) - (i86 ^ i85);
                f62106g = i87 % 128;
                int i88 = i87 % 2;
                yg ygVar = ykVar4.f62108a;
                int i89 = i83 & 115;
                int i90 = ((i83 ^ 115) | i89) << 1;
                int i91 = -((i83 | 115) & (~i89));
                int i92 = ((i90 | i91) << 1) - (i91 ^ i90);
                f62106g = i92 % 128;
                if (i92 % 2 == 0) {
                    return ygVar;
                }
                throw null;
            case 6:
                yk ykVar5 = (yk) objArr[0];
                int i93 = f62106g;
                int i94 = i93 & 81;
                int i95 = -(-((i93 ^ 81) | i94));
                int i96 = (i94 ^ i95) + ((i94 & i95) << 1);
                f62107h = i96 % 128;
                int i97 = i96 % 2;
                xq xqVar2 = ykVar5.f62113f;
                if (xqVar2 == null) {
                    int i98 = i93 + 95;
                    f62107h = i98 % 128;
                    int i99 = i98 % 2;
                    xq.Companion companion = xq.INSTANCE;
                    xq xqVar3 = (xq) xq.Companion.setDividerPadding(new Object[]{ykVar5.f62110c}, 1821148600, -1821148599, (int) System.currentTimeMillis());
                    ykVar5.f62113f = xqVar3;
                    int i100 = f62107h;
                    int i101 = ((i100 | 67) << 1) - (i100 ^ 67);
                    f62106g = i101 % 128;
                    int i102 = i101 % 2;
                    xqVar = xqVar3;
                } else {
                    xqVar = xqVar2;
                }
                int i103 = f62106g;
                int i104 = (i103 & 37) + (i103 | 37);
                f62107h = i104 % 128;
                if (i104 % 2 != 0) {
                    return xqVar;
                }
                throw null;
            case 7:
                yk ykVar6 = (yk) objArr[0];
                int i105 = f62107h;
                int i106 = (i105 ^ 69) + ((i105 & 69) << 1);
                f62106g = i106 % 128;
                int i107 = i106 % 2;
                yg ygVar2 = ykVar6.f62108a;
                if (i107 == 0) {
                    return Boolean.valueOf(((Boolean) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -487732585, 487732588, System.identityHashCode(ygVar2))).booleanValue());
                }
                ((Boolean) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -487732585, 487732588, System.identityHashCode(ygVar2))).booleanValue();
                throw null;
            case 8:
                yk ykVar7 = (yk) objArr[0];
                String str = (String) objArr[1];
                int i108 = f62106g;
                int i109 = i108 & 59;
                int i110 = ((i108 | 59) & (~i109)) + (i109 << 1);
                f62107h = i110 % 128;
                if (i110 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(str, "");
                    ye yeVar3 = ykVar7.f62110c;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(str, "");
                ye yeVar4 = ykVar7.f62110c;
                String str2 = (String) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar4, str}, 914142416, -914142409, System.identityHashCode(yeVar4));
                int i111 = f62106g;
                int i112 = i111 & 43;
                int i113 = (i111 | 43) & (~i112);
                int i114 = -(-(i112 << 1));
                int i115 = (i113 ^ i114) + ((i113 & i114) << 1);
                f62107h = i115 % 128;
                if (i115 % 2 != 0) {
                    return str2;
                }
                throw null;
            case 9:
                yk ykVar8 = (yk) objArr[0];
                int i116 = f62106g;
                int i117 = i116 & 91;
                int i118 = (i116 | 91) & (~i117);
                int i119 = i117 << 1;
                int i120 = ((i118 | i119) << 1) - (i118 ^ i119);
                int i121 = i120 % 128;
                f62107h = i121;
                int i122 = i120 % 2;
                String str3 = ykVar8.f62109b;
                if (i122 == 0) {
                    int i123 = 18 / 0;
                }
                int i124 = ((i121 | 92) << 1) - (i121 ^ 92);
                int i125 = (i124 ^ (-1)) + (i124 << 1);
                f62106g = i125 % 128;
                int i126 = i125 % 2;
                return str3;
            default:
                yk ykVar9 = (yk) objArr[0];
                int i127 = f62106g + 89;
                f62107h = i127 % 128;
                int i128 = i127 % 2;
                Map<Class<?>, Object> map = ykVar9.f62112e;
                if (i128 != 0) {
                    return map;
                }
                throw null;
        }
    }

    public final boolean getNavBarTitleString() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, 570787113, -570787106, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final Map<Class<?>, Object> setDividerPadding() {
        return (Map) setCompoundDrawableTintBlendMode(new Object[]{this}, -1060837012, 1060837012, System.identityHashCode(this));
    }

    @JvmName(name = "cacheControl")
    @NotNull
    public final xq setLayoutAnimation() {
        return (xq) setCompoundDrawableTintBlendMode(new Object[]{this}, -1948025153, 1948025159, System.identityHashCode(this));
    }

    @JvmName(name = "method")
    @NotNull
    public final String setOnFocusChangeListener() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -441618648, 441618657, System.identityHashCode(this));
    }

    @NotNull
    public final setDividerPadding setOnLongClickListener() {
        return (setDividerPadding) setCompoundDrawableTintBlendMode(new Object[]{this}, 575496979, -575496977, System.identityHashCode(this));
    }

    @JvmName(name = "body")
    @Nullable
    public final yo setX() {
        return (yo) setCompoundDrawableTintBlendMode(new Object[]{this}, -2084954302, 2084954305, System.identityHashCode(this));
    }

    @JvmName(name = "url")
    @NotNull
    public final yg setY() {
        return (yg) setCompoundDrawableTintBlendMode(new Object[]{this}, -534472234, 534472239, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 219717518, -219717514, System.identityHashCode(this));
    }

    @Nullable
    public final String setCompoundDrawableTintBlendMode(@NotNull String str) {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this, str}, 1273556189, -1273556181, System.identityHashCode(this));
    }

    @JvmName(name = "headers")
    @NotNull
    public final ye setCompoundDrawableTintBlendMode() {
        return (ye) setCompoundDrawableTintBlendMode(new Object[]{this}, -1466291161, 1466291162, System.identityHashCode(this));
    }
}
