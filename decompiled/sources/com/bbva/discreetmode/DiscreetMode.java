package com.bbva.discreetmode;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;
import com.bbva.discreetmode.models.DiscreetModeConfiguration;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.UUIDPreferences;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DiscreetMode.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J,\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006J\u0006\u0010\u000b\u001a\u00020\bR$\u0010\u0011\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/bbva/discreetmode/DiscreetMode;", "", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lcom/bbva/discreetmode/DiscreetMode$Type;", "type", "Lkotlin/Function1;", "Lcom/bbva/discreetmode/DiscreetMode$State;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "startMonitoring", "stopMonitoring", "<set-?>", "b", "Lcom/bbva/discreetmode/DiscreetMode$State;", "getState", "()Lcom/bbva/discreetmode/DiscreetMode$State;", "state", "Lcom/bbva/discreetmode/models/DiscreetModeConfiguration;", "configuration", "<init>", "(Lcom/bbva/discreetmode/models/DiscreetModeConfiguration;)V", "State", UUIDPreferences.TYPE_KEY, "discreetmode_release"}, k = 1, mv = {1, 5, 1})
public final class DiscreetMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DiscreetModeConfiguration f29036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public State state;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public DiscreetModeController f29038c;

    /* JADX INFO: compiled from: DiscreetMode.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\tR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/bbva/discreetmode/DiscreetMode$State;", "", "", "a", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "type", "Active", "Inactive", "Lcom/bbva/discreetmode/DiscreetMode$State$Active;", "Lcom/bbva/discreetmode/DiscreetMode$State$Inactive;", "discreetmode_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class State {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String type;

        /* JADX INFO: compiled from: DiscreetMode.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/discreetmode/DiscreetMode$State$Active;", "Lcom/bbva/discreetmode/DiscreetMode$State;", "", "component1", "type", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "b", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "discreetmode_release"}, k = 1, mv = {1, 5, 1})
        public static final /* data */ class Active extends State {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String type;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Active(@NotNull String type) {
                super(type, null);
                Intrinsics.checkNotNullParameter(type, "type");
                this.type = type;
            }

            public static /* synthetic */ Active copy$default(Active active, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = active.getType();
                }
                return active.copy(str);
            }

            @NotNull
            public final String component1() {
                return getType();
            }

            @NotNull
            public final Active copy(@NotNull String type) {
                Intrinsics.checkNotNullParameter(type, "type");
                return new Active(type);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Active) && Intrinsics.areEqual(getType(), ((Active) other).getType());
            }

            @Override // com.bbva.discreetmode.DiscreetMode.State
            @NotNull
            public String getType() {
                return this.type;
            }

            public int hashCode() {
                return getType().hashCode();
            }

            @NotNull
            public String toString() {
                return "Active(type=" + getType() + RootService.CLOSE_BRACKET;
            }
        }

        /* JADX INFO: compiled from: DiscreetMode.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/discreetmode/DiscreetMode$State$Inactive;", "Lcom/bbva/discreetmode/DiscreetMode$State;", "", "component1", "type", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "b", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "discreetmode_release"}, k = 1, mv = {1, 5, 1})
        public static final /* data */ class Inactive extends State {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String type;

            /* JADX WARN: Multi-variable type inference failed */
            public Inactive() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Inactive copy$default(Inactive inactive, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = inactive.getType();
                }
                return inactive.copy(str);
            }

            @Nullable
            public final String component1() {
                return getType();
            }

            @NotNull
            public final Inactive copy(@Nullable String type) {
                return new Inactive(type);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Inactive) && Intrinsics.areEqual(getType(), ((Inactive) other).getType());
            }

            @Override // com.bbva.discreetmode.DiscreetMode.State
            @Nullable
            public String getType() {
                return this.type;
            }

            public int hashCode() {
                if (getType() == null) {
                    return 0;
                }
                return getType().hashCode();
            }

            @NotNull
            public String toString() {
                return "Inactive(type=" + ((Object) getType()) + RootService.CLOSE_BRACKET;
            }

            public Inactive(@Nullable String str) {
                super(str, null);
                this.type = str;
            }

            public /* synthetic */ Inactive(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : str);
            }
        }

        public /* synthetic */ State(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, null);
        }

        @Nullable
        public String getType() {
            return this.type;
        }

        public State(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this.type = str;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: DiscreetMode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/discreetmode/DiscreetMode$Type;", "", "PROXIMITY", "CAMERA", "BOTH", "discreetmode_release"}, k = 1, mv = {1, 5, 1})
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type BOTH;
        public static final Type CAMERA;
        public static final Type PROXIMITY;

        static {
            Type type = new Type("PROXIMITY", 0);
            PROXIMITY = type;
            Type type2 = new Type("CAMERA", 1);
            CAMERA = type2;
            Type type3 = new Type("BOTH", 2);
            BOTH = type3;
            $VALUES = new Type[]{type, type2, type3};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return (Type) Enum.valueOf(Type.class, value);
        }

        public static Type[] values() {
            Type[] typeArr = $VALUES;
            return (Type[]) Arrays.copyOf(typeArr, typeArr.length);
        }
    }

    /* JADX INFO: compiled from: DiscreetMode.kt */
    public static final class a extends Lambda implements Function1<State, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<State, Unit> f29043q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super State, Unit> function1) {
            super(1);
            this.f29043q0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(State state) {
            State it = state;
            Intrinsics.checkNotNullParameter(it, "it");
            DiscreetMode.this.state = it;
            this.f29043q0.invoke(it);
            return Unit.INSTANCE;
        }
    }

    public DiscreetMode(@NotNull DiscreetModeConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f29036a = configuration;
        this.state = new State.Inactive(null);
    }

    @NotNull
    public final State getState() {
        return this.state;
    }

    public final void startMonitoring(@NotNull LifecycleOwner lifecycleOwner, @Nullable Type type, @NotNull Function1<? super State, Unit> listener) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(listener, "listener");
        DiscreetModeController discreetModeController = this.f29038c;
        if (type != (discreetModeController == null ? null : discreetModeController.getType())) {
            this.state = new State.Inactive(null);
            DiscreetModeController discreetModeController2 = this.f29038c;
            if (discreetModeController2 != null) {
                discreetModeController2.cancel();
            }
            DiscreetModeController discreetModeController3 = this.f29038c;
            if (discreetModeController3 != null) {
                discreetModeController3.stop();
            }
            AppCompatActivity appCompatActivity = lifecycleOwner instanceof AppCompatActivity ? (AppCompatActivity) lifecycleOwner : null;
            this.f29038c = appCompatActivity != null ? DiscreetModeControllerFactory.INSTANCE.getController$discreetmode_release(appCompatActivity, type, this.f29036a) : null;
        }
        DiscreetModeController discreetModeController4 = this.f29038c;
        if (discreetModeController4 == null) {
            return;
        }
        discreetModeController4.setCurrentState(getState());
        discreetModeController4.start(lifecycleOwner, new a(listener));
    }

    public final void stopMonitoring() {
        DiscreetModeController discreetModeController = this.f29038c;
        if (discreetModeController == null) {
            return;
        }
        discreetModeController.stop();
    }
}
