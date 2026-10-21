package com.bbva.component.ui.login.credentials.documentlist;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import com.bbva.component.ui.login.R;
import com.bbva.component.ui.login.model.DocumentItem;
import com.bbva.component.ui.login.model.DocumentListConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q5.a;
import q5.b;

/* JADX INFO: compiled from: DocumentListSelector.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\n\u001a\u00020\u00042\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006j\u0002`\bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/bbva/component/ui/login/credentials/documentlist/DocumentListSelector;", "", "Lcom/bbva/component/ui/login/model/DocumentListConfig;", "documentListConfig", "", "setup", "Lkotlin/Function1;", "Lcom/bbva/component/ui/login/model/DocumentItem;", "Lcom/bbva/component/ui/login/credentials/documentlist/OnItemSelected;", "onItemSelected", "show", "getSelectedItem", "()Lcom/bbva/component/ui/login/model/DocumentItem;", "selectedItem", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDocumentListSelector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentListSelector.kt\ncom/bbva/component/ui/login/credentials/documentlist/DocumentListSelector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,60:1\n1549#2:61\n1620#2,3:62\n37#3,2:65\n*S KotlinDebug\n*F\n+ 1 DocumentListSelector.kt\ncom/bbva/component/ui/login/credentials/documentlist/DocumentListSelector\n*L\n36#1:61\n36#1:62,3\n37#1:65,2\n*E\n"})
public final class DocumentListSelector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public List<DocumentItem> f28494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final AlertDialog.Builder f28496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Function1<? super DocumentItem, Unit> f28497d;

    public DocumentListSelector(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28494a = CollectionsKt__CollectionsKt.emptyList();
        this.f28496c = new AlertDialog.Builder(context, R.style.LoginStyle_AlertDialog);
    }

    @Nullable
    public final DocumentItem getSelectedItem() {
        return (DocumentItem) CollectionsKt___CollectionsKt.getOrNull(this.f28494a, this.f28495b);
    }

    public final void setup(@NotNull DocumentListConfig documentListConfig) {
        Intrinsics.checkNotNullParameter(documentListConfig, "documentListConfig");
        List<DocumentItem> items = documentListConfig.getItems();
        this.f28494a = items;
        AlertDialog.Builder builder = this.f28496c;
        List<DocumentItem> list = items;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((DocumentItem) it.next()).getName());
        }
        builder.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), this.f28495b, new a(this, 0));
        builder.setTitle(documentListConfig.getTitle());
        builder.setPositiveButton(documentListConfig.getPositiveButtonTitle(), new b(this, 0));
        builder.setNegativeButton(documentListConfig.getNegativeButtonTitle(), (DialogInterface.OnClickListener) null);
    }

    public final void show(@NotNull Function1<? super DocumentItem, Unit> onItemSelected) {
        Intrinsics.checkNotNullParameter(onItemSelected, "onItemSelected");
        this.f28497d = onItemSelected;
        this.f28496c.create().show();
    }
}
