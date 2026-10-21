package com.bbva.notifications.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.cellscore.web.WebController;
import com.bbva.glomoconfig.constants.ShortcutConstants;
import com.bbva.glomohybrid.base.AppLifeCycleCreationJobHandler;
import com.bbva.glomohybrid.base.datasource.UserStoredDatasource;
import com.bbva.glomohybrid.base.deeplink.model.DeeplinkConfig;
import com.bbva.glomohybrid.base.deeplink.model.LinkParams;
import com.bbva.glomohybrid.base.deeplink.model.LinkParamsKt;
import com.bbva.glomohybrid.base.deeplink.modules.DynamicLinkModuleKt;
import com.bbva.glomohybrid.base.router.ActivityRouter;
import com.bbva.glomohybrid.base.router.DefaultActivityRouter;
import com.bbva.glomohybrid.base.webview.WebActions;
import com.bbva.notifications.viewmodel.NotificationViewModel;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: NotificationActivity.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\t\u001a\u00020\u0004H\u0014¨\u0006\r"}, d2 = {"Lcom/bbva/notifications/activity/NotificationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/content/Intent;", "intent", "onNewIntent", "onResume", "<init>", "()V", "Companion", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nNotificationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationActivity.kt\ncom/bbva/notifications/activity/NotificationActivity\n+ 2 ComponentCallbackExt.kt\norg/koin/android/ext/android/ComponentCallbackExtKt\n+ 3 ActivityVM.kt\norg/koin/androidx/viewmodel/ext/android/ActivityVMKt\n+ 4 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,117:1\n40#2,5:118\n40#2,5:123\n52#2,5:134\n41#3,6:128\n133#4:139\n*S KotlinDebug\n*F\n+ 1 NotificationActivity.kt\ncom/bbva/notifications/activity/NotificationActivity\n*L\n38#1:118,5\n40#1:123,5\n73#1:134,5\n42#1:128,6\n73#1:139\n*E\n"})
public final class NotificationActivity extends AppCompatActivity {

    @NotNull
    public static final String ERROR = "ERROR";

    @NotNull
    public static final String ID = "notifications";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Lazy f35281p0 = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Lazy f35282q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final Lazy f35283r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final Lazy f35284s0;

    /* JADX INFO: compiled from: NotificationActivity.kt */
    public static final class a extends Lambda implements Function0<DefaultActivityRouter> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final DefaultActivityRouter invoke() {
            Object obj = ComponentManager.get(WebActions.ID);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            return new DefaultActivityRouter(NotificationActivity.this, null, (WebController) obj);
        }
    }

    /* JADX INFO: compiled from: NotificationActivity.kt */
    public static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Intent f35287q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Intent intent) {
            super(0);
            this.f35287q0 = intent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            NotificationActivity notificationActivity = NotificationActivity.this;
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(notificationActivity), Dispatchers.getMain(), null, new com.bbva.notifications.activity.a(this.f35287q0, notificationActivity, null), 2, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NotificationActivity.kt */
    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            NotificationActivity notificationActivity = NotificationActivity.this;
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(notificationActivity), Dispatchers.getMain(), null, new com.bbva.notifications.activity.b(notificationActivity, null), 2, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NotificationActivity.kt */
    public static final class d implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f35289a;

        public d(va.a function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f35289a = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f35289a, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f35289a;
        }

        public final int hashCode() {
            return this.f35289a.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f35289a.invoke(obj);
        }
    }

    /* JADX INFO: compiled from: NotificationActivity.kt */
    public static final class e extends Lambda implements Function0<ParametersHolder> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(Integer.valueOf(NotificationActivity.this.hashCode()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f35282q0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<UserStoredDatasource>() { // from class: com.bbva.notifications.activity.NotificationActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.glomohybrid.base.datasource.UserStoredDatasource, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final UserStoredDatasource invoke() {
                return AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(UserStoredDatasource.class), qualifier, objArr);
            }
        });
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.f35283r0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<AppLifeCycleCreationJobHandler>() { // from class: com.bbva.notifications.activity.NotificationActivity$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.glomohybrid.base.AppLifeCycleCreationJobHandler, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AppLifeCycleCreationJobHandler invoke() {
                return AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(AppLifeCycleCreationJobHandler.class), objArr2, objArr3);
            }
        });
        final e eVar = new e();
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.NONE;
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.f35284s0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<NotificationViewModel>() { // from class: com.bbva.notifications.activity.NotificationActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.ViewModel, com.bbva.notifications.viewmodel.NotificationViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NotificationViewModel invoke() {
                CreationExtras defaultViewModelCreationExtras;
                Qualifier qualifier2 = objArr4;
                Function0 function0 = eVar;
                ComponentActivity componentActivity = this;
                ViewModelStore viewModelStore = componentActivity.getViewModelStore();
                Function0 function1 = objArr5;
                if (function1 == null || (defaultViewModelCreationExtras = (CreationExtras) function1.invoke()) == null) {
                    defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                }
                CreationExtras creationExtras = defaultViewModelCreationExtras;
                Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(componentActivity);
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NotificationViewModel.class);
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return GetViewModelKt.resolveViewModel(orCreateKotlinClass, viewModelStore, (4 & 4) != 0 ? null : null, creationExtras, (4 & 16) != 0 ? null : qualifier2, koinScope, (4 & 64) != 0 ? null : function0);
            }
        });
    }

    public static final void access$handleDeepLink(NotificationActivity notificationActivity) {
        Unit unit;
        String string;
        Bundle extras = notificationActivity.getIntent().getExtras();
        Lazy lazy = notificationActivity.f35284s0;
        Unit unit2 = null;
        if (extras == null || (string = extras.getString(ShortcutConstants.EXTRA_SHORTCUT_ID)) == null) {
            unit = null;
        } else {
            ((NotificationViewModel) lazy.getValue()).handleShortcut(string);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            Intent intent = notificationActivity.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            LinkParams linkParams = LinkParamsKt.toLinkParams(intent, (DeeplinkConfig) AndroidKoinScopeExtKt.getKoinScope(notificationActivity).get(Reflection.getOrCreateKotlinClass(DeeplinkConfig.class), DynamicLinkModuleKt.getDeeplinkConfig(), null), notificationActivity.getCallingPackage());
            if (linkParams != null) {
                ((NotificationViewModel) lazy.getValue()).handleLink(linkParams);
                unit2 = Unit.INSTANCE;
            }
            if (unit2 == null) {
                Bundle EMPTY = Bundle.EMPTY;
                Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
                notificationActivity.f(EMPTY, false);
            }
        }
    }

    public final void f(Bundle bundle, boolean z10) {
        if (isTaskRoot() || z10) {
            if (!isTaskRoot() && z10 && ((UserStoredDatasource) this.f35282q0.getValue()).isLogged()) {
                ActivityRouter.DefaultImpls.navigateTo$default((ActivityRouter) this.f35281p0.getValue(), "cellsweb", null, null, null, 14, null);
            } else {
                Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.putExtras(bundle);
                    launchIntentForPackage.setFlags(268468224);
                    startActivity(launchIntentForPackage);
                }
            }
        }
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((NotificationViewModel) this.f35284s0.getValue()).getDeeplinkInfo().observe(this, new d(new va.a(this)));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        ((AppLifeCycleCreationJobHandler) this.f35283r0.getValue()).invokeOnCompletion(new b(intent));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((AppLifeCycleCreationJobHandler) this.f35283r0.getValue()).invokeOnCompletion(new c());
    }
}
