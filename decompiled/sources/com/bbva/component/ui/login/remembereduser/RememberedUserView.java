package com.bbva.component.ui.login.remembereduser;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.bbva.cells.componentkit.dsl.ImageViewKt;
import com.bbva.cells.componentkit.dsl.TextViewKt;
import com.bbva.cells.componentkit.dsl.ViewKt;
import com.bbva.cells.componentkit.model.dsl.ImageSettings;
import com.bbva.cells.componentkit.model.dsl.TextSettings;
import com.bbva.cells.componentkit.model.dsl.Visibility;
import com.bbva.cellswidgets.CellsButton;
import com.bbva.cellswidgets.CellsCircleInitialsView;
import com.bbva.cellswidgets.CellsEditText;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.component.ui.login.R;
import com.bbva.component.ui.login.animations.DefaultAnimationTemplate;
import com.bbva.component.ui.login.databinding.ViewRememberedUserBinding;
import com.bbva.component.ui.login.extensions.CellsTextViewAccessibilityKt;
import com.bbva.component.ui.login.extensions.ImageViewExtensionKt;
import com.bbva.component.ui.login.extensions.ViewExtensionKt;
import com.bbva.component.ui.login.handler.FormValidatorHandler;
import com.bbva.component.ui.login.handler.validations.DefaultEditTextValidator;
import com.bbva.component.ui.login.model.BiometricState;
import com.bbva.component.ui.login.model.Button;
import com.bbva.component.ui.login.model.ButtonLink;
import com.bbva.component.ui.login.model.InputFieldConfig;
import com.bbva.component.ui.login.model.InputFieldData;
import com.bbva.component.ui.login.model.RememberedUserImage;
import com.bbva.component.ui.login.model.RememberedUserState;
import com.bbva.component.ui.login.remembereduser.RememberedUserView;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import h2.q;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r5.c;
import r5.d;
import r5.f;
import r5.g;
import r5.h;

/* JADX INFO: compiled from: RememberedUserView.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 O2\u00020\u00012\u00020\u0002:\u0001OB1\b\u0007\u0012\u0006\u0010F\u001a\u00020E\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010G\u0012\b\b\u0002\u0010J\u001a\u00020I\u0012\b\b\u0002\u0010L\u001a\u00020K¢\u0006\u0004\bM\u0010NJ\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0005\u001a\u00020\u0003J\b\u0010\u0006\u001a\u00020\u0003H\u0014R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0014\u00101\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010;\u001a\u0002068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u00108R\u0014\u0010>\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010=R\u0014\u0010B\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010=R\u0014\u0010D\u001a\u0002068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u00108¨\u0006P"}, d2 = {"Lcom/bbva/component/ui/login/remembereduser/RememberedUserView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlinx/coroutines/CoroutineScope;", "", "startAnimation", "resetPassword", "onAttachedToWindow", "Lcom/bbva/component/ui/login/remembereduser/RememberedUserViewModel;", "q0", "Lcom/bbva/component/ui/login/remembereduser/RememberedUserViewModel;", "getViewModel", "()Lcom/bbva/component/ui/login/remembereduser/RememberedUserViewModel;", "viewModel", "Lcom/bbva/component/ui/login/databinding/ViewRememberedUserBinding;", "r0", "Lkotlin/Lazy;", "getBinding", "()Lcom/bbva/component/ui/login/databinding/ViewRememberedUserBinding;", "binding", "Lcom/bbva/component/ui/login/animations/DefaultAnimationTemplate;", "s0", "getAnimator", "()Lcom/bbva/component/ui/login/animations/DefaultAnimationTemplate;", "animator", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroid/widget/FrameLayout;", "getAvatarContainer", "()Landroid/widget/FrameLayout;", "avatarContainer", "Lcom/bbva/cellswidgets/CellsEditText;", "getPasswordEditText", "()Lcom/bbva/cellswidgets/CellsEditText;", "passwordEditText", "Lcom/bbva/cellswidgets/CellsTextView;", "getRememberPassword", "()Lcom/bbva/cellswidgets/CellsTextView;", "rememberPassword", "Lcom/bbva/cellswidgets/CellsButton;", "getPrimaryButton", "()Lcom/bbva/cellswidgets/CellsButton;", "primaryButton", "getSecondaryButton", "secondaryButton", "Landroidx/appcompat/widget/AppCompatImageView;", "getImage", "()Landroidx/appcompat/widget/AppCompatImageView;", AuthConstants.IMAGE, "Lcom/bbva/cellswidgets/CellsCircleInitialsView;", "getAvatar", "()Lcom/bbva/cellswidgets/CellsCircleInitialsView;", "avatar", "Landroidx/appcompat/widget/AppCompatTextView;", "getGreeting", "()Landroidx/appcompat/widget/AppCompatTextView;", "greeting", "getName", "name", "getGreetingsContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "greetingsContainer", "getButtonsContainer", "buttonsContainer", "getAccessingBiometricsContainer", "accessingBiometricsContainer", "getAccessingBiometricsMessage", "accessingBiometricsMessage", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "isDarkModeEnabled", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V", "Companion", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
public final class RememberedUserView extends ConstraintLayout implements CoroutineScope {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f28593p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final RememberedUserViewModel viewModel;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy binding;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy animator;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f28597t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f28598u0;

    /* JADX INFO: compiled from: RememberedUserView.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/bbva/component/ui/login/remembereduser/RememberedUserView$Companion;", "", "Landroid/content/Context;", "context", "", "getPrimaryButtonDrawable", "", "ANIMATION_BUTTON_CLICK_SIMULATE", "J", "<init>", "()V", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nRememberedUserView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberedUserView.kt\ncom/bbva/component/ui/login/remembereduser/RememberedUserView$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,422:1\n1#2:423\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final Context access$getContextThemeWrapper(Companion companion, boolean z10, Context context) {
            companion.getClass();
            return new ContextThemeWrapper(context, z10 ? R.style.LoginStyle_DayNight : R.style.LoginStyle);
        }

        public static final boolean access$initIsDarkModeEnabled(Companion companion, Context context, AttributeSet attributeSet) {
            companion.getClass();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.loginView_isDarkModeEnabled});
            boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
            typedArrayObtainStyledAttributes.recycle();
            return z10;
        }

        public final int getPrimaryButtonDrawable(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            boolean z10 = (context.getResources().getConfiguration().uiMode & 48) == 32;
            if (z10) {
                return R.drawable.component_ui_login_bg_btn_secondary_dark;
            }
            if (z10) {
                throw new NoWhenBranchMatchedException();
            }
            return R.drawable.component_ui_login_bg_btn_secondary;
        }
    }

    /* JADX INFO: compiled from: RememberedUserView.kt */
    public static final class a extends Lambda implements Function0<DefaultAnimationTemplate> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final DefaultAnimationTemplate invoke() {
            return new DefaultAnimationTemplate(RememberedUserView.this);
        }
    }

    /* JADX INFO: compiled from: RememberedUserView.kt */
    public static final class b extends Lambda implements Function0<ViewRememberedUserBinding> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewRememberedUserBinding invoke() {
            RememberedUserView rememberedUserView = RememberedUserView.this;
            return ViewRememberedUserBinding.inflate(LayoutInflater.from(rememberedUserView.getContext()), rememberedUserView);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RememberedUserView(@NotNull Context context) {
        this(context, null, 0, false, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(RememberedUserView this$0, RememberedUserState rememberedUserState) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rememberedUserState, "$rememberedUserState");
        ViewKt.visibility(this$0.getButtonsContainer(), Visibility.Gone);
        CellsButton primaryButton = this$0.getPrimaryButton();
        Companion companion = INSTANCE;
        Context context = this$0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        primaryButton.setBackgroundResource(companion.getPrimaryButtonDrawable(context));
        this$0.getAccessingBiometricsContainer().setVisibility(0);
        AppCompatTextView accessingBiometricsMessage = this$0.getAccessingBiometricsMessage();
        BiometricState biometricState = rememberedUserState.getBiometricState();
        TextViewKt.settings(accessingBiometricsMessage, biometricState != null ? biometricState.getAccessingBiometricsMessage() : null);
    }

    public static final void access$displayAccessingWithBiometricState(RememberedUserView rememberedUserView, RememberedUserState rememberedUserState) {
        rememberedUserView.e(rememberedUserState);
        rememberedUserView.getPrimaryButton().setBackgroundResource(R.drawable.component_ui_login_anim_onclick_button);
        Drawable background = rememberedUserView.getPrimaryButton().getBackground();
        AnimationDrawable animationDrawable = background instanceof AnimationDrawable ? (AnimationDrawable) background : null;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        rememberedUserView.getPrimaryButton().postDelayed(new q(rememberedUserView, rememberedUserState, 2), 850L);
    }

    public static final void access$showPrimaryButton(RememberedUserView rememberedUserView) {
        rememberedUserView.getButtonsContainer().setVisibility(0);
        rememberedUserView.getPrimaryButton().setVisibility(0);
    }

    public static void b(RememberedUserView this$0, boolean z10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getPasswordEditText().getText().length() == 0 && z10) {
            this$0.getButtonsContainer().setVisibility(0);
            this$0.getPrimaryButton().setVisibility(0);
            ViewKt.enable(this$0.getPrimaryButton(), Boolean.FALSE);
        }
    }

    public static void c(RememberedUserView this$0, RememberedUserState rememberedUserState) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rememberedUserState, "$rememberedUserState");
        this$0.f(rememberedUserState);
        ViewKt.visibility(this$0.getPrimaryButton(), Visibility.Gone);
        ViewKt.enable(this$0.getPrimaryButton(), Boolean.FALSE);
    }

    private final ConstraintLayout getAccessingBiometricsContainer() {
        ConstraintLayout accessingBiometricsContainer = getBinding().accessingBiometricsInclude.accessingBiometricsContainer;
        Intrinsics.checkNotNullExpressionValue(accessingBiometricsContainer, "accessingBiometricsContainer");
        return accessingBiometricsContainer;
    }

    private final AppCompatTextView getAccessingBiometricsMessage() {
        AppCompatTextView accessingBiometricsMessage = getBinding().accessingBiometricsInclude.accessingBiometricsMessage;
        Intrinsics.checkNotNullExpressionValue(accessingBiometricsMessage, "accessingBiometricsMessage");
        return accessingBiometricsMessage;
    }

    private final DefaultAnimationTemplate getAnimator() {
        return (DefaultAnimationTemplate) this.animator.getValue();
    }

    private final CellsCircleInitialsView getAvatar() {
        CellsCircleInitialsView rememberedUserAvatar = getBinding().rememberedUserAvatar;
        Intrinsics.checkNotNullExpressionValue(rememberedUserAvatar, "rememberedUserAvatar");
        return rememberedUserAvatar;
    }

    private final FrameLayout getAvatarContainer() {
        FrameLayout rememebredUserImageContainer = getBinding().rememebredUserImageContainer;
        Intrinsics.checkNotNullExpressionValue(rememebredUserImageContainer, "rememebredUserImageContainer");
        return rememebredUserImageContainer;
    }

    private final ViewRememberedUserBinding getBinding() {
        return (ViewRememberedUserBinding) this.binding.getValue();
    }

    private final ConstraintLayout getButtonsContainer() {
        ConstraintLayout buttonsContainer = getBinding().buttonsContainer;
        Intrinsics.checkNotNullExpressionValue(buttonsContainer, "buttonsContainer");
        return buttonsContainer;
    }

    private final AppCompatTextView getGreeting() {
        AppCompatTextView rememberedUserGreeting = getBinding().rememberedUserGreeting;
        Intrinsics.checkNotNullExpressionValue(rememberedUserGreeting, "rememberedUserGreeting");
        return rememberedUserGreeting;
    }

    private final ConstraintLayout getGreetingsContainer() {
        ConstraintLayout greetingsContainer = getBinding().greetingsContainer;
        Intrinsics.checkNotNullExpressionValue(greetingsContainer, "greetingsContainer");
        return greetingsContainer;
    }

    private final AppCompatImageView getImage() {
        AppCompatImageView rememberedUserImage = getBinding().rememberedUserImage;
        Intrinsics.checkNotNullExpressionValue(rememberedUserImage, "rememberedUserImage");
        return rememberedUserImage;
    }

    private final AppCompatTextView getName() {
        AppCompatTextView rememberedUserName = getBinding().rememberedUserName;
        Intrinsics.checkNotNullExpressionValue(rememberedUserName, "rememberedUserName");
        return rememberedUserName;
    }

    private final CellsEditText getPasswordEditText() {
        CellsEditText passwordEditText = getBinding().passwordEditText;
        Intrinsics.checkNotNullExpressionValue(passwordEditText, "passwordEditText");
        return passwordEditText;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CellsButton getPrimaryButton() {
        CellsButton primaryActionButton = getBinding().primaryActionButton;
        Intrinsics.checkNotNullExpressionValue(primaryActionButton, "primaryActionButton");
        return primaryActionButton;
    }

    private final CellsTextView getRememberPassword() {
        CellsTextView rememberPassword = getBinding().rememberPassword;
        Intrinsics.checkNotNullExpressionValue(rememberPassword, "rememberPassword");
        return rememberPassword;
    }

    private final CellsButton getSecondaryButton() {
        CellsButton secondaryActionButton = getBinding().secondaryActionButton;
        Intrinsics.checkNotNullExpressionValue(secondaryActionButton, "secondaryActionButton");
        return secondaryActionButton;
    }

    public final void d(TypedArray typedArray) {
        this.f28597t0 = typedArray.getColor(R.styleable.LoginView_loginView_avatarTopColor, ContextCompat.getColor(getContext(), R.color.remembered_user_avatar_top_color));
        this.f28598u0 = typedArray.getColor(R.styleable.LoginView_loginView_avatarBottomColor, ContextCompat.getColor(getContext(), R.color.remembered_user_avatar_bottom_color));
        getAvatar().configureColors(this.f28597t0, this.f28598u0);
    }

    public final void e(final RememberedUserState rememberedUserState) {
        Button secondaryButton;
        Button primaryButton;
        g(rememberedUserState);
        CellsButton primaryButton2 = getPrimaryButton();
        Visibility visibility = Visibility.Visible;
        ViewKt.visibility(primaryButton2, visibility);
        ViewKt.enable(primaryButton2, Boolean.TRUE);
        BiometricState biometricState = rememberedUserState.getBiometricState();
        TextSettings label = null;
        TextViewKt.settings(primaryButton2, (biometricState == null || (primaryButton = biometricState.getPrimaryButton()) == null) ? null : primaryButton.getLabel());
        getPrimaryButton().setOnClickListener(new c(this, 0));
        CellsButton secondaryButton2 = getSecondaryButton();
        ViewKt.visibility(secondaryButton2, visibility);
        BiometricState biometricState2 = rememberedUserState.getBiometricState();
        if (biometricState2 != null && (secondaryButton = biometricState2.getSecondaryButton()) != null) {
            label = secondaryButton.getLabel();
        }
        TextViewKt.settings(secondaryButton2, label);
        secondaryButton2.setOnClickListener(new View.OnClickListener() { // from class: r5.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RememberedUserView.c(this.f92930p0, rememberedUserState);
            }
        });
        getPasswordEditText().setText("");
        CellsEditText passwordEditText = getPasswordEditText();
        Visibility visibility2 = Visibility.Gone;
        ViewKt.visibility(passwordEditText, visibility2);
        ViewKt.visibility(getRememberPassword(), visibility2);
        ViewExtensionKt.centerVertically(getGreetingsContainer());
        ViewKt.visibility(getButtonsContainer(), visibility);
        getAccessingBiometricsContainer().setVisibility(8);
    }

    public final void f(RememberedUserState rememberedUserState) {
        Unit unit;
        g(rememberedUserState);
        CellsButton primaryButton = getPrimaryButton();
        primaryButton.setOnClickListener(new r5.b(this, 0));
        Button primaryButton2 = rememberedUserState.getPrimaryButton();
        TextViewKt.settings(primaryButton, primaryButton2 != null ? primaryButton2.getLabel() : null);
        primaryButton.setVisibility(8);
        ViewKt.enable(primaryButton, Boolean.FALSE);
        InputFieldConfig passwordInputFieldConfig = rememberedUserState.getPasswordInputFieldConfig();
        if (passwordInputFieldConfig != null) {
            getPasswordEditText().setConfig(passwordInputFieldConfig.toMap());
            ViewKt.visibility(getPasswordEditText(), Visibility.Visible);
            InputFieldData inputFieldData = new InputFieldData(View.generateViewId(), passwordInputFieldConfig.getInputFieldIdentifier(), "", getPasswordEditText().getValidations(), new DefaultEditTextValidator());
            CellsEditText passwordEditText = getPasswordEditText();
            passwordEditText.setOnTextChangeListener(new g(this, inputFieldData));
            passwordEditText.setOnTextChangedListener(new h(this));
            passwordEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: r5.a
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z10) {
                    RememberedUserView.b(this.f92923a, z10);
                }
            });
            if (passwordInputFieldConfig.getHasFocus()) {
                passwordEditText.requestFocusEditText();
            }
            this.viewModel.addFormField(inputFieldData);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            ViewExtensionKt.hide(getPasswordEditText());
        }
        CellsTextView rememberPassword = getRememberPassword();
        ViewKt.visibility(getRememberPassword(), Visibility.Visible);
        rememberPassword.setOnClickListener(new d(this, 0));
        ButtonLink rememberPassword2 = rememberedUserState.getRememberPassword();
        TextViewKt.text(rememberPassword, rememberPassword2 != null ? rememberPassword2.getText() : null);
        ButtonLink rememberPassword3 = rememberedUserState.getRememberPassword();
        rememberPassword.setVisibility((rememberPassword3 == null || !rememberPassword3.getVisibility()) ? 8 : 0);
        CellsTextViewAccessibilityKt.setImportantForAccessibilityForVisibility(rememberPassword);
        getAccessingBiometricsContainer().setVisibility(8);
        getButtonsContainer().setVisibility(8);
        getSecondaryButton().setVisibility(8);
        ViewExtensionKt.alignmentTop(getGreetingsContainer());
    }

    public final void g(RememberedUserState rememberedUserState) {
        RememberedUserImage image = rememberedUserState.getImage();
        if ((image != null ? image.getImageBase64() : null) != null) {
            String imageBase64 = image.getImageBase64();
            getAvatarContainer().setVisibility(0);
            getImage().setVisibility(0);
            ImageViewExtensionKt.setCircularBitmap(getImage(), imageBase64);
            getAvatar().setVisibility(8);
        } else {
            if ((image != null ? image.getImageId() : null) != null) {
                ImageSettings imageId = image.getImageId();
                getAvatarContainer().setVisibility(0);
                getImage().setVisibility(0);
                ImageViewKt.settings(getImage(), imageId);
                getAvatar().setVisibility(8);
            } else {
                if ((image != null ? image.getAvatar() : null) != null) {
                    String avatar = image.getAvatar();
                    getAvatarContainer().setVisibility(0);
                    getImage().setVisibility(8);
                    getAvatar().setVisibility(0);
                    getAvatar().setInitials(avatar);
                } else {
                    getAvatarContainer().setVisibility(8);
                }
            }
        }
        TextViewKt.settings(getGreeting(), rememberedUserState.getGreeting());
        TextSettings userName = rememberedUserState.getUserName();
        if (userName == null) {
            getName().setVisibility(8);
            return;
        }
        AppCompatTextView name = getName();
        name.setVisibility(0);
        TextViewKt.settings(name, userName);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f28593p0.getCoroutineContext();
    }

    @NotNull
    public final RememberedUserViewModel getViewModel() {
        return this.viewModel;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        resetPassword();
    }

    public final void resetPassword() {
        getPasswordEditText().setText("");
    }

    public final void startAnimation() {
        getAnimator().animate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RememberedUserView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RememberedUserView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, false, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RememberedUserView(Context context, AttributeSet attributeSet, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        attributeSet = (i11 & 2) != 0 ? null : attributeSet;
        this(context, attributeSet, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? Companion.access$initIsDarkModeEnabled(INSTANCE, context, attributeSet) : z10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RememberedUserView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, boolean z10) {
        super(Companion.access$getContextThemeWrapper(INSTANCE, z10, context), attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28593p0 = CoroutineScopeKt.MainScope();
        this.viewModel = new RememberedUserViewModel(new FormValidatorHandler());
        this.binding = LazyKt__LazyJVMKt.lazy(new b());
        this.animator = LazyKt__LazyJVMKt.lazy(new a());
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.LoginView, i10, 0);
        try {
            Intrinsics.checkNotNull(typedArrayObtainStyledAttributes);
            d(typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.LoginView_loginView_imageSize, getResources().getDimensionPixelSize(R.dimen.remembered_user_default_size_image));
            typedArrayObtainStyledAttributes.recycle();
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new RememberedUserView$observeState$1(this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new f(this, null), 3, null);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
