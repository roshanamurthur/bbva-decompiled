package androidx.compose.runtime.collection;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MutableVector.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0003vwxB!\b\u0001\u0012\u000e\u0010g\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000f\u0012\u0006\u0010m\u001a\u00020\b¢\u0006\u0004\bt\u0010uJ\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u0006\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u000bJ\u001c\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fJ\u001c\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0017\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0086\bJ\u0017\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086\bJ\u001b\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u000e\u0010\u0010J\u001c\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0014\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J(\u0010\u0014\u001a\u00020\u00052\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0012H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J(\u0010\u0015\u001a\u00020\u00052\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0012H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016J\u0006\u0010\u0018\u001a\u00020\nJ\u0018\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u0007J\u0014\u0010\u001a\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fJ\u0014\u0010\u001a\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0014\u0010\u001a\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0014\u0010\u001c\u001a\u00020\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u000e\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\bJ\r\u0010\u001f\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010 J/\u0010\u001f\u001a\u00028\u00002\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0012H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001f\u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\b\"\u0010 J1\u0010\"\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0012H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\"\u0010!JR\u0010*\u001a\u00028\u0001\"\u0004\b\u0001\u0010#2\u0006\u0010$\u001a\u00028\u00012'\u0010)\u001a#\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b*\u0010+Jg\u0010-\u001a\u00028\u0001\"\u0004\b\u0001\u0010#2\u0006\u0010$\u001a\u00028\u00012<\u0010)\u001a8\u0012\u0013\u0012\u00110\b¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010,H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b-\u0010.JR\u0010/\u001a\u00028\u0001\"\u0004\b\u0001\u0010#2\u0006\u0010$\u001a\u00028\u00012'\u0010)\u001a#\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00028\u00010%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b/\u0010+Jg\u00100\u001a\u00028\u0001\"\u0004\b\u0001\u0010#2\u0006\u0010$\u001a\u00028\u00012<\u0010)\u001a8\u0012\u0013\u0012\u00110\b¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00028\u00010,H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b0\u0010.J(\u00102\u001a\u00020\n2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0012H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J.\u00103\u001a\u00020\n2\u0018\u00101\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J(\u00104\u001a\u00020\n2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0012H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J.\u00105\u001a\u00020\n2\u0018\u00101\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0018\u00106\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0086\n¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b8\u00109J(\u0010:\u001a\u00020\b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0012H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J(\u0010;\u001a\u00020\b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0012H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010<\u001a\u00020\u0005J\u0006\u0010=\u001a\u00020\u0005J\r\u0010>\u001a\u00028\u0000¢\u0006\u0004\b>\u0010 J/\u0010>\u001a\u00028\u00002\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0012H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b>\u0010!J\u0015\u0010?\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b?\u00109J\u0012\u0010@\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\b@\u0010 J1\u0010@\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0012H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b@\u0010!J=\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f\"\u0006\b\u0001\u0010#\u0018\u00012\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bB\u0010CJR\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f\"\u0006\b\u0001\u0010#\u0018\u00012'\u0010A\u001a#\u0012\u0013\u0012\u00110\b¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bD\u0010EJM\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0006\b\u0001\u0010#\u0018\u00012)\u0010A\u001a%\u0012\u0013\u0012\u00110\b¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J8\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0006\b\u0001\u0010#\u0018\u00012\u0014\u0010A\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0012H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0018\u0010H\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\bH\u0010IJ\u0018\u0010J\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\bJ\u0010IJ\u0015\u0010K\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\bK\u0010\u0007J\u0014\u0010L\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fJ\u0014\u0010L\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0014\u0010L\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0015\u0010M\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bM\u00107J\u0016\u0010P\u001a\u00020\n2\u0006\u0010N\u001a\u00020\b2\u0006\u0010O\u001a\u00020\bJ\u0010\u0010R\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\bH\u0001J\u001d\u0010S\u001a\u00020\n2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0012H\u0086\bJ\u0014\u0010T\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J \u0010U\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bU\u0010VJ\u001e\u0010Z\u001a\u00020\n2\u0016\u0010Y\u001a\u0012\u0012\u0004\u0012\u00028\u00000Wj\b\u0012\u0004\u0012\u00028\u0000`XJ(\u0010\\\u001a\u00020\b2\u0012\u0010[\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0012H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\b\u0010^\u001a\u00020]H\u0001R0\u0010g\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b_\u0010`\u0012\u0004\be\u0010f\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR$\u0010m\u001a\u00020\b2\u0006\u0010h\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u0012\u0010o\u001a\u00020\b8Æ\u0002¢\u0006\u0006\u001a\u0004\bn\u0010lR\u0012\u0010s\u001a\u00020p8Æ\u0002¢\u0006\u0006\u001a\u0004\bq\u0010r¨\u0006y"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "element", "", "add", "(Ljava/lang/Object;)Z", "", FirebaseAnalytics.Param.INDEX, "", "(ILjava/lang/Object;)V", "", "elements", "addAll", "", "([Ljava/lang/Object;)Z", "", "Lkotlin/Function1;", "predicate", "any", "reversedAny", "", "asMutableList", ClearCommand.ID, SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "containsAll", "other", "contentEquals", "capacity", "ensureCapacity", "first", "()Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstOrNull", "R", "initial", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "acc", "operation", "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function3;", "foldIndexed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "block", "forEach", "forEachIndexed", "forEachReversed", "forEachReversedIndexed", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "last", "lastIndexOf", "lastOrNull", "transform", "map", "(Lkotlin/jvm/functions/Function1;)[Ljava/lang/Object;", "mapIndexed", "(Lkotlin/jvm/functions/Function2;)[Ljava/lang/Object;", "mapIndexedNotNull", "mapNotNull", "plusAssign", "(Ljava/lang/Object;)V", "minusAssign", RemoveCommand.ID, "removeAll", "removeAt", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "removeRange", "newSize", "setSize", "removeIf", "retainAll", SetCommand.ID, "(ILjava/lang/Object;)Ljava/lang/Object;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "sortWith", "selector", "sumBy", "", "throwNoSuchElementException", "p0", "[Ljava/lang/Object;", "getContent", "()[Ljava/lang/Object;", "setContent", "([Ljava/lang/Object;)V", "getContent$annotations", "()V", "content", "<set-?>", "r0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSize", "()I", "size", "getLastIndex", "lastIndex", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "indices", "<init>", "([Ljava/lang/Object;I)V", "a", "b", "c", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1220:1\n48#1:1224\n48#1:1225\n523#1:1226\n53#1:1229\n523#1:1230\n48#1:1231\n523#1:1232\n523#1:1233\n523#1:1234\n48#1:1235\n523#1:1236\n48#1:1237\n523#1:1238\n523#1:1239\n523#1:1240\n48#1:1241\n523#1:1242\n48#1:1245\n48#1:1246\n48#1:1247\n523#1:1248\n1864#2,3:1221\n1855#2,2:1227\n1855#2,2:1243\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n249#1:1224\n259#1:1225\n260#1:1226\n292#1:1229\n293#1:1230\n307#1:1231\n308#1:1232\n334#1:1233\n359#1:1234\n595#1:1235\n595#1:1236\n637#1:1237\n637#1:1238\n665#1:1239\n675#1:1240\n768#1:1241\n769#1:1242\n794#1:1245\n821#1:1246\n859#1:1247\n860#1:1248\n185#1:1221,3\n281#1:1227,2\n782#1:1243,2\n*E\n"})
public final class MutableVector<T> implements RandomAccess {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public T[] content;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public a f14866q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public int size;

    /* JADX INFO: compiled from: MutableVector.kt */
    @SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$MutableVectorList\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1220:1\n523#2:1221\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$MutableVectorList\n*L\n967#1:1221\n*E\n"})
    public static final class a<T> implements List<T>, KMutableList {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final MutableVector<T> f14868p0;

        public a(@NotNull MutableVector<T> mutableVector) {
            this.f14868p0 = mutableVector;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t10) {
            return this.f14868p0.add(t10);
        }

        @Override // java.util.List
        public final boolean addAll(int i10, @NotNull Collection<? extends T> collection) {
            return this.f14868p0.addAll(i10, collection);
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.f14868p0.clear();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return this.f14868p0.contains(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(@NotNull Collection<? extends Object> collection) {
            return this.f14868p0.containsAll(collection);
        }

        @Override // java.util.List
        public final T get(int i10) {
            MutableVectorKt.access$checkIndex(this, i10);
            return this.f14868p0.getContent()[i10];
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            return this.f14868p0.indexOf(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f14868p0.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @NotNull
        public final Iterator<T> iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            return this.f14868p0.lastIndexOf(obj);
        }

        @Override // java.util.List
        @NotNull
        public final ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            return this.f14868p0.remove(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(@NotNull Collection<? extends Object> collection) {
            return this.f14868p0.removeAll(collection);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(@NotNull Collection<? extends Object> collection) {
            return this.f14868p0.retainAll(collection);
        }

        @Override // java.util.List
        public final T set(int i10, T t10) {
            MutableVectorKt.access$checkIndex(this, i10);
            return this.f14868p0.set(i10, t10);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f14868p0.getSize();
        }

        @Override // java.util.List
        @NotNull
        public final List<T> subList(int i10, int i11) {
            MutableVectorKt.access$checkSubIndex(this, i10, i11);
            return new b(i10, i11, this);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List
        public final void add(int i10, T t10) {
            this.f14868p0.add(i10, t10);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(@NotNull Collection<? extends T> collection) {
            return this.f14868p0.addAll(collection);
        }

        @Override // java.util.List
        @NotNull
        public final ListIterator<T> listIterator(int i10) {
            return new c(this, i10);
        }

        @Override // java.util.List
        public final T remove(int i10) {
            MutableVectorKt.access$checkIndex(this, i10);
            return this.f14868p0.removeAt(i10);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) CollectionToArray.toArray(this, tArr);
        }
    }

    /* JADX INFO: compiled from: MutableVector.kt */
    @SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1220:1\n1855#2,2:1221\n1855#2,2:1223\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$SubList\n*L\n1039#1:1221,2\n1121#1:1223,2\n*E\n"})
    public static final class b<T> implements List<T>, KMutableList {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final List<T> f14869p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f14870q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f14871r0;

        public b(int i10, int i11, @NotNull List list) {
            this.f14869p0 = list;
            this.f14870q0 = i10;
            this.f14871r0 = i11;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t10) {
            int i10 = this.f14871r0;
            this.f14871r0 = i10 + 1;
            this.f14869p0.add(i10, t10);
            return true;
        }

        @Override // java.util.List
        public final boolean addAll(int i10, @NotNull Collection<? extends T> collection) {
            this.f14869p0.addAll(i10 + this.f14870q0, collection);
            this.f14871r0 = collection.size() + this.f14871r0;
            return collection.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i10 = this.f14871r0 - 1;
            int i11 = this.f14870q0;
            if (i11 <= i10) {
                while (true) {
                    this.f14869p0.remove(i10);
                    if (i10 == i11) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
            this.f14871r0 = i11;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            int i10 = this.f14871r0;
            for (int i11 = this.f14870q0; i11 < i10; i11++) {
                if (Intrinsics.areEqual(this.f14869p0.get(i11), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(@NotNull Collection<? extends Object> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i10) {
            MutableVectorKt.access$checkIndex(this, i10);
            return this.f14869p0.get(i10 + this.f14870q0);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i10 = this.f14871r0;
            int i11 = this.f14870q0;
            for (int i12 = i11; i12 < i10; i12++) {
                if (Intrinsics.areEqual(this.f14869p0.get(i12), obj)) {
                    return i12 - i11;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f14871r0 == this.f14870q0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @NotNull
        public final Iterator<T> iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i10 = this.f14871r0 - 1;
            int i11 = this.f14870q0;
            if (i11 > i10) {
                return -1;
            }
            while (!Intrinsics.areEqual(this.f14869p0.get(i10), obj)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - i11;
        }

        @Override // java.util.List
        @NotNull
        public final ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            int i10 = this.f14871r0;
            for (int i11 = this.f14870q0; i11 < i10; i11++) {
                List<T> list = this.f14869p0;
                if (Intrinsics.areEqual(list.get(i11), obj)) {
                    list.remove(i11);
                    this.f14871r0--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(@NotNull Collection<? extends Object> collection) {
            int i10 = this.f14871r0;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i10 != this.f14871r0;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(@NotNull Collection<? extends Object> collection) {
            int i10 = this.f14871r0;
            int i11 = i10 - 1;
            int i12 = this.f14870q0;
            if (i12 <= i11) {
                while (true) {
                    List<T> list = this.f14869p0;
                    if (!collection.contains(list.get(i11))) {
                        list.remove(i11);
                        this.f14871r0--;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11--;
                }
            }
            return i10 != this.f14871r0;
        }

        @Override // java.util.List
        public final T set(int i10, T t10) {
            MutableVectorKt.access$checkIndex(this, i10);
            return this.f14869p0.set(i10 + this.f14870q0, t10);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f14871r0 - this.f14870q0;
        }

        @Override // java.util.List
        @NotNull
        public final List<T> subList(int i10, int i11) {
            MutableVectorKt.access$checkSubIndex(this, i10, i11);
            return new b(i10, i11, this);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List
        public final void add(int i10, T t10) {
            this.f14869p0.add(i10 + this.f14870q0, t10);
            this.f14871r0++;
        }

        @Override // java.util.List
        @NotNull
        public final ListIterator<T> listIterator(int i10) {
            return new c(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) CollectionToArray.toArray(this, tArr);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(@NotNull Collection<? extends T> collection) {
            this.f14869p0.addAll(this.f14871r0, collection);
            this.f14871r0 = collection.size() + this.f14871r0;
            return collection.size() > 0;
        }

        @Override // java.util.List
        public final T remove(int i10) {
            MutableVectorKt.access$checkIndex(this, i10);
            T tRemove = this.f14869p0.remove(i10 + this.f14870q0);
            this.f14871r0--;
            return tRemove;
        }
    }

    /* JADX INFO: compiled from: MutableVector.kt */
    public static final class c<T> implements ListIterator<T>, KMutableListIterator {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final List<T> f14872p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f14873q0;

        public c(@NotNull List<T> list, int i10) {
            this.f14872p0 = list;
            this.f14873q0 = i10;
        }

        @Override // java.util.ListIterator
        public final void add(T t10) {
            this.f14872p0.add(this.f14873q0, t10);
            this.f14873q0++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f14873q0 < this.f14872p0.size();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f14873q0 > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            int i10 = this.f14873q0;
            this.f14873q0 = i10 + 1;
            return this.f14872p0.get(i10);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f14873q0;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            int i10 = this.f14873q0 - 1;
            this.f14873q0 = i10;
            return this.f14872p0.get(i10);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f14873q0 - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            int i10 = this.f14873q0 - 1;
            this.f14873q0 = i10;
            this.f14872p0.remove(i10);
        }

        @Override // java.util.ListIterator
        public final void set(T t10) {
            this.f14872p0.set(this.f14873q0, t10);
        }
    }

    @PublishedApi
    public MutableVector(@NotNull T[] tArr, int i10) {
        this.content = tArr;
        this.size = i10;
    }

    public final boolean add(T element) {
        ensureCapacity(this.size + 1);
        T[] tArr = this.content;
        int i10 = this.size;
        tArr[i10] = element;
        this.size = i10 + 1;
        return true;
    }

    public final boolean addAll(int index, @NotNull List<? extends T> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        ensureCapacity(elements.size() + this.size);
        T[] tArr = this.content;
        if (index != this.size) {
            ArraysKt___ArraysJvmKt.copyInto(tArr, tArr, elements.size() + index, index, this.size);
        }
        int size = elements.size();
        for (int i10 = 0; i10 < size; i10++) {
            tArr[index + i10] = elements.get(i10);
        }
        this.size = elements.size() + this.size;
        return true;
    }

    public final boolean any(@NotNull Function1<? super T, Boolean> predicate) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i10 = 0;
            while (!predicate.invoke(content[i10]).booleanValue()) {
                i10++;
                if (i10 >= size) {
                }
            }
            return true;
        }
        return false;
    }

    @NotNull
    public final List<T> asMutableList() {
        a aVar = this.f14866q0;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.f14866q0 = aVar2;
        return aVar2;
    }

    public final void clear() {
        T[] tArr = this.content;
        int size = getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                this.size = 0;
                return;
            }
            tArr[size] = null;
        }
    }

    public final boolean contains(T element) {
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i10 = 0; !Intrinsics.areEqual(getContent()[i10], element); i10++) {
                if (i10 != size) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean containsAll(@NotNull List<? extends T> elements) {
        int size = elements.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!contains(elements.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final boolean contentEquals(@NotNull MutableVector<T> other) {
        if (other.size != this.size) {
            return false;
        }
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i10 = 0; Intrinsics.areEqual(other.getContent()[i10], getContent()[i10]); i10++) {
                if (i10 != size) {
                }
            }
            return false;
        }
        return true;
    }

    public final void ensureCapacity(int capacity) {
        T[] tArr = this.content;
        if (tArr.length < capacity) {
            T[] tArr2 = (T[]) Arrays.copyOf(tArr, Math.max(capacity, tArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(tArr2, "copyOf(this, newSize)");
            this.content = tArr2;
        }
    }

    public final T first() {
        if (isEmpty()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return getContent()[0];
    }

    @Nullable
    public final T firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return getContent()[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R fold(R initial, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i10 = 0;
            do {
                initial = operation.invoke(initial, content[i10]);
                i10++;
            } while (i10 < size);
        }
        return initial;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R foldIndexed(R initial, @NotNull Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i10 = 0;
            do {
                initial = operation.invoke(Integer.valueOf(i10), initial, content[i10]);
                i10++;
            } while (i10 < size);
        }
        return initial;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R foldRight(R initial, @NotNull Function2<? super T, ? super R, ? extends R> operation) {
        int size = getSize();
        if (size > 0) {
            int i10 = size - 1;
            T[] content = getContent();
            do {
                initial = operation.invoke(content[i10], initial);
                i10--;
            } while (i10 >= 0);
        }
        return initial;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R foldRightIndexed(R initial, @NotNull Function3<? super Integer, ? super T, ? super R, ? extends R> operation) {
        int size = getSize();
        if (size > 0) {
            int i10 = size - 1;
            T[] content = getContent();
            do {
                initial = operation.invoke(Integer.valueOf(i10), content[i10], initial);
                i10--;
            } while (i10 >= 0);
        }
        return initial;
    }

    public final void forEach(@NotNull Function1<? super T, Unit> block) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i10 = 0;
            do {
                block.invoke(content[i10]);
                i10++;
            } while (i10 < size);
        }
    }

    public final void forEachIndexed(@NotNull Function2<? super Integer, ? super T, Unit> block) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i10 = 0;
            do {
                block.invoke(Integer.valueOf(i10), content[i10]);
                i10++;
            } while (i10 < size);
        }
    }

    public final void forEachReversed(@NotNull Function1<? super T, Unit> block) {
        int size = getSize();
        if (size > 0) {
            int i10 = size - 1;
            T[] content = getContent();
            do {
                block.invoke(content[i10]);
                i10--;
            } while (i10 >= 0);
        }
    }

    public final void forEachReversedIndexed(@NotNull Function2<? super Integer, ? super T, Unit> block) {
        if (getSize() > 0) {
            int size = getSize() - 1;
            T[] content = getContent();
            do {
                block.invoke(Integer.valueOf(size), content[size]);
                size--;
            } while (size >= 0);
        }
    }

    public final T get(int index) {
        return getContent()[index];
    }

    @NotNull
    public final T[] getContent() {
        return this.content;
    }

    @NotNull
    public final IntRange getIndices() {
        return new IntRange(0, getSize() - 1);
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }

    public final int getSize() {
        return this.size;
    }

    public final int indexOf(T element) {
        int i10 = this.size;
        if (i10 <= 0) {
            return -1;
        }
        T[] tArr = this.content;
        int i11 = 0;
        while (!Intrinsics.areEqual(element, tArr[i11])) {
            i11++;
            if (i11 >= i10) {
                return -1;
            }
        }
        return i11;
    }

    public final int indexOfFirst(@NotNull Function1<? super T, Boolean> predicate) {
        int size = getSize();
        if (size <= 0) {
            return -1;
        }
        T[] content = getContent();
        int i10 = 0;
        while (!predicate.invoke(content[i10]).booleanValue()) {
            i10++;
            if (i10 >= size) {
                return -1;
            }
        }
        return i10;
    }

    public final int indexOfLast(@NotNull Function1<? super T, Boolean> predicate) {
        int size = getSize();
        if (size <= 0) {
            return -1;
        }
        int i10 = size - 1;
        T[] content = getContent();
        while (!predicate.invoke(content[i10]).booleanValue()) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
        }
        return i10;
    }

    public final boolean isEmpty() {
        return this.size == 0;
    }

    public final boolean isNotEmpty() {
        return this.size != 0;
    }

    public final T last() {
        if (isEmpty()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return getContent()[getSize() - 1];
    }

    public final int lastIndexOf(T element) {
        int i10 = this.size;
        if (i10 <= 0) {
            return -1;
        }
        int i11 = i10 - 1;
        T[] tArr = this.content;
        while (!Intrinsics.areEqual(element, tArr[i11])) {
            i11--;
            if (i11 < 0) {
                return -1;
            }
        }
        return i11;
    }

    @Nullable
    public final T lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return getContent()[getSize() - 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <R> R[] map(Function1<? super T, ? extends R> transform) {
        int size = getSize();
        Intrinsics.reifiedOperationMarker(0, "R");
        R[] rArr = (R[]) new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            rArr[i10] = transform.invoke(getContent()[i10]);
        }
        return rArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <R> R[] mapIndexed(Function2<? super Integer, ? super T, ? extends R> transform) {
        int size = getSize();
        Intrinsics.reifiedOperationMarker(0, "R");
        R[] rArr = (R[]) new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            rArr[i10] = transform.invoke(Integer.valueOf(i10), getContent()[i10]);
        }
        return rArr;
    }

    public final /* synthetic */ <R> MutableVector<R> mapIndexedNotNull(Function2<? super Integer, ? super T, ? extends R> transform) {
        int size = getSize();
        int i10 = 0;
        Intrinsics.reifiedOperationMarker(0, "R?");
        Object[] objArr = new Object[size];
        if (size > 0) {
            T[] content = getContent();
            int i11 = 0;
            do {
                R rInvoke = transform.invoke(Integer.valueOf(i10), content[i10]);
                if (rInvoke != null) {
                    objArr[i11] = rInvoke;
                    i11++;
                }
                i10++;
            } while (i10 < size);
            i10 = i11;
        }
        return new MutableVector<>(objArr, i10);
    }

    public final /* synthetic */ <R> MutableVector<R> mapNotNull(Function1<? super T, ? extends R> transform) {
        int size = getSize();
        int i10 = 0;
        Intrinsics.reifiedOperationMarker(0, "R?");
        Object[] objArr = new Object[size];
        if (size > 0) {
            T[] content = getContent();
            int i11 = 0;
            do {
                R rInvoke = transform.invoke(content[i10]);
                if (rInvoke != null) {
                    objArr[i11] = rInvoke;
                    i11++;
                }
                i10++;
            } while (i10 < size);
            i10 = i11;
        }
        return new MutableVector<>(objArr, i10);
    }

    public final void minusAssign(T element) {
        remove(element);
    }

    public final void plusAssign(T element) {
        add(element);
    }

    public final boolean remove(T element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(@NotNull List<? extends T> elements) {
        int i10 = this.size;
        int size = elements.size();
        for (int i11 = 0; i11 < size; i11++) {
            remove(elements.get(i11));
        }
        return i10 != this.size;
    }

    public final T removeAt(int index) {
        T[] tArr = this.content;
        T t10 = tArr[index];
        if (index != getSize() - 1) {
            ArraysKt___ArraysJvmKt.copyInto(tArr, tArr, index, index + 1, this.size);
        }
        int i10 = this.size - 1;
        this.size = i10;
        tArr[i10] = null;
        return t10;
    }

    public final void removeIf(@NotNull Function1<? super T, Boolean> predicate) {
        int size = getSize();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            if (predicate.invoke(getContent()[i11]).booleanValue()) {
                i10++;
            } else if (i10 > 0) {
                getContent()[i11 - i10] = getContent()[i11];
            }
        }
        int i12 = size - i10;
        ArraysKt___ArraysJvmKt.fill(getContent(), (Object) null, i12, size);
        setSize(i12);
    }

    public final void removeRange(int start, int end) {
        if (end > start) {
            int i10 = this.size;
            if (end < i10) {
                T[] tArr = this.content;
                ArraysKt___ArraysJvmKt.copyInto(tArr, tArr, start, end, i10);
            }
            int i11 = this.size - (end - start);
            int size = getSize() - 1;
            if (i11 <= size) {
                int i12 = i11;
                while (true) {
                    this.content[i12] = null;
                    if (i12 == size) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.size = i11;
        }
    }

    public final boolean retainAll(@NotNull Collection<? extends T> elements) {
        int i10 = this.size;
        for (int size = getSize() - 1; -1 < size; size--) {
            if (!elements.contains(getContent()[size])) {
                removeAt(size);
            }
        }
        return i10 != this.size;
    }

    public final boolean reversedAny(@NotNull Function1<? super T, Boolean> predicate) {
        int size = getSize();
        if (size <= 0) {
            return false;
        }
        int i10 = size - 1;
        T[] content = getContent();
        while (!predicate.invoke(content[i10]).booleanValue()) {
            i10--;
            if (i10 < 0) {
                return false;
            }
        }
        return true;
    }

    public final T set(int index, T element) {
        T[] tArr = this.content;
        T t10 = tArr[index];
        tArr[index] = element;
        return t10;
    }

    public final void setContent(@NotNull T[] tArr) {
        this.content = tArr;
    }

    @PublishedApi
    public final void setSize(int newSize) {
        this.size = newSize;
    }

    public final void sortWith(@NotNull Comparator<T> comparator) {
        ArraysKt___ArraysJvmKt.sortWith(this.content, comparator, 0, this.size);
    }

    public final int sumBy(@NotNull Function1<? super T, Integer> selector) {
        int size = getSize();
        int iIntValue = 0;
        if (size > 0) {
            T[] content = getContent();
            int i10 = 0;
            do {
                iIntValue += selector.invoke(content[i10]).intValue();
                i10++;
            } while (i10 < size);
        }
        return iIntValue;
    }

    @PublishedApi
    @NotNull
    public final Void throwNoSuchElementException() {
        throw new NoSuchElementException("MutableVector contains no element matching the predicate.");
    }

    public final boolean containsAll(@NotNull Collection<? extends T> elements) {
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public final T firstOrNull(@NotNull Function1<? super T, Boolean> predicate) {
        int size = getSize();
        if (size <= 0) {
            return null;
        }
        T[] content = getContent();
        int i10 = 0;
        do {
            T t10 = content[i10];
            if (predicate.invoke(t10).booleanValue()) {
                return t10;
            }
            i10++;
        } while (i10 < size);
        return null;
    }

    public final void add(int index, T element) {
        ensureCapacity(this.size + 1);
        T[] tArr = this.content;
        int i10 = this.size;
        if (index != i10) {
            ArraysKt___ArraysJvmKt.copyInto(tArr, tArr, index + 1, index, i10);
        }
        tArr[index] = element;
        this.size++;
    }

    public final T first(@NotNull Function1<? super T, Boolean> predicate) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i10 = 0;
            do {
                T t10 = content[i10];
                if (predicate.invoke(t10).booleanValue()) {
                    return t10;
                }
                i10++;
            } while (i10 < size);
        }
        throwNoSuchElementException();
        throw new KotlinNothingValueException();
    }

    @Nullable
    public final T lastOrNull(@NotNull Function1<? super T, Boolean> predicate) {
        int size = getSize();
        if (size <= 0) {
            return null;
        }
        int i10 = size - 1;
        T[] content = getContent();
        do {
            T t10 = content[i10];
            if (predicate.invoke(t10).booleanValue()) {
                return t10;
            }
            i10--;
        } while (i10 >= 0);
        return null;
    }

    public final T last(@NotNull Function1<? super T, Boolean> predicate) {
        int size = getSize();
        if (size > 0) {
            int i10 = size - 1;
            T[] content = getContent();
            do {
                T t10 = content[i10];
                if (predicate.invoke(t10).booleanValue()) {
                    return t10;
                }
                i10--;
            } while (i10 >= 0);
        }
        throwNoSuchElementException();
        throw new KotlinNothingValueException();
    }

    public final boolean removeAll(@NotNull MutableVector<T> elements) {
        int i10 = this.size;
        int size = elements.getSize() - 1;
        if (size >= 0) {
            int i11 = 0;
            while (true) {
                remove(elements.getContent()[i11]);
                if (i11 == size) {
                    break;
                }
                i11++;
            }
        }
        return i10 != this.size;
    }

    public final boolean containsAll(@NotNull MutableVector<T> elements) {
        IntRange intRange = new IntRange(0, elements.getSize() - 1);
        int first = intRange.getFirst();
        int last = intRange.getLast();
        if (first <= last) {
            while (contains(elements.getContent()[first])) {
                if (first != last) {
                    first++;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean removeAll(@NotNull Collection<? extends T> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        int i10 = this.size;
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i10 != this.size;
    }

    public final boolean addAll(int index, @NotNull MutableVector<T> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        ensureCapacity(this.size + elements.size);
        T[] tArr = this.content;
        int i10 = this.size;
        if (index != i10) {
            ArraysKt___ArraysJvmKt.copyInto(tArr, tArr, elements.size + index, index, i10);
        }
        ArraysKt___ArraysJvmKt.copyInto(elements.content, tArr, index, 0, elements.size);
        this.size += elements.size;
        return true;
    }

    @PublishedApi
    public static /* synthetic */ void getContent$annotations() {
    }

    public final boolean addAll(@NotNull List<? extends T> elements) {
        return addAll(getSize(), (List) elements);
    }

    public final boolean addAll(@NotNull MutableVector<T> elements) {
        return addAll(getSize(), elements);
    }

    public final boolean addAll(@NotNull T[] elements) {
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(this.size + elements.length);
        ArraysKt___ArraysJvmKt.copyInto$default(elements, this.content, this.size, 0, 0, 12, (Object) null);
        this.size += elements.length;
        return true;
    }

    public final boolean addAll(int index, @NotNull Collection<? extends T> elements) {
        int i10 = 0;
        if (elements.isEmpty()) {
            return false;
        }
        ensureCapacity(elements.size() + this.size);
        T[] tArr = this.content;
        if (index != this.size) {
            ArraysKt___ArraysJvmKt.copyInto(tArr, tArr, elements.size() + index, index, this.size);
        }
        for (T t10 : elements) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            tArr[i10 + index] = t10;
            i10 = i11;
        }
        this.size = elements.size() + this.size;
        return true;
    }

    public final boolean addAll(@NotNull Collection<? extends T> elements) {
        return addAll(this.size, elements);
    }
}
