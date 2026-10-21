package com.bbva.notifications;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DeepLinkConstants.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\u00020\u00038\u0006X\u0086D¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/bbva/notifications/DeepLinkConstants;", "", "", "", "a", "[Ljava/lang/String;", "getNOT_NAVIGABLE_LINKS", "()[Ljava/lang/String;", "NOT_NAVIGABLE_LINKS", "SALESFORCE_NOTIFICATION", "Ljava/lang/String;", "b", "getDEEPLINK_NOTIFICATION", "()Ljava/lang/String;", "DEEPLINK_NOTIFICATION", "<init>", "()V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class DeepLinkConstants {

    @NotNull
    public static final String SALESFORCE_NOTIFICATION = "redirectTo";

    @NotNull
    public static final DeepLinkConstants INSTANCE = new DeepLinkConstants();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final String[] NOT_NAVIGABLE_LINKS = {""};

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final String DEEPLINK_NOTIFICATION = "shortcut";

    @NotNull
    public final String getDEEPLINK_NOTIFICATION() {
        return DEEPLINK_NOTIFICATION;
    }

    @NotNull
    public final String[] getNOT_NAVIGABLE_LINKS() {
        return NOT_NAVIGABLE_LINKS;
    }
}
