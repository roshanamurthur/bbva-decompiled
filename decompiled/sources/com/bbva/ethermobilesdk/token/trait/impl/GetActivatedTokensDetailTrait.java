package com.bbva.ethermobilesdk.token.trait.impl;

import androidx.core.app.NotificationCompat;
import com.bbva.ethermobilesdk.token.model.TokenDetail;
import com.bbva.ethermobilesdk.token.storage.TokenStorage;
import com.bbva.ethermobilesdk.token.trait.Trait;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetActivatedTokensDetailTrait.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/token/trait/impl/GetActivatedTokensDetailTrait;", "Lcom/bbva/ethermobilesdk/token/trait/Trait;", "", "", "Lcom/bbva/ethermobilesdk/token/model/TokenDetail;", "request", NotificationCompat.CATEGORY_CALL, "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/ethermobilesdk/token/storage/TokenStorage;", "tokenStorage", "<init>", "(Lcom/bbva/ethermobilesdk/token/storage/TokenStorage;)V", "ethertoken_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nGetActivatedTokensDetailTrait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetActivatedTokensDetailTrait.kt\ncom/bbva/ethermobilesdk/token/trait/impl/GetActivatedTokensDetailTrait\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1603#2,9:23\n1855#2:32\n1856#2:35\n1612#2:36\n1054#2:37\n1#3:33\n1#3:34\n*S KotlinDebug\n*F\n+ 1 GetActivatedTokensDetailTrait.kt\ncom/bbva/ethermobilesdk/token/trait/impl/GetActivatedTokensDetailTrait\n*L\n15#1:23,9\n15#1:32\n15#1:35\n15#1:36\n17#1:37\n15#1:34\n*E\n"})
public final class GetActivatedTokensDetailTrait extends Trait<Unit, List<? extends TokenDetail>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TokenStorage f30275b;

    /* JADX INFO: renamed from: com.bbva.ethermobilesdk.token.trait.impl.GetActivatedTokensDetailTrait$call$1, reason: invalid class name */
    /* JADX INFO: compiled from: GetActivatedTokensDetailTrait.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.trait.impl.GetActivatedTokensDetailTrait", f = "GetActivatedTokensDetailTrait.kt", i = {0, 1, 1, 1}, l = {14, 16}, m = NotificationCompat.CATEGORY_CALL, n = {"this", "this", "destination$iv$iv", "it"}, s = {"L$0", "L$0", "L$1", "L$3"})
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public GetActivatedTokensDetailTrait f30276p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Collection f30277q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Iterator f30278r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public String f30279s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public /* synthetic */ Object f30280t0;
        public int v0;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30280t0 = obj;
            this.v0 |= Integer.MIN_VALUE;
            return GetActivatedTokensDetailTrait.this.call2((Unit) null, (Continuation<? super List<TokenDetail>>) this);
        }
    }

    public GetActivatedTokensDetailTrait(@NotNull TokenStorage tokenStorage) {
        Intrinsics.checkNotNullParameter(tokenStorage, "tokenStorage");
        this.f30275b = tokenStorage;
    }

    @Override // com.bbva.ethermobilesdk.token.trait.Trait
    public /* bridge */ /* synthetic */ Object call(Unit unit, Continuation<? super List<? extends TokenDetail>> continuation) {
        return call2(unit, (Continuation<? super List<TokenDetail>>) continuation);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0090  */
    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0085 -> B:26:0x0088). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
    public java.lang.Object call2(@org.jetbrains.annotations.NotNull kotlin.Unit r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<com.bbva.ethermobilesdk.token.model.TokenDetail>> r11) {
        /*
            r9 = this;
            boolean r10 = r11 instanceof com.bbva.ethermobilesdk.token.trait.impl.GetActivatedTokensDetailTrait.AnonymousClass1
            if (r10 == 0) goto L13
            r10 = r11
            com.bbva.ethermobilesdk.token.trait.impl.GetActivatedTokensDetailTrait$call$1 r10 = (com.bbva.ethermobilesdk.token.trait.impl.GetActivatedTokensDetailTrait.AnonymousClass1) r10
            int r0 = r10.v0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r10.v0 = r0
            goto L18
        L13:
            com.bbva.ethermobilesdk.token.trait.impl.GetActivatedTokensDetailTrait$call$1 r10 = new com.bbva.ethermobilesdk.token.trait.impl.GetActivatedTokensDetailTrait$call$1
            r10.<init>(r11)
        L18:
            java.lang.Object r11 = r10.f30280t0
            java.lang.Object r0 = ek.a.getCOROUTINE_SUSPENDED()
            int r1 = r10.v0
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L44
            if (r1 == r3) goto L3e
            if (r1 != r2) goto L36
            java.lang.String r1 = r10.f30279s0
            java.util.Iterator r3 = r10.f30278r0
            java.util.Collection r4 = r10.f30277q0
            java.util.Collection r4 = (java.util.Collection) r4
            com.bbva.ethermobilesdk.token.trait.impl.GetActivatedTokensDetailTrait r5 = r10.f30276p0
            kotlin.ResultKt.throwOnFailure(r11)
            goto L88
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            com.bbva.ethermobilesdk.token.trait.impl.GetActivatedTokensDetailTrait r1 = r10.f30276p0
            kotlin.ResultKt.throwOnFailure(r11)
            goto L55
        L44:
            kotlin.ResultKt.throwOnFailure(r11)
            r10.f30276p0 = r9
            r10.v0 = r3
            com.bbva.ethermobilesdk.token.storage.TokenStorage r11 = r9.f30275b
            java.lang.Object r11 = r11.getTokenIds(r10)
            if (r11 != r0) goto L54
            return r0
        L54:
            r1 = r9
        L55:
            java.util.Set r11 = (java.util.Set) r11
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r11 = r11.iterator()
            r5 = r1
            r4 = r3
            r3 = r11
        L65:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto La1
            java.lang.Object r11 = r3.next()
            r1 = r11
            java.lang.String r1 = (java.lang.String) r1
            com.bbva.ethermobilesdk.token.storage.TokenStorage r11 = r5.f30275b
            r10.f30276p0 = r5
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6
            r10.f30277q0 = r6
            r10.f30278r0 = r3
            r10.f30279s0 = r1
            r10.v0 = r2
            java.lang.Object r11 = r11.getToken(r1, r10)
            if (r11 != r0) goto L88
            return r0
        L88:
            com.bbva.ethermobilesdk.token.model.Token r11 = (com.bbva.ethermobilesdk.token.model.Token) r11
            com.bbva.ethermobilesdk.token.model.TokenActivation r11 = r11.getActivation()
            if (r11 == 0) goto L9a
            com.bbva.ethermobilesdk.token.model.TokenDetail r6 = new com.bbva.ethermobilesdk.token.model.TokenDetail
            long r7 = r11.getTimestamp()
            r6.<init>(r1, r7)
            goto L9b
        L9a:
            r6 = 0
        L9b:
            if (r6 == 0) goto L65
            r4.add(r6)
            goto L65
        La1:
            java.util.List r4 = (java.util.List) r4
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            com.bbva.ethermobilesdk.token.trait.impl.GetActivatedTokensDetailTrait$call$$inlined$sortedByDescending$1 r10 = new com.bbva.ethermobilesdk.token.trait.impl.GetActivatedTokensDetailTrait$call$$inlined$sortedByDescending$1
            r10.<init>()
            java.util.List r10 = kotlin.collections.CollectionsKt___CollectionsKt.sortedWith(r4, r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbva.ethermobilesdk.token.trait.impl.GetActivatedTokensDetailTrait.call2(kotlin.Unit, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
