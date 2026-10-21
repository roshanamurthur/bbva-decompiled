package net.ipsoft.amelia.sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class ContentDisplayOption {
    private static final /* synthetic */ ContentDisplayOption[] $VALUES;
    public static final ContentDisplayOption ATTACHMENT;
    public static final ContentDisplayOption INLINE_AND_POPUP;
    public static final ContentDisplayOption INLINE_ONLY;
    public static final ContentDisplayOption NO_PREVIEW;
    public static final ContentDisplayOption POPUP_AND_INLINE;
    public static final ContentDisplayOption POPUP_ONLY;

    static {
        ContentDisplayOption contentDisplayOption = new ContentDisplayOption("NO_PREVIEW", 0);
        NO_PREVIEW = contentDisplayOption;
        ContentDisplayOption contentDisplayOption2 = new ContentDisplayOption("INLINE_ONLY", 1);
        INLINE_ONLY = contentDisplayOption2;
        ContentDisplayOption contentDisplayOption3 = new ContentDisplayOption("POPUP_AND_INLINE", 2);
        POPUP_AND_INLINE = contentDisplayOption3;
        ContentDisplayOption contentDisplayOption4 = new ContentDisplayOption("INLINE_AND_POPUP", 3);
        INLINE_AND_POPUP = contentDisplayOption4;
        ContentDisplayOption contentDisplayOption5 = new ContentDisplayOption("POPUP_ONLY", 4);
        POPUP_ONLY = contentDisplayOption5;
        ContentDisplayOption contentDisplayOption6 = new ContentDisplayOption("ATTACHMENT", 5);
        ATTACHMENT = contentDisplayOption6;
        $VALUES = new ContentDisplayOption[]{contentDisplayOption, contentDisplayOption2, contentDisplayOption3, contentDisplayOption4, contentDisplayOption5, contentDisplayOption6};
    }

    public ContentDisplayOption() {
        throw null;
    }

    public static ContentDisplayOption valueOf(String str) {
        return (ContentDisplayOption) Enum.valueOf(ContentDisplayOption.class, str);
    }

    public static ContentDisplayOption[] values() {
        return (ContentDisplayOption[]) $VALUES.clone();
    }
}
