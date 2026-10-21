package com.salesforce.marketingcloud.messages;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.f;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.location.LatLon;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.annotation.AnnotationRetention;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.reflect.KClass;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@MCKeep
@Parcelize
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 C2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0002CDB\u000f\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005Bo\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\u0010\u0015J\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\"J\u0011\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0000H\u0096\u0002J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003Jy\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0001J\t\u00100\u001a\u00020\u000bHÖ\u0001J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\b1J\u0013\u00102\u001a\u00020\u00192\b\u0010$\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020\u000bHÖ\u0001J\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\b5J\r\u0010\r\u001a\u00020\u000bH\u0007¢\u0006\u0002\b6J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0007¢\u0006\u0002\b7J\r\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0002\b8J\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\b9J\u000f\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\b:J\r\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\b;J\r\u0010\u000f\u001a\u00020\u000bH\u0007¢\u0006\u0002\b<J\t\u0010=\u001a\u00020\u0007HÖ\u0001J\u0019\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\b\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0016R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0017R\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0017R,\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00198A@AX\u0080\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001d\u0010\u001fR\u0013\u0010\r\u001a\u00020\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010 R\u0019\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010!R\u0013\u0010\u000e\u001a\u00020\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010 R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0017R\u0015\u0010\f\u001a\u0004\u0018\u00010\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0017R\u0013\u0010\n\u001a\u00020\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010 R\u0013\u0010\u000f\u001a\u00020\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010 ¨\u0006E"}, d2 = {"Lcom/salesforce/marketingcloud/messages/Region;", "Landroid/os/Parcelable;", "", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "id", "", "center", "Lcom/salesforce/marketingcloud/location/LatLon;", "radius", "", "proximityUuid", "major", "minor", "regionType", "name", "description", "messages", "", "Lcom/salesforce/marketingcloud/messages/Message;", "(Ljava/lang/String;Lcom/salesforce/marketingcloud/location/LatLon;ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "()Lcom/salesforce/marketingcloud/location/LatLon;", "()Ljava/lang/String;", "<set-?>", "", "isInside", "-isInside$annotations", "()V", "-isInside", "()Z", "(Z)V", "()I", "()Ljava/util/List;", "-deprecated_center", "compareTo", "other", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "-deprecated_description", "equals", "", GenerateActivationFormCommand.HASH_CODE, "-deprecated_id", "-deprecated_major", "-deprecated_messages", "-deprecated_minor", "-deprecated_name", "-deprecated_proximityUuid", "-deprecated_radius", "-deprecated_regionType", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "RegionType", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRegion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Region.kt\ncom/salesforce/marketingcloud/messages/Region\n+ 2 -GeneralUtils.kt\ncom/salesforce/marketingcloud/internal/_GeneralUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n41#2:209\n42#2,8:213\n51#2:222\n1549#3:210\n1620#3,2:211\n1622#3:221\n1603#3,9:223\n1855#3:232\n1856#3:234\n1612#3:235\n766#3:236\n857#3,2:237\n1#4:233\n*S KotlinDebug\n*F\n+ 1 Region.kt\ncom/salesforce/marketingcloud/messages/Region\n*L\n49#1:209\n49#1:213,8\n49#1:222\n49#1:210\n49#1:211,2\n49#1:221\n50#1:223,9\n50#1:232\n50#1:234\n50#1:235\n58#1:236\n58#1:237,2\n50#1:233\n*E\n"})
public final /* data */ class Region implements Parcelable, Comparable<Region> {

    @NotNull
    public static final String MAGIC_REGION_ID = "~~m@g1c_f3nc3~~";
    public static final int REGION_TYPE_FENCE = 1;
    public static final int REGION_TYPE_PROXIMITY = 3;

    @NotNull
    private final LatLon center;

    @Nullable
    private final String description;

    @NotNull
    private final String id;
    private boolean isInside;
    private final int major;

    @NotNull
    private final List<Message> messages;
    private final int minor;

    @Nullable
    private final String name;

    @Nullable
    private final String proximityUuid;
    private final int radius;
    private final int regionType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<Region> CREATOR = new c();

    @NotNull
    private static final String TAG = g.a("Region");

    @MCKeep
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u00020\u00048AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/salesforce/marketingcloud/messages/Region$Companion;", "", "()V", "MAGIC_REGION_ID", "", "REGION_TYPE_FENCE", "", "REGION_TYPE_PROXIMITY", "TAG", "-TAG", "()Ljava/lang/String;", "magicFence", "Lcom/salesforce/marketingcloud/messages/Region;", "center", "Lcom/salesforce/marketingcloud/location/LatLon;", "radius", "-magicFence", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmName(name = "-TAG")
        @NotNull
        /* JADX INFO: renamed from: -TAG, reason: not valid java name */
        public final String m5390TAG() {
            return Region.TAG;
        }

        @JvmName(name = "-magicFence")
        @NotNull
        /* JADX INFO: renamed from: -magicFence, reason: not valid java name */
        public final Region m5391magicFence(@NotNull LatLon center, int radius) {
            Intrinsics.checkNotNullParameter(center, "center");
            return new Region(Region.MAGIC_REGION_ID, center, radius, null, 0, 0, -1, null, null, null, 952, null);
        }
    }

    @MCKeep
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/salesforce/marketingcloud/messages/Region$RegionType;", "", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface RegionType {
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f64571a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unable to parse Message from region payload.";
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class b extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f64572a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unable to parse region messages.";
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<Region> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Region createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            LatLon latLonCreateFromParcel = LatLon.CREATOR.createFromParcel(parcel);
            int i10 = parcel.readInt();
            String string2 = parcel.readString();
            int i11 = parcel.readInt();
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                arrayList.add(Message.CREATOR.createFromParcel(parcel));
            }
            return new Region(string, latLonCreateFromParcel, i10, string2, i11, i12, i13, string3, string4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Region[] newArray(int i10) {
            return new Region[i10];
        }
    }

    public Region(@NotNull String id, @NotNull LatLon center, int i10, @Nullable String str, int i11, int i12, int i13, @Nullable String str2, @Nullable String str3, @NotNull List<Message> messages) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(center, "center");
        Intrinsics.checkNotNullParameter(messages, "messages");
        this.id = id;
        this.center = center;
        this.radius = i10;
        this.proximityUuid = str;
        this.major = i11;
        this.minor = i12;
        this.regionType = i13;
        this.name = str2;
        this.description = str3;
        this.messages = messages;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "center", imports = {}))
    @JvmName(name = "-deprecated_center")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_center, reason: not valid java name and from getter */
    public final LatLon getCenter() {
        return this.center;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "description", imports = {}))
    @JvmName(name = "-deprecated_description")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_description, reason: not valid java name and from getter */
    public final String getDescription() {
        return this.description;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "id", imports = {}))
    @JvmName(name = "-deprecated_id")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_id, reason: not valid java name and from getter */
    public final String getId() {
        return this.id;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "major", imports = {}))
    @JvmName(name = "-deprecated_major")
    /* JADX INFO: renamed from: -deprecated_major, reason: not valid java name and from getter */
    public final int getMajor() {
        return this.major;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "messages", imports = {}))
    @JvmName(name = "-deprecated_messages")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_messages, reason: not valid java name */
    public final List<Message> m5382deprecated_messages() {
        return this.messages;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "minor", imports = {}))
    @JvmName(name = "-deprecated_minor")
    /* JADX INFO: renamed from: -deprecated_minor, reason: not valid java name and from getter */
    public final int getMinor() {
        return this.minor;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "name", imports = {}))
    @JvmName(name = "-deprecated_name")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_name, reason: not valid java name and from getter */
    public final String getName() {
        return this.name;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proximityUuid", imports = {}))
    @JvmName(name = "-deprecated_proximityUuid")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_proximityUuid, reason: not valid java name and from getter */
    public final String getProximityUuid() {
        return this.proximityUuid;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "radius", imports = {}))
    @JvmName(name = "-deprecated_radius")
    /* JADX INFO: renamed from: -deprecated_radius, reason: not valid java name and from getter */
    public final int getRadius() {
        return this.radius;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "regionType", imports = {}))
    @JvmName(name = "-deprecated_regionType")
    /* JADX INFO: renamed from: -deprecated_regionType, reason: not valid java name and from getter */
    public final int getRegionType() {
        return this.regionType;
    }

    @JvmName(name = "-isInside")
    /* JADX INFO: renamed from: -isInside, reason: not valid java name */
    public final void m5388isInside(boolean z10) {
        this.isInside = z10;
    }

    @JvmName(name = "center")
    @NotNull
    public final LatLon center() {
        return this.center;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull Region other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.id.compareTo(other.id);
    }

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final List<Message> component10() {
        return this.messages;
    }

    @NotNull
    public final LatLon component2() {
        return this.center;
    }

    public final int component3() {
        return this.radius;
    }

    @Nullable
    public final String component4() {
        return this.proximityUuid;
    }

    public final int component5() {
        return this.major;
    }

    public final int component6() {
        return this.minor;
    }

    public final int component7() {
        return this.regionType;
    }

    @Nullable
    public final String component8() {
        return this.name;
    }

    @Nullable
    public final String component9() {
        return this.description;
    }

    @NotNull
    public final Region copy(@NotNull String id, @NotNull LatLon center, int radius, @Nullable String proximityUuid, int major, int minor, int regionType, @Nullable String name, @Nullable String description, @NotNull List<Message> messages) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(center, "center");
        Intrinsics.checkNotNullParameter(messages, "messages");
        return new Region(id, center, radius, proximityUuid, major, minor, regionType, name, description, messages);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @JvmName(name = "description")
    @Nullable
    public final String description() {
        return this.description;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Region)) {
            return false;
        }
        Region region = (Region) other;
        return Intrinsics.areEqual(this.id, region.id) && Intrinsics.areEqual(this.center, region.center) && this.radius == region.radius && Intrinsics.areEqual(this.proximityUuid, region.proximityUuid) && this.major == region.major && this.minor == region.minor && this.regionType == region.regionType && Intrinsics.areEqual(this.name, region.name) && Intrinsics.areEqual(this.description, region.description) && Intrinsics.areEqual(this.messages, region.messages);
    }

    public int hashCode() {
        int iHashCode = (((this.center.hashCode() + (this.id.hashCode() * 31)) * 31) + this.radius) * 31;
        String str = this.proximityUuid;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.major) * 31) + this.minor) * 31) + this.regionType) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        return this.messages.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @JvmName(name = "id")
    @NotNull
    public final String id() {
        return this.id;
    }

    @JvmName(name = "major")
    public final int major() {
        return this.major;
    }

    @JvmName(name = "messages")
    @NotNull
    public final List<Message> messages() {
        return this.messages;
    }

    @JvmName(name = "minor")
    public final int minor() {
        return this.minor;
    }

    @JvmName(name = "name")
    @Nullable
    public final String name() {
        return this.name;
    }

    @JvmName(name = "proximityUuid")
    @Nullable
    public final String proximityUuid() {
        return this.proximityUuid;
    }

    @JvmName(name = "radius")
    public final int radius() {
        return this.radius;
    }

    @JvmName(name = "regionType")
    public final int regionType() {
        return this.regionType;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Region(id=");
        sb2.append(this.id);
        sb2.append(", center=");
        sb2.append(this.center);
        sb2.append(", radius=");
        sb2.append(this.radius);
        sb2.append(", proximityUuid=");
        sb2.append(this.proximityUuid);
        sb2.append(", major=");
        sb2.append(this.major);
        sb2.append(", minor=");
        sb2.append(this.minor);
        sb2.append(", regionType=");
        sb2.append(this.regionType);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", messages=");
        return bc.org.bouncycastle.math.ec.custom.sec.a.c(sb2, this.messages, RootService.CLOSE_BRACKET);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.id);
        this.center.writeToParcel(parcel, flags);
        parcel.writeInt(this.radius);
        parcel.writeString(this.proximityUuid);
        parcel.writeInt(this.major);
        parcel.writeInt(this.minor);
        parcel.writeInt(this.regionType);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        List<Message> list = this.messages;
        parcel.writeInt(list.size());
        Iterator<Message> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ Region(String str, LatLon latLon, int i10, String str2, int i11, int i12, int i13, String str3, String str4, List list, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, latLon, i10, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? 0 : i11, (i14 & 32) != 0 ? 0 : i12, i13, (i14 & 128) != 0 ? null : str3, (i14 & 256) != 0 ? null : str4, (i14 & 512) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }

    @JvmName(name = "-isInside")
    /* JADX INFO: renamed from: -isInside, reason: not valid java name and from getter */
    public final boolean getIsInside() {
        return this.isInside;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.List] */
    public Region(@NotNull JSONObject json) throws JSONException {
        ?? EmptyList;
        Message message;
        Object string;
        JSONObject jSONObject;
        Object objValueOf;
        Class<JSONObject> cls = JSONObject.class;
        Intrinsics.checkNotNullParameter(json, "json");
        String string2 = json.getString("id");
        Intrinsics.checkNotNullExpressionValue(string2, "json.getString(\"id\")");
        JSONObject jSONObject2 = json.getJSONObject("center");
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "json.getJSONObject(\"center\")");
        LatLon latLon = new LatLon(jSONObject2);
        int iOptInt = json.optInt("radius");
        String strG = f.g(json, "proximityUuid", "json.optString(\"proximityUuid\")");
        int iOptInt2 = json.optInt("major");
        int iOptInt3 = json.optInt("minor");
        int i10 = json.getInt("locationType");
        String strG2 = f.g(json, "name", "json.optString(\"name\")");
        String strG3 = f.g(json, "description", "json.optString(\"description\")");
        try {
            JSONArray jSONArrayOptJSONArray = json.optJSONArray("messages");
            if (jSONArrayOptJSONArray != null) {
                IntRange intRangeUntil = kotlin.ranges.c.until(0, jSONArrayOptJSONArray.length());
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
                Iterator<Integer> it = intRangeUntil.iterator();
                while (it.hasNext()) {
                    int iNextInt = ((IntIterator) it).nextInt();
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(cls);
                    Class<JSONObject> cls2 = cls;
                    if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(cls))) {
                        jSONObject = jSONArrayOptJSONArray.getJSONObject(iNextInt);
                        if (jSONObject == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                        }
                    } else {
                        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                            objValueOf = Integer.valueOf(jSONArrayOptJSONArray.getInt(iNextInt));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                            objValueOf = Double.valueOf(jSONArrayOptJSONArray.getDouble(iNextInt));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                            objValueOf = Long.valueOf(jSONArrayOptJSONArray.getLong(iNextInt));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                            objValueOf = Boolean.valueOf(jSONArrayOptJSONArray.getBoolean(iNextInt));
                        } else {
                            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                                string = jSONArrayOptJSONArray.getString(iNextInt);
                                if (string == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                                }
                            } else {
                                string = jSONArrayOptJSONArray.get(iNextInt);
                                if (string == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                                }
                            }
                            jSONObject = (JSONObject) string;
                        }
                        jSONObject = (JSONObject) objValueOf;
                    }
                    arrayList.add(jSONObject);
                    cls = cls2;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    try {
                        message = new Message((JSONObject) it2.next());
                    } catch (Exception e5) {
                        g.f64223a.b(TAG, e5, a.f64571a);
                        message = null;
                    }
                    if (message != null) {
                        arrayList2.add(message);
                    }
                }
                EmptyList = new ArrayList();
                for (Object obj : arrayList2) {
                    if (com.salesforce.marketingcloud.messages.b.a((Message) obj)) {
                        EmptyList.add(obj);
                    }
                }
            } else {
                EmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
        } catch (JSONException e7) {
            g.f64223a.b(TAG, e7, b.f64572a);
            EmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        this(string2, latLon, iOptInt, strG, iOptInt2, iOptInt3, i10, strG2, strG3, EmptyList);
    }

    /* JADX INFO: renamed from: -isInside$annotations, reason: not valid java name */
    public static /* synthetic */ void m5377isInside$annotations() {
    }
}
