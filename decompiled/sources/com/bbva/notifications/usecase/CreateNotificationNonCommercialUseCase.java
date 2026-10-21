package com.bbva.notifications.usecase;

import com.bbva.component.dm.settings.domain.model.AppSettings;
import com.bbva.component.dm.settings.domain.model.AppSettingsResult;
import com.bbva.component.dm.settings.domain.model.NotificationFieldConfig;
import com.bbva.component.dm.settings.repository.AppSettingsRepository;
import com.bbva.component.dm.settings.repository.SettingsPolicy;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.glomoutils.usecase.SuspendUseCaseWithParams;
import com.bbva.notifications.model.NotificationDetailItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CreateNotificationNonCommercialUseCase.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002:\u0012(\u0012&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002j\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0001B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJE\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052*\u0010\u0007\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002j\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/bbva/notifications/usecase/CreateNotificationNonCommercialUseCase;", "Lcom/bbva/glomoutils/usecase/SuspendUseCaseWithParams;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "", "Lcom/bbva/notifications/model/NotificationDetailItem;", "params", "execute", "(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/component/dm/settings/repository/AppSettingsRepository;", "appSettings", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatchers", "<init>", "(Lcom/bbva/component/dm/settings/repository/AppSettingsRepository;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCreateNotificationNonCommercialUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateNotificationNonCommercialUseCase.kt\ncom/bbva/notifications/usecase/CreateNotificationNonCommercialUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1603#2,9:45\n1855#2:54\n1856#2:56\n1612#2:57\n1#3:55\n*S KotlinDebug\n*F\n+ 1 CreateNotificationNonCommercialUseCase.kt\ncom/bbva/notifications/usecase/CreateNotificationNonCommercialUseCase\n*L\n36#1:45,9\n36#1:54\n36#1:56\n36#1:57\n36#1:55\n*E\n"})
public final class CreateNotificationNonCommercialUseCase implements SuspendUseCaseWithParams<HashMap<String, String>, List<? extends NotificationDetailItem>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AppSettingsRepository f35458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f35459b;

    /* JADX INFO: compiled from: CreateNotificationNonCommercialUseCase.kt */
    @DebugMetadata(c = "com.bbva.notifications.usecase.CreateNotificationNonCommercialUseCase$execute$2", f = "CreateNotificationNonCommercialUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends NotificationDetailItem>>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ HashMap<String, String> f35461q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HashMap<String, String> map, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f35461q0 = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CreateNotificationNonCommercialUseCase.this.new a(this.f35461q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends NotificationDetailItem>> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AppSettings data;
            NotificationFieldConfig notificationFieldConfig;
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            CreateNotificationNonCommercialUseCase createNotificationNonCommercialUseCase = CreateNotificationNonCommercialUseCase.this;
            AppSettingsResult settings = createNotificationNonCommercialUseCase.f35458a.getSettings(SettingsPolicy.Local);
            ArrayList<Map<String, String>> functionalBlocks = null;
            if (!(settings instanceof AppSettingsResult.FreshResult) && !(settings instanceof AppSettingsResult.CachedResult)) {
                settings = null;
            }
            if (settings != null && (data = settings.getData()) != null && (notificationFieldConfig = data.getNotificationFieldConfig()) != null) {
                functionalBlocks = notificationFieldConfig.getFunctionalBlocks();
            }
            return CreateNotificationNonCommercialUseCase.access$getNotificationDetailItemList(createNotificationNonCommercialUseCase, this.f35461q0, functionalBlocks);
        }
    }

    public CreateNotificationNonCommercialUseCase(@NotNull AppSettingsRepository appSettings, @NotNull ThreadDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(appSettings, "appSettings");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.f35458a = appSettings;
        this.f35459b = dispatchers;
    }

    public static final List access$getNotificationDetailItemList(CreateNotificationNonCommercialUseCase createNotificationNonCommercialUseCase, HashMap map, ArrayList arrayList) {
        String str;
        String str2;
        createNotificationNonCommercialUseCase.getClass();
        if (arrayList == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map map2 = (Map) it.next();
            String str3 = (String) map2.get("value");
            NotificationDetailItem notificationDetailItem = null;
            if (str3 != null && (str = (String) map2.get("key")) != null && map != null && (str2 = (String) map.get(str)) != null) {
                notificationDetailItem = new NotificationDetailItem(str, str3, str2);
            }
            if (notificationDetailItem != null) {
                arrayList2.add(notificationDetailItem);
            }
        }
        return arrayList2;
    }

    @Override // com.bbva.glomoutils.usecase.SuspendUseCaseWithParams
    public /* bridge */ /* synthetic */ Object execute(HashMap<String, String> map, Continuation<? super List<? extends NotificationDetailItem>> continuation) {
        return execute2(map, (Continuation<? super List<NotificationDetailItem>>) continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: execute, reason: avoid collision after fix types in other method */
    public Object execute2(@Nullable HashMap<String, String> map, @NotNull Continuation<? super List<NotificationDetailItem>> continuation) {
        return BuildersKt.withContext(this.f35459b.io(), new a(map, null), continuation);
    }

    public /* synthetic */ CreateNotificationNonCommercialUseCase(AppSettingsRepository appSettingsRepository, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(appSettingsRepository, (i10 & 2) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }
}
