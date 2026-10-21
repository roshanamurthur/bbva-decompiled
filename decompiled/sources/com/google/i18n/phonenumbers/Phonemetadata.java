package com.google.i18n.phonenumbers;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class Phonemetadata {

    public static class PhoneMetadata implements Externalizable {
        public boolean A1;
        public boolean E0;
        public boolean G0;
        public boolean I0;
        public boolean K0;
        public boolean M0;
        public boolean O0;
        public boolean Q0;
        public boolean S0;
        public boolean U0;
        public boolean W0;
        public boolean Y0;

        /* JADX INFO: renamed from: a1, reason: collision with root package name */
        public boolean f49274a1;

        /* JADX INFO: renamed from: c1, reason: collision with root package name */
        public boolean f49276c1;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        public boolean f49278e1;

        /* JADX INFO: renamed from: g1, reason: collision with root package name */
        public boolean f49280g1;

        /* JADX INFO: renamed from: i1, reason: collision with root package name */
        public boolean f49282i1;

        /* JADX INFO: renamed from: k1, reason: collision with root package name */
        public boolean f49284k1;

        /* JADX INFO: renamed from: m1, reason: collision with root package name */
        public boolean f49286m1;

        /* JADX INFO: renamed from: o1, reason: collision with root package name */
        public boolean f49288o1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public boolean f49289p0;

        /* JADX INFO: renamed from: q1, reason: collision with root package name */
        public boolean f49292q1;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f49293r0;

        /* JADX INFO: renamed from: s1, reason: collision with root package name */
        public boolean f49295s1;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f49296t0;
        public boolean v0;

        /* JADX INFO: renamed from: w1, reason: collision with root package name */
        public boolean f49302w1;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public boolean f49303x0;

        /* JADX INFO: renamed from: y1, reason: collision with root package name */
        public boolean f49306y1;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public PhoneNumberDesc f49291q0 = null;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public PhoneNumberDesc f49294s0 = null;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public PhoneNumberDesc f49298u0 = null;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public PhoneNumberDesc f49301w0 = null;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public PhoneNumberDesc f49305y0 = null;
        public PhoneNumberDesc F0 = null;
        public PhoneNumberDesc H0 = null;
        public PhoneNumberDesc J0 = null;
        public PhoneNumberDesc L0 = null;
        public PhoneNumberDesc N0 = null;
        public PhoneNumberDesc P0 = null;
        public PhoneNumberDesc R0 = null;
        public PhoneNumberDesc T0 = null;
        public PhoneNumberDesc V0 = null;
        public PhoneNumberDesc X0 = null;
        public PhoneNumberDesc Z0 = null;

        /* JADX INFO: renamed from: b1, reason: collision with root package name */
        public PhoneNumberDesc f49275b1 = null;

        /* JADX INFO: renamed from: d1, reason: collision with root package name */
        public String f49277d1 = "";

        /* JADX INFO: renamed from: f1, reason: collision with root package name */
        public int f49279f1 = 0;

        /* JADX INFO: renamed from: h1, reason: collision with root package name */
        public String f49281h1 = "";

        /* JADX INFO: renamed from: j1, reason: collision with root package name */
        public String f49283j1 = "";

        /* JADX INFO: renamed from: l1, reason: collision with root package name */
        public String f49285l1 = "";

        /* JADX INFO: renamed from: n1, reason: collision with root package name */
        public String f49287n1 = "";

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        public String f49290p1 = "";
        public String r1 = "";

        /* JADX INFO: renamed from: t1, reason: collision with root package name */
        public boolean f49297t1 = false;

        /* JADX INFO: renamed from: u1, reason: collision with root package name */
        public final ArrayList f49299u1 = new ArrayList();

        /* JADX INFO: renamed from: v1, reason: collision with root package name */
        public final ArrayList f49300v1 = new ArrayList();

        /* JADX INFO: renamed from: x1, reason: collision with root package name */
        public boolean f49304x1 = false;

        /* JADX INFO: renamed from: z1, reason: collision with root package name */
        public String f49307z1 = "";
        public boolean B1 = false;

        public static final class Builder extends PhoneMetadata {
            @Override // com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata
            public Builder setId(String str) {
                super.setId(str);
                return this;
            }

            @Override // com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata
            public Builder setInternationalPrefix(String str) {
                super.setInternationalPrefix(str);
                return this;
            }

            public PhoneMetadata build() {
                return this;
            }
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public PhoneMetadata addIntlNumberFormat(NumberFormat numberFormat) {
            numberFormat.getClass();
            this.f49300v1.add(numberFormat);
            return this;
        }

        public PhoneMetadata addNumberFormat(NumberFormat numberFormat) {
            numberFormat.getClass();
            this.f49299u1.add(numberFormat);
            return this;
        }

        public PhoneMetadata clearIntlNumberFormat() {
            this.f49300v1.clear();
            return this;
        }

        public PhoneMetadata clearMainCountryForCode() {
            this.f49302w1 = false;
            this.f49304x1 = false;
            return this;
        }

        public PhoneMetadata clearMobileNumberPortableRegion() {
            this.A1 = false;
            this.B1 = false;
            return this;
        }

        public PhoneMetadata clearNationalPrefix() {
            this.f49284k1 = false;
            this.f49285l1 = "";
            return this;
        }

        public PhoneMetadata clearNationalPrefixTransformRule() {
            this.f49292q1 = false;
            this.r1 = "";
            return this;
        }

        public PhoneMetadata clearPreferredExtnPrefix() {
            this.f49286m1 = false;
            this.f49287n1 = "";
            return this;
        }

        public PhoneMetadata clearPreferredInternationalPrefix() {
            this.f49282i1 = false;
            this.f49283j1 = "";
            return this;
        }

        public PhoneMetadata clearSameMobileAndFixedLinePattern() {
            this.f49295s1 = false;
            this.f49297t1 = false;
            return this;
        }

        public PhoneNumberDesc getCarrierSpecific() {
            return this.X0;
        }

        public int getCountryCode() {
            return this.f49279f1;
        }

        public PhoneNumberDesc getEmergency() {
            return this.P0;
        }

        public PhoneNumberDesc getFixedLine() {
            return this.f49294s0;
        }

        public PhoneNumberDesc getGeneralDesc() {
            return this.f49291q0;
        }

        public PhoneNumberDesc getGeneralDescBuilder() {
            if (this.f49291q0 == null) {
                this.f49291q0 = new PhoneNumberDesc();
            }
            return this.f49291q0;
        }

        public String getId() {
            return this.f49277d1;
        }

        public String getInternationalPrefix() {
            return this.f49281h1;
        }

        public NumberFormat getIntlNumberFormat(int i10) {
            return (NumberFormat) this.f49300v1.get(i10);
        }

        public int getIntlNumberFormatCount() {
            return this.f49300v1.size();
        }

        public List<NumberFormat> getIntlNumberFormatList() {
            return this.f49300v1;
        }

        public String getLeadingDigits() {
            return this.f49307z1;
        }

        public boolean getMainCountryForCode() {
            return this.f49304x1;
        }

        public PhoneNumberDesc getMobile() {
            return this.f49298u0;
        }

        public boolean getMobileNumberPortableRegion() {
            return this.B1;
        }

        public String getNationalPrefix() {
            return this.f49285l1;
        }

        public String getNationalPrefixForParsing() {
            return this.f49290p1;
        }

        public String getNationalPrefixTransformRule() {
            return this.r1;
        }

        public PhoneNumberDesc getNoInternationalDialling() {
            return this.f49275b1;
        }

        public NumberFormat getNumberFormat(int i10) {
            return (NumberFormat) this.f49299u1.get(i10);
        }

        public int getNumberFormatCount() {
            return this.f49299u1.size();
        }

        public List<NumberFormat> getNumberFormatList() {
            return this.f49299u1;
        }

        public PhoneNumberDesc getPager() {
            return this.L0;
        }

        public PhoneNumberDesc getPersonalNumber() {
            return this.H0;
        }

        public String getPreferredExtnPrefix() {
            return this.f49287n1;
        }

        public String getPreferredInternationalPrefix() {
            return this.f49283j1;
        }

        public PhoneNumberDesc getPremiumRate() {
            return this.f49305y0;
        }

        public boolean getSameMobileAndFixedLinePattern() {
            return this.f49297t1;
        }

        public PhoneNumberDesc getSharedCost() {
            return this.F0;
        }

        public PhoneNumberDesc getShortCode() {
            return this.T0;
        }

        public PhoneNumberDesc getSmsServices() {
            return this.Z0;
        }

        public PhoneNumberDesc getStandardRate() {
            return this.V0;
        }

        public PhoneNumberDesc getTollFree() {
            return this.f49301w0;
        }

        public PhoneNumberDesc getUan() {
            return this.N0;
        }

        public PhoneNumberDesc getVoicemail() {
            return this.R0;
        }

        public PhoneNumberDesc getVoip() {
            return this.J0;
        }

        public boolean hasCarrierSpecific() {
            return this.W0;
        }

        public boolean hasCountryCode() {
            return this.f49278e1;
        }

        public boolean hasEmergency() {
            return this.O0;
        }

        public boolean hasFixedLine() {
            return this.f49293r0;
        }

        public boolean hasGeneralDesc() {
            return this.f49289p0;
        }

        public boolean hasId() {
            return this.f49276c1;
        }

        public boolean hasInternationalPrefix() {
            return this.f49280g1;
        }

        public boolean hasLeadingDigits() {
            return this.f49306y1;
        }

        public boolean hasMainCountryForCode() {
            return this.f49302w1;
        }

        public boolean hasMobile() {
            return this.f49296t0;
        }

        public boolean hasMobileNumberPortableRegion() {
            return this.A1;
        }

        public boolean hasNationalPrefix() {
            return this.f49284k1;
        }

        public boolean hasNationalPrefixForParsing() {
            return this.f49288o1;
        }

        public boolean hasNationalPrefixTransformRule() {
            return this.f49292q1;
        }

        public boolean hasNoInternationalDialling() {
            return this.f49274a1;
        }

        public boolean hasPager() {
            return this.K0;
        }

        public boolean hasPersonalNumber() {
            return this.G0;
        }

        public boolean hasPreferredExtnPrefix() {
            return this.f49286m1;
        }

        public boolean hasPreferredInternationalPrefix() {
            return this.f49282i1;
        }

        public boolean hasPremiumRate() {
            return this.f49303x0;
        }

        public boolean hasSameMobileAndFixedLinePattern() {
            return this.f49295s1;
        }

        public boolean hasSharedCost() {
            return this.E0;
        }

        public boolean hasShortCode() {
            return this.S0;
        }

        public boolean hasSmsServices() {
            return this.Y0;
        }

        public boolean hasStandardRate() {
            return this.U0;
        }

        public boolean hasTollFree() {
            return this.v0;
        }

        public boolean hasUan() {
            return this.M0;
        }

        public boolean hasVoicemail() {
            return this.Q0;
        }

        public boolean hasVoip() {
            return this.I0;
        }

        @Deprecated
        public int intlNumberFormatSize() {
            return getIntlNumberFormatCount();
        }

        @Deprecated
        public List<NumberFormat> intlNumberFormats() {
            return getIntlNumberFormatList();
        }

        public boolean isMainCountryForCode() {
            return this.f49304x1;
        }

        @Deprecated
        public boolean isMobileNumberPortableRegion() {
            return getMobileNumberPortableRegion();
        }

        @Deprecated
        public int numberFormatSize() {
            return getNumberFormatCount();
        }

        @Deprecated
        public List<NumberFormat> numberFormats() {
            return getNumberFormatList();
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) throws IOException {
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                setGeneralDesc(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc2 = new PhoneNumberDesc();
                phoneNumberDesc2.readExternal(objectInput);
                setFixedLine(phoneNumberDesc2);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc3 = new PhoneNumberDesc();
                phoneNumberDesc3.readExternal(objectInput);
                setMobile(phoneNumberDesc3);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc4 = new PhoneNumberDesc();
                phoneNumberDesc4.readExternal(objectInput);
                setTollFree(phoneNumberDesc4);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc5 = new PhoneNumberDesc();
                phoneNumberDesc5.readExternal(objectInput);
                setPremiumRate(phoneNumberDesc5);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc6 = new PhoneNumberDesc();
                phoneNumberDesc6.readExternal(objectInput);
                setSharedCost(phoneNumberDesc6);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc7 = new PhoneNumberDesc();
                phoneNumberDesc7.readExternal(objectInput);
                setPersonalNumber(phoneNumberDesc7);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc8 = new PhoneNumberDesc();
                phoneNumberDesc8.readExternal(objectInput);
                setVoip(phoneNumberDesc8);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc9 = new PhoneNumberDesc();
                phoneNumberDesc9.readExternal(objectInput);
                setPager(phoneNumberDesc9);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc10 = new PhoneNumberDesc();
                phoneNumberDesc10.readExternal(objectInput);
                setUan(phoneNumberDesc10);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc11 = new PhoneNumberDesc();
                phoneNumberDesc11.readExternal(objectInput);
                setEmergency(phoneNumberDesc11);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc12 = new PhoneNumberDesc();
                phoneNumberDesc12.readExternal(objectInput);
                setVoicemail(phoneNumberDesc12);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc13 = new PhoneNumberDesc();
                phoneNumberDesc13.readExternal(objectInput);
                setShortCode(phoneNumberDesc13);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc14 = new PhoneNumberDesc();
                phoneNumberDesc14.readExternal(objectInput);
                setStandardRate(phoneNumberDesc14);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc15 = new PhoneNumberDesc();
                phoneNumberDesc15.readExternal(objectInput);
                setCarrierSpecific(phoneNumberDesc15);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc16 = new PhoneNumberDesc();
                phoneNumberDesc16.readExternal(objectInput);
                setSmsServices(phoneNumberDesc16);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc17 = new PhoneNumberDesc();
                phoneNumberDesc17.readExternal(objectInput);
                setNoInternationalDialling(phoneNumberDesc17);
            }
            setId(objectInput.readUTF());
            setCountryCode(objectInput.readInt());
            setInternationalPrefix(objectInput.readUTF());
            if (objectInput.readBoolean()) {
                setPreferredInternationalPrefix(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                setNationalPrefix(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                setPreferredExtnPrefix(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                setNationalPrefixForParsing(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                setNationalPrefixTransformRule(objectInput.readUTF());
            }
            setSameMobileAndFixedLinePattern(objectInput.readBoolean());
            int i10 = objectInput.readInt();
            for (int i11 = 0; i11 < i10; i11++) {
                NumberFormat numberFormat = new NumberFormat();
                numberFormat.readExternal(objectInput);
                this.f49299u1.add(numberFormat);
            }
            int i12 = objectInput.readInt();
            for (int i13 = 0; i13 < i12; i13++) {
                NumberFormat numberFormat2 = new NumberFormat();
                numberFormat2.readExternal(objectInput);
                this.f49300v1.add(numberFormat2);
            }
            setMainCountryForCode(objectInput.readBoolean());
            if (objectInput.readBoolean()) {
                setLeadingDigits(objectInput.readUTF());
            }
            setMobileNumberPortableRegion(objectInput.readBoolean());
        }

        public PhoneMetadata setCarrierSpecific(PhoneNumberDesc phoneNumberDesc) {
            phoneNumberDesc.getClass();
            this.W0 = true;
            this.X0 = phoneNumberDesc;
            return this;
        }

        public PhoneMetadata setCountryCode(int i10) {
            this.f49278e1 = true;
            this.f49279f1 = i10;
            return this;
        }

        public PhoneMetadata setEmergency(PhoneNumberDesc phoneNumberDesc) {
            phoneNumberDesc.getClass();
            this.O0 = true;
            this.P0 = phoneNumberDesc;
            return this;
        }

        public PhoneMetadata setFixedLine(PhoneNumberDesc phoneNumberDesc) {
            phoneNumberDesc.getClass();
            this.f49293r0 = true;
            this.f49294s0 = phoneNumberDesc;
            return this;
        }

        public PhoneMetadata setGeneralDesc(PhoneNumberDesc phoneNumberDesc) {
            phoneNumberDesc.getClass();
            this.f49289p0 = true;
            this.f49291q0 = phoneNumberDesc;
            return this;
        }

        public PhoneMetadata setId(String str) {
            this.f49276c1 = true;
            this.f49277d1 = str;
            return this;
        }

        public PhoneMetadata setInternationalPrefix(String str) {
            this.f49280g1 = true;
            this.f49281h1 = str;
            return this;
        }

        public PhoneMetadata setLeadingDigits(String str) {
            this.f49306y1 = true;
            this.f49307z1 = str;
            return this;
        }

        public PhoneMetadata setMainCountryForCode(boolean z10) {
            this.f49302w1 = true;
            this.f49304x1 = z10;
            return this;
        }

        public PhoneMetadata setMobile(PhoneNumberDesc phoneNumberDesc) {
            phoneNumberDesc.getClass();
            this.f49296t0 = true;
            this.f49298u0 = phoneNumberDesc;
            return this;
        }

        public PhoneMetadata setMobileNumberPortableRegion(boolean z10) {
            this.A1 = true;
            this.B1 = z10;
            return this;
        }

        public PhoneMetadata setNationalPrefix(String str) {
            this.f49284k1 = true;
            this.f49285l1 = str;
            return this;
        }

        public PhoneMetadata setNationalPrefixForParsing(String str) {
            this.f49288o1 = true;
            this.f49290p1 = str;
            return this;
        }

        public PhoneMetadata setNationalPrefixTransformRule(String str) {
            this.f49292q1 = true;
            this.r1 = str;
            return this;
        }

        public PhoneMetadata setNoInternationalDialling(PhoneNumberDesc phoneNumberDesc) {
            phoneNumberDesc.getClass();
            this.f49274a1 = true;
            this.f49275b1 = phoneNumberDesc;
            return this;
        }

        public PhoneMetadata setPager(PhoneNumberDesc phoneNumberDesc) {
            phoneNumberDesc.getClass();
            this.K0 = true;
            this.L0 = phoneNumberDesc;
            return this;
        }

        public PhoneMetadata setPersonalNumber(PhoneNumberDesc phoneNumberDesc) {
            phoneNumberDesc.getClass();
            this.G0 = true;
            this.H0 = phoneNumberDesc;
            return this;
        }

        public PhoneMetadata setPreferredExtnPrefix(String str) {
            this.f49286m1 = true;
            this.f49287n1 = str;
            return this;
        }

        public PhoneMetadata setPreferredInternationalPrefix(String str) {
            this.f49282i1 = true;
            this.f49283j1 = str;
            return this;
        }

        public PhoneMetadata setPremiumRate(PhoneNumberDesc phoneNumberDesc) {
            phoneNumberDesc.getClass();
            this.f49303x0 = true;
            this.f49305y0 = phoneNumberDesc;
            return this;
        }

        public PhoneMetadata setSameMobileAndFixedLinePattern(boolean z10) {
            this.f49295s1 = true;
            this.f49297t1 = z10;
            return this;
        }

        public PhoneMetadata setSharedCost(PhoneNumberDesc phoneNumberDesc) {
            phoneNumberDesc.getClass();
            this.E0 = true;
            this.F0 = phoneNumberDesc;
            return this;
        }

        public PhoneMetadata setShortCode(PhoneNumberDesc phoneNumberDesc) {
            phoneNumberDesc.getClass();
            this.S0 = true;
            this.T0 = phoneNumberDesc;
            return this;
        }

        public PhoneMetadata setSmsServices(PhoneNumberDesc phoneNumberDesc) {
            phoneNumberDesc.getClass();
            this.Y0 = true;
            this.Z0 = phoneNumberDesc;
            return this;
        }

        public PhoneMetadata setStandardRate(PhoneNumberDesc phoneNumberDesc) {
            phoneNumberDesc.getClass();
            this.U0 = true;
            this.V0 = phoneNumberDesc;
            return this;
        }

        public PhoneMetadata setTollFree(PhoneNumberDesc phoneNumberDesc) {
            phoneNumberDesc.getClass();
            this.v0 = true;
            this.f49301w0 = phoneNumberDesc;
            return this;
        }

        public PhoneMetadata setUan(PhoneNumberDesc phoneNumberDesc) {
            phoneNumberDesc.getClass();
            this.M0 = true;
            this.N0 = phoneNumberDesc;
            return this;
        }

        public PhoneMetadata setVoicemail(PhoneNumberDesc phoneNumberDesc) {
            phoneNumberDesc.getClass();
            this.Q0 = true;
            this.R0 = phoneNumberDesc;
            return this;
        }

        public PhoneMetadata setVoip(PhoneNumberDesc phoneNumberDesc) {
            phoneNumberDesc.getClass();
            this.I0 = true;
            this.J0 = phoneNumberDesc;
            return this;
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeBoolean(this.f49289p0);
            if (this.f49289p0) {
                this.f49291q0.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f49293r0);
            if (this.f49293r0) {
                this.f49294s0.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f49296t0);
            if (this.f49296t0) {
                this.f49298u0.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.v0);
            if (this.v0) {
                this.f49301w0.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f49303x0);
            if (this.f49303x0) {
                this.f49305y0.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.E0);
            if (this.E0) {
                this.F0.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.G0);
            if (this.G0) {
                this.H0.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.I0);
            if (this.I0) {
                this.J0.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.K0);
            if (this.K0) {
                this.L0.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.M0);
            if (this.M0) {
                this.N0.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.O0);
            if (this.O0) {
                this.P0.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.Q0);
            if (this.Q0) {
                this.R0.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.S0);
            if (this.S0) {
                this.T0.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.U0);
            if (this.U0) {
                this.V0.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.W0);
            if (this.W0) {
                this.X0.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.Y0);
            if (this.Y0) {
                this.Z0.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f49274a1);
            if (this.f49274a1) {
                this.f49275b1.writeExternal(objectOutput);
            }
            objectOutput.writeUTF(this.f49277d1);
            objectOutput.writeInt(this.f49279f1);
            objectOutput.writeUTF(this.f49281h1);
            objectOutput.writeBoolean(this.f49282i1);
            if (this.f49282i1) {
                objectOutput.writeUTF(this.f49283j1);
            }
            objectOutput.writeBoolean(this.f49284k1);
            if (this.f49284k1) {
                objectOutput.writeUTF(this.f49285l1);
            }
            objectOutput.writeBoolean(this.f49286m1);
            if (this.f49286m1) {
                objectOutput.writeUTF(this.f49287n1);
            }
            objectOutput.writeBoolean(this.f49288o1);
            if (this.f49288o1) {
                objectOutput.writeUTF(this.f49290p1);
            }
            objectOutput.writeBoolean(this.f49292q1);
            if (this.f49292q1) {
                objectOutput.writeUTF(this.r1);
            }
            objectOutput.writeBoolean(this.f49297t1);
            int iNumberFormatSize = numberFormatSize();
            objectOutput.writeInt(iNumberFormatSize);
            for (int i10 = 0; i10 < iNumberFormatSize; i10++) {
                ((NumberFormat) this.f49299u1.get(i10)).writeExternal(objectOutput);
            }
            int iIntlNumberFormatSize = intlNumberFormatSize();
            objectOutput.writeInt(iIntlNumberFormatSize);
            for (int i11 = 0; i11 < iIntlNumberFormatSize; i11++) {
                ((NumberFormat) this.f49300v1.get(i11)).writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.f49304x1);
            objectOutput.writeBoolean(this.f49306y1);
            if (this.f49306y1) {
                objectOutput.writeUTF(this.f49307z1);
            }
            objectOutput.writeBoolean(this.B1);
        }
    }

    public static class NumberFormat implements Externalizable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public boolean f49265p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f49267r0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f49270u0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public boolean f49271w0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public boolean f49273y0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public String f49266q0 = "";

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public String f49268s0 = "";

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final ArrayList f49269t0 = new ArrayList();
        public String v0 = "";

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public boolean f49272x0 = false;
        public String E0 = "";

        public static Builder newBuilder() {
            return new Builder();
        }

        public NumberFormat addLeadingDigitsPattern(String str) {
            str.getClass();
            this.f49269t0.add(str);
            return this;
        }

        public NumberFormat clearNationalPrefixFormattingRule() {
            this.f49270u0 = false;
            this.v0 = "";
            return this;
        }

        public String getDomesticCarrierCodeFormattingRule() {
            return this.E0;
        }

        public String getFormat() {
            return this.f49268s0;
        }

        public String getLeadingDigitsPattern(int i10) {
            return (String) this.f49269t0.get(i10);
        }

        public int getLeadingDigitsPatternCount() {
            return this.f49269t0.size();
        }

        public String getNationalPrefixFormattingRule() {
            return this.v0;
        }

        public boolean getNationalPrefixOptionalWhenFormatting() {
            return this.f49272x0;
        }

        public String getPattern() {
            return this.f49266q0;
        }

        public boolean hasDomesticCarrierCodeFormattingRule() {
            return this.f49273y0;
        }

        public boolean hasFormat() {
            return this.f49267r0;
        }

        public boolean hasNationalPrefixFormattingRule() {
            return this.f49270u0;
        }

        public boolean hasNationalPrefixOptionalWhenFormatting() {
            return this.f49271w0;
        }

        public boolean hasPattern() {
            return this.f49265p0;
        }

        public List<String> leadingDigitPatterns() {
            return this.f49269t0;
        }

        @Deprecated
        public int leadingDigitsPatternSize() {
            return getLeadingDigitsPatternCount();
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) throws IOException {
            setPattern(objectInput.readUTF());
            setFormat(objectInput.readUTF());
            int i10 = objectInput.readInt();
            for (int i11 = 0; i11 < i10; i11++) {
                this.f49269t0.add(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                setNationalPrefixFormattingRule(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                setDomesticCarrierCodeFormattingRule(objectInput.readUTF());
            }
            setNationalPrefixOptionalWhenFormatting(objectInput.readBoolean());
        }

        public NumberFormat setDomesticCarrierCodeFormattingRule(String str) {
            this.f49273y0 = true;
            this.E0 = str;
            return this;
        }

        public NumberFormat setFormat(String str) {
            this.f49267r0 = true;
            this.f49268s0 = str;
            return this;
        }

        public NumberFormat setNationalPrefixFormattingRule(String str) {
            this.f49270u0 = true;
            this.v0 = str;
            return this;
        }

        public NumberFormat setNationalPrefixOptionalWhenFormatting(boolean z10) {
            this.f49271w0 = true;
            this.f49272x0 = z10;
            return this;
        }

        public NumberFormat setPattern(String str) {
            this.f49265p0 = true;
            this.f49266q0 = str;
            return this;
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeUTF(this.f49266q0);
            objectOutput.writeUTF(this.f49268s0);
            int iLeadingDigitsPatternSize = leadingDigitsPatternSize();
            objectOutput.writeInt(iLeadingDigitsPatternSize);
            for (int i10 = 0; i10 < iLeadingDigitsPatternSize; i10++) {
                objectOutput.writeUTF((String) this.f49269t0.get(i10));
            }
            objectOutput.writeBoolean(this.f49270u0);
            if (this.f49270u0) {
                objectOutput.writeUTF(this.v0);
            }
            objectOutput.writeBoolean(this.f49273y0);
            if (this.f49273y0) {
                objectOutput.writeUTF(this.E0);
            }
            objectOutput.writeBoolean(this.f49272x0);
        }

        public static final class Builder extends NumberFormat {
            public Builder mergeFrom(NumberFormat numberFormat) {
                if (numberFormat.hasPattern()) {
                    setPattern(numberFormat.getPattern());
                }
                if (numberFormat.hasFormat()) {
                    setFormat(numberFormat.getFormat());
                }
                for (int i10 = 0; i10 < numberFormat.leadingDigitsPatternSize(); i10++) {
                    addLeadingDigitsPattern(numberFormat.getLeadingDigitsPattern(i10));
                }
                if (numberFormat.hasNationalPrefixFormattingRule()) {
                    setNationalPrefixFormattingRule(numberFormat.getNationalPrefixFormattingRule());
                }
                if (numberFormat.hasDomesticCarrierCodeFormattingRule()) {
                    setDomesticCarrierCodeFormattingRule(numberFormat.getDomesticCarrierCodeFormattingRule());
                }
                if (numberFormat.hasNationalPrefixOptionalWhenFormatting()) {
                    setNationalPrefixOptionalWhenFormatting(numberFormat.getNationalPrefixOptionalWhenFormatting());
                }
                return this;
            }

            public NumberFormat build() {
                return this;
            }
        }
    }

    public static class PhoneMetadataCollection implements Externalizable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ArrayList f49308p0 = new ArrayList();

        public static Builder newBuilder() {
            return new Builder();
        }

        public PhoneMetadataCollection addMetadata(PhoneMetadata phoneMetadata) {
            phoneMetadata.getClass();
            this.f49308p0.add(phoneMetadata);
            return this;
        }

        public PhoneMetadataCollection clear() {
            this.f49308p0.clear();
            return this;
        }

        public int getMetadataCount() {
            return this.f49308p0.size();
        }

        public List<PhoneMetadata> getMetadataList() {
            return this.f49308p0;
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) throws IOException {
            int i10 = objectInput.readInt();
            for (int i11 = 0; i11 < i10; i11++) {
                PhoneMetadata phoneMetadata = new PhoneMetadata();
                phoneMetadata.readExternal(objectInput);
                this.f49308p0.add(phoneMetadata);
            }
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            int metadataCount = getMetadataCount();
            objectOutput.writeInt(metadataCount);
            for (int i10 = 0; i10 < metadataCount; i10++) {
                ((PhoneMetadata) this.f49308p0.get(i10)).writeExternal(objectOutput);
            }
        }

        public static final class Builder extends PhoneMetadataCollection {
            public PhoneMetadataCollection build() {
                return this;
            }
        }
    }

    public static class PhoneNumberDesc implements Externalizable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public boolean f49309p0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f49313t0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public String f49310q0 = "";

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final ArrayList f49311r0 = new ArrayList();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final ArrayList f49312s0 = new ArrayList();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public String f49314u0 = "";

        public static Builder newBuilder() {
            return new Builder();
        }

        public PhoneNumberDesc addPossibleLength(int i10) {
            this.f49311r0.add(Integer.valueOf(i10));
            return this;
        }

        public PhoneNumberDesc addPossibleLengthLocalOnly(int i10) {
            this.f49312s0.add(Integer.valueOf(i10));
            return this;
        }

        public PhoneNumberDesc clearExampleNumber() {
            this.f49313t0 = false;
            this.f49314u0 = "";
            return this;
        }

        public PhoneNumberDesc clearNationalNumberPattern() {
            this.f49309p0 = false;
            this.f49310q0 = "";
            return this;
        }

        public PhoneNumberDesc clearPossibleLength() {
            this.f49311r0.clear();
            return this;
        }

        public PhoneNumberDesc clearPossibleLengthLocalOnly() {
            this.f49312s0.clear();
            return this;
        }

        public boolean exactlySameAs(PhoneNumberDesc phoneNumberDesc) {
            return this.f49310q0.equals(phoneNumberDesc.f49310q0) && this.f49311r0.equals(phoneNumberDesc.f49311r0) && this.f49312s0.equals(phoneNumberDesc.f49312s0) && this.f49314u0.equals(phoneNumberDesc.f49314u0);
        }

        public String getExampleNumber() {
            return this.f49314u0;
        }

        public String getNationalNumberPattern() {
            return this.f49310q0;
        }

        public int getPossibleLength(int i10) {
            return ((Integer) this.f49311r0.get(i10)).intValue();
        }

        public int getPossibleLengthCount() {
            return this.f49311r0.size();
        }

        public List<Integer> getPossibleLengthList() {
            return this.f49311r0;
        }

        public int getPossibleLengthLocalOnly(int i10) {
            return ((Integer) this.f49312s0.get(i10)).intValue();
        }

        public int getPossibleLengthLocalOnlyCount() {
            return this.f49312s0.size();
        }

        public List<Integer> getPossibleLengthLocalOnlyList() {
            return this.f49312s0;
        }

        public boolean hasExampleNumber() {
            return this.f49313t0;
        }

        public boolean hasNationalNumberPattern() {
            return this.f49309p0;
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) throws IOException {
            if (objectInput.readBoolean()) {
                setNationalNumberPattern(objectInput.readUTF());
            }
            int i10 = objectInput.readInt();
            for (int i11 = 0; i11 < i10; i11++) {
                this.f49311r0.add(Integer.valueOf(objectInput.readInt()));
            }
            int i12 = objectInput.readInt();
            for (int i13 = 0; i13 < i12; i13++) {
                this.f49312s0.add(Integer.valueOf(objectInput.readInt()));
            }
            if (objectInput.readBoolean()) {
                setExampleNumber(objectInput.readUTF());
            }
        }

        public PhoneNumberDesc setExampleNumber(String str) {
            this.f49313t0 = true;
            this.f49314u0 = str;
            return this;
        }

        public PhoneNumberDesc setNationalNumberPattern(String str) {
            this.f49309p0 = true;
            this.f49310q0 = str;
            return this;
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeBoolean(this.f49309p0);
            if (this.f49309p0) {
                objectOutput.writeUTF(this.f49310q0);
            }
            int possibleLengthCount = getPossibleLengthCount();
            objectOutput.writeInt(possibleLengthCount);
            for (int i10 = 0; i10 < possibleLengthCount; i10++) {
                objectOutput.writeInt(((Integer) this.f49311r0.get(i10)).intValue());
            }
            int possibleLengthLocalOnlyCount = getPossibleLengthLocalOnlyCount();
            objectOutput.writeInt(possibleLengthLocalOnlyCount);
            for (int i11 = 0; i11 < possibleLengthLocalOnlyCount; i11++) {
                objectOutput.writeInt(((Integer) this.f49312s0.get(i11)).intValue());
            }
            objectOutput.writeBoolean(this.f49313t0);
            if (this.f49313t0) {
                objectOutput.writeUTF(this.f49314u0);
            }
        }

        public static final class Builder extends PhoneNumberDesc {
            public Builder mergeFrom(PhoneNumberDesc phoneNumberDesc) {
                if (phoneNumberDesc.hasNationalNumberPattern()) {
                    setNationalNumberPattern(phoneNumberDesc.getNationalNumberPattern());
                }
                for (int i10 = 0; i10 < phoneNumberDesc.getPossibleLengthCount(); i10++) {
                    addPossibleLength(phoneNumberDesc.getPossibleLength(i10));
                }
                for (int i11 = 0; i11 < phoneNumberDesc.getPossibleLengthLocalOnlyCount(); i11++) {
                    addPossibleLengthLocalOnly(phoneNumberDesc.getPossibleLengthLocalOnly(i11));
                }
                if (phoneNumberDesc.hasExampleNumber()) {
                    setExampleNumber(phoneNumberDesc.getExampleNumber());
                }
                return this;
            }

            public PhoneNumberDesc build() {
                return this;
            }
        }
    }
}
