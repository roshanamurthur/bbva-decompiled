package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InspectableValue.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/platform/ValueElement;", "", "", "component1", "component2", "name", "value", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ValueElement {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Object value;

    public ValueElement(@NotNull String name, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.value = obj;
    }

    public static /* synthetic */ ValueElement copy$default(ValueElement valueElement, String str, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = valueElement.name;
        }
        if ((i10 & 2) != 0) {
            obj = valueElement.value;
        }
        return valueElement.copy(str, obj);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    @NotNull
    public final ValueElement copy(@NotNull String name, @Nullable Object value) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ValueElement(name, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValueElement)) {
            return false;
        }
        ValueElement valueElement = (ValueElement) other;
        return Intrinsics.areEqual(this.name, valueElement.name) && Intrinsics.areEqual(this.value, valueElement.value);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        Object obj = this.value;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ValueElement(name=");
        sb2.append(this.name);
        sb2.append(", value=");
        return androidx.camera.core.impl.v.d(sb2, this.value, RootService.CLOSE_BRACKET);
    }
}
