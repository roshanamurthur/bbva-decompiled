package com.bbva.glomohybrid.landing.presentation.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.Insets;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bbva.glomohybrid.base.extensions.ViewExtensionsKt;
import com.bbva.glomohybrid.landing.R;
import com.bbva.glomohybrid.landing.databinding.ToolbarLandingBinding;
import com.bbva.glomohybrid.landing.presentation.view.LandingToolbar;
import com.bbva.ui.extensions.ContextKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import n4.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingToolbar.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB'\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0014\u0010\n\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/view/LandingToolbar;", "Landroidx/appcompat/widget/Toolbar;", "Landroidx/recyclerview/widget/RecyclerView;", "view", "Landroid/view/Window;", "window", "", "attachToRecyclerView", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setMenuButtonListener", "", "isVisible", "configureMenuVisibility", "configureDotVisibility", "Landroid/graphics/drawable/ColorDrawable;", "p1", "Lkotlin/Lazy;", "getToolbarColor", "()Landroid/graphics/drawable/ColorDrawable;", "toolbarColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingToolbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingToolbar.kt\ncom/bbva/glomohybrid/landing/presentation/view/LandingToolbar\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n1#2:161\n*E\n"})
public final class LandingToolbar extends Toolbar {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public float f33098o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy toolbarColor;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    @NotNull
    public final ToolbarLandingBinding f33100q1;

    /* JADX INFO: compiled from: LandingToolbar.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/view/LandingToolbar$Companion;", "", "()V", "COLOR_COEFFICIENT", "", "FULL_ALPHA_SCROLL", "NO_ALPHA_SCROLL", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: LandingToolbar.kt */
    public static final class a extends Lambda implements Function0<ColorDrawable> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f33101p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.f33101p0 = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ColorDrawable invoke() {
            return new ColorDrawable(ContextKt.themeColor(this.f33101p0, R.attr.surface_ambient_default));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LandingToolbar(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void access$configureFulfillToolbar(LandingToolbar landingToolbar, Window window, float f6) {
        landingToolbar.getClass();
        float fCoerceIn = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
        if (landingToolbar.f33098o1 == fCoerceIn) {
            return;
        }
        ColorDrawable toolbarColor = landingToolbar.getToolbarColor();
        toolbarColor.setAlpha((int) (255.0f * fCoerceIn));
        landingToolbar.s(window, toolbarColor);
        landingToolbar.setBackgroundColor(toolbarColor.getColor());
        landingToolbar.f33100q1.companyLogo.setAlpha(1.0f - fCoerceIn);
        landingToolbar.r(toolbarColor);
        landingToolbar.f33098o1 = fCoerceIn;
    }

    public static final void access$configureTransparentToolbar(LandingToolbar landingToolbar, Window window) {
        landingToolbar.s(window, null);
        landingToolbar.setBackgroundColor(ContextCompat.getColor(landingToolbar.getContext(), android.R.color.transparent));
        landingToolbar.f33100q1.companyLogo.setAlpha(1.0f);
        landingToolbar.r(null);
    }

    private final ColorDrawable getToolbarColor() {
        return (ColorDrawable) this.toolbarColor.getValue();
    }

    public final void attachToRecyclerView(@NotNull RecyclerView view, @NotNull final Window window) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(window, "window");
        view.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.bbva.glomohybrid.landing.presentation.view.LandingToolbar.attachToRecyclerView.1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
                int iFindFirstVisibleItemPosition;
                View viewFindViewByPosition;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager == null || (iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()) != 0 || (viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition)) == null) {
                    return;
                }
                int i10 = -viewFindViewByPosition.getTop();
                Window window2 = window;
                LandingToolbar landingToolbar = LandingToolbar.this;
                if (i10 == 0) {
                    LandingToolbar.access$configureTransparentToolbar(landingToolbar, window2);
                } else {
                    float height = landingToolbar.getHeight() / 3.0f;
                    LandingToolbar.access$configureFulfillToolbar(landingToolbar, window2, 1.0f - ((height - i10) / height));
                }
            }
        });
    }

    public final void configureDotVisibility(boolean isVisible) {
        AppCompatImageView menuDot = this.f33100q1.menuDot;
        Intrinsics.checkNotNullExpressionValue(menuDot, "menuDot");
        ViewExtensionsKt.show(menuDot, isVisible);
    }

    public final void configureMenuVisibility(boolean isVisible) {
        RelativeLayout menuButton = this.f33100q1.menuButton;
        Intrinsics.checkNotNullExpressionValue(menuButton, "menuButton");
        ViewExtensionsKt.show(menuButton, isVisible);
    }

    public final void r(ColorDrawable colorDrawable) {
        int i10 = (colorDrawable == null || ColorUtils.calculateLuminance(colorDrawable.getColor()) <= 0.5d) ? R.color.catalog_selector_link_complementary_dark : R.color.catalog_selector_link_complementary_light;
        ToolbarLandingBinding toolbarLandingBinding = this.f33100q1;
        toolbarLandingBinding.menuIcon.setImageTintList(ContextCompat.getColorStateList(getContext(), i10));
        toolbarLandingBinding.menuText.setTextColor(ContextCompat.getColorStateList(getContext(), i10));
    }

    public final void s(Window window, ColorDrawable colorDrawable) {
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
        boolean z10 = false;
        if (colorDrawable != null && ColorUtils.calculateLuminance(colorDrawable.getColor()) > 0.5d) {
            z10 = true;
        }
        windowInsetsControllerCompat.setAppearanceLightStatusBars(z10);
        window.setStatusBarColor(colorDrawable != null ? colorDrawable.getColor() : ContextCompat.getColor(getContext(), R.color.landing_status_bar_transparent_color));
    }

    public final void setMenuButtonListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f33100q1.menuButton.setOnClickListener(new k(listener, 3));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LandingToolbar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ LandingToolbar(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LandingToolbar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.toolbarColor = LazyKt__LazyJVMKt.lazy(new a(context));
        ToolbarLandingBinding toolbarLandingBindingInflate = ToolbarLandingBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(toolbarLandingBindingInflate, "inflate(...)");
        this.f33100q1 = toolbarLandingBindingInflate;
        ViewCompat.setOnApplyWindowInsetsListener(toolbarLandingBindingInflate.getRoot(), new OnApplyWindowInsetsListener() { // from class: n9.b
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsets) {
                LandingToolbar.Companion companion = LandingToolbar.INSTANCE;
                LandingToolbar this$0 = this.f84470p0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
                Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars());
                Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
                int i11 = insets.top;
                RelativeLayout relativeLayout = this$0.f33100q1.container;
                ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                layoutParams.height = this$0.getResources().getDimensionPixelSize(R.dimen.landing_toolbar_min_height) + i11;
                relativeLayout.setLayoutParams(layoutParams);
                return WindowInsetsCompat.CONSUMED;
            }
        });
        ViewCompat.setAccessibilityDelegate(toolbarLandingBindingInflate.menuButton, new AccessibilityDelegateCompat() { // from class: com.bbva.glomohybrid.landing.presentation.view.LandingToolbar$configureAccessibility$delegate$1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(@NotNull View host, @NotNull AccessibilityNodeInfoCompat info) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.setClassName(Button.class.getName());
            }
        });
    }
}
