package com.bbva.discreetmode.plugin.commands.models;

import androidx.annotation.Keep;
import androidx.datastore.preferences.protobuf.e;
import bk.p;
import bk.q;
import com.bbva.androidtoolkit.plugin.postmessage.PayloadDTO;
import com.bbva.discreetmode.DiscreetMode;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DiscreetModeStateDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÂ\u0003J\u001f\u0010\b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bbva/discreetmode/plugin/commands/models/DiscreetModeStateDTO;", "Lcom/bbva/androidtoolkit/plugin/postmessage/PayloadDTO;", "value", "", "", "", "(Ljava/util/Map;)V", "component1", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Companion", "discreetmode-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class DiscreetModeStateDTO extends PayloadDTO {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String action = "enableDiscreetMode";

    @NotNull
    public static final String type = "discreetModeType";

    @NotNull
    private final Map<String, Object> value;

    /* JADX INFO: compiled from: DiscreetModeStateDTO.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bbva/discreetmode/plugin/commands/models/DiscreetModeStateDTO$Companion;", "", "()V", "action", "", "type", "create", "Lcom/bbva/discreetmode/plugin/commands/models/DiscreetModeStateDTO;", "state", "Lcom/bbva/discreetmode/DiscreetMode$State;", "discreetmode-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DiscreetModeStateDTO create(@NotNull DiscreetMode.State state) {
            Intrinsics.checkNotNullParameter(state, "state");
            boolean z10 = state instanceof DiscreetMode.State.Active;
            String type = state.getType();
            Map mapMapOf = type == null ? null : q.mapOf(TuplesKt.to(DiscreetModeStateDTO.action, Boolean.valueOf(z10)), TuplesKt.to(DiscreetModeStateDTO.type, type));
            if (mapMapOf == null) {
                mapMapOf = p.mapOf(TuplesKt.to(DiscreetModeStateDTO.action, Boolean.valueOf(z10)));
            }
            return new DiscreetModeStateDTO(mapMapOf);
        }
    }

    public DiscreetModeStateDTO(@NotNull Map<String, ? extends Object> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    private final Map<String, Object> component1() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DiscreetModeStateDTO copy$default(DiscreetModeStateDTO discreetModeStateDTO, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = discreetModeStateDTO.value;
        }
        return discreetModeStateDTO.copy(map);
    }

    @NotNull
    public final DiscreetModeStateDTO copy(@NotNull Map<String, ? extends Object> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new DiscreetModeStateDTO(value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DiscreetModeStateDTO) && Intrinsics.areEqual(this.value, ((DiscreetModeStateDTO) other).value);
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    @NotNull
    public String toString() {
        return e.g(new StringBuilder("DiscreetModeStateDTO(value="), this.value, RootService.CLOSE_BRACKET);
    }
}
