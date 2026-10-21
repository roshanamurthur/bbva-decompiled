package com.bbva.glomohybrid.landing.domain.shortcuts;

import com.bbva.cells.componentkit.model.FetchResult;
import com.bbva.component.dm.aem.AEMDataManager;
import com.bbva.component.dm.settings.domain.model.LandingConfiguration;
import com.bbva.component.dm.settings.domain.model.LandingHeaderConfiguration;
import com.bbva.component.dm.settings.domain.model.LandingHeaderTypesConfiguration;
import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingShortcutItemModel;
import com.bbva.glomohybrid.landing.domain.model.LandingAppAccess;
import com.bbva.glomohybrid.landing.domain.model.LandingRequestHeaderParams;
import com.bbva.plugin.filefetcher.command.FetchCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingShortcutsFetcher.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/shortcuts/LandingShortcutsFetcher;", "", "Lcom/bbva/glomohybrid/landing/domain/model/LandingRequestHeaderParams;", "params", "Lcom/bbva/component/dm/settings/domain/model/LandingConfiguration;", "config", "", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingShortcutItemModel;", FetchCommand.ID, "(Lcom/bbva/glomohybrid/landing/domain/model/LandingRequestHeaderParams;Lcom/bbva/component/dm/settings/domain/model/LandingConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/component/dm/aem/AEMDataManager;", "dataManager", "Lcom/bbva/glomohybrid/landing/domain/shortcuts/LandingAvailableShortcutsPicker;", "picker", "<init>", "(Lcom/bbva/component/dm/aem/AEMDataManager;Lcom/bbva/glomohybrid/landing/domain/shortcuts/LandingAvailableShortcutsPicker;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class LandingShortcutsFetcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AEMDataManager<List<LandingShortcutItemModel>> f32782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LandingAvailableShortcutsPicker f32783b;

    /* JADX INFO: compiled from: LandingShortcutsFetcher.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.domain.shortcuts.LandingShortcutsFetcher", f = "LandingShortcutsFetcher.kt", i = {0, 0}, l = {20, 24}, m = FetchCommand.ID, n = {"this", "params"}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public LandingShortcutsFetcher f32784p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public LandingRequestHeaderParams f32785q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f32786r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f32788t0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32786r0 = obj;
            this.f32788t0 |= Integer.MIN_VALUE;
            return LandingShortcutsFetcher.this.fetch(null, null, this);
        }
    }

    public LandingShortcutsFetcher(@NotNull AEMDataManager<List<LandingShortcutItemModel>> dataManager, @NotNull LandingAvailableShortcutsPicker picker) {
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        Intrinsics.checkNotNullParameter(picker, "picker");
        this.f32782a = dataManager;
        this.f32783b = picker;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object fetch(@NotNull LandingRequestHeaderParams landingRequestHeaderParams, @Nullable LandingConfiguration landingConfiguration, @NotNull Continuation<? super List<LandingShortcutItemModel>> continuation) {
        a aVar;
        String shortcuts;
        LandingHeaderTypesConfiguration header;
        LandingHeaderConfiguration landingHeaderConfiguration;
        String shortcuts2;
        LandingHeaderTypesConfiguration header2;
        LandingHeaderConfiguration blocked;
        LandingShortcutsFetcher landingShortcutsFetcher;
        LandingHeaderTypesConfiguration header3;
        LandingHeaderConfiguration forceUpdate;
        List<LandingShortcutItemModel> listEmptyList;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f32788t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f32788t0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objPickAvailableOnes = aVar.f32786r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f32788t0;
        if (i11 != 0) {
            if (i11 == 1) {
                landingRequestHeaderParams = aVar.f32785q0;
                landingShortcutsFetcher = aVar.f32784p0;
                ResultKt.throwOnFailure(objPickAvailableOnes);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objPickAvailableOnes);
            }
        }
        ResultKt.throwOnFailure(objPickAvailableOnes);
        LandingAppAccess appState = landingRequestHeaderParams.getAppState();
        if (appState instanceof LandingAppAccess.NotAvailableForUpdate) {
            if (landingConfiguration == null || (header3 = landingConfiguration.getHeader()) == null || (forceUpdate = header3.getForceUpdate()) == null) {
                shortcuts = null;
            } else {
                shortcuts = forceUpdate.getShortcuts();
            }
        } else if (appState instanceof LandingAppAccess.NotAvailable) {
            if (landingConfiguration == null || (header2 = landingConfiguration.getHeader()) == null || (blocked = header2.getBlocked()) == null) {
                shortcuts = null;
            } else {
                shortcuts = blocked.getShortcuts();
            }
        } else {
            if (!Intrinsics.areEqual(appState, LandingAppAccess.Available.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            if (landingConfiguration != null && (header = landingConfiguration.getHeader()) != null && (landingHeaderConfiguration = header.getDefault()) != null && (shortcuts2 = landingHeaderConfiguration.getShortcuts()) != null) {
                shortcuts = shortcuts2;
            } else if (landingConfiguration != null) {
                shortcuts = landingConfiguration.getShortcuts();
            } else {
                shortcuts = null;
            }
        }
        if (shortcuts == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        aVar.f32784p0 = this;
        aVar.f32785q0 = landingRequestHeaderParams;
        aVar.f32788t0 = 1;
        objPickAvailableOnes = this.f32782a.get(shortcuts, aVar);
        if (objPickAvailableOnes == coroutine_suspended) {
            return coroutine_suspended;
        }
        landingShortcutsFetcher = this;
        FetchResult fetchResult = (FetchResult) objPickAvailableOnes;
        if (fetchResult instanceof FetchResult.Success) {
            listEmptyList = (List) ((FetchResult.Success) fetchResult).getValue();
        } else {
            if (!(fetchResult instanceof FetchResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        LandingAvailableShortcutsPicker landingAvailableShortcutsPicker = landingShortcutsFetcher.f32783b;
        UserProfileConfiguration userConfiguration = landingRequestHeaderParams.getUserConfiguration();
        aVar.f32784p0 = null;
        aVar.f32785q0 = null;
        aVar.f32788t0 = 2;
        objPickAvailableOnes = landingAvailableShortcutsPicker.pickAvailableOnes(listEmptyList, userConfiguration, aVar);
        return objPickAvailableOnes == coroutine_suspended ? coroutine_suspended : objPickAvailableOnes;
    }
}
