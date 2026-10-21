package com.bbva.component.ui.login.model;

import ad.d;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.android.gms.measurement.internal.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginCredentialsState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B-\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b'\u0010(BI\b\u0017\u0012\u0006\u0010)\u001a\u00020\u0016\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b'\u0010,J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\tHÆ\u0003J\t\u0010\u000f\u001a\u00020\tHÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\t2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\tHÆ\u0001J\t\u0010\u0015\u001a\u00020\tHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001e¨\u0006/"}, d2 = {"Lcom/bbva/component/ui/login/model/DocumentListConfig;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "Lcom/bbva/component/ui/login/model/DocumentItem;", "component2", "component3", "component4", "title", FirebaseAnalytics.Param.ITEMS, "negativeButtonTitle", "positiveButtonTitle", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "b", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "c", "getNegativeButtonTitle", "d", "getPositiveButtonTitle", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
@Serializable
public final /* data */ class DocumentListConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final KSerializer<Object>[] f28525e = {null, new ArrayListSerializer(DocumentItem$$serializer.INSTANCE), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<DocumentItem> items;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String negativeButtonTitle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String positiveButtonTitle;

    /* JADX INFO: compiled from: LoginCredentialsState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/ui/login/model/DocumentListConfig$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/ui/login/model/DocumentListConfig;", "component-ui-login_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<DocumentListConfig> serializer() {
            return DocumentListConfig$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ DocumentListConfig(int i10, String str, List list, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i10 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 15, DocumentListConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.items = list;
        this.negativeButtonTitle = str2;
        this.positiveButtonTitle = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocumentListConfig copy$default(DocumentListConfig documentListConfig, String str, List list, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = documentListConfig.title;
        }
        if ((i10 & 2) != 0) {
            list = documentListConfig.items;
        }
        if ((i10 & 4) != 0) {
            str2 = documentListConfig.negativeButtonTitle;
        }
        if ((i10 & 8) != 0) {
            str3 = documentListConfig.positiveButtonTitle;
        }
        return documentListConfig.copy(str, list, str2, str3);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(DocumentListConfig self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeSerializableElement(serialDesc, 1, f28525e[1], self.items);
        output.encodeStringElement(serialDesc, 2, self.negativeButtonTitle);
        output.encodeStringElement(serialDesc, 3, self.positiveButtonTitle);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final List<DocumentItem> component2() {
        return this.items;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNegativeButtonTitle() {
        return this.negativeButtonTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPositiveButtonTitle() {
        return this.positiveButtonTitle;
    }

    @NotNull
    public final DocumentListConfig copy(@NotNull String title, @NotNull List<DocumentItem> items, @NotNull String negativeButtonTitle, @NotNull String positiveButtonTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(negativeButtonTitle, "negativeButtonTitle");
        Intrinsics.checkNotNullParameter(positiveButtonTitle, "positiveButtonTitle");
        return new DocumentListConfig(title, items, negativeButtonTitle, positiveButtonTitle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentListConfig)) {
            return false;
        }
        DocumentListConfig documentListConfig = (DocumentListConfig) other;
        return Intrinsics.areEqual(this.title, documentListConfig.title) && Intrinsics.areEqual(this.items, documentListConfig.items) && Intrinsics.areEqual(this.negativeButtonTitle, documentListConfig.negativeButtonTitle) && Intrinsics.areEqual(this.positiveButtonTitle, documentListConfig.positiveButtonTitle);
    }

    @NotNull
    public final List<DocumentItem> getItems() {
        return this.items;
    }

    @NotNull
    public final String getNegativeButtonTitle() {
        return this.negativeButtonTitle;
    }

    @NotNull
    public final String getPositiveButtonTitle() {
        return this.positiveButtonTitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.positiveButtonTitle.hashCode() + n1.c(this.negativeButtonTitle, a.a(this.items, this.title.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DocumentListConfig(title=");
        sb2.append(this.title);
        sb2.append(", items=");
        sb2.append(this.items);
        sb2.append(", negativeButtonTitle=");
        sb2.append(this.negativeButtonTitle);
        sb2.append(", positiveButtonTitle=");
        return d.f(sb2, this.positiveButtonTitle, ")");
    }

    public DocumentListConfig(@NotNull String title, @NotNull List<DocumentItem> items, @NotNull String negativeButtonTitle, @NotNull String positiveButtonTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(negativeButtonTitle, "negativeButtonTitle");
        Intrinsics.checkNotNullParameter(positiveButtonTitle, "positiveButtonTitle");
        this.title = title;
        this.items = items;
        this.negativeButtonTitle = negativeButtonTitle;
        this.positiveButtonTitle = positiveButtonTitle;
    }
}
