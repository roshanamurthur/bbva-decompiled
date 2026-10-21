package com.bbva.component.ui.landing.access;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bbva.cells.componentkit.dsl.TextViewKt;
import com.bbva.cells.componentkit.model.dsl.TextSettings;
import com.bbva.component.ui.landing.access.databinding.ViewLandingAccessBinding;
import com.bbva.component.ui.landing.access.databinding.ViewSkeletonAccessBinding;
import com.bbva.component.ui.landing.access.model.LandingAccessButton;
import com.bbva.component.ui.landing.access.model.LandingAccessConfiguration;
import com.bbva.component.ui.landing.access.model.LandingAccessLink;
import com.bbva.component.ui.landing.access.model.LandingAccessState;
import com.bbva.component.ui.landing.access.model.LandingImage;
import com.bbva.ui.extensions.FloatKt;
import com.bbva.ui.widget.BbvaButton;
import com.bbva.ui.widget.BbvaTextView;
import com.bbva.ui.widget.ClipBox;
import com.google.firebase.dynamiclinks.DynamicLink;
import k5.a;
import k5.b;
import k5.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingAccessView.kt */
/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010(\u001a\u00020'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0014\u0010 \u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u0014\u0010$\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#¨\u0006/"}, d2 = {"Lcom/bbva/component/ui/landing/access/LandingAccessView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/bbva/component/ui/landing/access/LandingAccessViewModel;", "q0", "Lcom/bbva/component/ui/landing/access/LandingAccessViewModel;", "getViewModel", "()Lcom/bbva/component/ui/landing/access/LandingAccessViewModel;", "viewModel", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroid/view/View;", "getContainer", "()Landroid/view/View;", "container", "Landroid/view/ViewGroup;", "getSkeletonContainer", "()Landroid/view/ViewGroup;", "skeletonContainer", "Lcom/bbva/ui/widget/ClipBox;", "getAvatar", "()Lcom/bbva/ui/widget/ClipBox;", "avatar", "Lcom/bbva/ui/widget/BbvaTextView;", "getGreeting", "()Lcom/bbva/ui/widget/BbvaTextView;", "greeting", "getName", "name", "getExtendedGreeting", "extendedGreeting", "Lcom/bbva/ui/widget/BbvaButton;", "getButton", "()Lcom/bbva/ui/widget/BbvaButton;", "button", "getLink", DynamicLink.Builder.KEY_LINK, "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "component-ui-landing-access_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingAccessView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingAccessView.kt\ncom/bbva/component/ui/landing/access/LandingAccessView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,228:1\n233#2,3:229\n*S KotlinDebug\n*F\n+ 1 LandingAccessView.kt\ncom/bbva/component/ui/landing/access/LandingAccessView\n*L\n72#1:229,3\n*E\n"})
public final class LandingAccessView extends ConstraintLayout implements CoroutineScope {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f28394p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LandingAccessViewModel viewModel;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final ViewLandingAccessBinding f28396r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f28397s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f28398t0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LandingAccessView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void access$updateView(LandingAccessView landingAccessView, LandingAccessState landingAccessState) {
        landingAccessView.getClass();
        if (landingAccessState instanceof LandingAccessState.Loading) {
            LandingAccessButton button = ((LandingAccessState.Loading) landingAccessState).getButton();
            landingAccessView.getSkeletonContainer().setVisibility(0);
            landingAccessView.getSkeletonContainer().removeAllViews();
            ViewSkeletonAccessBinding viewSkeletonAccessBindingInflate = ViewSkeletonAccessBinding.inflate(LayoutInflater.from(landingAccessView.getContext()), landingAccessView, false);
            Intrinsics.checkNotNullExpressionValue(viewSkeletonAccessBindingInflate, "inflate(...)");
            landingAccessView.getSkeletonContainer().addView(viewSkeletonAccessBindingInflate.getRoot());
            viewSkeletonAccessBindingInflate.skeletonAccess.startAnimation();
            landingAccessView.getButton().setVisibility(0);
            TextViewKt.settings(landingAccessView.getButton(), button.getLabel());
            landingAccessView.getContainer().setVisibility(8);
            return;
        }
        if (landingAccessState instanceof LandingAccessState.Ready) {
            LandingAccessConfiguration landingAccessConfiguration = ((LandingAccessState.Ready) landingAccessState).getLandingAccessConfiguration();
            landingAccessView.getContainer().setVisibility(0);
            landingAccessView.getSkeletonContainer().removeAllViews();
            landingAccessView.getSkeletonContainer().setVisibility(8);
            TextViewKt.settings(landingAccessView.getGreeting(), landingAccessConfiguration.getGreeting());
            LandingImage image = landingAccessConfiguration.getImage();
            if ((image != null ? image.getImageBase64() : null) != null) {
                String imageBase64 = image.getImageBase64();
                float f6 = landingAccessView.f28397s0;
                Context context = landingAccessView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                landingAccessView.getAvatar().setState(new ClipBox.State.Base64(imageBase64, FloatKt.toDp(f6, context)));
                landingAccessView.getAvatar().setVisibility(0);
            } else {
                if ((image != null ? image.getImageId() : null) != null) {
                    int iIntValue = image.getImageId().intValue();
                    int i10 = landingAccessView.f28398t0;
                    float f10 = landingAccessView.f28397s0;
                    Context context2 = landingAccessView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    landingAccessView.getAvatar().setState(new ClipBox.State.Resource(iIntValue, i10, FloatKt.toDp(f10, context2)));
                    landingAccessView.getAvatar().setVisibility(0);
                } else {
                    if ((image != null ? image.getAvatar() : null) != null) {
                        String avatar = image.getAvatar();
                        int i11 = landingAccessView.f28398t0;
                        float f11 = landingAccessView.f28397s0;
                        Context context3 = landingAccessView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                        landingAccessView.getAvatar().setState(new ClipBox.State.Name(avatar, i11, FloatKt.toDp(f11, context3)));
                        landingAccessView.getAvatar().setVisibility(0);
                    } else {
                        landingAccessView.getAvatar().setVisibility(8);
                    }
                }
            }
            TextSettings name = landingAccessConfiguration.getName();
            if (name == null) {
                landingAccessView.getName().setVisibility(8);
            } else {
                BbvaTextView name2 = landingAccessView.getName();
                name2.setVisibility(0);
                TextViewKt.settings(name2, name);
            }
            TextSettings extendedGreeting = landingAccessConfiguration.getExtendedGreeting();
            if (extendedGreeting == null) {
                landingAccessView.getExtendedGreeting().setVisibility(8);
            } else {
                BbvaTextView extendedGreeting2 = landingAccessView.getExtendedGreeting();
                extendedGreeting2.setVisibility(0);
                TextViewKt.settings(extendedGreeting2, extendedGreeting);
            }
            LandingAccessLink link = landingAccessConfiguration.getLink();
            if (link == null) {
                landingAccessView.getLink().setVisibility(8);
            } else {
                BbvaButton link2 = landingAccessView.getLink();
                link2.setVisibility(0);
                TextViewKt.settings(link2, link.getLabel());
                Context context4 = link2.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                link2.setCompoundDrawablesWithIntrinsicBounds(0, 0, link.getDrawableId(context4), 0);
                link2.setCompoundDrawablePadding(link2.getContext().getResources().getDimensionPixelSize(R.dimen.landing_access_padding_xs));
            }
            LandingAccessButton button2 = landingAccessConfiguration.getButton();
            if (button2 == null) {
                landingAccessView.getButton().setVisibility(8);
                return;
            }
            BbvaButton button3 = landingAccessView.getButton();
            button3.setVisibility(0);
            TextViewKt.settings(button3, button2.getLabel());
        }
    }

    private final ClipBox getAvatar() {
        ClipBox landingAccessAvatar = this.f28396r0.landingAccessAvatar;
        Intrinsics.checkNotNullExpressionValue(landingAccessAvatar, "landingAccessAvatar");
        return landingAccessAvatar;
    }

    private final BbvaButton getButton() {
        BbvaButton landingAccessButton = this.f28396r0.landingAccessButton;
        Intrinsics.checkNotNullExpressionValue(landingAccessButton, "landingAccessButton");
        return landingAccessButton;
    }

    private final View getContainer() {
        ConstraintLayout landingAccessContainer = this.f28396r0.landingAccessContainer;
        Intrinsics.checkNotNullExpressionValue(landingAccessContainer, "landingAccessContainer");
        return landingAccessContainer;
    }

    private final BbvaTextView getExtendedGreeting() {
        BbvaTextView landingAccessExtendedGreeting = this.f28396r0.landingAccessExtendedGreeting;
        Intrinsics.checkNotNullExpressionValue(landingAccessExtendedGreeting, "landingAccessExtendedGreeting");
        return landingAccessExtendedGreeting;
    }

    private final BbvaTextView getGreeting() {
        BbvaTextView landingAccessGreeting = this.f28396r0.landingAccessGreeting;
        Intrinsics.checkNotNullExpressionValue(landingAccessGreeting, "landingAccessGreeting");
        return landingAccessGreeting;
    }

    private final BbvaButton getLink() {
        BbvaButton landingAccessLink = this.f28396r0.landingAccessLink;
        Intrinsics.checkNotNullExpressionValue(landingAccessLink, "landingAccessLink");
        return landingAccessLink;
    }

    private final BbvaTextView getName() {
        BbvaTextView landingAccessName = this.f28396r0.landingAccessName;
        Intrinsics.checkNotNullExpressionValue(landingAccessName, "landingAccessName");
        return landingAccessName;
    }

    private final ViewGroup getSkeletonContainer() {
        FrameLayout skeletonAccessContainer = this.f28396r0.skeletonAccessContainer;
        Intrinsics.checkNotNullExpressionValue(skeletonAccessContainer, "skeletonAccessContainer");
        return skeletonAccessContainer;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f28394p0.getCoroutineContext();
    }

    @NotNull
    public final LandingAccessViewModel getViewModel() {
        return this.viewModel;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LandingAccessView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ LandingAccessView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LandingAccessView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28394p0 = CoroutineScopeKt.MainScope();
        this.viewModel = new LandingAccessViewModel();
        ViewLandingAccessBinding viewLandingAccessBindingInflate = ViewLandingAccessBinding.inflate(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(viewLandingAccessBindingInflate, "inflate(...)");
        this.f28396r0 = viewLandingAccessBindingInflate;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LandingAccessView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f28397s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.LandingAccessView_landingAccessView_imageSize, getResources().getDimensionPixelSize(R.dimen.landing_access_default_size_image));
        this.f28398t0 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.LandingAccessView_landingAccessView_avatarColor, com.bbva.ui.R.color.blue_40);
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.landing_access_padding_m);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        setLayoutParams(layoutParams);
        getButton().setOnClickListener(new a(this, 0));
        getLink().setOnClickListener(new b(this, 0));
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new c(this, null), 3, null);
    }
}
