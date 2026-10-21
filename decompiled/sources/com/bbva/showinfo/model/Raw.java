package com.bbva.showinfo.model;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ResourceOrigin.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/showinfo/model/Raw;", "Lcom/bbva/showinfo/model/ResourceOrigin;", "", "component1", "value", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "showinfo_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class Raw extends ResourceOrigin {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Raw(@NotNull String value) {
        super(null);
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    public static /* synthetic */ Raw copy$default(Raw raw, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = raw.value;
        }
        return raw.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final Raw copy(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new Raw(value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Raw) && Intrinsics.areEqual(this.value, ((Raw) other).value);
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    @NotNull
    public String toString() {
        return d.f(new StringBuilder("Raw(value="), this.value, ")");
    }
}
