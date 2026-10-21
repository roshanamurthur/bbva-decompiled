package com.bbva.glomohybrid.landing.presentation.adapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardModel;
import com.bbva.glomohybrid.landing.domain.sections.model.LandingECommerceCardsModel;
import com.bbva.glomohybrid.landing.domain.sections.model.LandingSection;
import com.bbva.glomohybrid.landing.presentation.LandingContract;
import com.bbva.glomohybrid.landing.presentation.adapter.holders.LandingECommerceCardsViewHolder;
import com.bbva.glomohybrid.landing.presentation.adapter.holders.LandingHeaderViewHolder;
import com.bbva.glomohybrid.landing.presentation.adapter.holders.LandingMessageCardViewHolder;
import com.bbva.glomohybrid.landing.presentation.adapter.render.LandingRender;
import com.bbva.glomohybrid.landing.presentation.model.LandingHeaderState;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.plugin.localstorage.command.ClearCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000267B\u0011\u0012\b\b\u0002\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fJ\u001e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010!\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010'\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\"8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R0\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020.0-8F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00068"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/adapter/LandingAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlinx/coroutines/CoroutineScope;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "getItemCount", "getItemViewType", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState;", "headerData", ClearCommand.ID, "", "Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingSection;", "sectionsData", "update", "Lkotlin/coroutines/CoroutineContext;", "q0", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<set-?>", "r0", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState;", "getHeader", "()Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState;", "header", "Lcom/bbva/glomohybrid/landing/presentation/adapter/LandingAdapter$HeaderStyle;", "s0", "Lcom/bbva/glomohybrid/landing/presentation/adapter/LandingAdapter$HeaderStyle;", "getHeaderStyle", "()Lcom/bbva/glomohybrid/landing/presentation/adapter/LandingAdapter$HeaderStyle;", "headerStyle", "t0", "Ljava/util/List;", "getSections", "()Ljava/util/List;", "sections", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent;", "getIntents", "()Lkotlinx/coroutines/flow/Flow;", "intents", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatchers", "<init>", "(Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "Companion", "HeaderStyle", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class LandingAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements CoroutineScope {
    public static final int MIN_SIZE = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f32989p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CoroutineContext coroutineContext;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public LandingHeaderState header;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public HeaderStyle headerStyle;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<? extends LandingSection> sections;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final Channel<LandingContract.Intent> f32994u0;

    @NotNull
    public final b v0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: LandingAdapter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/adapter/LandingAdapter$HeaderStyle;", "", "SKELETON", "LARGE_HEADER", "SMALL_HEADER", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final class HeaderStyle {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ HeaderStyle[] $VALUES;
        public static final HeaderStyle LARGE_HEADER;
        public static final HeaderStyle SKELETON;
        public static final HeaderStyle SMALL_HEADER;

        static {
            HeaderStyle headerStyle = new HeaderStyle("SKELETON", 0);
            SKELETON = headerStyle;
            HeaderStyle headerStyle2 = new HeaderStyle("LARGE_HEADER", 1);
            LARGE_HEADER = headerStyle2;
            HeaderStyle headerStyle3 = new HeaderStyle("SMALL_HEADER", 2);
            SMALL_HEADER = headerStyle3;
            HeaderStyle[] headerStyleArr = {headerStyle, headerStyle2, headerStyle3};
            $VALUES = headerStyleArr;
            $ENTRIES = EnumEntriesKt.enumEntries(headerStyleArr);
        }

        public HeaderStyle() {
            throw null;
        }

        @NotNull
        public static EnumEntries<HeaderStyle> getEntries() {
            return $ENTRIES;
        }

        public static HeaderStyle valueOf(String str) {
            return (HeaderStyle) Enum.valueOf(HeaderStyle.class, str);
        }

        public static HeaderStyle[] values() {
            return (HeaderStyle[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: LandingAdapter.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.adapter.LandingAdapter$clear$1", f = "LandingAdapter.kt", i = {0}, l = {89}, m = "invokeSuspend", n = {"newHeaderStyle"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public HeaderStyle f32995p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f32996q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ LandingHeaderState f32998s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LandingHeaderState landingHeaderState, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f32998s0 = landingHeaderState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LandingAdapter.this.new a(this.f32998s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            HeaderStyle headerStyle;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f32996q0;
            LandingHeaderState landingHeaderState = this.f32998s0;
            LandingAdapter landingAdapter = LandingAdapter.this;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                HeaderStyle headerStyle2 = HeaderStyle.SKELETON;
                this.f32995p0 = headerStyle2;
                this.f32996q0 = 1;
                Object objAccess$getDataDiffResult = LandingAdapter.access$getDataDiffResult(landingAdapter, headerStyle2, landingHeaderState, null, this);
                if (objAccess$getDataDiffResult == coroutine_suspended) {
                    return coroutine_suspended;
                }
                headerStyle = headerStyle2;
                obj = objAccess$getDataDiffResult;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                headerStyle = this.f32995p0;
                ResultKt.throwOnFailure(obj);
            }
            LandingAdapter.access$updateState(landingAdapter, headerStyle, landingHeaderState, null);
            ((DiffUtil.DiffResult) obj).dispatchUpdatesTo(landingAdapter);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LandingAdapter.kt */
    public static final class b extends Lambda implements Function1<LandingContract.Intent, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LandingContract.Intent intent) {
            LandingContract.Intent it = intent;
            Intrinsics.checkNotNullParameter(it, "it");
            LandingAdapter landingAdapter = LandingAdapter.this;
            BuildersKt__Builders_commonKt.launch$default(landingAdapter, null, null, new com.bbva.glomohybrid.landing.presentation.adapter.c(landingAdapter, it, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LandingAdapter.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.adapter.LandingAdapter$update$1", f = "LandingAdapter.kt", i = {0}, l = {98}, m = "invokeSuspend", n = {"newHeaderStyle"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public HeaderStyle f33000p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f33001q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ List<LandingSection> f33003s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ LandingHeaderState f33004t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends LandingSection> list, LandingHeaderState landingHeaderState, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f33003s0 = list;
            this.f33004t0 = landingHeaderState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LandingAdapter.this.new c(this.f33003s0, this.f33004t0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            HeaderStyle headerStyle;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f33001q0;
            LandingHeaderState landingHeaderState = this.f33004t0;
            List<LandingSection> list = this.f33003s0;
            LandingAdapter landingAdapter = LandingAdapter.this;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                HeaderStyle headerStyleAccess$getHeaderState = LandingAdapter.access$getHeaderState(landingAdapter, list);
                this.f33000p0 = headerStyleAccess$getHeaderState;
                this.f33001q0 = 1;
                Object objAccess$getDataDiffResult = LandingAdapter.access$getDataDiffResult(landingAdapter, headerStyleAccess$getHeaderState, landingHeaderState, list, this);
                if (objAccess$getDataDiffResult == coroutine_suspended) {
                    return coroutine_suspended;
                }
                headerStyle = headerStyleAccess$getHeaderState;
                obj = objAccess$getDataDiffResult;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                headerStyle = this.f33000p0;
                ResultKt.throwOnFailure(obj);
            }
            LandingAdapter.access$updateState(landingAdapter, headerStyle, landingHeaderState, list);
            ((DiffUtil.DiffResult) obj).dispatchUpdatesTo(landingAdapter);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LandingAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$getDataDiffResult(LandingAdapter landingAdapter, HeaderStyle headerStyle, LandingHeaderState landingHeaderState, List list, Continuation continuation) {
        com.bbva.glomohybrid.landing.presentation.adapter.a aVar;
        landingAdapter.getClass();
        if (continuation instanceof com.bbva.glomohybrid.landing.presentation.adapter.a) {
            aVar = (com.bbva.glomohybrid.landing.presentation.adapter.a) continuation;
            int i10 = aVar.f33017r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f33017r0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new com.bbva.glomohybrid.landing.presentation.adapter.a(landingAdapter, continuation);
            }
        } else {
            aVar = new com.bbva.glomohybrid.landing.presentation.adapter.a(landingAdapter, continuation);
        }
        Object objWithContext = aVar.f33015p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f33017r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher coroutineDispatcherMo4923default = landingAdapter.f32989p0.mo4923default();
            com.bbva.glomohybrid.landing.presentation.adapter.b bVar = new com.bbva.glomohybrid.landing.presentation.adapter.b(landingAdapter, headerStyle, landingHeaderState, list, null);
            aVar.f33017r0 = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcherMo4923default, bVar, aVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        Intrinsics.checkNotNullExpressionValue(objWithContext, "withContext(...)");
        return objWithContext;
    }

    public static final HeaderStyle access$getHeaderState(LandingAdapter landingAdapter, List list) {
        landingAdapter.getClass();
        HeaderStyle headerStyle = HeaderStyle.LARGE_HEADER;
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            headerStyle = null;
        }
        return headerStyle == null ? HeaderStyle.SMALL_HEADER : headerStyle;
    }

    public static final void access$updateState(LandingAdapter landingAdapter, HeaderStyle headerStyle, LandingHeaderState landingHeaderState, List list) {
        landingAdapter.headerStyle = headerStyle;
        landingAdapter.header = landingHeaderState;
        if (list == null) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        landingAdapter.sections = list;
    }

    public final void clear(@NotNull LandingHeaderState headerData) {
        Intrinsics.checkNotNullParameter(headerData, "headerData");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(headerData, null), 3, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @NotNull
    public final LandingHeaderState getHeader() {
        return this.header;
    }

    @NotNull
    public final HeaderStyle getHeaderStyle() {
        return this.headerStyle;
    }

    @NotNull
    public final Flow<LandingContract.Intent> getIntents() {
        return FlowKt.consumeAsFlow(this.f32994u0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.sections.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (position == 0) {
            return LandingRender.ViewType.HEADER.ordinal();
        }
        return this.sections.get(position + (-1)) instanceof LandingMessageCardModel ? LandingRender.ViewType.SECTION_MESSAGES.ordinal() : LandingRender.ViewType.SECTION_ECOMMERCE_CARDS.ordinal();
    }

    @NotNull
    public final List<LandingSection> getSections() {
        return this.sections;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        boolean z10 = holder instanceof LandingHeaderViewHolder;
        b bVar = this.v0;
        if (z10) {
            ((LandingHeaderViewHolder) holder).bind(this.header, bVar);
            return;
        }
        if (holder instanceof LandingMessageCardViewHolder) {
            LandingSection landingSection = this.sections.get(position - 1);
            Intrinsics.checkNotNull(landingSection, "null cannot be cast to non-null type com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardModel");
            ((LandingMessageCardViewHolder) holder).bind((LandingMessageCardModel) landingSection, bVar);
        } else if (holder instanceof LandingECommerceCardsViewHolder) {
            LandingSection landingSection2 = this.sections.get(position - 1);
            Intrinsics.checkNotNull(landingSection2, "null cannot be cast to non-null type com.bbva.glomohybrid.landing.domain.sections.model.LandingECommerceCardsModel");
            ((LandingECommerceCardsViewHolder) holder).bind((LandingECommerceCardsModel) landingSection2, bVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return LandingRender.INSTANCE.render(parent, viewType, getCoroutineContext());
    }

    public final void update(@NotNull LandingHeaderState headerData, @Nullable List<? extends LandingSection> sectionsData) {
        Intrinsics.checkNotNullParameter(headerData, "headerData");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new c(sectionsData, headerData, null), 3, null);
    }

    public /* synthetic */ LandingAdapter(ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }

    public LandingAdapter(@NotNull ThreadDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.f32989p0 = dispatchers;
        this.coroutineContext = JobKt__JobKt.Job$default((Job) null, 1, (Object) null).plus(dispatchers.main());
        this.header = new LandingHeaderState(LandingHeaderState.Type.Enabled.INSTANCE, null, null, null, null, null, null, null, null, null, 1022, null);
        this.headerStyle = HeaderStyle.SKELETON;
        this.sections = CollectionsKt__CollectionsKt.emptyList();
        this.f32994u0 = ChannelKt.Channel$default(0, null, null, 7, null);
        this.v0 = new b();
    }
}
