package androidx.compose.runtime.snapshots;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ListUtils.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000\u001a>\u0010\n\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\bH\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aD\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a8\u0010\u0010\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a8\u0010\u0011\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aP\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0014\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001ab\u0010\u001d\u001a\u00020\u001c\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0002H\u0000\u001aF\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aS\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012'\u0010\u000f\u001a#\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\bH\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¨\u0006#"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/Function1;", "", "action", "fastForEach", "", "fastToSet", "Lkotlin/Function2;", "", "fastForEachIndexed", "R", "transform", "fastMap", "", "predicate", "fastAny", "fastAll", "K", "keySelector", "", "fastGroupBy", "", "separator", "prefix", "postfix", "limit", "truncated", "", "fastJoinToString", "fastMapNotNull", "Lkotlin/ParameterName;", "name", FirebaseAnalytics.Param.INDEX, "fastFilterIndexed", "runtime_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n33#1,6:239\n33#1,6:245\n33#1,6:251\n33#1,6:257\n33#1,4:263\n38#1:274\n33#1,4:275\n38#1:280\n64#1,6:281\n361#2,7:267\n1#3:279\n*S KotlinDebug\n*F\n+ 1 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n50#1:239,6\n84#1:245,6\n94#1:251,6\n111#1:257,6\n122#1:263,4\n122#1:274\n213#1:275,4\n213#1:280\n233#1:281,6\n124#1:267,7\n*E\n"})
public final class ListUtilsKt {
    public static final <T> boolean fastAll(@NotNull List<? extends T> list, @NotNull Function1<? super T, Boolean> function1) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!function1.invoke(list.get(i10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean fastAny(@NotNull List<? extends T> list, @NotNull Function1<? super T, Boolean> function1) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (function1.invoke(list.get(i10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final <T> List<T> fastFilterIndexed(@NotNull List<? extends T> list, @NotNull Function2<? super Integer, ? super T, Boolean> function2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (function2.invoke(Integer.valueOf(i10), t10).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static final <T> void fastForEach(@NotNull List<? extends T> list, @NotNull Function1<? super T, Unit> function1) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            function1.invoke(list.get(i10));
        }
    }

    public static final <T> void fastForEachIndexed(@NotNull List<? extends T> list, @NotNull Function2<? super Integer, ? super T, Unit> function2) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            function2.invoke(Integer.valueOf(i10), list.get(i10));
        }
    }

    @NotNull
    public static final <T, K> Map<K, List<T>> fastGroupBy(@NotNull List<? extends T> list, @NotNull Function1<? super T, ? extends K> function1) {
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            K kInvoke = function1.invoke(t10);
            Object arrayList = map.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(kInvoke, arrayList);
            }
            ((ArrayList) arrayList).add(t10);
        }
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> String fastJoinToString(@NotNull List<? extends T> list, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i10, @NotNull CharSequence charSequence4, @Nullable Function1<? super T, ? extends CharSequence> function1) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence2);
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            T t10 = list.get(i12);
            i11++;
            if (i11 > 1) {
                sb2.append(charSequence);
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
            sb2.append(charSequence4);
        }
        sb2.append(charSequence3);
        return sb2.toString();
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
    public static final <T, R> List<R> fastMap(@NotNull List<? extends T> list, @NotNull Function1<? super T, ? extends R> function1) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(function1.invoke(list.get(i10)));
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> fastMapNotNull(@NotNull List<? extends T> list, @NotNull Function1<? super T, ? extends R> function1) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            R rInvoke = function1.invoke(list.get(i10));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> Set<T> fastToSet(@NotNull List<? extends T> list) {
        HashSet hashSet = new HashSet(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            hashSet.add(list.get(i10));
        }
        return hashSet;
    }
}
