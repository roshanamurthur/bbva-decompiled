package com.bbva.softtokenbase.ethertoken;

import bk.w;
import com.bbva.ethermobilesdk.token.EtherToken;
import com.bbva.ethermobilesdk.token.model.EtherTokenResult;
import com.bbva.softtokenbase.SoftToken;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GloMoEtherToken.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/bbva/softtokenbase/ethertoken/GloMoEtherToken;", "Lcom/bbva/softtokenbase/SoftToken;", "", "", "getTokenList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "deleteAllTokenList", "Lcom/bbva/ethermobilesdk/token/EtherToken;", "etherToken", "<init>", "(Lcom/bbva/ethermobilesdk/token/EtherToken;)V", "softtokenbase_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nGloMoEtherToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GloMoEtherToken.kt\ncom/bbva/softtokenbase/ethertoken/GloMoEtherToken\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,30:1\n1855#2,2:31\n*S KotlinDebug\n*F\n+ 1 GloMoEtherToken.kt\ncom/bbva/softtokenbase/ethertoken/GloMoEtherToken\n*L\n27#1:31,2\n*E\n"})
public final class GloMoEtherToken implements SoftToken {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final EtherToken f36857a;

    /* JADX INFO: compiled from: GloMoEtherToken.kt */
    @DebugMetadata(c = "com.bbva.softtokenbase.ethertoken.GloMoEtherToken", f = "GloMoEtherToken.kt", i = {0, 1}, l = {26, 27}, m = "deleteAllTokenList", n = {"etherToken", "etherToken"}, s = {"L$0", "L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public EtherToken f36858p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Iterator f36859q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f36860r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f36862t0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f36860r0 = obj;
            this.f36862t0 |= Integer.MIN_VALUE;
            return GloMoEtherToken.this.deleteAllTokenList(this);
        }
    }

    /* JADX INFO: compiled from: GloMoEtherToken.kt */
    @DebugMetadata(c = "com.bbva.softtokenbase.ethertoken.GloMoEtherToken", f = "GloMoEtherToken.kt", i = {}, l = {18}, m = "getTokenList", n = {}, s = {})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f36863p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f36865r0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f36863p0 = obj;
            this.f36865r0 |= Integer.MIN_VALUE;
            return GloMoEtherToken.this.getTokenList(this);
        }
    }

    public GloMoEtherToken(@Nullable EtherToken etherToken) {
        this.f36857a = etherToken;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[LOOP:0: B:24:0x005d->B:34:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.softtokenbase.SoftToken
    @Nullable
    public Object deleteAllTokenList(@NotNull Continuation<? super Unit> continuation) {
        a aVar;
        EtherToken etherToken;
        EtherToken etherToken2;
        Iterator it;
        String str;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f36862t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f36862t0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object tokenList = aVar.f36860r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f36862t0;
        if (i11 != 0) {
            if (i11 == 1) {
                etherToken = aVar.f36858p0;
                ResultKt.throwOnFailure(tokenList);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = aVar.f36859q0;
                etherToken2 = aVar.f36858p0;
                ResultKt.throwOnFailure(tokenList);
            }
            while (it.hasNext()) {
                str = (String) it.next();
                aVar.f36858p0 = etherToken2;
                aVar.f36859q0 = it;
                aVar.f36862t0 = 2;
                if (etherToken2.deleteToken(str, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(tokenList);
        etherToken = this.f36857a;
        if (etherToken == null) {
            return Unit.INSTANCE;
        }
        aVar.f36858p0 = etherToken;
        aVar.f36862t0 = 1;
        tokenList = getTokenList(aVar);
        if (tokenList == coroutine_suspended) {
            return coroutine_suspended;
        }
        etherToken2 = etherToken;
        it = ((Set) tokenList).iterator();
        while (it.hasNext()) {
            str = (String) it.next();
            aVar.f36858p0 = etherToken2;
            aVar.f36859q0 = it;
            aVar.f36862t0 = 2;
            if (etherToken2.deleteToken(str, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.softtokenbase.SoftToken
    @Nullable
    public Object getTokenList(@NotNull Continuation<? super Set<String>> continuation) {
        b bVar;
        EtherTokenResult etherTokenResult;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f36865r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f36865r0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object tokenIds = bVar.f36863p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f36865r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(tokenIds);
            EtherToken etherToken = this.f36857a;
            if (etherToken != null) {
                bVar.f36865r0 = 1;
                tokenIds = etherToken.getTokenIds(bVar);
                if (tokenIds == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                etherTokenResult = null;
            }
            return etherTokenResult instanceof EtherTokenResult.Success ? (Set) ((EtherTokenResult.Success) etherTokenResult).getValue() : w.emptySet();
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(tokenIds);
        etherTokenResult = (EtherTokenResult) tokenIds;
        if (etherTokenResult instanceof EtherTokenResult.Success) {
        }
    }
}
