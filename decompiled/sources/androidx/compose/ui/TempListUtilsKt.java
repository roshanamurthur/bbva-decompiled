package androidx.compose.ui;

import a.e;
import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
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
@Metadata(d1 = {"\u0000@\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aM\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aa\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0006\"\b\b\u0001\u0010\u0000*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00022'\u0010\n\u001a#\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a_\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0011\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00100\u000fH\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a\u007f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u000226\u0010\u0004\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00028\u00020\u0003H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u001aI\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000fH\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001ab\u0010 \u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00182\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000fH\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006!"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "", "Lkotlin/Function2;", "transform", "fastZipWithNext", ExifInterface.LATITUDE_SOUTH, "Lkotlin/ParameterName;", "name", "acc", "operation", "fastReduce", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/Function1;", "Lkotlin/Pair;", "", "fastAssociate", "other", "a", "b", "fastZip", "fastMapNotNull", "", "separator", "prefix", "postfix", "", "limit", "truncated", "", "fastJoinToString", "ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTempListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TempListUtils.kt\nandroidx/compose/ui/TempListUtilsKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,213:1\n33#2,6:214\n33#2,4:220\n38#2:225\n1#3:224\n*S KotlinDebug\n*F\n+ 1 TempListUtils.kt\nandroidx/compose/ui/TempListUtilsKt\n*L\n94#1:214,6\n137#1:220,4\n137#1:225\n*E\n"})
public final class TempListUtilsKt {
    @NotNull
    public static final <T, K, V> Map<K, V> fastAssociate(@NotNull List<? extends T> list, @NotNull Function1<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(list.get(i10));
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
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

    @NotNull
    public static final <T, R> List<R> fastMapNotNull(@NotNull List<? extends T> list, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            R rInvoke = transform.invoke(list.get(i10));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    public static final <S, T extends S> S fastReduce(@NotNull List<? extends T> list, @NotNull Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (list.isEmpty()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        S sInvoke = (Object) CollectionsKt___CollectionsKt.first((List) list);
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                sInvoke = operation.invoke(sInvoke, list.get(i10));
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return sInvoke;
    }

    @NotNull
    public static final <T, R, V> List<V> fastZip(@NotNull List<? extends T> list, @NotNull List<? extends R> other, @NotNull Function2<? super T, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(list.size(), other.size());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(list.get(i10), other.get(i10)));
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> fastZipWithNext(@NotNull List<? extends T> list, @NotNull Function2<? super T, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (list.size() == 0 || list.size() == 1) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        e eVar = list.get(0);
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list);
        while (i10 < lastIndex) {
            i10++;
            T t10 = list.get(i10);
            arrayList.add(transform.invoke(eVar, t10));
            eVar = t10;
        }
        return arrayList;
    }
}
