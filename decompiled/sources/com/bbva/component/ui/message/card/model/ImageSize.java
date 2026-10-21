package com.bbva.component.ui.message.card.model;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: MessageCardState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/component/ui/message/card/model/ImageSize;", "", "SMALL", "LARGE", "component-ui-message-card_release"}, k = 1, mv = {1, 8, 0})
public final class ImageSize {
    private static final /* synthetic */ ImageSize[] $VALUES;
    public static final ImageSize LARGE;
    public static final ImageSize SMALL;

    static {
        ImageSize imageSize = new ImageSize("SMALL", 0);
        SMALL = imageSize;
        ImageSize imageSize2 = new ImageSize("LARGE", 1);
        LARGE = imageSize2;
        $VALUES = new ImageSize[]{imageSize, imageSize2};
    }

    public ImageSize() {
        throw null;
    }

    public static ImageSize valueOf(String str) {
        return (ImageSize) Enum.valueOf(ImageSize.class, str);
    }

    public static ImageSize[] values() {
        return (ImageSize[]) $VALUES.clone();
    }
}
