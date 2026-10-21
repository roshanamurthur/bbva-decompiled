package com.mypinpad.tsdk.isolation;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.mypinpad.tsdk.i.HandlePinPadLaunchRequestResult, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0017J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J]\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2+\u0010\u0015\u001a'\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00020\u000fj\u0002`\u0014H&¨\u0006\u0018"}, d2 = {"Lcom/mypinpad/monitoring/integration/MonitoringModuleApi;", "", "", "clearReportCallback", "flushEvents", "Lcom/mypinpad/monitoring/integration/EventData;", "eventData", "raiseEvent", "", "instanceId", "", "batchSizeThreshold", "", "batchWaitingThresholdMillis", "maximumBatchSize", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "events", "Lcom/mypinpad/monitoring/integration/ReportCallback;", "onReportCallback", "setReportCallback", "Companion", "android-monitoring-module.interface"}, k = 1, mv = {1, 5, 1})
public interface MonitoringModuleApi {

    @NotNull
    public static final setY setDividerPadding = setY.f51779a;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.HandlePinPadLaunchRequestResult$setOnFocusChangeListener */
    public static final class setOnFocusChangeListener {
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.HandlePinPadLaunchRequestResult$setY */
    public static final class setY {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ setY f51779a = new setY();

        static {
            int i10 = (~0) & 65;
            int i11 = -(-0);
            int i12 = (i10 & i11) + (i11 | i10);
            int i13 = i12 % 128;
            int i14 = i12 % 2;
        }
    }

    void setDividerPadding(@NotNull getCode getcode);

    void setDividerPadding(@NotNull String str, int i10, long j10, long j11, @NotNull Function1<? super List<? extends getCode>, Unit> function1);

    void setOnFocusChangeListener();
}
