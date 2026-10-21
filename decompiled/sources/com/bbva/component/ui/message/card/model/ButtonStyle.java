package com.bbva.component.ui.message.card.model;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: MessageCardState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/ui/message/card/model/ButtonStyle;", "", "LINK", "PRIMARY", "SECONDARY", "POSITIVE", "component-ui-message-card_release"}, k = 1, mv = {1, 8, 0})
public final class ButtonStyle {
    private static final /* synthetic */ ButtonStyle[] $VALUES;
    public static final ButtonStyle LINK;
    public static final ButtonStyle POSITIVE;
    public static final ButtonStyle PRIMARY;
    public static final ButtonStyle SECONDARY;

    static {
        ButtonStyle buttonStyle = new ButtonStyle("LINK", 0);
        LINK = buttonStyle;
        ButtonStyle buttonStyle2 = new ButtonStyle("PRIMARY", 1);
        PRIMARY = buttonStyle2;
        ButtonStyle buttonStyle3 = new ButtonStyle("SECONDARY", 2);
        SECONDARY = buttonStyle3;
        ButtonStyle buttonStyle4 = new ButtonStyle("POSITIVE", 3);
        POSITIVE = buttonStyle4;
        $VALUES = new ButtonStyle[]{buttonStyle, buttonStyle2, buttonStyle3, buttonStyle4};
    }

    public ButtonStyle() {
        throw null;
    }

    public static ButtonStyle valueOf(String str) {
        return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
    }

    public static ButtonStyle[] values() {
        return (ButtonStyle[]) $VALUES.clone();
    }
}
