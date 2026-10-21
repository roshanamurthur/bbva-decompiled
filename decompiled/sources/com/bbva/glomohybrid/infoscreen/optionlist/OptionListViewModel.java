package com.bbva.glomohybrid.infoscreen.optionlist;

import androidx.lifecycle.ViewModelKt;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.component.dm.settings.domain.usecase.FetchSettingsUseCase;
import com.bbva.glomohybrid.base.viewmodel.BaseViewModel;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.infoscreen.optionlist.handler.OptionListAnalyticsHandler;
import com.bbva.glomohybrid.infoscreen.optionlist.model.ButtonLink;
import com.bbva.glomohybrid.infoscreen.optionlist.model.OptionData;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: OptionListViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u001c\u0010\u000f\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rR\u001a\u0010\u0014\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006#"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListViewModel;", "Lcom/bbva/glomohybrid/base/viewmodel/BaseViewModel;", "", "backPressed", "Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListContract$Intent;", "intent", "setIntent", "Lcom/bbva/glomohybrid/infoscreen/optionlist/model/OptionData;", "option", "trackEvent", "Lcom/bbva/cellscore/channel/model/Channel;", "Ljava/lang/Void;", "channel", "", "message", "sendMessageToWeb", "r0", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListContract$Event;", "v0", "Lkotlinx/coroutines/flow/Flow;", "getEvents", "()Lkotlinx/coroutines/flow/Flow;", "events", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "componentsProviders", "Lcom/bbva/glomohybrid/infoscreen/optionlist/handler/OptionListAnalyticsHandler;", "optionsListAnalyticsHandler", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;Lcom/bbva/glomohybrid/infoscreen/optionlist/handler/OptionListAnalyticsHandler;)V", "Companion", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nOptionListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OptionListViewModel.kt\ncom/bbva/glomohybrid/infoscreen/optionlist/OptionListViewModel\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,95:1\n56#2,6:96\n56#2,6:102\n*S KotlinDebug\n*F\n+ 1 OptionListViewModel.kt\ncom/bbva/glomohybrid/infoscreen/optionlist/OptionListViewModel\n*L\n31#1:96,6\n32#1:102,6\n*E\n"})
public final class OptionListViewModel extends BaseViewModel {

    @NotNull
    public static final String ID = "invalid-credentials-component";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final OptionListAnalyticsHandler f32390q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final Lazy f32392s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final Lazy f32393t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<OptionListContract.Event> f32394u0;

    @NotNull
    public final MutableStateFlow v0;

    /* JADX INFO: compiled from: OptionListViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionData.Type.values().length];
            try {
                iArr[OptionData.Type.APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionData.Type.NAVIGATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionData.Type.NAVIGATION_BUNDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OptionData.Type.CLOSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OptionData.Type.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ OptionListViewModel(ViewModelComponentsProviders viewModelComponentsProviders, OptionListAnalyticsHandler optionListAnalyticsHandler, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewModelComponentsProviders, (i10 & 2) != 0 ? new OptionListAnalyticsHandler(viewModelComponentsProviders) : optionListAnalyticsHandler);
    }

    public static final FetchSettingsUseCase access$getFetchSettingsUseCase(OptionListViewModel optionListViewModel) {
        return (FetchSettingsUseCase) optionListViewModel.f32392s0.getValue();
    }

    public final void backPressed() {
        this.f32394u0.setValue(OptionListContract.Event.Finish.INSTANCE);
    }

    @NotNull
    public final Flow<OptionListContract.Event> getEvents() {
        return this.v0;
    }

    @Override // com.bbva.glomohybrid.base.viewmodel.BaseViewModel
    @NotNull
    public String getId() {
        return this.id;
    }

    public final void sendMessageToWeb(@NotNull Channel<Void> channel, @NotNull String message) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(message, "message");
        MessageDispatcher messageDispatcher = (MessageDispatcher) this.f32393t0.getValue();
        String name = channel.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        messageDispatcher.sendMessage(name, message);
    }

    public final void setIntent(@NotNull OptionListContract.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        boolean z10 = intent instanceof OptionListContract.Intent.OptionSelected;
        MutableStateFlow<OptionListContract.Event> mutableStateFlow = this.f32394u0;
        if (!z10) {
            if (intent instanceof OptionListContract.Intent.ButtonOptionTapped) {
                OptionData data = ((OptionListContract.Intent.ButtonOptionTapped) intent).getData();
                ButtonLink buttonLink = data.getButtonLink();
                mutableStateFlow.setValue(new OptionListContract.Event.NavigateTo(OptionData.copy$default(data, 0, 0, false, null, buttonLink != null ? buttonLink.getRoute() : null, null, null, 111, null)));
                return;
            }
            return;
        }
        OptionData data2 = ((OptionListContract.Intent.OptionSelected) intent).getData();
        trackEvent(data2);
        int i10 = WhenMappings.$EnumSwitchMapping$0[data2.getType().ordinal()];
        if (i10 == 1) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new c(this, null), 3, null);
            return;
        }
        if (i10 == 2) {
            mutableStateFlow.setValue(new OptionListContract.Event.NavigateTo(data2));
        } else if (i10 == 3) {
            mutableStateFlow.setValue(new OptionListContract.Event.NavigateToAffiliatePage(data2));
        } else {
            if (i10 != 4) {
                return;
            }
            backPressed();
        }
    }

    public final void trackEvent(@NotNull OptionData option) {
        Intrinsics.checkNotNullParameter(option, "option");
        this.f32390q0.trackEvent(option);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OptionListViewModel(@NotNull final ViewModelComponentsProviders componentsProviders, @NotNull OptionListAnalyticsHandler optionsListAnalyticsHandler) {
        Intrinsics.checkNotNullParameter(componentsProviders, "componentsProviders");
        Intrinsics.checkNotNullParameter(optionsListAnalyticsHandler, "optionsListAnalyticsHandler");
        this.f32390q0 = optionsListAnalyticsHandler;
        this.id = ID;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f32392s0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<FetchSettingsUseCase>() { // from class: com.bbva.glomohybrid.infoscreen.optionlist.OptionListViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.component.dm.settings.domain.usecase.FetchSettingsUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FetchSettingsUseCase invoke() {
                KoinComponent koinComponent = componentsProviders;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.camera.core.imagecapture.a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(FetchSettingsUseCase.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.f32393t0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<MessageDispatcher>() { // from class: com.bbva.glomohybrid.infoscreen.optionlist.OptionListViewModel$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.bridge.dispatcher.MessageDispatcher, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MessageDispatcher invoke() {
                KoinComponent koinComponent = componentsProviders;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.camera.core.imagecapture.a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(MessageDispatcher.class), objArr2, objArr3);
            }
        });
        MutableStateFlow<OptionListContract.Event> MutableStateFlow = StateFlowKt.MutableStateFlow(OptionListContract.Event.Starting.INSTANCE);
        this.f32394u0 = MutableStateFlow;
        this.v0 = MutableStateFlow;
        ComponentManager.addComponentToPage(componentsProviders.getPageId(), ID, this);
    }
}
