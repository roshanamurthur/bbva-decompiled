package com.bbva.firebase.analytics;

import androidx.core.os.BundleKt;
import bk.s;
import com.bbva.glomohybrid.landing.data.mapper.LandingAEMContentMapper;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DefaultFirebaseAnalyticsManager.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0016¨\u0006\r"}, d2 = {"Lcom/bbva/firebase/analytics/DefaultFirebaseAnalyticsManager;", "Lcom/bbva/firebase/analytics/FirebaseAnalyticsManager;", "", "eventKey", "", "", "data", "", LogKeysKt.LOG, "Lcom/google/firebase/analytics/FirebaseAnalytics;", LandingAEMContentMapper.ANALYTICS, "<init>", "(Lcom/google/firebase/analytics/FirebaseAnalytics;)V", "component-dm-firebase-analytics_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDefaultFirebaseAnalyticsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultFirebaseAnalyticsManager.kt\ncom/bbva/firebase/analytics/DefaultFirebaseAnalyticsManager\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,14:1\n37#2,2:15\n*S KotlinDebug\n*F\n+ 1 DefaultFirebaseAnalyticsManager.kt\ncom/bbva/firebase/analytics/DefaultFirebaseAnalyticsManager\n*L\n11#1:15,2\n*E\n"})
public final class DefaultFirebaseAnalyticsManager implements FirebaseAnalyticsManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FirebaseAnalytics f30670a;

    public DefaultFirebaseAnalyticsManager(@NotNull FirebaseAnalytics analytics) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.f30670a = analytics;
    }

    @Override // com.bbva.firebase.analytics.FirebaseAnalyticsManager
    public void log(@NotNull String eventKey, @NotNull Map<String, ? extends Object> data) {
        Intrinsics.checkNotNullParameter(eventKey, "eventKey");
        Intrinsics.checkNotNullParameter(data, "data");
        Pair[] pairArr = (Pair[]) s.toList(data).toArray(new Pair[0]);
        this.f30670a.logEvent(eventKey, BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
    }
}
