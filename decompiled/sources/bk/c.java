package bk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Arrays.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrays.kt\nkotlin/collections/ArraysKt__ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
public class c extends b {
    public static final void a(Object[] objArr, StringBuilder sb2, ArrayList arrayList) {
        if (arrayList.contains(objArr)) {
            sb2.append("[...]");
            return;
        }
        arrayList.add(objArr);
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i10];
            if (obj == null) {
                sb2.append(AbstractJsonLexerKt.NULL);
            } else if (obj instanceof Object[]) {
                a((Object[]) obj, sb2, arrayList);
            } else if (obj instanceof byte[]) {
                String string = Arrays.toString((byte[]) obj);
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sb2.append(string);
            } else if (obj instanceof short[]) {
                String string2 = Arrays.toString((short[]) obj);
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                sb2.append(string2);
            } else if (obj instanceof int[]) {
                String string3 = Arrays.toString((int[]) obj);
                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                sb2.append(string3);
            } else if (obj instanceof long[]) {
                String string4 = Arrays.toString((long[]) obj);
                Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                sb2.append(string4);
            } else if (obj instanceof float[]) {
                String string5 = Arrays.toString((float[]) obj);
                Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                sb2.append(string5);
            } else if (obj instanceof double[]) {
                String string6 = Arrays.toString((double[]) obj);
                Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                sb2.append(string6);
            } else if (obj instanceof char[]) {
                String string7 = Arrays.toString((char[]) obj);
                Intrinsics.checkNotNullExpressionValue(string7, "toString(...)");
                sb2.append(string7);
            } else if (obj instanceof boolean[]) {
                String string8 = Arrays.toString((boolean[]) obj);
                Intrinsics.checkNotNullExpressionValue(string8, "toString(...)");
                sb2.append(string8);
            } else if (obj instanceof UByteArray) {
                sb2.append(ck.a.m4664contentToString2csIQuQ(((UByteArray) obj).getF79396p0()));
            } else if (obj instanceof UShortArray) {
                sb2.append(ck.a.m4666contentToStringd6D3K8(((UShortArray) obj).getF79408p0()));
            } else if (obj instanceof UIntArray) {
                sb2.append(ck.a.m4665contentToStringXUkPCBk(((UIntArray) obj).getF79400p0()));
            } else if (obj instanceof ULongArray) {
                sb2.append(ck.a.m4667contentToStringuLth9ew(((ULongArray) obj).getF79404p0()));
            } else {
                sb2.append(obj.toString());
            }
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
        arrayList.remove(CollectionsKt__CollectionsKt.getLastIndex(arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @PublishedApi
    @JvmName(name = "contentDeepEquals")
    public static final <T> boolean contentDeepEquals(@Nullable T[] tArr, @Nullable T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == 0 || tArr2 == 0 || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Object[] objArr = tArr[i10];
            Object[] objArr2 = tArr2[i10];
            if (objArr != objArr2) {
                if (objArr == 0 || objArr2 == 0) {
                    return false;
                }
                if ((objArr instanceof Object[]) && (objArr2 instanceof Object[])) {
                    if (!contentDeepEquals(objArr, objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof byte[]) && (objArr2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) objArr, (byte[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof short[]) && (objArr2 instanceof short[])) {
                    if (!Arrays.equals((short[]) objArr, (short[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof int[]) && (objArr2 instanceof int[])) {
                    if (!Arrays.equals((int[]) objArr, (int[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof long[]) && (objArr2 instanceof long[])) {
                    if (!Arrays.equals((long[]) objArr, (long[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof float[]) && (objArr2 instanceof float[])) {
                    if (!Arrays.equals((float[]) objArr, (float[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof double[]) && (objArr2 instanceof double[])) {
                    if (!Arrays.equals((double[]) objArr, (double[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof char[]) && (objArr2 instanceof char[])) {
                    if (!Arrays.equals((char[]) objArr, (char[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof boolean[]) && (objArr2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) objArr, (boolean[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof UByteArray) && (objArr2 instanceof UByteArray)) {
                    if (!ck.a.m4658contentEqualskV0jMPg(((UByteArray) objArr).getF79396p0(), ((UByteArray) objArr2).getF79396p0())) {
                        return false;
                    }
                } else if ((objArr instanceof UShortArray) && (objArr2 instanceof UShortArray)) {
                    if (!ck.a.m4656contentEqualsFGO6Aew(((UShortArray) objArr).getF79408p0(), ((UShortArray) objArr2).getF79408p0())) {
                        return false;
                    }
                } else if ((objArr instanceof UIntArray) && (objArr2 instanceof UIntArray)) {
                    if (!ck.a.m4657contentEqualsKJPZfPQ(((UIntArray) objArr).getF79400p0(), ((UIntArray) objArr2).getF79400p0())) {
                        return false;
                    }
                } else if ((objArr instanceof ULongArray) && (objArr2 instanceof ULongArray)) {
                    if (!ck.a.m4659contentEqualslec5QzE(((ULongArray) objArr).getF79404p0(), ((ULongArray) objArr2).getF79404p0())) {
                        return false;
                    }
                } else if (!Intrinsics.areEqual(objArr, objArr2)) {
                    return false;
                }
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "contentDeepToString")
    @NotNull
    @PublishedApi
    public static final <T> String contentDeepToString(@Nullable T[] tArr) {
        if (tArr == null) {
            return AbstractJsonLexerKt.NULL;
        }
        StringBuilder sb2 = new StringBuilder((kotlin.ranges.c.coerceAtMost(tArr.length, 429496729) * 5) + 2);
        a(tArr, sb2, new ArrayList());
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public static final <T> List<T> flatten(@NotNull T[][] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = 0;
        for (T[] tArr2 : tArr) {
            length += tArr2.length;
        }
        ArrayList arrayList = new ArrayList(length);
        for (T[] tArr3 : tArr) {
            g.addAll(arrayList, tArr3);
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> Pair<List<T>, List<R>> unzip(@NotNull Pair<? extends T, ? extends R>[] pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "<this>");
        ArrayList arrayList = new ArrayList(pairArr.length);
        ArrayList arrayList2 = new ArrayList(pairArr.length);
        for (Pair<? extends T, ? extends R> pair : pairArr) {
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return TuplesKt.to(arrayList, arrayList2);
    }
}
