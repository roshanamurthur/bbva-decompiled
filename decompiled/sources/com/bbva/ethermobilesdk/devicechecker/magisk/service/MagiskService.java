package com.bbva.ethermobilesdk.devicechecker.magisk.service;

import android.app.Service;
import android.content.Intent;
import com.bbva.ethermobile.elogger.EtherLogger;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.devicechecker.MagiskServiceApi;
import com.bbva.ethermobilesdk.devicechecker.logger.DeviceCheckerLoggerKt;
import com.bbva.ethermobilesdk.devicechecker.model.ServiceResponse;
import com.bbva.ethermobilesdk.devicechecker.p001native.DeviceCheckerNative;
import com.bbva.ethermobilesdk.devicechecker.util.EtherFile;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MagiskService.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0002\b\u0006J\u0013\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H\u0000¢\u0006\u0002\b\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000f"}, d2 = {"Lcom/bbva/ethermobilesdk/devicechecker/magisk/service/MagiskService;", "Landroid/app/Service;", "()V", "isFileDetected", "Lcom/bbva/ethermobile/help/kit/result/Result;", "", "isFileDetected$devicechecker_release", "isFileNativeDetected", "", "isFileNativeDetected$devicechecker_release", "onBind", "Lcom/bbva/ethermobilesdk/devicechecker/MagiskServiceApi$Stub;", "intent", "Landroid/content/Intent;", "Companion", "devicechecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMagiskService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MagiskService.kt\ncom/bbva/ethermobilesdk/devicechecker/magisk/service/MagiskService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,77:1\n1747#2,3:78\n*S KotlinDebug\n*F\n+ 1 MagiskService.kt\ncom/bbva/ethermobilesdk/devicechecker/magisk/service/MagiskService\n*L\n46#1:78,3\n*E\n"})
public final class MagiskService extends Service {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final List<String> f29489p0 = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"/sbin/.magisk/", "/sbin/.core/mirror", "/sbin/.core/img", "/sbin/.core/db-0/magisk.db", "/sbin/magisk", "/sbin/magisk32", "/sbin/magisk64", "/sbin/magiskhide", "/sbin/magiskinit"});

    /* JADX INFO: compiled from: MagiskService.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/ethermobilesdk/devicechecker/magisk/service/MagiskService$Companion;", "", "()V", "FILE_PATH", "", "", "getFILE_PATH", "()Ljava/util/List;", "devicechecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<String> getFILE_PATH() {
            return MagiskService.f29489p0;
        }
    }

    @NotNull
    public final Result<Boolean> isFileDetected$devicechecker_release() {
        Object objM5535constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            List<String> list = f29489p0;
            boolean z10 = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (new EtherFile((String) it.next()).exists()) {
                        z10 = true;
                        break;
                    }
                }
            }
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(Boolean.valueOf(z10)));
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            objM5535constructorimpl = new Result.Error(thM5538exceptionOrNullimpl);
        }
        return (Result) objM5535constructorimpl;
    }

    @NotNull
    public final Result<Integer> isFileNativeDetected$devicechecker_release() {
        Object objM5535constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(Integer.valueOf(new DeviceCheckerNative().isMagiskPresentNative())));
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            objM5535constructorimpl = new Result.Error(thM5538exceptionOrNullimpl);
        }
        return (Result) objM5535constructorimpl;
    }

    @Override // android.app.Service
    @NotNull
    public MagiskServiceApi.Stub onBind(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return new MagiskServiceApi.Stub() { // from class: com.bbva.ethermobilesdk.devicechecker.magisk.service.MagiskService.onBind.1
            @Override // com.bbva.ethermobilesdk.devicechecker.MagiskServiceApi
            public int isMagiskPresent() {
                MagiskService magiskService = MagiskService.this;
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    int asInteger = com.bbva.ethermobilesdk.devicechecker.extension.ResultKt.getAsInteger(magiskService.isFileDetected$devicechecker_release());
                    int asIntegerInt = com.bbva.ethermobilesdk.devicechecker.extension.ResultKt.getAsIntegerInt(magiskService.isFileNativeDetected$devicechecker_release());
                    ServiceResponse serviceResponse = ServiceResponse.SERVICE_ERROR;
                    return (asInteger <= serviceResponse.getCode() || asIntegerInt <= serviceResponse.getCode()) ? serviceResponse.getCode() : asIntegerInt | asInteger;
                } catch (Throwable th2) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2)));
                    if (thM5538exceptionOrNullimpl == null) {
                        throw new KotlinNothingValueException();
                    }
                    DeviceCheckerLoggerKt.logDeviceCheckerError(EtherLogger.INSTANCE, thM5538exceptionOrNullimpl, AnonymousClass1.class);
                    return ServiceResponse.SERVICE_ERROR.getCode();
                }
            }
        };
    }
}
