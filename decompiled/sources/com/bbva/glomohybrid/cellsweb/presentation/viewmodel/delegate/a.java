package com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate;

import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomohybrid.cellsweb.usecase.params.ConfigureWebPrivateProfileParams;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CountryUserTypeCellsWebViewModelDelegate.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.CountryUserTypeCellsWebViewModelDelegate", f = "CountryUserTypeCellsWebViewModelDelegate.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2}, l = {78, 82, 94}, m = "handleSSO", n = {"this", "currentUserType", "newUserType", "text", "params", "this", "currentUserType", "newUserType", "params", "this", "currentUserType"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
public final class a extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public CountryUserTypeCellsWebViewModelDelegate f31982p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public UserType f31983q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public UserType f31984r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Object f31985s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ConfigureWebPrivateProfileParams f31986t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public /* synthetic */ Object f31987u0;
    public final /* synthetic */ CountryUserTypeCellsWebViewModelDelegate v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f31988w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CountryUserTypeCellsWebViewModelDelegate countryUserTypeCellsWebViewModelDelegate, Continuation<? super a> continuation) {
        super(continuation);
        this.v0 = countryUserTypeCellsWebViewModelDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f31987u0 = obj;
        this.f31988w0 |= Integer.MIN_VALUE;
        return CountryUserTypeCellsWebViewModelDelegate.access$handleSSO(this.v0, null, null, null, this);
    }
}
