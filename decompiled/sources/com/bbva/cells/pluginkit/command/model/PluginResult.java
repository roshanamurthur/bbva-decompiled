package com.bbva.cells.pluginkit.command.model;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.notifications.model.constants.BanxicoConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNull;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PluginResult.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/cells/pluginkit/command/model/PluginResult;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "toString", "Lcom/bbva/cells/pluginkit/command/model/ResultCode;", "code", "Lkotlinx/serialization/KSerializer;", "serializer", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "<init>", "(Lcom/bbva/cells/pluginkit/command/model/ResultCode;Lkotlinx/serialization/KSerializer;Ljava/lang/Object;)V", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public final class PluginResult<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResultCode f26818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KSerializer<T> f26819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f26820c;

    public PluginResult(@NotNull ResultCode code, @Nullable KSerializer<T> kSerializer, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f26818a = code;
        this.f26819b = kSerializer;
        this.f26820c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public String toString() {
        JsonElement jsonElementJsonPrimitive;
        Object obj = this.f26820c;
        KSerializer<T> kSerializer = this.f26819b;
        if (kSerializer != null) {
            jsonElementJsonPrimitive = Json.INSTANCE.encodeToJsonElement(kSerializer, obj);
        } else if (obj instanceof String) {
            jsonElementJsonPrimitive = JsonElementKt.JsonPrimitive((String) obj);
        } else if (!(obj instanceof Integer) && !(obj instanceof Float) && !(obj instanceof Double) && !(obj instanceof Long)) {
            jsonElementJsonPrimitive = obj instanceof Boolean ? JsonElementKt.JsonPrimitive((Boolean) obj) : JsonNull.INSTANCE;
        } else {
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Number");
            }
            jsonElementJsonPrimitive = JsonElementKt.JsonPrimitive((Number) obj);
        }
        return Json.INSTANCE.encodeToString(Result.INSTANCE.serializer(), new Result(this.f26818a.ordinal(), jsonElementJsonPrimitive));
    }
}
