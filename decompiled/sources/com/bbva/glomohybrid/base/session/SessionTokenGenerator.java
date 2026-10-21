package com.bbva.glomohybrid.base.session;

import androidx.annotation.VisibleForTesting;
import bk.p;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.bridge.dispatcher.WebMessage;
import com.bbva.glomo.securesharing.SecureSharingConstantsKt;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomo.user.domain.usecase.StoreUserTypeUseCase;
import com.bbva.glomohybrid.base.cells.channels.CellsChannels;
import com.bbva.glomohybrid.base.usecase.AbstractStartBioCatchUseCase;
import com.bbva.qrcreatorplugin.command.GenerateCommand;
import com.bbva.session.domain.observers.SessionTokenObserver;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SessionTokenGenerator.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u000b\u001a\u00020\u0004J\u0010\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002R,\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lcom/bbva/glomohybrid/base/session/SessionTokenGenerator;", "", "Lcom/bbva/glomo/user/domain/model/UserType;", "userType", "", GenerateCommand.ID, "(Lcom/bbva/glomo/user/domain/model/UserType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "channel", "sendCsidToWeb", "(Lcom/bbva/glomo/user/domain/model/UserType;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearCache", "getToken", "", "f", "Ljava/util/Map;", "getCache", "()Ljava/util/Map;", "getCache$annotations", "()V", "cache", "Lcom/bbva/glomohybrid/base/session/TokenGenerator;", "tokenGenerator", "", "Lcom/bbva/session/domain/observers/SessionTokenObserver;", "observers", "Lcom/bbva/glomo/user/domain/usecase/StoreUserTypeUseCase;", "storeUserTypeUseCase", "Lcom/bbva/bridge/dispatcher/MessageDispatcher;", "dispatcher", "Lcom/bbva/glomohybrid/base/usecase/AbstractStartBioCatchUseCase;", "startBioCatchUseCase", "<init>", "(Lcom/bbva/glomohybrid/base/session/TokenGenerator;Ljava/util/List;Lcom/bbva/glomo/user/domain/usecase/StoreUserTypeUseCase;Lcom/bbva/bridge/dispatcher/MessageDispatcher;Lcom/bbva/glomohybrid/base/usecase/AbstractStartBioCatchUseCase;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSessionTokenGenerator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionTokenGenerator.kt\ncom/bbva/glomohybrid/base/session/SessionTokenGenerator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,77:1\n1855#2,2:78\n*S KotlinDebug\n*F\n+ 1 SessionTokenGenerator.kt\ncom/bbva/glomohybrid/base/session/SessionTokenGenerator\n*L\n36#1:78,2\n*E\n"})
public final class SessionTokenGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TokenGenerator f31517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<SessionTokenObserver> f31518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final StoreUserTypeUseCase f31519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final MessageDispatcher f31520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final AbstractStartBioCatchUseCase f31521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f31522f;

    /* JADX INFO: compiled from: SessionTokenGenerator.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserType.values().length];
            try {
                iArr[UserType.ENTERPRISE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: SessionTokenGenerator.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.base.session.SessionTokenGenerator", f = "SessionTokenGenerator.kt", i = {0, 0, 1, 1, 2, 2, 3}, l = {27, 28, 34, 36}, m = GenerateCommand.ID, n = {"this", "userType", "this", "userType", "this", "sessionToken", "sessionToken"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Object f31523p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Object f31524q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f31525r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f31527t0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31525r0 = obj;
            this.f31527t0 |= Integer.MIN_VALUE;
            return SessionTokenGenerator.this.generate(null, this);
        }
    }

    /* JADX INFO: compiled from: SessionTokenGenerator.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.base.session.SessionTokenGenerator", f = "SessionTokenGenerator.kt", i = {0, 0, 0}, l = {58}, m = "generateAndSaveOnCache", n = {"this", "userType", "token"}, s = {"L$0", "L$1", "L$2"})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public SessionTokenGenerator f31528p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public UserType f31529q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public String f31530r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f31531s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f31533u0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31531s0 = obj;
            this.f31533u0 |= Integer.MIN_VALUE;
            return SessionTokenGenerator.this.a(null, this);
        }
    }

    /* JADX INFO: compiled from: SessionTokenGenerator.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.base.session.SessionTokenGenerator$sendCsidToWeb$2", f = "SessionTokenGenerator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ UserType f31535q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f31536r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(UserType userType, String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f31535q0 = userType;
            this.f31536r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SessionTokenGenerator.this.new c(this.f31535q0, this.f31536r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MessageDispatcher messageDispatcher;
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            SessionTokenGenerator sessionTokenGenerator = SessionTokenGenerator.this;
            String str = sessionTokenGenerator.getCache().get(this.f31535q0);
            if (str == null || (messageDispatcher = sessionTokenGenerator.f31520d) == null) {
                return null;
            }
            messageDispatcher.sendMessage(new WebMessage(this.f31536r0, p.mapOf(TuplesKt.to(SecureSharingConstantsKt.KEY_CUSTOMER_BIOCATCH, str))));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SessionTokenGenerator(@NotNull TokenGenerator tokenGenerator, @NotNull List<? extends SessionTokenObserver> observers, @Nullable StoreUserTypeUseCase storeUserTypeUseCase, @Nullable MessageDispatcher messageDispatcher, @Nullable AbstractStartBioCatchUseCase abstractStartBioCatchUseCase) {
        Intrinsics.checkNotNullParameter(tokenGenerator, "tokenGenerator");
        Intrinsics.checkNotNullParameter(observers, "observers");
        this.f31517a = tokenGenerator;
        this.f31518b = observers;
        this.f31519c = storeUserTypeUseCase;
        this.f31520d = messageDispatcher;
        this.f31521e = abstractStartBioCatchUseCase;
        this.f31522f = new LinkedHashMap();
    }

    public static final Object access$startBioCatch(SessionTokenGenerator sessionTokenGenerator, UserType userType, String str, Continuation continuation) {
        sessionTokenGenerator.getClass();
        return userType == UserType.PERSONAL ? BuildersKt.withContext(Dispatchers.getMain(), new g8.a(sessionTokenGenerator, str, null), continuation) : Unit.INSTANCE;
    }

    public static /* synthetic */ Object sendCsidToWeb$default(SessionTokenGenerator sessionTokenGenerator, UserType userType, String str, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            userType = UserType.PERSONAL;
        }
        if ((i10 & 2) != 0) {
            str = CellsChannels.INSTANCE.getGlobalNativeUuidChannel().getName();
            Intrinsics.checkNotNullExpressionValue(str, "getName(...)");
        }
        return sessionTokenGenerator.sendCsidToWeb(userType, str, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(UserType userType, Continuation<? super String> continuation) {
        b bVar;
        String strGenerate;
        SessionTokenGenerator sessionTokenGenerator;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f31533u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f31533u0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f31531s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f31533u0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            strGenerate = this.f31517a.generate();
            bVar.f31528p0 = this;
            bVar.f31529q0 = userType;
            bVar.f31530r0 = strGenerate;
            bVar.f31533u0 = 1;
            if ((userType == UserType.PERSONAL ? BuildersKt.withContext(Dispatchers.getMain(), new g8.a(this, strGenerate, null), bVar) : Unit.INSTANCE) == coroutine_suspended) {
                return coroutine_suspended;
            }
            sessionTokenGenerator = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = bVar.f31530r0;
            UserType userType2 = bVar.f31529q0;
            sessionTokenGenerator = bVar.f31528p0;
            ResultKt.throwOnFailure(obj);
            strGenerate = str;
            userType = userType2;
        }
        sessionTokenGenerator.f31522f.put(userType, strGenerate);
        return strGenerate;
    }

    public final void clearCache() {
        this.f31522f.clear();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[LOOP:0: B:40:0x00d2->B:50:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object generate(@NotNull UserType userType, @NotNull Continuation<? super Unit> continuation) {
        a aVar;
        SessionTokenGenerator sessionTokenGenerator;
        String str;
        UserType userType2;
        String str2;
        String name;
        String str3;
        Iterator it;
        SessionTokenObserver sessionTokenObserver;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f31527t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f31527t0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objA = aVar.f31525r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f31527t0;
        if (i11 != 0) {
            if (i11 == 1) {
                userType = (UserType) aVar.f31524q0;
                sessionTokenGenerator = (SessionTokenGenerator) aVar.f31523p0;
                ResultKt.throwOnFailure(objA);
            } else if (i11 == 2) {
                userType = (UserType) aVar.f31524q0;
                sessionTokenGenerator = (SessionTokenGenerator) aVar.f31523p0;
                ResultKt.throwOnFailure(objA);
                str = (String) objA;
                String str4 = str;
                userType2 = userType;
                str2 = str4;
                if (WhenMappings.$EnumSwitchMapping$0[userType2.ordinal()] == 1) {
                    name = CellsChannels.INSTANCE.getGlobalNativeGemaUuidChannel().getName();
                } else {
                    name = CellsChannels.INSTANCE.getGlobalNativeUuidChannel().getName();
                }
                Intrinsics.checkNotNull(name);
                aVar.f31523p0 = sessionTokenGenerator;
                aVar.f31524q0 = str2;
                aVar.f31527t0 = 3;
                if (sessionTokenGenerator.sendCsidToWeb(userType2, name, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Iterator it2 = sessionTokenGenerator.f31518b.iterator();
                str3 = str2;
                it = it2;
            } else if (i11 == 3) {
                str2 = (String) aVar.f31524q0;
                sessionTokenGenerator = (SessionTokenGenerator) aVar.f31523p0;
                ResultKt.throwOnFailure(objA);
                Iterator it3 = sessionTokenGenerator.f31518b.iterator();
                str3 = str2;
                it = it3;
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) aVar.f31524q0;
                str3 = (String) aVar.f31523p0;
                ResultKt.throwOnFailure(objA);
            }
            while (it.hasNext()) {
                sessionTokenObserver = (SessionTokenObserver) it.next();
                aVar.f31523p0 = str3;
                aVar.f31524q0 = it;
                aVar.f31527t0 = 4;
                if (sessionTokenObserver.onNewToken(str3, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objA);
        StoreUserTypeUseCase storeUserTypeUseCase = this.f31519c;
        if (storeUserTypeUseCase != null) {
            aVar.f31523p0 = this;
            aVar.f31524q0 = userType;
            aVar.f31527t0 = 1;
            if (storeUserTypeUseCase.execute(userType, (Continuation<? super Unit>) aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        sessionTokenGenerator = this;
        str = (String) sessionTokenGenerator.f31522f.get(userType);
        if (str == null) {
            aVar.f31523p0 = sessionTokenGenerator;
            aVar.f31524q0 = userType;
            aVar.f31527t0 = 2;
            objA = sessionTokenGenerator.a(userType, aVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = (String) objA;
        }
        String str5 = str;
        userType2 = userType;
        str2 = str5;
        if (WhenMappings.$EnumSwitchMapping$0[userType2.ordinal()] == 1) {
            name = CellsChannels.INSTANCE.getGlobalNativeGemaUuidChannel().getName();
        } else {
            name = CellsChannels.INSTANCE.getGlobalNativeUuidChannel().getName();
        }
        Intrinsics.checkNotNull(name);
        aVar.f31523p0 = sessionTokenGenerator;
        aVar.f31524q0 = str2;
        aVar.f31527t0 = 3;
        if (sessionTokenGenerator.sendCsidToWeb(userType2, name, aVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        Iterator it4 = sessionTokenGenerator.f31518b.iterator();
        str3 = str2;
        it = it4;
        while (it.hasNext()) {
            sessionTokenObserver = (SessionTokenObserver) it.next();
            aVar.f31523p0 = str3;
            aVar.f31524q0 = it;
            aVar.f31527t0 = 4;
            if (sessionTokenObserver.onNewToken(str3, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final Map<UserType, String> getCache() {
        return this.f31522f;
    }

    @Nullable
    public final String getToken(@NotNull UserType userType) {
        Intrinsics.checkNotNullParameter(userType, "userType");
        return (String) this.f31522f.get(userType);
    }

    @Nullable
    public final Object sendCsidToWeb(@NotNull UserType userType, @NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        return BuildersKt.withContext(Dispatchers.getMain(), new c(userType, str, null), continuation);
    }

    public /* synthetic */ SessionTokenGenerator(TokenGenerator tokenGenerator, List list, StoreUserTypeUseCase storeUserTypeUseCase, MessageDispatcher messageDispatcher, AbstractStartBioCatchUseCase abstractStartBioCatchUseCase, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(tokenGenerator, (i10 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, storeUserTypeUseCase, messageDispatcher, abstractStartBioCatchUseCase);
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getCache$annotations() {
    }
}
