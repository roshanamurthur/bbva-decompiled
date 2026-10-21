package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.camera.core.impl.utils.c;
import com.bbva.plugin.localstorage.command.SetCommand;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: propertiesConventionUtil.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\npropertiesConventionUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 propertiesConventionUtil.kt\norg/jetbrains/kotlin/load/java/PropertiesConventionUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n766#2:103\n857#2,2:104\n*S KotlinDebug\n*F\n+ 1 propertiesConventionUtil.kt\norg/jetbrains/kotlin/load/java/PropertiesConventionUtilKt\n*L\n90#1:103\n90#1:104,2\n*E\n"})
public final class PropertiesConventionUtilKt {
    public static Name a(Name name, String str, String str2, int i10) {
        char cCharAt;
        boolean z10 = (i10 & 4) != 0;
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        if (!name.isSpecial()) {
            String identifier = name.getIdentifier();
            Intrinsics.checkNotNullExpressionValue(identifier, "getIdentifier(...)");
            if (l.startsWith$default(identifier, str, false, 2, null) && identifier.length() != str.length() && ('a' > (cCharAt = identifier.charAt(str.length())) || cCharAt >= '{')) {
                if (str2 != null) {
                    StringBuilder sbD = c.d(str2);
                    sbD.append(StringsKt__StringsKt.removePrefix(identifier, (CharSequence) str));
                    return Name.identifier(sbD.toString());
                }
                if (!z10) {
                    return name;
                }
                String strDecapitalizeSmartForCompiler = CapitalizeDecapitalizeKt.decapitalizeSmartForCompiler(StringsKt__StringsKt.removePrefix(identifier, (CharSequence) str), true);
                if (Name.isValidIdentifier(strDecapitalizeSmartForCompiler)) {
                    return Name.identifier(strDecapitalizeSmartForCompiler);
                }
            }
        }
        return null;
    }

    @NotNull
    public static final List<Name> getPropertyNamesCandidatesByAccessorName(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strAsString = name.asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        if (JvmAbi.isGetterName(strAsString)) {
            return CollectionsKt__CollectionsKt.listOfNotNull(propertyNameByGetMethodName(name));
        }
        return JvmAbi.isSetterName(strAsString) ? propertyNamesBySetMethodName(name) : BuiltinSpecialProperties.INSTANCE.getPropertyNameCandidatesBySpecialGetterName(name);
    }

    @Nullable
    public static final Name propertyNameByGetMethodName(@NotNull Name methodName) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Name nameA = a(methodName, "get", null, 12);
        return nameA == null ? a(methodName, "is", null, 8) : nameA;
    }

    @Nullable
    public static final Name propertyNameBySetMethodName(@NotNull Name methodName, boolean z10) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        return a(methodName, SetCommand.ID, z10 ? "is" : null, 4);
    }

    @NotNull
    public static final List<Name> propertyNamesBySetMethodName(@NotNull Name methodName) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        return CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new Name[]{propertyNameBySetMethodName(methodName, false), propertyNameBySetMethodName(methodName, true)});
    }
}
