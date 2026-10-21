package com.bbva.glomohybrid.login.data.model;

import com.bbva.component.dm.customer.data.repository.response.customer.CustomerLoginsParser;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PersonType.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b*\u0010+J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003JQ\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/bbva/glomohybrid/login/data/model/PersonType;", "", "", "component1", "component2", "component3", "component4", "Lcom/bbva/glomohybrid/login/data/model/BirthData;", "component5", "Lcom/bbva/glomohybrid/login/data/model/NameIdEntity;", "component6", "id", CustomerLoginsParser.FIRST_NAME, CustomerLoginsParser.LAST_NAME, CustomerLoginsParser.SECOND_LAST_NAME, "birthData", "gender", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getFirstName", "c", "getLastName", "d", "getSecondLastName", "e", "Lcom/bbva/glomohybrid/login/data/model/BirthData;", "getBirthData", "()Lcom/bbva/glomohybrid/login/data/model/BirthData;", "f", "Lcom/bbva/glomohybrid/login/data/model/NameIdEntity;", "getGender", "()Lcom/bbva/glomohybrid/login/data/model/NameIdEntity;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bbva/glomohybrid/login/data/model/BirthData;Lcom/bbva/glomohybrid/login/data/model/NameIdEntity;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class PersonType {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String firstName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String lastName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String secondLastName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final BirthData birthData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final NameIdEntity gender;

    public PersonType(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable BirthData birthData, @Nullable NameIdEntity nameIdEntity) {
        this.id = str;
        this.firstName = str2;
        this.lastName = str3;
        this.secondLastName = str4;
        this.birthData = birthData;
        this.gender = nameIdEntity;
    }

    public static /* synthetic */ PersonType copy$default(PersonType personType, String str, String str2, String str3, String str4, BirthData birthData, NameIdEntity nameIdEntity, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = personType.id;
        }
        if ((i10 & 2) != 0) {
            str2 = personType.firstName;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = personType.lastName;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = personType.secondLastName;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            birthData = personType.birthData;
        }
        BirthData birthData2 = birthData;
        if ((i10 & 32) != 0) {
            nameIdEntity = personType.gender;
        }
        return personType.copy(str, str5, str6, str7, birthData2, nameIdEntity);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSecondLastName() {
        return this.secondLastName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BirthData getBirthData() {
        return this.birthData;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final NameIdEntity getGender() {
        return this.gender;
    }

    @NotNull
    public final PersonType copy(@Nullable String id, @Nullable String firstName, @Nullable String lastName, @Nullable String secondLastName, @Nullable BirthData birthData, @Nullable NameIdEntity gender) {
        return new PersonType(id, firstName, lastName, secondLastName, birthData, gender);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonType)) {
            return false;
        }
        PersonType personType = (PersonType) other;
        return Intrinsics.areEqual(this.id, personType.id) && Intrinsics.areEqual(this.firstName, personType.firstName) && Intrinsics.areEqual(this.lastName, personType.lastName) && Intrinsics.areEqual(this.secondLastName, personType.secondLastName) && Intrinsics.areEqual(this.birthData, personType.birthData) && Intrinsics.areEqual(this.gender, personType.gender);
    }

    @Nullable
    public final BirthData getBirthData() {
        return this.birthData;
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final NameIdEntity getGender() {
        return this.gender;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    public final String getSecondLastName() {
        return this.secondLastName;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.firstName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.secondLastName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BirthData birthData = this.birthData;
        int iHashCode5 = (iHashCode4 + (birthData == null ? 0 : birthData.hashCode())) * 31;
        NameIdEntity nameIdEntity = this.gender;
        return iHashCode5 + (nameIdEntity != null ? nameIdEntity.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PersonType(id=" + this.id + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", secondLastName=" + this.secondLastName + ", birthData=" + this.birthData + ", gender=" + this.gender + ")";
    }
}
