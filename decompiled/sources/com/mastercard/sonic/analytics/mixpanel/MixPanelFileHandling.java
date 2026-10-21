package com.mastercard.sonic.analytics.mixpanel;

import android.content.Context;
import bk.p;
import com.bbva.notifications.constants.PushConstants;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mastercard.sonic.BuildConfig;
import com.mastercard.sonic.SonicInternalConstants;
import com.mastercard.sonic.analytics.mixpanel.MixPanelFileHandling;
import com.mastercard.sonic.analytics.mixpanel.model.MixPanel;
import com.mastercard.sonic.analytics.mixpanel.model.Properties;
import com.mastercard.sonic.model.SonicMerchant;
import com.mastercard.sonic.observers.EventManager;
import com.mastercard.sonic.observers.ThreadStatus;
import com.mastercard.sonic.utils.FileDirUtils;
import com.mastercard.sonic.utils.SingletonHolder;
import com.mastercard.sonic.utils.Utils;
import com.mastercard.sonic.utils.calendar.CalendarPart;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zh.d;
import zh.e;

/* JADX INFO: compiled from: MixPanelFileHandling.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001)J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001c\u0010\n\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006J(\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007J(\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u0007J\u0006\u0010\u0016\u001a\u00020\bR<\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u00178\u0006@BX\u0086.¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR0\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R$\u0010'\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/mastercard/sonic/analytics/mixpanel/MixPanelFileHandling;", "", "Lcom/mastercard/sonic/analytics/mixpanel/model/MixPanel;", "mixPanel", "", "addMixPanelDataToFile", "Lkotlin/Function1;", "", "", "callback", "prepareSyncFileToMixPanelAnalytics", "Lcom/mastercard/sonic/utils/calendar/CalendarPart;", "frequencyToSyncCalendarPart", "Lcom/mastercard/sonic/model/SonicMerchant;", "sonicMerchant", "cueName", "cueVersion", "isSyncToAnalyticsRequired", "merchantId", "country", "city", "getUniqueMixPanelMapKey", "deleteSyncedFile", "", "<set-?>", "b", "Ljava/util/Map;", "getMixPanelMap", "()Ljava/util/Map;", "mixPanelMap", "Lcom/mastercard/sonic/observers/EventManager;", "Lcom/mastercard/sonic/observers/ThreadStatus;", "c", "Lcom/mastercard/sonic/observers/EventManager;", "getMixPanelEventManager", "()Lcom/mastercard/sonic/observers/EventManager;", "mixPanelEventManager", "d", "Z", "isMixPanelAnalyticsSyncInProgress", "()Z", "Companion", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMixPanelFileHandling.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MixPanelFileHandling.kt\ncom/mastercard/sonic/analytics/mixpanel/MixPanelFileHandling\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,361:1\n442#2:362\n392#2:363\n1238#3,4:364\n*S KotlinDebug\n*F\n+ 1 MixPanelFileHandling.kt\ncom/mastercard/sonic/analytics/mixpanel/MixPanelFileHandling\n*L\n275#1:362\n275#1:363\n275#1:364,4\n*E\n"})
public final class MixPanelFileHandling {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f51037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public volatile Map<String, MixPanel> mixPanelMap;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean isMixPanelAnalyticsSyncInProgress;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final LinkedList f51041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f51042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public MixPanel f51043g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f51036i = {androidx.camera.core.impl.utils.c.e(MixPanelFileHandling.class, "isMixPanelFileReadWriteInProgress", "isMixPanelFileReadWriteInProgress()Z", 0)};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final ReadWriteProperty f51044h = Delegates.INSTANCE.notNull();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public volatile EventManager<ThreadStatus> mixPanelEventManager = new EventManager<>(SonicInternalConstants.MIX_PANEL_FILE_HANDLING);

    /* JADX INFO: compiled from: MixPanelFileHandling.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/mastercard/sonic/analytics/mixpanel/MixPanelFileHandling$Companion;", "Lcom/mastercard/sonic/utils/SingletonHolder;", "Lcom/mastercard/sonic/analytics/mixpanel/MixPanelFileHandling;", "Landroid/content/Context;", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion extends SingletonHolder<MixPanelFileHandling, Context> {

        /* JADX INFO: compiled from: MixPanelFileHandling.kt */
        public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Context, MixPanelFileHandling> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f51045p0 = new a();

            public a() {
                super(1, MixPanelFileHandling.class, "<init>", "<init>(Landroid/content/Context;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public final MixPanelFileHandling invoke(Context context) {
                Context p4 = context;
                Intrinsics.checkNotNullParameter(p4, "p0");
                return new MixPanelFileHandling(p4, null);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
            super(a.f51045p0);
        }
    }

    /* JADX INFO: compiled from: MixPanelFileHandling.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CalendarPart.values().length];
            try {
                iArr[CalendarPart.QUARTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: MixPanelFileHandling.kt */
    @DebugMetadata(c = "com.mastercard.sonic.analytics.mixpanel.MixPanelFileHandling$addMixPanelDataToFile$2", f = "MixPanelFileHandling.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f51046p0;

        /* JADX INFO: renamed from: com.mastercard.sonic.analytics.mixpanel.MixPanelFileHandling$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MixPanelFileHandling.kt */
        @DebugMetadata(c = "com.mastercard.sonic.analytics.mixpanel.MixPanelFileHandling$addMixPanelDataToFile$2$1", f = "MixPanelFileHandling.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0229a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f51048p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ MixPanelFileHandling f51049q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0229a(MixPanelFileHandling mixPanelFileHandling, Continuation<? super C0229a> continuation) {
                super(2, continuation);
                this.f51049q0 = mixPanelFileHandling;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0229a(this.f51049q0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0229a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f51048p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f51048p0 = 1;
                    if (MixPanelFileHandling.access$threadForAddMixPanelDataToFile(this.f51049q0, this) == coroutine_suspended) {
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

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = MixPanelFileHandling.this.new a(continuation);
            aVar.f51046p0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.f51046p0, null, null, new C0229a(MixPanelFileHandling.this, null), 3, null);
        }
    }

    /* JADX INFO: compiled from: MixPanelFileHandling.kt */
    @DebugMetadata(c = "com.mastercard.sonic.analytics.mixpanel.MixPanelFileHandling$invokeMixPanelListFromFile$2", f = "MixPanelFileHandling.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f51050p0;

        /* JADX INFO: compiled from: MixPanelFileHandling.kt */
        @DebugMetadata(c = "com.mastercard.sonic.analytics.mixpanel.MixPanelFileHandling$invokeMixPanelListFromFile$2$1", f = "MixPanelFileHandling.kt", i = {}, l = {206}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f51052p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ MixPanelFileHandling f51053q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MixPanelFileHandling mixPanelFileHandling, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f51053q0 = mixPanelFileHandling;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.f51053q0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f51052p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f51052p0 = 1;
                    if (MixPanelFileHandling.access$threadForInvokeMixPanelListFromFile(this.f51053q0, this) == coroutine_suspended) {
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

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = MixPanelFileHandling.this.new b(continuation);
            bVar.f51050p0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.f51050p0, null, null, new a(MixPanelFileHandling.this, null), 3, null);
        }
    }

    /* JADX INFO: compiled from: MixPanelFileHandling.kt */
    @DebugMetadata(c = "com.mastercard.sonic.analytics.mixpanel.MixPanelFileHandling$prepareSyncFileToMixPanelAnalytics$1", f = "MixPanelFileHandling.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f51054p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f51056r0;

        /* JADX INFO: compiled from: MixPanelFileHandling.kt */
        @DebugMetadata(c = "com.mastercard.sonic.analytics.mixpanel.MixPanelFileHandling$prepareSyncFileToMixPanelAnalytics$1$1", f = "MixPanelFileHandling.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f51057p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ MixPanelFileHandling f51058q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ Function1<String, Unit> f51059r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(MixPanelFileHandling mixPanelFileHandling, Function1<? super String, Unit> function1, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f51058q0 = mixPanelFileHandling;
                this.f51059r0 = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.f51058q0, this.f51059r0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f51057p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f51057p0 = 1;
                    if (MixPanelFileHandling.access$threadForPrepareToSyncFileToMixPanelAnalytics(this.f51058q0, this.f51059r0, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super String, Unit> function1, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f51056r0 = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            c cVar = MixPanelFileHandling.this.new c(this.f51056r0, continuation);
            cVar.f51054p0 = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.f51054p0, null, null, new a(MixPanelFileHandling.this, this.f51056r0, null), 3, null);
        }
    }

    public MixPanelFileHandling(Context context, DefaultConstructorMarker defaultConstructorMarker) throws InterruptedException {
        this.f51037a = context;
        c(false, ThreadStatus.NOT_INITIALIZED);
        this.f51042f = Dispatchers.getIO();
        this.f51043g = null;
        this.f51041e = new LinkedList();
        this.isMixPanelAnalyticsSyncInProgress = false;
        b();
    }

    public static final void access$addInsertIdAndTimeToAllMixPanel(MixPanelFileHandling mixPanelFileHandling) {
        mixPanelFileHandling.getClass();
        long currentTimestampInUtc = Utils.INSTANCE.getCurrentTimestampInUtc();
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        Map<String, MixPanel> mixPanelMap = mixPanelFileHandling.getMixPanelMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap(p.mapCapacity(mixPanelMap.size()));
        Iterator<T> it = mixPanelMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            ((MixPanel) entry.getValue()).getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().setInsertId(string);
            ((MixPanel) entry.getValue()).getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().setTime(currentTimestampInUtc);
            linkedHashMap.put(key, Unit.INSTANCE);
        }
    }

    public static final String access$convertMixPanelListToJsonString(MixPanelFileHandling mixPanelFileHandling, List list) {
        mixPanelFileHandling.getClass();
        String json = new Gson().toJson(list);
        Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(mixPanelList)");
        return json;
    }

    public static final void access$readFromFileAndAssignToMap(MixPanelFileHandling mixPanelFileHandling, String str) {
        mixPanelFileHandling.getClass();
        try {
            JsonElement string = JsonParser.parseString(str);
            if (string.isJsonArray()) {
                Intrinsics.checkNotNull(string, "null cannot be cast to non-null type com.google.gson.JsonArray");
                int size = ((JsonArray) string).size();
                for (int i10 = 0; i10 < size; i10++) {
                    JsonElement jsonElement = ((JsonArray) string).get(i10);
                    if (jsonElement.isJsonObject()) {
                        Intrinsics.checkNotNull(jsonElement, "null cannot be cast to non-null type com.google.gson.JsonObject");
                        Object objFromJson = new Gson().fromJson(jsonElement, (Class<Object>) MixPanel.class);
                        Intrinsics.checkNotNullExpressionValue(objFromJson, "gson.fromJson(mixPanelJson, MixPanel::class.java)");
                        MixPanel mixPanel = (MixPanel) objFromJson;
                        mixPanelFileHandling.getMixPanelMap().put(mixPanelFileHandling.getUniqueMixPanelMapKey(mixPanel.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().getMerchantId(), mixPanel.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().getCountry(), mixPanel.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().getCity(), mixPanel.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().getCueName()), mixPanel);
                    }
                }
            }
            mixPanelFileHandling.getMixPanelMap().size();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static final String access$renameFileToSync(MixPanelFileHandling mixPanelFileHandling) {
        mixPanelFileHandling.getClass();
        FileDirUtils fileDirUtils = FileDirUtils.INSTANCE;
        Context context = mixPanelFileHandling.f51037a;
        String mixPanelRequestToSyncFilePath = fileDirUtils.getMixPanelRequestToSyncFilePath(context);
        fileDirUtils.renameFile(fileDirUtils.getMixPanelRequestFilePath(context), mixPanelRequestToSyncFilePath);
        return mixPanelRequestToSyncFilePath;
    }

    public static final Object access$threadForAddMixPanelDataToFile(MixPanelFileHandling mixPanelFileHandling, Continuation continuation) {
        mixPanelFileHandling.getClass();
        Object objWithContext = BuildersKt.withContext(mixPanelFileHandling.f51042f, new zh.c(mixPanelFileHandling, null), continuation);
        return objWithContext == ek.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public static final Object access$threadForInvokeMixPanelListFromFile(MixPanelFileHandling mixPanelFileHandling, Continuation continuation) {
        mixPanelFileHandling.getClass();
        Object objWithContext = BuildersKt.withContext(mixPanelFileHandling.f51042f, new d(mixPanelFileHandling, null), continuation);
        return objWithContext == ek.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public static final Object access$threadForPrepareToSyncFileToMixPanelAnalytics(MixPanelFileHandling mixPanelFileHandling, Function1 function1, Continuation continuation) {
        mixPanelFileHandling.getClass();
        Object objWithContext = BuildersKt.withContext(mixPanelFileHandling.f51042f, new e(mixPanelFileHandling, function1, null), continuation);
        return objWithContext == ek.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public static final void access$writeToFile(MixPanelFileHandling mixPanelFileHandling, String str, String str2) {
        mixPanelFileHandling.getClass();
        FileDirUtils.INSTANCE.writeToFile(str2, str);
    }

    public final void a() {
        synchronized (this) {
            try {
                Iterator it = this.f51041e.iterator();
                while (it.hasNext()) {
                    MixPanel mixPanel = (MixPanel) it.next();
                    Map<String, MixPanel> mixPanelMap = getMixPanelMap();
                    String uniqueMixPanelMapKey = getUniqueMixPanelMapKey(mixPanel.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().getMerchantId(), mixPanel.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().getCountry(), mixPanel.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().getCity(), mixPanel.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().getCueName());
                    Intrinsics.checkNotNullExpressionValue(mixPanel, "mixPanel");
                    mixPanelMap.put(uniqueMixPanelMapKey, mixPanel);
                    it.remove();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean addMixPanelDataToFile(@NotNull MixPanel mixPanel) {
        Intrinsics.checkNotNullParameter(mixPanel, "mixPanel");
        this.f51043g = mixPanel;
        if (this.mixPanelMap == null) {
            b();
            return false;
        }
        synchronized (this) {
            this.f51041e.add(mixPanel);
            this.f51043g = null;
            Unit unit = Unit.INSTANCE;
        }
        if (!this.isMixPanelAnalyticsSyncInProgress) {
            if (!((Boolean) this.f51044h.getValue(this, f51036i[0])).booleanValue()) {
                a();
                BuildersKt__BuildersKt.runBlocking$default(null, new a(null), 1, null);
                return true;
            }
        }
        c(true, ThreadStatus.OPERATION_IN_PROGRESS);
        return false;
    }

    public final void b() throws InterruptedException {
        if (this.mixPanelMap != null) {
            return;
        }
        if (((Boolean) this.f51044h.getValue(this, f51036i[0])).booleanValue()) {
            return;
        }
        BuildersKt__BuildersKt.runBlocking$default(null, new b(null), 1, null);
    }

    public final void c(boolean z10, ThreadStatus threadStatus) {
        this.f51044h.setValue(this, f51036i[0], Boolean.valueOf(z10));
        this.mixPanelEventManager.notify(SonicInternalConstants.MIX_PANEL_FILE_HANDLING, threadStatus);
    }

    public final void deleteSyncedFile() {
        FileDirUtils fileDirUtils = FileDirUtils.INSTANCE;
        fileDirUtils.deleteFile(fileDirUtils.getMixPanelRequestToSyncFilePath(this.f51037a));
    }

    @NotNull
    public final EventManager<ThreadStatus> getMixPanelEventManager() {
        return this.mixPanelEventManager;
    }

    @NotNull
    public final Map<String, MixPanel> getMixPanelMap() {
        Map<String, MixPanel> map = this.mixPanelMap;
        if (map != null) {
            return map;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mixPanelMap");
        return null;
    }

    @NotNull
    public final String getUniqueMixPanelMapKey(@NotNull String merchantId, @NotNull String country, @Nullable String city, @NotNull String cueName) {
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(cueName, "cueName");
        if (city == null) {
            city = AbstractJsonLexerKt.NULL;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(merchantId);
        sb2.append(PushConstants.GE_PARAMS_SEPARATOR);
        sb2.append(country);
        sb2.append(PushConstants.GE_PARAMS_SEPARATOR);
        sb2.append(city);
        return ad.d.f(sb2, PushConstants.GE_PARAMS_SEPARATOR, cueName);
    }

    /* JADX INFO: renamed from: isMixPanelAnalyticsSyncInProgress, reason: from getter */
    public final boolean getIsMixPanelAnalyticsSyncInProgress() {
        return this.isMixPanelAnalyticsSyncInProgress;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean isSyncToAnalyticsRequired(@NotNull CalendarPart frequencyToSyncCalendarPart, @NotNull SonicMerchant sonicMerchant, @NotNull String cueName, @Nullable String cueVersion) throws InterruptedException {
        MixPanel mixPanel;
        MixPanel mixPanel2;
        Properties properties;
        Intrinsics.checkNotNullParameter(frequencyToSyncCalendarPart, "frequencyToSyncCalendarPart");
        Intrinsics.checkNotNullParameter(sonicMerchant, "sonicMerchant");
        Intrinsics.checkNotNullParameter(cueName, "cueName");
        b();
        if ((this.mixPanelMap == null && getMixPanelMap().isEmpty()) || (mixPanel = getMixPanelMap().get(getUniqueMixPanelMapKey(sonicMerchant.getMerchantId(), sonicMerchant.getCountryCode(), sonicMerchant.getCity(), cueName))) == null) {
            return false;
        }
        if ((cueVersion == null || cueVersion.length() == 0 || Intrinsics.areEqual(mixPanel.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().getCueVersion(), cueVersion)) && Intrinsics.areEqual(BuildConfig.VERSION_NAME, mixPanel.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().getSdkVersion())) {
            Map<String, MixPanel> mixPanelMap = getMixPanelMap();
            final zh.b bVar = zh.b.f95070p0;
            Map.Entry entry = (Map.Entry) CollectionsKt___CollectionsKt.minWithOrNull(mixPanelMap.entrySet(), new Comparator() { // from class: zh.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    MixPanelFileHandling.Companion companion = MixPanelFileHandling.INSTANCE;
                    Function2 tmp0 = bVar;
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    return ((Number) tmp0.invoke(obj, obj2)).intValue();
                }
            });
            String startTime = (entry == null || (mixPanel2 = (MixPanel) entry.getValue()) == null || (properties = mixPanel2.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String()) == null) ? null : properties.getStartTime();
            if (startTime == null) {
                return false;
            }
            Calendar earliestCalendarDateInMixPanel = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            Utils.Companion companion = Utils.INSTANCE;
            earliestCalendarDateInMixPanel.setTime(companion.convertFormattedToDate(startTime));
            Intrinsics.checkNotNullExpressionValue(earliestCalendarDateInMixPanel, "earliestCalendarDateInMixPanel");
            companion.removeTimeFromCalendar(earliestCalendarDateInMixPanel);
            Calendar currentCalendarDate = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            currentCalendarDate.setTime(new Date(companion.getCurrentTimestampInUtc()));
            Intrinsics.checkNotNullExpressionValue(currentCalendarDate, "currentCalendarDate");
            companion.removeTimeFromCalendar(currentCalendarDate);
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            calendar.setTime(WhenMappings.$EnumSwitchMapping$0[frequencyToSyncCalendarPart.ordinal()] == 1 ? companion.getNextQuarterDayOneFromTheDate(earliestCalendarDateInMixPanel).getTime() : companion.getNextMonthDayOneFromTheDate(earliestCalendarDateInMixPanel).getTime());
            if (!(!currentCalendarDate.before(calendar))) {
                return false;
            }
        }
        return true;
    }

    public final boolean prepareSyncFileToMixPanelAnalytics(@NotNull Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (((Boolean) this.f51044h.getValue(this, f51036i[0])).booleanValue() || this.isMixPanelAnalyticsSyncInProgress) {
            return false;
        }
        this.isMixPanelAnalyticsSyncInProgress = true;
        a();
        BuildersKt__BuildersKt.runBlocking$default(null, new c(callback, null), 1, null);
        return true;
    }
}
