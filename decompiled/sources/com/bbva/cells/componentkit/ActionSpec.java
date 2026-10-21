package com.bbva.cells.componentkit;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0003HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/cells/componentkit/ActionSpec;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "component1", "id", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "componentkit_release"}, k = 1, mv = {1, 6, 0})
public final /* data */ class ActionSpec<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    public ActionSpec(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
    }

    public static /* synthetic */ ActionSpec copy$default(ActionSpec actionSpec, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = actionSpec.id;
        }
        return actionSpec.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final ActionSpec<T> copy(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new ActionSpec<>(id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ActionSpec) && Intrinsics.areEqual(this.id, ((ActionSpec) other).id);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    @NotNull
    public String toString() {
        return y2.b(new StringBuilder("ActionSpec(id="), this.id, RootService.CLOSE_BRACKET);
    }
}
