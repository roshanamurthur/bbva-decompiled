package androidx.compose.ui.modifier;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ModifierLocalModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0011¢\u0006\u0004\b\u0019\u0010\u0017J,\u0010\t\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0090\u0002¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0090\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0010\u001a\u00020\r2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0090\u0002¢\u0006\u0004\b\u000e\u0010\u000fR&\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/modifier/BackwardsCompatLocalMap;", "Landroidx/compose/ui/modifier/ModifierLocalMap;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/modifier/ModifierLocal;", "key", "value", "", "set$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)V", SetCommand.ID, "get$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "get", "", "contains$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;)Z", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "a", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "getElement", "()Landroidx/compose/ui/modifier/ModifierLocalProvider;", "setElement", "(Landroidx/compose/ui/modifier/ModifierLocalProvider;)V", "element", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class BackwardsCompatLocalMap extends ModifierLocalMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public ModifierLocalProvider<?> element;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackwardsCompatLocalMap(@NotNull ModifierLocalProvider<?> element) {
        super(null);
        Intrinsics.checkNotNullParameter(element, "element");
        this.element = element;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean contains$ui_release(@NotNull ModifierLocal<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return key == this.element.getKey();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    @Nullable
    public <T> T get$ui_release(@NotNull ModifierLocal<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key == this.element.getKey()) {
            return (T) this.element.getValue();
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @NotNull
    public final ModifierLocalProvider<?> getElement() {
        return this.element;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    /* JADX INFO: renamed from: set$ui_release */
    public <T> void mo3647set$ui_release(@NotNull ModifierLocal<T> key, T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        throw new IllegalStateException("Set is not allowed on a backwards compat provider".toString());
    }

    public final void setElement(@NotNull ModifierLocalProvider<?> modifierLocalProvider) {
        Intrinsics.checkNotNullParameter(modifierLocalProvider, "<set-?>");
        this.element = modifierLocalProvider;
    }
}
