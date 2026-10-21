package com.bbva.component.ui.modal.halfmodal;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HalfModalContract.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/bbva/component/ui/modal/halfmodal/HalfModalContract;", "", "()V", "ButtonType", "RadioButtonType", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HalfModalContract {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: HalfModalContract.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/component/ui/modal/halfmodal/HalfModalContract$ButtonType;", "", "PRIMARY", "SECONDARY", "CLOSE", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0})
    public static final class ButtonType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ButtonType[] $VALUES;
        public static final ButtonType CLOSE;
        public static final ButtonType PRIMARY;
        public static final ButtonType SECONDARY;

        static {
            ButtonType buttonType = new ButtonType("PRIMARY", 0);
            PRIMARY = buttonType;
            ButtonType buttonType2 = new ButtonType("SECONDARY", 1);
            SECONDARY = buttonType2;
            ButtonType buttonType3 = new ButtonType("CLOSE", 2);
            CLOSE = buttonType3;
            ButtonType[] buttonTypeArr = {buttonType, buttonType2, buttonType3};
            $VALUES = buttonTypeArr;
            $ENTRIES = EnumEntriesKt.enumEntries(buttonTypeArr);
        }

        public ButtonType() {
            throw null;
        }

        @NotNull
        public static EnumEntries<ButtonType> getEntries() {
            return $ENTRIES;
        }

        public static ButtonType valueOf(String str) {
            return (ButtonType) Enum.valueOf(ButtonType.class, str);
        }

        public static ButtonType[] values() {
            return (ButtonType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: HalfModalContract.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/component/ui/modal/halfmodal/HalfModalContract$RadioButtonType;", "", "FEMALE", "MALE", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0})
    public static final class RadioButtonType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RadioButtonType[] $VALUES;
        public static final RadioButtonType FEMALE;
        public static final RadioButtonType MALE;

        static {
            RadioButtonType radioButtonType = new RadioButtonType("FEMALE", 0);
            FEMALE = radioButtonType;
            RadioButtonType radioButtonType2 = new RadioButtonType("MALE", 1);
            MALE = radioButtonType2;
            RadioButtonType[] radioButtonTypeArr = {radioButtonType, radioButtonType2};
            $VALUES = radioButtonTypeArr;
            $ENTRIES = EnumEntriesKt.enumEntries(radioButtonTypeArr);
        }

        public RadioButtonType() {
            throw null;
        }

        @NotNull
        public static EnumEntries<RadioButtonType> getEntries() {
            return $ENTRIES;
        }

        public static RadioButtonType valueOf(String str) {
            return (RadioButtonType) Enum.valueOf(RadioButtonType.class, str);
        }

        public static RadioButtonType[] values() {
            return (RadioButtonType[]) $VALUES.clone();
        }
    }
}
