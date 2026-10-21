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

/* JADX INFO: compiled from: FloatList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J:\u0010\u0004\u001a\u00020\u00022!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00020\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010\u000b\u001a\u00020\u00022!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00020\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0086\u0002J\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0000J\u0006\u0010\u0010\u001a\u00020\u000fJ:\u0010\u0010\u001a\u00020\u000f2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00020\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010\u0011\u001a\u00020\u0006J:\u0010\u0011\u001a\u00020\u00062!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00020\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001Jd\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0013\u001a\u00028\u000026\u0010\u0016\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u0017\u0010\u0018Jy\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0013\u001a\u00028\u00002K\u0010\u0016\u001aG\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u001b\u0010\u001cJd\u0010\u001d\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0013\u001a\u00028\u000026\u0010\u0016\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u001d\u0010\u0018Jy\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0013\u001a\u00028\u00002K\u0010\u0016\u001aG\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ:\u0010!\u001a\u00020\u001f2!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u001f0\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001JO\u0010\"\u001a\u00020\u001f26\u0010 \u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u001f0\u0014H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010#\u001a\u00020\u001f2!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u001f0\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001JO\u0010$\u001a\u00020\u001f26\u0010 \u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u001f0\u0014H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0013\u0010%\u001a\u00020\u00062\b\b\u0001\u0010\u001a\u001a\u00020\u000fH\u0086\u0002J\u0010\u0010&\u001a\u00020\u00062\b\b\u0001\u0010\u001a\u001a\u00020\u000fJ9\u0010(\u001a\u00020\u00062\b\b\u0001\u0010\u001a\u001a\u00020\u000f2!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\bø\u0001\u0000J\u000e\u0010)\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0006J:\u0010*\u001a\u00020\u000f2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00020\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010+\u001a\u00020\u000f2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00020\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010,\u001a\u00020\u0002J\u0006\u0010-\u001a\u00020\u0002J\u0006\u0010.\u001a\u00020\u0006J:\u0010.\u001a\u00020\u00062!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00020\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u000e\u0010/\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0006J:\u00107\u001a\u0002062\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00102\u001a\u0002002\b\b\u0002\u00103\u001a\u0002002\b\b\u0002\u00104\u001a\u00020\u000f2\b\b\u0002\u00105\u001a\u000200H\u0007JT\u00107\u001a\u0002062\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00102\u001a\u0002002\b\b\u0002\u00103\u001a\u0002002\b\b\u0002\u00104\u001a\u00020\u000f2\b\b\u0002\u00105\u001a\u0002002\u0014\b\u0004\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002000\u0005H\u0087\bø\u0001\u0000J\b\u00109\u001a\u00020\u000fH\u0016J\u0013\u0010;\u001a\u00020\u00022\b\u0010:\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010<\u001a\u000206H\u0016R\u001c\u0010>\u001a\u00020=8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b>\u0010?\u0012\u0004\b@\u0010AR\u001c\u0010B\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bB\u0010C\u0012\u0004\bD\u0010AR\u0011\u0010G\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0012\u0010I\u001a\u00020\u000f8Ç\u0002¢\u0006\u0006\u001a\u0004\bH\u0010FR\u0012\u0010M\u001a\u00020J8Æ\u0002¢\u0006\u0006\u001a\u0004\bK\u0010L\u0082\u0001\u0001N\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006O"}, d2 = {"Landroidx/collection/FloatList;", "", "", "none", "any", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "element", "predicate", "reversedAny", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "elements", "containsAll", "", "count", "first", "R", "initial", "Lkotlin/Function2;", "acc", "operation", "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function3;", FirebaseAnalytics.Param.INDEX, "foldIndexed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "", "block", "forEach", "forEachIndexed", "forEachReversed", "forEachReversedIndexed", "get", "elementAt", "defaultValue", "elementAtOrElse", "indexOf", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "last", "lastIndexOf", "", "separator", "prefix", "postfix", "limit", "truncated", "", "joinToString", "transform", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "toString", "", "content", "[F", "getContent$annotations", "()V", "_size", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "get_size$annotations", "getSize", "()I", "size", "getLastIndex", "lastIndex", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "indices", "Landroidx/collection/MutableFloatList;", "collection"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFloatList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatList\n*L\n1#1,969:1\n253#1,6:970\n279#1,6:976\n253#1,6:982\n75#1:988\n253#1,6:989\n253#1,6:995\n253#1,6:1001\n266#1,6:1007\n279#1,6:1013\n293#1,6:1019\n70#1:1025\n70#1:1026\n266#1,6:1027\n266#1,6:1033\n293#1,6:1039\n70#1:1045\n279#1,6:1046\n293#1,6:1052\n266#1,6:1058\n266#1,6:1064\n253#1,6:1070\n75#1:1076\n467#1,10:1077\n266#1,4:1087\n477#1,9:1091\n271#1:1100\n486#1,2:1101\n467#1,10:1103\n266#1,4:1113\n477#1,9:1117\n271#1:1126\n486#1,2:1127\n467#1,10:1129\n266#1,4:1139\n477#1,9:1143\n271#1:1152\n486#1,2:1153\n467#1,10:1155\n266#1,4:1165\n477#1,9:1169\n271#1:1178\n486#1,2:1179\n467#1,10:1181\n266#1,4:1191\n477#1,9:1195\n271#1:1204\n486#1,2:1205\n*S KotlinDebug\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatList\n*L\n96#1:970,6\n110#1:976,6\n122#1:982,6\n135#1:988\n153#1:989,6\n175#1:995,6\n192#1:1001,6\n208#1:1007,6\n225#1:1013,6\n241#1:1019,6\n306#1:1025\n317#1:1026\n343#1:1027,6\n357#1:1033,6\n371#1:1039,6\n397#1:1045\n407#1:1046,6\n420#1:1052,6\n445#1:1058,6\n476#1:1064,6\n494#1:1070,6\n510#1:1076\n-1#1:1077,10\n-1#1:1087,4\n-1#1:1091,9\n-1#1:1100\n-1#1:1101,2\n-1#1:1103,10\n-1#1:1113,4\n-1#1:1117,9\n-1#1:1126\n-1#1:1127,2\n-1#1:1129,10\n-1#1:1139,4\n-1#1:1143,9\n-1#1:1152\n-1#1:1153,2\n-1#1:1155,10\n-1#1:1165,4\n-1#1:1169,9\n-1#1:1178\n-1#1:1179,2\n-1#1:1181,10\n-1#1:1191,4\n-1#1:1195,9\n-1#1:1204\n-1#1:1205,2\n*E\n"})
public abstract class FloatList {

    @JvmField
    public int _size;

    @JvmField
    @NotNull
    public float[] content;

    public FloatList(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this.content = i10 == 0 ? FloatSetKt.getEmptyFloatArray() : new float[i10];
    }

    public static /* synthetic */ String joinToString$default(FloatList floatList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
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
        return floatList.joinToString(charSequence, charSequence5, charSequence6, i12, charSequence4);
    }

    public final boolean any() {
        return isNotEmpty();
    }

    public final boolean contains(float element) {
        float[] fArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (fArr[i11] == element) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(@NotNull FloatList elements) {
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

    public final float elementAt(@androidx.annotation.IntRange(from = 0) int index) {
        if (index >= 0 && index < this._size) {
            return this.content[index];
        }
        StringBuilder sbC = o1.c("Index ", index, " must be in 0..");
        sbC.append(this._size - 1);
        throw new IndexOutOfBoundsException(sbC.toString());
    }

    public final float elementAtOrElse(@androidx.annotation.IntRange(from = 0) int index, @NotNull Function1<? super Integer, Float> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (index < 0 || index >= this._size) ? defaultValue.invoke(Integer.valueOf(index)).floatValue() : this.content[index];
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof FloatList) {
            FloatList floatList = (FloatList) other;
            int i10 = floatList._size;
            int i11 = this._size;
            if (i10 == i11) {
                float[] fArr = this.content;
                float[] fArr2 = floatList.content;
                IntRange intRangeUntil = kotlin.ranges.c.until(0, i11);
                int first = intRangeUntil.getFirst();
                int last = intRangeUntil.getLast();
                if (first > last) {
                    return true;
                }
                while (fArr[first] == fArr2[first]) {
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

    public final float first() {
        if (isEmpty()) {
            throw new NoSuchElementException("FloatList is empty.");
        }
        return this.content[0];
    }

    public final <R> R fold(R initial, @NotNull Function2<? super R, ? super Float, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        float[] fArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            initial = operation.invoke(initial, Float.valueOf(fArr[i11]));
        }
        return initial;
    }

    public final <R> R foldIndexed(R initial, @NotNull Function3<? super Integer, ? super R, ? super Float, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        float[] fArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            R r3 = initial;
            initial = operation.invoke(Integer.valueOf(i11), r3, Float.valueOf(fArr[i11]));
        }
        return initial;
    }

    public final <R> R foldRight(R initial, @NotNull Function2<? super Float, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        float[] fArr = this.content;
        int i10 = this._size;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return initial;
            }
            initial = operation.invoke(Float.valueOf(fArr[i10]), initial);
        }
    }

    public final <R> R foldRightIndexed(R initial, @NotNull Function3<? super Integer, ? super Float, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        float[] fArr = this.content;
        int i10 = this._size;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return initial;
            }
            initial = operation.invoke(Integer.valueOf(i10), Float.valueOf(fArr[i10]), initial);
        }
    }

    public final void forEach(@NotNull Function1<? super Float, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        float[] fArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(Float.valueOf(fArr[i11]));
        }
    }

    public final void forEachIndexed(@NotNull Function2<? super Integer, ? super Float, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        float[] fArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(Integer.valueOf(i11), Float.valueOf(fArr[i11]));
        }
    }

    public final void forEachReversed(@NotNull Function1<? super Float, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        float[] fArr = this.content;
        int i10 = this._size;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(Float.valueOf(fArr[i10]));
            }
        }
    }

    public final void forEachReversedIndexed(@NotNull Function2<? super Integer, ? super Float, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        float[] fArr = this.content;
        int i10 = this._size;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(Integer.valueOf(i10), Float.valueOf(fArr[i10]));
            }
        }
    }

    public final float get(@androidx.annotation.IntRange(from = 0) int index) {
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
        float[] fArr = this.content;
        int i10 = this._size;
        int iFloatToIntBits = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iFloatToIntBits += Float.floatToIntBits(fArr[i11]) * 31;
        }
        return iFloatToIntBits;
    }

    public final int indexOf(float element) {
        float[] fArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (element == fArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public final int indexOfFirst(@NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (predicate.invoke(Float.valueOf(fArr[i11])).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    public final int indexOfLast(@NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.content;
        int i10 = this._size;
        do {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
        } while (!predicate.invoke(Float.valueOf(fArr[i10])).booleanValue());
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

    public final float last() {
        if (isEmpty()) {
            throw new NoSuchElementException("FloatList is empty.");
        }
        return this.content[this._size - 1];
    }

    public final int lastIndexOf(float element) {
        float[] fArr = this.content;
        int i10 = this._size;
        do {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
        } while (fArr[i10] != element);
        return i10;
    }

    public final boolean none() {
        return isEmpty();
    }

    public final boolean reversedAny(@NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.content;
        for (int i10 = this._size - 1; -1 < i10; i10--) {
            if (predicate.invoke(Float.valueOf(fArr[i10])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public String toString() {
        return joinToString$default(this, null, Constant.BRACKET_OPEN, Constant.BRACKET_CLOSE, 0, null, 25, null);
    }

    public static /* synthetic */ String joinToString$default(FloatList floatList, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence charSequence, Function1 function1, int i11, Object obj) {
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
        float[] fArr = floatList.content;
        int i12 = floatList._size;
        for (int i13 = 0; i13 < i12; i13++) {
            float f6 = fArr[i13];
            if (i13 == i10) {
                sbA.append(charSequence);
                String string = sbA.toString();
                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i13 != 0) {
                sbA.append(separator);
            }
            sbA.append((CharSequence) function1.invoke(Float.valueOf(f6)));
        }
        sbA.append(postfix);
        String string2 = sbA.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    public final boolean any(@NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (predicate.invoke(Float.valueOf(fArr[i11])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int count(@NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.content;
        int i10 = this._size;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (predicate.invoke(Float.valueOf(fArr[i12])).booleanValue()) {
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

    public final float first(@NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            float f6 = fArr[i11];
            if (predicate.invoke(Float.valueOf(f6)).booleanValue()) {
                return f6;
            }
        }
        throw new NoSuchElementException("FloatList contains no element matching the predicate.");
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

    public final float last(@NotNull Function1<? super Float, Boolean> predicate) {
        float f6;
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.content;
        int i10 = this._size;
        do {
            i10--;
            if (-1 < i10) {
                f6 = fArr[i10];
            } else {
                throw new NoSuchElementException("FloatList contains no element matching the predicate.");
            }
        } while (!predicate.invoke(Float.valueOf(f6)).booleanValue());
        return f6;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        StringBuilder sbD = androidx.camera.core.impl.utils.b.d(postfix, "postfix", truncated, "truncated", prefix);
        float[] fArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            float f6 = fArr[i11];
            if (i11 == limit) {
                sbD.append(truncated);
                String string = sbD.toString();
                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i11 != 0) {
                sbD.append(separator);
            }
            sbD.append(f6);
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
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @NotNull Function1<? super Float, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        StringBuilder sbA = d.a(truncated, "truncated", transform, "transform", prefix);
        float[] fArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            float f6 = fArr[i11];
            if (i11 == limit) {
                sbA.append(truncated);
                String string = sbA.toString();
                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i11 != 0) {
                sbA.append(separator);
            }
            sbA.append(transform.invoke(Float.valueOf(f6)));
        }
        sbA.append(postfix);
        String string2 = sbA.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence charSequence, int i10, @NotNull Function1<? super Float, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        StringBuilder sbA = d.a(charSequence, "postfix", function1, "transform", prefix);
        float[] fArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            float f6 = fArr[i12];
            if (i12 == i10) {
                sbA.append((CharSequence) "...");
                String string = sbA.toString();
                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i12 != 0) {
                sbA.append(separator);
            }
            sbA.append(function1.invoke(Float.valueOf(f6)));
        }
        sbA.append(charSequence);
        String string2 = sbA.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence charSequence, @NotNull Function1<? super Float, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        StringBuilder sbA = d.a(charSequence, "postfix", function1, "transform", prefix);
        float[] fArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            float f6 = fArr[i11];
            if (i11 == -1) {
                sbA.append((CharSequence) "...");
                String string = sbA.toString();
                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i11 != 0) {
                sbA.append(separator);
            }
            sbA.append(function1.invoke(Float.valueOf(f6)));
        }
        sbA.append(charSequence);
        String string2 = sbA.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence charSequence, @NotNull Function1<? super Float, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        StringBuilder sbA = d.a(charSequence, "prefix", function1, "transform", charSequence);
        float[] fArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            float f6 = fArr[i11];
            if (i11 == -1) {
                sbA.append((CharSequence) "...");
                String string = sbA.toString();
                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i11 != 0) {
                sbA.append(separator);
            }
            sbA.append(function1.invoke(Float.valueOf(f6)));
        }
        sbA.append((CharSequence) "");
        String string2 = sbA.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull Function1<? super Float, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder("");
        float[] fArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            float f6 = fArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i11 != 0) {
                sb2.append(separator);
            }
            sb2.append(transform.invoke(Float.valueOf(f6)));
        }
        sb2.append((CharSequence) "");
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull Function1<? super Float, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder("");
        float[] fArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            float f6 = fArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i11 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(transform.invoke(Float.valueOf(f6)));
        }
        sb2.append((CharSequence) "");
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }
}
