package com.bbva.ethermobilesdk.token.local.storage;

import android.content.Context;
import androidx.camera.core.processing.f;
import bk.w;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.token.local.storage.extension.CipherKt;
import com.bbva.ethermobilesdk.token.storage.Storage;
import com.bbva.ethermobilesdk.tokencompat.service.RelayedService;
import com.bbva.localstorage.storage.SharedPreferencesStorage;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TokenPreferencesStorage.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\tJ\u0013\u0010\u000e\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/bbva/ethermobilesdk/token/local/storage/TokenLocalStorage;", "Lcom/bbva/ethermobilesdk/token/storage/Storage;", "", "key", "value", "", "add", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", RelayedService.KEY_IDS, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", Constants.deleteAll, "Landroid/content/Context;", "context", Constants.backendRequestUserId, "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "Companion", "ethertoken-local-storage_release"}, k = 1, mv = {1, 8, 0})
public final class TokenLocalStorage implements Storage {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final SharedPreferencesStorage f30096p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Gson f30097q0;

    /* JADX INFO: compiled from: TokenPreferencesStorage.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.local.storage.TokenLocalStorage", f = "TokenPreferencesStorage.kt", i = {0, 0}, l = {44}, m = "add", n = {"this", "key"}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TokenLocalStorage f30098p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public String f30099q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f30100r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f30102t0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30100r0 = obj;
            this.f30102t0 |= Integer.MIN_VALUE;
            return TokenLocalStorage.this.add(null, null, this);
        }
    }

    /* JADX INFO: compiled from: TokenPreferencesStorage.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.local.storage.TokenLocalStorage", f = "TokenPreferencesStorage.kt", i = {0, 0}, l = {62}, m = "delete", n = {"this", "key"}, s = {"L$0", "L$1"})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TokenLocalStorage f30103p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public String f30104q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f30105r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f30107t0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30105r0 = obj;
            this.f30107t0 |= Integer.MIN_VALUE;
            return TokenLocalStorage.this.delete(null, this);
        }
    }

    /* JADX INFO: compiled from: TokenPreferencesStorage.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.local.storage.TokenLocalStorage", f = "TokenPreferencesStorage.kt", i = {0}, l = {70}, m = Constants.deleteAll, n = {"this"}, s = {"L$0"})
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TokenLocalStorage f30108p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f30109q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f30111s0;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30109q0 = obj;
            this.f30111s0 |= Integer.MIN_VALUE;
            return TokenLocalStorage.this.deleteAll(this);
        }
    }

    /* JADX INFO: compiled from: TokenPreferencesStorage.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.local.storage.TokenLocalStorage", f = "TokenPreferencesStorage.kt", i = {0}, l = {54}, m = RelayedService.KEY_IDS, n = {"this"}, s = {"L$0"})
    public static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TokenLocalStorage f30112p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f30113q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f30115s0;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30113q0 = obj;
            this.f30115s0 |= Integer.MIN_VALUE;
            return TokenLocalStorage.this.ids(this);
        }
    }

    public TokenLocalStorage(@NotNull Context context, @NotNull String userId) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userId, "userId");
        String strSha256OrOriginal = CipherKt.sha256OrOriginal(userId);
        this.f30097q0 = new Gson();
        String strSha256OrOriginal2 = CipherKt.sha256OrOriginal(strSha256OrOriginal);
        try {
            Result.Companion companion = Result.INSTANCE;
            String strSubstring = strSha256OrOriginal2.substring(0, 10);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            objM5535constructorimpl = Result.m5535constructorimpl(strSubstring);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        this.f30096p0 = new SharedPreferencesStorage(context, f.d("com.bbva.ethermobilesdk.ethertoken.local.storage.internal.", (String) (Result.m5540isFailureimpl(objM5535constructorimpl) ? userId : objM5535constructorimpl)), true, new p7.a(context), false, 16, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.ethermobilesdk.token.storage.Storage
    @Nullable
    public Object add(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation) {
        a aVar;
        TokenLocalStorage tokenLocalStorage;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f30102t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f30102t0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objIds = aVar.f30100r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f30102t0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objIds);
            this.f30096p0.set(CipherKt.sha256OrOriginal(str), str2, true);
            aVar.f30098p0 = this;
            aVar.f30099q0 = str;
            aVar.f30102t0 = 1;
            objIds = ids(aVar);
            if (objIds == coroutine_suspended) {
                return coroutine_suspended;
            }
            tokenLocalStorage = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = aVar.f30099q0;
            tokenLocalStorage = aVar.f30098p0;
            ResultKt.throwOnFailure(objIds);
        }
        Set set = (Set) objIds;
        set.add(str);
        tokenLocalStorage.f30096p0.set(CipherKt.sha256OrOriginal("token.ids"), tokenLocalStorage.f30097q0.toJson(set), true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.ethermobilesdk.token.storage.Storage
    @Nullable
    public Object delete(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        b bVar;
        TokenLocalStorage tokenLocalStorage;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f30107t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f30107t0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objIds = bVar.f30105r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f30107t0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objIds);
            this.f30096p0.remove(CipherKt.sha256OrOriginal(str));
            bVar.f30103p0 = this;
            bVar.f30104q0 = str;
            bVar.f30107t0 = 1;
            objIds = ids(bVar);
            if (objIds == coroutine_suspended) {
                return coroutine_suspended;
            }
            tokenLocalStorage = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = bVar.f30104q0;
            tokenLocalStorage = bVar.f30103p0;
            ResultKt.throwOnFailure(objIds);
        }
        Set set = (Set) objIds;
        set.remove(str);
        tokenLocalStorage.f30096p0.set(CipherKt.sha256OrOriginal("token.ids"), tokenLocalStorage.f30097q0.toJson(set), true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.ethermobilesdk.token.storage.Storage
    @Nullable
    public Object deleteAll(@NotNull Continuation<? super Unit> continuation) {
        c cVar;
        TokenLocalStorage tokenLocalStorage;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i10 = cVar.f30111s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f30111s0 = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objIds = cVar.f30109q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = cVar.f30111s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objIds);
            this.f30096p0.set(CipherKt.sha256OrOriginal("token.ids"), this.f30097q0.toJson(w.emptySet()), true);
            cVar.f30108p0 = this;
            cVar.f30111s0 = 1;
            objIds = ids(cVar);
            if (objIds == coroutine_suspended) {
                return coroutine_suspended;
            }
            tokenLocalStorage = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tokenLocalStorage = cVar.f30108p0;
            ResultKt.throwOnFailure(objIds);
        }
        Iterator it = ((Set) objIds).iterator();
        while (it.hasNext()) {
            tokenLocalStorage.f30096p0.remove(CipherKt.sha256OrOriginal((String) it.next()));
        }
        return Unit.INSTANCE;
    }

    @Override // com.bbva.ethermobilesdk.token.storage.Storage
    @Nullable
    public Object get(@NotNull String str, @NotNull Continuation<? super String> continuation) {
        return this.f30096p0.getString(CipherKt.sha256OrOriginal(str), null, true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.ethermobilesdk.token.storage.Storage
    @Nullable
    public Object ids(@NotNull Continuation<? super Set<String>> continuation) {
        d dVar;
        TokenLocalStorage tokenLocalStorage;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i10 = dVar.f30115s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f30115s0 = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj = dVar.f30113q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = dVar.f30115s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            dVar.f30112p0 = this;
            dVar.f30115s0 = 1;
            obj = get("token.ids", dVar);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            tokenLocalStorage = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tokenLocalStorage = dVar.f30112p0;
            ResultKt.throwOnFailure(obj);
        }
        Type type = new TypeToken<Set<String>>() { // from class: com.bbva.ethermobilesdk.token.local.storage.TokenLocalStorage$ids$type$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<MutableSet<String>>() {}.type");
        Set set = (Set) tokenLocalStorage.f30097q0.fromJson((String) obj, type);
        return set == null ? new LinkedHashSet() : set;
    }
}
