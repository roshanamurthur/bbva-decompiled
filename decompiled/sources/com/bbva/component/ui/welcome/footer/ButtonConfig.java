package com.bbva.component.ui.welcome.footer;

import androidx.appcompat.app.i;
import bk.o;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ButtonConfig.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u001d\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u0005\u001a\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0003HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R3\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/bbva/component/ui/welcome/footer/ButtonConfig;", "", "", "", "map", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/util/Map;", "getTitle", "()Ljava/util/Map;", "title", "b", "Ljava/lang/String;", "getRoute", "()Ljava/lang/String;", "route", "Lcom/bbva/component/ui/welcome/footer/ButtonConfig$Visibility;", "c", "Lcom/bbva/component/ui/welcome/footer/ButtonConfig$Visibility;", "getVisibility", "()Lcom/bbva/component/ui/welcome/footer/ButtonConfig$Visibility;", "visibility", "<init>", "(Ljava/util/Map;)V", "Visibility", "component-ui-welcome_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class ButtonConfig {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f28777e = {i.d(ButtonConfig.class, "title", "getTitle()Ljava/util/Map;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String route;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Visibility visibility;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, Object> f28781d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: ButtonConfig.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/component/ui/welcome/footer/ButtonConfig$Visibility;", "", "VISIBLE", "INVISIBLE", "GONE", "component-ui-welcome_release"}, k = 1, mv = {1, 4, 0})
    public static final class Visibility {
        private static final /* synthetic */ Visibility[] $VALUES;
        public static final Visibility GONE;
        public static final Visibility INVISIBLE;
        public static final Visibility VISIBLE;

        static {
            Visibility visibility = new Visibility("VISIBLE", 0);
            VISIBLE = visibility;
            Visibility visibility2 = new Visibility("INVISIBLE", 1);
            INVISIBLE = visibility2;
            Visibility visibility3 = new Visibility("GONE", 2);
            GONE = visibility3;
            $VALUES = new Visibility[]{visibility, visibility2, visibility3};
        }

        public Visibility() {
            throw null;
        }

        public static Visibility valueOf(String str) {
            return (Visibility) Enum.valueOf(Visibility.class, str);
        }

        public static Visibility[] values() {
            return (Visibility[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    public ButtonConfig(@NotNull Map<String, ? extends Object> map) {
        Visibility visibility;
        Intrinsics.checkNotNullParameter(map, "map");
        this.f28781d = map;
        this.title = map;
        this.route = (String) map.get("route");
        Object obj = map.get("visibility");
        Map map2 = (Map) (obj instanceof Map ? obj : null);
        String str = map2 != null ? (String) map2.get("value") : null;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1901805651) {
                if (iHashCode == 3178655 && str.equals("gone")) {
                    visibility = Visibility.GONE;
                } else {
                    visibility = Visibility.VISIBLE;
                }
            } else if (str.equals("invisible")) {
                visibility = Visibility.INVISIBLE;
            } else {
                visibility = Visibility.VISIBLE;
            }
        } else {
            visibility = Visibility.VISIBLE;
        }
        this.visibility = visibility;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ButtonConfig copy$default(ButtonConfig buttonConfig, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = buttonConfig.f28781d;
        }
        return buttonConfig.copy(map);
    }

    @NotNull
    public final ButtonConfig copy(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return new ButtonConfig(map);
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            return (other instanceof ButtonConfig) && Intrinsics.areEqual(this.f28781d, ((ButtonConfig) other).f28781d);
        }
        return true;
    }

    @Nullable
    public final String getRoute() {
        return this.route;
    }

    @NotNull
    public final Map<String, Map<String, String>> getTitle() {
        return (Map) o.getOrImplicitDefaultNullable(this.title, f28777e[0].getName());
    }

    @NotNull
    public final Visibility getVisibility() {
        return this.visibility;
    }

    public int hashCode() {
        Map<String, Object> map = this.f28781d;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "ButtonConfig(map=" + this.f28781d + ")";
    }
}
