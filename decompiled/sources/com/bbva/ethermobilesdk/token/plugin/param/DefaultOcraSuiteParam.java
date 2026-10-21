package com.bbva.ethermobilesdk.token.plugin.param;

import androidx.camera.camera2.internal.h0;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DefaultOcraSuiteParam.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/ethermobilesdk/token/plugin/param/DefaultOcraSuiteParam;", "Lcom/bbva/ethermobilesdk/token/plugin/param/MalformedParams;", "", "isMalformed", "", "component1", "ocraSuite", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "equals", "a", "Ljava/lang/String;", "getOcraSuite", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "ethertoken-plugin_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class DefaultOcraSuiteParam implements MalformedParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ocraSuite")
    @Nullable
    private final String ocraSuite;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultOcraSuiteParam() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DefaultOcraSuiteParam copy$default(DefaultOcraSuiteParam defaultOcraSuiteParam, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = defaultOcraSuiteParam.ocraSuite;
        }
        return defaultOcraSuiteParam.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOcraSuite() {
        return this.ocraSuite;
    }

    @NotNull
    public final DefaultOcraSuiteParam copy(@Nullable String ocraSuite) {
        return new DefaultOcraSuiteParam(ocraSuite);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DefaultOcraSuiteParam) && Intrinsics.areEqual(this.ocraSuite, ((DefaultOcraSuiteParam) other).ocraSuite);
    }

    @Nullable
    public final String getOcraSuite() {
        return this.ocraSuite;
    }

    public int hashCode() {
        String str = this.ocraSuite;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // com.bbva.ethermobilesdk.token.plugin.param.MalformedParams
    public boolean isMalformed() {
        String str = this.ocraSuite;
        return str == null || l.isBlank(str);
    }

    @NotNull
    public String toString() {
        return h0.b("DefaultOcraSuiteParam(ocraSuite=", this.ocraSuite, ")");
    }

    public DefaultOcraSuiteParam(@Nullable String str) {
        this.ocraSuite = str;
    }

    public /* synthetic */ DefaultOcraSuiteParam(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }
}
