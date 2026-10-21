package com.bbva.glomoconfig.factory;

import androidx.camera.core.imagecapture.a;
import com.bbva.component.ui.modal.halfmodal.model.ButtonConfig;
import com.bbva.component.ui.modal.halfmodal.model.HalfModalState;
import com.bbva.component.ui.modal.halfmodal.model.HalfModalType;
import com.bbva.glomo.resource.ResourceProvider;
import com.bbva.glomoconfig.ComponentFactory;
import com.bbva.glomoconfig.R;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: GlobalHalfModalComponentFactory.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomoconfig/factory/GlobalHalfModalComponentFactory;", "Lcom/bbva/glomoconfig/ComponentFactory;", "Lcom/bbva/component/ui/modal/halfmodal/model/HalfModalState;", "userLockOut", "changeProfile", "<init>", "()V", "gl-config_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nGlobalHalfModalComponentFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlobalHalfModalComponentFactory.kt\ncom/bbva/glomoconfig/factory/GlobalHalfModalComponentFactory\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,43:1\n56#2,6:44\n*S KotlinDebug\n*F\n+ 1 GlobalHalfModalComponentFactory.kt\ncom/bbva/glomoconfig/factory/GlobalHalfModalComponentFactory\n*L\n13#1:44,6\n*E\n"})
public final class GlobalHalfModalComponentFactory implements ComponentFactory {

    @NotNull
    public static final GlobalHalfModalComponentFactory INSTANCE;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final Lazy f30919p0;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final GlobalHalfModalComponentFactory globalHalfModalComponentFactory = new GlobalHalfModalComponentFactory();
        INSTANCE = globalHalfModalComponentFactory;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        f30919p0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<ResourceProvider>() { // from class: com.bbva.glomoconfig.factory.GlobalHalfModalComponentFactory$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomo.resource.ResourceProvider, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ResourceProvider invoke() {
                KoinComponent koinComponent = globalHalfModalComponentFactory;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(ResourceProvider.class), qualifier, objArr);
            }
        });
    }

    public static ResourceProvider a() {
        return (ResourceProvider) f30919p0.getValue();
    }

    @NotNull
    public final HalfModalState changeProfile() {
        return new HalfModalState(HalfModalType.DEFAULT, a().getString(R.string.half_modal_change_profile_title), R.drawable.ic_close_cross, Integer.valueOf(R.drawable.ic_warning_red), (String) null, a().getString(R.string.half_modal_change_profile_message), new ButtonConfig(a().getString(R.string.half_modal_change_profile_positive_button), true), (ButtonConfig) null, 144, (DefaultConstructorMarker) null);
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

    @Override // com.bbva.glomoconfig.ComponentFactory
    @NotNull
    public Pair<String, Map<String, String>> resource(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        return ComponentFactory.DefaultImpls.resource(this, str, str2, str3);
    }

    @NotNull
    public final HalfModalState userLockOut() {
        return new HalfModalState(HalfModalType.DEFAULT, a().getString(R.string.half_modal_user_lockout_title), R.drawable.ic_close_cross, Integer.valueOf(R.drawable.ic_warning_red), (String) null, a().getString(R.string.half_modal_user_lockout_message), new ButtonConfig(a().getString(R.string.half_modal_user_lockout_positive_button), true), (ButtonConfig) null, 144, (DefaultConstructorMarker) null);
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
