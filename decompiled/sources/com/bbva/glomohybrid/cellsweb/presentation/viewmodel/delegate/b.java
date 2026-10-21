package com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate;

import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeepLinkWebViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.DeepLinkWebViewModelDelegate", f = "DeepLinkWebViewModel.kt", i = {0}, l = {169}, m = "canHandleLinkWithActualProfile", n = {DeepLinkListenerAdapter.Constants.DEEP_LINK}, s = {"L$0"})
public final class b extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public DeepLinkModel f31989p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f31990q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ DeepLinkWebViewModelDelegate f31991r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f31992s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DeepLinkWebViewModelDelegate deepLinkWebViewModelDelegate, Continuation<? super b> continuation) {
        super(continuation);
        this.f31991r0 = deepLinkWebViewModelDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f31990q0 = obj;
        this.f31992s0 |= Integer.MIN_VALUE;
        return DeepLinkWebViewModelDelegate.access$canHandleLinkWithActualProfile(this.f31991r0, null, this);
    }
}
