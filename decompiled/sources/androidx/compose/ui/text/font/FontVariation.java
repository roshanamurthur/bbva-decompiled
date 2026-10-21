package androidx.compose.ui.text.font;

import androidx.appcompat.widget.g0;
import androidx.camera.camera2.internal.compat.u;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.y2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FontVariation.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005\u0007\u001e\u001f \u001bB\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u001b\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0010J7\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0016\"\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation;", "", "", "name", "", "value", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "Setting", "italic", "Landroidx/compose/ui/unit/TextUnit;", "textSize", "opticalSizing--R2X_6o", "(J)Landroidx/compose/ui/text/font/FontVariation$Setting;", "opticalSizing", "slant", "width", "", "weight", "grade", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "style", "", "settings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "Settings-6EWAqTQ", "(Landroidx/compose/ui/text/font/FontWeight;I[Landroidx/compose/ui/text/font/FontVariation$Setting;)Landroidx/compose/ui/text/font/FontVariation$Settings;", "Settings", "<init>", "()V", "a", "b", "c", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class FontVariation {
    public static final int $stable = 0;

    @NotNull
    public static final FontVariation INSTANCE = new FontVariation();

    /* JADX INFO: compiled from: FontVariation.kt */
    @Immutable
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0003\u000e\u000f\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$Setting;", "", "Landroidx/compose/ui/unit/Density;", "density", "", "toVariationValue", "", "getNeedsDensity", "()Z", "needsDensity", "", "getAxisName", "()Ljava/lang/String;", "axisName", "Landroidx/compose/ui/text/font/FontVariation$a;", "Landroidx/compose/ui/text/font/FontVariation$b;", "Landroidx/compose/ui/text/font/FontVariation$c;", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    public interface Setting {
        @NotNull
        String getAxisName();

        boolean getNeedsDensity();

        float toVariationValue(@Nullable Density density);
    }

    /* JADX INFO: compiled from: FontVariation.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0013\"\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$Settings;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "a", "Ljava/util/List;", "getSettings", "()Ljava/util/List;", "settings", "b", "Z", "getNeedsDensity$ui_text_release", "()Z", "needsDensity", "", "<init>", "([Landroidx/compose/ui/text/font/FontVariation$Setting;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    @Immutable
    @SourceDebugExtension({"SMAP\nFontVariation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$Settings\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,372:1\n10783#2:373\n11008#2,3:374\n11011#2,3:384\n361#3,7:377\n76#4:387\n96#4,5:388\n101#5,2:393\n33#5,6:395\n103#5:401\n*S KotlinDebug\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$Settings\n*L\n52#1:373\n52#1:374,3\n52#1:384,3\n52#1:377,7\n53#1:387\n53#1:388,5\n60#1:393,2\n60#1:395,6\n60#1:401\n*E\n"})
    public static final class Settings {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ArrayList f17997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final boolean needsDensity;

        public Settings(@NotNull Setting... settings) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z10 = false;
            for (Setting setting : settings) {
                String axisName = setting.getAxisName();
                Object arrayList = linkedHashMap.get(axisName);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(axisName, arrayList);
                }
                ((List) arrayList).add(setting);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list.size() != 1) {
                    throw new IllegalArgumentException(y2.b(ci.a.d("'", str, "' must be unique. Actual [ ["), CollectionsKt___CollectionsKt.joinToString$default(list, null, null, null, 0, null, null, 63, null), AbstractJsonLexerKt.END_LIST).toString());
                }
                bk.g.addAll(arrayList2, list);
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            this.f17997a = arrayList3;
            int size = arrayList3.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((Setting) arrayList3.get(i10)).getNeedsDensity()) {
                    z10 = true;
                    break;
                }
            }
            this.needsDensity = z10;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Settings) && Intrinsics.areEqual(this.f17997a, ((Settings) other).f17997a);
        }

        /* JADX INFO: renamed from: getNeedsDensity$ui_text_release, reason: from getter */
        public final boolean getNeedsDensity() {
            return this.needsDensity;
        }

        @NotNull
        public final List<Setting> getSettings() {
            return this.f17997a;
        }

        public int hashCode() {
            return this.f17997a.hashCode();
        }
    }

    /* JADX INFO: compiled from: FontVariation.kt */
    @Immutable
    public static final class a implements Setting {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f17999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f18000b;

        public a(@NotNull String axisName, float f6) {
            Intrinsics.checkNotNullParameter(axisName, "axisName");
            this.f17999a = axisName;
            this.f18000b = f6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f17999a, aVar.f17999a) && this.f18000b == aVar.f18000b;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        @NotNull
        public final String getAxisName() {
            return this.f17999a;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public final boolean getNeedsDensity() {
            return false;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f18000b) + (this.f17999a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FontVariation.Setting(axisName='");
            sb2.append(this.f17999a);
            sb2.append("', value=");
            return u.i(sb2, this.f18000b, RootService.CLOSE_BRACKET);
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public final float toVariationValue(@Nullable Density density) {
            return this.f18000b;
        }
    }

    /* JADX INFO: compiled from: FontVariation.kt */
    @Immutable
    public static final class b implements Setting {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f18001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18002b;

        public b(@NotNull String axisName, int i10) {
            Intrinsics.checkNotNullParameter(axisName, "axisName");
            this.f18001a = axisName;
            this.f18002b = i10;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f18001a, bVar.f18001a) && this.f18002b == bVar.f18002b;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        @NotNull
        public final String getAxisName() {
            return this.f18001a;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public final boolean getNeedsDensity() {
            return false;
        }

        public final int hashCode() {
            return (this.f18001a.hashCode() * 31) + this.f18002b;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FontVariation.Setting(axisName='");
            sb2.append(this.f18001a);
            sb2.append("', value=");
            return androidx.activity.a.d(sb2, this.f18002b, RootService.CLOSE_BRACKET);
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public final float toVariationValue(@Nullable Density density) {
            return this.f18002b;
        }
    }

    /* JADX INFO: compiled from: FontVariation.kt */
    @Immutable
    @SourceDebugExtension({"SMAP\nFontVariation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$SettingTextUnit\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,372:1\n1#2:373\n*E\n"})
    public static final class c implements Setting {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f18003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f18004b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f18005c;

        public c(long j10) {
            Intrinsics.checkNotNullParameter("opsz", "axisName");
            this.f18003a = "opsz";
            this.f18004b = j10;
            this.f18005c = true;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f18003a, cVar.f18003a) && TextUnit.m4567equalsimpl0(this.f18004b, cVar.f18004b);
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        @NotNull
        public final String getAxisName() {
            return this.f18003a;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public final boolean getNeedsDensity() {
            return this.f18005c;
        }

        public final int hashCode() {
            return TextUnit.m4571hashCodeimpl(this.f18004b) + (this.f18003a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "FontVariation.Setting(axisName='" + this.f18003a + "', value=" + ((Object) TextUnit.m4577toStringimpl(this.f18004b)) + RootService.CLOSE_BRACKET;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public final float toVariationValue(@Nullable Density density) {
            if (density == null) {
                throw new IllegalArgumentException("density must not be null".toString());
            }
            return density.getFontScale() * TextUnit.m4570getValueimpl(this.f18004b);
        }
    }

    @NotNull
    public final Setting Setting(@NotNull String name, float value) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (name.length() == 4) {
            return new a(name, value);
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.a("Name must be exactly four characters. Actual: '", name, '\'').toString());
    }

    @NotNull
    /* JADX INFO: renamed from: Settings-6EWAqTQ, reason: not valid java name */
    public final Settings m4082Settings6EWAqTQ(@NotNull FontWeight weight, int style, @NotNull Setting... settings) {
        Intrinsics.checkNotNullParameter(weight, "weight");
        Intrinsics.checkNotNullParameter(settings, "settings");
        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
        spreadBuilder.add(weight(weight.getWeight()));
        spreadBuilder.add(italic(style));
        spreadBuilder.addSpread(settings);
        return new Settings((Setting[]) spreadBuilder.toArray(new Setting[spreadBuilder.size()]));
    }

    @NotNull
    public final Setting grade(int value) {
        if (-1000 > value || value >= 1001) {
            throw new IllegalArgumentException("'GRAD' must be in -1000..1000".toString());
        }
        return new b("GRAD", value);
    }

    @NotNull
    public final Setting italic(float value) {
        if (0.0f <= value && value <= 1.0f) {
            return new a("ital", value);
        }
        throw new IllegalArgumentException(("'ital' must be in 0.0f..1.0f. Actual: " + value).toString());
    }

    @NotNull
    /* JADX INFO: renamed from: opticalSizing--R2X_6o, reason: not valid java name */
    public final Setting m4083opticalSizingR2X_6o(long textSize) {
        if (TextUnit.m4573isSpimpl(textSize)) {
            return new c(textSize);
        }
        throw new IllegalArgumentException("'opsz' must be provided in sp units".toString());
    }

    @NotNull
    public final Setting slant(float value) {
        if (-90.0f <= value && value <= 90.0f) {
            return new a("slnt", value);
        }
        throw new IllegalArgumentException(("'slnt' must be in -90f..90f. Actual: " + value).toString());
    }

    @NotNull
    public final Setting weight(int value) {
        if (1 > value || value >= 1001) {
            throw new IllegalArgumentException(g0.c("'wght' value must be in [1, 1000]. Actual: ", value).toString());
        }
        return new b("wght", value);
    }

    @NotNull
    public final Setting width(float value) {
        if (value > 0.0f) {
            return new a("wdth", value);
        }
        throw new IllegalArgumentException(("'wdth' must be strictly > 0.0f. Actual: " + value).toString());
    }
}
