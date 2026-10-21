package com.bbva.glomohybrid.landing.presentation.viewmodel.handler;

import androidx.camera.core.imagecapture.a;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardModel;
import com.bbva.glomohybrid.landing.domain.sections.model.LandingSection;
import com.bbva.glomohybrid.landing.domain.usecase.MarkLandingSectionAsDeletedUseCase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;
import p9.b;
import p9.c;

/* JADX INFO: compiled from: LandingActionsHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006R%\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/viewmodel/handler/LandingActionsHandler;", "Lkotlinx/coroutines/CoroutineScope;", "", "id", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingMessageCardModel;", "section", "", "Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingSection;", "sections", "", "onTap", "Lkotlinx/coroutines/flow/Flow;", "s0", "Lkotlinx/coroutines/flow/Flow;", "getSections", "()Lkotlinx/coroutines/flow/Flow;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingActionsHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingActionsHandler.kt\ncom/bbva/glomohybrid/landing/presentation/viewmodel/handler/LandingActionsHandler\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n56#2,6:66\n766#3:72\n857#3,2:73\n*S KotlinDebug\n*F\n+ 1 LandingActionsHandler.kt\ncom/bbva/glomohybrid/landing/presentation/viewmodel/handler/LandingActionsHandler\n*L\n21#1:66,6\n50#1:72\n50#1:73,2\n*E\n"})
public final class LandingActionsHandler implements CoroutineScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f33237p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Lazy f33238q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final Channel<List<LandingSection>> f33239r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Flow<List<LandingSection>> sections;

    /* JADX INFO: compiled from: LandingActionsHandler.kt */
    public static final class a extends Lambda implements Function0<ParametersHolder> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ViewModelComponentsProviders f33241p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewModelComponentsProviders viewModelComponentsProviders) {
            super(0);
            this.f33241p0 = viewModelComponentsProviders;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(this.f33241p0);
        }
    }

    public LandingActionsHandler(@NotNull final ViewModelComponentsProviders provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f33237p0 = CoroutineScopeKt.MainScope();
        final a aVar = new a(provider);
        final Qualifier qualifier = null;
        this.f33238q0 = LazyKt__LazyJVMKt.lazy(KoinPlatformTools.INSTANCE.defaultLazyMode(), (Function0) new Function0<MarkLandingSectionAsDeletedUseCase>() { // from class: com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingActionsHandler$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.landing.domain.usecase.MarkLandingSectionAsDeletedUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MarkLandingSectionAsDeletedUseCase invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(MarkLandingSectionAsDeletedUseCase.class), qualifier, aVar);
            }
        });
        Channel<List<LandingSection>> channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
        this.f33239r0 = channelChannel$default;
        this.sections = FlowKt.receiveAsFlow(channelChannel$default);
    }

    public static final MarkLandingSectionAsDeletedUseCase access$getMarkSectionAsDeletedUseCase(LandingActionsHandler landingActionsHandler) {
        return (MarkLandingSectionAsDeletedUseCase) landingActionsHandler.f33238q0.getValue();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f33237p0.getCoroutineContext();
    }

    @NotNull
    public final Flow<List<LandingSection>> getSections() {
        return this.sections;
    }

    public final void onTap(@NotNull String id, @Nullable LandingMessageCardModel section, @Nullable List<? extends LandingSection> sections) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(id, "id");
        if (Intrinsics.areEqual(id, LandingAEMModel.INSTANCE.getACTION_CLOSE())) {
            if (sections != null) {
                arrayList = new ArrayList();
                for (Object obj : sections) {
                    if (!Intrinsics.areEqual((LandingSection) obj, section)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new c(this, arrayList, null), 3, null);
            if (Intrinsics.areEqual(arrayList != null ? Integer.valueOf(arrayList.size()) : null, sections != null ? Integer.valueOf(sections.size()) : null)) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new b(this, section, null), 3, null);
        }
    }
}
