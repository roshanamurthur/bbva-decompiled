import{z as e,an as t,L as a,ak as r,h as i,ck as s,bF as o,i as n}from"./952f98a9.js";import{M as l,v as m,L as b,f as c,Q as d,G as p,a4 as h,a9 as u,V as f,a3 as y,D as g,R as v,S as _,ah as $,e as x,K as D}from"./216055dc.js";import{B as C,a as S}from"./14c2fefc.js";import{B as E,b as M}from"./30ef6f1f.js";import{B as I}from"./c6d24711.js";import"./ff2cdeea.js";import"./7f3d7ca9.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./2b04e291.js";import"./854beed0.js";import"./84dff06e.js";var R=e`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

.cta {
  margin: 1rem 0 0;
}

.form-input-container {
  margin-bottom: 1rem;
}

.notification-message-container {
  margin-bottom: 1.5rem;
  margin-top: 1.5rem;
  padding-right: 2rem;
}
`;class k extends(l(m(b(t(a))))){static get is(){return"member-get-member-personal"}static get scopedElements(){const e=[E,c,d,p,h,...k.configurationScopedElements()];return k.scopedElementsFromClasses(e)}static get properties(){return{personalInformation:{type:Object},_ctaDisabled:{type:Boolean},titleStep:{type:String},descriptionStep:{type:String},calendarData:{type:Object}}}constructor(){super(),this.reset(),this.personalInformation={},this._ctaDisabled=!1,this.titleStep="",this.descriptionStep=""}static get styles(){return[R,u.primary,u.primaryAlt,f.primary,f.primaryAlt,M.primary,M.primaryAlt,y.primary,y.primaryAlt,g.primary,g.primaryAlt,r("member-get-member-personal-shared-styles")]}reset(){this._resetFields(),this.personalInformation={},this._ctaDisabled=!0,this.calendarData={}}_resetFields(){[...this.shadowRoot.querySelectorAll('[data-tag-name^="bbva-form"]')].forEach((e=>{e.value=""}))}firstUpdated(e){super.firstUpdated(e),this._birthdayField=this.shadowRoot.querySelector('[name="birthday"]')}async updated(e){super.updated(e),e.has("calendarData")&&Object.keys(this.calendarData).length&&(this._birthdayField.value=this.calendarData.selectedDate,await this.requestUpdate(),this._saveBirthDay({target:{name:"birthday",value:this.calendarData.selectedDate}}),this._validatePersonalInformation())}get _titleStep(){return""!==this.titleStep?i` 
      <bbva-header-category 
        text="${this.titleStep}"
        ambient="${this.ambient}"
        heading-level="1"
        >
      </bbva-header-category>
    `:""}get _descriptionStep(){return""!==this.descriptionStep?i`
      <bbva-type-text 
        text="${this.descriptionStep}"
        ambient="${this.ambient}"
        >
      </bbva-type-text>
    `:""}render(){return i`
      ${this._titleStep}
      ${this._descriptionStep}
      <bbva-form-input class="form-input-container"
        name="name"
        type="text"
        ambient="${this.ambient}"
        label="${this.t("bbva-feature-member-get-member-personal-field-name-label")}"
        pattern="^[a-zA-ZáãäéëêíîóöúüñÑçÁÉÍÓÚ\\- ]{2,100}$"
        @form-input-value-change="${this._savePersonalInformation}"
        @form-field-input-validate="${this._validatePersonalInformation}"
        error-message="${this.t("bbva-feature-member-get-member-personal-field-text-error-message")}"
        auto-validate>
      </bbva-form-input>

      <bbva-form-input class="form-input-container"
        name="firstLastName"
        type="text"
        ambient="${this.ambient}"
        label="${this.t("bbva-feature-member-get-member-personal-field-first-name-label")}"
        pattern="^[a-zA-ZáãäéëêíîóöúüñÑçÁÉÍÓÚ\\- ]{2,100}$"
        @form-input-value-change="${this._savePersonalInformation}"
        @form-field-input-validate="${this._validatePersonalInformation}"
        error-message="${this.t("bbva-feature-member-get-member-personal-field-text-error-message")}"    
        auto-validate>
      </bbva-form-input>

      <bbva-form-input class="form-input-container"
        name="secondLastName"
        type="text"
        ambient="${this.ambient}"
        label="${this.t("bbva-feature-member-get-member-personal-field-last-name-label")}"
        pattern="^[a-zA-ZáãäéëêíîóöúüñÑçÁÉÍÓÚ\\- ]{2,100}$"
        @form-input-value-change="${this._savePersonalInformation}"
        @form-field-input-validate="${this._validatePersonalInformation}"   
        error-message="${this.t("bbva-feature-member-get-member-personal-field-text-error-message")}"  
        auto-validate>
      </bbva-form-input>

      <bbva-form-input class="form-input-container"
        name="email"
        type="text"
        ambient="${this.ambient}"
        label="${this.t("bbva-feature-member-get-member-personal-field-email-address-label")}"
        error-message="${this.t("bbva-feature-member-get-member-personal-field-email-error-message")}"
        pattern="((^|, )(^[a-zA-Z0-9_.+]{4,}@[a-zA-Z0-9]+\\.[a-zA-Z0-9]{2,3}|^[a-zA-Z0-9_.+]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]{2,3}\\.[a-zA-Z0-9]{2,3}))+$"
        @form-input-value-change="${this._savePersonalInformation}"
        @form-field-input-validate="${this._validatePersonalInformation}"
        auto-validate
        >
      </bbva-form-input>

      <bbva-form-input class="form-input-container"
        name="birthday"
        type="date"
        ambient="${this.ambient}"
        min="${this._calculateMinDate}"
        max="${this._calculateMaxDate}"
        label="${this.t("bbva-feature-member-get-member-personal-field-birth-date-label")}"
        @form-input-value-change="${this._saveBirthDay}"
        @form-field-input-validate="${this._validatePersonalInformation}"
        pattern="d{2}-d{2}-d{4}"
        @click=${this._launchCalendar}
        error-message="${this.t("bbva-feature-member-get-member-personal-field-date-error-message")}"  
        auto-validate
        >
      </bbva-form-input>

      <bbva-notification-message class="notification-message-container">
        ${this.t("bbva-feature-member-get-member-personal-notification-message")}
      </bbva-notification-message>

      ${this.cta(this.t("bbva-feature-member-get-member-personal-step-cta"),this._onClickCta.bind(this,this.personalInformation))}
    `}get _currentDate(){const e=new Date,t=e.getDate().toString().padStart(2,"0"),a=(e.getMonth()+1).toString().padStart(2,"0");return{year:e.getFullYear(),month:a,day:t}}get _calculateMinDate(){return`${this._currentDate.year-99}-01-01`}get _calculateMaxDate(){return`${this._currentDate.year}-${this._currentDate.month}-${this._currentDate.day}`}async _validatePersonalInformation(){await this.requestUpdate();const{personalInformation:e}=this,t=[...this.shadowRoot.querySelectorAll('[data-tag-name^="bbva-form"]')];this._ctaDisabled=this._hasInvalidInputs(t)||this._hasEmptyValues(e,t)}_hasInvalidInputs(e){return e.some((e=>e.invalid))}_hasEmptyValues(e,t){const a=Object.values(e);return!a.length||a.length<t.length||a.some((e=>""===e))}_savePersonalInformation(e){const{name:t,value:a}=e.target,{personalInformation:r}=this;this.personalInformation={...r,[t]:a}}async _saveBirthDay(e){const{value:t}=e.target;if(t){const e=new Date(t),a=new Date;a.setFullYear(a.getFullYear()-18),a<=e&&(await this.requestUpdate(),this._birthdayField.invalid=!0)}this._savePersonalInformation(e)}cta(e,t){return i`
      <bbva-button-default
        class="cta"
        ambient="${this.ambient}"
        fullwidth
        text="${e}"
        ?disabled="${this._ctaDisabled}"
        @click=${t}
      >
      </bbva-button-default>`}_onClickCta(e){this.dispatchEvent(new CustomEvent("cta-clicked",{bubbles:!0,composed:!0,detail:e}))}_launchCalendar(){const e={dateFormat:"yyyy-MM-dd",defaultDate:this._calculateMaxDate,minDate:this._calculateMinDate,maxDate:this._calculateMaxDate};this.dispatchEvent(new CustomEvent("launch-date-picker",{bubbles:!0,composed:!0,detail:e}))}}customElements.define(k.is,k);var w=e`:host {
  display: block;
  box-sizing: border-box;
  --bbva-transition-container--custom--primary-ambient--content-bg-color: ${v("colorPrimarySurfaceAmbientDefault",_)};
  --bbva-progress-content-z-index: 11;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

.content-container {
  padding: 1rem;
}

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container-padding: 0;
  --bbva-transition-container-padding-bottom: 0;
  --bbva-transition-container-text-align: normal;
}
`;class A extends(l(m(b(t(a))))){static get is(){return"bbva-feature-member-get-member-payroll-portability"}static get scopedElements(){const e=[c,p,k,$,C,x,D,S,...A.configurationScopedElements()];return A.scopedElementsFromClasses(e)}static get properties(){return{offerId:{type:String,attribute:"offer-id"},loyaltyApiVersion:{type:String,attribute:"loyalty-api-version"},personalInformation:{type:Object},receiptData:{type:Object},_receiptVisible:{type:Boolean},_isErrorModalOpen:{type:Boolean},modalRetryCounters:{type:Object},maxRetries:{type:Number},_modalSettings:{type:Object},_typeModal:{type:String},customerId:{type:String},calendarData:{type:Object},referredUsers:{type:Number}}}constructor(){super(),this._headerButtons=[{id:"btn-menu",icon:s(),accessibilityText:"Menu",accessibilityNotificationText:"There are notifications"}],this._headerReceiptButtons=[{id:"btn-close",icon:o(),accessibilityText:"Close",accessibilityNotificationText:"There are notifications"}],this.config={header:{variant:"first-level-sequential",text:this.t("bbva-feature-member-get-member-payroll-portability-header-title"),buttons:this._headerButtons,showLeftICon:!0,"@header-main-icon-click":this._onClickHeaderIconForm.bind(this)},loader:!0,notify:!1,back:!1},this.offerId="",this.ambient="primary",this.loyaltyApiVersion="0",this.receiptData={},this._resetProperties(),this.modalRetryCounters={referredRegistrationErrorRetry:0},this.maxRetries=3,this._modalSettings={referredRegistrationErrorRetry:{hideContentPaddingTop:!0,headerText:"bbva-feature-member-get-member-payroll-portability-half-modal-error-header-text",titleIcon:"bbva:warning",modalType:"warning",bodyText:"bbva-feature-member-get-member-payroll-portability-half-modal-error-body-text",buttonText:"bbva-feature-member-get-member-payroll-portability-half-modal-error-button-text"},referredRegistrationError:{fullHeight:!0,fixedFooter:!0,titleIcon:!1,headerText:"bbva-feature-member-get-member-payroll-portability-header-title",buttonText:"bbva-feature-member-get-member-payroll-portability-register-error-button-text",slotContent:{microillustration:"error",titleText:"bbva-feature-member-get-member-payroll-portability-register-error-title",bodyText:"bbva-feature-member-get-member-payroll-portability-register-error-body-text"}}},this._isErrorModalOpen=!1,this.customerId="",this.referredUsers=0}static get styles(){return[w,f.primary,g.primary,u.primary,u.primaryAlt,r("bbva-feature-member-get-member-payroll-portability-shared-styles")]}firstUpdated(e){super.firstUpdated(e),this._showForm(),this._referralMembersApiDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-referral-members-api-dm"]')}updated(e){super.updated(e)}reset(){this._resetProperties(),this._resetPages(),this._showForm()}requestClientId(){this.dispatchEvent(new CustomEvent("global-get-from-storage",{detail:{key:"loginData",secure:!0},bubbles:!0,composed:!0}))}_resetProperties(){this.receiptData={},this.personalInformation={},this.calendarData={}}_resetPages(){const e=this.shadowRoot.querySelectorAll('[data-tag-name^="member-get-member-"]');Array.prototype.slice.call(e).forEach((e=>e.reset()))}render(){return i`
      ${super.render()}

      <bbva-global-referral-members-api-dm
        id="referralMembers"
        host="${this.host}"
        ?native="${this.native}"
        requiredToken="${this.requiredToken}"
        version="${this.loyaltyApiVersion}"
        cachetype="NONE"
        @referral-members-api-dm-create="${this._onCreateReferralMembersApiDm}"
        @referral-members-api-dm-create-error="${this._onCreateErrorReferralMembersApiDm}"
        @api-dm-error="${this._onCreateErrorReferralMembersApiDm}">
      </bbva-global-referral-members-api-dm>

      ${this._getFormTemplate}

      ${this._getReceiptTemplate}   

      ${this._showModalErrorReferralMembers}
    `}_onFiredCalendar(e){this.dispatchEvent(new CustomEvent("launch-date-picker",e.detail))}get _getFormTemplate(){return i`
      <div class="content-container">
        <member-get-member-personal
          .titleStep="${this.t("bbva-feature-member-get-member-payroll-portability-title-step")}"
          .descriptionStep="${this.t("bbva-feature-member-get-member-payroll-portability-description-step")}"
          ambient="${this.ambient}"
          @cta-clicked="${this._onClickCtaPersonalStep}"
          .calendarData="${this.calendarData}"
          @launch-date-picker="${this._onFiredCalendar}">
        </member-get-member-personal>
      </div>
    `}get _getReceiptTemplate(){return i`
      <bbva-transition-container
        header-type="first-level-sequential"
        header-text="${this.t("bbva-feature-member-get-member-payroll-portability-header-title")}"
        .headerButtons="${this._headerReceiptButtons}"
        ?visible="${this._receiptVisible}"
        ambient="${this.ambient}"
        @header-main-icon-click="${this._onClickHeaderMainIconReceipt}">
        <div slot="slot-content" class="slot-content">
          <bbva-widget-member-get-member-receipt
            .receiptData="${this.receiptData}"
            data-acoustic-obfuscate
            ambient="light100"
            @cta-clicked-button-default-payroll-portability="${this._onClickCtaReceipt}">
          </bbva-widget-member-get-member-receipt>
        </div>
      </bbva-transition-container>
    `}_isModalCloseClick(){this._isErrorModalOpen=!1}_modalCloseEvents(e){const t=e.type,a={"help-modal-footer-button-click":()=>{this._isModalCloseClick()},"help-modal-header-click":()=>{this._isModalCloseClick()}};a[t]&&a[t]()}get _showModalErrorReferralMembers(){return i`
      <bbva-help-modal
        id="modal"
        ?visible="${this._isErrorModalOpen}"
        @help-modal-footer-button-click="${this._modalCloseEvents}"
        @help-modal-header-click="${this._modalCloseEvents}">
        ${this._slotContent}
      </bbva-help-modal>
    `}get _slotContent(){var e;const t=null===(e=this._modalSettings[this._typeModal])||void 0===e?void 0:e.slotContent;return t?i`
      <span slot="slot-content">
        <bbva-clip-microillustration microillustration="${n(t.microillustration)}"></bbva-clip-microillustration>
        <bbva-type-text size="3XL" font-weight="700" text="${n(t.titleText)}"></bbva-type-text>
        <bbva-type-text size="S" text="${n(t.bodyText)}"></bbva-type-text>
      </span>
    `:""}_onClickHeaderIconForm(e){const{index:t}=e.detail,a=t?"menu-clicked":"exit-clicked";this.dispatchEvent(new CustomEvent(`member-get-member-payroll-portability-${a}`,{bubbles:!0,composed:!0})),this.reset()}_onClickHeaderMainIconReceipt(){this.dispatchEvent(new CustomEvent("member-get-member-payroll-portability-exit-clicked",{bubbles:!0,composed:!0})),this.reset()}_showForm(){this._receiptVisible=!1,this.dispatchEvent(new CustomEvent("member-get-member-payroll-portability-form-loaded",{bubbles:!0,composed:!0,detail:this.referredUsers}))}_showReceipt(){this._receiptVisible=!0,this.referredUsers+=1,this.dispatchEvent(new CustomEvent("member-get-member-payroll-portability-receipt-loaded",{bubbles:!0,composed:!0,detail:this.referredUsers}))}_onClickCtaPersonalStep(e){this.personalInformation=e.detail,this.showLoader("transparent");const t=this._createReferralMemderBody();this._referralMembersApiDm.postReferralMembers(t)}_onCreateReferralMembersApiDm(e){this.receiptData=this._createReceiptData(e.detail),this.clearLoader(),this._showReceipt()}_clearModal(e){const t=e,a=this._modalSettings[this._typeModal]||{};Object.keys(a).forEach((e=>{t[e]=""}))}_setModal(){const e=this.shadowRoot.getElementById("modal"),t=this._modalSettings[this._typeModal]||{},a=Object.keys(t);this._clearModal(e),0!==a.length&&a.forEach((a=>{e[a]=this.t(t[a])})),this._isErrorModalOpen=!0}_onCreateErrorReferralMembersApiDm(){this.clearLoader(),this.modalRetryCounters.referredRegistrationErrorRetry+=1,this.modalRetryCounters.referredRegistrationErrorRetry<=this.maxRetries?(this._typeModal="referredRegistrationErrorRetry",this._setModal()):(this._typeModal="referredRegistrationError",this._setModal())}_createReferralMemderBody(){return{firstName:this.personalInformation.name,lastName:this.personalInformation.firstLastName,secondLastName:this.personalInformation.secondLastName,contactDetails:[{contact:{contactDetailType:"EMAIL",address:this.personalInformation.email}}],relatedParticipant:{customerId:this.customerId.grantingTicketUserId||this.customerId},birthData:{birthDate:this.personalInformation.birthday},origin:{id:"MGMPORTA"},offer:{id:this.offerId}}}_createReceiptData(e){const{firstName:t,lastName:a,secondLastName:r,contactDetails:i,birthData:s}=e;return{headerContent:{microillustration:{name:"success",size:"M"},textContent:[{text:"bbva-feature-member-get-member-payroll-portability-receipt-success-title",size:"3XL",fontWeight:"700"},{text:`${(new Date).toLocaleDateString("es-ES",{year:"numeric",month:"long",day:"2-digit",hour:"2-digit",minute:"2-digit",hour12:!1})}h`,size:"S",fontStyle:"italic",inherit:!0},{text:"bbva-feature-member-get-member-payroll-portability-receipt-success-info",size:"S"}]},summaryHeader:{text:"bbva-feature-member-get-member-payroll-portability-receipt-summary-title",fontWeight:"500"},summaryContent:[[{text:"bbva-feature-member-get-member-payroll-portability-receipt-user-data-name",size:"S",inherit:!0},{text:`${t} ${a} ${r}`,size:"S",inherit:!0}],[{text:"bbva-feature-member-get-member-payroll-portability-receipt-user-data-mail",size:"S",inherit:!0},{text:i.find((e=>{var t;return"EMAIL"===(null==e||null===(t=e.contact)||void 0===t?void 0:t.contactDetailType)})).contact.address,size:"S",inherit:!0,obfuscate:!0}],[{text:"bbva-feature-member-get-member-payroll-portability-receipt-user-data-date",size:"S",inherit:!0},{text:new Date(`${s.birthDate}T00:00:00`).toLocaleDateString("es-ES",{year:"numeric",month:"2-digit",day:"2-digit"}),size:"S",inherit:!0,fontStyle:"italic"}]],notificationMessage:{messageTitle:"bbva-feature-member-get-member-payroll-portability-receipt-success-notification-message",bookTitle:!0},expandableAccordion:{title:"bbva-feature-member-get-member-payroll-portability-receipt-success-accordion-title",titleFontWeight:"500",titleSize:"S",textContent:"bbva-feature-member-get-member-payroll-portability-receipt-success-accordion-info",textContentSize:"S"},buttonDefault:{id:"button-default-payroll-portability",text:"bbva-feature-member-get-member-payroll-portability-receipt-button",fullwidth:!0}}}_onClickCtaReceipt(){this.dispatchEvent(new CustomEvent("member-get-member-payroll-portability-invite-other-friend-click",{bubbles:!0,composed:!0,detail:this.referredUsers})),this.reset()}}customElements.define(A.is,A);class z extends(I(a)){static get is(){return"bbva-analyticmanager-member-get-member-payroll-portability"}static get properties(){return{}}fireAppSecondStepPage(e){const t={customFields:`usuario agregado:${e+1}`};this._dispatch("analytics-app-second-step",t)}fireAppCompleted(e){const t={customFields:`usuario agregado:${e}`,operationNumber:""};this._dispatch("analytics-app-completed-step",t)}fireAppOnClickStart(e){const t={customFields:`usuario agregado:${e}`};this._dispatch("analytics-app-on-click-start",t)}_dispatch(e,t){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}}customElements.define(z.is,z);
