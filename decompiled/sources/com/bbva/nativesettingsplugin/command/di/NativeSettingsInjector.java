package com.bbva.nativesettingsplugin.command.di;

import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NativeSettingsInjector.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J.\u0010\u0007\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0018\b\b\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u0004H\u0086\bø\u0001\u0000J\u0018\u0010\b\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0002\u0018\u0001H\u0086\b¢\u0006\u0004\b\b\u0010\tR>\u0010\u0012\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0010\u0012\u000e\u0012\u0002\b\u00030\u0003j\u0006\u0012\u0002\b\u0003`\u00040\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"Lcom/bbva/nativesettingsplugin/command/di/NativeSettingsInjector;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "Lcom/bbva/nativesettingsplugin/command/di/Provider;", "value", "", "add", "get", "()Ljava/lang/Object;", "", "Lkotlin/reflect/KClass;", "a", "Ljava/util/Map;", "getMap", "()Ljava/util/Map;", "setMap", "(Ljava/util/Map;)V", "map", "<init>", "()V", "nativesettings-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class NativeSettingsInjector {

    @NotNull
    public static final NativeSettingsInjector INSTANCE = new NativeSettingsInjector();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Map<KClass<?>, Function0<?>> map = new LinkedHashMap();

    public final /* synthetic */ <T> void add(Function0<? extends T> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Map<KClass<?>, Function0<?>> map2 = getMap();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        map2.put(Reflection.getOrCreateKotlinClass(Object.class), value);
    }

    public final /* synthetic */ <T> T get() {
        Map<KClass<?>, Function0<?>> map2 = getMap();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        Function0<?> function0 = map2.get(Reflection.getOrCreateKotlinClass(Object.class));
        T t10 = function0 != null ? (T) function0.invoke() : null;
        Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
        return t10;
    }

    @NotNull
    public final Map<KClass<?>, Function0<?>> getMap() {
        return map;
    }

    public final void setMap(@NotNull Map<KClass<?>, Function0<?>> map2) {
        Intrinsics.checkNotNullParameter(map2, "<set-?>");
        map = map2;
    }
}
