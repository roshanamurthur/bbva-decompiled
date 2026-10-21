package androidx.room;

import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.tohu.android.product.valkyria.sdk.export.constants.PaymentStatus;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;

/* JADX INFO: compiled from: BuiltInTypeConverters.kt */
/* JADX INFO: loaded from: classes2.dex */
@Target({})
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u001e\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003R\u000f\u0010\u0005\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0006R\u000f\u0010\u0004\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/room/BuiltInTypeConverters;", "", "enums", "Landroidx/room/BuiltInTypeConverters$State;", EventDataKeys.Audience.UUID, "byteBuffer", "()Landroidx/room/BuiltInTypeConverters$State;", "State", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
public @interface BuiltInTypeConverters {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: BuiltInTypeConverters.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/BuiltInTypeConverters$State;", "", PaymentStatus.ENABLED, "DISABLED", "INHERITED", "room-common"}, k = 1, mv = {1, 8, 0})
    public static final class State {
        private static final /* synthetic */ State[] $VALUES;
        public static final State DISABLED;
        public static final State ENABLED;
        public static final State INHERITED;

        static {
            State state = new State(PaymentStatus.ENABLED, 0);
            ENABLED = state;
            State state2 = new State("DISABLED", 1);
            DISABLED = state2;
            State state3 = new State("INHERITED", 2);
            INHERITED = state3;
            $VALUES = new State[]{state, state2, state3};
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    State byteBuffer() default State.INHERITED;

    State enums() default State.INHERITED;

    State uuid() default State.INHERITED;
}
