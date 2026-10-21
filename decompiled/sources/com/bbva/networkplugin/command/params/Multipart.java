package com.bbva.networkplugin.command.params;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Multipart.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/bbva/networkplugin/command/params/Multipart;", "", "", "a", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "type", "", "Lcom/bbva/networkplugin/command/params/FormDataPart;", "b", "[Lcom/bbva/networkplugin/command/params/FormDataPart;", "getParts", "()[Lcom/bbva/networkplugin/command/params/FormDataPart;", "parts", "<init>", "(Ljava/lang/String;[Lcom/bbva/networkplugin/command/params/FormDataPart;)V", "network-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class Multipart {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("formDataParts")
    @NotNull
    private final FormDataPart[] parts;

    public Multipart(@NotNull String type, @NotNull FormDataPart[] parts) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.type = type;
        this.parts = parts;
    }

    @NotNull
    public final FormDataPart[] getParts() {
        return this.parts;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
