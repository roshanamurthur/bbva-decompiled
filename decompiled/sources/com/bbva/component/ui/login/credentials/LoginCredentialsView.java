package com.bbva.component.ui.login.credentials;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt;
import com.bbva.cells.componentkit.dsl.TextViewKt;
import com.bbva.cells.componentkit.dsl.ViewKt;
import com.bbva.cellswidgets.CellsButton;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.component.ui.login.R;
import com.bbva.component.ui.login.animations.DefaultAnimationTemplate;
import com.bbva.component.ui.login.credentials.documentlist.DocumentListSelector;
import com.bbva.component.ui.login.databinding.ViewLoginCredentialsBinding;
import com.bbva.component.ui.login.extensions.CellsTextViewAccessibilityKt;
import com.bbva.component.ui.login.handler.FormValidatorHandler;
import com.bbva.component.ui.login.handler.validations.DefaultEditTextValidator;
import com.bbva.component.ui.login.handler.validations.DocumentSelectorValidator;
import com.bbva.component.ui.login.model.BuilderType;
import com.bbva.component.ui.login.model.Button;
import com.bbva.component.ui.login.model.ButtonLink;
import com.bbva.component.ui.login.model.DocumentSelector;
import com.bbva.component.ui.login.model.InputFieldConfig;
import com.bbva.component.ui.login.model.InputFieldData;
import com.bbva.component.ui.login.model.InputFieldIdentifier;
import com.bbva.component.ui.login.model.InputForm;
import com.bbva.component.ui.login.model.LoginCredentialsState;
import com.bbva.component.ui.login.view.DocumentSelectorView;
import com.bbva.component.ui.login.view.FormInputView;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
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
import p5.c;
import p5.d;
import p5.e;
import p5.f;
import p5.g;
import p5.h;

/* JADX INFO: compiled from: LoginCredentialsView.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 92\u00020\u00012\u00020\u0002:\u00019B1\b\u0007\u0012\u0006\u00104\u001a\u000203\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0005\u001a\u00020\u0003R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u0006:"}, d2 = {"Lcom/bbva/component/ui/login/credentials/LoginCredentialsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlinx/coroutines/CoroutineScope;", "", "startAnimation", "resetPassword", "Landroid/util/AttributeSet;", "p0", "Landroid/util/AttributeSet;", "getAttrs", "()Landroid/util/AttributeSet;", "attrs", "", "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getDefStyleAttr", "()I", "defStyleAttr", "Lcom/bbva/component/ui/login/credentials/LoginCredentialsFormViewModel;", "s0", "Lcom/bbva/component/ui/login/credentials/LoginCredentialsFormViewModel;", "getViewModel", "()Lcom/bbva/component/ui/login/credentials/LoginCredentialsFormViewModel;", "viewModel", "Lcom/bbva/component/ui/login/databinding/ViewLoginCredentialsBinding;", "t0", "Lkotlin/Lazy;", "getBinding", "()Lcom/bbva/component/ui/login/databinding/ViewLoginCredentialsBinding;", "binding", "Lcom/bbva/component/ui/login/animations/DefaultAnimationTemplate;", "u0", "getAnimator", "()Lcom/bbva/component/ui/login/animations/DefaultAnimationTemplate;", "animator", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroidx/appcompat/widget/LinearLayoutCompat;", "getFormContainer", "()Landroidx/appcompat/widget/LinearLayoutCompat;", "formContainer", "Lcom/bbva/cellswidgets/CellsTextView;", "getRememberPassword", "()Lcom/bbva/cellswidgets/CellsTextView;", "rememberPassword", "Lcom/bbva/cellswidgets/CellsButton;", "getLoginButton", "()Lcom/bbva/cellswidgets/CellsButton;", "loginButton", "Landroid/content/Context;", "context", "", "isDarkModeEnabled", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V", "Companion", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLoginCredentialsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginCredentialsView.kt\ncom/bbva/component/ui/login/credentials/LoginCredentialsView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,249:1\n2634#2:250\n1#3:251\n1#3:254\n1313#4,2:252\n1313#4,2:255\n*S KotlinDebug\n*F\n+ 1 LoginCredentialsView.kt\ncom/bbva/component/ui/login/credentials/LoginCredentialsView\n*L\n101#1:250\n101#1:251\n112#1:252,2\n220#1:255,2\n*E\n"})
public final class LoginCredentialsView extends ConstraintLayout implements CoroutineScope {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final AttributeSet attrs;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public final int defStyleAttr;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f28485r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LoginCredentialsFormViewModel viewModel;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy binding;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy animator;

    /* JADX INFO: compiled from: LoginCredentialsView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/component/ui/login/credentials/LoginCredentialsView$Companion;", "", "<init>", "()V", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nLoginCredentialsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginCredentialsView.kt\ncom/bbva/component/ui/login/credentials/LoginCredentialsView$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,249:1\n1#2:250\n*E\n"})
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
    }

    /* JADX INFO: compiled from: LoginCredentialsView.kt */
    public static final class a extends Lambda implements Function0<DefaultAnimationTemplate> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final DefaultAnimationTemplate invoke() {
            return new DefaultAnimationTemplate(LoginCredentialsView.this);
        }
    }

    /* JADX INFO: compiled from: LoginCredentialsView.kt */
    public static final class b extends Lambda implements Function0<ViewLoginCredentialsBinding> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewLoginCredentialsBinding invoke() {
            LoginCredentialsView loginCredentialsView = LoginCredentialsView.this;
            return ViewLoginCredentialsBinding.inflate(LayoutInflater.from(loginCredentialsView.getContext()), loginCredentialsView);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LoginCredentialsView(@NotNull Context context) {
        this(context, null, 0, false, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void access$handleState(LoginCredentialsView loginCredentialsView, LoginCredentialsState loginCredentialsState) {
        loginCredentialsView.getClass();
        if (loginCredentialsState.getBuilderType() != BuilderType.CREATE) {
            List<InputForm> inputs = loginCredentialsState.getInputs();
            InputForm inputForm = inputs != null ? (InputForm) CollectionsKt___CollectionsKt.first((List) inputs) : null;
            Intrinsics.checkNotNull(inputForm, "null cannot be cast to non-null type com.bbva.component.ui.login.model.InputFieldConfig");
            InputFieldConfig inputFieldConfig = (InputFieldConfig) inputForm;
            for (View view : ViewGroupKt.getChildren(loginCredentialsView.getFormContainer())) {
                if (view instanceof FormInputView) {
                    FormInputView formInputView = (FormInputView) view;
                    if (formInputView.getFormInputData().getInputFieldIdentifier() == inputFieldConfig.getInputFieldIdentifier()) {
                        InputFieldConfig formInputData = formInputView.getFormInputData();
                        formInputView.updateConfig(formInputData.copy((871 & 1) != 0 ? formInputData.inputFieldIdentifier : null, (871 & 2) != 0 ? formInputData.hint : null, (871 & 4) != 0 ? formInputData.showLeftIcon : false, (871 & 8) != 0 ? formInputData.inputType : inputFieldConfig.getInputType(), (871 & 16) != 0 ? formInputData.maxLength : inputFieldConfig.getMaxLength(), (871 & 32) != 0 ? formInputData.mask : null, (871 & 64) != 0 ? formInputData.customCharactersRegex : null, (871 & 128) != 0 ? formInputData.validations : inputFieldConfig.getValidations(), (871 & 256) != 0 ? formInputData.com.bbva.nativesettings.common.Constants.ACCESSIBILITY java.lang.String : null, (871 & 512) != 0 ? formInputData.hasFocus : false));
                    }
                }
            }
            return;
        }
        LoginCredentialsFormViewModel loginCredentialsFormViewModel = loginCredentialsView.viewModel;
        loginCredentialsFormViewModel.initialize();
        loginCredentialsView.getFormContainer().removeAllViews();
        List<InputForm> inputs2 = loginCredentialsState.getInputs();
        if (inputs2 != null) {
            for (InputForm inputForm2 : inputs2) {
                if (inputForm2 instanceof DocumentSelector) {
                    DocumentSelector documentSelector = (DocumentSelector) inputForm2;
                    DocumentSelectorValidator documentSelectorValidator = new DocumentSelectorValidator();
                    Context context = loginCredentialsView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    DocumentSelectorView documentSelectorView = new DocumentSelectorView(context, documentSelector);
                    loginCredentialsFormViewModel.addFormFieldData(new InputFieldData(View.generateViewId(), documentSelector.getInputFieldIdentifier(), "", CollectionsKt__CollectionsKt.emptyList(), documentSelectorValidator));
                    loginCredentialsView.getFormContainer().addView(documentSelectorView);
                    documentSelectorView.setOnClickListener(new e(loginCredentialsView, documentSelector));
                    BuildersKt__Builders_commonKt.launch$default(loginCredentialsView, null, null, new f(loginCredentialsView, documentSelectorView, null), 3, null);
                } else if (inputForm2 instanceof InputFieldConfig) {
                    InputFieldConfig inputFieldConfig2 = (InputFieldConfig) inputForm2;
                    DefaultEditTextValidator defaultEditTextValidator = new DefaultEditTextValidator();
                    Context context2 = loginCredentialsView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    FormInputView formInputView2 = new FormInputView(context2, inputFieldConfig2);
                    formInputView2.setText("");
                    InputFieldData inputFieldData = new InputFieldData(View.generateViewId(), inputFieldConfig2.getInputFieldIdentifier(), "", formInputView2.validations(), defaultEditTextValidator);
                    formInputView2.onTextChangeListener(new g(loginCredentialsView, inputFieldData));
                    if (inputFieldConfig2.getInputFieldIdentifier() == InputFieldIdentifier.PASSWORD) {
                        formInputView2.onTextLengthChangeListener(new h(loginCredentialsView));
                    }
                    loginCredentialsFormViewModel.addFormFieldData(inputFieldData);
                    loginCredentialsView.getFormContainer().addView(formInputView2);
                }
            }
        }
        CellsButton loginButton = loginCredentialsView.getLoginButton();
        loginButton.setOnClickListener(new p5.a(loginCredentialsView, 0));
        Button loginButton2 = loginCredentialsState.getLoginButton();
        TextViewKt.settings(loginButton, loginButton2 != null ? loginButton2.getLabel() : null);
        ViewKt.enable(loginButton, Boolean.FALSE);
        loginButton.setVisibility(8);
        CellsTextView rememberPassword = loginCredentialsView.getRememberPassword();
        rememberPassword.setOnClickListener(new p5.b(loginCredentialsView, 0));
        ButtonLink rememberPassword2 = loginCredentialsState.getRememberPassword();
        TextViewKt.text(rememberPassword, rememberPassword2 != null ? rememberPassword2.getText() : null);
        ButtonLink rememberPassword3 = loginCredentialsState.getRememberPassword();
        rememberPassword.setVisibility((rememberPassword3 == null || !rememberPassword3.getVisibility()) ? 8 : 0);
        CellsTextViewAccessibilityKt.setImportantForAccessibilityForVisibility(rememberPassword);
    }

    private final DefaultAnimationTemplate getAnimator() {
        return (DefaultAnimationTemplate) this.animator.getValue();
    }

    private final ViewLoginCredentialsBinding getBinding() {
        return (ViewLoginCredentialsBinding) this.binding.getValue();
    }

    private final LinearLayoutCompat getFormContainer() {
        LinearLayoutCompat formContainer = getBinding().formContainer;
        Intrinsics.checkNotNullExpressionValue(formContainer, "formContainer");
        return formContainer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CellsButton getLoginButton() {
        CellsButton primaryButton = getBinding().primaryButton;
        Intrinsics.checkNotNullExpressionValue(primaryButton, "primaryButton");
        return primaryButton;
    }

    private final CellsTextView getRememberPassword() {
        CellsTextView rememberPassword = getBinding().rememberPassword;
        Intrinsics.checkNotNullExpressionValue(rememberPassword, "rememberPassword");
        return rememberPassword;
    }

    @Nullable
    public final AttributeSet getAttrs() {
        return this.attrs;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f28485r0.getCoroutineContext();
    }

    public final int getDefStyleAttr() {
        return this.defStyleAttr;
    }

    @NotNull
    public final LoginCredentialsFormViewModel getViewModel() {
        return this.viewModel;
    }

    public final void resetPassword() {
        for (View view : ViewGroupKt.getChildren(getFormContainer())) {
            if (view instanceof FormInputView) {
                FormInputView formInputView = (FormInputView) view;
                if (formInputView.getFormInputData().getInputFieldIdentifier() == InputFieldIdentifier.PASSWORD) {
                    formInputView.setText("");
                }
            }
        }
    }

    public final void startAnimation() {
        getAnimator().animate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LoginCredentialsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LoginCredentialsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, false, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoginCredentialsView(Context context, AttributeSet attributeSet, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        attributeSet = (i11 & 2) != 0 ? null : attributeSet;
        this(context, attributeSet, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? Companion.access$initIsDarkModeEnabled(INSTANCE, context, attributeSet) : z10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LoginCredentialsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, boolean z10) {
        super(Companion.access$getContextThemeWrapper(INSTANCE, z10, context), attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.attrs = attributeSet;
        this.defStyleAttr = i10;
        this.f28485r0 = CoroutineScopeKt.MainScope();
        this.viewModel = new LoginCredentialsFormViewModel(new FormValidatorHandler(), new DocumentListSelector(context));
        this.binding = LazyKt__LazyJVMKt.lazy(new b());
        this.animator = LazyKt__LazyJVMKt.lazy(new a());
        context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.LoginView, i10, 0);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new c(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new d(this, null), 3, null);
    }
}
