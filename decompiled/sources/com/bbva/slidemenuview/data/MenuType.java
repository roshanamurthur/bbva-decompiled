package com.bbva.slidemenuview.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 com.bbva.slidemenuview.data.MenuType[], still in use, count: 1, list:
  (r4v3 com.bbva.slidemenuview.data.MenuType[]) from 0x002f: INVOKE (r4v3 com.bbva.slidemenuview.data.MenuType[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:48)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: MenuType.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/slidemenuview/data/MenuType;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "PUBLIC", "CACHED", "PRIVATE", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class MenuType {
    PUBLIC(MenuItemStatesBuilder.USER_NO),
    CACHED(MenuItemStatesBuilder.USER_CACHED),
    PRIVATE(MenuItemStatesBuilder.USER_LOGGED);

    private static final /* synthetic */ EnumEntries $ENTRIES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String value;

    /* JADX INFO: compiled from: MenuType.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/slidemenuview/data/MenuType$Companion;", "", "()V", "fromValue", "Lcom/bbva/slidemenuview/data/MenuType;", "value", "", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nMenuType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuType.kt\ncom/bbva/slidemenuview/data/MenuType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,14:1\n1#2:15\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0020 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0021  */
        @NotNull
        public final MenuType fromValue(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            for (MenuType menuType : MenuType.values()) {
                if (Intrinsics.areEqual(menuType.getValue(), value)) {
                    if (menuType != null) {
                        return menuType;
                    }
                    throw new IllegalArgumentException();
                }
            }
            menuType = null;
            if (menuType != null) {
                return menuType;
            }
            throw new IllegalArgumentException();
        }
    }

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(new MenuType[]{r0, r1, r2});
    }

    public MenuType(String str) {
        super(str, i);
        this.value = str;
    }

    @NotNull
    public static EnumEntries<MenuType> getEntries() {
        return $ENTRIES;
    }

    public static MenuType valueOf(String str) {
        return (MenuType) Enum.valueOf(MenuType.class, str);
    }

    public static MenuType[] values() {
        return (MenuType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
