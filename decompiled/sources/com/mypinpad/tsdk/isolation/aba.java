package com.mypinpad.tsdk.isolation;

import android.util.Log;
import bk.q;
import com.esotericsoftware.asm.Opcodes;
import com.google.android.gms.wearable.WearableStatusCodes;
import com.vasco.digipass.sdk.DigipassSDKReturnCodes;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\rJ1\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/mypinpad/tsdk/i/aba;", "", "", "p0", "", "p1", "p2", "", "p3", "", "setOnFocusChangeListener", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V", "setX", "()V", "<init>"}, k = 1, mv = {1, 6, 0})
public final class aba {

    @NotNull
    public static final aba INSTANCE = new aba();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final CopyOnWriteArraySet<Logger> f52264a = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Map<String, String> f52265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f52266c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f52267d = 1;

    static {
        String name;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r3 = ym.class.getPackage();
        if (r3 == null) {
            int i10 = f52267d;
            int i11 = (i10 ^ 31) + ((i10 & 31) << 1);
            f52266c = i11 % 128;
            int i12 = i11 % 2;
            int i13 = i10 & 43;
            int i14 = (i10 | 43) & (~i13);
            int i15 = -(-(i13 << 1));
            int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
            f52266c = i16 % 128;
            int i17 = i16 % 2;
            name = null;
        } else {
            name = r3.getName();
            int i18 = f52266c;
            int i19 = (i18 & (-102)) | ((~i18) & 101);
            int i20 = (i18 & 101) << 1;
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            f52267d = i21 % 128;
            int i22 = i21 % 2;
        }
        if (name != null) {
            int i23 = f52267d;
            int i24 = (((i23 | 102) << 1) - (i23 ^ 102)) - 1;
            f52266c = i24 % 128;
            int i25 = i24 % 2;
            linkedHashMap.put(name, "OkHttp");
            int i26 = f52266c;
            int i27 = i26 & 13;
            int i28 = (i26 ^ 13) | i27;
            int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
            f52267d = i29 % 128;
            int i30 = i29 % 2;
        }
        String name2 = ym.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = aae.class.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = zd.class.getName();
        Intrinsics.checkNotNullExpressionValue(name4, "");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f52265b = q.toMap(linkedHashMap);
        int i31 = f52267d;
        int i32 = i31 & 9;
        int i33 = (i31 | 9) & (~i32);
        int i34 = -(-(i32 << 1));
        int i35 = (i33 ^ i34) + ((i33 & i34) << 1);
        f52266c = i35 % 128;
        int i36 = i35 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0146 A[PHI: r0
      0x0146: PHI (r0v39 java.lang.String) = (r0v38 java.lang.String), (r0v53 java.lang.String) binds: [B:29:0x0144, B:26:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x015d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x015f  */
    /* JADX WARN: Code duplicated, block: B:36:0x018f  */
    /* JADX WARN: Code duplicated, block: B:38:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:39:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:45:0x0276  */
    /* JADX WARN: Code duplicated, block: B:46:0x027b  */
    /* JADX WARN: Code duplicated, block: B:48:0x028f A[LOOP:2: B:41:0x01ea->B:48:0x028f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x0294  */
    /* JADX WARN: Code duplicated, block: B:70:0x0354  */
    /* JADX WARN: Code duplicated, block: B:71:0x0376  */
    /* JADX WARN: Code duplicated, block: B:73:0x037d  */
    /* JADX WARN: Code duplicated, block: B:75:0x039f  */
    /* JADX WARN: Code duplicated, block: B:88:0x025e A[EDGE_INSN: B:88:0x025e->B:43:0x025e BREAK  A[LOOP:2: B:41:0x01ea->B:48:0x028f], SYNTHETIC] */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        Level level;
        int i13;
        String str;
        String str2;
        int i14;
        int length;
        int iIndexOf$default;
        int iMin;
        int i15;
        int i16;
        int i17 = (i11 * Opcodes.INSTANCEOF) + (i10 * Opcodes.INSTANCEOF);
        int i18 = ~i12;
        int i19 = ~i10;
        int i20 = (((~(i19 | i11)) | i18) * (-192)) + i17;
        int i21 = ~i11;
        int i22 = i19 | i21;
        int i23 = i18 | i21;
        int i24 = (((~(i10 | i11 | i12)) | (~(i23 | i10)) | (~(i22 | i12))) * 192) + (((~i23) | (~i22)) * (-384)) + i20;
        int i25 = 0;
        int i26 = 2;
        if (i24 != 1) {
            Map<String, String> map = f52265b;
            if (i24 == 2) {
                String str3 = (String) objArr[0];
                int i27 = f52267d;
                int i28 = (i27 & 55) + (i27 | 55);
                f52266c = i28 % 128;
                int i29 = i28 % 2;
                String str4 = map.get(str3);
                if (str4 == null) {
                    int i30 = f52266c;
                    int i31 = (i30 & (-122)) | ((~i30) & 121);
                    int i32 = (i30 & 121) << 1;
                    int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                    f52267d = i33 % 128;
                    int i34 = i33 % 2;
                    String strTake = StringsKt___StringsKt.take(str3, 23);
                    int i35 = f52267d + 79;
                    f52266c = i35 % 128;
                    int i36 = i35 % 2;
                    str = strTake;
                } else {
                    str = str4;
                }
                int i37 = f52266c;
                int i38 = i37 & 29;
                int i39 = -(-((i37 ^ 29) | i38));
                int i40 = (i38 & i39) + (i39 | i38);
                f52267d = i40 % 128;
                int i41 = i40 % 2;
                return str;
            }
            if (i24 != 3) {
                int i42 = f52267d;
                int i43 = ((i42 | 63) << 1) - (i42 ^ 63);
                f52266c = i43 % 128;
                if (i43 % 2 != 0) {
                    map.entrySet().iterator();
                    throw null;
                }
                Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
                int i44 = f52267d;
                int i45 = i44 & 25;
                int i46 = ((((i44 ^ 25) | i45) << 1) - (~(-((i44 | 25) & (~i45))))) - 1;
                f52266c = i46 % 128;
                int i47 = i46 % 2;
                while (it.hasNext()) {
                    int i48 = f52266c;
                    int i49 = i48 & 97;
                    int i50 = -(-((i48 ^ 97) | i49));
                    int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
                    f52267d = i51 % 128;
                    if (i51 % 2 == 0) {
                        Map.Entry<String, String> next = it.next();
                        setCompoundDrawableTintBlendMode(new Object[]{next.getKey(), next.getValue()}, 1699385933, -1699385932, (int) System.currentTimeMillis());
                        throw null;
                    }
                    Map.Entry<String, String> next2 = it.next();
                    setCompoundDrawableTintBlendMode(new Object[]{next2.getKey(), next2.getValue()}, 1699385933, -1699385932, (int) System.currentTimeMillis());
                }
                int i52 = f52267d;
                int i53 = ((i52 | 57) << 1) - (i52 ^ 57);
                f52266c = i53 % 128;
                if (i53 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            String str5 = (String) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            String string = (String) objArr[2];
            Throwable th2 = (Throwable) objArr[3];
            int i54 = f52267d;
            int i55 = (((i54 | 66) << 1) - (i54 ^ 66)) - 1;
            f52266c = i55 % 128;
            if (i55 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(string, "");
                str2 = (String) setCompoundDrawableTintBlendMode(new Object[]{str5}, -1560515162, 1560515164, (int) System.currentTimeMillis());
                int i56 = 39 / 0;
                if (Log.isLoggable(str2, iIntValue)) {
                    int i57 = f52267d;
                    i14 = (((i57 ^ 41) | (i57 & 41)) << 1) - (((~i57) & 41) | (i57 & (-42)));
                    f52266c = i14 % 128;
                    if (i14 % 2 == 0) {
                        throw null;
                    }
                    if (th2 != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(string);
                        sb2.append('\n');
                        sb2.append((Object) Log.getStackTraceString(th2));
                        string = sb2.toString();
                        int i58 = f52267d + 3;
                        f52266c = i58 % 128;
                        int i59 = i58 % 2;
                    }
                    length = string.length();
                    int i60 = f52266c + 113;
                    f52267d = i60 % 128;
                    int i61 = i60 % 2;
                    while (i25 < length) {
                        int i62 = f52267d + 35;
                        f52266c = i62 % 128;
                        int i63 = i62 % i26;
                        iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) string, '\n', i25, false, 4, (Object) null);
                        if (iIndexOf$default != -1) {
                            int i64 = f52266c;
                            int i65 = (i64 ^ 99) + ((i64 & 99) << 1);
                            int i66 = i65 % 128;
                            f52267d = i66;
                            int i67 = i65 % i26;
                            int i68 = (i66 & 5) + (i66 | 5);
                            f52266c = i68 % 128;
                            int i69 = i68 % i26;
                        } else {
                            int i70 = f52266c;
                            int i71 = i70 & 51;
                            int i72 = -(-((i70 ^ 51) | i71));
                            int i73 = (i71 ^ i72) + ((i72 & i71) << 1);
                            f52267d = i73 % 128;
                            int i74 = i73 % i26;
                            iIndexOf$default = length;
                        }
                        int i75 = f52267d;
                        int i76 = (((i75 ^ 19) | (i75 & 19)) << 1) - (((~i75) & 19) | (i75 & (-20)));
                        f52266c = i76 % 128;
                        int i77 = i76 % i26;
                        while (true) {
                            int i78 = (-1376001) - (~(i25 * (-344)));
                            int i79 = ~i25;
                            int i80 = (~i79) & DigipassSDKReturnCodes.STATIC_VECTOR_NULL;
                            int i81 = i79 & WearableStatusCodes.TARGET_NODE_NOT_CONNECTED;
                            int i82 = i80 | i81;
                            int i83 = (-4001) & i79;
                            int i84 = i82 | i83;
                            int i85 = ~i84;
                            int i86 = i85 & (i84 | i85);
                            int i87 = ~(((-4001) ^ iIntValue) | ((-4001) & iIntValue));
                            int i88 = i86 ^ i87;
                            int i89 = i86 & i87;
                            int i90 = -(~(((i88 & i89) | (i88 ^ i89)) * 345));
                            int i91 = ((i78 & i90) + (i90 | i78)) - 1;
                            int i92 = ~iIntValue;
                            int i93 = (-4001) ^ i92;
                            int i94 = i92 & DigipassSDKReturnCodes.STATIC_VECTOR_NULL;
                            int i95 = ~((i94 & i93) | (i93 ^ i94));
                            int i96 = (i79 | WearableStatusCodes.TARGET_NODE_NOT_CONNECTED) & (~i81);
                            int i97 = ~((i81 & i96) | (i96 ^ i81));
                            int i98 = (i91 - (~(-(-(((i95 & i97) | (i95 ^ i97)) * 345))))) - 1;
                            int i99 = (i82 ^ i83) | (i82 & i83);
                            int i100 = (i99 & iIntValue) | (i99 ^ iIntValue);
                            int i101 = ~i100;
                            int i102 = -(-(((i100 | i101) & i101) * 345));
                            int i103 = i98 & i102;
                            iMin = Math.min(iIndexOf$default, (i103 - (~(-(-((i102 ^ i98) | i103))))) - 1);
                            String strSubstring = string.substring(i25, iMin);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                            Log.println(iIntValue, str2, strSubstring);
                            if (iMin >= iIndexOf$default) {
                                break;
                            }
                            i25 = iMin;
                        }
                        int i104 = f52266c;
                        i15 = (((i104 ^ 67) | (i104 & 67)) << 1) - ((i104 & (-68)) | ((~i104) & 67));
                        f52267d = i15 % 128;
                        if (i15 % 2 == 0) {
                            i16 = (iMin << 1) - iMin;
                        } else {
                            i16 = iMin + 1;
                        }
                        int i105 = i104 ^ 47;
                        int i106 = (((i104 & 47) | i105) << 1) - i105;
                        f52267d = i106 % 128;
                        int i107 = i106 % 2;
                        i25 = i16;
                        i26 = 2;
                    }
                }
            } else {
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(string, "");
                str2 = (String) setCompoundDrawableTintBlendMode(new Object[]{str5}, -1560515162, 1560515164, (int) System.currentTimeMillis());
                if (Log.isLoggable(str2, iIntValue)) {
                    int i510 = f52267d;
                    i14 = (((i510 ^ 41) | (i510 & 41)) << 1) - (((~i510) & 41) | (i510 & (-42)));
                    f52266c = i14 % 128;
                    if (i14 % 2 == 0) {
                        throw null;
                    }
                    if (th2 != null) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(string);
                        sb3.append('\n');
                        sb3.append((Object) Log.getStackTraceString(th2));
                        string = sb3.toString();
                        int i511 = f52267d + 3;
                        f52266c = i511 % 128;
                        int i512 = i511 % 2;
                    }
                    length = string.length();
                    int i610 = f52266c + 113;
                    f52267d = i610 % 128;
                    int i611 = i610 % 2;
                    while (i25 < length) {
                        int i612 = f52267d + 35;
                        f52266c = i612 % 128;
                        int i613 = i612 % i26;
                        iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) string, '\n', i25, false, 4, (Object) null);
                        if (iIndexOf$default != -1) {
                            int i614 = f52266c;
                            int i615 = (i614 ^ 99) + ((i614 & 99) << 1);
                            int i616 = i615 % 128;
                            f52267d = i616;
                            int i617 = i615 % i26;
                            int i618 = (i616 & 5) + (i616 | 5);
                            f52266c = i618 % 128;
                            int i619 = i618 % i26;
                        } else {
                            int i710 = f52266c;
                            int i711 = i710 & 51;
                            int i712 = -(-((i710 ^ 51) | i711));
                            int i713 = (i711 ^ i712) + ((i712 & i711) << 1);
                            f52267d = i713 % 128;
                            int i714 = i713 % i26;
                            iIndexOf$default = length;
                        }
                        int i715 = f52267d;
                        int i716 = (((i715 ^ 19) | (i715 & 19)) << 1) - (((~i715) & 19) | (i715 & (-20)));
                        f52266c = i716 % 128;
                        int i717 = i716 % i26;
                        while (true) {
                            int i718 = (-1376001) - (~(i25 * (-344)));
                            int i719 = ~i25;
                            int i810 = (~i719) & DigipassSDKReturnCodes.STATIC_VECTOR_NULL;
                            int i811 = i719 & WearableStatusCodes.TARGET_NODE_NOT_CONNECTED;
                            int i812 = i810 | i811;
                            int i813 = (-4001) & i719;
                            int i814 = i812 | i813;
                            int i815 = ~i814;
                            int i816 = i815 & (i814 | i815);
                            int i817 = ~(((-4001) ^ iIntValue) | ((-4001) & iIntValue));
                            int i818 = i816 ^ i817;
                            int i819 = i816 & i817;
                            int i910 = -(~(((i818 & i819) | (i818 ^ i819)) * 345));
                            int i911 = ((i718 & i910) + (i910 | i718)) - 1;
                            int i912 = ~iIntValue;
                            int i913 = (-4001) ^ i912;
                            int i914 = i912 & DigipassSDKReturnCodes.STATIC_VECTOR_NULL;
                            int i915 = ~((i914 & i913) | (i913 ^ i914));
                            int i916 = (i719 | WearableStatusCodes.TARGET_NODE_NOT_CONNECTED) & (~i811);
                            int i917 = ~((i811 & i916) | (i916 ^ i811));
                            int i918 = (i911 - (~(-(-(((i915 & i917) | (i915 ^ i917)) * 345))))) - 1;
                            int i919 = (i812 ^ i813) | (i812 & i813);
                            int i108 = (i919 & iIntValue) | (i919 ^ iIntValue);
                            int i109 = ~i108;
                            int i1010 = -(-(((i108 | i109) & i109) * 345));
                            int i1011 = i918 & i1010;
                            iMin = Math.min(iIndexOf$default, (i1011 - (~(-(-((i1010 ^ i918) | i1011))))) - 1);
                            String strSubstring2 = string.substring(i25, iMin);
                            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                            Log.println(iIntValue, str2, strSubstring2);
                            if (iMin >= iIndexOf$default) {
                                break;
                                break;
                            }
                            i25 = iMin;
                        }
                        int i1012 = f52266c;
                        i15 = (((i1012 ^ 67) | (i1012 & 67)) << 1) - ((i1012 & (-68)) | ((~i1012) & 67));
                        f52267d = i15 % 128;
                        if (i15 % 2 == 0) {
                            i16 = (iMin << 1) - iMin;
                        } else {
                            i16 = iMin + 1;
                        }
                        int i1013 = i1012 ^ 47;
                        int i1014 = (((i1012 & 47) | i1013) << 1) - i1013;
                        f52267d = i1014 % 128;
                        int i1015 = i1014 % 2;
                        i25 = i16;
                        i26 = 2;
                    }
                }
            }
            int i110 = f52266c;
            int i111 = i110 ^ 97;
            int i112 = -(-((i110 & 97) << 1));
            int i113 = (i111 ^ i112) + ((i112 & i111) << 1);
            f52267d = i113 % 128;
            if (i113 % 2 == 0) {
                throw null;
            }
        } else {
            String str6 = (String) objArr[0];
            String str7 = (String) objArr[1];
            int i114 = f52267d;
            int i115 = (i114 & 82) + (i114 | 82);
            int i116 = (i115 ^ (-1)) + (i115 << 1);
            f52266c = i116 % 128;
            int i117 = i116 % 2;
            Logger logger = Logger.getLogger(str6);
            if (f52264a.add(logger)) {
                int i118 = f52267d;
                int i119 = ((i118 ^ 63) - (~(-(-((i118 & 63) << 1))))) - 1;
                f52266c = i119 % 128;
                if (i119 % 2 != 0) {
                    logger.setUseParentHandlers(false);
                    if (Log.isLoggable(str7, 5)) {
                        int i120 = (-2) - ((f52267d + 16) ^ (-1));
                        f52266c = i120 % 128;
                        int i121 = i120 % 2;
                        level = Level.FINE;
                        int i122 = f52266c;
                        int i123 = (-2) - (((i122 ^ 66) + ((i122 & 66) << 1)) ^ (-1));
                        f52267d = i123 % 128;
                        int i124 = i123 % 2;
                    } else {
                        if (Log.isLoggable(str7, 4)) {
                            int i125 = f52266c;
                            int i126 = ((i125 & (-68)) | ((~i125) & 67)) + ((i125 & 67) << 1);
                            f52267d = i126 % 128;
                            int i127 = i126 % 2;
                            level = Level.INFO;
                            int i128 = f52266c;
                            i13 = (i128 & 77) + (i128 | 77);
                            f52267d = i13 % 128;
                        } else {
                            level = Level.WARNING;
                            int i129 = f52267d;
                            i13 = (i129 ^ 97) + ((i129 & 97) << 1);
                            f52266c = i13 % 128;
                        }
                        int i130 = i13 % 2;
                    }
                } else {
                    logger.setUseParentHandlers(false);
                    if (Log.isLoggable(str7, 3)) {
                        int i1210 = (-2) - ((f52267d + 16) ^ (-1));
                        f52266c = i1210 % 128;
                        int i1211 = i1210 % 2;
                        level = Level.FINE;
                        int i1212 = f52266c;
                        int i1213 = (-2) - (((i1212 ^ 66) + ((i1212 & 66) << 1)) ^ (-1));
                        f52267d = i1213 % 128;
                        int i1214 = i1213 % 2;
                    } else {
                        if (Log.isLoggable(str7, 4)) {
                            int i1215 = f52266c;
                            int i1216 = ((i1215 & (-68)) | ((~i1215) & 67)) + ((i1215 & 67) << 1);
                            f52267d = i1216 % 128;
                            int i1217 = i1216 % 2;
                            level = Level.INFO;
                            int i1218 = f52266c;
                            i13 = (i1218 & 77) + (i1218 | 77);
                            f52267d = i13 % 128;
                        } else {
                            level = Level.WARNING;
                            int i1219 = f52267d;
                            i13 = (i1219 ^ 97) + ((i1219 & 97) << 1);
                            f52266c = i13 % 128;
                        }
                        int i131 = i13 % 2;
                    }
                }
                logger.setLevel(level);
                logger.addHandler(abc.INSTANCE);
                int i132 = f52266c;
                int i133 = i132 & 93;
                int i134 = (((i132 | 93) & (~i133)) - (~(-(-(i133 << 1))))) - 1;
                f52267d = i134 % 128;
                int i135 = i134 % 2;
            }
            int i136 = f52267d;
            int i137 = (i136 & (-66)) | ((~i136) & 65);
            int i138 = (i136 & 65) << 1;
            int i139 = ((i137 | i138) << 1) - (i138 ^ i137);
            f52266c = i139 % 128;
            if (i139 % 2 != 0) {
                throw null;
            }
        }
        return null;
    }

    public static void setOnFocusChangeListener(@NotNull String p4, int p10, @NotNull String p11, @Nullable Throwable p12) {
        setCompoundDrawableTintBlendMode(new Object[]{p4, Integer.valueOf(p10), p11, p12}, -1227449111, 1227449114, p10);
    }

    public static void setX() {
        setCompoundDrawableTintBlendMode(new Object[0], -1751110146, 1751110146, (int) System.currentTimeMillis());
    }
}
