package com.bbva.glomohybrid.session.observers;

import com.bbva.glomohybrid.logs.handler.CrashlyticsHandler;
import com.bbva.glomoutils.mobileservices.craslytics.Crashlytics;
import com.bbva.session.domain.observers.SessionTokenObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CrashlyticsTokenObserver.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/session/observers/CrashlyticsTokenObserver;", "Lcom/bbva/session/domain/observers/SessionTokenObserver;", "", "token", "", "onNewToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomoutils/mobileservices/craslytics/Crashlytics;", CrashlyticsHandler.ID, "<init>", "(Lcom/bbva/glomoutils/mobileservices/craslytics/Crashlytics;)V", "Companion", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class CrashlyticsTokenObserver implements SessionTokenObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Crashlytics f34460a;

    public CrashlyticsTokenObserver(@NotNull Crashlytics crashlytics) {
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        this.f34460a = crashlytics;
    }

    @Override // com.bbva.session.domain.observers.SessionTokenObserver
    @Nullable
    public Object onNewToken(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        this.f34460a.setCustomKey("UUID", str);
        return Unit.INSTANCE;
    }
}
