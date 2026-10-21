package com.bbva.component.ui.welcome.pager;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.i;
import bk.o;
import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.nativesettings.common.Constants;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Page.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0080\b\u0018\u0000 92\u00020\u0001:\u00019B\u001d\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t¢\u0006\u0004\b6\u00107B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b6\u00108J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J!\u0010\r\u001a\u00020\u00002\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tHÆ\u0001J\t\u0010\u000e\u001a\u00020\nHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u0019\u0010 \u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR3\u0010%\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R3\u0010(\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$R\u0019\u0010+\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b*\u0010\u001fR\u0019\u00101\u001a\u0004\u0018\u00010,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001b\u00105\u001a\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\"\u001a\u0004\b3\u00104¨\u0006:"}, d2 = {"Lcom/bbva/component/ui/welcome/pager/Page;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "", "writeToParcel", "describeContents", "", "", "", "map", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "p0", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "q0", "getLottie", "lottie", "Lcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;", "r0", "Lcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;", "getImage", "()Lcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;", AuthConstants.IMAGE, "s0", "Ljava/util/Map;", "getTitle", "()Ljava/util/Map;", "title", "t0", "getDescription", "description", "u0", "getAccessibility", Constants.ACCESSIBILITY, "Lcom/bbva/component/ui/welcome/pager/LottieConfig;", "v0", "Lcom/bbva/component/ui/welcome/pager/LottieConfig;", "getLottieConfig", "()Lcom/bbva/component/ui/welcome/pager/LottieConfig;", "lottieConfig", "w0", "getFullScreen", "()Z", "fullScreen", "<init>", "(Ljava/util/Map;)V", "(Landroid/os/Parcel;)V", "CREATOR", "component-ui-welcome_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class Page implements Parcelable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String id;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String lottie;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final PropertiesHelper.Property image;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map title;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map description;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final PropertiesHelper.Property accessibility;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @Nullable
    public final LottieConfig lottieConfig;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map fullScreen;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Map<String, Object> f28809x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f28801y0 = {i.d(Page.class, "title", "getTitle()Ljava/util/Map;", 0), i.d(Page.class, "description", "getDescription()Ljava/util/Map;", 0), i.d(Page.class, "fullScreen", "getFullScreen()Z", 0)};

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.bbva.component.ui.welcome.pager.Page$CREATOR, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Page.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/bbva/component/ui/welcome/pager/Page$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/bbva/component/ui/welcome/pager/Page;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/bbva/component/ui/welcome/pager/Page;", "component-ui-welcome_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion implements Parcelable.Creator<Page> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public Page createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Page(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public Page[] newArray(int size) {
            return new Page[size];
        }
    }

    /* JADX INFO: compiled from: Page.kt */
    public static final class a extends Lambda implements Function1<String, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f28810p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.FALSE;
        }
    }

    public Page(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f28809x0 = map;
        this.id = (String) map.get("id");
        this.lottie = (String) map.get("lottie");
        Object obj = map.get(AuthConstants.IMAGE);
        this.image = obj != null ? PropertiesHelper.Property.from((Map<String, String>) obj) : null;
        this.title = map;
        this.description = map;
        Object obj2 = map.get(Constants.ACCESSIBILITY);
        this.accessibility = obj2 != null ? PropertiesHelper.Property.from((Map<String, String>) obj2) : null;
        Object obj3 = map.get("lottieConfig");
        this.lottieConfig = obj3 != null ? new LottieConfig((Map) obj3) : null;
        this.fullScreen = o.withDefault(map, a.f28810p0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Page copy$default(Page page, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = page.f28809x0;
        }
        return page.copy(map);
    }

    @NotNull
    public final Page copy(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return new Page(map);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            return (other instanceof Page) && Intrinsics.areEqual(this.f28809x0, ((Page) other).f28809x0);
        }
        return true;
    }

    @Nullable
    public final PropertiesHelper.Property getAccessibility() {
        return this.accessibility;
    }

    @NotNull
    public final Map<String, Map<String, String>> getDescription() {
        return (Map) o.getOrImplicitDefaultNullable(this.description, f28801y0[1].getName());
    }

    public final boolean getFullScreen() {
        return ((Boolean) o.getOrImplicitDefaultNullable(this.fullScreen, f28801y0[2].getName())).booleanValue();
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final PropertiesHelper.Property getImage() {
        return this.image;
    }

    @Nullable
    public final String getLottie() {
        return this.lottie;
    }

    @Nullable
    public final LottieConfig getLottieConfig() {
        return this.lottieConfig;
    }

    @NotNull
    public final Map<String, Map<String, String>> getTitle() {
        return (Map) o.getOrImplicitDefaultNullable(this.title, f28801y0[0].getName());
    }

    public int hashCode() {
        Map<String, Object> map = this.f28809x0;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "Page(map=" + this.f28809x0 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeMap(this.f28809x0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Page(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        HashMap hashMap = parcel.readHashMap(Page.class.getClassLoader());
        if (hashMap == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        }
        this(hashMap);
    }
}
