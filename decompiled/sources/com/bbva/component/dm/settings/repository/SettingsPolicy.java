package com.bbva.component.dm.settings.repository;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: SettingsPolicy.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/component/dm/settings/repository/SettingsPolicy;", "", "Local", "Remote", "LocalFirst", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final class SettingsPolicy {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SettingsPolicy[] $VALUES;
    public static final SettingsPolicy Local;
    public static final SettingsPolicy LocalFirst;
    public static final SettingsPolicy Remote;

    static {
        SettingsPolicy settingsPolicy = new SettingsPolicy("Local", 0);
        Local = settingsPolicy;
        SettingsPolicy settingsPolicy2 = new SettingsPolicy("Remote", 1);
        Remote = settingsPolicy2;
        SettingsPolicy settingsPolicy3 = new SettingsPolicy("LocalFirst", 2);
        LocalFirst = settingsPolicy3;
        SettingsPolicy[] settingsPolicyArr = {settingsPolicy, settingsPolicy2, settingsPolicy3};
        $VALUES = settingsPolicyArr;
        $ENTRIES = EnumEntriesKt.enumEntries(settingsPolicyArr);
    }

    public SettingsPolicy() {
        throw null;
    }

    @NotNull
    public static EnumEntries<SettingsPolicy> getEntries() {
        return $ENTRIES;
    }

    public static SettingsPolicy valueOf(String str) {
        return (SettingsPolicy) Enum.valueOf(SettingsPolicy.class, str);
    }

    public static SettingsPolicy[] values() {
        return (SettingsPolicy[]) $VALUES.clone();
    }
}
