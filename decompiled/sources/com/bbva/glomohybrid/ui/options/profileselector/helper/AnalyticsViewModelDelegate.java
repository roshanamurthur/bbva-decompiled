package com.bbva.glomohybrid.ui.options.profileselector.helper;

import androidx.camera.core.imagecapture.a;
import com.bbva.component.dm.analytics.AnalyticsManager;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomoconfig.constants.GlobalAnalyticsConstants;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomoutils.usecase.UseCaseWithParams;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: AnalyticsViewModelDelegate.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomohybrid/ui/options/profileselector/helper/AnalyticsViewModelDelegate;", "", "Lcom/bbva/component/dm/analytics/model/AnalyticsEvent;", "event", "", "trackEvent", "Lcom/bbva/glomo/user/domain/model/UserType;", "currentUserType", "newUserType", "trackOptionSelectedEvent", "trackChangeProfile", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "", "currentScreen", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;Ljava/lang/String;)V", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAnalyticsViewModelDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsViewModelDelegate.kt\ncom/bbva/glomohybrid/ui/options/profileselector/helper/AnalyticsViewModelDelegate\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n56#2,6:92\n29#3,4:98\n1#4:102\n*S KotlinDebug\n*F\n+ 1 AnalyticsViewModelDelegate.kt\ncom/bbva/glomohybrid/ui/options/profileselector/helper/AnalyticsViewModelDelegate\n*L\n22#1:92,6\n24#1:98,4\n*E\n"})
public final class AnalyticsViewModelDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f34680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f34681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f34682c;

    /* JADX INFO: compiled from: AnalyticsViewModelDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserType.values().length];
            try {
                iArr[UserType.ENTERPRISE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnalyticsViewModelDelegate(@NotNull final ViewModelComponentsProviders provider, @NotNull String currentScreen) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(currentScreen, "currentScreen");
        this.f34680a = currentScreen;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f34681b = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<AnalyticsManager>() { // from class: com.bbva.glomohybrid.ui.options.profileselector.helper.AnalyticsViewModelDelegate$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.component.dm.analytics.AnalyticsManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AnalyticsManager invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(AnalyticsManager.class), qualifier, objArr);
            }
        });
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.f34682c = LazyKt__LazyJVMKt.lazy(new Function0<UseCaseWithParams<? super UserType, ? extends String>>() { // from class: com.bbva.glomohybrid.ui.options.profileselector.helper.AnalyticsViewModelDelegate$special$$inlined$injectOrNull$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.glomoutils.usecase.UseCaseWithParams<? super com.bbva.glomo.user.domain.model.UserType, ? extends java.lang.String>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final UseCaseWithParams<? super UserType, ? extends String> invoke() {
                return a.e(provider).getOrNull(Reflection.getOrCreateKotlinClass(UseCaseWithParams.class), objArr2, objArr3);
            }
        });
    }

    public final void a(AnalyticsEvent analyticsEvent, String str, String str2, String str3, String str4) {
        analyticsEvent.putData("page", this.f34680a);
        analyticsEvent.putData(AnalyticsConstants.Key.INTERACTION_LEVEL_KEY, str);
        analyticsEvent.putData(AnalyticsConstants.Key.PAGE_SEGMENT_KEY, str2);
        analyticsEvent.putData(AnalyticsConstants.Key.SITE_APP_NAME, str3);
        analyticsEvent.putData(AnalyticsConstants.Key.SEGMENT_ID, str4);
        ((AnalyticsManager) this.f34681b.getValue()).trackEvent(analyticsEvent);
    }

    public final void trackChangeProfile(@NotNull AnalyticsEvent event, @NotNull UserType currentUserType) {
        String str;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(currentUserType, "currentUserType");
        GlobalAnalyticsConstants globalAnalyticsConstants = GlobalAnalyticsConstants.INSTANCE;
        String interaction_level_change_user = globalAnalyticsConstants.getINTERACTION_LEVEL_CHANGE_USER();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        String enterprise_profile = iArr[currentUserType.ordinal()] == 1 ? globalAnalyticsConstants.getENTERPRISE_PROFILE() : globalAnalyticsConstants.getPERSONAL_PROFILE();
        String enterprise_site_app = iArr[currentUserType.ordinal()] == 1 ? globalAnalyticsConstants.getENTERPRISE_SITE_APP() : globalAnalyticsConstants.getSITE_APP();
        UseCaseWithParams useCaseWithParams = (UseCaseWithParams) this.f34682c.getValue();
        if (useCaseWithParams == null || (str = (String) useCaseWithParams.execute(currentUserType)) == null) {
            str = "";
        }
        a(event, interaction_level_change_user, enterprise_profile, enterprise_site_app, str);
    }

    public final void trackEvent(@NotNull AnalyticsEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ((AnalyticsManager) this.f34681b.getValue()).trackEvent(event);
    }

    public final void trackOptionSelectedEvent(@NotNull AnalyticsEvent event, @NotNull UserType currentUserType, @NotNull UserType newUserType) {
        String str;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(currentUserType, "currentUserType");
        Intrinsics.checkNotNullParameter(newUserType, "newUserType");
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        String interaction_level_enterprise = iArr[newUserType.ordinal()] == 1 ? GlobalAnalyticsConstants.INSTANCE.getINTERACTION_LEVEL_ENTERPRISE() : GlobalAnalyticsConstants.INSTANCE.getINTERACTION_LEVEL_PERSONAL();
        String enterprise_profile = iArr[currentUserType.ordinal()] == 1 ? GlobalAnalyticsConstants.INSTANCE.getENTERPRISE_PROFILE() : GlobalAnalyticsConstants.INSTANCE.getPERSONAL_PROFILE();
        String enterprise_site_app = iArr[currentUserType.ordinal()] == 1 ? GlobalAnalyticsConstants.INSTANCE.getENTERPRISE_SITE_APP() : GlobalAnalyticsConstants.INSTANCE.getSITE_APP();
        UseCaseWithParams useCaseWithParams = (UseCaseWithParams) this.f34682c.getValue();
        if (useCaseWithParams == null || (str = (String) useCaseWithParams.execute(currentUserType)) == null) {
            str = "";
        }
        a(event, interaction_level_enterprise, enterprise_profile, enterprise_site_app, str);
    }
}
