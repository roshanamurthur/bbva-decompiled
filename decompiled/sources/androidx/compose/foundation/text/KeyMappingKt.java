package androidx.compose.foundation.text;

import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KeyMapping.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000ø\u0001\u0000\"\u001a\u0010\n\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "shortcutModifier", "Landroidx/compose/foundation/text/KeyMapping;", "commonKeyMapping", "a", "Landroidx/compose/foundation/text/KeyMapping;", "getDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "defaultKeyMapping", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class KeyMappingKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final KeyMappingKt$defaultKeyMapping$2$1 f5904a;

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1] */
    static {
        final KeyMapping keyMappingCommonKeyMapping = commonKeyMapping(new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.KeyMappingKt.a
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            @Nullable
            public final Object get(@Nullable Object obj) {
                return Boolean.valueOf(KeyEvent_androidKt.m3370isCtrlPressedZmokQxo(((KeyEvent) obj).m3355unboximpl()));
            }
        });
        f5904a = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            @Nullable
            /* JADX INFO: renamed from: map-ZmokQxo */
            public KeyCommand mo501mapZmokQxo(@NotNull android.view.KeyEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m3372isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m3370isCtrlPressedZmokQxo(event)) {
                    long jM3366getKeyZmokQxo = KeyEvent_androidKt.m3366getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo, mappedKeys.m517getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo, mappedKeys.m518getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo, mappedKeys.m519getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo, mappedKeys.m516getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m3370isCtrlPressedZmokQxo(event)) {
                    long jM3366getKeyZmokQxo2 = KeyEvent_androidKt.m3366getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo2, mappedKeys2.m517getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo2, mappedKeys2.m518getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo2, mappedKeys2.m519getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo2, mappedKeys2.m516getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo2, mappedKeys2.m521getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo2, mappedKeys2.m515getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo2, mappedKeys2.m511getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo2, mappedKeys2.m510getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m3372isShiftPressedZmokQxo(event)) {
                    long jM3366getKeyZmokQxo3 = KeyEvent_androidKt.m3366getKeyZmokQxo(event);
                    MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                    if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo3, mappedKeys3.m524getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_LEFT;
                    } else if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo3, mappedKeys3.m523getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                    }
                } else if (KeyEvent_androidKt.m3369isAltPressedZmokQxo(event)) {
                    long jM3366getKeyZmokQxo4 = KeyEvent_androidKt.m3366getKeyZmokQxo(event);
                    MappedKeys mappedKeys4 = MappedKeys.INSTANCE;
                    if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo4, mappedKeys4.m511getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                    } else if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo4, mappedKeys4.m515getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_TO_LINE_END;
                    }
                }
                return keyCommand == null ? keyMappingCommonKeyMapping.mo501mapZmokQxo(event) : keyCommand;
            }
        };
    }

    @NotNull
    public static final KeyMapping commonKeyMapping(@NotNull final Function1<? super KeyEvent, Boolean> shortcutModifier) {
        Intrinsics.checkNotNullParameter(shortcutModifier, "shortcutModifier");
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt.commonKeyMapping.1
            @Override // androidx.compose.foundation.text.KeyMapping
            @Nullable
            /* JADX INFO: renamed from: map-ZmokQxo */
            public KeyCommand mo501mapZmokQxo(@NotNull android.view.KeyEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                KeyEvent keyEventM3349boximpl = KeyEvent.m3349boximpl(event);
                Function1<KeyEvent, Boolean> function1 = shortcutModifier;
                if (function1.invoke(keyEventM3349boximpl).booleanValue() && KeyEvent_androidKt.m3372isShiftPressedZmokQxo(event)) {
                    if (Key.m3058equalsimpl0(KeyEvent_androidKt.m3366getKeyZmokQxo(event), MappedKeys.INSTANCE.m532getZEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    return null;
                }
                if (function1.invoke(KeyEvent.m3349boximpl(event)).booleanValue()) {
                    long jM3366getKeyZmokQxo = KeyEvent_androidKt.m3366getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo, mappedKeys.m512getCEK5gGoQ()) || Key.m3058equalsimpl0(jM3366getKeyZmokQxo, mappedKeys.m522getInsertEK5gGoQ())) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo, mappedKeys.m529getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo, mappedKeys.m530getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo, mappedKeys.m509getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo, mappedKeys.m531getYEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo, mappedKeys.m532getZEK5gGoQ())) {
                        return KeyCommand.UNDO;
                    }
                    return null;
                }
                if (KeyEvent_androidKt.m3370isCtrlPressedZmokQxo(event)) {
                    return null;
                }
                if (KeyEvent_androidKt.m3372isShiftPressedZmokQxo(event)) {
                    long jM3366getKeyZmokQxo2 = KeyEvent_androidKt.m3366getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo2, mappedKeys2.m517getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo2, mappedKeys2.m518getDirectionRightEK5gGoQ())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo2, mappedKeys2.m519getDirectionUpEK5gGoQ())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo2, mappedKeys2.m516getDirectionDownEK5gGoQ())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo2, mappedKeys2.m526getPageUpEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo2, mappedKeys2.m525getPageDownEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo2, mappedKeys2.m524getMoveHomeEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo2, mappedKeys2.m523getMoveEndEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo2, mappedKeys2.m522getInsertEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    return null;
                }
                long jM3366getKeyZmokQxo3 = KeyEvent_androidKt.m3366getKeyZmokQxo(event);
                MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo3, mappedKeys3.m517getDirectionLeftEK5gGoQ())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo3, mappedKeys3.m518getDirectionRightEK5gGoQ())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo3, mappedKeys3.m519getDirectionUpEK5gGoQ())) {
                    return KeyCommand.UP;
                }
                if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo3, mappedKeys3.m516getDirectionDownEK5gGoQ())) {
                    return KeyCommand.DOWN;
                }
                if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo3, mappedKeys3.m526getPageUpEK5gGoQ())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo3, mappedKeys3.m525getPageDownEK5gGoQ())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo3, mappedKeys3.m524getMoveHomeEK5gGoQ())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo3, mappedKeys3.m523getMoveEndEK5gGoQ())) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo3, mappedKeys3.m520getEnterEK5gGoQ())) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo3, mappedKeys3.m511getBackspaceEK5gGoQ())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo3, mappedKeys3.m515getDeleteEK5gGoQ())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo3, mappedKeys3.m527getPasteEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo3, mappedKeys3.m514getCutEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo3, mappedKeys3.m513getCopyEK5gGoQ())) {
                    return KeyCommand.COPY;
                }
                if (Key.m3058equalsimpl0(jM3366getKeyZmokQxo3, mappedKeys3.m528getTabEK5gGoQ())) {
                    return KeyCommand.TAB;
                }
                return null;
            }
        };
    }

    @NotNull
    public static final KeyMapping getDefaultKeyMapping() {
        return f5904a;
    }
}
