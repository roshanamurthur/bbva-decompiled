package com.bbva.glomohybrid.login.model.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Behavior.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/glomohybrid/login/model/enums/Behavior;", "", "PREFIX", "SUFFIX", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class Behavior {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Behavior[] $VALUES;
    public static final Behavior PREFIX;
    public static final Behavior SUFFIX;

    static {
        Behavior behavior = new Behavior("PREFIX", 0);
        PREFIX = behavior;
        Behavior behavior2 = new Behavior("SUFFIX", 1);
        SUFFIX = behavior2;
        Behavior[] behaviorArr = {behavior, behavior2};
        $VALUES = behaviorArr;
        $ENTRIES = EnumEntriesKt.enumEntries(behaviorArr);
    }

    public Behavior() {
        throw null;
    }

    @NotNull
    public static EnumEntries<Behavior> getEntries() {
        return $ENTRIES;
    }

    public static Behavior valueOf(String str) {
        return (Behavior) Enum.valueOf(Behavior.class, str);
    }

    public static Behavior[] values() {
        return (Behavior[]) $VALUES.clone();
    }
}
