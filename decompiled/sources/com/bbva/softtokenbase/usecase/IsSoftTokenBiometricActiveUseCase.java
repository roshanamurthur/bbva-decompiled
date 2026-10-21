package com.bbva.softtokenbase.usecase;

import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomoutils.usecase.UseCase;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IsSoftTokenBiometricActiveUseCase.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/bbva/softtokenbase/usecase/IsSoftTokenBiometricActiveUseCase;", "Lcom/bbva/glomoutils/usecase/UseCase;", "", "execute", "()Ljava/lang/Boolean;", "Lcom/bbva/glomo/storage/MainStorage;", "dataSource", "Lcom/bbva/softtokenbase/usecase/DeviceAccessConfig;", "configReader", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;Lcom/bbva/softtokenbase/usecase/DeviceAccessConfig;)V", "Companion", "softtokenbase_release"}, k = 1, mv = {1, 9, 0})
public final class IsSoftTokenBiometricActiveUseCase implements UseCase<Boolean> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TypeToken<?> f36896c = TypeToken.getParameterized(Map.class, String.class, Object.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainStorage f36897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DeviceAccessConfig f36898b;

    /* JADX INFO: compiled from: IsSoftTokenBiometricActiveUseCase.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\u0012\u0012\u0002\b\u0003 \u0005*\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/softtokenbase/usecase/IsSoftTokenBiometricActiveUseCase$Companion;", "", "()V", ConstantsKt.TYPE, "Lcom/google/gson/reflect/TypeToken;", "kotlin.jvm.PlatformType", "getTYPE", "()Lcom/google/gson/reflect/TypeToken;", "softtokenbase_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TypeToken<?> getTYPE() {
            return IsSoftTokenBiometricActiveUseCase.f36896c;
        }
    }

    public IsSoftTokenBiometricActiveUseCase(@NotNull MainStorage dataSource, @NotNull DeviceAccessConfig configReader) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(configReader, "configReader");
        this.f36897a = dataSource;
        this.f36898b = configReader;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bbva.glomoutils.usecase.UseCase
    @NotNull
    public Boolean execute() {
        String string$default = MainStorage.getString$default(this.f36897a, LocalStorageConstantsKt.KEY_MAP_DEVICE_ACCESSES, null, false, null, 12, null);
        try {
            Result.Companion companion = Result.INSTANCE;
            Object objFromJson = new Gson().fromJson(string$default, f36896c.getType());
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            return Boolean.valueOf(this.f36898b.isBiometryEnabled((Map) objFromJson));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Object objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            Boolean bool = Boolean.FALSE;
            if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
                objM5535constructorimpl = bool;
            }
            return (Boolean) objM5535constructorimpl;
        }
    }

    public /* synthetic */ IsSoftTokenBiometricActiveUseCase(MainStorage mainStorage, DeviceAccessConfig deviceAccessConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(mainStorage, (i10 & 2) != 0 ? new DefaultDeviceAccessConfig() : deviceAccessConfig);
    }
}
