package com.bbva.notifications.usecase;

import bk.p;
import com.bbva.component.dm.settings.domain.model.AppSettings;
import com.bbva.component.dm.settings.domain.model.AppSettingsResult;
import com.bbva.component.dm.settings.domain.model.NotificationFieldConfig;
import com.bbva.component.dm.settings.domain.model.Operative;
import com.bbva.component.dm.settings.domain.model.VersionOperative;
import com.bbva.component.dm.settings.repository.AppSettingsRepository;
import com.bbva.component.dm.settings.repository.SettingsPolicy;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.glomoutils.usecase.SuspendUseCaseWithParams;
import com.bbva.notifications.mapper.OperativeActionsMapperManager;
import com.bbva.notifications.model.NotificationShortcutItemModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetNotificationOperativesNonCommercialUseCase.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002:\u0012(\u0012&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002j\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0001B+\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013JG\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052*\u0010\u0007\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002j\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/bbva/notifications/usecase/GetNotificationOperativesNonCommercialUseCase;", "Lcom/bbva/glomoutils/usecase/SuspendUseCaseWithParams;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "", "Lcom/bbva/notifications/model/NotificationShortcutItemModel;", "params", "execute", "(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/component/dm/settings/repository/AppSettingsRepository;", "appSettings", "", "versionCode", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatchers", "Lcom/bbva/notifications/mapper/OperativeActionsMapperManager;", "operativesMapper", "<init>", "(Lcom/bbva/component/dm/settings/repository/AppSettingsRepository;ILcom/bbva/glomoutils/scheduler/ThreadDispatchers;Lcom/bbva/notifications/mapper/OperativeActionsMapperManager;)V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nGetNotificationOperativesNonCommercialUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetNotificationOperativesNonCommercialUseCase.kt\ncom/bbva/notifications/usecase/GetNotificationOperativesNonCommercialUseCase\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ApplicationUtils.kt\ncom/salesforce/marketingcloud/sfmcsdk/util/ApplicationUtilsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n478#2,7:72\n1603#3,9:79\n1855#3:88\n288#3,2:89\n1856#3:94\n1612#3:95\n58#4:91\n1#5:92\n1#5:93\n*S KotlinDebug\n*F\n+ 1 GetNotificationOperativesNonCommercialUseCase.kt\ncom/bbva/notifications/usecase/GetNotificationOperativesNonCommercialUseCase\n*L\n40#1:72,7\n52#1:79,9\n52#1:88\n53#1:89,2\n52#1:94\n52#1:95\n54#1:91\n52#1:93\n*E\n"})
public final class GetNotificationOperativesNonCommercialUseCase implements SuspendUseCaseWithParams<HashMap<String, String>, List<? extends NotificationShortcutItemModel>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AppSettingsRepository f35462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f35464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final OperativeActionsMapperManager f35465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f35466e;

    /* JADX INFO: compiled from: GetNotificationOperativesNonCommercialUseCase.kt */
    @DebugMetadata(c = "com.bbva.notifications.usecase.GetNotificationOperativesNonCommercialUseCase$execute$2", f = "GetNotificationOperativesNonCommercialUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends NotificationShortcutItemModel>>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ HashMap<String, String> f35468q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HashMap<String, String> map, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f35468q0 = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GetNotificationOperativesNonCommercialUseCase.this.new a(this.f35468q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends NotificationShortcutItemModel>> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AppSettings data;
            NotificationFieldConfig notificationFieldConfig;
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            GetNotificationOperativesNonCommercialUseCase getNotificationOperativesNonCommercialUseCase = GetNotificationOperativesNonCommercialUseCase.this;
            AppSettingsResult settings = getNotificationOperativesNonCommercialUseCase.f35462a.getSettings(SettingsPolicy.Local);
            List<Operative> operatives = null;
            if (!(settings instanceof AppSettingsResult.FreshResult) && !(settings instanceof AppSettingsResult.CachedResult)) {
                settings = null;
            }
            List listAccess$getActionList = GetNotificationOperativesNonCommercialUseCase.access$getActionList(getNotificationOperativesNonCommercialUseCase, this.f35468q0);
            if (settings != null && (data = settings.getData()) != null && (notificationFieldConfig = data.getNotificationFieldConfig()) != null) {
                operatives = notificationFieldConfig.getOperatives();
            }
            return GetNotificationOperativesNonCommercialUseCase.access$getNotificationShortcutsActionList(getNotificationOperativesNonCommercialUseCase, listAccess$getActionList, operatives);
        }
    }

    public GetNotificationOperativesNonCommercialUseCase(@NotNull AppSettingsRepository appSettings, int i10, @NotNull ThreadDispatchers dispatchers, @NotNull OperativeActionsMapperManager operativesMapper) {
        Intrinsics.checkNotNullParameter(appSettings, "appSettings");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(operativesMapper, "operativesMapper");
        this.f35462a = appSettings;
        this.f35463b = i10;
        this.f35464c = dispatchers;
        this.f35465d = operativesMapper;
        this.f35466e = 4;
    }

    public static final List access$getActionList(GetNotificationOperativesNonCommercialUseCase getNotificationOperativesNonCommercialUseCase, HashMap map) {
        Collection collectionValues;
        List listFilterNotNull;
        List list;
        getNotificationOperativesNonCommercialUseCase.getClass();
        if (map == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (l.startsWith$default((String) entry.getKey(), "action", false, 2, null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        SortedMap sortedMap = p.toSortedMap(linkedHashMap);
        if (sortedMap == null || (collectionValues = sortedMap.values()) == null || (listFilterNotNull = CollectionsKt___CollectionsKt.filterNotNull(collectionValues)) == null || (list = CollectionsKt___CollectionsKt.toList(listFilterNotNull)) == null) {
            return null;
        }
        return CollectionsKt___CollectionsKt.take(list, getNotificationOperativesNonCommercialUseCase.f35466e);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    public static final List access$getNotificationShortcutsActionList(GetNotificationOperativesNonCommercialUseCase getNotificationOperativesNonCommercialUseCase, List list, List list2) {
        Operative operative;
        VersionOperative minVersion;
        NotificationShortcutItemModel notificationShortcutItemModel;
        Object next;
        getNotificationOperativesNonCommercialUseCase.getClass();
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!Intrinsics.areEqual(((Operative) next).getId(), str));
                operative = (Operative) next;
            } else {
                operative = null;
            }
            if (operative == null || (minVersion = operative.getMinVersion()) == null) {
                notificationShortcutItemModel = null;
            } else {
                int android2 = minVersion.getAndroid();
                VersionOperative maxVersion = operative.getMaxVersion();
                if (maxVersion != null) {
                    int android3 = maxVersion.getAndroid();
                    int i10 = getNotificationOperativesNonCommercialUseCase.f35463b;
                    if (android2 > i10 || i10 > android3) {
                        notificationShortcutItemModel = null;
                    } else {
                        String id = operative.getId();
                        if (id.length() == 0) {
                            notificationShortcutItemModel = null;
                        } else {
                            String routeType = operative.getRouteType();
                            if (routeType.length() == 0) {
                                notificationShortcutItemModel = null;
                            } else {
                                String title = operative.getTitle();
                                if (title.length() == 0) {
                                    notificationShortcutItemModel = null;
                                } else {
                                    String icon = operative.getIcon();
                                    if (icon.length() == 0) {
                                        notificationShortcutItemModel = null;
                                    } else {
                                        notificationShortcutItemModel = new NotificationShortcutItemModel(id, routeType, getNotificationOperativesNonCommercialUseCase.f35465d.map(operative), title, icon);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    notificationShortcutItemModel = null;
                }
            }
            if (notificationShortcutItemModel != null) {
                arrayList.add(notificationShortcutItemModel);
            }
        }
        return arrayList;
    }

    @Override // com.bbva.glomoutils.usecase.SuspendUseCaseWithParams
    public /* bridge */ /* synthetic */ Object execute(HashMap<String, String> map, Continuation<? super List<? extends NotificationShortcutItemModel>> continuation) {
        return execute2(map, (Continuation<? super List<NotificationShortcutItemModel>>) continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: execute, reason: avoid collision after fix types in other method */
    public Object execute2(@Nullable HashMap<String, String> map, @NotNull Continuation<? super List<NotificationShortcutItemModel>> continuation) {
        return BuildersKt.withContext(this.f35464c.io(), new a(map, null), continuation);
    }

    public /* synthetic */ GetNotificationOperativesNonCommercialUseCase(AppSettingsRepository appSettingsRepository, int i10, ThreadDispatchers threadDispatchers, OperativeActionsMapperManager operativeActionsMapperManager, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(appSettingsRepository, i10, (i11 & 4) != 0 ? new DefaultThreadDispatchers() : threadDispatchers, (i11 & 8) != 0 ? OperativeActionsMapperManager.INSTANCE.getDEFAULT() : operativeActionsMapperManager);
    }
}
