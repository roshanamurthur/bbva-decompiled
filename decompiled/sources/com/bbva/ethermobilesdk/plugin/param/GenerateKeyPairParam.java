package com.bbva.ethermobilesdk.plugin.param;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GenerateKeyPairParam.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\b\u0010\u0010\u001a\u00020\fH\u0016J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/bbva/ethermobilesdk/plugin/param/GenerateKeyPairParam;", "Lcom/bbva/ethermobilesdk/plugin/param/MalformedParams;", "length", "", "(Ljava/lang/Integer;)V", "getLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/bbva/ethermobilesdk/plugin/param/GenerateKeyPairParam;", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "isMalformed", "toString", "", "cipher-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class GenerateKeyPairParam implements MalformedParams {

    @Nullable
    private final Integer length;

    /* JADX WARN: Multi-variable type inference failed */
    public GenerateKeyPairParam() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ GenerateKeyPairParam copy$default(GenerateKeyPairParam generateKeyPairParam, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = generateKeyPairParam.length;
        }
        return generateKeyPairParam.copy(num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getLength() {
        return this.length;
    }

    @NotNull
    public final GenerateKeyPairParam copy(@Nullable Integer length) {
        return new GenerateKeyPairParam(length);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GenerateKeyPairParam) && Intrinsics.areEqual(this.length, ((GenerateKeyPairParam) other).length);
    }

    @Nullable
    public final Integer getLength() {
        return this.length;
    }

    public int hashCode() {
        Integer num = this.length;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    @Override // com.bbva.ethermobilesdk.plugin.param.MalformedParams
    public boolean isMalformed() {
        return this.length == null;
    }

    @NotNull
    public String toString() {
        return "GenerateKeyPairParam(length=" + this.length + RootService.CLOSE_BRACKET;
    }

    public GenerateKeyPairParam(@Nullable Integer num) {
        this.length = num;
    }

    public /* synthetic */ GenerateKeyPairParam(Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num);
    }
}
