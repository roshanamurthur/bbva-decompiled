package okhttp3.tls.internal.der;

import androidx.camera.core.impl.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: certificates.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0003J)\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lokhttp3/tls/internal/der/Extension;", "", "", "component1", "", "component2", "component3", "id", "critical", "value", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "Z", "getCritical", "()Z", "c", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "<init>", "(Ljava/lang/String;ZLjava/lang/Object;)V", "okhttp-tls"}, k = 1, mv = {1, 4, 0})
public final /* data */ class Extension {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean critical;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Object value;

    public Extension(@NotNull String id, boolean z10, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.critical = z10;
        this.value = obj;
    }

    public static /* synthetic */ Extension copy$default(Extension extension, String str, boolean z10, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = extension.id;
        }
        if ((i10 & 2) != 0) {
            z10 = extension.critical;
        }
        if ((i10 & 4) != 0) {
            obj = extension.value;
        }
        return extension.copy(str, z10, obj);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getCritical() {
        return this.critical;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    @NotNull
    public final Extension copy(@NotNull String id, boolean critical, @Nullable Object value) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new Extension(id, critical, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Extension)) {
            return false;
        }
        Extension extension = (Extension) other;
        return Intrinsics.areEqual(this.id, extension.id) && this.critical == extension.critical && Intrinsics.areEqual(this.value, extension.value);
    }

    public final boolean getCritical() {
        return this.critical;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Object getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        String str = this.id;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z10 = this.critical;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int i10 = (iHashCode + r3) * 31;
        Object obj = this.value;
        return i10 + (obj != null ? obj.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Extension(id=");
        sb2.append(this.id);
        sb2.append(", critical=");
        sb2.append(this.critical);
        sb2.append(", value=");
        return a.e(sb2, this.value, ")");
    }
}
