package androidx.collection;

import androidx.annotation.IntRange;
import androidx.appcompat.widget.o1;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ObjectList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0005\u001a\u00020\u0003J:\u0010\u0005\u001a\u00020\u00032!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010\u000b\u001a\u00020\u00032!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0010\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012J\u0014\u0010\u0010\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013J\u0014\u0010\u0010\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0006\u0010\u0015\u001a\u00020\u0014J:\u0010\u0015\u001a\u00020\u00142!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\r\u0010\u0016\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017JA\u0010\u0016\u001a\u00028\u00002!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0016\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\b\u0019\u0010\u0017JC\u0010\u0019\u001a\u0004\u0018\u00018\u00002!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0019\u0010\u0018Jd\u0010\u001f\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u001a2\u0006\u0010\u001b\u001a\u00028\u000126\u0010\u001e\u001a2\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00010\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u001f\u0010 Jy\u0010#\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u001a2\u0006\u0010\u001b\u001a\u00028\u00012K\u0010\u001e\u001aG\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00010!H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b#\u0010$Jd\u0010%\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u001a2\u0006\u0010\u001b\u001a\u00028\u000126\u0010\u001e\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00028\u00010\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b%\u0010 Jy\u0010&\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u001a2\u0006\u0010\u001b\u001a\u00028\u00012K\u0010\u001e\u001aG\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00028\u00010!H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b&\u0010$J:\u0010)\u001a\u00020'2!\u0010(\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020'0\u0006H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001JO\u0010*\u001a\u00020'26\u0010(\u001a2\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020'0\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010+\u001a\u00020'2!\u0010(\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020'0\u0006H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001JO\u0010,\u001a\u00020'26\u0010(\u001a2\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020'0\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u001a\u0010-\u001a\u00028\u00002\b\b\u0001\u0010\"\u001a\u00020\u0014H\u0086\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00028\u00002\b\b\u0001\u0010\"\u001a\u00020\u0014¢\u0006\u0004\b/\u0010.J@\u00101\u001a\u00028\u00002\b\b\u0001\u0010\"\u001a\u00020\u00142!\u00100\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00028\u00000\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\u00142\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b3\u00104J:\u00105\u001a\u00020\u00142!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u00106\u001a\u00020\u00142!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u00107\u001a\u00020\u0003J\u0006\u00108\u001a\u00020\u0003J\r\u00109\u001a\u00028\u0000¢\u0006\u0004\b9\u0010\u0017JA\u00109\u001a\u00028\u00002!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b9\u0010\u0018J\u0012\u0010:\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\b:\u0010\u0017JC\u0010:\u001a\u0004\u0018\u00018\u00002!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b:\u0010\u0018J\u0015\u0010;\u001a\u00020\u00142\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b;\u00104JR\u0010D\u001a\u00020C2\b\b\u0002\u0010=\u001a\u00020<2\b\b\u0002\u0010>\u001a\u00020<2\b\b\u0002\u0010?\u001a\u00020<2\b\b\u0002\u0010@\u001a\u00020\u00142\b\b\u0002\u0010A\u001a\u00020<2\u0016\b\u0002\u0010B\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020<\u0018\u00010\u0006H\u0007J\u000e\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H&J\b\u0010F\u001a\u00020\u0014H\u0016J\u0013\u0010H\u001a\u00020\u00032\b\u0010G\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010I\u001a\u00020CH\u0016R$\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bJ\u0010K\u0012\u0004\bL\u0010MR\u001c\u0010N\u001a\u00020\u00148\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bN\u0010O\u0012\u0004\bP\u0010MR\u0011\u0010S\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0012\u0010U\u001a\u00020\u00148Ç\u0002¢\u0006\u0006\u001a\u0004\bT\u0010RR\u0012\u0010Y\u001a\u00020V8Æ\u0002¢\u0006\u0006\u001a\u0004\bW\u0010X\u0082\u0001\u0001Z\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006["}, d2 = {"Landroidx/collection/ObjectList;", ExifInterface.LONGITUDE_EAST, "", "", "none", "any", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "element", "predicate", "reversedAny", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "([Ljava/lang/Object;)Z", "", "", "", "count", "first", "()Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstOrNull", "R", "initial", "Lkotlin/Function2;", "acc", "operation", "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function3;", FirebaseAnalytics.Param.INDEX, "foldIndexed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "", "block", "forEach", "forEachIndexed", "forEachReversed", "forEachReversedIndexed", "get", "(I)Ljava/lang/Object;", "elementAt", "defaultValue", "elementAtOrElse", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "last", "lastOrNull", "lastIndexOf", "", "separator", "prefix", "postfix", "limit", "truncated", "transform", "", "joinToString", "asList", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "toString", "content", "[Ljava/lang/Object;", "getContent$annotations", "()V", "_size", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "get_size$annotations", "getSize", "()I", "size", "getLastIndex", "lastIndex", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "indices", "Landroidx/collection/MutableObjectList;", "collection"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1618:1\n305#1,6:1619\n331#1,6:1625\n305#1,6:1633\n305#1,6:1639\n305#1,6:1645\n305#1,6:1651\n305#1,6:1657\n318#1,6:1663\n331#1,6:1669\n345#1,6:1675\n75#1:1681\n75#1:1682\n318#1,6:1683\n318#1,6:1689\n318#1,6:1695\n345#1,6:1701\n75#1:1707\n331#1,6:1708\n75#1:1714\n331#1,6:1715\n345#1,6:1721\n345#1,6:1727\n318#1,6:1733\n305#1,6:1739\n80#1:1745\n1855#2,2:1631\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n101#1:1619,6\n115#1:1625,6\n168#1:1633,6\n186#1:1639,6\n209#1:1645,6\n227#1:1651,6\n244#1:1657,6\n260#1:1663,6\n277#1:1669,6\n293#1:1675,6\n358#1:1681\n369#1:1682\n399#1:1683,6\n405#1:1689,6\n421#1:1695,6\n435#1:1701,6\n461#1:1707\n472#1:1708,6\n483#1:1714\n492#1:1715,6\n509#1:1721,6\n515#1:1727,6\n545#1:1733,6\n576#1:1739,6\n592#1:1745\n157#1:1631,2\n*E\n"})
public abstract class ObjectList<E> {

    @JvmField
    public int _size;

    @JvmField
    @NotNull
    public Object[] content;

    /* JADX INFO: compiled from: ObjectList.kt */
    public static final class a extends Lambda implements Function1<E, CharSequence> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ObjectList<E> f2480p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ObjectList<E> objectList) {
            super(1);
            this.f2480p0 = objectList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Object obj) {
            return obj == this.f2480p0 ? "(this)" : String.valueOf(obj);
        }
    }

    public ObjectList(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this.content = i10 == 0 ? ObjectListKt.f2481a : new Object[i10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String joinToString$default(ObjectList objectList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
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
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        return objectList.joinToString(charSequence, charSequence5, charSequence6, i12, charSequence7, function1);
    }

    public final boolean any() {
        return isNotEmpty();
    }

    @NotNull
    public abstract List<E> asList();

    public final boolean contains(E element) {
        return indexOf(element) >= 0;
    }

    public final boolean containsAll(@NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (E e5 : elements) {
            if (!contains(e5)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: count, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final E elementAt(@IntRange(from = 0) int index) {
        if (index >= 0 && index < this._size) {
            return (E) this.content[index];
        }
        StringBuilder sbC = o1.c("Index ", index, " must be in 0..");
        sbC.append(this._size - 1);
        throw new IndexOutOfBoundsException(sbC.toString());
    }

    public final E elementAtOrElse(@IntRange(from = 0) int index, @NotNull Function1<? super Integer, ? extends E> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (index < 0 || index >= this._size) ? defaultValue.invoke(Integer.valueOf(index)) : (E) this.content[index];
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof ObjectList) {
            ObjectList objectList = (ObjectList) other;
            int i10 = objectList._size;
            int i11 = this._size;
            if (i10 == i11) {
                Object[] objArr = this.content;
                Object[] objArr2 = objectList.content;
                kotlin.ranges.IntRange intRangeUntil = kotlin.ranges.c.until(0, i11);
                int first = intRangeUntil.getFirst();
                int last = intRangeUntil.getLast();
                if (first > last) {
                    return true;
                }
                while (Intrinsics.areEqual(objArr[first], objArr2[first])) {
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

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        return (E) this.content[0];
    }

    @Nullable
    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    public final <R> R fold(R initial, @NotNull Function2<? super R, ? super E, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Object[] objArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            initial = operation.invoke(initial, objArr[i11]);
        }
        return initial;
    }

    public final <R> R foldIndexed(R initial, @NotNull Function3<? super Integer, ? super R, ? super E, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Object[] objArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            initial = operation.invoke(Integer.valueOf(i11), initial, objArr[i11]);
        }
        return initial;
    }

    public final <R> R foldRight(R initial, @NotNull Function2<? super E, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Object[] objArr = this.content;
        int i10 = this._size;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return initial;
            }
            initial = operation.invoke(objArr[i10], initial);
        }
    }

    public final <R> R foldRightIndexed(R initial, @NotNull Function3<? super Integer, ? super E, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Object[] objArr = this.content;
        int i10 = this._size;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return initial;
            }
            initial = operation.invoke(Integer.valueOf(i10), objArr[i10], initial);
        }
    }

    public final void forEach(@NotNull Function1<? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(objArr[i11]);
        }
    }

    public final void forEachIndexed(@NotNull Function2<? super Integer, ? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(Integer.valueOf(i11), objArr[i11]);
        }
    }

    public final void forEachReversed(@NotNull Function1<? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.content;
        int i10 = this._size;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(objArr[i10]);
            }
        }
    }

    public final void forEachReversedIndexed(@NotNull Function2<? super Integer, ? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.content;
        int i10 = this._size;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(Integer.valueOf(i10), objArr[i10]);
            }
        }
    }

    public final E get(@IntRange(from = 0) int index) {
        if (index >= 0 && index < this._size) {
            return (E) this.content[index];
        }
        StringBuilder sbC = o1.c("Index ", index, " must be in 0..");
        sbC.append(this._size - 1);
        throw new IndexOutOfBoundsException(sbC.toString());
    }

    @NotNull
    public final kotlin.ranges.IntRange getIndices() {
        return kotlin.ranges.c.until(0, this._size);
    }

    @IntRange(from = -1)
    public final int getLastIndex() {
        return this._size - 1;
    }

    @IntRange(from = 0)
    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        Object[] objArr = this.content;
        int i10 = this._size;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final int indexOf(E element) {
        int i10 = 0;
        if (element == null) {
            Object[] objArr = this.content;
            int i11 = this._size;
            while (i10 < i11) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        Object[] objArr2 = this.content;
        int i12 = this._size;
        while (i10 < i12) {
            if (element.equals(objArr2[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final int indexOfFirst(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (predicate.invoke(objArr[i11]).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    public final int indexOfLast(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        int i10 = this._size;
        do {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
        } while (!predicate.invoke(objArr[i10]).booleanValue());
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
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        return (E) this.content[this._size - 1];
    }

    public final int lastIndexOf(E element) {
        if (element == null) {
            Object[] objArr = this.content;
            for (int i10 = this._size - 1; -1 < i10; i10--) {
                if (objArr[i10] == null) {
                    return i10;
                }
            }
        } else {
            Object[] objArr2 = this.content;
            for (int i11 = this._size - 1; -1 < i11; i11--) {
                if (element.equals(objArr2[i11])) {
                    return i11;
                }
            }
        }
        return -1;
    }

    @Nullable
    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.content[this._size - 1];
    }

    public final boolean none() {
        return isEmpty();
    }

    public final boolean reversedAny(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        for (int i10 = this._size - 1; -1 < i10; i10--) {
            if (predicate.invoke(objArr[i10]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public String toString() {
        return joinToString$default(this, null, Constant.BRACKET_OPEN, Constant.BRACKET_CLOSE, 0, null, new a(this), 25, null);
    }

    public final boolean any(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (predicate.invoke(objArr[i11]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int count(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        int i10 = this._size;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (predicate.invoke(objArr[i12]).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [E, java.lang.Object] */
    @Nullable
    public final E firstOrNull(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            ?? r3 = (Object) objArr[i11];
            if (predicate.invoke(r3).booleanValue()) {
                return r3;
            }
        }
        return null;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, null, 62, null);
    }

    public final boolean containsAll(@NotNull List<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = elements.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!contains(elements.get(i10))) {
                return false;
            }
        }
        return true;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, null, 60, null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [E, java.lang.Object] */
    @Nullable
    public final E lastOrNull(@NotNull Function1<? super E, Boolean> predicate) {
        ?? r3;
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        int i10 = this._size;
        do {
            i10--;
            if (-1 >= i10) {
                return null;
            }
            r3 = (Object) objArr[i10];
        } while (!predicate.invoke(r3).booleanValue());
        return r3;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [E, java.lang.Object] */
    public final E first(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            ?? r3 = (Object) objArr[i11];
            if (predicate.invoke(r3).booleanValue()) {
                return r3;
            }
        }
        throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    public final boolean containsAll(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i10, null, null, 48, null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [E, java.lang.Object] */
    public final E last(@NotNull Function1<? super E, Boolean> predicate) {
        ?? r3;
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        int i10 = this._size;
        do {
            i10--;
            if (-1 < i10) {
                r3 = (Object) objArr[i10];
            } else {
                throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
            }
        } while (!predicate.invoke(r3).booleanValue());
        return r3;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return joinToString$default(this, separator, prefix, postfix, i10, truncated, null, 32, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(@NotNull ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.content;
        int i10 = elements._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (!contains(objArr[i11])) {
                return false;
            }
        }
        return true;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @Nullable Function1<? super E, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        StringBuilder sbD = androidx.camera.core.impl.utils.b.d(postfix, "postfix", truncated, "truncated", prefix);
        Object[] objArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            if (i11 == limit) {
                sbD.append(truncated);
                String string = sbD.toString();
                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i11 != 0) {
                sbD.append(separator);
            }
            if (transform == null) {
                sbD.append(obj);
            } else {
                sbD.append(transform.invoke(obj));
            }
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
}
