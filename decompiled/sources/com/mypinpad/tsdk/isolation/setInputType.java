package com.mypinpad.tsdk.isolation;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class setInputType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f59919a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f59920b = 1;

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function2<JSONArray, Integer, String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f59921p0 = new a();

        static {
            int i10 = 1 & 117;
            int i11 = (((~i10) & (1 | 117)) - (~(-(-(i10 << 1))))) - 1;
            int i12 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        }

        public a() {
            super(2, JSONArray.class, "getString", "getString(I)Ljava/lang/String;", 0);
        }

        public static /* synthetic */ String a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ((~i11) * (-783)) + (i11 * (-782)) + (i10 * 784);
            int i14 = ~i10;
            int i15 = ~i12;
            if (((i14 | (~(i11 | i15))) * 783) + ((~(i14 | i15 | i11)) * (-783)) + i13 == 1) {
                a aVar = (a) objArr[0];
                Object obj = objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                return a(new Object[]{aVar, (JSONArray) obj, Integer.valueOf(iIntValue)}, -2116727852, 2116727852, iIntValue);
            }
            JSONArray jSONArray = (JSONArray) objArr[1];
            int iIntValue2 = ((Number) objArr[2]).intValue();
            Intrinsics.checkNotNullParameter(jSONArray, "");
            return jSONArray.getString(iIntValue2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ String invoke(JSONArray jSONArray, Integer num) {
            return a(new Object[]{this, jSONArray, num}, 834438923, -834438922, System.identityHashCode(this));
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function2<JSONArray, Integer, JSONObject> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f59922p0 = new b();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f59923q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f59924r0 = 1;

        static {
            int i10 = f59923q0 + 29;
            f59924r0 = i10 % 128;
            int i11 = i10 % 2;
        }

        public b() {
            super(2, JSONArray.class, "getJSONObject", "getJSONObject(I)Lorg/json/JSONObject;", 0);
        }

        public static /* synthetic */ JSONObject a(Object[] objArr, int i10, int i11, int i12) throws JSONException {
            JSONObject jSONObject;
            int i13 = ~i10;
            int i14 = ((~(i13 | i11)) * (-1182)) + (i11 * (-590)) + (i10 * 592);
            int i15 = ~i11;
            if (((i12 | i13 | i15) * 591) + (((~(i10 | i11)) | (~(i13 | i15 | (~i12)))) * (-591)) + i14 != 1) {
                b bVar = (b) objArr[0];
                Object obj = objArr[1];
                Object obj2 = objArr[2];
                int i16 = f59924r0;
                int i17 = ((i16 ^ 4) + ((i16 & 4) << 1)) - 1;
                f59923q0 = i17 % 128;
                int i18 = i17 % 2;
                JSONArray jSONArray = (JSONArray) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (i18 != 0) {
                    a(new Object[]{bVar, jSONArray, Integer.valueOf(iIntValue)}, 298115814, -298115813, iIntValue);
                    throw null;
                }
                jSONObject = a(new Object[]{bVar, jSONArray, Integer.valueOf(iIntValue)}, 298115814, -298115813, iIntValue);
                int i19 = (-2) - ((f59923q0 + 12) ^ (-1));
                f59924r0 = i19 % 128;
                if (i19 % 2 == 0) {
                    throw null;
                }
            } else {
                JSONArray jSONArray2 = (JSONArray) objArr[1];
                int iIntValue2 = ((Number) objArr[2]).intValue();
                int i20 = f59924r0;
                int i21 = i20 & 15;
                int i22 = ((i20 ^ 15) | i21) << 1;
                int i23 = -((i20 | 15) & (~i21));
                int i24 = (i22 & i23) + (i23 | i22);
                f59923q0 = i24 % 128;
                if (i24 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(jSONArray2, "");
                    jSONArray2.getJSONObject(iIntValue2);
                    throw null;
                }
                Intrinsics.checkNotNullParameter(jSONArray2, "");
                jSONObject = jSONArray2.getJSONObject(iIntValue2);
                int i25 = f59923q0 + 11;
                f59924r0 = i25 % 128;
                if (i25 % 2 == 0) {
                    throw null;
                }
            }
            return jSONObject;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ JSONObject invoke(JSONArray jSONArray, Integer num) {
            return a(new Object[]{this, jSONArray, num}, 429147665, -429147665, System.identityHashCode(this));
        }
    }

    public static final byte setCompoundDrawableTintBlendMode(@NotNull JSONObject jSONObject, @NotNull String str) {
        return ((Byte) setOnFocusChangeListener(new Object[]{jSONObject, str}, -1869921623, 1869921625, (int) System.currentTimeMillis())).byteValue();
    }

    public static /* synthetic */ Long setDividerPadding(JSONObject jSONObject, String str, Long l6, int i10, Object obj) {
        return (Long) setOnFocusChangeListener(new Object[]{jSONObject, str, l6, Integer.valueOf(i10), obj}, -1248205180, 1248205181, i10);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0570  */
    /* JADX WARN: Code duplicated, block: B:110:0x0577  */
    /* JADX WARN: Code duplicated, block: B:113:0x059a  */
    /* JADX WARN: Code duplicated, block: B:114:0x059b  */
    /* JADX WARN: Code duplicated, block: B:116:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:117:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:119:0x05da  */
    /* JADX WARN: Code duplicated, block: B:120:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:123:0x05f1  */
    /* JADX WARN: Code restructure failed: missing block: B:167:?, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x030d, code lost:
    
        if (r12.isNull(r13) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x031f, code lost:
    
        if ((!r12.isNull(r13)) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0321, code lost:
    
        r12 = r12.getJSONArray(r13);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, "");
        r12 = (java.lang.Iterable) com.mypinpad.tsdk.isolation.setCropToPadding.setY(new java.lang.Object[]{r12, com.mypinpad.tsdk.i.setInputType.b.f59922p0}, 1156772267, -1156772267, (int) java.lang.System.currentTimeMillis());
        r13 = new java.util.ArrayList(kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r12, 10));
        r12 = r12.iterator();
        r14 = com.mypinpad.tsdk.isolation.setInputType.f59919a + 123;
        com.mypinpad.tsdk.isolation.setInputType.f59920b = r14 % 128;
        r14 = r14 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x035d, code lost:
    
        if (r12.hasNext() == true) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x035f, code lost:
    
        r11 = com.mypinpad.tsdk.isolation.setInputType.f59920b;
        r12 = (((r11 | 116) << 1) - (r11 ^ 116)) - 1;
        com.mypinpad.tsdk.isolation.setInputType.f59919a = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0370, code lost:
    
        r14 = com.mypinpad.tsdk.isolation.setInputType.f59919a;
        r0 = r14 ^ 121;
        r14 = (r14 & 121) << 1;
        r1 = ((r0 | r14) << 1) - (r14 ^ r0);
        com.mypinpad.tsdk.isolation.setInputType.f59920b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0381, code lost:
    
        if ((r1 % 2) == 0) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0383, code lost:
    
        r13.add(r11.invoke(r12.next()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x038f, code lost:
    
        r13.add(r11.invoke(r12.next()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x039a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x039b, code lost:
    
        r11 = com.mypinpad.tsdk.isolation.setInputType.f59919a;
        r12 = ((r11 | 47) << 1) - (r11 ^ 47);
        com.mypinpad.tsdk.isolation.setInputType.f59920b = r12 % 128;
        r12 = r12 % 2;
        r11 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList();
        r12 = com.mypinpad.tsdk.isolation.setInputType.f59920b;
        r13 = (r12 & 95) + (r12 | 95);
        com.mypinpad.tsdk.isolation.setInputType.f59919a = r13 % 128;
        r13 = r13 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setOnFocusChangeListener(java.lang.Object[] r11, int r12, int r13, int r14) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setInputType.setOnFocusChangeListener(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static final byte setY(@NotNull JSONObject jSONObject, @NotNull String str) {
        return ((Byte) setOnFocusChangeListener(new Object[]{jSONObject, str}, -1498094168, 1498094179, (int) System.currentTimeMillis())).byteValue();
    }

    public static /* synthetic */ Boolean setCompoundDrawableTintBlendMode(JSONObject jSONObject, String str, Boolean bool, int i10, Object obj) {
        return (Boolean) setOnFocusChangeListener(new Object[]{jSONObject, str, bool, Integer.valueOf(i10), obj}, 858714105, -858714096, i10);
    }

    public static final <T> T setDividerPadding(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull Function1<? super JSONObject, ? extends T> function1) {
        return (T) setOnFocusChangeListener(new Object[]{jSONObject, str, function1}, 576429298, -576429286, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ String setCompoundDrawableTintBlendMode(JSONObject jSONObject, String str, String str2, int i10, Object obj) {
        return (String) setOnFocusChangeListener(new Object[]{jSONObject, str, str2, Integer.valueOf(i10), obj}, 37258273, -37258266, i10);
    }

    public static /* synthetic */ JSONObject setOnFocusChangeListener(JSONObject jSONObject, String str, JSONObject jSONObject2, int i10, Object obj) {
        return (JSONObject) setOnFocusChangeListener(new Object[]{jSONObject, str, jSONObject2, Integer.valueOf(i10), obj}, -1737187156, 1737187166, i10);
    }

    @Nullable
    public static final Boolean setOnFocusChangeListener(@NotNull JSONObject jSONObject, @NotNull String str, @Nullable Boolean bool) {
        return (Boolean) setOnFocusChangeListener(new Object[]{jSONObject, str, bool}, -740291256, 740291261, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final <T> List<T> setOnFocusChangeListener(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull Function1<? super JSONObject, ? extends T> function1) {
        return (List) setOnFocusChangeListener(new Object[]{jSONObject, str, function1}, 195668602, -195668594, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final List<String> setOnFocusChangeListener(@NotNull JSONObject jSONObject, @NotNull String str) {
        return (List) setOnFocusChangeListener(new Object[]{jSONObject, str}, -5198295, 5198295, (int) System.currentTimeMillis());
    }
}
