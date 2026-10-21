package androidx.compose.ui.window;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.R;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.platform.l1;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidPopup.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BV\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010{\u001a\u00020z\u0012\u0006\u0010}\u001a\u00020|\u0012\u0006\u0010~\u001a\u00020H\u0012\u0007\u0010\u0080\u0001\u001a\u00020\u007f\u0012\n\b\u0002\u0010\u0082\u0001\u001a\u00030\u0081\u0001¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0006\u0010\u0004\u001a\u00020\u0003J(\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J.\u0010'\u001a\u00020\u00032\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%J\u000e\u0010*\u001a\u00020\u00032\u0006\u0010)\u001a\u00020(J\u0006\u0010+\u001a\u00020\u0003J\u000f\u0010.\u001a\u00020\u0003H\u0001¢\u0006\u0004\b,\u0010-J\u0006\u0010/\u001a\u00020\u0003J\u0006\u00100\u001a\u00020\u0003J\u0012\u00102\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u000101H\u0016J\u0010\u00103\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u000eH\u0016J\u0010\u00105\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u0014H\u0002J\u0010\u00108\u001a\u00020\u00032\u0006\u00107\u001a\u000206H\u0002J\u0010\u0010:\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u0014H\u0002R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R \u0010G\u001a\u00020A8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bB\u0010C\u0012\u0004\bF\u0010-\u001a\u0004\bD\u0010ER\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010V\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR8\u0010_\u001a\u0004\u0018\u00010W2\b\u0010X\u001a\u0004\u0018\u00010W8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R/\u0010)\u001a\u0004\u0018\u00010(2\b\u0010X\u001a\u0004\u0018\u00010(8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b`\u0010Z\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u001b\u0010i\u001a\u00020\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hRA\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\b\b2\u0011\u0010X\u001a\r\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\b\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bj\u0010Z\u001a\u0004\bk\u0010l\"\u0004\b\n\u0010mR$\u0010q\u001a\u00020\u00142\u0006\u0010X\u001a\u00020\u00148\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010hR\u0014\u0010t\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u0014\u0010w\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0014\u0010y\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bx\u0010v\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0085\u0001"}, d2 = {"Landroidx/compose/ui/window/PopupLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "", "show", "Landroidx/compose/runtime/CompositionContext;", "parent", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "setContent", "(Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)V", "Content", "(Landroidx/compose/runtime/Composer;I)V", "", "widthMeasureSpec", "heightMeasureSpec", "internalOnMeasure$ui_release", "(II)V", "internalOnMeasure", "", "changed", Parameters.DIRECTION.LEFT, "top", Parameters.DIRECTION.RIGHT, "bottom", "internalOnLayout$ui_release", "(ZIIII)V", "internalOnLayout", "Landroid/view/KeyEvent;", "event", "dispatchKeyEvent", "onDismissRequest", "Landroidx/compose/ui/window/PopupProperties;", LogKeysKt.PROPERTIES, "", "testTag", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "updateParameters", "Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "updateParentLayoutCoordinates", "pollForLocationOnScreenChange", "updateParentBounds$ui_release", "()V", "updateParentBounds", "updatePosition", "dismiss", "Landroid/view/MotionEvent;", "onTouchEvent", "setLayoutDirection", "isFocusable", "setIsFocusable", "Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "setSecurePolicy", "clippingEnabled", "setClippingEnabled", "E0", "Ljava/lang/String;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", "Landroid/view/WindowManager$LayoutParams;", "I0", "Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release", "()Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release$annotations", "params", "Landroidx/compose/ui/window/PopupPositionProvider;", "J0", "Landroidx/compose/ui/window/PopupPositionProvider;", "getPositionProvider", "()Landroidx/compose/ui/window/PopupPositionProvider;", "setPositionProvider", "(Landroidx/compose/ui/window/PopupPositionProvider;)V", "positionProvider", "K0", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setParentLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "parentLayoutDirection", "Landroidx/compose/ui/unit/IntSize;", "<set-?>", "L0", "Landroidx/compose/runtime/MutableState;", "getPopupContentSize-bOM6tXw", "()Landroidx/compose/ui/unit/IntSize;", "setPopupContentSize-fhxjrPA", "(Landroidx/compose/ui/unit/IntSize;)V", "popupContentSize", "M0", "getParentLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setParentLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "O0", "Landroidx/compose/runtime/State;", "getCanCalculatePosition", "()Z", "canCalculatePosition", "Q0", "getContent", "()Lkotlin/jvm/functions/Function2;", "(Lkotlin/jvm/functions/Function2;)V", "R0", "Z", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "subCompositionView", "getDisplayWidth", "()I", "displayWidth", "getDisplayHeight", "displayHeight", "Landroid/view/View;", "composeView", "Landroidx/compose/ui/unit/Density;", "density", "initialPositionProvider", "Ljava/util/UUID;", "popupId", "Landroidx/compose/ui/window/PopupLayoutHelper;", "popupLayoutHelper", "<init>", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Ljava/lang/String;Landroid/view/View;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/window/PopupPositionProvider;Ljava/util/UUID;Landroidx/compose/ui/window/PopupLayoutHelper;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/PopupLayout\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,833:1\n154#2:834\n1#3:835\n81#4:836\n107#4,2:837\n81#4:839\n107#4,2:840\n81#4:842\n81#4:843\n107#4,2:844\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/PopupLayout\n*L\n413#1:834\n402#1:836\n402#1:837,2\n403#1:839\n403#1:840,2\n407#1:842\n447#1:843\n447#1:844,2\n*E\n"})
public final class PopupLayout extends AbstractComposeView implements ViewRootForInspector {

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    @NotNull
    public String testTag;

    @NotNull
    public final View F0;

    @NotNull
    public final PopupLayoutHelper G0;

    @NotNull
    public final WindowManager H0;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    @NotNull
    public final WindowManager.LayoutParams params;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    @NotNull
    public PopupPositionProvider positionProvider;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    @NotNull
    public LayoutDirection parentLayoutDirection;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    @NotNull
    public final MutableState popupContentSize;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    @NotNull
    public final MutableState parentLayoutCoordinates;

    @Nullable
    public IntRect N0;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    @NotNull
    public final State canCalculatePosition;

    @NotNull
    public final Rect P0;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    @NotNull
    public final MutableState content;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    public boolean shouldCreateCompositionOnAttachedToWindow;

    @NotNull
    public final int[] S0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f18466x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public PopupProperties f18467y0;

    /* JADX INFO: compiled from: AndroidPopup.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: AndroidPopup.android.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f18469q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10) {
            super(2);
            this.f18469q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f18469q0 | 1);
            PopupLayout.this.Content(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidPopup.android.kt */
    public static final class b extends Lambda implements Function0<Boolean> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            PopupLayout popupLayout = PopupLayout.this;
            return Boolean.valueOf((popupLayout.getParentLayoutCoordinates() == null || popupLayout.m4630getPopupContentSizebOM6tXw() == null) ? false : true);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PopupLayout(Function0 function0, PopupProperties popupProperties, String str, View view, Density density, PopupPositionProvider popupPositionProvider, UUID uuid, PopupLayoutHelper popupLayoutHelper, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        PopupLayoutHelper dVar;
        if ((i10 & 128) != 0) {
            dVar = Build.VERSION.SDK_INT >= 29 ? new z1.d() : new z1.e();
        } else {
            dVar = popupLayoutHelper;
        }
        this(function0, popupProperties, str, view, density, popupPositionProvider, uuid, dVar);
    }

    private final Function2<Composer, Integer, Unit> getContent() {
        return (Function2) this.content.getValue();
    }

    private final int getDisplayHeight() {
        return mk.c.roundToInt(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return mk.c.roundToInt(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates getParentLayoutCoordinates() {
        return (LayoutCoordinates) this.parentLayoutCoordinates.getValue();
    }

    private final void setClippingEnabled(boolean clippingEnabled) {
        WindowManager.LayoutParams layoutParams = this.params;
        layoutParams.flags = clippingEnabled ? layoutParams.flags & (-513) : layoutParams.flags | 512;
        this.G0.updateViewLayout(this.H0, this, layoutParams);
    }

    private final void setContent(Function2<? super Composer, ? super Integer, Unit> function2) {
        this.content.setValue(function2);
    }

    private final void setIsFocusable(boolean isFocusable) {
        WindowManager.LayoutParams layoutParams = this.params;
        layoutParams.flags = !isFocusable ? layoutParams.flags | 8 : layoutParams.flags & (-9);
        this.G0.updateViewLayout(this.H0, this, layoutParams);
    }

    private final void setParentLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.parentLayoutCoordinates.setValue(layoutCoordinates);
    }

    private final void setSecurePolicy(SecureFlagPolicy securePolicy) {
        boolean zShouldApplySecureFlag = SecureFlagPolicy_androidKt.shouldApplySecureFlag(securePolicy, AndroidPopup_androidKt.isFlagSecureEnabled(this.F0));
        WindowManager.LayoutParams layoutParams = this.params;
        layoutParams.flags = zShouldApplySecureFlag ? layoutParams.flags | 8192 : layoutParams.flags & (-8193);
        this.G0.updateViewLayout(this.H0, this, layoutParams);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @Composable
    @UiComposable
    public void Content(@Nullable Composer composer, int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-857613600);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-857613600, i10, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:463)");
        }
        getContent().invoke(composerStartRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(i10));
    }

    public final void dismiss() {
        ViewTreeLifecycleOwner.set(this, null);
        this.H0.removeViewImmediate(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@NotNull KeyEvent event) {
        KeyEvent.DispatcherState keyDispatcherState;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getKeyCode() == 4 && this.f18467y0.getDismissOnBackPress()) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(event);
            }
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(event, this);
                }
                return true;
            }
            if (event.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(event) && !event.isCanceled()) {
                Function0<Unit> function0 = this.f18466x0;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.canCalculatePosition.getValue()).booleanValue();
    }

    @NotNull
    /* JADX INFO: renamed from: getParams$ui_release, reason: from getter */
    public final WindowManager.LayoutParams getParams() {
        return this.params;
    }

    @NotNull
    public final LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final IntSize m4630getPopupContentSizebOM6tXw() {
        return (IntSize) this.popupContentSize.getValue();
    }

    @NotNull
    public final PopupPositionProvider getPositionProvider() {
        return this.positionProvider;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @NotNull
    public final String getTestTag() {
        return this.testTag;
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public final /* synthetic */ View getViewRoot() {
        return l1.b(this);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnLayout$ui_release(boolean changed, int left, int top, int right, int bottom) {
        View childAt;
        super.internalOnLayout$ui_release(changed, left, top, right, bottom);
        if (this.f18467y0.getUsePlatformDefaultWidth() || (childAt = getChildAt(0)) == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.params;
        layoutParams.width = childAt.getMeasuredWidth();
        layoutParams.height = childAt.getMeasuredHeight();
        this.G0.updateViewLayout(this.H0, this, layoutParams);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnMeasure$ui_release(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f18467y0.getUsePlatformDefaultWidth()) {
            super.internalOnMeasure$ui_release(widthMeasureSpec, heightMeasureSpec);
        } else {
            super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        if (!this.f18467y0.getDismissOnClickOutside()) {
            return super.onTouchEvent(event);
        }
        if (event != null && event.getAction() == 0 && (event.getX() < 0.0f || event.getX() >= getWidth() || event.getY() < 0.0f || event.getY() >= getHeight())) {
            Function0<Unit> function0 = this.f18466x0;
            if (function0 != null) {
                function0.invoke();
            }
            return true;
        }
        if (event == null || event.getAction() != 4) {
            return super.onTouchEvent(event);
        }
        Function0<Unit> function1 = this.f18466x0;
        if (function1 != null) {
            function1.invoke();
        }
        return true;
    }

    public final void pollForLocationOnScreenChange() {
        int[] iArr = this.S0;
        int i10 = iArr[0];
        int i11 = iArr[1];
        this.F0.getLocationOnScreen(iArr);
        if (i10 == iArr[0] && i11 == iArr[1]) {
            return;
        }
        updateParentBounds$ui_release();
    }

    public final void setParentLayoutDirection(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        this.parentLayoutDirection = layoutDirection;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m4631setPopupContentSizefhxjrPA(@Nullable IntSize intSize) {
        this.popupContentSize.setValue(intSize);
    }

    public final void setPositionProvider(@NotNull PopupPositionProvider popupPositionProvider) {
        Intrinsics.checkNotNullParameter(popupPositionProvider, "<set-?>");
        this.positionProvider = popupPositionProvider;
    }

    public final void setTestTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.testTag = str;
    }

    public final void show() {
        this.H0.addView(this, this.params);
    }

    public final void updateParameters(@Nullable Function0<Unit> onDismissRequest, @NotNull PopupProperties properties, @NotNull String testTag, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(testTag, "testTag");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.f18466x0 = onDismissRequest;
        if (properties.getUsePlatformDefaultWidth() && !this.f18467y0.getUsePlatformDefaultWidth()) {
            WindowManager.LayoutParams layoutParams = this.params;
            layoutParams.width = -2;
            layoutParams.height = -2;
            this.G0.updateViewLayout(this.H0, this, layoutParams);
        }
        this.f18467y0 = properties;
        this.testTag = testTag;
        setIsFocusable(properties.getFocusable());
        setSecurePolicy(properties.getSecurePolicy());
        setClippingEnabled(properties.getClippingEnabled());
        int i10 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i11);
    }

    @VisibleForTesting
    public final void updateParentBounds$ui_release() {
        LayoutCoordinates parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null) {
            return;
        }
        long jMo3581getSizeYbymL2g = parentLayoutCoordinates.mo3581getSizeYbymL2g();
        long jPositionInWindow = LayoutCoordinatesKt.positionInWindow(parentLayoutCoordinates);
        IntRect intRectM4539IntRectVbeCjmY = IntRectKt.m4539IntRectVbeCjmY(IntOffsetKt.IntOffset(mk.c.roundToInt(Offset.m2275getXimpl(jPositionInWindow)), mk.c.roundToInt(Offset.m2276getYimpl(jPositionInWindow))), jMo3581getSizeYbymL2g);
        if (Intrinsics.areEqual(intRectM4539IntRectVbeCjmY, this.N0)) {
            return;
        }
        this.N0 = intRectM4539IntRectVbeCjmY;
        updatePosition();
    }

    public final void updateParentLayoutCoordinates(@NotNull LayoutCoordinates parentLayoutCoordinates) {
        Intrinsics.checkNotNullParameter(parentLayoutCoordinates, "parentLayoutCoordinates");
        setParentLayoutCoordinates(parentLayoutCoordinates);
        updateParentBounds$ui_release();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void updatePosition() {
        IntSize intSizeM4630getPopupContentSizebOM6tXw;
        IntRect intRect = this.N0;
        if (intRect == null || (intSizeM4630getPopupContentSizebOM6tXw = m4630getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long f18319a = intSizeM4630getPopupContentSizebOM6tXw.getF18319a();
        View view = this.F0;
        PopupLayoutHelper popupLayoutHelper = this.G0;
        Rect rect = this.P0;
        popupLayoutHelper.getWindowVisibleDisplayFrame(view, rect);
        IntRect intRectAccess$toIntBounds = AndroidPopup_androidKt.access$toIntBounds(rect);
        long jIntSize = IntSizeKt.IntSize(intRectAccess$toIntBounds.getWidth(), intRectAccess$toIntBounds.getHeight());
        long jMo601calculatePositionllwVHH4 = this.positionProvider.mo601calculatePositionllwVHH4(intRect, jIntSize, this.parentLayoutDirection, f18319a);
        WindowManager.LayoutParams layoutParams = this.params;
        layoutParams.x = IntOffset.m4507getXimpl(jMo601calculatePositionllwVHH4);
        layoutParams.y = IntOffset.m4508getYimpl(jMo601calculatePositionllwVHH4);
        if (this.f18467y0.getExcludeFromSystemGesture()) {
            popupLayoutHelper.setGestureExclusionRects(this, IntSize.m4549getWidthimpl(jIntSize), IntSize.m4548getHeightimpl(jIntSize));
        }
        popupLayoutHelper.updateViewLayout(this.H0, this, layoutParams);
    }

    public final void setContent(@NotNull CompositionContext parent, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(content, "content");
        setParentCompositionContext(parent);
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PopupLayout(@Nullable Function0<Unit> function0, @NotNull PopupProperties properties, @NotNull String testTag, @NotNull View composeView, @NotNull Density density, @NotNull PopupPositionProvider initialPositionProvider, @NotNull UUID popupId, @NotNull PopupLayoutHelper popupLayoutHelper) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(testTag, "testTag");
        Intrinsics.checkNotNullParameter(composeView, "composeView");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(initialPositionProvider, "initialPositionProvider");
        Intrinsics.checkNotNullParameter(popupId, "popupId");
        Intrinsics.checkNotNullParameter(popupLayoutHelper, "popupLayoutHelper");
        Context context = composeView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "composeView.context");
        super(context, null, 0, 6, null);
        this.f18466x0 = function0;
        this.f18467y0 = properties;
        this.testTag = testTag;
        this.F0 = composeView;
        this.G0 = popupLayoutHelper;
        Object systemService = composeView.getContext().getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.H0 = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = (layoutParams.flags & (-8552473)) | 262144;
        layoutParams.type = 1002;
        layoutParams.token = composeView.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(composeView.getContext().getResources().getString(R.string.default_popup_window_title));
        this.params = layoutParams;
        this.positionProvider = initialPositionProvider;
        this.parentLayoutDirection = LayoutDirection.Ltr;
        this.popupContentSize = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.parentLayoutCoordinates = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.canCalculatePosition = SnapshotStateKt.derivedStateOf(new b());
        float fM4389constructorimpl = Dp.m4389constructorimpl(8);
        this.P0 = new Rect();
        setId(android.R.id.content);
        ViewTreeLifecycleOwner.set(this, ViewTreeLifecycleOwner.get(composeView));
        ViewTreeViewModelStoreOwner.set(this, ViewTreeViewModelStoreOwner.get(composeView));
        ViewTreeSavedStateRegistryOwner.set(this, ViewTreeSavedStateRegistryOwner.get(composeView));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + popupId);
        setClipChildren(false);
        setElevation(density.mo415toPx0680j_4(fM4389constructorimpl));
        setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.ui.window.PopupLayout.2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(@NotNull View view, @NotNull Outline result) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(result, "result");
                result.setRect(0, 0, view.getWidth(), view.getHeight());
                result.setAlpha(0.0f);
            }
        });
        this.content = SnapshotStateKt.mutableStateOf$default(ComposableSingletons$AndroidPopup_androidKt.INSTANCE.m4629getLambda1$ui_release(), null, 2, null);
        this.S0 = new int[2];
    }

    @VisibleForTesting
    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    @NotNull
    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int layoutDirection) {
    }
}
