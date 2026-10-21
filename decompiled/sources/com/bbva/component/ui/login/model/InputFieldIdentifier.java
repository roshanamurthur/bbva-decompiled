package com.bbva.component.ui.login.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: InputFieldData.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/component/ui/login/model/InputFieldIdentifier;", "", "USER", "PASSWORD", "DOCUMENT", "DOCUMENT_TYPE", "PHONE", "DEVICE_ID", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
public final class InputFieldIdentifier {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InputFieldIdentifier[] $VALUES;
    public static final InputFieldIdentifier DEVICE_ID;
    public static final InputFieldIdentifier DOCUMENT;
    public static final InputFieldIdentifier DOCUMENT_TYPE;
    public static final InputFieldIdentifier PASSWORD;
    public static final InputFieldIdentifier PHONE;
    public static final InputFieldIdentifier USER;

    static {
        InputFieldIdentifier inputFieldIdentifier = new InputFieldIdentifier("USER", 0);
        USER = inputFieldIdentifier;
        InputFieldIdentifier inputFieldIdentifier2 = new InputFieldIdentifier("PASSWORD", 1);
        PASSWORD = inputFieldIdentifier2;
        InputFieldIdentifier inputFieldIdentifier3 = new InputFieldIdentifier("DOCUMENT", 2);
        DOCUMENT = inputFieldIdentifier3;
        InputFieldIdentifier inputFieldIdentifier4 = new InputFieldIdentifier("DOCUMENT_TYPE", 3);
        DOCUMENT_TYPE = inputFieldIdentifier4;
        InputFieldIdentifier inputFieldIdentifier5 = new InputFieldIdentifier("PHONE", 4);
        PHONE = inputFieldIdentifier5;
        InputFieldIdentifier inputFieldIdentifier6 = new InputFieldIdentifier("DEVICE_ID", 5);
        DEVICE_ID = inputFieldIdentifier6;
        InputFieldIdentifier[] inputFieldIdentifierArr = {inputFieldIdentifier, inputFieldIdentifier2, inputFieldIdentifier3, inputFieldIdentifier4, inputFieldIdentifier5, inputFieldIdentifier6};
        $VALUES = inputFieldIdentifierArr;
        $ENTRIES = EnumEntriesKt.enumEntries(inputFieldIdentifierArr);
    }

    public InputFieldIdentifier() {
        throw null;
    }

    @NotNull
    public static EnumEntries<InputFieldIdentifier> getEntries() {
        return $ENTRIES;
    }

    public static InputFieldIdentifier valueOf(String str) {
        return (InputFieldIdentifier) Enum.valueOf(InputFieldIdentifier.class, str);
    }

    public static InputFieldIdentifier[] values() {
        return (InputFieldIdentifier[]) $VALUES.clone();
    }
}
