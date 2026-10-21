package com.bbva.glomoutils.mappable;

import androidx.camera.camera2.internal.h0;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GsonMappableConverter.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J*\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00040\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/glomoutils/mappable/GsonMappableConverter;", "Lcom/bbva/glomoutils/mappable/MappableConverter;", "", "src", "", "", "toMap", "", "<init>", "()V", "gl-utils_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nGsonMappableConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonMappableConverter.kt\ncom/bbva/glomoutils/mappable/GsonMappableConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,23:1\n1549#2:24\n1620#2,3:25\n*S KotlinDebug\n*F\n+ 1 GsonMappableConverter.kt\ncom/bbva/glomoutils/mappable/GsonMappableConverter\n*L\n21#1:24\n21#1:25,3\n*E\n"})
public final class GsonMappableConverter implements MappableConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Type f34858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Gson f34859b;

    public GsonMappableConverter() {
        Type type = new TypeToken<Map<String, ? extends Object>>() { // from class: com.bbva.glomoutils.mappable.GsonMappableConverter$type$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        this.f34858a = type;
        this.f34859b = new GsonBuilder().serializeNulls().create();
    }

    @Override // com.bbva.glomoutils.mappable.MappableConverter
    @NotNull
    public Map<String, Object> toMap(@NotNull Object src) {
        Intrinsics.checkNotNullParameter(src, "src");
        Gson gson = this.f34859b;
        JsonElement jsonTree = gson.toJsonTree(src);
        if (!jsonTree.isJsonObject()) {
            throw new IllegalArgumentException(h0.b("Argument must be a class, ", src.getClass().getSimpleName(), " passed").toString());
        }
        Object objFromJson = gson.fromJson(jsonTree, this.f34858a);
        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
        return (Map) objFromJson;
    }

    @Override // com.bbva.glomoutils.mappable.MappableConverter
    @NotNull
    public List<Map<String, Object>> toMap(@NotNull List<? extends Object> src) {
        Intrinsics.checkNotNullParameter(src, "src");
        List<? extends Object> list = src;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(MappableEngineKt.toMap(it.next()));
        }
        return arrayList;
    }
}
