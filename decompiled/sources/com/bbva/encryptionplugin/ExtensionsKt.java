package com.bbva.encryptionplugin;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Extensions.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0002H\u0086\b¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"inject", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "(Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;)Ljava/lang/Object;", "encryption_plugin_release"}, k = 2, mv = {1, 1, 16})
public final class ExtensionsKt {
    @Nullable
    public static final /* synthetic */ <T> T inject(@NotNull AbstractCommand<?> abstractCommand) {
        Map<KClass<?>, Function0<?>> map = InjectionsContainer.INSTANCE.getMap();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        Function0<?> function0 = map.get(Reflection.getOrCreateKotlinClass(Object.class));
        T t10 = function0 != null ? (T) function0.invoke() : null;
        Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
        return t10;
    }
}
