package androidx.compose.ui.platform;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import androidx.collection.SparseArrayCompat;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.R;
import androidx.compose.ui.TempListUtilsKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.platform.accessibility.CollectionInfoKt;
import androidx.compose.ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.platform.coreshims.ViewStructureCompat;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidAccessibilitySpannableString_androidKt;
import androidx.compose.ui.text.platform.URLSpanCache;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.nativesettings.common.Constants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u000e\b\u0000\u0018\u0000 ¥\u00012\u00020\u0001:\n?DL¥\u0001¦\u0001R§\u0001B\u0011\u0012\u0006\u0010C\u001a\u00020>¢\u0006\u0006\b£\u0001\u0010¤\u0001J-\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ;\u0010\n\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0007J\u001f\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cJ\u001f\u0010$\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0016J\u000f\u0010+\u001a\u00020\u0015H\u0000¢\u0006\u0004\b)\u0010*J\u0013\u0010,\u001a\u00020\u0015H\u0086@ø\u0001\u0001¢\u0006\u0004\b,\u0010-J\u0017\u00102\u001a\u00020\u00152\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\b0\u00101J#\u00107\u001a\u00020\u00152\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f03H\u0001¢\u0006\u0004\b5\u00106J\u001f\u0010=\u001a\u00020\u00152\u0006\u00108\u001a\u00020\u00132\u0006\u0010:\u001a\u000209H\u0001¢\u0006\u0004\b;\u0010<R\u0017\u0010C\u001a\u00020>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\"\u0010J\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR \u0010Q\u001a\u00020K8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bL\u0010M\u0012\u0004\bP\u0010*\u001a\u0004\bN\u0010OR\"\u0010X\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR \u0010_\u001a\u00020Y8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bZ\u0010[\u0012\u0004\b^\u0010*\u001a\u0004\b\\\u0010]R \u0010f\u001a\u00020`8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\ba\u0010b\u0012\u0004\be\u0010*\u001a\u0004\bc\u0010dR\"\u0010j\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bg\u0010S\u001a\u0004\bh\u0010U\"\u0004\bi\u0010WR$\u0010r\u001a\u0004\u0018\u00010k8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR&\u0010y\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020t0s8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR \u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u00040z8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R3\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f038@@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0005\b\u0084\u0001\u00106RF\u0010\u008c\u0001\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0085\u0001j\u000f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u0086\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b!\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001RG\u0010\u0090\u0001\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0085\u0001j\u000f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u0086\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u0087\u0001\u001a\u0006\b\u008e\u0001\u0010\u0089\u0001\"\u0006\b\u008f\u0001\u0010\u008b\u0001R \u0010\u0096\u0001\u001a\u00030\u0091\u00018\u0000X\u0080D¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R \u0010\u0099\u0001\u001a\u00030\u0091\u00018\u0000X\u0080D¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0093\u0001\u001a\u0006\b\u0098\u0001\u0010\u0095\u0001R<\u0010\u009f\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002090\u009a\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0006\b\u009b\u0001\u0010\u0081\u0001\u0012\u0005\b\u009e\u0001\u0010*\u001a\u0006\b\u009c\u0001\u0010\u0083\u0001\"\u0005\b\u009d\u0001\u00106R\u001d\u0010¢\u0001\u001a\u00020\u00028@X\u0081\u0004¢\u0006\u000e\u0012\u0005\b¡\u0001\u0010*\u001a\u0005\b \u0001\u0010U\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006¨\u0001"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Landroidx/core/view/AccessibilityDelegateCompat;", "", "vertical", "", "direction", "Landroidx/compose/ui/geometry/Offset;", "position", "canScroll-0AR0LA0$ui_release", "(ZIJ)Z", "canScroll", "", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "currentSemanticsNodes", "canScroll-moWRBKg$ui_release", "(Ljava/util/Collection;ZIJ)Z", "virtualViewId", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "info", "Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "", "populateAccessibilityNodeInfoProperties", "eventType", "Landroid/view/accessibility/AccessibilityEvent;", "createEvent$ui_release", "(II)Landroid/view/accessibility/AccessibilityEvent;", "createEvent", "Landroid/view/MotionEvent;", "event", "dispatchHoverEvent", "", "x", "y", "hitTestSemanticsAt$ui_release", "(FF)I", "hitTestSemanticsAt", "Landroid/view/View;", "host", "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "getAccessibilityNodeProvider", "onSemanticsChange$ui_release", "()V", "onSemanticsChange", "boundsUpdatesEventLoop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "onLayoutChange$ui_release", "(Landroidx/compose/ui/node/LayoutNode;)V", "onLayoutChange", "", "newSemanticsNodes", "sendSemanticsPropertyChangeEvents$ui_release", "(Ljava/util/Map;)V", "sendSemanticsPropertyChangeEvents", "newNode", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "oldNode", "sendContentCaptureSemanticsStructureChangeEvents$ui_release", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;)V", "sendContentCaptureSemanticsStructureChangeEvents", "Landroidx/compose/ui/platform/AndroidComposeView;", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "getView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "view", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getHoveredVirtualViewId$ui_release", "()I", "setHoveredVirtualViewId$ui_release", "(I)V", "hoveredVirtualViewId", "Landroid/view/accessibility/AccessibilityManager;", "c", "Landroid/view/accessibility/AccessibilityManager;", "getAccessibilityManager$ui_release", "()Landroid/view/accessibility/AccessibilityManager;", "getAccessibilityManager$ui_release$annotations", "accessibilityManager", "d", "Z", "getAccessibilityForceEnabledForTesting$ui_release", "()Z", "setAccessibilityForceEnabledForTesting$ui_release", "(Z)V", "accessibilityForceEnabledForTesting", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "e", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "getEnabledStateListener$ui_release", "()Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "getEnabledStateListener$ui_release$annotations", "enabledStateListener", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "f", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "getTouchExplorationStateListener$ui_release", "()Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "getTouchExplorationStateListener$ui_release$annotations", "touchExplorationStateListener", "r", "getContentCaptureForceEnabledForTesting$ui_release", "setContentCaptureForceEnabledForTesting$ui_release", "contentCaptureForceEnabledForTesting", "Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "s", "Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "getContentCaptureSession$ui_release", "()Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "setContentCaptureSession$ui_release", "(Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;)V", "contentCaptureSession", "Landroidx/collection/ArrayMap;", "Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;", "t", "Landroidx/collection/ArrayMap;", "getBufferedContentCaptureAppearedNodes$ui_release", "()Landroidx/collection/ArrayMap;", "bufferedContentCaptureAppearedNodes", "Landroidx/collection/ArraySet;", "u", "Landroidx/collection/ArraySet;", "getBufferedContentCaptureDisappearedNodes$ui_release", "()Landroidx/collection/ArraySet;", "bufferedContentCaptureDisappearedNodes", "w", "Ljava/util/Map;", "getCurrentSemanticsNodes$ui_release", "()Ljava/util/Map;", "setCurrentSemanticsNodes$ui_release", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "getIdToBeforeMap$ui_release", "()Ljava/util/HashMap;", "setIdToBeforeMap$ui_release", "(Ljava/util/HashMap;)V", "idToBeforeMap", "z", "getIdToAfterMap$ui_release", "setIdToAfterMap$ui_release", "idToAfterMap", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Ljava/lang/String;", "getEXTRA_DATA_TEST_TRAVERSALBEFORE_VAL$ui_release", "()Ljava/lang/String;", "EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL", "B", "getEXTRA_DATA_TEST_TRAVERSALAFTER_VAL$ui_release", "EXTRA_DATA_TEST_TRAVERSALAFTER_VAL", "", "D", "getPreviousSemanticsNodes$ui_release", "setPreviousSemanticsNodes$ui_release", "getPreviousSemanticsNodes$ui_release$annotations", "previousSemanticsNodes", "isEnabled$ui_release", "isEnabled$ui_release$annotations", "isEnabled", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "Companion", "MyNodeProvider", "SemanticsNodeCopy", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,3508:1\n1747#2,3:3509\n33#3,6:3512\n33#3,6:3518\n33#3,6:3524\n33#3,6:3530\n69#3,6:3536\n69#3,6:3542\n33#3,6:3549\n33#3,6:3559\n33#3,6:3565\n151#3,3:3571\n33#3,4:3574\n154#3,2:3578\n38#3:3580\n156#3:3581\n151#3,3:3582\n33#3,4:3585\n154#3,2:3589\n38#3:3591\n156#3:3592\n33#3,6:3593\n33#3,6:3599\n33#3,6:3605\n33#3,6:3611\n33#3,6:3617\n33#3,6:3623\n1#4:3548\n37#5,2:3555\n76#6:3557\n76#6:3558\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n*L\n494#1:3509,3\n659#1:3512,6\n735#1:3518,6\n820#1:3524,6\n1218#1:3530,6\n1229#1:3536,6\n1236#1:3542,6\n1917#1:3549,6\n2619#1:3559,6\n2623#1:3565,6\n2872#1:3571,3\n2872#1:3574,4\n2872#1:3578,2\n2872#1:3580\n2872#1:3581\n2879#1:3582,3\n2879#1:3585,4\n2879#1:3589,2\n2879#1:3591\n2879#1:3592\n2887#1:3593,6\n2897#1:3599,6\n2915#1:3605,6\n2929#1:3611,6\n2942#1:3617,6\n729#1:3623,6\n1982#1:3555,2\n2098#1:3557\n2269#1:3558\n*E\n"})
public final class AndroidComposeViewAccessibilityDelegateCompat extends AccessibilityDelegateCompat {
    public static final int AccessibilityCursorPositionUndefined = -1;
    public static final int AccessibilitySliderStepsCount = 20;

    @NotNull
    public static final String ClassName = "android.view.View";

    @NotNull
    public static final String ExtraDataIdKey = "androidx.compose.ui.semantics.id";

    @NotNull
    public static final String ExtraDataTestTagKey = "androidx.compose.ui.semantics.testTag";
    public static final int InvalidId = Integer.MIN_VALUE;

    @NotNull
    public static final String LogTag = "AccessibilityDelegate";
    public static final int ParcelSafeTextLength = 100000;
    public static final long SendRecurringAccessibilityEventsIntervalMillis = 100;

    @NotNull
    public static final String TextClassName = "android.widget.TextView";

    @NotNull
    public static final String TextFieldClassName = "android.widget.EditText";
    public static final long TextTraversedEventTimeoutMillis = 1000;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final String EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final String EXTRA_DATA_TEST_TRAVERSALAFTER_VAL;

    @NotNull
    public final URLSpanCache C;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public Map<Integer, SemanticsNodeCopy> previousSemanticsNodes;

    @NotNull
    public SemanticsNodeCopy E;
    public boolean F;

    @NotNull
    public final j G;

    @NotNull
    public final ArrayList H;

    @NotNull
    public final f I;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AndroidComposeView view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int hoveredVirtualViewId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final android.view.accessibility.AccessibilityManager accessibilityManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean accessibilityForceEnabledForTesting;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final androidx.compose.ui.platform.h f17044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final i f17045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<AccessibilityServiceInfo> f17046g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Handler f17047h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final AccessibilityNodeProviderCompat f17048i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17049j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final SparseArrayCompat<SparseArrayCompat<CharSequence>> f17050k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final SparseArrayCompat<Map<CharSequence, Integer>> f17051l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public Integer f17052n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final ArraySet<LayoutNode> f17053o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Channel<Unit> f17054p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f17055q;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public boolean contentCaptureForceEnabledForTesting;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ContentCaptureSessionCompat contentCaptureSession;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ArrayMap<Integer, ViewStructureCompat> bufferedContentCaptureAppearedNodes;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ArraySet<Integer> bufferedContentCaptureDisappearedNodes;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public d f17060v;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Map<Integer, SemanticsNodeWithAdjustedBounds> currentSemanticsNodes;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final ArraySet<Integer> f17062x;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public HashMap<Integer, Integer> idToBeforeMap;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public HashMap<Integer, Integer> idToAfterMap;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final int[] J = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Companion;", "", "()V", "AccessibilityActionsResourceIds", "", "AccessibilityCursorPositionUndefined", "", "AccessibilitySliderStepsCount", "ClassName", "", "ExtraDataIdKey", "ExtraDataTestTagKey", "InvalidId", "LogTag", "ParcelSafeTextLength", "SendRecurringAccessibilityEventsIntervalMillis", "", "TextClassName", "TextFieldClassName", "TextTraversedEventTimeoutMillis", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$MyNodeProvider;", "Landroid/view/accessibility/AccessibilityNodeProvider;", "(Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;)V", "addExtraDataToAccessibilityNodeInfo", "", "virtualViewId", "", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "extraDataKey", "", "arguments", "Landroid/os/Bundle;", "createAccessibilityNodeInfo", "performAction", "", "action", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class MyNodeProvider extends AccessibilityNodeProvider {
        public MyNodeProvider() {
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int virtualViewId, @NotNull AccessibilityNodeInfo info, @NotNull String extraDataKey, @Nullable Bundle arguments) {
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(extraDataKey, "extraDataKey");
            AndroidComposeViewAccessibilityDelegateCompat.this.a(virtualViewId, info, extraDataKey, arguments);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        @Nullable
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int virtualViewId) {
            return AndroidComposeViewAccessibilityDelegateCompat.access$createNodeInfo(AndroidComposeViewAccessibilityDelegateCompat.this, virtualViewId);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int virtualViewId, int action, @Nullable Bundle arguments) {
            return AndroidComposeViewAccessibilityDelegateCompat.access$performActionHelper(AndroidComposeViewAccessibilityDelegateCompat.this, virtualViewId, action, arguments);
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "", "", "hasPaneTitle", "Landroidx/compose/ui/semantics/SemanticsNode;", "a", "Landroidx/compose/ui/semantics/SemanticsNode;", "getSemanticsNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "b", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getUnmergedConfig", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "unmergedConfig", "", "", "c", "Ljava/util/Set;", "getChildren", "()Ljava/util/Set;", "children", "", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "currentSemanticsNodes", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;Ljava/util/Map;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    @VisibleForTesting
    @SourceDebugExtension({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,3508:1\n33#2,6:3509\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy\n*L\n414#1:3509,6\n*E\n"})
    public static final class SemanticsNodeCopy {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final SemanticsNode semanticsNode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final SemanticsConfiguration unmergedConfig;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final LinkedHashSet f17069c;

        public SemanticsNodeCopy(@NotNull SemanticsNode semanticsNode, @NotNull Map<Integer, SemanticsNodeWithAdjustedBounds> currentSemanticsNodes) {
            Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
            Intrinsics.checkNotNullParameter(currentSemanticsNodes, "currentSemanticsNodes");
            this.semanticsNode = semanticsNode;
            this.unmergedConfig = semanticsNode.getUnmergedConfig();
            this.f17069c = new LinkedHashSet();
            List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i10 = 0; i10 < size; i10++) {
                SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i10);
                if (currentSemanticsNodes.containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                    this.f17069c.add(Integer.valueOf(semanticsNode2.getId()));
                }
            }
        }

        @NotNull
        public final Set<Integer> getChildren() {
            return this.f17069c;
        }

        @NotNull
        public final SemanticsNode getSemanticsNode() {
            return this.semanticsNode;
        }

        @NotNull
        public final SemanticsConfiguration getUnmergedConfig() {
            return this.unmergedConfig;
        }

        public final boolean hasPaneTitle() {
            return this.unmergedConfig.contains(SemanticsProperties.INSTANCE.getPaneTitle());
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @RequiresApi(24)
    public static final class a {
        @JvmStatic
        @DoNotInline
        public static final void a(@NotNull AccessibilityNodeInfoCompat info, @NotNull SemanticsNode semanticsNode) {
            AccessibilityAction accessibilityAction;
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
            if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode) || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getSetProgress())) == null) {
                return;
            }
            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionSetProgress, accessibilityAction.getLabel()));
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @RequiresApi(28)
    public static final class b {
        @JvmStatic
        @DoNotInline
        public static final void a(@NotNull AccessibilityEvent event, int i10, int i11) {
            Intrinsics.checkNotNullParameter(event, "event");
            event.setScrollDeltaX(i10);
            event.setScrollDeltaY(i11);
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @RequiresApi(29)
    public static final class c {
        @JvmStatic
        @DoNotInline
        public static final void a(@NotNull AccessibilityNodeInfoCompat info, @NotNull SemanticsNode semanticsNode) {
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode)) {
                SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
                SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
                AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig, semanticsActions.getPageUp());
                if (accessibilityAction != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageUp, accessibilityAction.getLabel()));
                }
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getPageDown());
                if (accessibilityAction2 != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageDown, accessibilityAction2.getLabel()));
                }
                AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getPageLeft());
                if (accessibilityAction3 != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageLeft, accessibilityAction3.getLabel()));
                }
                AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getPageRight());
                if (accessibilityAction4 != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageRight, accessibilityAction4.getLabel()));
                }
            }
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final SemanticsNode f17070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17072c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f17073d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f17074e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f17075f;

        public d(@NotNull SemanticsNode node, int i10, int i11, int i12, int i13, long j10) {
            Intrinsics.checkNotNullParameter(node, "node");
            this.f17070a = node;
            this.f17071b = i10;
            this.f17072c = i11;
            this.f17073d = i12;
            this.f17074e = i13;
            this.f17075f = j10;
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @DebugMetadata(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", i = {0, 0, 1, 1}, l = {2195, 2228}, m = "boundsUpdatesEventLoop", n = {"this", "subtreeChangedSemanticsNodesIds", "this", "subtreeChangedSemanticsNodesIds"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public AndroidComposeViewAccessibilityDelegateCompat f17076p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public ArraySet f17077q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public ChannelIterator f17078r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f17079s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f17081u0;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f17079s0 = obj;
            this.f17081u0 |= Integer.MIN_VALUE;
            return AndroidComposeViewAccessibilityDelegateCompat.this.boundsUpdatesEventLoop(this);
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public static final class f extends Lambda implements Function1<ScrollObservationScope, Unit> {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ScrollObservationScope scrollObservationScope) {
            ScrollObservationScope it = scrollObservationScope;
            Intrinsics.checkNotNullParameter(it, "it");
            AndroidComposeViewAccessibilityDelegateCompat.access$sendScrollEventIfNeeded(AndroidComposeViewAccessibilityDelegateCompat.this, it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public static final class g extends Lambda implements Function1<LayoutNode, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g f17083p0 = new g(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(LayoutNode layoutNode) {
            LayoutNode it = layoutNode;
            Intrinsics.checkNotNullParameter(it, "it");
            SemanticsConfiguration collapsedSemantics$ui_release = it.getCollapsedSemantics$ui_release();
            boolean z10 = false;
            if (collapsedSemantics$ui_release != null && collapsedSemantics$ui_release.getIsMergingSemanticsOfDescendants()) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @SourceDebugExtension({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,3508:1\n76#2:3509\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1\n*L\n2272#1:3509\n*E\n"})
    public static final class h extends Lambda implements Function1<LayoutNode, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final h f17084p0 = new h(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(LayoutNode layoutNode) {
            LayoutNode it = layoutNode;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.getNodes().m3698hasH91voCI$ui_release(NodeKind.m3725constructorimpl(8)));
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.platform.h] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.platform.i] */
    public AndroidComposeViewAccessibilityDelegateCompat(@NotNull AndroidComposeView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        this.hoveredVirtualViewId = Integer.MIN_VALUE;
        Object systemService = view.getContext().getSystemService(Constants.ACCESSIBILITY);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
        this.accessibilityManager = accessibilityManager;
        this.f17044e = new android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener() { // from class: androidx.compose.ui.platform.h
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z10) {
                AndroidComposeViewAccessibilityDelegateCompat.Companion companion = AndroidComposeViewAccessibilityDelegateCompat.INSTANCE;
                AndroidComposeViewAccessibilityDelegateCompat this$0 = this.f17405p0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f17046g = z10 ? this$0.accessibilityManager.getEnabledAccessibilityServiceList(-1) : CollectionsKt__CollectionsKt.emptyList();
            }
        };
        this.f17045f = new android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener() { // from class: androidx.compose.ui.platform.i
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                AndroidComposeViewAccessibilityDelegateCompat.Companion companion = AndroidComposeViewAccessibilityDelegateCompat.INSTANCE;
                AndroidComposeViewAccessibilityDelegateCompat this$0 = this.f17407p0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f17046g = this$0.accessibilityManager.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.f17046g = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f17047h = new Handler(Looper.getMainLooper());
        this.f17048i = new AccessibilityNodeProviderCompat(new MyNodeProvider());
        this.f17049j = Integer.MIN_VALUE;
        this.f17050k = new SparseArrayCompat<>();
        this.f17051l = new SparseArrayCompat<>();
        this.m = -1;
        this.f17053o = new ArraySet<>();
        this.f17054p = ChannelKt.Channel$default(-1, null, null, 6, null);
        this.f17055q = true;
        this.bufferedContentCaptureAppearedNodes = new ArrayMap<>();
        this.bufferedContentCaptureDisappearedNodes = new ArraySet<>();
        this.currentSemanticsNodes = bk.q.emptyMap();
        this.f17062x = new ArraySet<>();
        this.idToBeforeMap = new HashMap<>();
        this.idToAfterMap = new HashMap<>();
        this.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.C = new URLSpanCache();
        this.previousSemanticsNodes = new LinkedHashMap();
        this.E = new SemanticsNodeCopy(view.getSemanticsOwner().getUnmergedRootSemanticsNode(), bk.q.emptyMap());
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NotNull View view2) {
                Intrinsics.checkNotNullParameter(view2, "view");
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                androidComposeViewAccessibilityDelegateCompat.getAccessibilityManager().addAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.getEnabledStateListener$ui_release());
                androidComposeViewAccessibilityDelegateCompat.getAccessibilityManager().addTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.getTouchExplorationStateListener$ui_release());
                androidComposeViewAccessibilityDelegateCompat.setContentCaptureSession$ui_release(AndroidComposeViewAccessibilityDelegateCompat.access$getContentCaptureSessionCompat(androidComposeViewAccessibilityDelegateCompat, view2));
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NotNull View view2) {
                Intrinsics.checkNotNullParameter(view2, "view");
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                androidComposeViewAccessibilityDelegateCompat.f17047h.removeCallbacks(androidComposeViewAccessibilityDelegateCompat.G);
                androidComposeViewAccessibilityDelegateCompat.getAccessibilityManager().removeAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.getEnabledStateListener$ui_release());
                androidComposeViewAccessibilityDelegateCompat.getAccessibilityManager().removeTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.getTouchExplorationStateListener$ui_release());
                androidComposeViewAccessibilityDelegateCompat.setContentCaptureSession$ui_release(null);
            }
        });
        this.G = new j(this, 0);
        this.H = new ArrayList();
        this.I = new f();
    }

    public static final void B(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, ArrayList arrayList, LinkedHashMap linkedHashMap, boolean z10, SemanticsNode semanticsNode) {
        Boolean boolAccess$isTraversalGroup = AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$isTraversalGroup(semanticsNode);
        Boolean bool = Boolean.TRUE;
        if ((Intrinsics.areEqual(boolAccess$isTraversalGroup, bool) || androidComposeViewAccessibilityDelegateCompat.k(semanticsNode)) && androidComposeViewAccessibilityDelegateCompat.getCurrentSemanticsNodes$ui_release().keySet().contains(Integer.valueOf(semanticsNode.getId()))) {
            arrayList.add(semanticsNode);
        }
        if (Intrinsics.areEqual(AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$isTraversalGroup(semanticsNode), bool)) {
            linkedHashMap.put(Integer.valueOf(semanticsNode.getId()), androidComposeViewAccessibilityDelegateCompat.A(CollectionsKt___CollectionsKt.toMutableList((Collection) semanticsNode.getChildren()), z10));
            return;
        }
        List<SemanticsNode> children = semanticsNode.getChildren();
        int size = children.size();
        for (int i10 = 0; i10 < size; i10++) {
            B(androidComposeViewAccessibilityDelegateCompat, arrayList, linkedHashMap, z10, children.get(i10));
        }
    }

    public static CharSequence C(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int length = charSequence.length();
        int i10 = ParcelSafeTextLength;
        if (length <= 100000) {
            return charSequence;
        }
        if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(ParcelSafeTextLength))) {
            i10 = 99999;
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(0, i10);
        Intrinsics.checkNotNull(charSequenceSubSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return charSequenceSubSequence;
    }

    public static final AccessibilityNodeInfo access$createNodeInfo(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i10) {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        AndroidComposeView androidComposeView = androidComposeViewAccessibilityDelegateCompat.view;
        AndroidComposeView.ViewTreeOwners viewTreeOwners = androidComposeView.getViewTreeOwners();
        if (((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.getF21906d()) == Lifecycle.State.DESTROYED) {
            return null;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain();
        Intrinsics.checkNotNullExpressionValue(accessibilityNodeInfoCompatObtain, "obtain()");
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = androidComposeViewAccessibilityDelegateCompat.getCurrentSemanticsNodes$ui_release().get(Integer.valueOf(i10));
        if (semanticsNodeWithAdjustedBounds == null) {
            return null;
        }
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode();
        if (i10 == -1) {
            Object parentForAccessibility = ViewCompat.getParentForAccessibility(androidComposeView);
            accessibilityNodeInfoCompatObtain.setParent(parentForAccessibility instanceof View ? (View) parentForAccessibility : null);
        } else {
            if (semanticsNode.getParent() == null) {
                throw new IllegalStateException(androidx.camera.core.impl.utils.b.a("semanticsNode ", i10, " has null parent"));
            }
            SemanticsNode parent = semanticsNode.getParent();
            Intrinsics.checkNotNull(parent);
            int id = parent.getId();
            accessibilityNodeInfoCompatObtain.setParent(androidComposeView, id != androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode().getId() ? id : -1);
        }
        accessibilityNodeInfoCompatObtain.setSource(androidComposeView, i10);
        Rect adjustedBounds = semanticsNodeWithAdjustedBounds.getAdjustedBounds();
        long jMo3541localToScreenMKHz9U = androidComposeView.mo3541localToScreenMKHz9U(OffsetKt.Offset(adjustedBounds.left, adjustedBounds.top));
        long jMo3541localToScreenMKHz9U2 = androidComposeView.mo3541localToScreenMKHz9U(OffsetKt.Offset(adjustedBounds.right, adjustedBounds.bottom));
        accessibilityNodeInfoCompatObtain.setBoundsInScreen(new Rect((int) Math.floor(Offset.m2275getXimpl(jMo3541localToScreenMKHz9U)), (int) Math.floor(Offset.m2276getYimpl(jMo3541localToScreenMKHz9U)), (int) Math.ceil(Offset.m2275getXimpl(jMo3541localToScreenMKHz9U2)), (int) Math.ceil(Offset.m2276getYimpl(jMo3541localToScreenMKHz9U2))));
        androidComposeViewAccessibilityDelegateCompat.populateAccessibilityNodeInfoProperties(i10, accessibilityNodeInfoCompatObtain, semanticsNode);
        return accessibilityNodeInfoCompatObtain.unwrap();
    }

    public static final ContentCaptureSessionCompat access$getContentCaptureSessionCompat(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, View view) {
        androidComposeViewAccessibilityDelegateCompat.getClass();
        ViewCompatShims.setImportantForContentCapture(view, 1);
        return ViewCompatShims.getContentCaptureSession(view);
    }

    /* JADX WARN: Code duplicated, block: B:319:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:322:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:324:0x06db  */
    /* JADX WARN: Code duplicated, block: B:325:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:328:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:330:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:331:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:361:0x0795 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:362:0x0797  */
    /* JADX WARN: Code duplicated, block: B:363:0x0799  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x01be -> B:81:0x01bf). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:81:0x01bf
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:127)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:75)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public static final boolean access$performActionHelper(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r16, int r17, int r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instruction units count: 2108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.access$performActionHelper(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat, int, int, android.os.Bundle):boolean");
    }

    public static final void access$sendScrollEventIfNeeded(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, ScrollObservationScope scrollObservationScope) {
        androidComposeViewAccessibilityDelegateCompat.getClass();
        if (scrollObservationScope.isValidOwnerScope()) {
            androidComposeViewAccessibilityDelegateCompat.view.getSnapshotObserver().observeReads$ui_release(scrollObservationScope, androidComposeViewAccessibilityDelegateCompat.I, new s(androidComposeViewAccessibilityDelegateCompat, scrollObservationScope));
        }
    }

    public static boolean e(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(unmergedConfig, semanticsProperties.getToggleableState());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties.getRole());
        boolean z10 = true;
        boolean z11 = toggleableState != null;
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties.getSelected());
        if (bool == null) {
            return z11;
        }
        bool.booleanValue();
        int iM3837getTabo7Vup1c = Role.INSTANCE.m3837getTabo7Vup1c();
        if (role != null && Role.m3827equalsimpl0(role.getF17490a(), iM3837getTabo7Vup1c)) {
            z10 = z11;
        }
        return z10;
    }

    public static String h(SemanticsNode semanticsNode) {
        AnnotatedString annotatedString;
        if (semanticsNode == null) {
            return null;
        }
        SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig.contains(semanticsProperties.getContentDescription())) {
            return TempListUtilsKt.fastJoinToString$default((List) semanticsNode.getUnmergedConfig().get(semanticsProperties.getContentDescription()), ",", null, null, 0, null, null, 62, null);
        }
        if (semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getSetText())) {
            AnnotatedString annotatedStringI = i(semanticsNode.getUnmergedConfig());
            if (annotatedStringI != null) {
                return annotatedStringI.getText();
            }
            return null;
        }
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties.getText());
        if (list == null || (annotatedString = (AnnotatedString) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) {
            return null;
        }
        return annotatedString.getText();
    }

    public static AnnotatedString i(SemanticsConfiguration semanticsConfiguration) {
        return (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getEditableText());
    }

    public static final boolean o(ScrollAxisRange scrollAxisRange, float f6) {
        return (f6 < 0.0f && scrollAxisRange.getValue().invoke().floatValue() > 0.0f) || (f6 > 0.0f && scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue());
    }

    public static final boolean p(ScrollAxisRange scrollAxisRange) {
        return (scrollAxisRange.getValue().invoke().floatValue() > 0.0f && !scrollAxisRange.getReverseScrolling()) || (scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue() && scrollAxisRange.getReverseScrolling());
    }

    public static final boolean q(ScrollAxisRange scrollAxisRange) {
        return (scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue() && !scrollAxisRange.getReverseScrolling()) || (scrollAxisRange.getValue().invoke().floatValue() > 0.0f && scrollAxisRange.getReverseScrolling());
    }

    public static /* synthetic */ void v(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i10, int i11, Integer num, int i12) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        androidComposeViewAccessibilityDelegateCompat.u(i10, i11, num, null);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a3 A[EDGE_INSN: B:18:0x00a3->B:19:0x00b9 BREAK  A[LOOP:2: B:13:0x0052->B:17:0x00a0]] */
    public final ArrayList A(List list, boolean z10) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            B(this, arrayList, linkedHashMap, z10, (SemanticsNode) list.get(i10));
        }
        ArrayList arrayList2 = new ArrayList();
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
        if (lastIndex >= 0) {
            int i11 = 0;
            while (true) {
                SemanticsNode semanticsNode = (SemanticsNode) arrayList.get(i11);
                if (i11 == 0) {
                    arrayList2.add(new Pair(semanticsNode.getBoundsInWindow(), CollectionsKt__CollectionsKt.mutableListOf(semanticsNode)));
                    break;
                }
                float top = semanticsNode.getBoundsInWindow().getTop();
                float bottom = semanticsNode.getBoundsInWindow().getBottom();
                OpenEndRange<Float> openEndRangeRangeUntil = AndroidComposeViewAccessibilityDelegateCompat_androidKt.rangeUntil(top, bottom);
                int lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(arrayList2);
                if (lastIndex2 < 0) {
                    arrayList2.add(new Pair(semanticsNode.getBoundsInWindow(), CollectionsKt__CollectionsKt.mutableListOf(semanticsNode)));
                    break;
                }
                int i12 = 0;
                while (true) {
                    androidx.compose.ui.geometry.Rect rect = (androidx.compose.ui.geometry.Rect) ((Pair) arrayList2.get(i12)).getFirst();
                    if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$overlaps(AndroidComposeViewAccessibilityDelegateCompat_androidKt.rangeUntil(rect.getTop(), rect.getBottom()), openEndRangeRangeUntil)) {
                        arrayList2.set(i12, new Pair(rect.intersect(new androidx.compose.ui.geometry.Rect(0.0f, top, Float.POSITIVE_INFINITY, bottom)), ((Pair) arrayList2.get(i12)).getSecond()));
                        ((List) ((Pair) arrayList2.get(i12)).getSecond()).add(semanticsNode);
                        break;
                    }
                    if (i12 == lastIndex2) {
                        arrayList2.add(new Pair(semanticsNode.getBoundsInWindow(), CollectionsKt__CollectionsKt.mutableListOf(semanticsNode)));
                        break;
                    }
                    i12++;
                }
                if (i11 == lastIndex) {
                    break;
                }
                i11++;
            }
        }
        bk.f.sortWith(arrayList2, dk.e.compareBy(t.f17451p0, u.f17452p0));
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            Pair pair = (Pair) arrayList2.get(i13);
            List list2 = (List) pair.getSecond();
            final Comparator comparatorCompareBy = dk.e.compareBy(o.f17428p0, p.f17431p0, q.f17434p0, r.f17438p0);
            if (z10) {
                comparatorCompareBy = dk.e.compareBy(k.f17411p0, l.f17415p0, m.f17418p0, n.f17419p0);
            }
            final Comparator<LayoutNode> zComparator$ui_release = LayoutNode.INSTANCE.getZComparator$ui_release();
            final Comparator comparator = new Comparator() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    int iCompare = comparatorCompareBy.compare(t10, t11);
                    if (iCompare != 0) {
                        return iCompare;
                    }
                    return zComparator$ui_release.compare(((SemanticsNode) t10).getLayoutNode(), ((SemanticsNode) t11).getLayoutNode());
                }
            };
            bk.f.sortWith(list2, new Comparator() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    int iCompare = comparator.compare(t10, t11);
                    return iCompare != 0 ? iCompare : dk.e.compareValues(Integer.valueOf(((SemanticsNode) t10).getId()), Integer.valueOf(((SemanticsNode) t11).getId()));
                }
            });
            arrayList3.addAll((Collection) pair.getSecond());
        }
        int size3 = 0;
        bk.f.sortWith(arrayList3, new Comparator() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return dk.e.compareValues(Float.valueOf(AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$getGetTraversalIndex((SemanticsNode) t10)), Float.valueOf(AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$getGetTraversalIndex((SemanticsNode) t11)));
            }
        });
        while (size3 <= CollectionsKt__CollectionsKt.getLastIndex(arrayList3)) {
            List list3 = (List) linkedHashMap.get(Integer.valueOf(((SemanticsNode) arrayList3.get(size3)).getId()));
            if (list3 != null) {
                if (k((SemanticsNode) arrayList3.get(size3))) {
                    size3++;
                } else {
                    arrayList3.remove(size3);
                }
                arrayList3.addAll(size3, list3);
                size3 += list3.size();
            } else {
                size3++;
            }
        }
        return arrayList3;
    }

    public final void a(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        SemanticsNode semanticsNode;
        RectF rectF;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes$ui_release().get(Integer.valueOf(i10));
        if (semanticsNodeWithAdjustedBounds == null || (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) == null) {
            return;
        }
        String strH = h(semanticsNode);
        if (Intrinsics.areEqual(str, this.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL)) {
            Integer num = this.idToBeforeMap.get(Integer.valueOf(i10));
            if (num != null) {
                accessibilityNodeInfo.getExtras().putInt(str, num.intValue());
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(str, this.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL)) {
            Integer num2 = this.idToAfterMap.get(Integer.valueOf(i10));
            if (num2 != null) {
                accessibilityNodeInfo.getExtras().putInt(str, num2.intValue());
                return;
            }
            return;
        }
        SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        if (!unmergedConfig.contains(semanticsActions.getGetTextLayoutResult()) || bundle == null || !Intrinsics.areEqual(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            SemanticsConfiguration unmergedConfig2 = semanticsNode.getUnmergedConfig();
            SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
            if (!unmergedConfig2.contains(semanticsProperties.getTestTag()) || bundle == null || !Intrinsics.areEqual(str, ExtraDataTestTagKey)) {
                if (Intrinsics.areEqual(str, ExtraDataIdKey)) {
                    accessibilityNodeInfo.getExtras().putInt(str, semanticsNode.getId());
                    return;
                }
                return;
            } else {
                String str2 = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties.getTestTag());
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
        }
        int i11 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i12 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i12 <= 0 || i11 < 0) {
            return;
        }
        if (i11 >= (strH != null ? strH.length() : Integer.MAX_VALUE)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Function1 function1 = (Function1) ((AccessibilityAction) semanticsNode.getUnmergedConfig().get(semanticsActions.getGetTextLayoutResult())).getAction();
        if (Intrinsics.areEqual(function1 != null ? (Boolean) function1.invoke(arrayList) : null, Boolean.TRUE)) {
            TextLayoutResult textLayoutResult = (TextLayoutResult) arrayList.get(0);
            ArrayList arrayList2 = new ArrayList();
            for (int i13 = 0; i13 < i12; i13++) {
                int i14 = i11 + i13;
                if (i14 >= textLayoutResult.getLayoutInput().getText().length()) {
                    arrayList2.add(null);
                } else {
                    androidx.compose.ui.geometry.Rect rectM2312translatek4lQ0M = textLayoutResult.getBoundingBox(i14).m2312translatek4lQ0M(semanticsNode.m3838getPositionInRootF1C5BW0());
                    androidx.compose.ui.geometry.Rect boundsInRoot = semanticsNode.getBoundsInRoot();
                    androidx.compose.ui.geometry.Rect rectIntersect = rectM2312translatek4lQ0M.overlaps(boundsInRoot) ? rectM2312translatek4lQ0M.intersect(boundsInRoot) : null;
                    if (rectIntersect != null) {
                        long jOffset = OffsetKt.Offset(rectIntersect.getLeft(), rectIntersect.getTop());
                        AndroidComposeView androidComposeView = this.view;
                        long jMo3541localToScreenMKHz9U = androidComposeView.mo3541localToScreenMKHz9U(jOffset);
                        long jMo3541localToScreenMKHz9U2 = androidComposeView.mo3541localToScreenMKHz9U(OffsetKt.Offset(rectIntersect.getRight(), rectIntersect.getBottom()));
                        rectF = new RectF(Offset.m2275getXimpl(jMo3541localToScreenMKHz9U), Offset.m2276getYimpl(jMo3541localToScreenMKHz9U), Offset.m2275getXimpl(jMo3541localToScreenMKHz9U2), Offset.m2276getYimpl(jMo3541localToScreenMKHz9U2));
                    } else {
                        rectF = null;
                    }
                    arrayList2.add(rectF);
                }
            }
            accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new RectF[0]));
        }
    }

    public final AccessibilityEvent b(int i10, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventCreateEvent$ui_release = createEvent$ui_release(i10, 8192);
        if (num != null) {
            accessibilityEventCreateEvent$ui_release.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventCreateEvent$ui_release.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventCreateEvent$ui_release.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventCreateEvent$ui_release.getText().add(charSequence);
        }
        return accessibilityEventCreateEvent$ui_release;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0065 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002e, B:25:0x0057, B:29:0x0069, B:31:0x0071, B:33:0x0078, B:34:0x007b, B:37:0x0083, B:39:0x008a, B:40:0x0099, B:42:0x00a0, B:43:0x00a9, B:20:0x0044), top: B:52:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0078 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002e, B:25:0x0057, B:29:0x0069, B:31:0x0071, B:33:0x0078, B:34:0x007b, B:37:0x0083, B:39:0x008a, B:40:0x0099, B:42:0x00a0, B:43:0x00a9, B:20:0x0044), top: B:52:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0083 A[Catch: all -> 0x0033, TRY_ENTER, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002e, B:25:0x0057, B:29:0x0069, B:31:0x0071, B:33:0x0078, B:34:0x007b, B:37:0x0083, B:39:0x008a, B:40:0x0099, B:42:0x00a0, B:43:0x00a9, B:20:0x0044), top: B:52:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x008a A[Catch: all -> 0x0033, LOOP:0: B:38:0x0088->B:39:0x008a, LOOP_END, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002e, B:25:0x0057, B:29:0x0069, B:31:0x0071, B:33:0x0078, B:34:0x007b, B:37:0x0083, B:39:0x008a, B:40:0x0099, B:42:0x00a0, B:43:0x00a9, B:20:0x0044), top: B:52:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a0 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002e, B:25:0x0057, B:29:0x0069, B:31:0x0071, B:33:0x0078, B:34:0x007b, B:37:0x0083, B:39:0x008a, B:40:0x0099, B:42:0x00a0, B:43:0x00a9, B:20:0x0044), top: B:52:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ba -> B:14:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object boundsUpdatesEventLoop(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.boundsUpdatesEventLoop(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final int c(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return (unmergedConfig.contains(semanticsProperties.getContentDescription()) || !semanticsNode.getUnmergedConfig().contains(semanticsProperties.getTextSelectionRange())) ? this.m : TextRange.m3962getEndimpl(((TextRange) semanticsNode.getUnmergedConfig().get(semanticsProperties.getTextSelectionRange())).getF17768a());
    }

    /* JADX INFO: renamed from: canScroll-0AR0LA0$ui_release, reason: not valid java name */
    public final boolean m3782canScroll0AR0LA0$ui_release(boolean vertical, int direction, long position) {
        if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return m3783canScrollmoWRBKg$ui_release(getCurrentSemanticsNodes$ui_release().values(), vertical, direction, position);
        }
        return false;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: canScroll-moWRBKg$ui_release, reason: not valid java name */
    public final boolean m3783canScrollmoWRBKg$ui_release(@NotNull Collection<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes, boolean vertical, int direction, long position) {
        SemanticsPropertyKey<ScrollAxisRange> horizontalScrollAxisRange;
        ScrollAxisRange scrollAxisRange;
        Intrinsics.checkNotNullParameter(currentSemanticsNodes, "currentSemanticsNodes");
        if (Offset.m2272equalsimpl0(position, Offset.INSTANCE.m2290getUnspecifiedF1C5BW0()) || !Offset.m2278isValidimpl(position)) {
            return false;
        }
        if (vertical) {
            horizontalScrollAxisRange = SemanticsProperties.INSTANCE.getVerticalScrollAxisRange();
        } else {
            if (vertical) {
                throw new NoWhenBranchMatchedException();
            }
            horizontalScrollAxisRange = SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange();
        }
        Collection<SemanticsNodeWithAdjustedBounds> collection = currentSemanticsNodes;
        if (collection.isEmpty()) {
            return false;
        }
        for (SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds : collection) {
            if (RectHelper_androidKt.toComposeRect(semanticsNodeWithAdjustedBounds.getAdjustedBounds()).m2301containsk4lQ0M(position) && (scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNodeWithAdjustedBounds.getSemanticsNode().getConfig(), horizontalScrollAxisRange)) != null) {
                int i10 = scrollAxisRange.getReverseScrolling() ? -direction : direction;
                if (!(direction == 0 && scrollAxisRange.getReverseScrolling()) && i10 >= 0) {
                    if (scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue()) {
                        return true;
                    }
                } else if (scrollAxisRange.getValue().invoke().floatValue() > 0.0f) {
                    return true;
                }
            }
        }
        return false;
    }

    @VisibleForTesting
    @NotNull
    public final AccessibilityEvent createEvent$ui_release(int virtualViewId, int eventType) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(eventType);
        Intrinsics.checkNotNullExpressionValue(accessibilityEventObtain, "obtain(eventType)");
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName(ClassName);
        AndroidComposeView androidComposeView = this.view;
        accessibilityEventObtain.setPackageName(androidComposeView.getContext().getPackageName());
        accessibilityEventObtain.setSource(androidComposeView, virtualViewId);
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes$ui_release().get(Integer.valueOf(virtualViewId));
        if (semanticsNodeWithAdjustedBounds != null) {
            accessibilityEventObtain.setPassword(semanticsNodeWithAdjustedBounds.getSemanticsNode().getConfig().contains(SemanticsProperties.INSTANCE.getPassword()));
        }
        return accessibilityEventObtain;
    }

    public final int d(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return (unmergedConfig.contains(semanticsProperties.getContentDescription()) || !semanticsNode.getUnmergedConfig().contains(semanticsProperties.getTextSelectionRange())) ? this.m : TextRange.m3967getStartimpl(((TextRange) semanticsNode.getUnmergedConfig().get(semanticsProperties.getTextSelectionRange())).getF17768a());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    public final boolean dispatchHoverEvent(@NotNull MotionEvent event) {
        boolean z10;
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.accessibilityForceEnabledForTesting) {
            z10 = true;
        } else {
            android.view.accessibility.AccessibilityManager accessibilityManager = this.accessibilityManager;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (!z10) {
            return false;
        }
        int action = event.getAction();
        AndroidComposeView androidComposeView = this.view;
        if (action == 7 || action == 9) {
            int iHitTestSemanticsAt$ui_release = hitTestSemanticsAt$ui_release(event.getX(), event.getY());
            boolean zDispatchGenericMotionEvent = androidComposeView.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
            int i10 = this.hoveredVirtualViewId;
            if (i10 != iHitTestSemanticsAt$ui_release) {
                this.hoveredVirtualViewId = iHitTestSemanticsAt$ui_release;
                v(this, iHitTestSemanticsAt$ui_release, 128, null, 12);
                v(this, i10, 256, null, 12);
            }
            if (iHitTestSemanticsAt$ui_release == Integer.MIN_VALUE) {
                return zDispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        int i11 = this.hoveredVirtualViewId;
        if (i11 == Integer.MIN_VALUE) {
            return androidComposeView.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
        }
        if (i11 == Integer.MIN_VALUE) {
            return true;
        }
        this.hoveredVirtualViewId = Integer.MIN_VALUE;
        v(this, Integer.MIN_VALUE, 128, null, 12);
        v(this, i11, 256, null, 12);
        return true;
    }

    public final String f(SemanticsNode semanticsNode) {
        int iCoerceIn;
        SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        Object orNull = SemanticsConfigurationKt.getOrNull(unmergedConfig, semanticsProperties.getStateDescription());
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties.getToggleableState());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties.getRole());
        AndroidComposeView androidComposeView = this.view;
        if (toggleableState != null) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i10 == 1) {
                int iM3836getSwitcho7Vup1c = Role.INSTANCE.m3836getSwitcho7Vup1c();
                if (role != null && Role.m3827equalsimpl0(role.getF17490a(), iM3836getSwitcho7Vup1c) && orNull == null) {
                    orNull = androidComposeView.getContext().getResources().getString(R.string.on);
                }
            } else if (i10 == 2) {
                int iM3836getSwitcho7Vup1c2 = Role.INSTANCE.m3836getSwitcho7Vup1c();
                if (role != null && Role.m3827equalsimpl0(role.getF17490a(), iM3836getSwitcho7Vup1c2) && orNull == null) {
                    orNull = androidComposeView.getContext().getResources().getString(R.string.off);
                }
            } else if (i10 == 3 && orNull == null) {
                orNull = androidComposeView.getContext().getResources().getString(R.string.indeterminate);
            }
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties.getSelected());
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            int iM3837getTabo7Vup1c = Role.INSTANCE.m3837getTabo7Vup1c();
            if ((role == null || !Role.m3827equalsimpl0(role.getF17490a(), iM3837getTabo7Vup1c)) && orNull == null) {
                orNull = zBooleanValue ? androidComposeView.getContext().getResources().getString(R.string.selected) : androidComposeView.getContext().getResources().getString(R.string.not_selected);
            }
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            if (progressBarRangeInfo != ProgressBarRangeInfo.INSTANCE.getIndeterminate()) {
                if (orNull == null) {
                    ClosedFloatingPointRange<Float> range = progressBarRangeInfo.getRange();
                    float fCoerceIn = kotlin.ranges.c.coerceIn(range.getEndInclusive().floatValue() - range.getStart().floatValue() == 0.0f ? 0.0f : (progressBarRangeInfo.getCurrent() - range.getStart().floatValue()) / (range.getEndInclusive().floatValue() - range.getStart().floatValue()), 0.0f, 1.0f);
                    if (fCoerceIn == 0.0f) {
                        iCoerceIn = 0;
                    } else {
                        iCoerceIn = 100;
                        if (fCoerceIn != 1.0f) {
                            iCoerceIn = kotlin.ranges.c.coerceIn(mk.c.roundToInt(fCoerceIn * 100), 1, 99);
                        }
                    }
                    orNull = androidComposeView.getContext().getResources().getString(R.string.template_percent, Integer.valueOf(iCoerceIn));
                }
            } else if (orNull == null) {
                orNull = androidComposeView.getContext().getResources().getString(R.string.in_progress);
            }
        }
        return (String) orNull;
    }

    public final SpannableString g(SemanticsNode semanticsNode) {
        AnnotatedString annotatedString;
        AndroidComposeView androidComposeView = this.view;
        FontFamily.Resolver fontFamilyResolver = androidComposeView.getFontFamilyResolver();
        AnnotatedString annotatedStringI = i(semanticsNode.getUnmergedConfig());
        SpannableString accessibilitySpannableString = null;
        URLSpanCache uRLSpanCache = this.C;
        SpannableString spannableString = (SpannableString) C(annotatedStringI != null ? AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(annotatedStringI, androidComposeView.getDensity(), fontFamilyResolver, uRLSpanCache) : null);
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getText());
        if (list != null && (annotatedString = (AnnotatedString) CollectionsKt___CollectionsKt.firstOrNull(list)) != null) {
            accessibilitySpannableString = AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(annotatedString, androidComposeView.getDensity(), fontFamilyResolver, uRLSpanCache);
        }
        return spannableString == null ? (SpannableString) C(accessibilitySpannableString) : spannableString;
    }

    /* JADX INFO: renamed from: getAccessibilityForceEnabledForTesting$ui_release, reason: from getter */
    public final boolean getAccessibilityForceEnabledForTesting() {
        return this.accessibilityForceEnabledForTesting;
    }

    @NotNull
    /* JADX INFO: renamed from: getAccessibilityManager$ui_release, reason: from getter */
    public final android.view.accessibility.AccessibilityManager getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    @NotNull
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(@NotNull View host) {
        Intrinsics.checkNotNullParameter(host, "host");
        return this.f17048i;
    }

    @NotNull
    public final ArrayMap<Integer, ViewStructureCompat> getBufferedContentCaptureAppearedNodes$ui_release() {
        return this.bufferedContentCaptureAppearedNodes;
    }

    @NotNull
    public final ArraySet<Integer> getBufferedContentCaptureDisappearedNodes$ui_release() {
        return this.bufferedContentCaptureDisappearedNodes;
    }

    /* JADX INFO: renamed from: getContentCaptureForceEnabledForTesting$ui_release, reason: from getter */
    public final boolean getContentCaptureForceEnabledForTesting() {
        return this.contentCaptureForceEnabledForTesting;
    }

    @Nullable
    /* JADX INFO: renamed from: getContentCaptureSession$ui_release, reason: from getter */
    public final ContentCaptureSessionCompat getContentCaptureSession() {
        return this.contentCaptureSession;
    }

    @NotNull
    public final Map<Integer, SemanticsNodeWithAdjustedBounds> getCurrentSemanticsNodes$ui_release() {
        if (this.f17055q) {
            this.f17055q = false;
            this.currentSemanticsNodes = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getAllUncoveredSemanticsNodesToMap(this.view.getSemanticsOwner());
            this.idToBeforeMap.clear();
            this.idToAfterMap.clear();
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes$ui_release().get(-1);
            SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
            Intrinsics.checkNotNull(semanticsNode);
            int i10 = 1;
            ArrayList arrayListA = A(CollectionsKt__CollectionsKt.mutableListOf(semanticsNode), AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$isRtl(semanticsNode));
            int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayListA);
            if (1 <= lastIndex) {
                while (true) {
                    int id = ((SemanticsNode) arrayListA.get(i10 - 1)).getId();
                    int id2 = ((SemanticsNode) arrayListA.get(i10)).getId();
                    this.idToBeforeMap.put(Integer.valueOf(id), Integer.valueOf(id2));
                    this.idToAfterMap.put(Integer.valueOf(id2), Integer.valueOf(id));
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return this.currentSemanticsNodes;
    }

    @NotNull
    /* JADX INFO: renamed from: getEXTRA_DATA_TEST_TRAVERSALAFTER_VAL$ui_release, reason: from getter */
    public final String getEXTRA_DATA_TEST_TRAVERSALAFTER_VAL() {
        return this.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL;
    }

    @NotNull
    /* JADX INFO: renamed from: getEXTRA_DATA_TEST_TRAVERSALBEFORE_VAL$ui_release, reason: from getter */
    public final String getEXTRA_DATA_TEST_TRAVERSALBEFORE_VAL() {
        return this.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL;
    }

    @NotNull
    public final android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener getEnabledStateListener$ui_release() {
        return this.f17044e;
    }

    /* JADX INFO: renamed from: getHoveredVirtualViewId$ui_release, reason: from getter */
    public final int getHoveredVirtualViewId() {
        return this.hoveredVirtualViewId;
    }

    @NotNull
    public final HashMap<Integer, Integer> getIdToAfterMap$ui_release() {
        return this.idToAfterMap;
    }

    @NotNull
    public final HashMap<Integer, Integer> getIdToBeforeMap$ui_release() {
        return this.idToBeforeMap;
    }

    @NotNull
    public final Map<Integer, SemanticsNodeCopy> getPreviousSemanticsNodes$ui_release() {
        return this.previousSemanticsNodes;
    }

    @NotNull
    public final android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener getTouchExplorationStateListener$ui_release() {
        return this.f17045f;
    }

    @NotNull
    public final AndroidComposeView getView() {
        return this.view;
    }

    @VisibleForTesting
    public final int hitTestSemanticsAt$ui_release(float x4, float y7) {
        NodeChain nodes;
        AndroidComposeView androidComposeView = this.view;
        i1.m.f(androidComposeView, false, 1, null);
        HitTestResult hitTestResult = new HitTestResult();
        androidComposeView.getRoot().m3669hitTestSemanticsM_7yMNQ$ui_release(OffsetKt.Offset(x4, y7), hitTestResult, (12 & 4) != 0, (12 & 8) != 0);
        Modifier.Node node = (Modifier.Node) CollectionsKt___CollectionsKt.lastOrNull((List) hitTestResult);
        LayoutNode layoutNodeRequireLayoutNode = node != null ? DelegatableNodeKt.requireLayoutNode(node) : null;
        if (layoutNodeRequireLayoutNode != null && (nodes = layoutNodeRequireLayoutNode.getNodes()) != null && nodes.m3698hasH91voCI$ui_release(NodeKind.m3725constructorimpl(8)) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$isVisible(SemanticsNodeKt.SemanticsNode(layoutNodeRequireLayoutNode, false)) && androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(layoutNodeRequireLayoutNode) == null) {
            return r(layoutNodeRequireLayoutNode.getSemanticsId());
        }
        return Integer.MIN_VALUE;
    }

    public final boolean isEnabled$ui_release() {
        return j() || this.contentCaptureForceEnabledForTesting;
    }

    public final boolean j() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        if (this.accessibilityManager.isEnabled()) {
            List<AccessibilityServiceInfo> enabledServices = this.f17046g;
            Intrinsics.checkNotNullExpressionValue(enabledServices, "enabledServices");
            if (!enabledServices.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(SemanticsNode semanticsNode) {
        boolean z10 = (AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$getInfoContentDescriptionOrNull(semanticsNode) == null && g(semanticsNode) == null && f(semanticsNode) == null && !e(semanticsNode)) ? false : true;
        if (semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants()) {
            return true;
        }
        return semanticsNode.isUnmergedLeafNode$ui_release() && z10;
    }

    public final void l() {
        ContentCaptureSessionCompat contentCaptureSessionCompat = this.contentCaptureSession;
        if (contentCaptureSessionCompat != null && Build.VERSION.SDK_INT >= 29) {
            ArrayMap<Integer, ViewStructureCompat> arrayMap = this.bufferedContentCaptureAppearedNodes;
            if (!arrayMap.isEmpty()) {
                Collection<ViewStructureCompat> collectionValues = arrayMap.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "bufferedContentCaptureAppearedNodes.values");
                List list = CollectionsKt___CollectionsKt.toList(collectionValues);
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(((ViewStructureCompat) list.get(i10)).toViewStructure());
                }
                contentCaptureSessionCompat.notifyViewsAppeared(arrayList);
                arrayMap.clear();
            }
            ArraySet<Integer> arraySet = this.bufferedContentCaptureDisappearedNodes;
            if (!arraySet.isEmpty()) {
                List list2 = CollectionsKt___CollectionsKt.toList(arraySet);
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    arrayList2.add(Long.valueOf(((Integer) list2.get(i11)).intValue()));
                }
                contentCaptureSessionCompat.notifyViewsDisappeared(CollectionsKt___CollectionsKt.toLongArray(arrayList2));
                arraySet.clear();
            }
        }
    }

    public final void m(LayoutNode layoutNode) {
        if (this.f17053o.add(layoutNode)) {
            this.f17054p.mo5953trySendJP2dKIU(Unit.INSTANCE);
        }
    }

    public final void n(SemanticsNode semanticsNode) {
        AutofillIdCompat autofillId;
        AutofillId autofillId2;
        String strM3784access$toLegacyClassNameV4PA4sw;
        int id = semanticsNode.getId();
        ContentCaptureSessionCompat contentCaptureSessionCompat = this.contentCaptureSession;
        ViewStructureCompat viewStructureCompat = null;
        if (contentCaptureSessionCompat != null && Build.VERSION.SDK_INT >= 29 && (autofillId = ViewCompatShims.getAutofillId(this.view)) != null) {
            SemanticsNode parent = semanticsNode.getParent();
            if (parent != null) {
                autofillId2 = contentCaptureSessionCompat.newAutofillId(parent.getId());
                if (autofillId2 != null) {
                }
            } else {
                autofillId2 = autofillId.toAutofillId();
            }
            Intrinsics.checkNotNullExpressionValue(autofillId2, "if (parentNode != null) ….toAutofillId()\n        }");
            ViewStructureCompat viewStructureCompatNewVirtualViewStructure = contentCaptureSessionCompat.newVirtualViewStructure(autofillId2, semanticsNode.getId());
            if (viewStructureCompatNewVirtualViewStructure != null) {
                SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
                SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
                if (!unmergedConfig.contains(semanticsProperties.getPassword())) {
                    List list = (List) SemanticsConfigurationKt.getOrNull(unmergedConfig, semanticsProperties.getText());
                    if (list != null) {
                        viewStructureCompatNewVirtualViewStructure.setClassName(TextClassName);
                        viewStructureCompatNewVirtualViewStructure.setText(TempListUtilsKt.fastJoinToString$default(list, RootService.LINE_BREAK, null, null, 0, null, null, 62, null));
                    }
                    AnnotatedString annotatedString = (AnnotatedString) SemanticsConfigurationKt.getOrNull(unmergedConfig, semanticsProperties.getEditableText());
                    if (annotatedString != null) {
                        viewStructureCompatNewVirtualViewStructure.setClassName(TextFieldClassName);
                        viewStructureCompatNewVirtualViewStructure.setText(annotatedString);
                    }
                    List list2 = (List) SemanticsConfigurationKt.getOrNull(unmergedConfig, semanticsProperties.getContentDescription());
                    if (list2 != null) {
                        viewStructureCompatNewVirtualViewStructure.setContentDescription(TempListUtilsKt.fastJoinToString$default(list2, RootService.LINE_BREAK, null, null, 0, null, null, 62, null));
                    }
                    Role role = (Role) SemanticsConfigurationKt.getOrNull(unmergedConfig, semanticsProperties.getRole());
                    if (role != null && (strM3784access$toLegacyClassNameV4PA4sw = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3784access$toLegacyClassNameV4PA4sw(role.getF17490a())) != null) {
                        viewStructureCompatNewVirtualViewStructure.setClassName(strM3784access$toLegacyClassNameV4PA4sw);
                    }
                    androidx.compose.ui.geometry.Rect boundsInWindow = semanticsNode.getBoundsInWindow();
                    viewStructureCompatNewVirtualViewStructure.setDimens((int) boundsInWindow.getLeft(), (int) boundsInWindow.getTop(), 0, 0, (int) boundsInWindow.getWidth(), (int) boundsInWindow.getHeight());
                    viewStructureCompat = viewStructureCompatNewVirtualViewStructure;
                }
            }
        }
        if (viewStructureCompat != null) {
            Integer numValueOf = Integer.valueOf(id);
            ArraySet<Integer> arraySet = this.bufferedContentCaptureDisappearedNodes;
            if (arraySet.contains(numValueOf)) {
                arraySet.remove(Integer.valueOf(id));
            } else {
                this.bufferedContentCaptureAppearedNodes.put(Integer.valueOf(id), viewStructureCompat);
            }
        }
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i10 = 0; i10 < size; i10++) {
            n(replacedChildren$ui_release.get(i10));
        }
    }

    public final void onLayoutChange$ui_release(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f17055q = true;
        if (isEnabled$ui_release()) {
            m(layoutNode);
        }
    }

    public final void onSemanticsChange$ui_release() {
        this.f17055q = true;
        if (!isEnabled$ui_release() || this.F) {
            return;
        }
        this.F = true;
        this.f17047h.post(this.G);
    }

    /* JADX WARN: Code duplicated, block: B:262:0x07ff  */
    @VisibleForTesting
    public final void populateAccessibilityNodeInfoProperties(int virtualViewId, @NotNull AccessibilityNodeInfoCompat info, @NotNull SemanticsNode semanticsNode) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
        info.setClassName(ClassName);
        SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        Role role = (Role) SemanticsConfigurationKt.getOrNull(unmergedConfig, semanticsProperties.getRole());
        AndroidComposeView androidComposeView = this.view;
        if (role != null) {
            role.getF17490a();
            if (semanticsNode.getIsFake() || semanticsNode.getReplacedChildren$ui_release().isEmpty()) {
                Role.Companion companion = Role.INSTANCE;
                if (Role.m3827equalsimpl0(role.getF17490a(), companion.m3837getTabo7Vup1c())) {
                    info.setRoleDescription(androidComposeView.getContext().getResources().getString(R.string.tab));
                } else if (Role.m3827equalsimpl0(role.getF17490a(), companion.m3836getSwitcho7Vup1c())) {
                    info.setRoleDescription(androidComposeView.getContext().getResources().getString(R.string.switch_role));
                } else {
                    CharSequence charSequenceM3784access$toLegacyClassNameV4PA4sw = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3784access$toLegacyClassNameV4PA4sw(role.getF17490a());
                    if (!Role.m3827equalsimpl0(role.getF17490a(), companion.m3834getImageo7Vup1c()) || semanticsNode.isUnmergedLeafNode$ui_release() || semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants()) {
                        info.setClassName(charSequenceM3784access$toLegacyClassNameV4PA4sw);
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        if (semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getSetText())) {
            info.setClassName(TextFieldClassName);
        }
        if (semanticsNode.getConfig().contains(semanticsProperties.getText())) {
            info.setClassName(TextClassName);
        }
        info.setPackageName(androidComposeView.getContext().getPackageName());
        info.setImportantForAccessibility(true);
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i11);
            if (getCurrentSemanticsNodes$ui_release().containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                View view = (AndroidViewHolder) androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(semanticsNode2.getLayoutNode());
                if (view != null) {
                    info.addChild(view);
                } else {
                    info.addChild(androidComposeView, semanticsNode2.getId());
                }
            }
        }
        if (this.f17049j == virtualViewId) {
            info.setAccessibilityFocused(true);
            info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
        } else {
            info.setAccessibilityFocused(false);
            info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_ACCESSIBILITY_FOCUS);
        }
        info.setText(g(semanticsNode));
        SemanticsConfiguration unmergedConfig2 = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties2 = SemanticsProperties.INSTANCE;
        if (unmergedConfig2.contains(semanticsProperties2.getError())) {
            info.setContentInvalid(true);
            info.setError((CharSequence) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties2.getError()));
        }
        info.setStateDescription(f(semanticsNode));
        info.setCheckable(e(semanticsNode));
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties2.getToggleableState());
        if (toggleableState != null) {
            if (toggleableState == ToggleableState.On) {
                info.setChecked(true);
            } else if (toggleableState == ToggleableState.Off) {
                info.setChecked(false);
            }
            Unit unit2 = Unit.INSTANCE;
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties2.getSelected());
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            int iM3837getTabo7Vup1c = Role.INSTANCE.m3837getTabo7Vup1c();
            if (role != null && Role.m3827equalsimpl0(role.getF17490a(), iM3837getTabo7Vup1c)) {
                info.setSelected(zBooleanValue);
            } else {
                info.setChecked(zBooleanValue);
            }
            Unit unit3 = Unit.INSTANCE;
        }
        if (!semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || semanticsNode.getReplacedChildren$ui_release().isEmpty()) {
            info.setContentDescription(AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$getInfoContentDescriptionOrNull(semanticsNode));
        }
        String str3 = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties2.getTestTag());
        if (str3 != null) {
            for (SemanticsNode parent = semanticsNode; parent != null; parent = parent.getParent()) {
                SemanticsConfiguration unmergedConfig3 = parent.getUnmergedConfig();
                SemanticsPropertiesAndroid semanticsPropertiesAndroid = SemanticsPropertiesAndroid.INSTANCE;
                if (unmergedConfig3.contains(semanticsPropertiesAndroid.getTestTagsAsResourceId())) {
                    if (!((Boolean) parent.getUnmergedConfig().get(semanticsPropertiesAndroid.getTestTagsAsResourceId())).booleanValue()) {
                        break;
                    }
                    info.setViewIdResourceName(str3);
                    break;
                }
            }
        }
        SemanticsConfiguration unmergedConfig4 = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties3 = SemanticsProperties.INSTANCE;
        if (((Unit) SemanticsConfigurationKt.getOrNull(unmergedConfig4, semanticsProperties3.getHeading())) != null) {
            info.setHeading(true);
            Unit unit4 = Unit.INSTANCE;
        }
        info.setPassword(semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getPassword()));
        info.setEditable(semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getSetText()));
        info.setEnabled(AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode));
        info.setFocusable(semanticsNode.getUnmergedConfig().contains(semanticsProperties3.getFocused()));
        if (info.isFocusable()) {
            info.setFocused(((Boolean) semanticsNode.getUnmergedConfig().get(semanticsProperties3.getFocused())).booleanValue());
            if (info.isFocused()) {
                info.addAction(2);
            } else {
                info.addAction(1);
            }
        }
        info.setVisibleToUser(AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$isVisible(semanticsNode));
        LiveRegionMode liveRegionMode = (LiveRegionMode) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties3.getLiveRegion());
        if (liveRegionMode != null) {
            int f17479a = liveRegionMode.getF17479a();
            LiveRegionMode.Companion companion2 = LiveRegionMode.INSTANCE;
            info.setLiveRegion((LiveRegionMode.m3819equalsimpl0(f17479a, companion2.m3824getPolite0phEisY()) || !LiveRegionMode.m3819equalsimpl0(f17479a, companion2.m3823getAssertive0phEisY())) ? 1 : 2);
            Unit unit5 = Unit.INSTANCE;
        }
        info.setClickable(false);
        SemanticsConfiguration unmergedConfig5 = semanticsNode.getUnmergedConfig();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig5, semanticsActions.getOnClick());
        if (accessibilityAction != null) {
            boolean zAreEqual = Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties3.getSelected()), Boolean.TRUE);
            info.setClickable(!zAreEqual);
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode) && !zAreEqual) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, accessibilityAction.getLabel()));
            }
            Unit unit6 = Unit.INSTANCE;
        }
        info.setLongClickable(false);
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getOnLongClick());
        if (accessibilityAction2 != null) {
            info.setLongClickable(true);
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode)) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32, accessibilityAction2.getLabel()));
            }
            Unit unit7 = Unit.INSTANCE;
        }
        AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getCopyText());
        if (accessibilityAction3 != null) {
            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16384, accessibilityAction3.getLabel()));
            Unit unit8 = Unit.INSTANCE;
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode)) {
            AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getSetText());
            if (accessibilityAction4 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(2097152, accessibilityAction4.getLabel()));
                Unit unit9 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction5 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getPerformImeAction());
            if (accessibilityAction5 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionImeEnter, accessibilityAction5.getLabel()));
                Unit unit10 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction6 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getCutText());
            if (accessibilityAction6 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(65536, accessibilityAction6.getLabel()));
                Unit unit11 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction7 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getPasteText());
            if (accessibilityAction7 != null) {
                if (info.isFocused() && androidComposeView.getClipboardManager().hasText()) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32768, accessibilityAction7.getLabel()));
                }
                Unit unit12 = Unit.INSTANCE;
            }
        }
        String strH = h(semanticsNode);
        if (strH != null && strH.length() != 0) {
            info.setTextSelection(d(semanticsNode), c(semanticsNode));
            AccessibilityAction accessibilityAction8 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getSetSelection());
            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(131072, accessibilityAction8 != null ? accessibilityAction8.getLabel() : null));
            info.addAction(256);
            info.addAction(512);
            info.setMovementGranularities(11);
            List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties3.getContentDescription());
            if ((list == null || list.isEmpty()) && semanticsNode.getUnmergedConfig().contains(semanticsActions.getGetTextLayoutResult()) && !AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$excludeLineAndPageGranularities(semanticsNode)) {
                info.setMovementGranularities(info.getMovementGranularities() | 20);
            }
        }
        int i12 = Build.VERSION.SDK_INT;
        String str4 = "info.unwrap()";
        if (i12 >= 26) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ExtraDataIdKey);
            CharSequence text = info.getText();
            if (text != null && text.length() != 0 && semanticsNode.getUnmergedConfig().contains(semanticsActions.getGetTextLayoutResult())) {
                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if (semanticsNode.getUnmergedConfig().contains(semanticsProperties3.getTestTag())) {
                arrayList.add(ExtraDataTestTagKey);
            }
            AccessibilityNodeInfoVerificationHelperMethods accessibilityNodeInfoVerificationHelperMethods = AccessibilityNodeInfoVerificationHelperMethods.INSTANCE;
            AccessibilityNodeInfo accessibilityNodeInfoUnwrap = info.unwrap();
            Intrinsics.checkNotNullExpressionValue(accessibilityNodeInfoUnwrap, "info.unwrap()");
            accessibilityNodeInfoVerificationHelperMethods.setAvailableExtraData(accessibilityNodeInfoUnwrap, arrayList);
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties3.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            if (semanticsNode.getUnmergedConfig().contains(semanticsActions.getSetProgress())) {
                info.setClassName("android.widget.SeekBar");
            } else {
                info.setClassName("android.widget.ProgressBar");
            }
            if (progressBarRangeInfo != ProgressBarRangeInfo.INSTANCE.getIndeterminate()) {
                info.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, progressBarRangeInfo.getRange().getStart().floatValue(), progressBarRangeInfo.getRange().getEndInclusive().floatValue(), progressBarRangeInfo.getCurrent()));
            }
            if (semanticsNode.getUnmergedConfig().contains(semanticsActions.getSetProgress()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode)) {
                if (progressBarRangeInfo.getCurrent() < kotlin.ranges.c.coerceAtLeast(progressBarRangeInfo.getRange().getEndInclusive().floatValue(), progressBarRangeInfo.getRange().getStart().floatValue())) {
                    info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                }
                if (progressBarRangeInfo.getCurrent() > kotlin.ranges.c.coerceAtMost(progressBarRangeInfo.getRange().getStart().floatValue(), progressBarRangeInfo.getRange().getEndInclusive().floatValue())) {
                    info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                }
            }
        }
        if (i12 >= 24) {
            a.a(info, semanticsNode);
        }
        CollectionInfoKt.setCollectionInfo(semanticsNode, info);
        CollectionInfoKt.setCollectionItemInfo(semanticsNode, info);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties3.getHorizontalScrollAxisRange());
        AccessibilityAction accessibilityAction9 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getScrollBy());
        if (scrollAxisRange != null && accessibilityAction9 != null) {
            if (!CollectionInfoKt.hasCollectionInfo(semanticsNode)) {
                info.setClassName("android.widget.HorizontalScrollView");
            }
            if (scrollAxisRange.getMaxValue().invoke().floatValue() > 0.0f) {
                info.setScrollable(true);
            }
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode)) {
                if (q(scrollAxisRange)) {
                    info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    info.addAction(!AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$isRtl(semanticsNode) ? AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT : AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT);
                }
                if (p(scrollAxisRange)) {
                    info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    info.addAction(!AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$isRtl(semanticsNode) ? AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT : AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT);
                }
            }
        }
        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties3.getVerticalScrollAxisRange());
        if (scrollAxisRange2 != null && accessibilityAction9 != null) {
            if (!CollectionInfoKt.hasCollectionInfo(semanticsNode)) {
                info.setClassName("android.widget.ScrollView");
            }
            if (scrollAxisRange2.getMaxValue().invoke().floatValue() > 0.0f) {
                info.setScrollable(true);
            }
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode)) {
                if (q(scrollAxisRange2)) {
                    info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN);
                }
                if (p(scrollAxisRange2)) {
                    info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP);
                }
            }
        }
        if (i12 >= 29) {
            c.a(info, semanticsNode);
        }
        info.setPaneTitle((CharSequence) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties3.getPaneTitle()));
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode)) {
            AccessibilityAction accessibilityAction10 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getExpand());
            if (accessibilityAction10 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(262144, accessibilityAction10.getLabel()));
                Unit unit13 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction11 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getCollapse());
            if (accessibilityAction11 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(524288, accessibilityAction11.getLabel()));
                Unit unit14 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction12 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getDismiss());
            if (accessibilityAction12 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(1048576, accessibilityAction12.getLabel()));
                Unit unit15 = Unit.INSTANCE;
            }
            if (semanticsNode.getUnmergedConfig().contains(semanticsActions.getCustomActions())) {
                List list2 = (List) semanticsNode.getUnmergedConfig().get(semanticsActions.getCustomActions());
                int size2 = list2.size();
                int[] iArr = J;
                if (size2 >= iArr.length) {
                    throw new IllegalStateException(androidx.appcompat.widget.a.c(new StringBuilder("Can't have more than "), iArr.length, " custom actions for one widget"));
                }
                SparseArrayCompat<CharSequence> sparseArrayCompat = new SparseArrayCompat<>();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                SparseArrayCompat<Map<CharSequence, Integer>> sparseArrayCompat2 = this.f17051l;
                if (sparseArrayCompat2.containsKey(virtualViewId)) {
                    Map<CharSequence, Integer> map = sparseArrayCompat2.get(virtualViewId);
                    List<Integer> mutableList = ArraysKt___ArraysKt.toMutableList(iArr);
                    ArrayList arrayList2 = new ArrayList();
                    int size3 = list2.size();
                    while (i10 < size3) {
                        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list2.get(i10);
                        Intrinsics.checkNotNull(map);
                        int i13 = size3;
                        if (map.containsKey(customAccessibilityAction.getLabel())) {
                            Integer num = map.get(customAccessibilityAction.getLabel());
                            Intrinsics.checkNotNull(num);
                            sparseArrayCompat.put(num.intValue(), customAccessibilityAction.getLabel());
                            linkedHashMap.put(customAccessibilityAction.getLabel(), num);
                            mutableList.remove(num);
                            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(num.intValue(), customAccessibilityAction.getLabel()));
                        } else {
                            arrayList2.add(customAccessibilityAction);
                        }
                        i10++;
                        size3 = i13;
                        map = map;
                        str4 = str4;
                    }
                    str = str4;
                    int size4 = arrayList2.size();
                    for (int i14 = 0; i14 < size4; i14++) {
                        CustomAccessibilityAction customAccessibilityAction2 = (CustomAccessibilityAction) arrayList2.get(i14);
                        int iIntValue = mutableList.get(i14).intValue();
                        sparseArrayCompat.put(iIntValue, customAccessibilityAction2.getLabel());
                        linkedHashMap.put(customAccessibilityAction2.getLabel(), Integer.valueOf(iIntValue));
                        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(iIntValue, customAccessibilityAction2.getLabel()));
                    }
                } else {
                    str = "info.unwrap()";
                    int size5 = list2.size();
                    for (int i15 = 0; i15 < size5; i15++) {
                        CustomAccessibilityAction customAccessibilityAction3 = (CustomAccessibilityAction) list2.get(i15);
                        int i16 = iArr[i15];
                        sparseArrayCompat.put(i16, customAccessibilityAction3.getLabel());
                        linkedHashMap.put(customAccessibilityAction3.getLabel(), Integer.valueOf(i16));
                        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i16, customAccessibilityAction3.getLabel()));
                    }
                }
                this.f17050k.put(virtualViewId, sparseArrayCompat);
                sparseArrayCompat2.put(virtualViewId, linkedHashMap);
            } else {
                str = "info.unwrap()";
            }
        } else {
            str = "info.unwrap()";
        }
        info.setScreenReaderFocusable(k(semanticsNode));
        Integer num2 = this.idToBeforeMap.get(Integer.valueOf(virtualViewId));
        if (num2 != null) {
            num2.intValue();
            View viewSemanticsIdToView = AndroidComposeViewAccessibilityDelegateCompat_androidKt.semanticsIdToView(androidComposeView.getAndroidViewsHandler$ui_release(), num2.intValue());
            if (viewSemanticsIdToView != null) {
                info.setTraversalBefore(viewSemanticsIdToView);
            } else {
                info.setTraversalBefore(androidComposeView, num2.intValue());
            }
            AccessibilityNodeInfo accessibilityNodeInfoUnwrap2 = info.unwrap();
            str2 = str;
            Intrinsics.checkNotNullExpressionValue(accessibilityNodeInfoUnwrap2, str2);
            a(virtualViewId, accessibilityNodeInfoUnwrap2, this.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL, null);
            Unit unit16 = Unit.INSTANCE;
        } else {
            str2 = str;
        }
        Integer num3 = this.idToAfterMap.get(Integer.valueOf(virtualViewId));
        if (num3 != null) {
            num3.intValue();
            View viewSemanticsIdToView2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.semanticsIdToView(androidComposeView.getAndroidViewsHandler$ui_release(), num3.intValue());
            if (viewSemanticsIdToView2 != null) {
                info.setTraversalAfter(viewSemanticsIdToView2);
                AccessibilityNodeInfo accessibilityNodeInfoUnwrap3 = info.unwrap();
                Intrinsics.checkNotNullExpressionValue(accessibilityNodeInfoUnwrap3, str2);
                a(virtualViewId, accessibilityNodeInfoUnwrap3, this.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL, null);
            }
            Unit unit17 = Unit.INSTANCE;
        }
    }

    public final int r(int i10) {
        if (i10 == this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
            return -1;
        }
        return i10;
    }

    public final void s(SemanticsNode semanticsNode, SemanticsNodeCopy semanticsNodeCopy) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i10 = 0; i10 < size; i10++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i10);
            if (getCurrentSemanticsNodes$ui_release().containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                if (!semanticsNodeCopy.getChildren().contains(Integer.valueOf(semanticsNode2.getId()))) {
                    m(semanticsNode.getLayoutNode());
                    return;
                }
                linkedHashSet.add(Integer.valueOf(semanticsNode2.getId()));
            }
        }
        Iterator<Integer> it = semanticsNodeCopy.getChildren().iterator();
        while (it.hasNext()) {
            if (!linkedHashSet.contains(Integer.valueOf(it.next().intValue()))) {
                m(semanticsNode.getLayoutNode());
                return;
            }
        }
        List<SemanticsNode> replacedChildren$ui_release2 = semanticsNode.getReplacedChildren$ui_release();
        int size2 = replacedChildren$ui_release2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            SemanticsNode semanticsNode3 = replacedChildren$ui_release2.get(i11);
            if (getCurrentSemanticsNodes$ui_release().containsKey(Integer.valueOf(semanticsNode3.getId()))) {
                SemanticsNodeCopy semanticsNodeCopy2 = this.previousSemanticsNodes.get(Integer.valueOf(semanticsNode3.getId()));
                Intrinsics.checkNotNull(semanticsNodeCopy2);
                s(semanticsNode3, semanticsNodeCopy2);
            }
        }
    }

    @VisibleForTesting
    public final void sendContentCaptureSemanticsStructureChangeEvents$ui_release(@NotNull SemanticsNode newNode, @NotNull SemanticsNodeCopy oldNode) {
        Intrinsics.checkNotNullParameter(newNode, "newNode");
        Intrinsics.checkNotNullParameter(oldNode, "oldNode");
        List<SemanticsNode> replacedChildren$ui_release = newNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i10 = 0; i10 < size; i10++) {
            SemanticsNode semanticsNode = replacedChildren$ui_release.get(i10);
            if (getCurrentSemanticsNodes$ui_release().containsKey(Integer.valueOf(semanticsNode.getId())) && !oldNode.getChildren().contains(Integer.valueOf(semanticsNode.getId()))) {
                n(semanticsNode);
            }
        }
        for (Map.Entry<Integer, SemanticsNodeCopy> entry : this.previousSemanticsNodes.entrySet()) {
            if (!getCurrentSemanticsNodes$ui_release().containsKey(entry.getKey())) {
                int iIntValue = entry.getKey().intValue();
                ArrayMap<Integer, ViewStructureCompat> arrayMap = this.bufferedContentCaptureAppearedNodes;
                if (arrayMap.containsKey(Integer.valueOf(iIntValue))) {
                    arrayMap.remove(Integer.valueOf(iIntValue));
                } else {
                    this.bufferedContentCaptureDisappearedNodes.add(Integer.valueOf(iIntValue));
                }
            }
        }
        List<SemanticsNode> replacedChildren$ui_release2 = newNode.getReplacedChildren$ui_release();
        int size2 = replacedChildren$ui_release2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release2.get(i11);
            if (getCurrentSemanticsNodes$ui_release().containsKey(Integer.valueOf(semanticsNode2.getId())) && this.previousSemanticsNodes.containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(Integer.valueOf(semanticsNode2.getId()));
                Intrinsics.checkNotNull(semanticsNodeCopy);
                sendContentCaptureSemanticsStructureChangeEvents$ui_release(semanticsNode2, semanticsNodeCopy);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:104:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:114:0x0309  */
    /* JADX WARN: Code duplicated, block: B:117:0x031d A[LOOP:5: B:112:0x0305->B:117:0x031d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:126:0x0346  */
    /* JADX WARN: Code duplicated, block: B:134:0x0363  */
    /* JADX WARN: Code duplicated, block: B:139:0x038e  */
    /* JADX WARN: Code duplicated, block: B:143:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:144:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:145:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:154:0x045d  */
    /* JADX WARN: Code duplicated, block: B:162:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:167:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:169:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:171:0x0505  */
    /* JADX WARN: Code duplicated, block: B:175:0x0530 A[LOOP:2: B:174:0x052e->B:175:0x0530, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:178:0x054d A[LOOP:3: B:177:0x054b->B:178:0x054d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:185:0x056d  */
    /* JADX WARN: Code duplicated, block: B:187:0x0575  */
    /* JADX WARN: Code duplicated, block: B:190:0x0587  */
    /* JADX WARN: Code duplicated, block: B:202:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x057f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x057f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x0402 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x04c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0523 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x056f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x058f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x01a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x02a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x02c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0322 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x0324 A[EDGE_INSN: B:233:0x0324->B:119:0x0324 BREAK  A[LOOP:5: B:112:0x0305->B:117:0x031d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00d1 A[PHI: r1
      0x00d1: PHI (r1v5 int) = (r15v0 int), (r1v56 int) binds: [B:26:0x00b1, B:28:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:38:0x010a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0111  */
    /* JADX WARN: Code duplicated, block: B:42:0x0119  */
    /* JADX WARN: Code duplicated, block: B:50:0x0134  */
    /* JADX WARN: Code duplicated, block: B:53:0x0144  */
    /* JADX WARN: Code duplicated, block: B:57:0x015f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0164  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x01da  */
    /* JADX WARN: Code duplicated, block: B:76:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:78:0x021a  */
    /* JADX WARN: Code duplicated, block: B:79:0x022f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0243  */
    /* JADX WARN: Code duplicated, block: B:83:0x0258  */
    /* JADX WARN: Code duplicated, block: B:85:0x025c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0261  */
    /* JADX WARN: Code duplicated, block: B:89:0x026d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0294  */
    /* JADX WARN: Code duplicated, block: B:94:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:98:0x02ca  */
    /*  JADX ERROR: NullPointerException in pass: ProcessVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getUseList()" because "ssaVar" is null
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:93)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    @androidx.annotation.VisibleForTesting
    public final void sendSemanticsPropertyChangeEvents$ui_release(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.Integer, androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds> r32) {
        /*
            Method dump skipped, instruction units count: 1485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSemanticsPropertyChangeEvents$ui_release(java.util.Map):void");
    }

    public final void setAccessibilityForceEnabledForTesting$ui_release(boolean z10) {
        this.accessibilityForceEnabledForTesting = z10;
    }

    public final void setContentCaptureForceEnabledForTesting$ui_release(boolean z10) {
        this.contentCaptureForceEnabledForTesting = z10;
    }

    public final void setContentCaptureSession$ui_release(@Nullable ContentCaptureSessionCompat contentCaptureSessionCompat) {
        this.contentCaptureSession = contentCaptureSessionCompat;
    }

    public final void setCurrentSemanticsNodes$ui_release(@NotNull Map<Integer, SemanticsNodeWithAdjustedBounds> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.currentSemanticsNodes = map;
    }

    public final void setHoveredVirtualViewId$ui_release(int i10) {
        this.hoveredVirtualViewId = i10;
    }

    public final void setIdToAfterMap$ui_release(@NotNull HashMap<Integer, Integer> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.idToAfterMap = map;
    }

    public final void setIdToBeforeMap$ui_release(@NotNull HashMap<Integer, Integer> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.idToBeforeMap = map;
    }

    public final void setPreviousSemanticsNodes$ui_release(@NotNull Map<Integer, SemanticsNodeCopy> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.previousSemanticsNodes = map;
    }

    public final boolean t(AccessibilityEvent accessibilityEvent) {
        if (!j()) {
            return false;
        }
        View view = this.view;
        return view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public final boolean u(int i10, int i11, Integer num, List<String> list) {
        if (i10 == Integer.MIN_VALUE || !isEnabled$ui_release()) {
            return false;
        }
        AccessibilityEvent accessibilityEventCreateEvent$ui_release = createEvent$ui_release(i10, i11);
        if (num != null) {
            accessibilityEventCreateEvent$ui_release.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventCreateEvent$ui_release.setContentDescription(TempListUtilsKt.fastJoinToString$default(list, ",", null, null, 0, null, null, 62, null));
        }
        return t(accessibilityEventCreateEvent$ui_release);
    }

    public final void w(int i10, int i11, String str) {
        AccessibilityEvent accessibilityEventCreateEvent$ui_release = createEvent$ui_release(r(i10), 32);
        accessibilityEventCreateEvent$ui_release.setContentChangeTypes(i11);
        if (str != null) {
            accessibilityEventCreateEvent$ui_release.getText().add(str);
        }
        t(accessibilityEventCreateEvent$ui_release);
    }

    public final void x(int i10) {
        d dVar = this.f17060v;
        if (dVar != null) {
            SemanticsNode semanticsNode = dVar.f17070a;
            if (i10 != semanticsNode.getId()) {
                return;
            }
            if (SystemClock.uptimeMillis() - dVar.f17075f <= 1000) {
                AccessibilityEvent accessibilityEventCreateEvent$ui_release = createEvent$ui_release(r(semanticsNode.getId()), 131072);
                accessibilityEventCreateEvent$ui_release.setFromIndex(dVar.f17073d);
                accessibilityEventCreateEvent$ui_release.setToIndex(dVar.f17074e);
                accessibilityEventCreateEvent$ui_release.setAction(dVar.f17071b);
                accessibilityEventCreateEvent$ui_release.setMovementGranularity(dVar.f17072c);
                accessibilityEventCreateEvent$ui_release.getText().add(h(semanticsNode));
                t(accessibilityEventCreateEvent$ui_release);
            }
        }
        this.f17060v = null;
    }

    public final void y(LayoutNode layoutNode, ArraySet<Integer> arraySet) {
        SemanticsConfiguration collapsedSemantics$ui_release;
        LayoutNode layoutNodeAccess$findClosestParentNode;
        if (layoutNode.isAttached() && !this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            if (!layoutNode.getNodes().m3698hasH91voCI$ui_release(NodeKind.m3725constructorimpl(8))) {
                layoutNode = AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$findClosestParentNode(layoutNode, h.f17084p0);
            }
            if (layoutNode == null || (collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release()) == null) {
                return;
            }
            if (!collapsedSemantics$ui_release.getIsMergingSemanticsOfDescendants() && (layoutNodeAccess$findClosestParentNode = AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$findClosestParentNode(layoutNode, g.f17083p0)) != null) {
                layoutNode = layoutNodeAccess$findClosestParentNode;
            }
            int semanticsId = layoutNode.getSemanticsId();
            if (arraySet.add(Integer.valueOf(semanticsId))) {
                v(this, r(semanticsId), 2048, 1, 8);
            }
        }
    }

    public final boolean z(SemanticsNode semanticsNode, int i10, int i11, boolean z10) {
        String strH;
        SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        if (unmergedConfig.contains(semanticsActions.getSetSelection()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode)) {
            Function3 function3 = (Function3) ((AccessibilityAction) semanticsNode.getUnmergedConfig().get(semanticsActions.getSetSelection())).getAction();
            if (function3 != null) {
                return ((Boolean) function3.invoke(Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
            }
            return false;
        }
        if ((i10 == i11 && i11 == this.m) || (strH = h(semanticsNode)) == null) {
            return false;
        }
        if (i10 < 0 || i10 != i11 || i11 > strH.length()) {
            i10 = -1;
        }
        this.m = i10;
        boolean z11 = strH.length() > 0;
        t(b(r(semanticsNode.getId()), z11 ? Integer.valueOf(this.m) : null, z11 ? Integer.valueOf(this.m) : null, z11 ? Integer.valueOf(strH.length()) : null, strH));
        x(semanticsNode.getId());
        return true;
    }

    @VisibleForTesting
    public static /* synthetic */ void getAccessibilityManager$ui_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getEnabledStateListener$ui_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getPreviousSemanticsNodes$ui_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTouchExplorationStateListener$ui_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void isEnabled$ui_release$annotations() {
    }
}
