package kotlin.reflect.jvm.internal.impl.incremental.components;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: LookupLocation.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class NoLookupLocation implements LookupLocation {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NoLookupLocation[] $VALUES;
    public static final NoLookupLocation FOR_ALREADY_TRACKED;
    public static final NoLookupLocation FOR_DEFAULT_IMPORTS;
    public static final NoLookupLocation FOR_NON_TRACKED_SCOPE;
    public static final NoLookupLocation FOR_SCRIPT;
    public static final NoLookupLocation FROM_BACKEND;
    public static final NoLookupLocation FROM_BUILTINS;
    public static final NoLookupLocation FROM_DESERIALIZATION;
    public static final NoLookupLocation FROM_IDE;
    public static final NoLookupLocation FROM_JAVA_LOADER;
    public static final NoLookupLocation FROM_REFLECTION;
    public static final NoLookupLocation FROM_SYNTHETIC_SCOPE;
    public static final NoLookupLocation FROM_TEST;
    public static final NoLookupLocation WHEN_CHECK_DECLARATION_CONFLICTS;
    public static final NoLookupLocation WHEN_CHECK_OVERRIDES;
    public static final NoLookupLocation WHEN_FIND_BY_FQNAME;
    public static final NoLookupLocation WHEN_GET_ALL_DESCRIPTORS;
    public static final NoLookupLocation WHEN_GET_COMPANION_OBJECT;
    public static final NoLookupLocation WHEN_GET_DECLARATION_SCOPE;
    public static final NoLookupLocation WHEN_GET_LOCAL_VARIABLE;
    public static final NoLookupLocation WHEN_GET_SUPER_MEMBERS;
    public static final NoLookupLocation WHEN_RESOLVE_DECLARATION;
    public static final NoLookupLocation WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS;
    public static final NoLookupLocation WHEN_TYPING;

    static {
        NoLookupLocation noLookupLocation = new NoLookupLocation("FROM_IDE", 0);
        FROM_IDE = noLookupLocation;
        NoLookupLocation noLookupLocation2 = new NoLookupLocation("FROM_BACKEND", 1);
        FROM_BACKEND = noLookupLocation2;
        NoLookupLocation noLookupLocation3 = new NoLookupLocation("FROM_TEST", 2);
        FROM_TEST = noLookupLocation3;
        NoLookupLocation noLookupLocation4 = new NoLookupLocation("FROM_BUILTINS", 3);
        FROM_BUILTINS = noLookupLocation4;
        NoLookupLocation noLookupLocation5 = new NoLookupLocation("WHEN_CHECK_DECLARATION_CONFLICTS", 4);
        WHEN_CHECK_DECLARATION_CONFLICTS = noLookupLocation5;
        NoLookupLocation noLookupLocation6 = new NoLookupLocation("WHEN_CHECK_OVERRIDES", 5);
        WHEN_CHECK_OVERRIDES = noLookupLocation6;
        NoLookupLocation noLookupLocation7 = new NoLookupLocation("FOR_SCRIPT", 6);
        FOR_SCRIPT = noLookupLocation7;
        NoLookupLocation noLookupLocation8 = new NoLookupLocation("FROM_REFLECTION", 7);
        FROM_REFLECTION = noLookupLocation8;
        NoLookupLocation noLookupLocation9 = new NoLookupLocation("WHEN_RESOLVE_DECLARATION", 8);
        WHEN_RESOLVE_DECLARATION = noLookupLocation9;
        NoLookupLocation noLookupLocation10 = new NoLookupLocation("WHEN_GET_DECLARATION_SCOPE", 9);
        WHEN_GET_DECLARATION_SCOPE = noLookupLocation10;
        NoLookupLocation noLookupLocation11 = new NoLookupLocation("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);
        WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS = noLookupLocation11;
        NoLookupLocation noLookupLocation12 = new NoLookupLocation("FOR_ALREADY_TRACKED", 11);
        FOR_ALREADY_TRACKED = noLookupLocation12;
        NoLookupLocation noLookupLocation13 = new NoLookupLocation("WHEN_GET_ALL_DESCRIPTORS", 12);
        WHEN_GET_ALL_DESCRIPTORS = noLookupLocation13;
        NoLookupLocation noLookupLocation14 = new NoLookupLocation("WHEN_TYPING", 13);
        WHEN_TYPING = noLookupLocation14;
        NoLookupLocation noLookupLocation15 = new NoLookupLocation("WHEN_GET_SUPER_MEMBERS", 14);
        WHEN_GET_SUPER_MEMBERS = noLookupLocation15;
        NoLookupLocation noLookupLocation16 = new NoLookupLocation("FOR_NON_TRACKED_SCOPE", 15);
        FOR_NON_TRACKED_SCOPE = noLookupLocation16;
        NoLookupLocation noLookupLocation17 = new NoLookupLocation("FROM_SYNTHETIC_SCOPE", 16);
        FROM_SYNTHETIC_SCOPE = noLookupLocation17;
        NoLookupLocation noLookupLocation18 = new NoLookupLocation("FROM_DESERIALIZATION", 17);
        FROM_DESERIALIZATION = noLookupLocation18;
        NoLookupLocation noLookupLocation19 = new NoLookupLocation("FROM_JAVA_LOADER", 18);
        FROM_JAVA_LOADER = noLookupLocation19;
        NoLookupLocation noLookupLocation20 = new NoLookupLocation("WHEN_GET_LOCAL_VARIABLE", 19);
        WHEN_GET_LOCAL_VARIABLE = noLookupLocation20;
        NoLookupLocation noLookupLocation21 = new NoLookupLocation("WHEN_FIND_BY_FQNAME", 20);
        WHEN_FIND_BY_FQNAME = noLookupLocation21;
        NoLookupLocation noLookupLocation22 = new NoLookupLocation("WHEN_GET_COMPANION_OBJECT", 21);
        WHEN_GET_COMPANION_OBJECT = noLookupLocation22;
        NoLookupLocation noLookupLocation23 = new NoLookupLocation("FOR_DEFAULT_IMPORTS", 22);
        FOR_DEFAULT_IMPORTS = noLookupLocation23;
        NoLookupLocation[] noLookupLocationArr = {noLookupLocation, noLookupLocation2, noLookupLocation3, noLookupLocation4, noLookupLocation5, noLookupLocation6, noLookupLocation7, noLookupLocation8, noLookupLocation9, noLookupLocation10, noLookupLocation11, noLookupLocation12, noLookupLocation13, noLookupLocation14, noLookupLocation15, noLookupLocation16, noLookupLocation17, noLookupLocation18, noLookupLocation19, noLookupLocation20, noLookupLocation21, noLookupLocation22, noLookupLocation23};
        $VALUES = noLookupLocationArr;
        $ENTRIES = EnumEntriesKt.enumEntries(noLookupLocationArr);
    }

    public NoLookupLocation() {
        throw null;
    }

    public static NoLookupLocation valueOf(String str) {
        return (NoLookupLocation) Enum.valueOf(NoLookupLocation.class, str);
    }

    public static NoLookupLocation[] values() {
        return (NoLookupLocation[]) $VALUES.clone();
    }

    @Override // kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation
    @Nullable
    public LocationInfo getLocation() {
        return null;
    }
}
