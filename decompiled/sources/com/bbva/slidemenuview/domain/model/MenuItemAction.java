package com.bbva.slidemenuview.domain.model;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: MenuItemAction.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/slidemenuview/domain/model/MenuItemAction;", "", "Companion", "PAGE", "PRIVATE_PAGE", "APP", "PHONE", "CUSTOM", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class MenuItemAction {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MenuItemAction[] $VALUES;
    public static final MenuItemAction APP;
    public static final MenuItemAction CUSTOM;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final MenuItemAction PAGE;
    public static final MenuItemAction PHONE;
    public static final MenuItemAction PRIVATE_PAGE;

    /* JADX INFO: compiled from: MenuItemAction.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/slidemenuview/domain/model/MenuItemAction$Companion;", "", "()V", "from", "Lcom/bbva/slidemenuview/domain/model/MenuItemAction;", "name", "", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MenuItemAction from(@Nullable String name) {
            String lowerCase;
            if (name != null) {
                lowerCase = name.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            } else {
                lowerCase = null;
            }
            Locale locale = Locale.ROOT;
            String lowerCase2 = "PRIVATE_PAGE".toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (Intrinsics.areEqual(lowerCase, lowerCase2)) {
                return MenuItemAction.PRIVATE_PAGE;
            }
            String lowerCase3 = "APP".toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (Intrinsics.areEqual(lowerCase, lowerCase3)) {
                return MenuItemAction.APP;
            }
            String lowerCase4 = "PHONE".toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (Intrinsics.areEqual(lowerCase, lowerCase4)) {
                return MenuItemAction.PHONE;
            }
            String lowerCase5 = "CUSTOM".toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return Intrinsics.areEqual(lowerCase, lowerCase5) ? MenuItemAction.CUSTOM : MenuItemAction.PAGE;
        }
    }

    static {
        MenuItemAction menuItemAction = new MenuItemAction("PAGE", 0);
        PAGE = menuItemAction;
        MenuItemAction menuItemAction2 = new MenuItemAction("PRIVATE_PAGE", 1);
        PRIVATE_PAGE = menuItemAction2;
        MenuItemAction menuItemAction3 = new MenuItemAction("APP", 2);
        APP = menuItemAction3;
        MenuItemAction menuItemAction4 = new MenuItemAction("PHONE", 3);
        PHONE = menuItemAction4;
        MenuItemAction menuItemAction5 = new MenuItemAction("CUSTOM", 4);
        CUSTOM = menuItemAction5;
        MenuItemAction[] menuItemActionArr = {menuItemAction, menuItemAction2, menuItemAction3, menuItemAction4, menuItemAction5};
        $VALUES = menuItemActionArr;
        $ENTRIES = EnumEntriesKt.enumEntries(menuItemActionArr);
        INSTANCE = new Companion(null);
    }

    public MenuItemAction() {
        throw null;
    }

    @NotNull
    public static EnumEntries<MenuItemAction> getEntries() {
        return $ENTRIES;
    }

    public static MenuItemAction valueOf(String str) {
        return (MenuItemAction) Enum.valueOf(MenuItemAction.class, str);
    }

    public static MenuItemAction[] values() {
        return (MenuItemAction[]) $VALUES.clone();
    }
}
