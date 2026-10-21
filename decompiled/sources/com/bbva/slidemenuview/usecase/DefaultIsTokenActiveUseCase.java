package com.bbva.slidemenuview.usecase;

import com.bbva.glomoutils.usecase.SuspendUseCase;
import com.bbva.softtokenbase.SoftToken;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DefaultIsTokenActiveUseCase.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/bbva/slidemenuview/usecase/DefaultIsTokenActiveUseCase;", "Lcom/bbva/glomoutils/usecase/SuspendUseCase;", "", "execute", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/bbva/softtokenbase/SoftToken;", "softToken", "<init>", "(Ljava/util/List;)V", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDefaultIsTokenActiveUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultIsTokenActiveUseCase.kt\ncom/bbva/slidemenuview/usecase/DefaultIsTokenActiveUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,17:1\n1549#2:18\n1620#2,3:19\n*S KotlinDebug\n*F\n+ 1 DefaultIsTokenActiveUseCase.kt\ncom/bbva/slidemenuview/usecase/DefaultIsTokenActiveUseCase\n*L\n11#1:18\n11#1:19,3\n*E\n"})
public final class DefaultIsTokenActiveUseCase implements SuspendUseCase<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<SoftToken> f36784a;

    /* JADX INFO: compiled from: DefaultIsTokenActiveUseCase.kt */
    @DebugMetadata(c = "com.bbva.slidemenuview.usecase.DefaultIsTokenActiveUseCase", f = "DefaultIsTokenActiveUseCase.kt", i = {0}, l = {12}, m = "execute", n = {"destination$iv$iv"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Collection f36785p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Iterator f36786q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Collection f36787r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f36788s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f36790u0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f36788s0 = obj;
            this.f36790u0 |= Integer.MIN_VALUE;
            return DefaultIsTokenActiveUseCase.this.execute(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultIsTokenActiveUseCase(@NotNull List<? extends SoftToken> softToken) {
        Intrinsics.checkNotNullParameter(softToken, "softToken");
        this.f36784a = softToken;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    /* JADX WARN: Code duplicated, block: B:19:0x0060  */
    /* JADX WARN: Code duplicated, block: B:21:0x0071 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0072 -> B:23:0x0073). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:27:0x0086
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.bbva.glomoutils.usecase.SuspendUseCase
    @org.jetbrains.annotations.Nullable
    public java.lang.Object execute(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.bbva.slidemenuview.usecase.DefaultIsTokenActiveUseCase.a
            if (r0 == 0) goto L13
            r0 = r8
            com.bbva.slidemenuview.usecase.DefaultIsTokenActiveUseCase$a r0 = (com.bbva.slidemenuview.usecase.DefaultIsTokenActiveUseCase.a) r0
            int r1 = r0.f36790u0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36790u0 = r1
            goto L18
        L13:
            com.bbva.slidemenuview.usecase.DefaultIsTokenActiveUseCase$a r0 = new com.bbva.slidemenuview.usecase.DefaultIsTokenActiveUseCase$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f36788s0
            java.lang.Object r1 = ek.a.getCOROUTINE_SUSPENDED()
            int r2 = r0.f36790u0
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.util.Collection r2 = r0.f36787r0
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r4 = r0.f36786q0
            java.util.Collection r5 = r0.f36785p0
            java.util.Collection r5 = (java.util.Collection) r5
            kotlin.ResultKt.throwOnFailure(r8)
            goto L73
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            kotlin.ResultKt.throwOnFailure(r8)
            java.util.List<com.bbva.softtokenbase.SoftToken> r8 = r7.f36784a
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r8, r4)
            r2.<init>(r4)
            java.util.Iterator r8 = r8.iterator()
            r4 = r8
        L52:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L91
            java.lang.Object r8 = r4.next()
            com.bbva.softtokenbase.SoftToken r8 = (com.bbva.softtokenbase.SoftToken) r8
            if (r8 == 0) goto L86
            r5 = r2
            java.util.Collection r5 = (java.util.Collection) r5
            r0.f36785p0 = r5
            r0.f36786q0 = r4
            r0.f36787r0 = r5
            r0.f36790u0 = r3
            java.lang.Object r8 = r8.getTokenList(r0)
            if (r8 != r1) goto L72
            return r1
        L72:
            r5 = r2
        L73:
            java.util.Set r8 = (java.util.Set) r8
            if (r8 == 0) goto L83
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            r8 = r8 ^ r3
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r8)
            goto L8c
        L83:
            r8 = r2
            r2 = r5
            goto L87
        L86:
            r8 = r2
        L87:
            r5 = 0
            r6 = r2
            r2 = r8
            r8 = r5
            r5 = r6
        L8c:
            r2.add(r8)
            r2 = r5
            goto L52
        L91:
            java.util.List r2 = (java.util.List) r2
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            boolean r8 = r2.contains(r8)
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbva.slidemenuview.usecase.DefaultIsTokenActiveUseCase.execute(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
