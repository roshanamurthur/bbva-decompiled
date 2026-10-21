package com.bbva.cells.componentkit;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Deserializer.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/bbva/cells/componentkit/JsonDeserializer;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/cells/componentkit/Deserializer;", "", "raw", "deserialize", "(Ljava/lang/String;)Ljava/lang/Object;", "Lkotlinx/serialization/KSerializer;", "serializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "componentkit_release"}, k = 1, mv = {1, 6, 0})
public final class JsonDeserializer<T> implements Deserializer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KSerializer<T> f26710a;

    public JsonDeserializer(@NotNull KSerializer<T> serializer) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f26710a = serializer;
    }

    @Override // com.bbva.cells.componentkit.Deserializer
    public T deserialize(@NotNull String raw) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        return (T) Json.INSTANCE.decodeFromString(this.f26710a, raw);
    }
}
