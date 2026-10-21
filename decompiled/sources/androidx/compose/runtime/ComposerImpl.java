package androidx.compose.runtime;

import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.changelist.ComposerChangeListWriter;
import androidx.compose.runtime.changelist.FixupList;
import androidx.compose.runtime.collection.IntMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.ListUtilsKt;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.exifinterface.media.ExifInterface;
import bk.f;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import m0.i;
import m0.l;
import m0.t;
import m0.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\f\n\u0002\u0010\u0005\n\u0002\u0010\n\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0004\u0085\u0001æ\u0001BY\u0012\f\u0010\u0089\u0001\u001a\u0007\u0012\u0002\b\u00030\u0084\u0001\u0012\u0007\u0010Ý\u0001\u001a\u00020Q\u0012\b\u0010Þ\u0001\u001a\u00030 \u0001\u0012\u000f\u0010á\u0001\u001a\n\u0012\u0005\u0012\u00030à\u00010ß\u0001\u0012\b\u0010â\u0001\u001a\u00030¨\u0001\u0012\b\u0010ã\u0001\u001a\u00030¨\u0001\u0012\b\u0010\u008f\u0001\u001a\u00030\u008a\u0001¢\u0006\u0006\bä\u0001\u0010å\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\b\u0010\u0006\u001a\u00020\u0004H\u0017J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\b\u0010\b\u001a\u00020\u0004H\u0017J\b\u0010\t\u001a\u00020\u0004H\u0017J\b\u0010\n\u001a\u00020\u0004H\u0017J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017J\b\u0010\u000e\u001a\u00020\u0004H\u0017J\u000f\u0010\u0011\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u000f\u0010\u0014\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0016\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0010J\u000f\u0010\u001a\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J\u001c\u0010 \u001a\u00020\u0004\"\u0004\b\u0000\u0010\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016J\b\u0010!\u001a\u00020\u0004H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016J\u001a\u0010#\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010$\u001a\u00020\u0004H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016J\b\u0010&\u001a\u00020\u0004H\u0016J\u0006\u0010'\u001a\u00020\u0004J\u0006\u0010(\u001a\u00020\u0004J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0002H\u0016JB\u00100\u001a\u00020\u0004\"\u0004\b\u0000\u0010+\"\u0004\b\u0001\u0010\u001d2\u0006\u0010,\u001a\u00028\u00002\u001d\u0010/\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040-¢\u0006\u0002\b.H\u0016¢\u0006\u0004\b0\u00101J\u001c\u00104\u001a\u00020\u000b2\b\u00102\u001a\u0004\u0018\u00010\u000b2\b\u00103\u001a\u0004\u0018\u00010\u000bH\u0017J\n\u00105\u001a\u0004\u0018\u00010\u000bH\u0001J\n\u00106\u001a\u0004\u0018\u00010\u000bH\u0001J\u0012\u00107\u001a\u00020\u00172\b\u0010,\u001a\u0004\u0018\u00010\u000bH\u0017J\u0012\u00108\u001a\u00020\u00172\b\u0010,\u001a\u0004\u0018\u00010\u000bH\u0017J\u0010\u00107\u001a\u00020\u00172\u0006\u0010,\u001a\u000209H\u0017J\u0010\u00107\u001a\u00020\u00172\u0006\u0010,\u001a\u00020:H\u0017J\u0010\u00107\u001a\u00020\u00172\u0006\u0010,\u001a\u00020;H\u0017J\u0010\u00107\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u0017H\u0017J\u0010\u00107\u001a\u00020\u00172\u0006\u0010,\u001a\u00020<H\u0017J\u0010\u00107\u001a\u00020\u00172\u0006\u0010,\u001a\u00020=H\u0017J\u0010\u00107\u001a\u00020\u00172\u0006\u0010,\u001a\u00020>H\u0017J\u0010\u00107\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u0002H\u0017J,\u0010@\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d2\u0006\u0010?\u001a\u00020\u00172\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0087\b¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010\u000bH\u0001J\u0012\u0010C\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010\u000bH\u0001J\u0016\u0010E\u001a\u00020\u00042\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00040\u001eH\u0016J\u0014\u0010G\u001a\u00020\u00042\n\u0010,\u001a\u0006\u0012\u0002\b\u00030FH\u0017J\b\u0010H\u001a\u00020\u0004H\u0017J#\u0010K\u001a\u00020\u00042\u0012\u0010J\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030F0IH\u0017¢\u0006\u0004\bK\u0010LJ\b\u0010M\u001a\u00020\u0004H\u0017J#\u0010O\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000NH\u0017¢\u0006\u0004\bO\u0010PJ\b\u0010R\u001a\u00020QH\u0016J!\u0010X\u001a\u00020\u00172\u0006\u0010T\u001a\u00020S2\b\u0010U\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\bV\u0010WJ\u000f\u0010[\u001a\u00020\u0002H\u0001¢\u0006\u0004\bY\u0010ZJ\b\u0010\\\u001a\u00020\u0004H\u0017J\b\u0010]\u001a\u00020\u0004H\u0017J\u0010\u0010^\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u0017H\u0017J\u0010\u0010_\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\n\u0010a\u001a\u0004\u0018\u00010`H\u0017J\u001e\u0010d\u001a\u00020\u00042\n\u0010,\u001a\u0006\u0012\u0002\b\u00030b2\b\u0010c\u001a\u0004\u0018\u00010\u000bH\u0017J$\u0010i\u001a\u00020\u00042\u001a\u0010h\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020g\u0012\u0006\u0012\u0004\u0018\u00010g0f0eH\u0017J\u0010\u0010k\u001a\u00020\u00042\u0006\u0010k\u001a\u00020jH\u0017J\u0018\u0010l\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010k\u001a\u00020jH\u0017J\b\u0010m\u001a\u00020\u0004H\u0017J\b\u0010n\u001a\u00020\u0004H\u0016J6\u0010u\u001a\u00020\u00042\u0012\u0010p\u001a\u000e\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020\u000b0o2\u0011\u0010r\u001a\r\u0012\u0004\u0012\u00020\u00040\u001e¢\u0006\u0002\bqH\u0000¢\u0006\u0004\bs\u0010tJ\u001d\u0010x\u001a\u00020\u00042\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\u001eH\u0000¢\u0006\u0004\bv\u0010wJ#\u0010{\u001a\u00020\u00172\u0012\u0010p\u001a\u000e\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020\u000b0oH\u0000¢\u0006\u0004\by\u0010zJ\u000f\u0010}\u001a\u00020\u0004H\u0000¢\u0006\u0004\b|\u0010\u0010J\u000f\u0010\u007f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b~\u0010ZJ\u000b\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u000bH\u0016J\u0013\u0010\u0081\u0001\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u0083\u0001\u001a\u00020\u00042\u0007\u0010T\u001a\u00030\u0082\u0001H\u0016R$\u0010\u0089\u0001\u001a\u0007\u0012\u0002\b\u00030\u0084\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R \u0010\u008f\u0001\u001a\u00030\u008a\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R)\u0010\u0094\u0001\u001a\u00020\u00172\u0007\u0010\u0090\u0001\u001a\u00020\u00178\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0005\b\u0093\u0001\u0010\u0019R)\u0010\u0097\u0001\u001a\u00020\u00172\u0007\u0010\u0090\u0001\u001a\u00020\u00178\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\b\u0095\u0001\u0010\u0092\u0001\u001a\u0005\b\u0096\u0001\u0010\u0019R*\u0010\u009f\u0001\u001a\u00030\u0098\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R*\u0010§\u0001\u001a\u00030 \u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R,\u0010¯\u0001\u001a\u0005\u0018\u00010¨\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R0\u0010³\u0001\u001a\u00020\u00172\u0007\u0010\u0090\u0001\u001a\u00020\u00178\u0016@RX\u0097\u000e¢\u0006\u0016\n\u0006\b°\u0001\u0010\u0092\u0001\u0012\u0005\b²\u0001\u0010\u0010\u001a\u0005\b±\u0001\u0010\u0019R0\u0010·\u0001\u001a\u00020\u00022\u0007\u0010\u0090\u0001\u001a\u00020\u00028\u0016@RX\u0097\u000e¢\u0006\u0016\n\u0006\b´\u0001\u0010¡\u0001\u0012\u0005\b¶\u0001\u0010\u0010\u001a\u0005\bµ\u0001\u0010ZR\u0016\u0010¹\u0001\u001a\u00020\u00178@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010\u0019R\u0016\u0010»\u0001\u001a\u00020\u00178@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bº\u0001\u0010\u0019R\u0018\u0010¿\u0001\u001a\u00030¼\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\b½\u0001\u0010¾\u0001R\u001d\u0010Â\u0001\u001a\u00020\u00178VX\u0097\u0004¢\u0006\u000e\u0012\u0005\bÁ\u0001\u0010\u0010\u001a\u0005\bÀ\u0001\u0010\u0019R\u001d\u0010Å\u0001\u001a\u00020\u00178VX\u0097\u0004¢\u0006\u000e\u0012\u0005\bÄ\u0001\u0010\u0010\u001a\u0005\bÃ\u0001\u0010\u0019R\u0016\u0010Ç\u0001\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÆ\u0001\u0010ZR\u0018\u0010Ë\u0001\u001a\u00030È\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÉ\u0001\u0010Ê\u0001R\u0018\u0010Ï\u0001\u001a\u00030Ì\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÍ\u0001\u0010Î\u0001R\u0016\u0010Ñ\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÐ\u0001\u0010ZR\u0019\u0010Ô\u0001\u001a\u0004\u0018\u00010S8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÒ\u0001\u0010Ó\u0001R\u0013\u0010Ö\u0001\u001a\u00020\u00178F¢\u0006\u0007\u001a\u0005\bÕ\u0001\u0010\u0019R\u001a\u0010Ù\u0001\u001a\u0005\u0018\u00010\u0082\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b×\u0001\u0010Ø\u0001R\u0019\u0010Ü\u0001\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÚ\u0001\u0010Û\u0001¨\u0006ç\u0001"}, d2 = {"Landroidx/compose/runtime/ComposerImpl;", "Landroidx/compose/runtime/Composer;", "", "key", "", "startReplaceableGroup", "endReplaceableGroup", "startReplaceGroup", "endReplaceGroup", "startDefaults", "endDefaults", "", "dataKey", "startMovableGroup", "endMovableGroup", "changesApplied$runtime_release", "()V", "changesApplied", "collectParameterInformation", "dispose$runtime_release", "dispose", "deactivate$runtime_release", "deactivate", "", "forceRecomposeScopes$runtime_release", "()Z", "forceRecomposeScopes", "startNode", "startReusableNode", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "factory", "createNode", "useNode", "endNode", "startReusableGroup", "endReusableGroup", "disableReusing", "enableReusing", "startReuseFromRoot", "endReuseFromRoot", "marker", "endToMarker", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "value", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "apply", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", Parameters.DIRECTION.LEFT, Parameters.DIRECTION.RIGHT, "joinKey", "nextSlot", "nextSlotForCache", "changed", "changedInstance", "", "", "", "", "", "", "invalid", "cache", "(ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "updateValue", "updateCachedValue", "effect", "recordSideEffect", "Landroidx/compose/runtime/ProvidedValue;", "startProvider", "endProvider", "", "values", "startProviders", "([Landroidx/compose/runtime/ProvidedValue;)V", "endProviders", "Landroidx/compose/runtime/CompositionLocal;", "consume", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "Landroidx/compose/runtime/CompositionContext;", "buildContext", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "instance", "tryImminentInvalidation$runtime_release", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Z", "tryImminentInvalidation", "parentKey$runtime_release", "()I", "parentKey", "skipCurrentGroup", "skipToGroupEnd", "deactivateToEndGroup", "startRestartGroup", "Landroidx/compose/runtime/ScopeUpdateScope;", "endRestartGroup", "Landroidx/compose/runtime/MovableContent;", "parameter", "insertMovableContent", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "insertMovableContentReferences", "", "sourceInformation", "sourceInformationMarkerStart", "sourceInformationMarkerEnd", "disableSourceInformation", "Landroidx/compose/runtime/collection/ScopeMap;", "invalidationsRequested", "Landroidx/compose/runtime/Composable;", "content", "composeContent$runtime_release", "(Landroidx/compose/runtime/collection/ScopeMap;Lkotlin/jvm/functions/Function2;)V", "composeContent", "prepareCompose$runtime_release", "(Lkotlin/jvm/functions/Function0;)V", "prepareCompose", "recompose$runtime_release", "(Landroidx/compose/runtime/collection/ScopeMap;)Z", "recompose", "verifyConsistent$runtime_release", "verifyConsistent", "stacksSize$runtime_release", "stacksSize", "rememberedValue", "updateRememberedValue", "Landroidx/compose/runtime/RecomposeScope;", "recordUsed", "Landroidx/compose/runtime/Applier;", "a", "Landroidx/compose/runtime/Applier;", "getApplier", "()Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/ControlledComposition;", "g", "Landroidx/compose/runtime/ControlledComposition;", "getComposition", "()Landroidx/compose/runtime/ControlledComposition;", "composition", "<set-?>", "F", "Z", "isComposing$runtime_release", "isComposing", "G", "isDisposed$runtime_release", "isDisposed", "Landroidx/compose/runtime/SlotReader;", "H", "Landroidx/compose/runtime/SlotReader;", "getReader$runtime_release", "()Landroidx/compose/runtime/SlotReader;", "setReader$runtime_release", "(Landroidx/compose/runtime/SlotReader;)V", "reader", "Landroidx/compose/runtime/SlotTable;", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "Landroidx/compose/runtime/SlotTable;", "getInsertTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "setInsertTable$runtime_release", "(Landroidx/compose/runtime/SlotTable;)V", "insertTable", "Landroidx/compose/runtime/changelist/ChangeList;", "M", "Landroidx/compose/runtime/changelist/ChangeList;", "getDeferredChanges$runtime_release", "()Landroidx/compose/runtime/changelist/ChangeList;", "setDeferredChanges$runtime_release", "(Landroidx/compose/runtime/changelist/ChangeList;)V", "deferredChanges", TransactionType.TRANSACTION_TYPE_CONTACTLESS_CODE, "getInserting", "getInserting$annotations", "inserting", "R", "getCompoundKeyHash", "getCompoundKeyHash$annotations", "compoundKeyHash", "getAreChildrenComposing$runtime_release", "areChildrenComposing", "getHasPendingChanges$runtime_release", "hasPendingChanges", "Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "applyCoroutineContext", "getDefaultsInvalid", "getDefaultsInvalid$annotations", "defaultsInvalid", "getSkipping", "getSkipping$annotations", "skipping", "getCurrentMarker", "currentMarker", "Landroidx/compose/runtime/tooling/CompositionData;", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "compositionData", "Landroidx/compose/runtime/CompositionLocalMap;", "getCurrentCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "currentCompositionLocalMap", "getChangeCount$runtime_release", "changeCount", "getCurrentRecomposeScope$runtime_release", "()Landroidx/compose/runtime/RecomposeScopeImpl;", "currentRecomposeScope", "getHasInvalidations", "hasInvalidations", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "recomposeScope", "getRecomposeScopeIdentity", "()Ljava/lang/Object;", "recomposeScopeIdentity", "parentContext", "slotTable", "", "Landroidx/compose/runtime/RememberObserver;", "abandonSet", "changes", "lateChanges", "<init>", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/SlotTable;Ljava/util/Set;Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/ControlledComposition;)V", "b", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 4 BitwiseOperators.kt\nandroidx/compose/runtime/BitwiseOperatorsKt\n+ 5 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 8 CompositionLocalMap.kt\nandroidx/compose/runtime/CompositionLocalMapKt\n+ 9 Composer.kt\nandroidx/compose/runtime/GroupKind\n+ 10 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n+ 11 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 12 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 13 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 14 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 15 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 16 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4584:1\n3960#1,3:4594\n3973#1:4597\n3974#1:4599\n3964#1,11:4600\n3960#1,3:4638\n3973#1:4641\n3974#1:4643\n3964#1,11:4644\n3983#1,3:4657\n3996#1:4660\n3997#1:4662\n3987#1,11:4663\n3983#1,3:4674\n3996#1:4677\n3997#1:4679\n3987#1,11:4680\n3960#1,3:4692\n3973#1:4695\n3974#1:4697\n3964#1,11:4698\n3983#1,3:4709\n3996#1:4712\n3997#1:4714\n3987#1,11:4715\n3446#1,8:4760\n3455#1,3:4783\n3973#1:4902\n3974#1:4904\n3973#1:4905\n3974#1:4907\n3973#1:4908\n3974#1:4910\n3973#1:4911\n3974#1:4913\n3996#1:4915\n3997#1:4917\n3996#1:4918\n3997#1:4920\n3996#1:4921\n3997#1:4923\n3996#1:4924\n3997#1:4926\n1#2:4585\n158#3,8:4586\n158#3,8:4748\n158#3,4:4756\n163#3,3:4786\n158#3,4:4880\n163#3,3:4892\n26#4:4598\n26#4:4642\n22#4:4661\n22#4:4678\n26#4:4691\n26#4:4696\n22#4:4713\n26#4:4903\n26#4:4906\n26#4:4909\n26#4:4912\n26#4:4914\n22#4:4916\n22#4:4919\n22#4:4922\n22#4:4925\n22#4:4927\n46#5,5:4611\n46#5,3:4827\n50#5:4865\n4553#6,7:4616\n4553#6,7:4623\n4553#6,7:4726\n4553#6,7:4733\n4553#6,7:4799\n4553#6,7:4806\n4553#6,7:4813\n4553#6,7:4820\n4553#6,7:4866\n4553#6,7:4873\n4553#6,7:4895\n33#7,7:4630\n82#8:4637\n4470#9:4655\n4471#9:4656\n182#10,4:4740\n182#10,4:4768\n192#10,8:4772\n187#10,3:4780\n187#10,3:4790\n182#10,8:4884\n33#11,4:4744\n38#11:4789\n33#11,6:4793\n82#11,3:4928\n33#11,4:4931\n85#11,2:4935\n38#11:4937\n87#11:4938\n391#12,4:4830\n363#12,6:4834\n373#12,3:4841\n376#12,2:4845\n396#12,2:4847\n379#12,6:4849\n398#12:4855\n1810#13:4840\n1672#13:4844\n392#14,6:4856\n398#14,2:4863\n48#15:4862\n1855#16,2:4939\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n*L\n1495#1:4594,3\n1495#1:4597\n1495#1:4599\n1495#1:4600,11\n2457#1:4638,3\n2457#1:4641\n2457#1:4643\n2457#1:4644,11\n2604#1:4657,3\n2604#1:4660\n2604#1:4662\n2604#1:4663,11\n2612#1:4674,3\n2612#1:4677\n2612#1:4679\n2612#1:4680,11\n3114#1:4692,3\n3114#1:4695\n3114#1:4697\n3114#1:4698,11\n3118#1:4709,3\n3118#1:4712\n3118#1:4714\n3118#1:4715,11\n3409#1:4760,8\n3409#1:4783,3\n3962#1:4902\n3962#1:4904\n3964#1:4905\n3964#1:4907\n3966#1:4908\n3966#1:4910\n3968#1:4911\n3968#1:4913\n3985#1:4915\n3985#1:4917\n3987#1:4918\n3987#1:4920\n3989#1:4921\n3989#1:4923\n3991#1:4924\n3991#1:4926\n1430#1:4586,8\n3350#1:4748,8\n3408#1:4756,4\n3408#1:4786,3\n3773#1:4880,4\n3773#1:4892,3\n1495#1:4598\n2457#1:4642\n2604#1:4661\n2612#1:4678\n3058#1:4691\n3114#1:4696\n3118#1:4713\n3962#1:4903\n3964#1:4906\n3966#1:4909\n3968#1:4912\n3973#1:4914\n3985#1:4916\n3987#1:4919\n3989#1:4922\n3991#1:4925\n3996#1:4927\n1755#1:4611,5\n3563#1:4827,3\n3563#1:4865\n1828#1:4616,7\n1841#1:4623,7\n3132#1:4726,7\n3145#1:4733,7\n3521#1:4799,7\n3526#1:4806,7\n3542#1:4813,7\n3562#1:4820,7\n3628#1:4866,7\n3635#1:4873,7\n3785#1:4895,7\n1888#1:4630,7\n2258#1:4637\n2463#1:4655\n2487#1:4656\n3327#1:4740,4\n3414#1:4768,4\n3415#1:4772,8\n3414#1:4780,3\n3327#1:4790,3\n3775#1:4884,8\n3329#1:4744,4\n3329#1:4789\n3473#1:4793,6\n3684#1:4928,3\n3684#1:4931,4\n3684#1:4935,2\n3684#1:4937\n3684#1:4938\n3566#1:4830,4\n3566#1:4834,6\n3566#1:4841,3\n3566#1:4845,2\n3566#1:4847,2\n3566#1:4849,6\n3566#1:4855\n3566#1:4840\n3566#1:4844\n3592#1:4856,6\n3592#1:4863,2\n3592#1:4862\n3716#1:4939,2\n*E\n"})
public final class ComposerImpl implements Composer {
    public static final int $stable = 8;
    public int A;
    public int B;
    public boolean C;

    @NotNull
    public final ComposerImpl$derivedStateObserver$1 D;

    @NotNull
    public final Stack<RecomposeScopeImpl> E;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public boolean isComposing;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public boolean isDisposed;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public SlotReader reader;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    public SlotTable insertTable;

    @NotNull
    public SlotWriter J;
    public boolean K;

    @Nullable
    public PersistentCompositionLocalMap L;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @Nullable
    public ChangeList deferredChanges;

    @NotNull
    public final ComposerChangeListWriter N;

    @NotNull
    public Anchor O;

    @NotNull
    public FixupList P;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public boolean inserting;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public int compoundKeyHash;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Applier<?> applier;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CompositionContext f14451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SlotTable f14452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Set<RememberObserver> f14453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ChangeList f14454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ChangeList f14455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ControlledComposition composition;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public v f14458i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14459j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14460k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14461l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public int[] f14462n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public MutableIntIntMap f14463o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f14464p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f14465q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f14466r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public IntMap<PersistentCompositionLocalMap> f14470v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14471w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f14473y;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Stack<v> f14457h = new Stack<>();

    @NotNull
    public final IntStack m = new IntStack();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final ArrayList f14467s = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final IntStack f14468t = new IntStack();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public PersistentCompositionLocalMap f14469u = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final IntStack f14472x = new IntStack();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f14474z = -1;

    /* JADX INFO: compiled from: Composer.kt */
    @SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$CompositionContextImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,4584:1\n1855#2,2:4585\n81#3:4587\n107#3,2:4588\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$CompositionContextImpl\n*L\n3851#1:4585,2\n3901#1:4587\n3901#1:4588,2\n*E\n"})
    public final class b extends CompositionContext {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f14476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f14477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f14478c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final CompositionObserverHolder f14479d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public HashSet f14480e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final LinkedHashSet f14481f = new LinkedHashSet();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final MutableState f14482g = SnapshotStateKt.mutableStateOf(PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf(), SnapshotStateKt.referentialEqualityPolicy());

        public b(int i10, boolean z10, @Nullable boolean z11, CompositionObserverHolder compositionObserverHolder) {
            this.f14476a = i10;
            this.f14477b = z10;
            this.f14478c = z11;
            this.f14479d = compositionObserverHolder;
        }

        public final void a() {
            LinkedHashSet<ComposerImpl> linkedHashSet = this.f14481f;
            if (!linkedHashSet.isEmpty()) {
                HashSet hashSet = this.f14480e;
                if (hashSet != null) {
                    for (ComposerImpl composerImpl : linkedHashSet) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            ((Set) it.next()).remove(composerImpl.f14452c);
                        }
                    }
                }
                linkedHashSet.clear();
            }
        }

        @Override // androidx.compose.runtime.CompositionContext
        @ComposableInferredTarget(scheme = "[0[0]]")
        public final void composeInitial$runtime_release(@NotNull ControlledComposition controlledComposition, @NotNull Function2<? super Composer, ? super Integer, Unit> function2) {
            ComposerImpl.this.f14451b.composeInitial$runtime_release(controlledComposition, function2);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void deletedMovableContent$runtime_release(@NotNull MovableContentStateReference movableContentStateReference) {
            ComposerImpl.this.f14451b.deletedMovableContent$runtime_release(movableContentStateReference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void doneComposing$runtime_release() {
            ComposerImpl.this.A--;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final boolean getCollectingCallByInformation$runtime_release() {
            return ComposerImpl.this.f14451b.getCollectingCallByInformation$runtime_release();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final boolean getCollectingParameterInformation$runtime_release() {
            return this.f14477b;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final boolean getCollectingSourceInformation$runtime_release() {
            return this.f14478c;
        }

        @Override // androidx.compose.runtime.CompositionContext
        @NotNull
        public final PersistentCompositionLocalMap getCompositionLocalScope$runtime_release() {
            return (PersistentCompositionLocalMap) this.f14482g.getValue();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final int getCompoundHashKey$runtime_release() {
            return this.f14476a;
        }

        @Override // androidx.compose.runtime.CompositionContext
        @NotNull
        public final CoroutineContext getEffectCoroutineContext() {
            return ComposerImpl.this.f14451b.getEffectCoroutineContext();
        }

        @Override // androidx.compose.runtime.CompositionContext
        @Nullable
        public final CompositionObserverHolder getObserverHolder$runtime_release() {
            return this.f14479d;
        }

        @Override // androidx.compose.runtime.CompositionContext
        @NotNull
        public final CoroutineContext getRecomposeCoroutineContext$runtime_release() {
            return CompositionKt.getRecomposeCoroutineContext(ComposerImpl.this.getComposition());
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void insertMovableContent$runtime_release(@NotNull MovableContentStateReference movableContentStateReference) {
            ComposerImpl.this.f14451b.insertMovableContent$runtime_release(movableContentStateReference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void invalidate$runtime_release(@NotNull ControlledComposition controlledComposition) {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.f14451b.invalidate$runtime_release(composerImpl.getComposition());
            composerImpl.f14451b.invalidate$runtime_release(controlledComposition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void invalidateScope$runtime_release(@NotNull RecomposeScopeImpl recomposeScopeImpl) {
            ComposerImpl.this.f14451b.invalidateScope$runtime_release(recomposeScopeImpl);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void movableContentStateReleased$runtime_release(@NotNull MovableContentStateReference movableContentStateReference, @NotNull MovableContentState movableContentState) {
            ComposerImpl.this.f14451b.movableContentStateReleased$runtime_release(movableContentStateReference, movableContentState);
        }

        @Override // androidx.compose.runtime.CompositionContext
        @Nullable
        public final MovableContentState movableContentStateResolve$runtime_release(@NotNull MovableContentStateReference movableContentStateReference) {
            return ComposerImpl.this.f14451b.movableContentStateResolve$runtime_release(movableContentStateReference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void recordInspectionTable$runtime_release(@NotNull Set<CompositionData> set) {
            HashSet hashSet = this.f14480e;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.f14480e = hashSet;
            }
            hashSet.add(set);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void registerComposer$runtime_release(@NotNull Composer composer) {
            Intrinsics.checkNotNull(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
            super.registerComposer$runtime_release((ComposerImpl) composer);
            this.f14481f.add(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void registerComposition$runtime_release(@NotNull ControlledComposition controlledComposition) {
            ComposerImpl.this.f14451b.registerComposition$runtime_release(controlledComposition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void reportRemovedComposition$runtime_release(@NotNull ControlledComposition controlledComposition) {
            ComposerImpl.this.f14451b.reportRemovedComposition$runtime_release(controlledComposition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void startComposing$runtime_release() {
            ComposerImpl.this.A++;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void unregisterComposer$runtime_release(@NotNull Composer composer) {
            HashSet<Set> hashSet = this.f14480e;
            if (hashSet != null) {
                for (Set set : hashSet) {
                    Intrinsics.checkNotNull(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                    set.remove(((ComposerImpl) composer).f14452c);
                }
            }
            TypeIntrinsics.asMutableCollection(this.f14481f).remove(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void unregisterComposition$runtime_release(@NotNull ControlledComposition controlledComposition) {
            ComposerImpl.this.f14451b.unregisterComposition$runtime_release(controlledComposition);
        }
    }

    /* JADX INFO: compiled from: Composer.kt */
    @SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$1$1\n+ 2 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n*L\n1#1,4584:1\n182#2,4:4585\n192#2,8:4597\n187#2,3:4608\n3446#3,8:4589\n3455#3,3:4605\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$1$1\n*L\n3355#1:4585,4\n3357#1:4597,8\n3355#1:4608,3\n3356#1:4589,8\n3356#1:4605,3\n*E\n"})
    public static final class c extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ChangeList f14485q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SlotReader f14486r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ MovableContentStateReference f14487s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ChangeList changeList, SlotReader slotReader, MovableContentStateReference movableContentStateReference) {
            super(0);
            this.f14485q0 = changeList;
            this.f14486r0 = slotReader;
            this.f14487s0 = movableContentStateReference;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ComposerImpl composerImpl = ComposerImpl.this;
            ComposerChangeListWriter composerChangeListWriter = composerImpl.N;
            ChangeList changeList = this.f14485q0;
            SlotReader slotReader = this.f14486r0;
            MovableContentStateReference movableContentStateReference = this.f14487s0;
            ChangeList changeList2 = composerChangeListWriter.getChangeList();
            try {
                composerChangeListWriter.setChangeList(changeList);
                SlotReader reader = composerImpl.getReader();
                int[] iArr = composerImpl.f14462n;
                IntMap intMap = composerImpl.f14470v;
                composerImpl.f14462n = null;
                composerImpl.f14470v = null;
                try {
                    composerImpl.setReader$runtime_release(slotReader);
                    ComposerChangeListWriter composerChangeListWriter2 = composerImpl.N;
                    boolean implicitRootStart = composerChangeListWriter2.getImplicitRootStart();
                    try {
                        composerChangeListWriter2.setImplicitRootStart(false);
                        composerImpl.m(movableContentStateReference.getContent$runtime_release(), movableContentStateReference.getLocals(), movableContentStateReference.getParameter(), true);
                        composerChangeListWriter2.setImplicitRootStart(implicitRootStart);
                        Unit unit = Unit.INSTANCE;
                        composerImpl.setReader$runtime_release(reader);
                        composerImpl.f14462n = iArr;
                        composerImpl.f14470v = intMap;
                        composerChangeListWriter.setChangeList(changeList2);
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        composerChangeListWriter2.setImplicitRootStart(implicitRootStart);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    composerImpl.setReader$runtime_release(reader);
                    composerImpl.f14462n = iArr;
                    composerImpl.f14470v = intMap;
                    throw th3;
                }
            } catch (Throwable th4) {
                composerChangeListWriter.setChangeList(changeList2);
                throw th4;
            }
        }
    }

    /* JADX INFO: compiled from: Composer.kt */
    public static final class d extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MovableContentStateReference f14489q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MovableContentStateReference movableContentStateReference) {
            super(0);
            this.f14489q0 = movableContentStateReference;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MovableContentStateReference movableContentStateReference = this.f14489q0;
            ComposerImpl.this.m(movableContentStateReference.getContent$runtime_release(), movableContentStateReference.getLocals(), movableContentStateReference.getParameter(), true);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Composer.kt */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MovableContent<Object> f14491p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Object f14492q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MovableContent<Object> movableContent, Object obj) {
            super(2);
            this.f14491p0 = movableContent;
            this.f14492q0 = obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 3) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(316014703, iIntValue, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:3293)");
                }
                this.f14491p0.getContent().invoke(this.f14492q0, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [androidx.compose.runtime.ComposerImpl$derivedStateObserver$1] */
    public ComposerImpl(@NotNull Applier<?> applier, @NotNull CompositionContext compositionContext, @NotNull SlotTable slotTable, @NotNull Set<RememberObserver> set, @NotNull ChangeList changeList, @NotNull ChangeList changeList2, @NotNull ControlledComposition controlledComposition) {
        this.applier = applier;
        this.f14451b = compositionContext;
        this.f14452c = slotTable;
        this.f14453d = set;
        this.f14454e = changeList;
        this.f14455f = changeList2;
        this.composition = controlledComposition;
        this.C = compositionContext.getCollectingSourceInformation$runtime_release() || compositionContext.getCollectingCallByInformation$runtime_release();
        this.D = new DerivedStateObserver() { // from class: androidx.compose.runtime.ComposerImpl$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public void done(@NotNull DerivedState<?> derivedState) {
                this.f14490a.A--;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public void start(@NotNull DerivedState<?> derivedState) {
                this.f14490a.A++;
            }
        };
        this.E = new Stack<>();
        SlotReader slotReaderOpenReader = slotTable.openReader();
        slotReaderOpenReader.close();
        this.reader = slotReaderOpenReader;
        SlotTable slotTable2 = new SlotTable();
        if (compositionContext.getCollectingSourceInformation$runtime_release()) {
            slotTable2.collectSourceInformation();
        }
        if (compositionContext.getCollectingCallByInformation$runtime_release()) {
            slotTable2.collectCalledByInformation();
        }
        this.insertTable = slotTable2;
        SlotWriter slotWriterOpenWriter = slotTable2.openWriter();
        slotWriterOpenWriter.close(true);
        this.J = slotWriterOpenWriter;
        this.N = new ComposerChangeListWriter(this, changeList);
        SlotReader slotReaderOpenReader2 = this.insertTable.openReader();
        try {
            Anchor anchor = slotReaderOpenReader2.anchor(0);
            slotReaderOpenReader2.close();
            this.O = anchor;
            this.P = new FixupList();
        } catch (Throwable th2) {
            slotReaderOpenReader2.close();
            throw th2;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00e9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int t(androidx.compose.runtime.ComposerImpl r19, int r20, boolean r21, int r22) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.t(androidx.compose.runtime.ComposerImpl, int, boolean, int):int");
    }

    public final int A(int i10) {
        int i11;
        if (i10 >= 0) {
            int[] iArr = this.f14462n;
            return (iArr == null || (i11 = iArr[i10]) < 0) ? this.reader.nodeCount(i10) : i11;
        }
        MutableIntIntMap mutableIntIntMap = this.f14463o;
        if (mutableIntIntMap == null || !mutableIntIntMap.contains(i10)) {
            return 0;
        }
        return mutableIntIntMap.get(i10);
    }

    public final void B() {
        if (!this.f14466r) {
            return;
        }
        ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected");
    }

    public final void a() {
        b();
        this.f14457h.clear();
        this.m.clear();
        this.f14468t.clear();
        this.f14472x.clear();
        this.f14470v = null;
        this.P.clear();
        this.compoundKeyHash = 0;
        this.A = 0;
        this.f14466r = false;
        this.inserting = false;
        this.f14473y = false;
        this.isComposing = false;
        this.f14465q = false;
        this.f14474z = -1;
        if (!this.reader.getClosed()) {
            this.reader.close();
        }
        if (this.J.getClosed()) {
            return;
        }
        k();
    }

    @Override // androidx.compose.runtime.Composer
    public <V, T> void apply(V value, @NotNull Function2<? super T, ? super V, Unit> block) {
        if (getInserting()) {
            this.P.updateNode(value, block);
        } else {
            this.N.updateNode(value, block);
        }
    }

    public final void b() {
        this.f14458i = null;
        this.f14459j = 0;
        this.f14460k = 0;
        this.compoundKeyHash = 0;
        this.f14466r = false;
        this.N.resetTransientState();
        this.E.clear();
        this.f14462n = null;
        this.f14463o = null;
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public CompositionContext buildContext() {
        v(206, ComposerKt.getReference());
        if (getInserting()) {
            SlotWriter.markGroup$default(this.J, 0, 1, null);
        }
        Object objNextSlot = nextSlot();
        a aVar = objNextSlot instanceof a ? (a) objNextSlot : null;
        if (aVar == null) {
            int compoundKeyHash = getCompoundKeyHash();
            boolean z10 = this.f14464p;
            boolean z11 = this.C;
            ControlledComposition composition = getComposition();
            CompositionImpl compositionImpl = composition instanceof CompositionImpl ? (CompositionImpl) composition : null;
            aVar = new a(new b(compoundKeyHash, z10, z11, compositionImpl != null ? compositionImpl.getObserverHolder() : null));
            updateValue(aVar);
        }
        PersistentCompositionLocalMap persistentCompositionLocalMapD = d();
        b bVar = aVar.f14475p0;
        bVar.f14482g.setValue(persistentCompositionLocalMapD);
        h(false);
        return bVar;
    }

    public final int c(int i10, int i11, int i12, int i13) {
        int iHashCode;
        Object objGroupAux;
        if (i10 == i12) {
            return i13;
        }
        SlotReader slotReader = this.reader;
        if (slotReader.hasObjectKey(i10)) {
            Object objGroupObjectKey = slotReader.groupObjectKey(i10);
            if (objGroupObjectKey == null) {
                iHashCode = 0;
            } else if (objGroupObjectKey instanceof Enum) {
                iHashCode = ((Enum) objGroupObjectKey).ordinal();
            } else {
                iHashCode = objGroupObjectKey instanceof MovableContent ? 126665345 : objGroupObjectKey.hashCode();
            }
        } else {
            int iGroupKey = slotReader.groupKey(i10);
            if (iGroupKey == 207 && (objGroupAux = slotReader.groupAux(i10)) != null && !Intrinsics.areEqual(objGroupAux, Composer.INSTANCE.getEmpty())) {
                iGroupKey = objGroupAux.hashCode();
            }
            iHashCode = iGroupKey;
        }
        if (iHashCode == 126665345) {
            return iHashCode;
        }
        int iParent = this.reader.parent(i10);
        if (iParent != i12) {
            i13 = c(iParent, n(iParent), i12, i13);
        }
        if (this.reader.hasObjectKey(i10)) {
            i11 = 0;
        }
        return Integer.rotateLeft(Integer.rotateLeft(i13, 3) ^ iHashCode, 3) ^ i11;
    }

    @ComposeCompilerApi
    public final <T> T cache(boolean invalid, @NotNull Function0<? extends T> block) {
        T t10 = (T) nextSlotForCache();
        if (t10 != Composer.INSTANCE.getEmpty() && !invalid) {
            return t10;
        }
        T tInvoke = block.invoke();
        updateCachedValue(tInvoke);
        return tInvoke;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(@Nullable Object value) {
        if (Intrinsics.areEqual(nextSlot(), value)) {
            return false;
        }
        updateValue(value);
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changedInstance(@Nullable Object value) {
        if (nextSlot() == value) {
            return false;
        }
        updateValue(value);
        return true;
    }

    public final void changesApplied$runtime_release() {
        this.f14470v = null;
    }

    @Override // androidx.compose.runtime.Composer
    public void collectParameterInformation() {
        this.f14464p = true;
        this.C = true;
        this.f14452c.collectSourceInformation();
        this.insertTable.collectSourceInformation();
        this.J.updateToTableMaps();
    }

    public final void composeContent$runtime_release(@NotNull ScopeMap<RecomposeScopeImpl, Object> invalidationsRequested, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        if (!this.f14454e.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Expected applyChanges() to have been called");
        }
        f(invalidationsRequested, content);
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public <T> T consume(@NotNull CompositionLocal<T> key) {
        return (T) CompositionLocalMapKt.read(d(), key);
    }

    @Override // androidx.compose.runtime.Composer
    public <T> void createNode(@NotNull Function0<? extends T> factory) {
        if (!this.f14466r) {
            ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f14466r = false;
        if (!getInserting()) {
            ComposerKt.composeImmediateRuntimeError("createNode() can only be called when inserting");
        }
        int iPeek = this.m.peek();
        SlotWriter slotWriter = this.J;
        Anchor anchor = slotWriter.anchor(slotWriter.getParent());
        this.f14460k++;
        this.P.createAndInsertNode(factory, iPeek, anchor);
    }

    public final PersistentCompositionLocalMap d() {
        PersistentCompositionLocalMap persistentCompositionLocalMap = this.L;
        return persistentCompositionLocalMap != null ? persistentCompositionLocalMap : e(this.reader.getParent());
    }

    public final void deactivate$runtime_release() {
        this.E.clear();
        this.f14467s.clear();
        this.f14454e.clear();
        this.f14470v = null;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void deactivateToEndGroup(boolean changed) {
        if (this.f14460k != 0) {
            ComposerKt.composeImmediateRuntimeError("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (getInserting()) {
            return;
        }
        if (!changed) {
            this.f14460k = this.reader.getParentNodes();
            this.reader.skipToGroupEnd();
            return;
        }
        int currentGroup = this.reader.getCurrentGroup();
        int currentEnd = this.reader.getCurrentEnd();
        this.N.deactivateCurrentGroup();
        ComposerKt.access$removeRange(this.f14467s, currentGroup, currentEnd);
        this.reader.skipToGroupEnd();
    }

    @Override // androidx.compose.runtime.Composer
    public void disableReusing() {
        this.f14473y = false;
    }

    @Override // androidx.compose.runtime.Composer
    public void disableSourceInformation() {
        this.C = false;
    }

    public final void dispose$runtime_release() {
        Object objBeginSection = Trace.INSTANCE.beginSection("Compose:Composer.dispose");
        try {
            this.f14451b.unregisterComposer$runtime_release(this);
            deactivate$runtime_release();
            getApplier().clear();
            this.isDisposed = true;
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.INSTANCE.endSection(objBeginSection);
        }
    }

    public final PersistentCompositionLocalMap e(int i10) {
        PersistentCompositionLocalMap persistentCompositionLocalMap;
        if (getInserting() && this.K) {
            int parent = this.J.getParent();
            while (parent > 0) {
                if (this.J.groupKey(parent) == 202 && Intrinsics.areEqual(this.J.groupObjectKey(parent), ComposerKt.getCompositionLocalMap())) {
                    Object objGroupAux = this.J.groupAux(parent);
                    Intrinsics.checkNotNull(objGroupAux, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) objGroupAux;
                    this.L = persistentCompositionLocalMap2;
                    return persistentCompositionLocalMap2;
                }
                parent = this.J.parent(parent);
            }
        }
        if (this.reader.getF14739c() > 0) {
            while (i10 > 0) {
                if (this.reader.groupKey(i10) == 202 && Intrinsics.areEqual(this.reader.groupObjectKey(i10), ComposerKt.getCompositionLocalMap())) {
                    IntMap<PersistentCompositionLocalMap> intMap = this.f14470v;
                    if (intMap == null || (persistentCompositionLocalMap = intMap.get(i10)) == null) {
                        Object objGroupAux2 = this.reader.groupAux(i10);
                        Intrinsics.checkNotNull(objGroupAux2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        persistentCompositionLocalMap = (PersistentCompositionLocalMap) objGroupAux2;
                    }
                    this.L = persistentCompositionLocalMap;
                    return persistentCompositionLocalMap;
                }
                i10 = this.reader.parent(i10);
            }
        }
        PersistentCompositionLocalMap persistentCompositionLocalMap3 = this.f14469u;
        this.L = persistentCompositionLocalMap3;
        return persistentCompositionLocalMap3;
    }

    @Override // androidx.compose.runtime.Composer
    public void enableReusing() {
        this.f14473y = this.f14474z >= 0;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endDefaults() {
        h(false);
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release == null || !currentRecomposeScope$runtime_release.getUsed()) {
            return;
        }
        currentRecomposeScope$runtime_release.setDefaultsInScope(true);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endMovableGroup() {
        h(false);
    }

    @Override // androidx.compose.runtime.Composer
    public void endNode() {
        h(true);
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void endProvider() {
        h(false);
        h(false);
        this.f14471w = ComposerKt.access$asBool(this.f14472x.pop());
        this.L = null;
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void endProviders() {
        h(false);
        h(false);
        this.f14471w = ComposerKt.access$asBool(this.f14472x.pop());
        this.L = null;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endReplaceGroup() {
        h(false);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endReplaceableGroup() {
        h(false);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    @Nullable
    public ScopeUpdateScope endRestartGroup() {
        Anchor anchor;
        Function1<Composition, Unit> function1End;
        Stack<RecomposeScopeImpl> stack = this.E;
        RecomposeScopeImpl recomposeScopeImpl = null;
        RecomposeScopeImpl recomposeScopeImplPop = stack.isNotEmpty() ? stack.pop() : null;
        if (recomposeScopeImplPop != null) {
            recomposeScopeImplPop.setRequiresRecompose(false);
        }
        if (recomposeScopeImplPop != null && (function1End = recomposeScopeImplPop.end(this.B)) != null) {
            this.N.endCompositionScope(function1End, getComposition());
        }
        if (recomposeScopeImplPop != null && !recomposeScopeImplPop.getSkipped$runtime_release() && (recomposeScopeImplPop.getUsed() || this.f14464p)) {
            if (recomposeScopeImplPop.getAnchor() == null) {
                if (getInserting()) {
                    SlotWriter slotWriter = this.J;
                    anchor = slotWriter.anchor(slotWriter.getParent());
                } else {
                    SlotReader slotReader = this.reader;
                    anchor = slotReader.anchor(slotReader.getParent());
                }
                recomposeScopeImplPop.setAnchor(anchor);
            }
            recomposeScopeImplPop.setDefaultsInvalid(false);
            recomposeScopeImpl = recomposeScopeImplPop;
        }
        h(false);
        return recomposeScopeImpl;
    }

    @Override // androidx.compose.runtime.Composer
    public void endReusableGroup() {
        if (this.f14473y && this.reader.getParent() == this.f14474z) {
            this.f14474z = -1;
            this.f14473y = false;
        }
        h(false);
    }

    public final void endReuseFromRoot() {
        if (!(!this.isComposing && this.f14474z == 100)) {
            PreconditionsKt.throwIllegalArgumentException("Cannot disable reuse from root if it was caused by other groups");
        }
        this.f14474z = -1;
        this.f14473y = false;
    }

    @Override // androidx.compose.runtime.Composer
    public void endToMarker(int marker) {
        if (marker < 0) {
            int i10 = -marker;
            SlotWriter slotWriter = this.J;
            while (true) {
                int parent = slotWriter.getParent();
                if (parent <= i10) {
                    return;
                } else {
                    h(slotWriter.isNode(parent));
                }
            }
        } else {
            if (getInserting()) {
                SlotWriter slotWriter2 = this.J;
                while (getInserting()) {
                    h(slotWriter2.isNode(slotWriter2.getParent()));
                }
            }
            SlotReader slotReader = this.reader;
            while (true) {
                int parent2 = slotReader.getParent();
                if (parent2 <= marker) {
                    return;
                } else {
                    h(slotReader.isNode(parent2));
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a1 A[Catch: all -> 0x008e, LOOP:0: B:10:0x0036->B:30:0x00a1, LOOP_END, TryCatch #2 {all -> 0x008e, blocks: (B:6:0x0017, B:10:0x0036, B:12:0x004b, B:14:0x0057, B:16:0x0061, B:18:0x007a, B:21:0x0085, B:26:0x0095, B:30:0x00a1, B:31:0x00a9, B:55:0x0123, B:60:0x0146, B:61:0x015a, B:32:0x00b6, B:35:0x00c1, B:38:0x00c9, B:53:0x0116, B:58:0x013c, B:59:0x0145, B:39:0x00cf, B:41:0x00d6, B:44:0x00e7, B:46:0x00eb, B:52:0x0113, B:49:0x00f1, B:51:0x00fd), top: B:66:0x0017, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00a9 A[EDGE_INSN: B:68:0x00a9->B:31:0x00a9 BREAK  A[LOOP:0: B:10:0x0036->B:30:0x00a1], SYNTHETIC] */
    public final void f(ScopeMap<RecomposeScopeImpl, Object> scopeMap, Function2<? super Composer, ? super Integer, Unit> function2) {
        int i10;
        if (!(!this.isComposing)) {
            ComposerKt.composeImmediateRuntimeError("Reentrant composition is not supported");
        }
        Object objBeginSection = Trace.INSTANCE.beginSection("Compose:recompose");
        try {
            this.B = SnapshotKt.currentSnapshot().getId();
            this.f14470v = null;
            MutableScatterMap<Object, Object> map = scopeMap.getMap();
            Object[] objArr = map.keys;
            Object[] objArr2 = map.values;
            long[] jArr = map.metadata;
            int length = jArr.length - 2;
            ArrayList arrayList = this.f14467s;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j10 = jArr[i11];
                    long[] jArr2 = jArr;
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i11 != length) {
                            break;
                            break;
                        } else {
                            i11++;
                            jArr = jArr2;
                        }
                    } else {
                        int i12 = 8;
                        int i13 = 8 - ((~(i11 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j10 & 255) < 128) {
                                int i15 = (i11 << 3) + i14;
                                Object obj = objArr[i15];
                                Object obj2 = objArr2[i15];
                                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                                Anchor anchor = ((RecomposeScopeImpl) obj).getAnchor();
                                if (anchor != null) {
                                    int location = anchor.getLocation();
                                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                                    if (obj2 == ScopeInvalidated.INSTANCE) {
                                        obj2 = null;
                                    }
                                    arrayList.add(new l(recomposeScopeImpl, location, obj2));
                                }
                                i10 = 8;
                            } else {
                                i10 = i12;
                            }
                            j10 >>= i10;
                            i14++;
                            i12 = i10;
                        }
                        if (i13 != i12) {
                            break;
                        }
                        if (i11 != length) {
                            break;
                        }
                        i11++;
                        jArr = jArr2;
                    }
                }
            }
            f.sortWith(arrayList, ComposerKt.f14500h);
            this.f14459j = 0;
            this.isComposing = true;
            try {
                x();
                Object objNextSlot = nextSlot();
                if (objNextSlot != function2 && function2 != null) {
                    updateValue(function2);
                }
                ComposerImpl$derivedStateObserver$1 composerImpl$derivedStateObserver$1 = this.D;
                MutableVector<DerivedStateObserver> mutableVectorDerivedStateObservers = SnapshotStateKt.derivedStateObservers();
                try {
                    mutableVectorDerivedStateObservers.add(composerImpl$derivedStateObserver$1);
                    if (function2 != null) {
                        v(200, ComposerKt.getInvocation());
                        ActualJvm_jvmKt.invokeComposable(this, function2);
                        h(false);
                    } else if ((!this.f14465q && !this.f14471w) || objNextSlot == null || Intrinsics.areEqual(objNextSlot, Composer.INSTANCE.getEmpty())) {
                        skipCurrentGroup();
                    } else {
                        v(200, ComposerKt.getInvocation());
                        ActualJvm_jvmKt.invokeComposable(this, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(objNextSlot, 2));
                        h(false);
                    }
                    mutableVectorDerivedStateObservers.removeAt(mutableVectorDerivedStateObservers.getSize() - 1);
                    i();
                    this.isComposing = false;
                    arrayList.clear();
                    ComposerKt.runtimeCheck(this.J.getClosed());
                    k();
                    Unit unit = Unit.INSTANCE;
                    Trace.INSTANCE.endSection(objBeginSection);
                } catch (Throwable th2) {
                    mutableVectorDerivedStateObservers.removeAt(mutableVectorDerivedStateObservers.getSize() - 1);
                    throw th2;
                }
            } catch (Throwable th3) {
                this.isComposing = false;
                arrayList.clear();
                a();
                ComposerKt.runtimeCheck(this.J.getClosed());
                k();
                throw th3;
            }
        } catch (Throwable th4) {
            Trace.INSTANCE.endSection(objBeginSection);
            throw th4;
        }
    }

    public final boolean forceRecomposeScopes$runtime_release() {
        if (this.f14464p) {
            return false;
        }
        this.f14464p = true;
        this.f14465q = true;
        return true;
    }

    public final void g(int i10, int i11) {
        if (i10 <= 0 || i10 == i11) {
            return;
        }
        g(this.reader.parent(i10), i11);
        if (this.reader.isNode(i10)) {
            this.N.moveDown(this.reader.node(i10));
        }
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public Applier<?> getApplier() {
        return this.applier;
    }

    @Override // androidx.compose.runtime.Composer
    @TestOnly
    @NotNull
    public CoroutineContext getApplyCoroutineContext() {
        return this.f14451b.getEffectCoroutineContext();
    }

    public final boolean getAreChildrenComposing$runtime_release() {
        return this.A > 0;
    }

    public final int getChangeCount$runtime_release() {
        return this.f14454e.getSize();
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public ControlledComposition getComposition() {
        return this.composition;
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public CompositionData getCompositionData() {
        return this.f14452c;
    }

    @Override // androidx.compose.runtime.Composer
    public int getCompoundKeyHash() {
        return this.compoundKeyHash;
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public CompositionLocalMap getCurrentCompositionLocalMap() {
        return d();
    }

    @Override // androidx.compose.runtime.Composer
    public int getCurrentMarker() {
        return getInserting() ? -this.J.getParent() : this.reader.getParent();
    }

    @Nullable
    public final RecomposeScopeImpl getCurrentRecomposeScope$runtime_release() {
        if (this.A == 0) {
            Stack<RecomposeScopeImpl> stack = this.E;
            if (stack.isNotEmpty()) {
                return stack.peek();
            }
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getDefaultsInvalid() {
        if (!getSkipping() || this.f14471w) {
            return true;
        }
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        return currentRecomposeScope$runtime_release != null && currentRecomposeScope$runtime_release.getDefaultsInvalid();
    }

    @Nullable
    /* JADX INFO: renamed from: getDeferredChanges$runtime_release, reason: from getter */
    public final ChangeList getDeferredChanges() {
        return this.deferredChanges;
    }

    public final boolean getHasInvalidations() {
        return !this.f14467s.isEmpty();
    }

    public final boolean getHasPendingChanges$runtime_release() {
        return this.f14454e.isNotEmpty();
    }

    @NotNull
    /* JADX INFO: renamed from: getInsertTable$runtime_release, reason: from getter */
    public final SlotTable getInsertTable() {
        return this.insertTable;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getInserting() {
        return this.inserting;
    }

    @NotNull
    /* JADX INFO: renamed from: getReader$runtime_release, reason: from getter */
    public final SlotReader getReader() {
        return this.reader;
    }

    @Override // androidx.compose.runtime.Composer
    @Nullable
    public RecomposeScope getRecomposeScope() {
        return getCurrentRecomposeScope$runtime_release();
    }

    @Override // androidx.compose.runtime.Composer
    @Nullable
    public Object getRecomposeScopeIdentity() {
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null) {
            return currentRecomposeScope$runtime_release.getAnchor();
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getSkipping() {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        return (getInserting() || this.f14473y || this.f14471w || (currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release()) == null || currentRecomposeScope$runtime_release.getRequiresRecompose() || this.f14465q) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x035d  */
    public final void h(boolean z10) {
        int iOrdinal;
        IntStack intStack;
        int i10;
        ArrayList arrayList;
        ComposerChangeListWriter composerChangeListWriter;
        int i11;
        int i12;
        IntStack intStack2;
        v vVar;
        ArrayList arrayList2;
        LinkedHashSet linkedHashSet;
        int i13;
        Object[] objArr;
        long[] jArr;
        Object[] objArr2;
        long[] jArr2;
        Object[] objArr3;
        int i14;
        Object[] objArr4;
        int iOrdinal2;
        ComposerImpl composerImpl = this;
        IntStack intStack3 = composerImpl.m;
        int iPeek2 = intStack3.peek2() - 1;
        if (getInserting()) {
            int parent = composerImpl.J.getParent();
            int iGroupKey = composerImpl.J.groupKey(parent);
            Object objGroupObjectKey = composerImpl.J.groupObjectKey(parent);
            Object objGroupAux = composerImpl.J.groupAux(parent);
            if (objGroupObjectKey != null) {
                iOrdinal2 = (objGroupObjectKey instanceof Enum ? ((Enum) objGroupObjectKey).ordinal() : objGroupObjectKey.hashCode()) ^ Integer.rotateRight(getCompoundKeyHash(), 3);
            } else if (objGroupAux == null || iGroupKey != 207 || Intrinsics.areEqual(objGroupAux, Composer.INSTANCE.getEmpty())) {
                iOrdinal2 = Integer.rotateRight(iPeek2 ^ getCompoundKeyHash(), 3) ^ iGroupKey;
            } else {
                composerImpl.compoundKeyHash = Integer.rotateRight(Integer.rotateRight(iPeek2 ^ getCompoundKeyHash(), 3) ^ objGroupAux.hashCode(), 3);
            }
            composerImpl.compoundKeyHash = Integer.rotateRight(iOrdinal2, 3);
        } else {
            int parent2 = composerImpl.reader.getParent();
            int iGroupKey2 = composerImpl.reader.groupKey(parent2);
            Object objGroupObjectKey2 = composerImpl.reader.groupObjectKey(parent2);
            Object objGroupAux2 = composerImpl.reader.groupAux(parent2);
            if (objGroupObjectKey2 != null) {
                iOrdinal = (objGroupObjectKey2 instanceof Enum ? ((Enum) objGroupObjectKey2).ordinal() : objGroupObjectKey2.hashCode()) ^ Integer.rotateRight(getCompoundKeyHash(), 3);
            } else if (objGroupAux2 == null || iGroupKey2 != 207 || Intrinsics.areEqual(objGroupAux2, Composer.INSTANCE.getEmpty())) {
                iOrdinal = Integer.rotateRight(iPeek2 ^ getCompoundKeyHash(), 3) ^ iGroupKey2;
            } else {
                composerImpl.compoundKeyHash = Integer.rotateRight(Integer.rotateRight(iPeek2 ^ getCompoundKeyHash(), 3) ^ objGroupAux2.hashCode(), 3);
            }
            composerImpl.compoundKeyHash = Integer.rotateRight(iOrdinal, 3);
        }
        int i15 = composerImpl.f14460k;
        v vVar2 = composerImpl.f14458i;
        ArrayList arrayList3 = composerImpl.f14467s;
        ComposerChangeListWriter composerChangeListWriter2 = composerImpl.N;
        if (vVar2 != null) {
            List<KeyInfo> list = vVar2.f83327a;
            if (list.size() > 0) {
                ArrayList arrayList4 = vVar2.f83330d;
                Set setFastToSet = ListUtilsKt.fastToSet(arrayList4);
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size = arrayList4.size();
                int size2 = list.size();
                int nodes = 0;
                int i16 = 0;
                int i17 = 0;
                while (i16 < size2) {
                    KeyInfo keyInfo = list.get(i16);
                    boolean zContains = setFastToSet.contains(keyInfo);
                    setFastToSet = setFastToSet;
                    int i18 = vVar2.f83328b;
                    if (zContains) {
                        intStack2 = intStack3;
                        i12 = size2;
                        if (!linkedHashSet2.contains(keyInfo)) {
                            if (i17 < size) {
                                KeyInfo keyInfo2 = (KeyInfo) arrayList4.get(i17);
                                MutableIntObjectMap<i> mutableIntObjectMap = vVar2.f83331e;
                                if (keyInfo2 != keyInfo) {
                                    int iA = vVar2.a(keyInfo2);
                                    linkedHashSet2.add(keyInfo2);
                                    if (iA != nodes) {
                                        vVar = vVar2;
                                        i iVar = mutableIntObjectMap.get(keyInfo2.getLocation());
                                        int nodes2 = iVar != null ? iVar.f83257c : keyInfo2.getNodes();
                                        arrayList2 = arrayList4;
                                        composerChangeListWriter2.moveNode(iA + i18, i18 + nodes, nodes2);
                                        if (iA <= nodes) {
                                            i15 = i15;
                                            arrayList3 = arrayList3;
                                            composerChangeListWriter2 = composerChangeListWriter2;
                                            list = list;
                                            linkedHashSet = linkedHashSet2;
                                            i13 = size;
                                            if (nodes > iA) {
                                                Object[] objArr5 = mutableIntObjectMap.values;
                                                long[] jArr3 = mutableIntObjectMap.metadata;
                                                int length = jArr3.length - 2;
                                                if (length >= 0) {
                                                    int i19 = 0;
                                                    while (true) {
                                                        long j10 = jArr3[i19];
                                                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i20 = 8 - ((~(i19 - length)) >>> 31);
                                                            int i21 = 0;
                                                            while (i21 < i20) {
                                                                if ((j10 & 255) < 128) {
                                                                    i iVar2 = (i) objArr5[(i19 << 3) + i21];
                                                                    objArr2 = objArr5;
                                                                    int i22 = iVar2.f83256b;
                                                                    jArr2 = jArr3;
                                                                    if (iA <= i22 && i22 < iA + nodes2) {
                                                                        iVar2.f83256b = (i22 - iA) + nodes;
                                                                    } else if (iA + 1 <= i22 && i22 < nodes) {
                                                                        iVar2.f83256b = i22 - nodes2;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr5;
                                                                    jArr2 = jArr3;
                                                                }
                                                                j10 >>= 8;
                                                                i21++;
                                                                objArr5 = objArr2;
                                                                jArr3 = jArr2;
                                                            }
                                                            objArr = objArr5;
                                                            jArr = jArr3;
                                                            if (i20 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr5;
                                                            jArr = jArr3;
                                                        }
                                                        if (i19 == length) {
                                                            break;
                                                        }
                                                        i19++;
                                                        objArr5 = objArr;
                                                        jArr3 = jArr;
                                                    }
                                                }
                                            }
                                        } else {
                                            Object[] objArr6 = mutableIntObjectMap.values;
                                            long[] jArr4 = mutableIntObjectMap.metadata;
                                            linkedHashSet = linkedHashSet2;
                                            int length2 = jArr4.length - 2;
                                            if (length2 >= 0) {
                                                arrayList3 = arrayList3;
                                                composerChangeListWriter2 = composerChangeListWriter2;
                                                i13 = size;
                                                int i23 = 0;
                                                while (true) {
                                                    long j11 = jArr4[i23];
                                                    list = list;
                                                    long[] jArr5 = jArr4;
                                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i24 = 8 - ((~(i23 - length2)) >>> 31);
                                                        int i25 = 0;
                                                        while (i25 < i24) {
                                                            if ((j11 & 255) < 128) {
                                                                objArr4 = objArr6;
                                                                i iVar3 = (i) objArr6[(i23 << 3) + i25];
                                                                i14 = i15;
                                                                int i26 = iVar3.f83256b;
                                                                if (iA <= i26 && i26 < iA + nodes2) {
                                                                    iVar3.f83256b = (i26 - iA) + nodes;
                                                                } else if (nodes <= i26 && i26 < iA) {
                                                                    iVar3.f83256b = i26 + nodes2;
                                                                }
                                                            } else {
                                                                i14 = i15;
                                                                objArr4 = objArr6;
                                                            }
                                                            j11 >>= 8;
                                                            i25++;
                                                            i15 = i14;
                                                            objArr6 = objArr4;
                                                        }
                                                        i15 = i15;
                                                        objArr3 = objArr6;
                                                        if (i24 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        i15 = i15;
                                                        objArr3 = objArr6;
                                                    }
                                                    if (i23 == length2) {
                                                        break;
                                                    }
                                                    i23++;
                                                    list = list;
                                                    jArr4 = jArr5;
                                                    i15 = i15;
                                                    objArr6 = objArr3;
                                                }
                                            }
                                        }
                                    } else {
                                        vVar = vVar2;
                                        arrayList2 = arrayList4;
                                        linkedHashSet = linkedHashSet2;
                                    }
                                    i13 = size;
                                } else {
                                    i15 = i15;
                                    vVar = vVar2;
                                    arrayList3 = arrayList3;
                                    composerChangeListWriter2 = composerChangeListWriter2;
                                    list = list;
                                    arrayList2 = arrayList4;
                                    linkedHashSet = linkedHashSet2;
                                    i13 = size;
                                    i16++;
                                }
                                i17++;
                                i iVar4 = mutableIntObjectMap.get(keyInfo2.getLocation());
                                nodes += iVar4 != null ? iVar4.f83257c : keyInfo2.getNodes();
                                composerImpl = this;
                                size2 = i12;
                                intStack3 = intStack2;
                                vVar2 = vVar;
                                arrayList4 = arrayList2;
                                linkedHashSet2 = linkedHashSet;
                                size = i13;
                                arrayList3 = arrayList3;
                                composerChangeListWriter2 = composerChangeListWriter2;
                                list = list;
                                i15 = i15;
                            } else {
                                composerImpl = this;
                                size2 = i12;
                                intStack3 = intStack2;
                            }
                        }
                    } else {
                        i12 = size2;
                        composerChangeListWriter2.removeNode(vVar2.a(keyInfo) + i18, keyInfo.getNodes());
                        vVar2.b(keyInfo.getLocation(), 0);
                        composerChangeListWriter2.moveReaderRelativeTo(keyInfo.getLocation());
                        composerImpl.reader.reposition(keyInfo.getLocation());
                        composerImpl.s(composerImpl.reader.getCurrentGroup());
                        composerChangeListWriter2.removeCurrentGroup();
                        composerImpl.reader.skipGroup();
                        intStack2 = intStack3;
                        ComposerKt.access$removeRange(arrayList3, keyInfo.getLocation(), composerImpl.reader.groupSize(keyInfo.getLocation()) + keyInfo.getLocation());
                    }
                    i16++;
                    size2 = i12;
                    intStack3 = intStack2;
                }
                intStack = intStack3;
                i10 = i15;
                arrayList = arrayList3;
                ComposerChangeListWriter composerChangeListWriter3 = composerChangeListWriter2;
                composerChangeListWriter3.endNodeMovement();
                if (list.size() > 0) {
                    composerImpl = this;
                    composerChangeListWriter = composerChangeListWriter3;
                    composerChangeListWriter.moveReaderRelativeTo(composerImpl.reader.getGroupEnd());
                    composerImpl.reader.skipToGroupEnd();
                } else {
                    composerImpl = this;
                    composerChangeListWriter = composerChangeListWriter3;
                }
            } else {
                intStack = intStack3;
                i10 = i15;
                arrayList = arrayList3;
                composerChangeListWriter = composerChangeListWriter2;
            }
        } else {
            intStack = intStack3;
            i10 = i15;
            arrayList = arrayList3;
            composerChangeListWriter = composerChangeListWriter2;
        }
        int i27 = composerImpl.f14459j;
        while (!composerImpl.reader.isGroupEnd()) {
            int currentGroup = composerImpl.reader.getCurrentGroup();
            composerImpl.s(composerImpl.reader.getCurrentGroup());
            composerChangeListWriter.removeCurrentGroup();
            composerChangeListWriter.removeNode(i27, composerImpl.reader.skipGroup());
            ComposerKt.access$removeRange(arrayList, currentGroup, composerImpl.reader.getCurrentGroup());
        }
        boolean inserting = getInserting();
        if (inserting) {
            if (z10) {
                composerImpl.P.endNodeInsert();
                i11 = 1;
            } else {
                i11 = i10;
            }
            composerImpl.reader.endEmpty();
            int parent3 = composerImpl.J.getParent();
            composerImpl.J.endGroup();
            if (!composerImpl.reader.getInEmpty()) {
                int i28 = (-2) - parent3;
                composerImpl.J.endInsert();
                composerImpl.J.close(true);
                Anchor anchor = composerImpl.O;
                if (composerImpl.P.isEmpty()) {
                    composerChangeListWriter.insertSlots(anchor, composerImpl.insertTable);
                } else {
                    composerChangeListWriter.insertSlots(anchor, composerImpl.insertTable, composerImpl.P);
                    composerImpl.P = new FixupList();
                }
                composerImpl.inserting = false;
                if (!composerImpl.f14452c.isEmpty()) {
                    composerImpl.y(i28, 0);
                    composerImpl.z(i28, i11);
                }
            }
        } else {
            if (z10) {
                composerChangeListWriter.moveUp();
            }
            int remainingSlots = composerImpl.reader.getRemainingSlots();
            if (remainingSlots > 0) {
                composerChangeListWriter.trimValues(remainingSlots);
            }
            composerChangeListWriter.endCurrentGroup();
            int parent4 = composerImpl.reader.getParent();
            int i29 = i10;
            if (i29 != composerImpl.A(parent4)) {
                composerImpl.z(parent4, i29);
            }
            if (z10) {
                i29 = 1;
            }
            composerImpl.reader.endGroup();
            composerChangeListWriter.endNodeMovement();
            i11 = i29;
        }
        v vVarPop = composerImpl.f14457h.pop();
        if (vVarPop != null && !inserting) {
            vVarPop.f83329c++;
        }
        composerImpl.f14458i = vVarPop;
        composerImpl.f14459j = intStack.pop() + i11;
        composerImpl.f14461l = intStack.pop();
        composerImpl.f14460k = intStack.pop() + i11;
    }

    public final void i() {
        h(false);
        this.f14451b.doneComposing$runtime_release();
        h(false);
        ComposerChangeListWriter composerChangeListWriter = this.N;
        composerChangeListWriter.endRoot();
        composerChangeListWriter.finalizeComposition();
        if (!this.f14457h.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Start/end imbalance");
        }
        b();
        this.reader.close();
        this.f14465q = false;
        this.f14471w = ComposerKt.access$asBool(this.f14472x.pop());
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void insertMovableContent(@NotNull MovableContent<?> value, @Nullable Object parameter) {
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        m(value, d(), parameter, false);
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void insertMovableContentReferences(@NotNull List<Pair<MovableContentStateReference, MovableContentStateReference>> references) {
        try {
            l(references);
            b();
        } catch (Throwable th2) {
            a();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: isComposing$runtime_release, reason: from getter */
    public final boolean getIsComposing() {
        return this.isComposing;
    }

    /* JADX INFO: renamed from: isDisposed$runtime_release, reason: from getter */
    public final boolean getIsDisposed() {
        return this.isDisposed;
    }

    public final void j(boolean z10, v vVar) {
        this.f14457h.push(this.f14458i);
        this.f14458i = vVar;
        int i10 = this.f14460k;
        IntStack intStack = this.m;
        intStack.push(i10);
        intStack.push(this.f14461l);
        intStack.push(this.f14459j);
        if (z10) {
            this.f14459j = 0;
        }
        this.f14460k = 0;
        this.f14461l = 0;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    @NotNull
    public Object joinKey(@Nullable Object left, @Nullable Object right) {
        Object objC = ComposerKt.c(this.reader.getGroupObjectKey(), left, right);
        return objC == null ? new JoinedKey(left, right) : objC;
    }

    public final void k() {
        SlotTable slotTable = new SlotTable();
        if (this.C) {
            slotTable.collectSourceInformation();
        }
        if (this.f14451b.getCollectingCallByInformation$runtime_release()) {
            slotTable.collectCalledByInformation();
        }
        this.insertTable = slotTable;
        SlotWriter slotWriterOpenWriter = slotTable.openWriter();
        slotWriterOpenWriter.close(true);
        this.J = slotWriterOpenWriter;
    }

    public final void l(List<Pair<MovableContentStateReference, MovableContentStateReference>> list) throws Throwable {
        ChangeList changeList;
        SlotTable slotTable;
        Anchor anchor;
        int i10;
        IntMap intMap;
        int[] iArr;
        SlotReader slotReader;
        boolean z10;
        SlotTable slotTable2;
        SlotReader slotReader2;
        SlotTable slotTable3 = this.f14452c;
        CompositionContext compositionContext = this.f14451b;
        ChangeList changeList2 = this.f14455f;
        ComposerChangeListWriter composerChangeListWriter = this.N;
        ChangeList changeList3 = composerChangeListWriter.getChangeList();
        try {
            composerChangeListWriter.setChangeList(changeList2);
            composerChangeListWriter.resetSlots();
            int size = list.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                Pair<MovableContentStateReference, MovableContentStateReference> pair = list.get(i12);
                MovableContentStateReference movableContentStateReferenceComponent1 = pair.component1();
                MovableContentStateReference movableContentStateReferenceComponent2 = pair.component2();
                Anchor anchor2 = movableContentStateReferenceComponent1.getAnchor();
                int iAnchorIndex = movableContentStateReferenceComponent1.getSlotTable().anchorIndex(anchor2);
                IntRef intRef = new IntRef(i11, 1, null);
                composerChangeListWriter.determineMovableContentNodeIndex(intRef, anchor2);
                if (movableContentStateReferenceComponent2 == null) {
                    if (Intrinsics.areEqual(movableContentStateReferenceComponent1.getSlotTable(), this.insertTable)) {
                        ComposerKt.runtimeCheck(this.J.getClosed());
                        k();
                    }
                    SlotReader slotReaderOpenReader = movableContentStateReferenceComponent1.getSlotTable().openReader();
                    try {
                        slotReaderOpenReader.reposition(iAnchorIndex);
                        composerChangeListWriter.moveReaderToAbsolute(iAnchorIndex);
                        ChangeList changeList4 = new ChangeList();
                        slotReader2 = slotReaderOpenReader;
                        try {
                            o(null, null, null, CollectionsKt__CollectionsKt.emptyList(), new c(changeList4, slotReaderOpenReader, movableContentStateReferenceComponent1));
                            composerChangeListWriter.includeOperationsIn(changeList4, intRef);
                            Unit unit = Unit.INSTANCE;
                            slotReader2.close();
                            i10 = size;
                        } catch (Throwable th2) {
                            th = th2;
                            slotReader2.close();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        slotReader2 = slotReaderOpenReader;
                    }
                } else {
                    MovableContentState movableContentStateMovableContentStateResolve$runtime_release = compositionContext.movableContentStateResolve$runtime_release(movableContentStateReferenceComponent2);
                    if (movableContentStateMovableContentStateResolve$runtime_release == null || (slotTable = movableContentStateMovableContentStateResolve$runtime_release.getSlotTable()) == null) {
                        slotTable = movableContentStateReferenceComponent2.getSlotTable();
                    }
                    if (movableContentStateMovableContentStateResolve$runtime_release == null || (slotTable2 = movableContentStateMovableContentStateResolve$runtime_release.getSlotTable()) == null || (anchor = slotTable2.anchor(0)) == null) {
                        anchor = movableContentStateReferenceComponent2.getAnchor();
                    }
                    List<? extends Object> listAccess$collectNodesFrom = ComposerKt.access$collectNodesFrom(slotTable, anchor);
                    if (!listAccess$collectNodesFrom.isEmpty()) {
                        composerChangeListWriter.copyNodesToNewAnchorLocation(listAccess$collectNodesFrom, intRef);
                        i10 = size;
                        if (Intrinsics.areEqual(movableContentStateReferenceComponent1.getSlotTable(), slotTable3)) {
                            int iAnchorIndex2 = slotTable3.anchorIndex(anchor2);
                            y(iAnchorIndex2, A(iAnchorIndex2) + listAccess$collectNodesFrom.size());
                        }
                    } else {
                        i10 = size;
                    }
                    composerChangeListWriter.copySlotTableToAnchorLocation(movableContentStateMovableContentStateResolve$runtime_release, compositionContext, movableContentStateReferenceComponent2, movableContentStateReferenceComponent1);
                    SlotReader slotReaderOpenReader2 = slotTable.openReader();
                    try {
                        SlotReader reader = getReader();
                        int[] iArr2 = this.f14462n;
                        IntMap intMap2 = this.f14470v;
                        this.f14462n = null;
                        this.f14470v = null;
                        try {
                            setReader$runtime_release(slotReaderOpenReader2);
                            int iAnchorIndex3 = slotTable.anchorIndex(anchor);
                            slotReaderOpenReader2.reposition(iAnchorIndex3);
                            composerChangeListWriter.moveReaderToAbsolute(iAnchorIndex3);
                            ChangeList changeList5 = new ChangeList();
                            ChangeList changeList6 = composerChangeListWriter.getChangeList();
                            try {
                                composerChangeListWriter.setChangeList(changeList5);
                                boolean implicitRootStart = composerChangeListWriter.getImplicitRootStart();
                                try {
                                    composerChangeListWriter.setImplicitRootStart(false);
                                    intMap = intMap2;
                                    iArr = iArr2;
                                    slotReader = reader;
                                    z10 = implicitRootStart;
                                    try {
                                        o(movableContentStateReferenceComponent2.getComposition(), movableContentStateReferenceComponent1.getComposition(), Integer.valueOf(slotReaderOpenReader2.getCurrentGroup()), movableContentStateReferenceComponent2.getInvalidations$runtime_release(), new d(movableContentStateReferenceComponent1));
                                        try {
                                            composerChangeListWriter.setImplicitRootStart(z10);
                                            try {
                                                composerChangeListWriter.setChangeList(changeList6);
                                                composerChangeListWriter.includeOperationsIn(changeList5, intRef);
                                                Unit unit2 = Unit.INSTANCE;
                                                try {
                                                    setReader$runtime_release(slotReader);
                                                    this.f14462n = iArr;
                                                    this.f14470v = intMap;
                                                    slotReaderOpenReader2.close();
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    slotReaderOpenReader2.close();
                                                    throw th;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                setReader$runtime_release(slotReader);
                                                this.f14462n = iArr;
                                                this.f14470v = intMap;
                                                throw th;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            composerChangeListWriter.setChangeList(changeList6);
                                            throw th;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        composerChangeListWriter.setImplicitRootStart(z10);
                                        throw th;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    iArr = iArr2;
                                    z10 = implicitRootStart;
                                    intMap = intMap2;
                                    slotReader = reader;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                intMap = intMap2;
                                iArr = iArr2;
                                slotReader = reader;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            intMap = intMap2;
                            iArr = iArr2;
                            slotReader = reader;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                    }
                }
                try {
                    composerChangeListWriter.skipToEndOfCurrentGroup();
                    i12++;
                    changeList3 = changeList3;
                    size = i10;
                    slotTable3 = slotTable3;
                    compositionContext = compositionContext;
                    i11 = 0;
                } catch (Throwable th12) {
                    th = th12;
                    changeList = changeList3;
                    composerChangeListWriter.setChangeList(changeList);
                    throw th;
                }
            }
            ChangeList changeList7 = changeList3;
            composerChangeListWriter.endMovableContentPlacement();
            composerChangeListWriter.moveReaderToAbsolute(0);
            composerChangeListWriter.setChangeList(changeList7);
        } catch (Throwable th13) {
            th = th13;
            changeList = changeList3;
        }
    }

    public final void m(MovableContent<Object> movableContent, PersistentCompositionLocalMap persistentCompositionLocalMap, Object obj, boolean z10) {
        startMovableGroup(MovableContentKt.movableContentKey, movableContent);
        nextSlot();
        updateValue(obj);
        int compoundKeyHash = getCompoundKeyHash();
        try {
            this.compoundKeyHash = MovableContentKt.movableContentKey;
            if (getInserting()) {
                SlotWriter.markGroup$default(this.J, 0, 1, null);
            }
            boolean z11 = (getInserting() || Intrinsics.areEqual(this.reader.getGroupAux(), persistentCompositionLocalMap)) ? false : true;
            if (z11) {
                q(persistentCompositionLocalMap);
            }
            u(202, ComposerKt.getCompositionLocalMap(), GroupKind.f14562a.m2062getGroupULZAiWs(), persistentCompositionLocalMap);
            this.L = null;
            if (!getInserting() || z10) {
                boolean z12 = this.f14471w;
                this.f14471w = z11;
                ActualJvm_jvmKt.invokeComposable(this, ComposableLambdaKt.composableLambdaInstance(316014703, true, new e(movableContent, obj)));
                this.f14471w = z12;
            } else {
                this.K = true;
                SlotWriter slotWriter = this.J;
                this.f14451b.insertMovableContent$runtime_release(new MovableContentStateReference(movableContent, obj, getComposition(), this.insertTable, slotWriter.anchor(slotWriter.parent(slotWriter.getParent())), CollectionsKt__CollectionsKt.emptyList(), d()));
            }
        } finally {
            h(false);
            this.L = null;
            this.compoundKeyHash = compoundKeyHash;
            endMovableGroup();
        }
    }

    public final int n(int i10) {
        int iParent = this.reader.parent(i10) + 1;
        int i11 = 0;
        while (iParent < i10) {
            if (!this.reader.hasObjectKey(iParent)) {
                i11++;
            }
            iParent += this.reader.groupSize(iParent);
        }
        return i11;
    }

    @PublishedApi
    @Nullable
    public final Object nextSlot() {
        if (getInserting()) {
            B();
            return Composer.INSTANCE.getEmpty();
        }
        Object next = this.reader.next();
        return (!this.f14473y || (next instanceof ReusableRememberObserver)) ? next : Composer.INSTANCE.getEmpty();
    }

    @PublishedApi
    @Nullable
    public final Object nextSlotForCache() {
        if (getInserting()) {
            B();
            return Composer.INSTANCE.getEmpty();
        }
        Object next = this.reader.next();
        if (!this.f14473y || (next instanceof ReusableRememberObserver)) {
            return next instanceof RememberObserverHolder ? ((RememberObserverHolder) next).getWrapped() : next;
        }
        return Composer.INSTANCE.getEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003f A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0005, B:5:0x0010, B:7:0x0022, B:11:0x002c, B:10:0x0028, B:14:0x0033, B:16:0x0039, B:18:0x003f), top: B:23:0x0005 }] */
    public final <R> R o(ControlledComposition controlledComposition, ControlledComposition controlledComposition2, Integer num, List<? extends Pair<RecomposeScopeImpl, ? extends Object>> list, Function0<? extends R> function0) {
        R rInvoke;
        boolean z10 = this.isComposing;
        int i10 = this.f14459j;
        try {
            this.isComposing = true;
            this.f14459j = 0;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Pair<RecomposeScopeImpl, ? extends Object> pair = list.get(i11);
                RecomposeScopeImpl recomposeScopeImplComponent1 = pair.component1();
                Object objComponent2 = pair.component2();
                if (objComponent2 != null) {
                    tryImminentInvalidation$runtime_release(recomposeScopeImplComponent1, objComponent2);
                } else {
                    tryImminentInvalidation$runtime_release(recomposeScopeImplComponent1, null);
                }
            }
            if (controlledComposition == null) {
                rInvoke = function0.invoke();
            } else {
                rInvoke = (R) controlledComposition.delegateInvalidations(controlledComposition2, num != null ? num.intValue() : -1, function0);
                if (rInvoke == null) {
                    rInvoke = function0.invoke();
                }
            }
            return rInvoke;
        } finally {
            this.isComposing = z10;
            this.f14459j = i10;
        }
    }

    public final void p() {
        boolean z10 = this.isComposing;
        this.isComposing = true;
        int parent = this.reader.getParent();
        int iGroupSize = this.reader.groupSize(parent) + parent;
        int i10 = this.f14459j;
        int compoundKeyHash = getCompoundKeyHash();
        int i11 = this.f14460k;
        int i12 = this.f14461l;
        ArrayList arrayList = this.f14467s;
        l lVarAccess$firstInRange = ComposerKt.access$firstInRange(arrayList, this.reader.getCurrentGroup(), iGroupSize);
        int i13 = parent;
        boolean z11 = false;
        while (lVarAccess$firstInRange != null) {
            int i14 = lVarAccess$firstInRange.f83273b;
            ComposerKt.access$removeLocation(arrayList, i14);
            Object obj = lVarAccess$firstInRange.f83274c;
            RecomposeScopeImpl recomposeScopeImpl = lVarAccess$firstInRange.f83272a;
            if (recomposeScopeImpl.isInvalidFor(obj)) {
                this.reader.reposition(i14);
                int currentGroup = this.reader.getCurrentGroup();
                r(i13, currentGroup, parent);
                int iParent = this.reader.parent(currentGroup);
                while (iParent != parent && !this.reader.isNode(iParent)) {
                    iParent = this.reader.parent(iParent);
                }
                int iA = this.reader.isNode(iParent) ? 0 : i10;
                if (iParent != currentGroup) {
                    int iA2 = (A(iParent) - this.reader.nodeCount(currentGroup)) + iA;
                    while (iA < iA2 && iParent != i14) {
                        iParent++;
                        while (true) {
                            if (iParent >= i14) {
                                break;
                            }
                            int iGroupSize2 = this.reader.groupSize(iParent) + iParent;
                            if (i14 >= iGroupSize2) {
                                int i15 = iA2;
                                iA += this.reader.isNode(iParent) ? 1 : A(iParent);
                                iParent = iGroupSize2;
                                iA2 = i15;
                            }
                        }
                    }
                }
                this.f14459j = iA;
                this.f14461l = n(currentGroup);
                int iParent2 = this.reader.parent(currentGroup);
                this.compoundKeyHash = c(iParent2, n(iParent2), parent, compoundKeyHash);
                this.L = null;
                recomposeScopeImpl.compose(this);
                this.L = null;
                this.reader.restoreParent(parent);
                i13 = currentGroup;
                z11 = true;
            } else {
                Stack<RecomposeScopeImpl> stack = this.E;
                stack.push(recomposeScopeImpl);
                recomposeScopeImpl.rereadTrackedInstances();
                stack.pop();
            }
            lVarAccess$firstInRange = ComposerKt.access$firstInRange(arrayList, this.reader.getCurrentGroup(), iGroupSize);
        }
        if (z11) {
            r(i13, parent, parent);
            this.reader.skipToGroupEnd();
            int iA3 = A(parent);
            this.f14459j = i10 + iA3;
            this.f14460k = i11 + iA3;
            this.f14461l = i12;
        } else {
            this.f14460k = this.reader.getParentNodes();
            this.reader.skipToGroupEnd();
        }
        this.compoundKeyHash = compoundKeyHash;
        this.isComposing = z10;
    }

    @TestOnly
    public final int parentKey$runtime_release() {
        if (getInserting()) {
            SlotWriter slotWriter = this.J;
            return slotWriter.groupKey(slotWriter.getParent());
        }
        SlotReader slotReader = this.reader;
        return slotReader.groupKey(slotReader.getParent());
    }

    public final void prepareCompose$runtime_release(@NotNull Function0<Unit> block) {
        if (!(!this.isComposing)) {
            ComposerKt.composeImmediateRuntimeError("Preparing a composition while composing is not supported");
        }
        this.isComposing = true;
        try {
            block.invoke();
        } finally {
            this.isComposing = false;
        }
    }

    public final void q(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        IntMap<PersistentCompositionLocalMap> intMap = this.f14470v;
        if (intMap == null) {
            intMap = new IntMap<>(0, 1, null);
            this.f14470v = intMap;
        }
        intMap.set(this.reader.getCurrentGroup(), persistentCompositionLocalMap);
    }

    public final void r(int i10, int i11, int i12) {
        SlotReader slotReader = this.reader;
        int iAccess$nearestCommonRootOf = ComposerKt.access$nearestCommonRootOf(slotReader, i10, i11, i12);
        while (i10 > 0 && i10 != iAccess$nearestCommonRootOf) {
            if (slotReader.isNode(i10)) {
                this.N.moveUp();
            }
            i10 = slotReader.parent(i10);
        }
        g(i11, iAccess$nearestCommonRootOf);
    }

    public final boolean recompose$runtime_release(@NotNull ScopeMap<RecomposeScopeImpl, Object> invalidationsRequested) {
        ChangeList changeList = this.f14454e;
        if (!changeList.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Expected applyChanges() to have been called");
        }
        if (invalidationsRequested.getSize() <= 0 && !(!this.f14467s.isEmpty()) && !this.f14465q) {
            return false;
        }
        f(invalidationsRequested, null);
        return changeList.isNotEmpty();
    }

    @Override // androidx.compose.runtime.Composer
    public void recordSideEffect(@NotNull Function0<Unit> effect) {
        this.N.sideEffect(effect);
    }

    @Override // androidx.compose.runtime.Composer
    public void recordUsed(@NotNull RecomposeScope scope) {
        RecomposeScopeImpl recomposeScopeImpl = scope instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) scope : null;
        if (recomposeScopeImpl == null) {
            return;
        }
        recomposeScopeImpl.setUsed(true);
    }

    @Override // androidx.compose.runtime.Composer
    @Nullable
    public Object rememberedValue() {
        return nextSlotForCache();
    }

    public final void s(int i10) {
        t(this, i10, false, 0);
        this.N.endNodeMovement();
    }

    public final void setDeferredChanges$runtime_release(@Nullable ChangeList changeList) {
        this.deferredChanges = changeList;
    }

    public final void setInsertTable$runtime_release(@NotNull SlotTable slotTable) {
        this.insertTable = slotTable;
    }

    public final void setReader$runtime_release(@NotNull SlotReader slotReader) {
        this.reader = slotReader;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008e  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d8  */
    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipCurrentGroup() {
        int iRotateLeft;
        int iHashCode;
        int iRotateRight;
        if (this.f14467s.isEmpty()) {
            this.f14460k = this.reader.skipGroup() + this.f14460k;
            return;
        }
        SlotReader slotReader = this.reader;
        int groupKey = slotReader.getGroupKey();
        Object groupObjectKey = slotReader.getGroupObjectKey();
        Object groupAux = slotReader.getGroupAux();
        int i10 = this.f14461l;
        if (groupObjectKey == null) {
            if (groupAux == null || groupKey != 207 || Intrinsics.areEqual(groupAux, Composer.INSTANCE.getEmpty())) {
                iRotateLeft = Integer.rotateLeft(Integer.rotateLeft(getCompoundKeyHash(), 3) ^ groupKey, 3) ^ i10;
            } else {
                this.compoundKeyHash = Integer.rotateLeft(groupAux.hashCode() ^ Integer.rotateLeft(getCompoundKeyHash(), 3), 3) ^ i10;
            }
            w(null, slotReader.isNode());
            p();
            slotReader.endGroup();
            if (groupObjectKey != null) {
                if (groupObjectKey instanceof Enum) {
                    iHashCode = ((Enum) groupObjectKey).ordinal();
                } else {
                    iHashCode = groupObjectKey.hashCode();
                }
                iRotateRight = iHashCode ^ Integer.rotateRight(getCompoundKeyHash(), 3);
            } else {
                if (groupAux == null && groupKey == 207 && !Intrinsics.areEqual(groupAux, Composer.INSTANCE.getEmpty())) {
                    this.compoundKeyHash = Integer.rotateRight(groupAux.hashCode() ^ Integer.rotateRight(getCompoundKeyHash() ^ i10, 3), 3);
                    return;
                }
                iRotateRight = Integer.rotateRight(getCompoundKeyHash() ^ i10, 3) ^ groupKey;
            }
            this.compoundKeyHash = Integer.rotateRight(iRotateRight, 3);
        }
        iRotateLeft = Integer.rotateLeft((groupObjectKey instanceof Enum ? ((Enum) groupObjectKey).ordinal() : groupObjectKey.hashCode()) ^ Integer.rotateLeft(getCompoundKeyHash(), 3), 3);
        this.compoundKeyHash = iRotateLeft;
        w(null, slotReader.isNode());
        p();
        slotReader.endGroup();
        if (groupObjectKey != null) {
            if (groupAux == null) {
            }
            iRotateRight = Integer.rotateRight(getCompoundKeyHash() ^ i10, 3) ^ groupKey;
        } else {
            if (groupObjectKey instanceof Enum) {
                iHashCode = ((Enum) groupObjectKey).ordinal();
            } else {
                iHashCode = groupObjectKey.hashCode();
            }
            iRotateRight = iHashCode ^ Integer.rotateRight(getCompoundKeyHash(), 3);
        }
        this.compoundKeyHash = Integer.rotateRight(iRotateRight, 3);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipToGroupEnd() {
        if (this.f14460k != 0) {
            ComposerKt.composeImmediateRuntimeError("No nodes can be emitted before calling skipAndEndGroup");
        }
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null) {
            currentRecomposeScope$runtime_release.scopeSkipped();
        }
        if (!this.f14467s.isEmpty()) {
            p();
        } else {
            this.f14460k = this.reader.getParentNodes();
            this.reader.skipToGroupEnd();
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformation(@NotNull String sourceInformation) {
        if (getInserting() && this.C) {
            this.J.recordGroupSourceInformation(sourceInformation);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerEnd() {
        if (getInserting() && this.C) {
            this.J.recordGrouplessCallSourceInformationEnd();
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerStart(int key, @NotNull String sourceInformation) {
        if (getInserting() && this.C) {
            this.J.recordGrouplessCallSourceInformationStart(key, sourceInformation);
        }
    }

    public final int stacksSize$runtime_release() {
        return this.m.getF14573b() + this.f14457h.getSize() + this.f14472x.getF14573b() + this.E.getSize() + this.f14468t.getF14573b();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startDefaults() {
        u(-127, null, GroupKind.f14562a.m2062getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startMovableGroup(int key, @Nullable Object dataKey) {
        u(key, dataKey, GroupKind.f14562a.m2062getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    public void startNode() {
        u(125, null, GroupKind.f14562a.m2063getNodeULZAiWs(), null);
        this.f14466r = true;
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void startProvider(@NotNull ProvidedValue<?> value) {
        ValueHolder<?> valueHolder;
        PersistentCompositionLocalMap persistentCompositionLocalMapD = d();
        v(201, ComposerKt.getProvider());
        Object objRememberedValue = rememberedValue();
        if (Intrinsics.areEqual(objRememberedValue, Composer.INSTANCE.getEmpty())) {
            valueHolder = null;
        } else {
            Intrinsics.checkNotNull(objRememberedValue, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            valueHolder = (ValueHolder) objRememberedValue;
        }
        CompositionLocal<?> compositionLocal = value.getCompositionLocal();
        Intrinsics.checkNotNull(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
        ValueHolder<?> valueHolderUpdatedStateOf$runtime_release = compositionLocal.updatedStateOf$runtime_release(value, valueHolder);
        boolean z10 = true;
        boolean z11 = !Intrinsics.areEqual(valueHolderUpdatedStateOf$runtime_release, valueHolder);
        if (z11) {
            updateRememberedValue(valueHolderUpdatedStateOf$runtime_release);
        }
        boolean z12 = false;
        if (getInserting()) {
            if (value.getCanOverride() || !CompositionLocalMapKt.contains(persistentCompositionLocalMapD, compositionLocal)) {
                persistentCompositionLocalMapD = persistentCompositionLocalMapD.putValue(compositionLocal, valueHolderUpdatedStateOf$runtime_release);
            }
            this.K = true;
        } else {
            SlotReader slotReader = this.reader;
            Object objGroupAux = slotReader.groupAux(slotReader.getCurrentGroup());
            Intrinsics.checkNotNull(objGroupAux, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap = (PersistentCompositionLocalMap) objGroupAux;
            persistentCompositionLocalMapD = ((!getSkipping() || z11) && (value.getCanOverride() || !CompositionLocalMapKt.contains(persistentCompositionLocalMapD, compositionLocal))) ? persistentCompositionLocalMapD.putValue(compositionLocal, valueHolderUpdatedStateOf$runtime_release) : persistentCompositionLocalMap;
            if (!this.f14473y && persistentCompositionLocalMap == persistentCompositionLocalMapD) {
                z10 = false;
            }
            z12 = z10;
        }
        if (z12 && !getInserting()) {
            q(persistentCompositionLocalMapD);
        }
        this.f14472x.push(ComposerKt.access$asInt(this.f14471w));
        this.f14471w = z12;
        this.L = persistentCompositionLocalMapD;
        u(202, ComposerKt.getCompositionLocalMap(), GroupKind.f14562a.m2062getGroupULZAiWs(), persistentCompositionLocalMapD);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.compose.runtime.PersistentCompositionLocalMap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.compose.runtime.ComposerImpl] */
    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void startProviders(@NotNull ProvidedValue<?>[] values) {
        ?? r1;
        PersistentMap<CompositionLocal<Object>, ValueHolder<Object>> persistentMapBuild2;
        PersistentCompositionLocalMap persistentCompositionLocalMapD = d();
        v(201, ComposerKt.getProvider());
        boolean z10 = true;
        boolean z11 = false;
        if (getInserting()) {
            PersistentCompositionLocalMap persistentCompositionLocalMapUpdateCompositionMap$default = CompositionLocalMapKt.updateCompositionMap$default(values, persistentCompositionLocalMapD, null, 4, null);
            PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> builderBuilder2 = persistentCompositionLocalMapD.builder2();
            builderBuilder2.putAll(persistentCompositionLocalMapUpdateCompositionMap$default);
            persistentMapBuild2 = builderBuilder2.build2();
            v(204, ComposerKt.getProviderMaps());
            nextSlot();
            updateValue(persistentMapBuild2);
            nextSlot();
            updateValue(persistentCompositionLocalMapUpdateCompositionMap$default);
            h(false);
            this.K = true;
        } else {
            Object objGroupGet = this.reader.groupGet(0);
            Intrinsics.checkNotNull(objGroupGet, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap = (PersistentCompositionLocalMap) objGroupGet;
            Object objGroupGet2 = this.reader.groupGet(1);
            Intrinsics.checkNotNull(objGroupGet2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) objGroupGet2;
            PersistentCompositionLocalMap persistentCompositionLocalMapUpdateCompositionMap = CompositionLocalMapKt.updateCompositionMap(values, persistentCompositionLocalMapD, persistentCompositionLocalMap2);
            if (getSkipping() && !this.f14473y && Intrinsics.areEqual(persistentCompositionLocalMap2, persistentCompositionLocalMapUpdateCompositionMap)) {
                this.f14460k = this.reader.skipGroup() + this.f14460k;
                r1 = persistentCompositionLocalMap;
            } else {
                PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> builderBuilder3 = persistentCompositionLocalMapD.builder2();
                builderBuilder3.putAll(persistentCompositionLocalMapUpdateCompositionMap);
                PersistentMap<CompositionLocal<Object>, ValueHolder<Object>> persistentMapBuild3 = builderBuilder3.build2();
                v(204, ComposerKt.getProviderMaps());
                nextSlot();
                updateValue(persistentMapBuild3);
                nextSlot();
                updateValue(persistentCompositionLocalMapUpdateCompositionMap);
                h(false);
                if (!this.f14473y && Intrinsics.areEqual(persistentMapBuild3, persistentCompositionLocalMap)) {
                    z10 = false;
                }
                z11 = z10;
                r1 = persistentMapBuild3;
            }
        }
        if (z11 && !getInserting()) {
            r1 = persistentMapBuild2;
            q(r1);
        }
        r1 = persistentMapBuild2;
        r1 = persistentMapBuild2;
        this.f14472x.push(ComposerKt.access$asInt(this.f14471w));
        this.f14471w = z11;
        this.L = r1;
        u(202, ComposerKt.getCompositionLocalMap(), GroupKind.f14562a.m2062getGroupULZAiWs(), r1);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startReplaceGroup(int key) {
        if (this.f14458i != null) {
            u(key, null, GroupKind.f14562a.m2062getGroupULZAiWs(), null);
            return;
        }
        B();
        this.compoundKeyHash = this.f14461l ^ Integer.rotateLeft(Integer.rotateLeft(getCompoundKeyHash(), 3) ^ key, 3);
        this.f14461l++;
        SlotReader slotReader = this.reader;
        if (getInserting()) {
            slotReader.beginEmpty();
            this.J.startGroup(key, Composer.INSTANCE.getEmpty());
            j(false, null);
            return;
        }
        if (slotReader.getGroupKey() == key && !slotReader.getHasObjectKey()) {
            slotReader.startGroup();
            j(false, null);
            return;
        }
        if (!slotReader.isGroupEnd()) {
            int i10 = this.f14459j;
            int currentGroup = slotReader.getCurrentGroup();
            s(this.reader.getCurrentGroup());
            ComposerChangeListWriter composerChangeListWriter = this.N;
            composerChangeListWriter.removeCurrentGroup();
            composerChangeListWriter.removeNode(i10, slotReader.skipGroup());
            ComposerKt.access$removeRange(this.f14467s, currentGroup, slotReader.getCurrentGroup());
        }
        slotReader.beginEmpty();
        this.inserting = true;
        this.L = null;
        if (this.J.getClosed()) {
            SlotWriter slotWriterOpenWriter = this.insertTable.openWriter();
            this.J = slotWriterOpenWriter;
            slotWriterOpenWriter.skipToGroupEnd();
            this.K = false;
            this.L = null;
        }
        SlotWriter slotWriter = this.J;
        slotWriter.beginInsert();
        int currentGroup2 = slotWriter.getCurrentGroup();
        slotWriter.startGroup(key, Composer.INSTANCE.getEmpty());
        this.O = slotWriter.anchor(currentGroup2);
        j(false, null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startReplaceableGroup(int key) {
        u(key, null, GroupKind.f14562a.m2062getGroupULZAiWs(), null);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x006c  */
    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    @NotNull
    public Composer startRestartGroup(int key) {
        RecomposeScopeImpl recomposeScopeImpl;
        boolean z10;
        startReplaceGroup(key);
        boolean inserting = getInserting();
        Stack<RecomposeScopeImpl> stack = this.E;
        if (inserting) {
            ControlledComposition composition = getComposition();
            Intrinsics.checkNotNull(composition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            RecomposeScopeImpl recomposeScopeImpl2 = new RecomposeScopeImpl((CompositionImpl) composition);
            stack.push(recomposeScopeImpl2);
            updateValue(recomposeScopeImpl2);
            recomposeScopeImpl2.start(this.B);
        } else {
            l lVarAccess$removeLocation = ComposerKt.access$removeLocation(this.f14467s, this.reader.getParent());
            Object next = this.reader.next();
            if (Intrinsics.areEqual(next, Composer.INSTANCE.getEmpty())) {
                ControlledComposition composition2 = getComposition();
                Intrinsics.checkNotNull(composition2, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
                recomposeScopeImpl = new RecomposeScopeImpl((CompositionImpl) composition2);
                updateValue(recomposeScopeImpl);
            } else {
                Intrinsics.checkNotNull(next, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                recomposeScopeImpl = (RecomposeScopeImpl) next;
            }
            if (lVarAccess$removeLocation == null) {
                boolean forcedRecompose = recomposeScopeImpl.getForcedRecompose();
                if (forcedRecompose) {
                    recomposeScopeImpl.setForcedRecompose(false);
                }
                z10 = forcedRecompose;
            }
            recomposeScopeImpl.setRequiresRecompose(z10);
            stack.push(recomposeScopeImpl);
            recomposeScopeImpl.start(this.B);
        }
        return this;
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableGroup(int key, @Nullable Object dataKey) {
        if (!getInserting() && this.reader.getGroupKey() == key && !Intrinsics.areEqual(this.reader.getGroupAux(), dataKey) && this.f14474z < 0) {
            this.f14474z = this.reader.getCurrentGroup();
            this.f14473y = true;
        }
        u(key, null, GroupKind.f14562a.m2062getGroupULZAiWs(), dataKey);
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableNode() {
        u(125, null, GroupKind.f14562a.m2064getReusableNodeULZAiWs(), null);
        this.f14466r = true;
    }

    public final void startReuseFromRoot() {
        this.f14474z = 100;
        this.f14473y = true;
    }

    public final boolean tryImminentInvalidation$runtime_release(@NotNull RecomposeScopeImpl scope, @Nullable Object instance) {
        Anchor anchor = scope.getAnchor();
        if (anchor == null) {
            return false;
        }
        int indexFor = anchor.toIndexFor(this.reader.getTable());
        if (!this.isComposing || indexFor < this.reader.getCurrentGroup()) {
            return false;
        }
        ComposerKt.access$insertIfMissing(this.f14467s, indexFor, scope, instance);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x01fb A[LOOP:0: B:86:0x01ae->B:102:0x01fb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:136:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:139:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:140:0x02d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x02db  */
    /* JADX WARN: Code duplicated, block: B:143:0x02df  */
    /* JADX WARN: Code duplicated, block: B:145:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:147:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:151:0x032e  */
    /* JADX WARN: Code duplicated, block: B:152:0x0330  */
    /* JADX WARN: Code duplicated, block: B:154:0x0336  */
    /* JADX WARN: Code duplicated, block: B:159:0x0289 A[EDGE_INSN: B:159:0x0289->B:130:0x0289 BREAK  A[LOOP:0: B:86:0x01ae->B:102:0x01fb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x006b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0079  */
    /* JADX WARN: Code duplicated, block: B:23:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x0091  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00be  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:52:0x0100  */
    /* JADX WARN: Code duplicated, block: B:58:0x011a  */
    /* JADX WARN: Code duplicated, block: B:61:0x012d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x012f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0139  */
    /* JADX WARN: Code duplicated, block: B:66:0x014d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0153  */
    /* JADX WARN: Code duplicated, block: B:70:0x0161  */
    /* JADX WARN: Code duplicated, block: B:72:0x0166  */
    /* JADX WARN: Code duplicated, block: B:74:0x016f  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void u(int i10, Object obj, int i11, Object obj2) {
        int iRotateLeft;
        GroupKind.Companion companion;
        boolean z10;
        boolean z11;
        v vVar;
        v vVar2;
        v vVar3;
        Object objValueOf;
        MutableScatterMap<K, Object> mutableScatterMap;
        Object obj3;
        MutableIntObjectMap<i> mutableIntObjectMap;
        ArrayList arrayList;
        int i12;
        int i13;
        Object[] objArr;
        long[] jArr;
        Object[] objArr2;
        long[] jArr2;
        List listAsMutableList;
        int currentGroup;
        v vVar4;
        Object empty = obj;
        B();
        int i14 = this.f14461l;
        if (empty == null) {
            if (obj2 == null || i10 != 207 || Intrinsics.areEqual(obj2, Composer.INSTANCE.getEmpty())) {
                iRotateLeft = i14 ^ Integer.rotateLeft(Integer.rotateLeft(getCompoundKeyHash(), 3) ^ i10, 3);
            } else {
                this.compoundKeyHash = i14 ^ Integer.rotateLeft(obj2.hashCode() ^ Integer.rotateLeft(getCompoundKeyHash(), 3), 3);
            }
            if (empty == null) {
                this.f14461l++;
            }
            companion = GroupKind.f14562a;
            if (i11 != companion.m2062getGroupULZAiWs()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (getInserting()) {
                this.reader.beginEmpty();
                currentGroup = this.J.getCurrentGroup();
                if (z10) {
                    this.J.startNode(i10, Composer.INSTANCE.getEmpty());
                } else if (obj2 != null) {
                    SlotWriter slotWriter = this.J;
                    if (empty == null) {
                        empty = Composer.INSTANCE.getEmpty();
                    }
                    slotWriter.startData(i10, empty, obj2);
                } else {
                    SlotWriter slotWriter2 = this.J;
                    if (empty == null) {
                        empty = Composer.INSTANCE.getEmpty();
                    }
                    slotWriter2.startGroup(i10, empty);
                }
                vVar4 = this.f14458i;
                if (vVar4 != null) {
                    KeyInfo keyInfo = new KeyInfo(i10, -1, (-2) - currentGroup, -1, 0);
                    vVar4.f83331e.set(keyInfo.getLocation(), new i(-1, this.f14459j - vVar4.f83328b, 0));
                    vVar4.f83330d.add(keyInfo);
                }
                j(z10, null);
                return;
            }
            if (i11 != companion.m2063getNodeULZAiWs() && this.f14473y) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f14458i == null) {
                int groupKey = this.reader.getGroupKey();
                if (z11 && groupKey == i10 && Intrinsics.areEqual(empty, this.reader.getGroupObjectKey())) {
                    w(obj2, z10);
                } else {
                    this.f14458i = new v(this.reader.extractKeys(), this.f14459j);
                }
            }
            vVar = this.f14458i;
            if (vVar != null) {
                if (empty != null) {
                    objValueOf = new JoinedKey(Integer.valueOf(i10), empty);
                } else {
                    objValueOf = Integer.valueOf(i10);
                }
                mutableScatterMap = ((t) vVar.f83332f.getValue()).f83317a;
                obj3 = mutableScatterMap.get(objValueOf);
                if (obj3 != null) {
                    if (TypeIntrinsics.isMutableList(obj3)) {
                        listAsMutableList = TypeIntrinsics.asMutableList(obj3);
                        Object objRemove = listAsMutableList.remove(0);
                        if (listAsMutableList.isEmpty()) {
                            mutableScatterMap.remove(objValueOf);
                        }
                        obj3 = objRemove;
                    } else {
                        mutableScatterMap.remove(objValueOf);
                    }
                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type V of androidx.compose.runtime.MutableScatterMultiMap.pop_impl$lambda$1");
                } else {
                    obj3 = null;
                }
                KeyInfo keyInfo2 = (KeyInfo) obj3;
                mutableIntObjectMap = vVar.f83331e;
                arrayList = vVar.f83330d;
                i12 = vVar.f83328b;
                if (!z11 || keyInfo2 == null) {
                    this.reader.beginEmpty();
                    this.inserting = true;
                    this.L = null;
                    if (this.J.getClosed()) {
                        SlotWriter slotWriterOpenWriter = this.insertTable.openWriter();
                        this.J = slotWriterOpenWriter;
                        slotWriterOpenWriter.skipToGroupEnd();
                        this.K = false;
                        this.L = null;
                    }
                    this.J.beginInsert();
                    int currentGroup2 = this.J.getCurrentGroup();
                    if (z10) {
                        this.J.startNode(i10, Composer.INSTANCE.getEmpty());
                    } else if (obj2 != null) {
                        SlotWriter slotWriter3 = this.J;
                        if (empty == null) {
                            empty = Composer.INSTANCE.getEmpty();
                        }
                        slotWriter3.startData(i10, empty, obj2);
                    } else {
                        SlotWriter slotWriter4 = this.J;
                        if (empty == null) {
                            empty = Composer.INSTANCE.getEmpty();
                        }
                        slotWriter4.startGroup(i10, empty);
                    }
                    this.O = this.J.anchor(currentGroup2);
                    KeyInfo keyInfo3 = new KeyInfo(i10, -1, (-2) - currentGroup2, -1, 0);
                    mutableIntObjectMap.set(keyInfo3.getLocation(), new i(-1, this.f14459j - i12, 0));
                    arrayList.add(keyInfo3);
                    ArrayList arrayList2 = new ArrayList();
                    if (z10) {
                        i13 = 0;
                    } else {
                        i13 = this.f14459j;
                    }
                    vVar3 = new v(arrayList2, i13);
                } else {
                    arrayList.add(keyInfo2);
                    int location = keyInfo2.getLocation();
                    this.f14459j = vVar.a(keyInfo2) + i12;
                    i iVar = mutableIntObjectMap.get(keyInfo2.getLocation());
                    int i15 = iVar != null ? iVar.f83255a : -1;
                    int i16 = vVar.f83329c;
                    int i17 = i15 - i16;
                    char c10 = 7;
                    long j10 = -9187201950435737472L;
                    if (i15 > i16) {
                        Object[] objArr3 = mutableIntObjectMap.values;
                        long[] jArr3 = mutableIntObjectMap.metadata;
                        int length = jArr3.length - 2;
                        if (length >= 0) {
                            int i18 = 0;
                            while (true) {
                                long j11 = jArr3[i18];
                                long[] jArr4 = jArr3;
                                if ((((~j11) << c10) & j11 & j10) == j10) {
                                    if (i18 != length) {
                                        break;
                                        break;
                                    }
                                    i18++;
                                    jArr3 = jArr4;
                                    c10 = 7;
                                    j10 = -9187201950435737472L;
                                } else {
                                    int i19 = 8 - ((~(i18 - length)) >>> 31);
                                    for (int i20 = 0; i20 < i19; i20++) {
                                        if ((j11 & 255) < 128) {
                                            i iVar2 = (i) objArr3[(i18 << 3) + i20];
                                            int i21 = iVar2.f83255a;
                                            if (i21 == i15) {
                                                iVar2.f83255a = i16;
                                            } else if (i16 <= i21 && i21 < i15) {
                                                iVar2.f83255a = i21 + 1;
                                            }
                                        }
                                        j11 >>= 8;
                                    }
                                    if (i19 != 8) {
                                        break;
                                    }
                                    if (i18 != length) {
                                        break;
                                    }
                                    i18++;
                                    jArr3 = jArr4;
                                    c10 = 7;
                                    j10 = -9187201950435737472L;
                                }
                            }
                        }
                    } else if (i16 > i15) {
                        Object[] objArr4 = mutableIntObjectMap.values;
                        long[] jArr5 = mutableIntObjectMap.metadata;
                        int length2 = jArr5.length - 2;
                        if (length2 >= 0) {
                            int i22 = 0;
                            while (true) {
                                long j12 = jArr5[i22];
                                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i23 = 8 - ((~(i22 - length2)) >>> 31);
                                    int i24 = 0;
                                    while (i24 < i23) {
                                        if ((j12 & 255) < 128) {
                                            i iVar3 = (i) objArr4[(i22 << 3) + i24];
                                            objArr2 = objArr4;
                                            int i25 = iVar3.f83255a;
                                            if (i25 == i15) {
                                                iVar3.f83255a = i16;
                                            } else {
                                                jArr2 = jArr5;
                                                if (i15 + 1 <= i25 && i25 < i16) {
                                                    iVar3.f83255a = i25 - 1;
                                                }
                                            }
                                            j12 >>= 8;
                                            i24++;
                                            objArr4 = objArr2;
                                            jArr5 = jArr2;
                                        } else {
                                            objArr2 = objArr4;
                                        }
                                        jArr2 = jArr5;
                                        j12 >>= 8;
                                        i24++;
                                        objArr4 = objArr2;
                                        jArr5 = jArr2;
                                    }
                                    objArr = objArr4;
                                    jArr = jArr5;
                                    if (i23 != 8) {
                                        break;
                                    }
                                } else {
                                    objArr = objArr4;
                                    jArr = jArr5;
                                }
                                if (i22 == length2) {
                                    break;
                                }
                                i22++;
                                objArr4 = objArr;
                                jArr5 = jArr;
                            }
                        }
                    }
                    ComposerChangeListWriter composerChangeListWriter = this.N;
                    composerChangeListWriter.moveReaderRelativeTo(location);
                    this.reader.reposition(location);
                    if (i17 > 0) {
                        composerChangeListWriter.moveCurrentGroup(i17);
                    }
                    w(obj2, z10);
                    vVar2 = null;
                }
                j(z10, vVar3);
            }
            vVar2 = null;
            vVar3 = vVar2;
            j(z10, vVar3);
        }
        iRotateLeft = Integer.rotateLeft((empty instanceof Enum ? ((Enum) empty).ordinal() : obj.hashCode()) ^ Integer.rotateLeft(getCompoundKeyHash(), 3), 3);
        this.compoundKeyHash = iRotateLeft;
        if (empty == null) {
            this.f14461l++;
        }
        companion = GroupKind.f14562a;
        if (i11 != companion.m2062getGroupULZAiWs()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getInserting()) {
            this.reader.beginEmpty();
            currentGroup = this.J.getCurrentGroup();
            if (z10) {
                this.J.startNode(i10, Composer.INSTANCE.getEmpty());
            } else if (obj2 != null) {
                SlotWriter slotWriter5 = this.J;
                if (empty == null) {
                    empty = Composer.INSTANCE.getEmpty();
                }
                slotWriter5.startData(i10, empty, obj2);
            } else {
                SlotWriter slotWriter6 = this.J;
                if (empty == null) {
                    empty = Composer.INSTANCE.getEmpty();
                }
                slotWriter6.startGroup(i10, empty);
            }
            vVar4 = this.f14458i;
            if (vVar4 != null) {
                KeyInfo keyInfo4 = new KeyInfo(i10, -1, (-2) - currentGroup, -1, 0);
                vVar4.f83331e.set(keyInfo4.getLocation(), new i(-1, this.f14459j - vVar4.f83328b, 0));
                vVar4.f83330d.add(keyInfo4);
            }
            j(z10, null);
            return;
        }
        if (i11 != companion.m2063getNodeULZAiWs()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.f14458i == null) {
            int groupKey2 = this.reader.getGroupKey();
            if (z11) {
                this.f14458i = new v(this.reader.extractKeys(), this.f14459j);
            } else {
                this.f14458i = new v(this.reader.extractKeys(), this.f14459j);
            }
        }
        vVar = this.f14458i;
        if (vVar != null) {
            if (empty != null) {
                objValueOf = new JoinedKey(Integer.valueOf(i10), empty);
            } else {
                objValueOf = Integer.valueOf(i10);
            }
            mutableScatterMap = ((t) vVar.f83332f.getValue()).f83317a;
            obj3 = mutableScatterMap.get(objValueOf);
            if (obj3 != null) {
                if (TypeIntrinsics.isMutableList(obj3)) {
                    listAsMutableList = TypeIntrinsics.asMutableList(obj3);
                    Object objRemove2 = listAsMutableList.remove(0);
                    if (listAsMutableList.isEmpty()) {
                        mutableScatterMap.remove(objValueOf);
                    }
                    obj3 = objRemove2;
                } else {
                    mutableScatterMap.remove(objValueOf);
                }
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type V of androidx.compose.runtime.MutableScatterMultiMap.pop_impl$lambda$1");
            } else {
                obj3 = null;
            }
            KeyInfo keyInfo5 = (KeyInfo) obj3;
            mutableIntObjectMap = vVar.f83331e;
            arrayList = vVar.f83330d;
            i12 = vVar.f83328b;
            if (z11) {
            }
            this.reader.beginEmpty();
            this.inserting = true;
            this.L = null;
            if (this.J.getClosed()) {
                SlotWriter slotWriterOpenWriter2 = this.insertTable.openWriter();
                this.J = slotWriterOpenWriter2;
                slotWriterOpenWriter2.skipToGroupEnd();
                this.K = false;
                this.L = null;
            }
            this.J.beginInsert();
            int currentGroup3 = this.J.getCurrentGroup();
            if (z10) {
                this.J.startNode(i10, Composer.INSTANCE.getEmpty());
            } else if (obj2 != null) {
                SlotWriter slotWriter7 = this.J;
                if (empty == null) {
                    empty = Composer.INSTANCE.getEmpty();
                }
                slotWriter7.startData(i10, empty, obj2);
            } else {
                SlotWriter slotWriter8 = this.J;
                if (empty == null) {
                    empty = Composer.INSTANCE.getEmpty();
                }
                slotWriter8.startGroup(i10, empty);
            }
            this.O = this.J.anchor(currentGroup3);
            KeyInfo keyInfo6 = new KeyInfo(i10, -1, (-2) - currentGroup3, -1, 0);
            mutableIntObjectMap.set(keyInfo6.getLocation(), new i(-1, this.f14459j - i12, 0));
            arrayList.add(keyInfo6);
            ArrayList arrayList3 = new ArrayList();
            if (z10) {
                i13 = 0;
            } else {
                i13 = this.f14459j;
            }
            vVar3 = new v(arrayList3, i13);
            j(z10, vVar3);
        }
        vVar2 = null;
        vVar3 = vVar2;
        j(z10, vVar3);
    }

    @PublishedApi
    public final void updateCachedValue(@Nullable Object value) {
        int i10;
        int i11;
        if (value instanceof RememberObserver) {
            if (getInserting()) {
                this.N.remember((RememberObserver) value);
            }
            this.f14453d.add(value);
            RememberObserver rememberObserver = (RememberObserver) value;
            Anchor anchor = null;
            if (getInserting()) {
                if (ComposerKt.isAfterFirstChild(this.J)) {
                    int currentGroup = this.J.getCurrentGroup() - 1;
                    int iParent = this.J.parent(currentGroup);
                    while (true) {
                        int i12 = iParent;
                        i11 = currentGroup;
                        currentGroup = i12;
                        if (currentGroup == this.J.getParent() || currentGroup < 0) {
                            break;
                        } else {
                            iParent = this.J.parent(currentGroup);
                        }
                    }
                    anchor = this.J.anchor(i11);
                }
            } else if (ComposerKt.isAfterFirstChild(this.reader)) {
                int currentGroup2 = this.reader.getCurrentGroup() - 1;
                int iParent2 = this.reader.parent(currentGroup2);
                while (true) {
                    int i13 = iParent2;
                    i10 = currentGroup2;
                    currentGroup2 = i13;
                    if (currentGroup2 == this.reader.getParent() || currentGroup2 < 0) {
                        break;
                    } else {
                        iParent2 = this.reader.parent(currentGroup2);
                    }
                }
                anchor = this.reader.anchor(i10);
            }
            value = new RememberObserverHolder(rememberObserver, anchor);
        }
        updateValue(value);
    }

    @Override // androidx.compose.runtime.Composer
    public void updateRememberedValue(@Nullable Object value) {
        updateCachedValue(value);
    }

    @PublishedApi
    public final void updateValue(@Nullable Object value) {
        if (getInserting()) {
            this.J.update(value);
            return;
        }
        boolean hadNext = this.reader.getHadNext();
        ComposerChangeListWriter composerChangeListWriter = this.N;
        if (!hadNext) {
            SlotReader slotReader = this.reader;
            composerChangeListWriter.appendValue(slotReader.anchor(slotReader.getParent()), value);
            return;
        }
        int groupSlotIndex = this.reader.getGroupSlotIndex() - 1;
        if (!composerChangeListWriter.getPastParent()) {
            composerChangeListWriter.updateValue(value, groupSlotIndex);
        } else {
            SlotReader slotReader2 = this.reader;
            composerChangeListWriter.updateAnchoredValue(value, slotReader2.anchor(slotReader2.getParent()), groupSlotIndex);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void useNode() {
        if (!this.f14466r) {
            ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f14466r = false;
        if (!(!getInserting())) {
            ComposerKt.composeImmediateRuntimeError("useNode() called while inserting");
        }
        SlotReader slotReader = this.reader;
        Object objNode = slotReader.node(slotReader.getParent());
        ComposerChangeListWriter composerChangeListWriter = this.N;
        composerChangeListWriter.moveDown(objNode);
        if (this.f14473y && (objNode instanceof ComposeNodeLifecycleCallback)) {
            composerChangeListWriter.useNode(objNode);
        }
    }

    public final void v(int i10, Object obj) {
        u(i10, obj, GroupKind.f14562a.m2062getGroupULZAiWs(), null);
    }

    public final void verifyConsistent$runtime_release() {
        this.insertTable.verifyWellFormed();
    }

    public final void w(Object obj, boolean z10) {
        if (z10) {
            this.reader.startNode();
            return;
        }
        if (obj != null && this.reader.getGroupAux() != obj) {
            this.N.updateAuxData(obj);
        }
        this.reader.startGroup();
    }

    public final void x() {
        this.f14461l = 0;
        SlotTable slotTable = this.f14452c;
        this.reader = slotTable.openReader();
        GroupKind.Companion companion = GroupKind.f14562a;
        u(100, null, companion.m2062getGroupULZAiWs(), null);
        CompositionContext compositionContext = this.f14451b;
        compositionContext.startComposing$runtime_release();
        this.f14469u = compositionContext.getCompositionLocalScope$runtime_release();
        this.f14472x.push(ComposerKt.access$asInt(this.f14471w));
        this.f14471w = changed(this.f14469u);
        this.L = null;
        if (!this.f14464p) {
            this.f14464p = compositionContext.getCollectingParameterInformation$runtime_release();
        }
        if (!this.C) {
            this.C = compositionContext.getCollectingSourceInformation$runtime_release();
        }
        Set<CompositionData> set = (Set) CompositionLocalMapKt.read(this.f14469u, InspectionTablesKt.getLocalInspectionTables());
        if (set != null) {
            set.add(slotTable);
            compositionContext.recordInspectionTable$runtime_release(set);
        }
        u(compositionContext.getCompoundHashKey$runtime_release(), null, companion.m2062getGroupULZAiWs(), null);
    }

    public final void y(int i10, int i11) {
        if (A(i10) != i11) {
            if (i10 < 0) {
                MutableIntIntMap mutableIntIntMap = this.f14463o;
                if (mutableIntIntMap == null) {
                    mutableIntIntMap = new MutableIntIntMap(0, 1, null);
                    this.f14463o = mutableIntIntMap;
                }
                mutableIntIntMap.set(i10, i11);
                return;
            }
            int[] iArr = this.f14462n;
            if (iArr == null) {
                iArr = new int[this.reader.getF14739c()];
                ArraysKt___ArraysJvmKt.fill$default(iArr, -1, 0, 0, 6, (Object) null);
                this.f14462n = iArr;
            }
            iArr[i10] = i11;
        }
    }

    public final void z(int i10, int i11) {
        int iA = A(i10);
        if (iA != i11) {
            int i12 = i11 - iA;
            Stack<v> stack = this.f14457h;
            int size = stack.getSize() - 1;
            while (i10 != -1) {
                int iA2 = A(i10) + i12;
                y(i10, iA2);
                for (int i13 = size; -1 < i13; i13--) {
                    v vVarPeek = stack.peek(i13);
                    if (vVarPeek != null && vVarPeek.b(i10, iA2)) {
                        size = i13 - 1;
                        break;
                    }
                }
                if (i10 < 0) {
                    i10 = this.reader.getParent();
                } else if (this.reader.isNode(i10)) {
                    return;
                } else {
                    i10 = this.reader.parent(i10);
                }
            }
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(char value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Character) && value == ((Character) objNextSlot).charValue()) {
            return false;
        }
        updateValue(Character.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(byte value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Byte) && value == ((Number) objNextSlot).byteValue()) {
            return false;
        }
        updateValue(Byte.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(short value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Short) && value == ((Number) objNextSlot).shortValue()) {
            return false;
        }
        updateValue(Short.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(boolean value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Boolean) && value == ((Boolean) objNextSlot).booleanValue()) {
            return false;
        }
        updateValue(Boolean.valueOf(value));
        return true;
    }

    /* JADX INFO: compiled from: Composer.kt */
    public static final class a implements ReusableRememberObserver {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final b f14475p0;

        public a(@NotNull b bVar) {
            this.f14475p0 = bVar;
        }

        @Override // androidx.compose.runtime.RememberObserver
        public final void onAbandoned() {
            this.f14475p0.a();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public final void onForgotten() {
            this.f14475p0.a();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public final void onRemembered() {
        }
    }

    @InternalComposeApi
    public static /* synthetic */ void getCompoundKeyHash$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getInserting$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getSkipping$annotations() {
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(float value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Float) && value == ((Number) objNextSlot).floatValue()) {
            return false;
        }
        updateValue(Float.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(long value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Long) && value == ((Number) objNextSlot).longValue()) {
            return false;
        }
        updateValue(Long.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(double value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Double) && value == ((Number) objNextSlot).doubleValue()) {
            return false;
        }
        updateValue(Double.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(int value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Integer) && value == ((Number) objNextSlot).intValue()) {
            return false;
        }
        updateValue(Integer.valueOf(value));
        return true;
    }
}
