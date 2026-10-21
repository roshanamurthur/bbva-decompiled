package com.bbva.cellscore.web.deserializer;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.cellscore.web.mapper.Mapper;
import com.google.gson.Gson;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Deserializer.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B%\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0007\u001a\u00028\u0001\"\n\b\u0002\u0010\u0004\u0018\u0001*\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/bbva/cellscore/web/deserializer/Deserializer;", "M", "D", "", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/io/InputStream;", "stream", "deserialize", "(Ljava/io/InputStream;)Ljava/lang/Object;", "Lcom/google/gson/Gson;", "a", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "gson", "Lcom/bbva/cellscore/web/mapper/Mapper;", "b", "Lcom/bbva/cellscore/web/mapper/Mapper;", "getMapper", "()Lcom/bbva/cellscore/web/mapper/Mapper;", "mapper", "<init>", "(Lcom/google/gson/Gson;Lcom/bbva/cellscore/web/mapper/Mapper;)V", "cells-core_release"}, k = 1, mv = {1, 5, 1})
public abstract class Deserializer<M, D> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Gson gson;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Mapper<M, D> mapper;

    public Deserializer(@NotNull Gson gson, @NotNull Mapper<M, D> mapper) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.gson = gson;
        this.mapper = mapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <T extends M> D deserialize(InputStream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        Gson gson = getGson();
        InputStreamReader inputStreamReader = new InputStreamReader(stream);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (D) getMapper().modelToData(gson.fromJson((Reader) inputStreamReader, Object.class));
    }

    @NotNull
    public final Gson getGson() {
        return this.gson;
    }

    @NotNull
    public final Mapper<M, D> getMapper() {
        return this.mapper;
    }

    public /* synthetic */ Deserializer(Gson gson, Mapper mapper, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Gson() : gson, mapper);
    }
}
