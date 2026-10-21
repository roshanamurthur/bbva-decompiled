package com.bbva.glomohybrid.login.domain.mapper;

import com.bbva.component.ui.login.model.InputFieldIdentifier;
import com.bbva.component.ui.login.model.InputFormResult;
import com.bbva.component.ui.login.model.LoginResult;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomohybrid.login.domain.model.UserCredentials;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CountryUserCredentialsMapper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/login/domain/mapper/CountryUserCredentialsMapper;", "Lcom/bbva/glomohybrid/login/domain/mapper/UserCredentialsMapper;", "Lcom/bbva/component/ui/login/model/LoginResult;", "data", "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "rememberedUser", "Lcom/bbva/glomohybrid/login/domain/model/UserCredentials;", "map", "<init>", "()V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCountryUserCredentialsMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryUserCredentialsMapper.kt\ncom/bbva/glomohybrid/login/domain/mapper/CountryUserCredentialsMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"})
public final class CountryUserCredentialsMapper implements UserCredentialsMapper {
    @Override // com.bbva.glomohybrid.login.domain.mapper.UserCredentialsMapper
    @Nullable
    public RememberedUser cleanDocumentField(@NotNull RememberedUser rememberedUser) {
        return UserCredentialsMapper.DefaultImpls.cleanDocumentField(this, rememberedUser);
    }

    @Override // com.bbva.glomohybrid.login.domain.mapper.UserCredentialsMapper
    @NotNull
    public UserCredentials map(@NotNull LoginResult data, @Nullable RememberedUser rememberedUser) {
        Object next;
        String value;
        Object next2;
        Intrinsics.checkNotNullParameter(data, "data");
        if (rememberedUser == null || (value = rememberedUser.getDocument()) == null) {
            Iterator<T> it = data.getInputsFormResult().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((InputFormResult) next).getInputFieldIdentifier() != InputFieldIdentifier.PHONE);
            InputFormResult inputFormResult = (InputFormResult) next;
            value = inputFormResult != null ? inputFormResult.getValue() : null;
            if (value == null) {
                value = "";
            }
        }
        Iterator<T> it2 = data.getInputsFormResult().iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (((InputFormResult) next2).getInputFieldIdentifier() != InputFieldIdentifier.PASSWORD);
        InputFormResult inputFormResult2 = (InputFormResult) next2;
        String value2 = inputFormResult2 != null ? inputFormResult2.getValue() : null;
        return new UserCredentials(value, value2 != null ? value2 : "");
    }
}
