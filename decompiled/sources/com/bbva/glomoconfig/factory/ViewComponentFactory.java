package com.bbva.glomoconfig.factory;

import androidx.camera.core.imagecapture.a;
import bk.d;
import bk.p;
import bk.q;
import com.bbva.glomo.resource.ResourceProvider;
import com.bbva.glomoconfig.ComponentFactory;
import com.bbva.glomoconfig.R;
import com.bbva.glomohybrid.base.handler.BiometricsIntentHandler;
import com.bbva.glomohybrid.welcome.presentation.view.WelcomeActivityPager;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: ViewComponentFactory.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0006\u001a \u0012\u0004\u0012\u00020\u0003\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00020\u00040\u0002J\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00020\u0002J*\u0010\b\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u00020\u0002J\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002J$\u0010\n\u001a \u0012\u0004\u0012\u00020\u0003\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u00040\u0002J\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0002J*\u0010\f\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u00020\u0002J*\u0010\r\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u00020\u0002J*\u0010\u000e\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u00020\u0002J$\u0010\u000f\u001a \u0012\u0004\u0012\u00020\u0003\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u00040\u0002J$\u0010\u0010\u001a \u0012\u0004\u0012\u00020\u0003\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u00040\u0002J\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0002¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomoconfig/factory/ViewComponentFactory;", "Lcom/bbva/glomoconfig/ComponentFactory;", "", "", "", "", "welcomePager", "welcomeFooter", "welcomeHeader", "loaderSpinner", "loader", "lowConnectionMessage", "rootChecker", "optionalUpdate", "forcedUpdate", "changeProfileEnterprise", "changeProfilePersonal", BiometricsIntentHandler.ID, "<init>", "()V", "gl-config_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nViewComponentFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewComponentFactory.kt\ncom/bbva/glomoconfig/factory/ViewComponentFactory\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,144:1\n56#2,6:145\n*S KotlinDebug\n*F\n+ 1 ViewComponentFactory.kt\ncom/bbva/glomoconfig/factory/ViewComponentFactory\n*L\n10#1:145,6\n*E\n"})
public final class ViewComponentFactory implements ComponentFactory {

    @NotNull
    public static final ViewComponentFactory INSTANCE;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final Lazy f30931p0;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final ViewComponentFactory viewComponentFactory = new ViewComponentFactory();
        INSTANCE = viewComponentFactory;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        f30931p0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<ResourceProvider>() { // from class: com.bbva.glomoconfig.factory.ViewComponentFactory$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomo.resource.ResourceProvider, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ResourceProvider invoke() {
                KoinComponent koinComponent = viewComponentFactory;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(ResourceProvider.class), qualifier, objArr);
            }
        });
    }

    public static ResourceProvider a() {
        return (ResourceProvider) f30931p0.getValue();
    }

    @NotNull
    public final Map<String, Object> biometrics() {
        Boolean bool = Boolean.FALSE;
        return q.mapOf(TuplesKt.to("title", p.mapOf(ComponentFactory.DefaultImpls.literal$default(this, "text", a().getString(R.string.biometrics_title), null, 4, null))), TuplesKt.to(NotificationMessage.NOTIF_KEY_SUB_TITLE, p.mapOf(ComponentFactory.DefaultImpls.literal$default(this, "text", a().getString(R.string.biometrics_subtitle), null, 4, null))), TuplesKt.to("negativeButtonText", p.mapOf(ComponentFactory.DefaultImpls.literal$default(this, "text", a().getString(R.string.biometrics_negative_button_text), null, 4, null))), TuplesKt.to("isDeviceCredentialAllowed", bool), TuplesKt.to("isConfirmationRequired", bool));
    }

    @NotNull
    public final Map<String, List<Map<String, String>>> changeProfileEnterprise() {
        return p.mapOf(TuplesKt.to("messages", d.listOf(q.mapOf(TuplesKt.to("value", a().getString(R.string.loader_change_profile_first_message)), TuplesKt.to("type", "literal")))));
    }

    @NotNull
    public final Map<String, List<Map<String, String>>> changeProfilePersonal() {
        return p.mapOf(TuplesKt.to("messages", d.listOf(q.mapOf(TuplesKt.to("value", a().getString(R.string.loader_change_profile_second_message)), TuplesKt.to("type", "literal")))));
    }

    @NotNull
    public final Map<String, Map<String, Map<String, String>>> forcedUpdate() {
        return q.mapOf(TuplesKt.to("headerImage", p.mapOf(ComponentFactory.DefaultImpls.resource$default(this, "resource", "bg_update_postponed", null, 4, null))), TuplesKt.to("titleText", p.mapOf(ComponentFactory.DefaultImpls.literal$default(this, "text", a().getString(R.string.update_screen_description), null, 4, null))), TuplesKt.to("updateButton", p.mapOf(ComponentFactory.DefaultImpls.literal$default(this, "text", a().getString(R.string.update_screen_button_update), null, 4, null))));
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return ComponentFactory.DefaultImpls.getKoin(this);
    }

    @Override // com.bbva.glomoconfig.ComponentFactory
    @NotNull
    public Pair<String, Map<String, String>> literal(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        return ComponentFactory.DefaultImpls.literal(this, str, str2, str3);
    }

    @NotNull
    public final Map<String, List<Map<String, String>>> loader() {
        return p.mapOf(TuplesKt.to("messages", CollectionsKt__CollectionsKt.listOf((Object[]) new Map[]{q.mapOf(TuplesKt.to("value", a().getString(R.string.login_verify_data)), TuplesKt.to("type", "literal")), q.mapOf(TuplesKt.to("value", a().getString(R.string.login_connecting_with_bbva)), TuplesKt.to("type", "literal"))})));
    }

    @NotNull
    public final Map<String, String> loaderSpinner() {
        return p.mapOf(TuplesKt.to("lottie", "animations/spinner_white.json"));
    }

    @NotNull
    public final Map<String, Map<String, String>> lowConnectionMessage() {
        return p.mapOf(TuplesKt.to("secondaryMessage", q.mapOf(TuplesKt.to("value", a().getString(R.string.login_low_connection)), TuplesKt.to("type", "literal"))));
    }

    @NotNull
    public final Map<String, Map<String, Map<String, String>>> optionalUpdate() {
        return q.mapOf(TuplesKt.to("headerImage", p.mapOf(ComponentFactory.DefaultImpls.resource$default(this, "resource", "bg_update_postponed", null, 4, null))), TuplesKt.to("titleText", p.mapOf(ComponentFactory.DefaultImpls.literal$default(this, "text", a().getString(R.string.update_screen_description), null, 4, null))), TuplesKt.to("updateButton", p.mapOf(ComponentFactory.DefaultImpls.literal$default(this, "text", a().getString(R.string.update_screen_button_update), null, 4, null))), TuplesKt.to("skipButton", p.mapOf(ComponentFactory.DefaultImpls.literal$default(this, "text", a().getString(R.string.update_screen_button_update_later), null, 4, null))));
    }

    @Override // com.bbva.glomoconfig.ComponentFactory
    @NotNull
    public Pair<String, Map<String, String>> resource(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        return ComponentFactory.DefaultImpls.resource(this, str, str2, str3);
    }

    @NotNull
    public final Map<String, Map<String, Map<String, String>>> rootChecker() {
        return p.mapOf(TuplesKt.to("apiKey", p.mapOf(ComponentFactory.DefaultImpls.resource$default(this, "text", "root_checker_api_key", null, 4, null))));
    }

    @Override // com.bbva.glomoconfig.ComponentFactory
    @NotNull
    public Pair<String, Map<String, String>> visibilityItem(@NotNull String str) {
        return ComponentFactory.DefaultImpls.visibilityItem(this, str);
    }

    @Override // com.bbva.glomoconfig.ComponentFactory
    @NotNull
    public Pair<String, Map<String, Map<String, String>>> visibilityPair(@NotNull String str, @NotNull String str2) {
        return ComponentFactory.DefaultImpls.visibilityPair(this, str, str2);
    }

    @NotNull
    public final Map<String, Map<String, Object>> welcomeFooter() {
        return q.mapOf(TuplesKt.to("topButton", q.mapOf(TuplesKt.to("title", p.mapOf(ComponentFactory.DefaultImpls.literal$default(this, "text", a().getString(R.string.welcome_footer_top_button), null, 4, null))), TuplesKt.to("route", WelcomeActivityPager.ID))), TuplesKt.to("bottomButton", p.mapOf(TuplesKt.to("title", p.mapOf(ComponentFactory.DefaultImpls.literal$default(this, "text", a().getString(R.string.welcome_footer_bottom_button), null, 4, null))))), TuplesKt.to("termsAndConditions", q.mapOf(visibilityItem("gone"), TuplesKt.to("title", p.mapOf(literal("text", "", "gone"))))));
    }

    @NotNull
    public final Map<String, Map<String, Map<String, String>>> welcomeHeader() {
        return q.mapOf(TuplesKt.to("welcomeHeaderTitle", p.mapOf(ComponentFactory.DefaultImpls.literal$default(this, "text", a().getString(R.string.welcome_header_title), null, 4, null))), TuplesKt.to("welcomeHeaderDescription", p.mapOf(ComponentFactory.DefaultImpls.literal$default(this, "text", a().getString(R.string.welcome_header_description), null, 4, null))));
    }

    @NotNull
    public final Map<String, List<Map<String, Object>>> welcomePager() {
        Boolean bool = Boolean.TRUE;
        return q.mapOf(TuplesKt.to("modes", d.listOf(q.mapOf(TuplesKt.to("name", "first_run"), TuplesKt.to("autoMovement", bool), TuplesKt.to("movementDelay", Double.valueOf(9000.0d)), TuplesKt.to("pages", CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"page_1", "page_2", "page_3"}))))), TuplesKt.to("pages", CollectionsKt__CollectionsKt.listOf((Object[]) new Map[]{q.mapOf(TuplesKt.to("id", "page_1"), TuplesKt.to("fullScreen", bool), TuplesKt.to("lottie", "animations/A_Consulta_trasfiere.json")), q.mapOf(TuplesKt.to("id", "page_2"), TuplesKt.to("fullScreen", bool), TuplesKt.to("lottie", "animations/B_DigitalCard.json")), q.mapOf(TuplesKt.to("id", "page_3"), TuplesKt.to("fullScreen", bool), TuplesKt.to("lottie", "animations/C_activacion.json"))})));
    }
}
