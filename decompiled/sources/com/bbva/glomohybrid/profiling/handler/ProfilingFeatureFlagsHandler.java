package com.bbva.glomohybrid.profiling.handler;

import bk.q;
import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.storage.TargetStorage;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomo.user.domain.usecase.GetUserConfigurationUseCase;
import com.bbva.glomohybrid.featureflags.domain.model.FeatureFlags;
import com.bbva.glomohybrid.profiling.domain.model.Profiling;
import com.bbva.glomoutils.mappable.MappableEngineKt;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.semaas.model.Properties;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.k;
import kotlin.text.l;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ProfilingFeatureFlagsHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u0006\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/bbva/glomohybrid/profiling/handler/ProfilingFeatureFlagsHandler;", "", "Lcom/bbva/glomohybrid/featureflags/domain/model/FeatureFlags;", "featureFlag", "Lcom/bbva/glomohybrid/profiling/domain/model/Profiling;", LocalStorageConstantsKt.KEY_PROFILING, "matchFeatureFlagsCollection", "(Lcom/bbva/glomohybrid/featureflags/domain/model/FeatureFlags;Lcom/bbva/glomohybrid/profiling/domain/model/Profiling;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "Ljava/lang/String;", "getDocument", "()Ljava/lang/String;", "setDocument", "(Ljava/lang/String;)V", "document", "b", "getAppVersion", Properties.APP_VERSION, "Lcom/bbva/glomo/storage/MainStorage;", "localStorage", "Lcom/bbva/glomo/user/domain/usecase/GetUserConfigurationUseCase;", "getUserConfigurationUseCase", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatchers", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/bbva/glomo/storage/MainStorage;Lcom/bbva/glomo/user/domain/usecase/GetUserConfigurationUseCase;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "gl-feature-flags_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nProfilingFeatureFlagsHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfilingFeatureFlagsHandler.kt\ncom/bbva/glomohybrid/profiling/handler/ProfilingFeatureFlagsHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 MapExtensions.kt\ncom/bbva/glomoutils/MapExtensionsKt\n*L\n1#1,155:1\n1#2:156\n1855#3:157\n1856#3:160\n1549#3:161\n1620#3,3:162\n1549#3:165\n1620#3,3:166\n12#4:158\n12#4:159\n12#4:169\n12#4:170\n12#4:171\n12#4:172\n*S KotlinDebug\n*F\n+ 1 ProfilingFeatureFlagsHandler.kt\ncom/bbva/glomohybrid/profiling/handler/ProfilingFeatureFlagsHandler\n*L\n55#1:157\n55#1:160\n90#1:161\n90#1:162,3\n91#1:165\n91#1:166,3\n58#1:158\n62#1:159\n108#1:169\n109#1:170\n110#1:171\n111#1:172\n*E\n"})
public final class ProfilingFeatureFlagsHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String document;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String appVersion;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MainStorage f33831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final GetUserConfigurationUseCase f33832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f33833e;

    /* JADX INFO: compiled from: ProfilingFeatureFlagsHandler.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.profiling.handler.ProfilingFeatureFlagsHandler$matchFeatureFlagsCollection$2", f = "ProfilingFeatureFlagsHandler.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super FeatureFlags>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f33834p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ FeatureFlags f33836r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Profiling f33837s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FeatureFlags featureFlags, Profiling profiling, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f33836r0 = featureFlags;
            this.f33837s0 = profiling;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ProfilingFeatureFlagsHandler.this.new a(this.f33836r0, this.f33837s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super FeatureFlags> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f33834p0;
            FeatureFlags featureFlags = this.f33836r0;
            ProfilingFeatureFlagsHandler profilingFeatureFlagsHandler = ProfilingFeatureFlagsHandler.this;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Intrinsics.checkNotNull(featureFlags);
                Profiling profiling = this.f33837s0;
                Intrinsics.checkNotNull(profiling);
                this.f33834p0 = 1;
                obj = ProfilingFeatureFlagsHandler.access$evaluateProfilingModel(profilingFeatureFlagsHandler, featureFlags, profiling, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ProfilingFeatureFlagsHandler.access$reAssignNewFeatureFlagCollectionValues(profilingFeatureFlagsHandler, (Map) obj, featureFlags);
        }
    }

    public ProfilingFeatureFlagsHandler(@Nullable String str, @NotNull String appVersion, @NotNull MainStorage localStorage, @NotNull GetUserConfigurationUseCase getUserConfigurationUseCase, @NotNull ThreadDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        Intrinsics.checkNotNullParameter(getUserConfigurationUseCase, "getUserConfigurationUseCase");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.document = str;
        this.appVersion = appVersion;
        this.f33831c = localStorage;
        this.f33832d = getUserConfigurationUseCase;
        this.f33833e = dispatchers;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    /* JADX WARN: Code duplicated, block: B:32:0x0078  */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static final Object access$evaluateProfilingModel(ProfilingFeatureFlagsHandler profilingFeatureFlagsHandler, FeatureFlags featureFlags, Profiling profiling, Continuation continuation) {
        x9.a aVar;
        String str;
        String str2;
        int iIntValue;
        String strTakeLast;
        Integer intOrNull;
        profilingFeatureFlagsHandler.getClass();
        if (continuation instanceof x9.a) {
            aVar = (x9.a) continuation;
            int i10 = aVar.f94498u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f94498u0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new x9.a(profilingFeatureFlagsHandler, continuation);
            }
        } else {
            aVar = new x9.a(profilingFeatureFlagsHandler, continuation);
        }
        x9.a aVar2 = aVar;
        Object objExecute$default = aVar2.f94496s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar2.f94498u0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objExecute$default);
            if (profilingFeatureFlagsHandler.document == null) {
                GetUserConfigurationUseCase getUserConfigurationUseCase = profilingFeatureFlagsHandler.f33832d;
                aVar2.f94493p0 = profilingFeatureFlagsHandler;
                aVar2.f94494q0 = featureFlags;
                aVar2.f94495r0 = profiling;
                aVar2.f94498u0 = 1;
                objExecute$default = GetUserConfigurationUseCase.execute$default(getUserConfigurationUseCase, false, false, aVar2, 3, null);
                if (objExecute$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            str = profilingFeatureFlagsHandler.document;
            if (str != null) {
                if (!(!l.isBlank(str))) {
                    str = null;
                }
                if (str != null) {
                    Map<String, Object> mutableMap = q.toMutableMap(featureFlags.getFeatureFlagCollection());
                    Map<String, Object> futuraFlagCollections = featureFlags.getFuturaFlagCollections();
                    Map<String, Object> mutableMap2 = futuraFlagCollections != null ? q.toMutableMap(futuraFlagCollections) : null;
                    str2 = profilingFeatureFlagsHandler.document;
                    if (str2 != null || (strTakeLast = StringsKt___StringsKt.takeLast(str2, 2)) == null || (intOrNull = k.toIntOrNull(strTakeLast)) == null) {
                        iIntValue = 0;
                    } else {
                        iIntValue = intOrNull.intValue();
                    }
                    Map<String, Object> mapA = profilingFeatureFlagsHandler.a(mutableMap2, profiling, iIntValue, true);
                    Map<String, Object> mapA2 = profilingFeatureFlagsHandler.a(mutableMap, profiling, iIntValue, false);
                    mapA2.put("futuraCollections", mapA);
                    return mapA2;
                }
            }
            return null;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        profiling = aVar2.f94495r0;
        featureFlags = aVar2.f94494q0;
        profilingFeatureFlagsHandler = aVar2.f94493p0;
        ResultKt.throwOnFailure(objExecute$default);
        RememberedUser rememberedUser = ((UserProfileConfiguration) objExecute$default).getRememberedUser();
        profilingFeatureFlagsHandler.document = rememberedUser != null ? rememberedUser.getDocument() : null;
        str = profilingFeatureFlagsHandler.document;
        if (str != null) {
            if (!(!l.isBlank(str))) {
                str = null;
            }
            if (str != null) {
                Map<String, Object> mutableMap3 = q.toMutableMap(featureFlags.getFeatureFlagCollection());
                Map<String, Object> futuraFlagCollections2 = featureFlags.getFuturaFlagCollections();
                if (futuraFlagCollections2 != null) {
                }
                str2 = profilingFeatureFlagsHandler.document;
                if (str2 != null) {
                    iIntValue = 0;
                } else {
                    iIntValue = 0;
                }
                Map<String, Object> mapA3 = profilingFeatureFlagsHandler.a(mutableMap2, profiling, iIntValue, true);
                Map<String, Object> mapA4 = profilingFeatureFlagsHandler.a(mutableMap3, profiling, iIntValue, false);
                mapA4.put("futuraCollections", mapA3);
                return mapA4;
            }
        }
        return null;
    }

    public static final FeatureFlags access$reAssignNewFeatureFlagCollectionValues(ProfilingFeatureFlagsHandler profilingFeatureFlagsHandler, Map map, FeatureFlags featureFlags) {
        profilingFeatureFlagsHandler.getClass();
        if (map == null) {
            return featureFlags;
        }
        Map mutableMap = q.toMutableMap(q.plus(featureFlags.getFeatures(), TuplesKt.to("featureFlagCollection", map)));
        Object objEmptyMap = map.get("futuraCollections");
        if (objEmptyMap == null) {
            objEmptyMap = q.emptyMap();
        }
        mutableMap.put("futuraCollections", objEmptyMap);
        profilingFeatureFlagsHandler.f33831c.put(LocalStorageConstantsKt.KEY_FEATURE_FLAGS, new Gson().toJson(mutableMap), true, TargetStorage.Local);
        Map<String, Object> map2 = MappableEngineKt.toMap(mutableMap);
        Intrinsics.checkNotNull(map2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        return new FeatureFlags(map2);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Map<String, Object> a(Map<String, Object> map, Profiling profiling, int i10, boolean z10) {
        Set<Map.Entry<String, Object>> setEntrySet;
        Map mapEmptyMap;
        boolean z11;
        Map<String, Object> mutableMap = q.toMutableMap(q.emptyMap());
        if (map != null && (setEntrySet = map.entrySet()) != null) {
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (z10) {
                    Map<String, Object> futuraFlagCollections = profiling.getFuturaFlagCollections();
                    if (futuraFlagCollections != null) {
                        String str = (String) entry.getKey();
                        mapEmptyMap = q.emptyMap();
                        Object obj = futuraFlagCollections.get(str);
                        if (!(obj instanceof Map)) {
                            obj = null;
                        }
                        Map map2 = (Map) obj;
                        if (map2 != null) {
                            mapEmptyMap = map2;
                        }
                        if (mapEmptyMap == null || !(!mapEmptyMap.isEmpty())) {
                            mapEmptyMap = null;
                        }
                    } else {
                        mapEmptyMap = null;
                    }
                } else {
                    Map<String, Object> featureFlagCollection = profiling.getFeatureFlagCollection();
                    if (featureFlagCollection != null) {
                        String str2 = (String) entry.getKey();
                        mapEmptyMap = q.emptyMap();
                        Object obj2 = featureFlagCollection.get(str2);
                        if (!(obj2 instanceof Map)) {
                            obj2 = null;
                        }
                        Map map3 = (Map) obj2;
                        if (map3 != null) {
                            mapEmptyMap = map3;
                        }
                        if (mapEmptyMap == null || !(!mapEmptyMap.isEmpty())) {
                            mapEmptyMap = null;
                        }
                    } else {
                        mapEmptyMap = null;
                    }
                }
                if (mapEmptyMap != null) {
                    Object obj3 = mapEmptyMap.get("a");
                    if (!(obj3 instanceof String)) {
                        obj3 = null;
                    }
                    String str3 = (String) obj3;
                    if (str3 == null) {
                        str3 = "";
                    }
                    Object obj4 = mapEmptyMap.get("i");
                    if (!(obj4 instanceof String)) {
                        obj4 = null;
                    }
                    String str4 = (String) obj4;
                    if (str4 == null) {
                        str4 = "";
                    }
                    Object obj5 = mapEmptyMap.get("Va");
                    if (!(obj5 instanceof String)) {
                        obj5 = null;
                    }
                    String str5 = (String) obj5;
                    if (str5 == null) {
                        str5 = "";
                    }
                    Object obj6 = mapEmptyMap.get("Vi");
                    String str6 = (String) (obj6 instanceof String ? obj6 : null);
                    Profiling.ProfilingFlagsModel profilingFlagsModel = new Profiling.ProfilingFlagsModel(str3, str4, str5, str6 != null ? str6 : "");
                    String va2 = profilingFlagsModel.getVa();
                    Integer intOrNull = k.toIntOrNull(profilingFlagsModel.getA());
                    int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
                    String str7 = this.appVersion;
                    if (va2.length() == 0) {
                        z11 = false;
                    } else {
                        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str7, new String[]{Constant.DOT_STRING}, false, 0, 6, (Object) null);
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default, 10));
                        Iterator it2 = listSplit$default.iterator();
                        while (it2.hasNext()) {
                            Integer intOrNull2 = k.toIntOrNull((String) it2.next());
                            arrayList.add(Integer.valueOf(intOrNull2 != null ? intOrNull2.intValue() : 0));
                        }
                        List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) va2, new String[]{Constant.DOT_STRING}, false, 0, 6, (Object) null);
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default2, 10));
                        Iterator it3 = listSplit$default2.iterator();
                        while (it3.hasNext()) {
                            Integer intOrNull3 = k.toIntOrNull((String) it3.next());
                            arrayList2.add(Integer.valueOf(intOrNull3 != null ? intOrNull3.intValue() : 0));
                        }
                        int iMin = Math.min(arrayList.size(), arrayList2.size());
                        int i11 = 0;
                        while (true) {
                            if (i11 < iMin) {
                                int iIntValue2 = ((Number) arrayList.get(i11)).intValue();
                                int iIntValue3 = ((Number) arrayList2.get(i11)).intValue();
                                if (iIntValue2 < iIntValue3) {
                                    z11 = false;
                                } else if (iIntValue2 <= iIntValue3) {
                                    i11++;
                                }
                            }
                            z11 = true;
                        }
                    }
                    if (z10) {
                        mutableMap.put(entry.getKey(), Boolean.valueOf(z11 && i10 <= iIntValue));
                    } else {
                        mutableMap.put(entry.getKey(), MappableEngineKt.toMap(new Profiling.FeatureFlagModel((String) entry.getKey(), z11 && i10 <= iIntValue)));
                    }
                }
                if (mapEmptyMap == null) {
                    if (z10) {
                        mutableMap.put(entry.getKey(), entry.getValue());
                    } else {
                        mutableMap.put(entry.getKey(), MappableEngineKt.toMap(entry.getValue()));
                    }
                }
            }
        }
        return mutableMap;
    }

    @NotNull
    public final String getAppVersion() {
        return this.appVersion;
    }

    @Nullable
    public final String getDocument() {
        return this.document;
    }

    @Nullable
    public final Object matchFeatureFlagsCollection(@Nullable FeatureFlags featureFlags, @Nullable Profiling profiling, @NotNull Continuation<? super FeatureFlags> continuation) {
        return BuildersKt.withContext(this.f33833e.io(), new a(featureFlags, profiling, null), continuation);
    }

    public final void setDocument(@Nullable String str) {
        this.document = str;
    }

    public /* synthetic */ ProfilingFeatureFlagsHandler(String str, String str2, MainStorage mainStorage, GetUserConfigurationUseCase getUserConfigurationUseCase, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, str2, mainStorage, getUserConfigurationUseCase, (i10 & 16) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }
}
