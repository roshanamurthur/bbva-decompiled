package com.bbva.glomohybrid.provider;

import android.content.Context;
import android.os.Build;
import com.bancomer.mbanking.R;
import com.bbva.actionlauncher.ActionLauncher;
import com.bbva.actionlauncher.model.PlatformType;
import com.bbva.actionlauncher.plugin.ActionLauncherPlugin;
import com.bbva.actionlauncher.plugin.params.FileSystemConfig;
import com.bbva.androidtoolkit.helper.LazyGetter;
import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.bridge.WebAwareComponent;
import com.bbva.cellscore.reactor.GlobalReaction;
import com.bbva.cellscore.reactor.PageReaction;
import com.bbva.cellscore.web.plugin.PluginFactory;
import com.bbva.component.dm.actionlauncher.ActionLauncherComponent;
import com.bbva.component.dm.headers.EtagDataManager;
import com.bbva.component.dm.headers.interceptor.HeadersInterceptorDataManager;
import com.bbva.component.dm.login.datamanager.LoginDataManager;
import com.bbva.component.dm.storage.PrefsStorageDataManager;
import com.bbva.component.ui.modal.halfmodal.HalfModalComponent;
import com.bbva.datepicker.plugin.DatePickerPlugin;
import com.bbva.ethermobilesdk.deviceinfo.plugin.DeviceInfoPlugin;
import com.bbva.ethermobilesdk.plugin.devicemanager.DeviceManagerPlugin;
import com.bbva.ethermobilesdk.securesharing.SecureSharing;
import com.bbva.glomo.semaas.usecase.RefreshSemaasTokenUseCase;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomohybrid.AppReaction;
import com.bbva.glomohybrid.base.cells.BaseReaction;
import com.bbva.glomohybrid.base.datasource.RootDataSource;
import com.bbva.glomohybrid.base.datasource.UserStoredDatasource;
import com.bbva.glomohybrid.base.handler.DeepLinkHandler;
import com.bbva.glomohybrid.base.handler.ShortcutHandler;
import com.bbva.glomohybrid.base.router.Router;
import com.bbva.glomohybrid.base.session.Session;
import com.bbva.glomohybrid.base.shortcuts.ShortcutComponentLauncher;
import com.bbva.glomohybrid.base.shortcuts.ShortcutController;
import com.bbva.glomohybrid.base.shortcuts.ShortcutReader;
import com.bbva.glomohybrid.cellsweb.presentation.reactions.CellsWebReaction;
import com.bbva.glomohybrid.documents.common.FileUseCaseFactory;
import com.bbva.glomohybrid.documents.component.TermsDataManager;
import com.bbva.glomohybrid.documents.plugin.OpenDocumentPlugin;
import com.bbva.glomohybrid.documents.plugin.UriExporter;
import com.bbva.glomohybrid.infoscreen.biometric.BiometryAuthErrorReaction;
import com.bbva.glomohybrid.infoscreen.biometric.FriendlyFraudReaction;
import com.bbva.glomohybrid.infoscreen.biometric.RetryBiometricAuthReaction;
import com.bbva.glomohybrid.infoscreen.blockeduser.BlockedUserReaction;
import com.bbva.glomohybrid.infoscreen.webView.error.WebViewErrorReaction;
import com.bbva.glomohybrid.initializers.SecureSharingInitializer;
import com.bbva.glomohybrid.landing.presentation.LandingReactions;
import com.bbva.glomohybrid.login.presentation.reactions.LoginReaction;
import com.bbva.glomoutils.mobileservices.craslytics.Crashlytics;
import com.bbva.nativesettingsplugin.NativeSettingsPlugin;
import com.bbva.network.NetworkWorker;
import com.bbva.networkplugin.HttpPlugin;
import com.bbva.notifications.provider.NotificationsProvider;
import com.bbva.plugin.analyticsdata.AnalyticsDataPlugin;
import com.bbva.plugin.contacts.ContactsPlugin;
import com.bbva.plugin.geolocation.GeolocationPlugin;
import com.bbva.plugin.geolocation.manager.Locator;
import com.bbva.plugin.localstorage.LocalStoragePlugin;
import com.bbva.plugin.permissions.PermissionsPlugin;
import com.bbva.plugin.push.PushPlugin;
import com.bbva.plugin.rateapp.InAppReviewPlugin;
import com.bbva.plugin.showinfo.ShowInfoPlugin;
import com.bbva.plugin.smsregex.request.SmsRegexPlugin;
import com.bbva.plugin.socialsharing.SocialSharingPlugin;
import com.bbva.screenshot.Screenshot;
import com.bbva.screenshot.plugin.ScreenshotPlugin;
import com.bbva.securesharing.plugin.SecureSharingPlugin;
import com.bbva.showinfo.model.SnackBarType;
import com.bbva.slidemenuview.cells.components.dm.MenuDataManager;
import com.bbva.socialsharing.SocialSharing;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;

/* JADX INFO: compiled from: DependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016J\u001a\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0003H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0016J\u001a\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0003H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\nH\u0016¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomohybrid/provider/DependenciesProvider;", "Lorg/koin/core/component/KoinComponent;", "components", "", "", "", "globalReactions", "Lkotlin/Function0;", "Lcom/bbva/cellscore/reactor/GlobalReaction;", "launcherScreens", "", "pageReactions", "Lcom/bbva/cellscore/reactor/PageReaction;", "pluginsFactory", "Lcom/bbva/cellscore/web/plugin/PluginFactory;", "requiredPlugins", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface DependenciesProvider extends KoinComponent {

    /* JADX INFO: compiled from: DependenciesProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDependenciesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DependenciesProvider.kt\ncom/bbva/glomohybrid/provider/DependenciesProvider$DefaultImpls\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,200:1\n41#2,6:201\n47#2:208\n41#2,6:210\n47#2:217\n41#2,6:219\n47#2:226\n41#2,6:228\n47#2:235\n41#2,6:237\n47#2:244\n41#2,6:246\n47#2:253\n41#2,6:255\n47#2:262\n41#2,6:264\n47#2:271\n41#2,6:273\n47#2:280\n41#2,6:282\n47#2:289\n41#2,6:291\n47#2:298\n41#2,6:300\n47#2:307\n133#3:207\n133#3:216\n133#3:225\n133#3:234\n133#3:243\n133#3:252\n133#3:261\n133#3:270\n133#3:279\n133#3:288\n133#3:297\n133#3:306\n107#4:209\n107#4:218\n107#4:227\n107#4:236\n107#4:245\n107#4:254\n107#4:263\n107#4:272\n107#4:281\n107#4:290\n107#4:299\n107#4:308\n*S KotlinDebug\n*F\n+ 1 DependenciesProvider.kt\ncom/bbva/glomohybrid/provider/DependenciesProvider$DefaultImpls\n*L\n88#1:201,6\n88#1:208\n89#1:210,6\n89#1:217\n90#1:219,6\n90#1:226\n91#1:228,6\n91#1:235\n92#1:237,6\n92#1:244\n93#1:246,6\n93#1:253\n94#1:255,6\n94#1:262\n95#1:264,6\n95#1:271\n96#1:273,6\n96#1:280\n97#1:282,6\n97#1:289\n104#1:291,6\n104#1:298\n159#1:300,6\n159#1:307\n88#1:207\n89#1:216\n90#1:225\n91#1:234\n92#1:243\n93#1:252\n94#1:261\n95#1:270\n96#1:279\n97#1:288\n104#1:297\n159#1:306\n88#1:209\n89#1:218\n90#1:227\n91#1:236\n92#1:245\n93#1:254\n94#1:263\n95#1:272\n96#1:281\n97#1:290\n104#1:299\n159#1:308\n*E\n"})
    public static final class DefaultImpls {

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        @SourceDebugExtension({"SMAP\nDependenciesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DependenciesProvider.kt\ncom/bbva/glomohybrid/provider/DependenciesProvider$globalReactions$1\n+ 2 DependenciesProvider.kt\ncom/bbva/glomohybrid/provider/DependenciesProviderKt\n+ 3 Koin.kt\norg/koin/core/Koin\n+ 4 Scope.kt\norg/koin/core/scope/Scope\n+ 5 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,200:1\n198#2:201\n188#2,8:213\n176#3:202\n107#3:212\n352#4:203\n133#4:210\n41#5,6:204\n47#5:211\n*S KotlinDebug\n*F\n+ 1 DependenciesProvider.kt\ncom/bbva/glomohybrid/provider/DependenciesProvider$globalReactions$1\n*L\n164#1:201\n164#1:213,8\n164#1:202\n164#1:212\n164#1:203\n164#1:210\n164#1:204,6\n164#1:211\n*E\n"})
        public static final class a extends Lambda implements Function0<AppReaction> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ DependenciesProvider f33879p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DependenciesProvider dependenciesProvider) {
                super(0);
                this.f33879p0 = dependenciesProvider;
            }

            @Override // kotlin.jvm.functions.Function0
            public final AppReaction invoke() {
                Object obj;
                DependenciesProvider dependenciesProvider = this.f33879p0;
                List all = androidx.databinding.c.e(dependenciesProvider).getAll(Reflection.getOrCreateKotlinClass(WebAwareComponent.class));
                boolean z10 = dependenciesProvider instanceof KoinScopeComponent;
                Crashlytics crashlytics = (Crashlytics) (z10 ? ((KoinScopeComponent) dependenciesProvider).getScope() : androidx.databinding.c.e(dependenciesProvider)).get(Reflection.getOrCreateKotlinClass(Crashlytics.class), null, null);
                try {
                    obj = dependenciesProvider.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(RefreshSemaasTokenUseCase.class), null, null);
                } catch (Exception unused) {
                    obj = null;
                }
                return new AppReaction(all, crashlytics, (RefreshSemaasTokenUseCase) obj, (Session) (z10 ? ((KoinScopeComponent) dependenciesProvider).getScope() : androidx.databinding.c.e(dependenciesProvider)).get(Reflection.getOrCreateKotlinClass(Session.class), null, null));
            }
        }

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        @SourceDebugExtension({"SMAP\nDependenciesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DependenciesProvider.kt\ncom/bbva/glomohybrid/provider/DependenciesProvider$pluginsFactory$1$9\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,200:1\n41#2,6:201\n47#2:208\n133#3:207\n107#4:209\n*S KotlinDebug\n*F\n+ 1 DependenciesProvider.kt\ncom/bbva/glomohybrid/provider/DependenciesProvider$pluginsFactory$1$9\n*L\n122#1:201,6\n122#1:208\n122#1:207\n122#1:209\n*E\n"})
        public static final class a0 extends Lambda implements Function0<Plugin> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ DependenciesProvider f33880p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a0(DependenciesProvider dependenciesProvider) {
                super(0);
                this.f33880p0 = dependenciesProvider;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Plugin invoke() {
                DependenciesProvider dependenciesProvider = this.f33880p0;
                return new DeviceInfoPlugin((Context) (dependenciesProvider instanceof KoinScopeComponent ? ((KoinScopeComponent) dependenciesProvider).getScope() : androidx.databinding.c.e(dependenciesProvider)).get(Reflection.getOrCreateKotlinClass(Context.class), null, null));
            }
        }

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        public static final class b extends Lambda implements Function0<BaseReaction> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final b f33881p0 = new b(0);

            @Override // kotlin.jvm.functions.Function0
            public final BaseReaction invoke() {
                return new LandingReactions();
            }
        }

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        @SourceDebugExtension({"SMAP\nDependenciesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DependenciesProvider.kt\ncom/bbva/glomohybrid/provider/DependenciesProvider$pageReactions$2\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,200:1\n41#2,6:201\n47#2:208\n133#3:207\n107#4:209\n*S KotlinDebug\n*F\n+ 1 DependenciesProvider.kt\ncom/bbva/glomohybrid/provider/DependenciesProvider$pageReactions$2\n*L\n169#1:201,6\n169#1:208\n169#1:207\n169#1:209\n*E\n"})
        public static final class c extends Lambda implements Function0<BaseReaction> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ DependenciesProvider f33882p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(DependenciesProvider dependenciesProvider) {
                super(0);
                this.f33882p0 = dependenciesProvider;
            }

            @Override // kotlin.jvm.functions.Function0
            public final BaseReaction invoke() {
                DependenciesProvider dependenciesProvider = this.f33882p0;
                return new LoginReaction((HalfModalComponent) (dependenciesProvider instanceof KoinScopeComponent ? ((KoinScopeComponent) dependenciesProvider).getScope() : androidx.databinding.c.e(dependenciesProvider)).get(Reflection.getOrCreateKotlinClass(HalfModalComponent.class), null, null));
            }
        }

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        public static final class d extends Lambda implements Function0<BaseReaction> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final d f33883p0 = new d(0);

            @Override // kotlin.jvm.functions.Function0
            public final BaseReaction invoke() {
                return new CellsWebReaction();
            }
        }

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        public static final class e extends Lambda implements Function0<BaseReaction> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final e f33884p0 = new e(0);

            @Override // kotlin.jvm.functions.Function0
            public final BaseReaction invoke() {
                return new BlockedUserReaction();
            }
        }

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        public static final class f extends Lambda implements Function0<BaseReaction> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final f f33885p0 = new f(0);

            @Override // kotlin.jvm.functions.Function0
            public final BaseReaction invoke() {
                return new WebViewErrorReaction();
            }
        }

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        public static final class g extends Lambda implements Function0<BaseReaction> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final g f33886p0 = new g(0);

            @Override // kotlin.jvm.functions.Function0
            public final BaseReaction invoke() {
                return new FriendlyFraudReaction();
            }
        }

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        public static final class h extends Lambda implements Function0<BaseReaction> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final h f33887p0 = new h(0);

            @Override // kotlin.jvm.functions.Function0
            public final BaseReaction invoke() {
                return new RetryBiometricAuthReaction();
            }
        }

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        public static final class i extends Lambda implements Function0<BaseReaction> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final i f33888p0 = new i(0);

            @Override // kotlin.jvm.functions.Function0
            public final BaseReaction invoke() {
                return new BiometryAuthErrorReaction();
            }
        }

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        public static final class j extends Lambda implements Function0<Plugin> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final j f33889p0 = new j(0);

            @Override // kotlin.jvm.functions.Function0
            public final Plugin invoke() {
                return new PermissionsPlugin();
            }
        }

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        public static final class k extends Lambda implements Function0<Plugin> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final k f33890p0 = new k(0);

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Plugin invoke() {
                ShowInfoPlugin showInfoPlugin = new ShowInfoPlugin(null, 1, 0 == true ? 1 : 0);
                showInfoPlugin.setSnackBarImages(bk.q.mapOf(TuplesKt.to(SnackBarType.ERROR.getValue(), Integer.valueOf(R.drawable.ic_warning_16)), TuplesKt.to(SnackBarType.INFO.getValue(), Integer.valueOf(R.drawable.ic_info_16)), TuplesKt.to(SnackBarType.SUCCESS.getValue(), Integer.valueOf(R.drawable.ic_done_16)), TuplesKt.to(SnackBarType.WARNING.getValue(), Integer.valueOf(R.drawable.ic_caution_16)), TuplesKt.to(SnackBarType.HIDE.getValue(), Integer.valueOf(R.drawable.ic_hide_white))));
                return showInfoPlugin;
            }
        }

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        @SourceDebugExtension({"SMAP\nDependenciesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DependenciesProvider.kt\ncom/bbva/glomohybrid/provider/DependenciesProvider$pluginsFactory$1$12\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,200:1\n41#2,6:201\n47#2:208\n133#3:207\n107#4:209\n*S KotlinDebug\n*F\n+ 1 DependenciesProvider.kt\ncom/bbva/glomohybrid/provider/DependenciesProvider$pluginsFactory$1$12\n*L\n137#1:201,6\n137#1:208\n137#1:207\n137#1:209\n*E\n"})
        public static final class l extends Lambda implements Function0<Plugin> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ DependenciesProvider f33891p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public l(DependenciesProvider dependenciesProvider) {
                super(0);
                this.f33891p0 = dependenciesProvider;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Plugin invoke() {
                DependenciesProvider dependenciesProvider = this.f33891p0;
                return new PushPlugin(((NotificationsProvider) (dependenciesProvider instanceof KoinScopeComponent ? ((KoinScopeComponent) dependenciesProvider).getScope() : androidx.databinding.c.e(dependenciesProvider)).get(Reflection.getOrCreateKotlinClass(NotificationsProvider.class), null, null)).getPushManager());
            }
        }

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        @SourceDebugExtension({"SMAP\nDependenciesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DependenciesProvider.kt\ncom/bbva/glomohybrid/provider/DependenciesProvider$pluginsFactory$1$13\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,200:1\n41#2,6:201\n47#2:208\n133#3:207\n107#4:209\n*S KotlinDebug\n*F\n+ 1 DependenciesProvider.kt\ncom/bbva/glomohybrid/provider/DependenciesProvider$pluginsFactory$1$13\n*L\n140#1:201,6\n140#1:208\n140#1:207\n140#1:209\n*E\n"})
        public static final class m extends Lambda implements Function0<Plugin> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ DependenciesProvider f33892p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public m(DependenciesProvider dependenciesProvider) {
                super(0);
                this.f33892p0 = dependenciesProvider;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Plugin invoke() {
                DependenciesProvider dependenciesProvider = this.f33892p0;
                boolean z10 = dependenciesProvider instanceof KoinScopeComponent;
                return new SecureSharingPlugin(new SecureSharingInitializer((SecureSharing) (z10 ? ((KoinScopeComponent) dependenciesProvider).getScope() : androidx.databinding.c.e(dependenciesProvider)).get(Reflection.getOrCreateKotlinClass(SecureSharing.class), null, null), (Crashlytics) (z10 ? ((KoinScopeComponent) dependenciesProvider).getScope() : androidx.databinding.c.e(dependenciesProvider)).get(Reflection.getOrCreateKotlinClass(Crashlytics.class), null, null), null, new p0(dependenciesProvider), 4, null).invoke());
            }
        }

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        @SourceDebugExtension({"SMAP\nDependenciesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DependenciesProvider.kt\ncom/bbva/glomohybrid/provider/DependenciesProvider$pluginsFactory$1$14\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,200:1\n41#2,6:201\n47#2:208\n41#2,6:210\n47#2:217\n133#3:207\n133#3:216\n107#4:209\n107#4:218\n*S KotlinDebug\n*F\n+ 1 DependenciesProvider.kt\ncom/bbva/glomohybrid/provider/DependenciesProvider$pluginsFactory$1$14\n*L\n147#1:201,6\n147#1:208\n148#1:210,6\n148#1:217\n147#1:207\n148#1:216\n147#1:209\n148#1:218\n*E\n"})
        public static final class n extends Lambda implements Function0<Plugin> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ DependenciesProvider f33893p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n(DependenciesProvider dependenciesProvider) {
                super(0);
                this.f33893p0 = dependenciesProvider;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Plugin invoke() {
                DependenciesProvider dependenciesProvider = this.f33893p0;
                boolean z10 = dependenciesProvider instanceof KoinScopeComponent;
                return new ActionLauncherPlugin((FileSystemConfig) (z10 ? ((KoinScopeComponent) dependenciesProvider).getScope() : androidx.databinding.c.e(dependenciesProvider)).get(Reflection.getOrCreateKotlinClass(FileSystemConfig.class), null, null), (PlatformType) (z10 ? ((KoinScopeComponent) dependenciesProvider).getScope() : androidx.databinding.c.e(dependenciesProvider)).get(Reflection.getOrCreateKotlinClass(PlatformType.class), null, null));
            }
        }

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        @SourceDebugExtension({"SMAP\nDependenciesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DependenciesProvider.kt\ncom/bbva/glomohybrid/provider/DependenciesProvider$pluginsFactory$1$15\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,200:1\n41#2,6:201\n47#2:208\n133#3:207\n107#4:209\n*S KotlinDebug\n*F\n+ 1 DependenciesProvider.kt\ncom/bbva/glomohybrid/provider/DependenciesProvider$pluginsFactory$1$15\n*L\n151#1:201,6\n151#1:208\n151#1:207\n151#1:209\n*E\n"})
        public static final class o extends Lambda implements Function0<Plugin> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ DependenciesProvider f33894p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o(DependenciesProvider dependenciesProvider) {
                super(0);
                this.f33894p0 = dependenciesProvider;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Plugin invoke() {
                DependenciesProvider dependenciesProvider = this.f33894p0;
                boolean z10 = dependenciesProvider instanceof KoinScopeComponent;
                return new OpenDocumentPlugin((FileUseCaseFactory) (z10 ? ((KoinScopeComponent) dependenciesProvider).getScope() : androidx.databinding.c.e(dependenciesProvider)).get(Reflection.getOrCreateKotlinClass(FileUseCaseFactory.class), null, null), (ActionLauncher) (z10 ? ((KoinScopeComponent) dependenciesProvider).getScope() : androidx.databinding.c.e(dependenciesProvider)).get(Reflection.getOrCreateKotlinClass(ActionLauncher.class), null, null), (UriExporter) (z10 ? ((KoinScopeComponent) dependenciesProvider).getScope() : androidx.databinding.c.e(dependenciesProvider)).get(Reflection.getOrCreateKotlinClass(UriExporter.class), null, null));
            }
        }

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        public static final class p extends Lambda implements Function0<Plugin> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final p f33895p0 = new p(0);

            @Override // kotlin.jvm.functions.Function0
            public final Plugin invoke() {
                return new InAppReviewPlugin();
            }
        }

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        public static final class q extends Lambda implements Function0<Plugin> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final q f33896p0 = new q(0);

            @Override // kotlin.jvm.functions.Function0
            public final Plugin invoke() {
                return new ContactsPlugin();
            }
        }

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        public static final class r extends Lambda implements Function0<Plugin> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final r f33897p0 = new r(0);

            @Override // kotlin.jvm.functions.Function0
            public final Plugin invoke() {
                return new DeviceManagerPlugin();
            }
        }

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        @SourceDebugExtension({"SMAP\nDependenciesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DependenciesProvider.kt\ncom/bbva/glomohybrid/provider/DependenciesProvider$pluginsFactory$1$1\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,200:1\n41#2,6:201\n47#2:208\n133#3:207\n107#4:209\n*S KotlinDebug\n*F\n+ 1 DependenciesProvider.kt\ncom/bbva/glomohybrid/provider/DependenciesProvider$pluginsFactory$1$1\n*L\n112#1:201,6\n112#1:208\n112#1:207\n112#1:209\n*E\n"})
        public static final class s extends Lambda implements Function0<Plugin> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ DependenciesProvider f33898p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public s(DependenciesProvider dependenciesProvider) {
                super(0);
                this.f33898p0 = dependenciesProvider;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Plugin invoke() {
                DependenciesProvider dependenciesProvider = this.f33898p0;
                return new HttpPlugin((NetworkWorker) (dependenciesProvider instanceof KoinScopeComponent ? ((KoinScopeComponent) dependenciesProvider).getScope() : androidx.databinding.c.e(dependenciesProvider)).get(Reflection.getOrCreateKotlinClass(NetworkWorker.class), null, null));
            }
        }

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        public static final class t extends Lambda implements Function0<Plugin> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final t f33899p0 = new t(0);

            @Override // kotlin.jvm.functions.Function0
            public final Plugin invoke() {
                return new DatePickerPlugin();
            }
        }

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        public static final class u extends Lambda implements Function0<Plugin> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final u f33900p0 = new u(0);

            @Override // kotlin.jvm.functions.Function0
            public final Plugin invoke() {
                return new NativeSettingsPlugin();
            }
        }

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        @SourceDebugExtension({"SMAP\nDependenciesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DependenciesProvider.kt\ncom/bbva/glomohybrid/provider/DependenciesProvider$pluginsFactory$1$4\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,200:1\n41#2,6:201\n47#2:208\n133#3:207\n107#4:209\n*S KotlinDebug\n*F\n+ 1 DependenciesProvider.kt\ncom/bbva/glomohybrid/provider/DependenciesProvider$pluginsFactory$1$4\n*L\n115#1:201,6\n115#1:208\n115#1:207\n115#1:209\n*E\n"})
        public static final class v extends Lambda implements Function0<Plugin> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ DependenciesProvider f33901p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public v(DependenciesProvider dependenciesProvider) {
                super(0);
                this.f33901p0 = dependenciesProvider;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Plugin invoke() {
                DependenciesProvider dependenciesProvider = this.f33901p0;
                return new GeolocationPlugin((Locator) (dependenciesProvider instanceof KoinScopeComponent ? ((KoinScopeComponent) dependenciesProvider).getScope() : androidx.databinding.c.e(dependenciesProvider)).get(Reflection.getOrCreateKotlinClass(Locator.class), null, null));
            }
        }

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        public static final class w extends Lambda implements Function0<Plugin> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final w f33902p0 = new w(0);

            @Override // kotlin.jvm.functions.Function0
            public final Plugin invoke() {
                return new SocialSharingPlugin();
            }
        }

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        @SourceDebugExtension({"SMAP\nDependenciesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DependenciesProvider.kt\ncom/bbva/glomohybrid/provider/DependenciesProvider$pluginsFactory$1$6\n+ 2 Helpers.kt\ncom/bbva/glomohybrid/base/HelpersKt\n*L\n1#1,200:1\n5#2,3:201\n*S KotlinDebug\n*F\n+ 1 DependenciesProvider.kt\ncom/bbva/glomohybrid/provider/DependenciesProvider$pluginsFactory$1$6\n*L\n118#1:201,3\n*E\n"})
        public static final class x extends Lambda implements Function0<Plugin> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final x f33903p0 = new x(0);

            @Override // kotlin.jvm.functions.Function0
            public final Plugin invoke() {
                return new ScreenshotPlugin(new LazyGetter<Screenshot>() { // from class: com.bbva.glomohybrid.provider.DependenciesProvider$pluginsFactory$1$6$invoke$$inlined$lazyGetter$1
                    @Override // com.bbva.androidtoolkit.helper.LazyGetter
                    public Screenshot initialValue() {
                        return new Screenshot();
                    }
                }, new LazyGetter<SocialSharing>() { // from class: com.bbva.glomohybrid.provider.DependenciesProvider$pluginsFactory$1$6$invoke$$inlined$lazyGetter$2
                    @Override // com.bbva.androidtoolkit.helper.LazyGetter
                    public SocialSharing initialValue() {
                        return new SocialSharing();
                    }
                });
            }
        }

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        public static final class y extends Lambda implements Function0<Plugin> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final y f33904p0 = new y(0);

            @Override // kotlin.jvm.functions.Function0
            public final Plugin invoke() {
                return new SmsRegexPlugin();
            }
        }

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        public static final class z extends Lambda implements Function0<Plugin> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final z f33905p0 = new z(0);

            @Override // kotlin.jvm.functions.Function0
            public final Plugin invoke() {
                return new LocalStoragePlugin();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static Map<String, Object> components(@NotNull DependenciesProvider dependenciesProvider) {
            Pair[] pairArr = new Pair[13];
            pairArr[0] = TuplesKt.to(Router.ID, Router.INSTANCE);
            boolean z10 = dependenciesProvider instanceof KoinScopeComponent;
            String str = null;
            Object[] objArr = 0;
            int i10 = 1;
            pairArr[1] = TuplesKt.to(NetworkWorker.class.getName(), (z10 ? ((KoinScopeComponent) dependenciesProvider).getScope() : androidx.databinding.c.e(dependenciesProvider)).get(Reflection.getOrCreateKotlinClass(NetworkWorker.class), null, null));
            pairArr[2] = TuplesKt.to(PrefsStorageDataManager.ID, new PrefsStorageDataManager(str, (Context) (z10 ? ((KoinScopeComponent) dependenciesProvider).getScope() : androidx.databinding.c.e(dependenciesProvider)).get(Reflection.getOrCreateKotlinClass(Context.class), null, null), i10, objArr == true ? 1 : 0));
            pairArr[3] = TuplesKt.to(ActionLauncherComponent.ID, (z10 ? ((KoinScopeComponent) dependenciesProvider).getScope() : androidx.databinding.c.e(dependenciesProvider)).get(Reflection.getOrCreateKotlinClass(ActionLauncherComponent.class), null, null));
            pairArr[4] = TuplesKt.to(RootDataSource.ID, new RootDataSource((MainStorage) (z10 ? ((KoinScopeComponent) dependenciesProvider).getScope() : androidx.databinding.c.e(dependenciesProvider)).get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null)));
            pairArr[5] = TuplesKt.to(UserStoredDatasource.ID, (z10 ? ((KoinScopeComponent) dependenciesProvider).getScope() : androidx.databinding.c.e(dependenciesProvider)).get(Reflection.getOrCreateKotlinClass(UserStoredDatasource.class), null, null));
            pairArr[6] = TuplesKt.to(MenuDataManager.ID, (z10 ? ((KoinScopeComponent) dependenciesProvider).getScope() : androidx.databinding.c.e(dependenciesProvider)).get(Reflection.getOrCreateKotlinClass(MenuDataManager.class), null, null));
            pairArr[7] = TuplesKt.to(TermsDataManager.INSTANCE.getID(), (z10 ? ((KoinScopeComponent) dependenciesProvider).getScope() : androidx.databinding.c.e(dependenciesProvider)).get(Reflection.getOrCreateKotlinClass(TermsDataManager.class), null, null));
            pairArr[8] = TuplesKt.to(HeadersInterceptorDataManager.ID, (z10 ? ((KoinScopeComponent) dependenciesProvider).getScope() : androidx.databinding.c.e(dependenciesProvider)).get(Reflection.getOrCreateKotlinClass(HeadersInterceptorDataManager.class), null, null));
            pairArr[9] = TuplesKt.to(LoginDataManager.ID, (z10 ? ((KoinScopeComponent) dependenciesProvider).getScope() : androidx.databinding.c.e(dependenciesProvider)).get(Reflection.getOrCreateKotlinClass(LoginDataManager.class), null, null));
            pairArr[10] = TuplesKt.to(EtagDataManager.ID, (z10 ? ((KoinScopeComponent) dependenciesProvider).getScope() : androidx.databinding.c.e(dependenciesProvider)).get(Reflection.getOrCreateKotlinClass(EtagDataManager.class), null, null));
            pairArr[11] = TuplesKt.to(DeepLinkHandler.ID, new DeepLinkHandler());
            pairArr[12] = TuplesKt.to(ShortcutHandler.ID, new ShortcutHandler());
            Map<String, Object> mapMutableMapOf = bk.q.mutableMapOf(pairArr);
            if (Build.VERSION.SDK_INT >= 25) {
                mapMutableMapOf.put(ShortcutReader.ID, new ShortcutReader());
                mapMutableMapOf.put(ShortcutController.ID, new ShortcutController((Context) (z10 ? ((KoinScopeComponent) dependenciesProvider).getScope() : androidx.databinding.c.e(dependenciesProvider)).get(Reflection.getOrCreateKotlinClass(Context.class), null, null)));
                mapMutableMapOf.put(ShortcutComponentLauncher.ID, new ShortcutComponentLauncher());
            }
            return mapMutableMapOf;
        }

        @NotNull
        public static Koin getKoin(@NotNull DependenciesProvider dependenciesProvider) {
            return KoinComponent.DefaultImpls.getKoin(dependenciesProvider);
        }

        @NotNull
        public static Map<String, Function0<GlobalReaction>> globalReactions(@NotNull DependenciesProvider dependenciesProvider) {
            return bk.p.mapOf(TuplesKt.to("app", new a(dependenciesProvider)));
        }

        @NotNull
        public static List<String> launcherScreens(@NotNull DependenciesProvider dependenciesProvider) {
            Intrinsics.checkNotNullExpressionValue("SplashActivity", "getSimpleName(...)");
            Intrinsics.checkNotNullExpressionValue("CrashErrorActivity", "getSimpleName(...)");
            Intrinsics.checkNotNullExpressionValue("NotificationActivity", "getSimpleName(...)");
            Intrinsics.checkNotNullExpressionValue("NotificationNoCommercialActivity", "getSimpleName(...)");
            Intrinsics.checkNotNullExpressionValue("PaymentsInfoNotificationActivity", "getSimpleName(...)");
            return CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"SplashActivity", "CrashErrorActivity", "NotificationActivity", "NotificationNoCommercialActivity", "PaymentsInfoNotificationActivity", "NotificationOpenActivity"});
        }

        @NotNull
        public static Map<String, Function0<PageReaction>> pageReactions(@NotNull DependenciesProvider dependenciesProvider) {
            return bk.q.mapOf(TuplesKt.to("landing", b.f33881p0), TuplesKt.to("login", new c(dependenciesProvider)), TuplesKt.to("cellsweb", d.f33883p0), TuplesKt.to("blocked-user", e.f33884p0), TuplesKt.to("webview-error", f.f33885p0), TuplesKt.to("biometry-friendly-fraud", g.f33886p0), TuplesKt.to("biometry-error-retry", h.f33887p0), TuplesKt.to("biometry-error", i.f33888p0));
        }

        @NotNull
        public static PluginFactory pluginsFactory(@NotNull DependenciesProvider dependenciesProvider) {
            PluginFactory pluginFactory = new PluginFactory();
            pluginFactory.add("Http", new s(dependenciesProvider));
            pluginFactory.add(DatePickerPlugin.ID, t.f33899p0);
            pluginFactory.add(NativeSettingsPlugin.ID, u.f33900p0);
            pluginFactory.add("GeolocationPlugin", new v(dependenciesProvider));
            pluginFactory.add(SocialSharingPlugin.ID, w.f33902p0);
            pluginFactory.add(ScreenshotPlugin.ID, x.f33903p0);
            pluginFactory.add(SmsRegexPlugin.ID, y.f33904p0);
            pluginFactory.add("LocalStoragePlugin", z.f33905p0);
            pluginFactory.add("DeviceInfo", new a0(dependenciesProvider));
            pluginFactory.add("PermissionsPlugin", j.f33889p0);
            pluginFactory.add("ShowInfoPlugin", k.f33890p0);
            pluginFactory.add(PushPlugin.ID, new l(dependenciesProvider));
            pluginFactory.add(SecureSharingPlugin.ID, new m(dependenciesProvider));
            pluginFactory.add(ActionLauncherPlugin.ID, new n(dependenciesProvider));
            pluginFactory.add("OpenDocument", new o(dependenciesProvider));
            pluginFactory.add("RateApp", p.f33895p0);
            pluginFactory.add("Contacts", q.f33896p0);
            pluginFactory.add(DeviceManagerPlugin.ID, r.f33897p0);
            return pluginFactory;
        }

        @NotNull
        public static List<Plugin> requiredPlugins(@NotNull DependenciesProvider dependenciesProvider) {
            return bk.d.listOf((dependenciesProvider instanceof KoinScopeComponent ? ((KoinScopeComponent) dependenciesProvider).getScope() : androidx.databinding.c.e(dependenciesProvider)).get(Reflection.getOrCreateKotlinClass(AnalyticsDataPlugin.class), null, null));
        }
    }

    @NotNull
    Map<String, Object> components();

    @NotNull
    Map<String, Function0<GlobalReaction>> globalReactions();

    @NotNull
    List<String> launcherScreens();

    @NotNull
    Map<String, Function0<PageReaction>> pageReactions();

    @NotNull
    PluginFactory pluginsFactory();

    @NotNull
    List<Plugin> requiredPlugins();
}
