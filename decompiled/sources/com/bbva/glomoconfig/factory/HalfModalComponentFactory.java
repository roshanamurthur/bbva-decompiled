package com.bbva.glomoconfig.factory;

import androidx.camera.core.imagecapture.a;
import bk.q;
import com.bbva.component.ui.modal.halfmodal.model.ButtonConfig;
import com.bbva.component.ui.modal.halfmodal.model.HalfModalState;
import com.bbva.component.ui.modal.halfmodal.model.HalfModalType;
import com.bbva.glomo.resource.ResourceProvider;
import com.bbva.glomoconfig.ComponentFactory;
import com.bbva.glomoconfig.R;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import com.bbva.glomoutils.StringExtensionsKt;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: HalfModalComponentFactory.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0010\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0004J\u0006\u0010\u0012\u001a\u00020\u0004J\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u0013¨\u0006\u0018"}, d2 = {"Lcom/bbva/glomoconfig/factory/HalfModalComponentFactory;", "Lcom/bbva/glomoconfig/ComponentFactory;", "", "userName", "Lcom/bbva/component/ui/modal/halfmodal/model/HalfModalState;", "changeUser", "blockedUser", "biometricHalfModalError", "technicalError", "kne0116Error", "akamaiError", "contingencyError", LoginHelperConstants.ERROR_CODE_INVALID_CREDENTIAL, "standInUser", "unavailableService", "genericError", "biometricHalfModalFatalError", "networkError", "changeProfileError", "", "", "profileGemaError", "<init>", "()V", "gl-config_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nHalfModalComponentFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HalfModalComponentFactory.kt\ncom/bbva/glomoconfig/factory/HalfModalComponentFactory\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,243:1\n56#2,6:244\n*S KotlinDebug\n*F\n+ 1 HalfModalComponentFactory.kt\ncom/bbva/glomoconfig/factory/HalfModalComponentFactory\n*L\n14#1:244,6\n*E\n"})
public final class HalfModalComponentFactory implements ComponentFactory {

    @NotNull
    public static final HalfModalComponentFactory INSTANCE;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final Lazy f30927p0;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final HalfModalComponentFactory halfModalComponentFactory = new HalfModalComponentFactory();
        INSTANCE = halfModalComponentFactory;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        f30927p0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<ResourceProvider>() { // from class: com.bbva.glomoconfig.factory.HalfModalComponentFactory$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomo.resource.ResourceProvider, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ResourceProvider invoke() {
                KoinComponent koinComponent = halfModalComponentFactory;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(ResourceProvider.class), qualifier, objArr);
            }
        });
    }

    public static ResourceProvider a() {
        return (ResourceProvider) f30927p0.getValue();
    }

    public static /* synthetic */ HalfModalState changeUser$default(HalfModalComponentFactory halfModalComponentFactory, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return halfModalComponentFactory.changeUser(str);
    }

    @NotNull
    public final HalfModalState akamaiError() {
        return new HalfModalState(HalfModalType.DEFAULT, a().getString(R.string.half_modal_error_akamai_title), R.drawable.ic_close_cross, Integer.valueOf(R.drawable.ic_warning_red), (String) null, a().getString(R.string.half_modal_error_akamai_message), new ButtonConfig(a().getString(R.string.half_modal_error_akamai_positive_button), true), (ButtonConfig) null, 144, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final HalfModalState biometricHalfModalError() {
        return new HalfModalState(HalfModalType.DEFAULT, a().getString(R.string.half_modal_biometric_error_title), R.drawable.ic_close_cross, Integer.valueOf(R.drawable.ic_warning_red), (String) null, a().getString(R.string.half_modal_biometric_error_message), new ButtonConfig(a().getString(R.string.half_modal_biometric_error_positive_button), true), (ButtonConfig) null, 144, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final HalfModalState biometricHalfModalFatalError() {
        return new HalfModalState(HalfModalType.DEFAULT, a().getString(R.string.half_modal_biometric_fatal_error_title), R.drawable.ic_close_cross, Integer.valueOf(R.drawable.ic_warning_red), (String) null, a().getString(R.string.half_modal_biometric_fatal_error_message), new ButtonConfig(a().getString(R.string.half_modal_biometric_fatal_error_primary_button), true), (ButtonConfig) null, 144, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final HalfModalState blockedUser() {
        return new HalfModalState(HalfModalType.DEFAULT, a().getString(R.string.half_modal_blocked_user_title), R.drawable.ic_close_cross, Integer.valueOf(R.drawable.ic_warning_red), (String) null, a().getString(R.string.half_modal_blocked_user_message), new ButtonConfig(a().getString(R.string.half_modal_blocked_user_positive_button), true), (ButtonConfig) null, 144, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final HalfModalState changeProfileError() {
        return new HalfModalState(HalfModalType.DEFAULT, a().getString(R.string.half_modal_change_profile_error_title), R.drawable.ic_close_cross, Integer.valueOf(R.drawable.ic_warning_red), (String) null, a().getString(R.string.half_modal_change_profile_error_message), new ButtonConfig(a().getString(R.string.half_modal_change_profile_error_positive_button), true), new ButtonConfig(a().getString(R.string.half_modal_change_profile_error_negative_button), true), 16, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final HalfModalState changeUser(@Nullable String userName) {
        return new HalfModalState(HalfModalType.DEFAULT, a().getString(R.string.half_modal_change_user_title), R.drawable.ic_close_cross, Integer.valueOf(R.drawable.ic_warning_red), (String) null, a().getString(R.string.half_modal_change_user_message, userName != null ? StringExtensionsKt.capitalizeWord(userName) : null), new ButtonConfig(a().getString(R.string.half_modal_change_user_positive_button), true), (ButtonConfig) null, 144, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final HalfModalState contingencyError() {
        return new HalfModalState(HalfModalType.DEFAULT, a().getString(R.string.half_modal_flowmeter_title), R.drawable.ic_close_cross, Integer.valueOf(R.drawable.ic_warning_red), (String) null, a().getString(R.string.half_modal_flowmeter_message), new ButtonConfig(a().getString(R.string.half_modal_flowmeter_button), true), (ButtonConfig) null, 144, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final HalfModalState genericError() {
        return new HalfModalState(HalfModalType.DEFAULT, a().getString(R.string.half_modal_unavailable_service_title), R.drawable.ic_close_cross, Integer.valueOf(R.drawable.ic_warning_red), (String) null, a().getString(R.string.half_modal_unavailable_service_message), new ButtonConfig(a().getString(R.string.half_modal_unavailable_service_positive_button), true), (ButtonConfig) null, 144, (DefaultConstructorMarker) null);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return ComponentFactory.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final HalfModalState invalidCredentials() {
        return new HalfModalState(HalfModalType.DEFAULT, a().getString(R.string.half_modal_invalid_credentials_error_title), R.drawable.ic_close_cross, Integer.valueOf(R.drawable.ic_warning_red), (String) null, a().getString(R.string.half_modal_invalid_credentials_error_message), new ButtonConfig(a().getString(R.string.half_modal_invalid_credentials_error_possitive_button), true), (ButtonConfig) null, 144, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final HalfModalState kne0116Error() {
        return new HalfModalState(HalfModalType.DEFAULT, a().getString(R.string.half_modal_technical_error_title), R.drawable.ic_close_cross, Integer.valueOf(R.drawable.ic_warning_red), (String) null, a().getString(R.string.half_modal_error_kne0116_message), new ButtonConfig(a().getString(R.string.half_modal_error_kne0116_positive_button), true), (ButtonConfig) null, 144, (DefaultConstructorMarker) null);
    }

    @Override // com.bbva.glomoconfig.ComponentFactory
    @NotNull
    public Pair<String, Map<String, String>> literal(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        return ComponentFactory.DefaultImpls.literal(this, str, str2, str3);
    }

    @NotNull
    public final HalfModalState networkError() {
        return new HalfModalState(HalfModalType.DEFAULT, a().getString(R.string.half_modal_network_error_title), R.drawable.ic_close_cross, Integer.valueOf(R.drawable.ic_warning_red), (String) null, a().getString(R.string.half_modal_network_error_message), new ButtonConfig(a().getString(R.string.half_modal_network_error_positive_button), true), new ButtonConfig(a().getString(R.string.half_modal_network_error_secondary_button), true), 16, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final Map<String, Object> profileGemaError() {
        return q.mapOf(TuplesKt.to("type", "error"), ComponentFactory.DefaultImpls.literal$default(this, "title", a().getString(R.string.half_modal_unavailable_service_message), null, 4, null), ComponentFactory.DefaultImpls.literal$default(this, "message", a().getString(R.string.half_modal_change_profile_error_message), null, 4, null), ComponentFactory.DefaultImpls.literal$default(this, "negativeButton", a().getString(R.string.half_modal_standin_user_positive_button), null, 4, null));
    }

    @Override // com.bbva.glomoconfig.ComponentFactory
    @NotNull
    public Pair<String, Map<String, String>> resource(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        return ComponentFactory.DefaultImpls.resource(this, str, str2, str3);
    }

    @NotNull
    public final HalfModalState standInUser() {
        return new HalfModalState(HalfModalType.DEFAULT, a().getString(R.string.half_modal_standin_user_title), R.drawable.ic_close_cross, Integer.valueOf(R.drawable.ic_warning_red), (String) null, a().getString(R.string.half_modal_standin_user_message), new ButtonConfig(a().getString(R.string.half_modal_standin_user_positive_button), true), (ButtonConfig) null, 144, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final HalfModalState technicalError() {
        return new HalfModalState(HalfModalType.DEFAULT, a().getString(R.string.half_modal_technical_error_title), R.drawable.ic_close_cross, Integer.valueOf(R.drawable.ic_warning_red), (String) null, a().getString(R.string.half_modal_technical_error_message), new ButtonConfig(a().getString(R.string.half_modal_technical_error_positive_button), true), (ButtonConfig) null, 144, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final HalfModalState unavailableService() {
        return new HalfModalState(HalfModalType.DEFAULT, a().getString(R.string.half_modal_unavailable_service_title), R.drawable.ic_close_cross, Integer.valueOf(R.drawable.ic_warning_red), (String) null, a().getString(R.string.half_modal_unavailable_service_message), new ButtonConfig(a().getString(R.string.half_modal_unavailable_service_positive_button), true), (ButtonConfig) null, 144, (DefaultConstructorMarker) null);
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
