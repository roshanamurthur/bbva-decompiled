package org.koin.core.registry;

import androidx.camera.core.impl.utils.a;
import androidx.camera.core.processing.f;
import bk.q;
import com.bbva.glomohybrid.logs.LogKeysKt;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.Properties;
import kotlin.Metadata;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.error.NoPropertyFileFoundException;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;

/* JADX INFO: compiled from: PropertyRegistryExt.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005\u001a\n\u0010\b\u001a\u00020\u0003*\u00020\u0000¨\u0006\t"}, d2 = {"Lorg/koin/core/registry/PropertyRegistry;", "Ljava/util/Properties;", LogKeysKt.PROPERTIES, "", "saveProperties", "", "fileName", "loadPropertiesFromFile", "loadEnvironmentProperties", "koin-core"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPropertyRegistryExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PropertyRegistryExt.kt\norg/koin/core/registry/PropertyRegistryExtKt\n+ 2 Logger.kt\norg/koin/core/logger/Logger\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,56:1\n28#2:57\n46#2,2:58\n29#2:60\n28#2:63\n46#2,2:64\n29#2:66\n32#2:67\n46#2,2:68\n33#2:70\n28#2:71\n46#2,2:72\n29#2:74\n215#3,2:61\n*S KotlinDebug\n*F\n+ 1 PropertyRegistryExt.kt\norg/koin/core/registry/PropertyRegistryExtKt\n*L\n14#1:57\n14#1:58,2\n14#1:60\n27#1:63\n27#1:64,2\n27#1:66\n31#1:67\n31#1:68,2\n31#1:70\n49#1:71\n49#1:72,2\n49#1:74\n17#1:61,2\n*E\n"})
public final class PropertyRegistryExtKt {
    public static final void loadEnvironmentProperties(@NotNull PropertyRegistry propertyRegistry) {
        Intrinsics.checkNotNullParameter(propertyRegistry, "<this>");
        Logger logger = propertyRegistry.get_koin().getLogger();
        Level level = Level.DEBUG;
        if (logger.isAt(level)) {
            logger.display(level, "load properties from environment");
        }
        Properties sysProperties = System.getProperties();
        Intrinsics.checkNotNullExpressionValue(sysProperties, "sysProperties");
        saveProperties(propertyRegistry, sysProperties);
        Map<String, String> map = System.getenv();
        Intrinsics.checkNotNullExpressionValue(map, "getenv()");
        Properties properties = new Properties();
        properties.putAll(map);
        saveProperties(propertyRegistry, properties);
    }

    public static final void loadPropertiesFromFile(@NotNull PropertyRegistry propertyRegistry, @NotNull String fileName) throws NoPropertyFileFoundException, IOException {
        String str;
        Intrinsics.checkNotNullParameter(propertyRegistry, "<this>");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Logger logger = propertyRegistry.get_koin().getLogger();
        String strD = f.d("load properties from ", fileName);
        Level level = Level.DEBUG;
        if (logger.isAt(level)) {
            logger.display(level, strD);
        }
        URL resource = Koin.class.getResource(fileName);
        if (resource != null) {
            str = new String(TextStreamsKt.readBytes(resource), Charsets.UTF_8);
        } else {
            str = null;
        }
        if (str == null) {
            throw new NoPropertyFileFoundException(a.a("No properties found for file '", fileName, '\''));
        }
        Logger logger2 = propertyRegistry.get_koin().getLogger();
        String strA = a.a("loaded properties from file:'", fileName, '\'');
        Level level2 = Level.INFO;
        if (logger2.isAt(level2)) {
            logger2.display(level2, strA);
        }
        Properties properties = new Properties();
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        properties.load(new ByteArrayInputStream(bytes));
        saveProperties(propertyRegistry, properties);
    }

    public static final void saveProperties(@NotNull PropertyRegistry propertyRegistry, @NotNull Properties properties) {
        Intrinsics.checkNotNullParameter(propertyRegistry, "<this>");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Logger logger = propertyRegistry.get_koin().getLogger();
        String str = "load " + properties.size() + " properties";
        Level level = Level.DEBUG;
        if (logger.isAt(level)) {
            logger.display(level, str);
        }
        Map map = q.toMap(properties);
        Intrinsics.checkNotNull(map, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        for (Map.Entry entry : map.entrySet()) {
            propertyRegistry.saveProperty$koin_core((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
