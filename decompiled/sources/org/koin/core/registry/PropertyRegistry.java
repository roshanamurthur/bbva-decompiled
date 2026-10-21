package org.koin.core.registry;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.glomohybrid.logs.LogKeysKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: PropertyRegistry.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002J)\u0010\f\u001a\u00020\u0005\"\b\b\u0000\u0010\u0007*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003J\u001d\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0005R\u001a\u0010\u0016\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lorg/koin/core/registry/PropertyRegistry;", "", "", "", LogKeysKt.PROPERTIES, "", "saveProperties", ExifInterface.GPS_DIRECTION_TRUE, "key", "value", "saveProperty$koin_core", "(Ljava/lang/String;Ljava/lang/Object;)V", "saveProperty", "deleteProperty", "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", HearingDisabilitiesConstants.CLOSE_MODAL, "Lorg/koin/core/Koin;", "a", "Lorg/koin/core/Koin;", "get_koin$koin_core", "()Lorg/koin/core/Koin;", "_koin", "<init>", "(Lorg/koin/core/Koin;)V", "koin-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPropertyRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PropertyRegistry.kt\norg/koin/core/registry/PropertyRegistry\n+ 2 Logger.kt\norg/koin/core/logger/Logger\n*L\n1#1,68:1\n28#2:69\n46#2,2:70\n29#2:72\n*S KotlinDebug\n*F\n+ 1 PropertyRegistry.kt\norg/koin/core/registry/PropertyRegistry\n*L\n38#1:69\n38#1:70,2\n38#1:72\n*E\n"})
public final class PropertyRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Koin _koin;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<String, Object> f92459b;

    public PropertyRegistry(@NotNull Koin _koin) {
        Intrinsics.checkNotNullParameter(_koin, "_koin");
        this._koin = _koin;
        this.f92459b = KoinPlatformTools.INSTANCE.safeHashMap();
    }

    public final void close() {
        this.f92459b.clear();
    }

    public final void deleteProperty(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f92459b.remove(key);
    }

    @Nullable
    public final <T> T getProperty(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t10 = (T) this.f92459b.get(key);
        if (t10 == null) {
            return null;
        }
        return t10;
    }

    @NotNull
    /* JADX INFO: renamed from: get_koin$koin_core, reason: from getter */
    public final Koin get_koin() {
        return this._koin;
    }

    public final void saveProperties(@NotNull Map<String, ? extends Object> properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        Logger logger = this._koin.getLogger();
        String str = "load " + properties.size() + " properties";
        Level level = Level.DEBUG;
        if (logger.isAt(level)) {
            logger.display(level, str);
        }
        this.f92459b.putAll(properties);
    }

    public final <T> void saveProperty$koin_core(@NotNull String key, @NotNull T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f92459b.put(key, value);
    }
}
