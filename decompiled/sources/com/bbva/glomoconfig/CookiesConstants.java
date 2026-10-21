package com.bbva.glomoconfig;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CookiesConstants.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomoconfig/CookiesConstants;", "", "Lkotlin/Pair;", "", "Ljava/util/concurrent/TimeUnit;", "a", "Lkotlin/Pair;", "getSESSION_EXPIRATION", "()Lkotlin/Pair;", "SESSION_EXPIRATION", "", "", "b", "Ljava/util/List;", "getCOOKIES_TO_DELETE", "()Ljava/util/List;", "COOKIES_TO_DELETE", "<init>", "()V", "gl-config_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class CookiesConstants {

    @NotNull
    public static final CookiesConstants INSTANCE = new CookiesConstants();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Pair<Long, TimeUnit> SESSION_EXPIRATION = TuplesKt.to(30L, TimeUnit.MINUTES);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final List<String> COOKIES_TO_DELETE = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"(sessionID.*)", "(AMCV.*)"});

    @NotNull
    public final List<String> getCOOKIES_TO_DELETE() {
        return COOKIES_TO_DELETE;
    }

    @NotNull
    public final Pair<Long, TimeUnit> getSESSION_EXPIRATION() {
        return SESSION_EXPIRATION;
    }
}
