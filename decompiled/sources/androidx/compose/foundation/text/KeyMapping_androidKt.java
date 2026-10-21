package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KeyMapping.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/KeyMapping;", "a", "Landroidx/compose/foundation/text/KeyMapping;", "getPlatformDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "platformDefaultKeyMapping", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class KeyMapping_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final KeyMapping_androidKt$platformDefaultKeyMapping$1 f5908a = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMapping_androidKt$platformDefaultKeyMapping$1
        @Override // androidx.compose.foundation.text.KeyMapping
        @Nullable
        /* JADX INFO: renamed from: map-ZmokQxo */
        public KeyCommand mo501mapZmokQxo(@NotNull KeyEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            KeyCommand keyCommand = null;
            if (KeyEvent_androidKt.m3372isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m3369isAltPressedZmokQxo(event)) {
                long jM3366getKeyZmokQxo = KeyEvent_androidKt.m3366getKeyZmokQxo(event);
                MappedKeys mappedKeys = MappedKeys.INSTANCE;
                if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo, mappedKeys.m517getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_LEFT;
                } else if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo, mappedKeys.m518getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                } else if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo, mappedKeys.m519getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_HOME;
                } else if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo, mappedKeys.m516getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_END;
                }
            } else if (KeyEvent_androidKt.m3369isAltPressedZmokQxo(event)) {
                long jM3366getKeyZmokQxo2 = KeyEvent_androidKt.m3366getKeyZmokQxo(event);
                MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo2, mappedKeys2.m517getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_LEFT;
                } else if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo2, mappedKeys2.m518getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_RIGHT;
                } else if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo2, mappedKeys2.m519getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.HOME;
                } else if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo2, mappedKeys2.m516getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.END;
                }
            }
            return keyCommand == null ? KeyMappingKt.getDefaultKeyMapping().mo501mapZmokQxo(event) : keyCommand;
        }
    };

    @NotNull
    public static final KeyMapping getPlatformDefaultKeyMapping() {
        return f5908a;
    }
}
