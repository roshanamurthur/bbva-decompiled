package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import bk.p;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KotlinClassHeader.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nKotlinClassHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinClassHeader.kt\norg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
public final class KotlinClassHeader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Kind f80932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final JvmMetadataVersion f80933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String[] f80934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String[] f80935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String[] f80936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f80937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f80938g;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v2 kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind[], still in use, count: 1, list:
      (r11v2 kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind[]) from 0x004d: INVOKE (r11v2 kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:78)
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
    /* JADX INFO: compiled from: KotlinClassHeader.kt */
    @SourceDebugExtension({"SMAP\nKotlinClassHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinClassHeader.kt\norg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader$Kind\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,78:1\n8541#2,2:79\n8801#2,4:81\n*S KotlinDebug\n*F\n+ 1 KotlinClassHeader.kt\norg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader$Kind\n*L\n34#1:79,2\n34#1:81,4\n*E\n"})
    public static final class Kind {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);

        private static final /* synthetic */ EnumEntries $ENTRIES;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private static final Map<Integer, Kind> entryById;
        private final int id;

        /* JADX INFO: compiled from: KotlinClassHeader.kt */
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final Kind getById(int i10) {
                Kind kind = (Kind) Kind.entryById.get(Integer.valueOf(i10));
                return kind == null ? Kind.UNKNOWN : kind;
            }
        }

        static {
            $ENTRIES = EnumEntriesKt.enumEntries(new Kind[]{r0, r1, r3, r5, r7, r9});
            Kind[] kindArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(kindArrValues.length), 16));
            for (Kind kind : kindArrValues) {
                linkedHashMap.put(Integer.valueOf(kind.id), kind);
            }
            entryById = linkedHashMap;
        }

        public Kind(int i10) {
            super(str, i);
            this.id = i10;
        }

        @JvmStatic
        @NotNull
        public static final Kind getById(int i10) {
            return Companion.getById(i10);
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) $VALUES.clone();
        }
    }

    public KotlinClassHeader(@NotNull Kind kind, @NotNull JvmMetadataVersion metadataVersion, @Nullable String[] strArr, @Nullable String[] strArr2, @Nullable String[] strArr3, @Nullable String str, int i10, @Nullable String str2, @Nullable byte[] bArr) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        this.f80932a = kind;
        this.f80933b = metadataVersion;
        this.f80934c = strArr;
        this.f80935d = strArr2;
        this.f80936e = strArr3;
        this.f80937f = str;
        this.f80938g = i10;
    }

    @Nullable
    public final String[] getData() {
        return this.f80934c;
    }

    @Nullable
    public final String[] getIncompatibleData() {
        return this.f80935d;
    }

    @NotNull
    public final Kind getKind() {
        return this.f80932a;
    }

    @NotNull
    public final JvmMetadataVersion getMetadataVersion() {
        return this.f80933b;
    }

    @Nullable
    public final String getMultifileClassName() {
        if (this.f80932a == Kind.MULTIFILE_CLASS_PART) {
            return this.f80937f;
        }
        return null;
    }

    @NotNull
    public final List<String> getMultifilePartNames() {
        String[] strArr = this.f80932a == Kind.MULTIFILE_CLASS ? this.f80934c : null;
        List<String> listAsList = strArr != null ? ArraysKt___ArraysJvmKt.asList(strArr) : null;
        return listAsList == null ? CollectionsKt__CollectionsKt.emptyList() : listAsList;
    }

    @Nullable
    public final String[] getStrings() {
        return this.f80936e;
    }

    public final boolean isPreRelease() {
        return (this.f80938g & 2) != 0;
    }

    public final boolean isUnstableFirBinary() {
        int i10 = this.f80938g;
        return (i10 & 64) != 0 && (i10 & 32) == 0;
    }

    public final boolean isUnstableJvmIrBinary() {
        int i10 = this.f80938g;
        return (i10 & 16) != 0 && (i10 & 32) == 0;
    }

    @NotNull
    public String toString() {
        return this.f80932a + " version=" + this.f80933b;
    }
}
