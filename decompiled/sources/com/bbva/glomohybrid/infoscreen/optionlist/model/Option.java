package com.bbva.glomohybrid.infoscreen.optionlist.model;

import androidx.appcompat.app.i;
import androidx.core.app.NotificationCompat;
import bk.o;
import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import com.bbva.ethermobilesdk.tokencompat.storage.local.UUIDPreferences;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OptionModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001b\u0010\u0013\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0004\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/optionlist/model/Option;", "", "Lcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;", "a", "Lcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;", "getTitle", "()Lcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;", "title", "b", "getTitleContentDescription", "titleContentDescription", "c", "getDescription", "description", "", "d", "Ljava/util/Map;", "getRoute", "()Ljava/lang/String;", "route", UUIDPreferences.TYPE_KEY, "Lcom/bbva/glomohybrid/infoscreen/optionlist/model/AppOption;", "Lcom/bbva/glomohybrid/infoscreen/optionlist/model/NavigateOption;", "Lcom/bbva/glomohybrid/infoscreen/optionlist/model/NavigateToRegisterUser;", "Lcom/bbva/glomohybrid/infoscreen/optionlist/model/None;", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public abstract class Option {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f32440e = {i.d(Option.class, "route", "getRoute()Ljava/lang/String;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PropertiesHelper.Property title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final PropertiesHelper.Property titleContentDescription;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PropertiesHelper.Property description;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map route;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: OptionModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/optionlist/model/Option$Type;", "", "Companion", ExpectedUserActionOnPoiTypes.NONE, "NAVIGATION", "NAVIGATION_BUNDLE", "APP", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type APP;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        public static final Type NAVIGATION;
        public static final Type NAVIGATION_BUNDLE;
        public static final Type NONE;

        /* JADX INFO: compiled from: OptionModel.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/optionlist/model/Option$Type$Companion;", "", "()V", "from", "Lcom/bbva/glomohybrid/infoscreen/optionlist/model/Option$Type;", "value", "", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Type from(@Nullable String value) {
                if (value != null) {
                    int iHashCode = value.hashCode();
                    if (iHashCode != 96801) {
                        if (iHashCode != 706168758) {
                            if (iHashCode == 1862666772 && value.equals(NotificationCompat.CATEGORY_NAVIGATION)) {
                                return Type.NAVIGATION;
                            }
                        } else if (value.equals("navigationBundle")) {
                            return Type.NAVIGATION_BUNDLE;
                        }
                    } else if (value.equals("app")) {
                        return Type.APP;
                    }
                }
                return Type.NONE;
            }
        }

        static {
            Type type = new Type(ExpectedUserActionOnPoiTypes.NONE, 0);
            NONE = type;
            Type type2 = new Type("NAVIGATION", 1);
            NAVIGATION = type2;
            Type type3 = new Type("NAVIGATION_BUNDLE", 2);
            NAVIGATION_BUNDLE = type3;
            Type type4 = new Type("APP", 3);
            APP = type4;
            Type[] typeArr = {type, type2, type3, type4};
            $VALUES = typeArr;
            $ENTRIES = EnumEntriesKt.enumEntries(typeArr);
            INSTANCE = new Companion(null);
        }

        public Type() {
            throw null;
        }

        @NotNull
        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public Option() {
        throw null;
    }

    public Option(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = map.get("title");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        PropertiesHelper.Property propertyFrom = PropertiesHelper.Property.from((Map<String, String>) obj);
        Intrinsics.checkNotNullExpressionValue(propertyFrom, "from(...)");
        this.title = propertyFrom;
        Object obj2 = map.get("titleContentDescription");
        this.titleContentDescription = obj2 != null ? PropertiesHelper.Property.from((Map<String, String>) obj2) : null;
        Object obj3 = map.get("description");
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        PropertiesHelper.Property propertyFrom2 = PropertiesHelper.Property.from((Map<String, String>) obj3);
        Intrinsics.checkNotNullExpressionValue(propertyFrom2, "from(...)");
        this.description = propertyFrom2;
        this.route = map;
    }

    @NotNull
    public final PropertiesHelper.Property getDescription() {
        return this.description;
    }

    @NotNull
    public final String getRoute() {
        return (String) o.getOrImplicitDefaultNullable(this.route, f32440e[0].getName());
    }

    @NotNull
    public final PropertiesHelper.Property getTitle() {
        return this.title;
    }

    @Nullable
    public final PropertiesHelper.Property getTitleContentDescription() {
        return this.titleContentDescription;
    }
}
