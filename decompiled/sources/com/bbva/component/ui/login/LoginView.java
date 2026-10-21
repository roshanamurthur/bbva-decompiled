package com.bbva.component.ui.login;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.view.ContextThemeWrapper;
import com.bbva.component.ui.login.credentials.LoginCredentialsView;
import com.bbva.component.ui.login.model.LoginCredentialsState;
import com.bbva.component.ui.login.model.LoginState;
import com.bbva.component.ui.login.model.LoginViewType;
import com.bbva.component.ui.login.model.RememberedUserState;
import com.bbva.component.ui.login.remembereduser.RememberedUserView;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
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

/* JADX INFO: compiled from: LoginView.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B1\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/bbva/component/ui/login/LoginView;", "Landroid/widget/FrameLayout;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/bbva/component/ui/login/LoginViewViewModel;", "q0", "Lcom/bbva/component/ui/login/LoginViewViewModel;", "getViewModel", "()Lcom/bbva/component/ui/login/LoginViewViewModel;", "viewModel", "Lcom/bbva/component/ui/login/credentials/LoginCredentialsView;", "r0", "Lkotlin/Lazy;", "getLoginCredentialsView", "()Lcom/bbva/component/ui/login/credentials/LoginCredentialsView;", "loginCredentialsView", "Lcom/bbva/component/ui/login/remembereduser/RememberedUserView;", "s0", "getRememberedUserView", "()Lcom/bbva/component/ui/login/remembereduser/RememberedUserView;", "rememberedUserView", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "isDarkModeEnabled", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V", "Companion", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
public final class LoginView extends FrameLayout implements CoroutineScope {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f28459p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LoginViewViewModel viewModel;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy loginCredentialsView;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy rememberedUserView;

    /* JADX INFO: compiled from: LoginView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/component/ui/login/LoginView$Companion;", "", "<init>", "()V", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nLoginView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginView.kt\ncom/bbva/component/ui/login/LoginView$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
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

    /* JADX INFO: compiled from: LoginView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoginViewType.values().length];
            try {
                iArr[LoginViewType.CREDENTIALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoginViewType.REMEMBERED_USER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoginViewType.BIOMETRICS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LoginViewType.RESET_PASSWORD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: LoginView.kt */
    public static final class a extends Lambda implements Function0<LoginCredentialsView> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f28463p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f28464q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f28465r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, int i10, boolean z10) {
            super(0);
            this.f28463p0 = context;
            this.f28464q0 = i10;
            this.f28465r0 = z10;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LoginCredentialsView invoke() {
            return new LoginCredentialsView(this.f28463p0, null, this.f28464q0, this.f28465r0, 2, null);
        }
    }

    /* JADX INFO: compiled from: LoginView.kt */
    public static final class b extends Lambda implements Function0<RememberedUserView> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f28466p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f28467q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f28468r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, int i10, boolean z10) {
            super(0);
            this.f28466p0 = context;
            this.f28467q0 = i10;
            this.f28468r0 = z10;
        }

        @Override // kotlin.jvm.functions.Function0
        public final RememberedUserView invoke() {
            return new RememberedUserView(this.f28466p0, null, this.f28467q0, this.f28468r0, 2, null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LoginView(@NotNull Context context) {
        this(context, null, 0, false, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void access$updateView(LoginView loginView, LoginState loginState) {
        loginView.getClass();
        int i10 = WhenMappings.$EnumSwitchMapping$0[loginState.getLoginType().ordinal()];
        LoginViewViewModel loginViewViewModel = loginView.viewModel;
        if (i10 == 1) {
            LoginCredentialsState loginCredentialsState = loginState.getLoginCredentialsState();
            if (loginCredentialsState != null) {
                loginView.removeAllViews();
                loginView.addView(loginView.getLoginCredentialsView());
                loginViewViewModel.mergeEvents(loginView.getLoginCredentialsView().getViewModel().getOnEvents());
                loginView.getLoginCredentialsView().getViewModel().updateModel(loginCredentialsState);
                loginView.getRememberedUserView().setVisibility(8);
                loginView.getLoginCredentialsView().setVisibility(0);
                if (loginCredentialsState.getShowAnimation()) {
                    loginView.getLoginCredentialsView().startAnimation();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 != 4) {
                return;
            }
            loginView.getLoginCredentialsView().resetPassword();
            loginView.getRememberedUserView().resetPassword();
            return;
        }
        RememberedUserState rememberedUserState = loginState.getRememberedUserState();
        if (rememberedUserState != null) {
            loginView.removeAllViews();
            loginView.addView(loginView.getRememberedUserView());
            loginViewViewModel.mergeEvents(loginView.getRememberedUserView().getViewModel().getOnEvents());
            loginView.getRememberedUserView().getViewModel().updateModel(rememberedUserState);
            loginView.getLoginCredentialsView().setVisibility(8);
            loginView.getRememberedUserView().setVisibility(0);
            loginView.getRememberedUserView().startAnimation();
        }
    }

    private final LoginCredentialsView getLoginCredentialsView() {
        return (LoginCredentialsView) this.loginCredentialsView.getValue();
    }

    private final RememberedUserView getRememberedUserView() {
        return (RememberedUserView) this.rememberedUserView.getValue();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f28459p0.getCoroutineContext();
    }

    @NotNull
    public final LoginViewViewModel getViewModel() {
        return this.viewModel;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LoginView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LoginView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, false, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoginView(Context context, AttributeSet attributeSet, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        attributeSet = (i11 & 2) != 0 ? null : attributeSet;
        this(context, attributeSet, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? Companion.access$initIsDarkModeEnabled(INSTANCE, context, attributeSet) : z10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LoginView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, boolean z10) {
        super(Companion.access$getContextThemeWrapper(INSTANCE, z10, context), attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28459p0 = CoroutineScopeKt.MainScope();
        this.viewModel = new LoginViewViewModel();
        this.loginCredentialsView = LazyKt__LazyJVMKt.lazy(new a(context, i10, z10));
        this.rememberedUserView = LazyKt__LazyJVMKt.lazy(new b(context, i10, z10));
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new n5.a(this, null), 3, null);
    }
}
