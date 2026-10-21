package com.bbva.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.camera.camera2.internal.l0;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.ui.R;
import com.bbva.ui.compose.ClipBoxKt;
import com.bbva.ui.compose.theme.ThemeKt;
import com.bbva.ui.extensions.FloatKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ClipBox.kt */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005R+\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/bbva/ui/widget/ClipBox;", "Landroidx/compose/ui/platform/AbstractComposeView;", "", "Content", "(Landroidx/compose/runtime/Composer;I)V", "Lcom/bbva/ui/widget/ClipBox$State;", "state", "setState", "<set-?>", "x0", "Landroidx/compose/runtime/MutableState;", "getInternalState", "()Lcom/bbva/ui/widget/ClipBox$State;", "setInternalState", "(Lcom/bbva/ui/widget/ClipBox$State;)V", "internalState", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Defaults", "State", "ui_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nClipBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipBox.kt\ncom/bbva/ui/widget/ClipBox\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,117:1\n81#2:118\n107#2,2:119\n233#3,3:121\n*S KotlinDebug\n*F\n+ 1 ClipBox.kt\ncom/bbva/ui/widget/ClipBox\n*L\n27#1:118\n27#1:119,2\n34#1:121,3\n*E\n"})
public final class ClipBox extends AbstractComposeView {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState internalState;

    /* JADX INFO: compiled from: ClipBox.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/bbva/ui/widget/ClipBox$Defaults;", "", "", "Size", "F", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getColor$ui_release", "()I", "Color", "Lcom/bbva/ui/widget/ClipBox$State$Name;", "b", "Lcom/bbva/ui/widget/ClipBox$State$Name;", "getState$ui_release", "()Lcom/bbva/ui/widget/ClipBox$State$Name;", "State", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0})
    public static final class Defaults {
        public static final int $stable = 0;
        public static final float Size = 72.0f;

        @NotNull
        public static final Defaults INSTANCE = new Defaults();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final int Color = R.color.blue_60;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final State.Name State = new State.Name("", 0, 0.0f, 6, null);

        public final int getColor$ui_release() {
            return Color;
        }

        @NotNull
        public final State.Name getState$ui_release() {
            return State;
        }
    }

    /* JADX INFO: compiled from: ClipBox.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/bbva/ui/widget/ClipBox$State;", "", "()V", "Base64", "Name", "Resource", "Lcom/bbva/ui/widget/ClipBox$State$Base64;", "Lcom/bbva/ui/widget/ClipBox$State$Name;", "Lcom/bbva/ui/widget/ClipBox$State$Resource;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class State {
        public static final int $stable = 0;

        /* JADX INFO: compiled from: ClipBox.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/bbva/ui/widget/ClipBox$State$Base64;", "Lcom/bbva/ui/widget/ClipBox$State;", "", "component1", "", "component2", "data", "size", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getData", "()Ljava/lang/String;", "b", "F", "getSize", "()F", "<init>", "(Ljava/lang/String;F)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class Base64 extends State {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String data;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final float size;

            public /* synthetic */ Base64(String str, float f6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? 72.0f : f6);
            }

            public static /* synthetic */ Base64 copy$default(Base64 base64, String str, float f6, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = base64.data;
                }
                if ((i10 & 2) != 0) {
                    f6 = base64.size;
                }
                return base64.copy(str, f6);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getData() {
                return this.data;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final float getSize() {
                return this.size;
            }

            @NotNull
            public final Base64 copy(@NotNull String data, float size) {
                Intrinsics.checkNotNullParameter(data, "data");
                return new Base64(data, size);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Base64)) {
                    return false;
                }
                Base64 base64 = (Base64) other;
                return Intrinsics.areEqual(this.data, base64.data) && Float.compare(this.size, base64.size) == 0;
            }

            @NotNull
            public final String getData() {
                return this.data;
            }

            public final float getSize() {
                return this.size;
            }

            public int hashCode() {
                return Float.floatToIntBits(this.size) + (this.data.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "Base64(data=" + this.data + ", size=" + this.size + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Base64(@NotNull String data, float f6) {
                super(null);
                Intrinsics.checkNotNullParameter(data, "data");
                this.data = data;
                this.size = f6;
            }
        }

        public State() {
        }

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: compiled from: ClipBox.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/bbva/ui/widget/ClipBox$State$Name;", "Lcom/bbva/ui/widget/ClipBox$State;", "", "component1", "", "component2", "", "component3", "name", "color", "size", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getColor", "()I", "c", "F", "getSize", "()F", "<init>", "(Ljava/lang/String;IF)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class Name extends State {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String name;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final int color;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            public final float size;

            public /* synthetic */ Name(String str, int i10, float f6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i11 & 2) != 0 ? Defaults.INSTANCE.getColor$ui_release() : i10, (i11 & 4) != 0 ? 72.0f : f6);
            }

            public static /* synthetic */ Name copy$default(Name name, String str, int i10, float f6, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = name.name;
                }
                if ((i11 & 2) != 0) {
                    i10 = name.color;
                }
                if ((i11 & 4) != 0) {
                    f6 = name.size;
                }
                return name.copy(str, i10, f6);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getName() {
                return this.name;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final int getColor() {
                return this.color;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final float getSize() {
                return this.size;
            }

            @NotNull
            public final Name copy(@NotNull String name, @ColorRes int color, float size) {
                Intrinsics.checkNotNullParameter(name, "name");
                return new Name(name, color, size);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Name)) {
                    return false;
                }
                Name name = (Name) other;
                return Intrinsics.areEqual(this.name, name.name) && this.color == name.color && Float.compare(this.size, name.size) == 0;
            }

            public final int getColor() {
                return this.color;
            }

            @NotNull
            public final String getName() {
                return this.name;
            }

            public final float getSize() {
                return this.size;
            }

            public int hashCode() {
                return Float.floatToIntBits(this.size) + (((this.name.hashCode() * 31) + this.color) * 31);
            }

            @NotNull
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Name(name=");
                sb2.append(this.name);
                sb2.append(", color=");
                sb2.append(this.color);
                sb2.append(", size=");
                return l0.a(sb2, this.size, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Name(@NotNull String name, @ColorRes int i10, float f6) {
                super(null);
                Intrinsics.checkNotNullParameter(name, "name");
                this.name = name;
                this.color = i10;
                this.size = f6;
            }
        }

        /* JADX INFO: compiled from: ClipBox.kt */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/bbva/ui/widget/ClipBox$State$Resource;", "Lcom/bbva/ui/widget/ClipBox$State;", "", "component1", "component2", "", "component3", "id", "color", "size", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getId", "()I", "b", "getColor", "c", "F", "getSize", "()F", "<init>", "(IIF)V", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class Resource extends State {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final int id;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final int color;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            public final float size;

            public /* synthetic */ Resource(int i10, int i11, float f6, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10, (i12 & 2) != 0 ? Defaults.INSTANCE.getColor$ui_release() : i11, (i12 & 4) != 0 ? 72.0f : f6);
            }

            public static /* synthetic */ Resource copy$default(Resource resource, int i10, int i11, float f6, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i10 = resource.id;
                }
                if ((i12 & 2) != 0) {
                    i11 = resource.color;
                }
                if ((i12 & 4) != 0) {
                    f6 = resource.size;
                }
                return resource.copy(i10, i11, f6);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final int getId() {
                return this.id;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final int getColor() {
                return this.color;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final float getSize() {
                return this.size;
            }

            @NotNull
            public final Resource copy(@DrawableRes int id, @ColorRes int color, float size) {
                return new Resource(id, color, size);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Resource)) {
                    return false;
                }
                Resource resource = (Resource) other;
                return this.id == resource.id && this.color == resource.color && Float.compare(this.size, resource.size) == 0;
            }

            public final int getColor() {
                return this.color;
            }

            public final int getId() {
                return this.id;
            }

            public final float getSize() {
                return this.size;
            }

            public int hashCode() {
                return Float.floatToIntBits(this.size) + (((this.id * 31) + this.color) * 31);
            }

            @NotNull
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Resource(id=");
                sb2.append(this.id);
                sb2.append(", color=");
                sb2.append(this.color);
                sb2.append(", size=");
                return l0.a(sb2, this.size, ")");
            }

            public Resource(@DrawableRes int i10, @ColorRes int i11, float f6) {
                super(null);
                this.id = i10;
                this.color = i11;
                this.size = f6;
            }
        }
    }

    /* JADX INFO: compiled from: ClipBox.kt */
    @SourceDebugExtension({"SMAP\nClipBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipBox.kt\ncom/bbva/ui/widget/ClipBox$Content$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,117:1\n174#2:118\n174#2:119\n174#2:120\n*S KotlinDebug\n*F\n+ 1 ClipBox.kt\ncom/bbva/ui/widget/ClipBox$Content$1\n*L\n62#1:118\n70#1:119\n78#1:120\n*E\n"})
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {
        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(469905053, iIntValue, -1, "com.bbva.ui.widget.ClipBox.Content.<anonymous> (ClipBox.kt:55)");
                }
                ClipBox clipBox = ClipBox.this;
                State internalState = clipBox.getInternalState();
                if (internalState instanceof State.Base64) {
                    composer2.startReplaceableGroup(997044933);
                    State internalState2 = clipBox.getInternalState();
                    Intrinsics.checkNotNull(internalState2, "null cannot be cast to non-null type com.bbva.ui.widget.ClipBox.State.Base64");
                    State.Base64 base64 = (State.Base64) internalState2;
                    String data = base64.getData();
                    ClipBoxKt.m4977ClipBox3MZ6nm0(null, 0L, Dp.m4389constructorimpl(base64.getSize()), Defaults.INSTANCE.getState$ui_release().getName(), data, composer2, 3072, 3);
                    composer2.endReplaceableGroup();
                } else if (internalState instanceof State.Name) {
                    composer2.startReplaceableGroup(997045266);
                    State internalState3 = clipBox.getInternalState();
                    Intrinsics.checkNotNull(internalState3, "null cannot be cast to non-null type com.bbva.ui.widget.ClipBox.State.Name");
                    State.Name name = (State.Name) internalState3;
                    ClipBoxKt.m4977ClipBox3MZ6nm0(null, ColorResources_androidKt.colorResource(name.getColor(), composer2, 0), Dp.m4389constructorimpl(name.getSize()), name.getName(), null, composer2, 0, 17);
                    composer2.endReplaceableGroup();
                } else if (internalState instanceof State.Resource) {
                    composer2.startReplaceableGroup(997045603);
                    State internalState4 = clipBox.getInternalState();
                    Intrinsics.checkNotNull(internalState4, "null cannot be cast to non-null type com.bbva.ui.widget.ClipBox.State.Resource");
                    State.Resource resource = (State.Resource) internalState4;
                    ClipBoxKt.m4978ClipBoxBazWgJc(null, ColorResources_androidKt.colorResource(resource.getColor(), composer2, 0), Dp.m4389constructorimpl(resource.getSize()), resource.getId(), composer2, 0, 1);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(997045944);
                    composer2.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ClipBox.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f37719q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10) {
            super(2);
            this.f37719q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f37719q0 | 1);
            ClipBox.this.Content(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ClipBox(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final State getInternalState() {
        return (State) this.internalState.getValue();
    }

    private final void setInternalState(State state) {
        this.internalState.setValue(state);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@Nullable Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(1136182831);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1136182831, i11, -1, "com.bbva.ui.widget.ClipBox.Content (ClipBox.kt:53)");
            }
            ThemeKt.BbvaTheme(null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 469905053, true, new a()), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b(i10));
        }
    }

    public final void setState(@NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        setInternalState(state);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ClipBox(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ClipBox(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ClipBox(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        Defaults defaults = Defaults.INSTANCE;
        this.internalState = SnapshotStateKt.mutableStateOf$default(defaults.getState$ui_release(), null, 2, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ClipBox);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.ClipBox_colorResourceId, defaults.getColor$ui_release());
        float dp = FloatKt.toDp(typedArrayObtainStyledAttributes.getDimension(R.styleable.ClipBox_size, FloatKt.toPx(72.0f, context)), context);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.ClipBox_name);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.ClipBox_drawableResourceId, 0);
        if (string != null) {
            setState(new State.Name(string, resourceId, dp));
        } else if (resourceId2 != 0) {
            setState(new State.Resource(resourceId2, resourceId, dp));
        } else {
            setState(State.Name.copy$default(defaults.getState$ui_release(), null, resourceId, dp, 1, null));
        }
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
    }
}
