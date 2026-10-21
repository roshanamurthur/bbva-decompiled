package com.mypinpad.tsdk.isolation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nJson.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Json.kt\ncom/mypinpad/tsdk/internal/common/json/Json\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,106:1\n11335#2:107\n11670#2,3:108\n11335#2:111\n11670#2,3:112\n11335#2:115\n11670#2,3:116\n32#3,2:119\n*S KotlinDebug\n*F\n+ 1 Json.kt\ncom/mypinpad/tsdk/internal/common/json/Json\n*L\n39#1:107\n39#1:108,3\n43#1:111\n43#1:112,3\n47#1:115\n47#1:116,3\n89#1:119,2\n*E\n"})
public final class mo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f57124b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f57125c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JSONObject f57126a;

    public mo() {
        this.f57126a = new JSONObject();
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws JSONException {
        int i13 = ~i10;
        int i14 = 0;
        switch ((((~(i10 | (~i11))) | (~(i11 | i13 | i12))) * 235) + (((~(i13 | i12)) | i11) * (-470)) + (((~((~i12) | i13)) | i11) * (-235)) + (i11 * 471) + (i10 * 236)) {
            case 1:
                mo moVar = (mo) objArr[0];
                String str = (String) objArr[1];
                Object[] objArr2 = (Object[]) objArr[2];
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(objArr2, "");
                JSONObject jSONObject = moVar.f57126a;
                ArrayList arrayList = new ArrayList(objArr2.length);
                int length = objArr2.length;
                int i15 = f57124b + 69;
                while (true) {
                    f57125c = i15 % 128;
                    int i16 = i15 % 2;
                    if (i14 >= length) {
                        jSONObject.put(str, new JSONArray((Collection) arrayList));
                        int i17 = f57125c;
                        int i18 = i17 & 25;
                        int i19 = (((i17 ^ 25) | i18) << 1) - ((i17 | 25) & (~i18));
                        f57124b = i19 % 128;
                        int i20 = i19 % 2;
                        return null;
                    }
                    int i21 = f57124b;
                    int i22 = i21 & 17;
                    int i23 = (i22 - (~((i21 ^ 17) | i22))) - 1;
                    f57125c = i23 % 128;
                    int i24 = i23 % 2;
                    arrayList.add(objArr2[i14].toString());
                    int i25 = ((i14 & 4) + (i14 | 4)) - 1;
                    int i26 = i25 & (-2);
                    i14 = i26 + ((i25 ^ (-2)) | i26);
                    i15 = f57124b + 77;
                }
                break;
            case 2:
                mo moVar2 = (mo) objArr[0];
                String str2 = (String) objArr[1];
                mo moVar3 = (mo) objArr[2];
                int i27 = f57124b;
                int i28 = i27 & 103;
                int i29 = i28 + ((i27 ^ 103) | i28);
                f57125c = i29 % 128;
                int i30 = i29 % 2;
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(moVar3, "");
                moVar2.f57126a.put(str2, moVar3.f57126a);
                int i31 = f57125c;
                int i32 = i31 & 103;
                int i33 = i32 + ((i31 ^ 103) | i32);
                f57124b = i33 % 128;
                int i34 = i33 % 2;
                return null;
            case 3:
                mo moVar4 = (mo) objArr[0];
                int i35 = f57124b + 1;
                f57125c = i35 % 128;
                if (i35 % 2 != 0) {
                    return moVar4.f57126a;
                }
                JSONObject jSONObject2 = moVar4.f57126a;
                throw null;
            case 4:
                mo moVar5 = (mo) objArr[0];
                String str3 = (String) objArr[1];
                byte[] bArr = (byte[]) objArr[2];
                System.identityHashCode(moVar5);
                System.identityHashCode(moVar5);
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(bArr, "");
                JSONObject jSONObject3 = moVar5.f57126a;
                abw.Companion companion = abw.INSTANCE;
                jSONObject3.put(str3, ((abw) abw.Companion.setOnFocusChangeListener(new Object[]{Arrays.copyOf(bArr, bArr.length)}, -1322912439, 1322912441, (int) System.currentTimeMillis())).setX());
                int i36 = f57124b;
                int i37 = (i36 & 105) + (i36 | 105);
                f57125c = i37 % 128;
                if (i37 % 2 != 0) {
                    return null;
                }
                throw null;
            case 5:
                mo moVar6 = (mo) objArr[0];
                String str4 = (String) objArr[1];
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                int i38 = f57124b;
                int i39 = i38 & 29;
                int i40 = (i38 | 29) & (~i39);
                int i41 = i39 << 1;
                int i42 = ((i40 | i41) << 1) - (i40 ^ i41);
                f57125c = i42 % 128;
                if (i42 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(str4, "");
                    moVar6.f57126a.put(str4, zBooleanValue);
                    throw null;
                }
                Intrinsics.checkNotNullParameter(str4, "");
                moVar6.f57126a.put(str4, zBooleanValue);
                int i43 = (-2) - ((f57125c + 106) ^ (-1));
                f57124b = i43 % 128;
                int i44 = i43 % 2;
                return null;
            case 6:
                mo moVar7 = (mo) objArr[0];
                String str5 = (String) objArr[1];
                mn mnVar = (mn) objArr[2];
                int i45 = f57124b;
                int i46 = i45 & 93;
                int i47 = (((i45 ^ 93) | i46) << 1) - ((i45 | 93) & (~i46));
                f57125c = i47 % 128;
                int i48 = i47 % 2;
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(mnVar, "");
                moVar7.f57126a.put(str5, (JSONArray) mn.setCompoundDrawableTintBlendMode(new Object[]{mnVar}, -406704089, 406704090, System.identityHashCode(mnVar)));
                int i49 = f57125c;
                int i50 = i49 & 1;
                int i51 = (i50 - (~((i49 ^ 1) | i50))) - 1;
                f57124b = i51 % 128;
                if (i51 % 2 == 0) {
                    return null;
                }
                int i52 = 28 / 0;
                return null;
            case 7:
                mo moVar8 = (mo) objArr[0];
                int i53 = f57124b;
                int i54 = i53 ^ 95;
                int i55 = -(-((i53 & 95) << 1));
                int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
                f57125c = i56 % 128;
                int i57 = i56 % 2;
                String string = moVar8.f57126a.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                if (i57 == 0) {
                    int i58 = 9 / 0;
                }
                return string;
            case 8:
                mo moVar9 = (mo) objArr[0];
                String str6 = (String) objArr[1];
                long jLongValue = ((Number) objArr[2]).longValue();
                int i59 = f57125c + 118;
                int i60 = (i59 ^ (-1)) + (i59 << 1);
                f57124b = i60 % 128;
                int i61 = i60 % 2;
                Intrinsics.checkNotNullParameter(str6, "");
                moVar9.f57126a.put(str6, BigDecimal.valueOf(jLongValue));
                int i62 = f57124b;
                int i63 = i62 & 13;
                int i64 = -(-((i62 ^ 13) | i63));
                int i65 = (i63 ^ i64) + ((i64 & i63) << 1);
                f57125c = i65 % 128;
                if (i65 % 2 != 0) {
                    return null;
                }
                int i66 = 89 / 0;
                return null;
            case 9:
                mo moVar10 = (mo) objArr[0];
                String str7 = (String) objArr[1];
                byte[][] bArr2 = (byte[][]) objArr[2];
                Intrinsics.checkNotNullParameter(str7, "");
                Intrinsics.checkNotNullParameter(bArr2, "");
                JSONObject jSONObject4 = moVar10.f57126a;
                ArrayList arrayList2 = new ArrayList(bArr2.length);
                int length2 = bArr2.length;
                int i67 = f57124b;
                int i68 = i67 & 39;
                int i69 = -(-(i67 | 39));
                int i70 = (i68 ^ i69) + ((i69 & i68) << 1);
                f57125c = i70 % 128;
                int i71 = i70 % 2;
                int i72 = 0;
                while (i72 < length2) {
                    int i73 = (-2) - ((f57125c + 20) ^ (-1));
                    f57124b = i73 % 128;
                    int i74 = i73 % 2;
                    byte[] bArr3 = bArr2[i72];
                    abw.Companion companion2 = abw.INSTANCE;
                    arrayList2.add(((abw) abw.Companion.setOnFocusChangeListener(new Object[]{Arrays.copyOf(bArr3, bArr3.length)}, -1322912439, 1322912441, (int) System.currentTimeMillis())).setX());
                    int i75 = i72 & (-72);
                    int i76 = i75 + ((i72 ^ (-72)) | i75);
                    int i77 = i76 & 73;
                    int i78 = (i76 | 73) & (~i77);
                    int i79 = -(-(i77 << 1));
                    i72 = (i79 | i78) + (i78 & i79);
                    int i80 = f57125c;
                    int i81 = i80 & 65;
                    int i82 = i81 + ((i80 ^ 65) | i81);
                    f57124b = i82 % 128;
                    int i83 = i82 % 2;
                }
                jSONObject4.put(str7, new JSONArray((Collection) arrayList2));
                int i84 = f57124b;
                int i85 = i84 & 97;
                int i86 = (((i84 | 97) & (~i85)) - (~(i85 << 1))) - 1;
                f57125c = i86 % 128;
                if (i86 % 2 != 0) {
                    return null;
                }
                throw null;
            case 10:
                mo moVar11 = (mo) objArr[0];
                String str8 = (String) objArr[1];
                String str9 = (String) objArr[2];
                int i87 = f57124b;
                int i88 = (((i87 | 26) << 1) - (i87 ^ 26)) - 1;
                f57125c = i88 % 128;
                if (i88 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(str8, "");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(str8, "");
                if (str9 != null) {
                    moVar11.f57126a.put(str8, str9);
                    int i89 = f57125c;
                    int i90 = i89 & 31;
                    int i91 = ((i89 ^ 31) | i90) << 1;
                    int i92 = -((i89 | 31) & (~i90));
                    int i93 = ((i91 | i92) << 1) - (i92 ^ i91);
                    f57124b = i93 % 128;
                    int i94 = i93 % 2;
                }
                int i95 = f57125c;
                int i96 = i95 & 113;
                int i97 = -(-((i95 ^ 113) | i96));
                int i98 = (i96 ^ i97) + ((i97 & i96) << 1);
                f57124b = i98 % 128;
                int i99 = i98 % 2;
                return null;
            default:
                mo moVar12 = (mo) objArr[0];
                String str10 = (String) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i100 = f57125c;
                int i101 = ((i100 ^ 80) + ((i100 & 80) << 1)) - 1;
                f57124b = i101 % 128;
                if (i101 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(str10, "");
                    moVar12.f57126a.put(str10, iIntValue);
                    throw null;
                }
                Intrinsics.checkNotNullParameter(str10, "");
                moVar12.f57126a.put(str10, iIntValue);
                int i102 = f57125c;
                int i103 = i102 & 57;
                int i104 = ((((i102 ^ 57) | i103) << 1) - (~(-((i102 | 57) & (~i103))))) - 1;
                f57124b = i104 % 128;
                int i105 = i104 % 2;
                return null;
        }
    }

    public final void setCompoundDrawableTintBlendMode(@NotNull String str, long j10) throws JSONException {
        setY(new Object[]{this, str, Long.valueOf(j10)}, -66017702, 66017710, System.identityHashCode(this));
    }

    public final void setDividerPadding(@NotNull String str, int i10) throws JSONException {
        setY(new Object[]{this, str, Integer.valueOf(i10)}, -1847276528, 1847276528, i10);
    }

    public final <T> void setOnFocusChangeListener(@NotNull String str, @NotNull mn<T> mnVar) throws JSONException {
        setY(new Object[]{this, str, mnVar}, 733397612, -733397606, System.identityHashCode(this));
    }

    public final void setX(@NotNull String str, @NotNull byte[] bArr) throws JSONException {
        setY(new Object[]{this, str, bArr}, -948176262, 948176266, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setY(new Object[]{this}, 740644380, -740644373, System.identityHashCode(this));
    }

    public final void setCompoundDrawableTintBlendMode(@NotNull String str, @NotNull Object[] objArr) throws JSONException {
        setY(new Object[]{this, str, objArr}, 1538034737, -1538034736, System.identityHashCode(this));
    }

    public final void setDividerPadding(@NotNull String str, @NotNull byte[][] bArr) throws JSONException {
        setY(new Object[]{this, str, bArr}, -1089892218, 1089892227, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(@NotNull String str, @NotNull mo moVar) throws JSONException {
        setY(new Object[]{this, str, moVar}, 509994867, -509994865, System.identityHashCode(this));
    }

    public final void setX(@NotNull String str, @Nullable String str2) throws JSONException {
        setY(new Object[]{this, str, str2}, -52655784, 52655794, System.identityHashCode(this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mo(@NotNull Function1<? super mo, Unit> function1) {
        this();
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(this);
    }

    @NotNull
    public final JSONObject setDividerPadding() {
        return (JSONObject) setY(new Object[]{this}, -378484831, 378484834, System.identityHashCode(this));
    }

    public final void setY(@NotNull String str, boolean z10) throws JSONException {
        setY(new Object[]{this, str, Boolean.valueOf(z10)}, -1923904944, 1923904949, System.identityHashCode(this));
    }
}
