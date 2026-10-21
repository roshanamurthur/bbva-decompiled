package com.bbva.ui.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.PointerIconCompat;
import com.bbva.ui.R;
import com.bbva.ui.compose.StatusNotificationState;
import com.bbva.ui.compose.StatusNotificationType;
import com.bbva.ui.compose.TopAppBarItem;
import com.bbva.ui.compose.TopAppBarKt;
import com.bbva.ui.compose.theme.Theme;
import com.bbva.ui.compose.theme.ThemeKt;
import com.mypinpad.tsdk.isolation.z1;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BbvaTopAppBar.kt */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u00019B\u0011\b\u0016\u0012\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105B\u001b\b\u0017\u0012\u0006\u00103\u001a\u000202\u0012\b\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b4\u00108J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0005J\u0010\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0005J\u0010\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u0005J\u0010\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0005J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014J(\u0010\u001b\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u00052\b\b\u0001\u0010\u0018\u001a\u00020\u00052\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019J\u0006\u0010\u001c\u001a\u00020\u0002J\u0014\u0010\u001e\u001a\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019J\u0014\u0010 \u001a\u00020\u00022\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019J#\u0010%\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0001\u0010\u0017\u001a\u00020\u0005H\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010(\u001a\u00020\u0002H\u0000¢\u0006\u0004\b&\u0010'R+\u00101\u001a\u00020)2\u0006\u0010*\u001a\u00020)8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006:"}, d2 = {"Lcom/bbva/ui/widget/BbvaTopAppBar;", "Landroidx/compose/ui/platform/AbstractComposeView;", "", "Content", "(Landroidx/compose/runtime/Composer;I)V", "", "titleResId", "setTitle", "titleIconResId", "setTitleIcon", "imageResId", "setImage", "imageContentDescriptionResId", "setImageContentDescription", "backgroundColorResId", "setBackground", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "setBackground-8_81llA", "(J)V", "", "percentage", "setRoundCornersPercentage", "textResId", "iconResId", "Lkotlin/Function0;", "onClick", "addItem", "removeAllItems", "onBackButtonClicked", "setOnBackButtonClicked", "onCloseButtonClicked", "setOnCloseButtonClicked", "Lcom/bbva/ui/compose/StatusNotificationType;", "type", "showStatusNotification$ui_release", "(Lcom/bbva/ui/compose/StatusNotificationType;I)V", "showStatusNotification", "hideStatusNotification$ui_release", "()V", "hideStatusNotification", "Lcom/bbva/ui/widget/BbvaTopAppBar$c;", "<set-?>", "x0", "Landroidx/compose/runtime/MutableState;", "getState", "()Lcom/bbva/ui/widget/BbvaTopAppBar$c;", "setState", "(Lcom/bbva/ui/widget/BbvaTopAppBar$c;)V", "state", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "c", "ui_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBbvaTopAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BbvaTopAppBar.kt\ncom/bbva/ui/widget/BbvaTopAppBar\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,182:1\n81#2:183\n107#2,2:184\n233#3,3:186\n233#3,3:189\n*S KotlinDebug\n*F\n+ 1 BbvaTopAppBar.kt\ncom/bbva/ui/widget/BbvaTopAppBar\n*L\n37#1:183\n37#1:184,2\n43#1:186,3\n62#1:189,3\n*E\n"})
public final class BbvaTopAppBar extends AbstractComposeView {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState state;

    /* JADX INFO: compiled from: BbvaTopAppBar.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {
        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-621043557, iIntValue, -1, "com.bbva.ui.widget.BbvaTopAppBar.Content.<anonymous> (BbvaTopAppBar.kt:72)");
                }
                BbvaTopAppBar bbvaTopAppBar = BbvaTopAppBar.this;
                Integer num2 = bbvaTopAppBar.getState().f37692a;
                Integer num3 = bbvaTopAppBar.getState().f37693b;
                Integer num4 = bbvaTopAppBar.getState().f37694c;
                Color color = bbvaTopAppBar.getState().f37696e;
                composer2.startReplaceableGroup(58128337);
                long jM5104getToolBar0d7_KjU = color == null ? Theme.INSTANCE.getColors(composer2, 6).m5104getToolBar0d7_KjU() : color.m2518unboximpl();
                composer2.endReplaceableGroup();
                float f6 = bbvaTopAppBar.getState().f37697f;
                if (num2 != null) {
                    composer2.startReplaceableGroup(58128507);
                    TopAppBarKt.m4984TopAppBargF0flNs((Modifier) null, num2.intValue(), num3, jM5104getToolBar0d7_KjU, f6, bbvaTopAppBar.getState().f37698g, bbvaTopAppBar.getState().f37699h, bbvaTopAppBar.getState().f37700i, bbvaTopAppBar.getState().f37701j, composer2, 262144, 1);
                    composer2.endReplaceableGroup();
                } else if (num4 != null) {
                    composer2.startReplaceableGroup(58129126);
                    TopAppBarKt.m4985TopAppBargF0flNs((Modifier) null, num4.intValue(), bbvaTopAppBar.getState().f37695d, jM5104getToolBar0d7_KjU, bbvaTopAppBar.getState().f37698g, f6, bbvaTopAppBar.getState().f37699h, bbvaTopAppBar.getState().f37700i, bbvaTopAppBar.getState().f37701j, composer2, 32768, 1);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(58129754);
                    composer2.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BbvaTopAppBar.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f37691q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10) {
            super(2);
            this.f37691q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f37691q0 | 1);
            BbvaTopAppBar.this.Content(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BbvaTopAppBar.kt */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Integer f37692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Integer f37693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Integer f37694c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final Integer f37695d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final Color f37696e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f37697f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final List<TopAppBarItem> f37698g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public final StatusNotificationState f37699h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public final Function0<Unit> f37700i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public final Function0<Unit> f37701j;

        public c() {
            throw null;
        }

        public c(Integer num, Integer num2, Integer num3, Integer num4, Color color, float f6, List items, StatusNotificationState statusNotificationState, Function0 function0, Function0 function1) {
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(statusNotificationState, "statusNotificationState");
            this.f37692a = num;
            this.f37693b = num2;
            this.f37694c = num3;
            this.f37695d = num4;
            this.f37696e = color;
            this.f37697f = f6;
            this.f37698g = items;
            this.f37699h = statusNotificationState;
            this.f37700i = function0;
            this.f37701j = function1;
        }

        public static c a(c cVar, Integer num, Integer num2, Integer num3, Integer num4, Color color, float f6, List list, StatusNotificationState statusNotificationState, Function0 function0, Function0 function1, int i10) {
            Integer num5 = (i10 & 1) != 0 ? cVar.f37692a : num;
            Integer num6 = (i10 & 2) != 0 ? cVar.f37693b : num2;
            Integer num7 = (i10 & 4) != 0 ? cVar.f37694c : num3;
            Integer num8 = (i10 & 8) != 0 ? cVar.f37695d : num4;
            Color color2 = (i10 & 16) != 0 ? cVar.f37696e : color;
            float f10 = (i10 & 32) != 0 ? cVar.f37697f : f6;
            List items = (i10 & 64) != 0 ? cVar.f37698g : list;
            StatusNotificationState statusNotificationState2 = (i10 & 128) != 0 ? cVar.f37699h : statusNotificationState;
            Function0 function2 = (i10 & 256) != 0 ? cVar.f37700i : function0;
            Function0 function3 = (i10 & 512) != 0 ? cVar.f37701j : function1;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(statusNotificationState2, "statusNotificationState");
            return new c(num5, num6, num7, num8, color2, f10, items, statusNotificationState2, function2, function3);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f37692a, cVar.f37692a) && Intrinsics.areEqual(this.f37693b, cVar.f37693b) && Intrinsics.areEqual(this.f37694c, cVar.f37694c) && Intrinsics.areEqual(this.f37695d, cVar.f37695d) && Intrinsics.areEqual(this.f37696e, cVar.f37696e) && Float.compare(this.f37697f, cVar.f37697f) == 0 && Intrinsics.areEqual(this.f37698g, cVar.f37698g) && Intrinsics.areEqual(this.f37699h, cVar.f37699h) && Intrinsics.areEqual(this.f37700i, cVar.f37700i) && Intrinsics.areEqual(this.f37701j, cVar.f37701j);
        }

        public final int hashCode() {
            Integer num = this.f37692a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.f37693b;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.f37694c;
            int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.f37695d;
            int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Color color = this.f37696e;
            int iHashCode5 = (this.f37699h.hashCode() + com.google.android.gms.measurement.internal.a.a(this.f37698g, z1.a(this.f37697f, (iHashCode4 + (color == null ? 0 : Color.m2515hashCodeimpl(color.m2518unboximpl()))) * 31, 31), 31)) * 31;
            Function0<Unit> function0 = this.f37700i;
            int iHashCode6 = (iHashCode5 + (function0 == null ? 0 : function0.hashCode())) * 31;
            Function0<Unit> function1 = this.f37701j;
            return iHashCode6 + (function1 != null ? function1.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "State(titleResId=" + this.f37692a + ", titleIconResId=" + this.f37693b + ", imageResId=" + this.f37694c + ", imageContentDescriptionResId=" + this.f37695d + ", backgroundColor=" + this.f37696e + ", roundCornersPercent=" + this.f37697f + ", items=" + this.f37698g + ", statusNotificationState=" + this.f37699h + ", onBackButtonClicked=" + this.f37700i + ", onCloseButtonClicked=" + this.f37701j + ")";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BbvaTopAppBar(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final c getState() {
        return (c) this.state.getValue();
    }

    private final void setState(c cVar) {
        this.state.setValue(cVar);
    }

    public static /* synthetic */ void showStatusNotification$ui_release$default(BbvaTopAppBar bbvaTopAppBar, StatusNotificationType statusNotificationType, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            statusNotificationType = StatusNotificationType.INFO;
        }
        bbvaTopAppBar.showStatusNotification$ui_release(statusNotificationType, i10);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@Nullable Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(1900113197);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1900113197, i11, -1, "com.bbva.ui.widget.BbvaTopAppBar.Content (BbvaTopAppBar.kt:70)");
            }
            ThemeKt.BbvaTheme(null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -621043557, true, new a()), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b(i10));
        }
    }

    public final void addItem(@StringRes int textResId, @DrawableRes int iconResId, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        setState(c.a(getState(), null, null, null, null, null, 0.0f, CollectionsKt___CollectionsKt.plus((Collection<? extends TopAppBarItem>) getState().f37698g, new TopAppBarItem(textResId, iconResId, onClick)), null, null, null, 959));
    }

    public final void hideStatusNotification$ui_release() {
        setState(c.a(getState(), null, null, null, null, null, 0.0f, null, StatusNotificationState.copy$default(getState().f37699h, null, 0, false, 3, null), null, null, 895));
    }

    public final void removeAllItems() {
        setState(c.a(getState(), null, null, null, null, null, 0.0f, CollectionsKt__CollectionsKt.emptyList(), null, null, null, 959));
    }

    public final void setBackground(@ColorRes int backgroundColorResId) {
        setState(c.a(getState(), null, null, null, null, Color.m2498boximpl(ColorKt.Color(ResourcesCompat.getColor(getContext().getResources(), backgroundColorResId, null))), 0.0f, null, null, null, null, 1007));
    }

    /* JADX INFO: renamed from: setBackground-8_81llA, reason: not valid java name */
    public final void m5275setBackground8_81llA(long backgroundColor) {
        setState(c.a(getState(), null, null, null, null, Color.m2498boximpl(backgroundColor), 0.0f, null, null, null, null, 1007));
    }

    public final void setImage(@DrawableRes int imageResId) {
        setState(c.a(getState(), null, null, Integer.valueOf(imageResId), null, null, 0.0f, null, null, null, null, PointerIconCompat.TYPE_ZOOM_OUT));
    }

    public final void setImageContentDescription(@StringRes int imageContentDescriptionResId) {
        setState(c.a(getState(), null, null, null, Integer.valueOf(imageContentDescriptionResId), null, 0.0f, null, null, null, null, PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW));
    }

    public final void setOnBackButtonClicked(@NotNull Function0<Unit> onBackButtonClicked) {
        Intrinsics.checkNotNullParameter(onBackButtonClicked, "onBackButtonClicked");
        setState(c.a(getState(), null, null, null, null, null, 0.0f, null, null, onBackButtonClicked, null, 767));
    }

    public final void setOnCloseButtonClicked(@NotNull Function0<Unit> onCloseButtonClicked) {
        Intrinsics.checkNotNullParameter(onCloseButtonClicked, "onCloseButtonClicked");
        setState(c.a(getState(), null, null, null, null, null, 0.0f, null, null, null, onCloseButtonClicked, 511));
    }

    public final void setRoundCornersPercentage(float percentage) {
        setState(c.a(getState(), null, null, null, null, null, percentage, null, null, null, null, 991));
    }

    public final void setTitle(@StringRes int titleResId) {
        setState(c.a(getState(), Integer.valueOf(titleResId), null, null, null, null, 0.0f, null, null, null, null, 1022));
    }

    public final void setTitleIcon(@DrawableRes int titleIconResId) {
        setState(c.a(getState(), null, Integer.valueOf(titleIconResId), null, null, null, 0.0f, null, null, null, null, PointerIconCompat.TYPE_GRABBING));
    }

    public final void showStatusNotification$ui_release(@NotNull StatusNotificationType type, @StringRes int textResId) {
        Intrinsics.checkNotNullParameter(type, "type");
        setState(c.a(getState(), null, null, null, null, null, 0.0f, null, new StatusNotificationState(type, textResId, true), null, null, 895));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public BbvaTopAppBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.state = SnapshotStateKt.mutableStateOf$default(new c(null, null, null, null, null, 0.0f, CollectionsKt__CollectionsKt.emptyList(), new StatusNotificationState(null, 0, false, 7, null), null, null), null, 2, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BbvaTopAppBar, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.BbvaTopAppBar_topAppBarTitle, 0);
        if (resourceId != 0) {
            setTitle(resourceId);
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.BbvaTopAppBar_topAppBarTitleIcon, 0);
        if (resourceId2 != 0) {
            setTitleIcon(resourceId2);
        }
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.BbvaTopAppBar_topAppBarImage, 0);
        if (resourceId3 != 0) {
            setImage(resourceId3);
            int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.BbvaTopAppBar_topAppBarImageContentDescription, 0);
            if (resourceId4 != 0) {
                setImageContentDescription(resourceId4);
            }
        }
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.ViewBackgroundHelper, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes2, "obtainStyledAttributes(...)");
        int resourceId5 = typedArrayObtainStyledAttributes2.getResourceId(androidx.appcompat.R.styleable.ViewBackgroundHelper_android_background, 0);
        if (resourceId5 != 0) {
            setBackground(resourceId5);
        }
        typedArrayObtainStyledAttributes2.recycle();
    }
}
