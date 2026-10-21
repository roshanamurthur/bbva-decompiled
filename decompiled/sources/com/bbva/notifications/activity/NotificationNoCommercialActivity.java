package com.bbva.notifications.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.cellscore.web.WebController;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.component.ui.loader.LoaderSpinnerViewModel;
import com.bbva.component.ui.shortcuts.model.ShortcutsConfiguration;
import com.bbva.component.ui.shortcuts.model.ShortcutsState;
import com.bbva.glomoconfig.factory.ViewComponentFactory;
import com.bbva.glomohybrid.base.AppLifeCycleCreationJobHandler;
import com.bbva.glomohybrid.base.activity.BaseActivity;
import com.bbva.glomohybrid.base.deeplink.model.LinkParams;
import com.bbva.glomohybrid.base.extensions.BundleExtensionsKt;
import com.bbva.glomohybrid.base.extensions.ContextExtensionKt;
import com.bbva.glomohybrid.base.router.ActivityRouter;
import com.bbva.glomohybrid.base.router.DefaultActivityRouter;
import com.bbva.glomohybrid.base.webview.WebActions;
import com.bbva.glomohybrid.infoscreen.fragment.InfoScreenType;
import com.bbva.glomohybrid.infoscreen.notification.NotificationErrorFragment;
import com.bbva.glomohybrid.infoscreen.notification.NotificationTimerExpiredRunningErrorFragment;
import com.bbva.notifications.NotificationType;
import com.bbva.notifications.R;
import com.bbva.notifications.adapter.NotificationAdapter;
import com.bbva.notifications.databinding.ActivityNotificationNoCommercialBinding;
import com.bbva.notifications.databinding.ViewShortcutsBinding;
import com.bbva.notifications.extensions.NotificationShortcutItemModelExtensionsKt;
import com.bbva.notifications.model.NotificationNoCommercialData;
import com.bbva.notifications.model.NotificationShortcutItemModel;
import com.bbva.notifications.model.NotificationView;
import com.bbva.notifications.model.Timer;
import com.bbva.notifications.viewmodel.NotificationDetailViewModel;
import com.bbva.ui.components.timer.TimeFormat;
import com.bbva.ui.components.timer.TimerProgressView;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.l;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: NotificationNoCommercialActivity.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\u0012\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014J\u0012\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¨\u0006\u0015"}, d2 = {"Lcom/bbva/notifications/activity/NotificationNoCommercialActivity;", "Lcom/bbva/glomohybrid/base/activity/BaseActivity;", "Landroid/content/DialogInterface$OnDismissListener;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/MenuItem;", AnalyticsConstants.Key.ITEM, "", "onOptionsItemSelected", "onBackPressed", "Landroid/content/Intent;", "intent", "onNewIntent", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "<init>", "()V", "Companion", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nNotificationNoCommercialActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationNoCommercialActivity.kt\ncom/bbva/notifications/activity/NotificationNoCommercialActivity\n+ 2 ContextExtension.kt\ncom/bbva/glomohybrid/base/extensions/ContextExtensionKt\n+ 3 ActivityVM.kt\norg/koin/androidx/viewmodel/ext/android/ActivityVMKt\n+ 4 ComponentCallbackExt.kt\norg/koin/android/ext/android/ComponentCallbackExtKt\n*L\n1#1,348:1\n71#2,3:349\n71#2,3:352\n41#3,6:355\n40#4,5:361\n*S KotlinDebug\n*F\n+ 1 NotificationNoCommercialActivity.kt\ncom/bbva/notifications/activity/NotificationNoCommercialActivity\n*L\n64#1:349,3\n68#1:352,3\n72#1:355,6\n80#1:361,5\n*E\n"})
public final class NotificationNoCommercialActivity extends BaseActivity implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String ID = "notification-detail";

    @NotNull
    public static final String KEY_NOTIFICATION_ERROR_FRAGMENT = "key_notification_error_fragment";

    @NotNull
    public static final String NOTIFICATION_INTENT_DATA = "notification_data";

    @NotNull
    public static final String NOTIFICATION_INTENT_DETAIL = "notification_detail";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final Lazy f35301s0 = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final Lazy f35302t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final Lazy f35303u0;

    @NotNull
    public final Lazy v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final Lazy f35304w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final Lazy f35305x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final Lazy f35306y0;

    /* JADX INFO: compiled from: NotificationNoCommercialActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bbva/notifications/activity/NotificationNoCommercialActivity$Companion;", "", "()V", "ID", "", "KEY_NOTIFICATION_ERROR_FRAGMENT", "NOTIFICATION_INTENT_DATA", "NOTIFICATION_INTENT_DETAIL", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: NotificationNoCommercialActivity.kt */
    public static final class a extends Lambda implements Function0<DefaultActivityRouter> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final DefaultActivityRouter invoke() {
            Object obj = ComponentManager.get(WebActions.ID);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            return new DefaultActivityRouter(NotificationNoCommercialActivity.this, null, (WebController) obj);
        }
    }

    /* JADX INFO: compiled from: NotificationNoCommercialActivity.kt */
    public static final class b extends Lambda implements Function0<NotificationAdapter> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f35308p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final NotificationAdapter invoke() {
            return new NotificationAdapter();
        }
    }

    /* JADX INFO: compiled from: NotificationNoCommercialActivity.kt */
    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            NotificationNoCommercialActivity notificationNoCommercialActivity = NotificationNoCommercialActivity.this;
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(notificationNoCommercialActivity), Dispatchers.getMain(), null, new com.bbva.notifications.activity.c(notificationNoCommercialActivity, null), 2, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NotificationNoCommercialActivity.kt */
    public static final class d extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Intent f35311q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Intent intent) {
            super(0);
            this.f35311q0 = intent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            NotificationNoCommercialActivity notificationNoCommercialActivity = NotificationNoCommercialActivity.this;
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(notificationNoCommercialActivity), Dispatchers.getMain(), null, new com.bbva.notifications.activity.d(notificationNoCommercialActivity, this.f35311q0, null), 2, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NotificationNoCommercialActivity.kt */
    public static final class e implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f35312a;

        public e(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f35312a = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f35312a, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f35312a;
        }

        public final int hashCode() {
            return this.f35312a.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f35312a.invoke(obj);
        }
    }

    /* JADX INFO: compiled from: NotificationNoCommercialActivity.kt */
    public static final class f extends Lambda implements Function0<LoaderSpinnerViewModel> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LoaderSpinnerViewModel invoke() {
            return (LoaderSpinnerViewModel) ComponentManager.get(NotificationNoCommercialActivity.this.hashCode(), String.valueOf(R.id.loaderSpinnerComponent));
        }
    }

    /* JADX INFO: compiled from: NotificationNoCommercialActivity.kt */
    public static final class g extends Lambda implements Function0<ParametersHolder> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ContextExtensionKt.activityParameters(NotificationNoCommercialActivity.this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationNoCommercialActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f35302t0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ActivityNotificationNoCommercialBinding>() { // from class: com.bbva.notifications.activity.NotificationNoCommercialActivity$special$$inlined$viewBinding$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ActivityNotificationNoCommercialBinding invoke() {
                LayoutInflater layoutInflater = this.getLayoutInflater();
                Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
                return ActivityNotificationNoCommercialBinding.inflate(layoutInflater);
            }
        });
        this.f35303u0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewShortcutsBinding>() { // from class: com.bbva.notifications.activity.NotificationNoCommercialActivity$special$$inlined$viewBinding$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewShortcutsBinding invoke() {
                LayoutInflater layoutInflater = this.getLayoutInflater();
                Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
                return ViewShortcutsBinding.inflate(layoutInflater);
            }
        });
        final g gVar = new g();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.v0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<NotificationDetailViewModel>() { // from class: com.bbva.notifications.activity.NotificationNoCommercialActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.ViewModel, com.bbva.notifications.viewmodel.NotificationDetailViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NotificationDetailViewModel invoke() {
                CreationExtras defaultViewModelCreationExtras;
                Qualifier qualifier2 = qualifier;
                Function0 function0 = gVar;
                ComponentActivity componentActivity = this;
                ViewModelStore viewModelStore = componentActivity.getViewModelStore();
                Function0 function1 = objArr;
                if (function1 == null || (defaultViewModelCreationExtras = (CreationExtras) function1.invoke()) == null) {
                    defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                }
                CreationExtras creationExtras = defaultViewModelCreationExtras;
                Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(componentActivity);
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NotificationDetailViewModel.class);
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return GetViewModelKt.resolveViewModel(orCreateKotlinClass, viewModelStore, (4 & 4) != 0 ? null : null, creationExtras, (4 & 16) != 0 ? null : qualifier2, koinScope, (4 & 64) != 0 ? null : function0);
            }
        });
        this.f35304w0 = LazyKt__LazyJVMKt.lazy(new f());
        this.f35305x0 = LazyKt__LazyJVMKt.lazy(b.f35308p0);
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.f35306y0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<AppLifeCycleCreationJobHandler>() { // from class: com.bbva.notifications.activity.NotificationNoCommercialActivity$special$$inlined$inject$default$1
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
    }

    public static final void access$configureUIComponents(NotificationNoCommercialActivity notificationNoCommercialActivity) {
        Object value = notificationNoCommercialActivity.f35304w0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((LoaderSpinnerViewModel) value).setProperties(ViewComponentFactory.INSTANCE.loaderSpinner());
    }

    public static final ActivityRouter access$getActivityRouter(NotificationNoCommercialActivity notificationNoCommercialActivity) {
        return (ActivityRouter) notificationNoCommercialActivity.f35301s0.getValue();
    }

    public static final void access$handleLaunchScreenNavigation(NotificationNoCommercialActivity notificationNoCommercialActivity, Bundle bundle) {
        Intent launchIntentForPackage;
        if (notificationNoCommercialActivity.isTaskRoot() && (launchIntentForPackage = notificationNoCommercialActivity.getPackageManager().getLaunchIntentForPackage(notificationNoCommercialActivity.getPackageName())) != null) {
            launchIntentForPackage.putExtras(bundle);
            launchIntentForPackage.setFlags(268468224);
            notificationNoCommercialActivity.startActivity(launchIntentForPackage);
        }
        notificationNoCommercialActivity.finish();
    }

    public static final void access$processIntent(NotificationNoCommercialActivity notificationNoCommercialActivity, LinkParams linkParams) {
        notificationNoCommercialActivity.getClass();
        if (linkParams instanceof LinkParams.NoCommercialDeepLink) {
            LifecycleOwnerKt.getLifecycleScope(notificationNoCommercialActivity).launchWhenResumed(new va.d(notificationNoCommercialActivity, linkParams, null));
            return;
        }
        NotificationDetailViewModel notificationDetailViewModelM = notificationNoCommercialActivity.m();
        Bundle extras = notificationNoCommercialActivity.getIntent().getExtras();
        notificationDetailViewModelM.getNotificationData(extras != null ? BundleExtensionsKt.toHashMap(extras) : null);
    }

    public static final void access$setIsLoading(NotificationNoCommercialActivity notificationNoCommercialActivity, boolean z10) {
        if (!z10) {
            notificationNoCommercialActivity.k().notificationDetailList.setVisibility(0);
        } else {
            notificationNoCommercialActivity.k().notificationDetailList.setVisibility(4);
        }
        Object value = notificationNoCommercialActivity.f35304w0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((LoaderSpinnerViewModel) value).showSpinner(z10);
    }

    public static final void access$setNotificationHeader(NotificationNoCommercialActivity notificationNoCommercialActivity, NotificationNoCommercialData notificationNoCommercialData) {
        ActivityNotificationNoCommercialBinding activityNotificationNoCommercialBindingK = notificationNoCommercialActivity.k();
        CellsTextView topNotificationTitleTextView = activityNotificationNoCommercialBindingK.topNotificationTitleTextView;
        Intrinsics.checkNotNullExpressionValue(topNotificationTitleTextView, "topNotificationTitleTextView");
        n(topNotificationTitleTextView, notificationNoCommercialData != null ? notificationNoCommercialData.getNotificationType() : null);
        CellsTextView topNotificationDescriptionTextView = activityNotificationNoCommercialBindingK.topNotificationDescriptionTextView;
        Intrinsics.checkNotNullExpressionValue(topNotificationDescriptionTextView, "topNotificationDescriptionTextView");
        n(topNotificationDescriptionTextView, notificationNoCommercialData != null ? notificationNoCommercialData.getConcept() : null);
        CellsTextView topNotificationAmountTextView = activityNotificationNoCommercialBindingK.topNotificationAmountTextView;
        Intrinsics.checkNotNullExpressionValue(topNotificationAmountTextView, "topNotificationAmountTextView");
        n(topNotificationAmountTextView, notificationNoCommercialData != null ? notificationNoCommercialData.getAmountAndCurrency() : null);
        String hour = notificationNoCommercialData != null ? notificationNoCommercialData.getHour() : null;
        if (hour == null || hour.length() == 0) {
            CellsTextView topNotificationDateTextView = activityNotificationNoCommercialBindingK.topNotificationDateTextView;
            Intrinsics.checkNotNullExpressionValue(topNotificationDateTextView, "topNotificationDateTextView");
            n(topNotificationDateTextView, notificationNoCommercialData != null ? notificationNoCommercialData.getDate() : null);
        } else {
            CellsTextView topNotificationDateTextView2 = activityNotificationNoCommercialBindingK.topNotificationDateTextView;
            Intrinsics.checkNotNullExpressionValue(topNotificationDateTextView2, "topNotificationDateTextView");
            n(topNotificationDateTextView2, notificationNoCommercialData != null ? notificationNoCommercialData.getDateAndHour() : null);
        }
        notificationNoCommercialActivity.k().notificationDetailList.setVisibility(0);
        Object value = notificationNoCommercialActivity.f35304w0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((LoaderSpinnerViewModel) value).showSpinner(false);
        notificationNoCommercialActivity.k().notificationDetailList.setVisibility(0);
    }

    public static final void access$setNotificationShortcutActions(NotificationNoCommercialActivity notificationNoCommercialActivity, List list) {
        notificationNoCommercialActivity.getClass();
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            notificationNoCommercialActivity.l().shortcuts.setVisibility(8);
            return;
        }
        ShortcutsConfiguration shortcutsConfiguration = new ShortcutsConfiguration(NotificationShortcutItemModelExtensionsKt.toView((List<NotificationShortcutItemModel>) list));
        notificationNoCommercialActivity.l().shortcuts.setVisibility(0);
        notificationNoCommercialActivity.l().shortcuts.getViewModel().updateModel(new ShortcutsState.Ready(shortcutsConfiguration));
    }

    public static final void access$setupAdapter(NotificationNoCommercialActivity notificationNoCommercialActivity) {
        RecyclerView recyclerView = notificationNoCommercialActivity.k().notificationDetailList;
        recyclerView.setAdapter((NotificationAdapter) notificationNoCommercialActivity.f35305x0.getValue());
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
    }

    public static final void access$setupObservers(NotificationNoCommercialActivity notificationNoCommercialActivity) {
        notificationNoCommercialActivity.getClass();
        LifecycleOwnerKt.getLifecycleScope(notificationNoCommercialActivity).launchWhenStarted(new com.bbva.notifications.activity.e(notificationNoCommercialActivity, null));
        notificationNoCommercialActivity.m().getNotificationView().observe(notificationNoCommercialActivity, new e(new va.e(notificationNoCommercialActivity)));
        notificationNoCommercialActivity.m().getDeeplinkRead().observe(notificationNoCommercialActivity, new e(new va.f(notificationNoCommercialActivity)));
        notificationNoCommercialActivity.m().getScreenNavigation().observe(notificationNoCommercialActivity, new e(new va.g(notificationNoCommercialActivity)));
    }

    public static final void access$showNotificationErrorFragment(NotificationNoCommercialActivity notificationNoCommercialActivity) {
        notificationNoCommercialActivity.getClass();
        new NotificationErrorFragment().show(notificationNoCommercialActivity.getSupportFragmentManager(), KEY_NOTIFICATION_ERROR_FRAGMENT);
    }

    public static final void access$showTimerExpiredErrorScreen(NotificationNoCommercialActivity notificationNoCommercialActivity, InfoScreenType infoScreenType) {
        notificationNoCommercialActivity.getClass();
        new NotificationTimerExpiredRunningErrorFragment(infoScreenType).show(notificationNoCommercialActivity.getSupportFragmentManager(), KEY_NOTIFICATION_ERROR_FRAGMENT);
        notificationNoCommercialActivity.m().setIntent(new NotificationNoCommercialContract.Intent.SendAnalytics(NotificationType.OOB_TIMEOUT, null));
    }

    public static final void access$updateTimerView(NotificationNoCommercialActivity notificationNoCommercialActivity, NotificationView notificationView) {
        notificationNoCommercialActivity.getClass();
        Timer timer = notificationView.getTimer();
        Unit unit = null;
        if (timer != null) {
            notificationNoCommercialActivity.k().timerProgressLayout.timerShortcutsContainer.addView(notificationNoCommercialActivity.l().shortcuts);
            notificationNoCommercialActivity.j();
            notificationNoCommercialActivity.k().timerProgressLayout.timerProgressContainer.setVisibility(0);
            TimerProgressView timerView = notificationNoCommercialActivity.k().timerProgressLayout.timerView;
            Intrinsics.checkNotNullExpressionValue(timerView, "timerView");
            timerView.startCounter(timer.getTimeStamp(), TimeFormat.SECONDS, 1L, (8 & 8) != 0 ? null : null, (8 & 16) != 0 ? null : new va.c(notificationNoCommercialActivity));
            notificationNoCommercialActivity.k().timerProgressLayout.timerView.startTimer();
            NotificationType notificationType = NotificationType.OOB;
            NotificationNoCommercialData header = notificationView.getHeader();
            notificationNoCommercialActivity.m().setIntent(new NotificationNoCommercialContract.Intent.SendAnalytics(notificationType, header != null ? header.getNotificationType() : null));
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            notificationNoCommercialActivity.k().shortcutsContainer.addView(notificationNoCommercialActivity.l().shortcuts);
            notificationNoCommercialActivity.j();
        }
    }

    public static void n(CellsTextView cellsTextView, String str) {
        if (str == null || l.isBlank(str)) {
            cellsTextView.setVisibility(8);
        } else {
            cellsTextView.setText(str);
        }
    }

    public final void i() {
        if (isTaskRoot()) {
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setFlags(268468224);
                startActivity(launchIntentForPackage);
            }
        } else {
            m().sendCloseNotificationMessage();
        }
        finish();
    }

    public final void j() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new va.b(this, null));
    }

    public final ActivityNotificationNoCommercialBinding k() {
        return (ActivityNotificationNoCommercialBinding) this.f35302t0.getValue();
    }

    public final ViewShortcutsBinding l() {
        return (ViewShortcutsBinding) this.f35303u0.getValue();
    }

    public final NotificationDetailViewModel m() {
        return (NotificationDetailViewModel) this.v0.getValue();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        i();
    }

    @Override // com.bbva.glomohybrid.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((AppLifeCycleCreationJobHandler) this.f35306y0.getValue()).invokeOnCompletion(new c());
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(@Nullable DialogInterface dialog) {
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        ((AppLifeCycleCreationJobHandler) this.f35306y0.getValue()).invokeOnCompletion(new d(intent));
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() != R.id.action_close) {
            return false;
        }
        i();
        return true;
    }
}
