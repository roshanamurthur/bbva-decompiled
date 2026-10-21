package com.bbva.component.dm.analytics;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.bbva.component.dm.analytics.usecase.CleanCookiesParams;
import com.bbva.component.dm.analytics.usecase.CleanCookiesUseCase;
import com.bbva.component.dm.analytics.usecase.CookieCriteria;
import com.bbva.glomoutils.time.TimeProvider;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AnalyticsAppLifecycle.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B;\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0002H\u0007¨\u0006\u0014"}, d2 = {"Lcom/bbva/component/dm/analytics/AnalyticsAppLifecycle;", "Landroidx/lifecycle/LifecycleObserver;", "", "onCreate", "onBackground", "onForeground", "Lkotlin/Pair;", "", "Ljava/util/concurrent/TimeUnit;", TypedValues.TransitionType.S_DURATION, "Lcom/bbva/glomoutils/time/TimeProvider;", "timeProvider", "Lcom/bbva/component/dm/analytics/usecase/CleanCookiesUseCase;", "useCase", "", "Lcom/bbva/component/dm/analytics/usecase/CookieCriteria;", "cookieCriteria", "<init>", "(Lkotlin/Pair;Lcom/bbva/glomoutils/time/TimeProvider;Lcom/bbva/component/dm/analytics/usecase/CleanCookiesUseCase;Ljava/util/List;)V", "Companion", "component-dm-analytics_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAnalyticsAppLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsAppLifecycle.kt\ncom/bbva/component/dm/analytics/AnalyticsAppLifecycle\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"})
public final class AnalyticsAppLifecycle implements LifecycleObserver {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Pair<Long, TimeUnit> f27405p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final TimeProvider f27406q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final CleanCookiesUseCase f27407r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final List<CookieCriteria> f27408s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public long f27409t0;

    /* JADX WARN: Multi-variable type inference failed */
    public AnalyticsAppLifecycle(@NotNull Pair<Long, ? extends TimeUnit> duration, @NotNull TimeProvider timeProvider, @NotNull CleanCookiesUseCase useCase, @NotNull List<? extends CookieCriteria> cookieCriteria) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        Intrinsics.checkNotNullParameter(cookieCriteria, "cookieCriteria");
        this.f27405p0 = duration;
        this.f27406q0 = timeProvider;
        this.f27407r0 = useCase;
        this.f27408s0 = cookieCriteria;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onBackground() {
        this.f27409t0 = this.f27406q0.getMillisTime();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        this.f27407r0.execute2(new CleanCookiesParams(this.f27408s0, false, 2, null));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onForeground() {
        Long lValueOf = Long.valueOf(this.f27409t0);
        if (lValueOf.longValue() == 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            lValueOf.longValue();
            Pair<Long, TimeUnit> pair = this.f27405p0;
            if (pair.getSecond().convert(this.f27406q0.getMillisTime() - this.f27409t0, TimeUnit.MILLISECONDS) >= pair.getFirst().longValue()) {
                this.f27407r0.execute2(new CleanCookiesParams(this.f27408s0, true));
            }
            this.f27409t0 = 0L;
        }
    }

    public /* synthetic */ AnalyticsAppLifecycle(Pair pair, TimeProvider timeProvider, CleanCookiesUseCase cleanCookiesUseCase, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(pair, (i10 & 2) != 0 ? new TimeProvider() : timeProvider, cleanCookiesUseCase, list);
    }
}
