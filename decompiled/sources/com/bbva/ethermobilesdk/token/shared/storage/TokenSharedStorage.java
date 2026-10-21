package com.bbva.ethermobilesdk.token.shared.storage;

import android.content.Context;
import bk.w;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.sharedstorage.SharedStorage;
import com.bbva.ethermobilesdk.sharedstorage.model.entry.Entry;
import com.bbva.ethermobilesdk.token.storage.Storage;
import com.bbva.ethermobilesdk.tokencompat.service.RelayedService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TokenSharedStorage.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\tJ\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/bbva/ethermobilesdk/token/shared/storage/TokenSharedStorage;", "Lcom/bbva/ethermobilesdk/token/storage/Storage;", "", "key", "value", "", "add", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "", RelayedService.KEY_IDS, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Constants.deleteAll, "Landroid/content/Context;", "context", "group", Constants.backendRequestUserId, "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "ethertoken-shared-storage_release"}, k = 1, mv = {1, 8, 0})
public final class TokenSharedStorage implements Storage {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final SharedStorage f30186p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Gson f30187q0;

    /* JADX INFO: compiled from: TokenSharedStorage.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.shared.storage.TokenSharedStorage", f = "TokenSharedStorage.kt", i = {0, 0}, l = {23}, m = "add", n = {"this", "key"}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TokenSharedStorage f30188p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public String f30189q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f30190r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f30192t0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30190r0 = obj;
            this.f30192t0 |= Integer.MIN_VALUE;
            return TokenSharedStorage.this.add(null, null, this);
        }
    }

    /* JADX INFO: compiled from: TokenSharedStorage.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.shared.storage.TokenSharedStorage", f = "TokenSharedStorage.kt", i = {0, 0}, l = {35}, m = "delete", n = {"this", "key"}, s = {"L$0", "L$1"})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TokenSharedStorage f30193p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public String f30194q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f30195r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f30197t0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30195r0 = obj;
            this.f30197t0 |= Integer.MIN_VALUE;
            return TokenSharedStorage.this.delete(null, this);
        }
    }

    /* JADX INFO: compiled from: TokenSharedStorage.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.shared.storage.TokenSharedStorage", f = "TokenSharedStorage.kt", i = {0}, l = {49}, m = Constants.deleteAll, n = {"this"}, s = {"L$0"})
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TokenSharedStorage f30198p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f30199q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f30201s0;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30199q0 = obj;
            this.f30201s0 |= Integer.MIN_VALUE;
            return TokenSharedStorage.this.deleteAll(this);
        }
    }

    public TokenSharedStorage(@NotNull Context context, @NotNull String group, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f30186p0 = new SharedStorage(context, group, userId);
        this.f30187q0 = new Gson();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.ethermobilesdk.token.storage.Storage
    @Nullable
    public Object add(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation) {
        a aVar;
        TokenSharedStorage tokenSharedStorage;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f30192t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f30192t0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objIds = aVar.f30190r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f30192t0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objIds);
            this.f30186p0.getEtherToken().addToken(str, str2);
            aVar.f30188p0 = this;
            aVar.f30189q0 = str;
            aVar.f30192t0 = 1;
            objIds = ids(aVar);
            if (objIds == coroutine_suspended) {
                return coroutine_suspended;
            }
            tokenSharedStorage = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = aVar.f30189q0;
            tokenSharedStorage = aVar.f30188p0;
            ResultKt.throwOnFailure(objIds);
        }
        Set set = (Set) objIds;
        set.add(str);
        Entry ids = tokenSharedStorage.f30186p0.getEtherToken().getIds();
        String json = tokenSharedStorage.f30187q0.toJson(set);
        Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(tokenIds)");
        ids.set(json);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.ethermobilesdk.token.storage.Storage
    @Nullable
    public Object delete(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        b bVar;
        TokenSharedStorage tokenSharedStorage;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f30197t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f30197t0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objIds = bVar.f30195r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f30197t0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objIds);
            this.f30186p0.getEtherToken().deleteToken(str);
            bVar.f30193p0 = this;
            bVar.f30194q0 = str;
            bVar.f30197t0 = 1;
            objIds = ids(bVar);
            if (objIds == coroutine_suspended) {
                return coroutine_suspended;
            }
            tokenSharedStorage = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = bVar.f30194q0;
            tokenSharedStorage = bVar.f30193p0;
            ResultKt.throwOnFailure(objIds);
        }
        Set set = (Set) objIds;
        set.remove(str);
        Entry ids = tokenSharedStorage.f30186p0.getEtherToken().getIds();
        String json = tokenSharedStorage.f30187q0.toJson(set);
        Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(tokenIds)");
        ids.set(json);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.ethermobilesdk.token.storage.Storage
    @Nullable
    public Object deleteAll(@NotNull Continuation<? super Unit> continuation) {
        c cVar;
        TokenSharedStorage tokenSharedStorage;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i10 = cVar.f30201s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f30201s0 = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objIds = cVar.f30199q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = cVar.f30201s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objIds);
            Entry ids = this.f30186p0.getEtherToken().getIds();
            String json = this.f30187q0.toJson(w.emptySet());
            Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(emptySet<String>())");
            ids.set(json);
            cVar.f30198p0 = this;
            cVar.f30201s0 = 1;
            objIds = ids(cVar);
            if (objIds == coroutine_suspended) {
                return coroutine_suspended;
            }
            tokenSharedStorage = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tokenSharedStorage = cVar.f30198p0;
            ResultKt.throwOnFailure(objIds);
        }
        Iterator it = ((Set) objIds).iterator();
        while (it.hasNext()) {
            tokenSharedStorage.f30186p0.getEtherToken().deleteToken((String) it.next());
        }
        return Unit.INSTANCE;
    }

    @Override // com.bbva.ethermobilesdk.token.storage.Storage
    @Nullable
    public Object get(@NotNull String str, @NotNull Continuation<? super String> continuation) {
        return com.bbva.ethermobilesdk.token.shared.storage.extension.ResultKt.valueOrNull(this.f30186p0.getEtherToken().getToken(str));
    }

    @Override // com.bbva.ethermobilesdk.token.storage.Storage
    @Nullable
    public Object ids(@NotNull Continuation<? super Set<String>> continuation) {
        String strValueOrNull = com.bbva.ethermobilesdk.token.shared.storage.extension.ResultKt.valueOrNull(this.f30186p0.getEtherToken().getIds().get());
        Type type = new TypeToken<Set<String>>() { // from class: com.bbva.ethermobilesdk.token.shared.storage.TokenSharedStorage$ids$type$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<MutableSet<String>>() {}.type");
        Set set = (Set) this.f30187q0.fromJson(strValueOrNull, type);
        return set == null ? new LinkedHashSet() : set;
    }
}
