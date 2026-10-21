package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.processing.f;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.text.Typography;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JvmNameResolverBase.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nJvmNameResolverBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmNameResolverBase.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/JvmNameResolverBase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n1208#2,2:107\n1238#2,4:109\n*S KotlinDebug\n*F\n+ 1 JvmNameResolverBase.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/JvmNameResolverBase\n*L\n101#1:107,2\n101#1:109,4\n*E\n"})
public class JvmNameResolverBase implements NameResolver {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final List<String> f81316d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String[] f81317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Set<Integer> f81318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<JvmProtoBuf.StringTableTypes.Record> f81319c;

    /* JADX INFO: compiled from: JvmNameResolverBase.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: JvmNameResolverBase.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JvmProtoBuf.StringTableTypes.Record.Operation.values().length];
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new Character[]{'k', 'o', 't', 'l', 'i', 'n'}), "", null, null, 0, null, null, 62, null);
        List<String> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{u.f(strJoinToString$default, "/Any"), u.f(strJoinToString$default, "/Nothing"), u.f(strJoinToString$default, "/Unit"), u.f(strJoinToString$default, "/Throwable"), u.f(strJoinToString$default, "/Number"), u.f(strJoinToString$default, "/Byte"), u.f(strJoinToString$default, "/Double"), u.f(strJoinToString$default, "/Float"), u.f(strJoinToString$default, "/Int"), u.f(strJoinToString$default, "/Long"), u.f(strJoinToString$default, "/Short"), u.f(strJoinToString$default, "/Boolean"), u.f(strJoinToString$default, "/Char"), u.f(strJoinToString$default, "/CharSequence"), u.f(strJoinToString$default, "/String"), u.f(strJoinToString$default, "/Comparable"), u.f(strJoinToString$default, "/Enum"), u.f(strJoinToString$default, "/Array"), u.f(strJoinToString$default, "/ByteArray"), u.f(strJoinToString$default, "/DoubleArray"), u.f(strJoinToString$default, "/FloatArray"), u.f(strJoinToString$default, "/IntArray"), u.f(strJoinToString$default, "/LongArray"), u.f(strJoinToString$default, "/ShortArray"), u.f(strJoinToString$default, "/BooleanArray"), u.f(strJoinToString$default, "/CharArray"), u.f(strJoinToString$default, "/Cloneable"), u.f(strJoinToString$default, "/Annotation"), u.f(strJoinToString$default, "/collections/Iterable"), u.f(strJoinToString$default, "/collections/MutableIterable"), u.f(strJoinToString$default, "/collections/Collection"), u.f(strJoinToString$default, "/collections/MutableCollection"), u.f(strJoinToString$default, "/collections/List"), u.f(strJoinToString$default, "/collections/MutableList"), u.f(strJoinToString$default, "/collections/Set"), u.f(strJoinToString$default, "/collections/MutableSet"), u.f(strJoinToString$default, "/collections/Map"), u.f(strJoinToString$default, "/collections/MutableMap"), u.f(strJoinToString$default, "/collections/Map.Entry"), u.f(strJoinToString$default, "/collections/MutableMap.MutableEntry"), u.f(strJoinToString$default, "/collections/Iterator"), u.f(strJoinToString$default, "/collections/MutableIterator"), u.f(strJoinToString$default, "/collections/ListIterator"), u.f(strJoinToString$default, "/collections/MutableListIterator")});
        f81316d = listListOf;
        Iterable<IndexedValue> iterableWithIndex = CollectionsKt___CollectionsKt.withIndex(listListOf);
        LinkedHashMap linkedHashMap = new LinkedHashMap(f.a(iterableWithIndex, 10, 16));
        for (IndexedValue indexedValue : iterableWithIndex) {
            linkedHashMap.put((String) indexedValue.getValue(), Integer.valueOf(indexedValue.getIndex()));
        }
    }

    public JvmNameResolverBase(@NotNull String[] strings, @NotNull Set<Integer> localNameIndices, @NotNull List<JvmProtoBuf.StringTableTypes.Record> records) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(localNameIndices, "localNameIndices");
        Intrinsics.checkNotNullParameter(records, "records");
        this.f81317a = strings;
        this.f81318b = localNameIndices;
        this.f81319c = records;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    public String getQualifiedClassName(int i10) {
        return getString(i10);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    public String getString(int i10) {
        String strSubstring;
        JvmProtoBuf.StringTableTypes.Record record = this.f81319c.get(i10);
        if (record.hasString()) {
            strSubstring = record.getString();
        } else if (record.hasPredefinedIndex()) {
            List<String> list = f81316d;
            int size = list.size();
            int predefinedIndex = record.getPredefinedIndex();
            if (predefinedIndex < 0 || predefinedIndex >= size) {
                strSubstring = this.f81317a[i10];
            } else {
                strSubstring = list.get(record.getPredefinedIndex());
            }
        } else {
            strSubstring = this.f81317a[i10];
        }
        if (record.getSubstringIndexCount() >= 2) {
            List<Integer> substringIndexList = record.getSubstringIndexList();
            Intrinsics.checkNotNull(substringIndexList);
            Integer num = substringIndexList.get(0);
            Integer num2 = substringIndexList.get(1);
            Intrinsics.checkNotNull(num);
            if (num.intValue() >= 0) {
                int iIntValue = num.intValue();
                Intrinsics.checkNotNull(num2);
                if (iIntValue <= num2.intValue() && num2.intValue() <= strSubstring.length()) {
                    Intrinsics.checkNotNull(strSubstring);
                    strSubstring = strSubstring.substring(num.intValue(), num2.intValue());
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                }
            }
        }
        String strReplace$default = strSubstring;
        if (record.getReplaceCharCount() >= 2) {
            List<Integer> replaceCharList = record.getReplaceCharList();
            Intrinsics.checkNotNull(replaceCharList);
            Integer num3 = replaceCharList.get(0);
            Integer num4 = replaceCharList.get(1);
            Intrinsics.checkNotNull(strReplace$default);
            strReplace$default = l.replace$default(strReplace$default, (char) num3.intValue(), (char) num4.intValue(), false, 4, (Object) null);
        }
        String strReplace$default2 = strReplace$default;
        JvmProtoBuf.StringTableTypes.Record.Operation operation = record.getOperation();
        if (operation == null) {
            operation = JvmProtoBuf.StringTableTypes.Record.Operation.NONE;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[operation.ordinal()];
        if (i11 == 2) {
            Intrinsics.checkNotNull(strReplace$default2);
            strReplace$default2 = l.replace$default(strReplace$default2, Typography.dollar, '.', false, 4, (Object) null);
        } else if (i11 == 3) {
            if (strReplace$default2.length() >= 2) {
                Intrinsics.checkNotNull(strReplace$default2);
                strReplace$default2 = strReplace$default2.substring(1, strReplace$default2.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strReplace$default2, "substring(...)");
            }
            String str = strReplace$default2;
            Intrinsics.checkNotNull(str);
            strReplace$default2 = l.replace$default(str, Typography.dollar, '.', false, 4, (Object) null);
        }
        Intrinsics.checkNotNull(strReplace$default2);
        return strReplace$default2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public boolean isLocalClassName(int i10) {
        return this.f81318b.contains(Integer.valueOf(i10));
    }
}
