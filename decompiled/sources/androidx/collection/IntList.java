package androidx.collection;

import androidx.appcompat.widget.o1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IntList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J:\u0010\u0004\u001a\u00020\u00022!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00020\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010\u000b\u001a\u00020\u00022!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00020\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0086\u0002J\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0000J\u0006\u0010\u000f\u001a\u00020\u0006J:\u0010\u000f\u001a\u00020\u00062!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00020\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010\u0010\u001a\u00020\u0006J:\u0010\u0010\u001a\u00020\u00062!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00020\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001Jd\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0012\u001a\u00028\u000026\u0010\u0015\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00000\u0013H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u0016\u0010\u0017Jy\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0012\u001a\u00028\u00002K\u0010\u0015\u001aG\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00000\u0018H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u001a\u0010\u001bJd\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0012\u001a\u00028\u000026\u0010\u0015\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00028\u00000\u0013H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u001c\u0010\u0017Jy\u0010\u001d\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0012\u001a\u00028\u00002K\u0010\u0015\u001aG\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00028\u00000\u0018H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ:\u0010 \u001a\u00020\u001e2!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u001e0\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001JO\u0010!\u001a\u00020\u001e26\u0010\u001f\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u001e0\u0013H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010\"\u001a\u00020\u001e2!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u001e0\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001JO\u0010#\u001a\u00020\u001e26\u0010\u001f\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u001e0\u0013H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0013\u0010$\u001a\u00020\u00062\b\b\u0001\u0010\u0019\u001a\u00020\u0006H\u0086\u0002J\u0010\u0010%\u001a\u00020\u00062\b\b\u0001\u0010\u0019\u001a\u00020\u0006J9\u0010'\u001a\u00020\u00062\b\b\u0001\u0010\u0019\u001a\u00020\u00062!\u0010&\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\bø\u0001\u0000J\u000e\u0010(\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006J:\u0010)\u001a\u00020\u00062!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00020\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010*\u001a\u00020\u00062!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00020\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010+\u001a\u00020\u0002J\u0006\u0010,\u001a\u00020\u0002J\u0006\u0010-\u001a\u00020\u0006J:\u0010-\u001a\u00020\u00062!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00020\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u000e\u0010.\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006J:\u00106\u001a\u0002052\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00101\u001a\u00020/2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0002\u00103\u001a\u00020\u00062\b\b\u0002\u00104\u001a\u00020/H\u0007JT\u00106\u001a\u0002052\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00101\u001a\u00020/2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0002\u00103\u001a\u00020\u00062\b\b\u0002\u00104\u001a\u00020/2\u0014\b\u0004\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020/0\u0005H\u0087\bø\u0001\u0000J\b\u00108\u001a\u00020\u0006H\u0016J\u0013\u0010:\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010;\u001a\u000205H\u0016R\u001c\u0010=\u001a\u00020<8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b=\u0010>\u0012\u0004\b?\u0010@R\u001c\u0010A\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bA\u0010B\u0012\u0004\bC\u0010@R\u0011\u0010F\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0012\u0010H\u001a\u00020\u00068Ç\u0002¢\u0006\u0006\u001a\u0004\bG\u0010ER\u0012\u0010L\u001a\u00020I8Æ\u0002¢\u0006\u0006\u001a\u0004\bJ\u0010K\u0082\u0001\u0001M\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006N"}, d2 = {"Landroidx/collection/IntList;", "", "", "none", "any", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "element", "predicate", "reversedAny", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "elements", "containsAll", "count", "first", "R", "initial", "Lkotlin/Function2;", "acc", "operation", "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function3;", FirebaseAnalytics.Param.INDEX, "foldIndexed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "", "block", "forEach", "forEachIndexed", "forEachReversed", "forEachReversedIndexed", "get", "elementAt", "defaultValue", "elementAtOrElse", "indexOf", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "last", "lastIndexOf", "", "separator", "prefix", "postfix", "limit", "truncated", "", "joinToString", "transform", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "toString", "", "content", "[I", "getContent$annotations", "()V", "_size", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "get_size$annotations", "getSize", "()I", "size", "getLastIndex", "lastIndex", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "indices", "Landroidx/collection/MutableIntList;", "collection"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,969:1\n253#1,6:970\n279#1,6:976\n253#1,6:982\n75#1:988\n253#1,6:989\n253#1,6:995\n253#1,6:1001\n266#1,6:1007\n279#1,6:1013\n293#1,6:1019\n70#1:1025\n70#1:1026\n266#1,6:1027\n266#1,6:1033\n293#1,6:1039\n70#1:1045\n279#1,6:1046\n293#1,6:1052\n266#1,6:1058\n266#1,6:1064\n253#1,6:1070\n75#1:1076\n467#1,10:1077\n266#1,4:1087\n477#1,9:1091\n271#1:1100\n486#1,2:1101\n467#1,10:1103\n266#1,4:1113\n477#1,9:1117\n271#1:1126\n486#1,2:1127\n467#1,10:1129\n266#1,4:1139\n477#1,9:1143\n271#1:1152\n486#1,2:1153\n467#1,10:1155\n266#1,4:1165\n477#1,9:1169\n271#1:1178\n486#1,2:1179\n467#1,10:1181\n266#1,4:1191\n477#1,9:1195\n271#1:1204\n486#1,2:1205\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/IntList\n*L\n96#1:970,6\n110#1:976,6\n122#1:982,6\n135#1:988\n153#1:989,6\n175#1:995,6\n192#1:1001,6\n208#1:1007,6\n225#1:1013,6\n241#1:1019,6\n306#1:1025\n317#1:1026\n343#1:1027,6\n357#1:1033,6\n371#1:1039,6\n397#1:1045\n407#1:1046,6\n420#1:1052,6\n445#1:1058,6\n476#1:1064,6\n494#1:1070,6\n510#1:1076\n-1#1:1077,10\n-1#1:1087,4\n-1#1:1091,9\n-1#1:1100\n-1#1:1101,2\n-1#1:1103,10\n-1#1:1113,4\n-1#1:1117,9\n-1#1:1126\n-1#1:1127,2\n-1#1:1129,10\n-1#1:1139,4\n-1#1:1143,9\n-1#1:1152\n-1#1:1153,2\n-1#1:1155,10\n-1#1:1165,4\n-1#1:1169,9\n-1#1:1178\n-1#1:1179,2\n-1#1:1181,10\n-1#1:1191,4\n-1#1:1195,9\n-1#1:1204\n-1#1:1205,2\n*E\n"})
public abstract class IntList {

    @JvmField
    public int _size;

    @JvmField
    @NotNull
    public int[] content;

    public IntList(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this.content = i10 == 0 ? IntSetKt.getEmptyIntArray() : new int[i10];
    }

    public static /* synthetic */ String joinToString$default(IntList intList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
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
        return intList.joinToString(charSequence, charSequence5, charSequence6, i12, charSequence4);
    }

    public final boolean any() {
        return isNotEmpty();
    }

    public final boolean contains(int element) {
        int[] iArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] == element) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(@NotNull IntList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        IntRange intRangeUntil = kotlin.ranges.c.until(0, elements._size);
        int first = intRangeUntil.getFirst();
        int last = intRangeUntil.getLast();
        if (first > last) {
            return true;
        }
        while (contains(elements.get(first))) {
            if (first == last) {
                return true;
            }
            first++;
        }
        return false;
    }

    /* JADX INFO: renamed from: count, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final int elementAt(@androidx.annotation.IntRange(from = 0) int index) {
        if (index >= 0 && index < this._size) {
            return this.content[index];
        }
        StringBuilder sbC = o1.c("Index ", index, " must be in 0..");
        sbC.append(this._size - 1);
        throw new IndexOutOfBoundsException(sbC.toString());
    }

    public final int elementAtOrElse(@androidx.annotation.IntRange(from = 0) int index, @NotNull Function1<? super Integer, Integer> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (index < 0 || index >= this._size) ? defaultValue.invoke(Integer.valueOf(index)).intValue() : this.content[index];
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof IntList) {
            IntList intList = (IntList) other;
            int i10 = intList._size;
            int i11 = this._size;
            if (i10 == i11) {
                int[] iArr = this.content;
                int[] iArr2 = intList.content;
                IntRange intRangeUntil = kotlin.ranges.c.until(0, i11);
                int first = intRangeUntil.getFirst();
                int last = intRangeUntil.getLast();
                if (first > last) {
                    return true;
                }
                while (iArr[first] == iArr2[first]) {
                    if (first == last) {
                        return true;
                    }
                    first++;
                }
                return false;
            }
        }
        return false;
    }

    public final int first() {
        if (isEmpty()) {
            throw new NoSuchElementException("IntList is empty.");
        }
        return this.content[0];
    }

    public final <R> R fold(R initial, @NotNull Function2<? super R, ? super Integer, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        int[] iArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            initial = operation.invoke(initial, Integer.valueOf(iArr[i11]));
        }
        return initial;
    }

    public final <R> R foldIndexed(R initial, @NotNull Function3<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        int[] iArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            R r3 = initial;
            initial = operation.invoke(Integer.valueOf(i11), r3, Integer.valueOf(iArr[i11]));
        }
        return initial;
    }

    public final <R> R foldRight(R initial, @NotNull Function2<? super Integer, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        int[] iArr = this.content;
        int i10 = this._size;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return initial;
            }
            initial = operation.invoke(Integer.valueOf(iArr[i10]), initial);
        }
    }

    public final <R> R foldRightIndexed(R initial, @NotNull Function3<? super Integer, ? super Integer, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        int[] iArr = this.content;
        int i10 = this._size;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return initial;
            }
            initial = operation.invoke(Integer.valueOf(i10), Integer.valueOf(iArr[i10]), initial);
        }
    }

    public final void forEach(@NotNull Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] iArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(Integer.valueOf(iArr[i11]));
        }
    }

    public final void forEachIndexed(@NotNull Function2<? super Integer, ? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] iArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i11]));
        }
    }

    public final void forEachReversed(@NotNull Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] iArr = this.content;
        int i10 = this._size;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(Integer.valueOf(iArr[i10]));
            }
        }
    }

    public final void forEachReversedIndexed(@NotNull Function2<? super Integer, ? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] iArr = this.content;
        int i10 = this._size;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(Integer.valueOf(i10), Integer.valueOf(iArr[i10]));
            }
        }
    }

    public final int get(@androidx.annotation.IntRange(from = 0) int index) {
        if (index >= 0 && index < this._size) {
            return this.content[index];
        }
        StringBuilder sbC = o1.c("Index ", index, " must be in 0..");
        sbC.append(this._size - 1);
        throw new IndexOutOfBoundsException(sbC.toString());
    }

    @NotNull
    public final IntRange getIndices() {
        return kotlin.ranges.c.until(0, this._size);
    }

    @androidx.annotation.IntRange(from = -1)
    public final int getLastIndex() {
        return this._size - 1;
    }

    @androidx.annotation.IntRange(from = 0)
    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        int[] iArr = this.content;
        int i10 = this._size;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12] * 31;
        }
        return i11;
    }

    public final int indexOf(int element) {
        int[] iArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (element == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public final int indexOfFirst(@NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (predicate.invoke(Integer.valueOf(iArr[i11])).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    public final int indexOfLast(@NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.content;
        int i10 = this._size;
        do {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
        } while (!predicate.invoke(Integer.valueOf(iArr[i10])).booleanValue());
        return i10;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final int last() {
        if (isEmpty()) {
            throw new NoSuchElementException("IntList is empty.");
        }
        return this.content[this._size - 1];
    }

    public final int lastIndexOf(int element) {
        int[] iArr = this.content;
        int i10 = this._size;
        do {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
        } while (iArr[i10] != element);
        return i10;
    }

    public final boolean none() {
        return isEmpty();
    }

    public final boolean reversedAny(@NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.content;
        for (int i10 = this._size - 1; -1 < i10; i10--) {
            if (predicate.invoke(Integer.valueOf(iArr[i10])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public String toString() {
        return joinToString$default(this, null, Constant.BRACKET_OPEN, Constant.BRACKET_CLOSE, 0, null, 25, null);
    }

    public static /* synthetic */ String joinToString$default(IntList intList, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence charSequence, Function1 function1, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            separator = ", ";
        }
        if ((i11 & 2) != 0) {
            prefix = "";
        }
        if ((i11 & 4) != 0) {
            postfix = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence = "...";
        }
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        StringBuilder sbA = d.a(charSequence, "truncated", function1, "transform", prefix);
        int[] iArr = intList.content;
        int i12 = intList._size;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = iArr[i13];
            if (i13 == i10) {
                sbA.append(charSequence);
                String string = sbA.toString();
                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i13 != 0) {
                sbA.append(separator);
            }
            sbA.append((CharSequence) function1.invoke(Integer.valueOf(i14)));
        }
        sbA.append(postfix);
        String string2 = sbA.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    public final boolean any(@NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (predicate.invoke(Integer.valueOf(iArr[i11])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int count(@NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.content;
        int i10 = this._size;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (predicate.invoke(Integer.valueOf(iArr[i12])).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    public final int first(@NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (predicate.invoke(Integer.valueOf(i12)).booleanValue()) {
                return i12;
            }
        }
        throw new NoSuchElementException("IntList contains no element matching the predicate.");
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i10, null, 16, null);
    }

    public final int last(@NotNull Function1<? super Integer, Boolean> predicate) {
        int i10;
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.content;
        int i11 = this._size;
        do {
            i11--;
            if (-1 < i11) {
                i10 = iArr[i11];
            } else {
                throw new NoSuchElementException("IntList contains no element matching the predicate.");
            }
        } while (!predicate.invoke(Integer.valueOf(i10)).booleanValue());
        return i10;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        StringBuilder sbD = androidx.camera.core.impl.utils.b.d(postfix, "postfix", truncated, "truncated", prefix);
        int[] iArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i11 == limit) {
                sbD.append(truncated);
                String string = sbD.toString();
                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i11 != 0) {
                sbD.append(separator);
            }
            sbD.append(i12);
        }
        sbD.append(postfix);
        String string2 = sbD.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    @PublishedApi
    public static /* synthetic */ void getContent$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void get_size$annotations() {
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @NotNull Function1<? super Integer, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        StringBuilder sbA = d.a(truncated, "truncated", transform, "transform", prefix);
        int[] iArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i11 == limit) {
                sbA.append(truncated);
                String string = sbA.toString();
                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i11 != 0) {
                sbA.append(separator);
            }
            sbA.append(transform.invoke(Integer.valueOf(i12)));
        }
        sbA.append(postfix);
        String string2 = sbA.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence charSequence, int i10, @NotNull Function1<? super Integer, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        StringBuilder sbA = d.a(charSequence, "postfix", function1, "transform", prefix);
        int[] iArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = iArr[i12];
            if (i12 == i10) {
                sbA.append((CharSequence) "...");
                String string = sbA.toString();
                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i12 != 0) {
                sbA.append(separator);
            }
            sbA.append(function1.invoke(Integer.valueOf(i13)));
        }
        sbA.append(charSequence);
        String string2 = sbA.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence charSequence, @NotNull Function1<? super Integer, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        StringBuilder sbA = d.a(charSequence, "postfix", function1, "transform", prefix);
        int[] iArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i11 == -1) {
                sbA.append((CharSequence) "...");
                String string = sbA.toString();
                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i11 != 0) {
                sbA.append(separator);
            }
            sbA.append(function1.invoke(Integer.valueOf(i12)));
        }
        sbA.append(charSequence);
        String string2 = sbA.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence charSequence, @NotNull Function1<? super Integer, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        StringBuilder sbA = d.a(charSequence, "prefix", function1, "transform", charSequence);
        int[] iArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i11 == -1) {
                sbA.append((CharSequence) "...");
                String string = sbA.toString();
                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i11 != 0) {
                sbA.append(separator);
            }
            sbA.append(function1.invoke(Integer.valueOf(i12)));
        }
        sbA.append((CharSequence) "");
        String string2 = sbA.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull Function1<? super Integer, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder("");
        int[] iArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i11 != 0) {
                sb2.append(separator);
            }
            sb2.append(transform.invoke(Integer.valueOf(i12)));
        }
        sb2.append((CharSequence) "");
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull Function1<? super Integer, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder("");
        int[] iArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i11 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(transform.invoke(Integer.valueOf(i12)));
        }
        sb2.append((CharSequence) "");
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }
}
