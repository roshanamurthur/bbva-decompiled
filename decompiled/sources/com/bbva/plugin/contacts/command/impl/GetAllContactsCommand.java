package com.bbva.plugin.contacts.command.impl;

import com.bbva.contacts.ContactAccessor;
import com.bbva.plugin.contacts.command.impl.base.ContactCommand;
import com.bbva.plugin.contacts.command.params.GetAllContactsParams;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GetAllContactsCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0004\u001a\u00020\u0003H\u0014¨\u0006\t"}, d2 = {"Lcom/bbva/plugin/contacts/command/impl/GetAllContactsCommand;", "Lcom/bbva/plugin/contacts/command/impl/base/ContactCommand;", "Lcom/bbva/plugin/contacts/command/params/GetAllContactsParams;", "", "executeWithPermissionsGranted", "Lcom/bbva/contacts/ContactAccessor;", "contactAccessor", "<init>", "(Lcom/bbva/contacts/ContactAccessor;)V", "contacts-plugin_release"}, k = 1, mv = {1, 9, 0})
public final class GetAllContactsCommand extends ContactCommand<GetAllContactsParams> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAllContactsCommand(@NotNull ContactAccessor contactAccessor) {
        super(contactAccessor, GetAllContactsParams.class, 0);
        Intrinsics.checkNotNullParameter(contactAccessor, "contactAccessor");
    }

    public static void a(ArrayList arrayList, String str, boolean z10) {
        if (z10) {
            arrayList.add(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.androidtoolkit.plugin.command.PermissionCommand
    public void executeWithPermissionsGranted() {
        ArrayList arrayList = new ArrayList();
        T t10 = this.mParams;
        if (t10 != 0) {
            Intrinsics.checkNotNull(t10);
            a(arrayList, ContactAccessor.DISPLAY_NAME, ((GetAllContactsParams) t10).isDisplayName());
            T t11 = this.mParams;
            Intrinsics.checkNotNull(t11);
            a(arrayList, "name", ((GetAllContactsParams) t11).isName());
            T t12 = this.mParams;
            Intrinsics.checkNotNull(t12);
            a(arrayList, ContactAccessor.NICKNAME, ((GetAllContactsParams) t12).isNickName());
            T t13 = this.mParams;
            Intrinsics.checkNotNull(t13);
            a(arrayList, ContactAccessor.PHONE_NUMBERS, ((GetAllContactsParams) t13).isPhoneNumbers());
            T t14 = this.mParams;
            Intrinsics.checkNotNull(t14);
            a(arrayList, ContactAccessor.EMAILS, ((GetAllContactsParams) t14).isEmails());
            T t15 = this.mParams;
            Intrinsics.checkNotNull(t15);
            a(arrayList, ContactAccessor.ADDRESSES, ((GetAllContactsParams) t15).isPostalAddresses());
            T t16 = this.mParams;
            Intrinsics.checkNotNull(t16);
            a(arrayList, ContactAccessor.IMS, ((GetAllContactsParams) t16).isIms());
            T t17 = this.mParams;
            Intrinsics.checkNotNull(t17);
            a(arrayList, ContactAccessor.ORGANIZATIONS, ((GetAllContactsParams) t17).isOrganizations());
            T t18 = this.mParams;
            Intrinsics.checkNotNull(t18);
            a(arrayList, ContactAccessor.BIRTHDAY, ((GetAllContactsParams) t18).isBirthday());
            T t19 = this.mParams;
            Intrinsics.checkNotNull(t19);
            a(arrayList, ContactAccessor.NOTE, ((GetAllContactsParams) t19).isNote());
            T t20 = this.mParams;
            Intrinsics.checkNotNull(t20);
            a(arrayList, ContactAccessor.URLS, ((GetAllContactsParams) t20).isUrls());
            T t21 = this.mParams;
            Intrinsics.checkNotNull(t21);
            a(arrayList, ContactAccessor.CATEGORIES, ((GetAllContactsParams) t21).isCategories());
            T t22 = this.mParams;
            Intrinsics.checkNotNull(t22);
            a(arrayList, ContactAccessor.WEB_SITES, ((GetAllContactsParams) t22).isWebSites());
            T t23 = this.mParams;
            Intrinsics.checkNotNull(t23);
            a(arrayList, ContactAccessor.PHOTO, ((GetAllContactsParams) t23).isIncludePhoto());
        }
        this.mCommandCallback.sendEvent(getMContactAccessor().getAllContacts(arrayList));
    }
}
