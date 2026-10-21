package com.bbva.component.ui.message.card.model;

import kotlin.Metadata;
import mx.openpay.library.domain.util.Constant;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: MessageCardState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/component/ui/message/card/model/TypeMessage;", "", "MESSAGE", Constant.CARD_METHOD, "CARD_CROSS", "component-ui-message-card_release"}, k = 1, mv = {1, 8, 0})
public final class TypeMessage {
    private static final /* synthetic */ TypeMessage[] $VALUES;
    public static final TypeMessage CARD;
    public static final TypeMessage CARD_CROSS;
    public static final TypeMessage MESSAGE;

    static {
        TypeMessage typeMessage = new TypeMessage("MESSAGE", 0);
        MESSAGE = typeMessage;
        TypeMessage typeMessage2 = new TypeMessage(Constant.CARD_METHOD, 1);
        CARD = typeMessage2;
        TypeMessage typeMessage3 = new TypeMessage("CARD_CROSS", 2);
        CARD_CROSS = typeMessage3;
        $VALUES = new TypeMessage[]{typeMessage, typeMessage2, typeMessage3};
    }

    public TypeMessage() {
        throw null;
    }

    public static TypeMessage valueOf(String str) {
        return (TypeMessage) Enum.valueOf(TypeMessage.class, str);
    }

    public static TypeMessage[] values() {
        return (TypeMessage[]) $VALUES.clone();
    }
}
