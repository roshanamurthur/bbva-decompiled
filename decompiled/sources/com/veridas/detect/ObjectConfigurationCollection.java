package com.veridas.detect;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ObjectConfigurationCollection.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/veridas/detect/ObjectConfigurationCollection;", "", "", "", "identifiers", "subset", "", "Lcom/veridas/detect/DetectableObjectConfiguration;", "a", "Ljava/util/Map;", "getConfigurations", "()Ljava/util/Map;", "configurations", "", "b", "Z", "getAllIntelligent", "()Z", "allIntelligent", "c", "getAllNonIntelligent", "allNonIntelligent", "d", "getAtLeastOneIntelligent", "atLeastOneIntelligent", "<init>", "(Ljava/util/Map;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nObjectConfigurationCollection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectConfigurationCollection.kt\ncom/veridas/detect/ObjectConfigurationCollection\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,45:1\n215#2,2:46\n526#3:48\n511#3,6:49\n*S KotlinDebug\n*F\n+ 1 ObjectConfigurationCollection.kt\ncom/veridas/detect/ObjectConfigurationCollection\n*L\n14#1:46,2\n39#1:48\n39#1:49,6\n*E\n"})
public final class ObjectConfigurationCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, DetectableObjectConfiguration> configurations;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean allIntelligent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean allNonIntelligent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean atLeastOneIntelligent;

    public ObjectConfigurationCollection(@NotNull Map<String, DetectableObjectConfiguration> configurations) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        this.configurations = configurations;
        int size = configurations.size();
        Iterator<Map.Entry<String, DetectableObjectConfiguration>> it = configurations.entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().getValue().isIntelligent()) {
                i10++;
            }
        }
        if (i10 == size) {
            this.allIntelligent = true;
            this.allNonIntelligent = false;
            this.atLeastOneIntelligent = false;
        } else if (i10 > 0) {
            this.atLeastOneIntelligent = true;
            this.allIntelligent = false;
            this.allNonIntelligent = false;
        } else {
            this.allNonIntelligent = true;
            this.allIntelligent = false;
            this.atLeastOneIntelligent = false;
        }
    }

    public final boolean getAllIntelligent() {
        return this.allIntelligent;
    }

    public final boolean getAllNonIntelligent() {
        return this.allNonIntelligent;
    }

    public final boolean getAtLeastOneIntelligent() {
        return this.atLeastOneIntelligent;
    }

    @NotNull
    public final Map<String, DetectableObjectConfiguration> getConfigurations() {
        return this.configurations;
    }

    @NotNull
    public final ObjectConfigurationCollection subset(@NotNull List<String> identifiers) {
        Intrinsics.checkNotNullParameter(identifiers, "identifiers");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, DetectableObjectConfiguration> entry : this.configurations.entrySet()) {
            if (identifiers.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new ObjectConfigurationCollection(linkedHashMap);
    }
}
