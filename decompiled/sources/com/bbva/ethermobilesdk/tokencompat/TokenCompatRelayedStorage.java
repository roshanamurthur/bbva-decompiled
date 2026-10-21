package com.bbva.ethermobilesdk.tokencompat;

import android.content.Context;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.token.storage.Storage;
import com.bbva.ethermobilesdk.tokencompat.service.RelayedService;
import java.util.Collection;
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

/* JADX INFO: compiled from: TokenCompatRelayedStorage.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\tJ\u0013\u0010\u000e\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\fR\u001a\u0010\u0014\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatRelayedStorage;", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatStorage;", "", "key", "value", "", "add", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", RelayedService.KEY_IDS, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", Constants.deleteAll, "Lcom/bbva/ethermobilesdk/token/storage/Storage;", "x0", "Lcom/bbva/ethermobilesdk/token/storage/Storage;", "getRelayedStorage$ethertoken_compat_release", "()Lcom/bbva/ethermobilesdk/token/storage/Storage;", "relayedStorage", "Landroid/content/Context;", "context", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig$StorageMode;", "mode", "<init>", "(Landroid/content/Context;Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig$StorageMode;Lcom/bbva/ethermobilesdk/token/storage/Storage;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
public final class TokenCompatRelayedStorage extends TokenCompatStorage {

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Storage relayedStorage;

    /* JADX INFO: compiled from: TokenCompatRelayedStorage.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.tokencompat.TokenCompatRelayedStorage", f = "TokenCompatRelayedStorage.kt", i = {0, 0, 0}, l = {13, 14}, m = "add", n = {"this", "key", "value"}, s = {"L$0", "L$1", "L$2"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TokenCompatRelayedStorage f30358p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public String f30359q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public String f30360r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f30361s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f30363u0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30361s0 = obj;
            this.f30363u0 |= Integer.MIN_VALUE;
            return TokenCompatRelayedStorage.this.add(null, null, this);
        }
    }

    /* JADX INFO: compiled from: TokenCompatRelayedStorage.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.tokencompat.TokenCompatRelayedStorage", f = "TokenCompatRelayedStorage.kt", i = {0, 0}, l = {29, 30}, m = "delete", n = {"this", "key"}, s = {"L$0", "L$1"})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TokenCompatRelayedStorage f30364p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public String f30365q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f30366r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f30368t0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30366r0 = obj;
            this.f30368t0 |= Integer.MIN_VALUE;
            return TokenCompatRelayedStorage.this.delete(null, this);
        }
    }

    /* JADX INFO: compiled from: TokenCompatRelayedStorage.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.tokencompat.TokenCompatRelayedStorage", f = "TokenCompatRelayedStorage.kt", i = {0}, l = {33, 34}, m = Constants.deleteAll, n = {"this"}, s = {"L$0"})
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TokenCompatRelayedStorage f30369p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f30370q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f30372s0;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30370q0 = obj;
            this.f30372s0 |= Integer.MIN_VALUE;
            return TokenCompatRelayedStorage.this.deleteAll(this);
        }
    }

    /* JADX INFO: compiled from: TokenCompatRelayedStorage.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.tokencompat.TokenCompatRelayedStorage", f = "TokenCompatRelayedStorage.kt", i = {0, 0, 1, 1, 2, 2}, l = {17, 18, 19, 20}, m = "get", n = {"this", "key", "this", "key", "this", "key"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Object f30373p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public String f30374q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public String f30375r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f30376s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f30378u0;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30376s0 = obj;
            this.f30378u0 |= Integer.MIN_VALUE;
            return TokenCompatRelayedStorage.this.get(null, this);
        }
    }

    /* JADX INFO: compiled from: TokenCompatRelayedStorage.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.tokencompat.TokenCompatRelayedStorage", f = "TokenCompatRelayedStorage.kt", i = {0}, l = {24, 25}, m = RelayedService.KEY_IDS, n = {"this"}, s = {"L$0"})
    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Object f30379p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Set f30380q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f30381r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f30383t0;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30381r0 = obj;
            this.f30383t0 |= Integer.MIN_VALUE;
            return TokenCompatRelayedStorage.this.ids(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenCompatRelayedStorage(@NotNull Context context, @NotNull TokenCompatConfig.StorageMode mode, @NotNull Storage relayedStorage) {
        super(context, mode, TokenCompatStorage.INSTANCE.provider(context, mode));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(relayedStorage, "relayedStorage");
        this.relayedStorage = relayedStorage;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.ethermobilesdk.tokencompat.TokenCompatStorage, com.bbva.ethermobilesdk.token.storage.Storage
    @Nullable
    public Object add(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation) {
        a aVar;
        TokenCompatRelayedStorage tokenCompatRelayedStorage;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f30363u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f30363u0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f30361s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f30363u0;
        if (i11 != 0) {
            if (i11 == 1) {
                str2 = aVar.f30360r0;
                str = aVar.f30359q0;
                tokenCompatRelayedStorage = aVar.f30358p0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        aVar.f30358p0 = this;
        aVar.f30359q0 = str;
        aVar.f30360r0 = str2;
        aVar.f30363u0 = 1;
        if (super.add(str, str2, aVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        tokenCompatRelayedStorage = this;
        Storage storage = tokenCompatRelayedStorage.relayedStorage;
        aVar.f30358p0 = null;
        aVar.f30359q0 = null;
        aVar.f30360r0 = null;
        aVar.f30363u0 = 2;
        if (storage.add(str, str2, aVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.ethermobilesdk.tokencompat.TokenCompatStorage, com.bbva.ethermobilesdk.token.storage.Storage
    @Nullable
    public Object delete(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        b bVar;
        TokenCompatRelayedStorage tokenCompatRelayedStorage;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f30368t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f30368t0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f30366r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f30368t0;
        if (i11 != 0) {
            if (i11 == 1) {
                str = bVar.f30365q0;
                tokenCompatRelayedStorage = bVar.f30364p0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        bVar.f30364p0 = this;
        bVar.f30365q0 = str;
        bVar.f30368t0 = 1;
        if (super.delete(str, bVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        tokenCompatRelayedStorage = this;
        Storage storage = tokenCompatRelayedStorage.relayedStorage;
        bVar.f30364p0 = null;
        bVar.f30365q0 = null;
        bVar.f30368t0 = 2;
        if (storage.delete(str, bVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.ethermobilesdk.tokencompat.TokenCompatStorage, com.bbva.ethermobilesdk.token.storage.Storage
    @Nullable
    public Object deleteAll(@NotNull Continuation<? super Unit> continuation) {
        c cVar;
        TokenCompatRelayedStorage tokenCompatRelayedStorage;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i10 = cVar.f30372s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f30372s0 = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.f30370q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = cVar.f30372s0;
        if (i11 != 0) {
            if (i11 == 1) {
                tokenCompatRelayedStorage = cVar.f30369p0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        cVar.f30369p0 = this;
        cVar.f30372s0 = 1;
        if (super.deleteAll(cVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        tokenCompatRelayedStorage = this;
        Storage storage = tokenCompatRelayedStorage.relayedStorage;
        cVar.f30369p0 = null;
        cVar.f30372s0 = 2;
        if (storage.deleteAll(cVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Code duplicated, block: B:34:0x0099 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.ethermobilesdk.tokencompat.TokenCompatStorage, com.bbva.ethermobilesdk.token.storage.Storage
    @Nullable
    public Object get(@NotNull String str, @NotNull Continuation<? super String> continuation) throws TokenCompatStorageError {
        d dVar;
        TokenCompatRelayedStorage tokenCompatRelayedStorage;
        TokenCompatRelayedStorage tokenCompatRelayedStorage2;
        String str2;
        String str3;
        Storage storage;
        Object obj;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i10 = dVar.f30378u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f30378u0 = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj2 = dVar.f30376s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = dVar.f30378u0;
        if (i11 != 0) {
            if (i11 == 1) {
                str = dVar.f30374q0;
                tokenCompatRelayedStorage = (TokenCompatRelayedStorage) dVar.f30373p0;
                ResultKt.throwOnFailure(obj2);
            } else if (i11 == 2) {
                str3 = dVar.f30375r0;
                str2 = dVar.f30374q0;
                tokenCompatRelayedStorage2 = (TokenCompatRelayedStorage) dVar.f30373p0;
                ResultKt.throwOnFailure(obj2);
                if (str3 == null) {
                    return str3;
                }
                str = str2;
                tokenCompatRelayedStorage = tokenCompatRelayedStorage2;
                dVar.f30373p0 = tokenCompatRelayedStorage;
                dVar.f30374q0 = str;
                dVar.f30375r0 = null;
                dVar.f30378u0 = 3;
                obj2 = super.get(str, dVar);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                storage = tokenCompatRelayedStorage.relayedStorage;
                dVar.f30373p0 = obj2;
                dVar.f30374q0 = null;
                dVar.f30378u0 = 4;
                if (storage.add(str, (String) obj2, dVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = obj2;
            } else if (i11 == 3) {
                str = dVar.f30374q0;
                tokenCompatRelayedStorage = (TokenCompatRelayedStorage) dVar.f30373p0;
                ResultKt.throwOnFailure(obj2);
                storage = tokenCompatRelayedStorage.relayedStorage;
                dVar.f30373p0 = obj2;
                dVar.f30374q0 = null;
                dVar.f30378u0 = 4;
                if (storage.add(str, (String) obj2, dVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = obj2;
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = dVar.f30373p0;
                ResultKt.throwOnFailure(obj2);
            }
            return (String) obj;
        }
        ResultKt.throwOnFailure(obj2);
        dVar.f30373p0 = this;
        dVar.f30374q0 = str;
        dVar.f30378u0 = 1;
        obj2 = this.relayedStorage.get(str, dVar);
        if (obj2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        tokenCompatRelayedStorage = this;
        String str4 = (String) obj2;
        if (str4 != null) {
            dVar.f30373p0 = tokenCompatRelayedStorage;
            dVar.f30374q0 = str;
            dVar.f30375r0 = str4;
            dVar.f30378u0 = 2;
            if (super.add(str, str4, dVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            tokenCompatRelayedStorage2 = tokenCompatRelayedStorage;
            str2 = str;
            str3 = str4;
            if (str3 == null) {
                return str3;
            }
            str = str2;
            tokenCompatRelayedStorage = tokenCompatRelayedStorage2;
        }
        dVar.f30373p0 = tokenCompatRelayedStorage;
        dVar.f30374q0 = str;
        dVar.f30375r0 = null;
        dVar.f30378u0 = 3;
        obj2 = super.get(str, dVar);
        if (obj2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        storage = tokenCompatRelayedStorage.relayedStorage;
        dVar.f30373p0 = obj2;
        dVar.f30374q0 = null;
        dVar.f30378u0 = 4;
        if (storage.add(str, (String) obj2, dVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        obj = obj2;
        return (String) obj;
    }

    @NotNull
    /* JADX INFO: renamed from: getRelayedStorage$ethertoken_compat_release, reason: from getter */
    public final Storage getRelayedStorage() {
        return this.relayedStorage;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.ethermobilesdk.tokencompat.TokenCompatStorage, com.bbva.ethermobilesdk.token.storage.Storage
    @Nullable
    public Object ids(@NotNull Continuation<? super Set<String>> continuation) throws TokenCompatStorageError {
        e eVar;
        TokenCompatRelayedStorage tokenCompatRelayedStorage;
        Set set;
        Object obj;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i10 = eVar.f30383t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f30383t0 = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objIds = eVar.f30381r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = eVar.f30383t0;
        if (i11 != 0) {
            if (i11 == 1) {
                tokenCompatRelayedStorage = (TokenCompatRelayedStorage) eVar.f30379p0;
                ResultKt.throwOnFailure(objIds);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                set = eVar.f30380q0;
                obj = eVar.f30379p0;
                ResultKt.throwOnFailure(objIds);
            }
            set.addAll((Collection) objIds);
            return obj;
        }
        ResultKt.throwOnFailure(objIds);
        eVar.f30379p0 = this;
        eVar.f30383t0 = 1;
        objIds = this.relayedStorage.ids(eVar);
        if (objIds == coroutine_suspended) {
            return coroutine_suspended;
        }
        tokenCompatRelayedStorage = this;
        Set set2 = (Set) objIds;
        eVar.f30379p0 = objIds;
        eVar.f30380q0 = set2;
        eVar.f30383t0 = 2;
        Object objIds2 = super.ids(eVar);
        if (objIds2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        set = set2;
        obj = objIds;
        objIds = objIds2;
        set.addAll((Collection) objIds);
        return obj;
    }
}
