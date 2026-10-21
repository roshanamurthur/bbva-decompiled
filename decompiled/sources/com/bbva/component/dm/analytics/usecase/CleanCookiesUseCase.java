package com.bbva.component.dm.analytics.usecase;

import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.component.dm.analytics.model.CookiesRepository;
import com.bbva.glomoutils.usecase.UseCaseWithParams;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CleanCookiesUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/bbva/component/dm/analytics/usecase/CleanCookiesUseCase;", "Lcom/bbva/glomoutils/usecase/UseCaseWithParams;", "Lcom/bbva/component/dm/analytics/usecase/CleanCookiesParams;", "", "params", "execute", "Lcom/bbva/component/dm/analytics/model/CookiesRepository;", "repository", "Lcom/bbva/bridge/dispatcher/MessageDispatcher;", "messageDispatcher", "<init>", "(Lcom/bbva/component/dm/analytics/model/CookiesRepository;Lcom/bbva/bridge/dispatcher/MessageDispatcher;)V", "Companion", "component-dm-analytics_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCleanCookiesUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CleanCookiesUseCase.kt\ncom/bbva/component/dm/analytics/usecase/CleanCookiesUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n819#2:33\n847#2,2:34\n*S KotlinDebug\n*F\n+ 1 CleanCookiesUseCase.kt\ncom/bbva/component/dm/analytics/usecase/CleanCookiesUseCase\n*L\n14#1:33\n14#1:34,2\n*E\n"})
public final class CleanCookiesUseCase implements UseCaseWithParams<CleanCookiesParams, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CookiesRepository f27416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final MessageDispatcher f27417b;

    /* JADX INFO: compiled from: CleanCookiesUseCase.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CleanCookiesParams f27419q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CleanCookiesParams cleanCookiesParams) {
            super(0);
            this.f27419q0 = cleanCookiesParams;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            CleanCookiesUseCase.access$onFinished(CleanCookiesUseCase.this, this.f27419q0.getPropagate());
            return Unit.INSTANCE;
        }
    }

    public CleanCookiesUseCase(@NotNull CookiesRepository repository, @Nullable MessageDispatcher messageDispatcher) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f27416a = repository;
        this.f27417b = messageDispatcher;
    }

    public static final void access$onFinished(CleanCookiesUseCase cleanCookiesUseCase, boolean z10) {
        if (!z10) {
            cleanCookiesUseCase.getClass();
            return;
        }
        MessageDispatcher messageDispatcher = cleanCookiesUseCase.f27417b;
        if (messageDispatcher != null) {
            messageDispatcher.sendMessage("global_native_inactivity_timeout", "");
        }
    }

    @Override // com.bbva.glomoutils.usecase.UseCaseWithParams
    public /* bridge */ /* synthetic */ Unit execute(CleanCookiesParams cleanCookiesParams) {
        execute2(cleanCookiesParams);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: execute, reason: avoid collision after fix types in other method */
    public void execute2(@NotNull CleanCookiesParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        CookiesRepository cookiesRepository = this.f27416a;
        List<Pair<String, String>> cookies = cookiesRepository.getCookies();
        ArrayList arrayList = new ArrayList();
        for (Object obj : cookies) {
            if (!CookieCriteriaKt.matches(params.getCriteria(), (Pair) obj)) {
                arrayList.add(obj);
            }
        }
        cookiesRepository.setCookies(arrayList, new a(params));
    }
}
