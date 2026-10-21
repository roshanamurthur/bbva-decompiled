package com.bbva.component.dm.devices.data;

import androidx.camera.core.impl.utils.c;
import com.bbva.component.dm.devices.model.UnrollNotificationsRequest;
import com.bbva.network.NetworkWorker;
import com.bbva.network.constant.Method;
import com.bbva.network.exceptions.ConnectionException;
import com.bbva.network.exceptions.NotConnectionAvailable;
import com.bbva.network.model.request.MutableNetworkRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UnrollNotificationsDataSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\u000b\u001a\u00020\u00068\u0004X\u0084D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\u00020\u00068\u0004X\u0084D¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0011\u001a\u00020\u00068\u0014X\u0094D¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/bbva/component/dm/devices/data/UnrollNotificationsDataSource;", "", "Lcom/bbva/component/dm/devices/model/UnrollNotificationsRequest;", "params", "", "unrollNotifications", "", "b", "Ljava/lang/String;", "getDEVICE_ID", "()Ljava/lang/String;", "DEVICE_ID", "c", "getAPPLICATION_ID", "APPLICATION_ID", "d", "getAPI_PATH", "API_PATH", "Lcom/bbva/network/NetworkWorker;", "worker", "<init>", "(Lcom/bbva/network/NetworkWorker;)V", "component-dm-devices_release"}, k = 1, mv = {1, 6, 0})
public class UnrollNotificationsDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f27599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String DEVICE_ID;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String APPLICATION_ID;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String API_PATH;

    /* JADX INFO: compiled from: UnrollNotificationsDataSource.kt */
    public static final class a extends Lambda implements Function1<MutableNetworkRequest, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ UnrollNotificationsRequest f27603p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ UnrollNotificationsDataSource f27604q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(UnrollNotificationsRequest unrollNotificationsRequest, UnrollNotificationsDataSource unrollNotificationsDataSource) {
            super(1);
            this.f27603p0 = unrollNotificationsRequest;
            this.f27604q0 = unrollNotificationsDataSource;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MutableNetworkRequest mutableNetworkRequest) {
            MutableNetworkRequest execute = mutableNetworkRequest;
            Intrinsics.checkNotNullParameter(execute, "$this$execute");
            StringBuilder sb2 = new StringBuilder();
            UnrollNotificationsRequest unrollNotificationsRequest = this.f27603p0;
            sb2.append(unrollNotificationsRequest.getHost());
            UnrollNotificationsDataSource unrollNotificationsDataSource = this.f27604q0;
            sb2.append(UnrollNotificationsDataSource.access$replaceApplicationId(unrollNotificationsDataSource, UnrollNotificationsDataSource.access$replaceDeviceId(unrollNotificationsDataSource, unrollNotificationsDataSource.getAPI_PATH(), unrollNotificationsRequest.getDeviceId()), unrollNotificationsRequest.getApplicationId()));
            execute.setUrl(sb2.toString());
            execute.setMethod(Method.DELETE);
            return Unit.INSTANCE;
        }
    }

    public UnrollNotificationsDataSource(@NotNull NetworkWorker worker) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        this.f27599a = worker;
        this.DEVICE_ID = "deviceId";
        this.APPLICATION_ID = "applicationId";
        this.API_PATH = c.a("/devices/v0/devices/", "deviceId", "/applications/", "applicationId");
    }

    public static final String access$replaceApplicationId(UnrollNotificationsDataSource unrollNotificationsDataSource, String str, String str2) {
        return l.replace$default(str, unrollNotificationsDataSource.APPLICATION_ID, str2, false, 4, (Object) null);
    }

    public static final String access$replaceDeviceId(UnrollNotificationsDataSource unrollNotificationsDataSource, String str, String str2) {
        return l.replace$default(str, unrollNotificationsDataSource.DEVICE_ID, str2, false, 4, (Object) null);
    }

    @NotNull
    public String getAPI_PATH() {
        return this.API_PATH;
    }

    @NotNull
    public final String getAPPLICATION_ID() {
        return this.APPLICATION_ID;
    }

    @NotNull
    public final String getDEVICE_ID() {
        return this.DEVICE_ID;
    }

    public final void unrollNotifications(@NotNull UnrollNotificationsRequest params) throws NotConnectionAvailable, ConnectionException {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f27599a.execute(new a(params, this));
    }
}
