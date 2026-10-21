package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AndroidAutofill;
import androidx.compose.ui.autofill.AndroidAutofill_androidKt;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillCallback;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.InputModeManagerImpl;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.MotionEventAdapter;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.input.pointer.PointerInputEvent;
import androidx.compose.ui.input.pointer.PointerInputEventData;
import androidx.compose.ui.input.pointer.PointerInputEventProcessor;
import androidx.compose.ui.input.pointer.PointerInputEventProcessorKt;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.input.pointer.ProcessResult;
import androidx.compose.ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.layout.RootMeasurePolicy;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.MeasureAndLayoutDelegate;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.ui.text.input.AndroidTextInputServicePlugin;
import androidx.compose.ui.text.input.PlatformTextInput;
import androidx.compose.ui.text.input.PlatformTextInputAdapter;
import androidx.compose.ui.text.input.PlatformTextInputPlugin;
import androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000®\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 Î\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004Î\u0002Ï\u0002B\u001d\u0012\b\u0010Ë\u0002\u001a\u00030Ê\u0002\u0012\b\u0010\u00ad\u0002\u001a\u00030¨\u0002¢\u0006\u0006\bÌ\u0002\u0010Í\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\"\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0014J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\rH\u0016J\u001d\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010!\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0006\u0010\"\u001a\u00020\bJ\b\u0010#\u001a\u00020\bH\u0016J\u0016\u0010&\u001a\u00020\b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0$H\u0016J\u0016\u0010*\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u001eJ\u000e\u0010+\u001a\u00020\b2\u0006\u0010(\u001a\u00020'J\u0016\u0010.\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010-\u001a\u00020,J\u0010\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020\rH\u0016J%\u00100\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u001e2\u0006\u00102\u001a\u000201H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104J\u0018\u00106\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u001e2\u0006\u00105\u001a\u00020\rH\u0016J(\u00109\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u001e2\u0006\u00105\u001a\u00020\r2\u0006\u00107\u001a\u00020\r2\u0006\u00108\u001a\u00020\rH\u0016J \u0010:\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u001e2\u0006\u00105\u001a\u00020\r2\u0006\u00107\u001a\u00020\rH\u0016J\u0010\u0010;\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u001eH\u0016J\b\u0010<\u001a\u00020\bH\u0016J\u0018\u0010?\u001a\u00020\b2\u0006\u0010=\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u000fH\u0014J0\u0010E\u001a\u00020\b2\u0006\u0010@\u001a\u00020\r2\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020\u000f2\u0006\u0010D\u001a\u00020\u000fH\u0014J\u0010\u0010F\u001a\u00020\b2\u0006\u0010-\u001a\u00020,H\u0014J*\u0010L\u001a\u00020K2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\b0G2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\b0$H\u0016J\u0017\u0010P\u001a\u00020\r2\u0006\u0010M\u001a\u00020KH\u0000¢\u0006\u0004\bN\u0010OJ\b\u0010Q\u001a\u00020\bH\u0016J\u0010\u0010R\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u001eH\u0016J\u0010\u0010T\u001a\u00020\b2\u0006\u0010%\u001a\u00020SH\u0016J\u001f\u0010X\u001a\u0004\u0018\u00010U2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bV\u0010WJ\u0010\u0010Y\u001a\u00020\b2\u0006\u0010-\u001a\u00020,H\u0014J\u001f\u0010]\u001a\u00020\b2\u0006\u0010M\u001a\u00020K2\u0006\u0010Z\u001a\u00020\rH\u0000¢\u0006\u0004\b[\u0010\\J\u001a\u0010`\u001a\u00020\b2\u0012\u0010_\u001a\u000e\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020\b0GJ\u0013\u0010a\u001a\u00020\bH\u0086@ø\u0001\u0001¢\u0006\u0004\ba\u0010bJ\b\u0010c\u001a\u00020\bH\u0016J\b\u0010d\u001a\u00020\bH\u0014J\b\u0010e\u001a\u00020\bH\u0014J\u001a\u0010i\u001a\u00020\b2\b\u0010g\u001a\u0004\u0018\u00010f2\u0006\u0010h\u001a\u00020\u000fH\u0016J\u0016\u0010m\u001a\u00020\b2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020k0jH\u0016J\u0010\u0010o\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020nH\u0016J\u0010\u0010q\u001a\u00020\r2\u0006\u0010p\u001a\u00020nH\u0016J\u0010\u0010r\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010s\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u001d\u0010x\u001a\u00020t2\u0006\u0010u\u001a\u00020tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bv\u0010wJ\u001d\u0010{\u001a\u00020t2\u0006\u0010y\u001a\u00020tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bz\u0010wJ\b\u0010|\u001a\u00020\rH\u0016J\u0013\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f2\u0006\u0010~\u001a\u00020}H\u0016J \u0010\u0083\u0001\u001a\u00020t2\u0007\u0010\u0081\u0001\u001a\u00020tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0082\u0001\u0010wJ\u001f\u0010\u0085\u0001\u001a\u00020t2\u0006\u0010u\u001a\u00020tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0084\u0001\u0010wJ\u0013\u0010\u0088\u0001\u001a\u00020\b2\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0014J\u0012\u0010\u008a\u0001\u001a\u00020\b2\u0007\u0010\u0089\u0001\u001a\u00020\u000fH\u0016J\u0011\u0010\u008b\u0001\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020nH\u0016J\u0013\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u00012\u0007\u0010\u008c\u0001\u001a\u00020\u000fJ\t\u0010\u008f\u0001\u001a\u00020\rH\u0016R \u0010\u0095\u0001\u001a\u00030\u0090\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R,\u0010\u009c\u0001\u001a\u00030\u0096\u00012\b\u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0016@RX\u0096\u000e¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R \u0010¢\u0001\u001a\u00030\u009d\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001R\u001f\u0010§\u0001\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R \u0010\u00ad\u0001\u001a\u00030¨\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R \u0010³\u0001\u001a\u00030®\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001R \u0010¹\u0001\u001a\u00030´\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001R6\u0010À\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0086\u0001\u0012\u0004\u0012\u00020\b0G8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0006\b¾\u0001\u0010¿\u0001R \u0010Æ\u0001\u001a\u00030Á\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÂ\u0001\u0010Ã\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001R \u0010Ì\u0001\u001a\u00030Ç\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÈ\u0001\u0010É\u0001\u001a\u0006\bÊ\u0001\u0010Ë\u0001R \u0010Ò\u0001\u001a\u00030Í\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÎ\u0001\u0010Ï\u0001\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R1\u0010Û\u0001\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006 \n\u0006\bÓ\u0001\u0010Ô\u0001\u0012\u0006\bÙ\u0001\u0010Ú\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001\"\u0006\b×\u0001\u0010Ø\u0001R \u0010á\u0001\u001a\u00030Ü\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÝ\u0001\u0010Þ\u0001\u001a\u0006\bß\u0001\u0010à\u0001R2\u0010ê\u0001\u001a\u00030â\u00018\u0000@\u0000X\u0081\u000e¢\u0006 \n\u0006\bã\u0001\u0010ä\u0001\u0012\u0006\bé\u0001\u0010Ú\u0001\u001a\u0006\bå\u0001\u0010æ\u0001\"\u0006\bç\u0001\u0010è\u0001R7\u0010ñ\u0001\u001a\u0004\u0018\u00010^2\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010^8B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\bë\u0001\u0010ì\u0001\u001a\u0006\bí\u0001\u0010î\u0001\"\u0006\bï\u0001\u0010ð\u0001R\"\u0010õ\u0001\u001a\u0004\u0018\u00010^8FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\bò\u0001\u0010ó\u0001\u001a\u0006\bô\u0001\u0010î\u0001R \u0010û\u0001\u001a\u00030ö\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b÷\u0001\u0010ø\u0001\u001a\u0006\bù\u0001\u0010ú\u0001R \u0010\u0081\u0002\u001a\u00030ü\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bý\u0001\u0010þ\u0001\u001a\u0006\bÿ\u0001\u0010\u0080\u0002R(\u0010\u0088\u0002\u001a\u00030\u0082\u00028\u0016X\u0097\u0004¢\u0006\u0018\n\u0006\b\u0083\u0002\u0010\u0084\u0002\u0012\u0006\b\u0087\u0002\u0010Ú\u0001\u001a\u0006\b\u0085\u0002\u0010\u0086\u0002R5\u0010\u008f\u0002\u001a\u00030\u0089\u00022\b\u0010\u0097\u0001\u001a\u00030\u0089\u00028V@RX\u0096\u008e\u0002¢\u0006\u0018\n\u0006\b\u008a\u0002\u0010ì\u0001\u001a\u0006\b\u008b\u0002\u0010\u008c\u0002\"\u0006\b\u008d\u0002\u0010\u008e\u0002R5\u0010\u0089\u0001\u001a\u00030\u0090\u00022\b\u0010\u0097\u0001\u001a\u00030\u0090\u00028V@RX\u0096\u008e\u0002¢\u0006\u0018\n\u0006\b\u0091\u0002\u0010ì\u0001\u001a\u0006\b\u0092\u0002\u0010\u0093\u0002\"\u0006\b\u0094\u0002\u0010\u0095\u0002R \u0010\u009b\u0002\u001a\u00030\u0096\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0097\u0002\u0010\u0098\u0002\u001a\u0006\b\u0099\u0002\u0010\u009a\u0002R \u0010¡\u0002\u001a\u00030\u009c\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u009d\u0002\u0010\u009e\u0002\u001a\u0006\b\u009f\u0002\u0010 \u0002R \u0010§\u0002\u001a\u00030¢\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b£\u0002\u0010¤\u0002\u001a\u0006\b¥\u0002\u0010¦\u0002R \u0010\u00ad\u0002\u001a\u00030¨\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b©\u0002\u0010ª\u0002\u001a\u0006\b«\u0002\u0010¬\u0002R \u0010³\u0002\u001a\u00030®\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¯\u0002\u0010°\u0002\u001a\u0006\b±\u0002\u0010²\u0002R\u0017\u0010(\u001a\u00030\u008d\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b´\u0002\u0010µ\u0002R\u0018\u0010¹\u0002\u001a\u00030¶\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b·\u0002\u0010¸\u0002R\u0019\u0010m\u001a\u0005\u0018\u00010º\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b»\u0002\u0010¼\u0002R\u0018\u0010À\u0002\u001a\u00030½\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b¾\u0002\u0010¿\u0002R\u0018\u0010Â\u0002\u001a\u00030â\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÁ\u0002\u0010æ\u0001R\u0017\u0010Ä\u0002\u001a\u00020\r8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÃ\u0002\u0010Ö\u0001R\u0018\u0010È\u0002\u001a\u00030Å\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bÆ\u0002\u0010Ç\u0002R\u0017\u0010É\u0002\u001a\u00020\r8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÉ\u0002\u0010Ö\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006Ð\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/platform/ViewRootForTest;", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/graphics/Rect;", "rect", "", "getFocusedRect", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onResume", "", "gainFocus", "", "direction", "previouslyFocusedRect", "onFocusChanged", "hasWindowFocus", "onWindowFocusChanged", "Landroidx/compose/ui/input/key/KeyEvent;", "keyEvent", "sendKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "sendKeyEvent", "Landroid/view/KeyEvent;", "event", "dispatchKeyEvent", "dispatchKeyEventPreIme", "Landroidx/compose/ui/node/LayoutNode;", "node", "onAttach", "onDetach", "requestClearInvalidObservations", "onEndApplyChanges", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerOnEndApplyChangesListener", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "view", "layoutNode", "addAndroidView", "removeAndroidView", "Landroid/graphics/Canvas;", "canvas", "drawAndroidView", "sendPointerUpdate", "measureAndLayout", "Landroidx/compose/ui/unit/Constraints;", "constraints", "measureAndLayout-0kLqBqw", "(Landroidx/compose/ui/node/LayoutNode;J)V", "affectsLookahead", "forceMeasureTheSubtree", "forceRequest", "scheduleMeasureAndLayout", "onRequestMeasure", "onRequestRelayout", "requestOnPositionedCallback", "measureAndLayoutForTest", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "changed", "l", "t", "r", "b", "onLayout", "onDraw", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "drawBlock", "invalidateParentLayer", "Landroidx/compose/ui/node/OwnedLayer;", "createLayer", "layer", "recycle$ui_release", "(Landroidx/compose/ui/node/OwnedLayer;)Z", "recycle", "onSemanticsChange", "onLayoutChange", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "registerOnLayoutCompletedListener", "Landroidx/compose/ui/focus/FocusDirection;", "getFocusDirection-P8AzH3I", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/FocusDirection;", "getFocusDirection", "dispatchDraw", "isDirty", "notifyLayerIsDirty$ui_release", "(Landroidx/compose/ui/node/OwnedLayer;Z)V", "notifyLayerIsDirty", "Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "callback", "setOnViewTreeOwnersAvailable", "boundsUpdatesEventLoop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invalidateDescendants", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/ViewStructure;", "structure", "flags", "onProvideAutofillVirtualStructure", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "autofill", "Landroid/view/MotionEvent;", "dispatchGenericMotionEvent", "motionEvent", "dispatchTouchEvent", "canScrollHorizontally", "canScrollVertically", "Landroidx/compose/ui/geometry/Offset;", "localPosition", "localToScreen-MK-Hz9U", "(J)J", "localToScreen", "positionOnScreen", "screenToLocal-MK-Hz9U", "screenToLocal", "onCheckIsTextEditor", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "onCreateInputConnection", "positionInWindow", "calculateLocalPosition-MK-Hz9U", "calculateLocalPosition", "calculatePositionInWindow-MK-Hz9U", "calculatePositionInWindow", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "layoutDirection", "onRtlPropertiesChanged", "dispatchHoverEvent", "accessibilityId", "Landroid/view/View;", "findViewByAccessibilityIdTraversal", "shouldDelayChildPressedState", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "r0", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getSharedDrawScope", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "sharedDrawScope", "Landroidx/compose/ui/unit/Density;", "<set-?>", "s0", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/focus/FocusOwner;", "t0", "Landroidx/compose/ui/focus/FocusOwner;", "getFocusOwner", "()Landroidx/compose/ui/focus/FocusOwner;", "focusOwner", "y0", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/node/RootForTest;", "E0", "Landroidx/compose/ui/node/RootForTest;", "getRootForTest", "()Landroidx/compose/ui/node/RootForTest;", "rootForTest", "Landroidx/compose/ui/semantics/SemanticsOwner;", "F0", "Landroidx/compose/ui/semantics/SemanticsOwner;", "getSemanticsOwner", "()Landroidx/compose/ui/semantics/SemanticsOwner;", "semanticsOwner", "Landroidx/compose/ui/autofill/AutofillTree;", "H0", "Landroidx/compose/ui/autofill/AutofillTree;", "getAutofillTree", "()Landroidx/compose/ui/autofill/AutofillTree;", "autofillTree", "N0", "Lkotlin/jvm/functions/Function1;", "getConfigurationChangeObserver", "()Lkotlin/jvm/functions/Function1;", "setConfigurationChangeObserver", "(Lkotlin/jvm/functions/Function1;)V", "configurationChangeObserver", "Landroidx/compose/ui/platform/AndroidClipboardManager;", "Q0", "Landroidx/compose/ui/platform/AndroidClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/AndroidClipboardManager;", "clipboardManager", "Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "R0", "Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "accessibilityManager", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "S0", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "T0", "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "()V", "showLayoutBounds", "Landroidx/compose/ui/platform/ViewConfiguration;", "Z0", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "", "e1", "J", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "(J)V", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "lastMatrixRecalculationAnimationTime", "i1", "Landroidx/compose/runtime/MutableState;", "get_viewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "set_viewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;)V", "_viewTreeOwners", "j1", "Landroidx/compose/runtime/State;", "getViewTreeOwners", "viewTreeOwners", "Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl;", "o1", "Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl;", "getPlatformTextInputPluginRegistry", "()Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl;", "platformTextInputPluginRegistry", "Landroidx/compose/ui/text/input/TextInputService;", "p1", "Landroidx/compose/ui/text/input/TextInputService;", "getTextInputService", "()Landroidx/compose/ui/text/input/TextInputService;", "textInputService", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "q1", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader$annotations", "fontLoader", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "r1", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "setFontFamilyResolver", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "fontFamilyResolver", "Landroidx/compose/ui/unit/LayoutDirection;", "t1", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "u1", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hapticFeedBack", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "w1", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "getModifierLocalManager", "()Landroidx/compose/ui/modifier/ModifierLocalManager;", "modifierLocalManager", "Landroidx/compose/ui/platform/TextToolbar;", "x1", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "textToolbar", "Lkotlin/coroutines/CoroutineContext;", "y1", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroidx/compose/ui/input/pointer/PointerIconService;", "J1", "Landroidx/compose/ui/input/pointer/PointerIconService;", "getPointerIconService", "()Landroidx/compose/ui/input/pointer/PointerIconService;", "pointerIconService", "getView", "()Landroid/view/View;", "Landroidx/compose/ui/platform/WindowInfo;", "getWindowInfo", "()Landroidx/compose/ui/platform/WindowInfo;", "windowInfo", "Landroidx/compose/ui/autofill/Autofill;", "getAutofill", "()Landroidx/compose/ui/autofill/Autofill;", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "getAndroidViewsHandler$ui_release", "()Landroidx/compose/ui/platform/AndroidViewsHandler;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Landroidx/compose/ui/input/InputModeManager;", "getInputModeManager", "()Landroidx/compose/ui/input/InputModeManager;", "inputModeManager", "isLifecycleInResumedState", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V", "Companion", "ViewTreeOwners", "ui_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"ViewConstructor", "VisibleForTests"})
@SourceDebugExtension({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 6 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 9 DebugUtils.kt\nandroidx/compose/ui/platform/DebugUtilsKt\n+ 10 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,2051:1\n979#1,3:2081\n979#1,3:2084\n1182#2:2052\n1161#2,2:2053\n81#3:2055\n107#3,2:2056\n81#3:2058\n81#3:2059\n107#3,2:2060\n81#3:2062\n107#3,2:2063\n523#4:2065\n728#4,2:2066\n460#4,11:2095\n460#4,11:2107\n26#5,5:2068\n26#5,5:2073\n26#5,3:2078\n30#5:2087\n26#5,5:2122\n47#6,5:2088\n1#7:2093\n197#8:2094\n197#8:2106\n20#9,2:2118\n20#9,2:2120\n217#10,6:2127\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView\n*L\n953#1:2081,3\n954#1:2084,3\n479#1:2052\n479#1:2053,2\n339#1:2055\n339#1:2056,2\n348#1:2058\n401#1:2059\n401#1:2060,2\n415#1:2062\n415#1:2063,2\n691#1:2065\n704#1:2066,2\n1207#1:2095,11\n1215#1:2107,11\n877#1:2068,5\n889#1:2073,5\n949#1:2078,3\n949#1:2087\n1364#1:2122,5\n1133#1:2088,5\n1207#1:2094\n1215#1:2106\n1227#1:2118,2\n1282#1:2120,2\n1442#1:2127,6\n*E\n"})
public final class AndroidComposeView extends ViewGroup implements Owner, ViewRootForTest, PositionCalculator, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    public static Class<?> K1;

    @Nullable
    public static Method L1;
    public long A1;

    @NotNull
    public final WeakCache<OwnedLayer> B1;

    @NotNull
    public final MutableVector<Function0<Unit>> C1;

    @NotNull
    public final AndroidComposeView$resendMotionEventRunnable$1 D1;

    @NotNull
    public final AndroidComposeView E0;

    @NotNull
    public final androidx.appcompat.app.f E1;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    @NotNull
    public final SemanticsOwner semanticsOwner;
    public boolean F1;

    @NotNull
    public final AndroidComposeViewAccessibilityDelegateCompat G0;

    @NotNull
    public final g G1;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @NotNull
    public final AutofillTree autofillTree;

    @NotNull
    public final j0 H1;

    @NotNull
    public final ArrayList I0;
    public boolean I1;

    @Nullable
    public ArrayList J0;

    @NotNull
    public final AndroidComposeView$pointerIconService$1 J1;
    public boolean K0;

    @NotNull
    public final MotionEventAdapter L0;

    @NotNull
    public final PointerInputEventProcessor M0;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    @NotNull
    public Function1<? super Configuration, Unit> configurationChangeObserver;

    @Nullable
    public final AndroidAutofill O0;
    public boolean P0;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    @NotNull
    public final AndroidClipboardManager clipboardManager;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    @NotNull
    public final AndroidAccessibilityManager accessibilityManager;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    @NotNull
    public final OwnerSnapshotObserver snapshotObserver;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    public boolean showLayoutBounds;

    @Nullable
    public AndroidViewsHandler U0;

    @Nullable
    public DrawChildContainer V0;

    @Nullable
    public Constraints W0;
    public boolean X0;

    @NotNull
    public final MeasureAndLayoutDelegate Y0;

    @NotNull
    public final AndroidViewConfiguration Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public long f16986a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    @NotNull
    public final int[] f16987b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    @NotNull
    public final float[] f16988c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    @NotNull
    public final float[] f16989d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name and from kotlin metadata */
    public long lastMatrixRecalculationAnimationTime;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public boolean f16991f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public long f16992g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public boolean f16993h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState _viewTreeOwners;

    /* JADX INFO: renamed from: j1, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final State viewTreeOwners;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    @Nullable
    public Function1<? super ViewTreeOwners, Unit> f16996k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    @NotNull
    public final androidx.compose.ui.platform.d f16997l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    @NotNull
    public final androidx.compose.ui.platform.e f16998m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    @NotNull
    public final androidx.compose.ui.platform.f f16999n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistry;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public long f17001p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextInputService textInputService;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f17003q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    @NotNull
    public final AndroidFontResourceLoader f17004q1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LayoutNodeDrawScope sharedDrawScope;

    /* JADX INFO: renamed from: r1, reason: from kotlin metadata */
    @NotNull
    public final MutableState fontFamilyResolver;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Density density;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public int f17007s1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final FocusOwnerImpl f17008t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState layoutDirection;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final WindowInfoImpl f17010u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    @NotNull
    public final PlatformHapticFeedback f17011u1;

    @NotNull
    public final Modifier v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    @NotNull
    public final InputModeManagerImpl f17012v1;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final Modifier f17013w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ModifierLocalManager modifierLocalManager;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final CanvasHolder f17015x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @NotNull
    public final AndroidTextToolbar f17016x1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LayoutNode root;

    /* JADX INFO: renamed from: y1, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CoroutineContext coroutineContext;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    @Nullable
    public MotionEvent f17019z1;

    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$Companion;", "", "", "FocusTag", "Ljava/lang/String;", "", "MaximumLayerCacheSize", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "Ljava/lang/reflect/Method;", "getBooleanMethod", "Ljava/lang/reflect/Method;", "Ljava/lang/Class;", "systemPropertiesClass", "Ljava/lang/Class;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final boolean access$getIsShowingLayoutBounds(Companion companion) {
            companion.getClass();
            try {
                if (AndroidComposeView.K1 == null) {
                    AndroidComposeView.K1 = Class.forName("android.os.SystemProperties");
                    Class cls = AndroidComposeView.K1;
                    AndroidComposeView.L1 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = AndroidComposeView.L1;
                Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "", "Landroidx/lifecycle/LifecycleOwner;", "a", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "b", "Landroidx/savedstate/SavedStateRegistryOwner;", "getSavedStateRegistryOwner", "()Landroidx/savedstate/SavedStateRegistryOwner;", "savedStateRegistryOwner", "<init>", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/savedstate/SavedStateRegistryOwner;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static final class ViewTreeOwners {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final LifecycleOwner lifecycleOwner;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final SavedStateRegistryOwner savedStateRegistryOwner;

        public ViewTreeOwners(@NotNull LifecycleOwner lifecycleOwner, @NotNull SavedStateRegistryOwner savedStateRegistryOwner) {
            Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
            Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "savedStateRegistryOwner");
            this.lifecycleOwner = lifecycleOwner;
            this.savedStateRegistryOwner = savedStateRegistryOwner;
        }

        @NotNull
        public final LifecycleOwner getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        @NotNull
        public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
            return this.savedStateRegistryOwner;
        }
    }

    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    public static final class a extends Lambda implements Function1<InputMode, Boolean> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(InputMode inputMode) {
            boolean zRequestFocusFromTouch;
            int f16168a = inputMode.getF16168a();
            InputMode.Companion companion = InputMode.INSTANCE;
            boolean zM3046equalsimpl0 = InputMode.m3046equalsimpl0(f16168a, companion.m3051getTouchaOaMEAU());
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            if (zM3046equalsimpl0) {
                zRequestFocusFromTouch = androidComposeView.isInTouchMode();
            } else if (InputMode.m3046equalsimpl0(f16168a, companion.m3050getKeyboardaOaMEAU())) {
                zRequestFocusFromTouch = androidComposeView.isInTouchMode() ? androidComposeView.requestFocusFromTouch() : true;
            } else {
                zRequestFocusFromTouch = false;
            }
            return Boolean.valueOf(zRequestFocusFromTouch);
        }
    }

    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    public static final class b extends Lambda implements Function1<Configuration, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f17027p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Configuration configuration) {
            Configuration it = configuration;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    public static final class c extends Lambda implements Function1<Function0<? extends Unit>, Unit> {
        public c() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Function0<? extends Unit> function0) {
            Function0<? extends Unit> it = function0;
            Intrinsics.checkNotNullParameter(it, "it");
            AndroidComposeView.this.registerOnEndApplyChangesListener(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    public static final class d extends Lambda implements Function1<KeyEvent, Boolean> {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(KeyEvent keyEvent) {
            android.view.KeyEvent it = keyEvent.m3355unboximpl();
            Intrinsics.checkNotNullParameter(it, "it");
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            FocusDirection focusDirectionMo3779getFocusDirectionP8AzH3I = androidComposeView.mo3779getFocusDirectionP8AzH3I(it);
            return (focusDirectionMo3779getFocusDirectionP8AzH3I == null || !KeyEventType.m3359equalsimpl0(KeyEvent_androidKt.m3367getTypeZmokQxo(it), KeyEventType.INSTANCE.m3363getKeyDownCS__XNY())) ? Boolean.FALSE : Boolean.valueOf(androidComposeView.getFocusOwner().mo2227moveFocus3ESFkO8(focusDirectionMo3779getFocusDirectionP8AzH3I.getF15475a()));
        }
    }

    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    public static final class e extends Lambda implements Function2<PlatformTextInputPlugin<?>, PlatformTextInput, PlatformTextInputAdapter> {
        public e() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final PlatformTextInputAdapter invoke(PlatformTextInputPlugin<?> platformTextInputPlugin, PlatformTextInput platformTextInput) {
            PlatformTextInputPlugin<?> factory = platformTextInputPlugin;
            PlatformTextInput platformTextInput2 = platformTextInput;
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(platformTextInput2, "platformTextInput");
            return factory.createAdapter(platformTextInput2, AndroidComposeView.this);
        }
    }

    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    public static final class f extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ AndroidViewHolder f17032q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AndroidViewHolder androidViewHolder) {
            super(0);
            this.f17032q0 = androidViewHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            AndroidViewsHandler androidViewsHandler$ui_release = androidComposeView.getAndroidViewsHandler$ui_release();
            AndroidViewHolder androidViewHolder = this.f17032q0;
            androidViewsHandler$ui_release.removeViewInLayout(androidViewHolder);
            HashMap<LayoutNode, AndroidViewHolder> layoutNodeToHolder = androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
            TypeIntrinsics.asMutableMap(layoutNodeToHolder).remove(androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(androidViewHolder));
            ViewCompat.setImportantForAccessibility(androidViewHolder, 0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    public static final class g extends Lambda implements Function0<Unit> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            int actionMasked;
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            MotionEvent motionEvent = androidComposeView.f17019z1;
            if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                androidComposeView.A1 = SystemClock.uptimeMillis();
                androidComposeView.post(androidComposeView.D1);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    public static final class h extends Lambda implements Function1<RotaryScrollEvent, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final h f17034p0 = new h(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(RotaryScrollEvent rotaryScrollEvent) {
            RotaryScrollEvent it = rotaryScrollEvent;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    public static final class i extends Lambda implements Function1<Function0<? extends Unit>, Unit> {
        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Function0<? extends Unit> function0) {
            Function0<? extends Unit> command = function0;
            Intrinsics.checkNotNullParameter(command, "command");
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            Handler handler = androidComposeView.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                command.invoke();
            } else {
                Handler handler2 = androidComposeView.getHandler();
                if (handler2 != null) {
                    handler2.post(new androidx.compose.ui.platform.g(0, command));
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    public static final class j extends Lambda implements Function0<ViewTreeOwners> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewTreeOwners invoke() {
            return AndroidComposeView.this.get_viewTreeOwners();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11, types: [androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1] */
    /* JADX WARN: Type inference failed for: r12v15, types: [androidx.compose.ui.platform.AndroidComposeView$pointerIconService$1] */
    /* JADX WARN: Type inference failed for: r4v30, types: [androidx.compose.ui.platform.e] */
    /* JADX WARN: Type inference failed for: r4v31, types: [androidx.compose.ui.platform.f] */
    public AndroidComposeView(@NotNull Context context, @NotNull CoroutineContext coroutineContext) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Offset.Companion companion = Offset.INSTANCE;
        this.f17001p0 = companion.m2290getUnspecifiedF1C5BW0();
        this.f17003q0 = true;
        this.sharedDrawScope = new LayoutNodeDrawScope(null, 1, 0 == true ? 1 : 0);
        this.density = AndroidDensity_androidKt.Density(context);
        EmptySemanticsElement emptySemanticsElement = EmptySemanticsElement.INSTANCE;
        this.f17008t0 = new FocusOwnerImpl(new c());
        this.f17010u0 = new WindowInfoImpl();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierOnKeyEvent = KeyInputModifierKt.onKeyEvent(companion2, new d());
        this.v0 = modifierOnKeyEvent;
        Modifier modifierOnRotaryScrollEvent = RotaryInputModifierKt.onRotaryScrollEvent(companion2, h.f17034p0);
        this.f17013w0 = modifierOnRotaryScrollEvent;
        this.f17015x0 = new CanvasHolder();
        int i10 = 3;
        LayoutNode layoutNode = new LayoutNode(false, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        layoutNode.setMeasurePolicy(RootMeasurePolicy.INSTANCE);
        layoutNode.setDensity(getDensity());
        layoutNode.setModifier(companion2.then(emptySemanticsElement).then(modifierOnRotaryScrollEvent).then(getFocusOwner().getModifier()).then(modifierOnKeyEvent));
        this.root = layoutNode;
        this.E0 = this;
        this.semanticsOwner = new SemanticsOwner(getRoot());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.G0 = androidComposeViewAccessibilityDelegateCompat;
        this.autofillTree = new AutofillTree();
        this.I0 = new ArrayList();
        this.L0 = new MotionEventAdapter();
        this.M0 = new PointerInputEventProcessor(getRoot());
        this.configurationChangeObserver = b.f17027p0;
        this.O0 = a() ? new AndroidAutofill(this, getAutofillTree()) : null;
        this.clipboardManager = new AndroidClipboardManager(context);
        this.accessibilityManager = new AndroidAccessibilityManager(context);
        this.snapshotObserver = new OwnerSnapshotObserver(new i());
        this.Y0 = new MeasureAndLayoutDelegate(getRoot());
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        Intrinsics.checkNotNullExpressionValue(viewConfiguration, "get(context)");
        this.Z0 = new AndroidViewConfiguration(viewConfiguration);
        this.f16986a1 = IntOffsetKt.IntOffset(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f16987b1 = new int[]{0, 0};
        this.f16988c1 = Matrix.m2700constructorimpl$default(null, 1, null);
        this.f16989d1 = Matrix.m2700constructorimpl$default(null, 1, null);
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.f16992g1 = companion.m2289getInfiniteF1C5BW0();
        this.f16993h1 = true;
        this._viewTreeOwners = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.viewTreeOwners = SnapshotStateKt.derivedStateOf(new j());
        this.f16997l1 = new androidx.compose.ui.platform.d(this, 0);
        this.f16998m1 = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.e
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AndroidComposeView.Companion companion3 = AndroidComposeView.INSTANCE;
                AndroidComposeView this$0 = this.f17397a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.p();
            }
        };
        this.f16999n1 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.f
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z10) {
                AndroidComposeView.Companion companion3 = AndroidComposeView.INSTANCE;
                AndroidComposeView this$0 = this.f17400p0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f17012v1.m3054setInputModeiuPiT84(z10 ? InputMode.INSTANCE.m3051getTouchaOaMEAU() : InputMode.INSTANCE.m3050getKeyboardaOaMEAU());
            }
        };
        this.platformTextInputPluginRegistry = new PlatformTextInputPluginRegistryImpl(new e());
        this.textInputService = ((AndroidTextInputServicePlugin.Adapter) getPlatformTextInputPluginRegistry().getOrCreateAdapter(AndroidTextInputServicePlugin.INSTANCE).getAdapter()).getAndroidx.core.app.NotificationCompat.CATEGORY_SERVICE java.lang.String();
        this.f17004q1 = new AndroidFontResourceLoader(context);
        this.fontFamilyResolver = SnapshotStateKt.mutableStateOf(FontFamilyResolver_androidKt.createFontFamilyResolver(context), SnapshotStateKt.referentialEqualityPolicy());
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "context.resources.configuration");
        int i11 = Build.VERSION.SDK_INT;
        this.f17007s1 = i11 >= 31 ? configuration.fontWeightAdjustment : 0;
        Configuration configuration2 = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "context.resources.configuration");
        this.layoutDirection = SnapshotStateKt.mutableStateOf$default(AndroidComposeView_androidKt.getLocaleLayoutDirection(configuration2), null, 2, null);
        this.f17011u1 = new PlatformHapticFeedback(this);
        this.f17012v1 = new InputModeManagerImpl(isInTouchMode() ? InputMode.INSTANCE.m3051getTouchaOaMEAU() : InputMode.INSTANCE.m3050getKeyboardaOaMEAU(), new a(), null);
        this.modifierLocalManager = new ModifierLocalManager(this);
        this.f17016x1 = new AndroidTextToolbar(this);
        this.coroutineContext = coroutineContext;
        this.B1 = new WeakCache<>();
        this.C1 = new MutableVector<>(new Function0[16], 0);
        this.D1 = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1
            @Override // java.lang.Runnable
            public void run() {
                AndroidComposeView androidComposeView = this.f17039p0;
                androidComposeView.removeCallbacks(this);
                MotionEvent motionEvent = androidComposeView.f17019z1;
                if (motionEvent != null) {
                    boolean z10 = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z10) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i12 = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i12 = 2;
                    }
                    AndroidComposeView androidComposeView2 = this.f17039p0;
                    androidComposeView2.o(motionEvent, i12, androidComposeView2.A1, false);
                }
            }
        };
        this.E1 = new androidx.appcompat.app.f(this, i10);
        this.G1 = new g();
        this.H1 = i11 >= 29 ? new l0() : new k0();
        setWillNotDraw(false);
        setFocusable(true);
        if (i11 >= 26) {
            e0.f17398a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        ViewCompat.setAccessibilityDelegate(this, androidComposeViewAccessibilityDelegateCompat);
        Function1<ViewRootForTest, Unit> onViewCreatedCallback = ViewRootForTest.INSTANCE.getOnViewCreatedCallback();
        if (onViewCreatedCallback != null) {
            onViewCreatedCallback.invoke(this);
        }
        getRoot().attach$ui_release(this);
        if (i11 >= 29) {
            w.f17454a.a(this);
        }
        this.J1 = new PointerIconService() { // from class: androidx.compose.ui.platform.AndroidComposeView$pointerIconService$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public PointerIcon f17037a = PointerIcon.INSTANCE.getDefault();

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            @NotNull
            /* JADX INFO: renamed from: getIcon, reason: from getter */
            public PointerIcon getF17037a() {
                return this.f17037a;
            }

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            public void setIcon(@Nullable PointerIcon value) {
                if (value == null) {
                    value = PointerIcon.INSTANCE.getDefault();
                }
                this.f17037a = value;
                if (Build.VERSION.SDK_INT >= 24) {
                    b0.f17385a.a(this.f17038b, value);
                }
            }
        };
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static final void access$addExtraDataToAccessibilityNodeInfoHelper(AndroidComposeView androidComposeView, int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        Integer num;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = androidComposeView.G0;
        if (Intrinsics.areEqual(str, androidComposeViewAccessibilityDelegateCompat.getEXTRA_DATA_TEST_TRAVERSALBEFORE_VAL())) {
            Integer num2 = androidComposeViewAccessibilityDelegateCompat.getIdToBeforeMap$ui_release().get(Integer.valueOf(i10));
            if (num2 != null) {
                accessibilityNodeInfo.getExtras().putInt(str, num2.intValue());
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(str, androidComposeViewAccessibilityDelegateCompat.getEXTRA_DATA_TEST_TRAVERSALAFTER_VAL()) || (num = androidComposeViewAccessibilityDelegateCompat.getIdToAfterMap$ui_release().get(Integer.valueOf(i10))) == null) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, num.intValue());
    }

    public static void b(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).onEndApplyChanges();
            } else if (childAt instanceof ViewGroup) {
                b((ViewGroup) childAt);
            }
        }
    }

    public static long c(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            return k(0, size);
        }
        if (mode == 0) {
            return k(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return k(size, size);
        }
        throw new IllegalStateException();
    }

    public static View d(int i10, View view) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
        declaredMethod.setAccessible(true);
        if (Intrinsics.areEqual(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i10))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            Intrinsics.checkNotNullExpressionValue(childAt, "currentView.getChildAt(i)");
            View viewD = d(i10, childAt);
            if (viewD != null) {
                return viewD;
            }
        }
        return null;
    }

    public static void f(LayoutNode layoutNode) {
        layoutNode.invalidateLayers$ui_release();
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                f(content[i10]);
                i10++;
            } while (i10 < size);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final ViewTreeOwners get_viewTreeOwners() {
        return (ViewTreeOwners) this._viewTreeOwners.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Code duplicated, block: B:37:0x007f  */
    public static boolean h(MotionEvent motionEvent) {
        boolean z10;
        float x4 = motionEvent.getX();
        if (Float.isInfinite(x4) || Float.isNaN(x4)) {
            z10 = true;
        } else {
            float y7 = motionEvent.getY();
            if (Float.isInfinite(y7) || Float.isNaN(y7)) {
                z10 = true;
            } else {
                float rawX = motionEvent.getRawX();
                if (Float.isInfinite(rawX) || Float.isNaN(rawX)) {
                    z10 = true;
                } else {
                    float rawY = motionEvent.getRawY();
                    if (Float.isInfinite(rawY) || Float.isNaN(rawY)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
        }
        if (!z10) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i10 = 1; i10 < pointerCount; i10++) {
                float x6 = motionEvent.getX(i10);
                if (Float.isInfinite(x6) || Float.isNaN(x6)) {
                    z10 = true;
                } else {
                    float y10 = motionEvent.getY(i10);
                    if (Float.isInfinite(y10) || Float.isNaN(y10) || (Build.VERSION.SDK_INT >= 29 && !r0.f17439a.a(motionEvent, i10))) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    break;
                }
            }
        }
        return z10;
    }

    public static long k(int i10, int i11) {
        return ULong.m5595constructorimpl(ULong.m5595constructorimpl(i11) | ULong.m5595constructorimpl(ULong.m5595constructorimpl(i10) << 32));
    }

    private void setFontFamilyResolver(FontFamily.Resolver resolver) {
        this.fontFamilyResolver.setValue(resolver);
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        this.layoutDirection.setValue(layoutDirection);
    }

    private final void set_viewTreeOwners(ViewTreeOwners viewTreeOwners) {
        this._viewTreeOwners.setValue(viewTreeOwners);
    }

    public final void addAndroidView(@NotNull AndroidViewHolder view, @NotNull final LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(view, layoutNode);
        getAndroidViewsHandler$ui_release().addView(view);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode, view);
        ViewCompat.setImportantForAccessibility(view, 1);
        ViewCompat.setAccessibilityDelegate(view, new AccessibilityDelegateCompat() { // from class: androidx.compose.ui.platform.AndroidComposeView.addAndroidView.1

            /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$a */
            /* JADX INFO: compiled from: AndroidComposeView.android.kt */
            @SourceDebugExtension({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,2051:1\n76#2:2052\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1\n*L\n761#1:2052\n*E\n"})
            public static final class a extends Lambda implements Function1<LayoutNode, Boolean> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public static final a f17026p0 = new a(1);

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(LayoutNode layoutNode) {
                    LayoutNode it = layoutNode;
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(it.getNodes().m3698hasH91voCI$ui_release(NodeKind.m3725constructorimpl(8)));
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0037  */
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(@NotNull View host, @NotNull AccessibilityNodeInfoCompat info) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                a aVar = a.f17026p0;
                LayoutNode layoutNode2 = layoutNode;
                LayoutNode layoutNodeFindClosestParentNode = SemanticsNodeKt.findClosestParentNode(layoutNode2, aVar);
                Integer numValueOf = layoutNodeFindClosestParentNode != null ? Integer.valueOf(layoutNodeFindClosestParentNode.getSemanticsId()) : null;
                AndroidComposeView androidComposeView = this;
                if (numValueOf != null) {
                    if (numValueOf.intValue() == androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
                        numValueOf = -1;
                    }
                } else {
                    numValueOf = -1;
                }
                int iIntValue = numValueOf.intValue();
                AndroidComposeView androidComposeView2 = this;
                info.setParent(androidComposeView2, iIntValue);
                int semanticsId = layoutNode2.getSemanticsId();
                Integer num = androidComposeView.G0.getIdToBeforeMap$ui_release().get(Integer.valueOf(semanticsId));
                if (num != null) {
                    int iIntValue2 = num.intValue();
                    View viewSemanticsIdToView = AndroidComposeViewAccessibilityDelegateCompat_androidKt.semanticsIdToView(androidComposeView.getAndroidViewsHandler$ui_release(), num.intValue());
                    if (viewSemanticsIdToView != null) {
                        info.setTraversalBefore(viewSemanticsIdToView);
                    } else {
                        info.setTraversalBefore(androidComposeView2, iIntValue2);
                    }
                    AccessibilityNodeInfo accessibilityNodeInfoUnwrap = info.unwrap();
                    Intrinsics.checkNotNullExpressionValue(accessibilityNodeInfoUnwrap, "info.unwrap()");
                    AndroidComposeView.access$addExtraDataToAccessibilityNodeInfoHelper(androidComposeView, semanticsId, accessibilityNodeInfoUnwrap, androidComposeView.G0.getEXTRA_DATA_TEST_TRAVERSALBEFORE_VAL());
                }
                Integer num2 = androidComposeView.G0.getIdToAfterMap$ui_release().get(Integer.valueOf(semanticsId));
                if (num2 != null) {
                    int iIntValue3 = num2.intValue();
                    View viewSemanticsIdToView2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.semanticsIdToView(androidComposeView.getAndroidViewsHandler$ui_release(), num2.intValue());
                    if (viewSemanticsIdToView2 != null) {
                        info.setTraversalAfter(viewSemanticsIdToView2);
                    } else {
                        info.setTraversalAfter(androidComposeView2, iIntValue3);
                    }
                    AccessibilityNodeInfo accessibilityNodeInfoUnwrap2 = info.unwrap();
                    Intrinsics.checkNotNullExpressionValue(accessibilityNodeInfoUnwrap2, "info.unwrap()");
                    AndroidComposeView.access$addExtraDataToAccessibilityNodeInfoHelper(androidComposeView, semanticsId, accessibilityNodeInfoUnwrap2, androidComposeView.G0.getEXTRA_DATA_TEST_TRAVERSALAFTER_VAL());
                }
            }
        });
    }

    @Override // android.view.View
    public void autofill(@NotNull SparseArray<AutofillValue> values) {
        AndroidAutofill androidAutofill;
        Intrinsics.checkNotNullParameter(values, "values");
        if (!a() || (androidAutofill = this.O0) == null) {
            return;
        }
        AndroidAutofill_androidKt.performAutofill(androidAutofill, values);
    }

    @Nullable
    public final Object boundsUpdatesEventLoop(@NotNull Continuation<? super Unit> continuation) {
        Object objBoundsUpdatesEventLoop = this.G0.boundsUpdatesEventLoop(continuation);
        return objBoundsUpdatesEventLoop == ek.a.getCOROUTINE_SUSPENDED() ? objBoundsUpdatesEventLoop : Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.node.Owner
    /* JADX INFO: renamed from: calculateLocalPosition-MK-Hz9U */
    public long mo3777calculateLocalPositionMKHz9U(long positionInWindow) {
        l();
        return Matrix.m2706mapMKHz9U(this.f16989d1, positionInWindow);
    }

    @Override // androidx.compose.ui.node.Owner
    /* JADX INFO: renamed from: calculatePositionInWindow-MK-Hz9U */
    public long mo3778calculatePositionInWindowMKHz9U(long localPosition) {
        l();
        return Matrix.m2706mapMKHz9U(this.f16988c1, localPosition);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int direction) {
        return this.G0.m3782canScroll0AR0LA0$ui_release(false, direction, this.f17001p0);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int direction) {
        return this.G0.m3782canScroll0AR0LA0$ui_release(true, direction, this.f17001p0);
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public OwnedLayer createLayer(@NotNull Function1<? super Canvas, Unit> drawBlock, @NotNull Function0<Unit> invalidateParentLayer) {
        DrawChildContainer viewLayerContainer;
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Intrinsics.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        OwnedLayer ownedLayerPop = this.B1.pop();
        if (ownedLayerPop != null) {
            ownedLayerPop.reuseLayer(drawBlock, invalidateParentLayer);
            return ownedLayerPop;
        }
        if (isHardwareAccelerated() && this.f16993h1) {
            try {
                return new RenderNodeLayer(this, drawBlock, invalidateParentLayer);
            } catch (Throwable unused) {
                this.f16993h1 = false;
            }
        }
        if (this.V0 == null) {
            ViewLayer.Companion companion = ViewLayer.INSTANCE;
            if (!companion.getHasRetrievedMethod()) {
                companion.updateDisplayList(new View(getContext()));
            }
            if (companion.getShouldUseDispatchDraw()) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                viewLayerContainer = new DrawChildContainer(context);
            } else {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "context");
                viewLayerContainer = new ViewLayerContainer(context2);
            }
            this.V0 = viewLayerContainer;
            addView(viewLayerContainer);
        }
        DrawChildContainer drawChildContainer = this.V0;
        Intrinsics.checkNotNull(drawChildContainer);
        return new ViewLayer(this, drawChildContainer, drawBlock, invalidateParentLayer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!isAttachedToWindow()) {
            f(getRoot());
        }
        i1.m.f(this, false, 1, null);
        this.K0 = true;
        CanvasHolder canvasHolder = this.f17015x0;
        android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
        getRoot().draw$ui_release(canvasHolder.getAndroidCanvas());
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        ArrayList arrayList = this.I0;
        if (true ^ arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((OwnedLayer) arrayList.get(i10)).updateDisplayList();
            }
        }
        if (ViewLayer.INSTANCE.getShouldUseDispatchDraw()) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        arrayList.clear();
        this.K0 = false;
        ArrayList arrayList2 = this.J0;
        if (arrayList2 != null) {
            Intrinsics.checkNotNull(arrayList2);
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(event);
        }
        if (!event.isFromSource(4194304)) {
            return (h(event) || !isAttachedToWindow()) ? super.dispatchGenericMotionEvent(event) : ProcessResult.m3548getDispatchedToAPointerInputModifierimpl(e(event));
        }
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        float f6 = -event.getAxisValue(26);
        return getFocusOwner().dispatchRotaryEvent(new RotaryScrollEvent(ViewConfigurationCompat.getScaledVerticalScrollFactor(viewConfiguration, getContext()) * f6, ViewConfigurationCompat.getScaledHorizontalScrollFactor(viewConfiguration, getContext()) * f6, event.getEventTime()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z10 = this.F1;
        androidx.appcompat.app.f fVar = this.E1;
        if (z10) {
            removeCallbacks(fVar);
            fVar.run();
        }
        if (h(event) || !isAttachedToWindow()) {
            return false;
        }
        this.G0.dispatchHoverEvent(event);
        int actionMasked = event.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && i(event)) {
                if (event.getToolType(0) != 3) {
                    MotionEvent motionEvent = this.f17019z1;
                    if (motionEvent != null) {
                        motionEvent.recycle();
                    }
                    this.f17019z1 = MotionEvent.obtainNoHistory(event);
                    this.F1 = true;
                    post(fVar);
                    return false;
                }
                if (event.getButtonState() != 0) {
                    return false;
                }
            }
        } else if (!j(event)) {
            return false;
        }
        return ProcessResult.m3548getDispatchedToAPointerInputModifierimpl(e(event));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@NotNull android.view.KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!isFocused()) {
            return super.dispatchKeyEvent(event);
        }
        this.f17010u0.m3816setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m3524constructorimpl(event.getMetaState()));
        return getFocusOwner().mo2229dispatchKeyEventZmokQxo(KeyEvent.m3350constructorimpl(event)) || super.dispatchKeyEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(@NotNull android.view.KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return (isFocused() && getFocusOwner().mo2228dispatchInterceptedSoftKeyboardEventZmokQxo(KeyEvent.m3350constructorimpl(event))) || super.dispatchKeyEventPreIme(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if (this.F1) {
            androidx.appcompat.app.f fVar = this.E1;
            removeCallbacks(fVar);
            MotionEvent motionEvent2 = this.f17019z1;
            Intrinsics.checkNotNull(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.F1 = false;
            } else {
                fVar.run();
            }
        }
        if (h(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !j(motionEvent)) {
            return false;
        }
        int iE = e(motionEvent);
        if (ProcessResult.m3547getAnyMovementConsumedimpl(iE)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return ProcessResult.m3548getDispatchedToAPointerInputModifierimpl(iE);
    }

    public final void drawAndroidView(@NotNull AndroidViewHolder view, @NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        getAndroidViewsHandler$ui_release().drawView(view, canvas);
    }

    public final int e(MotionEvent motionEvent) {
        int actionMasked;
        float[] fArr = this.f16988c1;
        removeCallbacks(this.D1);
        try {
            this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
            this.H1.a(this, fArr);
            InvertMatrixKt.m3804invertToJiSxe2E(fArr, this.f16989d1);
            long jM2706mapMKHz9U = Matrix.m2706mapMKHz9U(fArr, OffsetKt.Offset(motionEvent.getX(), motionEvent.getY()));
            this.f16992g1 = OffsetKt.Offset(motionEvent.getRawX() - Offset.m2275getXimpl(jM2706mapMKHz9U), motionEvent.getRawY() - Offset.m2276getYimpl(jM2706mapMKHz9U));
            boolean z10 = true;
            this.f16991f1 = true;
            measureAndLayout(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.f17019z1;
                boolean z11 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                if (motionEvent2 != null && (motionEvent2.getSource() != motionEvent.getSource() || motionEvent2.getToolType(0) != motionEvent.getToolType(0))) {
                    if (motionEvent2.getButtonState() != 0 || (actionMasked = motionEvent2.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                        this.M0.processCancel();
                    } else if (motionEvent2.getActionMasked() != 10 && z11) {
                        o(motionEvent2, 10, motionEvent2.getEventTime(), true);
                    }
                }
                if (motionEvent.getToolType(0) != 3) {
                    z10 = false;
                }
                if (!z11 && z10 && actionMasked2 != 3 && actionMasked2 != 9 && i(motionEvent)) {
                    o(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.f17019z1 = MotionEvent.obtainNoHistory(motionEvent);
                int iN = n(motionEvent);
                Trace.endSection();
                this.f16991f1 = false;
                return iN;
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f16991f1 = false;
            throw th3;
        }
    }

    @Nullable
    public final View findViewByAccessibilityIdTraversal(int accessibilityId) throws IllegalAccessException, InvocationTargetException {
        View viewD = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(accessibilityId));
                if (objInvoke instanceof View) {
                    viewD = (View) objInvoke;
                }
            } else {
                viewD = d(accessibilityId, this);
            }
        } catch (NoSuchMethodException unused) {
        }
        return viewD;
    }

    @Override // androidx.compose.ui.node.Owner
    public void forceMeasureTheSubtree(@NotNull LayoutNode layoutNode, boolean affectsLookahead) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.Y0.forceMeasureTheSubtree(layoutNode, affectsLookahead);
    }

    public final void g(LayoutNode layoutNode) {
        int i10 = 0;
        MeasureAndLayoutDelegate.requestRemeasure$default(this.Y0, layoutNode, false, 2, null);
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            do {
                g(content[i10]);
                i10++;
            } while (i10 < size);
        }
    }

    @NotNull
    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if (this.U0 == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(context);
            this.U0 = androidViewsHandler;
            addView(androidViewsHandler);
        }
        AndroidViewsHandler androidViewsHandler2 = this.U0;
        Intrinsics.checkNotNull(androidViewsHandler2);
        return androidViewsHandler2;
    }

    @Override // androidx.compose.ui.node.Owner
    @Nullable
    public Autofill getAutofill() {
        return this.O0;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    @NotNull
    public final Function1<Configuration, Unit> getConfigurationChangeObserver() {
        return this.configurationChangeObserver;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    @NotNull
    public Density getDensity() {
        return this.density;
    }

    @Override // androidx.compose.ui.node.Owner
    @Nullable
    /* JADX INFO: renamed from: getFocusDirection-P8AzH3I */
    public FocusDirection mo3779getFocusDirectionP8AzH3I(@NotNull android.view.KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        long jM3366getKeyZmokQxo = KeyEvent_androidKt.m3366getKeyZmokQxo(keyEvent);
        Key.Companion companion = Key.INSTANCE;
        if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo, companion.m3294getTabEK5gGoQ())) {
            return FocusDirection.m2206boximpl(KeyEvent_androidKt.m3372isShiftPressedZmokQxo(keyEvent) ? FocusDirection.INSTANCE.m2224getPreviousdhqQ8s() : FocusDirection.INSTANCE.m2222getNextdhqQ8s());
        }
        if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo, companion.m3135getDirectionRightEK5gGoQ())) {
            return FocusDirection.m2206boximpl(FocusDirection.INSTANCE.m2225getRightdhqQ8s());
        }
        if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo, companion.m3134getDirectionLeftEK5gGoQ())) {
            return FocusDirection.m2206boximpl(FocusDirection.INSTANCE.m2221getLeftdhqQ8s());
        }
        if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo, companion.m3136getDirectionUpEK5gGoQ())) {
            return FocusDirection.m2206boximpl(FocusDirection.INSTANCE.m2226getUpdhqQ8s());
        }
        if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo, companion.m3131getDirectionDownEK5gGoQ())) {
            return FocusDirection.m2206boximpl(FocusDirection.INSTANCE.m2217getDowndhqQ8s());
        }
        if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo, companion.m3130getDirectionCenterEK5gGoQ()) || Key.m3058equalsimpl0(jM3366getKeyZmokQxo, companion.m3144getEnterEK5gGoQ()) || Key.m3058equalsimpl0(jM3366getKeyZmokQxo, companion.m3236getNumPadEnterEK5gGoQ())) {
            return FocusDirection.m2206boximpl(FocusDirection.INSTANCE.m2218getEnterdhqQ8s());
        }
        if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo, companion.m3073getBackEK5gGoQ()) || Key.m3058equalsimpl0(jM3366getKeyZmokQxo, companion.m3147getEscapeEK5gGoQ())) {
            return FocusDirection.m2206boximpl(FocusDirection.INSTANCE.m2219getExitdhqQ8s());
        }
        return null;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public FocusOwner getFocusOwner() {
        return this.f17008t0;
    }

    @Override // android.view.View
    public void getFocusedRect(@NotNull Rect rect) {
        Unit unit;
        Intrinsics.checkNotNullParameter(rect, "rect");
        androidx.compose.ui.geometry.Rect focusRect = getFocusOwner().getFocusRect();
        if (focusRect != null) {
            rect.left = mk.c.roundToInt(focusRect.getLeft());
            rect.top = mk.c.roundToInt(focusRect.getTop());
            rect.right = mk.c.roundToInt(focusRect.getRight());
            rect.bottom = mk.c.roundToInt(focusRect.getBottom());
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public FontFamily.Resolver getFontFamilyResolver() {
        return (FontFamily.Resolver) this.fontFamilyResolver.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public Font.ResourceLoader getFontLoader() {
        return this.f17004q1;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public HapticFeedback getHapticFeedBack() {
        return this.f17011u1;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public boolean getHasPendingMeasureOrLayout() {
        return this.Y0.getHasPendingMeasureOrLayout();
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public InputModeManager getInputModeManager() {
        return this.f17012v1;
    }

    /* JADX INFO: renamed from: getLastMatrixRecalculationAnimationTime$ui_release, reason: from getter */
    public final long getLastMatrixRecalculationAnimationTime() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View, android.view.ViewParent, androidx.compose.ui.node.Owner
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) this.layoutDirection.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public long getMeasureIteration() {
        return this.Y0.getMeasureIteration();
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public ModifierLocalManager getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public PointerIconService getPointerIconService() {
        return this.J1;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public LayoutNode getRoot() {
        return this.root;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public RootForTest getRootForTest() {
        return this.E0;
    }

    @Override // androidx.compose.ui.node.RootForTest
    @NotNull
    public SemanticsOwner getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public LayoutNodeDrawScope getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // androidx.compose.ui.node.Owner
    public boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    @NotNull
    public TextInputService getTextInputService() {
        return this.textInputService;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public TextToolbar getTextToolbar() {
        return this.f17016x1;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public ViewConfiguration getViewConfiguration() {
        return this.Z0;
    }

    @Nullable
    public final ViewTreeOwners getViewTreeOwners() {
        return (ViewTreeOwners) this.viewTreeOwners.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public WindowInfo getWindowInfo() {
        return this.f17010u0;
    }

    public final boolean i(MotionEvent motionEvent) {
        float x4 = motionEvent.getX();
        float y7 = motionEvent.getY();
        return 0.0f <= x4 && x4 <= ((float) getWidth()) && 0.0f <= y7 && y7 <= ((float) getHeight());
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public void invalidateDescendants() {
        f(getRoot());
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public boolean isLifecycleInResumedState() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        return ((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.getF21906d()) == Lifecycle.State.RESUMED;
    }

    public final boolean j(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f17019z1) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final void l() {
        if (this.f16991f1) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = jCurrentAnimationTimeMillis;
            j0 j0Var = this.H1;
            float[] fArr = this.f16988c1;
            j0Var.a(this, fArr);
            InvertMatrixKt.m3804invertToJiSxe2E(fArr, this.f16989d1);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f16987b1;
            view.getLocationOnScreen(iArr);
            float f6 = iArr[0];
            float f10 = iArr[1];
            view.getLocationInWindow(iArr);
            this.f16992g1 = OffsetKt.Offset(f6 - iArr[0], f10 - iArr[1]);
        }
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* JADX INFO: renamed from: localToScreen-MK-Hz9U */
    public long mo3541localToScreenMKHz9U(long localPosition) {
        l();
        long jM2706mapMKHz9U = Matrix.m2706mapMKHz9U(this.f16988c1, localPosition);
        return OffsetKt.Offset(Offset.m2275getXimpl(this.f16992g1) + Offset.m2275getXimpl(jM2706mapMKHz9U), Offset.m2276getYimpl(this.f16992g1) + Offset.m2276getYimpl(jM2706mapMKHz9U));
    }

    public final void m(LayoutNode layoutNode) {
        LayoutNode parent$ui_release;
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (layoutNode != null) {
            while (layoutNode != null && layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock && (this.X0 || ((parent$ui_release = layoutNode.getParent$ui_release()) != null && !parent$ui_release.getHasFixedInnerContentConstraints$ui_release()))) {
                layoutNode = layoutNode.getParent$ui_release();
            }
            if (layoutNode == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void measureAndLayout(boolean sendPointerUpdate) {
        g gVar;
        MeasureAndLayoutDelegate measureAndLayoutDelegate = this.Y0;
        if (measureAndLayoutDelegate.getHasPendingMeasureOrLayout() || measureAndLayoutDelegate.getHasPendingOnPositionedCallbacks()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (sendPointerUpdate) {
                try {
                    gVar = this.G1;
                } finally {
                    Trace.endSection();
                }
            } else {
                gVar = null;
            }
            if (measureAndLayoutDelegate.measureAndLayout(gVar)) {
                requestLayout();
            }
            MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(measureAndLayoutDelegate, false, 1, null);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.ui.node.Owner
    /* JADX INFO: renamed from: measureAndLayout-0kLqBqw */
    public void mo3780measureAndLayout0kLqBqw(@NotNull LayoutNode layoutNode, long constraints) {
        MeasureAndLayoutDelegate measureAndLayoutDelegate = this.Y0;
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            measureAndLayoutDelegate.m3694measureAndLayout0kLqBqw(layoutNode, constraints);
            if (!measureAndLayoutDelegate.getHasPendingMeasureOrLayout()) {
                MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(measureAndLayoutDelegate, false, 1, null);
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.node.RootForTest
    public void measureAndLayoutForTest() {
        i1.m.f(this, false, 1, null);
    }

    public final int n(MotionEvent motionEvent) {
        PointerInputEventData pointerInputEventData;
        if (this.I1) {
            this.I1 = false;
            this.f17010u0.m3816setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m3524constructorimpl(motionEvent.getMetaState()));
        }
        MotionEventAdapter motionEventAdapter = this.L0;
        PointerInputEvent pointerInputEventConvertToPointerInputEvent$ui_release = motionEventAdapter.convertToPointerInputEvent$ui_release(motionEvent, this);
        PointerInputEventProcessor pointerInputEventProcessor = this.M0;
        if (pointerInputEventConvertToPointerInputEvent$ui_release == null) {
            pointerInputEventProcessor.processCancel();
            return PointerInputEventProcessorKt.ProcessResult(false, false);
        }
        List<PointerInputEventData> pointers = pointerInputEventConvertToPointerInputEvent$ui_release.getPointers();
        int size = pointers.size() - 1;
        if (size < 0) {
            pointerInputEventData = null;
            break;
        }
        while (true) {
            int i10 = size - 1;
            pointerInputEventData = pointers.get(size);
            if (pointerInputEventData.getDown()) {
                break;
            }
            if (i10 < 0) {
                pointerInputEventData = null;
                break;
            }
            size = i10;
        }
        PointerInputEventData pointerInputEventData2 = pointerInputEventData;
        if (pointerInputEventData2 != null) {
            this.f17001p0 = pointerInputEventData2.m3490getPositionF1C5BW0();
        }
        int iM3495processBIzXfog = pointerInputEventProcessor.m3495processBIzXfog(pointerInputEventConvertToPointerInputEvent$ui_release, this, i(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || ProcessResult.m3548getDispatchedToAPointerInputModifierimpl(iM3495processBIzXfog)) {
            return iM3495processBIzXfog;
        }
        motionEventAdapter.endStream(motionEvent.getPointerId(motionEvent.getActionIndex()));
        return iM3495processBIzXfog;
    }

    public final void notifyLayerIsDirty$ui_release(@NotNull OwnedLayer layer, boolean isDirty) {
        Intrinsics.checkNotNullParameter(layer, "layer");
        ArrayList arrayList = this.I0;
        if (!isDirty) {
            if (this.K0) {
                return;
            }
            arrayList.remove(layer);
            ArrayList arrayList2 = this.J0;
            if (arrayList2 != null) {
                arrayList2.remove(layer);
                return;
            }
            return;
        }
        if (!this.K0) {
            arrayList.add(layer);
            return;
        }
        ArrayList arrayList3 = this.J0;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.J0 = arrayList3;
        }
        arrayList3.add(layer);
    }

    public final void o(MotionEvent motionEvent, int i10, long j10, boolean z10) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i10 != 9 && i10 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i11 = 0; i11 < pointerCount; i11++) {
            pointerPropertiesArr[i11] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i12 = 0; i12 < pointerCount; i12++) {
            pointerCoordsArr[i12] = new MotionEvent.PointerCoords();
        }
        int i13 = 0;
        while (i13 < pointerCount) {
            int i14 = ((actionIndex < 0 || i13 < actionIndex) ? 0 : 1) + i13;
            motionEvent.getPointerProperties(i14, pointerPropertiesArr[i13]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i13];
            motionEvent.getPointerCoords(i14, pointerCoords);
            long jMo3541localToScreenMKHz9U = mo3541localToScreenMKHz9U(OffsetKt.Offset(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = Offset.m2275getXimpl(jMo3541localToScreenMKHz9U);
            pointerCoords.y = Offset.m2276getYimpl(jMo3541localToScreenMKHz9U);
            i13++;
        }
        MotionEvent event = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j10 : motionEvent.getDownTime(), j10, i10, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z10 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        Intrinsics.checkNotNullExpressionValue(event, "event");
        PointerInputEvent pointerInputEventConvertToPointerInputEvent$ui_release = this.L0.convertToPointerInputEvent$ui_release(event, this);
        Intrinsics.checkNotNull(pointerInputEventConvertToPointerInputEvent$ui_release);
        this.M0.m3495processBIzXfog(pointerInputEventConvertToPointerInputEvent$ui_release, this, true);
        event.recycle();
    }

    @Override // androidx.compose.ui.node.Owner
    public void onAttach(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        AndroidAutofill androidAutofill;
        super.onAttachedToWindow();
        g(getRoot());
        f(getRoot());
        getSnapshotObserver().startObserving$ui_release();
        if (a() && (androidAutofill = this.O0) != null) {
            AutofillCallback.INSTANCE.register(androidAutofill);
        }
        LifecycleOwner lifecycleOwner2 = ViewTreeLifecycleOwner.get(this);
        SavedStateRegistryOwner savedStateRegistryOwner = ViewTreeSavedStateRegistryOwner.get(this);
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (lifecycleOwner2 != null && savedStateRegistryOwner != null && (lifecycleOwner2 != viewTreeOwners.getLifecycleOwner() || savedStateRegistryOwner != viewTreeOwners.getLifecycleOwner()))) {
            if (lifecycleOwner2 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (savedStateRegistryOwner == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.removeObserver(this);
            }
            lifecycleOwner2.getLifecycle().addObserver(this);
            ViewTreeOwners viewTreeOwners2 = new ViewTreeOwners(lifecycleOwner2, savedStateRegistryOwner);
            set_viewTreeOwners(viewTreeOwners2);
            Function1<? super ViewTreeOwners, Unit> function1 = this.f16996k1;
            if (function1 != null) {
                function1.invoke(viewTreeOwners2);
            }
            this.f16996k1 = null;
        }
        this.f17012v1.m3054setInputModeiuPiT84(isInTouchMode() ? InputMode.INSTANCE.m3051getTouchaOaMEAU() : InputMode.INSTANCE.m3050getKeyboardaOaMEAU());
        ViewTreeOwners viewTreeOwners3 = getViewTreeOwners();
        Intrinsics.checkNotNull(viewTreeOwners3);
        viewTreeOwners3.getLifecycleOwner().getLifecycle().addObserver(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f16997l1);
        getViewTreeObserver().addOnScrollChangedListener(this.f16998m1);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f16999n1);
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        return getPlatformTextInputPluginRegistry().getFocusedAdapter() != null;
    }

    @Override // android.view.View
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.density = AndroidDensity_androidKt.Density(context);
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 >= 31 ? newConfig.fontWeightAdjustment : 0) != this.f17007s1) {
            this.f17007s1 = i10 >= 31 ? newConfig.fontWeightAdjustment : 0;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            setFontFamilyResolver(FontFamilyResolver_androidKt.createFontFamilyResolver(context2));
        }
        this.configurationChangeObserver.invoke(newConfig);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.a(this, lifecycleOwner);
    }

    @Override // android.view.View
    @Nullable
    public InputConnection onCreateInputConnection(@NotNull EditorInfo outAttrs) {
        Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
        PlatformTextInputAdapter focusedAdapter = getPlatformTextInputPluginRegistry().getFocusedAdapter();
        if (focusedAdapter != null) {
            return focusedAdapter.createInputConnection(outAttrs);
        }
        return null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.b(this, lifecycleOwner);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onDetach(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.Y0.onNodeDetached(node);
        requestClearInvalidObservations();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        AndroidAutofill androidAutofill;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        super.onDetachedFromWindow();
        getSnapshotObserver().stopObserving$ui_release();
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        if (a() && (androidAutofill = this.O0) != null) {
            AutofillCallback.INSTANCE.unregister(androidAutofill);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f16997l1);
        getViewTreeObserver().removeOnScrollChangedListener(this.f16998m1);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f16999n1);
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
    }

    @Override // androidx.compose.ui.node.Owner
    public void onEndApplyChanges() {
        if (this.P0) {
            getSnapshotObserver().clearInvalidObservations$ui_release();
            this.P0 = false;
        }
        AndroidViewsHandler androidViewsHandler = this.U0;
        if (androidViewsHandler != null) {
            b(androidViewsHandler);
        }
        while (true) {
            MutableVector<Function0<Unit>> mutableVector = this.C1;
            if (!mutableVector.isNotEmpty()) {
                return;
            }
            int size = mutableVector.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                Function0<Unit> function0 = mutableVector.getContent()[i10];
                mutableVector.set(i10, null);
                if (function0 != null) {
                    function0.invoke();
                }
            }
            mutableVector.removeRange(0, size);
        }
    }

    @Override // android.view.View
    public void onFocusChanged(boolean gainFocus, int direction, @Nullable Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        if (gainFocus) {
            getFocusOwner().takeFocus();
        } else {
            getFocusOwner().releaseFocus();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l6, int t10, int r3, int b10) {
        this.Y0.measureAndLayout(this.G1);
        this.W0 = null;
        p();
        if (this.U0 != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, r3 - l6, b10 - t10);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onLayoutChange(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.G0.onLayoutChange$ui_release(layoutNode);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        MeasureAndLayoutDelegate measureAndLayoutDelegate = this.Y0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                g(getRoot());
            }
            long jC = c(widthMeasureSpec);
            int iM5595constructorimpl = (int) ULong.m5595constructorimpl(jC >>> 32);
            int iM5595constructorimpl2 = (int) ULong.m5595constructorimpl(jC & 4294967295L);
            long jC2 = c(heightMeasureSpec);
            long jConstraints = ConstraintsKt.Constraints(iM5595constructorimpl, iM5595constructorimpl2, (int) ULong.m5595constructorimpl(jC2 >>> 32), (int) ULong.m5595constructorimpl(4294967295L & jC2));
            Constraints constraints = this.W0;
            if (constraints == null) {
                this.W0 = Constraints.m4346boximpl(jConstraints);
                this.X0 = false;
            } else if (!Constraints.m4351equalsimpl0(constraints.getF18296a(), jConstraints)) {
                this.X0 = true;
            }
            measureAndLayoutDelegate.m3695updateRootConstraintsBRTryo0(jConstraints);
            measureAndLayoutDelegate.measureOnly();
            setMeasuredDimension(getRoot().getWidth(), getRoot().getHeight());
            if (this.U0 != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().getHeight(), 1073741824));
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.c(this, lifecycleOwner);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(@Nullable ViewStructure structure, int flags) {
        AndroidAutofill androidAutofill;
        if (!a() || structure == null || (androidAutofill = this.O0) == null) {
            return;
        }
        AndroidAutofill_androidKt.populateViewStructure(androidAutofill, structure);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onRequestMeasure(@NotNull LayoutNode layoutNode, boolean affectsLookahead, boolean forceRequest, boolean scheduleMeasureAndLayout) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        MeasureAndLayoutDelegate measureAndLayoutDelegate = this.Y0;
        if (affectsLookahead) {
            if (measureAndLayoutDelegate.requestLookaheadRemeasure(layoutNode, forceRequest) && scheduleMeasureAndLayout) {
                m(layoutNode);
                return;
            }
            return;
        }
        if (measureAndLayoutDelegate.requestRemeasure(layoutNode, forceRequest) && scheduleMeasureAndLayout) {
            m(layoutNode);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onRequestRelayout(@NotNull LayoutNode layoutNode, boolean affectsLookahead, boolean forceRequest) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        MeasureAndLayoutDelegate measureAndLayoutDelegate = this.Y0;
        if (affectsLookahead) {
            if (measureAndLayoutDelegate.requestLookaheadRelayout(layoutNode, forceRequest)) {
                m(null);
            }
        } else if (measureAndLayoutDelegate.requestRelayout(layoutNode, forceRequest)) {
            m(null);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        setShowLayoutBounds(Companion.access$getIsShowingLayoutBounds(INSTANCE));
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        if (this.f17003q0) {
            LayoutDirection layoutDirectionAccess$layoutDirectionFromInt = AndroidComposeView_androidKt.access$layoutDirectionFromInt(layoutDirection);
            setLayoutDirection(layoutDirectionAccess$layoutDirectionFromInt);
            getFocusOwner().setLayoutDirection(layoutDirectionAccess$layoutDirectionFromInt);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onSemanticsChange() {
        this.G0.onSemanticsChange$ui_release();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.e(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.f(this, lifecycleOwner);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        boolean zAccess$getIsShowingLayoutBounds;
        this.f17010u0.setWindowFocused(hasWindowFocus);
        this.I1 = true;
        super.onWindowFocusChanged(hasWindowFocus);
        if (!hasWindowFocus || getShowLayoutBounds() == (zAccess$getIsShowingLayoutBounds = Companion.access$getIsShowingLayoutBounds(INSTANCE))) {
            return;
        }
        setShowLayoutBounds(zAccess$getIsShowingLayoutBounds);
        invalidateDescendants();
    }

    public final void p() {
        int[] iArr = this.f16987b1;
        getLocationOnScreen(iArr);
        long j10 = this.f16986a1;
        int iM4499component1impl = IntOffset.m4499component1impl(j10);
        int iM4500component2impl = IntOffset.m4500component2impl(j10);
        boolean z10 = false;
        int i10 = iArr[0];
        if (iM4499component1impl != i10 || iM4500component2impl != iArr[1]) {
            this.f16986a1 = IntOffsetKt.IntOffset(i10, iArr[1]);
            if (iM4499component1impl != Integer.MAX_VALUE && iM4500component2impl != Integer.MAX_VALUE) {
                getRoot().getLayoutDelegate().getMeasurePassDelegate().notifyChildrenUsingCoordinatesWhilePlacing();
                z10 = true;
            }
        }
        this.Y0.dispatchOnPositionedCallbacks(z10);
    }

    public final boolean recycle$ui_release(@NotNull OwnedLayer layer) {
        Intrinsics.checkNotNullParameter(layer, "layer");
        if (this.V0 != null) {
            ViewLayer.INSTANCE.getShouldUseDispatchDraw();
        }
        this.B1.push(layer);
        return true;
    }

    @Override // androidx.compose.ui.node.Owner
    public void registerOnEndApplyChangesListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        MutableVector<Function0<Unit>> mutableVector = this.C1;
        if (mutableVector.contains(listener)) {
            return;
        }
        mutableVector.add(listener);
    }

    @Override // androidx.compose.ui.node.Owner
    public void registerOnLayoutCompletedListener(@NotNull Owner.OnLayoutCompletedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.Y0.registerOnLayoutCompletedListener(listener);
        m(null);
    }

    public final void removeAndroidView(@NotNull AndroidViewHolder view) {
        Intrinsics.checkNotNullParameter(view, "view");
        registerOnEndApplyChangesListener(new f(view));
    }

    public final void requestClearInvalidObservations() {
        this.P0 = true;
    }

    @Override // androidx.compose.ui.node.Owner
    public void requestOnPositionedCallback(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.Y0.requestOnPositionedCallback(layoutNode);
        m(null);
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* JADX INFO: renamed from: screenToLocal-MK-Hz9U */
    public long mo3542screenToLocalMKHz9U(long positionOnScreen) {
        l();
        return Matrix.m2706mapMKHz9U(this.f16989d1, OffsetKt.Offset(Offset.m2275getXimpl(positionOnScreen) - Offset.m2275getXimpl(this.f16992g1), Offset.m2276getYimpl(positionOnScreen) - Offset.m2276getYimpl(this.f16992g1)));
    }

    @Override // androidx.compose.ui.node.RootForTest
    /* JADX INFO: renamed from: sendKeyEvent-ZmokQxo */
    public boolean mo3781sendKeyEventZmokQxo(@NotNull android.view.KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        return getFocusOwner().mo2228dispatchInterceptedSoftKeyboardEventZmokQxo(keyEvent) || getFocusOwner().mo2229dispatchKeyEventZmokQxo(keyEvent);
    }

    public final void setConfigurationChangeObserver(@NotNull Function1<? super Configuration, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.configurationChangeObserver = function1;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j10) {
        this.lastMatrixRecalculationAnimationTime = j10;
    }

    public final void setOnViewTreeOwnersAvailable(@NotNull Function1<? super ViewTreeOwners, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            callback.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f16996k1 = callback;
    }

    @Override // androidx.compose.ui.node.Owner
    public void setShowLayoutBounds(boolean z10) {
        this.showLayoutBounds = z10;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public AndroidAccessibilityManager getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public AndroidClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public PlatformTextInputPluginRegistryImpl getPlatformTextInputPluginRegistry() {
        return this.platformTextInputPluginRegistry;
    }

    @Deprecated(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @ReplaceWith(expression = "fontFamilyResolver", imports = {}))
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    @NotNull
    public View getView() {
        return this;
    }
}
