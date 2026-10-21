package com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UserTypeCellsWebViewModelDelegate.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.UserTypeCellsWebViewModelDelegate", f = "UserTypeCellsWebViewModelDelegate.kt", i = {}, l = {142}, m = "isTokenActive", n = {}, s = {})
public final class c extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public /* synthetic */ Object f31993p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ UserTypeCellsWebViewModelDelegate f31994q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f31995r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(UserTypeCellsWebViewModelDelegate userTypeCellsWebViewModelDelegate, Continuation<? super c> continuation) {
        super(continuation);
        this.f31994q0 = userTypeCellsWebViewModelDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f31993p0 = obj;
        this.f31995r0 |= Integer.MIN_VALUE;
        return UserTypeCellsWebViewModelDelegate.access$isTokenActive(this.f31994q0, null, this);
    }
}
