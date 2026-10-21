package com.bbva.glomohybrid.settings;

import com.bbva.component.dm.settings.domain.model.AppSettings;
import com.bbva.component.dm.settings.domain.model.AppSettingsResult;
import com.bbva.component.dm.settings.domain.model.SingleAppConfiguration;
import com.bbva.component.dm.settings.domain.usecase.AppSettingsObserver;
import com.bbva.glomo.user.repository.datasource.UserTypeDataSource;
import com.bbva.glomohybrid.base.datasource.AppVersionDataSource;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SingleAppVersionsObserver.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/settings/SingleAppVersionsObserver;", "Lcom/bbva/component/dm/settings/domain/usecase/AppSettingsObserver;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/bbva/component/dm/settings/domain/model/AppSettingsResult;", "appSettingsResult", "", "onReceive", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/bbva/glomohybrid/base/datasource/AppVersionDataSource;", "dataSource", "Lcom/bbva/glomo/user/repository/datasource/UserTypeDataSource;", "userTypeDataSource", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "threadDispatchers", "<init>", "(Lcom/bbva/glomohybrid/base/datasource/AppVersionDataSource;Lcom/bbva/glomo/user/repository/datasource/UserTypeDataSource;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class SingleAppVersionsObserver implements AppSettingsObserver, CoroutineScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final AppVersionDataSource f34462p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final UserTypeDataSource f34463q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f34464r0;

    /* JADX INFO: compiled from: SingleAppVersionsObserver.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.settings.SingleAppVersionsObserver$onReceive$1", f = "SingleAppVersionsObserver.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f34465p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ AppSettingsResult f34467r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AppSettingsResult appSettingsResult, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f34467r0 = appSettingsResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SingleAppVersionsObserver.this.new a(this.f34467r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f34465p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                AppSettings data = this.f34467r0.getData();
                SingleAppVersionsObserver singleAppVersionsObserver = SingleAppVersionsObserver.this;
                boolean zAccess$handleIsSelectorActiveFlag = SingleAppVersionsObserver.access$handleIsSelectorActiveFlag(singleAppVersionsObserver, data);
                this.f34465p0 = 1;
                if (SingleAppVersionsObserver.access$storeIsSelectorActive(singleAppVersionsObserver, zAccess$handleIsSelectorActiveFlag, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public SingleAppVersionsObserver(@NotNull AppVersionDataSource dataSource, @NotNull UserTypeDataSource userTypeDataSource, @NotNull ThreadDispatchers threadDispatchers) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(userTypeDataSource, "userTypeDataSource");
        Intrinsics.checkNotNullParameter(threadDispatchers, "threadDispatchers");
        this.f34462p0 = dataSource;
        this.f34463q0 = userTypeDataSource;
        this.f34464r0 = threadDispatchers;
    }

    public static final boolean access$handleIsSelectorActiveFlag(SingleAppVersionsObserver singleAppVersionsObserver, AppSettings appSettings) {
        singleAppVersionsObserver.getClass();
        SingleAppConfiguration singleAppConfiguration = appSettings.getSingleAppConfiguration();
        if (singleAppConfiguration == null || !singleAppConfiguration.isActive()) {
            return false;
        }
        List<String> excludedVersions = singleAppConfiguration.getExcludedVersions();
        if (excludedVersions == null) {
            excludedVersions = CollectionsKt__CollectionsKt.emptyList();
        }
        return !excludedVersions.contains(singleAppVersionsObserver.f34462p0.getCurrentAppVersionName());
    }

    public static final Object access$storeIsSelectorActive(SingleAppVersionsObserver singleAppVersionsObserver, boolean z10, Continuation continuation) {
        Object objWithContext = BuildersKt.withContext(singleAppVersionsObserver.f34464r0.io(), new ea.a(singleAppVersionsObserver, z10, null), continuation);
        return objWithContext == ek.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f34464r0.io().plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null));
    }

    @Override // com.bbva.component.dm.settings.domain.usecase.AppSettingsObserver
    public void onReceive(@NotNull AppSettingsResult appSettingsResult) {
        Intrinsics.checkNotNullParameter(appSettingsResult, "appSettingsResult");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(appSettingsResult, null), 3, null);
    }

    public /* synthetic */ SingleAppVersionsObserver(AppVersionDataSource appVersionDataSource, UserTypeDataSource userTypeDataSource, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(appVersionDataSource, userTypeDataSource, (i10 & 4) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }
}
