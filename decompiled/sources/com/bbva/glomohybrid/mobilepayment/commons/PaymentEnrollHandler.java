package com.bbva.glomohybrid.mobilepayment.commons;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PaymentEnrollHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/mobilepayment/commons/PaymentEnrollHandler;", "", "authenticated", "", "checkEnabled", "", "Companion", "commons_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface PaymentEnrollHandler {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f33782a;

    @NotNull
    public static final String ID = "enroll-handler";

    /* JADX INFO: compiled from: PaymentEnrollHandler.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/mobilepayment/commons/PaymentEnrollHandler$Companion;", "", "()V", "ID", "", "commons_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        @NotNull
        public static final String ID = "enroll-handler";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f33782a = new Companion();
    }

    void authenticated();

    boolean checkEnabled();
}
