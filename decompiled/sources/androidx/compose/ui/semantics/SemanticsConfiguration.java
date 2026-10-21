package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SemanticsConfiguration.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u00012\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002B\u0007¢\u0006\u0004\b.\u0010/J$\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rJ3\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n¢\u0006\u0004\b\u000e\u0010\rJ!\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u000fH\u0096\u0002J,\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\u0002J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001c\u0010\u0019J\u0006\u0010\u001e\u001a\u00020\u0000J\u0013\u0010 \u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\"\u001a\u00020!H\u0016J\b\u0010$\u001a\u00020#H\u0016R\"\u0010'\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010,\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*¨\u00060"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsConfiguration;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", ExifInterface.GPS_DIRECTION_TRUE, "key", "get", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Ljava/lang/Object;", "Lkotlin/Function0;", "defaultValue", "getOrElse", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getOrElseNullable", "", "iterator", "value", "", SetCommand.ID, "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;Ljava/lang/Object;)V", "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "child", "mergeChild$ui_release", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "mergeChild", "peer", "collapsePeer$ui_release", "collapsePeer", "copy", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "q0", "Z", "isMergingSemanticsOfDescendants", "()Z", "setMergingSemanticsOfDescendants", "(Z)V", "r0", "isClearingSemantics", "setClearingSemantics", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class SemanticsConfiguration implements SemanticsPropertyReceiver, Iterable<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>>, KMappedMarker {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f17515p0 = new LinkedHashMap();

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public boolean isMergingSemanticsOfDescendants;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public boolean isClearingSemantics;

    public final void collapsePeer$ui_release(@NotNull SemanticsConfiguration peer) {
        Intrinsics.checkNotNullParameter(peer, "peer");
        if (peer.isMergingSemanticsOfDescendants) {
            this.isMergingSemanticsOfDescendants = true;
        }
        if (peer.isClearingSemantics) {
            this.isClearingSemantics = true;
        }
        for (Map.Entry entry : peer.f17515p0.entrySet()) {
            SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) entry.getKey();
            Object value = entry.getValue();
            LinkedHashMap linkedHashMap = this.f17515p0;
            if (!linkedHashMap.containsKey(semanticsPropertyKey)) {
                linkedHashMap.put(semanticsPropertyKey, value);
            } else if (value instanceof AccessibilityAction) {
                Object obj = linkedHashMap.get(semanticsPropertyKey);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
                String label = accessibilityAction.getLabel();
                if (label == null) {
                    label = ((AccessibilityAction) value).getLabel();
                }
                Function action = accessibilityAction.getAction();
                if (action == null) {
                    action = ((AccessibilityAction) value).getAction();
                }
                linkedHashMap.put(semanticsPropertyKey, new AccessibilityAction(label, action));
            }
        }
    }

    public final <T> boolean contains(@NotNull SemanticsPropertyKey<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f17515p0.containsKey(key);
    }

    @NotNull
    public final SemanticsConfiguration copy() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.isMergingSemanticsOfDescendants = this.isMergingSemanticsOfDescendants;
        semanticsConfiguration.isClearingSemantics = this.isClearingSemantics;
        semanticsConfiguration.f17515p0.putAll(this.f17515p0);
        return semanticsConfiguration;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SemanticsConfiguration)) {
            return false;
        }
        SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) other;
        return Intrinsics.areEqual(this.f17515p0, semanticsConfiguration.f17515p0) && this.isMergingSemanticsOfDescendants == semanticsConfiguration.isMergingSemanticsOfDescendants && this.isClearingSemantics == semanticsConfiguration.isClearingSemantics;
    }

    public final <T> T get(@NotNull SemanticsPropertyKey<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t10 = (T) this.f17515p0.get(key);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Key not present: " + key + " - consider getOrElse or getOrNull");
    }

    public final <T> T getOrElse(@NotNull SemanticsPropertyKey<T> key, @NotNull Function0<? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        T t10 = (T) this.f17515p0.get(key);
        return t10 == null ? defaultValue.invoke() : t10;
    }

    @Nullable
    public final <T> T getOrElseNullable(@NotNull SemanticsPropertyKey<T> key, @NotNull Function0<? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        T t10 = (T) this.f17515p0.get(key);
        return t10 == null ? defaultValue.invoke() : t10;
    }

    public int hashCode() {
        return (((this.f17515p0.hashCode() * 31) + (this.isMergingSemanticsOfDescendants ? 1231 : 1237)) * 31) + (this.isClearingSemantics ? 1231 : 1237);
    }

    /* JADX INFO: renamed from: isClearingSemantics, reason: from getter */
    public final boolean getIsClearingSemantics() {
        return this.isClearingSemantics;
    }

    /* JADX INFO: renamed from: isMergingSemanticsOfDescendants, reason: from getter */
    public final boolean getIsMergingSemanticsOfDescendants() {
        return this.isMergingSemanticsOfDescendants;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> iterator() {
        return this.f17515p0.entrySet().iterator();
    }

    public final void mergeChild$ui_release(@NotNull SemanticsConfiguration child) {
        Intrinsics.checkNotNullParameter(child, "child");
        for (Map.Entry entry : child.f17515p0.entrySet()) {
            SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) entry.getKey();
            Object value = entry.getValue();
            LinkedHashMap linkedHashMap = this.f17515p0;
            Object obj = linkedHashMap.get(semanticsPropertyKey);
            Intrinsics.checkNotNull(semanticsPropertyKey, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
            Object objMerge = semanticsPropertyKey.merge(obj, value);
            if (objMerge != null) {
                linkedHashMap.put(semanticsPropertyKey, objMerge);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.semantics.SemanticsPropertyReceiver
    public <T> void set(@NotNull SemanticsPropertyKey<T> key, T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        boolean z10 = value instanceof AccessibilityAction;
        LinkedHashMap linkedHashMap = this.f17515p0;
        if (!z10 || !contains(key)) {
            linkedHashMap.put(key, value);
            return;
        }
        Object obj = linkedHashMap.get(key);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) value;
        String label = accessibilityAction2.getLabel();
        if (label == null) {
            label = accessibilityAction.getLabel();
        }
        Function action = accessibilityAction2.getAction();
        if (action == null) {
            action = accessibilityAction.getAction();
        }
        linkedHashMap.put(key, new AccessibilityAction(label, action));
    }

    public final void setClearingSemantics(boolean z10) {
        this.isClearingSemantics = z10;
    }

    public final void setMergingSemanticsOfDescendants(boolean z10) {
        this.isMergingSemanticsOfDescendants = z10;
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.isMergingSemanticsOfDescendants) {
            sb2.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.isClearingSemantics) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f17515p0.entrySet()) {
            SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) entry.getKey();
            Object value = entry.getValue();
            sb2.append(str);
            sb2.append(semanticsPropertyKey.getName());
            sb2.append(" : ");
            sb2.append(value);
            str = ", ";
        }
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + "{ " + ((Object) sb2) + " }";
    }
}
