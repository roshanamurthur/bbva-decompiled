package com.bbva.ethermobilesdk.devicechecker.p001native;

import com.bbva.ethermobile.help.kit.result.ResultKt;
import com.bbva.ethermobilesdk.devicechecker.util.EtherSystem;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DeviceCheckerNative.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0086 J\t\u0010\u0005\u001a\u00020\u0004H\u0086 J\t\u0010\u0006\u001a\u00020\u0004H\u0086 J\t\u0010\u0007\u001a\u00020\u0004H\u0086 ¨\u0006\t"}, d2 = {"Lcom/bbva/ethermobilesdk/devicechecker/native/DeviceCheckerNative;", "", "()V", "isFridaNamedPipesDetected", "", "isFridaPathDetected", "isFridaThreadsDetected", "isMagiskPresentNative", "Companion", "devicechecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DeviceCheckerNative {

    @NotNull
    public static final String ID = "devicechecker";

    public DeviceCheckerNative() throws Throwable {
        ResultKt.getOrThrow(EtherSystem.INSTANCE.loadLibrary$devicechecker_release(ID));
    }

    public final native int isFridaNamedPipesDetected();

    public final native int isFridaPathDetected();

    public final native int isFridaThreadsDetected();

    public final native int isMagiskPresentNative();
}
