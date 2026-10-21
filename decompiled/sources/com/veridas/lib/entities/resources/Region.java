package com.veridas.lib.entities.resources;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.z1;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Region.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B'\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b)\u0010*B?\b\u0011\u0012\u0006\u0010+\u001a\u00020\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u000b\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b)\u0010.J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR \u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001fR \u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010\u001d\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\u001f¨\u00061"}, d2 = {"Lcom/veridas/lib/entities/resources/Region;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$common_core_jvm", "(Lcom/veridas/lib/entities/resources/Region;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "component2", "component3", "component4", "x", "y", "width", "height", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "F", "getX", "()F", "b", "getY", "c", "getWidth", "getWidth$annotations", "()V", "d", "getHeight", "getHeight$annotations", "<init>", "(FFFF)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IFFFFLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "common-core-jvm"}, k = 1, mv = {1, 9, 0})
@Serializable
public final /* data */ class Region {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float x;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float y;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final float width;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final float height;

    /* JADX INFO: compiled from: Region.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/veridas/lib/entities/resources/Region$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/veridas/lib/entities/resources/Region;", "common-core-jvm"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<Region> serializer() {
            return Region$$serializer.INSTANCE;
        }
    }

    public Region(float f6, float f10, float f11, float f12) {
        this.x = f6;
        this.y = f10;
        this.width = f11;
        this.height = f12;
    }

    public static /* synthetic */ Region copy$default(Region region, float f6, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = region.x;
        }
        if ((i10 & 2) != 0) {
            f10 = region.y;
        }
        if ((i10 & 4) != 0) {
            f11 = region.width;
        }
        if ((i10 & 8) != 0) {
            f12 = region.height;
        }
        return region.copy(f6, f10, f11, f12);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$common_core_jvm(Region self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeFloatElement(serialDesc, 0, self.x);
        output.encodeFloatElement(serialDesc, 1, self.y);
        output.encodeFloatElement(serialDesc, 2, self.width);
        output.encodeFloatElement(serialDesc, 3, self.height);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    @NotNull
    public final Region copy(float x4, float y7, float width, float height) {
        return new Region(x4, y7, width, height);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Region)) {
            return false;
        }
        Region region = (Region) other;
        return Float.compare(this.x, region.x) == 0 && Float.compare(this.y, region.y) == 0 && Float.compare(this.width, region.width) == 0 && Float.compare(this.height, region.height) == 0;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getWidth() {
        return this.width;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.height) + z1.a(this.width, z1.a(this.y, Float.floatToIntBits(this.x) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "Region(x=" + this.x + ", y=" + this.y + ", width=" + this.width + ", height=" + this.height + ")";
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Region(int i10, float f6, float f10, @SerialName("w") float f11, @SerialName("h") float f12, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i10 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 15, Region$$serializer.INSTANCE.getDescriptor());
        }
        this.x = f6;
        this.y = f10;
        this.width = f11;
        this.height = f12;
    }

    @SerialName("h")
    public static /* synthetic */ void getHeight$annotations() {
    }

    @SerialName("w")
    public static /* synthetic */ void getWidth$annotations() {
    }
}
