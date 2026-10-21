package androidx.compose.ui.text;

import androidx.camera.core.impl.utils.b;
import androidx.exifinterface.media.ExifInterface;
import bk.d;
import bk.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TempListUtils.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aA\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aG\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aT\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00010\t*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u000b\u0010\f\u001ae\u0010\u0013\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\r\u001a\u00028\u00012'\u0010\u0012\u001a#\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001aM\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00150\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aA\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u0019*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001H\u0000\u001aA\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a&\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00020\u001cH\u0000\u001ab\u0010&\u001a\u00020%\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020\u001f2\b\b\u0002\u0010#\u001a\u00020\u001c2\b\b\u0002\u0010$\u001a\u00020\u001f2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0002H\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/Function1;", "", "predicate", "fastFilter", "K", "selector", "fastDistinctBy", "", "R", "fastMinByOrNull", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "initial", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "acc", "operation", "fastFold", "(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "", "transform", "fastFlatMap", "fastFilterNot", "", "fastFilterNotNull", "fastTakeWhile", "", "n", "fastDrop", "", "separator", "prefix", "postfix", "limit", "truncated", "", "fastJoinToString", "ui-text_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTempListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,289:1\n33#2,6:290\n33#2,6:296\n33#2,6:302\n33#2,6:308\n33#2,6:314\n33#2,6:320\n1#3:326\n*S KotlinDebug\n*F\n+ 1 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n*L\n37#1:290,6\n59#1:296,6\n110#1:302,6\n129#1:308,6\n148#1:314,6\n164#1:320,6\n*E\n"})
public final class TempListUtilsKt {
    @NotNull
    public static final <T, K> List<T> fastDistinctBy(@NotNull List<? extends T> list, @NotNull Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (hashSet.add(selector.invoke(t10))) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> List<T> fastDrop(@NotNull List<? extends T> list, int i10) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(b.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return list;
        }
        int size = list.size() - i10;
        if (size <= 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (size == 1) {
            return d.listOf(CollectionsKt___CollectionsKt.last((List) list));
        }
        ArrayList arrayList = new ArrayList(size);
        int size2 = list.size();
        while (i10 < size2) {
            arrayList.add(list.get(i10));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> fastFilter(@NotNull List<? extends T> list, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> fastFilterNot(@NotNull List<? extends T> list, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (!predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> fastFilterNotNull(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (t10 != null) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> fastFlatMap(@NotNull List<? extends T> list, @NotNull Function1<? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            g.addAll(arrayList, transform.invoke(list.get(i10)));
        }
        return arrayList;
    }

    public static final <T, R> R fastFold(@NotNull List<? extends T> list, R r3, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            r3 = operation.invoke(r3, list.get(i10));
        }
        return r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> String fastJoinToString(@NotNull List<? extends T> list, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super T, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            T t10 = list.get(i12);
            i11++;
            if (i11 > 1) {
                sb2.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (function1 != null) {
                sb2.append(function1.invoke(t10));
            } else if (t10 == 0 || (t10 instanceof CharSequence)) {
                sb2.append((CharSequence) t10);
            } else if (t10 instanceof Character) {
                sb2.append(((Character) t10).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(t10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            sb2.append(truncated);
        }
        sb2.append(postfix);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return string;
    }

    public static /* synthetic */ String fastJoinToString$default(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        return fastJoinToString(list, charSequence, charSequence5, charSequence6, i12, charSequence7, function1);
    }

    @Nullable
    public static final <T, R extends Comparable<? super R>> T fastMinByOrNull(@NotNull List<? extends T> list, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (list.isEmpty()) {
            return null;
        }
        T t10 = list.get(0);
        R rInvoke = selector.invoke(t10);
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                T t11 = list.get(i10);
                R rInvoke2 = selector.invoke(t11);
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    t10 = t11;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return (T) t10;
    }

    @NotNull
    public static final <T> List<T> fastTakeWhile(@NotNull List<? extends T> list, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (!predicate.invoke(t10).booleanValue()) {
                break;
            }
            arrayList.add(t10);
        }
        return arrayList;
    }
}
