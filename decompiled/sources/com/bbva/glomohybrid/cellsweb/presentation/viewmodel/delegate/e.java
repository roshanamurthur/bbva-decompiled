package com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UserTypeCellsWebViewModelDelegate.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate.UserTypeCellsWebViewModelDelegate", f = "UserTypeCellsWebViewModelDelegate.kt", i = {0}, l = {188}, m = "resetRememberedUser", n = {"this"}, s = {"L$0"})
public final class e extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public UserTypeCellsWebViewModelDelegate f31997p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f31998q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ UserTypeCellsWebViewModelDelegate f31999r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f32000s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(UserTypeCellsWebViewModelDelegate userTypeCellsWebViewModelDelegate, Continuation<? super e> continuation) {
        super(continuation);
        this.f31999r0 = userTypeCellsWebViewModelDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f31998q0 = obj;
        this.f32000s0 |= Integer.MIN_VALUE;
        return UserTypeCellsWebViewModelDelegate.access$resetRememberedUser(this.f31999r0, this);
    }
}
