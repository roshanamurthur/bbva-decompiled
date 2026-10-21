package com.bbva.glomohybrid.landing.presentation.viewmodel.handler;

import androidx.camera.core.imagecapture.a;
import bk.q;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomohybrid.base.cells.channels.CellsChannels;
import com.bbva.glomohybrid.base.cells.constants.NativeClickConstants;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.slidemenuview.cells.components.dm.infraestructure.MenuIdentifierMapper;
import com.bbva.ui.component.menu.model.MenuItem;
import com.google.android.gms.common.Scopes;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
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

/* JADX INFO: compiled from: LandingClickDispatcher.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¨\u0006\u000f"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/viewmodel/handler/LandingClickDispatcher;", "", "Lcom/bbva/ui/component/menu/model/MenuItem;", AnalyticsConstants.Key.ITEM, "Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", Scopes.PROFILE, "", "notifyClick", "", "channelName", "notifyWebChannelClick", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingClickDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingClickDispatcher.kt\ncom/bbva/glomohybrid/landing/presentation/viewmodel/handler/LandingClickDispatcher\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,41:1\n56#2,6:42\n*S KotlinDebug\n*F\n+ 1 LandingClickDispatcher.kt\ncom/bbva/glomohybrid/landing/presentation/viewmodel/handler/LandingClickDispatcher\n*L\n14#1:42,6\n*E\n"})
public final class LandingClickDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f33311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final MessageDispatcher f33312b;

    /* JADX WARN: Multi-variable type inference failed */
    public LandingClickDispatcher(@NotNull final ViewModelComponentsProviders provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f33311a = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<MenuIdentifierMapper>() { // from class: com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingClickDispatcher$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.slidemenuview.cells.components.dm.infraestructure.MenuIdentifierMapper, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MenuIdentifierMapper invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(MenuIdentifierMapper.class), qualifier, objArr);
            }
        });
        this.f33312b = (MessageDispatcher) provider.provide("web-dispatcher");
    }

    public final void notifyClick(@NotNull MenuItem item, @NotNull UserProfileConfiguration profile) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(profile, "profile");
        MessageDispatcher messageDispatcher = this.f33312b;
        if (messageDispatcher != null) {
            Pair[] pairArr = new Pair[2];
            pairArr[0] = TuplesKt.to("id", ((MenuIdentifierMapper) this.f33311a.getValue()).stringIdentifier(item.getId()));
            String str = profile.getRememberedUser() != null ? NativeClickConstants.SIDEBAR_CACHED : null;
            if (str == null) {
                str = NativeClickConstants.SIDEBAR_PUBLIC;
            }
            pairArr[1] = TuplesKt.to("page", str);
            messageDispatcher.sendMessage(CellsChannels.NATIVE_CLICK_EVENT, q.mapOf(pairArr));
        }
    }

    public final void notifyWebChannelClick(@NotNull String channelName) {
        Intrinsics.checkNotNullParameter(channelName, "channelName");
        MessageDispatcher messageDispatcher = this.f33312b;
        if (messageDispatcher != null) {
            messageDispatcher.notifyEvent(channelName);
        }
    }
}
