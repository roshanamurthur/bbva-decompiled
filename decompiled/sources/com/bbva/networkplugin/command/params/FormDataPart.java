package com.bbva.networkplugin.command.params;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FormDataPart.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/bbva/networkplugin/command/params/FormDataPart;", "", "", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "b", "getFilename", "filename", "Lcom/bbva/networkplugin/command/params/MultipartBody;", "c", "Lcom/bbva/networkplugin/command/params/MultipartBody;", "getBody", "()Lcom/bbva/networkplugin/command/params/MultipartBody;", "body", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/bbva/networkplugin/command/params/MultipartBody;)V", "network-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class FormDataPart {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("filename")
    @Nullable
    private final String filename;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("body")
    @NotNull
    private final MultipartBody body;

    public FormDataPart(@NotNull String name, @Nullable String str, @NotNull MultipartBody body) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        this.name = name;
        this.filename = str;
        this.body = body;
    }

    @NotNull
    public final MultipartBody getBody() {
        return this.body;
    }

    @Nullable
    public final String getFilename() {
        return this.filename;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public /* synthetic */ FormDataPart(String str, String str2, MultipartBody multipartBody, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, multipartBody);
    }
}
