package com.bbva.ethermobilesdk.devicemanager.gms.data.devicechecker.playintegrity.repository;

import com.bbva.ethermobile.help.kit.result.Result;
import com.noknok.android.client.appsdk_plus.IAppSDKPlus;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceCheckerPlayIntegrityRepository.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bà\u0080\u0001\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/gms/data/devicechecker/playintegrity/repository/DeviceCheckerPlayIntegrityRepository;", "", "integrityToken", "Lcom/bbva/ethermobile/help/kit/result/Result;", "", IAppSDKPlus.EXTRA_KEY_NONCE, "cloudProjectNumber", "", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "devicemanager-gms_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeviceCheckerPlayIntegrityRepository {
    @Nullable
    Object integrityToken(@NotNull String str, long j10, @NotNull Continuation<? super Result<String>> continuation);
}
