package com.bbva.glomohybrid.landing.presentation.adapter;

import androidx.recyclerview.widget.DiffUtil;
import com.bbva.glomohybrid.landing.domain.sections.model.LandingSection;
import com.bbva.glomohybrid.landing.presentation.model.LandingHeaderState;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.adapter.LandingAdapter$getDataDiffResult$2", f = "LandingAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DiffUtil.DiffResult>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LandingAdapter f33018p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LandingAdapter.HeaderStyle f33019q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ LandingHeaderState f33020r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ List<LandingSection> f33021s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(LandingAdapter landingAdapter, LandingAdapter.HeaderStyle headerStyle, LandingHeaderState landingHeaderState, List<? extends LandingSection> list, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f33018p0 = landingAdapter;
        this.f33019q0 = headerStyle;
        this.f33020r0 = landingHeaderState;
        this.f33021s0 = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new b(this.f33018p0, this.f33019q0, this.f33020r0, this.f33021s0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DiffUtil.DiffResult> continuation) {
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        LandingAdapter landingAdapter = this.f33018p0;
        LandingAdapter.HeaderStyle headerStyle = landingAdapter.getHeaderStyle();
        LandingAdapter.HeaderStyle headerStyle2 = this.f33019q0;
        LandingHeaderState header = landingAdapter.getHeader();
        LandingHeaderState landingHeaderState = this.f33020r0;
        List<LandingSection> sections = landingAdapter.getSections();
        List<LandingSection> listEmptyList = this.f33021s0;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        return DiffUtil.calculateDiff(new LandingSectionsDiffCallback(headerStyle, headerStyle2, header, landingHeaderState, sections, listEmptyList));
    }
}
