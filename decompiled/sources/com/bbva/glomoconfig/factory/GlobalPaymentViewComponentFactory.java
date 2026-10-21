package com.bbva.glomoconfig.factory;

import androidx.camera.core.imagecapture.a;
import bk.p;
import bk.q;
import com.bbva.glomo.resource.ResourceProvider;
import com.bbva.glomoconfig.ComponentFactory;
import com.bbva.glomoconfig.R;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: GlobalPaymentViewComponentFactory.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\t"}, d2 = {"Lcom/bbva/glomoconfig/factory/GlobalPaymentViewComponentFactory;", "Lcom/bbva/glomoconfig/ComponentFactory;", "", "", "", "paymentBiometricsDialog", "paymentCredentialsDialog", "<init>", "()V", "gl-config_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nGlobalPaymentViewComponentFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlobalPaymentViewComponentFactory.kt\ncom/bbva/glomoconfig/factory/GlobalPaymentViewComponentFactory\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,49:1\n56#2,6:50\n*S KotlinDebug\n*F\n+ 1 GlobalPaymentViewComponentFactory.kt\ncom/bbva/glomoconfig/factory/GlobalPaymentViewComponentFactory\n*L\n10#1:50,6\n*E\n"})
public final class GlobalPaymentViewComponentFactory implements ComponentFactory {

    @NotNull
    public static final GlobalPaymentViewComponentFactory INSTANCE;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final Lazy f30923p0;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final GlobalPaymentViewComponentFactory globalPaymentViewComponentFactory = new GlobalPaymentViewComponentFactory();
        INSTANCE = globalPaymentViewComponentFactory;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        f30923p0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<ResourceProvider>() { // from class: com.bbva.glomoconfig.factory.GlobalPaymentViewComponentFactory$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomo.resource.ResourceProvider, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ResourceProvider invoke() {
                KoinComponent koinComponent = globalPaymentViewComponentFactory;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(ResourceProvider.class), qualifier, objArr);
            }
        });
    }

    public final Pair<String, Map<String, String>> a(int i10) {
        return ComponentFactory.DefaultImpls.literal$default(this, "text", ((ResourceProvider) f30923p0.getValue()).getString(i10), null, 4, null);
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
    public final Map<String, Object> paymentBiometricsDialog() {
        Boolean bool = Boolean.FALSE;
        return q.mapOf(TuplesKt.to("title", p.mapOf(a(R.string.payment_biometrics_authentication_title))), TuplesKt.to(NotificationMessage.NOTIF_KEY_SUB_TITLE, p.mapOf(a(R.string.payment_biometrics_authentication_subtitle))), TuplesKt.to("negativeButtonText", p.mapOf(a(R.string.payment_biometrics_authentication_negative_button_text))), TuplesKt.to("isDeviceCredentialAllowed", bool), TuplesKt.to("isConfirmationRequired", bool));
    }

    @NotNull
    public final Map<String, Object> paymentCredentialsDialog() {
        return q.mapOf(TuplesKt.to("title", p.mapOf(a(R.string.payment_credentials_authentication_title))), TuplesKt.to(NotificationMessage.NOTIF_KEY_SUB_TITLE, p.mapOf(a(R.string.payment_credentials_authentication_subtitle))), TuplesKt.to("negativeButtonText", p.mapOf(a(R.string.biometrics_negative_button_text))), TuplesKt.to("isDeviceCredentialAllowed", Boolean.TRUE), TuplesKt.to("isConfirmationRequired", Boolean.FALSE));
    }

    @Override // com.bbva.glomoconfig.ComponentFactory
    @NotNull
    public Pair<String, Map<String, String>> resource(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        return ComponentFactory.DefaultImpls.resource(this, str, str2, str3);
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
}
