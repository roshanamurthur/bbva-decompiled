package com.bbva.glomohybrid.interceptors;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LoggingInterceptorConstants.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/interceptors/LoggingInterceptorConstants;", "", "", "", "a", "Ljava/util/List;", "getEXCLUDE_INFO_SERVICE", "()Ljava/util/List;", "EXCLUDE_INFO_SERVICE", "<init>", "()V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class LoggingInterceptorConstants {

    @NotNull
    public static final LoggingInterceptorConstants INSTANCE = new LoggingInterceptorConstants();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final List<String> EXCLUDE_INFO_SERVICE = CollectionsKt__CollectionsKt.emptyList();

    @NotNull
    public final List<String> getEXCLUDE_INFO_SERVICE() {
        return EXCLUDE_INFO_SERVICE;
    }
}
