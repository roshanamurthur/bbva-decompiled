package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.glomohybrid.logs.LogKeysKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InspectableValue.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", "b", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "Landroidx/compose/ui/platform/ValueElementSequence;", "c", "Landroidx/compose/ui/platform/ValueElementSequence;", "getProperties", "()Landroidx/compose/ui/platform/ValueElementSequence;", LogKeysKt.PROPERTIES, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class InspectorInfo {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Object value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ValueElementSequence properties = new ValueElementSequence();

    @Nullable
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final ValueElementSequence getProperties() {
        return this.properties;
    }

    @Nullable
    public final Object getValue() {
        return this.value;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setValue(@Nullable Object obj) {
        this.value = obj;
    }
}
