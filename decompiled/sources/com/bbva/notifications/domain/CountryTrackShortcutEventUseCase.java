package com.bbva.notifications.domain;

import androidx.camera.core.imagecapture.a;
import com.bbva.component.dm.analytics.AnalyticsManager;
import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: CountryTrackShortcutEventUseCase.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/notifications/domain/CountryTrackShortcutEventUseCase;", "Lcom/bbva/notifications/domain/TrackShortcutEventUseCase;", "", "params", "", "execute", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;)V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCountryTrackShortcutEventUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryTrackShortcutEventUseCase.kt\ncom/bbva/notifications/domain/CountryTrackShortcutEventUseCase\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,31:1\n56#2,6:32\n*S KotlinDebug\n*F\n+ 1 CountryTrackShortcutEventUseCase.kt\ncom/bbva/notifications/domain/CountryTrackShortcutEventUseCase\n*L\n14#1:32,6\n*E\n"})
public final class CountryTrackShortcutEventUseCase implements TrackShortcutEventUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f35348a;

    /* JADX WARN: Multi-variable type inference failed */
    public CountryTrackShortcutEventUseCase(@NotNull final ViewModelComponentsProviders provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f35348a = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<AnalyticsManager>() { // from class: com.bbva.notifications.domain.CountryTrackShortcutEventUseCase$special$$inlined$inject$default$1
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
    }

    @Override // com.bbva.glomoutils.usecase.UseCaseWithParams
    public /* bridge */ /* synthetic */ Unit execute(String str) {
        execute2(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: execute, reason: avoid collision after fix types in other method */
    public void execute2(@NotNull String params) {
        AnalyticsEvent analyticsEvent;
        Intrinsics.checkNotNullParameter(params, "params");
        switch (params) {
            case "TOP_UP":
                analyticsEvent = AnalyticsEvent.SHORTCUT_LINK_TOP_UP;
                break;
            case "CARDLESS_WITHDRAWAL":
                analyticsEvent = AnalyticsEvent.SHORTCUT_LINK_WITHDRAWAL_WITHOUT_CARDS;
                break;
            case "REJECTED_CARD":
                analyticsEvent = AnalyticsEvent.SHORTCUT_LINK_REJECTED_CARD;
                break;
            case "PAYMENT_SERVICE":
                analyticsEvent = AnalyticsEvent.SHORTCUT_LINK_PAY_SERVICES;
                break;
            case "TRANSFER":
                analyticsEvent = AnalyticsEvent.SHORTCUT_LINK_TRANSFER;
                break;
            default:
                return;
        }
        ((AnalyticsManager) this.f35348a.getValue()).trackEvent(analyticsEvent);
    }
}
